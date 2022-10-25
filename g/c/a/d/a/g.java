package g.c.a.d.a;

import androidx.viewpager.widget.ViewPager;
import com.apkpure.aegon.cms.activity.PictureBrowseActivity;

public class g implements ViewPager.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ PictureBrowseActivity b;

    public g(PictureBrowseActivity pictureBrowseActivity, int i2) {
        this.b = pictureBrowseActivity;
        this.a = i2;
    }

    public void a(int i2, float f2, int i3) {
        this.b.u.setBackgroundResource(2131099690);
    }

    public void b(int i2) {
        this.b.u.setBackgroundResource(2131099690);
    }

    public void c(int i2) {
        PictureBrowseActivity pictureBrowseActivity = this.b;
        pictureBrowseActivity.w = i2;
        pictureBrowseActivity.t.setText(String.format("%s/%s", new Object[]{Integer.valueOf(i2 + 1), Integer.valueOf(this.a)}));
    }
}
