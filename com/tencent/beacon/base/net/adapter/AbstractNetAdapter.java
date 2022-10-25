package com.tencent.beacon.base.net.adapter;

import com.tencent.beacon.base.net.BResponse;
import com.tencent.beacon.base.net.call.Callback;
import com.tencent.beacon.base.net.call.JceRequestEntity;
import com.tencent.beacon.base.net.call.e;

public abstract class AbstractNetAdapter {
    public static final int CONNECT_TIMEOUT = 30000;
    public static final int READ_TIMEOUT = 10000;

    public abstract void request(JceRequestEntity jceRequestEntity, Callback<byte[]> callback);

    public abstract void request(e eVar, Callback<BResponse> callback);
}
