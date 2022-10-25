package e.h.b;

import android.os.Build;
import android.view.View;
import androidx.fragment.app.Fragment;
import e.d.f;
import e.e.b.m;
import e.e.j.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class j0 {
    public static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    public static final l0 b = (Build.VERSION.SDK_INT >= 21 ? new k0() : null);
    public static final l0 c;

    public interface a {
    }

    public static class b {
        public Fragment a;
        public boolean b;
        public a c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f1473d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1474e;

        /* renamed from: f  reason: collision with root package name */
        public a f1475f;
    }

    static {
        l0 l0Var = null;
        try {
            l0Var = (l0) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
        }
        c = l0Var;
    }

    public static void a(ArrayList<View> arrayList, e.d.a<String, View> aVar, Collection<String> collection) {
        for (int i2 = aVar.f1260d - 1; i2 >= 0; i2--) {
            View l2 = aVar.l(i2);
            if (collection.contains(q.h(l2))) {
                arrayList.add(l2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0038, code lost:
        if (r0.mAdded != false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0074, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0085, code lost:
        if (r0.mHidden == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0087, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(e.h.b.a r8, e.h.b.c0.a r9, android.util.SparseArray<e.h.b.j0.b> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.mContainerId
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = a
            int r9 = r9.a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.a
        L_0x0015:
            r2 = 1
            r3 = 0
            if (r9 == r2) goto L_0x007a
            r4 = 3
            if (r9 == r4) goto L_0x0056
            r4 = 4
            if (r9 == r4) goto L_0x003e
            r4 = 5
            if (r9 == r4) goto L_0x002c
            r4 = 6
            if (r9 == r4) goto L_0x0056
            r4 = 7
            if (r9 == r4) goto L_0x007a
            r9 = 0
            r2 = 0
            goto L_0x008a
        L_0x002c:
            if (r12 == 0) goto L_0x003b
            boolean r9 = r0.mHiddenChanged
            if (r9 == 0) goto L_0x0089
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x0089
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0089
            goto L_0x0087
        L_0x003b:
            boolean r9 = r0.mHidden
            goto L_0x008a
        L_0x003e:
            if (r12 == 0) goto L_0x004d
            boolean r9 = r0.mHiddenChanged
            if (r9 == 0) goto L_0x0076
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0076
            boolean r9 = r0.mHidden
            if (r9 == 0) goto L_0x0076
            goto L_0x0074
        L_0x004d:
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0076
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x0076
            goto L_0x0074
        L_0x0056:
            boolean r9 = r0.mAdded
            if (r12 == 0) goto L_0x006e
            if (r9 != 0) goto L_0x0076
            android.view.View r9 = r0.mView
            if (r9 == 0) goto L_0x0076
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0076
            float r9 = r0.mPostponedAlpha
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0076
            goto L_0x0074
        L_0x006e:
            if (r9 == 0) goto L_0x0076
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x0076
        L_0x0074:
            r9 = 1
            goto L_0x0077
        L_0x0076:
            r9 = 0
        L_0x0077:
            r4 = r9
            r9 = 0
            goto L_0x008e
        L_0x007a:
            if (r12 == 0) goto L_0x007f
            boolean r9 = r0.mIsNewlyAdded
            goto L_0x008a
        L_0x007f:
            boolean r9 = r0.mAdded
            if (r9 != 0) goto L_0x0089
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x0089
        L_0x0087:
            r9 = 1
            goto L_0x008a
        L_0x0089:
            r9 = 0
        L_0x008a:
            r3 = r9
            r9 = r2
            r2 = 0
            r4 = 0
        L_0x008e:
            java.lang.Object r5 = r10.get(r1)
            e.h.b.j0$b r5 = (e.h.b.j0.b) r5
            if (r3 == 0) goto L_0x00a7
            if (r5 != 0) goto L_0x00a1
            e.h.b.j0$b r3 = new e.h.b.j0$b
            r3.<init>()
            r10.put(r1, r3)
            r5 = r3
        L_0x00a1:
            r5.a = r0
            r5.b = r11
            r5.c = r8
        L_0x00a7:
            r3 = 0
            if (r12 != 0) goto L_0x00c8
            if (r9 == 0) goto L_0x00c8
            if (r5 == 0) goto L_0x00b4
            androidx.fragment.app.Fragment r9 = r5.f1473d
            if (r9 != r0) goto L_0x00b4
            r5.f1473d = r3
        L_0x00b4:
            boolean r9 = r8.o
            if (r9 != 0) goto L_0x00c8
            androidx.fragment.app.FragmentManager r9 = r8.p
            e.h.b.a0 r6 = r9.h(r0)
            e.h.b.b0 r7 = r9.c
            r7.j(r6)
            int r6 = r9.p
            r9.U(r0, r6)
        L_0x00c8:
            if (r4 == 0) goto L_0x00e1
            if (r5 == 0) goto L_0x00d0
            androidx.fragment.app.Fragment r9 = r5.f1473d
            if (r9 != 0) goto L_0x00e1
        L_0x00d0:
            if (r5 != 0) goto L_0x00db
            e.h.b.j0$b r9 = new e.h.b.j0$b
            r9.<init>()
            r10.put(r1, r9)
            r5 = r9
        L_0x00db:
            r5.f1473d = r0
            r5.f1474e = r11
            r5.f1475f = r8
        L_0x00e1:
            if (r12 != 0) goto L_0x00ed
            if (r2 == 0) goto L_0x00ed
            if (r5 == 0) goto L_0x00ed
            androidx.fragment.app.Fragment r8 = r5.a
            if (r8 != r0) goto L_0x00ed
            r5.a = r3
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.b.j0.b(e.h.b.a, e.h.b.c0$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(Fragment fragment, Fragment fragment2, boolean z, e.d.a<String, View> aVar, boolean z2) {
        if ((z ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i2 = aVar == null ? 0 : aVar.f1260d;
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList2.add(aVar.h(i3));
                arrayList.add(aVar.l(i3));
            }
            throw null;
        }
    }

    public static boolean d(l0 l0Var, List<Object> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!l0Var.d(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static e.d.a<String, View> e(l0 l0Var, e.d.a<String, String> aVar, Object obj, b bVar) {
        m mVar;
        ArrayList<String> arrayList;
        Fragment fragment = bVar.a;
        View view = fragment.getView();
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        e.d.a<String, View> aVar2 = new e.d.a<>();
        l0Var.h(aVar2, view);
        a aVar3 = bVar.c;
        if (bVar.b) {
            mVar = fragment.getExitTransitionCallback();
            arrayList = aVar3.f1428m;
        } else {
            mVar = fragment.getEnterTransitionCallback();
            arrayList = aVar3.n;
        }
        if (arrayList != null) {
            f.k(aVar2, arrayList);
            f.k(aVar2, aVar.values());
        }
        if (mVar == null) {
            n(aVar, aVar2);
            return aVar2;
        }
        throw null;
    }

    public static e.d.a<String, View> f(l0 l0Var, e.d.a<String, String> aVar, Object obj, b bVar) {
        m mVar;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = bVar.f1473d;
        e.d.a<String, View> aVar2 = new e.d.a<>();
        l0Var.h(aVar2, fragment.requireView());
        a aVar3 = bVar.f1475f;
        if (bVar.f1474e) {
            mVar = fragment.getEnterTransitionCallback();
            arrayList = aVar3.n;
        } else {
            mVar = fragment.getExitTransitionCallback();
            arrayList = aVar3.f1428m;
        }
        if (arrayList != null) {
            f.k(aVar2, arrayList);
        }
        if (mVar == null) {
            f.k(aVar, aVar2.keySet());
            return aVar2;
        }
        throw null;
    }

    public static l0 g(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        l0 l0Var = b;
        if (l0Var != null && d(l0Var, arrayList)) {
            return l0Var;
        }
        l0 l0Var2 = c;
        if (l0Var2 != null && d(l0Var2, arrayList)) {
            return l0Var2;
        }
        if (l0Var == null && l0Var2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    public static ArrayList<View> h(l0 l0Var, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            l0Var.e(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        l0Var.b(obj, arrayList2);
        return arrayList2;
    }

    public static Object i(l0 l0Var, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return l0Var.f(z ? fragment.getReenterTransition() : fragment.getEnterTransition());
    }

    public static Object j(l0 l0Var, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return l0Var.f(z ? fragment.getReturnTransition() : fragment.getExitTransition());
    }

    public static View k(e.d.a<String, View> aVar, b bVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        a aVar2 = bVar.c;
        if (obj == null || aVar == null || (arrayList = aVar2.f1428m) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar2.f1428m : aVar2.n).get(0));
    }

    public static Object l(l0 l0Var, Fragment fragment, Fragment fragment2, boolean z) {
        return l0Var.x(l0Var.f(z ? fragment2.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition()));
    }

    public static Object m(l0 l0Var, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() ? l0Var.l(obj2, obj, obj3) : l0Var.k(obj2, obj, obj3);
    }

    public static void n(e.d.a<String, String> aVar, e.d.a<String, View> aVar2) {
        int i2 = aVar.f1260d;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            if (!aVar2.containsKey(aVar.l(i2))) {
                aVar.j(i2);
            }
        }
    }

    public static void o(l0 l0Var, Object obj, Object obj2, e.d.a<String, View> aVar, boolean z, a aVar2) {
        ArrayList<String> arrayList = aVar2.f1428m;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = aVar.get((z ? aVar2.n : aVar2.f1428m).get(0));
            l0Var.s(obj, view);
            if (obj2 != null) {
                l0Var.s(obj2, view);
            }
        }
    }

    public static void p(ArrayList<View> arrayList, int i2) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:142:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0426 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x023c A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void q(android.content.Context r39, e.h.b.p r40, java.util.ArrayList<e.h.b.a> r41, java.util.ArrayList<java.lang.Boolean> r42, int r43, int r44, boolean r45, e.h.b.j0.a r46) {
        /*
            r0 = r41
            r1 = r42
            r2 = r44
            r3 = r45
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            r5 = r43
        L_0x000f:
            r6 = 0
            r7 = 1
            if (r5 >= r2) goto L_0x0061
            java.lang.Object r8 = r0.get(r5)
            e.h.b.a r8 = (e.h.b.a) r8
            java.lang.Object r9 = r1.get(r5)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0047
            androidx.fragment.app.FragmentManager r6 = r8.p
            e.h.b.p r6 = r6.r
            boolean r6 = r6.d()
            if (r6 != 0) goto L_0x0030
            goto L_0x005e
        L_0x0030:
            java.util.ArrayList<e.h.b.c0$a> r6 = r8.a
            int r6 = r6.size()
            int r6 = r6 - r7
        L_0x0037:
            if (r6 < 0) goto L_0x005e
            java.util.ArrayList<e.h.b.c0$a> r9 = r8.a
            java.lang.Object r9 = r9.get(r6)
            e.h.b.c0$a r9 = (e.h.b.c0.a) r9
            b(r8, r9, r4, r7, r3)
            int r6 = r6 + -1
            goto L_0x0037
        L_0x0047:
            java.util.ArrayList<e.h.b.c0$a> r7 = r8.a
            int r7 = r7.size()
            r9 = 0
        L_0x004e:
            if (r9 >= r7) goto L_0x005e
            java.util.ArrayList<e.h.b.c0$a> r10 = r8.a
            java.lang.Object r10 = r10.get(r9)
            e.h.b.c0$a r10 = (e.h.b.c0.a) r10
            b(r8, r10, r4, r6, r3)
            int r9 = r9 + 1
            goto L_0x004e
        L_0x005e:
            int r5 = r5 + 1
            goto L_0x000f
        L_0x0061:
            int r5 = r4.size()
            if (r5 == 0) goto L_0x0438
            android.view.View r5 = new android.view.View
            r8 = r39
            r5.<init>(r8)
            int r15 = r4.size()
            r14 = 0
        L_0x0073:
            if (r14 >= r15) goto L_0x0438
            int r8 = r4.keyAt(r14)
            e.d.a r13 = new e.d.a
            r13.<init>()
            int r9 = r2 + -1
            r12 = r43
        L_0x0082:
            if (r9 < r12) goto L_0x00ea
            java.lang.Object r10 = r0.get(r9)
            e.h.b.a r10 = (e.h.b.a) r10
            boolean r11 = r10.k(r8)
            if (r11 != 0) goto L_0x0091
            goto L_0x00df
        L_0x0091:
            java.lang.Object r11 = r1.get(r9)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            java.util.ArrayList<java.lang.String> r7 = r10.f1428m
            if (r7 == 0) goto L_0x00df
            int r7 = r7.size()
            if (r11 == 0) goto L_0x00aa
            java.util.ArrayList<java.lang.String> r11 = r10.f1428m
            java.util.ArrayList<java.lang.String> r10 = r10.n
            goto L_0x00b3
        L_0x00aa:
            java.util.ArrayList<java.lang.String> r11 = r10.f1428m
            java.util.ArrayList<java.lang.String> r10 = r10.n
            r38 = r11
            r11 = r10
            r10 = r38
        L_0x00b3:
            if (r6 >= r7) goto L_0x00df
            java.lang.Object r16 = r10.get(r6)
            r0 = r16
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r16 = r11.get(r6)
            r1 = r16
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r16 = r13.remove(r1)
            r2 = r16
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00d3
            r13.put(r0, r2)
            goto L_0x00d6
        L_0x00d3:
            r13.put(r0, r1)
        L_0x00d6:
            int r6 = r6 + 1
            r0 = r41
            r1 = r42
            r2 = r44
            goto L_0x00b3
        L_0x00df:
            int r9 = r9 + -1
            r0 = r41
            r1 = r42
            r2 = r44
            r6 = 0
            r7 = 1
            goto L_0x0082
        L_0x00ea:
            java.lang.Object r0 = r4.valueAt(r14)
            e.h.b.j0$b r0 = (e.h.b.j0.b) r0
            boolean r1 = r40.d()
            if (r1 == 0) goto L_0x0420
            r1 = r40
            android.view.View r2 = r1.c(r8)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L_0x0102
            goto L_0x0420
        L_0x0102:
            if (r3 == 0) goto L_0x0290
            androidx.fragment.app.Fragment r7 = r0.a
            androidx.fragment.app.Fragment r8 = r0.f1473d
            e.h.b.l0 r9 = g(r8, r7)
            if (r9 != 0) goto L_0x0117
            r30 = r4
            r31 = r14
            r32 = r15
        L_0x0114:
            r3 = 0
            goto L_0x02a3
        L_0x0117:
            boolean r10 = r0.b
            boolean r11 = r0.f1474e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Object r3 = i(r9, r7, r10)
            java.lang.Object r11 = j(r9, r8, r11)
            r30 = r4
            androidx.fragment.app.Fragment r4 = r0.a
            androidx.fragment.app.Fragment r12 = r0.f1473d
            r31 = r14
            if (r4 == 0) goto L_0x0142
            android.view.View r14 = r4.requireView()
            r32 = r15
            r15 = 0
            r14.setVisibility(r15)
            goto L_0x0144
        L_0x0142:
            r32 = r15
        L_0x0144:
            if (r4 == 0) goto L_0x01e5
            if (r12 != 0) goto L_0x014a
            goto L_0x01e5
        L_0x014a:
            boolean r14 = r0.b
            boolean r15 = r13.isEmpty()
            if (r15 == 0) goto L_0x0156
            r33 = r10
            r15 = 0
            goto L_0x015c
        L_0x0156:
            java.lang.Object r15 = l(r9, r4, r12, r14)
            r33 = r10
        L_0x015c:
            e.d.a r10 = f(r9, r13, r15, r0)
            r34 = r7
            e.d.a r7 = e(r9, r13, r15, r0)
            boolean r16 = r13.isEmpty()
            if (r16 == 0) goto L_0x0178
            if (r10 == 0) goto L_0x0171
            r10.clear()
        L_0x0171:
            if (r7 == 0) goto L_0x0176
            r7.clear()
        L_0x0176:
            r15 = 0
            goto L_0x018a
        L_0x0178:
            r16 = r15
            java.util.Set r15 = r13.keySet()
            a(r1, r10, r15)
            java.util.Collection r15 = r13.values()
            a(r6, r7, r15)
            r15 = r16
        L_0x018a:
            if (r3 != 0) goto L_0x0193
            if (r11 != 0) goto L_0x0193
            if (r15 != 0) goto L_0x0193
            r36 = r6
            goto L_0x01eb
        L_0x0193:
            r35 = r13
            r13 = 1
            c(r4, r12, r14, r10, r13)
            if (r15 == 0) goto L_0x01c9
            r6.add(r5)
            r9.v(r15, r5, r1)
            boolean r13 = r0.f1474e
            r36 = r6
            e.h.b.a r6 = r0.f1475f
            r16 = r9
            r17 = r15
            r18 = r11
            r19 = r10
            r20 = r13
            r21 = r6
            o(r16, r17, r18, r19, r20, r21)
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.view.View r0 = k(r7, r0, r3, r14)
            if (r0 == 0) goto L_0x01c4
            r9.r(r3, r6)
        L_0x01c4:
            r27 = r0
            r29 = r6
            goto L_0x01cf
        L_0x01c9:
            r36 = r6
            r27 = 0
            r29 = 0
        L_0x01cf:
            e.h.b.h0 r0 = new e.h.b.h0
            r22 = r0
            r23 = r4
            r24 = r12
            r25 = r14
            r26 = r7
            r28 = r9
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            e.e.j.o.a(r2, r0)
            r6 = r15
            goto L_0x01ee
        L_0x01e5:
            r36 = r6
            r34 = r7
            r33 = r10
        L_0x01eb:
            r35 = r13
            r6 = 0
        L_0x01ee:
            if (r3 != 0) goto L_0x01f6
            if (r6 != 0) goto L_0x01f6
            if (r11 != 0) goto L_0x01f6
            goto L_0x0114
        L_0x01f6:
            java.util.ArrayList r0 = h(r9, r11, r8, r1, r5)
            r4 = r34
            r7 = r36
            java.util.ArrayList r10 = h(r9, r3, r4, r7, r5)
            r12 = 4
            p(r10, r12)
            r16 = r9
            r17 = r3
            r18 = r11
            r19 = r6
            r20 = r4
            r21 = r33
            java.lang.Object r4 = m(r16, r17, r18, r19, r20, r21)
            if (r8 == 0) goto L_0x023a
            if (r0 == 0) goto L_0x023a
            int r12 = r0.size()
            if (r12 > 0) goto L_0x0226
            int r12 = r1.size()
            if (r12 <= 0) goto L_0x023a
        L_0x0226:
            e.e.f.a r12 = new e.e.f.a
            r12.<init>()
            r13 = r46
            androidx.fragment.app.FragmentManager$d r13 = (androidx.fragment.app.FragmentManager.d) r13
            r13.b(r8, r12)
            e.h.b.d0 r14 = new e.h.b.d0
            r14.<init>(r13, r8, r12)
            r9.t(r8, r4, r12, r14)
        L_0x023a:
            if (r4 == 0) goto L_0x0114
            if (r8 == 0) goto L_0x0261
            if (r11 == 0) goto L_0x0261
            boolean r12 = r8.mAdded
            if (r12 == 0) goto L_0x0261
            boolean r12 = r8.mHidden
            if (r12 == 0) goto L_0x0261
            boolean r12 = r8.mHiddenChanged
            if (r12 == 0) goto L_0x0261
            r12 = 1
            r8.setHideReplaced(r12)
            android.view.View r12 = r8.getView()
            r9.p(r11, r12, r0)
            android.view.ViewGroup r8 = r8.mContainer
            e.h.b.e0 r12 = new e.h.b.e0
            r12.<init>(r0)
            e.e.j.o.a(r8, r12)
        L_0x0261:
            java.util.ArrayList r20 = r9.m(r7)
            r22 = r9
            r23 = r4
            r24 = r3
            r25 = r10
            r26 = r11
            r27 = r0
            r28 = r6
            r29 = r7
            r22.q(r23, r24, r25, r26, r27, r28, r29)
            r9.c(r2, r4)
            r16 = r9
            r17 = r2
            r18 = r1
            r19 = r7
            r21 = r35
            r16.u(r17, r18, r19, r20, r21)
            r3 = 0
            p(r10, r3)
            r9.w(r6, r1, r7)
            goto L_0x02a3
        L_0x0290:
            r30 = r4
            r35 = r13
            r31 = r14
            r32 = r15
            r3 = 0
            androidx.fragment.app.Fragment r1 = r0.a
            androidx.fragment.app.Fragment r4 = r0.f1473d
            e.h.b.l0 r15 = g(r4, r1)
            if (r15 != 0) goto L_0x02a9
        L_0x02a3:
            r25 = r31
            r27 = r32
            goto L_0x0426
        L_0x02a9:
            boolean r6 = r0.b
            boolean r7 = r0.f1474e
            java.lang.Object r14 = i(r15, r1, r6)
            java.lang.Object r13 = j(r15, r4, r7)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            androidx.fragment.app.Fragment r10 = r0.a
            androidx.fragment.app.Fragment r9 = r0.f1473d
            if (r10 == 0) goto L_0x037a
            if (r9 != 0) goto L_0x02c9
            goto L_0x037a
        L_0x02c9:
            boolean r8 = r0.b
            boolean r6 = r35.isEmpty()
            if (r6 == 0) goto L_0x02d5
            r7 = r35
            r6 = 0
            goto L_0x02db
        L_0x02d5:
            java.lang.Object r6 = l(r15, r10, r9, r8)
            r7 = r35
        L_0x02db:
            e.d.a r3 = f(r15, r7, r6, r0)
            boolean r16 = r7.isEmpty()
            if (r16 == 0) goto L_0x02e7
            r6 = 0
            goto L_0x02f2
        L_0x02e7:
            r16 = r6
            java.util.Collection r6 = r3.values()
            r12.addAll(r6)
            r6 = r16
        L_0x02f2:
            if (r14 != 0) goto L_0x030d
            if (r13 != 0) goto L_0x030d
            if (r6 != 0) goto L_0x030d
            r24 = r0
            r21 = r1
            r28 = r4
            r37 = r7
            r23 = r11
            r7 = r12
            r0 = r13
            r26 = r14
            r4 = r15
            r25 = r31
            r27 = r32
            goto L_0x038d
        L_0x030d:
            r21 = r1
            r1 = 1
            c(r10, r9, r8, r3, r1)
            if (r6 == 0) goto L_0x033f
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r15.v(r6, r5, r12)
            r16 = r10
            boolean r10 = r0.f1474e
            r17 = r11
            e.h.b.a r11 = r0.f1475f
            r22 = r6
            r6 = r15
            r18 = r7
            r7 = r22
            r19 = r8
            r8 = r13
            r20 = r9
            r9 = r3
            r3 = r16
            r23 = r17
            o(r6, r7, r8, r9, r10, r11)
            if (r14 == 0) goto L_0x034b
            r15.r(r14, r1)
            goto L_0x034b
        L_0x033f:
            r22 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r3 = r10
            r23 = r11
            r1 = 0
        L_0x034b:
            e.h.b.i0 r6 = new e.h.b.i0
            r8 = r6
            r9 = r15
            r10 = r18
            r11 = r22
            r7 = r12
            r12 = r0
            r24 = r0
            r0 = r13
            r37 = r18
            r13 = r23
            r26 = r14
            r25 = r31
            r14 = r5
            r28 = r4
            r4 = r15
            r27 = r32
            r15 = r3
            r16 = r20
            r17 = r19
            r18 = r7
            r19 = r26
            r20 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            e.e.j.o.a(r2, r6)
            r1 = r26
            goto L_0x0391
        L_0x037a:
            r24 = r0
            r21 = r1
            r28 = r4
            r23 = r11
            r7 = r12
            r0 = r13
            r26 = r14
            r4 = r15
            r25 = r31
            r27 = r32
            r37 = r35
        L_0x038d:
            r1 = r26
            r22 = 0
        L_0x0391:
            if (r1 != 0) goto L_0x0399
            if (r22 != 0) goto L_0x0399
            if (r0 != 0) goto L_0x0399
            goto L_0x0426
        L_0x0399:
            r3 = r28
            java.util.ArrayList r17 = h(r4, r0, r3, r7, r5)
            if (r17 == 0) goto L_0x03a7
            boolean r6 = r17.isEmpty()
            if (r6 == 0) goto L_0x03a8
        L_0x03a7:
            r0 = 0
        L_0x03a8:
            r4.a(r1, r5)
            r6 = r24
            boolean r6 = r6.b
            r11 = r4
            r12 = r1
            r13 = r0
            r14 = r22
            r15 = r21
            r16 = r6
            java.lang.Object r15 = m(r11, r12, r13, r14, r15, r16)
            if (r3 == 0) goto L_0x03e0
            if (r17 == 0) goto L_0x03e0
            int r6 = r17.size()
            if (r6 > 0) goto L_0x03cc
            int r6 = r7.size()
            if (r6 <= 0) goto L_0x03e0
        L_0x03cc:
            e.e.f.a r6 = new e.e.f.a
            r6.<init>()
            r7 = r46
            androidx.fragment.app.FragmentManager$d r7 = (androidx.fragment.app.FragmentManager.d) r7
            r7.b(r3, r6)
            e.h.b.f0 r8 = new e.h.b.f0
            r8.<init>(r7, r3, r6)
            r4.t(r3, r15, r6, r8)
        L_0x03e0:
            if (r15 == 0) goto L_0x0426
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r6 = r4
            r7 = r15
            r8 = r1
            r9 = r14
            r10 = r0
            r11 = r17
            r12 = r22
            r13 = r23
            r6.q(r7, r8, r9, r10, r11, r12, r13)
            e.h.b.g0 r3 = new e.h.b.g0
            r8 = r3
            r9 = r1
            r10 = r4
            r11 = r5
            r12 = r21
            r1 = r15
            r15 = r17
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            e.e.j.o.a(r2, r3)
            e.h.b.m0 r0 = new e.h.b.m0
            r6 = r23
            r3 = r37
            r0.<init>(r4, r6, r3)
            e.e.j.o.a(r2, r0)
            r4.c(r2, r1)
            e.h.b.n0 r0 = new e.h.b.n0
            r0.<init>(r4, r6, r3)
            e.e.j.o.a(r2, r0)
            goto L_0x0426
        L_0x0420:
            r30 = r4
            r25 = r14
            r27 = r15
        L_0x0426:
            int r14 = r25 + 1
            r0 = r41
            r1 = r42
            r2 = r44
            r3 = r45
            r15 = r27
            r4 = r30
            r6 = 0
            r7 = 1
            goto L_0x0073
        L_0x0438:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.b.j0.q(android.content.Context, e.h.b.p, java.util.ArrayList, java.util.ArrayList, int, int, boolean, e.h.b.j0$a):void");
    }
}
