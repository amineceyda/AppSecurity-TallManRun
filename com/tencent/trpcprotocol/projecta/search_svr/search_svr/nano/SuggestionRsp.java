package com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import g.e.d.a.e;
import java.io.IOException;

public final class SuggestionRsp extends d {
    private static volatile SuggestionRsp[] _emptyArray;
    public String searchSuggestionId;
    public SuggestionApp[] suggestionApps;
    public String[] suggestions;

    public SuggestionRsp() {
        clear();
    }

    public static SuggestionRsp[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new SuggestionRsp[0];
                }
            }
        }
        return _emptyArray;
    }

    public static SuggestionRsp parseFrom(a aVar) throws IOException {
        return new SuggestionRsp().mergeFrom(aVar);
    }

    public static SuggestionRsp parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (SuggestionRsp) d.mergeFrom(new SuggestionRsp(), bArr);
    }

    public SuggestionRsp clear() {
        this.suggestionApps = SuggestionApp.emptyArray();
        this.suggestions = e.b;
        this.searchSuggestionId = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        SuggestionApp[] suggestionAppArr = this.suggestionApps;
        int i2 = 0;
        if (suggestionAppArr != null && suggestionAppArr.length > 0) {
            int i3 = 0;
            while (true) {
                SuggestionApp[] suggestionAppArr2 = this.suggestionApps;
                if (i3 >= suggestionAppArr2.length) {
                    break;
                }
                SuggestionApp suggestionApp = suggestionAppArr2[i3];
                if (suggestionApp != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(1, suggestionApp);
                }
                i3++;
            }
        }
        String[] strArr = this.suggestions;
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.suggestions;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    i5++;
                    int o = CodedOutputByteBufferNano.o(str);
                    i4 += CodedOutputByteBufferNano.h(o) + o;
                }
                i2++;
            }
            computeSerializedSize = computeSerializedSize + i4 + (i5 * 1);
        }
        return !this.searchSuggestionId.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(3, this.searchSuggestionId) : computeSerializedSize;
    }

    public SuggestionRsp mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                int a = e.a(aVar, 10);
                SuggestionApp[] suggestionAppArr = this.suggestionApps;
                int length = suggestionAppArr == null ? 0 : suggestionAppArr.length;
                int i2 = a + length;
                SuggestionApp[] suggestionAppArr2 = new SuggestionApp[i2];
                if (length != 0) {
                    System.arraycopy(suggestionAppArr, 0, suggestionAppArr2, 0, length);
                }
                while (length < i2 - 1) {
                    suggestionAppArr2[length] = new SuggestionApp();
                    aVar.g(suggestionAppArr2[length]);
                    aVar.p();
                    length++;
                }
                suggestionAppArr2[length] = new SuggestionApp();
                aVar.g(suggestionAppArr2[length]);
                this.suggestionApps = suggestionAppArr2;
            } else if (p == 18) {
                int a2 = e.a(aVar, 18);
                String[] strArr = this.suggestions;
                int length2 = strArr == null ? 0 : strArr.length;
                int i3 = a2 + length2;
                String[] strArr2 = new String[i3];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i3 - 1) {
                    strArr2[length2] = aVar.o();
                    aVar.p();
                    length2++;
                }
                strArr2[length2] = aVar.o();
                this.suggestions = strArr2;
            } else if (p == 26) {
                this.searchSuggestionId = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        SuggestionApp[] suggestionAppArr = this.suggestionApps;
        int i2 = 0;
        if (suggestionAppArr != null && suggestionAppArr.length > 0) {
            int i3 = 0;
            while (true) {
                SuggestionApp[] suggestionAppArr2 = this.suggestionApps;
                if (i3 >= suggestionAppArr2.length) {
                    break;
                }
                SuggestionApp suggestionApp = suggestionAppArr2[i3];
                if (suggestionApp != null) {
                    codedOutputByteBufferNano.w(1, suggestionApp);
                }
                i3++;
            }
        }
        String[] strArr = this.suggestions;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.suggestions;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    codedOutputByteBufferNano.C(2, str);
                }
                i2++;
            }
        }
        if (!this.searchSuggestionId.equals("")) {
            codedOutputByteBufferNano.C(3, this.searchSuggestionId);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
