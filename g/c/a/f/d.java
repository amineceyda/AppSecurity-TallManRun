package g.c.a.f;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.apkpure.aegon.signstuff.view.StuffApkInstallView;

public final class d {
    public final StuffApkInstallView a;

    public d(RelativeLayout relativeLayout, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, StuffApkInstallView stuffApkInstallView) {
        this.a = stuffApkInstallView;
    }

    public static d a(View view) {
        int i2 = 2131297117;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(2131297117);
        if (frameLayout != null) {
            i2 = 2131297587;
            ImageView imageView = (ImageView) view.findViewById(2131297587);
            if (imageView != null) {
                i2 = 2131298582;
                ImageView imageView2 = (ImageView) view.findViewById(2131298582);
                if (imageView2 != null) {
                    i2 = 2131298670;
                    StuffApkInstallView stuffApkInstallView = (StuffApkInstallView) view.findViewById(2131298670);
                    if (stuffApkInstallView != null) {
                        return new d((RelativeLayout) view, frameLayout, imageView, imageView2, stuffApkInstallView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
