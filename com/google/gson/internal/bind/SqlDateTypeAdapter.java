package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import g.e.c.q;
import g.e.c.r;
import g.e.c.u.a;
import g.e.c.v.b;
import g.e.c.v.c;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class SqlDateTypeAdapter extends q<Date> {
    public static final r b = new r() {
        public <T> q<T> a(Gson gson, a<T> aVar) {
            if (aVar.a == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };
    public final DateFormat a = new SimpleDateFormat("MMM d, yyyy");

    public Object a(g.e.c.v.a aVar) throws IOException {
        Date date;
        synchronized (this) {
            if (aVar.X() == b.NULL) {
                aVar.P();
                date = null;
            } else {
                try {
                    date = new Date(this.a.parse(aVar.S()).getTime());
                } catch (ParseException e2) {
                    throw new JsonSyntaxException((Throwable) e2);
                }
            }
        }
        return date;
    }

    /* renamed from: d */
    public synchronized void c(c cVar, Date date) throws IOException {
        cVar.e0(date == null ? null : this.a.format(date));
    }
}
