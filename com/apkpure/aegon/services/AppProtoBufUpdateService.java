package com.apkpure.aegon.services;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.apkpure.aegon.application.AegonApplication;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import g.c.a.e.c.a;
import g.c.a.e.c.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AppProtoBufUpdateService extends Service {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f261m = 0;
    public final IBinder b = new d();
    public Context c;

    /* renamed from: d  reason: collision with root package name */
    public c.b f262d;

    /* renamed from: e  reason: collision with root package name */
    public a.b f263e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f264f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public boolean f265g = false;

    /* renamed from: h  reason: collision with root package name */
    public final Object f266h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public HashMap<String, AppDetailInfo> f267i;

    /* renamed from: j  reason: collision with root package name */
    public NotificationManager f268j;

    /* renamed from: k  reason: collision with root package name */
    public Bitmap f269k;

    /* renamed from: l  reason: collision with root package name */
    public List<IgnoreAppDigest> f270l = null;

    public static class IgnoreAppDigest implements Parcelable {
        public static final Parcelable.Creator<IgnoreAppDigest> CREATOR = new a();
        @g.e.c.s.c("package_name")
        @g.e.c.s.a
        private String packageName;
        @g.e.c.s.c("version_code")
        @g.e.c.s.a
        private String versionCode;

        public static class a implements Parcelable.Creator<IgnoreAppDigest> {
            public Object createFromParcel(Parcel parcel) {
                return new IgnoreAppDigest(parcel);
            }

            public Object[] newArray(int i2) {
                return new IgnoreAppDigest[i2];
            }
        }

        public IgnoreAppDigest(Parcel parcel) {
            this.packageName = parcel.readString();
            this.versionCode = parcel.readString();
        }

        public IgnoreAppDigest(String str, String str2) {
            this.packageName = str;
            this.versionCode = str2;
        }

        public String a() {
            return this.packageName;
        }

        public String b() {
            return this.versionCode;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.packageName);
            parcel.writeString(this.versionCode);
        }
    }

    public class a implements c.a {
        public a() {
        }

        public void a(Context context, String str) {
            AppProtoBufUpdateService.a(AppProtoBufUpdateService.this, str);
        }

        public void b(Context context, String str) {
            AppProtoBufUpdateService.a(AppProtoBufUpdateService.this, str);
        }
    }

    public class b implements a.C0059a {
        public b() {
        }

        public void a(Context context, int i2) {
            g.c.a.e.j.b D = e.e.i.b.D();
            g.c.a.k.a aVar = new g.c.a.k.a(this);
            AegonApplication.getApplication().getString(2131821518);
            D.a(aVar);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            AppProtoBufUpdateService appProtoBufUpdateService = AppProtoBufUpdateService.this;
            int i2 = AppProtoBufUpdateService.f261m;
            appProtoBufUpdateService.e();
        }
    }

    public class d extends Binder {
        public d() {
        }
    }

    public static void a(AppProtoBufUpdateService appProtoBufUpdateService, String str) {
        synchronized (appProtoBufUpdateService.f266h) {
            if (appProtoBufUpdateService.d()) {
                if (appProtoBufUpdateService.f267i.get(str) != null) {
                    appProtoBufUpdateService.f267i.remove(str);
                }
            }
        }
    }

    public final AppDetailInfo b(String str) {
        AppDetailInfo appDetailInfo;
        synchronized (this.f266h) {
            appDetailInfo = d() ? this.f267i.get(str) : null;
        }
        return appDetailInfo;
    }

    public final List<AppDetailInfo> c() {
        ArrayList arrayList;
        synchronized (this.f266h) {
            arrayList = d() ? new ArrayList(this.f267i.values()) : null;
        }
        if (arrayList == null) {
            return null;
        }
        Iterator<AppDetailInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            AppDetailInfo next = it.next();
            IgnoreAppDigest ignoreAppDigest = new IgnoreAppDigest(next.packageName, next.versionCode);
            boolean z = false;
            List<IgnoreAppDigest> list = this.f270l;
            if (list != null) {
                for (IgnoreAppDigest next2 : list) {
                    String a2 = ignoreAppDigest.a();
                    String b2 = ignoreAppDigest.b();
                    if (!TextUtils.isEmpty(a2) && a2.equals(next2.a()) && !TextUtils.isEmpty(b2) && b2.equals(next2.b())) {
                        z = true;
                    }
                }
            }
            if (z) {
                it.remove();
            }
        }
        return arrayList;
    }

    public final boolean d() {
        boolean z;
        synchronized (this.f266h) {
            z = this.f267i != null;
        }
        return z;
    }

    public final void e() {
        if (g.c.a.e.f.b.a.c(this.c)) {
            SharedPreferences sharedPreferences = getSharedPreferences("last_run_time", 0);
            if (!d() || System.currentTimeMillis() - sharedPreferences.getLong("update_app_updates", 0) >= 60000) {
                synchronized (this.f264f) {
                    if (!this.f265g) {
                        this.f265g = true;
                        g.c.a.e.j.b D = e.e.i.b.D();
                        g.c.a.k.c cVar = new g.c.a.k.c(this);
                        AegonApplication.getApplication().getString(2131821518);
                        D.a(cVar);
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putLong("update_app_updates", System.currentTimeMillis());
                        edit.apply();
                    }
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.b;
    }

    public void onCreate() {
        IgnoreAppDigest ignoreAppDigest;
        this.c = this;
        Map<String, ?> all = getSharedPreferences("ignored_apps_v", 0).getAll();
        if (all != null) {
            Collection<?> values = all.values();
            this.f270l = new ArrayList();
            for (Object next : values) {
                if ((next instanceof String) && (ignoreAppDigest = (IgnoreAppDigest) g.c.a.e.k.h.b.b((String) next, IgnoreAppDigest.class)) != null) {
                    this.f270l.add(ignoreAppDigest);
                }
            }
        } else {
            this.f270l = null;
        }
        this.f268j = (NotificationManager) getSystemService("notification");
        this.f269k = BitmapFactory.decodeResource(getResources(), 2131623937);
        c.b bVar = new c.b(this.c, new a());
        this.f262d = bVar;
        bVar.a(1000);
        a.b bVar2 = new a.b(this.c, new b());
        this.f263e = bVar2;
        bVar2.a();
        new Handler().postDelayed(new c(), 10000);
    }

    public void onDestroy() {
        c.b bVar = this.f262d;
        if (bVar.c) {
            e.e.d.l.a.J0(bVar.a, bVar);
            bVar.c = false;
        }
        a.b bVar2 = this.f263e;
        if (bVar2.c) {
            e.e.d.l.a.J0(bVar2.a, bVar2);
            bVar2.c = false;
        }
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        if (intent == null) {
            return 2;
        }
        e();
        return 2;
    }
}
