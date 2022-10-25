package g.e.a.a.e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.google.android.datatransport.cct.CCTDestination;
import com.tencent.raft.measure.utils.MeasureConst;
import g.e.a.a.e.d.d;
import g.e.a.a.e.d.f;
import g.e.a.a.e.d.g;
import g.e.a.a.e.d.h;
import g.e.a.a.e.d.i;
import g.e.a.a.e.d.j;
import g.e.a.a.e.d.k;
import g.e.a.a.e.d.l;
import g.e.a.a.e.d.n;
import g.e.a.a.e.d.o;
import g.e.a.a.e.d.p;
import g.e.a.a.e.d.q;
import g.e.a.a.e.d.r;
import g.e.a.a.e.d.t;
import g.e.a.a.e.d.u;
import g.e.a.a.f.l;
import g.e.a.a.f.v.g;
import g.e.a.a.f.v.m;
import g.e.b.n.i.e;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class c implements m {
    public final g.e.b.n.a a;
    public final ConnectivityManager b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public final URL f2682d = c(CCTDestination.c);

    /* renamed from: e  reason: collision with root package name */
    public final g.e.a.a.f.b0.a f2683e;

    /* renamed from: f  reason: collision with root package name */
    public final g.e.a.a.f.b0.a f2684f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2685g;

    public static final class a {
        public final URL a;
        public final o b;
        public final String c;

        public a(URL url, o oVar, String str) {
            this.a = url;
            this.b = oVar;
            this.c = str;
        }
    }

    public static final class b {
        public final int a;
        public final URL b;
        public final long c;

        public b(int i2, URL url, long j2) {
            this.a = i2;
            this.b = url;
            this.c = j2;
        }
    }

    public c(Context context, g.e.a.a.f.b0.a aVar, g.e.a.a.f.b0.a aVar2) {
        e eVar = new e();
        g.e.a.a.e.d.c cVar = g.e.a.a.e.d.c.a;
        eVar.a(o.class, cVar);
        eVar.a(i.class, cVar);
        f fVar = f.a;
        eVar.a(r.class, fVar);
        eVar.a(l.class, fVar);
        d dVar = d.a;
        eVar.a(p.class, dVar);
        eVar.a(j.class, dVar);
        g.e.a.a.e.d.b bVar = g.e.a.a.e.d.b.a;
        eVar.a(g.e.a.a.e.d.a.class, bVar);
        eVar.a(h.class, bVar);
        g.e.a.a.e.d.e eVar2 = g.e.a.a.e.d.e.a;
        eVar.a(q.class, eVar2);
        eVar.a(k.class, eVar2);
        g gVar = g.a;
        eVar.a(t.class, gVar);
        eVar.a(n.class, gVar);
        eVar.f3712d = true;
        this.a = new g.e.b.n.i.d(eVar);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f2683e = aVar2;
        this.f2684f = aVar;
        this.f2685g = 40000;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(g.a.a.a.a.w("Invalid url: ", str), e2);
        }
    }

    public g.e.a.a.f.l a(g.e.a.a.f.l lVar) {
        int i2;
        t.a aVar;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        l.a j2 = lVar.j();
        j2.c().put("sdk-version", String.valueOf(Build.VERSION.SDK_INT));
        j2.c().put("model", Build.MODEL);
        j2.c().put("hardware", Build.HARDWARE);
        j2.c().put("device", Build.DEVICE);
        j2.c().put("product", Build.PRODUCT);
        j2.c().put("os-uild", Build.ID);
        j2.c().put("manufacturer", Build.MANUFACTURER);
        j2.c().put("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        j2.c().put("tz-offset", String.valueOf((long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000)));
        j2.c().put("net-type", String.valueOf(activeNetworkInfo == null ? t.b.t.a() : activeNetworkInfo.getType()));
        int i3 = -1;
        if (activeNetworkInfo == null) {
            aVar = t.a.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            i2 = activeNetworkInfo.getSubtype();
            if (i2 == -1) {
                aVar = t.a.COMBINED;
            } else {
                if (t.a.w.get(i2) == null) {
                    i2 = 0;
                }
                j2.c().put("mobile-subtype", String.valueOf(i2));
                j2.c().put("country", Locale.getDefault().getCountry());
                j2.c().put("locale", Locale.getDefault().getLanguage());
                j2.c().put("mcc_mnc", ((TelephonyManager) this.c.getSystemService("phone")).getSimOperator());
                Context context = this.c;
                i3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                j2.c().put("application_build", Integer.toString(i3));
                return j2.b();
            }
        }
        i2 = aVar.a();
        j2.c().put("mobile-subtype", String.valueOf(i2));
        j2.c().put("country", Locale.getDefault().getCountry());
        j2.c().put("locale", Locale.getDefault().getLanguage());
        j2.c().put("mcc_mnc", ((TelephonyManager) this.c.getSystemService("phone")).getSimOperator());
        Context context2 = this.c;
        try {
            i3 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            e.e.d.l.a.w("CctTransportBackend", "Unable to find version code for package", e2);
        }
        j2.c().put("application_build", Integer.toString(i3));
        return j2.b();
    }

    public g.e.a.a.f.v.g b(g.e.a.a.f.v.f fVar) {
        g.a aVar;
        String str;
        Integer num;
        g.a aVar2;
        k.b bVar;
        g.a aVar3 = g.a.TRANSIENT_ERROR;
        HashMap hashMap = new HashMap();
        g.e.a.a.f.v.a aVar4 = (g.e.a.a.f.v.a) fVar;
        for (g.e.a.a.f.l next : aVar4.a) {
            String h2 = next.h();
            if (!hashMap.containsKey(h2)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(h2, arrayList);
            } else {
                ((List) hashMap.get(h2)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            String str2 = null;
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                g.e.a.a.f.l lVar = (g.e.a.a.f.l) ((List) entry.getValue()).get(0);
                u uVar = u.DEFAULT;
                Long valueOf = Long.valueOf(this.f2684f.a());
                Long valueOf2 = Long.valueOf(this.f2683e.a());
                j jVar = new j(p.a.ANDROID_FIREBASE, new h(Integer.valueOf(lVar.g("sdk-version")), lVar.b("model"), lVar.b("hardware"), lVar.b("device"), lVar.b("product"), lVar.b("os-uild"), lVar.b("manufacturer"), lVar.b("fingerprint"), lVar.b("locale"), lVar.b("country"), lVar.b("mcc_mnc"), lVar.b("application_build"), (h.a) null), (j.a) null);
                try {
                    str = null;
                    num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                } catch (NumberFormatException unused) {
                    num = null;
                    str = (String) entry.getKey();
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = ((List) entry.getValue()).iterator();
                while (it2.hasNext()) {
                    g.e.a.a.f.l lVar2 = (g.e.a.a.f.l) it2.next();
                    g.e.a.a.f.k e2 = lVar2.e();
                    Iterator it3 = it;
                    g.e.a.a.a aVar5 = e2.a;
                    Iterator it4 = it2;
                    String str3 = "";
                    if (aVar5.equals(new g.e.a.a.a("proto"))) {
                        byte[] bArr = e2.b;
                        bVar = new k.b();
                        bVar.f2719d = bArr;
                    } else if (aVar5.equals(new g.e.a.a.a("json"))) {
                        String str4 = new String(e2.b, Charset.forName(MeasureConst.CHARSET_UTF8));
                        bVar = new k.b();
                        bVar.f2720e = str4;
                    } else {
                        aVar2 = aVar3;
                        Log.w(e.e.d.l.a.J("CctTransportBackend"), String.format("Received event of unsupported encoding %s. Skipping...", new Object[]{aVar5}));
                        it2 = it4;
                        it = it3;
                        aVar3 = aVar2;
                    }
                    bVar.a = Long.valueOf(lVar2.f());
                    bVar.c = Long.valueOf(lVar2.i());
                    String str5 = lVar2.c().get("tz-offset");
                    bVar.f2721f = Long.valueOf(str5 == null ? 0 : Long.valueOf(str5).longValue());
                    aVar2 = aVar3;
                    bVar.f2722g = new n(t.b.u.get(lVar2.g("net-type")), t.a.w.get(lVar2.g("mobile-subtype")), (n.a) null);
                    if (lVar2.d() != null) {
                        bVar.b = lVar2.d();
                    }
                    String str6 = bVar.a == null ? " eventTimeMs" : str3;
                    if (bVar.c == null) {
                        str6 = g.a.a.a.a.w(str6, " eventUptimeMs");
                    }
                    if (bVar.f2721f == null) {
                        str6 = g.a.a.a.a.w(str6, " timezoneOffsetSeconds");
                    }
                    if (str6.isEmpty()) {
                        arrayList3.add(new k(bVar.a.longValue(), bVar.b, bVar.c.longValue(), bVar.f2719d, bVar.f2720e, bVar.f2721f.longValue(), bVar.f2722g, (k.a) null));
                        it2 = it4;
                        it = it3;
                        aVar3 = aVar2;
                    } else {
                        throw new IllegalStateException(g.a.a.a.a.w("Missing required properties:", str6));
                    }
                }
                Iterator it5 = it;
                g.a aVar6 = aVar3;
                String str7 = valueOf == null ? " requestTimeMs" : "";
                if (valueOf2 == null) {
                    str7 = g.a.a.a.a.w(str7, " requestUptimeMs");
                }
                if (str7.isEmpty()) {
                    arrayList2.add(new g.e.a.a.e.d.l(valueOf.longValue(), valueOf2.longValue(), jVar, num, str, arrayList3, uVar, (l.a) null));
                    it = it5;
                    aVar3 = aVar6;
                } else {
                    throw new IllegalStateException(g.a.a.a.a.w("Missing required properties:", str7));
                }
            } else {
                g.a aVar7 = aVar3;
                i iVar = new i(arrayList2);
                URL url = this.f2682d;
                if (aVar4.b != null) {
                    try {
                        CCTDestination a2 = CCTDestination.a(((g.e.a.a.f.v.a) fVar).b);
                        String str8 = a2.b;
                        if (str8 != null) {
                            str2 = str8;
                        }
                        String str9 = a2.a;
                        if (str9 != null) {
                            url = c(str9);
                        }
                    } catch (IllegalArgumentException unused2) {
                        return g.e.a.a.f.v.g.a();
                    }
                }
                try {
                    b bVar2 = (b) e.e.d.l.a.t0(5, new a(url, iVar, str2), new b(this), a.a);
                    int i2 = bVar2.a;
                    if (i2 == 200) {
                        return new g.e.a.a.f.v.b(g.a.OK, bVar2.c);
                    }
                    if (i2 < 500) {
                        if (i2 != 404) {
                            if (i2 == 400) {
                                return new g.e.a.a.f.v.b(g.a.INVALID_PAYLOAD, -1);
                            }
                            return g.e.a.a.f.v.g.a();
                        }
                    }
                    aVar = aVar7;
                    try {
                        return new g.e.a.a.f.v.b(aVar, -1);
                    } catch (IOException e3) {
                        e = e3;
                        e.e.d.l.a.w("CctTransportBackend", "Could not make request to the backend", e);
                        return new g.e.a.a.f.v.b(aVar, -1);
                    }
                } catch (IOException e4) {
                    e = e4;
                    aVar = aVar7;
                    e.e.d.l.a.w("CctTransportBackend", "Could not make request to the backend", e);
                    return new g.e.a.a.f.v.b(aVar, -1);
                }
            }
        }
    }
}
