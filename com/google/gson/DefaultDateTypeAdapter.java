package com.google.gson;

import g.a.a.a.a;
import g.c.b.b.f;
import g.e.c.q;
import g.e.c.t.o;
import g.e.c.v.c;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class DefaultDateTypeAdapter extends q<Date> {
    public final Class<? extends Date> a;
    public final List<DateFormat> b;

    public DefaultDateTypeAdapter(Class<? extends Date> cls, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        d(cls);
        this.a = cls;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i2, i3, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i2, i3));
        }
        if (o.a >= 9) {
            arrayList.add(f.I(i2, i3));
        }
    }

    public static Class<? extends Date> d(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r4 = g.e.c.t.z.d.a.b(r4, new java.text.ParsePosition(0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(g.e.c.v.a r4) throws java.io.IOException {
        /*
            r3 = this;
            g.e.c.v.b r0 = r4.X()
            g.e.c.v.b r1 = g.e.c.v.b.NULL
            if (r0 != r1) goto L_0x000d
            r4.P()
            r4 = 0
            goto L_0x005a
        L_0x000d:
            java.lang.String r4 = r4.S()
            java.util.List<java.text.DateFormat> r0 = r3.b
            monitor-enter(r0)
            java.util.List<java.text.DateFormat> r1 = r3.b     // Catch:{ all -> 0x0068 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0068 }
        L_0x001a:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0068 }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0068 }
            java.text.DateFormat r2 = (java.text.DateFormat) r2     // Catch:{ all -> 0x0068 }
            java.util.Date r4 = r2.parse(r4)     // Catch:{ ParseException -> 0x001a }
            goto L_0x0035
        L_0x002b:
            java.text.ParsePosition r1 = new java.text.ParsePosition     // Catch:{ ParseException -> 0x0061 }
            r2 = 0
            r1.<init>(r2)     // Catch:{ ParseException -> 0x0061 }
            java.util.Date r4 = g.e.c.t.z.d.a.b(r4, r1)     // Catch:{ ParseException -> 0x0061 }
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x0068 }
            java.lang.Class<? extends java.util.Date> r0 = r3.a
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            if (r0 != r1) goto L_0x003d
            goto L_0x005a
        L_0x003d:
            java.lang.Class<java.sql.Timestamp> r1 = java.sql.Timestamp.class
            if (r0 != r1) goto L_0x004c
            java.sql.Timestamp r0 = new java.sql.Timestamp
            long r1 = r4.getTime()
            r0.<init>(r1)
        L_0x004a:
            r4 = r0
            goto L_0x005a
        L_0x004c:
            java.lang.Class<java.sql.Date> r1 = java.sql.Date.class
            if (r0 != r1) goto L_0x005b
            java.sql.Date r0 = new java.sql.Date
            long r1 = r4.getTime()
            r0.<init>(r1)
            goto L_0x004a
        L_0x005a:
            return r4
        L_0x005b:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L_0x0061:
            r1 = move-exception
            com.google.gson.JsonSyntaxException r2 = new com.google.gson.JsonSyntaxException     // Catch:{ all -> 0x0068 }
            r2.<init>(r4, r1)     // Catch:{ all -> 0x0068 }
            throw r2     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x006c
        L_0x006b:
            throw r4
        L_0x006c:
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.DefaultDateTypeAdapter.a(g.e.c.v.a):java.lang.Object");
    }

    /* renamed from: e */
    public void c(c cVar, Date date) throws IOException {
        if (date == null) {
            cVar.t();
            return;
        }
        synchronized (this.b) {
            cVar.e0(this.b.get(0).format(date));
        }
    }

    public String toString() {
        StringBuilder sb;
        String str;
        DateFormat dateFormat = this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            sb = a.i("DefaultDateTypeAdapter(");
            str = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sb = a.i("DefaultDateTypeAdapter(");
            str = dateFormat.getClass().getSimpleName();
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
