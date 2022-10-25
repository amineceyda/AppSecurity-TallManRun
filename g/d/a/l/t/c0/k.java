package g.d.a.l.t.c0;

import e.e.i.c;
import g.d.a.l.l;
import g.d.a.r.g;
import g.d.a.r.j;
import g.d.a.r.k.a;
import g.d.a.r.k.d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

public class k {
    public final g<l, String> a = new g<>(1000);
    public final c<b> b = g.d.a.r.k.a.a(10, new a(this));

    public class a implements a.b<b> {
        public a(k kVar) {
        }

        public Object a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public static final class b implements a.d {
        public final MessageDigest b;
        public final d c = new d.b();

        public b(MessageDigest messageDigest) {
            this.b = messageDigest;
        }

        public d e() {
            return this.c;
        }
    }

    public String a(l lVar) {
        String a2;
        synchronized (this.a) {
            a2 = this.a.a(lVar);
        }
        if (a2 == null) {
            b b2 = this.b.b();
            Objects.requireNonNull(b2, "Argument must not be null");
            b bVar = b2;
            try {
                lVar.b(bVar.b);
                byte[] digest = bVar.b.digest();
                char[] cArr = j.b;
                synchronized (cArr) {
                    for (int i2 = 0; i2 < digest.length; i2++) {
                        byte b3 = digest[i2] & 255;
                        int i3 = i2 * 2;
                        char[] cArr2 = j.a;
                        cArr[i3] = cArr2[b3 >>> 4];
                        cArr[i3 + 1] = cArr2[b3 & 15];
                    }
                    a2 = new String(cArr);
                }
                this.b.a(bVar);
            } catch (Throwable th) {
                this.b.a(bVar);
                throw th;
            }
        }
        synchronized (this.a) {
            this.a.d(lVar, a2);
        }
        return a2;
    }
}
