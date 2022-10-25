package com.tencent.trpcprotocol.projecta.common.bannerimage.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.imageinfo.nano.ImageInfo;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class BannerImage extends d {
    private static volatile BannerImage[] _emptyArray;
    public ImageInfo original;
    public ImageInfo thumbnail;

    public BannerImage() {
        clear();
    }

    public static BannerImage[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new BannerImage[0];
                }
            }
        }
        return _emptyArray;
    }

    public static BannerImage parseFrom(a aVar) throws IOException {
        return new BannerImage().mergeFrom(aVar);
    }

    public static BannerImage parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (BannerImage) d.mergeFrom(new BannerImage(), bArr);
    }

    public BannerImage clear() {
        this.thumbnail = null;
        this.original = null;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        ImageInfo imageInfo = this.thumbnail;
        if (imageInfo != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(1, imageInfo);
        }
        ImageInfo imageInfo2 = this.original;
        return imageInfo2 != null ? computeSerializedSize + CodedOutputByteBufferNano.g(2, imageInfo2) : computeSerializedSize;
    }

    public BannerImage mergeFrom(a aVar) throws IOException {
        ImageInfo imageInfo;
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                if (this.thumbnail == null) {
                    this.thumbnail = new ImageInfo();
                }
                imageInfo = this.thumbnail;
            } else if (p == 18) {
                if (this.original == null) {
                    this.original = new ImageInfo();
                }
                imageInfo = this.original;
            } else if (!aVar.s(p)) {
                return this;
            }
            aVar.g(imageInfo);
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        ImageInfo imageInfo = this.thumbnail;
        if (imageInfo != null) {
            codedOutputByteBufferNano.w(1, imageInfo);
        }
        ImageInfo imageInfo2 = this.original;
        if (imageInfo2 != null) {
            codedOutputByteBufferNano.w(2, imageInfo2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
