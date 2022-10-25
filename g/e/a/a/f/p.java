package g.e.a.a.f;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import g.e.a.a.b;
import g.e.a.a.f.i;

@AutoValue
public abstract class p {

    @AutoValue.Builder
    public static abstract class a {
        public abstract p a();

        public abstract a b(String str);

        public abstract a c(b bVar);
    }

    public static a a() {
        i.b bVar = new i.b();
        bVar.c(b.DEFAULT);
        return bVar;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract b d();

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
