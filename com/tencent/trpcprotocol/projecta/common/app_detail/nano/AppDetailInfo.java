package com.tencent.trpcprotocol.projecta.common.app_detail.nano;

import com.google.android.gms.common.ConnectionResult;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.beacon.event.open.EventResult;
import com.tencent.trpcprotocol.projecta.common.aiheadlineinfo.nano.AIHeadlineInfo;
import com.tencent.trpcprotocol.projecta.common.assetinfo.nano.AssetInfo;
import com.tencent.trpcprotocol.projecta.common.bannerimage.nano.BannerImage;
import com.tencent.trpcprotocol.projecta.common.openconfig.nano.OpenConfig;
import com.tencent.trpcprotocol.projecta.common.preregister.nano.PreRegister;
import com.tencent.trpcprotocol.projecta.common.recommendinfo.nano.RecommendInfo;
import com.tencent.trpcprotocol.projecta.common.tagdetail.nano.TagDetailInfo;
import com.tencent.trpcprotocol.projecta.common.tube.nano.TubeInfo;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import g.e.d.a.e;
import java.io.IOException;

public final class AppDetailInfo extends d {
    private static volatile AppDetailInfo[] _emptyArray;
    public AIHeadlineInfo aiHeadlineInfo;
    public String appAdRequestUrl;
    public long appId;
    public String appRecommendRequestUrl;
    public String appRecommendType;
    public AssetInfo asset;
    public String assetUsability;
    public BannerImage banner;
    public String categoryName;
    public double commentScore;
    public long commentScore1;
    public long commentScore2;
    public long commentScore3;
    public long commentScore4;
    public long commentScore5;
    public double commentScoreStars;
    public long commentScoreTotal;
    public long commentScoreTotalByLanguage;
    public long commentTotal;
    public String[] contentRating;
    public String createDate;
    public String description;
    public String descriptionShort;
    public String developer;
    public OpenConfig developerOpenConfig;
    public long developerUserId;
    public long downloadCount;
    public long followTotal;
    public boolean hasVersion;
    public BannerImage icon;
    public String iconUrl;
    public String inAppProducts;
    public String introduction;
    public boolean isAPKs;
    public boolean isAd;
    public boolean isAdSupported;
    public boolean isBeta;
    public boolean isCollect;
    public boolean isFollow;
    public boolean isFree;
    public boolean isOBB;
    public boolean isOffDownload;
    public boolean isOfficial;
    public boolean isPreRegister;
    public boolean isShowCommentScore;
    public boolean isShowGpIcon;
    public String label;
    public String[] nativeCode;
    public String offDownloadContent;
    public OpenConfig officialOpenConfig;
    public String openPosition;
    public String packageName;
    public String[] permissions;
    public PreRegister preRegisterInfo;
    public String price;
    public PriceInfo priceInfo;
    public RecommendInfo recommendInfo;
    public String recommendType;
    public String relateRequestUrl;
    public double reviewStars;
    public BannerImage[] screenshots;
    public String[] sign;
    public SourceConfig sourceConfig;
    public SourceInfo sourceInfo;
    public TagDetailInfo[] tags;
    public String title;
    public long topIndex;
    public Tracking[] tracking;
    public TubeInfo[] tubes;
    public String updateDate;
    public String versionCode;
    public String versionId;
    public String versionName;
    public OpenConfig versionOpenConfig;
    public String whatsnew;

    public AppDetailInfo() {
        clear();
    }

    public static AppDetailInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new AppDetailInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static AppDetailInfo parseFrom(a aVar) throws IOException {
        return new AppDetailInfo().mergeFrom(aVar);
    }

