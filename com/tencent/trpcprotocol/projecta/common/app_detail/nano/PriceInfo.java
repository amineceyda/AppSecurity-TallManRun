package com.tencent.trpcprotocol.projecta.common.app_detail.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class PriceInfo extends d {
    private static volatile PriceInfo[] _emptyArray;
    public String price;
    public String priceDiscount;
    public String priceOld;

    public PriceInfo() {
        clear();
    }

    public static PriceInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new PriceInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static PriceInfo parseFrom(a aVar) throws IOException {
        return new PriceInfo().mergeFrom(aVar);
    }

    public static PriceInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (PriceInfo) d.mergeFrom(new PriceInfo(), bArr);
    }

    public PriceInfo clear() {
        this.price = "";
        this.priceOld = "";
        this.priceDiscount = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.price.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.price);
        }
        if (!this.priceOld.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.priceOld);
        }
        return !this.priceDiscount.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(3, this.priceDiscount) : computeSerializedSize;
    }

    public PriceInfo mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.price = aVar.o();
            } else if (p == 18) {
                this.priceOld = aVar.o();
            } else if (p == 26) {
                this.priceDiscount = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.price.equals("")) {
            codedOutputByteBufferNano.C(1, this.price);
        }
        if (!this.priceOld.equals("")) {
            codedOutputByteBufferNano.C(2, this.priceOld);
        }
        if (!this.priceDiscount.equals("")) {
            codedOutputByteBufferNano.C(3, this.priceDiscount);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
