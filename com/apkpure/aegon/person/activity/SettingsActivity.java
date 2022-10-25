package com.apkpure.aegon.person.activity;

import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import g.c.a.f.c;
import g.c.a.g.b.a;
import g.c.a.j.c.h;
import g.i.c.a.a.i.b;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class SettingsActivity extends a {
    public static final Logger t = LoggerFactory.getLogger("Settings|SettingsActivityLog");
    public c r;
    public h s;

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
        setContentView(2131493488);
        Boolean bool = null;
        View inflate = getLayoutInflater().inflate(2131493488, (ViewGroup) null);
        setContentView(inflate);
        int i2 = 2131296674;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(2131296674);
        if (frameLayout != null) {
            ImageView imageView = (ImageView) inflate.findViewById(2131297042);
            if (imageView != null) {
                c cVar = new c((LinearLayout) inflate, frameLayout, imageView);
                this.r = cVar;
                if (!(cVar == null || imageView == null)) {
                    imageView.setOnClickListener(new g.c.a.j.a.b(this));
                }
                if (this.s == null) {
                    this.s = new h();
                }
                h hVar = this.s;
                if (hVar != null) {
                    bool = Boolean.valueOf(hVar.isAdded());
                }
                if (!i.o.c.h.a(bool, Boolean.TRUE)) {
                    FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
                    h hVar2 = this.s;
                    i.o.c.h.c(hVar2);
                    beginTransaction.add(2131296674, hVar2).commit();
                }
                FragmentTransaction beginTransaction2 = getFragmentManager().beginTransaction();
                h hVar3 = this.s;
                i.o.c.h.c(hVar3);
                beginTransaction2.show(hVar3);
                return;
            }
            i2 = 2131297042;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
