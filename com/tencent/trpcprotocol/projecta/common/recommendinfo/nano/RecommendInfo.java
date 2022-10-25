package com.tencent.trpcprotocol.projecta.common.recommendinfo.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.bannerimage.nano.BannerImage;
import com.tencent.trpcprotocol.projecta.common.userinfo.nano.UserInfo;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class RecommendInfo extends d {
    private static volatile RecommendInfo[] _emptyArray;
    public BannerImage banner;
    public String desc;
    public BannerImage icon;
    public UserInfo userInfo;

    public RecommendInfo() {
        clear();
    }

    public static RecommendInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new RecommendInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static RecommendInfo parseFrom(a aVar) throws IOException {
        return new RecommendInfo().mergeFrom(aVar);
    }

    public static RecommendInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (RecommendInfo) d.mergeFrom(new RecommendInfo(), bArr);
    }

    public RecommendInfo clear() {
        this.userInfo = null;
        this.desc = "";
        this.banner = null;
        this.icon = null;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        UserInfo userInfo2 = this.userInfo;
        if (userInfo2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(1, userInfo2);
        }
        if (!this.desc.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.desc);
        }
        BannerImage bannerImage = this.banner;
        if (bannerImage != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(3, bannerImage);
        }
        BannerImage bannerImage2 = this.icon;
        return bannerImage2 != null ? computeSerializedSize + CodedOutputByteBufferNano.g(4, bannerImage2) : computeSerializedSize;
    }

    public RecommendInfo mergeFrom(a aVar) throws IOException {
        d dVar;
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                if (this.userInfo == null) {
                    this.userInfo = new UserInfo();
                }
                dVar = this.userInfo;
            } else if (p == 18) {
                this.desc = aVar.o();
            } else if (p == 26) {
                if (this.banner == null) {
                    this.banner = new BannerImage();
                }
                dVar = this.banner;
            } else if (p == 34) {
                if (this.icon == null) {
                    this.icon = new BannerImage();
                }
                dVar = this.icon;
            } else if (!aVar.s(p)) {
                return this;
            }
            aVar.g(dVar);
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        UserInfo userInfo2 = this.userInfo;
        if (userInfo2 != null) {
            codedOutputByteBufferNano.w(1, userInfo2);
        }
        if (!this.desc.equals("")) {
            codedOutputByteBufferNano.C(2, this.desc);
        }
        BannerImage bannerImage = this.banner;
        if (bannerImage != null) {
            codedOutputByteBufferNano.w(3, bannerImage);
        }
        BannerImage bannerImage2 = this.icon;
        if (bannerImage2 != null) {
            codedOutputByteBufferNano.w(4, bannerImage2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
