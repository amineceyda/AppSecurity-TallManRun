package com.tencent.trpcprotocol.projecta.common.app_detail.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class Tracking extends d {
    private static volatile Tracking[] _emptyArray;
    public String platform;
    public String url;

    public Tracking() {
        clear();
    }

    public static Tracking[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new Tracking[0];
                }
            }
        }
        return _emptyArray;
    }

    public static Tracking parseFrom(a aVar) throws IOException {
        return new Tracking().mergeFrom(aVar);
    }

    public static Tracking parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Tracking) d.mergeFrom(new Tracking(), bArr);
    }

    public Tracking clear() {
        this.url = "";
        this.platform = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.url.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.url);
        }
        return !this.platform.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(2, this.platform) : computeSerializedSize;
    }

    public Tracking mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.url = aVar.o();
            } else if (p == 18) {
                this.platform = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.url.equals("")) {
            codedOutputByteBufferNano.C(1, this.url);
        }
        if (!this.platform.equals("")) {
            codedOutputByteBufferNano.C(2, this.platform);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
