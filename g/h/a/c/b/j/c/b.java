package g.h.a.c.b.j.c;

import android.content.Context;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.TextView;
import i.o.c.h;
import java.util.List;

public final class b extends BaseAdapter {
    public final Context b;
    public final List<g.h.a.c.b.j.a> c;

    public final class a {
        public final View a;
        public final TextView b;

        public a(b bVar, View view) {
            h.e(bVar, "this$0");
            h.e(view, "root");
            this.a = view;
            View findViewById = view.findViewById(2131297666);
            h.d(findViewById, "root.findViewById(R.id.text)");
            this.b = (TextView) findViewById;
        }
    }

    public b(Context context, List<g.h.a.c.b.j.a> list) {
        h.e(context, "context");
        h.e(list, "menuItems");
        this.b = context;
        this.c = list;
    }

    public int getCount() {
        return this.c.size();
    }

    public Object getItem(int i2) {
        return this.c.get(i2);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: g.h.a.c.b.j.c.b$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
            r7 = this;
            r0 = 0
            if (r9 != 0) goto L_0x001d
            if (r10 != 0) goto L_0x0007
            r1 = r0
            goto L_0x000b
        L_0x0007:
            android.content.Context r1 = r10.getContext()
        L_0x000b:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2131492941(0x7f0c004d, float:1.8609348E38)
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r10, r3)
            g.h.a.c.b.j.c.b$a r2 = new g.h.a.c.b.j.c.b$a
            r2.<init>(r7, r1)
            goto L_0x002a
        L_0x001d:
            java.lang.Object r1 = r9.getTag()
            boolean r2 = r1 instanceof g.h.a.c.b.j.c.b.a
            if (r2 == 0) goto L_0x0029
            r2 = r1
            g.h.a.c.b.j.c.b$a r2 = (g.h.a.c.b.j.c.b.a) r2
            goto L_0x002a
        L_0x0029:
            r2 = r0
        L_0x002a:
            if (r2 != 0) goto L_0x002d
            goto L_0x003d
        L_0x002d:
            android.view.View r1 = r2.a
            java.util.List<g.h.a.c.b.j.a> r3 = r7.c
            java.lang.Object r3 = r3.get(r8)
            g.h.a.c.b.j.a r3 = (g.h.a.c.b.j.a) r3
            java.util.Objects.requireNonNull(r3)
            r1.setOnClickListener(r0)
        L_0x003d:
            if (r2 != 0) goto L_0x0040
            goto L_0x0050
        L_0x0040:
            android.widget.TextView r1 = r2.b
            java.util.List<g.h.a.c.b.j.a> r2 = r7.c
            java.lang.Object r2 = r2.get(r8)
            g.h.a.c.b.j.a r2 = (g.h.a.c.b.j.a) r2
            java.util.Objects.requireNonNull(r2)
            r1.setText(r0)
        L_0x0050:
            java.util.List<g.h.a.c.b.j.a> r0 = r7.c
            java.lang.Object r0 = r0.get(r8)
            g.h.a.c.b.j.a r0 = (g.h.a.c.b.j.a) r0
            java.util.Objects.requireNonNull(r0)
            g.i.c.a.a.i.b r1 = g.i.c.a.a.i.b.C0166b.a
            long r5 = (long) r8
            r2 = r8
            r3 = r9
            r4 = r10
            r1.h(r2, r3, r4, r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g.h.a.c.b.j.c.b.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
