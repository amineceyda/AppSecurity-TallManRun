package g.e.a.b.f.b;

import android.content.Context;
import java.util.Objects;

public final class l9 {
    public final Context a;

    public l9(Context context) {
        Context applicationContext = context.getApplicationContext();
        Objects.requireNonNull(applicationContext, "null reference");
        this.a = applicationContext;
    }
}
