package com.tencent.trpcprotocol.projecta.vl_recall_app_detail.vl_recall_app_detail.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class GetAppDetailV1Req extends d {
    private static volatile GetAppDetailV1Req[] _emptyArray;
    public String packageName;

    public GetAppDetailV1Req() {
        clear();
    }

    public static GetAppDetailV1Req[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new GetAppDetailV1Req[0];
                }
            }
        }
        return _emptyArray;
    }

    public static GetAppDetailV1Req parseFrom(a aVar) throws IOException {
        return new GetAppDetailV1Req().mergeFrom(aVar);
    }

    public static GetAppDetailV1Req parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (GetAppDetailV1Req) d.mergeFrom(new GetAppDetailV1Req(), bArr);
    }

    public GetAppDetailV1Req clear() {
        this.packageName = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !this.packageName.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(1, this.packageName) : computeSerializedSize;
    }

    public GetAppDetailV1Req mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.packageName = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.packageName.equals("")) {
            codedOutputByteBufferNano.C(1, this.packageName);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
