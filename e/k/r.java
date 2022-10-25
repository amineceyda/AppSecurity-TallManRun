package e.k;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import e.p.a;
import e.p.c;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public final class r extends v {

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f1525f;

    /* renamed from: g  reason: collision with root package name */
    public static final Class<?>[] f1526g;
    public final Application a;
    public final u b;
    public final Bundle c;

    /* renamed from: d  reason: collision with root package name */
    public final e f1527d;

    /* renamed from: e  reason: collision with root package name */
    public final a f1528e;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Class<?>[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<e.k.q> r0 = e.k.q.class
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r0
            f1525f = r1
            java.lang.Class[] r1 = new java.lang.Class[r2]
            r1[r3] = r0
            f1526g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.k.r.<clinit>():void");
    }

    @SuppressLint({"LambdaLast"})
    public r(Application application, c cVar, Bundle bundle) {
        u uVar;
        this.f1528e = cVar.getSavedStateRegistry();
        this.f1527d = cVar.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (t.c == null) {
                t.c = new t(application);
            }
            uVar = t.c;
        } else {
            if (w.a == null) {
                w.a = new w();
            }
            uVar = w.a;
        }
        this.b = uVar;
    }

    public static <T> Constructor<T> d(Class<T> cls, Class<?>[] clsArr) {
        for (Constructor<T> constructor : cls.getConstructors()) {
            if (Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    public <T extends s> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public void b(s sVar) {
        SavedStateHandleController.h(sVar, this.f1528e, this.f1527d);
    }

    public <T extends s> T c(String str, Class<T> cls) {
        q qVar;
        T t;
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor<T> d2 = (!isAssignableFrom || this.a == null) ? d(cls, f1526g) : d(cls, f1525f);
        if (d2 == null) {
            return this.b.a(cls);
        }
        a aVar = this.f1528e;
        e eVar = this.f1527d;
        Bundle bundle = this.c;
        Bundle a2 = aVar.a(str);
        Class[] clsArr = q.f1523e;
        if (a2 == null && bundle == null) {
            qVar = new q();
        } else {
            HashMap hashMap = new HashMap();
            if (bundle != null) {
                for (String str2 : bundle.keySet()) {
                    hashMap.put(str2, bundle.get(str2));
                }
            }
            if (a2 == null) {
                qVar = new q(hashMap);
            } else {
                ArrayList parcelableArrayList = a2.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = a2.getParcelableArrayList("values");
                if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                    throw new IllegalStateException("Invalid bundle passed as restored state");
                }
                for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                    hashMap.put((String) parcelableArrayList.get(i2), parcelableArrayList2.get(i2));
                }
                qVar = new q(hashMap);
            }
        }
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, qVar);
        savedStateHandleController.i(aVar, eVar);
        SavedStateHandleController.j(aVar, eVar);
        if (isAssignableFrom) {
            try {
                Application application = this.a;
                if (application != null) {
                    t = d2.newInstance(new Object[]{application, savedStateHandleController.f241d});
                    T t2 = (s) t;
                    t2.b("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
                    return t2;
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(g.a.a.a.a.v("Failed to access ", cls), e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("A " + cls + " cannot be instantiated.", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(g.a.a.a.a.v("An exception happened in constructor of ", cls), e4.getCause());
            }
        }
        t = d2.newInstance(new Object[]{savedStateHandleController.f241d});
        T t22 = (s) t;
        t22.b("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
        return t22;
    }
}
