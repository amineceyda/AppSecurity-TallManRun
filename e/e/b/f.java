package e.e.b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import e.e.j.e;
import e.k.e;
import e.k.h;
import e.k.i;
import e.k.p;
import g.i.c.a.a.i.b;

public class f extends Activity implements h, e.a {
    public i b = new i(this);

    public boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !e.a(decorView, keyEvent)) {
            return e.b(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !e.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

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

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p.c(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        i iVar = this.b;
        e.b bVar = e.b.CREATED;
        iVar.d("markState");
        iVar.d("setCurrentState");
        iVar.g(bVar);
        super.onSaveInstanceState(bundle);
    }
}
