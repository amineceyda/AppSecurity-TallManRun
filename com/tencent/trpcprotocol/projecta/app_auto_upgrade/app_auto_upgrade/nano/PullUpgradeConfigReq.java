package com.tencent.trpcprotocol.projecta.app_auto_upgrade.app_auto_upgrade.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class PullUpgradeConfigReq extends d {
    private static volatile PullUpgradeConfigReq[] _emptyArray;
    public int data;
    public String md5;

    public PullUpgradeConfigReq() {
        clear();
    }

    public static PullUpgradeConfigReq[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new PullUpgradeConfigReq[0];
                }
            }
        }
        return _emptyArray;
    }

    public static PullUpgradeConfigReq parseFrom(a aVar) throws IOException {
        return new PullUpgradeConfigReq().mergeFrom(aVar);
    }

    public static PullUpgradeConfigReq parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (PullUpgradeConfigReq) d.mergeFrom(new PullUpgradeConfigReq(), bArr);
    }

    public PullUpgradeConfigReq clear() {
        this.data = 0;
        this.md5 = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.data;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.e(1, i2);
        }
        return !this.md5.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(2, this.md5) : computeSerializedSize;
    }

    public PullUpgradeConfigReq mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 8) {
                int m2 = aVar.m();
                if (m2 == 0 || m2 == 1 || m2 == 2 || m2 == 3) {
                    this.data = m2;
                }
            } else if (p == 18) {
                this.md5 = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i2 = this.data;
        if (i2 != 0) {
            codedOutputByteBufferNano.u(1, i2);
        }
        if (!this.md5.equals("")) {
            codedOutputByteBufferNano.C(2, this.md5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
