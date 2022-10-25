package g.i.b.f.k.g;

import java.util.ArrayList;
import java.util.List;

public class a {
    public boolean a = true;
    public int b = -1;
    public int c = -1;

    /* renamed from: d  reason: collision with root package name */
    public volatile long f4363d;

    /* renamed from: e  reason: collision with root package name */
    public volatile long f4364e;

    /* renamed from: f  reason: collision with root package name */
    public volatile long f4365f;

    /* renamed from: g  reason: collision with root package name */
    public volatile long f4366g;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f4367h = false;

    /* renamed from: i  reason: collision with root package name */
    public g.i.b.f.k.a f4368i;

    /* renamed from: g.i.b.f.k.g.a$a  reason: collision with other inner class name */
    public static class C0162a {
        public long a = 0;
        public long b = 0;

        public C0162a(long j2, long j3) {
            this.a = j2;
            this.b = j3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C0162a)) {
                return false;
            }
            C0162a aVar = (C0162a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final String toString() {
            return "[" + this.a + "," + this.b + "]";
        }
    }

    public static class b {
        public List<C0162a> a = new ArrayList();

        public final String toString() {
            StringBuilder sb = new StringBuilder("bytes=");
            for (C0162a next : this.a) {
                sb.append(next.a);
                sb.append("-");
                long j2 = next.b;
                if (j2 != -1) {
                    sb.append(j2);
                }
                sb.append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
    }

    public a(g.i.b.f.k.a aVar, long j2, long j3, long j4, long j5) {
        this.f4368i = aVar;
        this.f4363d = j2;
        this.f4366g = j5;
        this.f4364e = j3;
        this.f4365f = Math.max(j3, j4);
    }

    public a(g.i.b.f.k.a aVar, String str) {
        this.f4368i = aVar;
        String[] split = str.split(",");
        if (split == null || split.length != 5) {
            g.i.b.e.h.b.h("halley-downloader-DataSection", "new BDRange(String) pattern fail.");
            this.a = false;
            return;
        }
        this.b = Integer.valueOf(split[0]).intValue();
        this.c = Integer.valueOf(split[1]).intValue();
        this.f4363d = Long.valueOf(split[2]).longValue();
        this.f4364e = Long.valueOf(split[3]).longValue();
        this.f4365f = this.f4364e;
        this.f4366g = Long.valueOf(split[4]).longValue();
    }

    public long a(long j2) {
        if (this.f4366g != -1) {
            j2 = this.f4366g;
        }
        return j2 - this.f4365f;
    }

    public C0162a b(int i2, boolean z) {
        long j2 = this.f4366g;
        if (i2 <= 0) {
            return new C0162a(this.f4365f, j2);
        }
        if (this.f4366g == -1) {
            j2 = this.f4365f + ((long) i2);
        } else {
            long j3 = (long) i2;
            if (j3 < this.f4366g - this.f4365f) {
                j2 = this.f4365f + j3;
            } else if (!z) {
                j2 = -1;
            }
        }
        return new C0162a(this.f4365f, j2);
    }

    public String c() {
        return this.b + "," + this.c + "," + this.f4363d + "," + this.f4364e + "," + this.f4366g;
    }

    public String toString() {
        return "[" + this.b + "," + this.c + "," + this.f4363d + "," + this.f4364e + "," + this.f4365f + "," + this.f4366g + "]";
    }
}
