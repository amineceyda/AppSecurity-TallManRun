package g.i.c.a.a.t.k;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class k {
    public final Handler a = new Handler(Looper.getMainLooper());
    public Map<Long, c> b = new HashMap();
    public b c;

    public interface b {
    }

    public class c implements Runnable {
        public final List<f> b = new ArrayList();

        public c(a aVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:40:0x00e1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r20 = this;
                r0 = r20
                java.util.List<g.i.c.a.a.t.k.f> r1 = r0.b
                int r1 = r1.size()
                r3 = 0
            L_0x0009:
                if (r3 >= r1) goto L_0x012e
                java.util.List<g.i.c.a.a.t.k.f> r4 = r0.b
                java.lang.Object r4 = r4.get(r3)
                g.i.c.a.a.t.k.f r4 = (g.i.c.a.a.t.k.f) r4
                if (r4 == 0) goto L_0x0127
                g.i.c.a.a.t.k.k r5 = g.i.c.a.a.t.k.k.this
                g.i.c.a.a.t.k.k$b r5 = r5.c
                if (r5 == 0) goto L_0x0127
                g.i.c.a.a.t.k.e r5 = (g.i.c.a.a.t.k.e) r5
                android.view.View r6 = r4.b()
                java.lang.Object r7 = r4.a()
                android.graphics.Rect r8 = g.i.c.a.a.b0.n.a
                if (r6 != 0) goto L_0x002d
                r10 = 0
                r19 = r3
                goto L_0x008b
            L_0x002d:
                int r10 = r6.getWidth()
                int r11 = r6.getHeight()
                int r11 = r11 * r10
                long r13 = (long) r11
                boolean r10 = r6.isShown()
                r11 = 0
                if (r10 == 0) goto L_0x0080
                android.graphics.Rect r10 = g.i.c.a.a.b0.n.a
                boolean r15 = r6.getGlobalVisibleRect(r10)
                if (r15 == 0) goto L_0x0080
                int r15 = r10.width()
                r19 = r3
                long r2 = (long) r15
                int r10 = r10.height()
                long r8 = (long) r10
                long r2 = r2 * r8
                int r8 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r8 != 0) goto L_0x005d
                r8 = 0
                goto L_0x007c
            L_0x005d:
                double r8 = (double) r2
                r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                java.lang.Double.isNaN(r8)
                java.lang.Double.isNaN(r8)
                java.lang.Double.isNaN(r8)
                java.lang.Double.isNaN(r8)
                double r8 = r8 * r10
                double r10 = (double) r13
                java.lang.Double.isNaN(r10)
                java.lang.Double.isNaN(r10)
                java.lang.Double.isNaN(r10)
                java.lang.Double.isNaN(r10)
                double r8 = r8 / r10
            L_0x007c:
                r15 = r2
                r17 = r8
                goto L_0x0085
            L_0x0080:
                r19 = r3
                r15 = r11
                r17 = 0
            L_0x0085:
                g.i.c.a.a.o.b r10 = new g.i.c.a.a.o.b
                r12 = r10
                r12.<init>(r13, r15, r17)
            L_0x008b:
                long r2 = r4.f4539f
                java.lang.String r8 = r4.f4538e
                if (r10 == 0) goto L_0x0129
                double r11 = r10.c
                if (r6 != 0) goto L_0x0096
                goto L_0x00c0
            L_0x0096:
                g.i.c.a.a.l.b r13 = g.i.c.a.a.l.a.a(r6)
                g.i.c.a.a.r.e r14 = g.i.c.a.a.r.e.b.a
                g.i.c.a.a.a r14 = r14.d()
                double r14 = r14.f4391g
                if (r13 != 0) goto L_0x00a5
                goto L_0x00b4
            L_0x00a5:
                java.lang.String r9 = "element_exposure_min_rate"
                java.lang.Object r9 = g.h.a.a.C(r13, r9)
                java.lang.Double r9 = (java.lang.Double) r9
                if (r9 != 0) goto L_0x00b0
                goto L_0x00b4
            L_0x00b0:
                double r14 = r9.doubleValue()
            L_0x00b4:
                r17 = 0
                int r9 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
                if (r9 <= 0) goto L_0x00c0
                int r9 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
                if (r9 < 0) goto L_0x00c0
                r9 = 1
                goto L_0x00c1
            L_0x00c0:
                r9 = 0
            L_0x00c1:
                if (r9 == 0) goto L_0x0129
                g.i.c.a.a.t.k.d r9 = r5.a
                boolean r9 = g.i.c.a.a.t.k.d.e(r9, r2)
                if (r9 == 0) goto L_0x0129
                g.i.c.a.a.t.k.d r9 = r5.a
                g.i.c.a.a.t.k.i r9 = r9.a
                g.i.c.a.a.t.k.h r9 = (g.i.c.a.a.t.k.h) r9
                r9.a(r4)
                g.i.c.a.a.t.k.d r5 = r5.a
                g.i.c.a.a.t.k.i r5 = r5.a
                g.i.c.a.a.t.k.h r5 = (g.i.c.a.a.t.k.h) r5
                r5.c(r2, r10)
                boolean r2 = r4.f4540g
                if (r2 == 0) goto L_0x0129
                g.i.c.a.a.r.e r2 = g.i.c.a.a.r.e.b.a
                g.i.c.a.a.c r2 = r2.f4498g
                g.i.c.a.a.u.c r3 = r4.f4537d
                if (r3 != 0) goto L_0x00ea
                goto L_0x0129
            L_0x00ea:
                if (r2 == 0) goto L_0x00f3
                java.util.Map<java.lang.String, java.lang.Object> r4 = r3.c
                java.lang.String r5 = "imp"
                r2.b(r5, r4)
            L_0x00f3:
                java.lang.String r2 = "dt_ele_reuse_id"
                r3.b(r2, r8)
                r2 = 0
                g.i.c.a.a.t.k.a r4 = g.h.a.a.w(r7, r6, r8, r2)
                if (r4 != 0) goto L_0x0107
                g.i.c.a.a.t.k.a r4 = new g.i.c.a.a.t.k.a
                r4.<init>()
                g.h.a.a.U(r7, r6, r8, r4, r2)
            L_0x0107:
                boolean r2 = r4.b
                r5 = 1
                r2 = r2 ^ r5
                java.lang.String r2 = java.lang.String.valueOf(r2)
                java.lang.String r7 = "dt_ele_is_first_imp"
                r3.b(r7, r2)
                java.lang.String r2 = "0"
                java.lang.String r7 = "dt_ele_is_first_scroll_imp"
                r3.b(r7, r2)
                java.lang.String r7 = "dt_ele_scroll_flag"
                r3.b(r7, r2)
                r2 = 0
                g.i.c.a.a.t.g.d(r6, r3, r2, r2)
                r4.b = r5
                goto L_0x012a
            L_0x0127:
                r19 = r3
            L_0x0129:
                r2 = 0
            L_0x012a:
                int r3 = r19 + 1
                goto L_0x0009
            L_0x012e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.i.c.a.a.t.k.k.c.run():void");
        }
    }
}
