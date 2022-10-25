package f.a.a.b.u;

import f.a.a.b.q.d.k;
import f.a.a.b.s.b;
import f.a.a.b.u.j.e;
import f.a.a.b.u.j.f;
import f.a.a.b.u.j.h;
import f.a.a.b.u.j.i;
import f.a.a.b.u.j.n;
import f.a.a.b.u.j.v;
import f.a.a.b.z.g;
import java.io.File;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@k
public class d<E> extends g<E> {

    /* renamed from: m  reason: collision with root package name */
    public int f1802m = 0;
    public f.a.a.b.z.k n;
    public final a o;
    public g p = new g();

    public enum a {
        EMBEDDED,
        DIRECT
    }

    public d(a aVar) {
        this.o = aVar;
    }

    public String f() {
        return this.f1804e.f1812j.t(this.f1808i, Integer.valueOf(this.f1802m));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0084 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean j(java.io.File r14, E r15) {
        /*
            r13 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r13.f1809j
            r15 = 0
            r4 = 1
            r5 = 2
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 < 0) goto L_0x0030
            java.util.Date r14 = r13.f1808i
            f.a.a.b.u.h<E> r2 = r13.f1804e
            f.a.a.b.u.j.i r2 = r2.f1812j
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r3[r15] = r14
            int r14 = r13.f1802m
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r3[r4] = r14
            java.lang.String r14 = r2.t(r3)
            r13.f1806g = r14
            r13.f1802m = r15
            java.util.Date r14 = r13.f1808i
            r14.setTime(r0)
            r13.s()
            return r4
        L_0x0030:
            f.a.a.b.z.g r2 = r13.p
            long r6 = r2.b
            r8 = 1
            long r10 = r6 + r8
            r2.b = r10
            long r10 = r2.a
            long r6 = r6 & r10
            long r10 = r2.a
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x0045
            r3 = 1
            goto L_0x0046
        L_0x0045:
            r3 = 0
        L_0x0046:
            if (r3 == 0) goto L_0x0069
            long r6 = r2.f1872e
            int r10 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x005e
            long r6 = r2.a
            r10 = 65535(0xffff, double:3.23786E-319)
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0058
            goto L_0x005e
        L_0x0058:
            long r6 = r2.a
            long r6 = r6 << r4
            long r6 = r6 | r8
            r2.a = r6
        L_0x005e:
            long r6 = r2.c
            long r6 = r6 + r0
            r2.f1872e = r6
            long r6 = r2.f1871d
            long r0 = r0 + r6
            r2.f1873f = r0
            goto L_0x0080
        L_0x0069:
            long r6 = r2.f1873f
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0080
            long r6 = r2.a
            long r6 = r6 >>> r5
            r2.a = r6
            long r6 = r2.c
            long r6 = r6 + r0
            r2.f1872e = r6
            long r6 = r2.f1871d
            long r0 = r0 + r6
            r2.f1873f = r0
            r0 = 0
            goto L_0x0082
        L_0x0080:
            r0 = r3 ^ 1
        L_0x0082:
            if (r0 == 0) goto L_0x0085
            return r15
        L_0x0085:
            if (r14 != 0) goto L_0x008a
            java.lang.String r14 = "activeFile == null"
            goto L_0x0090
        L_0x008a:
            f.a.a.b.z.k r0 = r13.n
            if (r0 != 0) goto L_0x0094
            java.lang.String r14 = "maxFileSize = null"
        L_0x0090:
            r13.p(r14)
            return r15
        L_0x0094:
            long r0 = r14.length()
            f.a.a.b.z.k r14 = r13.n
            long r2 = r14.a
            int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r14 < 0) goto L_0x00be
            f.a.a.b.u.h<E> r14 = r13.f1804e
            f.a.a.b.u.j.i r14 = r14.f1812j
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.util.Date r1 = r13.f1808i
            r0[r15] = r1
            int r15 = r13.f1802m
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r0[r4] = r15
            java.lang.String r14 = r14.t(r0)
            r13.f1806g = r14
            int r14 = r13.f1802m
            int r14 = r14 + r4
            r13.f1802m = r14
            return r4
        L_0x00be:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.b.u.d.j(java.io.File, java.lang.Object):boolean");
    }

    public void start() {
        n nVar;
        boolean z;
        String str;
        String str2;
        super.start();
        if (this.o == a.DIRECT) {
            p("SizeAndTimeBasedFNATP is deprecated. Use SizeAndTimeBasedRollingPolicy instead");
            p("For more information see http://logback.qos.ch/manual/appenders.html#SizeAndTimeBasedRollingPolicy");
        }
        if (this.f1811l) {
            int i2 = 0;
            if (this.n == null) {
                m("maxFileSize property is mandatory.");
                this.f1811l = false;
            }
            b bVar = this.f1804e.f1798f.f1827f;
            while (true) {
                if (bVar == null) {
                    nVar = null;
                    break;
                } else if (bVar instanceof n) {
                    nVar = (n) bVar;
                    break;
                } else {
                    bVar = bVar.b;
                }
            }
            if (nVar == null) {
                StringBuilder i3 = g.a.a.a.a.i("Missing integer token, that is %i, in FileNamePattern [");
                i3.append(this.f1804e.f1799g);
                i3.append("]");
                m(i3.toString());
                m("See also http://logback.qos.ch/codes.html#sat_missing_integer_token");
                z = true;
            } else {
                z = false;
            }
            if (this.f1804e.f1798f.u() == null) {
                StringBuilder i4 = g.a.a.a.a.i("Missing date token, that is %d, in FileNamePattern [");
                i4.append(this.f1804e.f1799g);
                i4.append("]");
                m(i4.toString());
                z = true;
            }
            if (!(!z)) {
                this.f1811l = false;
                return;
            }
            v vVar = new v(this.f1804e.f1798f, this.f1807h, new f());
            this.f1805f = vVar;
            vVar.g(this.c);
            i iVar = this.f1804e.f1798f;
            Date date = this.f1808i;
            StringBuilder sb = new StringBuilder();
            for (b bVar2 = iVar.f1827f; bVar2 != null; bVar2 = bVar2.b) {
                if (bVar2 instanceof f.a.a.b.s.f) {
                    str = bVar2.h(null);
                } else {
                    if (bVar2 instanceof n) {
                        str2 = "(\\d+)";
                    } else if (bVar2 instanceof e) {
                        e eVar = (e) bVar2;
                        if (eVar.f1824j) {
                            str = bVar2.h(date);
                        } else {
                            str2 = eVar.n();
                        }
                    }
                    str = h.c(str2);
                }
                sb.append(str);
            }
            String c = e.e.d.l.a.c(sb.toString());
            File parentFile = new File(f()).getParentFile();
            File[] listFiles = (parentFile != null && parentFile.exists() && parentFile.isDirectory()) ? parentFile.listFiles(new f.a.a.b.u.j.g(c)) : new File[0];
            if (listFiles == null || listFiles.length == 0) {
                this.f1802m = 0;
            } else {
                int length = listFiles.length;
                int i5 = Integer.MIN_VALUE;
                while (i2 < length) {
                    File file = listFiles[i2];
                    Pattern compile = Pattern.compile(c);
                    String name = file.getName();
                    Matcher matcher = compile.matcher(name);
                    if (matcher.matches()) {
                        int intValue = Integer.valueOf(matcher.group(1)).intValue();
                        if (i5 < intValue) {
                            i5 = intValue;
                        }
                        i2++;
                    } else {
                        throw new IllegalStateException(g.a.a.a.a.d("The regex [", c, "] should match [", name, "]"));
                    }
                }
                this.f1802m = i5;
                h<E> hVar = this.f1804e;
                if (!(hVar.f1800h.p == null && hVar.f1797e == f.a.a.b.u.j.b.b)) {
                    this.f1802m = i5 + 1;
                }
            }
            if (this.f1811l) {
                this.f1810k = true;
            }
        }
    }
}
