package g.e.b.l.j.j;

import android.content.Context;
import android.util.Log;
import g.e.a.b.g.b0;
import g.e.b.h;
import g.e.b.l.j.c;
import g.e.b.l.j.n.f;
import g.e.b.l.j.p.e;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class a0 {
    public final Context a;
    public final g0 b;
    public final long c = System.currentTimeMillis();

    /* renamed from: d  reason: collision with root package name */
    public c0 f3473d;

    /* renamed from: e  reason: collision with root package name */
    public c0 f3474e;

    /* renamed from: f  reason: collision with root package name */
    public v f3475f;

    /* renamed from: g  reason: collision with root package name */
    public final k0 f3476g;

    /* renamed from: h  reason: collision with root package name */
    public final f f3477h;

    /* renamed from: i  reason: collision with root package name */
    public final g.e.b.l.j.i.b f3478i;

    /* renamed from: j  reason: collision with root package name */
    public final g.e.b.l.j.h.a f3479j;

    /* renamed from: k  reason: collision with root package name */
    public final ExecutorService f3480k;

    /* renamed from: l  reason: collision with root package name */
    public final m f3481l;

    /* renamed from: m  reason: collision with root package name */
    public final c f3482m;

    public class a implements Runnable {
        public final /* synthetic */ g.e.b.l.j.p.f b;

        public a(g.e.b.l.j.p.f fVar) {
            this.b = fVar;
        }

        public void run() {
            a0.a(a0.this, this.b);
        }
    }

    public class b implements Callable<Boolean> {
        public b() {
        }

        public Object call() throws Exception {
            try {
                boolean delete = a0.this.f3473d.b().delete();
                if (!delete) {
                    g.e.b.l.j.f.a.f("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(delete);
            } catch (Exception e2) {
                if (g.e.b.l.j.f.a.a(6)) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e2);
                }
                return Boolean.FALSE;
            }
        }
    }

    public a0(h hVar, k0 k0Var, c cVar, g0 g0Var, g.e.b.l.j.i.b bVar, g.e.b.l.j.h.a aVar, f fVar, ExecutorService executorService) {
        this.b = g0Var;
        hVar.a();
        this.a = hVar.a;
        this.f3476g = k0Var;
        this.f3482m = cVar;
        this.f3478i = bVar;
        this.f3479j = aVar;
        this.f3480k = executorService;
        this.f3477h = fVar;
        this.f3481l = new m(executorService);
    }

    public static g.e.a.b.g.f a(a0 a0Var, g.e.b.l.j.p.f fVar) {
        b0 b0Var;
        a0Var.f3481l.a();
        a0Var.f3473d.a();
        g.e.b.l.j.f fVar2 = g.e.b.l.j.f.a;
        fVar2.e("Initialization marker file was created.");
        try {
            a0Var.f3478i.a(new b(a0Var));
            e eVar = (e) fVar;
            if (!eVar.b().b().a) {
                fVar2.b("Collection of crash reports disabled in Crashlytics settings.");
                RuntimeException runtimeException = new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                b0 b0Var2 = new b0();
                b0Var2.m(runtimeException);
                b0Var = b0Var2;
            } else {
                if (!a0Var.f3475f.e(eVar)) {
                    fVar2.f("Previous sessions could not be finalized.");
                }
                b0Var = a0Var.f3475f.g(eVar.f3702i.get().a);
            }
        } catch (Exception e2) {
            if (g.e.b.l.j.f.a.a(6)) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e2);
            }
            b0 b0Var3 = new b0();
            b0Var3.m(e2);
            b0Var = b0Var3;
        } catch (Throwable th) {
            a0Var.c();
            throw th;
        }
        a0Var.c();
        return b0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        android.util.Log.e("FirebaseCrashlytics", r1, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(g.e.b.l.j.p.f r6) {
        /*
            r5 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            g.e.b.l.j.j.a0$a r1 = new g.e.b.l.j.j.a0$a
            r1.<init>(r6)
            java.util.concurrent.ExecutorService r6 = r5.f3480k
            java.util.concurrent.Future r6 = r6.submit(r1)
            g.e.b.l.j.f r1 = g.e.b.l.j.f.a
            java.lang.String r2 = "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously."
            r1.b(r2)
            r1 = 4
            r3 = 6
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0038, ExecutionException -> 0x002c, TimeoutException -> 0x001d }
            r6.get(r1, r4)     // Catch:{ InterruptedException -> 0x0038, ExecutionException -> 0x002c, TimeoutException -> 0x001d }
            goto L_0x0044
        L_0x001d:
            r6 = move-exception
            g.e.b.l.j.f r1 = g.e.b.l.j.f.a
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto L_0x0044
            java.lang.String r1 = "Crashlytics timed out during initialization."
        L_0x0028:
            android.util.Log.e(r0, r1, r6)
            goto L_0x0044
        L_0x002c:
            r6 = move-exception
            g.e.b.l.j.f r1 = g.e.b.l.j.f.a
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto L_0x0044
            java.lang.String r1 = "Crashlytics encountered a problem during initialization."
            goto L_0x0028
        L_0x0038:
            r6 = move-exception
            g.e.b.l.j.f r1 = g.e.b.l.j.f.a
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto L_0x0044
            java.lang.String r1 = "Crashlytics was interrupted during initialization."
            goto L_0x0028
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.l.j.j.a0.b(g.e.b.l.j.p.f):void");
    }

    public void c() {
        this.f3481l.b(new b());
    }
}
