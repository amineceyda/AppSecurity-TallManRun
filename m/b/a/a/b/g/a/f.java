package m.b.a.a.b.g.a;

import g.a.a.a.a;

public class f implements Comparable<f> {
    public final String b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5250d;

    public f(String str, long j2, long j3) {
        if (str != null) {
            this.b = str;
            this.c = j2;
            this.f5250d = j3;
            return;
        }
        throw new IllegalArgumentException();
    }

    public long a() {
        return this.f5250d;
    }

    public String b() {
        return this.b;
    }

    public int compareTo(Object obj) {
        long j2 = this.f5250d;
        long j3 = ((f) obj).f5250d;
        if (j2 < j3) {
            return -1;
        }
        return j2 > j3 ? 1 : 0;
    }

    public long d() {
        return this.c;
    }

    public String toString() {
        return a.f(a.i("SessionInfo["), this.b, "]");
    }
}
