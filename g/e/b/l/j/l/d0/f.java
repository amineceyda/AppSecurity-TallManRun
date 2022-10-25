package g.e.b.l.j.l.d0;

import android.util.JsonReader;
import g.e.b.l.j.l.d;
import g.e.b.l.j.l.d0.g;
import g.e.b.n.a;
import java.util.Objects;

public final /* synthetic */ class f implements g.a {
    public static final /* synthetic */ f a = new f();

    public final Object a(JsonReader jsonReader) {
        a aVar = g.a;
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("key")) {
                str = jsonReader.nextString();
                Objects.requireNonNull(str, "Null key");
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else {
                str2 = jsonReader.nextString();
                Objects.requireNonNull(str2, "Null value");
            }
        }
        jsonReader.endObject();
        String str3 = str == null ? " key" : "";
        if (str2 == null) {
            str3 = g.a.a.a.a.w(str3, " value");
        }
        if (str3.isEmpty()) {
            return new d(str, str2, (d.a) null);
        }
        throw new IllegalStateException(g.a.a.a.a.w("Missing required properties:", str3));
    }
}
