package f.a.a.b.y;

import org.slf4j.helpers.MessageFormatter;

public class d {
    public static final d c = new d(a.START, (String) null);

    /* renamed from: d  reason: collision with root package name */
    public static final d f1855d = new d(a.CURLY_LEFT, (String) null);

    /* renamed from: e  reason: collision with root package name */
    public static final d f1856e = new d(a.CURLY_RIGHT, (String) null);

    /* renamed from: f  reason: collision with root package name */
    public static final d f1857f = new d(a.DEFAULT, (String) null);
    public a a;
    public String b;

    public enum a {
        LITERAL,
        START,
        CURLY_LEFT,
        CURLY_RIGHT,
        DEFAULT
    }

    public d(a aVar, String str) {
        this.a = aVar;
        this.b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.a != dVar.a) {
            return false;
        }
        String str = this.b;
        String str2 = dVar.b;
        return str == null ? str2 == null : str.equals(str2);
    }

    public int hashCode() {
        a aVar = this.a;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        String str = this.b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("Token{type=");
        i2.append(this.a);
        String sb = i2.toString();
        if (this.b != null) {
            StringBuilder l2 = g.a.a.a.a.l(sb, ", payload='");
            l2.append(this.b);
            l2.append('\'');
            sb = l2.toString();
        }
        return sb + MessageFormatter.DELIM_STOP;
    }
}
