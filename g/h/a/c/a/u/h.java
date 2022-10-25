package g.h.a.c.a.u;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView;
import g.h.a.c.a.p;
import g.h.a.c.a.r.a;
import g.h.a.c.a.r.b;

public final class h extends a {
    public final /* synthetic */ LegacyYouTubePlayerView b;

    public h(LegacyYouTubePlayerView legacyYouTubePlayerView) {
        this.b = legacyYouTubePlayerView;
    }

    public void j(p pVar) {
        i.o.c.h.e(pVar, "youTubePlayer");
        this.b.setYouTubePlayerReady$youtubecore_release(true);
        for (b a : this.b.f552i) {
            a.a(pVar);
        }
        this.b.f552i.clear();
        pVar.e(this);
    }
}
