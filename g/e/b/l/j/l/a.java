package g.e.b.l.j.l;

import com.tencent.raft.codegenmeta.utils.Constants;
import g.e.b.l.j.l.a0;
import java.io.IOException;

public final class a implements g.e.b.n.h.a {
    public static final g.e.b.n.h.a a = new a();

    /* renamed from: g.e.b.l.j.l.a$a  reason: collision with other inner class name */
    public static final class C0112a implements g.e.b.n.d<a0.a> {
        public static final C0112a a = new C0112a();
        public static final g.e.b.n.c b = g.e.b.n.c.a("pid");
        public static final g.e.b.n.c c = g.e.b.n.c.a("processName");

        /* renamed from: d  reason: collision with root package name */
        public static final g.e.b.n.c f3542d = g.e.b.n.c.a("reasonCode");

        /* renamed from: e  reason: collision with root package name */
        public static final g.e.b.n.c f3543e = g.e.b.n.c.a("importance");

        /* renamed from: f  reason: collision with root package name */
        public static final g.e.b.n.c f3544f = g.e.b.n.c.a("pss");

        /* renamed from: g  reason: collision with root package name */
        public static final g.e.b.n.c f3545g = g.e.b.n.c.a("rss");

        /* renamed from: h  reason: collision with root package name */
        public static final g.e.b.n.c f3546h = g.e.b.n.c.a("timestamp");

        /* renamed from: i  reason: collision with root package name */
        public static final g.e.b.n.c f3547i = g.e.b.n.c.a("traceFile");

        public void a(Object obj, Object obj2) throws IOException {
            a0.a aVar = (a0.a) obj;
            g.e.b.n.e eVar = (g.e.b.n.e) obj2;
            eVar.c(b, aVar.b());
            eVar.f(c, aVar.c());
            eVar.c(f3542d, aVar.e());
            eVar.c(f3543e, aVar.a());
            eVar.b(f3544f, aVar.d());
            eVar.b(f3545g, aVar.f());
            eVar.b(f3546h, aVar.g());
            eVar.f(f3547i, aVar.h());
        }
    }

    public static final class b implements g.e.b.n.d<a0.c> {
        public static final b a = new b();
        public static final g.e.b.n.c b = g.e.b.n.c.a("key");
        public static final g.e.b.n.c c = g.e.b.n.c.a("value");

        public void a(Object obj, Object obj2) throws IOException {
            a0.c cVar = (a0.c) obj;
            g.e.b.n.e eVar = (g.e.b.n.e) obj2;
            eVar.f(b, cVar.a());
            eVar.f(c, cVar.b());
        }
    }

    public static final class c implements g.e.b.n.d<a0> {
        public static final c a = new c();
        public static final g.e.b.n.c b = g.e.b.n.c.a("sdkVersion");
        public static final g.e.b.n.c c = g.e.b.n.c.a("gmpAppId");

        /* renamed from: d  reason: collision with root package name */
        public static final g.e.b.n.c f3548d = g.e.b.n.c.a(Constants.Raft.PLATFORM);

        /* renamed from: e  reason: collision with root package name */
        public static final g.e.b.n.c f3549e = g.e.b.n.c.a("installationUuid");

        /* renamed from: f  reason: collision with root package name */
        public static final g.e.b.n.c f3550f = g.e.b.n.c.a("buildVersion");

        /* renamed from: g  reason: collision with root package name */
        public static final g.e.b.n.c f3551g = g.e.b.n.c.a("displayVersion");

        /* renamed from: h  reason: collision with root package name */
        public static final g.e.b.n.c f3552h = g.e.b.n.c.a("session");

        /* renamed from: i  reason: collision with root package name */
        public static final g.e.b.n.c f3553i = g.e.b.n.c.a("ndkPayload");

        public void a(Object obj, Object obj2) throws IOException {
            a0 a0Var = (a0) obj;
            g.e.b.n.e eVar = (g.e.b.n.e) obj2;
            eVar.f(b, a0Var.g());
            eVar.f(c, a0Var.c());
            eVar.c(f3548d, a0Var.f());
            eVar.f(f3549e, a0Var.d());
            eVar.f(f3550f, a0Var.a());
            eVar.f(f3551g, a0Var.b());
            eVar.f(f3552h, a0Var.h());
            eVar.f(f3553i, a0Var.e());
        }
    }

