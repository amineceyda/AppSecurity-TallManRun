package com.tencent.trpcprotocol.projecta.common.app_detail.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.openconfig.nano.OpenConfig;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class VlAppInfoItem extends d {
    private static volatile VlAppInfoItem[] _emptyArray;
    public AppDetailInfo appInfo;
    public OpenConfig openConfig;
    public String recommendId;

    public VlAppInfoItem() {
        clear();
    }

    public static VlAppInfoItem[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new VlAppInfoItem[0];
                }
            }
        }
        return _emptyArray;
    }

    public static VlAppInfoItem parseFrom(a aVar) throws IOException {
        return new VlAppInfoItem().mergeFrom(aVar);
    }

    public static VlAppInfoItem parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (VlAppInfoItem) d.mergeFrom(new VlAppInfoItem(), bArr);
    }

    public VlAppInfoItem clear() {
        this.openConfig = null;
        this.appInfo = null;
        this.recommendId = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        OpenConfig openConfig2 = this.openConfig;
        if (openConfig2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(1, openConfig2);
        }
        AppDetailInfo appDetailInfo = this.appInfo;
        if (appDetailInfo != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(2, appDetailInfo);
        }
        return !this.recommendId.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(3, this.recommendId) : computeSerializedSize;
    }

    public VlAppInfoItem mergeFrom(a aVar) throws IOException {
        d dVar;
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                if (this.openConfig == null) {
                    this.openConfig = new OpenConfig();
                }
                dVar = this.openConfig;
            } else if (p == 18) {
                if (this.appInfo == null) {
                    this.appInfo = new AppDetailInfo();
                }
                dVar = this.appInfo;
            } else if (p == 26) {
                this.recommendId = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
            aVar.g(dVar);
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        OpenConfig openConfig2 = this.openConfig;
        if (openConfig2 != null) {
            codedOutputByteBufferNano.w(1, openConfig2);
        }
        AppDetailInfo appDetailInfo = this.appInfo;
        if (appDetailInfo != null) {
            codedOutputByteBufferNano.w(2, appDetailInfo);
        }
        if (!this.recommendId.equals("")) {
            codedOutputByteBufferNano.C(3, this.recommendId);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
