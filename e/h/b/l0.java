package e.h.b;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import e.d.g;
import e.e.j.o;
import e.e.j.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

@SuppressLint({"UnknownNullness"})
public abstract class l0 {

    public class a implements Runnable {
        public final /* synthetic */ int b;
        public final /* synthetic */ ArrayList c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1481d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1482e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1483f;

        public a(l0 l0Var, int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.b = i2;
            this.c = arrayList;
            this.f1481d = arrayList2;
            this.f1482e = arrayList3;
            this.f1483f = arrayList4;
        }

        public void run() {
            for (int i2 = 0; i2 < this.b; i2++) {
                q.p((View) this.c.get(i2), (String) this.f1481d.get(i2));
                q.p((View) this.f1482e.get(i2), (String) this.f1483f.get(i2));
            }
        }
    }

    public static boolean g(List<View> list, View view, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (list.get(i3) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean d(Object obj);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: android.view.ViewGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: android.view.ViewGroup} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(java.util.ArrayList<android.view.View> r4, android.view.View r5) {
        /*
            r3 = this;
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L_0x004f
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x004c
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            r2 = 0
            if (r0 < r1) goto L_0x0018
            boolean r0 = r5.isTransitionGroup()
            goto L_0x0039
        L_0x0018:
            r0 = 2131297657(0x7f090579, float:1.8213265E38)
            java.lang.Object r0 = r5.getTag(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0029
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0038
        L_0x0029:
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = e.e.j.q.h(r5)
            if (r0 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r0 = 0
            goto L_0x0039
        L_0x0038:
            r0 = 1
        L_0x0039:
            if (r0 == 0) goto L_0x003c
            goto L_0x004c
        L_0x003c:
            int r0 = r5.getChildCount()
        L_0x0040:
            if (r2 >= r0) goto L_0x004f
            android.view.View r1 = r5.getChildAt(r2)
            r3.e(r4, r1)
            int r2 = r2 + 1
            goto L_0x0040
        L_0x004c:
            r4.add(r5)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.b.l0.e(java.util.ArrayList, android.view.View):void");
    }

    public abstract Object f(Object obj);

    public void h(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String h2 = q.h(view);
            if (h2 != null) {
                map.put(h2, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    h(map, viewGroup.getChildAt(i2));
                }
            }
        }
    }

    public void i(View view, Rect rect) {
        WeakHashMap<View, String> weakHashMap = q.a;
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object k(Object obj, Object obj2, Object obj3);

    public abstract Object l(Object obj, Object obj2, Object obj3);

    public ArrayList<String> m(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = arrayList.get(i2);
            arrayList2.add(q.h(view));
            q.p(view, (String) null);
        }
        return arrayList2;
    }

    public abstract void n(Object obj, View view);

    public abstract void o(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void p(Object obj, View view, ArrayList<View> arrayList);

    public abstract void q(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void r(Object obj, Rect rect);

    public abstract void s(Object obj, View view);

    public void t(Fragment fragment, Object obj, e.e.f.a aVar, Runnable runnable) {
        runnable.run();
    }

    public void u(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = arrayList.get(i2);
            String h2 = q.h(view2);
            arrayList4.add(h2);
            if (h2 != null) {
                q.p(view2, (String) null);
                String str = (String) ((g) map).getOrDefault(h2, null);
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i3))) {
                        q.p(arrayList2.get(i3), h2);
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        o.a(view, new a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void v(Object obj, View view, ArrayList<View> arrayList);

    public abstract void w(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object x(Object obj);
}
