package g.e.a.a.e.d;

import g.e.b.n.c;
import g.e.b.n.d;
import java.io.IOException;

public final class e implements d<q> {
    public static final e a = new e();
    public static final c b = c.a("eventTimeMs");
    public static final c c = c.a("eventCode");

    /* renamed from: d  reason: collision with root package name */
    public static final c f2696d = c.a("eventUptimeMs");

    /* renamed from: e  reason: collision with root package name */
    public static final c f2697e = c.a("sourceExtension");

    /* renamed from: f  reason: collision with root package name */
    public static final c f2698f = c.a("sourceExtensionJsonProto3");

    /* renamed from: g  reason: collision with root package name */
    public static final c f2699g = c.a("timezoneOffsetSeconds");

    /* renamed from: h  reason: collision with root package name */
    public static final c f2700h = c.a("networkConnectionInfo");

    public void a(Object obj, Object obj2) throws IOException {
        q qVar = (q) obj;
        g.e.b.n.e eVar = (g.e.b.n.e) obj2;
        eVar.b(b, qVar.b());
        eVar.f(c, qVar.a());
        eVar.b(f2696d, qVar.c());
        eVar.f(f2697e, qVar.e());
        eVar.f(f2698f, qVar.f());
        eVar.b(f2699g, qVar.g());
        eVar.f(f2700h, qVar.d());
    }
}
