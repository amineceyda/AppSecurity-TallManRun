package com.tencent.trpcprotocol.projecta.app_auto_upgrade.app_auto_upgrade.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class PullUpgradeStyleRsp extends d {
    private static volatile PullUpgradeStyleRsp[] _emptyArray;
    public int data;
    public String errmsg;
    public int retcode;

    public PullUpgradeStyleRsp() {
        clear();
    }

    public static PullUpgradeStyleRsp[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new PullUpgradeStyleRsp[0];
                }
            }
        }
        return _emptyArray;
    }

    public static PullUpgradeStyleRsp parseFrom(a aVar) throws IOException {
        return new PullUpgradeStyleRsp().mergeFrom(aVar);
    }

    public static PullUpgradeStyleRsp parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (PullUpgradeStyleRsp) d.mergeFrom(new PullUpgradeStyleRsp(), bArr);
    }

    public PullUpgradeStyleRsp clear() {
        this.retcode = 0;
        this.errmsg = "";
        this.data = 0;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.retcode;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.e(1, i2);
        }
        if (!this.errmsg.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.errmsg);
        }
        int i3 = this.data;
        return i3 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.e(3, i3) : computeSerializedSize;
    }

    public PullUpgradeStyleRsp mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 8) {
                this.retcode = aVar.m();
            } else if (p == 18) {
                this.errmsg = aVar.o();
            } else if (p == 24) {
                int m2 = aVar.m();
                if (m2 == 0 || m2 == 1 || m2 == 2 || m2 == 3) {
                    this.data = m2;
                }
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i2 = this.retcode;
        if (i2 != 0) {
            codedOutputByteBufferNano.u(1, i2);
        }
        if (!this.errmsg.equals("")) {
            codedOutputByteBufferNano.C(2, this.errmsg);
        }
        int i3 = this.data;
        if (i3 != 0) {
            codedOutputByteBufferNano.u(3, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
