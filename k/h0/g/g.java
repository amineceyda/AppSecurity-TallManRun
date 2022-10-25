package k.h0.g;

import javax.annotation.Nullable;
import k.e0;
import k.t;

public final class g extends e0 {
    @Nullable
    public final String b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final l.g f4771d;

    public g(@Nullable String str, long j2, l.g gVar) {
        this.b = str;
        this.c = j2;
        this.f4771d = gVar;
    }

    public long a() {
        return this.c;
    }

    public t b() {
        String str = this.b;
        if (str != null) {
            return t.b(str);
        }
        return null;
    }

    public l.g d() {
        return this.f4771d;
    }
}
