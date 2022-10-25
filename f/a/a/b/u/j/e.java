package f.a.a.b.u.j;

import f.a.a.b.s.c;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public class e<E> extends c<E> implements p {

    /* renamed from: g  reason: collision with root package name */
    public String f1821g;

    /* renamed from: h  reason: collision with root package name */
    public TimeZone f1822h;

    /* renamed from: i  reason: collision with root package name */
    public f.a.a.b.z.c f1823i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1824j = true;

    public boolean b(Object obj) {
        return obj instanceof Date;
    }

    public String h(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Null argument forbidden");
        } else if (obj instanceof Date) {
            return this.f1823i.a(((Date) obj).getTime());
        } else {
            throw new IllegalArgumentException("Cannot convert " + obj + " of type" + obj.getClass().getName());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String n() {
        /*
            r9 = this;
            java.lang.String r0 = r9.f1821g
            f.a.a.b.z.e r1 = new f.a.a.b.z.e
            r1.<init>()
            int r2 = r0.length()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
            r5 = 0
        L_0x0012:
            r6 = 1
            if (r5 >= r2) goto L_0x0031
            char r7 = r0.charAt(r5)
            if (r4 == 0) goto L_0x0026
            char r8 = r4.a
            if (r8 == r7) goto L_0x0020
            goto L_0x0026
        L_0x0020:
            int r7 = r4.b
            int r7 = r7 + r6
            r4.b = r7
            goto L_0x002e
        L_0x0026:
            f.a.a.b.z.d r4 = new f.a.a.b.z.d
            r4.<init>(r7)
            r3.add(r4)
        L_0x002e:
            int r5 = r5 + 1
            goto L_0x0012
        L_0x0031:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r2 = r3.iterator()
        L_0x003a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00fe
            java.lang.Object r3 = r2.next()
            f.a.a.b.z.d r3 = (f.a.a.b.z.d) r3
            java.util.Objects.requireNonNull(r1)
            int r4 = r3.b
            char r3 = r3.a
            r5 = 121(0x79, float:1.7E-43)
            java.lang.String r7 = "}"
            if (r3 == r5) goto L_0x00e5
            r5 = 122(0x7a, float:1.71E-43)
            if (r3 == r5) goto L_0x00e2
            java.lang.String r5 = ""
            switch(r3) {
                case 39: goto L_0x00ab;
                case 46: goto L_0x00a8;
                case 75: goto L_0x00e5;
                case 77: goto L_0x0086;
                case 83: goto L_0x00e5;
                case 87: goto L_0x00e5;
                case 90: goto L_0x0082;
                case 92: goto L_0x007a;
                case 97: goto L_0x006e;
                case 100: goto L_0x00e5;
                case 104: goto L_0x00e5;
                case 107: goto L_0x00e5;
                case 109: goto L_0x00e5;
                case 115: goto L_0x00e5;
                case 119: goto L_0x00e5;
                default: goto L_0x005c;
            }
        L_0x005c:
            switch(r3) {
                case 68: goto L_0x00e5;
                case 69: goto L_0x00b6;
                case 70: goto L_0x00e5;
                case 71: goto L_0x00e2;
                case 72: goto L_0x00e5;
                default: goto L_0x005f;
            }
        L_0x005f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            if (r4 != r6) goto L_0x00cf
            r8.append(r5)
            r8.append(r3)
            goto L_0x00dd
        L_0x006e:
            java.text.DateFormatSymbols r3 = r1.a
            java.lang.String[] r3 = r3.getAmPmStrings()
            java.lang.String r5 = r1.a(r3)
            goto L_0x00f9
        L_0x007a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Forward slashes are not allowed"
            r0.<init>(r1)
            throw r0
        L_0x0082:
            java.lang.String r5 = "(\\+|-)\\d{4}"
            goto L_0x00f9
        L_0x0086:
            r3 = 2
            if (r4 > r3) goto L_0x008f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L_0x00ea
        L_0x008f:
            r3 = 3
            if (r4 != r3) goto L_0x009d
            java.text.DateFormatSymbols r3 = r1.a
            java.lang.String[] r3 = r3.getShortMonths()
            java.lang.String r5 = r1.a(r3)
            goto L_0x00f9
        L_0x009d:
            java.text.DateFormatSymbols r3 = r1.a
            java.lang.String[] r3 = r3.getMonths()
            java.lang.String r5 = r1.a(r3)
            goto L_0x00f9
        L_0x00a8:
            java.lang.String r5 = "\\."
            goto L_0x00f9
        L_0x00ab:
            if (r4 != r6) goto L_0x00ae
            goto L_0x00f9
        L_0x00ae:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Too many single quotes"
            r0.<init>(r1)
            throw r0
        L_0x00b6:
            r3 = 4
            if (r4 < r3) goto L_0x00c4
            java.text.DateFormatSymbols r3 = r1.a
            java.lang.String[] r3 = r3.getWeekdays()
            java.lang.String r5 = r1.a(r3)
            goto L_0x00f9
        L_0x00c4:
            java.text.DateFormatSymbols r3 = r1.a
            java.lang.String[] r3 = r3.getShortWeekdays()
            java.lang.String r5 = r1.a(r3)
            goto L_0x00f9
        L_0x00cf:
            r8.append(r3)
            java.lang.String r3 = "{"
            r8.append(r3)
            r8.append(r4)
            r8.append(r7)
        L_0x00dd:
            java.lang.String r5 = r8.toString()
            goto L_0x00f9
        L_0x00e2:
            java.lang.String r5 = ".*"
            goto L_0x00f9
        L_0x00e5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L_0x00ea:
            java.lang.String r5 = "\\d{"
            r3.append(r5)
            r3.append(r4)
            r3.append(r7)
            java.lang.String r5 = r3.toString()
        L_0x00f9:
            r0.append(r5)
            goto L_0x003a
        L_0x00fe:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.b.u.j.e.n():java.lang.String");
    }

    public void start() {
        String m2 = m();
        this.f1821g = m2;
        if (m2 == null) {
            this.f1821g = "yyyy-MM-dd";
        }
        List<String> list = this.f1759e;
        if (list != null) {
            for (int i2 = 1; i2 < list.size(); i2++) {
                String str = list.get(i2);
                if ("AUX".equalsIgnoreCase(str)) {
                    this.f1824j = false;
                } else {
                    this.f1822h = TimeZone.getTimeZone(str);
                }
            }
        }
        f.a.a.b.z.c cVar = new f.a.a.b.z.c(this.f1821g, Locale.US);
        this.f1823i = cVar;
        TimeZone timeZone = this.f1822h;
        if (timeZone != null) {
            cVar.c.setTimeZone(timeZone);
        }
    }
}
