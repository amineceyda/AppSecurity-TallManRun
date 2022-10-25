package g.i.c.a.a.a0;

import android.view.ViewGroup;
import g.c.b.b.f;
import java.lang.reflect.Method;
import java.util.HashSet;

public class e {
    public static final HashSet<String> a;

    public static class a implements Runnable {
        public void run() {
            boolean z = (b.b == null || b.a == null) ? false : true;
            f.v0("ViewGroupDrawingCompat", "preload success:" + z);
        }
    }

    public static class b {
        public static Method a;
        public static Method b;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("getChildDrawingOrder", new Class[]{cls2, cls2});
                a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = ViewGroup.class.getDeclaredMethod("isChildrenDrawingOrderEnabled", new Class[0]);
                b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (Throwable unused) {
                f.x("ViewGroupDrawingCompat", "error happened in method reflection");
            }
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        a = hashSet;
        hashSet.add("android.view.ViewGroup");
        hashSet.add("com.android.internal.policy.DecorView");
        hashSet.add("android.widget.LinearLayout");
        hashSet.add("android.widget.RelativeLayout");
        hashSet.add("android.widget.FrameLayout");
        hashSet.add("android.widget.GridLayout");
        hashSet.add("android.widget.HorizontalScrollView");
        hashSet.add("android.widget.TabHost");
        hashSet.add("android.widget.GridView");
        hashSet.add("android.widget.ListView");
        hashSet.add("android.widget.ScrollView");
        hashSet.add("androidx.constraintlayout.widget.ConstraintLayout");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.View[] a(android.view.ViewGroup r9) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            int r0 = r9.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 > r1) goto L_0x0009
            goto L_0x0039
        L_0x0009:
            java.lang.Class r0 = r9.getClass()
            java.lang.String r0 = r0.getName()
            java.util.HashSet<java.lang.String> r3 = a
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x001a
            goto L_0x0039
        L_0x001a:
            java.lang.reflect.Method r0 = g.i.c.a.a.a0.e.b.b
            if (r0 == 0) goto L_0x0024
            java.lang.reflect.Method r0 = g.i.c.a.a.a0.e.b.a
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 == 0) goto L_0x0039
            java.lang.reflect.Method r0 = g.i.c.a.a.a0.e.b.b
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.invoke(r9, r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0039
            r0 = 1
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r0 != 0) goto L_0x003e
            r9 = 0
            return r9
        L_0x003e:
            int r0 = r9.getChildCount()
            int r3 = r9.getChildCount()
            android.view.View[] r4 = new android.view.View[r3]
            r5 = 0
        L_0x0049:
            if (r5 >= r0) goto L_0x006f
            java.lang.reflect.Method r6 = g.i.c.a.a.a0.e.b.a
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r7[r2] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r7[r1] = r8
            java.lang.Object r6 = r6.invoke(r9, r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            android.view.View r7 = r9.getChildAt(r5)
            r4[r6] = r7
            int r5 = r5 + 1
            goto L_0x0049
        L_0x006f:
            g.i.c.a.a.r.e r0 = g.i.c.a.a.r.e.b.a
            boolean r0 = r0.a
            if (r0 != 0) goto L_0x0076
            goto L_0x00cd
        L_0x0076:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r9.toString()
            r0.<init>(r1)
            java.lang.String r1 = "\n"
            r0.append(r1)
            java.lang.String r2 = "Default Drawing order:\n"
            r0.append(r2)
            int r2 = r9.getChildCount()
        L_0x008d:
            int r2 = r2 + -1
            java.lang.String r5 = " "
            java.lang.String r6 = "index:"
            if (r2 < 0) goto L_0x00a9
            r0.append(r6)
            r0.append(r2)
            r0.append(r5)
            android.view.View r5 = r9.getChildAt(r2)
            r0.append(r5)
            r0.append(r1)
            goto L_0x008d
        L_0x00a9:
            java.lang.String r9 = "reordered Drawing order:\n"
            r0.append(r9)
        L_0x00ae:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x00c4
            r0.append(r6)
            r0.append(r3)
            r0.append(r5)
            r9 = r4[r3]
            r0.append(r9)
            r0.append(r1)
            goto L_0x00ae
        L_0x00c4:
            java.lang.String r9 = r0.toString()
            java.lang.String r0 = "ViewGroupDrawingCompat"
            g.c.b.b.f.v0(r0, r9)
        L_0x00cd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.c.a.a.a0.e.a(android.view.ViewGroup):android.view.View[]");
    }

    public static void b() {
        g.i.c.a.a.y.a.a(new a());
    }
}
