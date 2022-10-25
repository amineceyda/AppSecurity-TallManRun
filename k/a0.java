package k;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import k.h0.c;
import l.f;
import l.q;
import l.s;
import l.y;
import l.z;

public class a0 extends b0 {
    public final /* synthetic */ t a;
    public final /* synthetic */ File b;

    public a0(t tVar, File file) {
        this.a = tVar;
        this.b = file;
    }

    public long a() {
        return this.b.length();
    }

    @Nullable
    public t b() {
        return this.a;
    }

    public void e(f fVar) throws IOException {
        y yVar = null;
        try {
            File file = this.b;
            Logger logger = q.a;
            if (file != null) {
                yVar = q.c(new FileInputStream(file), new z());
                ((s) fVar).d(yVar);
                return;
            }
            throw new IllegalArgumentException("file == null");
        } finally {
            c.f(yVar);
        }
    }
}
