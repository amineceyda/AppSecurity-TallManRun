package g.e.b.l.j.l.d0;

import android.util.JsonReader;
import g.e.b.l.j.l.b0;
import g.e.b.l.j.l.d0.g;
import g.e.b.l.j.l.q;
import g.e.b.n.a;
import java.util.Objects;

public final /* synthetic */ class c implements g.a {
    public static final /* synthetic */ c a = new c();

    public final Object a(JsonReader jsonReader) {
        a aVar = g.a;
        jsonReader.beginObject();
        String str = null;
        Integer num = null;
        b0 b0Var = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    b0Var = g.a(jsonReader, b.a);
                    break;
                case 1:
                    str = jsonReader.nextString();
                    Objects.requireNonNull(str, "Null name");
                    break;
                case 2:
                    num = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String str2 = str == null ? " name" : "";
        if (num == null) {
            str2 = g.a.a.a.a.w(str2, " importance");
        }
        if (b0Var == null) {
            str2 = g.a.a.a.a.w(str2, " frames");
        }
        if (str2.isEmpty()) {
            return new q(str, num.intValue(), b0Var, (q.a) null);
        }
        throw new IllegalStateException(g.a.a.a.a.w("Missing required properties:", str2));
    }
}
