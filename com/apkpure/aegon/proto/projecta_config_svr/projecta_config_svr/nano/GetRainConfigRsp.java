package com.apkpure.aegon.proto.projecta_config_svr.projecta_config_svr.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.c;
import g.e.d.a.d;
import java.io.IOException;
import java.util.Map;

public final class GetRainConfigRsp extends d {
    private static volatile GetRainConfigRsp[] _emptyArray;
    public Map<String, String> data;

    public GetRainConfigRsp() {
        clear();
    }

    public static GetRainConfigRsp[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new GetRainConfigRsp[0];
                }
            }
        }
        return _emptyArray;
    }

    public static GetRainConfigRsp parseFrom(a aVar) throws IOException {
        return new GetRainConfigRsp().mergeFrom(aVar);
    }

    public static GetRainConfigRsp parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (GetRainConfigRsp) d.mergeFrom(new GetRainConfigRsp(), bArr);
    }

    public GetRainConfigRsp clear() {
        this.data = null;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Map<String, String> map = this.data;
        return map != null ? computeSerializedSize + b.a(map, 1, 9, 9) : computeSerializedSize;
    }

    public GetRainConfigRsp mergeFrom(a aVar) throws IOException {
        c.C0132c cVar = c.a;
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.data = b.b(aVar, this.data, cVar, 9, 9, null, 10, 18);
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Map<String, String> map = this.data;
        if (map != null) {
            b.d(codedOutputByteBufferNano, map, 1, 9, 9);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
