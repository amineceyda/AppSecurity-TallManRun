package e.b.g;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuPresenter;
import e.b.g.a;
import e.b.g.i.g;
import java.lang.ref.WeakReference;

public class d extends a implements g.a {

    /* renamed from: d  reason: collision with root package name */
    public Context f985d;

    /* renamed from: e  reason: collision with root package name */
    public ActionBarContextView f986e;

    /* renamed from: f  reason: collision with root package name */
    public a.C0036a f987f;

    /* renamed from: g  reason: collision with root package name */
    public WeakReference<View> f988g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f989h;

    /* renamed from: i  reason: collision with root package name */
    public g f990i;

    public d(Context context, ActionBarContextView actionBarContextView, a.C0036a aVar, boolean z) {
        this.f985d = context;
        this.f986e = actionBarContextView;
        this.f987f = aVar;
        g gVar = new g(actionBarContextView.getContext());
        gVar.f1052l = 1;
        this.f990i = gVar;
        gVar.f1045e = this;
    }

    public boolean a(g gVar, MenuItem menuItem) {
        return this.f987f.c(this, menuItem);
    }

    public void b(g gVar) {
        i();
        ActionMenuPresenter actionMenuPresenter = this.f986e.f1090e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.n();
        }
    }

    public void c() {
        if (!this.f989h) {
            this.f989h = true;
            this.f986e.sendAccessibilityEvent(32);
            this.f987f.b(this);
        }
    }

    public View d() {
        WeakReference<View> weakReference = this.f988g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public Menu e() {
        return this.f990i;
    }

    public MenuInflater f() {
        return new f(this.f986e.getContext());
    }

    public CharSequence g() {
        return this.f986e.getSubtitle();
    }

    public CharSequence h() {
        return this.f986e.getTitle();
    }

    public void i() {
        this.f987f.a(this, this.f990i);
    }

    public boolean j() {
        return this.f986e.t;
    }

    public void k(View view) {
        this.f986e.setCustomView(view);
        this.f988g = view != null ? new WeakReference<>(view) : null;
    }

    public void l(int i2) {
        this.f986e.setSubtitle(this.f985d.getString(i2));
    }

    public void m(CharSequence charSequence) {
        this.f986e.setSubtitle(charSequence);
    }

    public void n(int i2) {
        this.f986e.setTitle(this.f985d.getString(i2));
    }

    public void o(CharSequence charSequence) {
        this.f986e.setTitle(charSequence);
    }

    public void p(boolean z) {
        this.c = z;
        this.f986e.setTitleOptional(z);
    }
}
