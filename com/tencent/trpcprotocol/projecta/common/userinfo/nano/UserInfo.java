package com.tencent.trpcprotocol.projecta.common.userinfo.nano;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.beacon.event.open.EventResult;
import com.tencent.trpcprotocol.projecta.common.aiheadlineinfo.nano.AIHeadlineInfo;
import com.tencent.trpcprotocol.projecta.common.developerinfo.nano.DeveloperInfo;
import com.tencent.trpcprotocol.projecta.common.socialinfo.nano.SocialInfo;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.c;
import g.e.d.a.d;
import g.e.d.a.e;
import java.io.IOException;
import java.util.Map;

public final class UserInfo extends d {
    private static volatile UserInfo[] _emptyArray;
    public String account;
    public AIHeadlineInfo aiHeadlineInfo;
    public String avatar;
    public String birthday;
    public long collectionCount;
    public long commentCount;
    public DeveloperInfo developerInfo;
    public String email;
    public long fansCount;
    public long focusCount;
    public String gender;
    public boolean hasNickName;
    public String id;
    public long innerMessageUnReadCount;
    public String intro;
    public boolean isAppVote;
    public boolean isDeveloper;
    public boolean isFocus;
    public boolean isFocusOnEachOther;
    public boolean isUserGuest;
    public boolean isUserLogin;
    public boolean isVerifiedEmail;
    public String localUser;
    public String loginType;
    public String nickName;
    public long notifyUnReadCount;
    public String password;
    public String[] privacySetting;
    public String regType;
    public long replyUnReadCount;
    public SocialInfo[] socialList;
    public Map<String, Double> tags;
    public long userAtUnReadCount;
    public long voteUnReadCount;
    public long wonPraiseCount;

    public UserInfo() {
        clear();
    }

    public static UserInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new UserInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static UserInfo parseFrom(a aVar) throws IOException {
        return new UserInfo().mergeFrom(aVar);
    }

