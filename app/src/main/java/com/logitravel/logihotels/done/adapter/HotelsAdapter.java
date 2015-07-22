package com.logitravel.logihotels.done.adapter;

import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.logitravel.logihotels.R;
import com.logitravel.logihotels.done.model.Hotel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Manages the binding between the model and the view. Check the bind() method.
 */
public class HotelsAdapter extends BaseAdapter {
    private static final String TAG = "HotelsAdapter";

    List<Hotel> hotels = new ArrayList<>();

    public HotelsAdapter() {
    }

    public void add(Hotel hotel) {
        hotels.add(hotel);
        notifyDataSetChanged();
    }

    public void add(List<Hotel> hotels) {
        this.hotels.addAll(hotels);
        notifyDataSetChanged();
    }

    public void clearHotels() {
        hotels.clear();
        notifyDataSetChanged();
    }

    @Override public int getCount() {
        return hotels.size();
    }

    @Override public Hotel getItem(int position) {
        return hotels.get(position);
    }

    @Override public long getItemId(int position) {
        return position;
    }

    @Override public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_hotel, parent, false);
            ViewHolder holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }

        Hotel hotel = getItem(position);
        ViewHolder holder = (ViewHolder) convertView.getTag();

        bind(hotel, holder);

        return convertView;
    }

    private void bind(Hotel hotel, ViewHolder holder) {
        holder.titleTextView.setText(hotel.getName());
        holder.descriptionTextView.setText(hotel.getDescription());
        holder.categoryTextView.setText(hotel.getCategory());
        holder.priceTextView.setText((int) hotel.getPrice().getPvp() + "€");

        if (!TextUtils.isEmpty(hotel.getImageUrl())) {
            loadImageUrl(holder.imageView, hotel.getImageUrl());
        } else {
            loadNotFoundImage(holder.imageView);
        }
    }

    private void loadNotFoundImage(ImageView imageView) {
        imageView.setImageResource(R.drawable.no_image);
    }

    private void loadImageUrl(ImageView imageView, String imageUrl) {
        Log.d(TAG, "Loading image " + imageUrl);
        Picasso.with(imageView.getContext()).load(imageUrl).into(imageView);
    }

    public Hotel[] getHotels() {
        return hotels.toArray(new Hotel[hotels.size()]);
    }

    public static class ViewHolder {
        @Bind(R.id.text_title) TextView titleTextView;
        @Bind(R.id.text_description) TextView descriptionTextView;
        @Bind(R.id.text_category) TextView categoryTextView;
        @Bind(R.id.image) ImageView imageView;
        @Bind(R.id.text_price) TextView priceTextView;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
