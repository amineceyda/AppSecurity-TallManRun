package com.tencent.trpcprotocol.projecta.vl_recall_app_detail.vl_recall_app_detail.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import g.e.d.a.e;
import java.io.IOException;

public final class GetAppUpdateReq extends d {
    private static volatile GetAppUpdateReq[] _emptyArray;
    public String androidId;
    public AppInfoForUpdate[] appInfoForUpdate;
    public String applicationId;

    public GetAppUpdateReq() {
        clear();
    }

    public static GetAppUpdateReq[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new GetAppUpdateReq[0];
                }
            }
        }
        return _emptyArray;
    }

    public static GetAppUpdateReq parseFrom(a aVar) throws IOException {
        return new GetAppUpdateReq().mergeFrom(aVar);
    }

    public static GetAppUpdateReq parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (GetAppUpdateReq) d.mergeFrom(new GetAppUpdateReq(), bArr);
    }

    public GetAppUpdateReq clear() {
        this.androidId = "";
        this.applicationId = "";
        this.appInfoForUpdate = AppInfoForUpdate.emptyArray();
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.androidId.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.androidId);
        }
        if (!this.applicationId.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.applicationId);
        }
        AppInfoForUpdate[] appInfoForUpdateArr = this.appInfoForUpdate;
        if (appInfoForUpdateArr != null && appInfoForUpdateArr.length > 0) {
            int i2 = 0;
            while (true) {
                AppInfoForUpdate[] appInfoForUpdateArr2 = this.appInfoForUpdate;
                if (i2 >= appInfoForUpdateArr2.length) {
                    break;
                }
                AppInfoForUpdate appInfoForUpdate2 = appInfoForUpdateArr2[i2];
                if (appInfoForUpdate2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(3, appInfoForUpdate2);
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    public GetAppUpdateReq mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.androidId = aVar.o();
            } else if (p == 18) {
                this.applicationId = aVar.o();
            } else if (p == 26) {
                int a = e.a(aVar, 26);
                AppInfoForUpdate[] appInfoForUpdateArr = this.appInfoForUpdate;
                int length = appInfoForUpdateArr == null ? 0 : appInfoForUpdateArr.length;
                int i2 = a + length;
                AppInfoForUpdate[] appInfoForUpdateArr2 = new AppInfoForUpdate[i2];
                if (length != 0) {
                    System.arraycopy(appInfoForUpdateArr, 0, appInfoForUpdateArr2, 0, length);
                }
                while (length < i2 - 1) {
                    appInfoForUpdateArr2[length] = new AppInfoForUpdate();
                    aVar.g(appInfoForUpdateArr2[length]);
                    aVar.p();
                    length++;
                }
                appInfoForUpdateArr2[length] = new AppInfoForUpdate();
                aVar.g(appInfoForUpdateArr2[length]);
                this.appInfoForUpdate = appInfoForUpdateArr2;
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.androidId.equals("")) {
            codedOutputByteBufferNano.C(1, this.androidId);
        }
        if (!this.applicationId.equals("")) {
            codedOutputByteBufferNano.C(2, this.applicationId);
        }
        AppInfoForUpdate[] appInfoForUpdateArr = this.appInfoForUpdate;
        if (appInfoForUpdateArr != null && appInfoForUpdateArr.length > 0) {
            int i2 = 0;
            while (true) {
                AppInfoForUpdate[] appInfoForUpdateArr2 = this.appInfoForUpdate;
                if (i2 >= appInfoForUpdateArr2.length) {
                    break;
                }
                AppInfoForUpdate appInfoForUpdate2 = appInfoForUpdateArr2[i2];
                if (appInfoForUpdate2 != null) {
                    codedOutputByteBufferNano.w(3, appInfoForUpdate2);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
