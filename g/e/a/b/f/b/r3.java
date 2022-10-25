package g.e.a.b.f.b;

import android.content.SharedPreferences;
import g.c.b.b.f;

public final class r3 {
    public final String a;
    public boolean b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ s3 f3323d;

    public r3(s3 s3Var, String str) {
        this.f3323d = s3Var;
        f.k(str);
        this.a = str;
    }

    public final String a() {
        if (!this.b) {
            this.b = true;
            this.c = this.f3323d.o().getString(this.a, (String) null);
        }
        return this.c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f3323d.o().edit();
        edit.putString(this.a, str);
        edit.apply();
        this.c = str;
    }
}
