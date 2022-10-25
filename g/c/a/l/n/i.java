package g.c.a.l.n;

import android.transition.Transition;
import com.apkpure.aegon.signstuff.view.StuffApkInstallView;
import org.slf4j.Logger;

public final class i implements Transition.TransitionListener {
    public final /* synthetic */ StuffApkInstallView a;

    public i(StuffApkInstallView stuffApkInstallView) {
        this.a = stuffApkInstallView;
    }

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionEnd(Transition transition) {
        StuffApkInstallView stuffApkInstallView = this.a;
        Logger logger = StuffApkInstallView.S;
        stuffApkInstallView.e();
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public void onTransitionStart(Transition transition) {
    }
}
