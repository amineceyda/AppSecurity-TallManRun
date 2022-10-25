package e.e.b;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Objects;

public class h {
    public Context a;
    public ArrayList<g> b = new ArrayList<>();
    public ArrayList<k> c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<g> f1274d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f1275e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f1276f;

    /* renamed from: g  reason: collision with root package name */
    public PendingIntent f1277g;

    /* renamed from: h  reason: collision with root package name */
    public Bitmap f1278h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1279i = true;

    /* renamed from: j  reason: collision with root package name */
    public int f1280j;

    /* renamed from: k  reason: collision with root package name */
    public int f1281k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1282l;

    /* renamed from: m  reason: collision with root package name */
    public Bundle f1283m;
    public String n;
    public boolean o;
    public Notification p;
    @Deprecated
    public ArrayList<String> q;

    public h(Context context, String str) {
        Notification notification = new Notification();
        this.p = notification;
        this.a = context;
        this.n = str;
        notification.when = System.currentTimeMillis();
        this.p.audioStreamType = -1;
        this.q = new ArrayList<>();
        this.o = true;
    }

    public Notification a() {
        SparseArray<Bundle> a2;
        i iVar = new i(this);
        Objects.requireNonNull(iVar.b);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26 && i2 < 24) {
            if (i2 < 21 && i2 < 20 && (a2 = j.a(iVar.c)) != null) {
                iVar.f1284d.putSparseParcelableArray("android.support.actionExtras", a2);
            }
            iVar.a.setExtras(iVar.f1284d);
        }
        Notification build = iVar.a.build();
        Objects.requireNonNull(iVar.b);
        return build;
    }

    public h b(boolean z) {
        Notification notification;
        int i2;
        if (z) {
            notification = this.p;
            i2 = notification.flags | 16;
        } else {
            notification = this.p;
            i2 = notification.flags & -17;
        }
        notification.flags = i2;
        return this;
    }

    public h c(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 5120) {
            charSequence = charSequence.subSequence(0, 5120);
        }
        this.f1276f = charSequence;
        return this;
    }

    public h d(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 5120) {
            charSequence = charSequence.subSequence(0, 5120);
        }
        this.f1275e = charSequence;
        return this;
    }

    public h e(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(2131165428);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(2131165427);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double d2 = (double) dimensionPixelSize;
                double max = (double) Math.max(1, bitmap.getWidth());
                Double.isNaN(d2);
                Double.isNaN(max);
                Double.isNaN(d2);
                Double.isNaN(max);
                double d3 = d2 / max;
                double d4 = (double) dimensionPixelSize2;
                double max2 = (double) Math.max(1, bitmap.getHeight());
                Double.isNaN(d4);
                Double.isNaN(max2);
                Double.isNaN(d4);
                Double.isNaN(max2);
                double min = Math.min(d3, d4 / max2);
                double width = (double) bitmap.getWidth();
                Double.isNaN(width);
                Double.isNaN(width);
                double height = (double) bitmap.getHeight();
                Double.isNaN(height);
                Double.isNaN(height);
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(width * min), (int) Math.ceil(height * min), true);
            }
        }
        this.f1278h = bitmap;
        return this;
    }
}
