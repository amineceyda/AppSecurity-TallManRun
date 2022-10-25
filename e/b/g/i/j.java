package e.b.g.i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import e.e.j.b;
import java.lang.reflect.Method;

public class j extends c implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    public final e.e.e.a.b f1065d;

    /* renamed from: e  reason: collision with root package name */
    public Method f1066e;

    public class a extends e.e.j.b {
        public final ActionProvider b;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.b = actionProvider;
        }

        public boolean a() {
            return this.b.hasSubMenu();
        }

        public View c() {
            return this.b.onCreateActionView();
        }

        public boolean e() {
            return this.b.onPerformDefaultAction();
        }

        public void f(SubMenu subMenu) {
            this.b.onPrepareSubMenu(j.this.d(subMenu));
        }
    }

    public class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: d  reason: collision with root package name */
        public b.a f1067d;

        public b(j jVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        public boolean b() {
            return this.b.isVisible();
        }

        public View d(MenuItem menuItem) {
            return this.b.onCreateActionView(menuItem);
        }

        public boolean g() {
            return this.b.overridesItemVisibility();
        }

        public void h(b.a aVar) {
            this.f1067d = aVar;
            this.b.setVisibilityListener(this);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            b.a aVar = this.f1067d;
            if (aVar != null) {
                g gVar = i.this.n;
                gVar.f1048h = true;
                gVar.q(true);
            }
        }
    }

    public static class c extends FrameLayout implements e.b.g.b {
        public final CollapsibleActionView b;

        public c(View view) {
            super(view.getContext());
            this.b = (CollapsibleActionView) view;
            addView(view);
        }

        public void c() {
            this.b.onActionViewExpanded();
        }

        public void d() {
            this.b.onActionViewCollapsed();
        }
    }

    public class d implements MenuItem.OnActionExpandListener {
        public final MenuItem.OnActionExpandListener a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.a.onMenuItemActionCollapse(j.this.c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.a.onMenuItemActionExpand(j.this.c(menuItem));
        }
    }

    public class e implements MenuItem.OnMenuItemClickListener {
        public final MenuItem.OnMenuItemClickListener a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.a.onMenuItemClick(j.this.c(menuItem));
        }
    }

    public j(Context context, e.e.e.a.b bVar) {
        super(context);
        if (bVar != null) {
            this.f1065d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f1065d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f1065d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        e.e.j.b b2 = this.f1065d.b();
        if (b2 instanceof a) {
            return ((a) b2).b;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f1065d.getActionView();
        return actionView instanceof c ? (View) ((c) actionView).b : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f1065d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f1065d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f1065d.getContentDescription();
    }

    public int getGroupId() {
        return this.f1065d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f1065d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f1065d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1065d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f1065d.getIntent();
    }

    public int getItemId() {
        return this.f1065d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1065d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f1065d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f1065d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f1065d.getOrder();
    }

    public SubMenu getSubMenu() {
        return d(this.f1065d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f1065d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f1065d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f1065d.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.f1065d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f1065d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f1065d.isCheckable();
    }

    public boolean isChecked() {
        return this.f1065d.isChecked();
    }

    public boolean isEnabled() {
        return this.f1065d.isEnabled();
    }

    public boolean isVisible() {
        return this.f1065d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this, this.a, actionProvider);
        e.e.e.a.b bVar2 = this.f1065d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    public MenuItem setActionView(int i2) {
        this.f1065d.setActionView(i2);
        View actionView = this.f1065d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f1065d.setActionView((View) new c(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f1065d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.f1065d.setAlphabeticShortcut(c2);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f1065d.setAlphabeticShortcut(c2, i2);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f1065d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f1065d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1065d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1065d.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i2) {
        this.f1065d.setIcon(i2);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1065d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1065d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1065d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1065d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.f1065d.setNumericShortcut(c2);
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f1065d.setNumericShortcut(c2, i2);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1065d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1065d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f1065d.setShortcut(c2, c3);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f1065d.setShortcut(c2, c3, i2, i3);
        return this;
    }

    public void setShowAsAction(int i2) {
        this.f1065d.setShowAsAction(i2);
    }

    public MenuItem setShowAsActionFlags(int i2) {
        this.f1065d.setShowAsActionFlags(i2);
        return this;
    }

    public MenuItem setTitle(int i2) {
        this.f1065d.setTitle(i2);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1065d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1065d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1065d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f1065d.setVisible(z);
    }
}
