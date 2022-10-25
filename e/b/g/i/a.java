package e.b.g.i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import e.e.e.a.b;

public class a implements b {
    public CharSequence a;
    public CharSequence b;
    public Intent c;

    /* renamed from: d  reason: collision with root package name */
    public char f1008d;

    /* renamed from: e  reason: collision with root package name */
    public int f1009e = 4096;

    /* renamed from: f  reason: collision with root package name */
    public char f1010f;

    /* renamed from: g  reason: collision with root package name */
    public int f1011g = 4096;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f1012h;

    /* renamed from: i  reason: collision with root package name */
    public Context f1013i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1014j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1015k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f1016l = null;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f1017m = null;
    public boolean n = false;
    public boolean o = false;
    public int p = 16;

    public a(Context context, int i2, int i3, int i4, CharSequence charSequence) {
        this.f1013i = context;
        this.a = charSequence;
    }

    public b a(e.e.j.b bVar) {
        throw new UnsupportedOperationException();
    }

    public e.e.j.b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f1012h;
        if (drawable == null) {
            return;
        }
        if (this.n || this.o) {
            Drawable L0 = e.e.d.l.a.L0(drawable);
            this.f1012h = L0;
            Drawable mutate = L0.mutate();
            this.f1012h = mutate;
            if (this.n) {
                e.e.d.l.a.F0(mutate, this.f1016l);
            }
            if (this.o) {
                e.e.d.l.a.G0(this.f1012h, this.f1017m);
            }
        }
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f1011g;
    }

    public char getAlphabeticShortcut() {
        return this.f1010f;
    }

    public CharSequence getContentDescription() {
        return this.f1014j;
    }

    public int getGroupId() {
        return 0;
    }

    public Drawable getIcon() {
        return this.f1012h;
    }

    public ColorStateList getIconTintList() {
        return this.f1016l;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1017m;
    }

    public Intent getIntent() {
        return this.c;
    }

    public int getItemId() {
        return 16908332;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f1009e;
    }

    public char getNumericShortcut() {
        return this.f1008d;
    }

    public int getOrder() {
        return 0;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.a;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.b;
        return charSequence != null ? charSequence : this.a;
    }

    public CharSequence getTooltipText() {
        return this.f1015k;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.p & 1) != 0;
    }

    public boolean isChecked() {
        return (this.p & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.p & 16) != 0;
    }

    public boolean isVisible() {
        return (this.p & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.f1010f = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f1010f = Character.toLowerCase(c2);
        this.f1011g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.p = z | (this.p & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.p = (z ? 2 : 0) | (this.p & -3);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1014j = charSequence;
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public b m0setContentDescription(CharSequence charSequence) {
        this.f1014j = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.p = (z ? 16 : 0) | (this.p & -17);
        return this;
    }

    public MenuItem setIcon(int i2) {
        this.f1012h = e.e.c.a.c(this.f1013i, i2);
        c();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1012h = drawable;
        c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1016l = colorStateList;
        this.n = true;
        c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1017m = mode;
        this.o = true;
        c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.c = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.f1008d = c2;
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f1008d = c2;
        this.f1009e = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f1008d = c2;
        this.f1010f = Character.toLowerCase(c3);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f1008d = c2;
        this.f1009e = KeyEvent.normalizeMetaState(i2);
        this.f1010f = Character.toLowerCase(c3);
        this.f1011g = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    public void setShowAsAction(int i2) {
    }

    public MenuItem setShowAsActionFlags(int i2) {
        return this;
    }

    public MenuItem setTitle(int i2) {
        this.a = this.f1013i.getResources().getString(i2);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1015k = charSequence;
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public b m1setTooltipText(CharSequence charSequence) {
        this.f1015k = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i2 = 8;
        int i3 = this.p & 8;
        if (z) {
            i2 = 0;
        }
        this.p = i3 | i2;
        return this;
    }

    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
