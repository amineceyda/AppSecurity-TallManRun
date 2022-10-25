package g.e.b.l.j.k;

import android.util.Log;
import com.tencent.raft.measure.utils.MeasureConst;
import g.e.b.l.j.f;
import g.e.b.l.j.j.l;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

public class j implements c {

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f3537d = Charset.forName(MeasureConst.CHARSET_UTF8);
    public final File a;
    public final int b;
    public h c;

    public static class a {
        public final byte[] a;
        public final int b;

        public a(byte[] bArr, int i2) {
            this.a = bArr;
            this.b = i2;
        }
    }

    public j(File file, int i2) {
        this.a = file;
        this.b = i2;
    }

    public void a() {
        l.a(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }

    public String b() {
        byte[] d2 = d();
        if (d2 != null) {
            return new String(d2, f3537d);
        }
        return null;
    }

    public void c(long j2, String str) {
        e();
        if (this.c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i2 = this.b / 4;
                if (str.length() > i2) {
                    str = "..." + str.substring(str.length() - i2);
                }
                this.c.b(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j2), str.replaceAll("\r", " ").replaceAll("\n", " ")}).getBytes(f3537d));
                while (!this.c.j() && this.c.t() > this.b) {
                    this.c.o();
                }
            } catch (IOException e2) {
                if (f.a.a(6)) {
                    Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e2);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] d() {
        /*
            r7 = this;
            java.io.File r0 = r7.a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            r4 = r1
            goto L_0x0042
        L_0x000c:
            r7.e()
            g.e.b.l.j.k.h r0 = r7.c
            if (r0 != 0) goto L_0x0014
            goto L_0x000a
        L_0x0014:
            r3 = 1
            int[] r3 = new int[r3]
            r3[r2] = r2
            int r0 = r0.t()
            byte[] r0 = new byte[r0]
            g.e.b.l.j.k.h r4 = r7.c     // Catch:{ IOException -> 0x002a }
            g.e.b.l.j.k.i r5 = new g.e.b.l.j.k.i     // Catch:{ IOException -> 0x002a }
            r5.<init>(r7, r0, r3)     // Catch:{ IOException -> 0x002a }
            r4.g(r5)     // Catch:{ IOException -> 0x002a }
            goto L_0x003b
        L_0x002a:
            r4 = move-exception
            g.e.b.l.j.f r5 = g.e.b.l.j.f.a
            r6 = 6
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto L_0x003b
            java.lang.String r5 = "FirebaseCrashlytics"
            java.lang.String r6 = "A problem occurred while reading the Crashlytics log file."
            android.util.Log.e(r5, r6, r4)
        L_0x003b:
            g.e.b.l.j.k.j$a r4 = new g.e.b.l.j.k.j$a
            r3 = r3[r2]
            r4.<init>(r0, r3)
        L_0x0042:
            if (r4 != 0) goto L_0x0045
            return r1
        L_0x0045:
            int r0 = r4.b
            byte[] r1 = new byte[r0]
            byte[] r3 = r4.a
            java.lang.System.arraycopy(r3, r2, r1, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.l.j.k.j.d():byte[]");
    }

    public final void e() {
        if (this.c == null) {
            try {
                this.c = new h(this.a);
            } catch (IOException e2) {
                f fVar = f.a;
                StringBuilder i2 = g.a.a.a.a.i("Could not open log file: ");
                i2.append(this.a);
                fVar.d(i2.toString(), e2);
            }
        }
    }
}
