package com.tencent.trpcprotocol.projecta.common.commentinfo.nano;

import com.google.android.gms.common.ConnectionResult;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.beacon.event.open.EventResult;
import com.tencent.trpcprotocol.projecta.common.aiheadlineinfo.nano.AIHeadlineInfo;
import com.tencent.trpcprotocol.projecta.common.commentimage.nano.CommentImage;
import com.tencent.trpcprotocol.projecta.common.referinfo.nano.ReferInfo;
import com.tencent.trpcprotocol.projecta.common.richtextinfo.nano.RichTextInfo;
import com.tencent.trpcprotocol.projecta.common.userinfo.nano.UserInfo;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import g.e.d.a.e;
import java.io.IOException;

public final class CommentInfo extends d {
    private static volatile CommentInfo[] _emptyArray;
    public AIHeadlineInfo aiHeadlineInfo;
    public UserInfo author;
    public CommentInfo[] children;
    public String createDate;
    public String createdAt;
    public String descriptionShort;
    public String[] hashtags;
    public String html;
    public long id;
    public boolean ifCanVote;
    public CommentImage[] images;
    public long invit;
    public boolean isCollect;
    public boolean isDeveloper;
    public boolean isFold;
    public boolean isLog;
    public boolean isPoster;
    public boolean isPromotion;
    public boolean isShowVote;
    public boolean isSpam;
    public boolean isSticky;
    public String msg;
    public String packageName;
    public long[] parent;
    public ReferInfo[] refersInfo;
    public CommentInfo replyTo;
    public RichTextInfo[] richText;
    public long score;
    public long supportLen;
    public boolean textShowMore;
    public String title;
    public CommentImage titleImage;
    public String topicId;
    public long total;
    public String type;
    public String updateAt;
    public String userSourceName;
    public String voteStatus;

    public CommentInfo() {
        clear();
    }

    public static CommentInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new CommentInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static CommentInfo parseFrom(a aVar) throws IOException {
        return new CommentInfo().mergeFrom(aVar);
    }

