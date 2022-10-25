package g.h.a.c.a.u;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView;
import g.h.a.c.a.o;
import g.h.a.c.a.p;
import g.h.a.c.a.r.a;
import i.o.c.h;

public final class g extends a {
    public final /* synthetic */ LegacyYouTubePlayerView b;

    public g(LegacyYouTubePlayerView legacyYouTubePlayerView) {
        this.b = legacyYouTubePlayerView;
    }

    public void h(p pVar, o oVar) {
        h.e(pVar, "youTubePlayer");
        h.e(oVar, "state");
        if (oVar == o.PLAYING) {
            LegacyYouTubePlayerView legacyYouTubePlayerView = this.b;
            n nVar = legacyYouTubePlayerView.b;
            boolean z = false;
            if (nVar != null && (legacyYouTubePlayerView.getCanPlay$youtubecore_release() || nVar.f4064h)) {
                z = true;
            }
            if (!z) {
                pVar.b();
            }
        }
    }
}
