package com.tencent.trpcprotocol.projecta.common.referinfo.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class ReferInfo extends d {
    private static volatile ReferInfo[] _emptyArray;
    public boolean isFollow;
    public String name;
    public String type;
    public String typeId;

    public ReferInfo() {
        clear();
    }

    public static ReferInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new ReferInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static ReferInfo parseFrom(a aVar) throws IOException {
        return new ReferInfo().mergeFrom(aVar);
    }

    public static ReferInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (ReferInfo) d.mergeFrom(new ReferInfo(), bArr);
    }

    public ReferInfo clear() {
        this.type = "";
        this.name = "";
        this.typeId = "";
        this.isFollow = false;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.type.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.type);
        }
        if (!this.name.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.name);
        }
        if (!this.typeId.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(3, this.typeId);
        }
        boolean z = this.isFollow;
        return z ? computeSerializedSize + CodedOutputByteBufferNano.a(4, z) : computeSerializedSize;
    }

    public ReferInfo mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.type = aVar.o();
            } else if (p == 18) {
                this.name = aVar.o();
            } else if (p == 26) {
                this.typeId = aVar.o();
            } else if (p == 32) {
                this.isFollow = aVar.c();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.type.equals("")) {
            codedOutputByteBufferNano.C(1, this.type);
        }
        if (!this.name.equals("")) {
            codedOutputByteBufferNano.C(2, this.name);
        }
        if (!this.typeId.equals("")) {
            codedOutputByteBufferNano.C(3, this.typeId);
        }
        boolean z = this.isFollow;
        if (z) {
            codedOutputByteBufferNano.p(4, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
