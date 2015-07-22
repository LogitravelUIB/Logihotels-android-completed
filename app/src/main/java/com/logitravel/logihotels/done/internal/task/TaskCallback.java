package com.logitravel.logihotels.done.internal.task;

public interface TaskCallback<T> {
    /**
     * This method is executed in background. You cannot modify the view state here, instead use {@link TaskCallback#onCompleted(Object)}
     *
     * @return
     */
    T executeInBackground();

    /**
     * This is executed on the main thread
     *
     * @param result
     */
    void onCompleted(T result);

    void onError(Throwable t);
}
