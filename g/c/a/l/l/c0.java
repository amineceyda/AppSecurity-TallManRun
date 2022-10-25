package g.c.a.l.l;

import g.c.a.e.k.h.b;
import g.e.c.s.a;
import g.e.c.s.c;
import i.o.c.h;

public final class c0 {
    @c("isFinished")
    @a
    private boolean isFinished;
    @c("packageName")
    @a
    private String packageName;
    @c("state")
    @a
    private int state;
    @c("versionCode")
    @a
    private String versionCode;

    public c0() {
        this((String) null, (String) null, 0, false, 15);
    }

    public c0(String str, String str2, int i2, boolean z, int i3) {
        str = (i3 & 1) != 0 ? "" : str;
        str2 = (i3 & 2) != 0 ? "0" : str2;
        i2 = (i3 & 4) != 0 ? -1 : i2;
        z = (i3 & 8) != 0 ? false : z;
        h.e(str, "packageName");
        h.e(str2, "versionCode");
        this.packageName = str;
        this.versionCode = str2;
        this.state = i2;
        this.isFinished = z;
    }

    public final String a() {
        return this.packageName;
    }

    public final String b() {
        return this.versionCode;
    }

    public final boolean c() {
        return this.isFinished;
    }

    public final void d(boolean z) {
        this.isFinished = z;
    }

    public final void e(int i2) {
        this.state = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return h.a(this.packageName, c0Var.packageName) && h.a(this.versionCode, c0Var.versionCode) && this.state == c0Var.state && this.isFinished == c0Var.isFinished;
    }

    public final String f() {
        String c = b.c(this);
        h.d(c, "objectToJson(this)");
        return c;
    }

    public int hashCode() {
        int a = (g.a.a.a.a.a(this.versionCode, this.packageName.hashCode() * 31, 31) + this.state) * 31;
        boolean z = this.isFinished;
        if (z) {
            z = true;
        }
        return a + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("ApkMicroDownloadState(packageName=");
        i2.append(this.packageName);
        i2.append(", versionCode=");
        i2.append(this.versionCode);
        i2.append(", state=");
        i2.append(this.state);
        i2.append(", isFinished=");
        i2.append(this.isFinished);
        i2.append(')');
        return i2.toString();
    }
}
