package m.b.a.a.b.h;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import m.b.a.a.b.g.c.c;
import m.b.a.a.b.g.c.d;
import m.b.a.a.b.g.c.f;

public class e implements c {
    public final f a;
    public final Socket b;
    public m.b.a.a.b.g.c.e c;

    /* renamed from: d  reason: collision with root package name */
    public d f5254d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5255e = false;

    public e(Socket socket, f fVar) {
        this.b = socket;
        this.a = fVar;
    }

    public void a(boolean z, boolean z2) throws IOException {
        if (z) {
            f fVar = this.a;
            m.b.a.a.b.g.c.e eVar = this.c;
            fVar.a(eVar, eVar, z2);
        } else if (z2) {
            this.a.c();
        }
        this.c.a.writeByte(32);
    }

    public void b() throws IOException {
        if (!this.b.isClosed()) {
            this.b.close();
        }
    }

    public void c() throws IOException {
        this.c = new m.b.a.a.b.g.c.e(this.b.getOutputStream());
        d dVar = new d(this.b.getInputStream());
        this.f5254d = dVar;
        dVar.c = this;
        this.f5255e = true;
    }

    public void d() throws IOException {
        do {
            try {
            } catch (SocketException e2) {
                if (!this.b.isClosed()) {
                    throw e2;
                }
            } catch (Throwable th) {
                b();
                throw th;
            }
        } while (this.f5254d.a());
        b();
    }
}
