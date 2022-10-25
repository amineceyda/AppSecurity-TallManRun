package g.c.a.d.a.j;

import android.view.View;
import com.apkpure.aegon.cms.activity.PictureBrowseActivity;
import g.i.c.a.a.i.b;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ g b;

    public /* synthetic */ b(g gVar) {
        this.b = gVar;
    }

    public final void onClick(View view) {
        PictureBrowseActivity pictureBrowseActivity = ((g.c.a.d.a.b) this.b.f1936j).a;
        if (pictureBrowseActivity.x) {
            pictureBrowseActivity.A();
        } else {
            pictureBrowseActivity.z();
        }
        b.C0166b.a.j(view);
    }
}
