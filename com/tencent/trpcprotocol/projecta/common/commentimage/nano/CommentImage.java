package com.tencent.trpcprotocol.projecta.common.commentimage.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.imageinfo.nano.ImageInfo;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class CommentImage extends d {
    private static volatile CommentImage[] _emptyArray;
    public ImageInfo mini;
    public ImageInfo original;
    public ImageInfo thumbnail;

    public CommentImage() {
        clear();
    }

    public static CommentImage[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new CommentImage[0];
                }
            }
        }
        return _emptyArray;
    }

    public static CommentImage parseFrom(a aVar) throws IOException {
        return new CommentImage().mergeFrom(aVar);
    }

    public static CommentImage parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (CommentImage) d.mergeFrom(new CommentImage(), bArr);
    }

    public CommentImage clear() {
        this.thumbnail = null;
        this.original = null;
        this.mini = null;
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
        if (imageInfo2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(2, imageInfo2);
        }
        ImageInfo imageInfo3 = this.mini;
        return imageInfo3 != null ? computeSerializedSize + CodedOutputByteBufferNano.g(3, imageInfo3) : computeSerializedSize;
    }

    public CommentImage mergeFrom(a aVar) throws IOException {
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
            } else if (p == 26) {
                if (this.mini == null) {
                    this.mini = new ImageInfo();
                }
                imageInfo = this.mini;
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
        ImageInfo imageInfo3 = this.mini;
        if (imageInfo3 != null) {
            codedOutputByteBufferNano.w(3, imageInfo3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
