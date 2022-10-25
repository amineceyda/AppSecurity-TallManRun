package g.e.a.a.f.z.i;

public final class x extends b0 {
    public final long b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2833d;

    /* renamed from: e  reason: collision with root package name */
    public final long f2834e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2835f;

    public x(long j2, int i2, int i3, long j3, int i4, a aVar) {
        this.b = j2;
        this.c = i2;
        this.f2833d = i3;
        this.f2834e = j3;
        this.f2835f = i4;
    }

    public int a() {
        return this.f2833d;
    }

    public long b() {
        return this.f2834e;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.f2835f;
    }

    public long e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.b == b0Var.e() && this.c == b0Var.c() && this.f2833d == b0Var.a() && this.f2834e == b0Var.b() && this.f2835f == b0Var.d();
    }

    public int hashCode() {
        long j2 = this.b;
        long j3 = this.f2834e;
        return this.f2835f ^ ((((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.f2833d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003);
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("EventStoreConfig{maxStorageSizeInBytes=");
        i2.append(this.b);
        i2.append(", loadBatchSize=");
        i2.append(this.c);
        i2.append(", criticalSectionEnterTimeoutMs=");
        i2.append(this.f2833d);
        i2.append(", eventCleanUpAge=");
        i2.append(this.f2834e);
        i2.append(", maxBlobByteSizePerRow=");
        return g.a.a.a.a.e(i2, this.f2835f, "}");
    }
}
