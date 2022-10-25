package e.e.j;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import e.e.j.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class q {
    public static WeakHashMap<View, String> a;
    public static WeakHashMap<View, t> b = null;
    public static Field c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f1339d = false;

    /* renamed from: e  reason: collision with root package name */
    public static final n f1340e = new a();

    public class a implements n {
        public c a(c cVar) {
            return cVar;
        }
    }

    public class b extends f<Boolean> {
        public b(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        public Object a(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }
    }

    public class c extends f<CharSequence> {
        public c(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        public Object a(View view) {
            return view.getAccessibilityPaneTitle();
        }
    }

    public class d extends f<CharSequence> {
        public d(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        /* renamed from: c */
        public CharSequence a(View view) {
            return view.getStateDescription();
        }
    }

    public class e extends f<Boolean> {
        public e(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        public Object a(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }
    }

    public static abstract class f<T> {
        public final int a;
        public final Class<T> b;
        public final int c;

        public f(int i2, Class<T> cls, int i3) {
            this.a = i2;
            this.b = cls;
            this.c = i3;
        }

        public f(int i2, Class<T> cls, int i3, int i4) {
            this.a = i2;
            this.b = cls;
            this.c = i4;
        }

        public abstract T a(View view);

        public T b(View view) {
            if (Build.VERSION.SDK_INT >= this.c) {
                return a(view);
            }
            T tag = view.getTag(this.a);
            if (this.b.isInstance(tag)) {
                return tag;
            }
            return null;
        }
    }

    public interface g {
        boolean a(View view, KeyEvent keyEvent);
    }

    public static class h {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f1341d = new ArrayList<>();
        public WeakHashMap<View, Boolean> a = null;
        public SparseArray<WeakReference<View>> b = null;
        public WeakReference<KeyEvent> c = null;

        public static h a(View view) {
            h hVar = (h) view.getTag(2131297659);
            if (hVar != null) {
                return hVar;
            }
            h hVar2 = new h();
            view.setTag(2131297659, hVar2);
            return hVar2;
        }

        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                WeakHashMap<View, Boolean> weakHashMap = this.a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList<WeakReference<View>> arrayList = f1341d;
                if (!arrayList.isEmpty()) {
                    synchronized (arrayList) {
                        if (this.a == null) {
                            this.a = new WeakHashMap<>();
                        }
                        int size = arrayList.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            }
                            ArrayList<WeakReference<View>> arrayList2 = f1341d;
                            View view2 = (View) arrayList2.get(size).get();
                            if (view2 == null) {
                                arrayList2.remove(size);
                            } else {
                                this.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    this.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    }
                }
            }
            View c2 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (this.b == null) {
                        this.b = new SparseArray<>();
                    }
                    this.b.put(keyCode, new WeakReference(c2));
                }
            }
            return c2 != null;
        }

        public final View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c2 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c2 != null) {
                            return c2;
                        }
                    }
                }
                if (d(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final boolean d(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(2131297660);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((g) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        public boolean e(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            if (this.b == null) {
                this.b = new SparseArray<>();
            }
            SparseArray<WeakReference<View>> sparseArray = this.b;
            if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = sparseArray.valueAt(indexOfKey);
                sparseArray.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = sparseArray.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null) {
                WeakHashMap<View, String> weakHashMap = q.a;
                if (view.isAttachedToWindow()) {
                    d(view, keyEvent);
                }
            }
            return true;
        }
    }

    static {
        new AtomicInteger(1);
        new WeakHashMap();
    }

    public static f<Boolean> a() {
        return new e(2131297646, Boolean.class, 28);
    }

    public static t b(View view) {
        if (b == null) {
            b = new WeakHashMap<>();
        }
        t tVar = b.get(view);
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(view);
        b.put(view, tVar2);
        return tVar2;
    }

    public static x c(View view, x xVar) {
        WindowInsets h2;
        if (Build.VERSION.SDK_INT >= 21 && (h2 = xVar.h()) != null) {
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(h2);
            if (!dispatchApplyWindowInsets.equals(h2)) {
                return x.j(dispatchApplyWindowInsets, view);
            }
        }
        return xVar;
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return h.a(view).b(view, keyEvent);
    }

    public static View.AccessibilityDelegate e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        if (f1339d) {
            return null;
        }
        if (c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f1339d = true;
                return null;
            }
        }
        Object obj = c.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static CharSequence f(View view) {
        return j().b(view);
    }

    public static x g(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return e.e.i.b.B(view);
        }
        if (i2 >= 21) {
            return e.e.i.b.A(view);
        }
        return null;
    }

    public static String h(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = a;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static x i(View view, x xVar) {
        WindowInsets h2;
        if (Build.VERSION.SDK_INT >= 21 && (h2 = xVar.h()) != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(h2);
            if (!onApplyWindowInsets.equals(h2)) {
                return x.j(onApplyWindowInsets, view);
            }
        }
        return xVar;
    }

    public static f<CharSequence> j() {
        return new c(2131297647, CharSequence.class, 8, 28);
    }

    public static c k(View view, c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        m mVar = (m) view.getTag(2131297652);
        if (mVar != null) {
            c a2 = mVar.a(view, cVar);
            if (a2 == null) {
                return null;
            }
            return (view instanceof n ? (n) view : f1340e).a(a2);
        }
        return (view instanceof n ? (n) view : f1340e).a(cVar);
    }

    public static void l(View view) {
        if (Build.VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
        } else {
            view.requestFitSystemWindows();
        }
    }

    public static void m(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            e.e.i.b.O(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    public static f<Boolean> n() {
        return new b(2131297655, Boolean.class, 28);
    }

    public static void o(View view, a aVar) {
        if (aVar == null && (e(view) instanceof a.C0044a)) {
            aVar = new a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.a());
    }

    public static void p(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (a == null) {
            a = new WeakHashMap<>();
        }
        a.put(view, str);
    }

    public static f<CharSequence> q() {
        return new d(2131297656, CharSequence.class, 64, 30);
    }
}
