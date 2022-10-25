package g.i.c.a.a.t.k;

import android.view.View;
import g.i.c.a.a.u.a;
import g.i.c.a.a.u.c;
import java.lang.ref.WeakReference;

public interface i {

    public static class a {
        public final long a;
        public final WeakReference<View> b;
        public final WeakReference<Object> c;

        /* renamed from: d  reason: collision with root package name */
        public g.i.c.a.a.o.b f4541d;

        /* renamed from: e  reason: collision with root package name */
        public final c f4542e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f4543f;

        public a(f fVar, long j2) {
            this.a = j2;
            this.b = new WeakReference<>(fVar.b());
            this.c = new WeakReference<>(fVar.a());
            this.f4543f = l.d(fVar.b(), false);
            this.f4542e = a.b.a.a("imp_end", fVar.c);
        }
    }

    public interface b {
        void a(a aVar, long j2);
    }
}
