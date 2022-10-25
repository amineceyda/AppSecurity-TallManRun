package g.i.c.a.a;

import g.i.c.a.a.b0.d;
import g.i.c.a.a.k.b;
import g.i.c.a.a.k.e;
import g.i.c.a.a.r.c;
import java.util.Objects;
import org.slf4j.helpers.MessageFormatter;

public class a {
    public static final c w = new c();
    public static final C0163a x = new C0163a();
    public static volatile a y;
    public boolean a;
    public boolean b;
    public long c;

    /* renamed from: d  reason: collision with root package name */
    public long f4388d;

    /* renamed from: e  reason: collision with root package name */
    public double f4389e;

    /* renamed from: f  reason: collision with root package name */
    public long f4390f;

    /* renamed from: g  reason: collision with root package name */
    public double f4391g;

    /* renamed from: h  reason: collision with root package name */
    public long f4392h;
    @Deprecated

    /* renamed from: i  reason: collision with root package name */
    public e f4393i;

    /* renamed from: j  reason: collision with root package name */
    public g.i.c.a.a.k.a f4394j;

    /* renamed from: k  reason: collision with root package name */
    public g.i.c.a.a.k.c f4395k;

    /* renamed from: l  reason: collision with root package name */
    public b f4396l;

    /* renamed from: m  reason: collision with root package name */
    public g.i.c.a.a.k.c f4397m;
    public b n;
    public c o;
    public d p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;

    /* renamed from: g.i.c.a.a.a$a  reason: collision with other inner class name */
    public static class C0163a {
        public long a = 900000;
        public g.i.c.a.a.k.a b = g.i.c.a.a.k.a.REPORT_ALL;
        public g.i.c.a.a.k.c c = g.i.c.a.a.k.c.REPORT_FIRST;

        /* renamed from: d  reason: collision with root package name */
        public b f4398d = b.REPORT_NONE;

        /* renamed from: e  reason: collision with root package name */
        public c f4399e = a.w;

        /* renamed from: f  reason: collision with root package name */
        public d f4400f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f4401g = false;

        /* renamed from: h  reason: collision with root package name */
        public int f4402h = 60;

        /* renamed from: i  reason: collision with root package name */
        public int f4403i = 5;

        /* renamed from: j  reason: collision with root package name */
        public int f4404j = 60;

        /* renamed from: k  reason: collision with root package name */
        public int f4405k = 5;

        /* renamed from: l  reason: collision with root package name */
        public int f4406l = 300;

        /* renamed from: m  reason: collision with root package name */
        public boolean f4407m = false;
    }

    public a() {
        this(x);
    }

    public a(C0163a aVar) {
        Objects.requireNonNull(aVar);
        this.a = true;
        this.b = true;
        this.c = aVar.a;
        this.f4388d = 200;
        this.f4389e = 0.4d;
        this.f4390f = 200;
        this.f4391g = 0.01d;
        this.f4392h = 500;
        this.f4393i = e.REPORT_POLICY_ALL;
        this.f4394j = aVar.b;
        this.f4395k = aVar.c;
        this.f4397m = g.i.c.a.a.k.c.REPORT_FIRST;
        this.n = b.REPORT_NONE;
        this.f4396l = aVar.f4398d;
        this.o = aVar.f4399e;
        d dVar = aVar.f4400f;
        this.p = dVar == null ? new g.i.c.a.a.n.e.b() : dVar;
        this.q = aVar.f4401g;
        this.r = aVar.f4402h;
        this.s = aVar.f4403i;
        this.t = aVar.f4404j;
        this.u = aVar.f4405k;
        this.v = aVar.f4407m;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("Configuration{mDefaultReportEnable=");
        i2.append(this.a);
        i2.append(", mDefaultDataCollectEnable=");
        i2.append(this.b);
        i2.append(", mVisitBackgroundTime=");
        i2.append(this.c);
        i2.append(", mPageExposureMinTime=");
        i2.append(this.f4388d);
        i2.append(", mPageExposureMinRate=");
        i2.append(this.f4389e);
        i2.append(", mElementExposureMinTime=");
        i2.append(this.f4390f);
        i2.append(", mElementExposureMinRate=");
        i2.append(this.f4391g);
        i2.append(", mElementReportPolicy=");
        i2.append(this.f4393i.name());
        i2.append(", mElementClickPolicy=");
        i2.append(this.f4394j);
        i2.append(", mElementExposePolicy=");
        i2.append(this.f4395k);
        i2.append(", mElementEndExposePolicy=");
        i2.append(this.f4396l);
        i2.append(", mLogger=");
        c cVar = this.o;
        i2.append(cVar != null ? cVar.getClass().getName() : "null");
        i2.append(", mElementDetectEnable=");
        i2.append(false);
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
