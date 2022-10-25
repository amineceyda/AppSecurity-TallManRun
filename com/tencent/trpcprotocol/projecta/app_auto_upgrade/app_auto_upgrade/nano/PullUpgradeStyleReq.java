package com.tencent.trpcprotocol.projecta.app_auto_upgrade.app_auto_upgrade.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class PullUpgradeStyleReq extends d {
    private static volatile PullUpgradeStyleReq[] _emptyArray;
    public int fromSource;

    public PullUpgradeStyleReq() {
        clear();
    }

    public static PullUpgradeStyleReq[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new PullUpgradeStyleReq[0];
                }
            }
        }
        return _emptyArray;
    }

    public static PullUpgradeStyleReq parseFrom(a aVar) throws IOException {
        return new PullUpgradeStyleReq().mergeFrom(aVar);
    }

    public static PullUpgradeStyleReq parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (PullUpgradeStyleReq) d.mergeFrom(new PullUpgradeStyleReq(), bArr);
    }

    public PullUpgradeStyleReq clear() {
        this.fromSource = 0;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.fromSource;
        return i2 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.e(1, i2) : computeSerializedSize;
    }

    public PullUpgradeStyleReq mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 8) {
                this.fromSource = aVar.m();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i2 = this.fromSource;
        if (i2 != 0) {
            codedOutputByteBufferNano.u(1, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
