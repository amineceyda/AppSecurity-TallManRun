package g.c.a.g.a.n.k;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.apkpure.aegon.components.statistics.datong.DTStatInfo;
import com.apkpure.aegon.view.button.DownloadButton;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import com.tencent.trpcprotocol.projecta.common.card_data.nano.CardData;
import com.tencent.trpcprotocol.projecta.common.common_card.nano.CommonCardItem;
import g.c.a.f.j;
import g.c.a.g.b.a;
import i.o.c.f;
import i.o.c.h;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class b extends a {

    /* renamed from: g  reason: collision with root package name */
    public final Logger f2018g = LoggerFactory.getLogger("HorizontalAppCardViewHolder");

    /* renamed from: h  reason: collision with root package name */
    public AppDetailInfo f2019h;

    /* renamed from: i  reason: collision with root package name */
    public final j f2020i;

    /* renamed from: j  reason: collision with root package name */
    public DTStatInfo f2021j;

    public b(View view, int i2, int i3, f fVar) {
        super(view, i2, i3);
        int i4 = 2131298169;
        ImageView imageView = (ImageView) view.findViewById(2131298169);
        if (imageView != null) {
            i4 = 2131298623;
            TextView textView = (TextView) view.findViewById(2131298623);
            if (textView != null) {
                i4 = 2131298624;
                TextView textView2 = (TextView) view.findViewById(2131298624);
                if (textView2 != null) {
                    i4 = 2131296768;
                    DownloadButton downloadButton = (DownloadButton) view.findViewById(2131296768);
                    if (downloadButton != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        j jVar = new j(linearLayout, imageView, textView, textView2, downloadButton, linearLayout);
                        h.d(jVar, "bind(itemView)");
                        this.f2020i = jVar;
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    public void c(View view, int i2) {
        h.e(view, "v");
        if (view.getContext() != null && (view.getContext() instanceof a)) {
            Context context = view.getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type com.apkpure.aegon.main.base.BaseActivity");
            ((a) context).w(g.c.a.e.h.b.a.a(this.f2021j));
        }
        AppDetailInfo appDetailInfo = this.f2019h;
        Context context2 = this.f2190e;
        if (context2 != null && appDetailInfo != null) {
            g.c.a.g.d.a.b(context2, appDetailInfo);
        }
    }

    public void f(CommonCardItem commonCardItem, DTStatInfo dTStatInfo) {
        Logger logger;
        Object obj;
        String str;
        h.e(dTStatInfo, "dtStatInfo");
        this.f2021j = dTStatInfo;
        Double d2 = null;
        boolean z = true;
        if ((commonCardItem == null ? null : commonCardItem.data) == null) {
            logger = this.f2018g;
            if (commonCardItem != null) {
                z = false;
            }
            obj = Boolean.valueOf(z);
            str = "MainTabCardsAdapter onBindViewHolder item is empty: {}";
        } else {
            CardData[] cardDataArr = commonCardItem.data;
            h.d(cardDataArr, "item.data");
            if (cardDataArr.length != 0) {
                z = false;
            }
            if (!z) {
                CardData[] cardDataArr2 = commonCardItem.data;
                if (cardDataArr2[0].appInfo != null) {
                    AppDetailInfo appDetailInfo = cardDataArr2[0].appInfo;
                    this.f2019h = appDetailInfo;
                    this.f2020i.b.setText(appDetailInfo == null ? null : appDetailInfo.title);
                    TextView textView = this.f2020i.c;
                    AppDetailInfo appDetailInfo2 = this.f2019h;
                    if (appDetailInfo2 != null) {
                        d2 = Double.valueOf(appDetailInfo2.commentScore);
                    }
                    textView.setText(String.valueOf(d2));
                    ImageView imageView = this.f2020i.a;
                    h.d(imageView, "binding.appIcon");
                    d(imageView, this.f2019h);
                    DownloadButton downloadButton = this.f2020i.f2005d;
                    h.d(downloadButton, "binding.downloadButton");
                    e(downloadButton, this.f2019h, this.f2189d, dTStatInfo);
                    return;
                }
            }
            logger = this.f2018g;
            obj = Integer.valueOf(commonCardItem.data.length);
            str = "MainTabCardsAdapter onBindViewHolder item.data is empty: {}";
        }
        logger.info(str, obj);
    }
}
