package g.c.a.g.a.n.k;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.apkpure.aegon.components.download.DownloadTask;
import com.apkpure.aegon.components.statistics.datong.DTStatInfo;
import com.apkpure.aegon.view.button.DownloadButton;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import com.tencent.trpcprotocol.projecta.common.bannerimage.nano.BannerImage;
import com.tencent.trpcprotocol.projecta.common.imageinfo.nano.ImageInfo;
import g.c.a.o.g.c;
import g.i.c.a.a.i.b;
import i.o.c.h;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class a extends c implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final Logger f2017f = LoggerFactory.getLogger("HorizontalAppCardViewHolder");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view, int i2, int i3) {
        super(view, i2, i3);
        h.e(view, "itemView");
        view.setOnClickListener(this);
    }

    public abstract void c(View view, int i2);

    public final void d(ImageView imageView, AppDetailInfo appDetailInfo) {
        String str;
        h.e(imageView, "view");
        h.c(appDetailInfo);
        BannerImage bannerImage = appDetailInfo.icon;
        if (bannerImage != null) {
            ImageInfo imageInfo = bannerImage.original;
            if (imageInfo != null) {
                str = imageInfo.url;
            } else {
                ImageInfo imageInfo2 = bannerImage.thumbnail;
                if (imageInfo2 != null) {
                    str = imageInfo2.url;
                } else if (!TextUtils.isEmpty(appDetailInfo.iconUrl)) {
                    str = appDetailInfo.iconUrl;
                }
            }
            Context context = this.f2190e;
            h.c(context);
            h.c(str);
            e.e.d.l.a.Z(context, str, imageView, e.e.d.l.a.S(2131623937));
        }
        str = "";
        Context context2 = this.f2190e;
        h.c(context2);
        h.c(str);
        e.e.d.l.a.Z(context2, str, imageView, e.e.d.l.a.S(2131623937));
    }

    public final void e(DownloadButton downloadButton, AppDetailInfo appDetailInfo, int i2, DTStatInfo dTStatInfo) {
        h.e(downloadButton, "downloadButton");
        h.e(dTStatInfo, "dtStatInfo");
        h.c(appDetailInfo);
        appDetailInfo.assetUsability = "REFERENCED";
        dTStatInfo.scene = 2004;
        dTStatInfo.smallPosition = String.valueOf(i2 + 1);
        downloadButton.k();
        downloadButton.f(appDetailInfo, dTStatInfo, (DownloadTask) null);
    }

    public void onClick(View view) {
        h.e(view, "v");
        c(view, this.f2189d);
        b.C0166b.a.j(view);
    }
}
