package g.c.a.o.c;

import android.animation.Animator;
import android.app.Activity;
import com.apkpure.aegon.cms.activity.PictureBrowseActivity;
import com.apkpure.aegon.widgets.layout.FingerFrameLayout;

public class c implements Animator.AnimatorListener {
    public final /* synthetic */ FingerFrameLayout a;

    public c(FingerFrameLayout fingerFrameLayout) {
        this.a = fingerFrameLayout;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        FingerFrameLayout fingerFrameLayout = this.a;
        if (fingerFrameLayout.f313h) {
            FingerFrameLayout.a(fingerFrameLayout);
            FingerFrameLayout.a aVar = this.a.f314i;
            if (aVar != null) {
                PictureBrowseActivity.a aVar2 = (PictureBrowseActivity.a) aVar;
                PictureBrowseActivity pictureBrowseActivity = PictureBrowseActivity.this;
                int i2 = PictureBrowseActivity.C;
                Activity activity = pictureBrowseActivity.o;
                if (activity != null && !activity.isFinishing()) {
                    PictureBrowseActivity.this.onBackPressed();
                }
            }
            this.a.f313h = false;
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        this.a.f313h = true;
    }
}
