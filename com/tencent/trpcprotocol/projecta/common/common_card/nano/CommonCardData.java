package com.tencent.trpcprotocol.projecta.common.common_card.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import g.e.d.a.e;
import java.io.IOException;

public final class CommonCardData extends d {
    private static volatile CommonCardData[] _emptyArray;
    public CommonCardItem[] data;
    public boolean hasNextPage;
    public String nextUrl;

    public CommonCardData() {
        clear();
    }

    public static CommonCardData[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new CommonCardData[0];
                }
            }
        }
        return _emptyArray;
    }

    public static CommonCardData parseFrom(a aVar) throws IOException {
        return new CommonCardData().mergeFrom(aVar);
    }

    public static CommonCardData parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (CommonCardData) d.mergeFrom(new CommonCardData(), bArr);
    }

    public CommonCardData clear() {
        this.data = CommonCardItem.emptyArray();
        this.hasNextPage = false;
        this.nextUrl = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        CommonCardItem[] commonCardItemArr = this.data;
        if (commonCardItemArr != null && commonCardItemArr.length > 0) {
            int i2 = 0;
            while (true) {
                CommonCardItem[] commonCardItemArr2 = this.data;
                if (i2 >= commonCardItemArr2.length) {
                    break;
                }
                CommonCardItem commonCardItem = commonCardItemArr2[i2];
                if (commonCardItem != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(1, commonCardItem);
                }
                i2++;
            }
        }
        boolean z = this.hasNextPage;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.a(2, z);
        }
        return !this.nextUrl.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(3, this.nextUrl) : computeSerializedSize;
    }

    public CommonCardData mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                int a = e.a(aVar, 10);
                CommonCardItem[] commonCardItemArr = this.data;
                int length = commonCardItemArr == null ? 0 : commonCardItemArr.length;
                int i2 = a + length;
                CommonCardItem[] commonCardItemArr2 = new CommonCardItem[i2];
                if (length != 0) {
                    System.arraycopy(commonCardItemArr, 0, commonCardItemArr2, 0, length);
                }
                while (length < i2 - 1) {
                    commonCardItemArr2[length] = new CommonCardItem();
                    aVar.g(commonCardItemArr2[length]);
                    aVar.p();
                    length++;
                }
                commonCardItemArr2[length] = new CommonCardItem();
                aVar.g(commonCardItemArr2[length]);
                this.data = commonCardItemArr2;
            } else if (p == 16) {
                this.hasNextPage = aVar.c();
            } else if (p == 26) {
                this.nextUrl = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        CommonCardItem[] commonCardItemArr = this.data;
        if (commonCardItemArr != null && commonCardItemArr.length > 0) {
            int i2 = 0;
            while (true) {
                CommonCardItem[] commonCardItemArr2 = this.data;
                if (i2 >= commonCardItemArr2.length) {
                    break;
                }
                CommonCardItem commonCardItem = commonCardItemArr2[i2];
                if (commonCardItem != null) {
                    codedOutputByteBufferNano.w(1, commonCardItem);
                }
                i2++;
            }
        }
        boolean z = this.hasNextPage;
        if (z) {
            codedOutputByteBufferNano.p(2, z);
        }
        if (!this.nextUrl.equals("")) {
            codedOutputByteBufferNano.C(3, this.nextUrl);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
