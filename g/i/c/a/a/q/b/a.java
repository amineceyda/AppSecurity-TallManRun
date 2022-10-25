package g.i.c.a.a.q.b;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import g.c.b.b.f;
import g.i.c.a.a.b0.n;
import g.i.c.a.a.i.b;
import g.i.c.a.a.r.e;
import java.util.Objects;

public class a extends Dialog {
    public a(Context context, int i2) {
        super(context, i2);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        b bVar = b.C0166b.a;
        Objects.requireNonNull(bVar);
        bVar.a(this, getWindow(), motionEvent, false, true);
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        b bVar2 = b.C0166b.a;
        Objects.requireNonNull(bVar2);
        bVar2.a(this, getWindow(), motionEvent, dispatchTouchEvent, false);
        return dispatchTouchEvent;
    }

    public void onStop() {
        super.onStop();
        b bVar = b.C0166b.a;
        Objects.requireNonNull(bVar);
        Activity a = g.i.c.a.a.s.a.a(this);
        e eVar = e.b.a;
        if (eVar.a) {
            StringBuilder i2 = g.a.a.a.a.i("onDialogStop: dialog = ");
            i2.append(getClass().getName());
            i2.append(", activity = ");
            Rect rect = n.a;
            i2.append(a == null ? "null" : a.getClass().getSimpleName());
            f.K("EventCollector", i2.toString());
        }
        if (eVar.i()) {
            g.i.c.a.a.s.a.d(this);
            bVar.b.l(a, this);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        b bVar = b.C0166b.a;
        Objects.requireNonNull(bVar);
        Activity a = g.i.c.a.a.s.a.a(this);
        e eVar = e.b.a;
        if (eVar.a) {
            StringBuilder i2 = g.a.a.a.a.i("onDialogFocusChanged: dialog = ");
            i2.append(getClass().getName());
            i2.append(", hasFocus = ");
            i2.append(z);
            i2.append(", activity = ");
            Rect rect = n.a;
            i2.append(a == null ? "null" : a.getClass().getSimpleName());
            f.K("EventCollector", i2.toString());
        }
        if (!eVar.i() || a == null) {
            return;
        }
        if (z) {
            g.i.c.a.a.s.a.c(this);
            bVar.b.m(a, this);
            return;
        }
        bVar.b.l(a, this);
    }
}
