package f.a.a.b.u;

import ch.qos.logback.core.rolling.RolloverFailure;
import f.a.a.b.d;
import f.a.a.b.f;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class b<E> extends f<E> {
    public File r;
    public i<E> s;
    public c t;

    public String C() {
        return this.t.s();
    }

    public final void E() {
        String s2 = this.t.s();
        try {
            this.r = new File(s2);
            D(s2);
        } catch (IOException e2) {
            c("setFile(" + s2 + ", false) call failed.", e2);
        }
    }

    public void F(String str) {
        if (!(str == null || (this.s == null && this.t == null))) {
            m("File property must be set before any triggeringPolicy or rollingPolicy properties");
            m("For more information, please visit " + "http://logback.qos.ch/codes.html#rfa_file_after");
        }
        this.p = str == null ? null : str.trim();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
            r9 = this;
            f.a.a.b.u.i<E> r0 = r9.s
            java.lang.String r1 = "For more information, please visit "
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = "No TriggeringPolicy was set for the RollingFileAppender named "
            java.lang.StringBuilder r0 = g.a.a.a.a.i(r0)
            java.lang.String r2 = r9.f1699g
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r9.p(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "http://logback.qos.ch/codes.html#rfa_no_tp"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.p(r0)
            return
        L_0x002d:
            boolean r0 = r0.k()
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "TriggeringPolicy has not started. RollingFileAppender will not start"
            r9.p(r0)
            return
        L_0x0039:
            f.a.a.b.u.i<E> r0 = r9.s
            boolean r2 = r0 instanceof f.a.a.b.u.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0095
            f.a.a.b.u.c r0 = (f.a.a.b.u.c) r0
            f.a.a.b.u.j.i r0 = r0.f1798f
            f.a.a.b.d r2 = r9.c
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f1687f
            java.lang.String r5 = "RFA_FILENAME_PATTERN_COLLISION_MAP"
            java.lang.Object r2 = r2.get(r5)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto L_0x0055
            r0 = 0
            goto L_0x0091
        L_0x0055:
            java.util.Set r5 = r2.entrySet()
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
        L_0x005e:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0089
            java.lang.Object r7 = r5.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getValue()
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x005e
            java.lang.Object r6 = r7.getValue()
            f.a.a.b.u.j.i r6 = (f.a.a.b.u.j.i) r6
            java.lang.String r6 = r6.f1826e
            java.lang.Object r7 = r7.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "FileNamePattern"
            r9.z(r8, r6, r7)
            r6 = 1
            goto L_0x005e
        L_0x0089:
            java.lang.String r5 = r9.f1699g
            if (r5 == 0) goto L_0x0090
            r2.put(r5, r0)
        L_0x0090:
            r0 = r6
        L_0x0091:
            if (r0 == 0) goto L_0x0095
            r0 = 1
            goto L_0x0096
        L_0x0095:
            r0 = 0
        L_0x0096:
            if (r0 == 0) goto L_0x00b2
            java.lang.String r0 = "Collisions detected with FileAppender/RollingAppender instances defined earlier. Aborting."
            r9.m(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "http://logback.qos.ch/codes.html#earlier_fa_collision"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.m(r0)
            return
        L_0x00b2:
            boolean r0 = r9.o
            if (r0 != 0) goto L_0x00bd
            java.lang.String r0 = "Append mode is mandatory for RollingFileAppender. Defaulting to append=true."
            r9.p(r0)
            r9.o = r3
        L_0x00bd:
            f.a.a.b.u.c r0 = r9.t
            if (r0 != 0) goto L_0x00e8
            java.lang.String r0 = "No RollingPolicy was set for the RollingFileAppender named "
            java.lang.StringBuilder r0 = g.a.a.a.a.i(r0)
            java.lang.String r2 = r9.f1699g
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r9.m(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "http://logback.qos.ch/codes.html#rfa_no_rp"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.m(r0)
            return
        L_0x00e8:
            f.a.a.b.u.i<E> r0 = r9.s
            boolean r2 = r0 instanceof f.a.a.b.u.c
            if (r2 == 0) goto L_0x0102
            f.a.a.b.u.c r0 = (f.a.a.b.u.c) r0
            f.a.a.b.u.j.i r0 = r0.f1798f
            if (r0 == 0) goto L_0x0102
            java.lang.String r2 = r9.p
            if (r2 == 0) goto L_0x0102
            java.lang.String r0 = r0.v()
            java.lang.String r2 = r9.p
            boolean r4 = r2.matches(r0)
        L_0x0102:
            if (r4 == 0) goto L_0x011e
            java.lang.String r0 = "File property collides with fileNamePattern. Aborting."
            r9.m(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "http://logback.qos.ch/codes.html#rfa_collision"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.m(r0)
            return
        L_0x011e:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r9.C()
            r0.<init>(r1)
            r9.r = r0
            java.lang.String r0 = "Active log file name: "
            java.lang.StringBuilder r0 = g.a.a.a.a.i(r0)
            java.lang.String r1 = r9.C()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.n(r0)
            super.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.b.u.b.start():void");
    }

    public void stop() {
        Map map;
        String str;
        super.stop();
        c cVar = this.t;
        if (cVar != null) {
            cVar.stop();
        }
        i<E> iVar = this.s;
        if (iVar != null) {
            iVar.stop();
        }
        d dVar = this.c;
        if (dVar == null) {
            map = null;
        } else {
            map = (Map) dVar.f1687f.get("RFA_FILENAME_PATTERN_COLLISION_MAP");
        }
        if (map != null && (str = this.f1699g) != null) {
            map.remove(str);
        }
    }

    public void x(E e2) {
        synchronized (this.s) {
            if (this.s.j(this.r, e2)) {
                this.f1695l.lock();
                try {
                    t();
                    this.t.t();
                } catch (RolloverFailure unused) {
                    p("RolloverFailure occurred. Deferring roll-over.");
                    this.o = true;
                } catch (Throwable th) {
                    this.f1695l.unlock();
                    throw th;
                }
                E();
                this.f1695l.unlock();
            }
        }
        super.x(e2);
    }
}
