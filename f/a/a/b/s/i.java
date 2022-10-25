package f.a.a.b.s;

import java.util.List;
import java.util.regex.Pattern;

public class i<E> extends a<E> {

    /* renamed from: h  reason: collision with root package name */
    public Pattern f1769h;

    /* renamed from: i  reason: collision with root package name */
    public String f1770i;

    /* renamed from: j  reason: collision with root package name */
    public String f1771j;

    public String n(E e2, String str) {
        return !this.f1760f ? str : this.f1769h.matcher(str).replaceAll(this.f1771j);
    }

    public void start() {
        List<String> list = this.f1759e;
        if (list == null) {
            this.f1758d.m("at least two options are expected whereas you have declared none");
            return;
        }
        int size = list.size();
        if (size < 2) {
            this.f1758d.m("at least two options are expected whereas you have declared only " + size + "as [" + list + "]");
            return;
        }
        String str = list.get(0);
        this.f1770i = str;
        this.f1769h = Pattern.compile(str);
        this.f1771j = list.get(1);
        this.f1760f = true;
    }
}
