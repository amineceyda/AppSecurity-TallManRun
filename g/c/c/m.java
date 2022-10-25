package g.c.c;

import com.tencent.raft.codegenmeta.utils.Constants;
import g.e.c.s.a;
import g.e.c.s.c;
import i.o.c.h;
import java.util.Arrays;
import java.util.Locale;

public final class m {
    @c("activeSource")
    @a
    private String activeSource = "0";
    @c("buildNo")
    @a
    private int buildNo = 0;
    @c("downloadId")
    @a
    private String downloadId = "";
    @c("isReady")
    @a
    private boolean isReady = false;
    @c("oriBuildNo")
    @a
    private int oriBuildNo = 0;
    @c("version")
    @a
    private String version = "";
    @c("versionCode")
    @a
    private long versionCode = 0;

    public m() {
        h.e("", Constants.Raft.VERSION);
        h.e("", "downloadId");
        h.e("0", "activeSource");
    }

    public final String a() {
        try {
            String format = String.format(Locale.ENGLISH, "%04d", Arrays.copyOf(new Object[]{Integer.valueOf(this.buildNo)}, 1));
            h.d(format, "java.lang.String.format(locale, format, *args)");
            return format;
        } catch (Exception unused) {
            return "0000";
        }
    }

    public final String b() {
        return this.downloadId;
    }

    public final String c() {
        try {
            String format = String.format(Locale.ENGLISH, "%04d", Arrays.copyOf(new Object[]{Integer.valueOf(this.oriBuildNo)}, 1));
            h.d(format, "java.lang.String.format(locale, format, *args)");
            return format;
        } catch (Exception unused) {
            return "0000";
        }
    }

    public final String d() {
        return this.version;
    }

    public final long e() {
        return this.versionCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return h.a(this.version, mVar.version) && this.versionCode == mVar.versionCode && this.buildNo == mVar.buildNo && this.oriBuildNo == mVar.oriBuildNo && h.a(this.downloadId, mVar.downloadId) && this.isReady == mVar.isReady && h.a(this.activeSource, mVar.activeSource);
    }

    public final boolean f() {
        return this.isReady;
    }

    public final void g(String str) {
        h.e(str, "<set-?>");
        this.activeSource = str;
    }

    public final void h(int i2) {
        this.buildNo = i2;
    }

    public int hashCode() {
        int a = c.a(this.versionCode);
        int a2 = g.a.a.a.a.a(this.downloadId, (((((a + (this.version.hashCode() * 31)) * 31) + this.buildNo) * 31) + this.oriBuildNo) * 31, 31);
        boolean z = this.isReady;
        if (z) {
            z = true;
        }
        return this.activeSource.hashCode() + ((a2 + (z ? 1 : 0)) * 31);
    }

    public final void i(String str) {
        h.e(str, "<set-?>");
        this.downloadId = str;
    }

    public final void j(int i2) {
        this.oriBuildNo = i2;
    }

    public final void k(boolean z) {
        this.isReady = z;
    }

    public final void l(String str) {
        h.e(str, "<set-?>");
        this.version = str;
    }

    public final void m(long j2) {
        this.versionCode = j2;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("CrabShellUpgradeState(version=");
        i2.append(this.version);
        i2.append(", versionCode=");
        i2.append(this.versionCode);
        i2.append(", buildNo=");
        i2.append(this.buildNo);
        i2.append(", oriBuildNo=");
        i2.append(this.oriBuildNo);
        i2.append(", downloadId=");
        i2.append(this.downloadId);
        i2.append(", isReady=");
        i2.append(this.isReady);
        i2.append(", activeSource=");
        i2.append(this.activeSource);
        i2.append(')');
        return i2.toString();
    }
}
