package g.e.b.l.j.l;

import com.google.auto.value.AutoValue;
import com.tencent.raft.measure.utils.MeasureConst;
import g.e.b.l.j.l.b;
import g.e.b.l.j.l.g;
import g.e.b.l.j.l.v;
import java.nio.charset.Charset;

@AutoValue
public abstract class a0 {
    public static final Charset a = Charset.forName(MeasureConst.CHARSET_UTF8);

    @AutoValue
    public static abstract class a {

        @AutoValue.Builder
        /* renamed from: g.e.b.l.j.l.a0$a$a  reason: collision with other inner class name */
        public static abstract class C0113a {
        }

        public abstract int a();

        public abstract int b();

        public abstract String c();

        public abstract long d();

        public abstract int e();

        public abstract long f();

        public abstract long g();

        public abstract String h();
    }

    @AutoValue.Builder
    public static abstract class b {
        public abstract a0 a();
    }

    @AutoValue
    public static abstract class c {
        public abstract String a();

        public abstract String b();
    }

    @AutoValue
    public static abstract class d {

        @AutoValue
        public static abstract class a {
            public abstract byte[] a();

            public abstract String b();
        }

        public abstract b0<a> a();

        public abstract String b();
    }

    @AutoValue
    public static abstract class e {

        @AutoValue
        public static abstract class a {

            @AutoValue
            /* renamed from: g.e.b.l.j.l.a0$e$a$a  reason: collision with other inner class name */
            public static abstract class C0114a {
                public abstract String a();
            }

            public abstract String a();

            public abstract String b();

            public abstract String c();

            public abstract String d();

            public abstract String e();

            public abstract C0114a f();

            public abstract String g();
        }

        @AutoValue.Builder
        public static abstract class b {
            public abstract e a();
        }

        @AutoValue
        public static abstract class c {

            @AutoValue.Builder
            public static abstract class a {
            }

            public abstract int a();

            public abstract int b();

            public abstract long c();

            public abstract String d();

            public abstract String e();

            public abstract String f();

            public abstract long g();

            public abstract int h();

            public abstract boolean i();
        }

        @AutoValue
        public static abstract class d {

            @AutoValue
            public static abstract class a {

                @AutoValue.Builder
                /* renamed from: g.e.b.l.j.l.a0$e$d$a$a  reason: collision with other inner class name */
                public static abstract class C0115a {
                }

                @AutoValue
                public static abstract class b {

                    @AutoValue
                    /* renamed from: g.e.b.l.j.l.a0$e$d$a$b$a  reason: collision with other inner class name */
                    public static abstract class C0116a {
                        public abstract long a();

                        public abstract String b();

                        public abstract long c();

                        public abstract String d();
                    }

                    @AutoValue
                    /* renamed from: g.e.b.l.j.l.a0$e$d$a$b$b  reason: collision with other inner class name */
                    public static abstract class C0117b {
                        public abstract C0117b a();

                        public abstract b0<C0118d.C0119a> b();

                        public abstract int c();

                        public abstract String d();

                        public abstract String e();
                    }

                    @AutoValue
                    public static abstract class c {
                        public abstract long a();

                        public abstract String b();

                        public abstract String c();
                    }

                    @AutoValue
                    /* renamed from: g.e.b.l.j.l.a0$e$d$a$b$d  reason: collision with other inner class name */
                    public static abstract class C0118d {

                        @AutoValue
                        /* renamed from: g.e.b.l.j.l.a0$e$d$a$b$d$a  reason: collision with other inner class name */
                        public static abstract class C0119a {

                            @AutoValue.Builder
                            /* renamed from: g.e.b.l.j.l.a0$e$d$a$b$d$a$a  reason: collision with other inner class name */
                            public static abstract class C0120a {
                            }

                            public abstract String a();

                            public abstract int b();

                            public abstract long c();

                            public abstract long d();

                            public abstract String e();
                        }

                        public abstract b0<C0119a> a();

                        public abstract int b();

                        public abstract String c();
                    }

                    public abstract a a();

                    public abstract b0<C0116a> b();

                    public abstract C0117b c();

                    public abstract c d();

                    public abstract b0<C0118d> e();
                }

                public abstract Boolean a();

                public abstract b0<c> b();

                public abstract b c();

                public abstract b0<c> d();

                public abstract int e();

                public abstract C0115a f();
            }

            @AutoValue.Builder
            public static abstract class b {
                public abstract d a();

                public abstract b b(a aVar);
            }

            @AutoValue
            public static abstract class c {

                @AutoValue.Builder
                public static abstract class a {
                }

                public abstract Double a();

                public abstract int b();

                public abstract long c();

                public abstract int d();

                public abstract long e();

                public abstract boolean f();
            }

            @AutoValue
            /* renamed from: g.e.b.l.j.l.a0$e$d$d  reason: collision with other inner class name */
            public static abstract class C0121d {
                public abstract String a();
            }

            public abstract a a();

            public abstract c b();

            public abstract C0121d c();

            public abstract long d();

            public abstract String e();

            public abstract b f();
        }

        @AutoValue
        /* renamed from: g.e.b.l.j.l.a0$e$e  reason: collision with other inner class name */
        public static abstract class C0122e {
            public abstract String a();

            public abstract int b();

            public abstract String c();

            public abstract boolean d();
        }

        @AutoValue
        public static abstract class f {
            public abstract String a();
        }

        public abstract a a();

        public abstract c b();

        public abstract Long c();

        public abstract b0<d> d();

        public abstract String e();

        public abstract int f();

        public abstract String g();

        public abstract C0122e h();

        public abstract long i();

        public abstract f j();

        public abstract boolean k();

        public abstract b l();
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract d e();

    public abstract int f();

    public abstract String g();

    public abstract e h();

    public abstract b i();

    public a0 j(long j2, boolean z, String str) {
        b i2 = i();
        e eVar = ((b) this).f3604h;
        if (eVar != null) {
            e.b l2 = eVar.l();
            g.b bVar = (g.b) l2;
            bVar.f3629d = Long.valueOf(j2);
            bVar.f3630e = Boolean.valueOf(z);
            if (str != null) {
                bVar.f3632g = new v(str, (v.a) null);
                bVar.a();
            }
            ((b.C0123b) i2).f3609g = l2.a();
        }
        return i2.a();
    }
}
