package com.tencent.beacon.a.c;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.beacon.module.BeaconModule;
import com.tencent.beacon.module.ModuleName;

public class c {
    private static volatile c a;
    private Context b;
    private byte c;

    /* renamed from: d  reason: collision with root package name */
    private String f591d;

    /* renamed from: e  reason: collision with root package name */
    private String f592e;

    /* renamed from: f  reason: collision with root package name */
    private String f593f;

    /* renamed from: g  reason: collision with root package name */
    private long f594g;

    /* renamed from: h  reason: collision with root package name */
    private String f595h;

    /* renamed from: i  reason: collision with root package name */
    private String f596i;

    /* renamed from: j  reason: collision with root package name */
    private String f597j;

    /* renamed from: k  reason: collision with root package name */
    private String f598k;

    /* renamed from: l  reason: collision with root package name */
    private String f599l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f600m;

    public c() {
        this.c = -1;
        this.f591d = "";
        this.f592e = "";
        this.f593f = "";
        this.f595h = "";
        this.f596i = "";
        this.f597j = "";
        this.f598k = "";
        this.f599l = "";
        this.f600m = true;
        this.c = 1;
        this.f591d = "beacon";
        this.f593f = "unknown";
    }

    public static c d() {
        if (a == null) {
            synchronized (c.class) {
                if (a == null) {
                    a = new c();
                }
            }
        }
        return a;
    }

    public BeaconModule a(ModuleName moduleName) {
        return BeaconModule.a.get(moduleName);
    }

    public String a() {
        return this.f596i;
    }

    public synchronized void a(long j2) {
        this.f594g = j2;
    }

    public synchronized void a(Context context) {
        if (this.b == null) {
            Context applicationContext = context.getApplicationContext();
            this.b = applicationContext;
            if (applicationContext == null) {
                this.b = context;
            }
        }
    }

    public void a(String str) {
        this.f596i = str;
    }

    public void a(boolean z) {
        this.f600m = z;
    }

    public synchronized String b() {
        return this.f593f;
    }

    public void b(String str) {
        this.f593f = str;
    }

    public synchronized Context c() {
        return this.b;
    }

    public void c(String str) {
        this.f599l = str;
    }

    public void d(String str) {
        this.f595h = str;
    }

    public String e() {
        return this.f599l;
    }

    public void e(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f598k = str;
        }
    }

    public String f() {
        return this.f595h;
    }

    public String g() {
        return this.f598k;
    }

    public synchronized byte h() {
        return this.c;
    }

    public synchronized String i() {
        return this.f591d;
    }

    public String j() {
        return "4.2.80.2-oversea";
    }

    public synchronized long k() {
        return this.f594g;
    }

    public String l() {
        return this.f597j;
    }

    public boolean m() {
        return this.f600m;
    }
}
