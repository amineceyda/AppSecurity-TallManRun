package g.h.a.c.b.l;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.views.YouTubePlayerSeekBar;
import i.o.c.h;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ YouTubePlayerSeekBar b;

    public /* synthetic */ a(YouTubePlayerSeekBar youTubePlayerSeekBar) {
        this.b = youTubePlayerSeekBar;
    }

    public final void run() {
        YouTubePlayerSeekBar youTubePlayerSeekBar = this.b;
        int i2 = YouTubePlayerSeekBar.f558j;
        h.e(youTubePlayerSeekBar, "this$0");
        youTubePlayerSeekBar.getVideoDurationTextView().setText("");
    }
}
