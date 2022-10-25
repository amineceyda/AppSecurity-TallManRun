package g.e.a.a.f.z.i;

import android.database.Cursor;
import g.e.a.a.f.x.a.f;
import g.e.a.a.f.z.i.h0;

public final /* synthetic */ class c implements h0.b {
    public final /* synthetic */ long a;

    public /* synthetic */ c(long j2) {
        this.a = j2;
    }

    public final Object a(Object obj) {
        long j2 = this.a;
        Cursor cursor = (Cursor) obj;
        cursor.moveToNext();
        long j3 = cursor.getLong(0);
        int i2 = f.c;
        return new f(j3, j2);
    }
}
