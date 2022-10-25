package g.e.a.b.f.b;

import android.content.SharedPreferences;
import g.c.b.b.f;

public final class n3 {
    public final String a;
    public final boolean b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3253d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ s3 f3254e;

    public n3(s3 s3Var, String str, boolean z) {
        this.f3254e = s3Var;
        f.k(str);
        this.a = str;
        this.b = z;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor edit = this.f3254e.o().edit();
        edit.putBoolean(this.a, z);
        edit.apply();
        this.f3253d = z;
    }

    public final boolean b() {
        if (!this.c) {
            this.c = true;
            this.f3253d = this.f3254e.o().getBoolean(this.a, this.b);
        }
        return this.f3253d;
    }
}
