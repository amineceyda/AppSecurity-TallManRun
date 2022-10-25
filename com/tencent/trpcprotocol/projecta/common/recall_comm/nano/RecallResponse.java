package com.tencent.trpcprotocol.projecta.common.recall_comm.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.c;
import g.e.d.a.d;
import java.io.IOException;
import java.util.Map;

public final class RecallResponse extends d {
    private static volatile RecallResponse[] _emptyArray;
    public boolean hasNextPage;
    public boolean hasPrePage;
    public Map<String, String> pageContext;
    public Map<String, String> prePageContext;
    public Map<String, RecallModuleArray> recallModule;
    public Map<String, String> requestContext;

    public RecallResponse() {
        clear();
    }

    public static RecallResponse[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new RecallResponse[0];
                }
            }
        }
        return _emptyArray;
    }

    public static RecallResponse parseFrom(a aVar) throws IOException {
        return new RecallResponse().mergeFrom(aVar);
    }

    public static RecallResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (RecallResponse) d.mergeFrom(new RecallResponse(), bArr);
    }

    public RecallResponse clear() {
        this.pageContext = null;
        this.recallModule = null;
        this.requestContext = null;
        this.prePageContext = null;
        this.hasPrePage = false;
        this.hasNextPage = false;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Map<String, String> map = this.pageContext;
        if (map != null) {
            computeSerializedSize += b.a(map, 1, 9, 9);
        }
        Map<String, RecallModuleArray> map2 = this.recallModule;
        if (map2 != null) {
            computeSerializedSize += b.a(map2, 2, 9, 11);
        }
        Map<String, String> map3 = this.requestContext;
        if (map3 != null) {
            computeSerializedSize += b.a(map3, 3, 9, 9);
        }
        Map<String, String> map4 = this.prePageContext;
        if (map4 != null) {
            computeSerializedSize += b.a(map4, 4, 9, 9);
        }
        boolean z = this.hasPrePage;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.a(5, z);
        }
        boolean z2 = this.hasNextPage;
        return z2 ? computeSerializedSize + CodedOutputByteBufferNano.a(6, z2) : computeSerializedSize;
    }

    public RecallResponse mergeFrom(a aVar) throws IOException {
        c.C0132c cVar = c.a;
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.pageContext = b.b(aVar, this.pageContext, cVar, 9, 9, null, 10, 18);
            } else if (p == 18) {
                this.recallModule = b.b(aVar, this.recallModule, cVar, 9, 11, new RecallModuleArray(), 10, 18);
            } else if (p == 26) {
                this.requestContext = b.b(aVar, this.requestContext, cVar, 9, 9, null, 10, 18);
            } else if (p == 34) {
                this.prePageContext = b.b(aVar, this.prePageContext, cVar, 9, 9, null, 10, 18);
            } else if (p == 40) {
                this.hasPrePage = aVar.c();
            } else if (p == 48) {
                this.hasNextPage = aVar.c();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Map<String, String> map = this.pageContext;
        if (map != null) {
            b.d(codedOutputByteBufferNano, map, 1, 9, 9);
        }
        Map<String, RecallModuleArray> map2 = this.recallModule;
        if (map2 != null) {
            b.d(codedOutputByteBufferNano, map2, 2, 9, 11);
        }
        Map<String, String> map3 = this.requestContext;
        if (map3 != null) {
            b.d(codedOutputByteBufferNano, map3, 3, 9, 9);
        }
        Map<String, String> map4 = this.prePageContext;
        if (map4 != null) {
            b.d(codedOutputByteBufferNano, map4, 4, 9, 9);
        }
        boolean z = this.hasPrePage;
        if (z) {
            codedOutputByteBufferNano.p(5, z);
        }
        boolean z2 = this.hasNextPage;
        if (z2) {
            codedOutputByteBufferNano.p(6, z2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
