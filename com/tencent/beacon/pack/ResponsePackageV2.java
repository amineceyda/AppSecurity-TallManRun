package com.tencent.beacon.pack;

import com.tencent.beacon.base.util.c;

public final class ResponsePackageV2 extends AbstractResponseCommon implements Cloneable {
    public String msg = "";
    public int result = 0;

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e2) {
            c.a((Throwable) e2);
            return null;
        }
    }

    public void readFrom(a aVar) {
        this.result = aVar.a(this.result, 0, true);
        this.srcGatewayIp = aVar.a(1, true);
        this.serverTime = aVar.a(this.serverTime, 2, true);
        this.msg = aVar.a(3, true);
    }

    public void writeTo(b bVar) {
        bVar.a(this.result, 0);
        bVar.a(this.srcGatewayIp, 1);
        bVar.a(this.serverTime, 2);
        bVar.a(this.msg, 3);
    }
}
