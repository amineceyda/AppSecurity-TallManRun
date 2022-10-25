package g.e.a.b.b;

import g.e.a.b.b.h.a;
import g.e.a.b.b.h.d;
import java.security.MessageDigest;
import java.util.Objects;
import java.util.concurrent.Callable;

public final /* synthetic */ class l implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ q c;

    public /* synthetic */ l(boolean z, String str, q qVar) {
        this.a = z;
        this.b = str;
        this.c = qVar;
    }

    public final Object call() {
        boolean z = this.a;
        String str = this.b;
        q qVar = this.c;
        Object[] objArr = new Object[5];
        objArr[0] = true != (!z && u.a(str, qVar, true, false).a) ? "not allowed" : "debug cert rejected";
        objArr[1] = str;
        MessageDigest a2 = a.a("SHA-1");
        Objects.requireNonNull(a2, "null reference");
        byte[] digest = a2.digest(qVar.B());
        int length = digest.length;
        char[] cArr = new char[(length + length)];
        int i2 = 0;
        for (byte b2 : digest) {
            byte b3 = b2 & 255;
            int i3 = i2 + 1;
            char[] cArr2 = d.b;
            cArr[i2] = cArr2[b3 >>> 4];
            i2 = i3 + 1;
            cArr[i3] = cArr2[b3 & 15];
        }
        objArr[2] = new String(cArr);
        objArr[3] = Boolean.valueOf(z);
        objArr[4] = "12451000.false";
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", objArr);
    }
}
