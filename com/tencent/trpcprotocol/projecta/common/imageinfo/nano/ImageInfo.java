package com.tencent.trpcprotocol.projecta.common.imageinfo.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class ImageInfo extends d {
    private static volatile ImageInfo[] _emptyArray;
    public long height;
    public String url;
    public long width;

    public ImageInfo() {
        clear();
    }

    public static ImageInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new ImageInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static ImageInfo parseFrom(a aVar) throws IOException {
        return new ImageInfo().mergeFrom(aVar);
    }

    public static ImageInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (ImageInfo) d.mergeFrom(new ImageInfo(), bArr);
    }

    public ImageInfo clear() {
        this.url = "";
        this.height = 0;
        this.width = 0;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.url.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.url);
        }
        long j2 = this.height;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(2, j2);
        }
        long j3 = this.width;
        return j3 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.f(3, j3) : computeSerializedSize;
    }

    public ImageInfo mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.url = aVar.o();
            } else if (p == 16) {
                this.height = aVar.n();
            } else if (p == 24) {
                this.width = aVar.n();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.url.equals("")) {
            codedOutputByteBufferNano.C(1, this.url);
        }
        long j2 = this.height;
        if (j2 != 0) {
            codedOutputByteBufferNano.v(2, j2);
        }
        long j3 = this.width;
        if (j3 != 0) {
            codedOutputByteBufferNano.v(3, j3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
