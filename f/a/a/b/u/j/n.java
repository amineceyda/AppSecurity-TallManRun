package f.a.a.b.u.j;

import f.a.a.b.s.c;
import f.a.a.b.s.d;

public class n extends c<Object> implements p {
    public boolean b(Object obj) {
        return obj instanceof Integer;
    }

    public String h(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Null argument forbidden");
        } else if (obj instanceof Integer) {
            String num = Integer.toString(((Integer) obj).intValue());
            d dVar = this.c;
            if (dVar == null) {
                return num;
            }
            int i2 = dVar.a;
            StringBuilder sb = new StringBuilder();
            for (int length = num.length(); length < i2; length++) {
                sb.append('0');
            }
            sb.append(num);
            return sb.toString();
        } else {
            throw new IllegalArgumentException("Cannot convert " + obj + " of type" + obj.getClass().getName());
        }
    }
}
