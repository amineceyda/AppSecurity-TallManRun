package g.c.b.a.h;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import g.c.b.a.d;
import g.c.b.a.j.b;
import g.c.b.a.j.g;
import i.c;
import i.o.c.f;
import i.o.c.h;
import i.o.c.i;
import java.io.IOException;
import java.util.ArrayList;

public final class e implements g.c.b.a.j.b, Runnable {

    /* renamed from: d  reason: collision with root package name */
    public static final b f2218d = new b((f) null);

    /* renamed from: e  reason: collision with root package name */
    public static final c<Handler> f2219e = g.c.b.b.f.U(a.b);
    public final g.c.b.a.e b;
    public g.c.b.a.c c;

    public static final class a extends i implements i.o.b.a<Handler> {
        public static final a b = new a();

        public a() {
            super(0);
        }

        public Object a() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public static final class b {
        public b(f fVar) {
        }
    }

    public e(g.c.b.a.e eVar, g.c.b.a.c cVar) {
        h.e(eVar, "client");
        h.e(cVar, "request");
        this.b = eVar;
        this.c = cVar;
    }

    public void a(b.a aVar, d<Object> dVar) {
        h.e(dVar, "response");
        String str = "End of request， code[" + dVar.c + "] message[" + dVar.f2205d + ']';
        h.e("RealCall", "tag");
        h.e(str, "message");
        g gVar = g.c.b.a.l.c.b;
        String j2 = h.j("ClientChannel|", "RealCall");
        if (gVar != null) {
            gVar.i(j2, str);
        } else {
            Log.i(j2, str);
        }
        f2219e.getValue().post(new a(dVar, this));
    }

    public void b(b.a aVar) {
        h.e(aVar, "nextChain");
        try {
            h.e("RealCall", "tag");
            h.e("start request.", "message");
            g gVar = g.c.b.a.l.c.b;
            if (gVar != null) {
                gVar.d(h.j("ClientChannel|", "RealCall"), "start request.");
            } else {
                Log.d(h.j("ClientChannel|", "RealCall"), "start request.");
            }
            f2219e.getValue().post(new b(this));
            ((f) aVar).d(((f) aVar).f2220d);
        } catch (IOException e2) {
            StringBuilder i2 = g.a.a.a.a.i("start chain proceed error, [");
            String message = e2.getMessage();
            if (message == null) {
                message = "unknown exception";
            }
            i2.append(message);
            i2.append(']');
            String sb = i2.toString();
            h.e("RealCall", "tag");
            h.e(sb, "message");
            g gVar2 = g.c.b.a.l.c.b;
            String j2 = h.j("ClientChannel|", "RealCall");
            if (gVar2 != null) {
                gVar2.e(j2, sb);
            } else {
                Log.e(j2, sb);
            }
            f2219e.getValue().post(new c(this, e2));
        }
    }

    public final void c() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        arrayList.add(new g.c.b.a.i.a());
        arrayList.add(new g.c.b.a.k.b());
        arrayList.add(new g.c.b.a.f.a());
        arrayList.add(new g.c.b.a.g.b());
        try {
            new f(this, arrayList, 0, this.c, (b.a) null).d(this.c);
        } catch (IOException e2) {
            throw e2;
        }
    }

    public void run() {
        try {
            c();
        } catch (IOException e2) {
            StringBuilder i2 = g.a.a.a.a.i("get response with interceptor chain error, [");
            String message = e2.getMessage();
            if (message == null) {
                message = "unknown exception";
            }
            i2.append(message);
            i2.append(']');
            String sb = i2.toString();
            h.e("RealCall", "tag");
            h.e(sb, "message");
            g gVar = g.c.b.a.l.c.b;
            String j2 = h.j("ClientChannel|", "RealCall");
            if (gVar != null) {
                gVar.e(j2, sb);
            } else {
                Log.e(j2, sb);
            }
            f2219e.getValue().post(new d(this, e2));
        }
    }
}
