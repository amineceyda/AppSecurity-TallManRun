package com.tencent.trpcprotocol.projecta.common.topicinfo.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.openconfig.nano.OpenConfig;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class VlTopicInfoItem extends d {
    private static volatile VlTopicInfoItem[] _emptyArray;
    public OpenConfig openConfig;
    public TopicInfo topicInfo;

    public VlTopicInfoItem() {
        clear();
    }

    public static VlTopicInfoItem[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new VlTopicInfoItem[0];
                }
            }
        }
        return _emptyArray;
    }

    public static VlTopicInfoItem parseFrom(a aVar) throws IOException {
        return new VlTopicInfoItem().mergeFrom(aVar);
    }

    public static VlTopicInfoItem parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (VlTopicInfoItem) d.mergeFrom(new VlTopicInfoItem(), bArr);
    }

    public VlTopicInfoItem clear() {
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
        TopicInfo topicInfo2 = this.topicInfo;
        return topicInfo2 != null ? computeSerializedSize + CodedOutputByteBufferNano.g(2, topicInfo2) : computeSerializedSize;
    }

    public VlTopicInfoItem mergeFrom(a aVar) throws IOException {
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
                    this.topicInfo = new TopicInfo();
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
        TopicInfo topicInfo2 = this.topicInfo;
        if (topicInfo2 != null) {
            codedOutputByteBufferNano.w(2, topicInfo2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
