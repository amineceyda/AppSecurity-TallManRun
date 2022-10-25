package m.b.a.a.b.h;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import m.b.a.a.b.g.a.c;
import m.b.a.a.b.g.c.b;
import m.b.a.a.b.g.c.f;

public class a implements b {
    public f a;
    public File b;
    public boolean c;

    public final void a(b bVar, f fVar) throws IOException {
        this.a = fVar;
        this.b = new File(bVar.a("destfile", "jacoco.exec")).getAbsoluteFile();
        this.c = bVar.b("append", true);
        File parentFile = this.b.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(this.b, this.c);
        fileOutputStream.getChannel().lock();
        fileOutputStream.close();
    }

    public void b(boolean z) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(this.b, this.c);
        fileOutputStream.getChannel().lock();
        try {
            c cVar = new c(fileOutputStream);
            this.a.a(cVar, cVar, z);
        } finally {
            fileOutputStream.close();
        }
    }

    public void shutdown() throws IOException {
    }
}
