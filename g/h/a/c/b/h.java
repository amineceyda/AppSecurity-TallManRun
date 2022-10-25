package g.h.a.c.b;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.views.YouTubePlayerSeekBar;
import g.h.a.c.a.l;
import g.h.a.c.a.m;
import g.h.a.c.a.p;
import g.h.a.c.a.r.c;
import g.h.a.c.a.r.d;
import g.h.a.c.a.u.n;
import g.h.a.c.b.j.c.a;
import g.h.a.c.b.l.b;

public final class h implements i, d, c, b {
    public final LegacyYouTubePlayerView b;
    public final p c;

    /* renamed from: d  reason: collision with root package name */
    public g.h.a.c.b.j.b f4066d;

    /* renamed from: e  reason: collision with root package name */
    public final View f4067e;

    /* renamed from: f  reason: collision with root package name */
    public final View f4068f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f4069g;

    /* renamed from: h  reason: collision with root package name */
    public final ProgressBar f4070h;

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f4071i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f4072j;

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f4073k;

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f4074l;

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f4075m;
    public final ImageView n;
    public final YouTubePlayerSeekBar o;
    public View.OnClickListener p;
    public View.OnClickListener q;
    public final g.h.a.c.b.k.b r;
    public boolean s;
    public boolean t = true;

    public h(LegacyYouTubePlayerView legacyYouTubePlayerView, p pVar) {
        i.o.c.h.e(legacyYouTubePlayerView, "youTubePlayerView");
        i.o.c.h.e(pVar, "youTubePlayer");
        this.b = legacyYouTubePlayerView;
        this.c = pVar;
        View inflate = View.inflate(legacyYouTubePlayerView.getContext(), 2131492939, legacyYouTubePlayerView);
        Context context = legacyYouTubePlayerView.getContext();
        i.o.c.h.d(context, "youTubePlayerView.context");
        this.f4066d = new a(context);
        View findViewById = inflate.findViewById(2131297258);
        i.o.c.h.d(findViewById, "controlsView.findViewById(R.id.panel)");
        this.f4067e = findViewById;
        View findViewById2 = inflate.findViewById(2131296688);
        i.o.c.h.d(findViewById2, "controlsView.findViewById(R.id.controls_container)");
        this.f4068f = findViewById2;
        View findViewById3 = inflate.findViewById(2131296847);
        i.o.c.h.d(findViewById3, "controlsView.findViewById(R.id.extra_views_container)");
        LinearLayout linearLayout = (LinearLayout) findViewById3;
        View findViewById4 = inflate.findViewById(2131297867);
        i.o.c.h.d(findViewById4, "controlsView.findViewById(R.id.video_title)");
        TextView textView = (TextView) findViewById4;
        View findViewById5 = inflate.findViewById(2131297052);
        i.o.c.h.d(findViewById5, "controlsView.findViewById(R.id.live_video_indicator)");
        this.f4069g = (TextView) findViewById5;
        View findViewById6 = inflate.findViewById(2131297364);
        i.o.c.h.d(findViewById6, "controlsView.findViewById(R.id.progress)");
        this.f4070h = (ProgressBar) findViewById6;
        View findViewById7 = inflate.findViewById(2131297118);
        i.o.c.h.d(findViewById7, "controlsView.findViewById(R.id.menu_button)");
        ImageView imageView = (ImageView) findViewById7;
        this.f4071i = imageView;
        View findViewById8 = inflate.findViewById(2131297284);
        i.o.c.h.d(findViewById8, "controlsView.findViewById(R.id.play_pause_button)");
        ImageView imageView2 = (ImageView) findViewById8;
        this.f4072j = imageView2;
        View findViewById9 = inflate.findViewById(2131297921);
        i.o.c.h.d(findViewById9, "controlsView.findViewById(R.id.youtube_button)");
        this.f4073k = (ImageView) findViewById9;
        View findViewById10 = inflate.findViewById(2131296896);
        i.o.c.h.d(findViewById10, "controlsView.findViewById(R.id.fullscreen_button)");
        ImageView imageView3 = (ImageView) findViewById10;
        this.f4074l = imageView3;
        View findViewById11 = inflate.findViewById(2131296704);
        i.o.c.h.d(findViewById11, "controlsView.findViewById(R.id.custom_action_left_button)");
        this.f4075m = (ImageView) findViewById11;
        View findViewById12 = inflate.findViewById(2131296705);
        i.o.c.h.d(findViewById12, "controlsView.findViewById(R.id.custom_action_right_button)");
        this.n = (ImageView) findViewById12;
        View findViewById13 = inflate.findViewById(2131297922);
        i.o.c.h.d(findViewById13, "controlsView.findViewById(R.id.youtube_player_seekbar)");
        YouTubePlayerSeekBar youTubePlayerSeekBar = (YouTubePlayerSeekBar) findViewById13;
        this.o = youTubePlayerSeekBar;
        g.h.a.c.b.k.b bVar = new g.h.a.c.b.k.b(findViewById2);
        this.r = bVar;
        this.p = new b(this);
        this.q = new c(this);
        n nVar = (n) pVar;
        nVar.g(youTubePlayerSeekBar);
        nVar.g(bVar);
        youTubePlayerSeekBar.setYoutubePlayerSeekBarListener(this);
        findViewById.setOnClickListener(new f(this));
        imageView2.setOnClickListener(new d(this));
        imageView3.setOnClickListener(new g(this));
        imageView.setOnClickListener(new e(this));
    }

    public void a(float f2) {
        this.c.a(f2);
    }

    public void b(p pVar, float f2) {
        i.o.c.h.e(pVar, "youTubePlayer");
    }

