package com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class GetSearchHintReq extends d {
    private static volatile GetSearchHintReq[] _emptyArray;

    public GetSearchHintReq() {
        clear();
    }

    public static GetSearchHintReq[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new GetSearchHintReq[0];
                }
            }
        }
        return _emptyArray;
    }

    public static GetSearchHintReq parseFrom(a aVar) throws IOException {
        return new GetSearchHintReq().mergeFrom(aVar);
    }

    public static GetSearchHintReq parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (GetSearchHintReq) d.mergeFrom(new GetSearchHintReq(), bArr);
    }

    public GetSearchHintReq clear() {
        this.cachedSize = -1;
        return this;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano.GetSearchHintReq mergeFrom(g.e.d.a.a r2) throws java.io.IOException {
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano.GetSearchHintReq.mergeFrom(g.e.d.a.a):com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano.GetSearchHintReq");
    }
}
