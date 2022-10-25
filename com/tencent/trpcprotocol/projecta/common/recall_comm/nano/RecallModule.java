package com.tencent.trpcprotocol.projecta.common.recall_comm.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.c;
import g.e.d.a.d;
import java.io.IOException;
import java.util.Map;

public final class RecallModule extends d {
    private static volatile RecallModule[] _emptyArray;
    public String moduleId;
    public Map<String, String> moduleParas;
    public Map<String, String> persistParams;
    public RecallItemList recallItems;

    public RecallModule() {
        clear();
    }

    public static RecallModule[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new RecallModule[0];
                }
            }
        }
        return _emptyArray;
    }

    public static RecallModule parseFrom(a aVar) throws IOException {
        return new RecallModule().mergeFrom(aVar);
    }

    public static RecallModule parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (RecallModule) d.mergeFrom(new RecallModule(), bArr);
    }

    public RecallModule clear() {
        this.moduleId = "";
        this.recallItems = null;
        this.moduleParas = null;
        this.persistParams = null;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.moduleId.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.moduleId);
        }
        RecallItemList recallItemList = this.recallItems;
        if (recallItemList != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(2, recallItemList);
        }
        Map<String, String> map = this.moduleParas;
        if (map != null) {
            computeSerializedSize += b.a(map, 3, 9, 9);
        }
        Map<String, String> map2 = this.persistParams;
        return map2 != null ? computeSerializedSize + b.a(map2, 4, 9, 9) : computeSerializedSize;
    }

    public RecallModule mergeFrom(a aVar) throws IOException {
        c.C0132c cVar = c.a;
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.moduleId = aVar.o();
            } else if (p == 18) {
                if (this.recallItems == null) {
                    this.recallItems = new RecallItemList();
                }
                aVar.g(this.recallItems);
            } else if (p == 26) {
                this.moduleParas = b.b(aVar, this.moduleParas, cVar, 9, 9, null, 10, 18);
            } else if (p == 34) {
                this.persistParams = b.b(aVar, this.persistParams, cVar, 9, 9, null, 10, 18);
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.moduleId.equals("")) {
            codedOutputByteBufferNano.C(1, this.moduleId);
        }
        RecallItemList recallItemList = this.recallItems;
        if (recallItemList != null) {
            codedOutputByteBufferNano.w(2, recallItemList);
        }
        Map<String, String> map = this.moduleParas;
        if (map != null) {
            b.d(codedOutputByteBufferNano, map, 3, 9, 9);
        }
        Map<String, String> map2 = this.persistParams;
        if (map2 != null) {
            b.d(codedOutputByteBufferNano, map2, 4, 9, 9);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
