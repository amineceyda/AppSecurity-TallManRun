package e.n;

import java.io.File;
import java.io.FileFilter;

public class b implements FileFilter {
    public b(c cVar) {
    }

    public boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}
