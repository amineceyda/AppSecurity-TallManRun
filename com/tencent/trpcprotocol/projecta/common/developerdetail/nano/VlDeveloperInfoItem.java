package com.tencent.trpcprotocol.projecta.common.developerdetail.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.openconfig.nano.OpenConfig;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class VlDeveloperInfoItem extends d {
    private static volatile VlDeveloperInfoItem[] _emptyArray;
    public DeveloperDetailInfo detailInfo;
    public OpenConfig openConfig;
    public String recommendId;

    public VlDeveloperInfoItem() {
        clear();
    }

    public static VlDeveloperInfoItem[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new VlDeveloperInfoItem[0];
                }
            }
        }
        return _emptyArray;
    }

    public static VlDeveloperInfoItem parseFrom(a aVar) throws IOException {
        return new VlDeveloperInfoItem().mergeFrom(aVar);
    }

    public static VlDeveloperInfoItem parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (VlDeveloperInfoItem) d.mergeFrom(new VlDeveloperInfoItem(), bArr);
    }

    public VlDeveloperInfoItem clear() {
        this.openConfig = null;
        this.detailInfo = null;
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
        DeveloperDetailInfo developerDetailInfo = this.detailInfo;
        if (developerDetailInfo != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(2, developerDetailInfo);
        }
        return !this.recommendId.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(3, this.recommendId) : computeSerializedSize;
    }

    public VlDeveloperInfoItem mergeFrom(a aVar) throws IOException {
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
                if (this.detailInfo == null) {
                    this.detailInfo = new DeveloperDetailInfo();
                }
                dVar = this.detailInfo;
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
        DeveloperDetailInfo developerDetailInfo = this.detailInfo;
        if (developerDetailInfo != null) {
            codedOutputByteBufferNano.w(2, developerDetailInfo);
        }
        if (!this.recommendId.equals("")) {
            codedOutputByteBufferNano.C(3, this.recommendId);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
