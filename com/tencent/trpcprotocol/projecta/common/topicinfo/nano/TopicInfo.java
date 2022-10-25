package com.tencent.trpcprotocol.projecta.common.topicinfo.nano;

import com.google.android.gms.common.ConnectionResult;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.aiheadlineinfo.nano.AIHeadlineInfo;
import com.tencent.trpcprotocol.projecta.common.bannerimage.nano.BannerImage;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class TopicInfo extends d {
    private static volatile TopicInfo[] _emptyArray;
    public AIHeadlineInfo aiHeadlineInfo;
    public BannerImage banner;
    public String buttonCopywriting;
    public long commentTotal;
    public String createDate;
    public String description;
    public String exchangeCode;
    public String fontColor;
    public BannerImage icon;
    public String name;
    public String topicId;
    public String type;

    public TopicInfo() {
        clear();
    }

    public static TopicInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new TopicInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static TopicInfo parseFrom(a aVar) throws IOException {
        return new TopicInfo().mergeFrom(aVar);
    }

    public static TopicInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (TopicInfo) d.mergeFrom(new TopicInfo(), bArr);
    }

    public TopicInfo clear() {
        this.name = "";
        this.topicId = "";
        this.description = "";
        this.createDate = "";
        this.banner = null;
        this.commentTotal = 0;
        this.type = "";
        this.aiHeadlineInfo = null;
        this.icon = null;
        this.fontColor = "";
        this.buttonCopywriting = "";
        this.exchangeCode = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.name.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.name);
        }
        if (!this.topicId.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.topicId);
        }
        if (!this.description.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(3, this.description);
        }
        if (!this.createDate.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(4, this.createDate);
        }
        BannerImage bannerImage = this.banner;
        if (bannerImage != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(5, bannerImage);
        }
        long j2 = this.commentTotal;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(6, j2);
        }
        if (!this.type.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(7, this.type);
        }
        AIHeadlineInfo aIHeadlineInfo = this.aiHeadlineInfo;
        if (aIHeadlineInfo != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(8, aIHeadlineInfo);
        }
        BannerImage bannerImage2 = this.icon;
        if (bannerImage2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(9, bannerImage2);
        }
        if (!this.fontColor.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(10, this.fontColor);
        }
        if (!this.buttonCopywriting.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(11, this.buttonCopywriting);
        }
        return !this.exchangeCode.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(12, this.exchangeCode) : computeSerializedSize;
    }

    public TopicInfo mergeFrom(a aVar) throws IOException {
        d dVar;
        while (true) {
            int p = aVar.p();
            switch (p) {
                case 0:
                    return this;
                case 10:
                    this.name = aVar.o();
                    continue;
                case ConnectionResult.SERVICE_UPDATING:
                    this.topicId = aVar.o();
                    continue;
                case 26:
                    this.description = aVar.o();
                    continue;
                case 34:
                    this.createDate = aVar.o();
                    continue;
                case 42:
                    if (this.banner == null) {
                        this.banner = new BannerImage();
                    }
                    dVar = this.banner;
                    break;
                case 48:
                    this.commentTotal = aVar.n();
                    continue;
                case 58:
                    this.type = aVar.o();
                    continue;
                case 66:
                    if (this.aiHeadlineInfo == null) {
                        this.aiHeadlineInfo = new AIHeadlineInfo();
                    }
                    dVar = this.aiHeadlineInfo;
                    break;
                case 74:
                    if (this.icon == null) {
                        this.icon = new BannerImage();
                    }
                    dVar = this.icon;
                    break;
                case 82:
                    this.fontColor = aVar.o();
                    continue;
                case 90:
                    this.buttonCopywriting = aVar.o();
                    continue;
                case 98:
                    this.exchangeCode = aVar.o();
                    continue;
                default:
                    if (!aVar.s(p)) {
                        return this;
                    }
                    continue;
            }
            aVar.g(dVar);
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.name.equals("")) {
            codedOutputByteBufferNano.C(1, this.name);
        }
        if (!this.topicId.equals("")) {
            codedOutputByteBufferNano.C(2, this.topicId);
        }
        if (!this.description.equals("")) {
            codedOutputByteBufferNano.C(3, this.description);
        }
        if (!this.createDate.equals("")) {
            codedOutputByteBufferNano.C(4, this.createDate);
        }
        BannerImage bannerImage = this.banner;
        if (bannerImage != null) {
            codedOutputByteBufferNano.w(5, bannerImage);
        }
        long j2 = this.commentTotal;
        if (j2 != 0) {
            codedOutputByteBufferNano.v(6, j2);
        }
        if (!this.type.equals("")) {
            codedOutputByteBufferNano.C(7, this.type);
        }
        AIHeadlineInfo aIHeadlineInfo = this.aiHeadlineInfo;
        if (aIHeadlineInfo != null) {
            codedOutputByteBufferNano.w(8, aIHeadlineInfo);
        }
        BannerImage bannerImage2 = this.icon;
        if (bannerImage2 != null) {
            codedOutputByteBufferNano.w(9, bannerImage2);
        }
        if (!this.fontColor.equals("")) {
            codedOutputByteBufferNano.C(10, this.fontColor);
        }
        if (!this.buttonCopywriting.equals("")) {
            codedOutputByteBufferNano.C(11, this.buttonCopywriting);
        }
        if (!this.exchangeCode.equals("")) {
            codedOutputByteBufferNano.C(12, this.exchangeCode);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
