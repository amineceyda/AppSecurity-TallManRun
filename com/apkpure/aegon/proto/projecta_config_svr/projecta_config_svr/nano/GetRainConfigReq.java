package com.apkpure.aegon.proto.projecta_config_svr.projecta_config_svr.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class GetRainConfigReq extends d {
    private static volatile GetRainConfigReq[] _emptyArray;
    public String keyword;

    public GetRainConfigReq() {
        clear();
    }

    public static GetRainConfigReq[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new GetRainConfigReq[0];
                }
            }
        }
        return _emptyArray;
    }

    public static GetRainConfigReq parseFrom(a aVar) throws IOException {
        return new GetRainConfigReq().mergeFrom(aVar);
    }

    public static GetRainConfigReq parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (GetRainConfigReq) d.mergeFrom(new GetRainConfigReq(), bArr);
    }

    public GetRainConfigReq clear() {
        this.keyword = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !this.keyword.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(1, this.keyword) : computeSerializedSize;
    }

    public GetRainConfigReq mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.keyword = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.keyword.equals("")) {
            codedOutputByteBufferNano.C(1, this.keyword);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
