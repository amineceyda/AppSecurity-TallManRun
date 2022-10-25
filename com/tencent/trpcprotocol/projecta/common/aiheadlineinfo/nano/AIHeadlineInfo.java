package com.tencent.trpcprotocol.projecta.common.aiheadlineinfo.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.c;
import g.e.d.a.d;
import java.io.IOException;
import java.util.Map;

public final class AIHeadlineInfo extends d {
    private static volatile AIHeadlineInfo[] _emptyArray;
    public Map<String, Long> events;
    public Map<String, Double> tags;

    public AIHeadlineInfo() {
        clear();
    }

    public static AIHeadlineInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new AIHeadlineInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static AIHeadlineInfo parseFrom(a aVar) throws IOException {
        return new AIHeadlineInfo().mergeFrom(aVar);
    }

    public static AIHeadlineInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (AIHeadlineInfo) d.mergeFrom(new AIHeadlineInfo(), bArr);
    }

    public AIHeadlineInfo clear() {
        this.tags = null;
        this.events = null;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Map<String, Double> map = this.tags;
        if (map != null) {
            computeSerializedSize += b.a(map, 1, 9, 1);
        }
        Map<String, Long> map2 = this.events;
        return map2 != null ? computeSerializedSize + b.a(map2, 2, 9, 3) : computeSerializedSize;
    }

    public AIHeadlineInfo mergeFrom(a aVar) throws IOException {
        c.C0132c cVar = c.a;
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.tags = b.b(aVar, this.tags, cVar, 9, 1, null, 10, 17);
            } else if (p == 18) {
                this.events = b.b(aVar, this.events, cVar, 9, 3, null, 10, 16);
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Map<String, Double> map = this.tags;
        if (map != null) {
            b.d(codedOutputByteBufferNano, map, 1, 9, 1);
        }
        Map<String, Long> map2 = this.events;
        if (map2 != null) {
            b.d(codedOutputByteBufferNano, map2, 2, 9, 3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
