package com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class SuggestionReq extends d {
    private static volatile SuggestionReq[] _emptyArray;
    public String key;

    public SuggestionReq() {
        clear();
    }

    public static SuggestionReq[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new SuggestionReq[0];
                }
            }
        }
        return _emptyArray;
    }

    public static SuggestionReq parseFrom(a aVar) throws IOException {
        return new SuggestionReq().mergeFrom(aVar);
    }

    public static SuggestionReq parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (SuggestionReq) d.mergeFrom(new SuggestionReq(), bArr);
    }

    public SuggestionReq clear() {
        this.key = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !this.key.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(1, this.key) : computeSerializedSize;
    }

    public SuggestionReq mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.key = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.key.equals("")) {
            codedOutputByteBufferNano.C(1, this.key);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
