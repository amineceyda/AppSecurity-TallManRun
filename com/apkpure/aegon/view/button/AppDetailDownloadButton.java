package com.apkpure.aegon.view.button;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.apkpure.aegon.components.download.DownloadTask;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import com.tencent.trpcprotocol.projecta.common.assetinfo.nano.AssetInfo;
import g.c.a.e.k.f.b;
import g.c.a.n.a.a;
import g.c.a.n.a.i;
import g.c.a.n.a.j;
import g.c.a.n.a.k;
import i.o.c.h;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

public final class AppDetailDownloadButton extends DownloadButton {
    public static final /* synthetic */ int u = 0;
    public Drawable s;
    public TextView t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppDetailDownloadButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        h.e(attributeSet, "attrs");
    }

    public void b() {
        i downloadButtonManager = getDownloadButtonManager();
        Context context = getContext();
        h.d(context, "context");
        downloadButtonManager.e(context, getDownloadButtonStateInfo());
    }

    public void c() {
        i downloadButtonManager = getDownloadButtonManager();
        Context context = getContext();
        h.d(context, "context");
        downloadButtonManager.a(context, getDownloadButtonStateInfo());
    }

    public void e() {
        ProgressBar downloadProgressBar = getDownloadProgressBar();
        Integer valueOf = downloadProgressBar == null ? null : Integer.valueOf(downloadProgressBar.getVisibility());
        if (valueOf != null && valueOf.intValue() == 0) {
            ProgressBar downloadProgressBar2 = getDownloadProgressBar();
            if (downloadProgressBar2 != null) {
                downloadProgressBar2.setVisibility(8);
            }
            ProgressBar downloadProgressBar3 = getDownloadProgressBar();
            if (downloadProgressBar3 != null) {
                downloadProgressBar3.setProgress(0);
            }
            TextView textView = this.t;
            if (textView != null) {
                textView.setBackground(this.s);
            }
        }
    }

    public void h(Context context) {
        h.e(context, "context");
        Object systemService = context.getSystemService("layout_inflater");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(2131493373, this, true);
        View findViewById = findViewById(2131298162);
        Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        this.t = (TextView) findViewById;
        setButtonTextView((TextView) findViewById(2131298164));
        TextView buttonTextView = getButtonTextView();
        if (buttonTextView != null) {
            buttonTextView.bringToFront();
        }
        TextView textView = this.t;
        this.s = textView == null ? null : textView.getBackground();
        setDownloadProgressBar((ProgressBar) findViewById(2131298244));
        setOnClickListener(new a(this));
    }

    public void j() {
        i downloadButtonManager = getDownloadButtonManager();
        Context context = getContext();
        h.d(context, "context");
        downloadButtonManager.a(context, getDownloadButtonStateInfo());
    }

    public void m() {
        ProgressBar downloadProgressBar = getDownloadProgressBar();
        Drawable drawable = null;
        Integer valueOf = downloadProgressBar == null ? null : Integer.valueOf(downloadProgressBar.getVisibility());
        if (valueOf != null && valueOf.intValue() == 8) {
            ProgressBar downloadProgressBar2 = getDownloadProgressBar();
            if (downloadProgressBar2 != null) {
                downloadProgressBar2.setVisibility(0);
            }
            TextView textView = this.t;
            if (textView != null) {
                Drawable a = e.e.c.c.h.a(getResources(), 2131231501, getContext().getTheme());
                if (a != null) {
                    Context context = getContext();
                    h.b(context, "context");
                    h.f(context, "receiver$0");
                    Resources.Theme theme = context.getTheme();
                    h.b(theme, "theme");
                    h.f(theme, "receiver$0");
                    h.f(theme, "receiver$0");
                    TypedValue typedValue = new TypedValue();
                    if (theme.resolveAttribute(2130969859, typedValue, true)) {
                        int i2 = typedValue.type;
                        if (i2 < 28 || i2 > 31) {
                            throw new IllegalArgumentException("Attribute value type is not color: 2130969859");
                        }
                        a.setColorFilter(typedValue.data, PorterDuff.Mode.SRC_ATOP);
                        drawable = a;
                    } else {
                        throw new IllegalArgumentException("Failed to resolve attribute: 2130969859");
                    }
                }
                textView.setBackground(drawable);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d7, code lost:
        if (r0 == null) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00de, code lost:
        if (r0 == null) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r0 == null) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fe, code lost:
        r2 = r2.getText(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0107, code lost:
        if (r0 == null) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0111, code lost:
        if (r0 == null) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0114, code lost:
        r2 = getResources().getText(2131821001);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011c, code lost:
        r2 = p(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0136, code lost:
        r2 = r2.getString(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013a, code lost:
        r0.setText(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013d, code lost:
        r0 = getDownloadButtonStateInfo().b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0143, code lost:
        if (r0 != null) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0146, code lost:
        r1 = java.lang.Boolean.valueOf(r0.isDownloading());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0154, code lost:
        if (i.o.c.h.a(r1, java.lang.Boolean.FALSE) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0156, code lost:
        e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n() {
        /*
            r6 = this;
            g.c.a.n.a.k r0 = r6.getDownloadButtonStateInfo()
            g.c.a.n.a.j r0 = r0.a
            int r0 = r0.ordinal()
            r1 = 0
            r2 = 2131821001(0x7f1101c9, float:1.9274733E38)
            switch(r0) {
                case 1: goto L_0x0103;
                case 2: goto L_0x00e1;
                case 3: goto L_0x00da;
                case 4: goto L_0x00d3;
                case 5: goto L_0x00c2;
                case 6: goto L_0x00b1;
                case 7: goto L_0x004c;
                case 8: goto L_0x0125;
                case 9: goto L_0x0019;
                case 10: goto L_0x003b;
                case 11: goto L_0x002a;
                case 12: goto L_0x010a;
                case 13: goto L_0x00f0;
                default: goto L_0x0011;
            }
        L_0x0011:
            android.widget.TextView r0 = r6.getButtonTextView()
            if (r0 != 0) goto L_0x0114
            goto L_0x013d
        L_0x0019:
            android.widget.TextView r0 = r6.getButtonTextView()
            if (r0 != 0) goto L_0x0021
            goto L_0x013d
        L_0x0021:
            android.content.res.Resources r2 = r6.getResources()
            r3 = 2131821817(0x7f1104f9, float:1.9276388E38)
            goto L_0x00fe
        L_0x002a:
            android.widget.TextView r0 = r6.getButtonTextView()
            if (r0 != 0) goto L_0x0032
            goto L_0x013d
        L_0x0032:
            android.content.Context r2 = r6.getContext()
            r3 = 2131821950(0x7f11057e, float:1.9276658E38)
            goto L_0x0136
        L_0x003b:
            android.widget.TextView r0 = r6.getButtonTextView()
            if (r0 != 0) goto L_0x0043
            goto L_0x013d
        L_0x0043:
            android.content.Context r2 = r6.getContext()
            r3 = 2131821951(0x7f11057f, float:1.927666E38)
            goto L_0x0136
        L_0x004c:
            android.widget.TextView r0 = r6.getButtonTextView()
            if (r0 != 0) goto L_0x0054
            goto L_0x013d
        L_0x0054:
            android.content.Context r2 = r6.getContext()
            r3 = 2131820827(0x7f11011b, float:1.927438E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r3 = "context.getString(R.string.continue_)"
            i.o.c.h.d(r2, r3)
            g.c.a.n.a.k r3 = r6.getDownloadButtonStateInfo()
            if (r3 != 0) goto L_0x006c
            r3 = r1
            goto L_0x006e
        L_0x006c:
            com.apkpure.aegon.components.download.DownloadTask r3 = r3.b
        L_0x006e:
            if (r3 == 0) goto L_0x009f
            r3.getDownloadPercent()
            java.text.DecimalFormat r4 = new java.text.DecimalFormat
            java.lang.String r5 = "0.0"
            r4.<init>(r5)
            float r3 = r3.getDownloadPercent()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.String r3 = r4.format(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r2 = 40
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = "%)"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
        L_0x009f:
            if (r2 != 0) goto L_0x00a4
            r2 = r1
            goto L_0x013a
        L_0x00a4:
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toUpperCase(r3)
            java.lang.String r3 = "(this as java.lang.Strin….toUpperCase(Locale.ROOT)"
            i.o.c.h.d(r2, r3)
            goto L_0x013a
        L_0x00b1:
            android.widget.TextView r0 = r6.getButtonTextView()
            if (r0 != 0) goto L_0x00b9
            goto L_0x013d
        L_0x00b9:
            android.content.Context r2 = r6.getContext()
            r3 = 2131821250(0x7f1102c2, float:1.9275238E38)
            goto L_0x0136
        L_0x00c2:
            android.widget.TextView r0 = r6.getButtonTextView()
            if (r0 != 0) goto L_0x00ca
            goto L_0x013d
        L_0x00ca:
            android.content.Context r2 = r6.getContext()
            r3 = 2131821235(0x7f1102b3, float:1.9275207E38)
            goto L_0x0136
        L_0x00d3:
            android.widget.TextView r0 = r6.getButtonTextView()
            if (r0 != 0) goto L_0x0114
            goto L_0x013d
        L_0x00da:
            android.widget.TextView r0 = r6.getButtonTextView()
            if (r0 != 0) goto L_0x0114
            goto L_0x013d
        L_0x00e1:
            android.widget.TextView r0 = r6.getButtonTextView()
            if (r0 != 0) goto L_0x00e8
            goto L_0x013d
        L_0x00e8:
            android.content.Context r2 = r6.getContext()
            r3 = 2131821546(0x7f1103ea, float:1.9275838E38)
            goto L_0x0136
        L_0x00f0:
            android.widget.TextView r0 = r6.getButtonTextView()
            if (r0 != 0) goto L_0x00f7
            goto L_0x013d
        L_0x00f7:
            android.content.res.Resources r2 = r6.getResources()
            r3 = 2131821450(0x7f11038a, float:1.9275644E38)
        L_0x00fe:
            java.lang.CharSequence r2 = r2.getText(r3)
            goto L_0x011c
        L_0x0103:
            android.widget.TextView r0 = r6.getButtonTextView()
            if (r0 != 0) goto L_0x0114
            goto L_0x013d
        L_0x010a:
            r6.q()
            android.widget.TextView r0 = r6.getButtonTextView()
            if (r0 != 0) goto L_0x0114
            goto L_0x013d
        L_0x0114:
            android.content.res.Resources r3 = r6.getResources()
            java.lang.CharSequence r2 = r3.getText(r2)
        L_0x011c:
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r6.p(r2)
            goto L_0x013a
        L_0x0125:
            r6.q()
            android.widget.TextView r0 = r6.getButtonTextView()
            if (r0 != 0) goto L_0x012f
            goto L_0x013d
        L_0x012f:
            android.content.Context r2 = r6.getContext()
            r3 = 2131820978(0x7f1101b2, float:1.9274686E38)
        L_0x0136:
            java.lang.String r2 = r2.getString(r3)
        L_0x013a:
            r0.setText(r2)
        L_0x013d:
            g.c.a.n.a.k r0 = r6.getDownloadButtonStateInfo()
            com.apkpure.aegon.components.download.DownloadTask r0 = r0.b
            if (r0 != 0) goto L_0x0146
            goto L_0x014e
        L_0x0146:
            boolean r0 = r0.isDownloading()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x014e:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = i.o.c.h.a(r1, r0)
            if (r0 == 0) goto L_0x0159
            r6.e()
        L_0x0159:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apkpure.aegon.view.button.AppDetailDownloadButton.n():void");
    }

    public void o(String str) {
        DownloadTask downloadTask;
        k downloadButtonStateInfo = getDownloadButtonStateInfo();
        Boolean bool = null;
        if (!(downloadButtonStateInfo == null || (downloadTask = downloadButtonStateInfo.b) == null)) {
            bool = Boolean.valueOf(downloadTask.isDownloading());
        }
        if (h.a(bool, Boolean.TRUE)) {
            m();
        } else {
            e();
        }
        if (str == null || str.length() == 0) {
            n();
        } else if (getDownloadButtonStateInfo().a == j.f2102h) {
            TextView buttonTextView = getButtonTextView();
            if (buttonTextView != null) {
                String obj = getResources().getText(2131821817).toString();
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                String upperCase = obj.toUpperCase(Locale.ROOT);
                h.d(upperCase, "(this as java.lang.Strin….toUpperCase(Locale.ROOT)");
                String format = String.format("%s（%s）", Arrays.copyOf(new Object[]{upperCase, str}, 2));
                h.d(format, "java.lang.String.format(format, *args)");
                buttonTextView.setText(format);
            }
        } else {
            TextView buttonTextView2 = getButtonTextView();
            if (buttonTextView2 != null) {
                buttonTextView2.setText(str);
            }
        }
    }

    public final String p(String str) {
        if (getDownloadButtonStateInfo().c == null) {
            return str;
        }
        AppDetailInfo appDetailInfo = getDownloadButtonStateInfo().c;
        h.c(appDetailInfo);
        if (appDetailInfo.asset == null) {
            return str;
        }
        AppDetailInfo appDetailInfo2 = getDownloadButtonStateInfo().c;
        h.c(appDetailInfo2);
        AssetInfo assetInfo = appDetailInfo2.asset;
        h.c(assetInfo);
        String format = String.format("%s（%s）", Arrays.copyOf(new Object[]{str, b.a(assetInfo.size)}, 2));
        h.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public final void q() {
        TextView buttonTextView = getButtonTextView();
        if (buttonTextView != null) {
            buttonTextView.setHeight((int) ((float) e.e.d.l.a.v(getContext(), 44.0f)));
        }
        View findViewById = findViewById(2131298622);
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(new g.c.a.n.a.b(this));
    }
}
