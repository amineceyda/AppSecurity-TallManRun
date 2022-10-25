package com.tencent.trpcprotocol.projecta.common.common_card.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import g.e.d.a.e;
import java.io.IOException;

public final class AppCardConfig extends d {
    private static volatile AppCardConfig[] _emptyArray;
    public String background;
    public String moduleName;
    public String moduleScene;
    public long scene;
    public String[] showAdFlagPackages;
    public boolean showRank;
    public int spacing;
    public String span;

    public AppCardConfig() {
        clear();
    }

    public static AppCardConfig[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new AppCardConfig[0];
                }
            }
        }
        return _emptyArray;
    }

    public static AppCardConfig parseFrom(a aVar) throws IOException {
        return new AppCardConfig().mergeFrom(aVar);
    }

    public static AppCardConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (AppCardConfig) d.mergeFrom(new AppCardConfig(), bArr);
    }

    public AppCardConfig clear() {
        this.spacing = 0;
        this.showRank = false;
        this.span = "";
        this.scene = 0;
        this.moduleName = "";
        this.moduleScene = "";
        this.background = "";
        this.showAdFlagPackages = e.b;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.spacing;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.e(1, i2);
        }
        boolean z = this.showRank;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.a(2, z);
        }
        if (!this.span.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(3, this.span);
        }
        long j2 = this.scene;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(4, j2);
        }
        if (!this.moduleName.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(5, this.moduleName);
        }
        if (!this.moduleScene.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(6, this.moduleScene);
        }
        if (!this.background.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(7, this.background);
        }
        String[] strArr = this.showAdFlagPackages;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String[] strArr2 = this.showAdFlagPackages;
            if (i3 >= strArr2.length) {
                return computeSerializedSize + i4 + (i5 * 1);
            }
            String str = strArr2[i3];
            if (str != null) {
                i5++;
                int o = CodedOutputByteBufferNano.o(str);
                i4 += CodedOutputByteBufferNano.h(o) + o;
            }
            i3++;
        }
    }

    public AppCardConfig mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 8) {
                this.spacing = aVar.m();
            } else if (p == 16) {
                this.showRank = aVar.c();
            } else if (p == 26) {
                this.span = aVar.o();
            } else if (p == 32) {
                this.scene = aVar.n();
            } else if (p == 42) {
                this.moduleName = aVar.o();
            } else if (p == 50) {
                this.moduleScene = aVar.o();
            } else if (p == 58) {
                this.background = aVar.o();
            } else if (p == 66) {
                int a = e.a(aVar, 66);
                String[] strArr = this.showAdFlagPackages;
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
                this.showAdFlagPackages = strArr2;
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i2 = this.spacing;
        if (i2 != 0) {
            codedOutputByteBufferNano.u(1, i2);
        }
        boolean z = this.showRank;
        if (z) {
            codedOutputByteBufferNano.p(2, z);
        }
        if (!this.span.equals("")) {
            codedOutputByteBufferNano.C(3, this.span);
        }
        long j2 = this.scene;
        if (j2 != 0) {
            codedOutputByteBufferNano.v(4, j2);
        }
        if (!this.moduleName.equals("")) {
            codedOutputByteBufferNano.C(5, this.moduleName);
        }
        if (!this.moduleScene.equals("")) {
            codedOutputByteBufferNano.C(6, this.moduleScene);
        }
        if (!this.background.equals("")) {
            codedOutputByteBufferNano.C(7, this.background);
        }
        String[] strArr = this.showAdFlagPackages;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.showAdFlagPackages;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i3];
                if (str != null) {
                    codedOutputByteBufferNano.C(8, str);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