    public static final class d implements g.e.b.n.d<a0.d> {
        public static final d a = new d();
        public static final g.e.b.n.c b = g.e.b.n.c.a("files");
        public static final g.e.b.n.c c = g.e.b.n.c.a("orgId");

        public void a(Object obj, Object obj2) throws IOException {
            a0.d dVar = (a0.d) obj;
            g.e.b.n.e eVar = (g.e.b.n.e) obj2;
            eVar.f(b, dVar.a());
            eVar.f(c, dVar.b());
        }
    }

    public static final class e implements g.e.b.n.d<a0.d.a> {
        public static final e a = new e();
        public static final g.e.b.n.c b = g.e.b.n.c.a("filename");
        public static final g.e.b.n.c c = g.e.b.n.c.a("contents");

        public void a(Object obj, Object obj2) throws IOException {
            a0.d.a aVar = (a0.d.a) obj;
            g.e.b.n.e eVar = (g.e.b.n.e) obj2;
            eVar.f(b, aVar.b());
            eVar.f(c, aVar.a());
        }
    }

    public static final class f implements g.e.b.n.d<a0.e.a> {
        public static final f a = new f();
        public static final g.e.b.n.c b = g.e.b.n.c.a("identifier");
        public static final g.e.b.n.c c = g.e.b.n.c.a(Constants.Raft.VERSION);

        /* renamed from: d  reason: collision with root package name */
        public static final g.e.b.n.c f3554d = g.e.b.n.c.a("displayVersion");

        /* renamed from: e  reason: collision with root package name */
        public static final g.e.b.n.c f3555e = g.e.b.n.c.a("organization");

        /* renamed from: f  reason: collision with root package name */
        public static final g.e.b.n.c f3556f = g.e.b.n.c.a("installationUuid");

        /* renamed from: g  reason: collision with root package name */
        public static final g.e.b.n.c f3557g = g.e.b.n.c.a("developmentPlatform");

        /* renamed from: h  reason: collision with root package name */
        public static final g.e.b.n.c f3558h = g.e.b.n.c.a("developmentPlatformVersion");

        public void a(Object obj, Object obj2) throws IOException {
            a0.e.a aVar = (a0.e.a) obj;
            g.e.b.n.e eVar = (g.e.b.n.e) obj2;
            eVar.f(b, aVar.d());
            eVar.f(c, aVar.g());
            eVar.f(f3554d, aVar.c());
            eVar.f(f3555e, aVar.f());
            eVar.f(f3556f, aVar.e());
            eVar.f(f3557g, aVar.a());
            eVar.f(f3558h, aVar.b());
        }
    }

    public static final class g implements g.e.b.n.d<a0.e.a.C0114a> {
        public static final g a = new g();
        public static final g.e.b.n.c b = g.e.b.n.c.a("clsId");

        public void a(Object obj, Object obj2) throws IOException {
            ((g.e.b.n.e) obj2).f(b, ((a0.e.a.C0114a) obj).a());
        }
    }

    public static final class h implements g.e.b.n.d<a0.e.c> {
        public static final h a = new h();
        public static final g.e.b.n.c b = g.e.b.n.c.a("arch");
        public static final g.e.b.n.c c = g.e.b.n.c.a("model");

        /* renamed from: d  reason: collision with root package name */
        public static final g.e.b.n.c f3559d = g.e.b.n.c.a("cores");

        /* renamed from: e  reason: collision with root package name */
        public static final g.e.b.n.c f3560e = g.e.b.n.c.a("ram");

        /* renamed from: f  reason: collision with root package name */
        public static final g.e.b.n.c f3561f = g.e.b.n.c.a("diskSpace");

        /* renamed from: g  reason: collision with root package name */
        public static final g.e.b.n.c f3562g = g.e.b.n.c.a("simulator");

        /* renamed from: h  reason: collision with root package name */
        public static final g.e.b.n.c f3563h = g.e.b.n.c.a("state");

        /* renamed from: i  reason: collision with root package name */
        public static final g.e.b.n.c f3564i = g.e.b.n.c.a("manufacturer");

        /* renamed from: j  reason: collision with root package name */
        public static final g.e.b.n.c f3565j = g.e.b.n.c.a("modelClass");

