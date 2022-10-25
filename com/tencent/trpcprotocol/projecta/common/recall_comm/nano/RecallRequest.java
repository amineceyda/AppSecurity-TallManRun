package com.tencent.trpcprotocol.projecta.common.recall_comm.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.c;
import g.e.d.a.d;
import g.e.d.a.e;
import java.io.IOException;
import java.util.Map;

public final class RecallRequest extends d {
    private static volatile RecallRequest[] _emptyArray;
    public RecallModInfo[] modInfos;
    public Map<String, RecallModuleArray> moduleArrays;
    public Map<String, String> pageContext;
    public Map<String, String> pageParams;
    public String pageStrategy;
    public String previewType;
    public String previewVersion;
    public Map<String, String> requestContext;

    public RecallRequest() {
        clear();
    }

    public static RecallRequest[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new RecallRequest[0];
                }
            }
        }
        return _emptyArray;
    }

    public static RecallRequest parseFrom(a aVar) throws IOException {
        return new RecallRequest().mergeFrom(aVar);
    }

    public static RecallRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (RecallRequest) d.mergeFrom(new RecallRequest(), bArr);
    }

    public RecallRequest clear() {
        this.pageParams = null;
        this.pageContext = null;
        this.modInfos = RecallModInfo.emptyArray();
        this.requestContext = null;
        this.moduleArrays = null;
        this.pageStrategy = "";
        this.previewType = "";
        this.previewVersion = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Map<String, String> map = this.pageParams;
        if (map != null) {
            computeSerializedSize += b.a(map, 1, 9, 9);
        }
        Map<String, String> map2 = this.pageContext;
        if (map2 != null) {
            computeSerializedSize += b.a(map2, 2, 9, 9);
        }
        RecallModInfo[] recallModInfoArr = this.modInfos;
        if (recallModInfoArr != null && recallModInfoArr.length > 0) {
            int i2 = 0;
            while (true) {
                RecallModInfo[] recallModInfoArr2 = this.modInfos;
                if (i2 >= recallModInfoArr2.length) {
                    break;
                }
                RecallModInfo recallModInfo = recallModInfoArr2[i2];
                if (recallModInfo != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(3, recallModInfo);
                }
                i2++;
            }
        }
        Map<String, String> map3 = this.requestContext;
        if (map3 != null) {
            computeSerializedSize += b.a(map3, 4, 9, 9);
        }
        Map<String, RecallModuleArray> map4 = this.moduleArrays;
        if (map4 != null) {
            computeSerializedSize += b.a(map4, 5, 9, 11);
        }
        if (!this.pageStrategy.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(6, this.pageStrategy);
        }
        if (!this.previewType.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(7, this.previewType);
        }
        return !this.previewVersion.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(8, this.previewVersion) : computeSerializedSize;
    }

    public RecallRequest mergeFrom(a aVar) throws IOException {
        c.C0132c cVar = c.a;
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.pageParams = b.b(aVar, this.pageParams, cVar, 9, 9, null, 10, 18);
            } else if (p == 18) {
                this.pageContext = b.b(aVar, this.pageContext, cVar, 9, 9, null, 10, 18);
            } else if (p == 26) {
                int a = e.a(aVar, 26);
                RecallModInfo[] recallModInfoArr = this.modInfos;
                int length = recallModInfoArr == null ? 0 : recallModInfoArr.length;
                int i2 = a + length;
                RecallModInfo[] recallModInfoArr2 = new RecallModInfo[i2];
                if (length != 0) {
                    System.arraycopy(recallModInfoArr, 0, recallModInfoArr2, 0, length);
                }
                while (length < i2 - 1) {
                    recallModInfoArr2[length] = new RecallModInfo();
                    aVar.g(recallModInfoArr2[length]);
                    aVar.p();
                    length++;
                }
                recallModInfoArr2[length] = new RecallModInfo();
                aVar.g(recallModInfoArr2[length]);
                this.modInfos = recallModInfoArr2;
            } else if (p == 34) {
                this.requestContext = b.b(aVar, this.requestContext, cVar, 9, 9, null, 10, 18);
            } else if (p == 42) {
                this.moduleArrays = b.b(aVar, this.moduleArrays, cVar, 9, 11, new RecallModuleArray(), 10, 18);
            } else if (p == 50) {
                this.pageStrategy = aVar.o();
            } else if (p == 58) {
                this.previewType = aVar.o();
            } else if (p == 66) {
                this.previewVersion = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Map<String, String> map = this.pageParams;
        if (map != null) {
            b.d(codedOutputByteBufferNano, map, 1, 9, 9);
        }
        Map<String, String> map2 = this.pageContext;
        if (map2 != null) {
            b.d(codedOutputByteBufferNano, map2, 2, 9, 9);
        }
        RecallModInfo[] recallModInfoArr = this.modInfos;
        if (recallModInfoArr != null && recallModInfoArr.length > 0) {
            int i2 = 0;
            while (true) {
                RecallModInfo[] recallModInfoArr2 = this.modInfos;
                if (i2 >= recallModInfoArr2.length) {
                    break;
                }
                RecallModInfo recallModInfo = recallModInfoArr2[i2];
                if (recallModInfo != null) {
                    codedOutputByteBufferNano.w(3, recallModInfo);
                }
                i2++;
            }
        }
        Map<String, String> map3 = this.requestContext;
        if (map3 != null) {
            b.d(codedOutputByteBufferNano, map3, 4, 9, 9);
        }
        Map<String, RecallModuleArray> map4 = this.moduleArrays;
        if (map4 != null) {
            b.d(codedOutputByteBufferNano, map4, 5, 9, 11);
        }
        if (!this.pageStrategy.equals("")) {
            codedOutputByteBufferNano.C(6, this.pageStrategy);
        }
        if (!this.previewType.equals("")) {
            codedOutputByteBufferNano.C(7, this.previewType);
        }
        if (!this.previewVersion.equals("")) {
            codedOutputByteBufferNano.C(8, this.previewVersion);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
