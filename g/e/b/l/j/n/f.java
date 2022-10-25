package g.e.b.l.j.n;

import android.content.Context;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class f {
    public final File a;
    public final File b;
    public final File c;

    /* renamed from: d  reason: collision with root package name */
    public final File f3691d;

    /* renamed from: e  reason: collision with root package name */
    public final File f3692e;

    public f(Context context) {
        File file = new File(context.getFilesDir(), ".com.google.firebase.crashlytics.files.v1");
        g(file);
        this.a = file;
        File file2 = new File(file, "open-sessions");
        g(file2);
        this.b = file2;
        File file3 = new File(file, "reports");
        g(file3);
        this.c = file3;
        File file4 = new File(file, "priority-reports");
        g(file4);
        this.f3691d = file4;
        File file5 = new File(file, "native-reports");
        g(file5);
        this.f3692e = file5;
    }

    public static synchronized File g(File file) {
        synchronized (f.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                g.e.b.l.j.f fVar = g.e.b.l.j.f.a;
                fVar.b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (file.mkdirs()) {
                return file;
            }
            throw new IllegalStateException("Could not create Crashlytics-specific directory: " + file);
        }
    }

    public static boolean h(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File h2 : listFiles) {
                h(h2);
            }
        }
        return file.delete();
    }

    public static <T> List<T> i(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    public File a(String str) {
        return new File(this.a, str);
    }

    public List<File> b() {
        return i(this.f3692e.listFiles());
    }

    public List<File> c() {
        return i(this.f3691d.listFiles());
    }

    public List<File> d() {
        return i(this.c.listFiles());
    }

    public final File e(String str) {
        File file = new File(this.b, str);
        file.mkdirs();
        return file;
    }

    public File f(String str, String str2) {
        return new File(e(str), str2);
    }
}
