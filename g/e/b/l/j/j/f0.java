package g.e.b.l.j.j;

import android.util.Log;
import g.e.b.l.j.c;
import g.e.b.l.j.p.f;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

public class f0 implements Thread.UncaughtExceptionHandler {
    public final a a;
    public final f b;
    public final Thread.UncaughtExceptionHandler c;

    /* renamed from: d  reason: collision with root package name */
    public final c f3486d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f3487e = new AtomicBoolean(false);

    public interface a {
    }

    public f0(a aVar, f fVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, c cVar) {
        this.a = aVar;
        this.b = fVar;
        this.c = uncaughtExceptionHandler;
        this.f3486d = cVar;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            g.e.b.l.j.f.a.c("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th == null) {
            g.e.b.l.j.f.a.c("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (!this.f3486d.b()) {
            return true;
        } else {
            g.e.b.l.j.f.a.b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        this.f3487e.set(true);
        try {
            if (a(thread, th)) {
                ((p) this.a).a(this.b, thread, th);
            } else {
                g.e.b.l.j.f.a.b("Uncaught exception will not be recorded by Crashlytics.");
            }
            g.e.b.l.j.f.a.b("Completed exception processing. Invoking default exception handler.");
        } catch (Exception e2) {
            g.e.b.l.j.f fVar = g.e.b.l.j.f.a;
            if (fVar.a(6)) {
                Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e2);
            }
            fVar.b("Completed exception processing. Invoking default exception handler.");
        } catch (Throwable th2) {
            g.e.b.l.j.f.a.b("Completed exception processing. Invoking default exception handler.");
            this.c.uncaughtException(thread, th);
            this.f3487e.set(false);
            throw th2;
        }
        this.c.uncaughtException(thread, th);
        this.f3487e.set(false);
    }
}
