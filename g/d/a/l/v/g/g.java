package g.d.a.l.v.g;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import g.d.a.f;
import g.d.a.l.r;
import g.d.a.l.t.b0.d;
import g.d.a.l.t.k;
import g.d.a.p.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class g {
    public final g.d.a.j.a a;
    public final Handler b;
    public final List<b> c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final g.d.a.g f2615d;

    /* renamed from: e  reason: collision with root package name */
    public final d f2616e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2617f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2618g;

    /* renamed from: h  reason: collision with root package name */
    public f<Bitmap> f2619h;

    /* renamed from: i  reason: collision with root package name */
    public a f2620i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2621j;

    /* renamed from: k  reason: collision with root package name */
    public a f2622k;

    /* renamed from: l  reason: collision with root package name */
    public Bitmap f2623l;

    /* renamed from: m  reason: collision with root package name */
    public r<Bitmap> f2624m;
    public a n;
    public int o;
    public int p;
    public int q;

    public static class a extends g.d.a.p.i.c<Bitmap> {

        /* renamed from: e  reason: collision with root package name */
        public final Handler f2625e;

        /* renamed from: f  reason: collision with root package name */
        public final int f2626f;

        /* renamed from: g  reason: collision with root package name */
        public final long f2627g;

        /* renamed from: h  reason: collision with root package name */
        public Bitmap f2628h;

        public a(Handler handler, int i2, long j2) {
            this.f2625e = handler;
            this.f2626f = i2;
            this.f2627g = j2;
        }

        public void c(Object obj, g.d.a.p.j.b bVar) {
            this.f2628h = (Bitmap) obj;
            this.f2625e.sendMessageAtTime(this.f2625e.obtainMessage(1, this), this.f2627g);
        }

        public void h(Drawable drawable) {
            this.f2628h = null;
        }
    }

    public interface b {
        void a();
    }

    public class c implements Handler.Callback {
        public c() {
        }

        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                g.this.b((a) message.obj);
                return true;
            } else if (i2 != 2) {
                return false;
            } else {
                g.this.f2615d.l((a) message.obj);
                return false;
            }
        }
    }

    public g(g.d.a.b bVar, g.d.a.j.a aVar, int i2, int i3, r<Bitmap> rVar, Bitmap bitmap) {
        d dVar = bVar.b;
        g.d.a.g e2 = g.d.a.b.e(bVar.f2317d.getBaseContext());
        g.d.a.g e3 = g.d.a.b.e(bVar.f2317d.getBaseContext());
        Objects.requireNonNull(e3);
        f<Bitmap> r = new f(e3.b, e3, Bitmap.class, e3.c).a(g.d.a.g.f2344m).a(((e) ((e) ((e) new e().d(k.b)).q(true)).n(true)).h(i2, i3));
        this.f2615d = e2;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.f2616e = dVar;
        this.b = handler;
        this.f2619h = r;
        this.a = aVar;
        c(rVar, bitmap);
    }

    public final void a() {
        if (this.f2617f && !this.f2618g) {
            a aVar = this.n;
            if (aVar != null) {
                this.n = null;
                b(aVar);
                return;
            }
            this.f2618g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.a.e());
            this.a.c();
            this.f2622k = new a(this.b, this.a.a(), uptimeMillis);
            f<Bitmap> r = this.f2619h.a((e) new e().m(new g.d.a.q.b(Double.valueOf(Math.random()))));
            r.T = this.a;
            r.X = true;
            r.u(this.f2622k, (g.d.a.p.d<Bitmap>) null, r, g.d.a.r.e.a);
        }
    }

    public void b(a aVar) {
        this.f2618g = false;
        if (this.f2621j) {
            this.b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f2617f) {
            this.n = aVar;
        } else {
            if (aVar.f2628h != null) {
                Bitmap bitmap = this.f2623l;
                if (bitmap != null) {
                    this.f2616e.e(bitmap);
                    this.f2623l = null;
                }
                a aVar2 = this.f2620i;
                this.f2620i = aVar;
                int size = this.c.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.c.get(size).a();
                }
                if (aVar2 != null) {
                    this.b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            a();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [g.d.a.l.r, java.lang.Object, g.d.a.l.r<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(g.d.a.l.r<android.graphics.Bitmap> r4, android.graphics.Bitmap r5) {
        /*
            r3 = this;
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r4, r0)
            r3.f2624m = r4
            java.util.Objects.requireNonNull(r5, r0)
            r3.f2623l = r5
            g.d.a.f<android.graphics.Bitmap> r0 = r3.f2619h
            g.d.a.p.e r1 = new g.d.a.p.e
            r1.<init>()
            r2 = 1
            g.d.a.p.a r4 = r1.o(r4, r2)
            g.d.a.f r4 = r0.a(r4)
            r3.f2619h = r4
            int r4 = g.d.a.r.j.d(r5)
            r3.o = r4
            int r4 = r5.getWidth()
            r3.p = r4
            int r4 = r5.getHeight()
            r3.q = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.l.v.g.g.c(g.d.a.l.r, android.graphics.Bitmap):void");
    }
}
