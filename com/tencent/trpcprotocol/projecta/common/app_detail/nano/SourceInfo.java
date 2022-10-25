package com.tencent.trpcprotocol.projecta.common.app_detail.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class SourceInfo extends d {
    private static volatile SourceInfo[] _emptyArray;
    public String name;
    public String url;

    public SourceInfo() {
        clear();
    }

    public static SourceInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new SourceInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static SourceInfo parseFrom(a aVar) throws IOException {
        return new SourceInfo().mergeFrom(aVar);
    }

    public static SourceInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (SourceInfo) d.mergeFrom(new SourceInfo(), bArr);
    }

    public SourceInfo clear() {
        this.name = "";
        this.url = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.name.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.name);
        }
        return !this.url.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(2, this.url) : computeSerializedSize;
    }

    public SourceInfo mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.name = aVar.o();
            } else if (p == 18) {
                this.url = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.name.equals("")) {
            codedOutputByteBufferNano.C(1, this.name);
        }
        if (!this.url.equals("")) {
            codedOutputByteBufferNano.C(2, this.url);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
