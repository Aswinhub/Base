package com.base.interfaces;


import com.base.service.RequestID;

/**
 * Created by Aswin on 10/22/2016.
 */

public interface ServerResponse {
    public void onSuccess(Object result, RequestID requestID);

    public void onError(Object result, RequestID requestID);

}
