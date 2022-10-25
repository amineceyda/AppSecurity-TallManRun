package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.view.MotionEvent;
import e.k.e;
import e.k.g;
import e.k.o;
import g.h.a.c.a.u.l;
import g.h.a.c.b.i;
import i.o.c.h;

public final class YouTubePlayerView extends l implements g {
    public final LegacyYouTubePlayerView b;
    public final g.h.a.c.a.t.a c = new g.h.a.c.a.t.a(this);

    /* renamed from: d  reason: collision with root package name */
    public a f556d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f557e;

    public interface a {
        void a(MotionEvent motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0091, code lost:
        r14 = r14.q(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public YouTubePlayerView(android.content.Context r14) {
        /*
            r13 = this;
            java.lang.String r0 = "context"
            i.o.c.h.e(r14, r0)
            i.o.c.h.e(r14, r0)
            r0 = 0
            r1 = 0
            r13.<init>(r14, r0, r1)
            com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView r2 = new com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView
            r2.<init>(r14)
            r13.b = r2
            g.h.a.c.a.t.a r3 = new g.h.a.c.a.t.a
            r3.<init>(r13)
            r13.c = r3
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r13.addView(r2, r3)
            android.content.res.Resources$Theme r14 = r14.getTheme()
            int[] r3 = g.h.a.b.b
            android.content.res.TypedArray r14 = r14.obtainStyledAttributes(r0, r3, r1, r1)
            r3 = 1
            boolean r4 = r14.getBoolean(r3, r3)
            r13.f557e = r4
            boolean r4 = r14.getBoolean(r1, r1)
            r5 = 3
            boolean r5 = r14.getBoolean(r5, r3)
            r6 = 10
            java.lang.String r6 = r14.getString(r6)
            r7 = 9
            boolean r7 = r14.getBoolean(r7, r1)
            r8 = 2
            boolean r1 = r14.getBoolean(r8, r1)
            r8 = 8
            boolean r8 = r14.getBoolean(r8, r3)
            r9 = 4
            boolean r9 = r14.getBoolean(r9, r3)
            r10 = 6
            boolean r10 = r14.getBoolean(r10, r3)
            r11 = 7
            boolean r11 = r14.getBoolean(r11, r3)
            r12 = 5
            boolean r12 = r14.getBoolean(r12, r3)
            r14.recycle()
            boolean r14 = r13.f557e
            if (r14 != 0) goto L_0x007b
            if (r7 != 0) goto L_0x0073
            goto L_0x007b
        L_0x0073:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "YouTubePlayerView: 'enableAutomaticInitialization' is false and 'useWebUi' is set to true. This is not possible, if you want to manually initialize YouTubePlayerView and use the web ui, you should manually initialize the YouTubePlayerView using 'initializeWithWebUi'"
            r14.<init>(r0)
            throw r14
        L_0x007b:
            if (r6 != 0) goto L_0x0088
            if (r4 != 0) goto L_0x0080
            goto L_0x0088
        L_0x0080:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "YouTubePlayerView: videoId is not set but autoPlay is set to true. This combination is not possible."
            r14.<init>(r0)
            throw r14
        L_0x0088:
            if (r7 != 0) goto L_0x00b9
            g.h.a.c.b.i r14 = r2.getPlayerUiController()
            if (r14 != 0) goto L_0x0091
            goto L_0x0097
        L_0x0091:
            g.h.a.c.b.i r14 = r14.q(r1)
            if (r14 != 0) goto L_0x0099
        L_0x0097:
            r14 = r0
            goto L_0x009d
        L_0x0099:
            g.h.a.c.b.i r14 = r14.m(r8)
        L_0x009d:
            if (r14 != 0) goto L_0x00a0
            goto L_0x00a6
        L_0x00a0:
            g.h.a.c.b.i r14 = r14.d(r9)
            if (r14 != 0) goto L_0x00a8
        L_0x00a6:
            r14 = r0
            goto L_0x00ac
        L_0x00a8:
            g.h.a.c.b.i r14 = r14.o(r10)
        L_0x00ac:
            if (r14 != 0) goto L_0x00af
            goto L_0x00b9
        L_0x00af:
            g.h.a.c.b.i r14 = r14.k(r11)
            if (r14 != 0) goto L_0x00b6
            goto L_0x00b9
        L_0x00b6:
            r14.n(r12)
        L_0x00b9:
            g.h.a.c.a.u.p r14 = new g.h.a.c.a.u.p
            r14.<init>(r6, r13, r4)
            boolean r1 = r13.f557e
            java.lang.String r4 = "fullScreenListener"
            if (r1 == 0) goto L_0x012c
            java.lang.String r1 = "youTubePlayerListener"
            if (r7 == 0) goto L_0x0126
            i.o.c.h.e(r14, r1)
            g.h.a.c.a.s.a$a r1 = new g.h.a.c.a.s.a$a
            r1.<init>()
            java.lang.String r6 = "controls"
            r1.a(r6, r3)
            g.h.a.c.a.s.a r6 = new g.h.a.c.a.s.a
            org.json.JSONObject r1 = r1.a
            r6.<init>(r1, r0)
            r1 = 2131492940(0x7f0c004c, float:1.8609346E38)
            int r7 = r2.getChildCount()
            int r7 = r7 - r3
            r2.removeViews(r3, r7)
            boolean r7 = r2.f554k
            if (r7 != 0) goto L_0x0113
            g.h.a.c.a.u.n r7 = r2.b
            java.lang.String r8 = "defaultPlayerUiController"
            if (r7 != 0) goto L_0x00f2
            goto L_0x00f9
        L_0x00f2:
            g.h.a.c.b.h r9 = r2.c
            if (r9 == 0) goto L_0x010f
            r7.e(r9)
        L_0x00f9:
            g.h.a.c.a.t.a r7 = r2.f549f
            g.h.a.c.b.h r9 = r2.c
            if (r9 == 0) goto L_0x010b
            java.util.Objects.requireNonNull(r7)
            i.o.c.h.e(r9, r4)
            java.util.Set<g.h.a.c.a.r.c> r0 = r7.c
            r0.remove(r9)
            goto L_0x0113
        L_0x010b:
            i.o.c.h.k(r8)
            throw r0
        L_0x010f:
            i.o.c.h.k(r8)
            throw r0
        L_0x0113:
            r2.f554k = r3
            android.content.Context r0 = r2.getContext()
            android.view.View r0 = android.view.View.inflate(r0, r1, r2)
            java.lang.String r1 = "inflate(context, layoutId, this)"
            i.o.c.h.d(r0, r1)
            r2.h(r14, r5, r6)
            goto L_0x012c
        L_0x0126:
            i.o.c.h.e(r14, r1)
            r2.h(r14, r5, r0)
        L_0x012c:
            g.h.a.c.a.u.o r14 = new g.h.a.c.a.u.o
            r14.<init>(r13)
            i.o.c.h.e(r14, r4)
            g.h.a.c.a.t.a r0 = r2.f549f
            r0.a(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView.<init>(android.content.Context):void");
    }

    @o(e.a.ON_RESUME)
    private final void onResume() {
        this.b.onResume$youtubecore_release();
    }

    @o(e.a.ON_STOP)
    private final void onStop() {
        this.b.onStop$youtubecore_release();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        h.e(motionEvent, "event");
        a aVar = this.f556d;
        if (aVar != null) {
            aVar.a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean getEnableAutomaticInitialization() {
        return this.f557e;
    }

    public final i getPlayerUiController() {
        return this.b.getPlayerUiController();
    }

    @o(e.a.ON_DESTROY)
    public final void release() {
        this.b.release();
    }

    public final void setEnableAutomaticInitialization(boolean z) {
        this.f557e = z;
    }

    public final void setOnTouchListener(a aVar) {
        h.e(aVar, "onTouchEvent");
        if (this.f556d == null) {
            this.f556d = aVar;
        }
    }
}
