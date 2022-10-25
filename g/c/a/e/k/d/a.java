package g.c.a.e.k.d;

import android.os.Environment;
import android.os.StatFs;
import java.io.File;

public class a {
    public static volatile Boolean a;
    public static volatile String b;

    public static long a() {
        File dataDirectory = Environment.getDataDirectory();
        if (!dataDirectory.exists()) {
            return -1;
        }
        StatFs statFs = new StatFs(dataDirectory.getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    public static boolean b() {
        if (a == null) {
            try {
                Class<?> cls = Class.forName("com.huawei.system.BuildEx");
                a = Boolean.valueOf("harmony".equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0])));
                return a.booleanValue();
            } catch (Exception e2) {
                e2.printStackTrace();
                a = Boolean.FALSE;
            }
        }
        return a.booleanValue();
    }
}
