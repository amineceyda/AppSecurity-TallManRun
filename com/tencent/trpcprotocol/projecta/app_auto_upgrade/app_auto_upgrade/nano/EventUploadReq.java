package com.tencent.trpcprotocol.projecta.app_auto_upgrade.app_auto_upgrade.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class EventUploadReq extends d {
    private static volatile EventUploadReq[] _emptyArray;
    public int eventResult;
    public int eventType;
    public String md5;
    public String tacticsId;

    public EventUploadReq() {
        clear();
    }

    public static EventUploadReq[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new EventUploadReq[0];
                }
            }
        }
        return _emptyArray;
    }

    public static EventUploadReq parseFrom(a aVar) throws IOException {
        return new EventUploadReq().mergeFrom(aVar);
    }

    public static EventUploadReq parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (EventUploadReq) d.mergeFrom(new EventUploadReq(), bArr);
    }

    public EventUploadReq clear() {
        this.eventType = 0;
        this.eventResult = 0;
        this.tacticsId = "";
        this.md5 = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.eventType;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.e(1, i2);
        }
        int i3 = this.eventResult;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.e(2, i3);
        }
        if (!this.tacticsId.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(3, this.tacticsId);
        }
        return !this.md5.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(4, this.md5) : computeSerializedSize;
    }

    public EventUploadReq mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 8) {
                int m2 = aVar.m();
                if (m2 == 0 || m2 == 1 || m2 == 2 || m2 == 3) {
                    this.eventType = m2;
                }
            } else if (p == 16) {
                this.eventResult = aVar.m();
            } else if (p == 26) {
                this.tacticsId = aVar.o();
            } else if (p == 34) {
                this.md5 = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i2 = this.eventType;
        if (i2 != 0) {
            codedOutputByteBufferNano.u(1, i2);
        }
        int i3 = this.eventResult;
        if (i3 != 0) {
            codedOutputByteBufferNano.u(2, i3);
        }
        if (!this.tacticsId.equals("")) {
            codedOutputByteBufferNano.C(3, this.tacticsId);
        }
        if (!this.md5.equals("")) {
            codedOutputByteBufferNano.C(4, this.md5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
