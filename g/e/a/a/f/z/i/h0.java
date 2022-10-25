package g.e.a.a.f.z.i;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import g.e.a.a.f.a0.a;
import g.e.a.a.f.l;
import g.e.a.a.f.p;
import g.e.a.a.f.x.a.a;
import g.e.a.a.f.x.a.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class h0 implements a0, g.e.a.a.f.a0.a, z {

    /* renamed from: g  reason: collision with root package name */
    public static final g.e.a.a.a f2820g = new g.e.a.a.a("proto");
    public final j0 b;
    public final g.e.a.a.f.b0.a c;

    /* renamed from: d  reason: collision with root package name */
    public final g.e.a.a.f.b0.a f2821d;

    /* renamed from: e  reason: collision with root package name */
    public final b0 f2822e;

    /* renamed from: f  reason: collision with root package name */
    public final g.e.a.a.f.w.a<String> f2823f;

    public interface b<T, U> {
        U a(T t);
    }

    public static class c {
        public final String a;
        public final String b;

        public c(String str, String str2, a aVar) {
            this.a = str;
            this.b = str2;
        }
    }

    public interface d<T> {
        T a();
    }

    public h0(g.e.a.a.f.b0.a aVar, g.e.a.a.f.b0.a aVar2, b0 b0Var, j0 j0Var, g.e.a.a.f.w.a<String> aVar3) {
        this.b = j0Var;
        this.c = aVar;
        this.f2821d = aVar2;
        this.f2822e = b0Var;
        this.f2823f = aVar3;
    }

    public static String o(Iterable<g0> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<g0> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static <T> T q(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.a(cursor);
        } finally {
            cursor.close();
        }
    }

    public void B(p pVar, long j2) {
        k(new f(j2, pVar));
    }

    public g0 H(p pVar, l lVar) {
        e.e.d.l.a.u("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), lVar.h(), pVar.b());
        long longValue = ((Long) k(new m(this, lVar, pVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return new y(longValue, pVar, lVar);
    }

    public Iterable<p> I() {
        SQLiteDatabase g2 = g();
        g2.beginTransaction();
        try {
            List list = (List) q(g2.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), h.a);
            g2.setTransactionSuccessful();
            return list;
        } finally {
            g2.endTransaction();
        }
    }

    /* JADX INFO: finally extract failed */
    public long L(p pVar) {
        Cursor rawQuery = g().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(g.e.a.a.f.c0.a.a(pVar.d()))});
        try {
            Long valueOf = Long.valueOf(rawQuery.moveToNext() ? rawQuery.getLong(0) : 0);
            rawQuery.close();
            return valueOf.longValue();
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean R(p pVar) {
        Boolean bool;
        SQLiteDatabase g2 = g();
        g2.beginTransaction();
        try {
            Long j2 = j(g2, pVar);
            if (j2 == null) {
                bool = Boolean.FALSE;
            } else {
                bool = (Boolean) q(g().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{j2.toString()}), v.a);
            }
            g2.setTransactionSuccessful();
            g2.endTransaction();
            return bool.booleanValue();
        } catch (Throwable th) {
            g2.endTransaction();
            throw th;
        }
    }

    public void T(Iterable<g0> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder i2 = g.a.a.a.a.i("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            i2.append(o(iterable));
            String sb = i2.toString();
            SQLiteDatabase g2 = g();
            g2.beginTransaction();
            try {
                Objects.requireNonNull(this);
                g2.compileStatement(sb).execute();
                q(g2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", (String[]) null), new o(this));
                g2.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                g2.setTransactionSuccessful();
            } finally {
                g2.endTransaction();
            }
        }
    }

    public <T> T a(a.C0102a<T> aVar) {
        SQLiteDatabase g2 = g();
        n(new e(g2), b.a);
        try {
            T a2 = aVar.a();
            g2.setTransactionSuccessful();
            return a2;
        } finally {
            g2.endTransaction();
        }
    }

    public g.e.a.a.f.x.a.a b() {
        int i2 = g.e.a.a.f.x.a.a.f2782e;
        a.C0104a aVar = new a.C0104a();
        HashMap hashMap = new HashMap();
        SQLiteDatabase g2 = g();
        g2.beginTransaction();
        try {
            Objects.requireNonNull(this);
            g.e.a.a.f.x.a.a aVar2 = (g.e.a.a.f.x.a.a) q(g2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new n(this, hashMap, aVar));
            g2.setTransactionSuccessful();
            return aVar2;
        } finally {
            g2.endTransaction();
        }
    }

    public void close() {
        this.b.close();
    }

    public void d(long j2, c.a aVar, String str) {
        k(new i(str, aVar, j2));
    }

    public void f() {
        SQLiteDatabase g2 = g();
        g2.beginTransaction();
        try {
            Objects.requireNonNull(this);
            g2.compileStatement("DELETE FROM log_event_dropped").execute();
            g2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.c.a()).execute();
            g2.setTransactionSuccessful();
        } finally {
            g2.endTransaction();
        }
    }

    public SQLiteDatabase g() {
        j0 j0Var = this.b;
        Objects.requireNonNull(j0Var);
        return (SQLiteDatabase) n(new w(j0Var), a.a);
    }

    public final Long j(SQLiteDatabase sQLiteDatabase, p pVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{pVar.b(), String.valueOf(g.e.a.a.f.c0.a.a(pVar.d()))}));
        if (pVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public <T> T k(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase g2 = g();
        g2.beginTransaction();
        try {
            T a2 = bVar.a(g2);
            g2.setTransactionSuccessful();
            return a2;
        } finally {
            g2.endTransaction();
        }
    }

    /* JADX INFO: finally extract failed */
    public int l() {
        long a2 = this.c.a() - this.f2822e.b();
        SQLiteDatabase g2 = g();
        g2.beginTransaction();
        try {
            Objects.requireNonNull(this);
            String[] strArr = {String.valueOf(a2)};
            q(g2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new j(this));
            Integer valueOf = Integer.valueOf(g2.delete("events", "timestamp_ms < ?", strArr));
            g2.setTransactionSuccessful();
            g2.endTransaction();
            return valueOf.intValue();
        } catch (Throwable th) {
            g2.endTransaction();
            throw th;
        }
    }

    public final <T> T n(d<T> dVar, b<Throwable, T> bVar) {
        long a2 = this.f2821d.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.f2821d.a() >= ((long) this.f2822e.a()) + a2) {
                    return bVar.a(e2);
                }
                SystemClock.sleep(50);
            }
        }
    }

    public void p(Iterable<g0> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder i2 = g.a.a.a.a.i("DELETE FROM events WHERE _id in ");
            i2.append(o(iterable));
            g().compileStatement(i2.toString()).execute();
        }
    }

    public Iterable<g0> w(p pVar) {
        return (Iterable) k(new d(this, pVar));
    }
}
