package com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.openconfig.nano.OpenConfig;
import com.tencent.trpcprotocol.projecta.common.userinfo.nano.UserInfo;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import g.e.d.a.e;
import java.io.IOException;

public final class CmsItemList extends d {
    private static volatile CmsItemList[] _emptyArray;
    public OpenConfig[] openConfig;
    public UserInfo[] userInfo;

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
        this.openConfig = OpenConfig.emptyArray();
        this.userInfo = UserInfo.emptyArray();
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        OpenConfig[] openConfigArr = this.openConfig;
        int i2 = 0;
        if (openConfigArr != null && openConfigArr.length > 0) {
            int i3 = 0;
            while (true) {
                OpenConfig[] openConfigArr2 = this.openConfig;
                if (i3 >= openConfigArr2.length) {
                    break;
                }
                OpenConfig openConfig2 = openConfigArr2[i3];
                if (openConfig2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(1, openConfig2);
                }
                i3++;
            }
        }
        UserInfo[] userInfoArr = this.userInfo;
        if (userInfoArr != null && userInfoArr.length > 0) {
            while (true) {
                UserInfo[] userInfoArr2 = this.userInfo;
                if (i2 >= userInfoArr2.length) {
                    break;
                }
                UserInfo userInfo2 = userInfoArr2[i2];
                if (userInfo2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(2, userInfo2);
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    public CmsItemList mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                int a = e.a(aVar, 10);
                OpenConfig[] openConfigArr = this.openConfig;
                int length = openConfigArr == null ? 0 : openConfigArr.length;
                int i2 = a + length;
                OpenConfig[] openConfigArr2 = new OpenConfig[i2];
                if (length != 0) {
                    System.arraycopy(openConfigArr, 0, openConfigArr2, 0, length);
                }
                while (length < i2 - 1) {
                    openConfigArr2[length] = new OpenConfig();
                    aVar.g(openConfigArr2[length]);
                    aVar.p();
                    length++;
                }
                openConfigArr2[length] = new OpenConfig();
                aVar.g(openConfigArr2[length]);
                this.openConfig = openConfigArr2;
            } else if (p == 18) {
                int a2 = e.a(aVar, 18);
                UserInfo[] userInfoArr = this.userInfo;
                int length2 = userInfoArr == null ? 0 : userInfoArr.length;
                int i3 = a2 + length2;
                UserInfo[] userInfoArr2 = new UserInfo[i3];
                if (length2 != 0) {
                    System.arraycopy(userInfoArr, 0, userInfoArr2, 0, length2);
                }
                while (length2 < i3 - 1) {
                    userInfoArr2[length2] = new UserInfo();
                    aVar.g(userInfoArr2[length2]);
                    aVar.p();
                    length2++;
                }
                userInfoArr2[length2] = new UserInfo();
                aVar.g(userInfoArr2[length2]);
                this.userInfo = userInfoArr2;
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        OpenConfig[] openConfigArr = this.openConfig;
        int i2 = 0;
        if (openConfigArr != null && openConfigArr.length > 0) {
            int i3 = 0;
            while (true) {
                OpenConfig[] openConfigArr2 = this.openConfig;
                if (i3 >= openConfigArr2.length) {
                    break;
                }
                OpenConfig openConfig2 = openConfigArr2[i3];
                if (openConfig2 != null) {
                    codedOutputByteBufferNano.w(1, openConfig2);
                }
                i3++;
            }
        }
        UserInfo[] userInfoArr = this.userInfo;
        if (userInfoArr != null && userInfoArr.length > 0) {
            while (true) {
                UserInfo[] userInfoArr2 = this.userInfo;
                if (i2 >= userInfoArr2.length) {
                    break;
                }
                UserInfo userInfo2 = userInfoArr2[i2];
                if (userInfo2 != null) {
                    codedOutputByteBufferNano.w(2, userInfo2);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
