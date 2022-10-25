package g.e.a.b.e.c;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public final class b5 {
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f2898d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicBoolean f2899e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    public static HashMap f2900f;

    /* renamed from: g  reason: collision with root package name */
    public static final HashMap f2901g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public static final HashMap f2902h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public static final HashMap f2903i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    public static final HashMap f2904j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    public static Object f2905k;

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f2906l = new String[0];

    public static void a(Object obj, String str, String str2) {
        synchronized (b5.class) {
            if (obj == f2905k) {
                f2900f.put(str, str2);
            }
        }
    }
}
