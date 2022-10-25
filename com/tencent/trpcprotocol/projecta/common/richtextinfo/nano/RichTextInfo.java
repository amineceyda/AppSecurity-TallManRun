package com.tencent.trpcprotocol.projecta.common.richtextinfo.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import com.tencent.trpcprotocol.projecta.common.commentimage.nano.CommentImage;
import com.tencent.trpcprotocol.projecta.common.shareurlinfo.nano.ShareUrlInfo;
import com.tencent.trpcprotocol.projecta.common.tube.nano.TubeInfo;
import com.tencent.trpcprotocol.projecta.common.userinfo.nano.UserInfo;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class RichTextInfo extends d {
    private static volatile RichTextInfo[] _emptyArray;
    public AppDetailInfo apk;
    public AppDetailInfo app;
    public CommentImage image;
    public String msg;
    public ShareUrlInfo shareUrl;
    public String tripartitePlatform;
    public TubeInfo tube;
    public String type;
    public UserInfo user;

    public RichTextInfo() {
        clear();
    }

    public static RichTextInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new RichTextInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static RichTextInfo parseFrom(a aVar) throws IOException {
        return new RichTextInfo().mergeFrom(aVar);
    }

    public static RichTextInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (RichTextInfo) d.mergeFrom(new RichTextInfo(), bArr);
    }

    public RichTextInfo clear() {
        this.type = "";
        this.msg = "";
        this.image = null;
        this.tube = null;
        this.apk = null;
        this.app = null;
        this.user = null;
        this.tripartitePlatform = "";
        this.shareUrl = null;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.type.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.type);
        }
        if (!this.msg.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.msg);
        }
        CommentImage commentImage = this.image;
        if (commentImage != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(3, commentImage);
        }
        TubeInfo tubeInfo = this.tube;
        if (tubeInfo != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(4, tubeInfo);
        }
        AppDetailInfo appDetailInfo = this.apk;
        if (appDetailInfo != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(5, appDetailInfo);
        }
        AppDetailInfo appDetailInfo2 = this.app;
        if (appDetailInfo2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(6, appDetailInfo2);
        }
        UserInfo userInfo = this.user;
        if (userInfo != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(7, userInfo);
        }
        if (!this.tripartitePlatform.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(8, this.tripartitePlatform);
        }
        ShareUrlInfo shareUrlInfo = this.shareUrl;
        return shareUrlInfo != null ? computeSerializedSize + CodedOutputByteBufferNano.g(9, shareUrlInfo) : computeSerializedSize;
    }

    public RichTextInfo mergeFrom(a aVar) throws IOException {
        d dVar;
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.type = aVar.o();
            } else if (p != 18) {
                if (p == 26) {
                    if (this.image == null) {
                        this.image = new CommentImage();
                    }
                    dVar = this.image;
                } else if (p == 34) {
                    if (this.tube == null) {
                        this.tube = new TubeInfo();
                    }
                    dVar = this.tube;
                } else if (p == 42) {
                    if (this.apk == null) {
                        this.apk = new AppDetailInfo();
                    }
                    dVar = this.apk;
                } else if (p == 50) {
                    if (this.app == null) {
                        this.app = new AppDetailInfo();
                    }
                    dVar = this.app;
                } else if (p == 58) {
                    if (this.user == null) {
                        this.user = new UserInfo();
                    }
                    dVar = this.user;
                } else if (p == 66) {
                    this.tripartitePlatform = aVar.o();
                } else if (p == 74) {
                    if (this.shareUrl == null) {
                        this.shareUrl = new ShareUrlInfo();
                    }
                    dVar = this.shareUrl;
                } else if (!aVar.s(p)) {
                    return this;
                }
                aVar.g(dVar);
            } else {
                this.msg = aVar.o();
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.type.equals("")) {
            codedOutputByteBufferNano.C(1, this.type);
        }
        if (!this.msg.equals("")) {
            codedOutputByteBufferNano.C(2, this.msg);
        }
        CommentImage commentImage = this.image;
        if (commentImage != null) {
            codedOutputByteBufferNano.w(3, commentImage);
        }
        TubeInfo tubeInfo = this.tube;
        if (tubeInfo != null) {
            codedOutputByteBufferNano.w(4, tubeInfo);
        }
        AppDetailInfo appDetailInfo = this.apk;
        if (appDetailInfo != null) {
            codedOutputByteBufferNano.w(5, appDetailInfo);
        }
        AppDetailInfo appDetailInfo2 = this.app;
        if (appDetailInfo2 != null) {
            codedOutputByteBufferNano.w(6, appDetailInfo2);
        }
        UserInfo userInfo = this.user;
        if (userInfo != null) {
            codedOutputByteBufferNano.w(7, userInfo);
        }
        if (!this.tripartitePlatform.equals("")) {
            codedOutputByteBufferNano.C(8, this.tripartitePlatform);
        }
        ShareUrlInfo shareUrlInfo = this.shareUrl;
        if (shareUrlInfo != null) {
            codedOutputByteBufferNano.w(9, shareUrlInfo);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
