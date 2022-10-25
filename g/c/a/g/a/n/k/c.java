package g.c.a.g.a.n.k;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.apkpure.aegon.components.statistics.datong.DTStatInfo;
import com.apkpure.aegon.view.button.DownloadButton;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import g.c.a.f.k;
import g.c.a.g.b.a;
import i.o.c.f;
import i.o.c.h;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class c extends a {

    /* renamed from: g  reason: collision with root package name */
    public final Logger f2022g = LoggerFactory.getLogger("HorizontalAppCardViewHolder");

    /* renamed from: h  reason: collision with root package name */
    public AppDetailInfo f2023h;

    /* renamed from: i  reason: collision with root package name */
    public final k f2024i;

    /* renamed from: j  reason: collision with root package name */
    public DTStatInfo f2025j;

    public c(View view, int i2, int i3, f fVar) {
        super(view, i2, i3);
        int i4 = 2131298169;
        ImageView imageView = (ImageView) view.findViewById(2131298169);
        if (imageView != null) {
            i4 = 2131298623;
            TextView textView = (TextView) view.findViewById(2131298623);
            if (textView != null) {
                i4 = 2131298629;
                ImageView imageView2 = (ImageView) view.findViewById(2131298629);
                if (imageView2 != null) {
                    i4 = 2131296768;
                    DownloadButton downloadButton = (DownloadButton) view.findViewById(2131296768);
                    if (downloadButton != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        k kVar = new k(linearLayout, imageView, textView, imageView2, downloadButton, linearLayout);
                        h.d(kVar, "bind(itemView)");
                        this.f2024i = kVar;
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
            ((a) context).w(g.c.a.e.h.b.a.a(this.f2025j));
        }
        AppDetailInfo appDetailInfo = this.f2023h;
        Context context2 = this.f2190e;
        if (context2 != null && appDetailInfo != null) {
            g.c.a.g.d.a.b(context2, appDetailInfo);
        }
    }
}
