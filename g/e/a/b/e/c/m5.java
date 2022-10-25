package g.e.a.b.e.c;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import e.b.a;
import g.e.a.b.b.h.e;
import javax.annotation.Nullable;

public final class m5 implements j5 {
    public static m5 c;
    @Nullable
    public final Context a;
    @Nullable
    public final ContentObserver b;

    public m5() {
        this.a = null;
        this.b = null;
    }

    public m5(Context context) {
        this.a = context;
        l5 l5Var = new l5();
        this.b = l5Var;
        context.getContentResolver().registerContentObserver(b5.a, true, l5Var);
    }

    public static m5 b(Context context) {
        m5 m5Var;
        synchronized (m5.class) {
            if (c == null) {
                c = a.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new m5(context) : new m5();
            }
            m5Var = c;
        }
        return m5Var;
    }

    @Nullable
    /* renamed from: c */
    public final String a(String str) {
        if (this.a == null) {
            return null;
        }
        try {
            return (String) e.w(new k5(this, str));
        } catch (IllegalStateException | NullPointerException | SecurityException e2) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e2);
            return null;
        }
    }
}
