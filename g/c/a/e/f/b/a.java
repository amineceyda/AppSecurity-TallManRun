package g.c.a.e.f.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Collections;
import java.util.Objects;
import k.q;

public class a {
    public static String a;
    public static final Object b = new Object();

    public static int a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return -1;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1) {
            return 1;
        }
        return type == 0 ? 2 : 0;
    }

    public static String b() {
        String str;
        if (a == null) {
            synchronized (b) {
                if (a == null) {
                    String property = System.getProperty("http.agent");
                    if (property != null) {
                        if (!property.isEmpty()) {
                            String str2 = "APKPure/1.01.10 (UltraDownload-1.2.0.20); " + property;
                            try {
                                Collections.emptyMap();
                                q.a aVar = new q.a();
                                Objects.requireNonNull(aVar);
                                q.a("User-Agent");
                                q.b(str2, "User-Agent");
                                aVar.c("User-Agent");
                                aVar.a.add("User-Agent");
                                aVar.a.add(str2.trim());
                                a = str2;
                            } catch (Exception unused) {
                                str = "APKPure/1.01.10 (UltraDownload-1.2.0.20)";
                            }
                        }
                    }
                    str = "APKPure/1.01.10 (UltraDownload-1.2.0.20)";
                    a = str;
                }
            }
        }
        return a;
    }

    public static boolean c(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
