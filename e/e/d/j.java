package e.e.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import e.e.c.c.c;
import e.e.c.c.d;
import e.e.g.l;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

public class j {
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, c> a = new ConcurrentHashMap<>();

    public class a implements b<l> {
        public a(j jVar) {
        }

        public int a(Object obj) {
            return ((l) obj).c;
        }

        public boolean b(Object obj) {
            return ((l) obj).f1325d;
        }
    }

    public interface b<T> {
        int a(T t);

        boolean b(T t);
    }

    public static <T> T e(T[] tArr, int i2, b<T> bVar) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z = (i2 & 2) != 0;
        T t = null;
        int i4 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(bVar.a(t2) - i3) * 2) + (bVar.b(t2) == z ? 0 : 1);
            if (t == null || i4 > abs) {
                t = t2;
                i4 = abs;
            }
        }
        return t;
    }

    public static long g(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0;
        } catch (IllegalAccessException e3) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e3);
            return 0;
        }
    }

    public Typeface a(Context context, c cVar, Resources resources, int i2) {
        d dVar = (d) e(cVar.a, i2, new k(this));
        if (dVar == null) {
            return null;
        }
        Typeface b2 = d.b(context, resources, dVar.f1287f, dVar.a, i2);
        long g2 = g(b2);
        if (g2 != 0) {
            this.a.put(Long.valueOf(g2), cVar);
        }
        return b2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0024 A[SYNTHETIC, Splitter:B:17:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x002b A[SYNTHETIC, Splitter:B:25:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface b(android.content.Context r3, android.os.CancellationSignal r4, e.e.g.l[] r5, int r6) {
        /*
            r2 = this;
            int r4 = r5.length
            r0 = 0
            r1 = 1
            if (r4 >= r1) goto L_0x0006
            return r0
        L_0x0006:
            e.e.g.l r4 = r2.f(r5, r6)
            android.content.ContentResolver r5 = r3.getContentResolver()     // Catch:{ IOException -> 0x0028, all -> 0x0021 }
            android.net.Uri r4 = r4.a     // Catch:{ IOException -> 0x0028, all -> 0x0021 }
            java.io.InputStream r4 = r5.openInputStream(r4)     // Catch:{ IOException -> 0x0028, all -> 0x0021 }
            android.graphics.Typeface r3 = r2.c(r3, r4)     // Catch:{ IOException -> 0x0029, all -> 0x001e }
            if (r4 == 0) goto L_0x001d
            r4.close()     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            return r3
        L_0x001e:
            r3 = move-exception
            r0 = r4
            goto L_0x0022
        L_0x0021:
            r3 = move-exception
        L_0x0022:
            if (r0 == 0) goto L_0x0027
            r0.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            throw r3
        L_0x0028:
            r4 = r0
        L_0x0029:
            if (r4 == 0) goto L_0x002e
            r4.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.d.j.b(android.content.Context, android.os.CancellationSignal, e.e.g.l[], int):android.graphics.Typeface");
    }

    public Typeface c(Context context, InputStream inputStream) {
        File o = e.b.a.o(context);
        if (o == null) {
            return null;
        }
        try {
            if (!e.b.a.e(o, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(o.getPath());
            o.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            o.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        File o = e.b.a.o(context);
        if (o == null) {
            return null;
        }
        try {
            if (!e.b.a.d(o, resources, i2)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(o.getPath());
            o.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            o.delete();
        }
    }

    public l f(l[] lVarArr, int i2) {
        return (l) e(lVarArr, i2, new a(this));
    }
}
