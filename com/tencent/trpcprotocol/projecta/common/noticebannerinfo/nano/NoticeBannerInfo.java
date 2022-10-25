package com.tencent.trpcprotocol.projecta.common.noticebannerinfo.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.bannerimage.nano.BannerImage;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class NoticeBannerInfo extends d {
    private static volatile NoticeBannerInfo[] _emptyArray;
    public BannerImage banner;
    public String desc;
    public String tag;
    public String title;
    public String url;

    public NoticeBannerInfo() {
        clear();
    }

    public static NoticeBannerInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new NoticeBannerInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static NoticeBannerInfo parseFrom(a aVar) throws IOException {
        return new NoticeBannerInfo().mergeFrom(aVar);
    }

    public static NoticeBannerInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (NoticeBannerInfo) d.mergeFrom(new NoticeBannerInfo(), bArr);
    }

    public NoticeBannerInfo clear() {
        this.url = "";
        this.banner = null;
        this.desc = "";
        this.tag = "";
        this.title = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.url.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.url);
        }
        BannerImage bannerImage = this.banner;
        if (bannerImage != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(2, bannerImage);
        }
        if (!this.desc.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(3, this.desc);
        }
        if (!this.tag.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(4, this.tag);
        }
        return !this.title.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(5, this.title) : computeSerializedSize;
    }

    public NoticeBannerInfo mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.url = aVar.o();
            } else if (p == 18) {
                if (this.banner == null) {
                    this.banner = new BannerImage();
                }
                aVar.g(this.banner);
            } else if (p == 26) {
                this.desc = aVar.o();
            } else if (p == 34) {
                this.tag = aVar.o();
            } else if (p == 42) {
                this.title = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.url.equals("")) {
            codedOutputByteBufferNano.C(1, this.url);
        }
        BannerImage bannerImage = this.banner;
        if (bannerImage != null) {
            codedOutputByteBufferNano.w(2, bannerImage);
        }
        if (!this.desc.equals("")) {
            codedOutputByteBufferNano.C(3, this.desc);
        }
        if (!this.tag.equals("")) {
            codedOutputByteBufferNano.C(4, this.tag);
        }
        if (!this.title.equals("")) {
            codedOutputByteBufferNano.C(5, this.title);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
