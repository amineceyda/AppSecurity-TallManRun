package com.tencent.trpcprotocol.projecta.common.cmsresponse.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import g.e.d.a.e;
import java.io.IOException;
import java.util.Arrays;

public final class PreFetch extends d {
    private static volatile PreFetch[] _emptyArray;
    public String etag;
    public byte[] response;
    public String setCacheDate;
    public long ttl;
    public String url;

    public PreFetch() {
        clear();
    }

    public static PreFetch[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new PreFetch[0];
                }
            }
        }
        return _emptyArray;
    }

    public static PreFetch parseFrom(a aVar) throws IOException {
        return new PreFetch().mergeFrom(aVar);
    }

    public static PreFetch parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (PreFetch) d.mergeFrom(new PreFetch(), bArr);
    }

    public PreFetch clear() {
        this.url = "";
        this.response = e.c;
        this.etag = "";
        this.ttl = 0;
        this.setCacheDate = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.url.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.url);
        }
        if (!Arrays.equals(this.response, e.c)) {
            byte[] bArr = this.response;
            computeSerializedSize += CodedOutputByteBufferNano.h(bArr.length) + bArr.length + CodedOutputByteBufferNano.k(2);
        }
        if (!this.etag.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(3, this.etag);
        }
        long j2 = this.ttl;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(4, j2);
        }
        return !this.setCacheDate.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(5, this.setCacheDate) : computeSerializedSize;
    }

    public PreFetch mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.url = aVar.o();
            } else if (p == 18) {
                this.response = aVar.d();
            } else if (p == 26) {
                this.etag = aVar.o();
            } else if (p == 32) {
                this.ttl = aVar.n();
            } else if (p == 42) {
                this.setCacheDate = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.url.equals("")) {
            codedOutputByteBufferNano.C(1, this.url);
        }
        if (!Arrays.equals(this.response, e.c)) {
            codedOutputByteBufferNano.q(2, this.response);
        }
        if (!this.etag.equals("")) {
            codedOutputByteBufferNano.C(3, this.etag);
        }
        long j2 = this.ttl;
        if (j2 != 0) {
            codedOutputByteBufferNano.v(4, j2);
        }
        if (!this.setCacheDate.equals("")) {
            codedOutputByteBufferNano.C(5, this.setCacheDate);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
