package g.i.b.e;

import android.content.Context;
import android.os.Handler;
import com.tencent.raft.codegenmeta.utils.Constants;
import com.tencent.raft.measure.config.RAFTComConfig;
import g.i.b.e.h.e;

public final class c {
    public static String a = "null";
    public static String b = "";
    public static int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static String f4122d = "";

    /* renamed from: e  reason: collision with root package name */
    public static String f4123e = "";

    /* renamed from: f  reason: collision with root package name */
    public static int f4124f = -1;

    /* renamed from: g  reason: collision with root package name */
    public static Context f4125g = null;

    /* renamed from: h  reason: collision with root package name */
    public static int f4126h = 0;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f4127i = false;

    /* renamed from: j  reason: collision with root package name */
    public static String f4128j = "";

    /* renamed from: k  reason: collision with root package name */
    public static String f4129k = "0.1.1";

    /* renamed from: l  reason: collision with root package name */
    public static Handler f4130l = null;

    /* renamed from: m  reason: collision with root package name */
    public static String f4131m = "";
    public static Handler n = null;
    public static boolean o = false;
    public static final RAFTComConfig p = new RAFTComConfig("QDDownloader", "0.1.1");

    public static String a() {
        if (!e.e("") || e.e(f4131m) || !f4131m.contains(Constants.KEY_INDEX_FILE_SEPARATOR)) {
            return "";
        }
        return f4131m.substring(f4131m.indexOf(Constants.KEY_INDEX_FILE_SEPARATOR) + 1);
    }
}
