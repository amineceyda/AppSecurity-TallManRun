package com.tencent.trpcprotocol.projecta.common.categoryinfo.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.bannerimage.nano.BannerImage;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class CategoryInfo extends d {
    private static volatile CategoryInfo[] _emptyArray;
    public BannerImage icon;
    public String title;

    public CategoryInfo() {
        clear();
    }

    public static CategoryInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new CategoryInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static CategoryInfo parseFrom(a aVar) throws IOException {
        return new CategoryInfo().mergeFrom(aVar);
    }

    public static CategoryInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (CategoryInfo) d.mergeFrom(new CategoryInfo(), bArr);
    }

    public CategoryInfo clear() {
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

    public CategoryInfo mergeFrom(a aVar) throws IOException {
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