    public static AppDetailInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (AppDetailInfo) d.mergeFrom(new AppDetailInfo(), bArr);
    }

    public AppDetailInfo clear() {
        this.title = "";
        this.label = "";
        this.iconUrl = "";
        this.packageName = "";
        this.versionCode = "";
        this.versionName = "";
        String[] strArr = e.b;
        this.sign = strArr;
        this.reviewStars = 0.0d;
        this.description = "";
        this.descriptionShort = "";
        this.whatsnew = "";
        this.assetUsability = "";
        this.developer = "";
        this.developerOpenConfig = null;
        this.isShowCommentScore = false;
        this.commentScore1 = 0;
        this.commentScore2 = 0;
        this.commentScore3 = 0;
        this.commentScore4 = 0;
        this.commentScore5 = 0;
        this.commentTotal = 0;
        this.commentScoreTotal = 0;
        this.commentScoreStars = 0.0d;
        this.asset = null;
        this.screenshots = BannerImage.emptyArray();
        this.banner = null;
        this.icon = null;
        this.price = "";
        this.inAppProducts = "";
        this.introduction = "";
        this.categoryName = "";
        this.permissions = strArr;
        this.relateRequestUrl = "";
        this.isOffDownload = false;
        this.offDownloadContent = "";
        this.updateDate = "";
        this.createDate = "";
        this.isCollect = false;
        this.topIndex = 0;
        this.versionOpenConfig = null;
        this.followTotal = 0;
        this.isFollow = false;
        this.recommendInfo = null;
        this.recommendType = "";
        this.isFree = false;
        this.tags = TagDetailInfo.emptyArray();
        this.tubes = TubeInfo.emptyArray();
        this.isAdSupported = false;
        this.isOfficial = false;
        this.downloadCount = 0;
        this.appRecommendRequestUrl = "";
        this.isBeta = false;
        this.officialOpenConfig = null;
        this.isAd = false;
        this.isShowGpIcon = false;
        this.preRegisterInfo = null;
        this.isPreRegister = false;
        this.hasVersion = false;
        this.tracking = Tracking.emptyArray();
        this.commentScore = 0.0d;
        this.commentScoreTotalByLanguage = 0;
        this.developerUserId = 0;
        this.aiHeadlineInfo = null;
        this.openPosition = "";
        this.appRecommendType = "";
        this.contentRating = strArr;
        this.priceInfo = null;
        this.sourceInfo = null;
        this.appAdRequestUrl = "";
        this.isAPKs = false;
        this.isOBB = false;
        this.versionId = "";
        this.sourceConfig = null;
        this.appId = 0;
        this.nativeCode = strArr;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.title.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.title);
        }
        if (!this.label.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.label);
        }
        if (!this.iconUrl.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(3, this.iconUrl);
        }
        if (!this.packageName.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(4, this.packageName);
        }
        if (!this.versionCode.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(5, this.versionCode);
        }
        if (!this.versionName.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(6, this.versionName);
        }
        String[] strArr = this.sign;
        int i2 = 0;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.sign;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i3];
                if (str != null) {
                    i5++;
                    int o = CodedOutputByteBufferNano.o(str);
                    i4 += CodedOutputByteBufferNano.h(o) + o;
                }
                i3++;
            }
            computeSerializedSize = computeSerializedSize + i4 + (i5 * 1);
        }
        if (Double.doubleToLongBits(this.reviewStars) != Double.doubleToLongBits(0.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.b(8, this.reviewStars);
        }
        if (!this.description.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(9, this.description);
        }
        if (!this.descriptionShort.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(10, this.descriptionShort);
        }
        if (!this.whatsnew.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(11, this.whatsnew);
        }
        if (!this.assetUsability.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(12, this.assetUsability);
        }
        if (!this.developer.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(13, this.developer);
        }
        OpenConfig openConfig = this.developerOpenConfig;
        if (openConfig != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(14, openConfig);
        }
        boolean z = this.isShowCommentScore;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.a(15, z);
        }
        long j2 = this.commentScore1;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(16, j2);
        }
        long j3 = this.commentScore2;
        if (j3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(17, j3);
        }
        long j4 = this.commentScore3;
        if (j4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(18, j4);
        }
        long j5 = this.commentScore4;
        if (j5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(19, j5);
        }
        long j6 = this.commentScore5;
        if (j6 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(20, j6);
        }
        long j7 = this.commentTotal;
        if (j7 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(21, j7);
        }
        long j8 = this.commentScoreTotal;
        if (j8 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(22, j8);
        }
        if (Double.doubleToLongBits(this.commentScoreStars) != Double.doubleToLongBits(0.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.b(23, this.commentScoreStars);
        }
        AssetInfo assetInfo = this.asset;
        if (assetInfo != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(24, assetInfo);
        }
        BannerImage[] bannerImageArr = this.screenshots;
        if (bannerImageArr != null && bannerImageArr.length > 0) {
            int i6 = 0;
            while (true) {
                BannerImage[] bannerImageArr2 = this.screenshots;
                if (i6 >= bannerImageArr2.length) {
                    break;
                }
                BannerImage bannerImage = bannerImageArr2[i6];
                if (bannerImage != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(25, bannerImage);
                }
                i6++;
            }
        }
        BannerImage bannerImage2 = this.banner;
        if (bannerImage2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(26, bannerImage2);
        }
        BannerImage bannerImage3 = this.icon;
        if (bannerImage3 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(27, bannerImage3);
        }
        if (!this.price.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(28, this.price);
        }
        if (!this.inAppProducts.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(29, this.inAppProducts);
        }
        if (!this.introduction.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(30, this.introduction);
        }
        if (!this.categoryName.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(31, this.categoryName);
        }
        String[] strArr3 = this.permissions;
        if (strArr3 != null && strArr3.length > 0) {
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                String[] strArr4 = this.permissions;
                if (i7 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i7];
                if (str2 != null) {
                    i9++;
                    int o2 = CodedOutputByteBufferNano.o(str2);
                    i8 += CodedOutputByteBufferNano.h(o2) + o2;
                }
                i7++;
            }
            computeSerializedSize = computeSerializedSize + i8 + (i9 * 2);
        }
        if (!this.relateRequestUrl.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(33, this.relateRequestUrl);
        }
        boolean z2 = this.isOffDownload;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.a(34, z2);
        }
        if (!this.offDownloadContent.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(35, this.offDownloadContent);
        }
        if (!this.updateDate.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(36, this.updateDate);
        }
        if (!this.createDate.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(37, this.createDate);
        }
        boolean z3 = this.isCollect;
        if (z3) {
            computeSerializedSize += CodedOutputByteBufferNano.a(38, z3);
        }
        long j9 = this.topIndex;
        if (j9 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(39, j9);
        }
        OpenConfig openConfig2 = this.versionOpenConfig;
        if (openConfig2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(40, openConfig2);
        }
        long j10 = this.followTotal;
        if (j10 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(41, j10);
        }
        boolean z4 = this.isFollow;
        if (z4) {
            computeSerializedSize += CodedOutputByteBufferNano.a(42, z4);
        }
        RecommendInfo recommendInfo2 = this.recommendInfo;
        if (recommendInfo2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(43, recommendInfo2);
        }
        if (!this.recommendType.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(44, this.recommendType);
        }
        boolean z5 = this.isFree;
        if (z5) {
            computeSerializedSize += CodedOutputByteBufferNano.a(45, z5);
        }
        TagDetailInfo[] tagDetailInfoArr = this.tags;
        if (tagDetailInfoArr != null && tagDetailInfoArr.length > 0) {
            int i10 = 0;
            while (true) {
                TagDetailInfo[] tagDetailInfoArr2 = this.tags;
                if (i10 >= tagDetailInfoArr2.length) {
                    break;
                }
                TagDetailInfo tagDetailInfo = tagDetailInfoArr2[i10];
                if (tagDetailInfo != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(46, tagDetailInfo);
                }
                i10++;
            }
        }
        TubeInfo[] tubeInfoArr = this.tubes;
        if (tubeInfoArr != null && tubeInfoArr.length > 0) {
            int i11 = 0;
            while (true) {
                TubeInfo[] tubeInfoArr2 = this.tubes;
                if (i11 >= tubeInfoArr2.length) {
                    break;
                }
                TubeInfo tubeInfo = tubeInfoArr2[i11];
                if (tubeInfo != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(47, tubeInfo);
                }
                i11++;
            }
        }
        boolean z6 = this.isAdSupported;
        if (z6) {
            computeSerializedSize += CodedOutputByteBufferNano.a(48, z6);
        }
        boolean z7 = this.isOfficial;
        if (z7) {
            computeSerializedSize += CodedOutputByteBufferNano.a(49, z7);
        }
        long j11 = this.downloadCount;
        if (j11 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(50, j11);
        }
        if (!this.appRecommendRequestUrl.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(51, this.appRecommendRequestUrl);
        }
        boolean z8 = this.isBeta;
        if (z8) {
            computeSerializedSize += CodedOutputByteBufferNano.a(52, z8);
        }
        OpenConfig openConfig3 = this.officialOpenConfig;
        if (openConfig3 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(53, openConfig3);
        }
        boolean z9 = this.isAd;
        if (z9) {
            computeSerializedSize += CodedOutputByteBufferNano.a(54, z9);
        }
        boolean z10 = this.isShowGpIcon;
        if (z10) {
            computeSerializedSize += CodedOutputByteBufferNano.a(55, z10);
        }
        PreRegister preRegister = this.preRegisterInfo;
        if (preRegister != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(56, preRegister);
        }
        boolean z11 = this.isPreRegister;
        if (z11) {
            computeSerializedSize += CodedOutputByteBufferNano.a(57, z11);
        }
        boolean z12 = this.hasVersion;
        if (z12) {
            computeSerializedSize += CodedOutputByteBufferNano.a(58, z12);
        }
        Tracking[] trackingArr = this.tracking;
        if (trackingArr != null && trackingArr.length > 0) {
            int i12 = 0;
            while (true) {
                Tracking[] trackingArr2 = this.tracking;
                if (i12 >= trackingArr2.length) {
                    break;
                }
                Tracking tracking2 = trackingArr2[i12];
                if (tracking2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(59, tracking2);
                }
                i12++;
            }
        }
        if (Double.doubleToLongBits(this.commentScore) != Double.doubleToLongBits(0.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.b(60, this.commentScore);
        }
        long j12 = this.commentScoreTotalByLanguage;
        if (j12 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(61, j12);
        }
        long j13 = this.developerUserId;
        if (j13 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(62, j13);
        }
        AIHeadlineInfo aIHeadlineInfo = this.aiHeadlineInfo;
        if (aIHeadlineInfo != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(63, aIHeadlineInfo);
        }
        if (!this.openPosition.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(64, this.openPosition);
        }
        if (!this.appRecommendType.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(65, this.appRecommendType);
        }
        String[] strArr5 = this.contentRating;
        if (strArr5 != null && strArr5.length > 0) {
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                String[] strArr6 = this.contentRating;
                if (i13 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i13];
                if (str3 != null) {
                    i15++;
                    int o3 = CodedOutputByteBufferNano.o(str3);
                    i14 += CodedOutputByteBufferNano.h(o3) + o3;
                }
                i13++;
            }
            computeSerializedSize = computeSerializedSize + i14 + (i15 * 2);
        }
        PriceInfo priceInfo2 = this.priceInfo;
        if (priceInfo2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(67, priceInfo2);
        }
        SourceInfo sourceInfo2 = this.sourceInfo;
        if (sourceInfo2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(68, sourceInfo2);
        }
        if (!this.appAdRequestUrl.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(69, this.appAdRequestUrl);
        }
        boolean z13 = this.isAPKs;
        if (z13) {
            computeSerializedSize += CodedOutputByteBufferNano.a(70, z13);
        }
        boolean z14 = this.isOBB;
        if (z14) {
            computeSerializedSize += CodedOutputByteBufferNano.a(71, z14);
        }
        if (!this.versionId.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(72, this.versionId);
        }
        SourceConfig sourceConfig2 = this.sourceConfig;
        if (sourceConfig2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(73, sourceConfig2);
        }
        long j14 = this.appId;
        if (j14 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.l(74, j14);
        }
        String[] strArr7 = this.nativeCode;
        if (strArr7 == null || strArr7.length <= 0) {
            return computeSerializedSize;
        }
        int i16 = 0;
        int i17 = 0;
        while (true) {
            String[] strArr8 = this.nativeCode;
            if (i2 >= strArr8.length) {
                return computeSerializedSize + i16 + (i17 * 2);
            }
            String str4 = strArr8[i2];
            if (str4 != null) {
                i17++;
                int o4 = CodedOutputByteBufferNano.o(str4);
                i16 += CodedOutputByteBufferNano.h(o4) + o4;
            }
            i2++;
        }
    }

    public AppDetailInfo mergeFrom(a aVar) throws IOException {
        d dVar;
        while (true) {
            int p = aVar.p();
            switch (p) {
                case 0:
                    return this;
                case 10:
                    this.title = aVar.o();
                    continue;
                case ConnectionResult.SERVICE_UPDATING:
                    this.label = aVar.o();
                    continue;
                case 26:
                    this.iconUrl = aVar.o();
                    continue;
                case 34:
                    this.packageName = aVar.o();
                    continue;
                case 42:
                    this.versionCode = aVar.o();
                    continue;
                case 50:
                    this.versionName = aVar.o();
                    continue;
                case 58:
                    int a = e.a(aVar, 58);
                    String[] strArr = this.sign;
                    int length = strArr == null ? 0 : strArr.length;
                    int i2 = a + length;
                    String[] strArr2 = new String[i2];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        strArr2[length] = aVar.o();
                        aVar.p();
                        length++;
                    }
                    strArr2[length] = aVar.o();
                    this.sign = strArr2;
                    continue;
                case 65:
                    this.reviewStars = aVar.e();
                    continue;
                case 74:
                    this.description = aVar.o();
                    continue;
                case 82:
                    this.descriptionShort = aVar.o();
                    continue;
                case 90:
                    this.whatsnew = aVar.o();
                    continue;
                case 98:
                    this.assetUsability = aVar.o();
                    continue;
                case EventResult.ERROR_CODE_NAME_NULL:
                    this.developer = aVar.o();
                    continue;
                case 114:
                    if (this.developerOpenConfig == null) {
                        this.developerOpenConfig = new OpenConfig();
                    }
                    dVar = this.developerOpenConfig;
                    break;
                case 120:
                    this.isShowCommentScore = aVar.c();
                    continue;
                case 128:
                    this.commentScore1 = aVar.n();
                    continue;
                case 136:
                    this.commentScore2 = aVar.n();
                    continue;
                case 144:
                    this.commentScore3 = aVar.n();
                    continue;
                case 152:
                    this.commentScore4 = aVar.n();
                    continue;
                case 160:
                    this.commentScore5 = aVar.n();
                    continue;
                case 168:
                    this.commentTotal = aVar.n();
                    continue;
                case 176:
                    this.commentScoreTotal = aVar.n();
                    continue;
                case 185:
                    this.commentScoreStars = aVar.e();
                    continue;
                case 194:
                    if (this.asset == null) {
                        this.asset = new AssetInfo();
                    }
                    dVar = this.asset;
                    break;
                case 202:
                    int a2 = e.a(aVar, 202);
                    BannerImage[] bannerImageArr = this.screenshots;
                    int length2 = bannerImageArr == null ? 0 : bannerImageArr.length;
                    int i3 = a2 + length2;
                    BannerImage[] bannerImageArr2 = new BannerImage[i3];
                    if (length2 != 0) {
                        System.arraycopy(bannerImageArr, 0, bannerImageArr2, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        bannerImageArr2[length2] = new BannerImage();
                        aVar.g(bannerImageArr2[length2]);
                        aVar.p();
                        length2++;
                    }
                    bannerImageArr2[length2] = new BannerImage();
                    aVar.g(bannerImageArr2[length2]);
                    this.screenshots = bannerImageArr2;
                    continue;
                case 210:
                    if (this.banner == null) {
                        this.banner = new BannerImage();
                    }
                    dVar = this.banner;
                    break;
                case 218:
                    if (this.icon == null) {
                        this.icon = new BannerImage();
                    }
                    dVar = this.icon;
                    break;
                case 226:
                    this.price = aVar.o();
                    continue;
                case 234:
                    this.inAppProducts = aVar.o();
                    continue;
                case 242:
                    this.introduction = aVar.o();
                    continue;
                case 250:
                    this.categoryName = aVar.o();
                    continue;
                case 258:
                    int a3 = e.a(aVar, 258);
                    String[] strArr3 = this.permissions;
                    int length3 = strArr3 == null ? 0 : strArr3.length;
                    int i4 = a3 + length3;
                    String[] strArr4 = new String[i4];
                    if (length3 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length3);
                    }
                    while (length3 < i4 - 1) {
                        strArr4[length3] = aVar.o();
                        aVar.p();
                        length3++;
                    }
                    strArr4[length3] = aVar.o();
                    this.permissions = strArr4;
                    continue;
                case 266:
                    this.relateRequestUrl = aVar.o();
                    continue;
                case 272:
                    this.isOffDownload = aVar.c();
                    continue;
                case 282:
                    this.offDownloadContent = aVar.o();
                    continue;
                case 290:
                    this.updateDate = aVar.o();
                    continue;
                case 298:
                    this.createDate = aVar.o();
                    continue;
                case 304:
                    this.isCollect = aVar.c();
                    continue;
                case 312:
                    this.topIndex = aVar.n();
                    continue;
                case 322:
                    if (this.versionOpenConfig == null) {
                        this.versionOpenConfig = new OpenConfig();
                    }
                    dVar = this.versionOpenConfig;
                    break;
                case 328:
                    this.followTotal = aVar.n();
                    continue;
                case 336:
                    this.isFollow = aVar.c();
                    continue;
                case 346:
                    if (this.recommendInfo == null) {
                        this.recommendInfo = new RecommendInfo();
                    }
                    dVar = this.recommendInfo;
                    break;
                case 354:
                    this.recommendType = aVar.o();
                    continue;
                case 360:
                    this.isFree = aVar.c();
                    continue;
                case 370:
                    int a4 = e.a(aVar, 370);
                    TagDetailInfo[] tagDetailInfoArr = this.tags;
                    int length4 = tagDetailInfoArr == null ? 0 : tagDetailInfoArr.length;
                    int i5 = a4 + length4;
                    TagDetailInfo[] tagDetailInfoArr2 = new TagDetailInfo[i5];
                    if (length4 != 0) {
                        System.arraycopy(tagDetailInfoArr, 0, tagDetailInfoArr2, 0, length4);
                    }
                    while (length4 < i5 - 1) {
                        tagDetailInfoArr2[length4] = new TagDetailInfo();
                        aVar.g(tagDetailInfoArr2[length4]);
                        aVar.p();
                        length4++;
                    }
                    tagDetailInfoArr2[length4] = new TagDetailInfo();
                    aVar.g(tagDetailInfoArr2[length4]);
                    this.tags = tagDetailInfoArr2;
                    continue;
                case 378:
                    int a5 = e.a(aVar, 378);
                    TubeInfo[] tubeInfoArr = this.tubes;
                    int length5 = tubeInfoArr == null ? 0 : tubeInfoArr.length;
                    int i6 = a5 + length5;
                    TubeInfo[] tubeInfoArr2 = new TubeInfo[i6];
                    if (length5 != 0) {
                        System.arraycopy(tubeInfoArr, 0, tubeInfoArr2, 0, length5);
                    }
                    while (length5 < i6 - 1) {
                        tubeInfoArr2[length5] = new TubeInfo();
                        aVar.g(tubeInfoArr2[length5]);
                        aVar.p();
                        length5++;
                    }
                    tubeInfoArr2[length5] = new TubeInfo();
                    aVar.g(tubeInfoArr2[length5]);
                    this.tubes = tubeInfoArr2;
                    continue;
                case 384:
                    this.isAdSupported = aVar.c();
                    continue;
                case 392:
                    this.isOfficial = aVar.c();
                    continue;
                case 400:
                    this.downloadCount = aVar.n();
                    continue;
                case 410:
                    this.appRecommendRequestUrl = aVar.o();
                    continue;
                case 416:
                    this.isBeta = aVar.c();
                    continue;
                case 426:
                    if (this.officialOpenConfig == null) {
                        this.officialOpenConfig = new OpenConfig();
                    }
                    dVar = this.officialOpenConfig;
                    break;
                case 432:
                    this.isAd = aVar.c();
                    continue;
                case 440:
                    this.isShowGpIcon = aVar.c();
                    continue;
                case 450:
                    if (this.preRegisterInfo == null) {
                        this.preRegisterInfo = new PreRegister();
                    }
                    dVar = this.preRegisterInfo;
                    break;
                case 456:
                    this.isPreRegister = aVar.c();
                    continue;
                case 464:
                    this.hasVersion = aVar.c();
                    continue;
                case 474:
                    int a6 = e.a(aVar, 474);
                    Tracking[] trackingArr = this.tracking;
                    int length6 = trackingArr == null ? 0 : trackingArr.length;
                    int i7 = a6 + length6;
                    Tracking[] trackingArr2 = new Tracking[i7];
                    if (length6 != 0) {
                        System.arraycopy(trackingArr, 0, trackingArr2, 0, length6);
                    }
                    while (length6 < i7 - 1) {
                        trackingArr2[length6] = new Tracking();
                        aVar.g(trackingArr2[length6]);
                        aVar.p();
                        length6++;
                    }
                    trackingArr2[length6] = new Tracking();
                    aVar.g(trackingArr2[length6]);
                    this.tracking = trackingArr2;
                    continue;
                case 481:
                    this.commentScore = aVar.e();
                    continue;
                case 488:
                    this.commentScoreTotalByLanguage = aVar.n();
                    continue;
                case 496:
                    this.developerUserId = aVar.n();
                    continue;
                case 506:
                    if (this.aiHeadlineInfo == null) {
                        this.aiHeadlineInfo = new AIHeadlineInfo();
                    }
                    dVar = this.aiHeadlineInfo;
                    break;
                case 514:
                    this.openPosition = aVar.o();
                    continue;
                case 522:
                    this.appRecommendType = aVar.o();
                    continue;
                case 530:
                    int a7 = e.a(aVar, 530);
                    String[] strArr5 = this.contentRating;
                    int length7 = strArr5 == null ? 0 : strArr5.length;
                    int i8 = a7 + length7;
                    String[] strArr6 = new String[i8];
                    if (length7 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length7);
                    }
                    while (length7 < i8 - 1) {
                        strArr6[length7] = aVar.o();
                        aVar.p();
                        length7++;
                    }
                    strArr6[length7] = aVar.o();
                    this.contentRating = strArr6;
                    continue;
                case 538:
                    if (this.priceInfo == null) {
                        this.priceInfo = new PriceInfo();
                    }
                    dVar = this.priceInfo;
                    break;
                case 546:
                    if (this.sourceInfo == null) {
                        this.sourceInfo = new SourceInfo();
                    }
                    dVar = this.sourceInfo;
                    break;
                case 554:
                    this.appAdRequestUrl = aVar.o();
                    continue;
                case 560:
                    this.isAPKs = aVar.c();
                    continue;
                case 568:
                    this.isOBB = aVar.c();
                    continue;
                case 578:
                    this.versionId = aVar.o();
                    continue;
                case 586:
                    if (this.sourceConfig == null) {
                        this.sourceConfig = new SourceConfig();
                    }
                    dVar = this.sourceConfig;
                    break;
                case 592:
                    this.appId = aVar.n();
                    continue;
                case 602:
                    int a8 = e.a(aVar, 602);
                    String[] strArr7 = this.nativeCode;
                    int length8 = strArr7 == null ? 0 : strArr7.length;
                    int i9 = a8 + length8;
                    String[] strArr8 = new String[i9];
                    if (length8 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length8);
                    }
                    while (length8 < i9 - 1) {
                        strArr8[length8] = aVar.o();
                        aVar.p();
                        length8++;
                    }
                    strArr8[length8] = aVar.o();
                    this.nativeCode = strArr8;
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
        if (!this.title.equals("")) {
            codedOutputByteBufferNano.C(1, this.title);
        }
        if (!this.label.equals("")) {
            codedOutputByteBufferNano.C(2, this.label);
        }
        if (!this.iconUrl.equals("")) {
            codedOutputByteBufferNano.C(3, this.iconUrl);
        }
        if (!this.packageName.equals("")) {
            codedOutputByteBufferNano.C(4, this.packageName);
        }
        if (!this.versionCode.equals("")) {
            codedOutputByteBufferNano.C(5, this.versionCode);
        }
        if (!this.versionName.equals("")) {
            codedOutputByteBufferNano.C(6, this.versionName);
        }
        String[] strArr = this.sign;
        int i2 = 0;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.sign;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i3];
                if (str != null) {
                    codedOutputByteBufferNano.C(7, str);
                }
                i3++;
            }
        }
        if (Double.doubleToLongBits(this.reviewStars) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.r(8, this.reviewStars);
        }
        if (!this.description.equals("")) {
            codedOutputByteBufferNano.C(9, this.description);
        }
        if (!this.descriptionShort.equals("")) {
            codedOutputByteBufferNano.C(10, this.descriptionShort);
        }
        if (!this.whatsnew.equals("")) {
            codedOutputByteBufferNano.C(11, this.whatsnew);
        }
        if (!this.assetUsability.equals("")) {
            codedOutputByteBufferNano.C(12, this.assetUsability);
        }
        if (!this.developer.equals("")) {
            codedOutputByteBufferNano.C(13, this.developer);
        }
        OpenConfig openConfig = this.developerOpenConfig;
        if (openConfig != null) {
            codedOutputByteBufferNano.w(14, openConfig);
        }
        boolean z = this.isShowCommentScore;
        if (z) {
            codedOutputByteBufferNano.p(15, z);
        }
        long j2 = this.commentScore1;
        if (j2 != 0) {
            codedOutputByteBufferNano.v(16, j2);
        }
        long j3 = this.commentScore2;
        if (j3 != 0) {
            codedOutputByteBufferNano.v(17, j3);
        }
        long j4 = this.commentScore3;
        if (j4 != 0) {
            codedOutputByteBufferNano.v(18, j4);
        }
        long j5 = this.commentScore4;
        if (j5 != 0) {
            codedOutputByteBufferNano.v(19, j5);
        }
        long j6 = this.commentScore5;
        if (j6 != 0) {
            codedOutputByteBufferNano.v(20, j6);
        }
        long j7 = this.commentTotal;
        if (j7 != 0) {
            codedOutputByteBufferNano.v(21, j7);
        }
        long j8 = this.commentScoreTotal;
        if (j8 != 0) {
            codedOutputByteBufferNano.v(22, j8);
        }
        if (Double.doubleToLongBits(this.commentScoreStars) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.r(23, this.commentScoreStars);
        }
        AssetInfo assetInfo = this.asset;
        if (assetInfo != null) {
            codedOutputByteBufferNano.w(24, assetInfo);
        }
        BannerImage[] bannerImageArr = this.screenshots;
        if (bannerImageArr != null && bannerImageArr.length > 0) {
            int i4 = 0;
            while (true) {
                BannerImage[] bannerImageArr2 = this.screenshots;
                if (i4 >= bannerImageArr2.length) {
                    break;
                }
                BannerImage bannerImage = bannerImageArr2[i4];
                if (bannerImage != null) {
                    codedOutputByteBufferNano.w(25, bannerImage);
                }
                i4++;
            }
        }
        BannerImage bannerImage2 = this.banner;
        if (bannerImage2 != null) {
            codedOutputByteBufferNano.w(26, bannerImage2);
        }
        BannerImage bannerImage3 = this.icon;
        if (bannerImage3 != null) {
            codedOutputByteBufferNano.w(27, bannerImage3);
        }
        if (!this.price.equals("")) {
            codedOutputByteBufferNano.C(28, this.price);
        }
        if (!this.inAppProducts.equals("")) {
            codedOutputByteBufferNano.C(29, this.inAppProducts);
        }
        if (!this.introduction.equals("")) {
            codedOutputByteBufferNano.C(30, this.introduction);
        }
        if (!this.categoryName.equals("")) {
            codedOutputByteBufferNano.C(31, this.categoryName);
        }
        String[] strArr3 = this.permissions;
        if (strArr3 != null && strArr3.length > 0) {
            int i5 = 0;
            while (true) {
                String[] strArr4 = this.permissions;
                if (i5 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i5];
                if (str2 != null) {
                    codedOutputByteBufferNano.C(32, str2);
                }
                i5++;
            }
        }
        if (!this.relateRequestUrl.equals("")) {
            codedOutputByteBufferNano.C(33, this.relateRequestUrl);
        }
        boolean z2 = this.isOffDownload;
        if (z2) {
            codedOutputByteBufferNano.p(34, z2);
        }
        if (!this.offDownloadContent.equals("")) {
            codedOutputByteBufferNano.C(35, this.offDownloadContent);
        }
        if (!this.updateDate.equals("")) {
            codedOutputByteBufferNano.C(36, this.updateDate);
        }
        if (!this.createDate.equals("")) {
            codedOutputByteBufferNano.C(37, this.createDate);
        }
        boolean z3 = this.isCollect;
        if (z3) {
            codedOutputByteBufferNano.p(38, z3);
        }
        long j9 = this.topIndex;
        if (j9 != 0) {
            codedOutputByteBufferNano.v(39, j9);
        }
        OpenConfig openConfig2 = this.versionOpenConfig;
        if (openConfig2 != null) {
            codedOutputByteBufferNano.w(40, openConfig2);
        }
        long j10 = this.followTotal;
        if (j10 != 0) {
            codedOutputByteBufferNano.v(41, j10);
        }
        boolean z4 = this.isFollow;
        if (z4) {
            codedOutputByteBufferNano.p(42, z4);
        }
        RecommendInfo recommendInfo2 = this.recommendInfo;
        if (recommendInfo2 != null) {
            codedOutputByteBufferNano.w(43, recommendInfo2);
        }
        if (!this.recommendType.equals("")) {
            codedOutputByteBufferNano.C(44, this.recommendType);
        }
        boolean z5 = this.isFree;
        if (z5) {
            codedOutputByteBufferNano.p(45, z5);
        }
        TagDetailInfo[] tagDetailInfoArr = this.tags;
        if (tagDetailInfoArr != null && tagDetailInfoArr.length > 0) {
            int i6 = 0;
            while (true) {
                TagDetailInfo[] tagDetailInfoArr2 = this.tags;
                if (i6 >= tagDetailInfoArr2.length) {
                    break;
                }
                TagDetailInfo tagDetailInfo = tagDetailInfoArr2[i6];
                if (tagDetailInfo != null) {
                    codedOutputByteBufferNano.w(46, tagDetailInfo);
                }
                i6++;
            }
        }
        TubeInfo[] tubeInfoArr = this.tubes;
        if (tubeInfoArr != null && tubeInfoArr.length > 0) {
            int i7 = 0;
            while (true) {
                TubeInfo[] tubeInfoArr2 = this.tubes;
                if (i7 >= tubeInfoArr2.length) {
                    break;
                }
                TubeInfo tubeInfo = tubeInfoArr2[i7];
                if (tubeInfo != null) {
                    codedOutputByteBufferNano.w(47, tubeInfo);
                }
                i7++;
            }
        }
        boolean z6 = this.isAdSupported;
        if (z6) {
            codedOutputByteBufferNano.p(48, z6);
        }
        boolean z7 = this.isOfficial;
        if (z7) {
            codedOutputByteBufferNano.p(49, z7);
        }
        long j11 = this.downloadCount;
        if (j11 != 0) {
            codedOutputByteBufferNano.v(50, j11);
        }
        if (!this.appRecommendRequestUrl.equals("")) {
            codedOutputByteBufferNano.C(51, this.appRecommendRequestUrl);
        }
        boolean z8 = this.isBeta;
        if (z8) {
            codedOutputByteBufferNano.p(52, z8);
        }
        OpenConfig openConfig3 = this.officialOpenConfig;
        if (openConfig3 != null) {
            codedOutputByteBufferNano.w(53, openConfig3);
        }
        boolean z9 = this.isAd;
        if (z9) {
            codedOutputByteBufferNano.p(54, z9);
        }
        boolean z10 = this.isShowGpIcon;
        if (z10) {
            codedOutputByteBufferNano.p(55, z10);
        }
        PreRegister preRegister = this.preRegisterInfo;
        if (preRegister != null) {
            codedOutputByteBufferNano.w(56, preRegister);
        }
        boolean z11 = this.isPreRegister;
        if (z11) {
            codedOutputByteBufferNano.p(57, z11);
        }
        boolean z12 = this.hasVersion;
        if (z12) {
            codedOutputByteBufferNano.p(58, z12);
        }
        Tracking[] trackingArr = this.tracking;
        if (trackingArr != null && trackingArr.length > 0) {
            int i8 = 0;
            while (true) {
                Tracking[] trackingArr2 = this.tracking;
                if (i8 >= trackingArr2.length) {
                    break;
                }
                Tracking tracking2 = trackingArr2[i8];
                if (tracking2 != null) {
                    codedOutputByteBufferNano.w(59, tracking2);
                }
                i8++;
            }
        }
        if (Double.doubleToLongBits(this.commentScore) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.r(60, this.commentScore);
        }
        long j12 = this.commentScoreTotalByLanguage;
        if (j12 != 0) {
            codedOutputByteBufferNano.v(61, j12);
        }
        long j13 = this.developerUserId;
        if (j13 != 0) {
            codedOutputByteBufferNano.v(62, j13);
        }
        AIHeadlineInfo aIHeadlineInfo = this.aiHeadlineInfo;
        if (aIHeadlineInfo != null) {
            codedOutputByteBufferNano.w(63, aIHeadlineInfo);
        }
        if (!this.openPosition.equals("")) {
            codedOutputByteBufferNano.C(64, this.openPosition);
        }
        if (!this.appRecommendType.equals("")) {
            codedOutputByteBufferNano.C(65, this.appRecommendType);
        }
        String[] strArr5 = this.contentRating;
        if (strArr5 != null && strArr5.length > 0) {
            int i9 = 0;
            while (true) {
                String[] strArr6 = this.contentRating;
                if (i9 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i9];
                if (str3 != null) {
                    codedOutputByteBufferNano.C(66, str3);
                }
                i9++;
            }
        }
        PriceInfo priceInfo2 = this.priceInfo;
        if (priceInfo2 != null) {
            codedOutputByteBufferNano.w(67, priceInfo2);
        }
        SourceInfo sourceInfo2 = this.sourceInfo;
        if (sourceInfo2 != null) {
            codedOutputByteBufferNano.w(68, sourceInfo2);
        }
        if (!this.appAdRequestUrl.equals("")) {
            codedOutputByteBufferNano.C(69, this.appAdRequestUrl);
        }
        boolean z13 = this.isAPKs;
        if (z13) {
            codedOutputByteBufferNano.p(70, z13);
        }
        boolean z14 = this.isOBB;
        if (z14) {
            codedOutputByteBufferNano.p(71, z14);
        }
        if (!this.versionId.equals("")) {
            codedOutputByteBufferNano.C(72, this.versionId);
        }
        SourceConfig sourceConfig2 = this.sourceConfig;
        if (sourceConfig2 != null) {
            codedOutputByteBufferNano.w(73, sourceConfig2);
        }
        long j14 = this.appId;
        if (j14 != 0) {
            codedOutputByteBufferNano.D(74, j14);
        }
        String[] strArr7 = this.nativeCode;
        if (strArr7 != null && strArr7.length > 0) {
            while (true) {
                String[] strArr8 = this.nativeCode;
                if (i2 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i2];
                if (str4 != null) {
                    codedOutputByteBufferNano.C(75, str4);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
