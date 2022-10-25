package m.b.a.a.b.h;

import java.io.IOException;
import java.net.Socket;
import java.util.Objects;
import m.b.a.a.b.d;
import m.b.a.a.b.g.c.b;
import m.b.a.a.b.g.c.f;

public class d implements b {
    public final m.b.a.a.b.d a;
    public e b;
    public Thread c;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            try {
                d.this.b.d();
            } catch (IOException e2) {
                Objects.requireNonNull((d.a) d.this.a);
                e2.printStackTrace();
            }
        }
    }

    public d(m.b.a.a.b.d dVar) {
        this.a = dVar;
    }

    public void a(b bVar, f fVar) throws IOException {
        e eVar = new e(new Socket(bVar.a("address", (String) null), bVar.c()), fVar);
        this.b = eVar;
        eVar.c();
        Thread thread = new Thread(new a());
        this.c = thread;
        thread.setName(d.class.getName());
        this.c.setDaemon(true);
        this.c.start();
    }

    public void b(boolean z) throws IOException {
        e eVar = this.b;
        if (eVar.f5255e && !eVar.b.isClosed()) {
            eVar.a(true, z);
        }
    }

    public void shutdown() throws Exception {
        this.b.b();
        this.c.join();
    }
}
