package g.i.b.e.h;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.raft.codegenmeta.utils.Constants;
import com.tencent.raft.measure.utils.MeasureConst;
import g.i.b.e.c;
import g.i.b.f.i.a;
import g.i.b.f.k.f.b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

public final class e {
    public static int a(int i2, int i3, int i4, int i5) {
        return ((i2 < i3 || i2 > i4) && i5 >= i3 && i5 <= i4) ? i5 : Math.min(Math.max(i2, i3), i4);
    }

    public static int b(b bVar, String str, String str2) {
        int i2;
        List<a> c = bVar.c();
        if (bVar.f4347g < 0) {
            return -2;
        }
        if (c == null || c.size() <= 0 || TextUtils.isEmpty(bVar.f4351k)) {
            return -3;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str3 = "";
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(str, str2), "r");
            Iterator<a> it = c.iterator();
            while (true) {
                i2 = 0;
                if (!it.hasNext()) {
                    break;
                }
                a next = it.next();
                long j2 = next.a;
                int i3 = next.b;
                byte[] bArr = new byte[i3];
                randomAccessFile.seek(j2);
                randomAccessFile.read(bArr, 0, i3);
                byteArrayOutputStream.write(bArr, 0, i3);
            }
            str3 = c.d(byteArrayOutputStream.toByteArray());
            if (TextUtils.isEmpty(str3)) {
                i2 = -5;
            } else if (str3.toLowerCase().equals(bVar.f4351k.toLowerCase())) {
                i2 = 1;
            }
            try {
                byteArrayOutputStream.close();
                randomAccessFile.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } catch (IOException e3) {
            i2 = -4;
            e3.printStackTrace();
        }
        b.c("hijack", "md5:" + str3 + " cost:" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms result:" + i2);
        return i2;
    }

    public static String c(long j2, String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j2);
            return simpleDateFormat.format(instance.getTime());
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String d(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (z) {
            try {
                if (str.length() > 30) {
                    str = str.substring(0, 30);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return "";
            }
        }
        return URLEncoder.encode(str, MeasureConst.CHARSET_UTF8);
    }

    public static boolean e(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean f(byte[] bArr) {
        return bArr == null || bArr.length <= 0;
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return URLEncoder.encode(str, MeasureConst.CHARSET_UTF8);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.contains(Constants.KEY_INDEX_FILE_SEPARATOR)) {
            return (str.charAt(0) == '[' && str.charAt(str.length() - 1) == ']') ? g.h.a.a.r(str.substring(1, str.length() - 1)) : g.h.a.a.r(str);
        }
        String[] split = str.split("\\.");
        if (split.length != 4) {
            return false;
        }
        int length = split.length;
        int i2 = 0;
        while (i2 < length) {
            try {
                int parseInt = Integer.parseInt(split[i2]);
                if (parseInt < 0 || parseInt > 255) {
                    return false;
                }
                i2++;
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
                return false;
            }
        }
        return true;
    }

    public static String i() {
        Context context = c.f4125g;
        if (context == null) {
            return null;
        }
        return context.getPackageName();
    }

    public static String j() {
        try {
            return c.c("" + System.currentTimeMillis() + ((int) (Math.random() * 2.147483647E9d)));
        } catch (Throwable th) {
            th.printStackTrace();
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            return sb.toString();
        }
    }
}
