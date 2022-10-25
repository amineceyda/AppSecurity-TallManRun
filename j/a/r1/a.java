package j.a.r1;

import android.os.Handler;
import android.os.Looper;
import i.j;
import i.o.b.l;
import i.o.c.h;
import i.o.c.i;
import j.a.c0;
import j.a.f;
import j.a.f1;
import j.a.g;

public final class a extends b implements c0 {
    public volatile a _immediate;
    public final a c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f4619d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4620e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4621f;

    /* renamed from: j.a.r1.a$a  reason: collision with other inner class name */
    public static final class C0194a implements Runnable {
        public final /* synthetic */ a b;
        public final /* synthetic */ f c;

        public C0194a(a aVar, f fVar) {
            this.b = aVar;
            this.c = fVar;
        }

        public final void run() {
            this.c.e(this.b, j.a);
        }
    }

    public static final class b extends i implements l<Throwable, j> {
        public final /* synthetic */ Runnable $block;
        public final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar, Runnable runnable) {
            super(1);
            this.this$0 = aVar;
            this.$block = runnable;
        }

        public Object g(Object obj) {
            Throwable th = (Throwable) obj;
            this.this$0.f4619d.removeCallbacks(this.$block);
            return j.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Handler handler, String str, boolean z) {
        super((i.o.c.f) null);
        a aVar = null;
        this.f4619d = handler;
        this.f4620e = str;
        this.f4621f = z;
        this._immediate = z ? this : aVar;
        a aVar2 = this._immediate;
        if (aVar2 == null) {
            aVar2 = new a(handler, str, true);
            this._immediate = aVar2;
        }
        this.c = aVar2;
    }

    public boolean F(i.m.f fVar) {
        return !this.f4621f || (h.a(Looper.myLooper(), this.f4619d.getLooper()) ^ true);
    }

    public f1 O() {
        return this.c;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f4619d == this.f4619d;
    }

    public void f(long j2, f<? super j> fVar) {
        C0194a aVar = new C0194a(this, fVar);
        Handler handler = this.f4619d;
        if (j2 > 4611686018427387903L) {
            j2 = 4611686018427387903L;
        }
        handler.postDelayed(aVar, j2);
        ((g) fVar).i(new b(this, aVar));
    }

    public int hashCode() {
        return System.identityHashCode(this.f4619d);
    }

    public String toString() {
        String P = P();
        if (P != null) {
            return P;
        }
        String str = this.f4620e;
        if (str == null) {
            str = this.f4619d.toString();
        }
        return this.f4621f ? g.a.a.a.a.w(str, ".immediate") : str;
    }

    public void v(i.m.f fVar, Runnable runnable) {
        this.f4619d.post(runnable);
    }
}
