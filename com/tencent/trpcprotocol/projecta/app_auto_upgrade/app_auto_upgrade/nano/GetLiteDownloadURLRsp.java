package com.tencent.trpcprotocol.projecta.app_auto_upgrade.app_auto_upgrade.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class GetLiteDownloadURLRsp extends d {
    private static volatile GetLiteDownloadURLRsp[] _emptyArray;
    public String downloadUrl;
    public String errmsg;
    public int retcode;

    public GetLiteDownloadURLRsp() {
        clear();
    }

    public static GetLiteDownloadURLRsp[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new GetLiteDownloadURLRsp[0];
                }
            }
        }
        return _emptyArray;
    }

    public static GetLiteDownloadURLRsp parseFrom(a aVar) throws IOException {
        return new GetLiteDownloadURLRsp().mergeFrom(aVar);
    }

    public static GetLiteDownloadURLRsp parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (GetLiteDownloadURLRsp) d.mergeFrom(new GetLiteDownloadURLRsp(), bArr);
    }

    public GetLiteDownloadURLRsp clear() {
        this.retcode = 0;
        this.errmsg = "";
        this.downloadUrl = "";
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
        return !this.downloadUrl.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(3, this.downloadUrl) : computeSerializedSize;
    }

    public GetLiteDownloadURLRsp mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 8) {
                this.retcode = aVar.m();
            } else if (p == 18) {
                this.errmsg = aVar.o();
            } else if (p == 26) {
                this.downloadUrl = aVar.o();
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
        if (!this.downloadUrl.equals("")) {
            codedOutputByteBufferNano.C(3, this.downloadUrl);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
