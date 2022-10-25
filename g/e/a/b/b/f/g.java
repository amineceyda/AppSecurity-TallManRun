package g.e.a.b.b.f;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.slf4j.helpers.MessageFormatter;

public final class g {
    public final List<String> a = new ArrayList();
    public final Object b;

    public g(Object obj) {
        Objects.requireNonNull(obj, "null reference");
        this.b = obj;
    }

    public g a(String str, Object obj) {
        List<String> list = this.a;
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(str.length() + 1 + valueOf.length());
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        list.add(sb.toString());
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(this.b.getClass().getSimpleName());
        sb.append(MessageFormatter.DELIM_START);
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(this.a.get(i2));
            if (i2 < size - 1) {
                sb.append(", ");
            }
        }
        sb.append(MessageFormatter.DELIM_STOP);
        return sb.toString();
    }
}
