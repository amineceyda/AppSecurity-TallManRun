package f.a.a.b.z;

import f.a.a.b.w.d;
import java.io.File;

public class l extends d {
    public l(f.a.a.b.d dVar) {
        g(dVar);
    }

    public static boolean s(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return true;
        }
        parentFile.mkdirs();
        return parentFile.exists();
    }
}