        public void a(Object obj, Object obj2) throws IOException {
            a0.e.c cVar = (a0.e.c) obj;
            g.e.b.n.e eVar = (g.e.b.n.e) obj2;
            eVar.c(b, cVar.a());
            eVar.f(c, cVar.e());
            eVar.c(f3559d, cVar.b());
            eVar.b(f3560e, cVar.g());
            eVar.b(f3561f, cVar.c());
            eVar.a(f3562g, cVar.i());
            eVar.c(f3563h, cVar.h());
            eVar.f(f3564i, cVar.d());
            eVar.f(f3565j, cVar.f());
        }
    }

    public static final class i implements g.e.b.n.d<a0.e> {
        public static final i a = new i();
        public static final g.e.b.n.c b = g.e.b.n.c.a("generator");
        public static final g.e.b.n.c c = g.e.b.n.c.a("identifier");

        /* renamed from: d  reason: collision with root package name */
        public static final g.e.b.n.c f3566d = g.e.b.n.c.a("startedAt");

        /* renamed from: e  reason: collision with root package name */
        public static final g.e.b.n.c f3567e = g.e.b.n.c.a("endedAt");

        /* renamed from: f  reason: collision with root package name */
        public static final g.e.b.n.c f3568f = g.e.b.n.c.a("crashed");

        /* renamed from: g  reason: collision with root package name */
        public static final g.e.b.n.c f3569g = g.e.b.n.c.a("app");

        /* renamed from: h  reason: collision with root package name */
        public static final g.e.b.n.c f3570h = g.e.b.n.c.a("user");

        /* renamed from: i  reason: collision with root package name */
        public static final g.e.b.n.c f3571i = g.e.b.n.c.a("os");

        /* renamed from: j  reason: collision with root package name */
        public static final g.e.b.n.c f3572j = g.e.b.n.c.a("device");

        /* renamed from: k  reason: collision with root package name */
        public static final g.e.b.n.c f3573k = g.e.b.n.c.a("events");

        /* renamed from: l  reason: collision with root package name */
        public static final g.e.b.n.c f3574l = g.e.b.n.c.a("generatorType");

        public void a(Object obj, Object obj2) throws IOException {
            a0.e eVar = (a0.e) obj;
            g.e.b.n.e eVar2 = (g.e.b.n.e) obj2;
            eVar2.f(b, eVar.e());
            eVar2.f(c, eVar.g().getBytes(a0.a));
            eVar2.b(f3566d, eVar.i());
            eVar2.f(f3567e, eVar.c());
            eVar2.a(f3568f, eVar.k());
            eVar2.f(f3569g, eVar.a());
            eVar2.f(f3570h, eVar.j());
            eVar2.f(f3571i, eVar.h());
            eVar2.f(f3572j, eVar.b());
            eVar2.f(f3573k, eVar.d());
            eVar2.c(f3574l, eVar.f());
        }
    }

    public static final class j implements g.e.b.n.d<a0.e.d.a> {
        public static final j a = new j();
        public static final g.e.b.n.c b = g.e.b.n.c.a("execution");
        public static final g.e.b.n.c c = g.e.b.n.c.a("customAttributes");

        /* renamed from: d  reason: collision with root package name */
        public static final g.e.b.n.c f3575d = g.e.b.n.c.a("internalKeys");

        /* renamed from: e  reason: collision with root package name */
        public static final g.e.b.n.c f3576e = g.e.b.n.c.a("background");

        /* renamed from: f  reason: collision with root package name */
        public static final g.e.b.n.c f3577f = g.e.b.n.c.a("uiOrientation");

        public void a(Object obj, Object obj2) throws IOException {
            a0.e.d.a aVar = (a0.e.d.a) obj;
            g.e.b.n.e eVar = (g.e.b.n.e) obj2;
            eVar.f(b, aVar.c());
            eVar.f(c, aVar.b());
            eVar.f(f3575d, aVar.d());
            eVar.f(f3576e, aVar.a());
            eVar.c(f3577f, aVar.e());
        }
    }

    public static final class k implements g.e.b.n.d<a0.e.d.a.b.C0116a> {
        public static final k a = new k();
        public static final g.e.b.n.c b = g.e.b.n.c.a("baseAddress");
        public static final g.e.b.n.c c = g.e.b.n.c.a("size");

