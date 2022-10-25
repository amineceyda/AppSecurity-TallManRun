package g.e.a.a.f.z.i;

import android.database.Cursor;
import g.e.a.a.f.x.a.c;
import g.e.a.a.f.z.i.h0;
import java.util.Objects;

public final /* synthetic */ class o implements h0.b {
    public final /* synthetic */ h0 a;

    public /* synthetic */ o(h0 h0Var) {
        this.a = h0Var;
    }

    public final Object a(Object obj) {
        h0 h0Var = this.a;
        Cursor cursor = (Cursor) obj;
        Objects.requireNonNull(h0Var);
        while (cursor.moveToNext()) {
            int i2 = cursor.getInt(0);
            h0Var.d((long) i2, c.a.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }
}
