package com.apkpure.aegon.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.apkpure.aegon.components.models.SimpleDisplayInfo;
import com.apkpure.aegon.view.button.DownloadButton;
import com.apkpure.aegon.widgets.NestedScrollView;
import com.apkpure.aegon.widgets.flowlayout.LiteTagFlowLayout;
import g.c.a.b.a.k.f;
import g.c.a.b.a.k.j.e;
import g.c.a.b.a.k.j.g;
import g.c.a.b.a.k.j.h;
import g.c.a.b.a.k.j.i;
import g.c.a.b.a.k.j.j;
import g.c.a.b.a.k.j.o;
import g.c.a.b.a.k.j.p;
import g.c.a.b.a.k.j.r;
import g.c.a.e.b.d;
import g.c.a.g.b.a;
import g.c.a.m.k;
import g.i.c.a.a.i.b;
import java.util.HashMap;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppDetailActivity extends a {
    public static final Logger u = LoggerFactory.getLogger("AppDetailActivityLog");
    public final f r = new f();
    public r s;
    public o t;

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        b.C0166b.a.c(this, motionEvent, false, true);
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        b.C0166b.a.c(this, motionEvent, dispatchTouchEvent, false);
        return dispatchTouchEvent;
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b.C0166b.a.b(this, configuration);
    }

    public void onCreate(Bundle bundle) {
        String str;
        Logger logger;
        super.onCreate(bundle);
        Logger logger2 = u;
        logger2.info("AppDetailActivity onCreate.");
        setContentView(2131492895);
        e.e.i.b.R(this, 0, true, true);
        if (getIntent() == null || this.p == null) {
            logger2.info("initReportParams intent or pageInfo is null.");
        } else {
            String stringExtra = getIntent().getStringExtra("active_type");
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = String.valueOf(0);
            }
            g.c.a.e.h.b.a aVar = this.p;
            aVar.activeType = stringExtra;
            aVar.fastDownloadId = getIntent().getStringExtra("fast_download_id");
            this.p.recommendId = getIntent().getStringExtra("recommend_id");
        }
        this.s = new r(this, this.r);
        this.t = new o(this, this.r);
        r rVar = this.s;
        rVar.f1892e = (ViewGroup) rVar.a.findViewById(2131296416);
        rVar.f1894g = (TextView) rVar.a.findViewById(2131297707);
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) rVar.a.findViewById(2131297705)).getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).setMargins(0, k.b(rVar.a), 0, 0);
        }
        rVar.a.findViewById(2131297042).setOnClickListener(new j(rVar));
        ImageView imageView = (ImageView) rVar.a.findViewById(2131298671);
        rVar.u = imageView;
        imageView.setOnClickListener(new i(rVar));
        rVar.f1891d = (NestedScrollView) rVar.a.findViewById(2131296416);
        rVar.f1895h = (ImageView) rVar.a.findViewById(2131296425);
        rVar.f1896i = rVar.a.findViewById(2131297630);
        rVar.f1897j = (ProgressBar) rVar.a.findViewById(2131297067);
        LinearLayout linearLayout = (LinearLayout) rVar.a.findViewById(2131297002);
        rVar.f1898k = linearLayout;
        linearLayout.setVisibility(8);
        rVar.f1893f = (FrameLayout) rVar.a.findViewById(2131298625);
        rVar.f1899l = (ImageView) rVar.a.findViewById(2131296965);
        rVar.f1900m = (TextView) rVar.a.findViewById(2131296748);
        rVar.n = (LinearLayout) rVar.a.findViewById(2131297381);
        rVar.o = (TextView) rVar.a.findViewById(2131297378);
        rVar.p = (LiteTagFlowLayout) rVar.a.findViewById(2131296434);
        rVar.f1893f.getViewTreeObserver().addOnGlobalLayoutListener(new p(rVar));
        rVar.f1891d.setOnScrollChangeListener(new g(rVar));
        rVar.q = rVar.a.findViewById(2131298648);
        rVar.r = (TextView) rVar.a.findViewById(2131297059);
        rVar.a.findViewById(2131297058).setOnClickListener(new h(rVar));
        rVar.f1897j.setVisibility(0);
        rVar.f1897j.postInvalidate();
        rVar.q.setVisibility(8);
        d.c(rVar.b).b(rVar.v);
        rVar.t = (DownloadButton) rVar.a.findViewById(2131298635);
        View findViewById = rVar.a.findViewById(2131298620);
        rVar.s = findViewById;
        findViewById.setVisibility(8);
        Activity activity = rVar.a;
        if (activity instanceof a) {
            a aVar2 = (a) activity;
            HashMap<String, Object> q = aVar2.q();
            q.put("scene", 2007L);
            g.c.a.e.h.b.a aVar3 = aVar2.p;
            if (aVar3 != null) {
                q.put("active_type", aVar3.activeType);
                q.put("fast_download_id", aVar3.fastDownloadId);
                q.put("recommend_id", aVar3.recommendId);
                q.put("package_name", rVar.c.f());
            }
            g.c.a.e.h.b.d.g(rVar.f1892e, "scene", q);
        }
        o oVar = this.t;
        LinearLayout linearLayout2 = (LinearLayout) oVar.a.findViewById(2131298620);
        oVar.f1881d = linearLayout2;
        linearLayout2.setMinimumHeight(k.a(oVar.a));
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) oVar.a.findViewById(2131296897);
        oVar.f1882e = horizontalScrollView;
        if (Build.VERSION.SDK_INT >= 21) {
            horizontalScrollView.setNestedScrollingEnabled(false);
        }
        View findViewById2 = oVar.a.findViewById(2131296734);
        oVar.f1883f = findViewById2;
        findViewById2.setVisibility(0);
        oVar.f1884g = (TextView) oVar.a.findViewById(2131296733);
        oVar.f1885h = (LiteTagFlowLayout) oVar.a.findViewById(2131296407);
        oVar.f1886i = oVar.a.findViewById(2131296732);
        oVar.f1887j = (TextView) oVar.a.findViewById(2131296731);
        oVar.f1888k = (ImageView) oVar.a.findViewById(2131296730);
        oVar.G = oVar.f1884g.getMaxLines();
        ViewStub viewStub = (ViewStub) oVar.a.findViewById(2131296742);
        oVar.f1889l = viewStub;
        viewStub.inflate();
        oVar.f1890m = oVar.a.findViewById(2131296999);
        oVar.n = (TextView) oVar.a.findViewById(2131297860);
        oVar.o = (ImageView) oVar.a.findViewById(2131296856);
        oVar.p = (TextView) oVar.a.findViewById(2131297800);
        oVar.q = (TextView) oVar.a.findViewById(2131297561);
        oVar.r = (TextView) oVar.a.findViewById(2131297269);
        oVar.s = (TextView) oVar.a.findViewById(2131297763);
        oVar.t = (TextView) oVar.a.findViewById(2131296536);
        oVar.u = (TextView) oVar.a.findViewById(2131296537);
        oVar.v = (TextView) oVar.a.findViewById(2131296901);
        oVar.w = (TextView) oVar.a.findViewById(2131297578);
        oVar.x = oVar.a.findViewById(2131297896);
        oVar.y = (TextView) oVar.a.findViewById(2131297782);
        oVar.z = (TextView) oVar.a.findViewById(2131297799);
        oVar.A = (TextView) oVar.a.findViewById(2131297895);
        oVar.B = oVar.a.findViewById(2131297894);
        oVar.C = oVar.a.findViewById(2131297893);
        oVar.E = (ImageView) oVar.a.findViewById(2131297891);
        oVar.D = (TextView) oVar.a.findViewById(2131297892);
        oVar.F = oVar.A.getMaxLines();
        oVar.a.findViewById(2131296870).setOnClickListener(new e(oVar));
        oVar.I = new Handler(Looper.getMainLooper());
        f fVar = this.r;
        Intent intent = getIntent();
        fVar.c = new g.c.a.b.a.a(this);
        if (intent == null) {
            logger = f.f1878d;
            str = "parseAppInfoFromIntent intent is null.";
        } else {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                logger = f.f1878d;
                str = "parseAppInfoFromIntent bundle is null.";
            } else {
                try {
                    fVar.a = (SimpleDisplayInfo) g.c.a.e.k.h.b.b(extras.getString("transmit_app_info_tag"), SimpleDisplayInfo.class);
                } catch (Exception e2) {
                    f.f1878d.warn("parseAppInfoFromIntent Exception", (Throwable) e2);
                }
                f.a aVar4 = f.a.parse;
                g.c.a.m.e<f.a> eVar = fVar.c;
                if (eVar != null) {
                    eVar.a(aVar4);
                }
                fVar.a();
                u.info("AppDetailActivity onCreate end.");
            }
        }
        logger.info(str);
        fVar.a();
        u.info("AppDetailActivity onCreate end.");
    }

    public void onDestroy() {
        super.onDestroy();
        f fVar = this.r;
        fVar.b = null;
        fVar.c = null;
        r rVar = this.s;
        d.c(rVar.b).e(rVar.v);
        Objects.requireNonNull(this.t);
    }

    public String r() {
        return "page_detail";
    }

    public long s() {
        return 2008;
    }
}
