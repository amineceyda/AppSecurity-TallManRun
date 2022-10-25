package g.i.b.e.e;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import g.h.a.a;
import g.i.b.e.b.e;
import g.i.b.e.c;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Set;

public class d extends a {
    public static volatile d s;

    public static String c(String str, boolean z, Map<String, String> map) {
        Set<String> keySet;
        int i2 = e.f4112g;
        String str2 = "wifi";
        String str3 = i2 != 1 ? (i2 == 2 || i2 == 3 || i2 == 4) ? e.f4110e : "null" : str2;
        map.put("A23", c.f4123e);
        f fVar = new f();
        fVar.b(String.valueOf(str));
        fVar.a = System.currentTimeMillis();
        fVar.b = c.a;
        fVar.c = str3;
        if (!TextUtils.isEmpty(c.f4122d)) {
            map.put("A1", c.f4122d);
        }
        String str4 = "";
        map.put("A2", str4);
        map.put("A4", str4);
        map.put("A6", str4);
        map.put("A7", str4);
        map.put("A23", c.f4123e);
        String str5 = "unknown";
        if (e.f4113h != -1) {
            switch (e.f4113h) {
                case 0:
                    break;
                case 1:
                    str2 = "GPRS";
                    break;
                case 2:
                    str2 = "EDGE";
                    break;
                case 3:
                    str2 = "UMTS";
                    break;
                case 4:
                    str2 = "CDMA";
                    break;
                case 5:
                    str2 = "EVDO_0";
                    break;
                case 6:
                    str2 = "EVDO_A";
                    break;
                case 7:
                    str2 = "1xRTT";
                    break;
                case 8:
                    str2 = "HSDPA";
                    break;
                case 9:
                    str2 = "HSUPA";
                    break;
                case 10:
                    str2 = "HSPA";
                    break;
                case 11:
                    str2 = "iDen";
                    break;
                case 12:
                    str2 = "EVDO_B";
                    break;
                case ConnectionResult.CANCELED:
                    str2 = "LTE";
                    break;
                case ConnectionResult.TIMEOUT:
                    str2 = "EHRPD";
                    break;
                case ConnectionResult.INTERRUPTED:
                    str2 = "HSPAP";
                    break;
                default:
                    str2 = str5;
                    break;
            }
            str5 = str2;
        }
        map.put("A33", str5);
        map.put("A10", c.f4177d);
        map.put("A9", c.c);
        map.put("A19", str3);
        fVar.c(map);
        StringBuilder sb = new StringBuilder();
        sb.append(g.i.b.e.h.e.c(System.currentTimeMillis(), "yyyy-MM-dd HH:mm:ss.SSS") + "|");
        sb.append("INFO|");
        sb.append(a.a + "|");
        sb.append(c.b + "|");
        sb.append("beacon|");
        sb.append("1.8.1|");
        String str6 = fVar.b;
        try {
            str6 = URLEncoder.encode(str6, "utf-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        sb.append(str6 + "|");
        sb.append("|");
        sb.append("upload_ip|");
        sb.append("|");
        sb.append(fVar.c + "|");
        sb.append(fVar.a() + "|");
        sb.append(z + "|");
        sb.append(fVar.f4179e + "|");
        sb.append(fVar.f4178d + "|");
        Map<String, String> d2 = fVar.d();
        if (!(d2 == null || (keySet = d2.keySet()) == null)) {
            StringBuilder sb2 = new StringBuilder();
            for (String next : keySet) {
                sb2.append("&");
                sb2.append(next);
                sb2.append("=");
                sb2.append(d2.get(next));
            }
            str4 = sb2.substring(1);
            sb2.setLength(0);
        }
        sb.append(str4 + "|");
        sb.append(g.i.b.e.h.e.c(fVar.a, "yyyy-MM-dd HH:mm:ss") + "|");
        sb.append("upload_time");
        return sb.toString();
    }
}
