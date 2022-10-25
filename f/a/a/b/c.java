package f.a.a.b;

import f.a.a.b.o.a;
import f.a.a.b.w.j;
import f.a.a.b.x.d;
import f.a.a.b.x.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class c {
    public int a = 0;
    public final List<d> b = new ArrayList();
    public final a<d> c = new a<>(150);

    /* renamed from: d  reason: collision with root package name */
    public final j f1681d = new j();

    /* renamed from: e  reason: collision with root package name */
    public int f1682e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final List<f> f1683f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final j f1684g = new j();

    public void a(d dVar) {
        synchronized (this.f1684g) {
            for (f i2 : this.f1683f) {
                i2.i(dVar);
            }
        }
        this.a++;
        if (dVar.getLevel() > this.f1682e) {
            this.f1682e = dVar.getLevel();
        }
        synchronized (this.f1681d) {
            if (this.b.size() < 150) {
                this.b.add(dVar);
            } else {
                a<d> aVar = this.c;
                E[] eArr = aVar.a;
                int i3 = aVar.c;
                eArr[i3] = dVar;
                int i4 = i3 + 1;
                aVar.c = i4;
                int i5 = aVar.f1705e;
                if (i4 == i5) {
                    aVar.c = 0;
                }
                int i6 = aVar.f1704d;
                if (i6 < i5) {
                    aVar.f1704d = i6 + 1;
                } else {
                    int i7 = aVar.b + 1;
                    aVar.b = i7;
                    if (i7 == i5) {
                        aVar.b = 0;
                    }
                }
            }
        }
    }

    public boolean b(f fVar) {
        boolean z;
        synchronized (this.f1684g) {
            if (fVar instanceof f.a.a.b.x.c) {
                List<f> list = this.f1683f;
                Class<?> cls = fVar.getClass();
                Iterator<f> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().getClass() == cls) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return false;
                }
            }
            this.f1683f.add(fVar);
            return true;
        }
    }

    public List<d> c() {
        ArrayList arrayList;
        E e2;
        synchronized (this.f1681d) {
            arrayList = new ArrayList(this.b);
            a<d> aVar = this.c;
            Objects.requireNonNull(aVar);
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            while (true) {
                int i3 = aVar.f1704d;
                if (i2 < i3) {
                    if (i2 >= 0) {
                        if (i2 < i3) {
                            e2 = aVar.a[(aVar.b + i2) % aVar.f1705e];
                            arrayList2.add(e2);
                            i2++;
                        }
                    }
                    e2 = null;
                    arrayList2.add(e2);
                    i2++;
                } else {
                    arrayList.addAll(arrayList2);
                }
            }
        }
        return arrayList;
    }
}
