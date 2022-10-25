package g.c.a.l.n;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.apkpure.aegon.signstuff.view.StuffApkInstallView;
import com.bumptech.glide.load.engine.GlideException;
import g.c.a.e.k.g.e;

public final class m implements e {
    public final /* synthetic */ StuffApkInstallView a;

    public m(StuffApkInstallView stuffApkInstallView) {
        this.a = stuffApkInstallView;
    }

    public void a(GlideException glideException) {
    }

    public void b(Drawable drawable) {
        ImageView imageView = this.a.f281g;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }
}
