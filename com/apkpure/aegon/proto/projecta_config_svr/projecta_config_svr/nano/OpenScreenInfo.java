package com.apkpure.aegon.proto.projecta_config_svr.projecta_config_svr.nano;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class OpenScreenInfo extends d {
    private static volatile OpenScreenInfo[] _emptyArray;
    public float countDownTime;
    public long endTime;
    public String h5JumpUrl;
    public int id;
    public String logo;
    public String name;
    public String packageName;
    public String recommendId;
    public long startTime;
    public int type;

    public OpenScreenInfo() {
        clear();
    }

    public static OpenScreenInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new OpenScreenInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static OpenScreenInfo parseFrom(a aVar) throws IOException {
        return new OpenScreenInfo().mergeFrom(aVar);
    }

    public static OpenScreenInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (OpenScreenInfo) d.mergeFrom(new OpenScreenInfo(), bArr);
    }

    public OpenScreenInfo clear() {
        this.h5JumpUrl = "";
        this.logo = "";
        this.startTime = 0;
        this.endTime = 0;
        this.id = 0;
        this.name = "";
        this.type = 0;
        this.countDownTime = 0.0f;
        this.packageName = "";
        this.recommendId = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.h5JumpUrl.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.h5JumpUrl);
        }
        if (!this.logo.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.logo);
        }
        long j2 = this.startTime;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.l(3, j2);
        }
        long j3 = this.endTime;
        if (j3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.l(4, j3);
        }
        int i2 = this.id;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.e(6, i2);
        }
        if (!this.name.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(7, this.name);
        }
        int i3 = this.type;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.e(8, i3);
        }
        if (Float.floatToIntBits(this.countDownTime) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += CodedOutputByteBufferNano.d(9, this.countDownTime);
        }
        if (!this.packageName.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(10, this.packageName);
        }
        return !this.recommendId.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(11, this.recommendId) : computeSerializedSize;
    }

    public OpenScreenInfo mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            switch (p) {
                case 0:
                    return this;
                case 10:
                    this.h5JumpUrl = aVar.o();
                    break;
                case ConnectionResult.SERVICE_UPDATING /*18*/:
                    this.logo = aVar.o();
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /*24*/:
                    this.startTime = aVar.n();
                    break;
                case 32:
                    this.endTime = aVar.n();
                    break;
                case 48:
                    this.id = aVar.m();
                    break;
                case 58:
                    this.name = aVar.o();
                    break;
                case ModuleDescriptor.MODULE_VERSION /*64*/:
                    this.type = aVar.m();
                    break;
                case 77:
                    this.countDownTime = aVar.f();
                    break;
                case 82:
                    this.packageName = aVar.o();
                    break;
                case 90:
                    this.recommendId = aVar.o();
                    break;
                default:
                    if (aVar.s(p)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.h5JumpUrl.equals("")) {
            codedOutputByteBufferNano.C(1, this.h5JumpUrl);
        }
        if (!this.logo.equals("")) {
            codedOutputByteBufferNano.C(2, this.logo);
        }
        long j2 = this.startTime;
        if (j2 != 0) {
            codedOutputByteBufferNano.D(3, j2);
        }
        long j3 = this.endTime;
        if (j3 != 0) {
            codedOutputByteBufferNano.D(4, j3);
        }
        int i2 = this.id;
        if (i2 != 0) {
            codedOutputByteBufferNano.u(6, i2);
        }
        if (!this.name.equals("")) {
            codedOutputByteBufferNano.C(7, this.name);
        }
        int i3 = this.type;
        if (i3 != 0) {
            codedOutputByteBufferNano.u(8, i3);
        }
        if (Float.floatToIntBits(this.countDownTime) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.t(9, this.countDownTime);
        }
        if (!this.packageName.equals("")) {
            codedOutputByteBufferNano.C(10, this.packageName);
        }
        if (!this.recommendId.equals("")) {
            codedOutputByteBufferNano.C(11, this.recommendId);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
