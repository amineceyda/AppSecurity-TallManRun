package g.e.a.a.f.z.i;

import android.content.Context;
import h.a.a;
import java.util.Objects;

public final class d0 implements Object<String> {
    public final a<Context> a;

    public d0(a<Context> aVar) {
        this.a = aVar;
    }

    public Object get() {
        String packageName = this.a.get().getPackageName();
        Objects.requireNonNull(packageName, "Cannot return null from a non-@Nullable @Provides method");
        return packageName;
    }
}
