package g.d.a.l.v.c;

import android.graphics.Bitmap;
import g.d.a.l.n;
import g.d.a.l.p;
import g.d.a.l.t.b0.b;
import g.d.a.l.t.v;
import g.d.a.l.v.c.l;
import g.d.a.r.d;
import g.d.a.r.h;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Queue;

public class x implements p<InputStream, Bitmap> {
    public final l a;
    public final b b;

    public static class a implements l.b {
        public final v a;
        public final d b;

        public a(v vVar, d dVar) {
            this.a = vVar;
            this.b = dVar;
        }

        public void a(g.d.a.l.t.b0.d dVar, Bitmap bitmap) throws IOException {
            IOException iOException = this.b.c;
            if (iOException != null) {
                if (bitmap != null) {
                    dVar.e(bitmap);
                }
                throw iOException;
            }
        }

        public void b() {
            v vVar = this.a;
            synchronized (vVar) {
                vVar.f2598d = vVar.b.length;
            }
        }
    }

    public x(l lVar, b bVar) {
        this.a = lVar;
        this.b = bVar;
    }

    public v a(Object obj, int i2, int i3, n nVar) throws IOException {
        v vVar;
        boolean z;
        d poll;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof v) {
            vVar = (v) inputStream;
            z = false;
        } else {
            vVar = new v(inputStream, this.b);
            z = true;
        }
        Queue<d> queue = d.f2679d;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new d();
        }
        poll.b = vVar;
        try {
            return this.a.b(new h(poll), i2, i3, nVar, new a(vVar, poll));
        } finally {
            poll.a();
            if (z) {
                vVar.b();
            }
        }
    }

    public boolean b(Object obj, n nVar) throws IOException {
        InputStream inputStream = (InputStream) obj;
        Objects.requireNonNull(this.a);
        return true;
    }
}
