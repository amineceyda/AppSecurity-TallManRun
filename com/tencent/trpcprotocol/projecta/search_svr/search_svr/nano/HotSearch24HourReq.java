package com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class HotSearch24HourReq extends d {
    private static volatile HotSearch24HourReq[] _emptyArray;

    public HotSearch24HourReq() {
        clear();
    }

    public static HotSearch24HourReq[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new HotSearch24HourReq[0];
                }
            }
        }
        return _emptyArray;
    }

    public static HotSearch24HourReq parseFrom(a aVar) throws IOException {
        return new HotSearch24HourReq().mergeFrom(aVar);
    }

    public static HotSearch24HourReq parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (HotSearch24HourReq) d.mergeFrom(new HotSearch24HourReq(), bArr);
    }

    public HotSearch24HourReq clear() {
        this.cachedSize = -1;
        return this;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano.HotSearch24HourReq mergeFrom(g.e.d.a.a r2) throws java.io.IOException {
        /*
            r1 = this;
        L_0x0000:
            int r0 = r2.p()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r2.s(r0)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano.HotSearch24HourReq.mergeFrom(g.e.d.a.a):com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano.HotSearch24HourReq");
    }
}
