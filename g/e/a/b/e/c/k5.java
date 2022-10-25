package g.e.a.b.e.c;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;

public final /* synthetic */ class k5 implements i5 {
    public final /* synthetic */ m5 a;
    public final /* synthetic */ String b;

    public /* synthetic */ k5(m5 m5Var, String str) {
        this.a = m5Var;
        this.b = str;
    }

    public final Object c() {
        String str;
        m5 m5Var = this.a;
        String str2 = this.b;
        ContentResolver contentResolver = m5Var.a.getContentResolver();
        Uri uri = b5.a;
        synchronized (b5.class) {
            if (b5.f2900f == null) {
                b5.f2899e.set(false);
                b5.f2900f = new HashMap();
                b5.f2905k = new Object();
                contentResolver.registerContentObserver(b5.a, true, new a5());
            } else if (b5.f2899e.getAndSet(false)) {
                b5.f2900f.clear();
                b5.f2901g.clear();
                b5.f2902h.clear();
                b5.f2903i.clear();
                b5.f2904j.clear();
                b5.f2905k = new Object();
            }
            Object obj = b5.f2905k;
            str = null;
            if (b5.f2900f.containsKey(str2)) {
                String str3 = (String) b5.f2900f.get(str2);
                if (str3 != null) {
                    str = str3;
                }
            } else {
                int length = b5.f2906l.length;
                Cursor query = contentResolver.query(b5.a, (String[]) null, (String) null, new String[]{str2}, (String) null);
                if (query != null) {
                    try {
                        if (!query.moveToFirst()) {
                            b5.a(obj, str2, (String) null);
                        } else {
                            String string = query.getString(1);
                            if (string != null && string.equals((Object) null)) {
                                string = null;
                            }
                            b5.a(obj, str2, string);
                            if (string != null) {
                                str = string;
                            }
                        }
                    } finally {
                        query.close();
                    }
                }
            }
        }
        return str;
    }
}
