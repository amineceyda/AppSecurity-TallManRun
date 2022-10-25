package g.e.a.a.f.z.i;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import g.e.a.a.f.l;
import g.e.a.a.f.p;
import g.e.a.a.f.z.i.h0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;

public final /* synthetic */ class d implements h0.b {
    public final /* synthetic */ h0 a;
    public final /* synthetic */ p b;

    public /* synthetic */ d(h0 h0Var, p pVar) {
        this.a = h0Var;
        this.b = pVar;
    }

    /* JADX INFO: finally extract failed */
    public final Object a(Object obj) {
        h0 h0Var = this.a;
        p pVar = this.b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        Objects.requireNonNull(h0Var);
        ArrayList arrayList = new ArrayList();
        Long j2 = h0Var.j(sQLiteDatabase, pVar);
        if (j2 != null) {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            h0.q(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{j2.toString()}, (String) null, (String) null, (String) null, String.valueOf(h0Var.f2822e.c())), new l(h0Var, arrayList, pVar));
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            sb.append(((g0) arrayList.get(i2)).b());
            if (i2 < arrayList.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            try {
                long j3 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j3));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j3), set);
                }
                set.add(new h0.c(query.getString(1), query.getString(2), (h0.a) null));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            g0 g0Var = (g0) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(g0Var.b()))) {
                l.a j4 = g0Var.a().j();
                for (h0.c cVar : (Set) hashMap.get(Long.valueOf(g0Var.b()))) {
                    j4.a(cVar.a, cVar.b);
                }
                listIterator.set(new y(g0Var.b(), g0Var.c(), j4.b()));
            }
        }
        return arrayList;
    }
}
