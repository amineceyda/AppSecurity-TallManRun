package g.e.a.b.f.b;

import g.c.b.b.f;

public final class p {
    public final String a;
    public final String b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3280d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3281e;

    /* renamed from: f  reason: collision with root package name */
    public final long f3282f;

    /* renamed from: g  reason: collision with root package name */
    public final long f3283g;

    /* renamed from: h  reason: collision with root package name */
    public final Long f3284h;

    /* renamed from: i  reason: collision with root package name */
    public final Long f3285i;

    /* renamed from: j  reason: collision with root package name */
    public final Long f3286j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f3287k;

    public p(String str, String str2, long j2, long j3, long j4, long j5, long j6, Long l2, Long l3, Long l4, Boolean bool) {
        long j7 = j2;
        long j8 = j3;
        long j9 = j4;
        long j10 = j6;
        f.k(str);
        f.k(str2);
        boolean z = true;
        f.g(j7 >= 0);
        f.g(j8 >= 0);
        f.g(j9 >= 0);
        f.g(j10 < 0 ? false : z);
        this.a = str;
        this.b = str2;
        this.c = j7;
        this.f3280d = j8;
        this.f3281e = j9;
        this.f3282f = j5;
        this.f3283g = j10;
        this.f3284h = l2;
        this.f3285i = l3;
        this.f3286j = l4;
        this.f3287k = bool;
    }

    public final p a(Long l2, Long l3, Boolean bool) {
        return new p(this.a, this.b, this.c, this.f3280d, this.f3281e, this.f3282f, this.f3283g, this.f3284h, l2, l3, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public final p b(long j2, long j3) {
        return new p(this.a, this.b, this.c, this.f3280d, this.f3281e, this.f3282f, j2, Long.valueOf(j3), this.f3285i, this.f3286j, this.f3287k);
    }

    public final p c(long j2) {
        return new p(this.a, this.b, this.c, this.f3280d, this.f3281e, j2, this.f3283g, this.f3284h, this.f3285i, this.f3286j, this.f3287k);
    }
}
