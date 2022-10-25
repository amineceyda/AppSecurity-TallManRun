package com.tencent.trpcprotocol.projecta.vl_recall_app_detail.vl_recall_app_detail.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import g.e.d.a.e;
import java.io.IOException;

public final class GetAppUpdateRsp extends d {
    private static volatile GetAppUpdateRsp[] _emptyArray;
    public AppDetailInfo[] appUpdateResponse;
    public int retcode;

    public GetAppUpdateRsp() {
        clear();
    }

    public static GetAppUpdateRsp[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new GetAppUpdateRsp[0];
                }
            }
        }
        return _emptyArray;
    }

    public static GetAppUpdateRsp parseFrom(a aVar) throws IOException {
        return new GetAppUpdateRsp().mergeFrom(aVar);
    }

    public static GetAppUpdateRsp parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (GetAppUpdateRsp) d.mergeFrom(new GetAppUpdateRsp(), bArr);
    }

    public GetAppUpdateRsp clear() {
        this.retcode = 0;
        this.appUpdateResponse = AppDetailInfo.emptyArray();
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.retcode;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.e(1, i2);
        }
        AppDetailInfo[] appDetailInfoArr = this.appUpdateResponse;
        if (appDetailInfoArr != null && appDetailInfoArr.length > 0) {
            int i3 = 0;
            while (true) {
                AppDetailInfo[] appDetailInfoArr2 = this.appUpdateResponse;
                if (i3 >= appDetailInfoArr2.length) {
                    break;
                }
                AppDetailInfo appDetailInfo = appDetailInfoArr2[i3];
                if (appDetailInfo != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(2, appDetailInfo);
                }
                i3++;
            }
        }
        return computeSerializedSize;
    }

    public GetAppUpdateRsp mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 8) {
                this.retcode = aVar.m();
            } else if (p == 18) {
                int a = e.a(aVar, 18);
                AppDetailInfo[] appDetailInfoArr = this.appUpdateResponse;
                int length = appDetailInfoArr == null ? 0 : appDetailInfoArr.length;
                int i2 = a + length;
                AppDetailInfo[] appDetailInfoArr2 = new AppDetailInfo[i2];
                if (length != 0) {
                    System.arraycopy(appDetailInfoArr, 0, appDetailInfoArr2, 0, length);
                }
                while (length < i2 - 1) {
                    appDetailInfoArr2[length] = new AppDetailInfo();
                    aVar.g(appDetailInfoArr2[length]);
                    aVar.p();
                    length++;
                }
                appDetailInfoArr2[length] = new AppDetailInfo();
                aVar.g(appDetailInfoArr2[length]);
                this.appUpdateResponse = appDetailInfoArr2;
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
        AppDetailInfo[] appDetailInfoArr = this.appUpdateResponse;
        if (appDetailInfoArr != null && appDetailInfoArr.length > 0) {
            int i3 = 0;
            while (true) {
                AppDetailInfo[] appDetailInfoArr2 = this.appUpdateResponse;
                if (i3 >= appDetailInfoArr2.length) {
                    break;
                }
                AppDetailInfo appDetailInfo = appDetailInfoArr2[i3];
                if (appDetailInfo != null) {
                    codedOutputByteBufferNano.w(2, appDetailInfo);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
