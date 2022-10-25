package e.e.f;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.util.DynamicClassLoadingException;
import ch.qos.logback.core.util.IncompatibleClassException;
import e.h.b.n;
import f.a.a.a.l.i;
import f.a.a.b.j;
import f.a.a.b.q.d.d;
import f.a.a.b.r.a.c;
import f.a.a.b.r.a.e;
import f.a.a.b.r.a.f;
import f.a.a.b.r.a.g;
import f.a.a.b.z.m;
import g.a.a.a.a;
import i.o.c.h;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.zip.ZipException;

public final class b {
    public static Field a;
    public static boolean b;

    public static String A(Locale locale) {
        if (Build.VERSION.SDK_INT >= 21) {
            return locale.toLanguageTag();
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        return (country == null || country.isEmpty()) ? language : (variant == null || variant.isEmpty()) ? a.c(language, "-", country) : a.d(language, "-", country, "-", variant);
    }

    public static void a(d dVar) {
        Class<f.a.a.a.f.a> cls = f.a.a.a.f.a.class;
        Class<j> cls2 = j.class;
        Class<f.a.a.a.d> cls3 = f.a.a.a.d.class;
        Class<f.a.a.b.b> cls4 = f.a.a.b.b.class;
        dVar.a(cls4, "layout", cls3);
        dVar.a(cls2, "layout", cls3);
        dVar.a(cls4, "encoder", cls);
        dVar.a(cls2, "encoder", cls);
        Class<f.a.a.b.r.a.b> cls5 = f.a.a.b.r.a.b.class;
        Class<f.a.a.b.r.a.d> cls6 = f.a.a.b.r.a.d.class;
        dVar.a(c.class, "ssl", cls6);
        dVar.a(cls6, "parameters", e.class);
        dVar.a(cls6, "keyStore", cls5);
        dVar.a(cls6, "trustStore", cls5);
        dVar.a(cls6, "keyManagerFactory", f.a.a.b.r.a.a.class);
        dVar.a(cls6, "trustManagerFactory", g.class);
        dVar.a(cls6, "secureRandom", f.class);
    }

    public static int b(int i2) {
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T c(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static NotificationChannel d(String str, String str2, NotificationManager notificationManager, boolean z) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        NotificationChannel notificationChannel = new NotificationChannel(str, str2, 2);
        notificationChannel.setDescription("channel_description");
        notificationChannel.enableLights(true);
        notificationChannel.setLightColor(-16776961);
        notificationChannel.enableVibration(false);
        if (z) {
            notificationChannel.enableVibration(true);
            notificationChannel.setVibrationPattern(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
        }
        notificationChannel.setShowBadge(true);
        notificationManager.createNotificationChannel(notificationChannel);
        return notificationChannel;
    }

    public static String e(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        String lowerCase = str.substring(0, 1).toLowerCase(Locale.US);
        if (str.length() <= 1) {
            return lowerCase;
        }
        StringBuilder i2 = a.i(lowerCase);
        i2.append(str.substring(1));
        return i2.toString();
    }

    public static void f(List<String> list, Throwable th, StackTraceElement[] stackTraceElementArr) {
        int i2;
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTraceElementArr == null) {
            i2 = 0;
        } else {
            int length = stackTrace.length - 1;
            int length2 = stackTraceElementArr.length - 1;
            int i3 = 0;
            while (length >= 0 && length2 >= 0 && stackTrace[length].equals(stackTraceElementArr[length2])) {
                i3++;
                length--;
                length2--;
            }
            i2 = i3;
        }
        StringBuilder i4 = a.i(stackTraceElementArr != null ? "Caused by: " : "");
        i4.append(th.getClass().getName());
        String sb = i4.toString();
        if (th.getMessage() != null) {
            StringBuilder l2 = a.l(sb, ": ");
            l2.append(th.getMessage());
            sb = l2.toString();
        }
        list.add(sb);
        for (int i5 = 0; i5 < stackTrace.length - i2; i5++) {
            StringBuilder i6 = a.i("\tat ");
            i6.append(stackTrace[i5].toString());
            list.add(i6.toString());
        }
        if (i2 != 0) {
            list.add("\t... " + i2 + " common frames omitted");
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            f(list, cause, stackTrace);
        }
    }

    public static e.n.d g(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length = randomAccessFile.length() - 22;
        long j2 = 0;
        if (length >= 0) {
            long j3 = length - PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
            if (j3 >= 0) {
                j2 = j3;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    e.n.d dVar = new e.n.d();
                    dVar.b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    dVar.a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    return dVar;
                }
                length--;
            } while (length >= j2);
            throw new ZipException("End Of Central Directory signature not found");
        }
        StringBuilder i2 = a.i("File too short to be a zip file: ");
        i2.append(randomAccessFile.length());
        throw new ZipException(i2.toString());
    }

    public static int h(StackTraceElement[] stackTraceElementArr, i[] iVarArr) {
        int i2 = 0;
        if (!(iVarArr == null || stackTraceElementArr == null)) {
            int length = stackTraceElementArr.length - 1;
            int length2 = iVarArr.length - 1;
            while (length >= 0 && length2 >= 0 && stackTraceElementArr[length].equals(iVarArr[length2].ste)) {
                i2++;
                length--;
                length2--;
            }
        }
        return i2;
    }

    public static Locale i(String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            return Locale.forLanguageTag(str);
        }
        String[] split = str.split("-", -1);
        return split.length == 1 ? new Locale(split[0]) : (split.length == 2 || (split.length == 3 && split[2].startsWith("#"))) ? new Locale(split[0], split[1]) : new Locale(split[0], split[1], split[2]);
    }

