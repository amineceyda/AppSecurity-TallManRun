package e.b.g.i;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import e.b.c.g;
import e.b.g.i.e;
import e.b.g.i.m;

public class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {
    public g b;
    public g c;

    /* renamed from: d  reason: collision with root package name */
    public e f1054d;

    public h(g gVar) {
        this.b = gVar;
    }

    public void a(g gVar, boolean z) {
        g gVar2;
        if ((z || gVar == this.b) && (gVar2 = this.c) != null) {
            gVar2.dismiss();
        }
    }

    public boolean b(g gVar) {
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        this.b.r(((e.a) this.f1054d.b()).getItem(i2), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        e eVar = this.f1054d;
        g gVar = this.b;
        m.a aVar = eVar.f1038f;
        if (aVar != null) {
            aVar.a(gVar, true);
        }
    }

    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.c.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.b.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.b.performShortcut(i2, keyEvent, 0);
    }
}
