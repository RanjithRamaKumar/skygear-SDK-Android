package io.skygear.skygear;

import org.json.JSONObject;

import java.lang.ref.WeakReference;

/**
 * The Response Base Handler interface for Skygear Request.
 */
public abstract class ResponseHandler implements ResultHandling<JSONObject> {
    WeakReference<Request> requestRef;

    /**
     * The request the handler is serving
     *
     * @return the request
     */
    public Request getRequest() {
        if (this.requestRef != null) {
            return this.requestRef.get();
        }

        return null;
    }
}
