package g.d.a.l.t;

import com.bumptech.glide.load.engine.GlideException;
import e.e.i.c;
import g.a.a.a.a;
import g.d.a.l.n;
import g.d.a.l.s.e;
import g.d.a.l.t.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.slf4j.helpers.MessageFormatter;

public class t<Data, ResourceType, Transcode> {
    public final c<List<Throwable>> a;
    public final List<? extends j<Data, ResourceType, Transcode>> b;
    public final String c;

    public t(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<j<Data, ResourceType, Transcode>> list, c<List<Throwable>> cVar) {
        this.a = cVar;
        if (!list.isEmpty()) {
            this.b = list;
            StringBuilder i2 = a.i("Failed LoadPath{");
            i2.append(cls.getSimpleName());
            i2.append("->");
            i2.append(cls2.getSimpleName());
            i2.append("->");
            i2.append(cls3.getSimpleName());
            i2.append("}");
            this.c = i2.toString();
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public v<Transcode> a(e<Data> eVar, n nVar, int i2, int i3, j.a<ResourceType> aVar) throws GlideException {
        v<Transcode> vVar;
        List<Throwable> b2 = this.a.b();
        Objects.requireNonNull(b2, "Argument must not be null");
        List list = b2;
        try {
            int size = this.b.size();
            vVar = null;
            for (int i4 = 0; i4 < size; i4++) {
                vVar = ((j) this.b.get(i4)).a(eVar, i2, i3, nVar, aVar);
                if (vVar != null) {
                    break;
                }
            }
        } catch (GlideException e2) {
            list.add(e2);
        } catch (Throwable th) {
            this.a.a(list);
            throw th;
        }
        if (vVar != null) {
            this.a.a(list);
            return vVar;
        }
        throw new GlideException(this.c, (List<Throwable>) new ArrayList(list));
    }

    public String toString() {
        StringBuilder i2 = a.i("LoadPath{decodePaths=");
        i2.append(Arrays.toString(this.b.toArray()));
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
