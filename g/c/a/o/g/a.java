package g.c.a.o.g;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.apkpure.aegon.cms.activity.PictureBrowseActivity;
import com.apkpure.aegon.cms.activity.picture_browse.PictureBean;
import com.apkpure.aegon.cms.activity.picture_browse.PictureBrowseConfigBean;
import g.c.a.o.g.b;
import g.i.c.a.a.i.b;
import i.o.c.h;
import i.o.c.o;
import java.util.List;
import java.util.Objects;
import org.slf4j.Logger;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ b b;
    public final /* synthetic */ o c;

    public /* synthetic */ a(b bVar, o oVar) {
        this.b = bVar;
        this.c = oVar;
    }

    public final void onClick(View view) {
        Object obj;
        b bVar = this.b;
        o oVar = this.c;
        h.e(bVar, "this$0");
        h.e(oVar, "$holder");
        b.a aVar = bVar.f2184h;
        if (aVar != null) {
            int i2 = ((c) oVar.element).f2189d;
            g.c.a.b.a.k.j.b bVar2 = (g.c.a.b.a.k.j.b) aVar;
            g.c.a.b.a.k.j.o oVar2 = bVar2.a;
            List<g.c.a.b.a.k.i.a> list = bVar2.b;
            Objects.requireNonNull(oVar2.c);
            PictureBrowseConfigBean.b bVar3 = new PictureBrowseConfigBean.b();
            int unused = bVar3.a.selectIndex = i2;
            for (g.c.a.b.a.k.i.a aVar2 : list) {
                if ("type_tube".equals(aVar2.c)) {
                    obj = aVar2.b;
                } else if ("type_img".equals(aVar2.c)) {
                    obj = aVar2.a;
                }
                bVar3.a(obj);
            }
            Activity activity = oVar2.a;
            List a = bVar3.a.pictureBeanList;
            boolean z = true;
            if (bVar3.a.selectIndex > a.size() - 1) {
                int unused2 = bVar3.a.selectIndex = 0;
            }
            if (!a.isEmpty()) {
                PictureBrowseConfigBean pictureBrowseConfigBean = bVar3.a;
                if (((PictureBean) a.get(bVar3.a.selectIndex)).type != 1) {
                    z = false;
                }
                boolean unused3 = pictureBrowseConfigBean.isAutoPlayVideo = z;
            }
            PictureBrowseConfigBean pictureBrowseConfigBean2 = bVar3.a;
            Logger logger = g.c.a.g.d.a.a;
            int i3 = PictureBrowseActivity.C;
            Intent intent = new Intent(activity, PictureBrowseActivity.class);
            intent.putExtra("key_picture_data", pictureBrowseConfigBean2);
            activity.startActivity(intent);
        }
        b.C0166b.a.j(view);
    }
}
