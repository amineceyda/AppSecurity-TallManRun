package g.c.b.b.j;

import android.view.View;
import g.c.b.b.i.c;
import i.o.c.f;
import i.o.c.h;
import java.util.Locale;
import java.util.Map;

public final class b {
    public final int a;
    public final int b;
    public final Locale c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2279d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2280e;

    /* renamed from: f  reason: collision with root package name */
    public final View f2281f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2282g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2283h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2284i;

    /* renamed from: j  reason: collision with root package name */
    public final c f2285j;

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, String> f2286k;

    public static final class a {
        public int a = 4;
        public int b = 3;
        public Locale c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2287d;

        /* renamed from: e  reason: collision with root package name */
        public int f2288e;

        /* renamed from: f  reason: collision with root package name */
        public View f2289f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2290g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2291h;

        /* renamed from: i  reason: collision with root package name */
        public c f2292i;

        /* renamed from: j  reason: collision with root package name */
        public int f2293j;

        /* renamed from: k  reason: collision with root package name */
        public Map<String, String> f2294k;

        public a() {
            Locale locale = Locale.ENGLISH;
            h.d(locale, "ENGLISH");
            this.c = locale;
            this.f2288e = 2131886549;
            this.f2291h = true;
        }

        public final b a() {
            return new b(this, (f) null);
        }

        public final a b(c cVar) {
            h.e(cVar, "installListener");
            this.f2292i = cVar;
            return this;
        }

        public final a c(Locale locale) {
            h.e(locale, "locale");
            this.c = locale;
            return this;
        }
    }

    public b(a aVar, f fVar) {
        int i2 = aVar.a;
        int i3 = aVar.b;
        Locale locale = aVar.c;
        boolean z = aVar.f2287d;
        int i4 = aVar.f2288e;
        View view = aVar.f2289f;
        boolean z2 = aVar.f2290g;
        boolean z3 = aVar.f2291h;
        int i5 = aVar.f2293j;
        c cVar = aVar.f2292i;
        Map<String, String> map = aVar.f2294k;
        this.a = i2;
        this.b = i3;
        this.c = locale;
        this.f2279d = z;
        this.f2280e = i4;
        this.f2281f = view;
        this.f2282g = z2;
        this.f2283h = z3;
        this.f2284i = i5;
        this.f2285j = cVar;
        this.f2286k = map;
    }
}
