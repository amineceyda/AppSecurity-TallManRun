package com.tencent.trpcprotocol.projecta.common.cmsresponse.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.bannerimage.nano.BannerImage;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class TitleMoreInfo extends d {
    private static volatile TitleMoreInfo[] _emptyArray;
    public BannerImage icon;
    public String title;

    public TitleMoreInfo() {
        clear();
    }

    public static TitleMoreInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new TitleMoreInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static TitleMoreInfo parseFrom(a aVar) throws IOException {
        return new TitleMoreInfo().mergeFrom(aVar);
    }

    public static TitleMoreInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (TitleMoreInfo) d.mergeFrom(new TitleMoreInfo(), bArr);
    }

    public TitleMoreInfo clear() {
        this.title = "";
        this.icon = null;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.title.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.title);
        }
        BannerImage bannerImage = this.icon;
        return bannerImage != null ? computeSerializedSize + CodedOutputByteBufferNano.g(2, bannerImage) : computeSerializedSize;
    }

    public TitleMoreInfo mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.title = aVar.o();
            } else if (p == 18) {
                if (this.icon == null) {
                    this.icon = new BannerImage();
                }
                aVar.g(this.icon);
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.title.equals("")) {
            codedOutputByteBufferNano.C(1, this.title);
        }
        BannerImage bannerImage = this.icon;
        if (bannerImage != null) {
            codedOutputByteBufferNano.w(2, bannerImage);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
