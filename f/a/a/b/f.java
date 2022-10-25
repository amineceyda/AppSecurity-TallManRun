package f.a.a.b;

import android.support.v4.media.session.PlaybackStateCompat;
import e.e.f.b;
import f.a.a.b.z.i;
import f.a.a.b.z.k;
import f.a.a.b.z.l;
import g.a.a.a.a;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Pattern;

public class f<E> extends i<E> {
    public boolean o = true;
    public String p = null;
    public k q = new k(PlaybackStateCompat.ACTION_PLAY_FROM_URI);

    public boolean A() {
        Map map;
        boolean z = false;
        if (this.p == null || (map = (Map) this.c.f1687f.get("FA_FILENAME_COLLISION_MAP")) == null) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (this.p.equals(entry.getValue())) {
                z("File", (String) entry.getValue(), (String) entry.getKey());
                z = true;
            }
        }
        String str = this.f1699g;
        if (str != null) {
            map.put(str, this.p);
        }
        return z;
    }

    public final String B(String str) {
        String b;
        Pattern pattern = i.a;
        String p2 = b.p("os.name");
        String l2 = b.l("ANDROID_ROOT");
        String l3 = b.l("ANDROID_DATA");
        return (!(p2 != null && p2.contains("Linux") && l2 != null && l2.contains("/system") && l3 != null && l3.contains("/data")) || new File(str).isAbsolute() || (b = this.c.b("DATA_DIR")) == null || b.s(b.trim()) || new File(str).isAbsolute()) ? str : a.c(b, "/", str);
    }

    public String C() {
        throw null;
    }

    public boolean D(String str) throws IOException {
        String B = B(str);
        this.f1695l.lock();
        try {
            File file = new File(B);
            if (!l.s(file)) {
                m("Failed to create parent directories for [" + file.getAbsolutePath() + "]");
            }
            f.a.a.b.t.b bVar = new f.a.a.b.t.b(file, this.o, this.q.a);
            bVar.f1791d = this.c;
            w(bVar);
            return true;
        } finally {
            this.f1695l.unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
            r4 = this;
            java.lang.String r0 = r4.C()
            java.lang.String r1 = "]"
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = r4.B(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "File property is set to ["
            r2.append(r3)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r4.n(r1)
            boolean r1 = r4.A()
            if (r1 == 0) goto L_0x0031
            java.lang.String r0 = "Collisions detected with FileAppender/RollingAppender instances defined earlier. Aborting."
            r4.m(r0)
            java.lang.String r0 = "http://logback.qos.ch/codes.html#earlier_fa_collision"
            goto L_0x005d
        L_0x0031:
            r4.D(r0)     // Catch:{ IOException -> 0x0036 }
            r0 = 0
            goto L_0x0061
        L_0x0036:
            r1 = move-exception
            java.lang.String r2 = "openFile("
            java.lang.String r3 = ","
            java.lang.StringBuilder r0 = g.a.a.a.a.n(r2, r0, r3)
            boolean r2 = r4.o
            r0.append(r2)
            java.lang.String r2 = ") failed"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r4.c(r0, r1)
            goto L_0x0060
        L_0x0051:
            java.lang.String r0 = "\"File\" property not set for appender named ["
            java.lang.StringBuilder r0 = g.a.a.a.a.i(r0)
            java.lang.String r2 = r4.f1699g
            java.lang.String r0 = g.a.a.a.a.f(r0, r2, r1)
        L_0x005d:
            r4.m(r0)
        L_0x0060:
            r0 = 1
        L_0x0061:
            if (r0 != 0) goto L_0x0066
            super.start()
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.b.f.start():void");
    }

    public void stop() {
        Map map;
        String str;
        super.stop();
        d dVar = this.c;
        if (dVar == null) {
            map = null;
        } else {
            map = (Map) dVar.f1687f.get("FA_FILENAME_COLLISION_MAP");
        }
        if (map != null && (str = this.f1699g) != null) {
            map.remove(str);
        }
    }

    public void x(E e2) {
        super.x(e2);
    }

    public void z(String str, String str2, String str3) {
        m("'" + str + "' option has the same value \"" + str2 + "\" as that given for appender [" + str3 + "] defined earlier.");
    }
}
