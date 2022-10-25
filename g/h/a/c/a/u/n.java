package g.h.a.c.a.u;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import g.d.a.j.e;
import g.h.a.c.a.p;
import g.h.a.c.a.q;
import g.h.a.c.a.r.d;
import g.i.c.a.a.q.d.a.a;
import i.j;
import i.o.b.l;
import i.o.c.h;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public final class n extends a implements p, q.a {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int f4059i = 0;

    /* renamed from: d  reason: collision with root package name */
    public final String f4060d = "WebViewYouTubePlayer";

    /* renamed from: e  reason: collision with root package name */
    public l<? super p, j> f4061e;

    /* renamed from: f  reason: collision with root package name */
    public final HashSet<d> f4062f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    public final Handler f4063g = new Handler(Looper.getMainLooper());

    /* renamed from: h  reason: collision with root package name */
    public boolean f4064h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(Context context) {
        super(context, (AttributeSet) null, 0);
        h.c(context);
    }

    public void a(float f2) {
        this.f4063g.post(new b(this, f2));
    }

    public void b() {
        this.f4063g.post(new c(this));
    }

    public void c() {
        l<? super p, j> lVar = this.f4061e;
        if (lVar != null) {
            lVar.g(this);
        } else {
            h.k("youTubePlayerInitListener");
            throw null;
        }
    }

    public void d() {
        this.f4063g.post(new f(this));
    }

    public void destroy() {
        this.f4062f.clear();
        this.f4063g.removeCallbacksAndMessages((Object) null);
        super.destroy();
    }

    public boolean e(d dVar) {
        h.e(dVar, "listener");
        return this.f4062f.remove(dVar);
    }

    public void f(String str, float f2) {
        h.e(str, "videoId");
        this.f4063g.post(new a(this, str, f2));
    }

    public boolean g(d dVar) {
        h.e(dVar, "listener");
        return this.f4062f.add(dVar);
    }

    public p getInstance() {
        return this;
    }

    public Collection<d> getListeners() {
        Collection<d> unmodifiableCollection = Collections.unmodifiableCollection(new HashSet(this.f4062f));
        h.d(unmodifiableCollection, "unmodifiableCollection(HashSet(youTubePlayerListeners))");
        return unmodifiableCollection;
    }

    public void h(String str, float f2) {
        h.e(str, "videoId");
        this.f4063g.post(new e(this, str, f2));
    }

    public void onWindowVisibilityChanged(int i2) {
        if (!this.f4064h || !(i2 == 8 || i2 == 4)) {
            super.onWindowVisibilityChanged(i2);
        }
    }

    public final void setBackgroundPlaybackEnabled$youtubecore_release(boolean z) {
        this.f4064h = z;
    }

    public void setOverScrollMode(int i2) {
        try {
            super.setOverScrollMode(i2);
        } catch (Exception e2) {
            h.e(e2, e.u);
            if (e2.getCause() == null) {
                e2.toString();
            } else {
                String.valueOf(e2.getCause());
            }
            String stackTraceString = Log.getStackTraceString(e2);
            h.d(stackTraceString, "trace");
            if (i.t.e.a(stackTraceString, "android.content.pm.PackageManager$NameNotFoundException", false, 2) || i.t.e.a(stackTraceString, "java.lang.RuntimeException: Cannot load WebView", false, 2) || i.t.e.a(stackTraceString, "android.webkit.WebViewFactory$MissingWebViewPackageException: Failed to load WebView provider: No WebView installed", false, 2)) {
                Log.i(this.f4060d, stackTraceString);
            }
        }
    }

    public void setVolume(int i2) {
        if (i2 >= 0 && i2 <= 100) {
            this.f4063g.post(new d(this, i2));
            return;
        }
        throw new IllegalArgumentException("Volume must be between 0 and 100".toString());
    }
}
