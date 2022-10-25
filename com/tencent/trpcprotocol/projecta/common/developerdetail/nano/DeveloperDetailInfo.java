package com.tencent.trpcprotocol.projecta.common.developerdetail.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.bannerimage.nano.BannerImage;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class DeveloperDetailInfo extends d {
    private static volatile DeveloperDetailInfo[] _emptyArray;
    public BannerImage icon;
    public String label;
    public String reviewStars;
    public String reviewStarsOfTen;
    public long topIndex;

    public DeveloperDetailInfo() {
        clear();
    }

    public static DeveloperDetailInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new DeveloperDetailInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static DeveloperDetailInfo parseFrom(a aVar) throws IOException {
        return new DeveloperDetailInfo().mergeFrom(aVar);
    }

    public static DeveloperDetailInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (DeveloperDetailInfo) d.mergeFrom(new DeveloperDetailInfo(), bArr);
    }

    public DeveloperDetailInfo clear() {
        this.label = "";
        this.icon = null;
        this.reviewStars = "";
        this.topIndex = 0;
        this.reviewStarsOfTen = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.label.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.label);
        }
        BannerImage bannerImage = this.icon;
        if (bannerImage != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(2, bannerImage);
        }
        if (!this.reviewStars.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(3, this.reviewStars);
        }
        long j2 = this.topIndex;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(4, j2);
        }
        return !this.reviewStarsOfTen.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(5, this.reviewStarsOfTen) : computeSerializedSize;
    }

    public DeveloperDetailInfo mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.label = aVar.o();
            } else if (p == 18) {
                if (this.icon == null) {
                    this.icon = new BannerImage();
                }
                aVar.g(this.icon);
            } else if (p == 26) {
                this.reviewStars = aVar.o();
            } else if (p == 32) {
                this.topIndex = aVar.n();
            } else if (p == 42) {
                this.reviewStarsOfTen = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.label.equals("")) {
            codedOutputByteBufferNano.C(1, this.label);
        }
        BannerImage bannerImage = this.icon;
        if (bannerImage != null) {
            codedOutputByteBufferNano.w(2, bannerImage);
        }
        if (!this.reviewStars.equals("")) {
            codedOutputByteBufferNano.C(3, this.reviewStars);
        }
        long j2 = this.topIndex;
        if (j2 != 0) {
            codedOutputByteBufferNano.v(4, j2);
        }
        if (!this.reviewStarsOfTen.equals("")) {
            codedOutputByteBufferNano.C(5, this.reviewStarsOfTen);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
