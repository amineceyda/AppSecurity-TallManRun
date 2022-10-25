package com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class AppDetailInfo extends d {
    private static volatile AppDetailInfo[] _emptyArray;
    public com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo appDetailInfo;
    public boolean isInterveneConfig;
    public String recommendId;

    public AppDetailInfo() {
        clear();
    }

    public static AppDetailInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new AppDetailInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static AppDetailInfo parseFrom(a aVar) throws IOException {
        return new AppDetailInfo().mergeFrom(aVar);
    }

    public static AppDetailInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (AppDetailInfo) d.mergeFrom(new AppDetailInfo(), bArr);
    }

    public AppDetailInfo clear() {
        this.appDetailInfo = null;
        this.recommendId = "";
        this.isInterveneConfig = false;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo appDetailInfo2 = this.appDetailInfo;
        if (appDetailInfo2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(1, appDetailInfo2);
        }
        if (!this.recommendId.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.recommendId);
        }
        boolean z = this.isInterveneConfig;
        return z ? computeSerializedSize + CodedOutputByteBufferNano.a(3, z) : computeSerializedSize;
    }

    public AppDetailInfo mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                if (this.appDetailInfo == null) {
                    this.appDetailInfo = new com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo();
                }
                aVar.g(this.appDetailInfo);
            } else if (p == 18) {
                this.recommendId = aVar.o();
            } else if (p == 24) {
                this.isInterveneConfig = aVar.c();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo appDetailInfo2 = this.appDetailInfo;
        if (appDetailInfo2 != null) {
            codedOutputByteBufferNano.w(1, appDetailInfo2);
        }
        if (!this.recommendId.equals("")) {
            codedOutputByteBufferNano.C(2, this.recommendId);
        }
        boolean z = this.isInterveneConfig;
        if (z) {
            codedOutputByteBufferNano.p(3, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
