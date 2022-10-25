package com.tencent.trpcprotocol.projecta.common.hashtagdetail.nano;

import com.google.android.gms.common.ConnectionResult;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.aiheadlineinfo.nano.AIHeadlineInfo;
import com.tencent.trpcprotocol.projecta.common.bannerimage.nano.BannerImage;
import com.tencent.trpcprotocol.projecta.common.openconfig.nano.OpenConfig;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class HashtagDetailInfo extends d {
    private static volatile HashtagDetailInfo[] _emptyArray;
    public AIHeadlineInfo aiHeadlineInfo;
    public String color;
    public String customDescription;
    public String description;
    public long followCount;
    public OpenConfig hashtagOpenConfig;
    public BannerImage icon;
    public String id;
    public boolean isFollow;
    public String name;
    public long postCount;
    public String type;

    public HashtagDetailInfo() {
        clear();
    }

    public static HashtagDetailInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new HashtagDetailInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static HashtagDetailInfo parseFrom(a aVar) throws IOException {
        return new HashtagDetailInfo().mergeFrom(aVar);
    }

    public static HashtagDetailInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (HashtagDetailInfo) d.mergeFrom(new HashtagDetailInfo(), bArr);
    }

    public HashtagDetailInfo clear() {
        this.id = "";
        this.name = "";
        this.type = "";
        this.isFollow = false;
        this.postCount = 0;
        this.hashtagOpenConfig = null;
        this.color = "";
        this.aiHeadlineInfo = null;
        this.followCount = 0;
        this.description = "";
        this.customDescription = "";
        this.icon = null;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.id.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.id);
        }
        if (!this.name.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.name);
        }
        if (!this.type.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(3, this.type);
        }
        boolean z = this.isFollow;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.a(4, z);
        }
        long j2 = this.postCount;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(5, j2);
        }
        OpenConfig openConfig = this.hashtagOpenConfig;
        if (openConfig != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(6, openConfig);
        }
        if (!this.color.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(7, this.color);
        }
        AIHeadlineInfo aIHeadlineInfo = this.aiHeadlineInfo;
        if (aIHeadlineInfo != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(8, aIHeadlineInfo);
        }
        long j3 = this.followCount;
        if (j3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(9, j3);
        }
        if (!this.description.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(10, this.description);
        }
        if (!this.customDescription.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(11, this.customDescription);
        }
        BannerImage bannerImage = this.icon;
        return bannerImage != null ? computeSerializedSize + CodedOutputByteBufferNano.g(12, bannerImage) : computeSerializedSize;
    }

    public HashtagDetailInfo mergeFrom(a aVar) throws IOException {
        d dVar;
        while (true) {
            int p = aVar.p();
            switch (p) {
                case 0:
                    return this;
                case 10:
                    this.id = aVar.o();
                    continue;
                case ConnectionResult.SERVICE_UPDATING:
                    this.name = aVar.o();
                    continue;
                case 26:
                    this.type = aVar.o();
                    continue;
                case 32:
                    this.isFollow = aVar.c();
                    continue;
                case 40:
                    this.postCount = aVar.n();
                    continue;
                case 50:
                    if (this.hashtagOpenConfig == null) {
                        this.hashtagOpenConfig = new OpenConfig();
                    }
                    dVar = this.hashtagOpenConfig;
                    break;
                case 58:
                    this.color = aVar.o();
                    continue;
                case 66:
                    if (this.aiHeadlineInfo == null) {
                        this.aiHeadlineInfo = new AIHeadlineInfo();
                    }
                    dVar = this.aiHeadlineInfo;
                    break;
                case 72:
                    this.followCount = aVar.n();
                    continue;
                case 82:
                    this.description = aVar.o();
                    continue;
                case 90:
                    this.customDescription = aVar.o();
                    continue;
                case 98:
                    if (this.icon == null) {
                        this.icon = new BannerImage();
                    }
                    dVar = this.icon;
                    break;
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
        if (!this.id.equals("")) {
            codedOutputByteBufferNano.C(1, this.id);
        }
        if (!this.name.equals("")) {
            codedOutputByteBufferNano.C(2, this.name);
        }
        if (!this.type.equals("")) {
            codedOutputByteBufferNano.C(3, this.type);
        }
        boolean z = this.isFollow;
        if (z) {
            codedOutputByteBufferNano.p(4, z);
        }
        long j2 = this.postCount;
        if (j2 != 0) {
            codedOutputByteBufferNano.v(5, j2);
        }
        OpenConfig openConfig = this.hashtagOpenConfig;
        if (openConfig != null) {
            codedOutputByteBufferNano.w(6, openConfig);
        }
        if (!this.color.equals("")) {
            codedOutputByteBufferNano.C(7, this.color);
        }
        AIHeadlineInfo aIHeadlineInfo = this.aiHeadlineInfo;
        if (aIHeadlineInfo != null) {
            codedOutputByteBufferNano.w(8, aIHeadlineInfo);
        }
        long j3 = this.followCount;
        if (j3 != 0) {
            codedOutputByteBufferNano.v(9, j3);
        }
        if (!this.description.equals("")) {
            codedOutputByteBufferNano.C(10, this.description);
        }
        if (!this.customDescription.equals("")) {
            codedOutputByteBufferNano.C(11, this.customDescription);
        }
        BannerImage bannerImage = this.icon;
        if (bannerImage != null) {
            codedOutputByteBufferNano.w(12, bannerImage);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
