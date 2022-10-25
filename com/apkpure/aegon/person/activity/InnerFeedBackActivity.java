package com.apkpure.aegon.person.activity;

import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.apkpure.aegon.view.button.DownloadButton;
import g.c.a.g.b.a;
import g.c.a.i.d;
import g.c.a.j.a.c;
import g.c.a.j.b.b;
import g.i.c.a.a.i.b;
import i.o.c.h;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class InnerFeedBackActivity extends a {
    @Deprecated
    public static final Logger t = LoggerFactory.getLogger("Developer|InnerFeedBackActivity");
    public g.c.a.f.a r;
    public b s;

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
        super.onCreate(bundle);
        Boolean bool = null;
        View inflate = LayoutInflater.from(this).inflate(2131493486, (ViewGroup) null);
        setContentView(inflate);
        int i2 = 2131296674;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(2131296674);
        if (frameLayout != null) {
            DownloadButton downloadButton = (DownloadButton) inflate.findViewById(2131298634);
            if (downloadButton != null) {
                ImageView imageView = (ImageView) inflate.findViewById(2131297042);
                if (imageView != null) {
                    g.c.a.f.a aVar = new g.c.a.f.a((LinearLayout) inflate, frameLayout, downloadButton, imageView);
                    this.r = aVar;
                    if (!(aVar == null || imageView == null)) {
                        imageView.setOnClickListener(new g.c.a.j.a.a(this));
                    }
                    if (this.s == null) {
                        this.s = new g.c.a.j.b.b();
                    }
                    g.c.a.j.b.b bVar = this.s;
                    if (bVar != null) {
                        bool = Boolean.valueOf(bVar.isAdded());
                    }
                    if (!h.a(bool, Boolean.TRUE)) {
                        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
                        g.c.a.j.b.b bVar2 = this.s;
                        h.c(bVar2);
                        beginTransaction.add(2131296674, bVar2).commit();
                    }
                    FragmentTransaction beginTransaction2 = getFragmentManager().beginTransaction();
                    g.c.a.j.b.b bVar3 = this.s;
                    h.c(bVar3);
                    beginTransaction2.show(bVar3);
                    d dVar = new d();
                    dVar.d("android.permission.WRITE_EXTERNAL_STORAGE");
                    dVar.b(new c());
                    dVar.e(this, 100);
                    return;
                }
                i2 = 2131297042;
            } else {
                i2 = 2131298634;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
