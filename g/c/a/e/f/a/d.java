package g.c.a.e.f.a;

import android.util.Log;
import g.c.b.a.c;
import g.c.b.a.j.g;
import g.c.b.a.j.i;
import g.c.b.a.l.e;
import g.c.b.b.f;
import i.o.c.h;
import i.o.c.s.a;
import i.p.c;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class d implements i {
    @Deprecated
    public static final Logger a = LoggerFactory.getLogger("ClientChannel|AccessSignature");

    public c a(c cVar) {
        String str;
        String str2;
        h.e(cVar, "request");
        Object a2 = cVar.a();
        Map c = cVar.c();
        if (c == null) {
            c = new LinkedHashMap();
        }
        String d2 = cVar.d();
        boolean z = false;
        String d3 = !(d2 == null || d2.length() == 0) ? cVar.d() : "d33cb23fd17fda8ea38be504929b77ef";
        if (!(c instanceof a)) {
            h.e(c, "headers");
            if (d3 == null || d3.length() == 0) {
                z = true;
            }
            if (z) {
                str = "d33cb23fd17fda8ea38be504929b77ef";
            } else {
                str = d3;
            }
            i.q.c cVar2 = new i.q.c(10000000, 99999999);
            c.a aVar = i.p.c.c;
            h.e(cVar2, "$this$random");
            h.e(aVar, "random");
            try {
                int Z = f.Z(aVar, cVar2);
                long currentTimeMillis = System.currentTimeMillis();
                String str3 = "";
                if (a2 instanceof byte[]) {
                    str3 = b((byte[]) a2, currentTimeMillis, str, Z);
                } else if (a2 instanceof String) {
                    String str4 = a2 + currentTimeMillis + str + Z;
                    i.c cVar3 = e.a;
                    h.e(str4, "<this>");
                    try {
                        MessageDigest instance = MessageDigest.getInstance("md5");
                        Charset forName = Charset.forName("utf-8");
                        h.d(forName, "Charset.forName(charsetName)");
                        byte[] bytes = str4.getBytes(forName);
                        h.d(bytes, "(this as java.lang.String).getBytes(charset)");
                        str2 = new BigInteger(1, instance.digest(bytes)).toString(16);
                    } catch (Exception e2) {
                        String j2 = h.j("String.md5 exception ", e2.getMessage());
                        h.e("Util", "tag");
                        h.e(j2, "message");
                        g gVar = g.c.b.a.l.c.b;
                        String j3 = h.j("ClientChannel|", "Util");
                        if (gVar != null) {
                            gVar.i(j3, j2);
                        } else {
                            Log.i(j3, j2);
                        }
                        str2 = str3;
                    }
                    if (str2 != null) {
                        str3 = str2;
                    }
                }
                c.put("Ual-Access-Signature", str3);
                c.put("Ual-Access-Nonce", String.valueOf(Z));
                c.put("Ual-Access-Timestamp", String.valueOf(currentTimeMillis));
            } catch (IllegalArgumentException e3) {
                throw new NoSuchElementException(e3.getMessage());
            }
        }
        return cVar;
    }

    public final String b(byte[] bArr, long j2, String str, int i2) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            String valueOf = String.valueOf(j2);
            Charset charset = i.t.a.a;
            if (valueOf != null) {
                byte[] bytes = valueOf.getBytes(charset);
                h.d(bytes, "(this as java.lang.String).getBytes(charset)");
                instance.update(bytes);
                if (str != null) {
                    byte[] bytes2 = str.getBytes(charset);
                    h.d(bytes2, "(this as java.lang.String).getBytes(charset)");
                    instance.update(bytes2);
                    String valueOf2 = String.valueOf(i2);
                    if (valueOf2 != null) {
                        byte[] bytes3 = valueOf2.getBytes(charset);
                        h.d(bytes3, "(this as java.lang.String).getBytes(charset)");
                        instance.update(bytes3);
                        String bigInteger = new BigInteger(1, instance.digest()).toString(16);
                        h.d(bigInteger, "{\n            val md5 = MessageDigest.getInstance(\"MD5\")\n            md5.update(body)\n            md5.update(\"$time\".toByteArray())\n            md5.update(token.toByteArray())\n            md5.update(\"$nonce\".toByteArray())\n            val digest = md5.digest()\n            //16是表示转换为16进制数\n            BigInteger(1, digest).toString(16)\n        }");
                        return bigInteger;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception e2) {
            a.info(h.j("sign by byte array exception=", e2.getMessage()));
            return "";
        }
    }
}
