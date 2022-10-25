package com.tencent.trpcprotocol.projecta.common.developerinfo.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class DeveloperInfo extends d {
    private static volatile DeveloperInfo[] _emptyArray;
    public String name;

    public DeveloperInfo() {
        clear();
    }

    public static DeveloperInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new DeveloperInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static DeveloperInfo parseFrom(a aVar) throws IOException {
        return new DeveloperInfo().mergeFrom(aVar);
    }

    public static DeveloperInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (DeveloperInfo) d.mergeFrom(new DeveloperInfo(), bArr);
    }

    public DeveloperInfo clear() {
        this.name = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !this.name.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(1, this.name) : computeSerializedSize;
    }

    public DeveloperInfo mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.name = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.name.equals("")) {
            codedOutputByteBufferNano.C(1, this.name);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
