package g.e.a.a.f.z.i;

import android.database.Cursor;
import android.util.Base64;
import g.e.a.a.a;
import g.e.a.a.f.i;
import g.e.a.a.f.p;
import g.e.a.a.f.z.i.h0;
import java.util.ArrayList;

public final /* synthetic */ class h implements h0.b {
    public static final /* synthetic */ h a = new h();

    public final Object a(Object obj) {
        byte[] bArr;
        Cursor cursor = (Cursor) obj;
        a aVar = h0.f2820g;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            p.a a2 = p.a();
            a2.b(cursor.getString(1));
            a2.c(g.e.a.a.f.c0.a.b(cursor.getInt(2)));
            String string = cursor.getString(3);
            if (string == null) {
                bArr = null;
            } else {
                bArr = Base64.decode(string, 0);
            }
            i.b bVar = (i.b) a2;
            bVar.b = bArr;
            arrayList.add(bVar.a());
        }
        return arrayList;
    }
}
