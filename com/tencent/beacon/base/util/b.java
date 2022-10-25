package com.tencent.beacon.base.util;

import android.content.SharedPreferences;
import android.text.format.Time;
import com.tencent.beacon.a.b.g;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.base.net.b.a;
import com.tencent.beacon.base.net.b.c;
import com.tencent.raft.measure.utils.MeasureConst;
import com.tencent.raft.raftframework.remote.RemoteProxyUtil;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class b {
    private static final Random a = new Random();
    private static final AtomicInteger b = new AtomicInteger(0);
    private static final SimpleDateFormat c = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    public static int a(String str, int i2, int i3, int i4) {
        int i5;
        if (str == null) {
            return i2;
        }
        try {
            i5 = Integer.parseInt(str);
        } catch (Exception e2) {
            c.a((Throwable) e2);
            i5 = i2;
        }
        return (i5 < i3 || i5 > i4) ? i2 : i5;
    }

    public static long a(String str, long j2, long j3, long j4) {
        long j5;
        if (str == null) {
            return j2;
        }
        try {
            j5 = Long.parseLong(str);
        } catch (Exception e2) {
            c.a((Throwable) e2);
            j5 = j2;
        }
        return (j5 < j3 || j5 > j4) ? j2 : j5;
    }

    public static Object a(byte[] bArr) {
        Throwable th;
        ObjectInputStream objectInputStream;
        if (bArr == null) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                Object readObject = objectInputStream.readObject();
                a(objectInputStream);
                a(byteArrayInputStream);
                return readObject;
            } catch (Throwable th2) {
                th = th2;
                try {
                    c.a(th);
                    c.b(th.getMessage(), new Object[0]);
                    return null;
                } finally {
                    a(objectInputStream);
                    a(byteArrayInputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            objectInputStream = null;
            c.a(th);
            c.b(th.getMessage(), new Object[0]);
            return null;
        }
    }

    public static String a() {
        return a(16);
    }

    private static String a(int i2) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < i2; i3++) {
            stringBuffer.append("abcdef0123456789".charAt(random.nextInt(16)));
        }
        return stringBuffer.toString();
    }

    public static String a(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String replace = (th.getMessage() + "\n" + stringWriter.getBuffer().toString()).replace("\t", " ").replace("\n", " ").replace(RemoteProxyUtil.SPLIT_CHAR, "-");
        return replace.length() > 10240 ? replace.substring(0, 10240) : replace;
    }

    public static ArrayList<String> a(String[] strArr) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Process exec = Runtime.getRuntime().exec(strArr);
            bufferedReader2 = new BufferedReader(new InputStreamReader(exec.getInputStream(), Charset.forName(MeasureConst.CHARSET_UTF8)));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    arrayList.add(readLine);
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = null;
                    try {
                        c.a(th);
                        return null;
                    } finally {
                        a(bufferedReader2);
                        a(bufferedReader);
                    }
                }
            }
            bufferedReader = new BufferedReader(new InputStreamReader(exec.getErrorStream(), Charset.forName(MeasureConst.CHARSET_UTF8)));
            while (true) {
                try {
                    String readLine2 = bufferedReader.readLine();
                    if (readLine2 != null) {
                        arrayList.add(readLine2);
                    } else {
                        a(bufferedReader2);
                        a(bufferedReader);
                        return arrayList;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c.a(th);
                    return null;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader2 = null;
            bufferedReader = bufferedReader2;
            c.a(th);
            return null;
        }
    }

    public static HashSet<String> a(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        HashSet<String> hashSet = new HashSet<>(arrayList.size());
        hashSet.addAll(arrayList);
        return hashSet;
    }

    public static void a(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Exception e2) {
                    c.a((Throwable) e2);
                }
            }
        }
    }

    public static boolean a(long j2, long j3) {
        Time time = new Time();
        time.set(j2);
        int i2 = time.year;
        int i3 = time.month;
        int i4 = time.monthDay;
        time.set(j3);
        return i2 == time.year && i3 == time.month && i4 == time.monthDay;
    }

    public static boolean a(SharedPreferences.Editor editor) {
        if (editor != null) {
            return true;
        }
        c.b("BeaconProperties editor is null!", new Object[0]);
        return false;
    }

    public static boolean a(String str) {
        return str.startsWith("rqd_");
    }

    public static boolean a(String str, boolean z) {
        if (str == null) {
            return z;
        }
        if (str.toLowerCase().equals("y")) {
            return true;
        }
        if (str.toLowerCase().equals("n")) {
            return false;
        }
        return z;
    }

    public static byte[] a(Object obj) {
        ObjectOutputStream objectOutputStream;
        if (!(obj instanceof Serializable)) {
            c.b("not serial obj ", new Object[0]);
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(obj);
                objectOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                a(objectOutputStream);
                a(byteArrayOutputStream);
                return byteArray;
            } catch (Throwable th) {
                th = th;
                try {
                    c.a(th);
                    c.b(th.getMessage(), new Object[0]);
                    return null;
                } finally {
                    a(objectOutputStream);
                    a(byteArrayOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream = null;
            c.a(th);
            c.b(th.getMessage(), new Object[0]);
            return null;
        }
    }

    public static byte[] a(byte[] bArr, int i2) {
        if (bArr == null || i2 == -1) {
            return bArr;
        }
        c.a("unzp: %s len: %s", Integer.valueOf(i2), Integer.valueOf(bArr.length));
        try {
            return a.b(i2, bArr);
        } catch (Throwable th) {
            g e2 = g.e();
            StringBuilder i3 = g.a.a.a.a.i("unzipData length: ");
            i3.append(bArr.length);
            i3.append(",type:");
            i3.append(i2);
            e2.a("509", i3.toString(), th);
            c.a(th);
            c.b("err unzp}" + th.toString(), new Object[0]);
            return null;
        }
    }

    public static byte[] a(byte[] bArr, int i2, int i3, String str) {
        try {
            return a(b(bArr, i3, str), i2);
        } catch (Exception e2) {
            c.a((Throwable) e2);
            return null;
        }
    }

    public static byte[] a(byte[] bArr, int i2, String str) {
        if (bArr == null || i2 == -1) {
            return bArr;
        }
        c.a("CoreUtils", "encry data length:%d type: %d", Integer.valueOf(bArr.length), Integer.valueOf(i2));
        try {
            return c.b(i2, str, bArr);
        } catch (Throwable th) {
            c.a(th);
            g e2 = g.e();
            StringBuilder i3 = g.a.a.a.a.i("data length: ");
            i3.append(bArr.length);
            i3.append(",type:");
            i3.append(i2);
            i3.append(",key: ");
            i3.append(str);
            e2.a("507", i3.toString(), th);
            return null;
        }
    }

    public static String b() {
        com.tencent.beacon.a.c.c d2 = com.tencent.beacon.a.c.c.d();
        String f2 = d2 != null ? d2.f() : "";
        String d3 = e.l().d();
        return b(f2 + "_" + d3 + "_" + new Date().getTime() + "_" + (a.nextInt(2147473647) + 1000));
    }

    public static String b(String str) {
        String c2 = c(str);
        if (c2 == null) {
            return c2;
        }
        try {
            return c2.substring(8, 24);
        } catch (Exception e2) {
            c.a((Throwable) e2);
            return c2;
        }
    }

    public static byte[] b(byte[] bArr, int i2) {
        if (bArr == null || i2 == -1) {
            return bArr;
        }
        c.a("zp: %s len: %s", Integer.valueOf(i2), Integer.valueOf(bArr.length));
        try {
            return a.a(i2, bArr);
        } catch (Throwable th) {
            g e2 = g.e();
            StringBuilder i3 = g.a.a.a.a.i("zipData length: ");
            i3.append(bArr.length);
            i3.append(",type:");
            i3.append(i2);
            e2.a("509", i3.toString(), th);
            c.a(th);
            c.b("err zp : %s", th.toString());
            return null;
        }
    }

    public static byte[] b(byte[] bArr, int i2, int i3, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return a(b(bArr, i2), i3, str);
        } catch (Throwable th) {
            c.a(th);
            return null;
        }
    }

    public static byte[] b(byte[] bArr, int i2, String str) {
        if (bArr == null || bArr.length <= 0 || i2 == -1) {
            return bArr;
        }
        try {
            return c.a(i2, str, bArr);
        } catch (Throwable th) {
            StringBuilder i3 = g.a.a.a.a.i("data length: ");
            i3.append(bArr.length);
            i3.append(",type:");
            i3.append(i2);
            i3.append(",key: ");
            i3.append(str);
            i3.append(",error: ");
            i3.append(th.getMessage());
            c.e(i3.toString(), new Object[0]);
            g e2 = g.e();
            StringBuilder i4 = g.a.a.a.a.i("data length: ");
            i4.append(bArr.length);
            i4.append(",type:");
            i4.append(i2);
            i4.append(",key: ");
            i4.append(str);
            e2.a("508", i4.toString(), th);
            return null;
        }
    }

    public static long c() {
        return com.tencent.beacon.a.c.c.d().k() + new Date().getTime();
    }

    public static String c(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes(Charset.forName(MeasureConst.CHARSET_UTF8)));
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                byte b3 = b2 & 255;
                if (b3 < 16) {
                    sb.append(0);
                }
                sb.append(Integer.toHexString(b3));
            }
            return sb.toString();
        } catch (Exception e2) {
            c.a((Throwable) e2);
            return str;
        }
    }

    public static String d() {
        try {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date());
        } catch (Throwable th) {
            c.a(th);
            return "";
        }
    }

    public static Date d(String str) {
        if (str != null && str.trim().length() > 0) {
            try {
                return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).parse(str);
            } catch (ParseException e2) {
                c.a((Throwable) e2);
            }
        }
        return null;
    }
}
