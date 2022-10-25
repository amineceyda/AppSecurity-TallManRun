package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.content.IntentFilter;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import e.k.e;
import e.k.g;
import e.k.o;
import g.h.a.c.a.r.d;
import g.h.a.c.a.t.b;
import g.h.a.c.a.t.c;
import g.h.a.c.a.u.l;
import g.h.a.c.a.u.n;
import g.h.a.c.b.h;
import i.j;
import i.o.c.i;
import i.t.e;
import java.util.HashSet;

public final class LegacyYouTubePlayerView extends l implements g {
    public n b;
    public h c;

    /* renamed from: d  reason: collision with root package name */
    public final b f547d;

    /* renamed from: e  reason: collision with root package name */
    public final c f548e;

    /* renamed from: f  reason: collision with root package name */
    public final g.h.a.c.a.t.a f549f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f550g;

    /* renamed from: h  reason: collision with root package name */
    public i.o.b.a<j> f551h = g.h.a.c.a.u.j.b;

    /* renamed from: i  reason: collision with root package name */
    public final HashSet<g.h.a.c.a.r.b> f552i = new HashSet<>();

    /* renamed from: j  reason: collision with root package name */
    public boolean f553j = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f554k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f555l;

    public static final class a extends i implements i.o.b.a<j> {
        public final /* synthetic */ g.h.a.c.a.s.a $playerOptions;
        public final /* synthetic */ d $youTubePlayerListener;
        public final /* synthetic */ LegacyYouTubePlayerView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(LegacyYouTubePlayerView legacyYouTubePlayerView, g.h.a.c.a.s.a aVar, d dVar) {
            super(0);
            this.this$0 = legacyYouTubePlayerView;
            this.$playerOptions = aVar;
            this.$youTubePlayerListener = dVar;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:15|16|17) */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b2, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00bb, code lost:
            throw new java.lang.RuntimeException("Can't parse HTML file.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00bc, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c0, code lost:
            throw r0;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x00b4 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a() {
            /*
                r7 = this;
                com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView r0 = r7.this$0
                g.h.a.c.a.u.n r0 = r0.getYouTubePlayer$youtubecore_release()
                if (r0 != 0) goto L_0x000a
                goto L_0x00af
            L_0x000a:
                g.h.a.c.a.u.k r1 = new g.h.a.c.a.u.k
                g.h.a.c.a.r.d r2 = r7.$youTubePlayerListener
                r1.<init>(r2)
                g.h.a.c.a.s.a r2 = r7.$playerOptions
                java.lang.String r3 = "initListener"
                i.o.c.h.e(r1, r3)
                r0.f4061e = r1
                if (r2 != 0) goto L_0x0020
                g.h.a.c.a.s.a$b r1 = g.h.a.c.a.s.a.b
                g.h.a.c.a.s.a r2 = g.h.a.c.a.s.a.c
            L_0x0020:
                android.webkit.WebSettings r1 = r0.getSettings()
                r3 = 1
                r1.setJavaScriptEnabled(r3)
                android.webkit.WebSettings r1 = r0.getSettings()
                r3 = 0
                r1.setMediaPlaybackRequiresUserGesture(r3)
                android.webkit.WebSettings r1 = r0.getSettings()
                r4 = 2
                r1.setCacheMode(r4)
                g.h.a.c.a.q r1 = new g.h.a.c.a.q
                r1.<init>(r0)
                java.lang.String r4 = "YouTubePlayerBridge"
                r0.addJavascriptInterface(r1, r4)
                android.content.res.Resources r1 = r0.getResources()
                r4 = 2131755008(0x7f100000, float:1.9140883E38)
                java.io.InputStream r1 = r1.openRawResource(r4)
                java.lang.String r4 = "resources.openRawResource(R.raw.ayp_youtube_player)"
                i.o.c.h.d(r1, r4)
                java.lang.String r4 = "inputStream"
                i.o.c.h.e(r1, r4)
                java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00b4 }
                java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00b4 }
                java.lang.String r6 = "utf-8"
                r5.<init>(r1, r6)     // Catch:{ Exception -> 0x00b4 }
                r4.<init>(r5)     // Catch:{ Exception -> 0x00b4 }
                java.lang.String r5 = r4.readLine()     // Catch:{ Exception -> 0x00b4 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b4 }
                r6.<init>()     // Catch:{ Exception -> 0x00b4 }
            L_0x006b:
                if (r5 == 0) goto L_0x007a
                r6.append(r5)     // Catch:{ Exception -> 0x00b4 }
                java.lang.String r5 = "\n"
                r6.append(r5)     // Catch:{ Exception -> 0x00b4 }
                java.lang.String r5 = r4.readLine()     // Catch:{ Exception -> 0x00b4 }
                goto L_0x006b
            L_0x007a:
                java.lang.String r4 = r6.toString()     // Catch:{ Exception -> 0x00b4 }
                java.lang.String r5 = "sb.toString()"
                i.o.c.h.d(r4, r5)     // Catch:{ Exception -> 0x00b4 }
                r1.close()
                java.lang.String r1 = r2.toString()
                r5 = 4
                java.lang.String r6 = "<<injectedPlayerVars>>"
                java.lang.String r3 = i.t.e.l(r4, r6, r1, r3, r5)
                org.json.JSONObject r1 = r2.a
                java.lang.String r2 = "origin"
                java.lang.String r2 = r1.getString(r2)
                java.lang.String r1 = "playerOptions.getString(Builder.ORIGIN)"
                i.o.c.h.d(r2, r1)
                r6 = 0
                java.lang.String r4 = "text/html"
                java.lang.String r5 = "utf-8"
                r1 = r0
                r1.loadDataWithBaseURL(r2, r3, r4, r5, r6)
                g.h.a.c.a.u.m r1 = new g.h.a.c.a.u.m
                r1.<init>()
                r0.setWebChromeClient(r1)
            L_0x00af:
                i.j r0 = i.j.a
                return r0
            L_0x00b2:
                r0 = move-exception
                goto L_0x00bc
            L_0x00b4:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00b2 }
                java.lang.String r2 = "Can't parse HTML file."
                r0.<init>(r2)     // Catch:{ all -> 0x00b2 }
                throw r0     // Catch:{ all -> 0x00b2 }
            L_0x00bc:
                r1.close()
                goto L_0x00c1
            L_0x00c0:
                throw r0
            L_0x00c1:
                goto L_0x00c0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView.a.a():java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegacyYouTubePlayerView(Context context) {
        super(context, (AttributeSet) null, 0);
        i.o.c.h.e(context, "context");
        i.o.c.h.e(context, "context");
        b bVar = new b();
        this.f547d = bVar;
        c cVar = new c();
        this.f548e = cVar;
        g.h.a.c.a.t.a aVar = new g.h.a.c.a.t.a(this);
        this.f549f = aVar;
        try {
            n nVar = new n(getContext());
            this.b = nVar;
            addView(getYouTubePlayer$youtubecore_release(), new FrameLayout.LayoutParams(-1, -1));
            h hVar = new h(this, nVar);
            this.c = hVar;
            aVar.a(hVar);
            h hVar2 = this.c;
            if (hVar2 != null) {
                nVar.g(hVar2);
                nVar.g(cVar);
                nVar.g(new g.h.a.c.a.u.g(this));
                nVar.g(new g.h.a.c.a.u.h(this));
                g.h.a.c.a.u.i iVar = new g.h.a.c.a.u.i(this, nVar);
                i.o.c.h.e(iVar, "<set-?>");
                bVar.b = iVar;
                this.f555l = false;
                return;
            }
            i.o.c.h.k("defaultPlayerUiController");
            throw null;
        } catch (Exception e2) {
            if (e2.getCause() == null) {
                e2.toString();
            } else {
                String.valueOf(e2.getCause());
            }
            String stackTraceString = Log.getStackTraceString(e2);
            i.o.c.h.d(stackTraceString, "trace");
            if (e.a(stackTraceString, "android.content.pm.PackageManager$NameNotFoundException", false, 2) || e.a(stackTraceString, "java.lang.RuntimeException: Cannot load WebView", false, 2) || e.a(stackTraceString, "android.webkit.WebViewFactory$MissingWebViewPackageException: Failed to load WebView provider: No WebView installed", false, 2)) {
                this.f555l = true;
                g.h.a.c.a.t.d.b(getContext(), "WebView widget not installed or broken.Please reinstall it before playing the video.");
            }
        }
    }

    public final boolean getCanPlay$youtubecore_release() {
        return this.f553j;
    }

    public final g.h.a.c.b.i getPlayerUiController() {
        if (this.f555l) {
            return null;
        }
        if (!this.f554k) {
            try {
                h hVar = this.c;
                if (hVar != null) {
                    return hVar;
                }
                i.o.c.h.k("defaultPlayerUiController");
                throw null;
            } catch (Exception unused) {
                return null;
            }
        } else {
            throw new RuntimeException("You have inflated a custom player Ui. You must manage it with your own controller.");
        }
    }

    public final n getYouTubePlayer$youtubecore_release() {
        return this.b;
    }

    public final void h(d dVar, boolean z, g.h.a.c.a.s.a aVar) {
        i.o.c.h.e(dVar, "youTubePlayerListener");
        if (!this.f555l) {
            if (!this.f550g) {
                if (z) {
                    getContext().registerReceiver(this.f547d, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
                a aVar2 = new a(this, aVar, dVar);
                this.f551h = aVar2;
                if (!z) {
                    aVar2.a();
                    return;
                }
                return;
            }
            throw new IllegalStateException("This YouTubePlayerView has already been initialized.");
        }
    }

    @o(e.a.ON_RESUME)
    public final void onResume$youtubecore_release() {
        this.f548e.b = true;
        this.f553j = true;
    }

    @o(e.a.ON_STOP)
    public final void onStop$youtubecore_release() {
        n nVar = this.b;
        if (nVar != null) {
            nVar.b();
        }
        this.f548e.b = false;
        this.f553j = false;
    }

    @o(e.a.ON_DESTROY)
    public final void release() {
        removeView(this.b);
        n nVar = this.b;
        if (nVar != null) {
            nVar.removeAllViews();
        }
        n nVar2 = this.b;
        if (nVar2 != null) {
            nVar2.destroy();
        }
        try {
            getContext().unregisterReceiver(this.f547d);
        } catch (Exception unused) {
        }
    }

    public final void setException(boolean z) {
        this.f555l = z;
    }

    public final void setYouTubePlayer$youtubecore_release(n nVar) {
        this.b = nVar;
    }

    public final void setYouTubePlayerReady$youtubecore_release(boolean z) {
        this.f550g = z;
    }
}
