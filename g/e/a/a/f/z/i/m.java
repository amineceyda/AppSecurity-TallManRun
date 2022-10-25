package g.e.a.a.f.z.i;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import g.e.a.a.f.c0.a;
import g.e.a.a.f.l;
import g.e.a.a.f.p;
import g.e.a.a.f.x.a.c;
import g.e.a.a.f.z.i.h0;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public final /* synthetic */ class m implements h0.b {
    public final /* synthetic */ h0 a;
    public final /* synthetic */ l b;
    public final /* synthetic */ p c;

    public /* synthetic */ m(h0 h0Var, l lVar, p pVar) {
        this.a = h0Var;
        this.b = lVar;
        this.c = pVar;
    }

    public final Object a(Object obj) {
        long j2;
        h0 h0Var = this.a;
        l lVar = this.b;
        p pVar = this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (h0Var.g().compileStatement("PRAGMA page_size").simpleQueryForLong() * h0Var.g().compileStatement("PRAGMA page_count").simpleQueryForLong() >= h0Var.f2822e.e()) {
            h0Var.d(1, c.a.CACHE_FULL, lVar.h());
            return -1L;
        }
        Long j3 = h0Var.j(sQLiteDatabase, pVar);
        if (j3 != null) {
            j2 = j3.longValue();
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("backend_name", pVar.b());
            contentValues.put("priority", Integer.valueOf(a.a(pVar.d())));
            contentValues.put("next_request_ms", 0);
            if (pVar.c() != null) {
                contentValues.put("extras", Base64.encodeToString(pVar.c(), 0));
            }
            j2 = sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        int d2 = h0Var.f2822e.d();
        byte[] bArr = lVar.e().b;
        boolean z = bArr.length <= d2;
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("context_id", Long.valueOf(j2));
        contentValues2.put("transport_name", lVar.h());
        contentValues2.put("timestamp_ms", Long.valueOf(lVar.f()));
        contentValues2.put("uptime_ms", Long.valueOf(lVar.i()));
        contentValues2.put("payload_encoding", lVar.e().a.a);
        contentValues2.put("code", lVar.d());
        contentValues2.put("num_attempts", 0);
        contentValues2.put("inline", Boolean.valueOf(z));
        contentValues2.put("payload", z ? bArr : new byte[0]);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues2);
        if (!z) {
            double length = (double) bArr.length;
            double d3 = (double) d2;
            Double.isNaN(length);
            Double.isNaN(d3);
            Double.isNaN(length);
            Double.isNaN(d3);
            Double.isNaN(length);
            Double.isNaN(d3);
            int ceil = (int) Math.ceil(length / d3);
            for (int i2 = 1; i2 <= ceil; i2++) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, (i2 - 1) * d2, Math.min(i2 * d2, bArr.length));
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("event_id", Long.valueOf(insert));
                contentValues3.put("sequence_num", Integer.valueOf(i2));
                contentValues3.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues3);
            }
        }
        for (Map.Entry next : Collections.unmodifiableMap(lVar.c()).entrySet()) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put("event_id", Long.valueOf(insert));
            contentValues4.put("name", (String) next.getKey());
            contentValues4.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues4);
        }
        return Long.valueOf(insert);
    }
}
