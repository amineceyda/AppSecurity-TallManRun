package com.tencent.trpcprotocol.projecta.common.cmsresponse.nano;

import com.google.android.gms.common.ConnectionResult;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.beacon.event.open.EventResult;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import com.tencent.trpcprotocol.projecta.common.categoryinfo.nano.CategoryInfo;
import com.tencent.trpcprotocol.projecta.common.commentinfo.nano.CommentInfo;
import com.tencent.trpcprotocol.projecta.common.developerdetail.nano.DeveloperDetailInfo;
import com.tencent.trpcprotocol.projecta.common.hashtagdetail.nano.HashtagDetailInfo;
import com.tencent.trpcprotocol.projecta.common.noticebannerinfo.nano.NoticeBannerInfo;
import com.tencent.trpcprotocol.projecta.common.openconfig.nano.OpenConfig;
import com.tencent.trpcprotocol.projecta.common.singlebannerinfo.nano.SingleBannerInfo;
import com.tencent.trpcprotocol.projecta.common.tagdetail.nano.TagDetailInfo;
import com.tencent.trpcprotocol.projecta.common.topicinfo.nano.TopicInfo;
import com.tencent.trpcprotocol.projecta.common.userinfo.nano.UserInfo;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class CmsItemList extends d {
    private static volatile CmsItemList[] _emptyArray;
    public AppDetailInfo appInfo;
    public CategoryInfo categoryInfo;
    public CommentInfo commentInfo;
    public DeveloperDetailInfo developerInfo;
    public HashtagDetailInfo hashtagDetailInfo;
    public NoticeBannerInfo noticeBannerInfo;
    public OpenConfig openConfig;
    public SingleBannerInfo singleBannerInfo;
    public TagDetailInfo tagInfo;
    public TextInfo textInfo;
    public TitleMoreInfo titleMore;
    public TopicInfo topicInfo;
    public UserInfo userInfo;

    public CmsItemList() {
        clear();
    }

    public static CmsItemList[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new CmsItemList[0];
                }
            }
        }
        return _emptyArray;
    }

    public static CmsItemList parseFrom(a aVar) throws IOException {
        return new CmsItemList().mergeFrom(aVar);
    }

    public static CmsItemList parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (CmsItemList) d.mergeFrom(new CmsItemList(), bArr);
    }

    public CmsItemList clear() {
        this.openConfig = null;
        this.appInfo = null;
        this.topicInfo = null;
        this.titleMore = null;
        this.categoryInfo = null;
        this.textInfo = null;
        this.developerInfo = null;
        this.tagInfo = null;
        this.userInfo = null;
        this.commentInfo = null;
        this.hashtagDetailInfo = null;
        this.singleBannerInfo = null;
        this.noticeBannerInfo = null;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        OpenConfig openConfig2 = this.openConfig;
        if (openConfig2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(1, openConfig2);
        }
        AppDetailInfo appDetailInfo = this.appInfo;
        if (appDetailInfo != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(2, appDetailInfo);
        }
        TopicInfo topicInfo2 = this.topicInfo;
        if (topicInfo2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(3, topicInfo2);
        }
        TitleMoreInfo titleMoreInfo = this.titleMore;
        if (titleMoreInfo != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(4, titleMoreInfo);
        }
        CategoryInfo categoryInfo2 = this.categoryInfo;
        if (categoryInfo2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(5, categoryInfo2);
        }
        TextInfo textInfo2 = this.textInfo;
        if (textInfo2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(6, textInfo2);
        }
        DeveloperDetailInfo developerDetailInfo = this.developerInfo;
        if (developerDetailInfo != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(7, developerDetailInfo);
        }
        TagDetailInfo tagDetailInfo = this.tagInfo;
        if (tagDetailInfo != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(8, tagDetailInfo);
        }
        UserInfo userInfo2 = this.userInfo;
        if (userInfo2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(9, userInfo2);
        }
        CommentInfo commentInfo2 = this.commentInfo;
        if (commentInfo2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(10, commentInfo2);
        }
        HashtagDetailInfo hashtagDetailInfo2 = this.hashtagDetailInfo;
        if (hashtagDetailInfo2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(11, hashtagDetailInfo2);
        }
        SingleBannerInfo singleBannerInfo2 = this.singleBannerInfo;
        if (singleBannerInfo2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(12, singleBannerInfo2);
        }
        NoticeBannerInfo noticeBannerInfo2 = this.noticeBannerInfo;
        return noticeBannerInfo2 != null ? computeSerializedSize + CodedOutputByteBufferNano.g(13, noticeBannerInfo2) : computeSerializedSize;
    }

    public CmsItemList mergeFrom(a aVar) throws IOException {
        d dVar;
        while (true) {
            int p = aVar.p();
            switch (p) {
                case 0:
                    return this;
                case 10:
                    if (this.openConfig == null) {
                        this.openConfig = new OpenConfig();
                    }
                    dVar = this.openConfig;
                    break;
                case ConnectionResult.SERVICE_UPDATING:
                    if (this.appInfo == null) {
                        this.appInfo = new AppDetailInfo();
                    }
                    dVar = this.appInfo;
                    break;
                case 26:
                    if (this.topicInfo == null) {
                        this.topicInfo = new TopicInfo();
                    }
                    dVar = this.topicInfo;
                    break;
                case 34:
                    if (this.titleMore == null) {
                        this.titleMore = new TitleMoreInfo();
                    }
                    dVar = this.titleMore;
                    break;
                case 42:
                    if (this.categoryInfo == null) {
                        this.categoryInfo = new CategoryInfo();
                    }
                    dVar = this.categoryInfo;
                    break;
                case 50:
                    if (this.textInfo == null) {
                        this.textInfo = new TextInfo();
                    }
                    dVar = this.textInfo;
                    break;
                case 58:
                    if (this.developerInfo == null) {
                        this.developerInfo = new DeveloperDetailInfo();
                    }
                    dVar = this.developerInfo;
                    break;
                case 66:
                    if (this.tagInfo == null) {
                        this.tagInfo = new TagDetailInfo();
                    }
                    dVar = this.tagInfo;
                    break;
                case 74:
                    if (this.userInfo == null) {
                        this.userInfo = new UserInfo();
                    }
                    dVar = this.userInfo;
                    break;
                case 82:
                    if (this.commentInfo == null) {
                        this.commentInfo = new CommentInfo();
                    }
                    dVar = this.commentInfo;
                    break;
                case 90:
                    if (this.hashtagDetailInfo == null) {
                        this.hashtagDetailInfo = new HashtagDetailInfo();
                    }
                    dVar = this.hashtagDetailInfo;
                    break;
                case 98:
                    if (this.singleBannerInfo == null) {
                        this.singleBannerInfo = new SingleBannerInfo();
                    }
                    dVar = this.singleBannerInfo;
                    break;
                case EventResult.ERROR_CODE_NAME_NULL:
                    if (this.noticeBannerInfo == null) {
                        this.noticeBannerInfo = new NoticeBannerInfo();
                    }
                    dVar = this.noticeBannerInfo;
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
        OpenConfig openConfig2 = this.openConfig;
        if (openConfig2 != null) {
            codedOutputByteBufferNano.w(1, openConfig2);
        }
        AppDetailInfo appDetailInfo = this.appInfo;
        if (appDetailInfo != null) {
            codedOutputByteBufferNano.w(2, appDetailInfo);
        }
        TopicInfo topicInfo2 = this.topicInfo;
        if (topicInfo2 != null) {
            codedOutputByteBufferNano.w(3, topicInfo2);
        }
        TitleMoreInfo titleMoreInfo = this.titleMore;
        if (titleMoreInfo != null) {
            codedOutputByteBufferNano.w(4, titleMoreInfo);
        }
        CategoryInfo categoryInfo2 = this.categoryInfo;
        if (categoryInfo2 != null) {
            codedOutputByteBufferNano.w(5, categoryInfo2);
        }
        TextInfo textInfo2 = this.textInfo;
        if (textInfo2 != null) {
            codedOutputByteBufferNano.w(6, textInfo2);
        }
        DeveloperDetailInfo developerDetailInfo = this.developerInfo;
        if (developerDetailInfo != null) {
            codedOutputByteBufferNano.w(7, developerDetailInfo);
        }
        TagDetailInfo tagDetailInfo = this.tagInfo;
        if (tagDetailInfo != null) {
            codedOutputByteBufferNano.w(8, tagDetailInfo);
        }
        UserInfo userInfo2 = this.userInfo;
        if (userInfo2 != null) {
            codedOutputByteBufferNano.w(9, userInfo2);
        }
        CommentInfo commentInfo2 = this.commentInfo;
        if (commentInfo2 != null) {
            codedOutputByteBufferNano.w(10, commentInfo2);
        }
        HashtagDetailInfo hashtagDetailInfo2 = this.hashtagDetailInfo;
        if (hashtagDetailInfo2 != null) {
            codedOutputByteBufferNano.w(11, hashtagDetailInfo2);
        }
        SingleBannerInfo singleBannerInfo2 = this.singleBannerInfo;
        if (singleBannerInfo2 != null) {
            codedOutputByteBufferNano.w(12, singleBannerInfo2);
        }
        NoticeBannerInfo noticeBannerInfo2 = this.noticeBannerInfo;
        if (noticeBannerInfo2 != null) {
            codedOutputByteBufferNano.w(13, noticeBannerInfo2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
