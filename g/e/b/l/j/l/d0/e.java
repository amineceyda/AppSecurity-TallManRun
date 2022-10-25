package g.e.b.l.j.l.d0;

import android.util.Base64;
import android.util.JsonReader;
import g.e.b.l.j.l.a0;
import g.e.b.l.j.l.d0.g;
import g.e.b.l.j.l.n;
import g.e.b.n.a;
import java.util.Objects;

public final /* synthetic */ class e implements g.a {
    public static final /* synthetic */ e a = new e();

    public final Object a(JsonReader jsonReader) {
        a aVar = g.a;
        jsonReader.beginObject();
        Long l2 = null;
        Long l3 = null;
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    Objects.requireNonNull(str, "Null name");
                    break;
                case 1:
                    l3 = Long.valueOf(jsonReader.nextLong());
                    break;
                case 2:
                    str2 = new String(Base64.decode(jsonReader.nextString(), 2), a0.a);
                    break;
                case 3:
                    l2 = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String str3 = l2 == null ? " baseAddress" : "";
        if (l3 == null) {
            str3 = g.a.a.a.a.w(str3, " size");
        }
        if (str == null) {
            str3 = g.a.a.a.a.w(str3, " name");
        }
        if (str3.isEmpty()) {
            return new n(l2.longValue(), l3.longValue(), str, str2, (n.a) null);
        }
        throw new IllegalStateException(g.a.a.a.a.w("Missing required properties:", str3));
    }
}
