package g.c.a.e.f.a;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.apkpure.aegon.components.network.config.AccessHeadInfo;
import com.apkpure.components.clientchannel.channel.headers.ExtInfo;
import com.apkpure.components.clientchannel.channel.headers.LbsInfo;
import com.apkpure.components.clientchannel.channel.headers.UserInfo;
import com.ola.qsea.sdk.QseaSDK;
import g.c.b.a.j.g;
import i.o.c.h;
import i.o.c.i;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

public class a implements g.c.b.a.j.e {
    public final Context a;
    public LbsInfo b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public final i.c f1971d = g.c.b.b.f.U(new e(this));

    /* renamed from: e  reason: collision with root package name */
    public final i.c f1972e = g.c.b.b.f.U(b.b);

    /* renamed from: f  reason: collision with root package name */
    public final i.c f1973f = g.c.b.b.f.U(d.b);

    /* renamed from: g  reason: collision with root package name */
    public final i.c f1974g = g.c.b.b.f.U(f.b);

    /* renamed from: h  reason: collision with root package name */
    public final i.c f1975h = g.c.b.b.f.U(c.b);

    /* renamed from: i  reason: collision with root package name */
    public final i.c f1976i = g.c.b.b.f.U(new C0061a(this));

    /* renamed from: g.c.a.e.f.a.a$a  reason: collision with other inner class name */
    public static final class C0061a extends i implements i.o.b.a<File> {
        public final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0061a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public Object a() {
            File file;
            Context context;
            Context context2;
            String str = null;
            if (h.a("mounted", Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable() ? !((context = this.this$0.a) == null || (file = context.getExternalCacheDir()) == null) : !((context2 = this.this$0.a) == null || (file = context2.getCacheDir()) == null)) {
                str = file.getPath();
            }
            return new File(str + File.separator + this.this$0.a.getPackageName());
        }
    }

    public static final class b extends i implements i.o.b.a<ExtInfo> {
        public static final b b = new b();

        public b() {
            super(0);
        }

        public Object a() {
            return new ExtInfo((LbsInfo) null, (String) null, 3, (i.o.c.f) null);
        }
    }

    public static final class c extends i implements i.o.b.a<b> {
        public static final c b = new c();

        public c() {
            super(0);
        }

        public Object a() {
            return new b();
        }
    }

    public static final class d extends i implements i.o.b.a<c> {
        public static final d b = new d();

        public d() {
            super(0);
        }

        public Object a() {
            return new c();
        }
    }

