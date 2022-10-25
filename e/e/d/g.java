package e.e.d;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import e.e.c.c.c;
import e.e.c.c.d;
import e.e.d.j;
import e.e.g.l;
import g.a.a.a.a;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class g extends e {

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f1296g;

    /* renamed from: h  reason: collision with root package name */
    public final Constructor<?> f1297h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f1298i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f1299j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f1300k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f1301l;

    /* renamed from: m  reason: collision with root package name */
    public final Method f1302m;

    public g() {
        Method method;
        Method method2;
        Method method3;
        Constructor<?> constructor;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = q(cls2);
            method2 = r(cls2);
            method = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            Class<?> cls3 = cls2;
            method5 = s(cls2);
            cls = cls3;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            StringBuilder i2 = a.i("Unable to collect necessary methods for class ");
            i2.append(e2.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", i2.toString(), e2);
            method5 = null;
            method4 = null;
            constructor = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f1296g = cls;
        this.f1297h = constructor;
        this.f1298i = method3;
        this.f1299j = method2;
        this.f1300k = method;
        this.f1301l = method4;
        this.f1302m = method5;
    }

    private Object p() {
        try {
            return this.f1297h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Typeface a(Context context, c cVar, Resources resources, int i2) {
        if (!o()) {
            return super.a(context, cVar, resources, i2);
        }
        Object p = p();
        if (p == null) {
            return null;
        }
        for (d dVar : cVar.a) {
            if (!l(context, p, dVar.a, dVar.f1286e, dVar.b, dVar.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.f1285d))) {
                k(p);
                return null;
            }
        }
        if (!n(p)) {
            return null;
        }
        return m(p);
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, l[] lVarArr, int i2) {
        Typeface m2;
        boolean z;
        ParcelFileDescriptor openFileDescriptor;
        if (lVarArr.length < 1) {
            return null;
        }
        if (!o()) {
            l lVar = (l) j.e(lVarArr, i2, new j.a(this));
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(lVar.a, "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(lVar.c).setItalic(lVar.f1325d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            HashMap hashMap = new HashMap();
            for (l lVar2 : lVarArr) {
                if (lVar2.f1326e == 0) {
                    Uri uri = lVar2.a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, e.b.a.p(context, cancellationSignal, uri));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            Object p = p();
            if (p == null) {
                return null;
            }
            boolean z2 = false;
            for (l lVar3 : lVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(lVar3.a);
                if (byteBuffer != null) {
                    try {
                        z = ((Boolean) this.f1299j.invoke(p, new Object[]{byteBuffer, Integer.valueOf(lVar3.b), null, Integer.valueOf(lVar3.c), Integer.valueOf(lVar3.f1325d ? 1 : 0)})).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z = false;
                    }
                    if (!z) {
                        k(p);
                        return null;
                    }
                    z2 = true;
                }
            }
            if (!z2) {
                k(p);
                return null;
            } else if (n(p) && (m2 = m(p)) != null) {
                return Typeface.create(m2, i2);
            } else {
                return null;
            }
        }
        throw th;
    }

    public Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        if (!o()) {
            return super.d(context, resources, i2, str, i3);
        }
        Object p = p();
        if (p == null) {
            return null;
        }
        if (!l(context, p, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            k(p);
            return null;
        } else if (!n(p)) {
            return null;
        } else {
            return m(p);
        }
    }

    public final void k(Object obj) {
        try {
            this.f1301l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean l(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1298i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface m(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f1296g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1302m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean n(Object obj) {
        try {
            return ((Boolean) this.f1300k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean o() {
        if (this.f1298i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f1298i != null;
    }

    public Method q(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    public Method r(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    public Method s(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