        /* renamed from: d  reason: collision with root package name */
        public static final g.e.b.n.c f3578d = g.e.b.n.c.a("name");

        /* renamed from: e  reason: collision with root package name */
        public static final g.e.b.n.c f3579e = g.e.b.n.c.a("uuid");

        public void a(Object obj, Object obj2) throws IOException {
            a0.e.d.a.b.C0116a aVar = (a0.e.d.a.b.C0116a) obj;
            g.e.b.n.e eVar = (g.e.b.n.e) obj2;
            eVar.b(b, aVar.a());
            eVar.b(c, aVar.c());
            eVar.f(f3578d, aVar.b());
            g.e.b.n.c cVar = f3579e;
            String d2 = aVar.d();
            eVar.f(cVar, d2 != null ? d2.getBytes(a0.a) : null);
        }
    }

    public static final class l implements g.e.b.n.d<a0.e.d.a.b> {
        public static final l a = new l();
        public static final g.e.b.n.c b = g.e.b.n.c.a("threads");
        public static final g.e.b.n.c c = g.e.b.n.c.a("exception");

        /* renamed from: d  reason: collision with root package name */
        public static final g.e.b.n.c f3580d = g.e.b.n.c.a("appExitInfo");

        /* renamed from: e  reason: collision with root package name */
        public static final g.e.b.n.c f3581e = g.e.b.n.c.a("signal");

        /* renamed from: f  reason: collision with root package name */
        public static final g.e.b.n.c f3582f = g.e.b.n.c.a("binaries");

        public void a(Object obj, Object obj2) throws IOException {
            a0.e.d.a.b bVar = (a0.e.d.a.b) obj;
            g.e.b.n.e eVar = (g.e.b.n.e) obj2;
            eVar.f(b, bVar.e());
            eVar.f(c, bVar.c());
            eVar.f(f3580d, bVar.a());
            eVar.f(f3581e, bVar.d());
            eVar.f(f3582f, bVar.b());
        }
    }

    public static final class m implements g.e.b.n.d<a0.e.d.a.b.C0117b> {
        public static final m a = new m();
        public static final g.e.b.n.c b = g.e.b.n.c.a("type");
        public static final g.e.b.n.c c = g.e.b.n.c.a("reason");

        /* renamed from: d  reason: collision with root package name */
        public static final g.e.b.n.c f3583d = g.e.b.n.c.a("frames");

        /* renamed from: e  reason: collision with root package name */
        public static final g.e.b.n.c f3584e = g.e.b.n.c.a("causedBy");

        /* renamed from: f  reason: collision with root package name */
        public static final g.e.b.n.c f3585f = g.e.b.n.c.a("overflowCount");

        public void a(Object obj, Object obj2) throws IOException {
            a0.e.d.a.b.C0117b bVar = (a0.e.d.a.b.C0117b) obj;
            g.e.b.n.e eVar = (g.e.b.n.e) obj2;
            eVar.f(b, bVar.e());
            eVar.f(c, bVar.d());
            eVar.f(f3583d, bVar.b());
            eVar.f(f3584e, bVar.a());
            eVar.c(f3585f, bVar.c());
        }
    }

    public static final class n implements g.e.b.n.d<a0.e.d.a.b.c> {
        public static final n a = new n();
        public static final g.e.b.n.c b = g.e.b.n.c.a("name");
        public static final g.e.b.n.c c = g.e.b.n.c.a("code");

        /* renamed from: d  reason: collision with root package name */
        public static final g.e.b.n.c f3586d = g.e.b.n.c.a("address");

        public void a(Object obj, Object obj2) throws IOException {
            a0.e.d.a.b.c cVar = (a0.e.d.a.b.c) obj;
            g.e.b.n.e eVar = (g.e.b.n.e) obj2;
            eVar.f(b, cVar.c());
            eVar.f(c, cVar.b());
            eVar.b(f3586d, cVar.a());
        }
    }

    public static final class o implements g.e.b.n.d<a0.e.d.a.b.C0118d> {
        public static final o a = new o();
        public static final g.e.b.n.c b = g.e.b.n.c.a("name");
        public static final g.e.b.n.c c = g.e.b.n.c.a("importance");

        /* renamed from: d  reason: collision with root package name */
        public static final g.e.b.n.c f3587d = g.e.b.n.c.a("frames");

