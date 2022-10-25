package g.h.a.c.a;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.tencent.raft.raftframework.sla.SLAConstant;
import g.h.a.c.a.r.d;
import i.o.c.h;
import i.t.e;
import java.util.Collection;

public final class q {
    public final a a;
    public final Handler b = new Handler(Looper.getMainLooper());

    public interface a {
        void c();

        p getInstance();

        Collection<d> getListeners();
    }

    public q(a aVar) {
        h.e(aVar, "youTubePlayerOwner");
        this.a = aVar;
    }

    @JavascriptInterface
    public final void sendApiChange() {
        this.b.post(new j(this));
    }

    @JavascriptInterface
    public final void sendError(String str) {
        h.e(str, "error");
        n nVar = n.VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER;
        if (e.c(str, "2", true)) {
            nVar = n.INVALID_PARAMETER_IN_REQUEST;
        } else if (e.c(str, "5", true)) {
            nVar = n.HTML_5_PLAYER;
        } else if (e.c(str, "100", true)) {
            nVar = n.VIDEO_NOT_FOUND;
        } else if (!e.c(str, "101", true) && !e.c(str, "150", true)) {
            nVar = n.UNKNOWN;
        }
        this.b.post(new i(this, nVar));
    }

    @JavascriptInterface
    public final void sendPlaybackQualityChange(String str) {
        h.e(str, "quality");
        this.b.post(new c(this, e.c(str, "small", true) ? l.SMALL : e.c(str, "medium", true) ? l.MEDIUM : e.c(str, "large", true) ? l.LARGE : e.c(str, "hd720", true) ? l.HD720 : e.c(str, "hd1080", true) ? l.HD1080 : e.c(str, "highres", true) ? l.HIGH_RES : e.c(str, "default", true) ? l.DEFAULT : l.UNKNOWN));
    }

    @JavascriptInterface
    public final void sendPlaybackRateChange(String str) {
        h.e(str, "rate");
        this.b.post(new f(this, e.c(str, "0.25", true) ? m.RATE_0_25 : e.c(str, "0.5", true) ? m.RATE_0_5 : e.c(str, SLAConstant.TYPE_DEPRECATED_START, true) ? m.RATE_1 : e.c(str, "1.5", true) ? m.RATE_1_5 : e.c(str, "2", true) ? m.RATE_2 : m.UNKNOWN));
    }

    @JavascriptInterface
    public final void sendReady() {
        this.b.post(new b(this));
    }

    @JavascriptInterface
    public final void sendStateChange(String str) {
        h.e(str, "state");
        this.b.post(new e(this, e.c(str, "UNSTARTED", true) ? o.UNSTARTED : e.c(str, "ENDED", true) ? o.ENDED : e.c(str, "PLAYING", true) ? o.PLAYING : e.c(str, "PAUSED", true) ? o.PAUSED : e.c(str, "BUFFERING", true) ? o.BUFFERING : e.c(str, "CUED", true) ? o.VIDEO_CUED : o.UNKNOWN));
    }

    @JavascriptInterface
    public final void sendVideoCurrentTime(String str) {
        h.e(str, "seconds");
        try {
            this.b.post(new d(this, Float.parseFloat(str)));
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void sendVideoDuration(String str) {
        h.e(str, "seconds");
        try {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            this.b.post(new a(this, Float.parseFloat(str)));
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void sendVideoId(String str) {
        h.e(str, "videoId");
        this.b.post(new g(this, str));
    }

    @JavascriptInterface
    public final void sendVideoLoadedFraction(String str) {
        h.e(str, "fraction");
        try {
            this.b.post(new h(this, Float.parseFloat(str)));
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
    }

    @JavascriptInterface
    public final boolean sendYouTubeIFrameAPIReady() {
        return this.b.post(new k(this));
    }
}
