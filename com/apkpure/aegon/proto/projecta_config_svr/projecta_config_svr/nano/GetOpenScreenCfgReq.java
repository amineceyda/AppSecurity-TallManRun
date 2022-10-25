package com.apkpure.aegon.proto.projecta_config_svr.projecta_config_svr.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class GetOpenScreenCfgReq extends d {
    private static volatile GetOpenScreenCfgReq[] _emptyArray;
    public float height;
    public float width;

    public GetOpenScreenCfgReq() {
        clear();
    }

    public static GetOpenScreenCfgReq[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new GetOpenScreenCfgReq[0];
                }
            }
        }
        return _emptyArray;
    }

    public static GetOpenScreenCfgReq parseFrom(a aVar) throws IOException {
        return new GetOpenScreenCfgReq().mergeFrom(aVar);
    }

    public static GetOpenScreenCfgReq parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (GetOpenScreenCfgReq) d.mergeFrom(new GetOpenScreenCfgReq(), bArr);
    }

    public GetOpenScreenCfgReq clear() {
        this.height = 0.0f;
        this.width = 0.0f;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (Float.floatToIntBits(this.height) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += CodedOutputByteBufferNano.d(1, this.height);
        }
        return Float.floatToIntBits(this.width) != Float.floatToIntBits(0.0f) ? computeSerializedSize + CodedOutputByteBufferNano.d(2, this.width) : computeSerializedSize;
    }

    public GetOpenScreenCfgReq mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 13) {
                this.height = aVar.f();
            } else if (p == 21) {
                this.width = aVar.f();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (Float.floatToIntBits(this.height) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.t(1, this.height);
        }
        if (Float.floatToIntBits(this.width) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.t(2, this.width);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
