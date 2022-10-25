package g.e.a.b.d;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class f implements DynamiteModule.a {
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.C0001a aVar) throws DynamiteModule.LoadingException {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        bVar.a = aVar.a(context, str);
        int b = aVar.b(context, str, true);
        bVar.b = b;
        int i2 = bVar.a;
        if (i2 == 0) {
            if (b == 0) {
                bVar.c = 0;
                return bVar;
            }
            i2 = 0;
        }
        if (i2 >= b) {
            bVar.c = -1;
        } else {
            bVar.c = 1;
        }
        return bVar;
    }
}