    public static final class e extends i implements i.o.b.a<AccessHeadInfo> {
        public final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:141:0x02bf, code lost:
            if (r0.hasTransport(0) != false) goto L_0x02c1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0140, code lost:
            if (r0 == null) goto L_0x0163;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x01bc, code lost:
            if (r14 != 1) goto L_0x0242;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e1, code lost:
            if (i.t.e.c(r0, "CDMA2000", true) == false) goto L_0x0242;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x021b, code lost:
            r15 = 5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x021d, code lost:
            r15 = 4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x021f, code lost:
            r15 = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0221, code lost:
            r15 = 2;
         */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x0259  */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x025b  */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x025e  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x0265  */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x027c A[Catch:{ Exception -> 0x02c3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x02a6 A[Catch:{ Exception -> 0x02c3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:153:0x02e6  */
        /* JADX WARNING: Removed duplicated region for block: B:155:0x02e9  */
        /* JADX WARNING: Removed duplicated region for block: B:170:0x0347 A[SYNTHETIC, Splitter:B:170:0x0347] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00de A[Catch:{ Exception -> 0x00ed }] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0133 A[Catch:{ NameNotFoundException -> 0x0143 }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0134 A[Catch:{ NameNotFoundException -> 0x0143 }] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x017e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a() {
            /*
                r16 = this;
                java.lang.String r1 = "Util"
                java.lang.String r2 = "ClientChannel|"
                java.lang.String r3 = "message"
                java.lang.String r4 = "tag"
                com.apkpure.aegon.components.network.config.AccessHeadInfo r12 = new com.apkpure.aegon.components.network.config.AccessHeadInfo
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 15
                r11 = 0
                r5 = r12
                r5.<init>(r6, r7, r8, r9, r10, r11)
                r5 = r16
                g.c.a.e.f.a.a r6 = r5.this$0
                com.apkpure.components.clientchannel.channel.headers.UserInfo r0 = r12.getUserInfo()
                java.util.UUID r7 = java.util.UUID.randomUUID()
                java.lang.String r7 = r7.toString()
                java.lang.String r8 = "randomUUID().toString()"
                i.o.c.h.d(r7, r8)
                r0.setUuid(r7)
                com.apkpure.components.clientchannel.channel.headers.HostAppInfo r0 = r12.getHostAppInfo()
                android.content.Context r7 = r6.a
                java.lang.String r7 = r7.getPackageName()
                java.lang.String r8 = "context.packageName"
                i.o.c.h.d(r7, r8)
                r0.setPkgName(r7)
                com.apkpure.components.clientchannel.channel.headers.HostAppInfo r0 = r12.getHostAppInfo()
                java.lang.String r7 = "1.01.10"
                r0.setVersionName(r7)
                com.apkpure.components.clientchannel.channel.headers.HostAppInfo r0 = r12.getHostAppInfo()
                r7 = 1011015(0xf6d47, float:1.416734E-39)
                r0.setVersionCode(r7)
                com.apkpure.components.clientchannel.channel.headers.HostAppInfo r0 = r12.getHostAppInfo()
                java.lang.String r7 = "9027"
                r0.setBuildNo(r7)
                g.c.a.e.i.b.a$b r0 = g.c.a.e.i.b.a.c
                java.util.Locale r7 = r0.c()
                com.apkpure.components.clientchannel.channel.headers.UserInfo r8 = r12.getUserInfo()
                java.lang.String r9 = e.e.f.b.A(r7)
                java.lang.String r10 = "toLanguageTag(locale)"
                i.o.c.h.d(r9, r10)
                r8.setLanguage(r9)
                com.apkpure.components.clientchannel.channel.headers.UserInfo r8 = r12.getUserInfo()
                java.lang.String r9 = ""
                if (r7 != 0) goto L_0x007a
                goto L_0x0080
            L_0x007a:
                java.lang.String r7 = r7.getDisplayCountry()
                if (r7 != 0) goto L_0x0081
            L_0x0080:
                r7 = r9
            L_0x0081:
                r8.setCountry(r7)
                com.apkpure.components.clientchannel.channel.headers.UserInfo r7 = r12.getUserInfo()
                g.c.a.e.i.b.a r8 = r0.d()
                android.content.SharedPreferences r8 = r8.b
                if (r8 != 0) goto L_0x0097
                g.c.a.e.i.b.a r8 = r0.d()
                r8.a()
            L_0x0097:
                g.c.a.e.i.b.a r0 = r0.d()
                android.content.SharedPreferences r0 = r0.b
                if (r0 != 0) goto L_0x00a1
                r0 = 0
                goto L_0x00a7
            L_0x00a1:
                java.lang.String r8 = "region"
                java.lang.String r0 = r0.getString(r8, r9)
            L_0x00a7:
                if (r0 != 0) goto L_0x00aa
                r0 = r9
            L_0x00aa:
                r7.setCountryCode(r0)
                android.content.Context r7 = r6.a
                if (r7 != 0) goto L_0x00b3
                goto L_0x0383
            L_0x00b3:
                com.apkpure.components.clientchannel.channel.headers.HostAppInfo r8 = r12.getHostAppInfo()
                i.c r0 = g.c.b.a.l.e.a
                java.lang.String r10 = "<this>"
                i.o.c.h.e(r7, r10)
                r11 = 1
                r13 = 0
                android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch:{ Exception -> 0x00ed }
                java.lang.String r14 = r7.getPackageName()     // Catch:{ Exception -> 0x00ed }
                android.content.pm.PackageInfo r0 = r0.getPackageInfo(r14, r13)     // Catch:{ Exception -> 0x00ed }
                android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch:{ Exception -> 0x00ed }
                java.lang.String r0 = r0.publicSourceDir     // Catch:{ Exception -> 0x00ed }
                if (r0 == 0) goto L_0x00db
                boolean r14 = i.t.e.j(r0)     // Catch:{ Exception -> 0x00ed }
                if (r14 == 0) goto L_0x00d9
                goto L_0x00db
            L_0x00d9:
                r14 = 0
                goto L_0x00dc
            L_0x00db:
                r14 = 1
            L_0x00dc:
                if (r14 != 0) goto L_0x010d
                java.io.File r14 = new java.io.File     // Catch:{ Exception -> 0x00ed }
                r14.<init>(r0)     // Catch:{ Exception -> 0x00ed }
                java.lang.String r0 = e.e.f.b.m(r14)     // Catch:{ Exception -> 0x00ed }
                java.lang.String r14 = "{\n            Md5Util.ge…(File(apkPath))\n        }"
                i.o.c.h.d(r0, r14)     // Catch:{ Exception -> 0x00ed }
                goto L_0x010e
            L_0x00ed:
                r0 = move-exception
                java.lang.String r0 = r0.getMessage()
                java.lang.String r14 = "current apk md5 exception "
                java.lang.String r0 = i.o.c.h.j(r14, r0)
                i.o.c.h.e(r1, r4)
                i.o.c.h.e(r0, r3)
                g.c.b.a.j.g r14 = g.c.b.a.l.c.b
                java.lang.String r15 = i.o.c.h.j(r2, r1)
                if (r14 == 0) goto L_0x010a
                r14.i(r15, r0)
                goto L_0x010d
            L_0x010a:
                android.util.Log.i(r15, r0)
            L_0x010d:
                r0 = r9
            L_0x010e:
                java.util.Locale r14 = java.util.Locale.ROOT
                java.lang.String r0 = r0.toLowerCase(r14)
                java.lang.String r14 = "(this as java.lang.Strin….toLowerCase(Locale.ROOT)"
                i.o.c.h.d(r0, r14)
                r8.setMd5(r0)
                com.apkpure.components.clientchannel.channel.headers.HostAppInfo r8 = r12.getHostAppInfo()
                i.o.c.h.e(r7, r10)
                android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0143 }
                java.lang.String r14 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0143 }
                r15 = 128(0x80, float:1.794E-43)
                android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r14, r15)     // Catch:{ NameNotFoundException -> 0x0143 }
                if (r0 != 0) goto L_0x0134
                goto L_0x0163
            L_0x0134:
                android.os.Bundle r0 = r0.metaData     // Catch:{ NameNotFoundException -> 0x0143 }
                if (r0 != 0) goto L_0x013a
                r0 = 0
                goto L_0x0140
            L_0x013a:
                java.lang.String r14 = "CHANNEL_NAME"
                java.lang.String r0 = r0.getString(r14)     // Catch:{ NameNotFoundException -> 0x0143 }
            L_0x0140:
                if (r0 != 0) goto L_0x0164
                goto L_0x0163
            L_0x0143:
                r0 = move-exception
                java.lang.String r0 = r0.getMessage()
                java.lang.String r14 = "Context.channel name "
                java.lang.String r0 = i.o.c.h.j(r14, r0)
                i.o.c.h.e(r1, r4)
                i.o.c.h.e(r0, r3)
                g.c.b.a.j.g r14 = g.c.b.a.l.c.b
                java.lang.String r1 = i.o.c.h.j(r2, r1)
                if (r14 == 0) goto L_0x0160
                r14.i(r1, r0)
                goto L_0x0163
            L_0x0160:
                android.util.Log.i(r1, r0)
            L_0x0163:
                r0 = r9
            L_0x0164:
                r8.setChannel(r0)
                com.apkpure.components.clientchannel.channel.headers.NetInfo r1 = r12.getNetInfo()
                g.c.b.a.l.d r0 = g.c.b.a.l.d.a
                java.lang.String r8 = "context"
                i.o.c.h.e(r7, r8)
                java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
                int r0 = e.e.c.a.a(r7, r0)
                r14 = 28
                if (r0 == 0) goto L_0x017e
                goto L_0x0242
            L_0x017e:
                int r0 = android.os.Build.VERSION.SDK_INT
                if (r0 > r14) goto L_0x01e4
                i.o.c.h.e(r7, r8)
                android.net.ConnectivityManager r0 = e.e.f.b.k(r7)     // Catch:{ Exception -> 0x018e }
                android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ Exception -> 0x018e }
                goto L_0x01ae
            L_0x018e:
                r0 = move-exception
                java.lang.String r14 = g.c.b.a.l.d.b
                java.lang.String r0 = r0.getMessage()
                if (r0 != 0) goto L_0x0198
                r0 = r9
            L_0x0198:
                i.o.c.h.e(r14, r4)
                i.o.c.h.e(r0, r3)
                g.c.b.a.j.g r15 = g.c.b.a.l.c.b
                java.lang.String r14 = i.o.c.h.j(r2, r14)
                if (r15 == 0) goto L_0x01aa
                r15.e(r14, r0)
                goto L_0x01ad
            L_0x01aa:
                android.util.Log.e(r14, r0)
            L_0x01ad:
                r0 = 0
            L_0x01ae:
                if (r0 == 0) goto L_0x0242
                boolean r14 = r0.isAvailable()
                if (r14 == 0) goto L_0x0242
                int r14 = r0.getType()
                if (r14 == 0) goto L_0x01c0
                if (r14 == r11) goto L_0x01fb
                goto L_0x0242
            L_0x01c0:
                int r14 = r0.getSubtype()
                switch(r14) {
                    case 1: goto L_0x0221;
                    case 2: goto L_0x0221;
                    case 3: goto L_0x021f;
                    case 4: goto L_0x0221;
                    case 5: goto L_0x021f;
                    case 6: goto L_0x021f;
                    case 7: goto L_0x0221;
                    case 8: goto L_0x021f;
                    case 9: goto L_0x021f;
                    case 10: goto L_0x021f;
                    case 11: goto L_0x0221;
                    case 12: goto L_0x021f;
                    case 13: goto L_0x021d;
                    case 14: goto L_0x021f;
                    case 15: goto L_0x021f;
                    case 16: goto L_0x0221;
                    case 17: goto L_0x021f;
                    case 18: goto L_0x021d;
                    case 19: goto L_0x021d;
                    case 20: goto L_0x021b;
                    default: goto L_0x01c7;
                }
            L_0x01c7:
                java.lang.String r0 = r0.getSubtypeName()     // Catch:{ Exception -> 0x0242 }
                java.lang.String r14 = "TD-SCDMA"
                boolean r14 = i.t.e.c(r0, r14, r11)     // Catch:{ Exception -> 0x0242 }
                if (r14 != 0) goto L_0x021f
                java.lang.String r14 = "WCDMA"
                boolean r14 = i.t.e.c(r0, r14, r11)     // Catch:{ Exception -> 0x0242 }
                if (r14 != 0) goto L_0x021f
                java.lang.String r14 = "CDMA2000"
                boolean r0 = i.t.e.c(r0, r14, r11)     // Catch:{ Exception -> 0x0242 }
                if (r0 == 0) goto L_0x0242
                goto L_0x021f
            L_0x01e4:
                android.net.ConnectivityManager r0 = e.e.f.b.k(r7)     // Catch:{ Exception -> 0x0223 }
                android.net.Network r14 = r0.getActiveNetwork()     // Catch:{ Exception -> 0x0223 }
                if (r14 == 0) goto L_0x0242
                android.net.NetworkCapabilities r0 = r0.getNetworkCapabilities(r14)     // Catch:{ Exception -> 0x0223 }
                i.o.c.h.c(r0)     // Catch:{ Exception -> 0x0223 }
                boolean r14 = r0.hasTransport(r11)     // Catch:{ Exception -> 0x0223 }
                if (r14 == 0) goto L_0x01fd
            L_0x01fb:
                r15 = 1
                goto L_0x0243
            L_0x01fd:
                boolean r0 = r0.hasTransport(r13)     // Catch:{ Exception -> 0x0223 }
                if (r0 == 0) goto L_0x0242
                i.o.c.h.e(r7, r10)     // Catch:{ Exception -> 0x0223 }
                java.lang.String r0 = "phone"
                java.lang.Object r0 = r7.getSystemService(r0)     // Catch:{ Exception -> 0x0223 }
                java.lang.String r14 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
                java.util.Objects.requireNonNull(r0, r14)     // Catch:{ Exception -> 0x0223 }
                android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0223 }
                int r0 = r0.getNetworkType()     // Catch:{ Exception -> 0x0223 }
                switch(r0) {
                    case 1: goto L_0x0221;
                    case 2: goto L_0x0221;
                    case 3: goto L_0x021f;
                    case 4: goto L_0x0221;
                    case 5: goto L_0x021f;
                    case 6: goto L_0x021f;
                    case 7: goto L_0x0221;
                    case 8: goto L_0x021f;
                    case 9: goto L_0x021f;
                    case 10: goto L_0x021f;
                    case 11: goto L_0x0221;
                    case 12: goto L_0x021f;
                    case 13: goto L_0x021d;
                    case 14: goto L_0x021f;
                    case 15: goto L_0x021f;
                    case 16: goto L_0x0221;
                    case 17: goto L_0x021f;
                    case 18: goto L_0x021d;
                    case 19: goto L_0x021d;
                    case 20: goto L_0x021b;
                    default: goto L_0x021a;
                }
            L_0x021a:
                goto L_0x0242
            L_0x021b:
                r15 = 5
                goto L_0x0243
            L_0x021d:
                r15 = 4
                goto L_0x0243
            L_0x021f:
                r15 = 3
                goto L_0x0243
            L_0x0221:
                r15 = 2
                goto L_0x0243
            L_0x0223:
                r0 = move-exception
                java.lang.String r14 = g.c.b.a.l.d.b
                java.lang.String r0 = r0.getMessage()
                if (r0 != 0) goto L_0x022d
                r0 = r9
            L_0x022d:
                i.o.c.h.e(r14, r4)
                i.o.c.h.e(r0, r3)
                g.c.b.a.j.g r15 = g.c.b.a.l.c.b
                java.lang.String r14 = i.o.c.h.j(r2, r14)
                if (r15 == 0) goto L_0x023f
                r15.e(r14, r0)
                goto L_0x0242
            L_0x023f:
                android.util.Log.e(r14, r0)
            L_0x0242:
                r15 = 0
            L_0x0243:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
                r1.setNetType(r0)
                com.apkpure.components.clientchannel.channel.headers.NetInfo r0 = r12.getNetInfo()
                java.lang.String r1 = r6.c
                if (r1 == 0) goto L_0x025b
                int r1 = r1.length()
                if (r1 != 0) goto L_0x0259
                goto L_0x025b
            L_0x0259:
                r1 = 0
                goto L_0x025c
            L_0x025b:
                r1 = 1
            L_0x025c:
                if (r1 == 0) goto L_0x0265
                g.c.b.a.l.d r1 = g.c.b.a.l.d.a
                java.lang.String r1 = g.c.b.a.l.d.b(r11)
                goto L_0x0267
            L_0x0265:
                java.lang.String r1 = r6.c
            L_0x0267:
                r0.setIpv4(r1)
                g.c.b.a.l.d r0 = g.c.b.a.l.d.a
                i.o.c.h.e(r7, r8)
                i.o.c.h.e(r7, r8)
                android.net.ConnectivityManager r0 = e.e.f.b.k(r7)     // Catch:{ Exception -> 0x02c3 }
                int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x02c3 }
                r6 = 28
                if (r1 > r6) goto L_0x02a6
                android.net.NetworkInfo r1 = r0.getNetworkInfo(r11)     // Catch:{ Exception -> 0x02c3 }
                if (r1 != 0) goto L_0x0284
                r1 = 0
                goto L_0x0288
            L_0x0284:
                android.net.NetworkInfo$State r1 = r1.getState()     // Catch:{ Exception -> 0x02c3 }
            L_0x0288:
                android.net.NetworkInfo$State r6 = android.net.NetworkInfo.State.CONNECTED     // Catch:{ Exception -> 0x02c3 }
                if (r1 == r6) goto L_0x02b9
                android.net.NetworkInfo$State r6 = android.net.NetworkInfo.State.CONNECTING     // Catch:{ Exception -> 0x02c3 }
                if (r1 != r6) goto L_0x0291
                goto L_0x02b9
            L_0x0291:
                android.net.NetworkInfo r0 = r0.getNetworkInfo(r13)     // Catch:{ Exception -> 0x02c3 }
                if (r0 != 0) goto L_0x0299
                r0 = 0
                goto L_0x029d
            L_0x0299:
                android.net.NetworkInfo$State r0 = r0.getState()     // Catch:{ Exception -> 0x02c3 }
            L_0x029d:
                android.net.NetworkInfo$State r1 = android.net.NetworkInfo.State.CONNECTED     // Catch:{ Exception -> 0x02c3 }
                if (r0 == r1) goto L_0x02c1
                android.net.NetworkInfo$State r1 = android.net.NetworkInfo.State.CONNECTING     // Catch:{ Exception -> 0x02c3 }
                if (r0 != r1) goto L_0x02e2
                goto L_0x02c1
            L_0x02a6:
                android.net.Network r1 = r0.getActiveNetwork()     // Catch:{ Exception -> 0x02c3 }
                if (r1 == 0) goto L_0x02e2
                android.net.NetworkCapabilities r0 = r0.getNetworkCapabilities(r1)     // Catch:{ Exception -> 0x02c3 }
                i.o.c.h.c(r0)     // Catch:{ Exception -> 0x02c3 }
                boolean r1 = r0.hasTransport(r11)     // Catch:{ Exception -> 0x02c3 }
                if (r1 == 0) goto L_0x02bb
            L_0x02b9:
                r0 = 1
                goto L_0x02e3
            L_0x02bb:
                boolean r0 = r0.hasTransport(r13)     // Catch:{ Exception -> 0x02c3 }
                if (r0 == 0) goto L_0x02e2
            L_0x02c1:
                r0 = 2
                goto L_0x02e3
            L_0x02c3:
                r0 = move-exception
                java.lang.String r1 = g.c.b.a.l.d.b
                java.lang.String r0 = r0.getMessage()
                if (r0 != 0) goto L_0x02cd
                r0 = r9
            L_0x02cd:
                i.o.c.h.e(r1, r4)
                i.o.c.h.e(r0, r3)
                g.c.b.a.j.g r6 = g.c.b.a.l.c.b
                java.lang.String r1 = i.o.c.h.j(r2, r1)
                if (r6 == 0) goto L_0x02df
                r6.e(r1, r0)
                goto L_0x02e2
            L_0x02df:
                android.util.Log.e(r1, r0)
            L_0x02e2:
                r0 = -1
            L_0x02e3:
                if (r0 != r11) goto L_0x02e6
                goto L_0x02e7
            L_0x02e6:
                r11 = 0
            L_0x02e7:
                if (r11 == 0) goto L_0x0383
                com.apkpure.components.clientchannel.channel.headers.NetInfo r1 = r12.getNetInfo()
                g.c.b.a.l.d r0 = g.c.b.a.l.d.a
                i.o.c.h.e(r7, r8)
                java.lang.String r6 = "android.permission.ACCESS_WIFI_STATE"
                int r0 = e.e.c.a.a(r7, r6)
                java.lang.String r11 = "null cannot be cast to non-null type android.net.wifi.WifiManager"
                java.lang.String r13 = "wifi"
                if (r0 == 0) goto L_0x02ff
                goto L_0x0333
            L_0x02ff:
                i.o.c.h.e(r7, r10)     // Catch:{ Exception -> 0x0314 }
                java.lang.Object r0 = r7.getSystemService(r13)     // Catch:{ Exception -> 0x0314 }
                java.util.Objects.requireNonNull(r0, r11)     // Catch:{ Exception -> 0x0314 }
                android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0     // Catch:{ Exception -> 0x0314 }
                android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()     // Catch:{ Exception -> 0x0314 }
                java.lang.String r0 = r0.getBSSID()     // Catch:{ Exception -> 0x0314 }
                goto L_0x0334
            L_0x0314:
                r0 = move-exception
                java.lang.String r14 = g.c.b.a.l.d.b
                java.lang.String r0 = r0.getMessage()
                if (r0 != 0) goto L_0x031e
                r0 = r9
            L_0x031e:
                i.o.c.h.e(r14, r4)
                i.o.c.h.e(r0, r3)
                g.c.b.a.j.g r15 = g.c.b.a.l.c.b
                java.lang.String r14 = i.o.c.h.j(r2, r14)
                if (r15 == 0) goto L_0x0330
                r15.e(r14, r0)
                goto L_0x0333
            L_0x0330:
                android.util.Log.e(r14, r0)
            L_0x0333:
                r0 = r9
            L_0x0334:
                r1.setWifiBssid(r0)
                com.apkpure.components.clientchannel.channel.headers.NetInfo r1 = r12.getNetInfo()
                g.c.b.a.l.d r0 = g.c.b.a.l.d.a
                i.o.c.h.e(r7, r8)
                int r0 = e.e.c.a.a(r7, r6)
                if (r0 == 0) goto L_0x0347
                goto L_0x0380
            L_0x0347:
                i.o.c.h.e(r7, r10)     // Catch:{ Exception -> 0x0361 }
                java.lang.Object r0 = r7.getSystemService(r13)     // Catch:{ Exception -> 0x0361 }
                java.util.Objects.requireNonNull(r0, r11)     // Catch:{ Exception -> 0x0361 }
                android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0     // Catch:{ Exception -> 0x0361 }
                android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()     // Catch:{ Exception -> 0x0361 }
                java.lang.String r0 = r0.getSSID()     // Catch:{ Exception -> 0x0361 }
                r6 = 0
                java.lang.String r9 = g.c.b.a.l.d.a(r0, r6)     // Catch:{ Exception -> 0x0361 }
                goto L_0x0380
            L_0x0361:
                r0 = move-exception
                java.lang.String r6 = g.c.b.a.l.d.b
                java.lang.String r0 = r0.getMessage()
                if (r0 != 0) goto L_0x036b
                r0 = r9
            L_0x036b:
                i.o.c.h.e(r6, r4)
                i.o.c.h.e(r0, r3)
                g.c.b.a.j.g r3 = g.c.b.a.l.c.b
                java.lang.String r2 = i.o.c.h.j(r2, r6)
                if (r3 == 0) goto L_0x037d
                r3.e(r2, r0)
                goto L_0x0380
            L_0x037d:
                android.util.Log.e(r2, r0)
            L_0x0380:
                r1.setWifiSsid(r9)
            L_0x0383:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: g.c.a.e.f.a.a.e.a():java.lang.Object");
        }
    }

    public static final class f extends i implements i.o.b.a<d> {
        public static final f b = new f();

        public f() {
            super(0);
        }

        public Object a() {
            return new d();
        }
    }

    public a(Context context) {
        h.e(context, "context");
        this.a = context;
    }

    public int a() {
        h.e(this, "this");
        h.e(this, "this");
        return 0;
    }

    public File b() {
        return (File) this.f1976i.getValue();
    }

    public g.c.b.a.j.i c() {
        return (d) this.f1974g.getValue();
    }

    public Map<String, String> d() {
        l();
        k();
        i.e eVar = new i.e("User-Agent", g.c.a.e.f.b.a.b());
        g.c.b.a.l.a aVar = g.c.b.a.l.a.a;
        i.e[] eVarArr = {eVar, new i.e("Ual-Access-Businessid", "projecta"), new i.e("Ual-Access-ProjectA", m().toJson()), new i.e("Ual-Access-ExtInfo", g.c.b.a.l.a.b((ExtInfo) this.f1972e.getValue()))};
        h.e(eVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g.c.b.b.f.W(4));
        h.e(linkedHashMap, "$this$putAll");
        h.e(eVarArr, "pairs");
        for (int i2 = 0; i2 < 4; i2++) {
            i.e eVar2 = eVarArr[i2];
            linkedHashMap.put(eVar2.a(), eVar2.b());
        }
        return linkedHashMap;
    }

    public g e() {
        return (b) this.f1975h.getValue();
    }

    public String f() {
        return "https://tapi.pureapk.com/v3";
    }

    public String g() {
        return "application/json; charset=utf-8";
    }

    public String h() {
        h.e(this, "this");
        h.e(this, "this");
        h.e(this, "this");
        return "https://";
    }

    public long i() {
        return 10485760;
    }

    public g.c.b.a.j.h j() {
        return (c) this.f1973f.getValue();
    }

    public final void k() {
        String c2;
        LbsInfo lbsInfo = this.b;
        if (lbsInfo == null) {
            lbsInfo = LbsInfo.Companion.location(this.a);
        }
        this.b = lbsInfo;
        String str = this.c;
        boolean z = false;
        if (str == null) {
            g.c.b.a.l.d dVar = g.c.b.a.l.d.a;
            str = g.c.b.a.l.d.b(true);
            if (((str.length() == 0) || i.t.e.m(str, "127", false, 2) || i.t.e.m(str, "192", false, 2)) && (c2 = g.c.b.a.l.d.c(0)) != null) {
                str = c2;
            }
        }
        this.c = str;
        ((ExtInfo) this.f1972e.getValue()).setLbsInfo(this.b);
        String str2 = this.c;
        if (str2 == null || str2.length() == 0) {
            z = true;
        }
        if (!z) {
            m().getNetInfo().setIpv4(this.c);
        }
    }

    public final void l() {
        UserInfo userInfo;
        if (TextUtils.isEmpty(m().getUserInfo().getQimei())) {
            String c2 = g.c.a.e.h.a.h.a().c();
            String token = QseaSDK.getInstance("0AND02Z8WN41BWCA").getToken();
            if (!(c2 == null || i.t.e.j(c2))) {
                UserInfo userInfo2 = m().getUserInfo();
                h.d(c2, "qimei");
                userInfo2.setQimei(c2);
                userInfo = m().getUserInfo();
                token = "";
            } else {
                userInfo = m().getUserInfo();
                h.d(token, "qimeiToaken");
            }
            userInfo.setQimeiToken(token);
        }
    }

    public final AccessHeadInfo m() {
        return (AccessHeadInfo) this.f1971d.getValue();
    }

    public String method() {
        return "POST";
    }
}
