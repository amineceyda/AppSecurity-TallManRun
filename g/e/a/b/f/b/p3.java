package g.e.a.b.f.b;

import android.content.SharedPreferences;
import g.c.b.b.f;

public final class p3 {
    public final String a;
    public final long b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public long f3288d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ s3 f3289e;

    public p3(s3 s3Var, String str, long j2) {
        this.f3289e = s3Var;
        f.k(str);
        this.a = str;
        this.b = j2;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.f3288d = this.f3289e.o().getLong(this.a, this.b);
        }
        return this.f3288d;
    }

    public final void b(long j2) {
        SharedPreferences.Editor edit = this.f3289e.o().edit();
        edit.putLong(this.a, j2);
        edit.apply();
        this.f3288d = j2;
    }
}
