package com.tencent.beacon.base.net.call;

import com.tencent.beacon.base.net.NetException;
import com.tencent.beacon.base.net.RequestType;
import com.tencent.beacon.base.net.b.d;
import com.tencent.beacon.base.util.c;
import com.tencent.beacon.pack.AbstractResponseCommon;
import com.tencent.beacon.pack.ResponsePackage;
import g.a.a.a.a;

public class i implements Callback<byte[]> {
    public final /* synthetic */ Callback a;
    public final /* synthetic */ j b;

    public i(j jVar, Callback callback) {
        this.b = jVar;
        this.a = callback;
    }

    /* renamed from: a */
    public void onResponse(byte[] bArr) throws NetException {
        AbstractResponseCommon abstractResponseCommon;
        byte[] bArr2;
        StringBuilder i2 = a.i("raw response size: ");
        i2.append(bArr.length);
        c.a("[BeaconNet]", i2.toString(), new Object[0]);
        if (this.b.a.getType() == RequestType.EVENT) {
            abstractResponseCommon = com.tencent.beacon.base.net.c.c().f625e.b().a(bArr);
            if (abstractResponseCommon != null) {
                bArr2 = null;
            } else {
                throw new NetException("ResponsePackageV2 == null");
            }
        } else {
            abstractResponseCommon = com.tencent.beacon.base.net.c.c().f624d.b().a(bArr);
            if (abstractResponseCommon != null) {
                ResponsePackage responsePackage = (ResponsePackage) abstractResponseCommon;
                if (responsePackage.cmd != this.b.a.getResponseCmd()) {
                    throw new NetException("responsePackage.cmd != requestEntity.responseCmd");
                } else if (responsePackage.result == 0) {
                    bArr2 = responsePackage.sBuffer;
                    if (bArr2 == null || bArr2.length <= 0) {
                        throw new NetException("responsePackage.buffer == null");
                    }
                } else {
                    throw new NetException("responsePackage.result != OK(0)");
                }
            } else {
                throw new NetException("responsePackage == null");
            }
        }
        d.a(this.b.b, abstractResponseCommon.serverTime, abstractResponseCommon.srcGatewayIp);
        Callback callback = this.a;
        if (callback != null) {
            callback.onResponse(bArr2);
        }
    }

    public void onFailure(com.tencent.beacon.base.net.d dVar) {
        Callback callback = this.a;
        if (callback != null) {
            callback.onFailure(dVar);
        }
    }
}
