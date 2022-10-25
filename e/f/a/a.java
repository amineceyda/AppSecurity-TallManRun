package e.f.a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import e.f.a.b;
import g.i.c.a.a.i.b;

public abstract class a extends BaseAdapter implements Filterable, b.a {
    public boolean b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public Cursor f1383d;

    /* renamed from: e  reason: collision with root package name */
    public Context f1384e;

    /* renamed from: f  reason: collision with root package name */
    public int f1385f;

    /* renamed from: g  reason: collision with root package name */
    public C0046a f1386g;

    /* renamed from: h  reason: collision with root package name */
    public DataSetObserver f1387h;

    /* renamed from: i  reason: collision with root package name */
    public b f1388i;

    /* renamed from: e.f.a.a$a  reason: collision with other inner class name */
    public class C0046a extends ContentObserver {
        public C0046a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            Cursor cursor;
            a aVar = a.this;
            if (aVar.c && (cursor = aVar.f1383d) != null && !cursor.isClosed()) {
                aVar.b = aVar.f1383d.requery();
            }
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        public void onChanged() {
            a aVar = a.this;
            aVar.b = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a aVar = a.this;
            aVar.b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        b bVar;
        boolean z2 = true;
        char c2 = z ? (char) 1 : 2;
        if ((c2 & 1) == 1) {
            c2 |= 2;
            this.c = true;
        } else {
            this.c = false;
        }
        z2 = cursor == null ? false : z2;
        this.f1383d = cursor;
        this.b = z2;
        this.f1384e = context;
        this.f1385f = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((c2 & 2) == 2) {
            this.f1386g = new C0046a();
            bVar = new b();
        } else {
            bVar = null;
            this.f1386g = null;
        }
        this.f1387h = bVar;
        if (z2) {
            C0046a aVar = this.f1386g;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f1387h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract void a(View view, Context context, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f1383d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0046a aVar = this.f1386g;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                DataSetObserver dataSetObserver = this.f1387h;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f1383d = cursor;
            if (cursor != null) {
                C0046a aVar2 = this.f1386g;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                DataSetObserver dataSetObserver2 = this.f1387h;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f1385f = cursor.getColumnIndexOrThrow("_id");
                this.b = true;
                notifyDataSetChanged();
            } else {
                this.f1385f = -1;
                this.b = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract View d(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.b || (cursor = this.f1383d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.b) {
            return null;
        }
        this.f1383d.moveToPosition(i2);
        if (view == null) {
            c cVar = (c) this;
            view = cVar.f1391l.inflate(cVar.f1390k, viewGroup, false);
        }
        a(view, this.f1384e, this.f1383d);
        return view;
    }

    public Filter getFilter() {
        if (this.f1388i == null) {
            this.f1388i = new b(this);
        }
        return this.f1388i;
    }

    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.b || (cursor = this.f1383d) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f1383d;
    }

    public long getItemId(int i2) {
        Cursor cursor;
        if (!this.b || (cursor = this.f1383d) == null || !cursor.moveToPosition(i2)) {
            return 0;
        }
        return this.f1383d.getLong(this.f1385f);
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f1383d.moveToPosition(i2)) {
            View d2 = view == null ? d(this.f1384e, this.f1383d, viewGroup) : view;
            a(d2, this.f1384e, this.f1383d);
            b.C0166b.a.h(i2, view, viewGroup, getItemId(i2));
            return d2;
        } else {
            throw new IllegalStateException(g.a.a.a.a.q("couldn't move cursor to position ", i2));
        }
    }
}
