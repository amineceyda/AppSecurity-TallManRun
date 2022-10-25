package com.apkpure.components.clientchannel.channel.headers;

import g.a.a.a.a;
import i.o.c.f;
import i.o.c.h;

public final class ExtInfo {
    private String extInfo;
    private LbsInfo lbsInfo;

    public ExtInfo() {
        this((LbsInfo) null, (String) null, 3, (f) null);
    }

    public ExtInfo(LbsInfo lbsInfo2, String str) {
        this.lbsInfo = lbsInfo2;
        this.extInfo = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExtInfo(LbsInfo lbsInfo2, String str, int i2, f fVar) {
        this((i2 & 1) != 0 ? null : lbsInfo2, (i2 & 2) != 0 ? "" : str);
    }

    public static /* synthetic */ ExtInfo copy$default(ExtInfo extInfo2, LbsInfo lbsInfo2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lbsInfo2 = extInfo2.lbsInfo;
        }
        if ((i2 & 2) != 0) {
            str = extInfo2.extInfo;
        }
        return extInfo2.copy(lbsInfo2, str);
    }

    public final LbsInfo component1() {
        return this.lbsInfo;
    }

    public final String component2() {
        return this.extInfo;
    }

    public final ExtInfo copy(LbsInfo lbsInfo2, String str) {
        return new ExtInfo(lbsInfo2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtInfo)) {
            return false;
        }
        ExtInfo extInfo2 = (ExtInfo) obj;
        return h.a(this.lbsInfo, extInfo2.lbsInfo) && h.a(this.extInfo, extInfo2.extInfo);
    }

    public final String getExtInfo() {
        return this.extInfo;
    }

    public final LbsInfo getLbsInfo() {
        return this.lbsInfo;
    }

    public int hashCode() {
        LbsInfo lbsInfo2 = this.lbsInfo;
        int i2 = 0;
        int hashCode = (lbsInfo2 == null ? 0 : lbsInfo2.hashCode()) * 31;
        String str = this.extInfo;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final void setExtInfo(String str) {
        this.extInfo = str;
    }

    public final void setLbsInfo(LbsInfo lbsInfo2) {
        this.lbsInfo = lbsInfo2;
    }

    public String toString() {
        StringBuilder i2 = a.i("ExtInfo(lbsInfo=");
        i2.append(this.lbsInfo);
        i2.append(", extInfo=");
        i2.append(this.extInfo);
        i2.append(')');
        return i2.toString();
    }
}
