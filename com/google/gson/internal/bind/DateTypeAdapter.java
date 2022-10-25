package com.google.gson.internal.bind;

import com.google.gson.Gson;
import g.c.b.b.f;
import g.e.c.q;
import g.e.c.r;
import g.e.c.t.o;
import g.e.c.u.a;
import g.e.c.v.c;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class DateTypeAdapter extends q<Date> {
    public static final r b = new r() {
        public <T> q<T> a(Gson gson, a<T> aVar) {
            if (aVar.a == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };
    public final List<DateFormat> a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (o.a >= 9) {
            arrayList.add(f.I(2, 2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3 = g.e.c.t.z.d.a.b(r3, new java.text.ParsePosition(0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(g.e.c.v.a r3) throws java.io.IOException {
        /*
            r2 = this;
            g.e.c.v.b r0 = r3.X()
            g.e.c.v.b r1 = g.e.c.v.b.NULL
            if (r0 != r1) goto L_0x000d
            r3.P()
            r3 = 0
            goto L_0x0034
        L_0x000d:
            java.lang.String r3 = r3.S()
            monitor-enter(r2)
            java.util.List<java.text.DateFormat> r0 = r2.a     // Catch:{ all -> 0x003c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x003c }
        L_0x0018:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0029
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x003c }
            java.text.DateFormat r1 = (java.text.DateFormat) r1     // Catch:{ all -> 0x003c }
            java.util.Date r3 = r1.parse(r3)     // Catch:{ ParseException -> 0x0018 }
            goto L_0x0033
        L_0x0029:
            java.text.ParsePosition r0 = new java.text.ParsePosition     // Catch:{ ParseException -> 0x0035 }
            r1 = 0
            r0.<init>(r1)     // Catch:{ ParseException -> 0x0035 }
            java.util.Date r3 = g.e.c.t.z.d.a.b(r3, r0)     // Catch:{ ParseException -> 0x0035 }
        L_0x0033:
            monitor-exit(r2)
        L_0x0034:
            return r3
        L_0x0035:
            r0 = move-exception
            com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException     // Catch:{ all -> 0x003c }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x003c }
            throw r1     // Catch:{ all -> 0x003c }
        L_0x003c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.DateTypeAdapter.a(g.e.c.v.a):java.lang.Object");
    }

    /* renamed from: d */
    public synchronized void c(c cVar, Date date) throws IOException {
        if (date == null) {
            cVar.t();
        } else {
            cVar.e0(this.a.get(0).format(date));
        }
    }
}
