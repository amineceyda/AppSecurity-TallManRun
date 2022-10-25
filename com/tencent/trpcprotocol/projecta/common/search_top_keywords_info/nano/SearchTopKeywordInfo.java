package com.tencent.trpcprotocol.projecta.common.search_top_keywords_info.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class SearchTopKeywordInfo extends d {
    private static volatile SearchTopKeywordInfo[] _emptyArray;
    public String keyword;
    public String type;

    public SearchTopKeywordInfo() {
        clear();
    }

    public static SearchTopKeywordInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new SearchTopKeywordInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static SearchTopKeywordInfo parseFrom(a aVar) throws IOException {
        return new SearchTopKeywordInfo().mergeFrom(aVar);
    }

    public static SearchTopKeywordInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (SearchTopKeywordInfo) d.mergeFrom(new SearchTopKeywordInfo(), bArr);
    }

    public SearchTopKeywordInfo clear() {
        this.type = "";
        this.keyword = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.type.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.type);
        }
        return !this.keyword.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(2, this.keyword) : computeSerializedSize;
    }

    public SearchTopKeywordInfo mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.type = aVar.o();
            } else if (p == 18) {
                this.keyword = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.type.equals("")) {
            codedOutputByteBufferNano.C(1, this.type);
        }
        if (!this.keyword.equals("")) {
            codedOutputByteBufferNano.C(2, this.keyword);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
