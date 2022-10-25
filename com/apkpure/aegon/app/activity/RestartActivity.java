package com.apkpure.aegon.app.activity;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;
import g.c.a.b.a.h;
import g.c.a.e.j.a;
import g.i.c.a.a.i.b;

public final class RestartActivity extends Activity {
    public static final /* synthetic */ int b = 0;

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
        TextView textView = new TextView(this);
        textView.setText(2131821809);
        textView.setGravity(17);
        setContentView(textView);
        a.c().postDelayed(new h(this), 3000);
    }
}
