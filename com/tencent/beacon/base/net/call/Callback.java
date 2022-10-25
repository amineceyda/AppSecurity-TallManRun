package com.tencent.beacon.base.net.call;

import com.tencent.beacon.base.net.NetException;
import com.tencent.beacon.base.net.d;

public interface Callback<T> {
    void onFailure(d dVar);

    void onResponse(T t) throws NetException;
}