    public void c() {
        this.f4074l.setImageResource(2131230819);
    }

    public i d(boolean z) {
        this.f4074l.setVisibility(z ? 0 : 8);
        return this;
    }

    public void e(p pVar, m mVar) {
        i.o.c.h.e(pVar, "youTubePlayer");
        i.o.c.h.e(mVar, "playbackRate");
    }

    public void f(p pVar) {
        i.o.c.h.e(pVar, "youTubePlayer");
    }

    public void g(p pVar, String str) {
        i.o.c.h.e(pVar, "youTubePlayer");
        i.o.c.h.e(str, "videoId");
        this.f4073k.setOnClickListener(new a(str, this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        if (r7 != 4) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(g.h.a.c.a.p r7, g.h.a.c.a.o r8) {
        /*
            r6 = this;
            java.lang.String r0 = "youTubePlayer"
            i.o.c.h.e(r7, r0)
            java.lang.String r7 = "state"
            i.o.c.h.e(r8, r7)
            int r7 = r8.ordinal()
            r0 = 0
            r1 = 2
            r2 = 4
            r3 = 1
            if (r7 == r1) goto L_0x001d
            r1 = 3
            if (r7 == r1) goto L_0x001a
            if (r7 == r2) goto L_0x001d
            goto L_0x001f
        L_0x001a:
            r6.s = r3
            goto L_0x001f
        L_0x001d:
            r6.s = r0
        L_0x001f:
            boolean r7 = r6.s
            r7 = r7 ^ r3
            r6.t(r7)
            g.h.a.c.a.o r7 = g.h.a.c.a.o.PLAYING
            r1 = 17170445(0x106000d, float:2.461195E-38)
            r4 = 8
            if (r8 == r7) goto L_0x0076
            g.h.a.c.a.o r5 = g.h.a.c.a.o.PAUSED
            if (r8 == r5) goto L_0x0076
            g.h.a.c.a.o r5 = g.h.a.c.a.o.VIDEO_CUED
            if (r8 != r5) goto L_0x0037
            goto L_0x0076
        L_0x0037:
            r6.t(r0)
            g.h.a.c.a.o r7 = g.h.a.c.a.o.BUFFERING
            if (r8 != r7) goto L_0x0063
            android.widget.ProgressBar r7 = r6.f4070h
            r7.setVisibility(r0)
            android.view.View r7 = r6.f4067e
            android.content.Context r3 = r7.getContext()
            int r1 = e.e.c.a.b(r3, r1)
            r7.setBackgroundColor(r1)
            boolean r7 = r6.t
            if (r7 == 0) goto L_0x0059
            android.widget.ImageView r7 = r6.f4072j
            r7.setVisibility(r2)
        L_0x0059:
            android.widget.ImageView r7 = r6.f4075m
            r7.setVisibility(r4)
            android.widget.ImageView r7 = r6.n
            r7.setVisibility(r4)
        L_0x0063:
            g.h.a.c.a.o r7 = g.h.a.c.a.o.UNSTARTED
            if (r8 != r7) goto L_0x0097
            android.widget.ProgressBar r7 = r6.f4070h
            r7.setVisibility(r4)
            boolean r7 = r6.t
            if (r7 == 0) goto L_0x0097
            android.widget.ImageView r7 = r6.f4072j
            r7.setVisibility(r0)
            goto L_0x0097
        L_0x0076:
            android.view.View r2 = r6.f4067e
            android.content.Context r5 = r2.getContext()
            int r1 = e.e.c.a.b(r5, r1)
            r2.setBackgroundColor(r1)
            android.widget.ProgressBar r1 = r6.f4070h
            r1.setVisibility(r4)
            boolean r1 = r6.t
            if (r1 == 0) goto L_0x0091
            android.widget.ImageView r1 = r6.f4072j
            r1.setVisibility(r0)
        L_0x0091:
            if (r8 != r7) goto L_0x0094
            r0 = 1
        L_0x0094:
            r6.t(r0)
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.h.a.c.b.h.h(g.h.a.c.a.p, g.h.a.c.a.o):void");
    }

    public void i() {
        this.f4074l.setImageResource(2131230820);
    }

    public void j(p pVar) {
        i.o.c.h.e(pVar, "youTubePlayer");
    }

    public i k(boolean z) {
        this.o.getVideoDurationTextView().setVisibility(z ? 0 : 8);
        return this;
    }

    public void l(p pVar, float f2) {
        i.o.c.h.e(pVar, "youTubePlayer");
    }

    public i m(boolean z) {
        this.f4073k.setVisibility(z ? 0 : 8);
        return this;
    }

    public i n(boolean z) {
        this.o.getSeekBar().setVisibility(z ? 0 : 4);
        return this;
    }

    public i o(boolean z) {
        this.o.getVideoCurrentTimeTextView().setVisibility(z ? 0 : 8);
        return this;
    }

    public void p(p pVar, g.h.a.c.a.n nVar) {
        i.o.c.h.e(pVar, "youTubePlayer");
        i.o.c.h.e(nVar, "error");
    }

    public i q(boolean z) {
        int i2 = 0;
        this.o.setVisibility(z ? 4 : 0);
        TextView textView = this.f4069g;
        if (!z) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        return this;
    }

    public void r(p pVar, float f2) {
        i.o.c.h.e(pVar, "youTubePlayer");
    }

    public void s(p pVar, l lVar) {
        i.o.c.h.e(pVar, "youTubePlayer");
        i.o.c.h.e(lVar, "playbackQuality");
    }

    public final void t(boolean z) {
        this.f4072j.setImageResource(z ? 2131230822 : 2131230823);
    }
}
