package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import g.e.c.q;
import g.e.c.r;
import g.e.c.u.a;
import g.e.c.v.b;
import g.e.c.v.c;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class TimeTypeAdapter extends q<Time> {
    public static final r b = new r() {
        public <T> q<T> a(Gson gson, a<T> aVar) {
            if (aVar.a == Time.class) {
                return new TimeTypeAdapter();
            }
            return null;
        }
    };
    public final DateFormat a = new SimpleDateFormat("hh:mm:ss a");

    public Object a(g.e.c.v.a aVar) throws IOException {
        synchronized (this) {
            if (aVar.X() == b.NULL) {
                aVar.P();
                return null;
            }
            try {
                Time time = new Time(this.a.parse(aVar.S()).getTime());
                return time;
            } catch (ParseException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            }
        }
    }

    /* renamed from: d */
    public synchronized void c(c cVar, Time time) throws IOException {
        cVar.e0(time == null ? null : this.a.format(time));
    }
}