        public void a(Object obj, Object obj2) throws IOException {
            a0.e.d.a.b.C0118d dVar = (a0.e.d.a.b.C0118d) obj;
            g.e.b.n.e eVar = (g.e.b.n.e) obj2;
            eVar.f(b, dVar.c());
            eVar.c(c, dVar.b());
            eVar.f(f3587d, dVar.a());
        }
    }

    public static final class p implements g.e.b.n.d<a0.e.d.a.b.C0118d.C0119a> {
        public static final p a = new p();
        public static final g.e.b.n.c b = g.e.b.n.c.a("pc");
        public static final g.e.b.n.c c = g.e.b.n.c.a("symbol");

        /* renamed from: d  reason: collision with root package name */
        public static final g.e.b.n.c f3588d = g.e.b.n.c.a("file");

        /* renamed from: e  reason: collision with root package name */
        public static final g.e.b.n.c f3589e = g.e.b.n.c.a("offset");

        /* renamed from: f  reason: collision with root package name */
        public static final g.e.b.n.c f3590f = g.e.b.n.c.a("importance");

        public void a(Object obj, Object obj2) throws IOException {
            a0.e.d.a.b.C0118d.C0119a aVar = (a0.e.d.a.b.C0118d.C0119a) obj;
            g.e.b.n.e eVar = (g.e.b.n.e) obj2;
            eVar.b(b, aVar.d());
            eVar.f(c, aVar.e());
            eVar.f(f3588d, aVar.a());
            eVar.b(f3589e, aVar.c());
            eVar.c(f3590f, aVar.b());
        }
    }

    public static final class q implements g.e.b.n.d<a0.e.d.c> {
        public static final q a = new q();
        public static final g.e.b.n.c b = g.e.b.n.c.a("batteryLevel");
        public static final g.e.b.n.c c = g.e.b.n.c.a("batteryVelocity");

        /* renamed from: d  reason: collision with root package name */
        public static final g.e.b.n.c f3591d = g.e.b.n.c.a("proximityOn");

        /* renamed from: e  reason: collision with root package name */
        public static final g.e.b.n.c f3592e = g.e.b.n.c.a("orientation");

        /* renamed from: f  reason: collision with root package name */
        public static final g.e.b.n.c f3593f = g.e.b.n.c.a("ramUsed");

        /* renamed from: g  reason: collision with root package name */
        public static final g.e.b.n.c f3594g = g.e.b.n.c.a("diskUsed");

        public void a(Object obj, Object obj2) throws IOException {
            a0.e.d.c cVar = (a0.e.d.c) obj;
            g.e.b.n.e eVar = (g.e.b.n.e) obj2;
            eVar.f(b, cVar.a());
            eVar.c(c, cVar.b());
            eVar.a(f3591d, cVar.f());
            eVar.c(f3592e, cVar.d());
            eVar.b(f3593f, cVar.e());
            eVar.b(f3594g, cVar.c());
        }
    }

    public static final class r implements g.e.b.n.d<a0.e.d> {
        public static final r a = new r();
        public static final g.e.b.n.c b = g.e.b.n.c.a("timestamp");
        public static final g.e.b.n.c c = g.e.b.n.c.a("type");

        /* renamed from: d  reason: collision with root package name */
        public static final g.e.b.n.c f3595d = g.e.b.n.c.a("app");

        /* renamed from: e  reason: collision with root package name */
        public static final g.e.b.n.c f3596e = g.e.b.n.c.a("device");

        /* renamed from: f  reason: collision with root package name */
        public static final g.e.b.n.c f3597f = g.e.b.n.c.a("log");

        public void a(Object obj, Object obj2) throws IOException {
            a0.e.d dVar = (a0.e.d) obj;
            g.e.b.n.e eVar = (g.e.b.n.e) obj2;
            eVar.b(b, dVar.d());
            eVar.f(c, dVar.e());
            eVar.f(f3595d, dVar.a());
            eVar.f(f3596e, dVar.b());
            eVar.f(f3597f, dVar.c());
        }
    }

    public static final class s implements g.e.b.n.d<a0.e.d.C0121d> {
        public static final s a = new s();
        public static final g.e.b.n.c b = g.e.b.n.c.a("content");

