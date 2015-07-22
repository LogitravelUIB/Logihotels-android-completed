package com.logitravel.logihotels.done.internal.task;

import android.os.AsyncTask;

import com.logitravel.logihotels.done.api.HotelApi;

/**
 * Quick implementation of method execution in a Worker thread and response handling on the Main thread. <br>
 * You can also change {@link HotelApi} to use a {@link retrofit.Callback} as the last parameter.
 */
public class Task {
    public static <T> void doInBackground(final TaskCallback<T> taskCallback) {
        new AsyncTask<Void, Void, T>() {
            @Override protected T doInBackground(Void... params) {
                try {
                    return taskCallback.executeInBackground();
                } catch (Throwable t) {
                    taskCallback.onError(t);
                    return null;
                }
            }

            @Override protected void onPostExecute(T t) {
                if (t != null) {
                    taskCallback.onCompleted(t);
                }
            }
        }.execute((Void) null);
    }

}
