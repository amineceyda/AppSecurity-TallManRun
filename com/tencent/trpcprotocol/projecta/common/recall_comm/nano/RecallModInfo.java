package com.tencent.trpcprotocol.projecta.common.recall_comm.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.c;
import g.e.d.a.d;
import java.io.IOException;
import java.util.Map;

public final class RecallModInfo extends d {
    private static volatile RecallModInfo[] _emptyArray;
    public Map<String, DataSrcParam> dataSrcParams;
    public Map<String, String> flipParams;
    public String innerId;
    public String modId;
    public String modType;
    public Map<String, String> operationParam;

    public RecallModInfo() {
        clear();
    }

    public static RecallModInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new RecallModInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static RecallModInfo parseFrom(a aVar) throws IOException {
        return new RecallModInfo().mergeFrom(aVar);
    }

    public static RecallModInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (RecallModInfo) d.mergeFrom(new RecallModInfo(), bArr);
    }

    public RecallModInfo clear() {
        this.modId = "";
        this.innerId = "";
        this.operationParam = null;
        this.dataSrcParams = null;
        this.flipParams = null;
        this.modType = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.modId.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.modId);
        }
        if (!this.innerId.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.innerId);
        }
        Map<String, String> map = this.operationParam;
        if (map != null) {
            computeSerializedSize += b.a(map, 3, 9, 9);
        }
        Map<String, DataSrcParam> map2 = this.dataSrcParams;
        if (map2 != null) {
            computeSerializedSize += b.a(map2, 4, 9, 11);
        }
        Map<String, String> map3 = this.flipParams;
        if (map3 != null) {
            computeSerializedSize += b.a(map3, 5, 9, 9);
        }
        return !this.modType.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(6, this.modType) : computeSerializedSize;
    }

    public RecallModInfo mergeFrom(a aVar) throws IOException {
        c.C0132c cVar = c.a;
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.modId = aVar.o();
            } else if (p == 18) {
                this.innerId = aVar.o();
            } else if (p == 26) {
                this.operationParam = b.b(aVar, this.operationParam, cVar, 9, 9, null, 10, 18);
            } else if (p == 34) {
                this.dataSrcParams = b.b(aVar, this.dataSrcParams, cVar, 9, 11, new DataSrcParam(), 10, 18);
            } else if (p == 42) {
                this.flipParams = b.b(aVar, this.flipParams, cVar, 9, 9, null, 10, 18);
            } else if (p == 50) {
                this.modType = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.modId.equals("")) {
            codedOutputByteBufferNano.C(1, this.modId);
        }
        if (!this.innerId.equals("")) {
            codedOutputByteBufferNano.C(2, this.innerId);
        }
        Map<String, String> map = this.operationParam;
        if (map != null) {
            b.d(codedOutputByteBufferNano, map, 3, 9, 9);
        }
        Map<String, DataSrcParam> map2 = this.dataSrcParams;
        if (map2 != null) {
            b.d(codedOutputByteBufferNano, map2, 4, 9, 11);
        }
        Map<String, String> map3 = this.flipParams;
        if (map3 != null) {
            b.d(codedOutputByteBufferNano, map3, 5, 9, 9);
        }
        if (!this.modType.equals("")) {
            codedOutputByteBufferNano.C(6, this.modType);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