    public static UserInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (UserInfo) d.mergeFrom(new UserInfo(), bArr);
    }

    public UserInfo clear() {
        this.account = "";
        this.email = "";
        this.password = "";
        this.avatar = "";
        this.nickName = "";
        this.gender = "";
        this.isUserGuest = false;
        this.isUserLogin = false;
        this.isAppVote = false;
        this.birthday = "";
        this.loginType = "";
        this.id = "";
        this.regType = "";
        this.localUser = "";
        this.hasNickName = false;
        this.wonPraiseCount = 0;
        this.commentCount = 0;
        this.notifyUnReadCount = 0;
        this.collectionCount = 0;
        this.focusCount = 0;
        this.fansCount = 0;
        this.isFocus = false;
        this.intro = "";
        this.socialList = SocialInfo.emptyArray();
        this.isVerifiedEmail = false;
        this.replyUnReadCount = 0;
        this.voteUnReadCount = 0;
        this.userAtUnReadCount = 0;
        this.aiHeadlineInfo = null;
        this.tags = null;
        this.privacySetting = e.b;
        this.innerMessageUnReadCount = 0;
        this.isFocusOnEachOther = false;
        this.isDeveloper = false;
        this.developerInfo = null;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.account.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.account);
        }
        if (!this.email.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.email);
        }
        if (!this.password.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(3, this.password);
        }
        if (!this.avatar.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(4, this.avatar);
        }
        if (!this.nickName.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(5, this.nickName);
        }
        if (!this.gender.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(6, this.gender);
        }
        boolean z = this.isUserGuest;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.a(7, z);
        }
        boolean z2 = this.isUserLogin;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.a(8, z2);
        }
        boolean z3 = this.isAppVote;
        if (z3) {
            computeSerializedSize += CodedOutputByteBufferNano.a(9, z3);
        }
        if (!this.birthday.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(10, this.birthday);
        }
        if (!this.loginType.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(11, this.loginType);
        }
        if (!this.id.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(12, this.id);
        }
        if (!this.regType.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(13, this.regType);
        }
        if (!this.localUser.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(14, this.localUser);
        }
        boolean z4 = this.hasNickName;
        if (z4) {
            computeSerializedSize += CodedOutputByteBufferNano.a(15, z4);
        }
        long j2 = this.wonPraiseCount;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(16, j2);
        }
        long j3 = this.commentCount;
        if (j3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(17, j3);
        }
        long j4 = this.notifyUnReadCount;
        if (j4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(18, j4);
        }
        long j5 = this.collectionCount;
        if (j5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(19, j5);
        }
        long j6 = this.focusCount;
        if (j6 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(20, j6);
        }
        long j7 = this.fansCount;
        if (j7 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(21, j7);
        }
        boolean z5 = this.isFocus;
        if (z5) {
            computeSerializedSize += CodedOutputByteBufferNano.a(22, z5);
        }
        if (!this.intro.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(23, this.intro);
        }
        SocialInfo[] socialInfoArr = this.socialList;
        int i2 = 0;
        if (socialInfoArr != null && socialInfoArr.length > 0) {
            int i3 = 0;
            while (true) {
                SocialInfo[] socialInfoArr2 = this.socialList;
                if (i3 >= socialInfoArr2.length) {
                    break;
                }
                SocialInfo socialInfo = socialInfoArr2[i3];
                if (socialInfo != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(24, socialInfo);
                }
                i3++;
            }
        }
        boolean z6 = this.isVerifiedEmail;
        if (z6) {
            computeSerializedSize += CodedOutputByteBufferNano.a(25, z6);
        }
        long j8 = this.replyUnReadCount;
        if (j8 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(26, j8);
        }
        long j9 = this.voteUnReadCount;
        if (j9 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(27, j9);
        }
        long j10 = this.userAtUnReadCount;
        if (j10 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(28, j10);
        }
        AIHeadlineInfo aIHeadlineInfo = this.aiHeadlineInfo;
        if (aIHeadlineInfo != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(29, aIHeadlineInfo);
        }
        Map<String, Double> map = this.tags;
        if (map != null) {
            computeSerializedSize += b.a(map, 30, 9, 1);
        }
        String[] strArr = this.privacySetting;
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.privacySetting;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    i5++;
                    int o = CodedOutputByteBufferNano.o(str);
                    i4 += CodedOutputByteBufferNano.h(o) + o;
                }
                i2++;
            }
            computeSerializedSize = computeSerializedSize + i4 + (i5 * 2);
        }
        long j11 = this.innerMessageUnReadCount;
        if (j11 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(32, j11);
        }
        boolean z7 = this.isFocusOnEachOther;
        if (z7) {
            computeSerializedSize += CodedOutputByteBufferNano.a(33, z7);
        }
        boolean z8 = this.isDeveloper;
        if (z8) {
            computeSerializedSize += CodedOutputByteBufferNano.a(34, z8);
        }
        DeveloperInfo developerInfo2 = this.developerInfo;
        return developerInfo2 != null ? computeSerializedSize + CodedOutputByteBufferNano.g(35, developerInfo2) : computeSerializedSize;
    }

    public UserInfo mergeFrom(a aVar) throws IOException {
        d dVar;
        c.C0132c cVar = c.a;
        while (true) {
            int p = aVar.p();
            switch (p) {
                case 0:
                    return this;
                case 10:
                    this.account = aVar.o();
                    continue;
                case ConnectionResult.SERVICE_UPDATING:
                    this.email = aVar.o();
                    continue;
                case 26:
                    this.password = aVar.o();
                    continue;
                case 34:
                    this.avatar = aVar.o();
                    continue;
                case 42:
                    this.nickName = aVar.o();
                    continue;
                case 50:
                    this.gender = aVar.o();
                    continue;
                case 56:
                    this.isUserGuest = aVar.c();
                    continue;
                case ModuleDescriptor.MODULE_VERSION:
                    this.isUserLogin = aVar.c();
                    continue;
                case 72:
                    this.isAppVote = aVar.c();
                    continue;
                case 82:
                    this.birthday = aVar.o();
                    continue;
                case 90:
                    this.loginType = aVar.o();
                    continue;
                case 98:
                    this.id = aVar.o();
                    continue;
                case EventResult.ERROR_CODE_NAME_NULL:
                    this.regType = aVar.o();
                    continue;
                case 114:
                    this.localUser = aVar.o();
                    continue;
                case 120:
                    this.hasNickName = aVar.c();
                    continue;
                case 128:
                    this.wonPraiseCount = aVar.n();
                    continue;
                case 136:
                    this.commentCount = aVar.n();
                    continue;
                case 144:
                    this.notifyUnReadCount = aVar.n();
                    continue;
                case 152:
                    this.collectionCount = aVar.n();
                    continue;
                case 160:
                    this.focusCount = aVar.n();
                    continue;
                case 168:
                    this.fansCount = aVar.n();
                    continue;
                case 176:
                    this.isFocus = aVar.c();
                    continue;
                case 186:
                    this.intro = aVar.o();
                    continue;
                case 194:
                    int a = e.a(aVar, 194);
                    SocialInfo[] socialInfoArr = this.socialList;
                    int length = socialInfoArr == null ? 0 : socialInfoArr.length;
                    int i2 = a + length;
                    SocialInfo[] socialInfoArr2 = new SocialInfo[i2];
                    if (length != 0) {
                        System.arraycopy(socialInfoArr, 0, socialInfoArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        socialInfoArr2[length] = new SocialInfo();
                        aVar.g(socialInfoArr2[length]);
                        aVar.p();
                        length++;
                    }
                    socialInfoArr2[length] = new SocialInfo();
                    aVar.g(socialInfoArr2[length]);
                    this.socialList = socialInfoArr2;
                    continue;
                case 200:
                    this.isVerifiedEmail = aVar.c();
                    continue;
                case 208:
                    this.replyUnReadCount = aVar.n();
                    continue;
                case 216:
                    this.voteUnReadCount = aVar.n();
                    continue;
                case 224:
                    this.userAtUnReadCount = aVar.n();
                    continue;
                case 234:
                    if (this.aiHeadlineInfo == null) {
                        this.aiHeadlineInfo = new AIHeadlineInfo();
                    }
                    dVar = this.aiHeadlineInfo;
                    break;
                case 242:
                    this.tags = b.b(aVar, this.tags, cVar, 9, 1, null, 10, 17);
                    continue;
                case 250:
                    int a2 = e.a(aVar, 250);
                    String[] strArr = this.privacySetting;
                    int length2 = strArr == null ? 0 : strArr.length;
                    int i3 = a2 + length2;
                    String[] strArr2 = new String[i3];
                    if (length2 != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        strArr2[length2] = aVar.o();
                        aVar.p();
                        length2++;
                    }
                    strArr2[length2] = aVar.o();
                    this.privacySetting = strArr2;
                    continue;
                case 256:
                    this.innerMessageUnReadCount = aVar.n();
                    continue;
                case 264:
                    this.isFocusOnEachOther = aVar.c();
                    continue;
                case 272:
                    this.isDeveloper = aVar.c();
                    continue;
                case 282:
                    if (this.developerInfo == null) {
                        this.developerInfo = new DeveloperInfo();
                    }
                    dVar = this.developerInfo;
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
        if (!this.account.equals("")) {
            codedOutputByteBufferNano.C(1, this.account);
        }
        if (!this.email.equals("")) {
            codedOutputByteBufferNano.C(2, this.email);
        }
        if (!this.password.equals("")) {
            codedOutputByteBufferNano.C(3, this.password);
        }
        if (!this.avatar.equals("")) {
            codedOutputByteBufferNano.C(4, this.avatar);
        }
        if (!this.nickName.equals("")) {
            codedOutputByteBufferNano.C(5, this.nickName);
        }
        if (!this.gender.equals("")) {
            codedOutputByteBufferNano.C(6, this.gender);
        }
        boolean z = this.isUserGuest;
        if (z) {
            codedOutputByteBufferNano.p(7, z);
        }
        boolean z2 = this.isUserLogin;
        if (z2) {
            codedOutputByteBufferNano.p(8, z2);
        }
        boolean z3 = this.isAppVote;
        if (z3) {
            codedOutputByteBufferNano.p(9, z3);
        }
        if (!this.birthday.equals("")) {
            codedOutputByteBufferNano.C(10, this.birthday);
        }
        if (!this.loginType.equals("")) {
            codedOutputByteBufferNano.C(11, this.loginType);
        }
        if (!this.id.equals("")) {
            codedOutputByteBufferNano.C(12, this.id);
        }
        if (!this.regType.equals("")) {
            codedOutputByteBufferNano.C(13, this.regType);
        }
        if (!this.localUser.equals("")) {
            codedOutputByteBufferNano.C(14, this.localUser);
        }
        boolean z4 = this.hasNickName;
        if (z4) {
            codedOutputByteBufferNano.p(15, z4);
        }
        long j2 = this.wonPraiseCount;
        if (j2 != 0) {
            codedOutputByteBufferNano.v(16, j2);
        }
        long j3 = this.commentCount;
        if (j3 != 0) {
            codedOutputByteBufferNano.v(17, j3);
        }
        long j4 = this.notifyUnReadCount;
        if (j4 != 0) {
            codedOutputByteBufferNano.v(18, j4);
        }
        long j5 = this.collectionCount;
        if (j5 != 0) {
            codedOutputByteBufferNano.v(19, j5);
        }
        long j6 = this.focusCount;
        if (j6 != 0) {
            codedOutputByteBufferNano.v(20, j6);
        }
        long j7 = this.fansCount;
        if (j7 != 0) {
            codedOutputByteBufferNano.v(21, j7);
        }
        boolean z5 = this.isFocus;
        if (z5) {
            codedOutputByteBufferNano.p(22, z5);
        }
        if (!this.intro.equals("")) {
            codedOutputByteBufferNano.C(23, this.intro);
        }
        SocialInfo[] socialInfoArr = this.socialList;
        int i2 = 0;
        if (socialInfoArr != null && socialInfoArr.length > 0) {
            int i3 = 0;
            while (true) {
                SocialInfo[] socialInfoArr2 = this.socialList;
                if (i3 >= socialInfoArr2.length) {
                    break;
                }
                SocialInfo socialInfo = socialInfoArr2[i3];
                if (socialInfo != null) {
                    codedOutputByteBufferNano.w(24, socialInfo);
                }
                i3++;
            }
        }
        boolean z6 = this.isVerifiedEmail;
        if (z6) {
            codedOutputByteBufferNano.p(25, z6);
        }
        long j8 = this.replyUnReadCount;
        if (j8 != 0) {
            codedOutputByteBufferNano.v(26, j8);
        }
        long j9 = this.voteUnReadCount;
        if (j9 != 0) {
            codedOutputByteBufferNano.v(27, j9);
        }
        long j10 = this.userAtUnReadCount;
        if (j10 != 0) {
            codedOutputByteBufferNano.v(28, j10);
        }
        AIHeadlineInfo aIHeadlineInfo = this.aiHeadlineInfo;
        if (aIHeadlineInfo != null) {
            codedOutputByteBufferNano.w(29, aIHeadlineInfo);
        }
        Map<String, Double> map = this.tags;
        if (map != null) {
            b.d(codedOutputByteBufferNano, map, 30, 9, 1);
        }
        String[] strArr = this.privacySetting;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.privacySetting;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    codedOutputByteBufferNano.C(31, str);
                }
                i2++;
            }
        }
        long j11 = this.innerMessageUnReadCount;
        if (j11 != 0) {
            codedOutputByteBufferNano.v(32, j11);
        }
        boolean z7 = this.isFocusOnEachOther;
        if (z7) {
            codedOutputByteBufferNano.p(33, z7);
        }
        boolean z8 = this.isDeveloper;
        if (z8) {
            codedOutputByteBufferNano.p(34, z8);
        }
        DeveloperInfo developerInfo2 = this.developerInfo;
        if (developerInfo2 != null) {
            codedOutputByteBufferNano.w(35, developerInfo2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
