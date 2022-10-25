package g.e.a.b.e.c;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

public final class v9 {
    public static final Unsafe a;
    public static final Class b = j6.a();
    public static final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public static final u9 f3057d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f3058e;

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f3059f;

    /* renamed from: g  reason: collision with root package name */
    public static final long f3060g = ((long) s(byte[].class));

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f3061h;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0132  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            sun.misc.Unsafe r7 = k()
            a = r7
            java.lang.Class r8 = g.e.a.b.e.c.j6.a()
            b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = q(r8)
            c = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = q(r10)
            r11 = 0
            if (r7 != 0) goto L_0x002c
            goto L_0x003b
        L_0x002c:
            if (r9 == 0) goto L_0x0034
            g.e.a.b.e.c.t9 r11 = new g.e.a.b.e.c.t9
            r11.<init>(r7)
            goto L_0x003b
        L_0x0034:
            if (r10 == 0) goto L_0x003b
            g.e.a.b.e.c.s9 r11 = new g.e.a.b.e.c.s9
            r11.<init>(r7)
        L_0x003b:
            f3057d = r11
            java.lang.String r7 = "getLong"
            java.lang.String r9 = "objectFieldOffset"
            r10 = 2
            r12 = 1
            r13 = 0
            if (r11 != 0) goto L_0x0048
        L_0x0046:
            r8 = 0
            goto L_0x006e
        L_0x0048:
            sun.misc.Unsafe r11 = r11.a
            java.lang.Class r11 = r11.getClass()     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x0069 }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r14[r13] = r15     // Catch:{ all -> 0x0069 }
            r11.getMethod(r9, r14)     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x0069 }
            r14[r13] = r6     // Catch:{ all -> 0x0069 }
            r14[r12] = r8     // Catch:{ all -> 0x0069 }
            r11.getMethod(r7, r14)     // Catch:{ all -> 0x0069 }
            java.lang.reflect.Field r8 = b()     // Catch:{ all -> 0x0069 }
            if (r8 != 0) goto L_0x0067
            goto L_0x0046
        L_0x0067:
            r8 = 1
            goto L_0x006e
        L_0x0069:
            r8 = move-exception
            java.util.logging.Logger.getLogger(g.e.a.b.e.c.v9.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r8.toString()))
            goto L_0x0046
        L_0x006e:
            f3058e = r8
            g.e.a.b.e.c.u9 r8 = f3057d
            if (r8 != 0) goto L_0x0076
        L_0x0074:
            r6 = 0
            goto L_0x00ed
        L_0x0076:
            sun.misc.Unsafe r8 = r8.a
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r11 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.reflect.Field> r14 = java.lang.reflect.Field.class
            r11[r13] = r14     // Catch:{ all -> 0x00e8 }
            r8.getMethod(r9, r11)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r11 = "arrayBaseOffset"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r11 = "arrayIndexScale"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r9[r13] = r6     // Catch:{ all -> 0x00e8 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x00e8 }
            r9[r12] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r14 = "getInt"
            r8.getMethod(r14, r9)     // Catch:{ all -> 0x00e8 }
            r9 = 3
            java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e8 }
            r14[r13] = r6     // Catch:{ all -> 0x00e8 }
            r14[r12] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00e8 }
            r14[r10] = r15     // Catch:{ all -> 0x00e8 }
            java.lang.String r15 = "putInt"
            r8.getMethod(r15, r14)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r14[r13] = r6     // Catch:{ all -> 0x00e8 }
            r14[r12] = r11     // Catch:{ all -> 0x00e8 }
            r8.getMethod(r7, r14)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e8 }
            r7[r13] = r6     // Catch:{ all -> 0x00e8 }
            r7[r12] = r11     // Catch:{ all -> 0x00e8 }
            r7[r10] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r14 = "putLong"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r7 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r7[r13] = r6     // Catch:{ all -> 0x00e8 }
            r7[r12] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r14 = "getObject"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e8 }
            r7[r13] = r6     // Catch:{ all -> 0x00e8 }
            r7[r12] = r11     // Catch:{ all -> 0x00e8 }
            r7[r10] = r6     // Catch:{ all -> 0x00e8 }
            java.lang.String r6 = "putObject"
            r8.getMethod(r6, r7)     // Catch:{ all -> 0x00e8 }
            r6 = 1
            goto L_0x00ed
        L_0x00e8:
            r6 = move-exception
            java.util.logging.Logger.getLogger(g.e.a.b.e.c.v9.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r6.toString()))
            goto L_0x0074
        L_0x00ed:
            f3059f = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = s(r6)
            long r6 = (long) r6
            f3060g = r6
            s(r5)
            a(r5)
            s(r4)
            a(r4)
            s(r3)
            a(r3)
            s(r2)
            a(r2)
            s(r1)
            a(r1)
            s(r0)
            a(r0)
            java.lang.reflect.Field r0 = b()
            if (r0 == 0) goto L_0x0129
            g.e.a.b.e.c.u9 r1 = f3057d
            if (r1 == 0) goto L_0x0129
            r1.l(r0)
        L_0x0129:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0132
            goto L_0x0133
        L_0x0132:
            r12 = 0
        L_0x0133:
            f3061h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.v9.<clinit>():void");
    }

    public static int a(Class cls) {
        if (f3059f) {
            return f3057d.i(cls);
        }
        return -1;
    }

    public static Field b() {
        Field field;
        Field field2;
        int i2 = j6.a;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field != null) {
            return field;
        }
        try {
            field2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field2 = null;
        }
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    public static void c(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        u9 u9Var = f3057d;
        int i2 = ((((int) j2) ^ -1) & 3) << 3;
        u9Var.n(obj, j3, ((255 & b2) << i2) | (u9Var.j(obj, j3) & ((255 << i2) ^ -1)));
    }

    public static void d(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        u9 u9Var = f3057d;
        int i2 = (((int) j2) & 3) << 3;
        u9Var.n(obj, j3, ((255 & b2) << i2) | (u9Var.j(obj, j3) & ((255 << i2) ^ -1)));
    }

    public static double e(Object obj, long j2) {
        return f3057d.a(obj, j2);
    }

    public static float f(Object obj, long j2) {
        return f3057d.b(obj, j2);
    }

    public static int g(Object obj, long j2) {
        return f3057d.j(obj, j2);
    }

    public static long h(Object obj, long j2) {
        return f3057d.k(obj, j2);
    }

    public static Object i(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object j(Object obj, long j2) {
        return f3057d.m(obj, j2);
    }

    public static Unsafe k() {
        try {
            return (Unsafe) AccessController.doPrivileged(new r9());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void m(Object obj, long j2, double d2) {
        f3057d.e(obj, j2, d2);
    }

    public static void n(Object obj, long j2, long j3) {
        f3057d.o(obj, j2, j3);
    }

    public static /* synthetic */ boolean o(Object obj, long j2) {
        return ((byte) ((f3057d.j(obj, -4 & j2) >>> ((int) (((j2 ^ -1) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean p(Object obj, long j2) {
        return ((byte) ((f3057d.j(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3))) & 255)) != 0;
    }

    public static boolean q(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i2 = j6.a;
        try {
            Class cls3 = b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean r(Object obj, long j2) {
        return f3057d.g(obj, j2);
    }

    public static int s(Class cls) {
        if (f3059f) {
            return f3057d.h(cls);
        }
        return -1;
    }
}
