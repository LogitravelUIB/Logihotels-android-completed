package com.logitravel.logihotels.done;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.logitravel.logihotels.R;
import com.logitravel.logihotels.done.internal.BaseActivity;
import com.logitravel.logihotels.done.model.Hotel;
import com.logitravel.logihotels.done.presenter.ListPresenter;
import com.logitravel.logihotels.done.adapter.HotelsAdapter;
import com.logitravel.logihotels.done.view.IHotelListView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class HotelListActivity extends BaseActivity implements IHotelListView {
    private static final String TAG = "HotelListActivity";
    @Bind(R.id.list_hotels) ListView list;

    private HotelsAdapter adapter;
    private ListPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        adapter = new HotelsAdapter();
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                onHotelClicked(position);
            }
        });
    }

    private void onHotelClicked(int position) {
        presenter.onHotelClicked(adapter.getItem(position));
    }

    @Override protected void onLoad(@Nullable Bundle extras) {
        presenter = new ListPresenter(this);
    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_switch:
                presenter.onShowMapClicked();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override public void showHotels(List<Hotel> hotels) {
        adapter.clearHotels();
        adapter.add(hotels);
    }

    @Override public void showError(String message) {
        Toast.makeText(HotelListActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
