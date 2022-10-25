package g.i.c.a.a.t.k;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import g.i.c.a.a.a0.f;
import g.i.c.a.a.b0.c;
import g.i.c.a.a.b0.e;
import g.i.c.a.a.g.b;
import g.i.c.a.a.r.e;
import g.i.c.a.a.s.i;
import g.i.c.a.a.s.n;
import g.i.c.a.a.t.a;
import g.i.c.a.a.t.k.h;
import g.i.c.a.a.t.k.i;
import g.i.c.a.a.t.k.k;
import g.i.c.a.a.u.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class d implements n.b, a.d {
    public i a = h.a.a;
    public k b = new k();
    public List<f> c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final Map<Long, String> f4530d = new e.d.a();

    /* renamed from: e  reason: collision with root package name */
    public i f4531e;

    /* renamed from: f  reason: collision with root package name */
    public g.i.c.a.a.b0.e<j> f4532f = new g.i.c.a.a.b0.e<>();

    /* renamed from: g  reason: collision with root package name */
    public final e.b<j> f4533g = new a(this);

    /* renamed from: h  reason: collision with root package name */
    public g.i.c.a.a.b0.c f4534h = new g.i.c.a.a.b0.c();

    /* renamed from: i  reason: collision with root package name */
    public b f4535i = new b();

    public class a implements e.b<j> {
        public a(d dVar) {
        }

        public void a(Object obj) {
            ((j) obj).a();
        }
    }

    public class b extends c.b {
        public i b;

        public b() {
        }

        public void a(int i2) {
            List list;
            boolean z;
            int i3;
            List<f> list2;
            Long l2;
            d dVar = d.this;
            i iVar = this.b;
            Objects.requireNonNull(dVar);
            g.i.c.a.a.z.a.a("ElementExposureReporter.elementReport");
            System.currentTimeMillis();
            View e2 = iVar.e();
            if (e2 != null) {
                Rect rect = new Rect();
                if (!e2.getGlobalVisibleRect(rect)) {
                    rect = null;
                }
                dVar.f4531e = iVar;
                View rootView = e2.getRootView();
                Activity a = g.i.c.a.a.b0.n.a(e2);
                if (a == null) {
                    list = Collections.singletonList(rootView);
                } else {
                    List<WeakReference<Dialog>> b2 = g.i.c.a.a.s.a.b(a);
                    LinkedList linkedList = new LinkedList();
                    if (b2 != null) {
                        int size = b2.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            }
                            WeakReference weakReference = b2.get(size);
                            Dialog dialog = weakReference == null ? null : (Dialog) weakReference.get();
                            if (!(dialog == null || dialog.getWindow() == null)) {
                                View decorView = dialog.getWindow().getDecorView();
                                if (decorView == rootView) {
                                    break;
                                }
                                linkedList.add(decorView);
                            }
                        }
                    }
                    linkedList.add(rootView);
                    list = new ArrayList(linkedList);
                }
                long j2 = -e.b.a.d().f4388d;
                dVar.c.clear();
                dVar.f4530d.clear();
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    z = true;
                    if (i5 >= list.size()) {
                        break;
                    }
                    View view = (View) list.get(i5);
                    Rect rect2 = i5 == list.size() - 1 ? rect : null;
                    g.i.c.a.a.z.a.a("ElementExposureReporter.detect");
                    i iVar2 = dVar.f4531e;
                    if (iVar2 != null && view == iVar2.e()) {
                        rect2 = null;
                    }
                    HashSet hashSet = new HashSet();
                    dVar.f(view, hashSet);
                    g.h.a.a.t(view, true, new c(rect2, hashSet), f.a.a);
                    g.i.c.a.a.z.a.b("ElementExposureReporter.detect");
                    i5++;
                }
                g.i.c.a.a.r.e eVar = e.b.a;
                if (eVar.a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("run: delayDelta = ");
                    sb.append(j2);
                    sb.append(", ");
                    List<f> list3 = dVar.c;
                    sb.append(list3 == null ? 0 : list3.size());
                    sb.append(" exposed view found");
                    g.c.b.b.f.w("ElementExposureReporter", sb.toString());
                }
                if (eVar.a) {
                    HashMap hashMap = new HashMap(dVar.f4530d);
                    StringBuilder i6 = g.a.a.a.a.i("run: new exposed view: count = ");
                    i6.append(dVar.c.size());
                    g.c.b.b.f.w("ElementExposureReporter", i6.toString());
                    for (f next : dVar.c) {
                        StringBuilder i7 = g.a.a.a.a.i("    identifier: ");
                        i7.append(next.f4538e);
                        i7.append(", uniqueId = ");
                        i7.append(next.f4539f);
                        g.c.b.b.f.w("ElementExposureReporter", i7.toString());
                        hashMap.remove(Long.valueOf(next.f4539f));
                    }
                    StringBuilder i8 = g.a.a.a.a.i("run: duplicate exposed view: count = ");
                    i8.append(hashMap.size());
                    g.c.b.b.f.w("ElementExposureReporter", i8.toString());
                    for (Map.Entry entry : hashMap.entrySet()) {
                        StringBuilder i9 = g.a.a.a.a.i("    identifier: ");
                        i9.append((String) entry.getValue());
                        i9.append(", uniqueId: ");
                        i9.append(entry.getKey());
                        g.c.b.b.f.w("ElementExposureReporter", i9.toString());
                    }
                    g.c.b.b.f.w("ElementExposureReporter", "run: ---------------");
                }
                Set<Long> keySet = dVar.f4530d.keySet();
                HashSet hashSet2 = new HashSet();
                for (Long next2 : ((h) dVar.a).b.keySet()) {
                    if (next2 != null && !keySet.contains(next2)) {
                        hashSet2.add(next2);
                    }
                }
                ((h) dVar.a).b(hashSet2);
                if (hashSet2.size() <= 0) {
                    z = false;
                }
                k kVar = dVar.b;
                List<f> list4 = dVar.c;
                Objects.requireNonNull(kVar);
                if (list4 != null) {
                    kVar.b.clear();
                    int size2 = list4.size();
                    while (i4 < size2) {
                        f fVar = list4.get(i4);
                        View b3 = fVar.b();
                        g.i.c.a.a.u.c cVar = list4.get(i4).f4537d;
                        if (b3 == null || cVar == null) {
                            list2 = list4;
                            i3 = size2;
                        } else {
                            g.i.c.a.a.l.b a2 = g.i.c.a.a.l.a.a(b3);
                            long j3 = e.b.a.d().f4390f;
                            if (!(a2 == null || (l2 = (Long) g.h.a.a.C(a2, "element_exposure_min_time")) == null)) {
                                j3 = l2.longValue();
                            }
                            list2 = list4;
                            i3 = size2;
                            long max = Math.max(0, j3 + j2);
                            k.c cVar2 = kVar.b.get(Long.valueOf(max));
                            if (cVar2 == null) {
                                cVar2 = new k.c((k.a) null);
                                kVar.b.put(Long.valueOf(max), cVar2);
                            }
                            cVar2.b.add(fVar);
                        }
                        i4++;
                        size2 = i3;
                        list4 = list2;
                    }
                    if (e.b.a.a) {
                        StringBuilder i10 = g.a.a.a.a.i("enqueue: mPendingTasks.size() = ");
                        i10.append(kVar.b.size());
                        g.c.b.b.f.w("PendingQueue", i10.toString());
                    }
                    for (Map.Entry next3 : kVar.b.entrySet()) {
                        Long l3 = (Long) next3.getKey();
                        k.c cVar3 = (k.c) next3.getValue();
                        if (e.b.a.a) {
                            g.c.b.b.f.w("PendingQueue", "enqueue: delay = " + l3 + ", view count = " + cVar3.b.size());
                        }
                        kVar.a.postDelayed(cVar3, l3.longValue());
                    }
                }
                if (!z) {
                    dVar.c.size();
                }
                dVar.c.clear();
                dVar.f4530d.clear();
                dVar.f4532f.b(dVar.f4533g);
                g.i.c.a.a.z.a.b("ElementExposureReporter.elementReport");
                System.currentTimeMillis();
                Objects.requireNonNull(b.a.a);
            }
        }
    }

    public class c implements g.i.c.a.a.o.e<e> {
        public Set<View> a;
        public Rect b;

        public c(Rect rect, Set<View> set) {
            this.a = set;
            this.b = rect;
        }

        public void a(View view, g.i.c.a.a.o.c cVar, g.i.c.a.a.o.b bVar) {
            e eVar = (e) cVar;
            g.i.c.a.a.l.b a2 = g.i.c.a.a.l.a.a(view);
            if (a2 != null && !TextUtils.isEmpty(g.h.a.a.y(a2))) {
                Object e2 = g.i.c.a.a.l.c.e(view, "element_identifier");
                String str = e2 instanceof String ? (String) e2 : null;
                long a3 = g.i.c.a.a.b0.f.a(view);
                g.i.c.a.a.u.d f2 = f(eVar, view, a2);
                if (f2 != null) {
                    if (d.e(d.this, a3)) {
                        f fVar = new f();
                        fVar.a = new WeakReference<>(view);
                        fVar.b = new WeakReference<>(f2.b());
                        fVar.f4538e = str;
                        fVar.f4539f = a3;
                        fVar.c = f2;
                        fVar.f4540g = l.e(fVar.a(), str, view, false);
                        g.i.c.a.a.u.c a4 = a.b.a.a("imp", f2);
                        if (a4 != null) {
                            a4.a = "imp";
                            a4.b = g.i.c.a.a.l.c.c(view);
                        }
                        fVar.f4537d = a4;
                        d.this.c.add(fVar);
                    }
                    ((h) d.this.a).c(a3, bVar);
                    Object b2 = f2.b();
                    a w = g.h.a.a.w(b2, view, str, false);
                    if (w == null) {
                        w = new a();
                        g.h.a.a.U(b2, view, str, w, false);
                    }
                    if (w.a()) {
                        w.b = false;
                    }
                    w.a = SystemClock.elapsedRealtime();
                    d.this.f4530d.put(Long.valueOf(a3), str);
                }
            }
        }

        public void b(View view, g.i.c.a.a.o.c cVar) {
            e eVar = (e) cVar;
        }

        public g.i.c.a.a.o.c c() {
            return new e();
        }

        public boolean d(View view, g.i.c.a.a.o.c cVar) {
            e eVar = (e) cVar;
            i iVar = d.this.f4531e;
            if (iVar != null && view == iVar.e()) {
                this.b = null;
            }
            Boolean bool = (Boolean) g.i.c.a.a.l.c.e(view, "element_detection_enable");
            if (bool != null) {
                return bool.booleanValue();
            }
            Set<View> set = this.a;
            return set != null && set.contains(view);
        }

        public Rect e() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
            if (g.h.a.a.s(r7) != false) goto L_0x005c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final g.i.c.a.a.u.d f(g.i.c.a.a.t.k.d.e r5, android.view.View r6, g.i.c.a.a.l.b r7) {
            /*
                r4 = this;
                java.util.Map<android.view.View, g.i.c.a.a.u.d> r0 = r5.f4536f
                boolean r0 = r0.containsKey(r6)
                if (r0 == 0) goto L_0x0011
                java.util.Map<android.view.View, g.i.c.a.a.u.d> r5 = r5.f4536f
                java.lang.Object r5 = r5.get(r6)
                g.i.c.a.a.u.d r5 = (g.i.c.a.a.u.d) r5
                return r5
            L_0x0011:
                g.i.c.a.a.s.i r0 = e.e.i.b.m(r6)
                if (r0 == 0) goto L_0x002e
                g.i.c.a.a.u.d r1 = new g.i.c.a.a.u.d
                r1.<init>()
                java.lang.Object r0 = r0.c()
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r0)
                r1.b = r2
                boolean r0 = g.h.a.a.s(r7)
                if (r0 == 0) goto L_0x0061
                goto L_0x005c
            L_0x002e:
                r0 = r6
                r1 = r7
            L_0x0030:
                android.view.View r0 = g.i.c.a.a.t.k.l.b(r0, r1)
                r1 = 0
                if (r0 != 0) goto L_0x0039
                r0 = r1
                goto L_0x004a
            L_0x0039:
                g.i.c.a.a.l.b r2 = g.i.c.a.a.l.a.a(r0)
                boolean r3 = g.h.a.a.s(r2)
                if (r3 == 0) goto L_0x0044
                goto L_0x004a
            L_0x0044:
                g.i.c.a.a.s.i r3 = e.e.i.b.m(r0)
                if (r3 == 0) goto L_0x0067
            L_0x004a:
                if (r0 != 0) goto L_0x004d
                goto L_0x0061
            L_0x004d:
                g.i.c.a.a.l.b r2 = g.i.c.a.a.l.a.a(r0)
                g.i.c.a.a.u.d r0 = r4.f(r5, r0, r2)
                if (r0 == 0) goto L_0x0061
                g.i.c.a.a.u.d r0 = r0.a()
                r1 = r0
            L_0x005c:
                java.util.Deque<g.i.c.a.a.l.b> r0 = r1.a
                r0.addFirst(r7)
            L_0x0061:
                java.util.Map<android.view.View, g.i.c.a.a.u.d> r5 = r5.f4536f
                r5.put(r6, r1)
                return r1
            L_0x0067:
                r1 = r2
                goto L_0x0030
            */
            throw new UnsupportedOperationException("Method not decompiled: g.i.c.a.a.t.k.d.c.f(g.i.c.a.a.t.k.d$e, android.view.View, g.i.c.a.a.l.b):g.i.c.a.a.u.d");
        }
    }

    /* renamed from: g.i.c.a.a.t.k.d$d  reason: collision with other inner class name */
    public static class C0179d {
        public static final d a;

        static {
            d dVar = new d((a) null);
            a = dVar;
            Objects.requireNonNull(dVar);
            n.d.a.f4507g.a(dVar);
            a.e.a.s.a(dVar);
            dVar.b.c = new e(dVar);
        }
    }

    public static class e extends g.i.c.a.a.o.c {

        /* renamed from: f  reason: collision with root package name */
        public final Map<View, g.i.c.a.a.u.d> f4536f = new e.d.a();
    }

    public d(a aVar) {
    }

    public static boolean e(d dVar, long j2) {
        boolean containsKey = ((h) dVar.a).a.containsKey(Long.valueOf(j2));
        if (e.b.a.a) {
            g.c.b.b.f.w("ExposureRecorderImpl", "isExposed: uniqueId = " + j2 + ", contains = " + containsKey);
        }
        return !containsKey;
    }

    public static d h() {
        return C0179d.a;
    }

    public void a(i iVar, Set<i> set, int i2) {
        if (e.b.a.a) {
            g.c.b.b.f.w("ElementExposureReporter", "onPageIn: pageInfo = " + iVar);
        }
        g(iVar, i2);
    }

    public void b() {
    }

    public void c(i iVar, g.i.c.a.a.l.b bVar, Set<i> set, boolean z) {
        if (e.b.a.a) {
            g.c.b.b.f.w("ElementExposureReporter", "onPageOut: pageInfo = " + iVar);
        }
        for (i next : set) {
            if (!(next == null || ((h) this.a).b.size() == 0)) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry next2 : ((h) this.a).b.entrySet()) {
                    Object obj = null;
                    if (!(next2 == null || next2.getValue() == null)) {
                        obj = ((i.a) next2.getValue()).c.get();
                    }
                    if (obj != null && obj.equals(next.c())) {
                        arrayList.add(next2.getKey());
                    }
                }
                ((h) this.a).b(arrayList);
            }
        }
    }

    public void d(g.i.c.a.a.s.i iVar, int i2) {
        if (e.b.a.a) {
            g.c.b.b.f.w("ElementExposureReporter", "onPageUpdate: pageInfo = " + iVar);
        }
        g(iVar, i2);
    }

    public final boolean f(View view, Set<View> set) {
        boolean z;
        boolean z2 = false;
        if (view == null) {
            return false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            z = false;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                if (f(viewGroup.getChildAt(i2), set)) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        if (!TextUtils.isEmpty(g.i.c.a.a.l.c.b(view)) || z || !TextUtils.isEmpty(g.i.c.a.a.l.c.f(view))) {
            z2 = true;
        }
        if (z2) {
            set.add(view);
        }
        return z2;
    }

    public final void g(g.i.c.a.a.s.i iVar, int i2) {
        this.f4534h.b(this.f4535i);
        b bVar = this.f4535i;
        bVar.b = iVar;
        this.f4534h.a(bVar, i2 == 0 ? 0 : 320);
    }

    public void q(boolean z) {
        h hVar = (h) this.a;
        Objects.requireNonNull(hVar);
        if (e.b.a.a) {
            g.c.b.b.f.w("ExposureRecorderImpl", "clearExposure: ");
        }
        hVar.b(new HashSet(hVar.a.keySet()));
    }
}