    public static void j(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                StringBuilder i2 = a.i("forceSetFactory2 Could not find field 'mFactory2' on class ");
                i2.append(LayoutInflater.class.getName());
                i2.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", i2.toString(), e2);
            }
            b = true;
        }
        Field field = a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e3) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e3);
            }
        }
    }

    public static final ConnectivityManager k(Context context) {
        h.e(context, "<this>");
        Object systemService = context.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (ConnectivityManager) systemService;
    }

    public static String l(String str) {
        try {
            return System.getenv(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0061 A[SYNTHETIC, Splitter:B:29:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006e A[SYNTHETIC, Splitter:B:37:0x006e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m(java.io.File r7) {
        /*
            boolean r0 = r7.isFile()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]
            java.lang.String r3 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch:{ Exception -> 0x005a, all -> 0x0058 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x005a, all -> 0x0058 }
            r4.<init>(r7)     // Catch:{ Exception -> 0x005a, all -> 0x0058 }
        L_0x0017:
            r7 = 0
            int r5 = r4.read(r2, r7, r0)     // Catch:{ Exception -> 0x0056 }
            r6 = -1
            if (r5 == r6) goto L_0x0023
            r3.update(r2, r7, r5)     // Catch:{ Exception -> 0x0056 }
            goto L_0x0017
        L_0x0023:
            r4.close()     // Catch:{ Exception -> 0x0056 }
            r4.close()     // Catch:{ IOException -> 0x002a }
            goto L_0x002e
        L_0x002a:
            r0 = move-exception
            r0.printStackTrace()
        L_0x002e:
            java.math.BigInteger r0 = new java.math.BigInteger
            r1 = 1
            byte[] r2 = r3.digest()
            r0.<init>(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 16
            java.lang.String r0 = r0.toString(r2)
            r1.<init>(r0)
        L_0x0043:
            int r0 = r1.length()
            r2 = 32
            if (r0 >= r2) goto L_0x0051
            java.lang.String r0 = "0"
            r1.insert(r7, r0)
            goto L_0x0043
        L_0x0051:
            java.lang.String r7 = r1.toString()
            return r7
        L_0x0056:
            r7 = move-exception
            goto L_0x005c
        L_0x0058:
            r7 = move-exception
            goto L_0x006c
        L_0x005a:
            r7 = move-exception
            r4 = r1
        L_0x005c:
            r7.printStackTrace()     // Catch:{ all -> 0x006a }
            if (r4 == 0) goto L_0x0069
            r4.close()     // Catch:{ IOException -> 0x0065 }
            goto L_0x0069
        L_0x0065:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0069:
            return r1
        L_0x006a:
            r7 = move-exception
            r1 = r4
        L_0x006c:
            if (r1 == 0) goto L_0x0076
            r1.close()     // Catch:{ IOException -> 0x0072 }
            goto L_0x0076
        L_0x0072:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0076:
            goto L_0x0078
        L_0x0077:
            throw r7
        L_0x0078:
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.f.b.m(java.io.File):java.lang.String");
    }

    public static f.a.a.b.q.e.c[] n(Class<?> cls) {
        Class<?> cls2;
        HashMap hashMap = new HashMap();
        for (Method method : cls.getMethods()) {
            String name = method.getName();
            boolean z = name.startsWith("get") && name.length() > 3;
            boolean z2 = name.startsWith("set") && name.length() > 3;
            if (z || z2) {
                String e2 = e(name.substring(3));
                f.a.a.b.q.e.c cVar = (f.a.a.b.q.e.c) hashMap.get(e2);
                if (cVar == null) {
                    cVar = new f.a.a.b.q.e.c(e2);
                    hashMap.put(e2, cVar);
                }
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (z2) {
                    if (parameterTypes.length == 1) {
                        cVar.a = method;
                        cls2 = parameterTypes[0];
                    }
                } else if (z && parameterTypes.length == 0 && cVar.c == null) {
                    cls2 = method.getReturnType();
                }
                cVar.c = cls2;
            }
        }
        return (f.a.a.b.q.e.c[]) hashMap.values().toArray(new f.a.a.b.q.e.c[0]);
    }

    public static int o(String str, int i2) {
        int indexOf = str.indexOf(46, i2);
        int indexOf2 = str.indexOf(36, i2);
        if (indexOf == -1 && indexOf2 == -1) {
            return -1;
        }
        return indexOf == -1 ? indexOf2 : (indexOf2 != -1 && indexOf >= indexOf2) ? indexOf2 : indexOf;
    }

    public static String p(String str) {
        Method method;
        String str2;
        String str3 = null;
        try {
            String property = System.getProperty(str);
            if (property != null) {
                return property;
            }
            try {
                f.a.a.b.k.a aVar = f.a.a.b.k.a.c;
                Class<?> cls = aVar.a;
                if (!(cls == null || (method = aVar.b) == null)) {
                    str2 = (String) method.invoke(cls, new Object[]{str, null});
                    if (str2 != null) {
                        if (str2.length() != 0) {
                            str3 = str2;
                        }
                    }
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (Exception unused) {
                str2 = null;
            } catch (IllegalArgumentException unused2) {
            }
            return str3;
        } catch (SecurityException unused3) {
            return null;
        }
    }

    public static void q(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(9);
        }
    }

    public static Object r(String str, Class<?> cls, f.a.a.b.d dVar) throws IncompatibleClassException, DynamicClassLoadingException {
        ClassLoader a2 = m.a(dVar);
        Objects.requireNonNull(str);
        try {
            Class<?> loadClass = a2.loadClass(str);
            if (cls.isAssignableFrom(loadClass)) {
                return loadClass.getConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new IncompatibleClassException(cls, loadClass);
        } catch (IncompatibleClassException e2) {
            throw e2;
        } catch (Throwable th) {
            throw new DynamicClassLoadingException(a.w("Failed to instantiate type ", str), th);
        }
    }

    public static boolean s(String str) {
        return str == null || "".equals(str);
    }

    public static n t(Context context, Fragment fragment, boolean z, boolean z2) {
        int nextTransition = fragment.getNextTransition();
        int popEnterAnim = z2 ? z ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z ? fragment.getEnterAnim() : fragment.getExitAnim();
        boolean z3 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (!(viewGroup == null || viewGroup.getTag(2131297883) == null)) {
            fragment.mContainer.setTag(2131297883, (Object) null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, popEnterAnim);
        if (onCreateAnimation != null) {
            return new n(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, popEnterAnim);
        if (onCreateAnimator != null) {
            return new n(onCreateAnimator);
        }
        if (popEnterAnim == 0 && nextTransition != 0) {
            popEnterAnim = nextTransition != 4097 ? nextTransition != 4099 ? nextTransition != 8194 ? -1 : z ? 2130837507 : 2130837508 : z ? 2130837509 : 2130837510 : z ? 2130837511 : 2130837512;
        }
        if (popEnterAnim != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                    if (loadAnimation != null) {
                        return new n(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                    if (loadAnimator != null) {
                        return new n(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                        if (loadAnimation2 != null) {
                            return new n(loadAnimation2);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        return null;
    }

    public static void u(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                j(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                j(layoutInflater, factory2);
            }
        }
    }

    public static void v(f.a.a.b.q.d.i iVar, String str, String str2, f.a.a.b.q.b.c cVar) {
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            Objects.requireNonNull(iVar);
            if (str != null && str2 != null) {
                iVar.f1741g.put(str, str2.trim());
            }
        } else if (ordinal == 1) {
            iVar.c.h(str, str2);
        } else if (ordinal == 2) {
            w(iVar, str, str2);
        }
    }

    public static void w(f.a.a.b.w.c cVar, String str, String str2) {
        try {
            System.setProperty(str, str2);
        } catch (SecurityException e2) {
            cVar.c("Failed to set system property [" + str + "]", e2);
        }
    }

    public static <E> void x(f.a.a.b.s.b<E> bVar) {
        f.a.a.b.s.a aVar;
        while (bVar != null) {
            if (bVar instanceof f.a.a.b.s.a) {
                f.a.a.b.s.a aVar2 = (f.a.a.b.s.a) bVar;
                x(aVar2.f1757g);
                aVar = aVar2;
            } else if (bVar instanceof f.a.a.b.s.c) {
                aVar = (f.a.a.b.s.c) bVar;
            } else {
                bVar = bVar.b;
            }
            aVar.start();
            bVar = bVar.b;
        }
    }

    public static f.a.a.b.q.b.c y(String str) {
        f.a.a.b.q.b.c cVar = f.a.a.b.q.b.c.SYSTEM;
        if (cVar.toString().equalsIgnoreCase(str)) {
            return cVar;
        }
        f.a.a.b.q.b.c cVar2 = f.a.a.b.q.b.c.CONTEXT;
        return cVar2.toString().equalsIgnoreCase(str) ? cVar2 : f.a.a.b.q.b.c.LOCAL;
    }

    public static boolean z(String str, boolean z) {
        if (str == null) {
            return z;
        }
        String trim = str.trim();
        if ("true".equalsIgnoreCase(trim)) {
            return true;
        }
        if ("false".equalsIgnoreCase(trim)) {
            return false;
        }
        return z;
    }
}
