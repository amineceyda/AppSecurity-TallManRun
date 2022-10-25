package m.b.a.a.b.h;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.Objects;
import m.b.a.a.b.d;
import m.b.a.a.b.g.c.b;
import org.slf4j.Marker;

public class f implements b {
    public e a;
    public final d b;
    public ServerSocket c;

    /* renamed from: d  reason: collision with root package name */
    public Thread f5256d;

    public class a implements Runnable {
        public final /* synthetic */ m.b.a.a.b.g.c.f b;

        public a(m.b.a.a.b.g.c.f fVar) {
            this.b = fVar;
        }

        public void run() {
            while (!f.this.c.isClosed()) {
                try {
                    synchronized (f.this.c) {
                        f fVar = f.this;
                        fVar.a = new e(fVar.c.accept(), this.b);
                    }
                    f.this.a.c();
                    f.this.a.d();
                } catch (IOException e2) {
                    if (!f.this.c.isClosed()) {
                        Objects.requireNonNull((d.a) f.this.b);
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    public f(d dVar) {
        this.b = dVar;
    }

    public void a(b bVar, m.b.a.a.b.g.c.f fVar) throws IOException {
        InetAddress inetAddress = null;
        String a2 = bVar.a("address", (String) null);
        if (!Marker.ANY_MARKER.equals(a2)) {
            inetAddress = InetAddress.getByName(a2);
        }
        this.c = new ServerSocket(bVar.c(), 1, inetAddress);
        Thread thread = new Thread(new a(fVar));
        this.f5256d = thread;
        thread.setName(f.class.getName());
        this.f5256d.setDaemon(true);
        this.f5256d.start();
    }

    public void b(boolean z) throws IOException {
        e eVar = this.a;
        if (eVar != null && eVar.f5255e && !eVar.b.isClosed()) {
            eVar.a(true, z);
        }
    }

    public void shutdown() throws Exception {
        this.c.close();
        synchronized (this.c) {
            e eVar = this.a;
            if (eVar != null) {
                eVar.b();
            }
        }
        this.f5256d.join();
    }
}
