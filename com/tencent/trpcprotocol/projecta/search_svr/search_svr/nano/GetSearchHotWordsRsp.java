package com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import g.e.d.a.e;
import java.io.IOException;

public final class GetSearchHotWordsRsp extends d {
    private static volatile GetSearchHotWordsRsp[] _emptyArray;
    public SearchTopKeywordInfo[] searchHotWord;

    public GetSearchHotWordsRsp() {
        clear();
    }

    public static GetSearchHotWordsRsp[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new GetSearchHotWordsRsp[0];
                }
            }
        }
        return _emptyArray;
    }

    public static GetSearchHotWordsRsp parseFrom(a aVar) throws IOException {
        return new GetSearchHotWordsRsp().mergeFrom(aVar);
    }

    public static GetSearchHotWordsRsp parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (GetSearchHotWordsRsp) d.mergeFrom(new GetSearchHotWordsRsp(), bArr);
    }

    public GetSearchHotWordsRsp clear() {
        this.searchHotWord = SearchTopKeywordInfo.emptyArray();
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        SearchTopKeywordInfo[] searchTopKeywordInfoArr = this.searchHotWord;
        if (searchTopKeywordInfoArr != null && searchTopKeywordInfoArr.length > 0) {
            int i2 = 0;
            while (true) {
                SearchTopKeywordInfo[] searchTopKeywordInfoArr2 = this.searchHotWord;
                if (i2 >= searchTopKeywordInfoArr2.length) {
                    break;
                }
                SearchTopKeywordInfo searchTopKeywordInfo = searchTopKeywordInfoArr2[i2];
                if (searchTopKeywordInfo != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(1, searchTopKeywordInfo);
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    public GetSearchHotWordsRsp mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                int a = e.a(aVar, 10);
                SearchTopKeywordInfo[] searchTopKeywordInfoArr = this.searchHotWord;
                int length = searchTopKeywordInfoArr == null ? 0 : searchTopKeywordInfoArr.length;
                int i2 = a + length;
                SearchTopKeywordInfo[] searchTopKeywordInfoArr2 = new SearchTopKeywordInfo[i2];
                if (length != 0) {
                    System.arraycopy(searchTopKeywordInfoArr, 0, searchTopKeywordInfoArr2, 0, length);
                }
                while (length < i2 - 1) {
                    searchTopKeywordInfoArr2[length] = new SearchTopKeywordInfo();
                    aVar.g(searchTopKeywordInfoArr2[length]);
                    aVar.p();
                    length++;
                }
                searchTopKeywordInfoArr2[length] = new SearchTopKeywordInfo();
                aVar.g(searchTopKeywordInfoArr2[length]);
                this.searchHotWord = searchTopKeywordInfoArr2;
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        SearchTopKeywordInfo[] searchTopKeywordInfoArr = this.searchHotWord;
        if (searchTopKeywordInfoArr != null && searchTopKeywordInfoArr.length > 0) {
            int i2 = 0;
            while (true) {
                SearchTopKeywordInfo[] searchTopKeywordInfoArr2 = this.searchHotWord;
                if (i2 >= searchTopKeywordInfoArr2.length) {
                    break;
                }
                SearchTopKeywordInfo searchTopKeywordInfo = searchTopKeywordInfoArr2[i2];
                if (searchTopKeywordInfo != null) {
                    codedOutputByteBufferNano.w(1, searchTopKeywordInfo);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
