package com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class SearchUserReq extends d {
    private static volatile SearchUserReq[] _emptyArray;
    public String key;
    public int page;
    public String type;

    public SearchUserReq() {
        clear();
    }

    public static SearchUserReq[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new SearchUserReq[0];
                }
            }
        }
        return _emptyArray;
    }

    public static SearchUserReq parseFrom(a aVar) throws IOException {
        return new SearchUserReq().mergeFrom(aVar);
    }

    public static SearchUserReq parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (SearchUserReq) d.mergeFrom(new SearchUserReq(), bArr);
    }

    public SearchUserReq clear() {
        this.key = "";
        this.type = "";
        this.page = 0;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.key.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.key);
        }
        if (!this.type.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.type);
        }
        int i2 = this.page;
        if (i2 == 0) {
            return computeSerializedSize;
        }
        return computeSerializedSize + CodedOutputByteBufferNano.h(i2) + CodedOutputByteBufferNano.k(3);
    }

    public SearchUserReq mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.key = aVar.o();
            } else if (p == 18) {
                this.type = aVar.o();
            } else if (p == 24) {
                this.page = aVar.m();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.key.equals("")) {
            codedOutputByteBufferNano.C(1, this.key);
        }
        if (!this.type.equals("")) {
            codedOutputByteBufferNano.C(2, this.type);
        }
        int i2 = this.page;
        if (i2 != 0) {
            codedOutputByteBufferNano.A(24);
            codedOutputByteBufferNano.A(i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
