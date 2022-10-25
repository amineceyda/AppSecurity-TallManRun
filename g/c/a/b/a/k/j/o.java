package g.c.a.b.a.k.j;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewStub;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.apkpure.aegon.widgets.flowlayout.LiteTagFlowLayout;
import e.e.c.a;
import g.c.a.b.a.k.f;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class o extends l {
    public static final Logger J = LoggerFactory.getLogger("HeadPartViewLog");
    public TextView A;
    public View B;
    public View C;
    public TextView D;
    public ImageView E;
    public int F;
    public int G;
    public boolean H = false;
    public Handler I;
    public final Activity a;
    public final Context b;
    public final f c;

    /* renamed from: d  reason: collision with root package name */
    public LinearLayout f1881d;

    /* renamed from: e  reason: collision with root package name */
    public HorizontalScrollView f1882e;

    /* renamed from: f  reason: collision with root package name */
    public View f1883f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f1884g;

    /* renamed from: h  reason: collision with root package name */
    public LiteTagFlowLayout f1885h;

    /* renamed from: i  reason: collision with root package name */
    public View f1886i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f1887j;

    /* renamed from: k  reason: collision with root package name */
    public ImageView f1888k;

    /* renamed from: l  reason: collision with root package name */
    public ViewStub f1889l;

    /* renamed from: m  reason: collision with root package name */
    public View f1890m;
    public TextView n;
    public ImageView o;
    public TextView p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public View x;
    public TextView y;
    public TextView z;

    public o(Activity activity, f fVar) {
        this.a = activity;
        this.c = fVar;
        this.b = activity.getApplicationContext();
    }

    public final void a(boolean z2) {
        ImageView imageView;
        int i2;
        Context context;
        if (z2) {
            this.f1887j.setText(2131821239);
            imageView = this.f1888k;
            context = this.b;
            i2 = 2131231133;
        } else {
            this.f1887j.setText(2131821179);
            imageView = this.f1888k;
            context = this.b;
            i2 = 2131231132;
        }
        imageView.setImageDrawable(a.c(context, i2));
    }
}
