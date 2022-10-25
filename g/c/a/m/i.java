package g.c.a.m;

import g.a.a.a.a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class i {
    public static final String[] a = {"yyyy-MM-dd'T'HH:mm:ss'Z'", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "yyyy-MM-dd'T'HH:mm:ss.SS'Z'", "yyyy-MM-dd'T'HH:mm:ss.S'Z'", "EEE yyyy-MM-dd HH:mm:ss.SSS zzz", "yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSSZZ", "yyyy-MM-dd'T'HH:mm:ss.SSSz", "yyyy-MM-dd'T'HH:mm:ssz", "yyyy-MM-dd'T'HH:mm:ssZ", "EEE MMM d HH:mm:ss z yyyy", "EEE MMM d HH:mm:ss Z yyyy", "EEE MMM d HH:mm:ss z yyyy", "EEE MMM d HH:mm:ss.SSS z yyyy", "EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "yyyy-MM-dd HH:mm:ss Z", "yyyy-MM-dd HH:mm:ss ZZ", "yyyy-MM-dd HH:mm:ss z", "yyyy-MM-dd HH:mm:ss.SSS Z", "yyyy-MM-dd HH:mm:ss.SSS ZZ", "yyyy-MM-dd HH:mm:ss.SSS z", "yyyy-MM-dd HH:mm:ss zzz", "yyyy-MM-dd'T'HH:mm:ss'GMT'Z", "yyyy-MM-dd'T'HH:mm:ss.SSS'GMT'Z", "yyyy-MM-dd'T'HH:mm:ss'UTC'Z", "yyyy-MM-dd'T'HH:mm:ss.SSS'UTC'Z", "yyyy-MM-dd HH:mm:ss 'UTC'Z", "yyyy-MM-dd HH:mm:ss.SSS 'UTC'Z", "yyyy-MM-dd HH:mm:ss 'GMT'Z", "yyyy-MM-dd HH:mm:ss.SSS 'GMT'Z", "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd", "yyyy-MM-dd hh:mm:ss", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss.SSS", "EEE MMM d HH:mm:ss yyyy", "EEE MMM d HH:mm:ss.SSS yyyy"};

    static {
        new ThreadLocal();
    }

    public static String a(int i2) {
        return i2 == 0 ? "00" : i2 / 10 == 0 ? a.q("0", i2) : String.valueOf(i2);
    }

    public static Date b(String str) {
        String[] strArr = a;
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(strArr[i2], Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            try {
                return simpleDateFormat.parse(str);
            } catch (Exception unused) {
                i2++;
            }
        }
        return null;
    }
}
