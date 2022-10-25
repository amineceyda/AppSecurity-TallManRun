package androidx.lifecycle;

import e.h.b.g;
import e.k.e;
import e.k.f;
import e.k.h;
import e.k.i;
import e.k.n;
import java.util.Map;

public abstract class LiveData<T> {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f230j = new Object();
    public final Object a = new Object();
    public e.c.a.b.b<n<? super T>, LiveData<T>.defpackage.b> b = new e.c.a.b.b<>();
    public int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f231d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f232e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f233f;

    /* renamed from: g  reason: collision with root package name */
    public int f234g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f235h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f236i;

    public class LifecycleBoundObserver extends LiveData<T>.defpackage.b implements f {

        /* renamed from: f  reason: collision with root package name */
        public final h f237f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ LiveData f238g;

        public void d(h hVar, e.a aVar) {
            e.b bVar = ((i) this.f237f.getLifecycle()).b;
            if (bVar == e.b.DESTROYED) {
                this.f238g.f(this.b);
                return;
            }
            e.b bVar2 = null;
            while (bVar2 != bVar) {
                h(j());
                bVar2 = bVar;
                bVar = ((i) this.f237f.getLifecycle()).b;
            }
        }

        public void i() {
            i iVar = (i) this.f237f.getLifecycle();
            iVar.d("removeObserver");
            iVar.a.i(this);
        }

        public boolean j() {
            return ((i) this.f237f.getLifecycle()).b.compareTo(e.b.STARTED) >= 0;
        }
    }

    public class a extends LiveData<T>.defpackage.b {
        public a(LiveData liveData, n<? super T> nVar) {
            super(nVar);
        }

        public boolean j() {
            return true;
        }
    }

    public abstract class b {
        public final n<? super T> b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public int f239d = -1;

        public b(n<? super T> nVar) {
            this.b = nVar;
        }

        public void h(boolean z) {
            if (z != this.c) {
                this.c = z;
                LiveData liveData = LiveData.this;
                int i2 = z ? 1 : -1;
                int i3 = liveData.c;
                liveData.c = i2 + i3;
                if (!liveData.f231d) {
                    liveData.f231d = true;
                    while (true) {
                        try {
                            int i4 = liveData.c;
                            if (i3 == i4) {
                                break;
                            }
                            boolean z2 = i3 == 0 && i4 > 0;
                            boolean z3 = i3 > 0 && i4 == 0;
                            if (z2) {
                                liveData.d();
                            } else if (z3) {
                                liveData.e();
                            }
                            i3 = i4;
                        } finally {
                            liveData.f231d = false;
                        }
                    }
                }
                if (this.c) {
                    LiveData.this.c(this);
                }
            }
        }

        public void i() {
        }

        public abstract boolean j();
    }

    public LiveData() {
        Object obj = f230j;
        this.f233f = obj;
        this.f232e = obj;
        this.f234g = -1;
    }

    public static void a(String str) {
        if (!e.c.a.a.a.b().a()) {
            throw new IllegalStateException(g.a.a.a.a.c("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(LiveData<T>.defpackage.b bVar) {
        if (bVar.c) {
            if (!bVar.j()) {
                bVar.h(false);
                return;
            }
            int i2 = bVar.f239d;
            int i3 = this.f234g;
            if (i2 < i3) {
                bVar.f239d = i3;
                ((g.d) bVar.b).a(this.f232e);
            }
        }
    }

    public void c(LiveData<T>.defpackage.b bVar) {
        if (this.f235h) {
            this.f236i = true;
            return;
        }
        this.f235h = true;
        do {
            this.f236i = false;
            if (bVar == null) {
                e.c.a.b.b<K, V>.d e2 = this.b.e();
                while (e2.hasNext()) {
                    b((b) ((Map.Entry) e2.next()).getValue());
                    if (this.f236i) {
                        break;
                    }
                }
            } else {
                b(bVar);
                bVar = null;
            }
        } while (this.f236i);
        this.f235h = false;
    }

    public void d() {
    }

    public void e() {
    }

    public void f(n<? super T> nVar) {
        a("removeObserver");
        b i2 = this.b.i(nVar);
        if (i2 != null) {
            i2.i();
            i2.h(false);
        }
    }
}
