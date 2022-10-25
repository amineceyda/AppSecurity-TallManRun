package g.e.a.b.d;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class g implements DynamiteModule.a {
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.C0001a aVar) throws DynamiteModule.LoadingException {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int a = aVar.a(context, str);
        bVar.a = a;
        int i2 = 0;
        int b = a != 0 ? aVar.b(context, str, false) : aVar.b(context, str, true);
        bVar.b = b;
        int i3 = bVar.a;
        if (i3 != 0) {
            i2 = i3;
        } else if (b == 0) {
            bVar.c = 0;
            return bVar;
        }
        if (i2 >= b) {
            bVar.c = -1;
        } else {
            bVar.c = 1;
        }
        return bVar;
    }
}
