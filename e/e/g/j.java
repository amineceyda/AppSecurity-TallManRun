package e.e.g;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import com.tencent.beacon.base.net.adapter.AbstractNetAdapter;
import e.d.e;
import e.d.g;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class j {
    public static final e<String, Typeface> a = new e<>(16);
    public static final ExecutorService b;
    public static final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final g<String, ArrayList<e.e.i.a<a>>> f1324d = new g<>();

    public static final class a {
        public final Typeface a;
        public final int b;

        public a(int i2) {
            this.a = null;
            this.b = i2;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) AbstractNetAdapter.READ_TIMEOUT, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new n("fonts-androidx", 10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e.e.g.j.a a(java.lang.String r7, android.content.Context r8, e.e.g.e r9, int r10) {
        /*
            e.d.e<java.lang.String, android.graphics.Typeface> r0 = a
            java.lang.Object r0 = r0.b(r7)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x0010
            e.e.g.j$a r7 = new e.e.g.j$a
            r7.<init>((android.graphics.Typeface) r0)
            return r7
        L_0x0010:
            r0 = 0
            e.e.g.k r9 = e.e.g.d.a(r8, r9, r0)     // Catch:{ NameNotFoundException -> 0x0061 }
            int r1 = r9.a
            r2 = -3
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x001e
            goto L_0x0035
        L_0x001e:
            r1 = -2
            goto L_0x003e
        L_0x0020:
            e.e.g.l[] r1 = r9.b
            r4 = 0
            if (r1 == 0) goto L_0x003d
            int r5 = r1.length
            if (r5 != 0) goto L_0x0029
            goto L_0x003d
        L_0x0029:
            int r3 = r1.length
            r5 = 0
        L_0x002b:
            if (r5 >= r3) goto L_0x003c
            r6 = r1[r5]
            int r6 = r6.f1326e
            if (r6 == 0) goto L_0x0039
            if (r6 >= 0) goto L_0x0037
        L_0x0035:
            r1 = -3
            goto L_0x003e
        L_0x0037:
            r1 = r6
            goto L_0x003e
        L_0x0039:
            int r5 = r5 + 1
            goto L_0x002b
        L_0x003c:
            r3 = 0
        L_0x003d:
            r1 = r3
        L_0x003e:
            if (r1 == 0) goto L_0x0046
            e.e.g.j$a r7 = new e.e.g.j$a
            r7.<init>((int) r1)
            return r7
        L_0x0046:
            e.e.g.l[] r9 = r9.b
            e.e.d.j r1 = e.e.d.d.a
            android.graphics.Typeface r8 = r1.b(r8, r0, r9, r10)
            if (r8 == 0) goto L_0x005b
            e.d.e<java.lang.String, android.graphics.Typeface> r9 = a
            r9.c(r7, r8)
            e.e.g.j$a r7 = new e.e.g.j$a
            r7.<init>((android.graphics.Typeface) r8)
            return r7
        L_0x005b:
            e.e.g.j$a r7 = new e.e.g.j$a
            r7.<init>((int) r2)
            return r7
        L_0x0061:
            e.e.g.j$a r7 = new e.e.g.j$a
            r8 = -1
            r7.<init>((int) r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.g.j.a(java.lang.String, android.content.Context, e.e.g.e, int):e.e.g.j$a");
    }
}
