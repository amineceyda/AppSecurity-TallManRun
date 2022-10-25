package f.a.a.a.i;

import f.a.a.a.l.c;

public abstract class t extends e {

    /* renamed from: g  reason: collision with root package name */
    public a f1647g = null;

    public String h(Object obj) {
        String n = n((c) obj);
        a aVar = this.f1647g;
        return aVar == null ? n : aVar.a(n);
    }

    public abstract String n(c cVar);

    public void start() {
        String m2 = m();
        if (m2 != null) {
            try {
                int parseInt = Integer.parseInt(m2);
                if (parseInt == 0) {
                    this.f1647g = new c();
                } else if (parseInt > 0) {
                    this.f1647g = new y(parseInt);
                }
            } catch (NumberFormatException unused) {
            }
        }
    }
}
