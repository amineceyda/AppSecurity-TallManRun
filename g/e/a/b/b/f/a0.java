package g.e.a.b.b.f;

import android.net.Uri;
import g.c.b.b.f;
import java.util.Arrays;

public final class a0 {

    /* renamed from: e  reason: collision with root package name */
    public static final Uri f2845e = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String a;
    public final String b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2846d;

    public a0(String str, String str2, int i2, boolean z) {
        f.k(str);
        this.a = str;
        f.k(str2);
        this.b = str2;
        this.c = i2;
        this.f2846d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return f.y(this.a, a0Var.a) && f.y(this.b, a0Var.b) && f.y((Object) null, (Object) null) && this.c == a0Var.c && this.f2846d == a0Var.f2846d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, Integer.valueOf(this.c), Boolean.valueOf(this.f2846d)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        throw null;
    }
}
