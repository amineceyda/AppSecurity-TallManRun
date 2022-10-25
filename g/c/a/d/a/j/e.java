package g.c.a.d.a.j;

import android.view.View;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import g.h.a.c.a.u.n;
import g.i.c.a.a.i.b;
import i.o.c.h;
import java.util.Objects;

public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ k b;

    public /* synthetic */ e(k kVar) {
        this.b = kVar;
    }

    public final void onClick(View view) {
        k kVar = this.b;
        kVar.f1945k.setVisibility(8);
        kVar.f1939e.setVisibility(0);
        YouTubePlayerView youTubePlayerView = kVar.f1939e;
        i iVar = new i(kVar);
        Objects.requireNonNull(youTubePlayerView);
        h.e(iVar, "youTubePlayerListener");
        n youTubePlayer$youtubecore_release = youTubePlayerView.b.getYouTubePlayer$youtubecore_release();
        if (youTubePlayer$youtubecore_release != null) {
            youTubePlayer$youtubecore_release.g(iVar);
        }
        YouTubePlayerView youTubePlayerView2 = kVar.f1939e;
        j jVar = new j(kVar);
        Objects.requireNonNull(youTubePlayerView2);
        h.e(jVar, "fullScreenListener");
        youTubePlayerView2.c.a(jVar);
        b.C0166b.a.j(view);
    }
}
