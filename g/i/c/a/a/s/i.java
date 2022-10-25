package g.i.c.a.a.s;

import android.view.View;
import g.a.a.a.a;
import g.i.c.a.a.l.b;
import g.i.c.a.a.l.c;
import g.i.c.a.a.r.e;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class i {
    public WeakReference<Object> a;
    public WeakReference<View> b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public i f4502d;

    public i(Object obj, View view) {
        this.a = new WeakReference<>(obj);
        this.b = new WeakReference<>(view);
        this.c = obj.hashCode();
    }

    public static Set<i> d(i iVar) {
        HashSet hashSet = new HashSet();
        while (iVar != null) {
            hashSet.add(iVar);
            iVar = iVar.f4502d;
        }
        return hashSet;
    }

    public Set<i> a(i iVar) {
        Set<i> d2 = d(iVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean equals = equals(iVar);
        for (i iVar2 = this; iVar2 != null; iVar2 = iVar2.f4502d) {
            if (equals || !((HashSet) d2).contains(iVar2)) {
                linkedHashSet.add(iVar2);
            }
        }
        return linkedHashSet;
    }

    public Set<i> b(i iVar) {
        Set<i> d2 = d(this);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = this == iVar;
        while (iVar != null) {
            if (z || !((HashSet) d2).contains(iVar)) {
                linkedHashSet.add(iVar);
            }
            iVar = iVar.f4502d;
        }
        return linkedHashSet;
    }

    public Object c() {
        return this.a.get();
    }

    public View e() {
        return (View) this.b.get();
    }

    public boolean equals(Object obj) {
        return obj instanceof i ? this.c == ((i) obj).c : super.equals(obj);
    }

    public int hashCode() {
        WeakReference<Object> weakReference = this.a;
        if (!(weakReference == null || this.b == null)) {
            Object obj = weakReference.get();
            View view = (View) this.b.get();
            if (!(obj == null || view == null)) {
                return view.hashCode() + obj.hashCode();
            }
        }
        return super.hashCode();
    }

    public String toString() {
        String str;
        b a2;
        if (!e.b.a.a) {
            return super.toString();
        }
        StringBuilder i2 = a.i("\n  size = ");
        i2.append(((HashSet) d(this)).size());
        for (i iVar = this; iVar != null; iVar = iVar.f4502d) {
            Object c2 = iVar.c();
            String str2 = "_null_page_";
            String f2 = c2 == null ? str2 : c.f(c2);
            if (c2 != null) {
                str2 = g.h.a.a.v(c.a(c2, false));
            }
            Map<String, Object> map = null;
            if (!(c2 == null || (a2 = c.a(c2, false)) == null)) {
                map = a2.f4458h;
            }
            if (map == null) {
                str = "_null_params_";
            } else {
                str = map.toString();
            }
            i2.append("\n pageId = ");
            i2.append(f2);
            i2.append(", contentId = ");
            i2.append(str2);
            i2.append(", pageParams = ");
            i2.append(str);
            i2.append(", page = ");
            i2.append(c2);
            i2.append(", pageView = ");
            i2.append(iVar.e());
            i2.append("\n");
        }
        return i2.toString();
    }
}
