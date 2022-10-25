package g.h.a.c.a.u;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import g.h.a.c.a.r.a;
import i.o.c.h;

public final class p extends a {
    public final /* synthetic */ String b;
    public final /* synthetic */ YouTubePlayerView c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f4065d;

    public p(String str, YouTubePlayerView youTubePlayerView, boolean z) {
        this.b = str;
        this.c = youTubePlayerView;
        this.f4065d = z;
    }

    public void j(g.h.a.c.a.p pVar) {
        h.e(pVar, "youTubePlayer");
        String str = this.b;
        if (str != null) {
            boolean z = this.c.b.getCanPlay$youtubecore_release() && this.f4065d;
            h.d(str, "videoId");
            h.e(pVar, "<this>");
            h.e(str, "videoId");
            if (z) {
                pVar.f(str, 0.0f);
            } else {
                pVar.h(str, 0.0f);
            }
        }
        pVar.e(this);
    }
}
