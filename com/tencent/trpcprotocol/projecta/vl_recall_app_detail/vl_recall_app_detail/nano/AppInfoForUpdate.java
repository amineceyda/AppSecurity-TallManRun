package com.tencent.trpcprotocol.projecta.vl_recall_app_detail.vl_recall_app_detail.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class AppInfoForUpdate extends d {
    private static volatile AppInfoForUpdate[] _emptyArray;
    public boolean isSystem;
    public String packageName;
    public int versionCode;
    public String versionId;

    public AppInfoForUpdate() {
        clear();
    }

    public static AppInfoForUpdate[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new AppInfoForUpdate[0];
                }
            }
        }
        return _emptyArray;
    }

    public static AppInfoForUpdate parseFrom(a aVar) throws IOException {
        return new AppInfoForUpdate().mergeFrom(aVar);
    }

    public static AppInfoForUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (AppInfoForUpdate) d.mergeFrom(new AppInfoForUpdate(), bArr);
    }

    public AppInfoForUpdate clear() {
        this.isSystem = false;
        this.packageName = "";
        this.versionCode = 0;
        this.versionId = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.isSystem;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.a(1, z);
        }
        if (!this.packageName.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.packageName);
        }
        int i2 = this.versionCode;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.e(3, i2);
        }
        return !this.versionId.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(4, this.versionId) : computeSerializedSize;
    }

    public AppInfoForUpdate mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 8) {
                this.isSystem = aVar.c();
            } else if (p == 18) {
                this.packageName = aVar.o();
            } else if (p == 24) {
                this.versionCode = aVar.m();
            } else if (p == 34) {
                this.versionId = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.isSystem;
        if (z) {
            codedOutputByteBufferNano.p(1, z);
        }
        if (!this.packageName.equals("")) {
            codedOutputByteBufferNano.C(2, this.packageName);
        }
        int i2 = this.versionCode;
        if (i2 != 0) {
            codedOutputByteBufferNano.u(3, i2);
        }
        if (!this.versionId.equals("")) {
            codedOutputByteBufferNano.C(4, this.versionId);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
