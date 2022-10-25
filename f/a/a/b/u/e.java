package f.a.a.b.u;

import f.a.a.b.u.d;
import f.a.a.b.z.k;
import g.a.a.a.a;

public class e<E> extends h<E> {
    public k s;

    public void start() {
        String str;
        d dVar = new d(d.a.EMBEDDED);
        if (this.s == null) {
            str = "maxFileSize property is mandatory";
        } else {
            StringBuilder i2 = a.i("Archive files will be limited to [");
            i2.append(this.s);
            i2.append("] each.");
            n(i2.toString());
            k kVar = this.s;
            dVar.n = kVar;
            this.r = dVar;
            long j2 = this.p.a;
            if ((j2 == 0) || j2 >= kVar.a) {
                super.start();
                return;
            }
            StringBuilder i3 = a.i("totalSizeCap of [");
            i3.append(this.p);
            i3.append("] is smaller than maxFileSize [");
            i3.append(this.s);
            i3.append("] which is non-sensical");
            str = i3.toString();
        }
        m(str);
    }

    public String toString() {
        StringBuilder i2 = a.i("c.q.l.core.rolling.SizeAndTimeBasedRollingPolicy@");
        i2.append(hashCode());
        return i2.toString();
    }
}
