package com.apkpure.components.installer.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import g.c.b.b.i.d;
import g.c.b.b.i.e.e;
import g.c.b.b.i.e.k;
import g.c.b.b.k.g;
import g.c.b.b.k.j;
import g.c.b.b.k.o;
import g.c.b.b.k.r;
import i.o.c.f;
import i.o.c.h;
import i.o.c.i;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class InstallApksActivity extends Activity {
    public static final a r = new a((f) null);
    public static final Logger s = LoggerFactory.getLogger("InstallApksActivityLog");
    public Context b;
    public k c;

    /* renamed from: d  reason: collision with root package name */
    public g.c.b.b.j.a f335d;

    /* renamed from: e  reason: collision with root package name */
    public final int f336e = 100;

    /* renamed from: f  reason: collision with root package name */
    public Serializable f337f;

    /* renamed from: g  reason: collision with root package name */
    public int f338g = 2131886549;

    /* renamed from: h  reason: collision with root package name */
    public String f339h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f340i;

    /* renamed from: j  reason: collision with root package name */
    public int f341j;

    /* renamed from: k  reason: collision with root package name */
    public int f342k = -1;

    /* renamed from: l  reason: collision with root package name */
    public g.c.b.b.g.a f343l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f344m;
    public boolean n;
    public boolean o = true;
    public final i.c p = g.c.b.b.f.U(b.b);
    public final i.c q = g.c.b.b.f.U(new d(this));

    public static final class a {
        public a(f fVar) {
        }

        public final String a(Context context) {
            h.e(context, "ctx");
            return h.j(context.getPackageName(), ".SESSION_API_PACKAGE_INSTALLED");
        }

        public final String b(Context context) {
            h.e(context, "ctx");
            return h.j(context.getPackageName(), ".SESSION_API_PACKAGE_UNINSTALL");
        }

        public final void c(Context context, int i2, String str, g.c.b.b.j.b bVar) {
            h.e(context, "ctx");
            h.e(str, "filePath");
            h.e(bVar, "options");
            Logger logger = InstallApksActivity.s;
            logger.info("InstallApksActivity startAction context: " + context + ", commit: " + i2 + ", filePath: " + str);
            try {
                Intent intent = new Intent(context, InstallApksActivity.class);
                intent.addFlags(268435456);
                intent.putExtra("locale", bVar.c);
                intent.putExtra("them", bVar.f2280e);
                intent.putExtra("path", str);
                intent.putExtra("anim", bVar.f2282g);
                intent.putExtra("navigation_bar", bVar.f2284i);
                intent.putExtra("commit", i2);
                context.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    public static final class b extends i implements i.o.b.a<Handler> {
        public static final b b = new b();

        public b() {
            super(0);
        }

        public Object a() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public static final class c implements g.c.b.b.i.c {
        public final /* synthetic */ InstallApksActivity a;

        public c(InstallApksActivity installApksActivity) {
            this.a = installApksActivity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(g.c.b.b.j.a r7) {
            /*
                r6 = this;
                java.lang.String r0 = "installTask"
                i.o.c.h.e(r7, r0)
                com.apkpure.components.installer.ui.InstallApksActivity r1 = r6.a
                g.c.b.b.c$b r2 = g.c.b.b.c.f2226m
                g.c.b.b.c r3 = r2.a()
                g.c.b.b.i.e.k r3 = r3.f2227d
                r1.c = r3
                com.apkpure.components.installer.ui.InstallApksActivity r1 = r6.a
                java.lang.String r3 = r7.f2271d
                if (r3 != 0) goto L_0x0018
                return
            L_0x0018:
                g.c.b.b.g.a r4 = r1.f343l
                if (r4 == 0) goto L_0x009b
                android.widget.LinearLayout r4 = r4.f2255m
                g.c.b.b.k.a r5 = new g.c.b.b.k.a
                r5.<init>(r1, r3)
                r4.post(r5)
                com.apkpure.components.installer.ui.InstallApksActivity r1 = r6.a
                r1.f335d = r7
                g.c.b.b.i.e.k r1 = r1.c
                if (r1 != 0) goto L_0x002f
                goto L_0x003e
            L_0x002f:
                i.o.c.h.e(r7, r0)
                android.os.Handler r0 = r1.a()
                g.c.b.b.i.e.j r3 = new g.c.b.b.i.e.j
                r3.<init>(r1, r7)
                r0.post(r3)
            L_0x003e:
                java.lang.String r0 = android.os.Build.MANUFACTURER
                java.lang.String r1 = "MANUFACTURER"
                i.o.c.h.d(r0, r1)
                int r1 = r0.length()
                r3 = 1
                r4 = 0
                if (r1 != 0) goto L_0x004f
                r1 = 1
                goto L_0x0050
            L_0x004f:
                r1 = 0
            L_0x0050:
                if (r1 == 0) goto L_0x0053
                goto L_0x0067
            L_0x0053:
                java.lang.String r0 = r0.toLowerCase()
                java.lang.String r1 = "(this as java.lang.String).toLowerCase()"
                i.o.c.h.d(r0, r1)
                r1 = 2
                java.lang.String r5 = "vivo"
                boolean r0 = i.t.e.m(r0, r5, r4, r1)
                if (r0 == 0) goto L_0x0067
                r0 = 1
                goto L_0x0068
            L_0x0067:
                r0 = 0
            L_0x0068:
                if (r0 == 0) goto L_0x009a
                com.apkpure.components.installer.ui.InstallApksActivity r0 = r6.a
                java.lang.String r7 = r7.a
                java.util.Objects.requireNonNull(r0)
                if (r7 == 0) goto L_0x007b
                int r1 = r7.length()
                if (r1 != 0) goto L_0x007a
                goto L_0x007b
            L_0x007a:
                r3 = 0
            L_0x007b:
                if (r3 == 0) goto L_0x007e
                goto L_0x009a
            L_0x007e:
                org.slf4j.Logger r1 = com.apkpure.components.installer.ui.InstallApksActivity.s
                java.lang.String r3 = "register package event"
                r1.info(r3)
                g.c.b.b.c r1 = r2.a()
                java.util.List<java.lang.String> r1 = r1.f2232i
                r1.add(r7)
                android.os.Handler r7 = r0.b()
                g.c.b.b.k.c r1 = new g.c.b.b.k.c
                r1.<init>(r0)
                r7.post(r1)
            L_0x009a:
                return
            L_0x009b:
                java.lang.String r7 = "binding"
                i.o.c.h.k(r7)
                r7 = 0
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apkpure.components.installer.ui.InstallApksActivity.c.a(g.c.b.b.j.a):void");
        }

        public boolean b(g.c.b.b.j.a aVar) {
            h.e(aVar, "installTask");
            InstallApksActivity.a(this.a, true, aVar);
            k kVar = this.a.c;
            if (kVar != null) {
                kVar.d(aVar);
            }
            return this.a.f344m;
        }

        public void c() {
            h.e(this, "this");
        }

        public void e() {
            h.e(this, "this");
        }

        public void f(g.c.b.b.j.a aVar) {
            h.e(aVar, "installTask");
            k kVar = this.a.c;
            if (kVar != null) {
                kVar.e(aVar);
            }
        }

        public void g(g.c.b.b.j.a aVar) {
            h.e(aVar, "installTask");
            k kVar = this.a.c;
            if (kVar != null) {
                h.e(aVar, "installTask");
                kVar.a().post(new e(kVar, aVar));
            }
        }

        public void h(View view) {
            h.e(view, "adView");
            g.c.b.b.f.e0(this, view);
            g.c.b.b.g.a aVar = this.a.f343l;
            if (aVar != null) {
                LinearLayout linearLayout = aVar.f2252j;
                linearLayout.post(new g(view, linearLayout));
                return;
            }
            h.k("binding");
            throw null;
        }

        public boolean i(g.c.b.b.j.a aVar) {
            h.e(aVar, "installTask");
            InstallApksActivity.a(this.a, false, aVar);
            k kVar = this.a.c;
            if (kVar != null) {
                kVar.b(aVar);
            }
            return this.a.n;
        }

        public void j(g.c.b.b.j.a aVar, int i2, String str) {
            h.e(aVar, "installTask");
            h.e(str, "msg");
            k kVar = this.a.c;
            if (kVar != null) {
                kVar.c(aVar, i2, str);
            }
            if (i2 == 16) {
                this.a.b().post(new g.c.b.b.k.h(this.a));
            } else {
                this.a.finish();
            }
        }
    }

    public static final class d extends i implements i.o.b.a<d.b> {
        public final /* synthetic */ InstallApksActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(InstallApksActivity installApksActivity) {
            super(0);
            this.this$0 = installApksActivity;
        }

        public Object a() {
            InstallApksActivity installApksActivity = this.this$0;
            Context context = installApksActivity.b;
            if (context != null) {
                return new d.b(context, new o(installApksActivity));
            }
            h.k("context");
            throw null;
        }
    }

    public static final void a(InstallApksActivity installApksActivity, boolean z, g.c.b.b.j.a aVar) {
        g.c.b.b.g.a aVar2 = installApksActivity.f343l;
        if (aVar2 != null) {
            TextView textView = aVar2.b;
            textView.post(new g.c.b.b.k.b(textView, z, installApksActivity, aVar));
            return;
        }
        h.k("binding");
        throw null;
    }

    public final Handler b() {
        return (Handler) this.p.getValue();
    }

    public final void c(boolean z) {
        s.debug(h.j("InstallApksActivity install isRemove:", Boolean.valueOf(z)));
        if (z) {
            g.c.b.b.l.e.f(this, this.f342k == 3);
        }
        this.o = false;
        g.c.b.b.c a2 = g.c.b.b.c.f2226m.a();
        Context context = this.b;
        if (context != null) {
            a2.u(context, this.f342k, new c(this), true);
        } else {
            h.k("context");
            throw null;
        }
    }

    public final void d(Serializable serializable) {
        if (serializable != null && (serializable instanceof Locale)) {
            r rVar = r.a;
            Locale locale = (Locale) serializable;
            h.e(this, "context");
            h.e(locale, "locale");
            Resources resources = getResources();
            if (resources != null) {
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                Configuration configuration = resources.getConfiguration();
                if (Build.VERSION.SDK_INT >= 24) {
                    configuration.setLocale(locale);
                } else {
                    configuration.locale = locale;
                }
                resources.updateConfiguration(configuration, displayMetrics);
            }
        }
    }

    public final void e(int i2) {
        if (i2 != 0 && Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().setNavigationBarColor(i2);
        }
    }

    public final void f() {
        g.c.b.b.l.e.f(this, this.f342k == 3);
        g.c.b.b.h.b bVar = new g.c.b.b.h.b(this, false);
        bVar.f(2131821012);
        bVar.b(2131821022);
        bVar.a(false);
        bVar.e(17039370, new g.c.b.b.k.k(this));
        bVar.d(17039360, new g.c.b.b.k.d(this));
        bVar.show();
    }

    public void finish() {
        super.finish();
        if (this.f340i) {
            overridePendingTransition(2130772043, 2130772028);
        }
    }

    public final void g() {
        s.debug("InstallApksActivity request package install permission");
        Context context = this.b;
        if (context != null) {
            g.c.b.b.l.e.d(context, this.f342k == 3, this.f339h);
            try {
                startActivityForResult(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse(h.j("package:", getPackageName()))), 1);
            } catch (Exception unused) {
            }
        } else {
            h.k("context");
            throw null;
        }
    }

    public final void h() {
        g.c.b.b.g.a aVar = this.f343l;
        if (aVar != null) {
            aVar.f2253k.setVisibility(8);
            aVar.f2251i.setVisibility(0);
            aVar.c.setVisibility(0);
            return;
        }
        h.k("binding");
        throw null;
    }

    public final void i() {
        h();
        g.c.b.b.g.a aVar = this.f343l;
        if (aVar != null) {
            aVar.f2246d.setVisibility(4);
            aVar.f2247e.setImageResource(2131231011);
            TextView textView = aVar.f2248f;
            int i2 = 8;
            if (g.c.b.b.f.P() && g.c.b.b.f.Q()) {
                i2 = 0;
            }
            textView.setVisibility(i2);
            TextView textView2 = aVar.f2250h;
            textView2.setVisibility(0);
            textView2.setText(getString(2131821012));
            Button button = aVar.f2249g;
            button.setText(getString(2131821010));
            button.setVisibility(0);
            button.setOnClickListener(new j(this));
            return;
        }
        h.k("binding");
        throw null;
    }

    public final void j() {
        h();
        g.c.b.b.g.a aVar = this.f343l;
        if (aVar != null) {
            aVar.f2247e.setImageResource(2131231010);
            aVar.f2248f.setVisibility(8);
            TextView textView = aVar.f2250h;
            textView.setVisibility(0);
            textView.setText(getString(2131821024));
            Button button = aVar.f2246d;
            button.setVisibility(0);
            button.setOnClickListener(new g.c.b.b.k.f(this));
            Button button2 = aVar.f2249g;
            button2.setText(getString(2131821020));
            button2.setVisibility(0);
            button2.setOnClickListener(new g.c.b.b.k.e(this, button2));
            return;
        }
        h.k("binding");
        throw null;
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        k kVar;
        Logger logger = s;
        StringBuilder k2 = g.a.a.a.a.k("onActivityResult requestCode: ", i2, ", resultCode: ", i3, ", data: ");
        k2.append(intent);
        k2.append(' ');
        logger.info(k2.toString());
        super.onActivityResult(i2, i3, intent);
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3 && i3 == -1 && (kVar = this.c) != null) {
                    g.c.b.b.j.a aVar = this.f335d;
                    if (aVar != null) {
                        kVar.e(aVar);
                        return;
                    } else {
                        h.k("mInstallTask");
                        throw null;
                    }
                } else {
                    return;
                }
            } else if (i3 != -1) {
                finish();
                return;
            }
        } else if (i3 != -1) {
            f();
            return;
        }
        c(true);
    }

    public void onCreate(Bundle bundle) {
        String str;
        Bundle bundle2 = bundle;
        Logger logger = s;
        logger.debug("InstallApksActivity onCreate");
        if (bundle2 != null) {
            this.f337f = bundle2.getSerializable("locale");
            this.f338g = bundle2.getInt("them");
            this.f339h = bundle2.getString("path");
            this.f340i = bundle2.getBoolean("anim");
            this.f341j = bundle2.getInt("navigation_bar");
            this.f342k = bundle2.getInt("commit");
            e(this.f341j);
            d(this.f337f);
            setTheme(this.f338g);
        } else {
            Intent intent = getIntent();
            this.f337f = intent == null ? null : intent.getSerializableExtra("locale");
            this.f341j = getIntent().getIntExtra("navigation_bar", 0);
            this.f342k = getIntent().getIntExtra("commit", -1);
            e(this.f341j);
            d(this.f337f);
            int intExtra = getIntent().getIntExtra("them", 2131886549);
            this.f338g = intExtra;
            setTheme(intExtra);
            Intent intent2 = getIntent();
            this.f339h = intent2 == null ? null : intent2.getStringExtra("path");
            this.f340i = getIntent().getBooleanExtra("anim", false);
        }
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(2131492909, (ViewGroup) null, false);
        int i2 = 2131296673;
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(2131296673);
        if (relativeLayout != null) {
            i2 = 2131297003;
            ProgressBar progressBar = (ProgressBar) inflate.findViewById(2131297003);
            if (progressBar != null) {
                i2 = 2131297004;
                TextView textView = (TextView) inflate.findViewById(2131297004);
                if (textView != null) {
                    i2 = 2131297006;
                    LinearLayout linearLayout = (LinearLayout) inflate.findViewById(2131297006);
                    if (linearLayout != null) {
                        i2 = 2131297007;
                        Button button = (Button) inflate.findViewById(2131297007);
                        if (button != null) {
                            i2 = 2131297008;
                            ImageView imageView = (ImageView) inflate.findViewById(2131297008);
                            if (imageView != null) {
                                i2 = 2131297009;
                                TextView textView2 = (TextView) inflate.findViewById(2131297009);
                                if (textView2 != null) {
                                    i2 = 2131297010;
                                    Button button2 = (Button) inflate.findViewById(2131297010);
                                    if (button2 != null) {
                                        i2 = 2131297011;
                                        TextView textView3 = (TextView) inflate.findViewById(2131297011);
                                        if (textView3 != null) {
                                            i2 = 2131297012;
                                            LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(2131297012);
                                            if (linearLayout2 != null) {
                                                i2 = 2131297013;
                                                LinearLayout linearLayout3 = (LinearLayout) inflate.findViewById(2131297013);
                                                if (linearLayout3 != null) {
                                                    i2 = 2131297014;
                                                    LinearLayout linearLayout4 = (LinearLayout) inflate.findViewById(2131297014);
                                                    if (linearLayout4 != null) {
                                                        i2 = 2131297689;
                                                        TextView textView4 = (TextView) inflate.findViewById(2131297689);
                                                        if (textView4 != null) {
                                                            i2 = 2131297705;
                                                            LinearLayout linearLayout5 = (LinearLayout) inflate.findViewById(2131297705);
                                                            if (linearLayout5 != null) {
                                                                g.c.b.b.g.a aVar = new g.c.b.b.g.a((LinearLayout) inflate, relativeLayout, progressBar, textView, linearLayout, button, imageView, textView2, button2, textView3, linearLayout2, linearLayout3, linearLayout4, textView4, linearLayout5);
                                                                h.d(aVar, "inflate(layoutInflater)");
                                                                this.f343l = aVar;
                                                                setContentView(aVar.a);
                                                                if (this.f340i) {
                                                                    overridePendingTransition(2130772027, 2130772043);
                                                                }
                                                                this.b = this;
                                                                if (this.f342k == 3) {
                                                                    str = getString(2131821014);
                                                                } else {
                                                                    String string = getString(2131821023);
                                                                    h.d(string, "getString(R.string.installer_staging)");
                                                                    str = String.format(string, Arrays.copyOf(new Object[]{"0%"}, 1));
                                                                    h.d(str, "java.lang.String.format(format, *args)");
                                                                }
                                                                g.c.b.b.g.a aVar2 = this.f343l;
                                                                if (aVar2 != null) {
                                                                    aVar2.b.setText(str);
                                                                    int i3 = Build.VERSION.SDK_INT;
                                                                    if (i3 >= 26 ? getPackageManager().canRequestPackageInstalls() : true) {
                                                                        logger.debug("InstallApksActivity have package install Permission");
                                                                        if (i3 <= 29 || bundle2 == null) {
                                                                            c(true);
                                                                            return;
                                                                        } else {
                                                                            c(false);
                                                                            return;
                                                                        }
                                                                    } else if (i3 < 26) {
                                                                        return;
                                                                    } else {
                                                                        if (!TextUtils.isEmpty(g.c.b.b.l.e.a(this)) || !TextUtils.isEmpty(g.c.b.b.l.e.h(this))) {
                                                                            f();
                                                                            return;
                                                                        } else {
                                                                            g();
                                                                            return;
                                                                        }
                                                                    }
                                                                } else {
                                                                    h.k("binding");
                                                                    throw null;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    public void onDestroy() {
        super.onDestroy();
        g.c.b.b.c.f2226m.a().s();
        s.info("unregister package event");
        b().post(new g.c.b.b.k.i(this));
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        h.e(keyEvent, "event");
        if (i2 == 4 && this.f344m) {
            return true;
        }
        this.f344m = true;
        this.n = true;
        return super.onKeyDown(i2, keyEvent);
    }

    public void onNewIntent(Intent intent) {
        Bundle extras;
        k kVar;
        g.c.b.b.j.a aVar;
        k kVar2;
        k kVar3;
        Logger logger = s;
        logger.info(h.j("onNewIntent intent: ", intent));
        if (!(intent == null || intent.getExtras() == null)) {
            Bundle extras2 = intent.getExtras();
            h.d(extras2, "intent.extras");
            logger.info(h.j("onNewIntent extras: ", extras2));
        }
        super.onNewIntent(intent);
        if (intent != null && (extras = intent.getExtras()) != null) {
            int i2 = extras.getInt("android.content.pm.extra.STATUS");
            String string = extras.getString("android.content.pm.extra.STATUS_MESSAGE");
            switch (i2) {
                case -1:
                    try {
                        Object obj = extras.get("android.intent.extra.INTENT");
                        if (obj != null) {
                            Intent intent2 = (Intent) obj;
                            if (intent2.resolveActivity(getPackageManager()) != null) {
                                startActivity(intent2);
                                break;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.content.Intent");
                        }
                    } catch (Exception unused) {
                        break;
                    }
                    break;
                case 0:
                    if (!this.o) {
                        this.o = true;
                        logger.info(h.j("newInstance status success, action: ", intent.getAction()));
                        String action = intent.getAction();
                        Context context = this.b;
                        if (context != null) {
                            h.e(context, "ctx");
                            if (h.a(action, h.j(context.getPackageName(), ".SESSION_API_PACKAGE_INSTALLED"))) {
                                g.c.b.b.j.a aVar2 = this.f335d;
                                if (!(aVar2 == null || (kVar = this.c) == null)) {
                                    kVar.e(aVar2);
                                }
                                j();
                                break;
                            } else {
                                Context context2 = this.b;
                                if (context2 != null) {
                                    h.e(context2, "ctx");
                                    if (h.a(action, h.j(context2.getPackageName(), ".SESSION_API_PACKAGE_UNINSTALL"))) {
                                        c(true);
                                        break;
                                    }
                                } else {
                                    h.k("context");
                                    throw null;
                                }
                            }
                        } else {
                            h.k("context");
                            throw null;
                        }
                    }
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    StringBuilder i3 = g.a.a.a.a.i("newInstance status fail, action: ");
                    i3.append(intent.getAction());
                    i3.append(", status: ");
                    i3.append(i2);
                    i3.append(", message: ");
                    i3.append(string);
                    logger.info(i3.toString());
                    String action2 = intent.getAction();
                    Context context3 = this.b;
                    if (context3 != null) {
                        h.e(context3, "ctx");
                        if (h.a(action2, h.j(context3.getPackageName(), ".SESSION_API_PACKAGE_INSTALLED"))) {
                            g.c.b.b.j.a aVar3 = this.f335d;
                            if (!(aVar3 == null || (kVar3 = this.c) == null)) {
                                if (string == null) {
                                    string = "";
                                }
                                kVar3.c(aVar3, i2, string);
                            }
                            if (i2 != 3) {
                                i();
                                break;
                            }
                        } else {
                            Context context4 = this.b;
                            if (context4 != null) {
                                h.e(context4, "ctx");
                                if (!(!h.a(action2, h.j(context4.getPackageName(), ".SESSION_API_PACKAGE_UNINSTALL")) || (aVar = this.f335d) == null || (kVar2 = this.c) == null)) {
                                    if (string == null) {
                                        string = "";
                                    }
                                    kVar2.c(aVar, i2, string);
                                }
                            } else {
                                h.k("context");
                                throw null;
                            }
                        }
                        finish();
                        break;
                    } else {
                        h.k("context");
                        throw null;
                    }
                default:
                    finish();
                    Context context5 = this.b;
                    if (context5 != null) {
                        g.c.b.b.f.j0(context5, h.j("Unrecognized status received from installer: ", Integer.valueOf(i2)));
                        break;
                    } else {
                        h.k("context");
                        throw null;
                    }
            }
            switch (i2) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    String action3 = intent.getAction();
                    Context context6 = this.b;
                    if (context6 != null) {
                        h.e(context6, "ctx");
                        if (!h.a(action3, h.j(context6.getPackageName(), ".SESSION_API_PACKAGE_INSTALLED"))) {
                            Context context7 = this.b;
                            if (context7 != null) {
                                h.e(context7, "ctx");
                                if (h.a(action3, h.j(context7.getPackageName(), ".SESSION_API_PACKAGE_UNINSTALL"))) {
                                    g.c.b.b.g.a aVar4 = this.f343l;
                                    if (aVar4 != null) {
                                        aVar4.f2253k.setVisibility(0);
                                        g.c.b.b.g.a aVar5 = this.f343l;
                                        if (aVar5 != null) {
                                            aVar5.f2251i.setVisibility(8);
                                            g.c.b.b.g.a aVar6 = this.f343l;
                                            if (aVar6 != null) {
                                                aVar6.c.setVisibility(8);
                                                return;
                                            } else {
                                                h.k("binding");
                                                throw null;
                                            }
                                        } else {
                                            h.k("binding");
                                            throw null;
                                        }
                                    } else {
                                        h.k("binding");
                                        throw null;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                h.k("context");
                                throw null;
                            }
                        } else {
                            return;
                        }
                    } else {
                        h.k("context");
                        throw null;
                    }
                default:
                    return;
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        h.e(bundle, "outState");
        bundle.putSerializable("locale", this.f337f);
        bundle.putInt("them", this.f338g);
        bundle.putString("path", this.f339h);
        bundle.putInt("navigation_bar", this.f341j);
        super.onSaveInstanceState(bundle);
    }
}
