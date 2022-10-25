package com.tencent.trpcprotocol.projecta.common.recall_comm.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.c;
import g.e.d.a.d;
import java.io.IOException;
import java.util.Map;

public final class DataSrcParam extends d {
    private static volatile DataSrcParam[] _emptyArray;
    public Map<String, String> params;

    public DataSrcParam() {
        clear();
    }

    public static DataSrcParam[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new DataSrcParam[0];
                }
            }
        }
        return _emptyArray;
    }

    public static DataSrcParam parseFrom(a aVar) throws IOException {
        return new DataSrcParam().mergeFrom(aVar);
    }

    public static DataSrcParam parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (DataSrcParam) d.mergeFrom(new DataSrcParam(), bArr);
    }

    public DataSrcParam clear() {
        this.params = null;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Map<String, String> map = this.params;
        return map != null ? computeSerializedSize + b.a(map, 1, 9, 9) : computeSerializedSize;
    }

    public DataSrcParam mergeFrom(a aVar) throws IOException {
        c.C0132c cVar = c.a;
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.params = b.b(aVar, this.params, cVar, 9, 9, null, 10, 18);
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Map<String, String> map = this.params;
        if (map != null) {
            b.d(codedOutputByteBufferNano, map, 1, 9, 9);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
