package e.e.f;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

public final class c {
    public static final /* synthetic */ int b = 0;
    public e a;

    static {
        a(new Locale[0]);
    }

    public c(e eVar) {
        this.a = eVar;
    }

    public static c a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new c(new f(new LocaleList(localeArr)));
        }
        return new c(new d(localeArr));
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && this.a.equals(((c) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
