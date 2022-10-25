package j.a;

import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class m extends q0 {
    public static final int c;

    /* renamed from: d  reason: collision with root package name */
    public static final m f4613d = new m();
    public static volatile Executor pool;

    public static final class a implements ThreadFactory {
        public final /* synthetic */ AtomicInteger a;

        public a(AtomicInteger atomicInteger) {
            this.a = atomicInteger;
        }

        public final Thread newThread(Runnable runnable) {
            StringBuilder i2 = g.a.a.a.a.i("CommonPool-worker-");
            i2.append(this.a.incrementAndGet());
            Thread thread = new Thread(runnable, i2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0072 A[SYNTHETIC] */
    static {
        /*
            j.a.m r0 = new j.a.m
            r0.<init>()
            f4613d = r0
            r0 = 0
            java.lang.String r1 = "kotlinx.coroutines.default.parallelism"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch:{ all -> 0x000f }
            goto L_0x0010
        L_0x000f:
            r1 = r0
        L_0x0010:
            if (r1 == 0) goto L_0x009b
            java.lang.String r2 = "$this$toIntOrNull"
            i.o.c.h.e(r1, r2)
            i.o.c.h.e(r1, r2)
            r2 = 10
            g.c.b.b.f.p(r2)
            int r3 = r1.length()
            r4 = 1
            if (r3 != 0) goto L_0x0027
            goto L_0x007e
        L_0x0027:
            r5 = 0
            char r6 = r1.charAt(r5)
            r7 = 48
            int r7 = i.o.c.h.g(r6, r7)
            r8 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r7 >= 0) goto L_0x0049
            if (r3 != r4) goto L_0x003a
            goto L_0x007e
        L_0x003a:
            r7 = 45
            if (r6 != r7) goto L_0x0043
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 1
            r7 = 1
            goto L_0x004b
        L_0x0043:
            r7 = 43
            if (r6 != r7) goto L_0x007e
            r6 = 1
            goto L_0x004a
        L_0x0049:
            r6 = 0
        L_0x004a:
            r7 = 0
        L_0x004b:
            r9 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r10 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
        L_0x0051:
            if (r6 >= r3) goto L_0x0072
            char r11 = r1.charAt(r6)
            int r11 = java.lang.Character.digit(r11, r2)
            if (r11 >= 0) goto L_0x005e
            goto L_0x007e
        L_0x005e:
            if (r5 >= r10) goto L_0x0067
            if (r10 != r9) goto L_0x007e
            int r10 = r8 / 10
            if (r5 >= r10) goto L_0x0067
            goto L_0x007e
        L_0x0067:
            int r5 = r5 * 10
            int r12 = r8 + r11
            if (r5 >= r12) goto L_0x006e
            goto L_0x007e
        L_0x006e:
            int r5 = r5 - r11
            int r6 = r6 + 1
            goto L_0x0051
        L_0x0072:
            if (r7 == 0) goto L_0x0079
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L_0x007e
        L_0x0079:
            int r0 = -r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x007e:
            if (r0 == 0) goto L_0x008b
            int r2 = r0.intValue()
            if (r2 < r4) goto L_0x008b
            int r0 = r0.intValue()
            goto L_0x009c
        L_0x008b:
            java.lang.String r0 = "Expected positive number in kotlinx.coroutines.default.parallelism, but has "
            java.lang.String r0 = g.a.a.a.a.w(r0, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x009b:
            r0 = -1
        L_0x009c:
            c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.m.<clinit>():void");
    }

    public final ExecutorService O() {
        return Executors.newFixedThreadPool(Q(), new a(new AtomicInteger()));
    }

    public final ExecutorService P() {
        Class<?> cls;
        ExecutorService executorService;
        Integer num;
        if (System.getSecurityManager() != null) {
            return O();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return O();
        }
        if (c < 0) {
            try {
                Method method = cls.getMethod("commonPool", new Class[0]);
                Object invoke = method != null ? method.invoke((Object) null, new Object[0]) : null;
                if (!(invoke instanceof ExecutorService)) {
                    invoke = null;
                }
                executorService = (ExecutorService) invoke;
            } catch (Throwable unused2) {
                executorService = null;
            }
            if (executorService != null) {
                Objects.requireNonNull(f4613d);
                executorService.submit(n.b);
                try {
                    Object invoke2 = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
                    if (!(invoke2 instanceof Integer)) {
                        invoke2 = null;
                    }
                    num = (Integer) invoke2;
                } catch (Throwable unused3) {
                    num = null;
                }
                if (!(num != null && num.intValue() >= 1)) {
                    executorService = null;
                }
                if (executorService != null) {
                    return executorService;
                }
            }
        }
        try {
            Object newInstance = cls.getConstructor(new Class[]{Integer.TYPE}).newInstance(new Object[]{Integer.valueOf(f4613d.Q())});
            if (!(newInstance instanceof ExecutorService)) {
                newInstance = null;
            }
            executorService2 = (ExecutorService) newInstance;
        } catch (Throwable unused4) {
        }
        return executorService2 != null ? executorService2 : O();
    }

    public final int Q() {
        Integer valueOf = Integer.valueOf(c);
        int i2 = 1;
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        int availableProcessors = Runtime.getRuntime().availableProcessors() - 1;
        if (availableProcessors >= 1) {
            i2 = availableProcessors;
        }
        return i2;
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    public String toString() {
        return "CommonPool";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0019, code lost:
        j.a.a0.f4583i.e0(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v(i.m.f r1, java.lang.Runnable r2) {
        /*
            r0 = this;
            java.util.concurrent.Executor r1 = pool     // Catch:{ RejectedExecutionException -> 0x0019 }
            if (r1 == 0) goto L_0x0005
            goto L_0x0012
        L_0x0005:
            monitor-enter(r0)     // Catch:{ RejectedExecutionException -> 0x0019 }
            java.util.concurrent.Executor r1 = pool     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x000b
            goto L_0x0011
        L_0x000b:
            java.util.concurrent.ExecutorService r1 = r0.P()     // Catch:{ all -> 0x0016 }
            pool = r1     // Catch:{ all -> 0x0016 }
        L_0x0011:
            monitor-exit(r0)     // Catch:{ RejectedExecutionException -> 0x0019 }
        L_0x0012:
            r1.execute(r2)     // Catch:{ RejectedExecutionException -> 0x0019 }
            goto L_0x001e
        L_0x0016:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ RejectedExecutionException -> 0x0019 }
            throw r1     // Catch:{ RejectedExecutionException -> 0x0019 }
        L_0x0019:
            j.a.a0 r1 = j.a.a0.f4583i
            r1.e0(r2)
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.m.v(i.m.f, java.lang.Runnable):void");
    }
}
