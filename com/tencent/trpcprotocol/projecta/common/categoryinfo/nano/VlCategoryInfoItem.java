package com.tencent.trpcprotocol.projecta.common.categoryinfo.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.openconfig.nano.OpenConfig;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class VlCategoryInfoItem extends d {
    private static volatile VlCategoryInfoItem[] _emptyArray;
    public OpenConfig openConfig;
    public CategoryInfo topicInfo;

    public VlCategoryInfoItem() {
        clear();
    }

    public static VlCategoryInfoItem[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new VlCategoryInfoItem[0];
                }
            }
        }
        return _emptyArray;
    }

    public static VlCategoryInfoItem parseFrom(a aVar) throws IOException {
        return new VlCategoryInfoItem().mergeFrom(aVar);
    }

    public static VlCategoryInfoItem parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (VlCategoryInfoItem) d.mergeFrom(new VlCategoryInfoItem(), bArr);
    }

    public VlCategoryInfoItem clear() {
        this.openConfig = null;
        this.topicInfo = null;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        OpenConfig openConfig2 = this.openConfig;
        if (openConfig2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(1, openConfig2);
        }
        CategoryInfo categoryInfo = this.topicInfo;
        return categoryInfo != null ? computeSerializedSize + CodedOutputByteBufferNano.g(2, categoryInfo) : computeSerializedSize;
    }

    public VlCategoryInfoItem mergeFrom(a aVar) throws IOException {
        d dVar;
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                if (this.openConfig == null) {
                    this.openConfig = new OpenConfig();
                }
                dVar = this.openConfig;
            } else if (p == 18) {
                if (this.topicInfo == null) {
                    this.topicInfo = new CategoryInfo();
                }
                dVar = this.topicInfo;
            } else if (!aVar.s(p)) {
                return this;
            }
            aVar.g(dVar);
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        OpenConfig openConfig2 = this.openConfig;
        if (openConfig2 != null) {
            codedOutputByteBufferNano.w(1, openConfig2);
        }
        CategoryInfo categoryInfo = this.topicInfo;
        if (categoryInfo != null) {
            codedOutputByteBufferNano.w(2, categoryInfo);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
