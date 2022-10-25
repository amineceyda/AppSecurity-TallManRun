package g.e.a.b.f.b;

import java.util.Map;
import java.util.Objects;

public final class i3 implements Runnable {
    public final h3 b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final Throwable f3192d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f3193e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3194f;

    /* renamed from: g  reason: collision with root package name */
    public final Map f3195g;

    public i3(String str, h3 h3Var, int i2, Throwable th, byte[] bArr, Map map) {
        Objects.requireNonNull(h3Var, "null reference");
        this.b = h3Var;
        this.c = i2;
        this.f3192d = th;
        this.f3193e = bArr;
        this.f3194f = str;
        this.f3195g = map;
    }

    public final void run() {
        this.b.a(this.f3194f, this.c, this.f3192d, this.f3193e, this.f3195g);
    }
}
