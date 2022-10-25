package com.tencent.trpcprotocol.projecta.common.assetinfo.nano;

import com.google.android.gms.common.ConnectionResult;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import g.e.d.a.e;
import java.io.IOException;

public final class AssetInfo extends d {
    private static volatile AssetInfo[] _emptyArray;
    public long expireData;
    public String expiryDate;
    public String name;
    public String sha1;
    public long size;
    public long threadCount;
    public String torrentUrl;
    public String[] trackers;
    public String type;
    public String url;
    public String urlSeed;
    public String[] urls;

    public AssetInfo() {
        clear();
    }

    public static AssetInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new AssetInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static AssetInfo parseFrom(a aVar) throws IOException {
        return new AssetInfo().mergeFrom(aVar);
    }

    public static AssetInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (AssetInfo) d.mergeFrom(new AssetInfo(), bArr);
    }

    public AssetInfo clear() {
        this.expiryDate = "";
        this.name = "";
        this.sha1 = "";
        this.size = 0;
        this.threadCount = 0;
        this.torrentUrl = "";
        String[] strArr = e.b;
        this.trackers = strArr;
        this.type = "";
        this.url = "";
        this.urlSeed = "";
        this.urls = strArr;
        this.expireData = 0;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.expiryDate.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.expiryDate);
        }
        if (!this.name.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.name);
        }
        if (!this.sha1.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(3, this.sha1);
        }
        long j2 = this.size;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(4, j2);
        }
        long j3 = this.threadCount;
        if (j3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(5, j3);
        }
        if (!this.torrentUrl.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(6, this.torrentUrl);
        }
        String[] strArr = this.trackers;
        int i2 = 0;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.trackers;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i3];
                if (str != null) {
                    i5++;
                    int o = CodedOutputByteBufferNano.o(str);
                    i4 += CodedOutputByteBufferNano.h(o) + o;
                }
                i3++;
            }
            computeSerializedSize = computeSerializedSize + i4 + (i5 * 1);
        }
        if (!this.type.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(8, this.type);
        }
        if (!this.url.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(9, this.url);
        }
        if (!this.urlSeed.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(10, this.urlSeed);
        }
        String[] strArr3 = this.urls;
        if (strArr3 != null && strArr3.length > 0) {
            int i6 = 0;
            int i7 = 0;
            while (true) {
                String[] strArr4 = this.urls;
                if (i2 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i2];
                if (str2 != null) {
                    i7++;
                    int o2 = CodedOutputByteBufferNano.o(str2);
                    i6 += CodedOutputByteBufferNano.h(o2) + o2;
                }
                i2++;
            }
            computeSerializedSize = computeSerializedSize + i6 + (i7 * 1);
        }
        long j4 = this.expireData;
        return j4 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.f(12, j4) : computeSerializedSize;
    }

    public AssetInfo mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            switch (p) {
                case 0:
                    return this;
                case 10:
                    this.expiryDate = aVar.o();
                    break;
                case ConnectionResult.SERVICE_UPDATING:
                    this.name = aVar.o();
                    break;
                case 26:
                    this.sha1 = aVar.o();
                    break;
                case 32:
                    this.size = aVar.n();
                    break;
                case 40:
                    this.threadCount = aVar.n();
                    break;
                case 50:
                    this.torrentUrl = aVar.o();
                    break;
                case 58:
                    int a = e.a(aVar, 58);
                    String[] strArr = this.trackers;
                    int length = strArr == null ? 0 : strArr.length;
                    int i2 = a + length;
                    String[] strArr2 = new String[i2];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        strArr2[length] = aVar.o();
                        aVar.p();
                        length++;
                    }
                    strArr2[length] = aVar.o();
                    this.trackers = strArr2;
                    break;
                case 66:
                    this.type = aVar.o();
                    break;
                case 74:
                    this.url = aVar.o();
                    break;
                case 82:
                    this.urlSeed = aVar.o();
                    break;
                case 90:
                    int a2 = e.a(aVar, 90);
                    String[] strArr3 = this.urls;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i3 = a2 + length2;
                    String[] strArr4 = new String[i3];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        strArr4[length2] = aVar.o();
                        aVar.p();
                        length2++;
                    }
                    strArr4[length2] = aVar.o();
                    this.urls = strArr4;
                    break;
                case 96:
                    this.expireData = aVar.n();
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
        if (!this.expiryDate.equals("")) {
            codedOutputByteBufferNano.C(1, this.expiryDate);
        }
        if (!this.name.equals("")) {
            codedOutputByteBufferNano.C(2, this.name);
        }
        if (!this.sha1.equals("")) {
            codedOutputByteBufferNano.C(3, this.sha1);
        }
        long j2 = this.size;
        if (j2 != 0) {
            codedOutputByteBufferNano.v(4, j2);
        }
        long j3 = this.threadCount;
        if (j3 != 0) {
            codedOutputByteBufferNano.v(5, j3);
        }
        if (!this.torrentUrl.equals("")) {
            codedOutputByteBufferNano.C(6, this.torrentUrl);
        }
        String[] strArr = this.trackers;
        int i2 = 0;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.trackers;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i3];
                if (str != null) {
                    codedOutputByteBufferNano.C(7, str);
                }
                i3++;
            }
        }
        if (!this.type.equals("")) {
            codedOutputByteBufferNano.C(8, this.type);
        }
        if (!this.url.equals("")) {
            codedOutputByteBufferNano.C(9, this.url);
        }
        if (!this.urlSeed.equals("")) {
            codedOutputByteBufferNano.C(10, this.urlSeed);
        }
        String[] strArr3 = this.urls;
        if (strArr3 != null && strArr3.length > 0) {
            while (true) {
                String[] strArr4 = this.urls;
                if (i2 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i2];
                if (str2 != null) {
                    codedOutputByteBufferNano.C(11, str2);
                }
                i2++;
            }
        }
        long j4 = this.expireData;
        if (j4 != 0) {
            codedOutputByteBufferNano.v(12, j4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
