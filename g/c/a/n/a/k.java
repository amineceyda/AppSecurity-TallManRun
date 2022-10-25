package g.c.a.n.a;

import com.apkpure.aegon.components.download.DownloadTask;
import com.apkpure.aegon.components.statistics.datong.DTStatInfo;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import g.a.a.a.a;
import i.o.c.h;

public final class k {
    public j a;
    public DownloadTask b;
    public AppDetailInfo c;

    /* renamed from: d  reason: collision with root package name */
    public DTStatInfo f2108d;

    public k() {
        this((j) null, (DownloadTask) null, (AppDetailInfo) null, (DTStatInfo) null, 15);
    }

    public k(j jVar, DownloadTask downloadTask, AppDetailInfo appDetailInfo, DTStatInfo dTStatInfo, int i2) {
        j jVar2 = (i2 & 1) != 0 ? j.WAITING_FOR_DOWNLOAD : null;
        int i3 = i2 & 2;
        int i4 = i2 & 4;
        DTStatInfo dTStatInfo2 = (i2 & 8) != 0 ? new DTStatInfo() : null;
        h.e(jVar2, "state");
        h.e(dTStatInfo2, "dtStatInfo");
        this.a = jVar2;
        this.b = null;
        this.c = null;
        this.f2108d = dTStatInfo2;
    }

    public final void a(DTStatInfo dTStatInfo) {
        h.e(dTStatInfo, "<set-?>");
        this.f2108d = dTStatInfo;
    }

    public final void b(j jVar) {
        h.e(jVar, "<set-?>");
        this.a = jVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && h.a(this.b, kVar.b) && h.a(this.c, kVar.c) && h.a(this.f2108d, kVar.f2108d);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        DownloadTask downloadTask = this.b;
        int i2 = 0;
        int hashCode2 = (hashCode + (downloadTask == null ? 0 : downloadTask.hashCode())) * 31;
        AppDetailInfo appDetailInfo = this.c;
        if (appDetailInfo != null) {
            i2 = appDetailInfo.hashCode();
        }
        return this.f2108d.hashCode() + ((hashCode2 + i2) * 31);
    }

    public String toString() {
        StringBuilder i2 = a.i("DownloadButtonStateInfo(state=");
        i2.append(this.a);
        i2.append(", downloadTask=");
        i2.append(this.b);
        i2.append(", appDetailInfo=");
        i2.append(this.c);
        i2.append(", dtStatInfo=");
        i2.append(this.f2108d);
        i2.append(')');
        return i2.toString();
    }
}
