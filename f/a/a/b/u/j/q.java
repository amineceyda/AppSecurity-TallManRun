package f.a.a.b.u.j;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class q {
    public String a;

    public q(String str) {
        this.a = str;
    }

    public abstract List<File> a(f fVar);

    public List<File> b(f fVar, String str) {
        File absoluteFile = new File(str).getAbsoluteFile();
        Objects.requireNonNull(fVar);
        File[] listFiles = absoluteFile.listFiles((FilenameFilter) null);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        return Arrays.asList(listFiles);
    }

    public abstract boolean c(File file);
}
