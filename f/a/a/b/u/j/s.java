package f.a.a.b.u.j;

import java.io.File;
import java.util.List;
import java.util.regex.Pattern;

public class s extends q {
    public Pattern b;

    public s(String str) {
        super(str);
        this.b = Pattern.compile(str);
    }

    public List<File> a(f fVar) {
        return b(fVar, ".");
    }

    public boolean c(File file) {
        return this.b.matcher(file.getName()).find();
    }
}
