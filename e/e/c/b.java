package e.e.c;

import android.content.SharedPreferences;
import java.util.Objects;

@Deprecated
public final class b {
    public static b b;
    public final a a = new a();

    public static class a {
    }

    @Deprecated
    public static b b() {
        if (b == null) {
            b = new b();
        }
        return b;
    }

    @Deprecated
    public void a(SharedPreferences.Editor editor) {
        Objects.requireNonNull(this.a);
        try {
            editor.apply();
        } catch (AbstractMethodError unused) {
            editor.commit();
        }
    }
}
