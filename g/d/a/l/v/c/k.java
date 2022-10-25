package g.d.a.l.v.c;

import g.d.a.l.m;

public abstract class k {
    public static final k a = new c();
    public static final k b = new a();
    public static final k c;

    /* renamed from: d  reason: collision with root package name */
    public static final k f2579d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static final k f2580e;

    /* renamed from: f  reason: collision with root package name */
    public static final m<k> f2581f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f2582g = true;

    public static class a extends k {
        public e a(int i2, int i3, int i4, int i5) {
            e eVar = e.QUALITY;
            return (b(i2, i3, i4, i5) != 1.0f && !k.f2582g) ? e.MEMORY : eVar;
        }

        public float b(int i2, int i3, int i4, int i5) {
            return Math.min(1.0f, k.a.b(i2, i3, i4, i5));
        }
    }

    public static class b extends k {
        public e a(int i2, int i3, int i4, int i5) {
            return e.QUALITY;
        }

        public float b(int i2, int i3, int i4, int i5) {
            return Math.max(((float) i4) / ((float) i2), ((float) i5) / ((float) i3));
        }
    }

    public static class c extends k {
        public e a(int i2, int i3, int i4, int i5) {
            return k.f2582g ? e.QUALITY : e.MEMORY;
        }

        public float b(int i2, int i3, int i4, int i5) {
            if (k.f2582g) {
                return Math.min(((float) i4) / ((float) i2), ((float) i5) / ((float) i3));
            }
            int max = Math.max(i3 / i5, i2 / i4);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    public static class d extends k {
        public e a(int i2, int i3, int i4, int i5) {
            return e.QUALITY;
        }

        public float b(int i2, int i3, int i4, int i5) {
            return 1.0f;
        }
    }

    public enum e {
        MEMORY,
        QUALITY
    }

    static {
        b bVar = new b();
        c = bVar;
        f2580e = bVar;
        f2581f = m.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", bVar);
    }

    public abstract e a(int i2, int i3, int i4, int i5);

    public abstract float b(int i2, int i3, int i4, int i5);
}
