package g.c.b.b.l;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import i.o.c.h;
import java.io.File;

public final class d {
    public static final File a(File file) {
        if (!d(file)) {
            file.mkdirs();
        }
        if (d(file)) {
            return file;
        }
        return null;
    }

    public static final boolean b(File file) {
        int i2 = 0;
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (!(listFiles.length == 0)) {
                    int length = listFiles.length;
                    while (i2 < length) {
                        File file2 = listFiles[i2];
                        i2++;
                        h.d(file2, "f");
                        b(file2);
                    }
                    return file.delete();
                }
            }
        } else if (file.exists()) {
            return file.delete();
        }
        return false;
    }

    public static final void c(String str, Context context) {
        File e2;
        h.e(str, "packageName");
        h.e(context, "ctx");
        if (!TextUtils.isEmpty(str) && (e2 = e(context, str)) != null) {
            b(e2);
        }
    }

    public static final boolean d(File file) {
        return file.exists();
    }

    public static final File e(Context context, String str) {
        h.e(context, "ctx");
        h.e(str, "packName");
        File a = h.a(Environment.getExternalStorageState(), "mounted") ? a(new File(context.getExternalFilesDir((String) null), "Installer")) : null;
        if (a != null) {
            return a(new File(a, str));
        }
        return null;
    }
}
