package g.e.b.l.j.l.d0;

import android.util.JsonReader;
import g.e.b.l.j.l.d0.g;
import g.e.b.l.j.l.r;
import g.e.b.n.a;
import java.util.Objects;

public final /* synthetic */ class b implements g.a {
    public static final /* synthetic */ b a = new b();

    public final Object a(JsonReader jsonReader) {
        a aVar = g.a;
        r.b bVar = new r.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    bVar.f3668d = Long.valueOf(jsonReader.nextLong());
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    Objects.requireNonNull(nextString, "Null symbol");
                    bVar.b = nextString;
                    break;
                case 2:
                    bVar.a = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    bVar.c = jsonReader.nextString();
                    break;
                case 4:
                    bVar.f3669e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVar.a();
    }
}
