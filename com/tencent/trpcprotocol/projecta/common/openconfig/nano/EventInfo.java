package com.tencent.trpcprotocol.projecta.common.openconfig.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.c;
import g.e.d.a.d;
import java.io.IOException;
import java.util.Map;

public final class EventInfo extends d {
    private static volatile EventInfo[] _emptyArray;
    public String eventName;
    public Map<String, String> eventTag;

    public EventInfo() {
        clear();
    }

    public static EventInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new EventInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static EventInfo parseFrom(a aVar) throws IOException {
        return new EventInfo().mergeFrom(aVar);
    }

    public static EventInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (EventInfo) d.mergeFrom(new EventInfo(), bArr);
    }

    public EventInfo clear() {
        this.eventName = "";
        this.eventTag = null;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.eventName.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.eventName);
        }
        Map<String, String> map = this.eventTag;
        return map != null ? computeSerializedSize + b.a(map, 2, 9, 9) : computeSerializedSize;
    }

    public EventInfo mergeFrom(a aVar) throws IOException {
        c.C0132c cVar = c.a;
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.eventName = aVar.o();
            } else if (p == 18) {
                this.eventTag = b.b(aVar, this.eventTag, cVar, 9, 9, null, 10, 18);
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.eventName.equals("")) {
            codedOutputByteBufferNano.C(1, this.eventName);
        }
        Map<String, String> map = this.eventTag;
        if (map != null) {
            b.d(codedOutputByteBufferNano, map, 2, 9, 9);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
