package g.h.a.c.a.u;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView;
import g.h.a.c.a.n;
import g.h.a.c.a.t.c;
import i.j;
import i.o.b.a;
import i.o.c.h;
import java.util.Objects;

public final class i extends i.o.c.i implements a<j> {
    public final /* synthetic */ n $it;
    public final /* synthetic */ LegacyYouTubePlayerView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(LegacyYouTubePlayerView legacyYouTubePlayerView, n nVar) {
        super(0);
        this.this$0 = legacyYouTubePlayerView;
        this.$it = nVar;
    }

    public Object a() {
        LegacyYouTubePlayerView legacyYouTubePlayerView = this.this$0;
        if (!legacyYouTubePlayerView.f550g) {
            legacyYouTubePlayerView.f551h.a();
        } else {
            c cVar = legacyYouTubePlayerView.f548e;
            n nVar = this.$it;
            Objects.requireNonNull(cVar);
            n nVar2 = n.HTML_5_PLAYER;
            h.e(nVar, "youTubePlayer");
            String str = cVar.f4052e;
            if (str != null) {
                boolean z = cVar.c;
                if (z && cVar.f4051d == nVar2) {
                    boolean z2 = cVar.b;
                    float f2 = cVar.f4053f;
                    h.e(nVar, "<this>");
                    h.e(str, "videoId");
                    if (z2) {
                        nVar.f(str, f2);
                    } else {
                        nVar.h(str, f2);
                    }
                } else if (!z && cVar.f4051d == nVar2) {
                    nVar.h(str, cVar.f4053f);
                }
            }
            cVar.f4051d = null;
        }
        return j.a;
    }
}
