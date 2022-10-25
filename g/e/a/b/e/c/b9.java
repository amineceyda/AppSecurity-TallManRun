package g.e.a.b.e.c;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class b9 extends i9 {
    public b9(int i2) {
        super(i2);
    }

    public final void a() {
        if (!this.f2958e) {
            for (int i2 = 0; i2 < b(); i2++) {
                Map.Entry d2 = d(i2);
                if (((f7) d2.getKey()).k()) {
                    d2.setValue(Collections.unmodifiableList((List) d2.getValue()));
                }
            }
            for (Map.Entry entry : this.f2957d.isEmpty() ? e9.b : this.f2957d.entrySet()) {
                if (((f7) entry.getKey()).k()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
