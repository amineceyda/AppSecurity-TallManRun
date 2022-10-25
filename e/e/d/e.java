package e.e.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import e.b.a;
import e.e.c.c.c;
import e.e.c.c.d;
import e.e.d.j;
import e.e.g.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class e extends j {
    public static Class<?> b = null;
    public static Constructor<?> c = null;

    /* renamed from: d  reason: collision with root package name */
    public static Method f1291d = null;

    /* renamed from: e  reason: collision with root package name */
    public static Method f1292e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f1293f = false;

    public static boolean h(Object obj, String str, int i2, boolean z) {
        j();
        try {
            return ((Boolean) f1291d.invoke(obj, new Object[]{str, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void j() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f1293f) {
            f1293f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
                method2 = null;
                cls = null;
                method = null;
            }
            c = constructor;
            b = cls;
            f1291d = method;
            f1292e = method2;
        }
    }

    public Typeface a(Context context, c cVar, Resources resources, int i2) {
        j();
        try {
            Object newInstance = c.newInstance(new Object[0]);
            d[] dVarArr = cVar.a;
            int length = dVarArr.length;
            int i3 = 0;
            while (i3 < length) {
                d dVar = dVarArr[i3];
                File o = a.o(context);
                if (o == null) {
                    return null;
                }
                try {
                    if (!a.d(o, resources, dVar.f1287f)) {
                        o.delete();
                        return null;
                    } else if (!h(newInstance, o.getPath(), dVar.b, dVar.c)) {
                        return null;
                    } else {
                        i3++;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    o.delete();
                }
            }
            j();
            try {
                Object newInstance2 = Array.newInstance(b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f1292e.invoke((Object) null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, l[] lVarArr, int i2) {
        FileInputStream fileInputStream;
        if (lVarArr.length < 1) {
            return null;
        }
        l lVar = (l) j.e(lVarArr, i2, new j.a(this));
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(lVar.a, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File i3 = i(openFileDescriptor);
                if (i3 != null) {
                    if (i3.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(i3);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface c2 = c(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return c2;
            } catch (Throwable th) {
                openFileDescriptor.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public final File i(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
            return null;
        } catch (ErrnoException unused) {
            return null;
        }
    }
}
