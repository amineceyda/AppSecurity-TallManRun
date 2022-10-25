package com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import g.e.d.a.e;
import java.io.IOException;

public final class HotSearch24HourRsp extends d {
    private static volatile HotSearch24HourRsp[] _emptyArray;
    public AppDetailInfo[] appList;

    public HotSearch24HourRsp() {
        clear();
    }

    public static HotSearch24HourRsp[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new HotSearch24HourRsp[0];
                }
            }
        }
        return _emptyArray;
    }

    public static HotSearch24HourRsp parseFrom(a aVar) throws IOException {
        return new HotSearch24HourRsp().mergeFrom(aVar);
    }

    public static HotSearch24HourRsp parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (HotSearch24HourRsp) d.mergeFrom(new HotSearch24HourRsp(), bArr);
    }

    public HotSearch24HourRsp clear() {
        this.appList = AppDetailInfo.emptyArray();
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        AppDetailInfo[] appDetailInfoArr = this.appList;
        if (appDetailInfoArr != null && appDetailInfoArr.length > 0) {
            int i2 = 0;
            while (true) {
                AppDetailInfo[] appDetailInfoArr2 = this.appList;
                if (i2 >= appDetailInfoArr2.length) {
                    break;
                }
                AppDetailInfo appDetailInfo = appDetailInfoArr2[i2];
                if (appDetailInfo != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(1, appDetailInfo);
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    public HotSearch24HourRsp mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                int a = e.a(aVar, 10);
                AppDetailInfo[] appDetailInfoArr = this.appList;
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
                this.appList = appDetailInfoArr2;
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        AppDetailInfo[] appDetailInfoArr = this.appList;
        if (appDetailInfoArr != null && appDetailInfoArr.length > 0) {
            int i2 = 0;
            while (true) {
                AppDetailInfo[] appDetailInfoArr2 = this.appList;
                if (i2 >= appDetailInfoArr2.length) {
                    break;
                }
                AppDetailInfo appDetailInfo = appDetailInfoArr2[i2];
                if (appDetailInfo != null) {
                    codedOutputByteBufferNano.w(1, appDetailInfo);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