        public void a(Object obj, Object obj2) throws IOException {
            ((g.e.b.n.e) obj2).f(b, ((a0.e.d.C0121d) obj).a());
        }
    }

    public static final class t implements g.e.b.n.d<a0.e.C0122e> {
        public static final t a = new t();
        public static final g.e.b.n.c b = g.e.b.n.c.a(Constants.Raft.PLATFORM);
        public static final g.e.b.n.c c = g.e.b.n.c.a(Constants.Raft.VERSION);

        /* renamed from: d  reason: collision with root package name */
        public static final g.e.b.n.c f3598d = g.e.b.n.c.a("buildVersion");

        /* renamed from: e  reason: collision with root package name */
        public static final g.e.b.n.c f3599e = g.e.b.n.c.a("jailbroken");

        public void a(Object obj, Object obj2) throws IOException {
            a0.e.C0122e eVar = (a0.e.C0122e) obj;
            g.e.b.n.e eVar2 = (g.e.b.n.e) obj2;
            eVar2.c(b, eVar.b());
            eVar2.f(c, eVar.c());
            eVar2.f(f3598d, eVar.a());
            eVar2.a(f3599e, eVar.d());
        }
    }

    public static final class u implements g.e.b.n.d<a0.e.f> {
        public static final u a = new u();
        public static final g.e.b.n.c b = g.e.b.n.c.a("identifier");

        public void a(Object obj, Object obj2) throws IOException {
            ((g.e.b.n.e) obj2).f(b, ((a0.e.f) obj).a());
        }
    }

    public void a(g.e.b.n.h.b<?> bVar) {
        c cVar = c.a;
        bVar.a(a0.class, cVar);
        bVar.a(b.class, cVar);
        i iVar = i.a;
        bVar.a(a0.e.class, iVar);
        bVar.a(g.class, iVar);
        f fVar = f.a;
        bVar.a(a0.e.a.class, fVar);
        bVar.a(h.class, fVar);
        g gVar = g.a;
        bVar.a(a0.e.a.C0114a.class, gVar);
        bVar.a(i.class, gVar);
        u uVar = u.a;
        bVar.a(a0.e.f.class, uVar);
        bVar.a(v.class, uVar);
        t tVar = t.a;
        bVar.a(a0.e.C0122e.class, tVar);
        bVar.a(u.class, tVar);
        h hVar = h.a;
        bVar.a(a0.e.c.class, hVar);
        bVar.a(j.class, hVar);
        r rVar = r.a;
        bVar.a(a0.e.d.class, rVar);
        bVar.a(k.class, rVar);
        j jVar = j.a;
        bVar.a(a0.e.d.a.class, jVar);
        bVar.a(l.class, jVar);
        l lVar = l.a;
        bVar.a(a0.e.d.a.b.class, lVar);
        bVar.a(m.class, lVar);
        o oVar = o.a;
        bVar.a(a0.e.d.a.b.C0118d.class, oVar);
        bVar.a(q.class, oVar);
        p pVar = p.a;
        bVar.a(a0.e.d.a.b.C0118d.C0119a.class, pVar);
        bVar.a(r.class, pVar);
        m mVar = m.a;
        bVar.a(a0.e.d.a.b.C0117b.class, mVar);
        bVar.a(o.class, mVar);
        C0112a aVar = C0112a.a;
        bVar.a(a0.a.class, aVar);
        bVar.a(c.class, aVar);
        n nVar = n.a;
        bVar.a(a0.e.d.a.b.c.class, nVar);
        bVar.a(p.class, nVar);
        k kVar = k.a;
        bVar.a(a0.e.d.a.b.C0116a.class, kVar);
        bVar.a(n.class, kVar);
        b bVar2 = b.a;
        bVar.a(a0.c.class, bVar2);
        bVar.a(d.class, bVar2);
        q qVar = q.a;
        bVar.a(a0.e.d.c.class, qVar);
        bVar.a(s.class, qVar);
        s sVar = s.a;
        bVar.a(a0.e.d.C0121d.class, sVar);
        bVar.a(t.class, sVar);
        d dVar = d.a;
        bVar.a(a0.d.class, dVar);
        bVar.a(e.class, dVar);
        e eVar = e.a;
        bVar.a(a0.d.a.class, eVar);
        bVar.a(f.class, eVar);
    }
}
