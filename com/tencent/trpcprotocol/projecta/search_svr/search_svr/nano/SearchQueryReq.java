package com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class SearchQueryReq extends d {
    private static volatile SearchQueryReq[] _emptyArray;
    public String hl;
    public String key;
    public int page;
    public String searchInputKey;
    public String searchType;

    public SearchQueryReq() {
        clear();
    }

    public static SearchQueryReq[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new SearchQueryReq[0];
                }
            }
        }
        return _emptyArray;
    }

    public static SearchQueryReq parseFrom(a aVar) throws IOException {
        return new SearchQueryReq().mergeFrom(aVar);
    }

    public static SearchQueryReq parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (SearchQueryReq) d.mergeFrom(new SearchQueryReq(), bArr);
    }

    public SearchQueryReq clear() {
        this.hl = "";
        this.searchType = "";
        this.key = "";
        this.searchInputKey = "";
        this.page = 0;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.hl.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.hl);
        }
        if (!this.searchType.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.searchType);
        }
        if (!this.key.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(3, this.key);
        }
        if (!this.searchInputKey.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(4, this.searchInputKey);
        }
        int i2 = this.page;
        return i2 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.e(5, i2) : computeSerializedSize;
    }

    public SearchQueryReq mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.hl = aVar.o();
            } else if (p == 18) {
                this.searchType = aVar.o();
            } else if (p == 26) {
                this.key = aVar.o();
            } else if (p == 34) {
                this.searchInputKey = aVar.o();
            } else if (p == 40) {
                this.page = aVar.m();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.hl.equals("")) {
            codedOutputByteBufferNano.C(1, this.hl);
        }
        if (!this.searchType.equals("")) {
            codedOutputByteBufferNano.C(2, this.searchType);
        }
        if (!this.key.equals("")) {
            codedOutputByteBufferNano.C(3, this.key);
        }
        if (!this.searchInputKey.equals("")) {
            codedOutputByteBufferNano.C(4, this.searchInputKey);
        }
        int i2 = this.page;
        if (i2 != 0) {
            codedOutputByteBufferNano.u(5, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
