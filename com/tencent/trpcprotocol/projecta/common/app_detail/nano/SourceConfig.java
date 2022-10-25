package com.tencent.trpcprotocol.projecta.common.app_detail.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class SourceConfig extends d {
    private static volatile SourceConfig[] _emptyArray;
    public String content;
    public String icon;
    public long id;
    public String url;

    public SourceConfig() {
        clear();
    }

    public static SourceConfig[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new SourceConfig[0];
                }
            }
        }
        return _emptyArray;
    }

    public static SourceConfig parseFrom(a aVar) throws IOException {
        return new SourceConfig().mergeFrom(aVar);
    }

    public static SourceConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (SourceConfig) d.mergeFrom(new SourceConfig(), bArr);
    }

    public SourceConfig clear() {
        this.id = 0;
        this.url = "";
        this.icon = "";
        this.content = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.id;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(1, j2);
        }
        if (!this.url.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.url);
        }
        if (!this.icon.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(3, this.icon);
        }
        return !this.content.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(4, this.content) : computeSerializedSize;
    }

    public SourceConfig mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 8) {
                this.id = aVar.n();
            } else if (p == 18) {
                this.url = aVar.o();
            } else if (p == 26) {
                this.icon = aVar.o();
            } else if (p == 34) {
                this.content = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j2 = this.id;
        if (j2 != 0) {
            codedOutputByteBufferNano.v(1, j2);
        }
        if (!this.url.equals("")) {
            codedOutputByteBufferNano.C(2, this.url);
        }
        if (!this.icon.equals("")) {
            codedOutputByteBufferNano.C(3, this.icon);
        }
        if (!this.content.equals("")) {
            codedOutputByteBufferNano.C(4, this.content);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
