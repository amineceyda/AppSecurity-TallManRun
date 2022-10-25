package com.tencent.trpcprotocol.projecta.common.paging.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class Paging extends d {
    private static volatile Paging[] _emptyArray;
    public long currentPage;
    public String nextUrl;
    public long total;

    public Paging() {
        clear();
    }

    public static Paging[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new Paging[0];
                }
            }
        }
        return _emptyArray;
    }

    public static Paging parseFrom(a aVar) throws IOException {
        return new Paging().mergeFrom(aVar);
    }

    public static Paging parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Paging) d.mergeFrom(new Paging(), bArr);
    }

    public Paging clear() {
        this.nextUrl = "";
        this.currentPage = 0;
        this.total = 0;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.nextUrl.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.nextUrl);
        }
        long j2 = this.currentPage;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(2, j2);
        }
        long j3 = this.total;
        return j3 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.f(3, j3) : computeSerializedSize;
    }

    public Paging mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.nextUrl = aVar.o();
            } else if (p == 16) {
                this.currentPage = aVar.n();
            } else if (p == 24) {
                this.total = aVar.n();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.nextUrl.equals("")) {
            codedOutputByteBufferNano.C(1, this.nextUrl);
        }
        long j2 = this.currentPage;
        if (j2 != 0) {
            codedOutputByteBufferNano.v(2, j2);
        }
        long j3 = this.total;
        if (j3 != 0) {
            codedOutputByteBufferNano.v(3, j3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
