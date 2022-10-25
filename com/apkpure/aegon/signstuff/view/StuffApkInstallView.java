package com.apkpure.aegon.signstuff.view;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.transition.ChangeBounds;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import g.c.a.i.d;
import g.c.a.l.j;
import g.c.a.l.l.c0;
import g.c.a.l.l.d0;
import g.c.a.l.l.e0;
import g.c.a.l.l.o;
import g.c.a.l.n.b;
import g.c.a.l.n.c;
import g.c.a.l.n.e;
import g.c.a.l.n.k;
import g.c.a.l.n.m;
import g.c.b.b.f;
import i.o.c.h;
import j.a.x;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class StuffApkInstallView extends FrameLayout {
    public static final Logger S = LoggerFactory.getLogger("Stuff|StuffApkInstallView");
    public boolean A = true;
    public o B;
    public c0 C;
    public final g.c.a.e.h.b.a Q;
    public e0 R;
    public TextView b;
    public ViewGroup c;

    /* renamed from: d  reason: collision with root package name */
    public ViewGroup f278d;

    /* renamed from: e  reason: collision with root package name */
    public ViewGroup f279e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f280f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f281g;

    /* renamed from: h  reason: collision with root package name */
    public TextView f282h;

    /* renamed from: i  reason: collision with root package name */
    public ImageView f283i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f284j;

    /* renamed from: k  reason: collision with root package name */
    public ProgressBar f285k;

    /* renamed from: l  reason: collision with root package name */
    public ProgressBar f286l;

    /* renamed from: m  reason: collision with root package name */
    public TextView f287m;
    public LinearLayout n;
    public Button o;
    public Button p;
    public Button q;
    public Button r;
    public View s;
    public Scene t;
    public Scene u;
    public x v = f.b();
    public final ChangeBounds w = new ChangeBounds();
    public boolean x = true;
    public boolean y;
    public boolean z;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            j.values();
            int[] iArr = new int[5];
            iArr[3] = 1;
            iArr[2] = 2;
            a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StuffApkInstallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        h.e(context, "context");
        h.e(context, "context");
        g.c.a.e.h.b.a aVar = new g.c.a.e.h.b.a();
        this.Q = aVar;
        LayoutInflater.from(context).inflate(2131493511, this);
        setVisibility(8);
        aVar.scene = 2140;
        aVar.pop_type = "fast_download_pop";
    }

    public static void g(StuffApkInstallView stuffApkInstallView, DialogInterface dialogInterface, int i2) {
        h.e(stuffApkInstallView, "this$0");
        dialogInterface.dismiss();
        i.o.c.o oVar = new i.o.c.o();
        T appCompatActivity = stuffApkInstallView.getAppCompatActivity();
        if (appCompatActivity != null) {
            oVar.element = appCompatActivity;
            d dVar = new d();
            dVar.d("android.permission.WRITE_EXTERNAL_STORAGE");
            dVar.d("android.permission.READ_EXTERNAL_STORAGE");
            dVar.b(new k(oVar));
            dVar.e((Activity) oVar.element, 10001);
        }
    }

    private final Activity getAppCompatActivity() {
        if (!(getContext() instanceof Activity)) {
            return null;
        }
        Context context = getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        if (activity.isFinishing() || activity.isDestroyed()) {
            return null;
        }
        return activity;
    }

    public final void a() {
        boolean z2;
        if (this.x) {
            TransitionManager.go(this.u, this.w);
            z2 = false;
        } else {
            TransitionManager.go(this.t, this.w);
            z2 = true;
        }
        this.x = z2;
        e();
        p(true);
    }

    public final void b() {
        e0 e0Var = this.R;
        if (e0Var != null) {
            g.c.a.l.d dVar = g.c.a.l.d.a;
            h.e(e0Var, "listener");
            List<e0> list = g.c.a.l.d.f2043f;
            synchronized (list) {
                list.remove(e0Var);
            }
        }
        g.c.a.l.d dVar2 = g.c.a.l.d.a;
        d0 d0Var = g.c.a.l.d.f2042e;
        if (d0Var != null) {
            d0Var.f();
        }
        g.c.a.l.d.b.info(h.j("结束安装 ", g.c.a.l.d.f2042e));
        g.c.a.l.d.f2047j = false;
    }

    public final String c(int i2) {
        String string = getContext().getString(i2);
        h.d(string, "context.getString(res)");
        return string;
    }

    public final void d() {
        String g2;
        o oVar;
        if (!f()) {
            g.c.a.l.d dVar = g.c.a.l.d.a;
            Context applicationContext = getContext().getApplicationContext();
            h.d(applicationContext, "context.applicationContext");
            c0 f2 = dVar.f(applicationContext);
            Integer num = null;
            if (f2 == null) {
                o oVar2 = this.B;
                if (oVar2 == null || (g2 = oVar2.g()) == null || (oVar = this.B) == null) {
                    f2 = null;
                } else {
                    int i2 = oVar.c;
                    if (oVar != null) {
                        num = Integer.valueOf(oVar.k());
                    }
                    f2 = new c0(g2, String.valueOf(num), i2, false, 8);
                }
            }
            this.C = f2;
            if (this.y) {
                ImageView imageView = this.f280f;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.setBackgroundColor(-1);
                }
            } else {
                ImageView imageView2 = this.f280f;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                ViewGroup viewGroup2 = this.c;
                if (viewGroup2 != null) {
                    viewGroup2.setBackgroundColor(0);
                }
            }
            setVisibility(0);
        }
    }

    public final void e() {
        Bitmap bitmap;
        o oVar;
        String d2;
        this.c = (ViewGroup) findViewById(2131298616);
        this.f279e = (ViewGroup) findViewById(2131298295);
        this.f278d = (ViewGroup) findViewById(2131298296);
        this.f280f = (ImageView) findViewById(2131298626);
        this.b = (TextView) findViewById(2131297689);
        this.f281g = (ImageView) findViewById(2131296958);
        this.f282h = (TextView) findViewById(2131298508);
        this.f283i = (ImageView) findViewById(2131298269);
        this.f284j = (TextView) findViewById(2131298583);
        this.f285k = (ProgressBar) findViewById(2131297366);
        this.f286l = (ProgressBar) findViewById(2131297003);
        this.f287m = (TextView) findViewById(2131298547);
        this.o = (Button) findViewById(2131298557);
        this.p = (Button) findViewById(2131296521);
        this.q = (Button) findViewById(2131298224);
        this.r = (Button) findViewById(2131298531);
        this.s = findViewById(2131298266);
        this.n = (LinearLayout) findViewById(2131298205);
        this.t = Scene.getSceneForLayout(this.f279e, 2131493483, getContext());
        this.u = Scene.getSceneForLayout(this.f279e, 2131493482, getContext());
        ViewGroup viewGroup = this.f278d;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(b.b);
        }
        View view = this.s;
        if (view != null) {
            view.setOnClickListener(new e(this));
        }
        Button button = this.q;
        if (button != null) {
            button.setOnClickListener(new g.c.a.l.n.a(this));
        }
        Button button2 = this.r;
        if (button2 != null) {
            button2.setOnClickListener(new g.c.a.l.n.f(this));
        }
        Button button3 = this.p;
        if (button3 != null) {
            button3.setOnClickListener(new c(this));
        }
        Button button4 = this.o;
        if (button4 != null) {
            button4.setOnClickListener(new g.c.a.l.n.d(this));
        }
        Bitmap bitmap2 = null;
        if (this.x) {
            int i2 = (getContext().getResources().getDisplayMetrics().heightPixels / 10) * 7;
            ViewGroup viewGroup2 = this.f278d;
            ViewGroup.LayoutParams layoutParams = viewGroup2 == null ? null : viewGroup2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i2;
            }
            ViewGroup viewGroup3 = this.f278d;
            if (viewGroup3 != null) {
                viewGroup3.setLayoutParams(layoutParams);
            }
        }
        TextView textView = this.f282h;
        if (textView != null) {
            o oVar2 = this.B;
            textView.setText(oVar2 == null ? null : oVar2.f());
        }
        o oVar3 = this.B;
        if (oVar3 == null) {
            bitmap = null;
        } else {
            bitmap = oVar3.f2070d;
        }
        if (bitmap != null) {
            Bitmap bitmap3 = oVar3 == null ? null : oVar3.f2070d;
            h.c(bitmap3);
            if (!bitmap3.isRecycled()) {
                ImageView imageView = this.f281g;
                if (imageView != null) {
                    o oVar4 = this.B;
                    if (oVar4 != null) {
                        bitmap2 = oVar4.f2070d;
                    }
                    imageView.setImageBitmap(bitmap2);
                    return;
                }
                return;
            }
        }
        if (this.f281g != null && (oVar = this.B) != null && (d2 = oVar.d()) != null) {
            Context context = getContext();
            ImageView imageView2 = this.f281g;
            h.c(imageView2);
            e.e.d.l.a.a0(context, d2, imageView2, e.e.d.l.a.S(2131623937), new m(this));
        }
    }

    public final boolean f() {
        if (!(getContext() instanceof Activity)) {
            return true;
        }
        Context context = getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        return activity.isFinishing() || activity.isDestroyed();
    }

    public final void h() {
        c0 c0Var = this.C;
        if (c0Var != null) {
            c0Var.d(true);
        }
        x xVar = this.v;
        if (xVar != null) {
            f.f(xVar, (CancellationException) null, 1);
        }
        setVisibility(8);
        b();
    }

    public final StuffApkInstallView i(o oVar) {
        h.e(oVar, "apkDescription");
        this.B = oVar;
        g.c.a.e.h.b.a aVar = this.Q;
        if (aVar != null) {
            aVar.fastDownloadId = oVar.b();
        }
        g.c.a.e.h.b.a aVar2 = this.Q;
        if (aVar2 != null) {
            aVar2.sourceRecommendId = oVar.c();
        }
        return this;
    }

    public final StuffApkInstallView j(boolean z2) {
        this.A = z2;
        return this;
    }

    public final StuffApkInstallView k(boolean z2) {
        this.y = z2;
        return this;
    }

    public final void l() {
        if (this.B == null) {
            S.info("Start fail, apkDescription is null.");
            return;
        }
        e();
        d();
    }

    public final void m() {
        LinearLayout linearLayout = this.n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        TextView textView = this.f287m;
        if (textView != null) {
            textView.setVisibility(0);
        }
        ProgressBar progressBar = this.f285k;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        ImageView imageView = this.f283i;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TextView textView2 = this.f284j;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        ProgressBar progressBar2 = this.f286l;
        if (progressBar2 != null) {
            progressBar2.setVisibility(0);
        }
        TextView textView3 = this.f287m;
        if (textView3 != null) {
            textView3.setText(c(2131821817));
        }
        TextView textView4 = this.b;
        if (textView4 != null) {
            textView4.setText(c(2131821817));
        }
    }

    public final void n() {
        TextView textView = this.f287m;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.f287m;
        if (textView2 != null) {
            textView2.setText(c(2131820882));
        }
        ProgressBar progressBar = this.f285k;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        ProgressBar progressBar2 = this.f286l;
        if (progressBar2 != null) {
            progressBar2.setVisibility(8);
        }
        Button button = this.o;
        if (button != null) {
            button.setVisibility(8);
        }
        LinearLayout linearLayout = this.n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        ImageView imageView = this.f283i;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        Button button2 = this.o;
        if (button2 != null) {
            button2.setVisibility(8);
        }
        Button button3 = this.p;
        if (button3 != null) {
            button3.setVisibility(8);
        }
        TextView textView3 = this.f284j;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        o(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(int r8) {
        /*
            r7 = this;
            g.c.a.l.l.o r0 = r7.B
            if (r0 != 0) goto L_0x0006
            r0 = 0
            goto L_0x0008
        L_0x0006:
            g.c.a.l.j r0 = r0.b
        L_0x0008:
            if (r0 != 0) goto L_0x000c
            r0 = -1
            goto L_0x0014
        L_0x000c:
            int[] r1 = com.apkpure.aegon.signstuff.view.StuffApkInstallView.a.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L_0x0014:
            r1 = 1
            if (r0 == r1) goto L_0x0021
            r2 = 2
            if (r0 == r2) goto L_0x001d
            java.lang.String r0 = ""
            goto L_0x0028
        L_0x001d:
            r0 = 2131821772(0x7f1104cc, float:1.9276297E38)
            goto L_0x0024
        L_0x0021:
            r0 = 2131821754(0x7f1104ba, float:1.927626E38)
        L_0x0024:
            java.lang.String r0 = r7.c(r0)
        L_0x0028:
            android.widget.TextView r2 = r7.f287m
            r3 = 0
            if (r2 != 0) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            r2.setVisibility(r3)
        L_0x0031:
            boolean r2 = r7.x
            java.lang.String r4 = "java.lang.String.format(format, *args)"
            if (r2 == 0) goto L_0x0053
            android.widget.TextView r2 = r7.f287m
            if (r2 != 0) goto L_0x003c
            goto L_0x0075
        L_0x003c:
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r6 = java.lang.String.valueOf(r8)
            r5[r3] = r6
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r1)
            java.lang.String r0 = java.lang.String.format(r0, r1)
            i.o.c.h.d(r0, r4)
            r2.setText(r0)
            goto L_0x0075
        L_0x0053:
            android.widget.TextView r0 = r7.f287m
            if (r0 != 0) goto L_0x0058
            goto L_0x0075
        L_0x0058:
            r2 = 2131821906(0x7f110552, float:1.9276568E38)
            java.lang.String r2 = r7.c(r2)
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r6 = java.lang.String.valueOf(r8)
            r5[r3] = r6
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r1)
            java.lang.String r1 = java.lang.String.format(r2, r1)
            i.o.c.h.d(r1, r4)
            r0.setText(r1)
        L_0x0075:
            android.widget.ProgressBar r0 = r7.f285k
            if (r0 != 0) goto L_0x007a
            goto L_0x007d
        L_0x007a:
            r0.setProgress(r8)
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apkpure.aegon.signstuff.view.StuffApkInstallView.o(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:277:0x03a2, code lost:
        if (r0 == null) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x03a7, code lost:
        if (r0 == null) goto L_0x03ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0435  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:322:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(boolean r8) {
        /*
            r7 = this;
            boolean r0 = r7.f()
            r1 = 0
            if (r0 == 0) goto L_0x0028
            org.slf4j.Logger r8 = S
            java.lang.String r0 = "View is destroy, state["
            java.lang.StringBuilder r0 = g.a.a.a.a.i(r0)
            g.c.a.l.l.c0 r2 = r7.C
            if (r2 != 0) goto L_0x0014
            goto L_0x0018
        L_0x0014:
            java.lang.String r1 = r2.f()
        L_0x0018:
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.info(r0)
            return
        L_0x0028:
            android.widget.TextView r0 = r7.f282h
            if (r0 != 0) goto L_0x002d
            goto L_0x003a
        L_0x002d:
            g.c.a.l.l.o r2 = r7.B
            if (r2 != 0) goto L_0x0033
            r2 = r1
            goto L_0x0037
        L_0x0033:
            java.lang.String r2 = r2.f()
        L_0x0037:
            r0.setText(r2)
        L_0x003a:
            g.c.a.l.l.o r0 = r7.B
            if (r0 != 0) goto L_0x0040
            r0 = r1
            goto L_0x0046
        L_0x0040:
            int r0 = r0.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0046:
            r2 = 11
            if (r0 != 0) goto L_0x004b
            goto L_0x0053
        L_0x004b:
            int r3 = r0.intValue()
            if (r3 != r2) goto L_0x0053
            goto L_0x01a7
        L_0x0053:
            r2 = 20
            if (r0 != 0) goto L_0x0058
            goto L_0x0063
        L_0x0058:
            int r3 = r0.intValue()
            if (r3 != r2) goto L_0x0063
            r7.n()
            goto L_0x0413
        L_0x0063:
            r2 = 21
            r3 = 8
            r4 = 0
            if (r0 != 0) goto L_0x006b
            goto L_0x00b2
        L_0x006b:
            int r5 = r0.intValue()
            if (r5 != r2) goto L_0x00b2
            android.widget.ImageView r8 = r7.f283i
            if (r8 != 0) goto L_0x0076
            goto L_0x0079
        L_0x0076:
            r8.setVisibility(r3)
        L_0x0079:
            android.widget.TextView r8 = r7.f284j
            if (r8 != 0) goto L_0x007e
            goto L_0x0081
        L_0x007e:
            r8.setVisibility(r3)
        L_0x0081:
            android.widget.TextView r8 = r7.f287m
            if (r8 != 0) goto L_0x0086
            goto L_0x0089
        L_0x0086:
            r8.setVisibility(r4)
        L_0x0089:
            android.widget.ProgressBar r8 = r7.f285k
            if (r8 != 0) goto L_0x008e
            goto L_0x0091
        L_0x008e:
            r8.setVisibility(r4)
        L_0x0091:
            android.widget.ProgressBar r8 = r7.f286l
            if (r8 != 0) goto L_0x0096
            goto L_0x0099
        L_0x0096:
            r8.setVisibility(r3)
        L_0x0099:
            g.c.a.l.l.o r8 = r7.B
            if (r8 != 0) goto L_0x009f
            r8 = r1
            goto L_0x00a5
        L_0x009f:
            double r2 = r8.a
            java.lang.Double r8 = java.lang.Double.valueOf(r2)
        L_0x00a5:
            if (r8 != 0) goto L_0x00a8
            goto L_0x00ad
        L_0x00a8:
            double r2 = r8.doubleValue()
            int r4 = (int) r2
        L_0x00ad:
            r7.o(r4)
            goto L_0x0413
        L_0x00b2:
            r2 = 100
            r5 = 1
            if (r0 != 0) goto L_0x00b9
            goto L_0x0120
        L_0x00b9:
            int r6 = r0.intValue()
            if (r6 != r2) goto L_0x0120
            g.c.a.l.l.c0 r8 = r7.C
            if (r8 != 0) goto L_0x00c4
            goto L_0x00c7
        L_0x00c4:
            r8.d(r5)
        L_0x00c7:
            j.a.x r8 = r7.v
            g.c.b.b.f.f(r8, r1, r5)
            android.widget.TextView r8 = r7.f287m
            if (r8 != 0) goto L_0x00d1
            goto L_0x00d4
        L_0x00d1:
            r8.setVisibility(r4)
        L_0x00d4:
            android.widget.TextView r8 = r7.f287m
            if (r8 != 0) goto L_0x00d9
            goto L_0x00e3
        L_0x00d9:
            r0 = 2131821812(0x7f1104f4, float:1.9276378E38)
            java.lang.String r0 = r7.c(r0)
            r8.setText(r0)
        L_0x00e3:
            android.widget.LinearLayout r8 = r7.n
            if (r8 != 0) goto L_0x00e8
            goto L_0x00eb
        L_0x00e8:
            r8.setVisibility(r4)
        L_0x00eb:
            android.widget.Button r8 = r7.q
            if (r8 != 0) goto L_0x00f0
            goto L_0x00f3
        L_0x00f0:
            r8.setVisibility(r4)
        L_0x00f3:
            android.widget.Button r8 = r7.r
            if (r8 != 0) goto L_0x00f8
            goto L_0x00fb
        L_0x00f8:
            r8.setVisibility(r4)
        L_0x00fb:
            android.widget.Button r8 = r7.p
            if (r8 != 0) goto L_0x0100
            goto L_0x0103
        L_0x0100:
            r8.setVisibility(r3)
        L_0x0103:
            android.widget.Button r8 = r7.o
            if (r8 != 0) goto L_0x0108
            goto L_0x010b
        L_0x0108:
            r8.setVisibility(r3)
        L_0x010b:
            android.widget.ProgressBar r8 = r7.f285k
            if (r8 != 0) goto L_0x0110
            goto L_0x0113
        L_0x0110:
            r8.setVisibility(r3)
        L_0x0113:
            android.widget.ProgressBar r8 = r7.f286l
            if (r8 != 0) goto L_0x0118
            goto L_0x011b
        L_0x0118:
            r8.setVisibility(r3)
        L_0x011b:
            r7.b()
            goto L_0x0413
        L_0x0120:
            r2 = 30
            if (r0 != 0) goto L_0x0126
            goto L_0x019c
        L_0x0126:
            int r6 = r0.intValue()
            if (r6 != r2) goto L_0x019c
            j.a.x r8 = r7.v
            g.c.b.b.f.f(r8, r1, r5)
            android.widget.ImageView r8 = r7.f283i
            if (r8 != 0) goto L_0x0136
            goto L_0x0139
        L_0x0136:
            r8.setVisibility(r3)
        L_0x0139:
            android.widget.TextView r8 = r7.f287m
            if (r8 != 0) goto L_0x013e
            goto L_0x0141
        L_0x013e:
            r8.setVisibility(r3)
        L_0x0141:
            android.widget.TextView r8 = r7.f284j
            if (r8 != 0) goto L_0x0146
            goto L_0x0149
        L_0x0146:
            r8.setVisibility(r4)
        L_0x0149:
            android.widget.ProgressBar r8 = r7.f285k
            if (r8 != 0) goto L_0x014e
            goto L_0x0151
        L_0x014e:
            r8.setVisibility(r4)
        L_0x0151:
            android.widget.ProgressBar r8 = r7.f286l
            if (r8 != 0) goto L_0x0156
            goto L_0x0159
        L_0x0156:
            r8.setVisibility(r3)
        L_0x0159:
            android.widget.TextView r8 = r7.f284j
            if (r8 != 0) goto L_0x015e
            goto L_0x0168
        L_0x015e:
            r0 = 2131821753(0x7f1104b9, float:1.9276258E38)
            java.lang.String r0 = r7.c(r0)
            r8.setText(r0)
        L_0x0168:
            boolean r8 = r7.x
            if (r8 == 0) goto L_0x0175
            android.widget.ProgressBar r8 = r7.f285k
            if (r8 != 0) goto L_0x0171
            goto L_0x017d
        L_0x0171:
            r8.setVisibility(r4)
            goto L_0x017d
        L_0x0175:
            android.widget.ProgressBar r8 = r7.f285k
            if (r8 != 0) goto L_0x017a
            goto L_0x017d
        L_0x017a:
            r8.setVisibility(r3)
        L_0x017d:
            g.c.a.l.l.o r8 = r7.B
            if (r8 != 0) goto L_0x0183
            r8 = r1
            goto L_0x0189
        L_0x0183:
            double r2 = r8.a
            java.lang.Double r8 = java.lang.Double.valueOf(r2)
        L_0x0189:
            if (r8 != 0) goto L_0x018c
            goto L_0x0191
        L_0x018c:
            double r2 = r8.doubleValue()
            int r4 = (int) r2
        L_0x0191:
            android.widget.ProgressBar r8 = r7.f285k
            if (r8 != 0) goto L_0x0197
            goto L_0x0413
        L_0x0197:
            r8.setProgress(r4)
            goto L_0x0413
        L_0x019c:
            r2 = 50
            if (r0 != 0) goto L_0x01a1
            goto L_0x01ac
        L_0x01a1:
            int r6 = r0.intValue()
            if (r6 != r2) goto L_0x01ac
        L_0x01a7:
            r7.h()
            goto L_0x0413
        L_0x01ac:
            r2 = 40
            if (r0 != 0) goto L_0x01b1
            goto L_0x01f4
        L_0x01b1:
            int r6 = r0.intValue()
            if (r6 != r2) goto L_0x01f4
            boolean r8 = r7.f()
            if (r8 == 0) goto L_0x01bf
            goto L_0x0413
        L_0x01bf:
            r7.m()
            g.c.a.n.b.a r8 = new g.c.a.n.b.a
            android.content.Context r0 = r7.getContext()
            r8.<init>(r0)
            r8.f(r4)
            r0 = 2131821816(0x7f1104f8, float:1.9276386E38)
            r8.d(r0)
            r0 = 2131821814(0x7f1104f6, float:1.9276382E38)
            r8.b(r0)
            r0 = 2131821815(0x7f1104f7, float:1.9276384E38)
            g.c.a.l.n.g r2 = new g.c.a.l.n.g
            r2.<init>(r7)
            e.b.c.g$a r8 = r8.g(r0, r2)
            g.c.a.l.n.l r0 = new g.c.a.l.n.l
            r0.<init>()
            e.b.c.g$a r8 = r8.c(r0)
            r8.e()
            goto L_0x0413
        L_0x01f4:
            r2 = 60
            if (r0 != 0) goto L_0x01f9
            goto L_0x0204
        L_0x01f9:
            int r6 = r0.intValue()
            if (r6 != r2) goto L_0x0204
            r7.m()
            goto L_0x0413
        L_0x0204:
            r2 = 61
            if (r0 != 0) goto L_0x0209
            goto L_0x0255
        L_0x0209:
            int r6 = r0.intValue()
            if (r6 != r2) goto L_0x0255
            android.widget.ImageView r8 = r7.f283i
            if (r8 != 0) goto L_0x0214
            goto L_0x0217
        L_0x0214:
            r8.setVisibility(r3)
        L_0x0217:
            android.widget.TextView r8 = r7.f284j
            if (r8 != 0) goto L_0x021c
            goto L_0x021f
        L_0x021c:
            r8.setVisibility(r3)
        L_0x021f:
            android.widget.TextView r8 = r7.f287m
            if (r8 != 0) goto L_0x0224
            goto L_0x0227
        L_0x0224:
            r8.setVisibility(r4)
        L_0x0227:
            android.widget.ProgressBar r8 = r7.f285k
            if (r8 != 0) goto L_0x022c
            goto L_0x022f
        L_0x022c:
            r8.setVisibility(r3)
        L_0x022f:
            android.widget.ProgressBar r8 = r7.f286l
            if (r8 != 0) goto L_0x0234
            goto L_0x0237
        L_0x0234:
            r8.setVisibility(r4)
        L_0x0237:
            android.widget.TextView r8 = r7.f287m
            r0 = 2131821817(0x7f1104f9, float:1.9276388E38)
            if (r8 != 0) goto L_0x023f
            goto L_0x0246
        L_0x023f:
            java.lang.String r2 = r7.c(r0)
            r8.setText(r2)
        L_0x0246:
            android.widget.TextView r8 = r7.b
            if (r8 != 0) goto L_0x024c
            goto L_0x0413
        L_0x024c:
            java.lang.String r0 = r7.c(r0)
            r8.setText(r0)
            goto L_0x0413
        L_0x0255:
            r2 = 62
            if (r0 != 0) goto L_0x025b
            goto L_0x031f
        L_0x025b:
            int r6 = r0.intValue()
            if (r6 != r2) goto L_0x031f
            g.c.a.l.l.c0 r8 = r7.C
            if (r8 != 0) goto L_0x0266
            goto L_0x0269
        L_0x0266:
            r8.d(r5)
        L_0x0269:
            g.c.a.l.l.o r8 = r7.B
            if (r8 != 0) goto L_0x026f
            r8 = r1
            goto L_0x0275
        L_0x026f:
            int r8 = r8.f2071e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
        L_0x0275:
            r0 = 18
            if (r8 != 0) goto L_0x027a
            goto L_0x0293
        L_0x027a:
            int r8 = r8.intValue()
            if (r8 != r0) goto L_0x0293
            r7.h()
            android.content.Context r8 = r7.getContext()
            r0 = 2131821807(0x7f1104ef, float:1.9276368E38)
            java.lang.String r0 = r7.c(r0)
            g.c.b.b.f.j0(r8, r0)
            goto L_0x0413
        L_0x0293:
            android.widget.LinearLayout r8 = r7.n
            if (r8 != 0) goto L_0x0298
            goto L_0x029b
        L_0x0298:
            r8.setVisibility(r4)
        L_0x029b:
            android.widget.Button r8 = r7.o
            if (r8 != 0) goto L_0x02a0
            goto L_0x02a3
        L_0x02a0:
            r8.setVisibility(r3)
        L_0x02a3:
            android.widget.Button r8 = r7.p
            if (r8 != 0) goto L_0x02a8
            goto L_0x02ab
        L_0x02a8:
            r8.setVisibility(r3)
        L_0x02ab:
            android.widget.Button r8 = r7.r
            if (r8 != 0) goto L_0x02b0
            goto L_0x02b3
        L_0x02b0:
            r8.setVisibility(r3)
        L_0x02b3:
            android.widget.Button r8 = r7.q
            if (r8 != 0) goto L_0x02b8
            goto L_0x02bb
        L_0x02b8:
            r8.setVisibility(r4)
        L_0x02bb:
            android.widget.ImageView r8 = r7.f283i
            if (r8 != 0) goto L_0x02c0
            goto L_0x02c3
        L_0x02c0:
            r8.setVisibility(r4)
        L_0x02c3:
            android.widget.TextView r8 = r7.f284j
            if (r8 != 0) goto L_0x02c8
            goto L_0x02cb
        L_0x02c8:
            r8.setVisibility(r4)
        L_0x02cb:
            android.widget.TextView r8 = r7.f284j
            if (r8 != 0) goto L_0x02d0
            goto L_0x0304
        L_0x02d0:
            g.c.a.l.l.o r0 = r7.B
            if (r0 != 0) goto L_0x02d6
            r0 = r1
            goto L_0x02dc
        L_0x02d6:
            int r0 = r0.f2071e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x02dc:
            r2 = 2001(0x7d1, float:2.804E-42)
            if (r0 != 0) goto L_0x02e1
            goto L_0x02eb
        L_0x02e1:
            int r4 = r0.intValue()
            if (r4 != r2) goto L_0x02eb
            r0 = 2131821813(0x7f1104f5, float:1.927638E38)
            goto L_0x02fd
        L_0x02eb:
            r2 = 17
            if (r0 != 0) goto L_0x02f0
            goto L_0x02fa
        L_0x02f0:
            int r0 = r0.intValue()
            if (r0 != r2) goto L_0x02fa
            r0 = 2131821804(0x7f1104ec, float:1.9276362E38)
            goto L_0x02fd
        L_0x02fa:
            r0 = 2131821004(0x7f1101cc, float:1.9274739E38)
        L_0x02fd:
            java.lang.String r0 = r7.c(r0)
            r8.setText(r0)
        L_0x0304:
            android.widget.TextView r8 = r7.f287m
            if (r8 != 0) goto L_0x0309
            goto L_0x030c
        L_0x0309:
            r8.setVisibility(r3)
        L_0x030c:
            android.widget.ProgressBar r8 = r7.f285k
            if (r8 != 0) goto L_0x0311
            goto L_0x0314
        L_0x0311:
            r8.setVisibility(r3)
        L_0x0314:
            android.widget.ProgressBar r8 = r7.f286l
            if (r8 != 0) goto L_0x031a
            goto L_0x0413
        L_0x031a:
            r8.setVisibility(r3)
            goto L_0x0413
        L_0x031f:
            r2 = 22
            if (r0 != 0) goto L_0x0325
            goto L_0x0413
        L_0x0325:
            int r0 = r0.intValue()
            if (r0 != r2) goto L_0x0413
            j.a.x r0 = r7.v
            g.c.b.b.f.f(r0, r1, r5)
            android.widget.TextView r0 = r7.f287m
            if (r0 != 0) goto L_0x0335
            goto L_0x0338
        L_0x0335:
            r0.setVisibility(r3)
        L_0x0338:
            android.widget.LinearLayout r0 = r7.n
            if (r0 != 0) goto L_0x033d
            goto L_0x0340
        L_0x033d:
            r0.setVisibility(r4)
        L_0x0340:
            android.widget.ImageView r0 = r7.f283i
            if (r0 != 0) goto L_0x0345
            goto L_0x0348
        L_0x0345:
            r0.setVisibility(r4)
        L_0x0348:
            android.widget.Button r0 = r7.o
            if (r0 != 0) goto L_0x034d
            goto L_0x0350
        L_0x034d:
            r0.setVisibility(r4)
        L_0x0350:
            android.widget.Button r0 = r7.p
            if (r0 != 0) goto L_0x0355
            goto L_0x0358
        L_0x0355:
            r0.setVisibility(r4)
        L_0x0358:
            android.widget.TextView r0 = r7.f284j
            if (r0 != 0) goto L_0x035d
            goto L_0x0360
        L_0x035d:
            r0.setVisibility(r4)
        L_0x0360:
            android.widget.TextView r0 = r7.f284j
            if (r0 != 0) goto L_0x0365
            goto L_0x036f
        L_0x0365:
            r2 = 2131821752(0x7f1104b8, float:1.9276256E38)
            java.lang.String r2 = r7.c(r2)
            r0.setText(r2)
        L_0x036f:
            android.widget.Button r0 = r7.q
            if (r0 != 0) goto L_0x0374
            goto L_0x0377
        L_0x0374:
            r0.setVisibility(r3)
        L_0x0377:
            android.widget.ProgressBar r0 = r7.f285k
            if (r0 != 0) goto L_0x037c
            goto L_0x0394
        L_0x037c:
            g.c.a.l.l.o r2 = r7.B
            if (r2 != 0) goto L_0x0382
            r2 = r1
            goto L_0x0388
        L_0x0382:
            double r5 = r2.a
            java.lang.Double r2 = java.lang.Double.valueOf(r5)
        L_0x0388:
            if (r2 != 0) goto L_0x038c
            r2 = 0
            goto L_0x0391
        L_0x038c:
            double r5 = r2.doubleValue()
            int r2 = (int) r5
        L_0x0391:
            r0.setProgress(r2)
        L_0x0394:
            boolean r0 = r7.x
            if (r0 == 0) goto L_0x03a5
            android.widget.ProgressBar r0 = r7.f285k
            if (r0 != 0) goto L_0x039d
            goto L_0x03a0
        L_0x039d:
            r0.setVisibility(r4)
        L_0x03a0:
            android.widget.ProgressBar r0 = r7.f286l
            if (r0 != 0) goto L_0x03aa
            goto L_0x03ad
        L_0x03a5:
            android.widget.ProgressBar r0 = r7.f285k
            if (r0 != 0) goto L_0x03aa
            goto L_0x03ad
        L_0x03aa:
            r0.setVisibility(r3)
        L_0x03ad:
            boolean r0 = r7.A
            if (r0 == 0) goto L_0x0413
            if (r8 != 0) goto L_0x0413
            g.c.a.l.i r8 = g.c.a.l.i.a
            android.widget.Button r0 = r7.o
            g.c.a.l.l.o r2 = r7.B
            if (r2 != 0) goto L_0x03bd
            r2 = r1
            goto L_0x03c1
        L_0x03bd:
            java.lang.String r2 = r2.g()
        L_0x03c1:
            g.c.a.l.l.o r3 = r7.B
            if (r3 != 0) goto L_0x03c7
            r3 = r1
            goto L_0x03cd
        L_0x03c7:
            int r3 = r3.c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x03cd:
            if (r0 != 0) goto L_0x03d1
            r4 = r1
            goto L_0x03d5
        L_0x03d1:
            java.lang.Object r4 = r0.getTag()
        L_0x03d5:
            boolean r4 = i.o.c.h.a(r3, r4)
            if (r4 == 0) goto L_0x03dc
            goto L_0x0413
        L_0x03dc:
            if (r0 != 0) goto L_0x03df
            goto L_0x03e2
        L_0x03df:
            r0.setTag(r3)
        L_0x03e2:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r5 = "pop_type"
            java.lang.String r6 = "fast_download_pop"
            r4.put(r5, r6)
            java.lang.String r5 = ""
            if (r2 != 0) goto L_0x03f3
            r2 = r5
        L_0x03f3:
            java.lang.String r6 = "package_name"
            r4.put(r6, r2)
            if (r3 != 0) goto L_0x03fb
            goto L_0x0403
        L_0x03fb:
            java.lang.String r2 = r3.toString()
            if (r2 != 0) goto L_0x0402
            goto L_0x0403
        L_0x0402:
            r5 = r2
        L_0x0403:
            java.lang.String r2 = "status"
            r4.put(r2, r5)
            java.lang.String r2 = "retry_button"
            g.c.a.e.h.b.d.g(r0, r2, r4)
            r8.e(r0)
            g.c.a.e.h.b.d.d(r0)
        L_0x0413:
            g.c.a.l.l.c0 r8 = r7.C
            if (r8 != 0) goto L_0x0418
            goto L_0x042e
        L_0x0418:
            g.c.a.l.l.o r0 = r7.B
            if (r0 != 0) goto L_0x041e
            r0 = r1
            goto L_0x0424
        L_0x041e:
            int r0 = r0.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0424:
            i.o.c.h.c(r0)
            int r0 = r0.intValue()
            r8.e(r0)
        L_0x042e:
            org.slf4j.Logger r8 = S
            g.c.a.l.l.c0 r0 = r7.C
            if (r0 != 0) goto L_0x0435
            goto L_0x0439
        L_0x0435:
            java.lang.String r1 = r0.f()
        L_0x0439:
            java.lang.String r0 = "更新状态:"
            java.lang.String r0 = i.o.c.h.j(r0, r1)
            r8.info(r0)
            g.c.a.l.l.c0 r8 = r7.C
            if (r8 != 0) goto L_0x0447
            goto L_0x0459
        L_0x0447:
            g.c.a.l.d r0 = g.c.a.l.d.a
            android.content.Context r1 = r7.getContext()
            android.content.Context r1 = r1.getApplicationContext()
            java.lang.String r2 = "context.applicationContext"
            i.o.c.h.d(r1, r2)
            r0.n(r1, r8)
        L_0x0459:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apkpure.aegon.signstuff.view.StuffApkInstallView.p(boolean):void");
    }
}
