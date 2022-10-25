package g.e.a.a.f.z.i;

import android.database.Cursor;
import g.e.a.a.a;
import g.e.a.a.f.z.i.h0;
import java.util.ArrayList;

public final /* synthetic */ class g implements h0.b {
    public static final /* synthetic */ g a = new g();

    public final Object a(Object obj) {
        Cursor cursor = (Cursor) obj;
        a aVar = h0.f2820g;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i2 += blob.length;
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            byte[] bArr2 = (byte[]) arrayList.get(i4);
            System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
            i3 += bArr2.length;
        }
        return bArr;
    }
}
