package com.tencent.trpcprotocol.projecta.app_auto_upgrade.app_auto_upgrade.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class Source extends d {
    private static volatile Source[] _emptyArray;
    public String otherUrl;
    public String platform;
    public String url;

    public Source() {
        clear();
    }

    public static Source[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new Source[0];
                }
            }
        }
        return _emptyArray;
    }

    public static Source parseFrom(a aVar) throws IOException {
        return new Source().mergeFrom(aVar);
    }

    public static Source parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Source) d.mergeFrom(new Source(), bArr);
    }

    public Source clear() {
        this.platform = "";
        this.url = "";
        this.otherUrl = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.platform.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.platform);
        }
        if (!this.url.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.url);
        }
        return !this.otherUrl.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(3, this.otherUrl) : computeSerializedSize;
    }

    public Source mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.platform = aVar.o();
            } else if (p == 18) {
                this.url = aVar.o();
            } else if (p == 26) {
                this.otherUrl = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.platform.equals("")) {
            codedOutputByteBufferNano.C(1, this.platform);
        }
        if (!this.url.equals("")) {
            codedOutputByteBufferNano.C(2, this.url);
        }
        if (!this.otherUrl.equals("")) {
            codedOutputByteBufferNano.C(3, this.otherUrl);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
