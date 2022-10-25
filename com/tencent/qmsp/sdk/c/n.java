package com.tencent.qmsp.sdk.c;

import com.tencent.qmsp.sdk.c.f;
import com.tencent.qmsp.sdk.f.g;
import org.json.JSONObject;

public class n implements e, d {
    private static volatile n a;

    public class a implements f.C0013f {
        public a() {
        }

        public int a(long j2, long j3, long j4, Object obj, Object obj2, Object[] objArr, Object[] objArr2) {
            if (obj != null && (obj instanceof String)) {
                String str = (String) obj;
                g.a("QSec.Rpt", 1, String.format("Op: %d, Rid: %d, val: %s", new Object[]{Long.valueOf(j2), Long.valueOf(j3), str}));
                n.this.a(j2, j3, str);
            }
            return 0;
        }
    }

    private n() {
        f.a(3, (f.C0013f) new a());
    }

    public static n b() {
        if (a == null) {
            synchronized (n.class) {
                if (a == null) {
                    a = new n();
                }
            }
        }
        return a;
    }

    public String a() {
        return "Rpt";
    }

    public void a(long j2, long j3, String str) {
        new JSONObject();
        if (j2 == 1 || j2 == 2) {
            com.tencent.qmsp.sdk.a.f.a(str, (int) j3);
        }
    }
}
