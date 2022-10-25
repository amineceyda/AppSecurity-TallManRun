package com.ola.qsea.l;

import com.tencent.raft.measure.utils.MeasureConst;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Date;
import java.util.Random;

public class a {
    public static final Random a = new Random();

    public static String a() {
        StringBuilder n = g.a.a.a.a.n("_", com.ola.qsea.d.a.c(), "_");
        n.append(new Date().getTime());
        n.append("_");
        n.append(a.nextInt(2147473647) + 1000);
        return a(n.toString());
    }

    public static String a(String str) {
        String b = b(str);
        if (b == null) {
            return b;
        }
        try {
            return b.substring(8, 24);
        } catch (Exception e2) {
            com.ola.qsea.m.a.a((Throwable) e2);
            return b;
        }
    }

    public static void a(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public static String b(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes(Charset.forName(MeasureConst.CHARSET_UTF8)));
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                byte b2 = b & 255;
                if (b2 < 16) {
                    sb.append(0);
                }
                sb.append(Integer.toHexString(b2));
            }
            return sb.toString();
        } catch (Exception e2) {
            com.ola.qsea.m.a.a((Throwable) e2);
            return str;
        }
    }

    public static String c(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream2.read(bArr);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString(MeasureConst.CHARSET_UTF8);
                        a(fileInputStream2);
                        a(byteArrayOutputStream);
                        return byteArrayOutputStream2;
                    }
                }
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                try {
                    com.ola.qsea.m.a.b("Read file %s failed.", str);
                    a(fileInputStream);
                    a(byteArrayOutputStream);
                    return "";
                } catch (Throwable th) {
                    th = th;
                    a(fileInputStream);
                    a(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                a(fileInputStream);
                a(byteArrayOutputStream);
                throw th;
            }
        } catch (Exception unused2) {
            com.ola.qsea.m.a.b("Read file %s failed.", str);
            a(fileInputStream);
            a(byteArrayOutputStream);
            return "";
        }
    }
}
