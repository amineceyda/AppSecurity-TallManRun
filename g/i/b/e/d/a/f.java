package g.i.b.e.d.a;

import java.util.HashMap;
import java.util.Map;

public final class f {
    public int a = 0;
    public String b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f4146d;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, String> f4147e;

    public f(String str) {
        this.b = str;
        this.c = 0;
    }

    public final void a(Map<String, String> map) {
        this.f4147e = new HashMap();
        if (map.size() > 0) {
            for (String next : map.keySet()) {
                this.f4147e.put(next.toLowerCase(), map.get(next));
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("errorCode:");
        sb.append(this.a);
        sb.append(",errorInfo:");
        sb.append(this.b);
        sb.append(",httpStatus:");
        sb.append(this.c);
        sb.append(",headers:");
        sb.append(this.f4147e);
        sb.append(",body:");
        byte[] bArr = this.f4146d;
        sb.append(bArr != null ? Integer.valueOf(bArr.length) : "null");
        return sb.toString();
    }
}
