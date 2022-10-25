package e.b.g.i;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.view.menu.ExpandedMenuView;
import e.b.c.g;
import e.b.g.i.m;
import e.b.g.i.n;
import g.i.c.a.a.i.b;
import java.util.ArrayList;
import java.util.Objects;

public class e implements m, AdapterView.OnItemClickListener {
    public Context b;
    public LayoutInflater c;

    /* renamed from: d  reason: collision with root package name */
    public g f1036d;

    /* renamed from: e  reason: collision with root package name */
    public ExpandedMenuView f1037e;

    /* renamed from: f  reason: collision with root package name */
    public m.a f1038f;

    /* renamed from: g  reason: collision with root package name */
    public a f1039g;

    public class a extends BaseAdapter {
        public int b = -1;

        public a() {
            a();
        }

        public void a() {
            g gVar = e.this.f1036d;
            i iVar = gVar.v;
            if (iVar != null) {
                gVar.i();
                ArrayList<i> arrayList = gVar.f1050j;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (arrayList.get(i2) == iVar) {
                        this.b = i2;
                        return;
                    }
                }
            }
            this.b = -1;
        }

        /* renamed from: b */
        public i getItem(int i2) {
            g gVar = e.this.f1036d;
            gVar.i();
            ArrayList<i> arrayList = gVar.f1050j;
            Objects.requireNonNull(e.this);
            int i3 = i2 + 0;
            int i4 = this.b;
            if (i4 >= 0 && i3 >= i4) {
                i3++;
            }
            return arrayList.get(i3);
        }

        public int getCount() {
            g gVar = e.this.f1036d;
            gVar.i();
            int size = gVar.f1050j.size();
            Objects.requireNonNull(e.this);
            int i2 = size + 0;
            return this.b < 0 ? i2 : i2 - 1;
        }

        public long getItemId(int i2) {
            return (long) i2;
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = e.this.c.inflate(2131492880, viewGroup, false);
            }
            ((n.a) view).c(getItem(i2), 0);
            b.C0166b.a.h(i2, view, viewGroup, (long) i2);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(Context context, int i2) {
        this.b = context;
        this.c = LayoutInflater.from(context);
    }

    public void a(g gVar, boolean z) {
        m.a aVar = this.f1038f;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    public ListAdapter b() {
        if (this.f1039g == null) {
            this.f1039g = new a();
        }
        return this.f1039g;
    }

    public void c(Context context, g gVar) {
        if (this.b != null) {
            this.b = context;
            if (this.c == null) {
                this.c = LayoutInflater.from(context);
            }
        }
        this.f1036d = gVar;
        a aVar = this.f1039g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public boolean e(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        h hVar = new h(rVar);
        g.a aVar = new g.a(rVar.a);
        e eVar = new e(aVar.a.a, 2131492880);
        hVar.f1054d = eVar;
        eVar.f1038f = hVar;
        g gVar = hVar.b;
        gVar.b(eVar, gVar.a);
        ListAdapter b2 = hVar.f1054d.b();
        AlertController.b bVar = aVar.a;
        bVar.p = b2;
        bVar.q = hVar;
        View view = rVar.o;
        if (view != null) {
            bVar.f36e = view;
        } else {
            bVar.c = rVar.n;
            bVar.f35d = rVar.f1053m;
        }
        bVar.o = hVar;
        g a2 = aVar.a();
        hVar.c = a2;
        a2.setOnDismissListener(hVar);
        WindowManager.LayoutParams attributes = hVar.c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        hVar.c.show();
        m.a aVar2 = this.f1038f;
        if (aVar2 == null) {
            return true;
        }
        aVar2.b(rVar);
        return true;
    }

    public void f(boolean z) {
        a aVar = this.f1039g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public boolean h() {
        return false;
    }

    public boolean i(g gVar, i iVar) {
        return false;
    }

    public boolean j(g gVar, i iVar) {
        return false;
    }

    public void k(m.a aVar) {
        this.f1038f = aVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f1036d.s(this.f1039g.getItem(i2), this, 0);
        b.C0166b.a.g(adapterView, view, i2);
    }
}
