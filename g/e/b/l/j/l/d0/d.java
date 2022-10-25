package g.e.b.l.j.l.d0;

import android.util.Base64;
import android.util.JsonReader;
import g.e.b.l.j.l.d0.g;
import g.e.b.l.j.l.f;
import g.e.b.n.a;
import java.util.Objects;

public final /* synthetic */ class d implements g.a {
    public static final /* synthetic */ d a = new d();

    public final Object a(JsonReader jsonReader) {
        a aVar = g.a;
        jsonReader.beginObject();
        String str = null;
        byte[] bArr = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("filename")) {
                str = jsonReader.nextString();
                Objects.requireNonNull(str, "Null filename");
            } else if (!nextName.equals("contents")) {
                jsonReader.skipValue();
            } else {
                bArr = Base64.decode(jsonReader.nextString(), 2);
                Objects.requireNonNull(bArr, "Null contents");
            }
        }
        jsonReader.endObject();
        String str2 = str == null ? " filename" : "";
        if (bArr == null) {
            str2 = g.a.a.a.a.w(str2, " contents");
        }
        if (str2.isEmpty()) {
            return new f(str, bArr, (f.a) null);
        }
        throw new IllegalStateException(g.a.a.a.a.w("Missing required properties:", str2));
    }
}
