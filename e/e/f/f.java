package e.e.f;

import android.os.LocaleList;
import java.util.Locale;

public final class f implements e {
    public final LocaleList a;

    public f(LocaleList localeList) {
        this.a = localeList;
    }

    public Object a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this.a.equals(((e) obj).a());
    }

    public Locale get(int i2) {
        return this.a.get(i2);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
