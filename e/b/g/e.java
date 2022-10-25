package e.b.g;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import e.b.g.a;
import e.b.g.i.j;
import e.b.g.i.o;
import e.d.g;
import e.e.e.a.b;
import java.util.ArrayList;

public class e extends ActionMode {
    public final Context a;
    public final a b;

    public static class a implements a.C0036a {
        public final ActionMode.Callback a;
        public final Context b;
        public final ArrayList<e> c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final g<Menu, Menu> f991d = new g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        public boolean a(a aVar, Menu menu) {
            return this.a.onPrepareActionMode(e(aVar), f(menu));
        }

        public void b(a aVar) {
            this.a.onDestroyActionMode(e(aVar));
        }

        public boolean c(a aVar, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(aVar), new j(this.b, (b) menuItem));
        }

        public boolean d(a aVar, Menu menu) {
            return this.a.onCreateActionMode(e(aVar), f(menu));
        }

        public ActionMode e(a aVar) {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                e eVar = this.c.get(i2);
                if (eVar != null && eVar.b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.b, aVar);
            this.c.add(eVar2);
            return eVar2;
        }

        public final Menu f(Menu menu) {
            Menu orDefault = this.f991d.getOrDefault(menu, null);
            if (orDefault != null) {
                return orDefault;
            }
            o oVar = new o(this.b, (e.e.e.a.a) menu);
            this.f991d.put(menu, oVar);
            return oVar;
        }
    }

    public e(Context context, a aVar) {
        this.a = context;
        this.b = aVar;
    }

    public void finish() {
        this.b.c();
    }

    public View getCustomView() {
        return this.b.d();
    }

    public Menu getMenu() {
        return new o(this.a, (e.e.e.a.a) this.b.e());
    }

    public MenuInflater getMenuInflater() {
        return this.b.f();
    }

    public CharSequence getSubtitle() {
        return this.b.g();
    }

    public Object getTag() {
        return this.b.b;
    }

    public CharSequence getTitle() {
        return this.b.h();
    }

    public boolean getTitleOptionalHint() {
        return this.b.c;
    }

    public void invalidate() {
        this.b.i();
    }

    public boolean isTitleOptional() {
        return this.b.j();
    }

    public void setCustomView(View view) {
        this.b.k(view);
    }

    public void setSubtitle(int i2) {
        this.b.l(i2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.b.m(charSequence);
    }

    public void setTag(Object obj) {
        this.b.b = obj;
    }

    public void setTitle(int i2) {
        this.b.n(i2);
    }

    public void setTitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.b.p(z);
    }
}
