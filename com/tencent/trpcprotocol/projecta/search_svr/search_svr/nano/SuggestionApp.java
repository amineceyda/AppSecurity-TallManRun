package com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import g.e.d.a.e;
import java.io.IOException;

public final class SuggestionApp extends d {
    private static volatile SuggestionApp[] _emptyArray;
    public AppDetailInfo appDetailInfo;
    public String icon;
    public long installTotal;
    public boolean isIntervene;
    public String key;
    public String packageName;
    public long size;
    public String[] tags;
    public String title;
    public String url;

    public SuggestionApp() {
        clear();
    }

    public static SuggestionApp[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new SuggestionApp[0];
                }
            }
        }
        return _emptyArray;
    }

    public static SuggestionApp parseFrom(a aVar) throws IOException {
        return new SuggestionApp().mergeFrom(aVar);
    }

    public static SuggestionApp parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (SuggestionApp) d.mergeFrom(new SuggestionApp(), bArr);
    }

    public SuggestionApp clear() {
        this.key = "";
        this.packageName = "";
        this.title = "";
        this.icon = "";
        this.installTotal = 0;
        this.url = "";
        this.size = 0;
        this.tags = e.b;
        this.isIntervene = false;
        this.appDetailInfo = null;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.key.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.key);
        }
        if (!this.packageName.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(3, this.packageName);
        }
        if (!this.title.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(4, this.title);
        }
        if (!this.icon.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(5, this.icon);
        }
        long j2 = this.installTotal;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.l(6, j2);
        }
        if (!this.url.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(7, this.url);
        }
        long j3 = this.size;
        if (j3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.l(8, j3);
        }
        String[] strArr = this.tags;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.tags;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    i4++;
                    int o = CodedOutputByteBufferNano.o(str);
                    i3 += CodedOutputByteBufferNano.h(o) + o;
                }
                i2++;
            }
            computeSerializedSize = computeSerializedSize + i3 + (i4 * 1);
        }
        boolean z = this.isIntervene;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.a(10, z);
        }
        AppDetailInfo appDetailInfo2 = this.appDetailInfo;
        return appDetailInfo2 != null ? computeSerializedSize + CodedOutputByteBufferNano.g(11, appDetailInfo2) : computeSerializedSize;
    }

    public SuggestionApp mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            switch (p) {
                case 0:
                    return this;
                case ConnectionResult.SERVICE_UPDATING:
                    this.key = aVar.o();
                    break;
                case 26:
                    this.packageName = aVar.o();
                    break;
                case 34:
                    this.title = aVar.o();
                    break;
                case 42:
                    this.icon = aVar.o();
                    break;
                case 48:
                    this.installTotal = aVar.n();
                    break;
                case 58:
                    this.url = aVar.o();
                    break;
                case ModuleDescriptor.MODULE_VERSION:
                    this.size = aVar.n();
                    break;
                case 74:
                    int a = e.a(aVar, 74);
                    String[] strArr = this.tags;
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
                    this.tags = strArr2;
                    break;
                case 80:
                    this.isIntervene = aVar.c();
                    break;
                case 90:
                    if (this.appDetailInfo == null) {
                        this.appDetailInfo = new AppDetailInfo();
                    }
                    aVar.g(this.appDetailInfo);
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
        if (!this.key.equals("")) {
            codedOutputByteBufferNano.C(2, this.key);
        }
        if (!this.packageName.equals("")) {
            codedOutputByteBufferNano.C(3, this.packageName);
        }
        if (!this.title.equals("")) {
            codedOutputByteBufferNano.C(4, this.title);
        }
        if (!this.icon.equals("")) {
            codedOutputByteBufferNano.C(5, this.icon);
        }
        long j2 = this.installTotal;
        if (j2 != 0) {
            codedOutputByteBufferNano.D(6, j2);
        }
        if (!this.url.equals("")) {
            codedOutputByteBufferNano.C(7, this.url);
        }
        long j3 = this.size;
        if (j3 != 0) {
            codedOutputByteBufferNano.D(8, j3);
        }
        String[] strArr = this.tags;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.tags;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    codedOutputByteBufferNano.C(9, str);
                }
                i2++;
            }
        }
        boolean z = this.isIntervene;
        if (z) {
            codedOutputByteBufferNano.p(10, z);
        }
        AppDetailInfo appDetailInfo2 = this.appDetailInfo;
        if (appDetailInfo2 != null) {
            codedOutputByteBufferNano.w(11, appDetailInfo2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
