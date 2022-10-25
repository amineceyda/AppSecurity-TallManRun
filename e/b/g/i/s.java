package e.b.g.i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import e.e.e.a.c;

public class s extends o implements SubMenu {

    /* renamed from: e  reason: collision with root package name */
    public final c f1088e;

    public s(Context context, c cVar) {
        super(context, cVar);
        this.f1088e = cVar;
    }

    public void clearHeader() {
        this.f1088e.clearHeader();
    }

    public MenuItem getItem() {
        return c(this.f1088e.getItem());
    }

    public SubMenu setHeaderIcon(int i2) {
        this.f1088e.setHeaderIcon(i2);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f1088e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i2) {
        this.f1088e.setHeaderTitle(i2);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f1088e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f1088e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i2) {
        this.f1088e.setIcon(i2);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f1088e.setIcon(drawable);
        return this;
    }
}
