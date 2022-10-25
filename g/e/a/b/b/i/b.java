package g.e.a.b.b.i;

import android.content.Context;

public class b {
    public static b b = new b();
    public a a = null;

    public static a a(Context context) {
        a aVar;
        b bVar = b;
        synchronized (bVar) {
            if (bVar.a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                bVar.a = new a(context);
            }
            aVar = bVar.a;
        }
        return aVar;
    }
}