    public static CommentInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (CommentInfo) d.mergeFrom(new CommentInfo(), bArr);
    }

    public CommentInfo clear() {
        this.id = 0;
        this.invit = 0;
        this.score = 0;
        this.total = 0;
        this.supportLen = 0;
        this.voteStatus = "";
        this.createdAt = "";
        this.msg = "";
        this.userSourceName = "";
        this.title = "";
        this.author = null;
        this.replyTo = null;
        this.images = CommentImage.emptyArray();
        this.richText = RichTextInfo.emptyArray();
        this.children = emptyArray();
        this.parent = e.a;
        this.updateAt = "";
        this.isShowVote = false;
        this.ifCanVote = false;
        this.html = "";
        this.isFold = false;
        this.isCollect = false;
        this.createDate = "";
        this.isLog = false;
        this.aiHeadlineInfo = null;
        this.type = "";
        this.titleImage = null;
        this.isDeveloper = false;
        this.isPoster = false;
        this.packageName = "";
        this.topicId = "";
        this.hashtags = e.b;
        this.textShowMore = false;
        this.descriptionShort = "";
        this.refersInfo = ReferInfo.emptyArray();
        this.isSticky = false;
        this.isSpam = false;
        this.isPromotion = false;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        long[] jArr;
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.id;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(1, j2);
        }
        long j3 = this.invit;
        if (j3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(2, j3);
        }
        long j4 = this.score;
        if (j4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(3, j4);
        }
        long j5 = this.total;
        if (j5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(4, j5);
        }
        long j6 = this.supportLen;
        if (j6 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(5, j6);
        }
        if (!this.voteStatus.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(6, this.voteStatus);
        }
        if (!this.createdAt.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(7, this.createdAt);
        }
        if (!this.msg.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(8, this.msg);
        }
        if (!this.userSourceName.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(9, this.userSourceName);
        }
        if (!this.title.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(10, this.title);
        }
        UserInfo userInfo = this.author;
        if (userInfo != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(11, userInfo);
        }
        CommentInfo commentInfo = this.replyTo;
        if (commentInfo != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(12, commentInfo);
        }
        CommentImage[] commentImageArr = this.images;
        int i2 = 0;
        if (commentImageArr != null && commentImageArr.length > 0) {
            int i3 = 0;
            while (true) {
                CommentImage[] commentImageArr2 = this.images;
                if (i3 >= commentImageArr2.length) {
                    break;
                }
                CommentImage commentImage = commentImageArr2[i3];
                if (commentImage != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.g(13, commentImage) + computeSerializedSize;
                }
                i3++;
            }
        }
        RichTextInfo[] richTextInfoArr = this.richText;
        if (richTextInfoArr != null && richTextInfoArr.length > 0) {
            int i4 = 0;
            while (true) {
                RichTextInfo[] richTextInfoArr2 = this.richText;
                if (i4 >= richTextInfoArr2.length) {
                    break;
                }
                RichTextInfo richTextInfo = richTextInfoArr2[i4];
                if (richTextInfo != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.g(14, richTextInfo) + computeSerializedSize;
                }
                i4++;
            }
        }
        CommentInfo[] commentInfoArr = this.children;
        if (commentInfoArr != null && commentInfoArr.length > 0) {
            int i5 = 0;
            while (true) {
                CommentInfo[] commentInfoArr2 = this.children;
                if (i5 >= commentInfoArr2.length) {
                    break;
                }
                CommentInfo commentInfo2 = commentInfoArr2[i5];
                if (commentInfo2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(15, commentInfo2);
                }
                i5++;
            }
        }
        long[] jArr2 = this.parent;
        if (jArr2 != null && jArr2.length > 0) {
            int i6 = 0;
            int i7 = 0;
            while (true) {
                jArr = this.parent;
                if (i6 >= jArr.length) {
                    break;
                }
                i7 += CodedOutputByteBufferNano.i(jArr[i6]);
                i6++;
            }
            computeSerializedSize = computeSerializedSize + i7 + (jArr.length * 2);
        }
        if (!this.updateAt.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(17, this.updateAt);
        }
        boolean z = this.isShowVote;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.a(18, z);
        }
        boolean z2 = this.ifCanVote;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.a(19, z2);
        }
        if (!this.html.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(20, this.html);
        }
        boolean z3 = this.isFold;
        if (z3) {
            computeSerializedSize += CodedOutputByteBufferNano.a(21, z3);
        }
        boolean z4 = this.isCollect;
        if (z4) {
            computeSerializedSize += CodedOutputByteBufferNano.a(22, z4);
        }
        if (!this.createDate.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(23, this.createDate);
        }
        boolean z5 = this.isLog;
        if (z5) {
            computeSerializedSize += CodedOutputByteBufferNano.a(24, z5);
        }
        AIHeadlineInfo aIHeadlineInfo = this.aiHeadlineInfo;
        if (aIHeadlineInfo != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(25, aIHeadlineInfo);
        }
        if (!this.type.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(26, this.type);
        }
        CommentImage commentImage2 = this.titleImage;
        if (commentImage2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(27, commentImage2);
        }
        boolean z6 = this.isDeveloper;
        if (z6) {
            computeSerializedSize += CodedOutputByteBufferNano.a(28, z6);
        }
        boolean z7 = this.isPoster;
        if (z7) {
            computeSerializedSize += CodedOutputByteBufferNano.a(29, z7);
        }
        if (!this.packageName.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(30, this.packageName);
        }
        if (!this.topicId.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(31, this.topicId);
        }
        String[] strArr = this.hashtags;
        if (strArr != null && strArr.length > 0) {
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                String[] strArr2 = this.hashtags;
                if (i8 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i8];
                if (str != null) {
                    i10++;
                    int o = CodedOutputByteBufferNano.o(str);
                    i9 += CodedOutputByteBufferNano.h(o) + o;
                }
                i8++;
            }
            computeSerializedSize = computeSerializedSize + i9 + (i10 * 2);
        }
        boolean z8 = this.textShowMore;
        if (z8) {
            computeSerializedSize += CodedOutputByteBufferNano.a(33, z8);
        }
        if (!this.descriptionShort.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(34, this.descriptionShort);
        }
        ReferInfo[] referInfoArr = this.refersInfo;
        if (referInfoArr != null && referInfoArr.length > 0) {
            while (true) {
                ReferInfo[] referInfoArr2 = this.refersInfo;
                if (i2 >= referInfoArr2.length) {
                    break;
                }
                ReferInfo referInfo = referInfoArr2[i2];
                if (referInfo != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(35, referInfo);
                }
                i2++;
            }
        }
        boolean z9 = this.isSticky;
        if (z9) {
            computeSerializedSize += CodedOutputByteBufferNano.a(36, z9);
        }
        boolean z10 = this.isSpam;
        if (z10) {
            computeSerializedSize += CodedOutputByteBufferNano.a(37, z10);
        }
        boolean z11 = this.isPromotion;
        return z11 ? computeSerializedSize + CodedOutputByteBufferNano.a(38, z11) : computeSerializedSize;
    }

    public CommentInfo mergeFrom(a aVar) throws IOException {
        d dVar;
        while (true) {
            int p = aVar.p();
            switch (p) {
                case 0:
                    return this;
                case 8:
                    this.id = aVar.n();
                    continue;
                case ConnectionResult.API_UNAVAILABLE:
                    this.invit = aVar.n();
                    continue;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION:
                    this.score = aVar.n();
                    continue;
                case 32:
                    this.total = aVar.n();
                    continue;
                case 40:
                    this.supportLen = aVar.n();
                    continue;
                case 50:
                    this.voteStatus = aVar.o();
                    continue;
                case 58:
                    this.createdAt = aVar.o();
                    continue;
                case 66:
                    this.msg = aVar.o();
                    continue;
                case 74:
                    this.userSourceName = aVar.o();
                    continue;
                case 82:
                    this.title = aVar.o();
                    continue;
                case 90:
                    if (this.author == null) {
                        this.author = new UserInfo();
                    }
                    dVar = this.author;
                    break;
                case 98:
                    if (this.replyTo == null) {
                        this.replyTo = new CommentInfo();
                    }
                    dVar = this.replyTo;
                    break;
                case EventResult.ERROR_CODE_NAME_NULL:
                    int a = e.a(aVar, EventResult.ERROR_CODE_NAME_NULL);
                    CommentImage[] commentImageArr = this.images;
                    int length = commentImageArr == null ? 0 : commentImageArr.length;
                    int i2 = a + length;
                    CommentImage[] commentImageArr2 = new CommentImage[i2];
                    if (length != 0) {
                        System.arraycopy(commentImageArr, 0, commentImageArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        commentImageArr2[length] = new CommentImage();
                        aVar.g(commentImageArr2[length]);
                        aVar.p();
                        length++;
                    }
                    commentImageArr2[length] = new CommentImage();
                    aVar.g(commentImageArr2[length]);
                    this.images = commentImageArr2;
                    continue;
                case 114:
                    int a2 = e.a(aVar, 114);
                    RichTextInfo[] richTextInfoArr = this.richText;
                    int length2 = richTextInfoArr == null ? 0 : richTextInfoArr.length;
                    int i3 = a2 + length2;
                    RichTextInfo[] richTextInfoArr2 = new RichTextInfo[i3];
                    if (length2 != 0) {
                        System.arraycopy(richTextInfoArr, 0, richTextInfoArr2, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        richTextInfoArr2[length2] = new RichTextInfo();
                        aVar.g(richTextInfoArr2[length2]);
                        aVar.p();
                        length2++;
                    }
                    richTextInfoArr2[length2] = new RichTextInfo();
                    aVar.g(richTextInfoArr2[length2]);
                    this.richText = richTextInfoArr2;
                    continue;
                case 122:
                    int a3 = e.a(aVar, 122);
                    CommentInfo[] commentInfoArr = this.children;
                    int length3 = commentInfoArr == null ? 0 : commentInfoArr.length;
                    int i4 = a3 + length3;
                    CommentInfo[] commentInfoArr2 = new CommentInfo[i4];
                    if (length3 != 0) {
                        System.arraycopy(commentInfoArr, 0, commentInfoArr2, 0, length3);
                    }
                    while (length3 < i4 - 1) {
                        commentInfoArr2[length3] = new CommentInfo();
                        aVar.g(commentInfoArr2[length3]);
                        aVar.p();
                        length3++;
                    }
                    commentInfoArr2[length3] = new CommentInfo();
                    aVar.g(commentInfoArr2[length3]);
                    this.children = commentInfoArr2;
                    continue;
                case 128:
                    int a4 = e.a(aVar, 128);
                    long[] jArr = this.parent;
                    int length4 = jArr == null ? 0 : jArr.length;
                    int i5 = a4 + length4;
                    long[] jArr2 = new long[i5];
                    if (length4 != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length4);
                    }
                    while (length4 < i5 - 1) {
                        jArr2[length4] = aVar.n();
                        aVar.p();
                        length4++;
                    }
                    jArr2[length4] = aVar.n();
                    this.parent = jArr2;
                    continue;
                case 130:
                    int b = aVar.b(aVar.m());
                    int i6 = aVar.f3819e - aVar.b;
                    int i7 = 0;
                    while (true) {
                        int i8 = aVar.f3821g;
                        if ((i8 == Integer.MAX_VALUE ? -1 : i8 - aVar.f3819e) > 0) {
                            aVar.n();
                            i7++;
                        } else {
                            aVar.r(i6);
                            long[] jArr3 = this.parent;
                            int length5 = jArr3 == null ? 0 : jArr3.length;
                            int i9 = i7 + length5;
                            long[] jArr4 = new long[i9];
                            if (length5 != 0) {
                                System.arraycopy(jArr3, 0, jArr4, 0, length5);
                            }
                            while (length5 < i9) {
                                jArr4[length5] = aVar.n();
                                length5++;
                            }
                            this.parent = jArr4;
                            aVar.f3821g = b;
                            aVar.q();
                            continue;
                        }
                    }
                case 138:
                    this.updateAt = aVar.o();
                    continue;
                case 144:
                    this.isShowVote = aVar.c();
                    continue;
                case 152:
                    this.ifCanVote = aVar.c();
                    continue;
                case 162:
                    this.html = aVar.o();
                    continue;
                case 168:
                    this.isFold = aVar.c();
                    continue;
                case 176:
                    this.isCollect = aVar.c();
                    continue;
                case 186:
                    this.createDate = aVar.o();
                    continue;
                case 192:
                    this.isLog = aVar.c();
                    continue;
                case 202:
                    if (this.aiHeadlineInfo == null) {
                        this.aiHeadlineInfo = new AIHeadlineInfo();
                    }
                    dVar = this.aiHeadlineInfo;
                    break;
                case 210:
                    this.type = aVar.o();
                    continue;
                case 218:
                    if (this.titleImage == null) {
                        this.titleImage = new CommentImage();
                    }
                    dVar = this.titleImage;
                    break;
                case 224:
                    this.isDeveloper = aVar.c();
                    continue;
                case 232:
                    this.isPoster = aVar.c();
                    continue;
                case 242:
                    this.packageName = aVar.o();
                    continue;
                case 250:
                    this.topicId = aVar.o();
                    continue;
                case 258:
                    int a5 = e.a(aVar, 258);
                    String[] strArr = this.hashtags;
                    int length6 = strArr == null ? 0 : strArr.length;
                    int i10 = a5 + length6;
                    String[] strArr2 = new String[i10];
                    if (length6 != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length6);
                    }
                    while (length6 < i10 - 1) {
                        strArr2[length6] = aVar.o();
                        aVar.p();
                        length6++;
                    }
                    strArr2[length6] = aVar.o();
                    this.hashtags = strArr2;
                    continue;
                case 264:
                    this.textShowMore = aVar.c();
                    continue;
                case 274:
                    this.descriptionShort = aVar.o();
                    continue;
                case 282:
                    int a6 = e.a(aVar, 282);
                    ReferInfo[] referInfoArr = this.refersInfo;
                    int length7 = referInfoArr == null ? 0 : referInfoArr.length;
                    int i11 = a6 + length7;
                    ReferInfo[] referInfoArr2 = new ReferInfo[i11];
                    if (length7 != 0) {
                        System.arraycopy(referInfoArr, 0, referInfoArr2, 0, length7);
                    }
                    while (length7 < i11 - 1) {
                        referInfoArr2[length7] = new ReferInfo();
                        aVar.g(referInfoArr2[length7]);
                        aVar.p();
                        length7++;
                    }
                    referInfoArr2[length7] = new ReferInfo();
                    aVar.g(referInfoArr2[length7]);
                    this.refersInfo = referInfoArr2;
                    continue;
                case 288:
                    this.isSticky = aVar.c();
                    continue;
                case 296:
                    this.isSpam = aVar.c();
                    continue;
                case 304:
                    this.isPromotion = aVar.c();
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
        long j2 = this.id;
        if (j2 != 0) {
            codedOutputByteBufferNano.v(1, j2);
        }
        long j3 = this.invit;
        if (j3 != 0) {
            codedOutputByteBufferNano.v(2, j3);
        }
        long j4 = this.score;
        if (j4 != 0) {
            codedOutputByteBufferNano.v(3, j4);
        }
        long j5 = this.total;
        if (j5 != 0) {
            codedOutputByteBufferNano.v(4, j5);
        }
        long j6 = this.supportLen;
        if (j6 != 0) {
            codedOutputByteBufferNano.v(5, j6);
        }
        if (!this.voteStatus.equals("")) {
            codedOutputByteBufferNano.C(6, this.voteStatus);
        }
        if (!this.createdAt.equals("")) {
            codedOutputByteBufferNano.C(7, this.createdAt);
        }
        if (!this.msg.equals("")) {
            codedOutputByteBufferNano.C(8, this.msg);
        }
        if (!this.userSourceName.equals("")) {
            codedOutputByteBufferNano.C(9, this.userSourceName);
        }
        if (!this.title.equals("")) {
            codedOutputByteBufferNano.C(10, this.title);
        }
        UserInfo userInfo = this.author;
        if (userInfo != null) {
            codedOutputByteBufferNano.w(11, userInfo);
        }
        CommentInfo commentInfo = this.replyTo;
        if (commentInfo != null) {
            codedOutputByteBufferNano.w(12, commentInfo);
        }
        CommentImage[] commentImageArr = this.images;
        int i2 = 0;
        if (commentImageArr != null && commentImageArr.length > 0) {
            int i3 = 0;
            while (true) {
                CommentImage[] commentImageArr2 = this.images;
                if (i3 >= commentImageArr2.length) {
                    break;
                }
                CommentImage commentImage = commentImageArr2[i3];
                if (commentImage != null) {
                    codedOutputByteBufferNano.w(13, commentImage);
                }
                i3++;
            }
        }
        RichTextInfo[] richTextInfoArr = this.richText;
        if (richTextInfoArr != null && richTextInfoArr.length > 0) {
            int i4 = 0;
            while (true) {
                RichTextInfo[] richTextInfoArr2 = this.richText;
                if (i4 >= richTextInfoArr2.length) {
                    break;
                }
                RichTextInfo richTextInfo = richTextInfoArr2[i4];
                if (richTextInfo != null) {
                    codedOutputByteBufferNano.w(14, richTextInfo);
                }
                i4++;
            }
        }
        CommentInfo[] commentInfoArr = this.children;
        if (commentInfoArr != null && commentInfoArr.length > 0) {
            int i5 = 0;
            while (true) {
                CommentInfo[] commentInfoArr2 = this.children;
                if (i5 >= commentInfoArr2.length) {
                    break;
                }
                CommentInfo commentInfo2 = commentInfoArr2[i5];
                if (commentInfo2 != null) {
                    codedOutputByteBufferNano.w(15, commentInfo2);
                }
                i5++;
            }
        }
        long[] jArr = this.parent;
        if (jArr != null && jArr.length > 0) {
            int i6 = 0;
            while (true) {
                long[] jArr2 = this.parent;
                if (i6 >= jArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.v(16, jArr2[i6]);
                i6++;
            }
        }
        if (!this.updateAt.equals("")) {
            codedOutputByteBufferNano.C(17, this.updateAt);
        }
        boolean z = this.isShowVote;
        if (z) {
            codedOutputByteBufferNano.p(18, z);
        }
        boolean z2 = this.ifCanVote;
        if (z2) {
            codedOutputByteBufferNano.p(19, z2);
        }
        if (!this.html.equals("")) {
            codedOutputByteBufferNano.C(20, this.html);
        }
        boolean z3 = this.isFold;
        if (z3) {
            codedOutputByteBufferNano.p(21, z3);
        }
        boolean z4 = this.isCollect;
        if (z4) {
            codedOutputByteBufferNano.p(22, z4);
        }
        if (!this.createDate.equals("")) {
            codedOutputByteBufferNano.C(23, this.createDate);
        }
        boolean z5 = this.isLog;
        if (z5) {
            codedOutputByteBufferNano.p(24, z5);
        }
        AIHeadlineInfo aIHeadlineInfo = this.aiHeadlineInfo;
        if (aIHeadlineInfo != null) {
            codedOutputByteBufferNano.w(25, aIHeadlineInfo);
        }
        if (!this.type.equals("")) {
            codedOutputByteBufferNano.C(26, this.type);
        }
        CommentImage commentImage2 = this.titleImage;
        if (commentImage2 != null) {
            codedOutputByteBufferNano.w(27, commentImage2);
        }
        boolean z6 = this.isDeveloper;
        if (z6) {
            codedOutputByteBufferNano.p(28, z6);
        }
        boolean z7 = this.isPoster;
        if (z7) {
            codedOutputByteBufferNano.p(29, z7);
        }
        if (!this.packageName.equals("")) {
            codedOutputByteBufferNano.C(30, this.packageName);
        }
        if (!this.topicId.equals("")) {
            codedOutputByteBufferNano.C(31, this.topicId);
        }
        String[] strArr = this.hashtags;
        if (strArr != null && strArr.length > 0) {
            int i7 = 0;
            while (true) {
                String[] strArr2 = this.hashtags;
                if (i7 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i7];
                if (str != null) {
                    codedOutputByteBufferNano.C(32, str);
                }
                i7++;
            }
        }
        boolean z8 = this.textShowMore;
        if (z8) {
            codedOutputByteBufferNano.p(33, z8);
        }
        if (!this.descriptionShort.equals("")) {
            codedOutputByteBufferNano.C(34, this.descriptionShort);
        }
        ReferInfo[] referInfoArr = this.refersInfo;
        if (referInfoArr != null && referInfoArr.length > 0) {
            while (true) {
                ReferInfo[] referInfoArr2 = this.refersInfo;
                if (i2 >= referInfoArr2.length) {
                    break;
                }
                ReferInfo referInfo = referInfoArr2[i2];
                if (referInfo != null) {
                    codedOutputByteBufferNano.w(35, referInfo);
                }
                i2++;
            }
        }
        boolean z9 = this.isSticky;
        if (z9) {
            codedOutputByteBufferNano.p(36, z9);
        }
        boolean z10 = this.isSpam;
        if (z10) {
            codedOutputByteBufferNano.p(37, z10);
        }
        boolean z11 = this.isPromotion;
        if (z11) {
            codedOutputByteBufferNano.p(38, z11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
