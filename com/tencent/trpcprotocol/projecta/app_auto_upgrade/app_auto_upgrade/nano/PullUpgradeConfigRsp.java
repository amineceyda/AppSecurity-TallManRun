package com.tencent.trpcprotocol.projecta.app_auto_upgrade.app_auto_upgrade.nano;

import com.google.android.gms.common.ConnectionResult;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.beacon.event.open.EventResult;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class PullUpgradeConfigRsp extends d {
    private static volatile PullUpgradeConfigRsp[] _emptyArray;
    public int betaPercent;
    public String errmsg;
    public boolean forceUpdate;
    public boolean immedicatelyUpdate;
    public String md5;
    public String packageName;
    public int retcode;
    public Source source;
    public String tacticsId;
    public int updateDelayTime;
    public String updateType;
    public int versionCode;
    public String versionName;
    public String whatsNew;

    public PullUpgradeConfigRsp() {
        clear();
    }

    public static PullUpgradeConfigRsp[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new PullUpgradeConfigRsp[0];
                }
            }
        }
        return _emptyArray;
    }

    public static PullUpgradeConfigRsp parseFrom(a aVar) throws IOException {
        return new PullUpgradeConfigRsp().mergeFrom(aVar);
    }

    public static PullUpgradeConfigRsp parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (PullUpgradeConfigRsp) d.mergeFrom(new PullUpgradeConfigRsp(), bArr);
    }

    public PullUpgradeConfigRsp clear() {
        this.retcode = 0;
        this.errmsg = "";
        this.updateDelayTime = 0;
        this.forceUpdate = false;
        this.whatsNew = "";
        this.updateType = "";
        this.immedicatelyUpdate = false;
        this.source = null;
        this.versionCode = 0;
        this.versionName = "";
        this.packageName = "";
        this.betaPercent = 0;
        this.tacticsId = "";
        this.md5 = "";
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
        int i3 = this.updateDelayTime;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.e(3, i3);
        }
        boolean z = this.forceUpdate;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.a(4, z);
        }
        if (!this.whatsNew.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(5, this.whatsNew);
        }
        if (!this.updateType.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(6, this.updateType);
        }
        boolean z2 = this.immedicatelyUpdate;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.a(7, z2);
        }
        Source source2 = this.source;
        if (source2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(8, source2);
        }
        int i4 = this.versionCode;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.e(9, i4);
        }
        if (!this.versionName.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(10, this.versionName);
        }
        if (!this.packageName.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(11, this.packageName);
        }
        int i5 = this.betaPercent;
        if (i5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.e(12, i5);
        }
        if (!this.tacticsId.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(13, this.tacticsId);
        }
        return !this.md5.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(14, this.md5) : computeSerializedSize;
    }

    public PullUpgradeConfigRsp mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            switch (p) {
                case 0:
                    return this;
                case 8:
                    this.retcode = aVar.m();
                    break;
                case ConnectionResult.SERVICE_UPDATING:
                    this.errmsg = aVar.o();
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION:
                    this.updateDelayTime = aVar.m();
                    break;
                case 32:
                    this.forceUpdate = aVar.c();
                    break;
                case 42:
                    this.whatsNew = aVar.o();
                    break;
                case 50:
                    this.updateType = aVar.o();
                    break;
                case 56:
                    this.immedicatelyUpdate = aVar.c();
                    break;
                case 66:
                    if (this.source == null) {
                        this.source = new Source();
                    }
                    aVar.g(this.source);
                    break;
                case 72:
                    this.versionCode = aVar.m();
                    break;
                case 82:
                    this.versionName = aVar.o();
                    break;
                case 90:
                    this.packageName = aVar.o();
                    break;
                case 96:
                    this.betaPercent = aVar.m();
                    break;
                case EventResult.ERROR_CODE_NAME_NULL:
                    this.tacticsId = aVar.o();
                    break;
                case 114:
                    this.md5 = aVar.o();
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
        int i2 = this.retcode;
        if (i2 != 0) {
            codedOutputByteBufferNano.u(1, i2);
        }
        if (!this.errmsg.equals("")) {
            codedOutputByteBufferNano.C(2, this.errmsg);
        }
        int i3 = this.updateDelayTime;
        if (i3 != 0) {
            codedOutputByteBufferNano.u(3, i3);
        }
        boolean z = this.forceUpdate;
        if (z) {
            codedOutputByteBufferNano.p(4, z);
        }
        if (!this.whatsNew.equals("")) {
            codedOutputByteBufferNano.C(5, this.whatsNew);
        }
        if (!this.updateType.equals("")) {
            codedOutputByteBufferNano.C(6, this.updateType);
        }
        boolean z2 = this.immedicatelyUpdate;
        if (z2) {
            codedOutputByteBufferNano.p(7, z2);
        }
        Source source2 = this.source;
        if (source2 != null) {
            codedOutputByteBufferNano.w(8, source2);
        }
        int i4 = this.versionCode;
        if (i4 != 0) {
            codedOutputByteBufferNano.u(9, i4);
        }
        if (!this.versionName.equals("")) {
            codedOutputByteBufferNano.C(10, this.versionName);
        }
        if (!this.packageName.equals("")) {
            codedOutputByteBufferNano.C(11, this.packageName);
        }
        int i5 = this.betaPercent;
        if (i5 != 0) {
            codedOutputByteBufferNano.u(12, i5);
        }
        if (!this.tacticsId.equals("")) {
            codedOutputByteBufferNano.C(13, this.tacticsId);
        }
        if (!this.md5.equals("")) {
            codedOutputByteBufferNano.C(14, this.md5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
