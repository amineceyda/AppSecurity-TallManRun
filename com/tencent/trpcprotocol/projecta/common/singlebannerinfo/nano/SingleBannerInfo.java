package com.tencent.trpcprotocol.projecta.common.singlebannerinfo.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.bannerimage.nano.BannerImage;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class SingleBannerInfo extends d {
    private static volatile SingleBannerInfo[] _emptyArray;
    public BannerImage banner;
    public String hashtagName;
    public String typeName;

    public SingleBannerInfo() {
        clear();
    }

    public static SingleBannerInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new SingleBannerInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static SingleBannerInfo parseFrom(a aVar) throws IOException {
        return new SingleBannerInfo().mergeFrom(aVar);
    }

    public static SingleBannerInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (SingleBannerInfo) d.mergeFrom(new SingleBannerInfo(), bArr);
    }

    public SingleBannerInfo clear() {
        this.typeName = "";
        this.banner = null;
        this.hashtagName = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.typeName.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.typeName);
        }
        BannerImage bannerImage = this.banner;
        if (bannerImage != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(2, bannerImage);
        }
        return !this.hashtagName.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(3, this.hashtagName) : computeSerializedSize;
    }

    public SingleBannerInfo mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.typeName = aVar.o();
            } else if (p == 18) {
                if (this.banner == null) {
                    this.banner = new BannerImage();
                }
                aVar.g(this.banner);
            } else if (p == 26) {
                this.hashtagName = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.typeName.equals("")) {
            codedOutputByteBufferNano.C(1, this.typeName);
        }
        BannerImage bannerImage = this.banner;
        if (bannerImage != null) {
            codedOutputByteBufferNano.w(2, bannerImage);
        }
        if (!this.hashtagName.equals("")) {
            codedOutputByteBufferNano.C(3, this.hashtagName);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
