package g.e.a.b.e.c;

import android.database.Cursor;
import e.d.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final /* synthetic */ class e5 implements i5 {
    public final /* synthetic */ g5 a;

    public /* synthetic */ e5(g5 g5Var) {
        this.a = g5Var;
    }

    /* JADX INFO: finally extract failed */
    public final Object c() {
        g5 g5Var = this.a;
        Cursor query = g5Var.a.query(g5Var.b, g5.f2934h, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                Map emptyMap = Collections.emptyMap();
                query.close();
                return emptyMap;
            }
            Map aVar = count <= 256 ? new a(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                aVar.put(query.getString(0), query.getString(1));
            }
            query.close();
            return aVar;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }
}
