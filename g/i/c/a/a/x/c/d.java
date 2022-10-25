package g.i.c.a.a.x.c;

public class d implements Runnable {
    public final /* synthetic */ Class b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f4552d;

    public d(g gVar, Class cls, String str) {
        this.f4552d = gVar;
        this.b = cls;
        this.c = str;
    }

    public void run() {
        h hVar = this.f4552d.a;
        Class cls = this.b;
        String str = this.c;
        hVar.a().delete("datong_storage", h.b("class_id", hVar.a.a(cls)) + " and " + h.b("object_id", str), (String[]) null);
    }
}
