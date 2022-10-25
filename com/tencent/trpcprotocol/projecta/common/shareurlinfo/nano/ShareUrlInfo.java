package com.tencent.trpcprotocol.projecta.common.shareurlinfo.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.commentimage.nano.CommentImage;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class ShareUrlInfo extends d {
    private static volatile ShareUrlInfo[] _emptyArray;
    public String description;
    public CommentImage image;
    public String siteName;
    public String title;
    public String url;

    public ShareUrlInfo() {
        clear();
    }

    public static ShareUrlInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new ShareUrlInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static ShareUrlInfo parseFrom(a aVar) throws IOException {
        return new ShareUrlInfo().mergeFrom(aVar);
    }

    public static ShareUrlInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (ShareUrlInfo) d.mergeFrom(new ShareUrlInfo(), bArr);
    }

    public ShareUrlInfo clear() {
        this.title = "";
        this.description = "";
        this.image = null;
        this.url = "";
        this.siteName = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.title.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.title);
        }
        if (!this.description.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.description);
        }
        CommentImage commentImage = this.image;
        if (commentImage != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(3, commentImage);
        }
        if (!this.url.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(4, this.url);
        }
        return !this.siteName.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(5, this.siteName) : computeSerializedSize;
    }

    public ShareUrlInfo mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.title = aVar.o();
            } else if (p == 18) {
                this.description = aVar.o();
            } else if (p == 26) {
                if (this.image == null) {
                    this.image = new CommentImage();
                }
                aVar.g(this.image);
            } else if (p == 34) {
                this.url = aVar.o();
            } else if (p == 42) {
                this.siteName = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.title.equals("")) {
            codedOutputByteBufferNano.C(1, this.title);
        }
        if (!this.description.equals("")) {
            codedOutputByteBufferNano.C(2, this.description);
        }
        CommentImage commentImage = this.image;
        if (commentImage != null) {
            codedOutputByteBufferNano.w(3, commentImage);
        }
        if (!this.url.equals("")) {
            codedOutputByteBufferNano.C(4, this.url);
        }
        if (!this.siteName.equals("")) {
            codedOutputByteBufferNano.C(5, this.siteName);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
