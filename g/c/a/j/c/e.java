package g.c.a.j.c;

import android.content.Context;
import android.content.Intent;
import android.preference.Preference;
import i.o.c.h;

public final class e extends g {
    public final Class<?> c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(String str, Class<?> cls) {
        super(str);
        h.e(str, "key");
        h.e(cls, "activity");
        this.c = cls;
    }

    public boolean a(Preference preference) {
        h.e(preference, "preference");
        Intent intent = new Intent(this.b, this.c);
        Context context = this.b;
        if (context == null) {
            return false;
        }
        context.startActivity(intent);
        return false;
    }
}
