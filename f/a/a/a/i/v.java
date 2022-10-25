package f.a.a.a.i;

import f.a.a.a.l.c;

public final class v extends e {

    /* renamed from: g  reason: collision with root package name */
    public String f1648g;

    public String h(Object obj) {
        c cVar = (c) obj;
        if (this.f1648g == null) {
            return "Property_HAS_NO_KEY";
        }
        String str = cVar.e().propertyMap.get(this.f1648g);
        return str != null ? str : System.getProperty(this.f1648g);
    }

    public void start() {
        String m2 = m();
        if (m2 != null) {
            this.f1648g = m2;
            this.f1760f = true;
        }
    }
}
