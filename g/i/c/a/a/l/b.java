package g.i.c.a.a.l;

import android.util.SparseArray;
import g.a.a.a.a;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.helpers.MessageFormatter;

public class b {
    public String a;
    public Map<String, Object> b;
    public g c;

    /* renamed from: d  reason: collision with root package name */
    public f f4454d;

    /* renamed from: e  reason: collision with root package name */
    public SparseArray<d> f4455e;

    /* renamed from: f  reason: collision with root package name */
    public String f4456f;

    /* renamed from: g  reason: collision with root package name */
    public String f4457g;

    /* renamed from: h  reason: collision with root package name */
    public Map<String, Object> f4458h;

    /* renamed from: i  reason: collision with root package name */
    public Map<String, Object> f4459i;

    /* renamed from: j  reason: collision with root package name */
    public b f4460j;

    /* renamed from: k  reason: collision with root package name */
    public Map<String, Object> f4461k;

    public b a() {
        SparseArray<d> sparseArray;
        d dVar;
        b bVar = new b();
        bVar.a = this.a;
        HashMap hashMap = null;
        bVar.b = this.b == null ? null : new HashMap(this.b);
        bVar.c = this.c;
        SparseArray<d> sparseArray2 = this.f4455e;
        if (sparseArray2 == null) {
            sparseArray = null;
        } else {
            sparseArray = new SparseArray<>();
            for (int i2 = 0; i2 < sparseArray2.size(); i2++) {
                int keyAt = sparseArray2.keyAt(i2);
                d valueAt = sparseArray2.valueAt(i2);
                if (valueAt == null) {
                    dVar = null;
                } else {
                    dVar = new d();
                    dVar.a = valueAt.a;
                    dVar.b = valueAt.b == null ? null : new HashMap(valueAt.b);
                }
                sparseArray.put(keyAt, dVar);
            }
        }
        bVar.f4455e = sparseArray;
        bVar.f4456f = this.f4456f;
        bVar.f4457g = this.f4457g;
        bVar.f4458h = this.f4458h == null ? null : new HashMap(this.f4458h);
        bVar.f4459i = this.f4459i == null ? null : new HashMap(this.f4459i);
        b bVar2 = this.f4460j;
        bVar.f4460j = bVar2 == null ? null : bVar2.a();
        if (this.f4461k != null) {
            hashMap = new HashMap(this.f4461k);
        }
        bVar.f4461k = hashMap;
        bVar.f4454d = this.f4454d;
        return bVar;
    }

    public String toString() {
        StringBuilder i2 = a.i("DataEntity{elementId='");
        a.p(i2, this.a, '\'', ", elementParams=");
        i2.append(this.b);
        i2.append(", pageId='");
        a.p(i2, this.f4456f, '\'', ", pageContentId='");
        a.p(i2, this.f4457g, '\'', ", pageParams=");
        i2.append(this.f4458h);
        i2.append('\'');
        i2.append(", innerParams=");
        i2.append(this.f4459i);
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
