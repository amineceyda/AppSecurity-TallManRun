package com.tencent.trpcprotocol.projecta.common.tube.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.commentimage.nano.CommentImage;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class TubeInfo extends d {
    private static volatile TubeInfo[] _emptyArray;
    public String id;
    public CommentImage imageInfo;
    public String lengthSeconds;
    public String platform;
    public String playUrl;
    public String title;

    public TubeInfo() {
        clear();
    }

    public static TubeInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new TubeInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static TubeInfo parseFrom(a aVar) throws IOException {
        return new TubeInfo().mergeFrom(aVar);
    }

    public static TubeInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (TubeInfo) d.mergeFrom(new TubeInfo(), bArr);
    }

    public TubeInfo clear() {
        this.id = "";
        this.title = "";
        this.imageInfo = null;
        this.lengthSeconds = "";
        this.platform = "";
        this.playUrl = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.id.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.id);
        }
        if (!this.title.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.title);
        }
        CommentImage commentImage = this.imageInfo;
        if (commentImage != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(3, commentImage);
        }
        if (!this.lengthSeconds.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(4, this.lengthSeconds);
        }
        if (!this.platform.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(5, this.platform);
        }
        return !this.playUrl.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(6, this.playUrl) : computeSerializedSize;
    }

    public TubeInfo mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.id = aVar.o();
            } else if (p == 18) {
                this.title = aVar.o();
            } else if (p == 26) {
                if (this.imageInfo == null) {
                    this.imageInfo = new CommentImage();
                }
                aVar.g(this.imageInfo);
            } else if (p == 34) {
                this.lengthSeconds = aVar.o();
            } else if (p == 42) {
                this.platform = aVar.o();
            } else if (p == 50) {
                this.playUrl = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.id.equals("")) {
            codedOutputByteBufferNano.C(1, this.id);
        }
        if (!this.title.equals("")) {
            codedOutputByteBufferNano.C(2, this.title);
        }
        CommentImage commentImage = this.imageInfo;
        if (commentImage != null) {
            codedOutputByteBufferNano.w(3, commentImage);
        }
        if (!this.lengthSeconds.equals("")) {
            codedOutputByteBufferNano.C(4, this.lengthSeconds);
        }
        if (!this.platform.equals("")) {
            codedOutputByteBufferNano.C(5, this.platform);
        }
        if (!this.playUrl.equals("")) {
            codedOutputByteBufferNano.C(6, this.playUrl);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
