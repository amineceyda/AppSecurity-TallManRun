package e.f.a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class c extends a {

    /* renamed from: j  reason: collision with root package name */
    public int f1389j;

    /* renamed from: k  reason: collision with root package name */
    public int f1390k;

    /* renamed from: l  reason: collision with root package name */
    public LayoutInflater f1391l;

    @Deprecated
    public c(Context context, int i2, Cursor cursor, boolean z) {
        super(context, (Cursor) null, z);
        this.f1390k = i2;
        this.f1389j = i2;
        this.f1391l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View d(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1391l.inflate(this.f1389j, viewGroup, false);
    }
}
