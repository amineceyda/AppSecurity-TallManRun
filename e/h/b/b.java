package e.h.b;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import e.d.f;
import e.e.j.q;
import e.h.b.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class b extends q0 {

    public class a implements Runnable {
        public final /* synthetic */ List b;
        public final /* synthetic */ q0.d c;

        public a(List list, q0.d dVar) {
            this.b = list;
            this.c = dVar;
        }

        public void run() {
            if (this.b.contains(this.c)) {
                this.b.remove(this.c);
                b bVar = b.this;
                q0.d dVar = this.c;
                Objects.requireNonNull(bVar);
                dVar.a.a(dVar.c.mView);
            }
        }
    }

    /* renamed from: e.h.b.b$b  reason: collision with other inner class name */
    public class C0048b implements Runnable {
        public final /* synthetic */ q0.d b;
        public final /* synthetic */ q0.d c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ boolean f1410d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ e.d.a f1411e;

        public C0048b(b bVar, q0.d dVar, q0.d dVar2, boolean z, e.d.a aVar) {
            this.b = dVar;
            this.c = dVar2;
            this.f1410d = z;
            this.f1411e = aVar;
        }

        public void run() {
            j0.c(this.b.c, this.c.c, this.f1410d, this.f1411e, false);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ l0 b;
        public final /* synthetic */ View c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Rect f1412d;

        public c(b bVar, l0 l0Var, View view, Rect rect) {
            this.b = l0Var;
            this.c = view;
            this.f1412d = rect;
        }

        public void run() {
            this.b.i(this.c, this.f1412d);
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ ArrayList b;

        public d(b bVar, ArrayList arrayList) {
            this.b = arrayList;
        }

        public void run() {
            j0.p(this.b, 4);
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ h b;

        public e(b bVar, h hVar) {
            this.b = hVar;
        }

        public void run() {
            this.b.a();
        }
    }

    public static class f extends g {
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1413d = false;

        /* renamed from: e  reason: collision with root package name */
        public n f1414e;

        public f(q0.d dVar, e.e.f.a aVar, boolean z) {
            super(dVar, aVar);
            this.c = z;
        }

        public n c(Context context) {
            if (this.f1413d) {
                return this.f1414e;
            }
            q0.d dVar = this.a;
            n t = e.e.f.b.t(context, dVar.c, dVar.a == q0.d.c.VISIBLE, this.c);
            this.f1414e = t;
            this.f1413d = true;
            return t;
        }
    }

    public static class g {
        public final q0.d a;
        public final e.e.f.a b;

        public g(q0.d dVar, e.e.f.a aVar) {
            this.a = dVar;
            this.b = aVar;
        }

        public void a() {
            q0.d dVar = this.a;
            if (dVar.f1496e.remove(this.b) && dVar.f1496e.isEmpty()) {
                dVar.b();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
            r2 = e.h.b.q0.d.c.VISIBLE;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean b() {
            /*
                r3 = this;
                e.h.b.q0$d r0 = r3.a
                androidx.fragment.app.Fragment r0 = r0.c
                android.view.View r0 = r0.mView
                e.h.b.q0$d$c r0 = e.h.b.q0.d.c.d(r0)
                e.h.b.q0$d r1 = r3.a
                e.h.b.q0$d$c r1 = r1.a
                if (r0 == r1) goto L_0x0019
                e.h.b.q0$d$c r2 = e.h.b.q0.d.c.VISIBLE
                if (r0 == r2) goto L_0x0017
                if (r1 == r2) goto L_0x0017
                goto L_0x0019
            L_0x0017:
                r0 = 0
                goto L_0x001a
            L_0x0019:
                r0 = 1
            L_0x001a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e.h.b.b.g.b():boolean");
        }
    }

    public static class h extends g {
        public final Object c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f1415d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f1416e;

        public h(q0.d dVar, e.e.f.a aVar, boolean z, boolean z2) {
            super(dVar, aVar);
            boolean z3;
            Object obj;
            Object obj2;
            Object obj3;
            if (dVar.a == q0.d.c.VISIBLE) {
                if (z) {
                    obj3 = dVar.c.getReenterTransition();
                } else {
                    obj3 = dVar.c.getEnterTransition();
                }
                this.c = obj3;
                if (z) {
                    z3 = dVar.c.getAllowReturnTransitionOverlap();
                } else {
                    z3 = dVar.c.getAllowEnterTransitionOverlap();
                }
            } else {
                if (z) {
                    obj2 = dVar.c.getReturnTransition();
                } else {
                    obj2 = dVar.c.getExitTransition();
                }
                this.c = obj2;
                z3 = true;
            }
            this.f1415d = z3;
            if (z2) {
                obj = z ? dVar.c.getSharedElementReturnTransition() : dVar.c.getSharedElementEnterTransition();
            } else {
                obj = null;
            }
            this.f1416e = obj;
        }

        public final l0 c(Object obj) {
            if (obj == null) {
                return null;
            }
            l0 l0Var = j0.b;
            if (l0Var != null && l0Var.d(obj)) {
                return l0Var;
            }
            l0 l0Var2 = j0.c;
            if (l0Var2 != null && l0Var2.d(obj)) {
                return l0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.a.c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    public void b(List<q0.d> list, boolean z) {
        int i2;
        String str;
        StringBuilder sb;
        HashMap hashMap;
        ArrayList arrayList;
        n c2;
        boolean z2 = z;
        q0.d.c cVar = q0.d.c.VISIBLE;
        Iterator<q0.d> it = list.iterator();
        q0.d dVar = null;
        q0.d dVar2 = null;
        while (true) {
            i2 = 2;
            if (!it.hasNext()) {
                break;
            }
            q0.d next = it.next();
            q0.d.c d2 = q0.d.c.d(next.c.mView);
            int ordinal = next.a.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (!(ordinal == 2 || ordinal == 3)) {
                    }
                } else if (d2 != cVar) {
                    dVar2 = next;
                }
            }
            if (d2 == cVar && dVar == null) {
                dVar = next;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(list);
        Iterator<q0.d> it2 = list.iterator();
        while (it2.hasNext()) {
            q0.d next2 = it2.next();
            e.e.f.a aVar = new e.e.f.a();
            next2.d();
            next2.f1496e.add(aVar);
            arrayList2.add(new f(next2, aVar, z2));
            e.e.f.a aVar2 = new e.e.f.a();
            next2.d();
            next2.f1496e.add(aVar2);
            arrayList3.add(new h(next2, aVar2, z2, !z2 ? next2 == dVar2 : next2 == dVar));
            next2.f1495d.add(new a(arrayList4, next2));
        }
        HashMap hashMap2 = (HashMap) m(arrayList3, arrayList4, z, dVar, dVar2);
        boolean containsValue = hashMap2.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.a;
        Context context = viewGroup.getContext();
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        boolean z3 = false;
        while (it3.hasNext()) {
            f fVar = (f) it3.next();
            if (!fVar.b() && (c2 = fVar.c(context)) != null) {
                Animator animator = c2.b;
                if (animator == null) {
                    arrayList5.add(fVar);
                    arrayList = arrayList5;
                    hashMap = hashMap2;
                    hashMap2 = hashMap;
                    arrayList5 = arrayList;
                    i2 = 2;
                } else {
                    q0.d dVar3 = fVar.a;
                    Fragment fragment = dVar3.c;
                    if (!Boolean.TRUE.equals(hashMap2.get(dVar3))) {
                        boolean z4 = dVar3.a == q0.d.c.GONE;
                        if (z4) {
                            arrayList4.remove(dVar3);
                        }
                        View view = fragment.mView;
                        viewGroup.startViewTransition(view);
                        c cVar2 = r0;
                        hashMap = hashMap2;
                        Animator animator2 = animator;
                        boolean z5 = z4;
                        arrayList = arrayList5;
                        c cVar3 = new c(this, viewGroup, view, z5, dVar3, fVar);
                        animator2.addListener(cVar2);
                        animator2.setTarget(view);
                        animator2.start();
                        fVar.b.b(new d(this, animator2));
                        z3 = true;
                        hashMap2 = hashMap;
                        arrayList5 = arrayList;
                        i2 = 2;
                    } else if (FragmentManager.N(i2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                    }
                }
            }
            fVar.a();
            arrayList = arrayList5;
            hashMap = hashMap2;
            hashMap2 = hashMap;
            arrayList5 = arrayList;
            i2 = 2;
        }
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            f fVar2 = (f) it4.next();
            q0.d dVar4 = fVar2.a;
            Fragment fragment2 = dVar4.c;
            if (containsValue) {
                if (FragmentManager.N(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(fragment2);
                    str = " as Animations cannot run alongside Transitions.";
                }
                fVar2.a();
            } else if (z3) {
                if (FragmentManager.N(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(fragment2);
                    str = " as Animations cannot run alongside Animators.";
                }
                fVar2.a();
            } else {
                View view2 = fragment2.mView;
                n c3 = fVar2.c(context);
                Objects.requireNonNull(c3);
                Animation animation = c3.a;
                Objects.requireNonNull(animation);
                if (dVar4.a != q0.d.c.REMOVED) {
                    view2.startAnimation(animation);
                    fVar2.a();
                } else {
                    viewGroup.startViewTransition(view2);
                    o oVar = new o(animation, viewGroup, view2);
                    oVar.setAnimationListener(new e(this, viewGroup, view2, fVar2));
                    view2.startAnimation(oVar);
                }
                fVar2.b.b(new f(this, view2, viewGroup, fVar2));
            }
            sb.append(str);
            Log.v("FragmentManager", sb.toString());
            fVar2.a();
        }
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            q0.d dVar5 = (q0.d) it5.next();
            dVar5.a.a(dVar5.c.mView);
        }
        arrayList4.clear();
    }

    public void j(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            if (!arrayList.contains(view) && q.h(view) != null) {
                arrayList.add(view);
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    j(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public void k(Map<String, View> map, View view) {
        String h2 = q.h(view);
        if (h2 != null) {
            map.put(h2, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    k(map, childAt);
                }
            }
        }
    }

    public void l(e.d.a<String, View> aVar, Collection<String> collection) {
        Iterator it = ((f.b) aVar.entrySet()).iterator();
        while (true) {
            f.d dVar = (f.d) it;
            if (dVar.hasNext()) {
                dVar.next();
                if (!collection.contains(q.h((View) dVar.getValue()))) {
                    dVar.remove();
                }
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<e.h.b.q0.d, java.lang.Boolean> m(java.util.List<e.h.b.b.h> r33, java.util.List<e.h.b.q0.d> r34, boolean r35, e.h.b.q0.d r36, e.h.b.q0.d r37) {
        /*
            r32 = this;
            r6 = r32
            r7 = r35
            r8 = r37
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.Iterator r0 = r33.iterator()
            r1 = 0
            r15 = r1
        L_0x0011:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0091
            java.lang.Object r1 = r0.next()
            e.h.b.b$h r1 = (e.h.b.b.h) r1
            boolean r2 = r1.b()
            if (r2 == 0) goto L_0x0024
            goto L_0x0011
        L_0x0024:
            java.lang.Object r2 = r1.c
            e.h.b.l0 r2 = r1.c(r2)
            java.lang.Object r3 = r1.f1416e
            e.h.b.l0 r3 = r1.c(r3)
            java.lang.String r4 = " returned Transition "
            java.lang.String r5 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            if (r2 == 0) goto L_0x0062
            if (r3 == 0) goto L_0x0062
            if (r2 != r3) goto L_0x003b
            goto L_0x0062
        L_0x003b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = g.a.a.a.a.i(r5)
            e.h.b.q0$d r3 = r1.a
            androidx.fragment.app.Fragment r3 = r3.c
            r2.append(r3)
            r2.append(r4)
            java.lang.Object r3 = r1.c
            r2.append(r3)
            java.lang.String r3 = " which uses a different Transition  type than its shared element transition "
            r2.append(r3)
            java.lang.Object r1 = r1.f1416e
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0062:
            if (r2 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r2 = r3
        L_0x0066:
            if (r15 != 0) goto L_0x006a
            r15 = r2
            goto L_0x0011
        L_0x006a:
            if (r2 == 0) goto L_0x0011
            if (r15 != r2) goto L_0x006f
            goto L_0x0011
        L_0x006f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = g.a.a.a.a.i(r5)
            e.h.b.q0$d r3 = r1.a
            androidx.fragment.app.Fragment r3 = r3.c
            r2.append(r3)
            r2.append(r4)
            java.lang.Object r1 = r1.c
            r2.append(r1)
            java.lang.String r1 = " which uses a different Transition  type than other Fragments."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0091:
            if (r15 != 0) goto L_0x00af
            java.util.Iterator r0 = r33.iterator()
        L_0x0097:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00ae
            java.lang.Object r1 = r0.next()
            e.h.b.b$h r1 = (e.h.b.b.h) r1
            e.h.b.q0$d r2 = r1.a
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r9.put(r2, r3)
            r1.a()
            goto L_0x0097
        L_0x00ae:
            return r9
        L_0x00af:
            android.view.View r14 = new android.view.View
            android.view.ViewGroup r0 = r6.a
            android.content.Context r0 = r0.getContext()
            r14.<init>(r0)
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            e.d.a r10 = new e.d.a
            r10.<init>()
            java.util.Iterator r18 = r33.iterator()
            r0 = 0
            r1 = 0
            r2 = 0
            r2 = r36
            r5 = r1
            r1 = r8
            r19 = 0
        L_0x00db:
            boolean r3 = r18.hasNext()
            if (r3 == 0) goto L_0x02d3
            java.lang.Object r3 = r18.next()
            e.h.b.b$h r3 = (e.h.b.b.h) r3
            java.lang.Object r3 = r3.f1416e
            if (r3 == 0) goto L_0x00ed
            r4 = 1
            goto L_0x00ee
        L_0x00ed:
            r4 = 0
        L_0x00ee:
            if (r4 == 0) goto L_0x02b7
            if (r2 == 0) goto L_0x02b7
            if (r1 == 0) goto L_0x02b7
            java.lang.Object r0 = r15.f(r3)
            java.lang.Object r4 = r15.x(r0)
            androidx.fragment.app.Fragment r0 = r1.c
            java.util.ArrayList r3 = r0.getSharedElementSourceNames()
            androidx.fragment.app.Fragment r0 = r2.c
            java.util.ArrayList r0 = r0.getSharedElementSourceNames()
            r16 = r4
            androidx.fragment.app.Fragment r4 = r2.c
            java.util.ArrayList r4 = r4.getSharedElementTargetNames()
            r17 = 0
            r20 = r5
            r5 = 0
        L_0x0115:
            int r8 = r4.size()
            if (r5 >= r8) goto L_0x0134
            java.lang.Object r8 = r4.get(r5)
            int r8 = r3.indexOf(r8)
            r17 = r4
            r4 = -1
            if (r8 == r4) goto L_0x012f
            java.lang.Object r4 = r0.get(r5)
            r3.set(r8, r4)
        L_0x012f:
            int r5 = r5 + 1
            r4 = r17
            goto L_0x0115
        L_0x0134:
            androidx.fragment.app.Fragment r0 = r1.c
            java.util.ArrayList r8 = r0.getSharedElementTargetNames()
            if (r7 != 0) goto L_0x0149
            androidx.fragment.app.Fragment r0 = r2.c
            e.e.b.m r0 = r0.getExitTransitionCallback()
            androidx.fragment.app.Fragment r4 = r1.c
            e.e.b.m r4 = r4.getEnterTransitionCallback()
            goto L_0x0155
        L_0x0149:
            androidx.fragment.app.Fragment r0 = r2.c
            e.e.b.m r0 = r0.getEnterTransitionCallback()
            androidx.fragment.app.Fragment r4 = r1.c
            e.e.b.m r4 = r4.getExitTransitionCallback()
        L_0x0155:
            int r5 = r3.size()
            r17 = 0
            r21 = r9
            r9 = 0
        L_0x015e:
            if (r9 >= r5) goto L_0x017e
            java.lang.Object r17 = r3.get(r9)
            r22 = r5
            r5 = r17
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r17 = r8.get(r9)
            r23 = r14
            r14 = r17
            java.lang.String r14 = (java.lang.String) r14
            r10.put(r5, r14)
            int r9 = r9 + 1
            r5 = r22
            r14 = r23
            goto L_0x015e
        L_0x017e:
            r23 = r14
            e.d.a r9 = new e.d.a
            r9.<init>()
            androidx.fragment.app.Fragment r5 = r2.c
            android.view.View r5 = r5.mView
            r6.k(r9, r5)
            e.d.f.k(r9, r3)
            if (r0 != 0) goto L_0x02b5
            java.util.Set r0 = r9.keySet()
            e.d.f.k(r10, r0)
            e.d.a r14 = new e.d.a
            r14.<init>()
            androidx.fragment.app.Fragment r0 = r1.c
            android.view.View r0 = r0.mView
            r6.k(r14, r0)
            e.d.f.k(r14, r8)
            java.util.Collection r0 = r10.values()
            e.d.f.k(r14, r0)
            if (r4 != 0) goto L_0x02b3
            e.h.b.j0.n(r10, r14)
            java.util.Set r0 = r10.keySet()
            r6.l(r9, r0)
            java.util.Collection r0 = r10.values()
            r6.l(r14, r0)
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x01dd
            r12.clear()
            r11.clear()
            r0 = 0
            r14 = r37
            r4 = r10
            r8 = r11
            r9 = r12
            r3 = r13
            r5 = r15
            r15 = r21
            r7 = r23
            r10 = r36
            goto L_0x02c5
        L_0x01dd:
            androidx.fragment.app.Fragment r0 = r1.c
            androidx.fragment.app.Fragment r1 = r2.c
            r2 = 1
            e.h.b.j0.c(r0, r1, r7, r9, r2)
            android.view.ViewGroup r5 = r6.a
            e.h.b.b$b r4 = new e.h.b.b$b
            r0 = r4
            r1 = r32
            r2 = r37
            r17 = r3
            r3 = r36
            r7 = r16
            r16 = r10
            r10 = r4
            r4 = r35
            r24 = r20
            r20 = r13
            r13 = r5
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            e.e.j.o.a(r13, r10)
            java.util.Collection r0 = r9.values()
            e.d.f$e r0 = (e.d.f.e) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x020f:
            r1 = r0
            e.d.f$a r1 = (e.d.f.a) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0222
            java.lang.Object r1 = r1.next()
            android.view.View r1 = (android.view.View) r1
            r6.j(r12, r1)
            goto L_0x020f
        L_0x0222:
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x023c
            r0 = 0
            r1 = r17
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r9.get(r0)
            r5 = r0
            android.view.View r5 = (android.view.View) r5
            r15.s(r7, r5)
            goto L_0x023e
        L_0x023c:
            r5 = r24
        L_0x023e:
            java.util.Collection r0 = r14.values()
            e.d.f$e r0 = (e.d.f.e) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0248:
            r1 = r0
            e.d.f$a r1 = (e.d.f.a) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x025b
            java.lang.Object r1 = r1.next()
            android.view.View r1 = (android.view.View) r1
            r6.j(r11, r1)
            goto L_0x0248
        L_0x025b:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x027f
            r0 = 0
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r14.get(r0)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x027f
            android.view.ViewGroup r1 = r6.a
            e.h.b.b$c r2 = new e.h.b.b$c
            r3 = r20
            r2.<init>(r6, r15, r0, r3)
            e.e.j.o.a(r1, r2)
            r19 = 1
            goto L_0x0281
        L_0x027f:
            r3 = r20
        L_0x0281:
            r0 = r23
            r15.v(r7, r0, r12)
            r1 = 0
            r13 = 0
            r14 = 0
            r2 = 0
            r4 = r16
            r10 = r15
            r8 = r11
            r11 = r7
            r9 = r12
            r12 = r1
            r1 = r15
            r15 = r2
            r16 = r7
            r17 = r8
            r10.q(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r10 = r36
            r15 = r21
            r15.put(r10, r2)
            r14 = r37
            r15.put(r14, r2)
            r20 = r5
            r2 = r10
            r5 = r1
            r1 = r14
            r31 = r7
            r7 = r0
            r0 = r31
            goto L_0x02c5
        L_0x02b3:
            r0 = 0
            throw r0
        L_0x02b5:
            r0 = 0
            throw r0
        L_0x02b7:
            r24 = r5
            r4 = r10
            r3 = r13
            r7 = r14
            r5 = r15
            r10 = r36
            r14 = r8
            r15 = r9
            r8 = r11
            r9 = r12
            r20 = r24
        L_0x02c5:
            r13 = r3
            r10 = r4
            r11 = r8
            r12 = r9
            r8 = r14
            r9 = r15
            r15 = r5
            r14 = r7
            r5 = r20
            r7 = r35
            goto L_0x00db
        L_0x02d3:
            r24 = r5
            r4 = r10
            r3 = r13
            r7 = r14
            r5 = r15
            r14 = r8
            r15 = r9
            r8 = r11
            r9 = r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r18 = r33.iterator()
            r10 = 0
            r11 = 0
            r12 = r10
        L_0x02e9:
            boolean r10 = r18.hasNext()
            if (r10 == 0) goto L_0x041f
            java.lang.Object r10 = r18.next()
            e.h.b.b$h r10 = (e.h.b.b.h) r10
            boolean r16 = r10.b()
            if (r16 == 0) goto L_0x031b
            r35 = r11
            e.h.b.q0$d r11 = r10.a
            r36 = r12
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r15.put(r11, r12)
            r10.a()
            r11 = r34
            r28 = r36
            r10 = r1
            r29 = r4
            r23 = r7
            r7 = r13
            r4 = r14
            r1 = r15
            r12 = r24
            r13 = r35
            goto L_0x0410
        L_0x031b:
            r35 = r11
            r36 = r12
            java.lang.Object r11 = r10.c
            java.lang.Object r12 = r5.f(r11)
            e.h.b.q0$d r11 = r10.a
            if (r0 == 0) goto L_0x032f
            if (r11 == r2) goto L_0x032d
            if (r11 != r1) goto L_0x032f
        L_0x032d:
            r1 = 1
            goto L_0x0330
        L_0x032f:
            r1 = 0
        L_0x0330:
            if (r12 != 0) goto L_0x034d
            if (r1 != 0) goto L_0x033c
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r15.put(r11, r1)
            r10.a()
        L_0x033c:
            r11 = r34
            r10 = r35
            r28 = r36
            r29 = r4
            r23 = r7
            r7 = r13
            r4 = r14
            r1 = r15
            r12 = r24
            goto L_0x040e
        L_0x034d:
            r21 = r15
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r16 = r10
            androidx.fragment.app.Fragment r10 = r11.c
            android.view.View r10 = r10.mView
            r6.j(r15, r10)
            if (r1 == 0) goto L_0x0368
            if (r11 != r2) goto L_0x0365
            r15.removeAll(r9)
            goto L_0x0368
        L_0x0365:
            r15.removeAll(r8)
        L_0x0368:
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L_0x0385
            r5.a(r12, r7)
            r26 = r35
            r28 = r36
            r29 = r4
            r23 = r7
            r10 = r11
            r7 = r13
            r4 = r14
            r14 = r15
            r25 = r16
            r1 = r21
            r11 = r34
            r13 = r12
            goto L_0x03d9
        L_0x0385:
            r5.b(r12, r15)
            r1 = 0
            r17 = 0
            r20 = 0
            r22 = 0
            r25 = r16
            r10 = r5
            r26 = r35
            r27 = r11
            r11 = r12
            r28 = r36
            r35 = r12
            r23 = r7
            r7 = r13
            r13 = r15
            r29 = r4
            r4 = r14
            r14 = r1
            r30 = r15
            r1 = r21
            r15 = r17
            r16 = r20
            r17 = r22
            r10.q(r11, r12, r13, r14, r15, r16, r17)
            r10 = r27
            e.h.b.q0$d$c r11 = r10.a
            e.h.b.q0$d$c r12 = e.h.b.q0.d.c.GONE
            if (r11 != r12) goto L_0x03d3
            r11 = r34
            r11.remove(r10)
            androidx.fragment.app.Fragment r12 = r10.c
            android.view.View r12 = r12.mView
            r13 = r35
            r14 = r30
            r5.p(r13, r12, r14)
            android.view.ViewGroup r12 = r6.a
            e.h.b.b$d r15 = new e.h.b.b$d
            r15.<init>(r6, r14)
            e.e.j.o.a(r12, r15)
            goto L_0x03d9
        L_0x03d3:
            r11 = r34
            r13 = r35
            r14 = r30
        L_0x03d9:
            e.h.b.q0$d$c r12 = r10.a
            e.h.b.q0$d$c r15 = e.h.b.q0.d.c.VISIBLE
            if (r12 != r15) goto L_0x03ea
            r7.addAll(r14)
            if (r19 == 0) goto L_0x03e7
            r5.r(r13, r3)
        L_0x03e7:
            r12 = r24
            goto L_0x03ef
        L_0x03ea:
            r12 = r24
            r5.s(r13, r12)
        L_0x03ef:
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            r1.put(r10, r14)
            r10 = r25
            boolean r10 = r10.f1415d
            if (r10 == 0) goto L_0x0402
            r10 = 0
            r14 = r26
            java.lang.Object r10 = r5.l(r14, r13, r10)
            goto L_0x040e
        L_0x0402:
            r14 = r26
            r10 = 0
            r15 = r28
            java.lang.Object r10 = r5.l(r15, r13, r10)
            r28 = r10
            r10 = r14
        L_0x040e:
            r13 = r10
            r10 = r4
        L_0x0410:
            r15 = r1
            r14 = r4
            r1 = r10
            r24 = r12
            r11 = r13
            r12 = r28
            r4 = r29
            r13 = r7
            r7 = r23
            goto L_0x02e9
        L_0x041f:
            r29 = r4
            r7 = r13
            r4 = r14
            r1 = r15
            r14 = r11
            r15 = r12
            java.lang.Object r3 = r5.k(r14, r15, r0)
            java.util.Iterator r10 = r33.iterator()
        L_0x042e:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0492
            java.lang.Object r11 = r10.next()
            e.h.b.b$h r11 = (e.h.b.b.h) r11
            boolean r12 = r11.b()
            if (r12 == 0) goto L_0x0441
            goto L_0x042e
        L_0x0441:
            java.lang.Object r12 = r11.c
            e.h.b.q0$d r13 = r11.a
            if (r0 == 0) goto L_0x044d
            if (r13 == r2) goto L_0x044b
            if (r13 != r4) goto L_0x044d
        L_0x044b:
            r14 = 1
            goto L_0x044e
        L_0x044d:
            r14 = 0
        L_0x044e:
            if (r12 != 0) goto L_0x0452
            if (r14 == 0) goto L_0x042e
        L_0x0452:
            android.view.ViewGroup r12 = r6.a
            java.util.WeakHashMap<android.view.View, java.lang.String> r14 = e.e.j.q.a
            boolean r12 = r12.isLaidOut()
            if (r12 != 0) goto L_0x0483
            r12 = 2
            boolean r12 = androidx.fragment.app.FragmentManager.N(r12)
            if (r12 == 0) goto L_0x047f
            java.lang.String r12 = "SpecialEffectsController: Container "
            java.lang.StringBuilder r12 = g.a.a.a.a.i(r12)
            android.view.ViewGroup r14 = r6.a
            r12.append(r14)
            java.lang.String r14 = " has not been laid out. Completing operation "
            r12.append(r14)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "FragmentManager"
            android.util.Log.v(r13, r12)
        L_0x047f:
            r11.a()
            goto L_0x042e
        L_0x0483:
            e.h.b.q0$d r12 = r11.a
            androidx.fragment.app.Fragment r12 = r12.c
            e.e.f.a r13 = r11.b
            e.h.b.b$e r14 = new e.h.b.b$e
            r14.<init>(r6, r11)
            r5.t(r12, r3, r13, r14)
            goto L_0x042e
        L_0x0492:
            android.view.ViewGroup r2 = r6.a
            java.util.WeakHashMap<android.view.View, java.lang.String> r4 = e.e.j.q.a
            boolean r2 = r2.isLaidOut()
            if (r2 != 0) goto L_0x049d
            return r1
        L_0x049d:
            r2 = 4
            e.h.b.j0.p(r7, r2)
            java.util.ArrayList r14 = r5.m(r8)
            android.view.ViewGroup r2 = r6.a
            r5.c(r2, r3)
            android.view.ViewGroup r11 = r6.a
            r10 = r5
            r12 = r9
            r13 = r8
            r15 = r29
            r10.u(r11, r12, r13, r14, r15)
            r2 = 0
            e.h.b.j0.p(r7, r2)
            r5.w(r0, r9, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.b.b.m(java.util.List, java.util.List, boolean, e.h.b.q0$d, e.h.b.q0$d):java.util.Map");
    }
}
