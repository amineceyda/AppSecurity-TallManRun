package g.c.a.d.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.apkpure.aegon.components.download.DownloadTask;
import com.apkpure.aegon.components.statistics.datong.DTStatInfo;
import com.apkpure.aegon.view.button.DownloadButton;
import com.apkpure.aegon.widgets.xlistview.XListView;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import com.tencent.trpcprotocol.projecta.common.bannerimage.nano.BannerImage;
import com.tencent.trpcprotocol.projecta.common.cmsresponse.nano.CmsItemList;
import com.tencent.trpcprotocol.projecta.common.imageinfo.nano.ImageInfo;
import com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano.SearchQueryRsp;
import g.a.a.a.a;
import g.c.a.e.k.a.f;
import g.c.a.o.g.b;
import g.c.a.o.g.c;
import i.o.c.h;
import i.o.c.o;
import java.util.List;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class e extends b<CmsItemList, c> {
    public static final Logger o = LoggerFactory.getLogger("Search|SearchResultAppAdapterLog");
    public SearchQueryRsp n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(XListView xListView, List<CmsItemList> list) {
        super(xListView, list, 0, (View) null, 12);
        h.e(xListView, "listView");
        h.e(list, "data");
    }

    public int getItemViewType(int i2) {
        CmsItemList cmsItemList = (CmsItemList) getItem(i2);
        return (cmsItemList == null ? null : cmsItemList.appInfo) == null ? 1 : 0;
    }

    public void h(c cVar, Object obj) {
        String str;
        Logger logger;
        String str2;
        String str3;
        ImageInfo imageInfo;
        ImageInfo imageInfo2;
        CmsItemList cmsItemList = (CmsItemList) obj;
        h.e(cVar, "holder");
        if (cVar.c == 1) {
            logger = o;
            str = "Convert item dat is dividing line.";
        } else {
            if ((cmsItemList == null ? null : cmsItemList.appInfo) == null) {
                logger = o;
                str = "Convert item dat is null or empty or app info is null.";
            } else {
                ImageView imageView = (ImageView) cVar.a(2131298642);
                AppDetailInfo appDetailInfo = cmsItemList.appInfo;
                if (appDetailInfo == null) {
                    o.info("Set app icon app info is null.");
                } else {
                    String str4 = appDetailInfo.iconUrl;
                    if (str4 == null) {
                        str4 = "";
                    }
                    BannerImage bannerImage = appDetailInfo.icon;
                    String str5 = (bannerImage == null || (imageInfo2 = bannerImage.original) == null) ? null : imageInfo2.url;
                    boolean z = false;
                    if (!(str5 == null || str5.length() == 0)) {
                        str2 = appDetailInfo.icon.original.url;
                        str3 = "appInfo.icon.original.url";
                    } else {
                        BannerImage bannerImage2 = appDetailInfo.icon;
                        String str6 = (bannerImage2 == null || (imageInfo = bannerImage2.thumbnail) == null) ? null : imageInfo.url;
                        if (str6 == null || str6.length() == 0) {
                            z = true;
                        }
                        if (!z) {
                            str2 = appDetailInfo.icon.thumbnail.url;
                            str3 = "appInfo.icon.thumbnail.url";
                        }
                        Logger logger2 = o;
                        StringBuilder n2 = a.n("Set app icon url[", str2, "] name[");
                        n2.append(appDetailInfo.packageName);
                        n2.append(']');
                        logger2.debug(n2.toString());
                        e.e.d.l.a.Z(imageView.getContext(), str2, imageView, e.e.d.l.a.S(2131623937));
                    }
                    h.d(str2, str3);
                    Logger logger22 = o;
                    StringBuilder n22 = a.n("Set app icon url[", str2, "] name[");
                    n22.append(appDetailInfo.packageName);
                    n22.append(']');
                    logger22.debug(n22.toString());
                    e.e.d.l.a.Z(imageView.getContext(), str2, imageView, e.e.d.l.a.S(2131623937));
                }
                cVar.b(2131298673, cmsItemList.appInfo.title);
                cVar.b(2131298674, String.valueOf(cmsItemList.appInfo.commentScore));
                DownloadButton downloadButton = (DownloadButton) cVar.a(2131296768);
                cmsItemList.appInfo.assetUsability = "REFERENCED";
                o oVar = new o();
                oVar.element = new DTStatInfo();
                if (cVar.b.getContext() != null && (cVar.b.getContext() instanceof g.c.a.g.b.a)) {
                    Context context = cVar.b.getContext();
                    Objects.requireNonNull(context, "null cannot be cast to non-null type com.apkpure.aegon.main.base.BaseActivity");
                    oVar.element = new DTStatInfo(((g.c.a.g.b.a) context).p);
                }
                ((DTStatInfo) oVar.element).appId = f.c(cmsItemList.appInfo);
                DTStatInfo dTStatInfo = (DTStatInfo) oVar.element;
                dTStatInfo.moduleName = "white_bar";
                dTStatInfo.modelType = 1045;
                dTStatInfo.position = "0";
                dTStatInfo.smallPosition = String.valueOf(cVar.f2189d + 1);
                DTStatInfo dTStatInfo2 = (DTStatInfo) oVar.element;
                dTStatInfo2.scene = 2023;
                downloadButton.f(cmsItemList.appInfo, dTStatInfo2, (DownloadTask) null);
                cVar.b.setOnClickListener(new a(cVar, oVar, cmsItemList));
                return;
            }
        }
        logger.info(str);
    }

    public c i(ViewGroup viewGroup, int i2, int i3) {
        return f(viewGroup, i2, i2 == 1 ? 2131493498 : 2131493503);
    }
}
