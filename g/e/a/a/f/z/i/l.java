package g.e.a.a.f.z.i;

import android.database.Cursor;
import g.e.a.a.a;
import g.e.a.a.f.h;
import g.e.a.a.f.k;
import g.e.a.a.f.l;
import g.e.a.a.f.p;
import g.e.a.a.f.z.i.h0;
import java.util.List;
import java.util.Objects;

public final /* synthetic */ class l implements h0.b {
    public final /* synthetic */ h0 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ p c;

    public /* synthetic */ l(h0 h0Var, List list, p pVar) {
        this.a = h0Var;
        this.b = list;
        this.c = pVar;
    }

    public final Object a(Object obj) {
        a aVar;
        a aVar2;
        h0 h0Var = this.a;
        List list = this.b;
        p pVar = this.c;
        Cursor cursor = (Cursor) obj;
        Objects.requireNonNull(h0Var);
        while (cursor.moveToNext()) {
            long j2 = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            l.a a2 = g.e.a.a.f.l.a();
            a2.f(cursor.getString(1));
            a2.e(cursor.getLong(2));
            a2.g(cursor.getLong(3));
            if (z) {
                String string = cursor.getString(4);
                if (string == null) {
                    aVar2 = h0.f2820g;
                } else {
                    aVar2 = new a(string);
                }
                a2.d(new k(aVar2, cursor.getBlob(5)));
            } else {
                String string2 = cursor.getString(4);
                if (string2 == null) {
                    aVar = h0.f2820g;
                } else {
                    aVar = new a(string2);
                }
                a2.d(new k(aVar, (byte[]) h0.q(h0Var.g().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j2)}, (String) null, (String) null, "sequence_num"), g.a)));
            }
            if (!cursor.isNull(6)) {
                ((h.b) a2).b = Integer.valueOf(cursor.getInt(6));
            }
            list.add(new y(j2, pVar, a2.b()));
        }
        return null;
    }
}
