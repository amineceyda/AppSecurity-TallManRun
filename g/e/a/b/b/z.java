package g.e.a.b.b;

import javax.annotation.Nullable;

public class z {

    /* renamed from: d  reason: collision with root package name */
    public static final z f2877d = new z(true, (String) null, (Throwable) null);
    public final boolean a;
    @Nullable
    public final String b;
    @Nullable
    public final Throwable c;

    public z(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.a = z;
        this.b = str;
        this.c = th;
    }

    public static z b(String str) {
        return new z(false, str, (Throwable) null);
    }

    public static z c(String str, Throwable th) {
        return new z(false, str, th);
    }

    @Nullable
    public String a() {
        return this.b;
    }
}
