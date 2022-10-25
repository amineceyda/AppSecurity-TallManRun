package com.apkpure.aegon.proto.projecta_config_svr.projecta_config_svr.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import g.e.d.a.e;
import java.io.IOException;

public final class GetOpenScreenCfgRsp extends d {
    private static volatile GetOpenScreenCfgRsp[] _emptyArray;
    public long interval;
    public int limitDay;
    public OpenScreenInfo[] openScreenCfg;

    public GetOpenScreenCfgRsp() {
        clear();
    }

    public static GetOpenScreenCfgRsp[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new GetOpenScreenCfgRsp[0];
                }
            }
        }
        return _emptyArray;
    }

    public static GetOpenScreenCfgRsp parseFrom(a aVar) throws IOException {
        return new GetOpenScreenCfgRsp().mergeFrom(aVar);
    }

    public static GetOpenScreenCfgRsp parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (GetOpenScreenCfgRsp) d.mergeFrom(new GetOpenScreenCfgRsp(), bArr);
    }

    public GetOpenScreenCfgRsp clear() {
        this.openScreenCfg = OpenScreenInfo.emptyArray();
        this.interval = 0;
        this.limitDay = 0;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        OpenScreenInfo[] openScreenInfoArr = this.openScreenCfg;
        if (openScreenInfoArr != null && openScreenInfoArr.length > 0) {
            int i2 = 0;
            while (true) {
                OpenScreenInfo[] openScreenInfoArr2 = this.openScreenCfg;
                if (i2 >= openScreenInfoArr2.length) {
                    break;
                }
                OpenScreenInfo openScreenInfo = openScreenInfoArr2[i2];
                if (openScreenInfo != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(1, openScreenInfo);
                }
                i2++;
            }
        }
        long j2 = this.interval;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(2, j2);
        }
        int i3 = this.limitDay;
        return i3 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.e(3, i3) : computeSerializedSize;
    }

    public GetOpenScreenCfgRsp mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                int a = e.a(aVar, 10);
                OpenScreenInfo[] openScreenInfoArr = this.openScreenCfg;
                int length = openScreenInfoArr == null ? 0 : openScreenInfoArr.length;
                int i2 = a + length;
                OpenScreenInfo[] openScreenInfoArr2 = new OpenScreenInfo[i2];
                if (length != 0) {
                    System.arraycopy(openScreenInfoArr, 0, openScreenInfoArr2, 0, length);
                }
                while (length < i2 - 1) {
                    openScreenInfoArr2[length] = new OpenScreenInfo();
                    aVar.g(openScreenInfoArr2[length]);
                    aVar.p();
                    length++;
                }
                openScreenInfoArr2[length] = new OpenScreenInfo();
                aVar.g(openScreenInfoArr2[length]);
                this.openScreenCfg = openScreenInfoArr2;
            } else if (p == 16) {
                this.interval = aVar.n();
            } else if (p == 24) {
                this.limitDay = aVar.m();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        OpenScreenInfo[] openScreenInfoArr = this.openScreenCfg;
        if (openScreenInfoArr != null && openScreenInfoArr.length > 0) {
            int i2 = 0;
            while (true) {
                OpenScreenInfo[] openScreenInfoArr2 = this.openScreenCfg;
                if (i2 >= openScreenInfoArr2.length) {
                    break;
                }
                OpenScreenInfo openScreenInfo = openScreenInfoArr2[i2];
                if (openScreenInfo != null) {
                    codedOutputByteBufferNano.w(1, openScreenInfo);
                }
                i2++;
            }
        }
        long j2 = this.interval;
        if (j2 != 0) {
            codedOutputByteBufferNano.v(2, j2);
        }
        int i3 = this.limitDay;
        if (i3 != 0) {
            codedOutputByteBufferNano.u(3, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
