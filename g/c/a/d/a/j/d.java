package g.c.a.d.a.j;

import android.view.View;
import com.apkpure.aegon.cms.activity.PictureBrowseActivity;
import g.c.a.d.a.b;
import g.i.c.a.a.i.b;

public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ k b;

    public /* synthetic */ d(k kVar) {
        this.b = kVar;
    }

    public final void onClick(View view) {
        PictureBrowseActivity pictureBrowseActivity = ((b) this.b.f1947m).a;
        if (pictureBrowseActivity.x) {
            pictureBrowseActivity.A();
        } else {
            pictureBrowseActivity.z();
        }
        b.C0166b.a.j(view);
    }
}
