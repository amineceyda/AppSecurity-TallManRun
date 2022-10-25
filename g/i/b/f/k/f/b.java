package g.i.b.f.k.f;

import android.text.TextUtils;
import g.i.b.e.h.e;
import g.i.b.f.k.f.a;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class b {
    public final List<a> a = new ArrayList();
    public a b;
    public Map<String, a> c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f4344d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f4345e = 0;

    /* renamed from: f  reason: collision with root package name */
    public AtomicInteger f4346f = new AtomicInteger(0);

    /* renamed from: g  reason: collision with root package name */
    public volatile long f4347g = -1;

    /* renamed from: h  reason: collision with root package name */
    public long f4348h = -1;

    /* renamed from: i  reason: collision with root package name */
    public long f4349i = -1;

    /* renamed from: j  reason: collision with root package name */
    public String f4350j = "";

    /* renamed from: k  reason: collision with root package name */
    public String f4351k = "";

    /* renamed from: l  reason: collision with root package name */
    public String f4352l;

    /* renamed from: m  reason: collision with root package name */
    public List<g.i.b.f.i.a> f4353m;
    public Map<Integer, Map<String, String>> n;

    public class a {
        public String a;
        public List<a> b;
        public List<a> c;

        /* renamed from: d  reason: collision with root package name */
        public List<a> f4354d;

        /* renamed from: e  reason: collision with root package name */
        public List<a> f4355e;

        /* renamed from: f  reason: collision with root package name */
        public a f4356f;

        /* renamed from: g  reason: collision with root package name */
        public List<a> f4357g;

        /* renamed from: h  reason: collision with root package name */
        public a f4358h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f4359i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f4360j = false;

        /* renamed from: k  reason: collision with root package name */
        public int f4361k = 0;

        public a(String str) {
            this.a = str;
        }

        public static void c(StringBuilder sb, List<a> list) {
            if (list != null) {
                synchronized (list) {
                    if (list.size() > 0) {
                        for (a next : list) {
                            if (next != null) {
                                sb.append(next);
                                sb.append(",");
                            }
                        }
                    }
                }
            }
        }

        public static void d(List<a> list, List<a> list2) {
            if (list2 != null && list2.size() > 0) {
                list.addAll(list2);
            }
        }

        public final synchronized List<a> a() {
            ArrayList arrayList;
            arrayList = new ArrayList();
            arrayList.add(b.this.b);
            d(arrayList, this.b);
            d(arrayList, this.c);
            d(arrayList, this.f4354d);
            d(arrayList, this.f4355e);
            a aVar = this.f4356f;
            if (aVar != null) {
                arrayList.add(aVar);
            }
            d(arrayList, this.f4357g);
            a aVar2 = this.f4358h;
            if (aVar2 != null) {
                arrayList.add(aVar2);
            }
            Objects.requireNonNull(b.this);
            return arrayList;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void b(java.lang.String r3) {
            /*
                r2 = this;
                monitor-enter(r2)
                boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0022 }
                if (r0 == 0) goto L_0x0009
                monitor-exit(r2)
                return
            L_0x0009:
                g.i.b.f.k.f.a r0 = r2.f4356f     // Catch:{ all -> 0x0022 }
                if (r0 != 0) goto L_0x0020
                g.i.b.f.k.f.a r0 = new g.i.b.f.k.f.a     // Catch:{ all -> 0x0022 }
                g.i.b.f.k.f.a$a r1 = g.i.b.f.k.f.a.C0161a.Type_CDN_Ip_Jumped     // Catch:{ all -> 0x0022 }
                r0.<init>(r3, r1)     // Catch:{ all -> 0x0022 }
                r2.f4356f = r0     // Catch:{ all -> 0x0022 }
                g.i.b.f.k.f.b r3 = g.i.b.f.k.f.b.this     // Catch:{ all -> 0x0022 }
                java.util.concurrent.atomic.AtomicInteger r3 = r3.f4346f     // Catch:{ all -> 0x0022 }
                int r3 = r3.getAndIncrement()     // Catch:{ all -> 0x0022 }
                r0.c = r3     // Catch:{ all -> 0x0022 }
            L_0x0020:
                monitor-exit(r2)
                return
            L_0x0022:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: g.i.b.f.k.f.b.a.b(java.lang.String):void");
        }

        public final List<a> e(a.C0161a aVar) {
            List<a> list = aVar == a.C0161a.Type_CDN_Ip_App_Input ? this.b : null;
            if (aVar == a.C0161a.Type_CDN_Ip_Http_Header) {
                list = this.c;
            }
            if (aVar == a.C0161a.Type_CDN_Ip_Socket_Schedule) {
                list = this.f4354d;
            }
            if (aVar == a.C0161a.Type_CDN_Ip_Socket_Schedule_Https) {
                list = this.f4355e;
            }
            return aVar == a.C0161a.Type_Src_Ip_App_Input ? this.f4357g : list;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void f(java.lang.String r3) {
            /*
                r2 = this;
                monitor-enter(r2)
                boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0022 }
                if (r0 == 0) goto L_0x0009
                monitor-exit(r2)
                return
            L_0x0009:
                g.i.b.f.k.f.a r0 = r2.f4358h     // Catch:{ all -> 0x0022 }
                if (r0 != 0) goto L_0x0020
                g.i.b.f.k.f.a r0 = new g.i.b.f.k.f.a     // Catch:{ all -> 0x0022 }
                g.i.b.f.k.f.a$a r1 = g.i.b.f.k.f.a.C0161a.Type_Src_Ip_Jumped     // Catch:{ all -> 0x0022 }
                r0.<init>(r3, r1)     // Catch:{ all -> 0x0022 }
                r2.f4358h = r0     // Catch:{ all -> 0x0022 }
                g.i.b.f.k.f.b r3 = g.i.b.f.k.f.b.this     // Catch:{ all -> 0x0022 }
                java.util.concurrent.atomic.AtomicInteger r3 = r3.f4346f     // Catch:{ all -> 0x0022 }
                int r3 = r3.getAndIncrement()     // Catch:{ all -> 0x0022 }
                r0.c = r3     // Catch:{ all -> 0x0022 }
            L_0x0020:
                monitor-exit(r2)
                return
            L_0x0022:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: g.i.b.f.k.f.b.a.f(java.lang.String):void");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(e.g(this.a));
            sb.append(",");
            c(sb, this.b);
            c(sb, this.c);
            c(sb, this.f4354d);
            c(sb, this.f4355e);
            a aVar = this.f4356f;
            if (aVar != null) {
                sb.append(aVar);
                sb.append(",");
            }
            c(sb, this.f4357g);
            a aVar2 = this.f4358h;
            if (aVar2 != null) {
                sb.append(aVar2);
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
    }

    public b(String str, long j2) {
        a aVar = new a(str, a.C0161a.Type_CDN_Domain);
        this.b = aVar;
        aVar.c = this.f4346f.getAndIncrement();
        this.f4348h = j2;
        try {
            this.f4352l = new URL(str).getHost();
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
        }
    }

    public final a a(String str, a aVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        a aVar2;
        List<a> e2;
        a aVar3;
        a aVar4;
        a aVar5;
        a aVar6;
        Object obj;
        String str2 = str;
        a aVar7 = aVar;
        a.C0161a aVar8 = a.C0161a.Type_Src_Ip_Jumped;
        a.C0161a aVar9 = a.C0161a.Type_CDN_Ip_Jumped;
        if (z4) {
            a aVar10 = this.c.get(str2);
            if (aVar10 != null) {
                synchronized (aVar10) {
                    List list = aVar10.f4355e;
                    if (list != null && list.size() > 0) {
                        int indexOf = list.indexOf(aVar7);
                        if (indexOf == -1) {
                            obj = list.get(0);
                        } else if (indexOf < list.size() - 1) {
                            obj = list.get(indexOf + 1);
                        }
                        aVar2 = (a) obj;
                    }
                    aVar2 = null;
                }
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                return aVar2;
            }
        } else {
            aVar2 = null;
        }
        if (z3) {
            synchronized (this.a) {
                if (this.a.size() > 0) {
                    int indexOf2 = this.a.indexOf(aVar7);
                    if (indexOf2 == -1) {
                        aVar6 = this.a.get(0);
                    } else if (indexOf2 != this.a.size() - 1) {
                        aVar6 = this.a.get(indexOf2 + 1);
                    }
                }
                aVar6 = null;
            }
            if (aVar2 != null) {
                return aVar2;
            }
        }
        a.C0161a aVar11 = aVar7 != null ? aVar7.b : null;
        if ((aVar7 != null && !z2 && a.b(aVar7.b)) && (aVar4 = this.c.get(str2)) != null) {
            synchronized (aVar4) {
                if (aVar7 != null) {
                    List<a> e3 = aVar4.e(aVar7.b);
                    if (e3 != null) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= e3.size()) {
                                break;
                            } else if (aVar7 != e3.get(i2)) {
                                i2++;
                            } else if (i2 != e3.size() - 1) {
                                a aVar12 = e3.get(i2 + 1);
                                aVar5 = aVar12;
                            }
                        }
                    }
                }
                aVar5 = null;
            }
            if (aVar2 != null) {
                return aVar2;
            }
        }
        a.C0161a.values();
        int i3 = 11;
        if (z5 && this.f4344d) {
            aVar11 = a.C0161a.Type_CDN_Domain;
        }
        while (aVar2 == null && i3 > 0) {
            a.C0161a[] aVarArr = z ? a.f4330f : a.f4331g;
            a.C0161a aVar13 = aVarArr[0];
            if (aVar11 != null) {
                int i4 = 0;
                while (true) {
                    if (i4 < aVarArr.length) {
                        if (aVar11 == aVarArr[i4] && i4 != aVarArr.length - 1) {
                            aVar13 = aVarArr[i4 + 1];
                            break;
                        }
                        i4++;
                    } else {
                        break;
                    }
                }
            }
            aVar11 = aVar13;
            if (aVar11 == a.C0161a.Type_CDN_Ip_App_Input || aVar11 == aVar9 || aVar11 == a.C0161a.Type_CDN_Ip_Http_Header || aVar11 == a.C0161a.Type_CDN_Ip_Socket_Schedule || aVar11 == a.C0161a.Type_Src_Ip_App_Input || aVar11 == aVar8 || aVar11 == a.C0161a.Type_CDN_Ip_Socket_Schedule_Https) {
                a aVar14 = this.c.get(str2);
                if (aVar14 != null) {
                    synchronized (aVar14) {
                        if (aVar11 == aVar9) {
                            aVar3 = aVar14.f4356f;
                        } else if (aVar11 == aVar8) {
                            aVar3 = aVar14.f4358h;
                        } else if (a.b(aVar11) && (e2 = aVar14.e(aVar11)) != null) {
                            if (aVar14.f4361k > e2.size() - 1) {
                                aVar14.f4361k = 0;
                            }
                            int i5 = aVar14.f4361k;
                            aVar14.f4361k = i5 + 1;
                            aVar3 = e2.get(i5);
                        }
                    }
                } else {
                    continue;
                }
                i3--;
            } else if (aVar11 != a.C0161a.Type_Src_Domain) {
                aVar2 = this.b;
                i3--;
            }
            aVar2 = null;
            i3--;
        }
        return aVar2 == null ? this.b : aVar2;
    }

    public final a b(String str) {
        a aVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.c) {
            aVar = this.c.get(str);
            if (aVar == null) {
                aVar = new a(str);
                this.c.put(str, aVar);
            }
        }
        return aVar;
    }

    public final List<g.i.b.f.i.a> c() {
        ArrayList arrayList;
        List<g.i.b.f.i.a> list = this.f4353m;
        if (list == null) {
            return null;
        }
        synchronized (list) {
            arrayList = new ArrayList();
            for (g.i.b.f.i.a next : this.f4353m) {
                arrayList.add(new g.i.b.f.i.a(next.a, next.b));
            }
        }
        return arrayList;
    }

    public final void d(String str, String str2, a.C0161a aVar) {
        List<a> list;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                String host = new URL(str2).getHost();
                if (host.charAt(0) == '[' && host.charAt(host.length() - 1) == ']') {
                    if (g.i.b.e.b.e.c == 1) {
                        g.i.b.e.h.b.c("halley-downloader-DownloadUrlMgr", "ignore ipv6 addr when in ipv4 only network");
                        return;
                    }
                } else if (g.h.a.a.o(host) && g.i.b.e.b.e.c == 3) {
                    g.i.b.e.h.b.c("halley-downloader-DownloadUrlMgr", "ignore ipv4 addr when in ipv6 only network");
                    return;
                }
                a b2 = b(str);
                if (b2 != null) {
                    synchronized (b2) {
                        if (!TextUtils.isEmpty(str2)) {
                            if (aVar == a.C0161a.Type_CDN_Ip_App_Input) {
                                if (b2.b == null) {
                                    b2.b = new ArrayList();
                                }
                                list = b2.b;
                            } else if (aVar == a.C0161a.Type_CDN_Ip_Http_Header) {
                                if (b2.c == null) {
                                    b2.c = new ArrayList();
                                }
                                list = b2.c;
                            } else if (aVar == a.C0161a.Type_CDN_Ip_Socket_Schedule) {
                                if (b2.f4354d == null) {
                                    b2.f4354d = new ArrayList();
                                }
                                list = b2.f4354d;
                            } else if (aVar == a.C0161a.Type_CDN_Ip_Socket_Schedule_Https) {
                                if (b2.f4355e == null) {
                                    b2.f4355e = new ArrayList();
                                }
                                list = b2.f4355e;
                            } else if (aVar == a.C0161a.Type_Src_Ip_App_Input) {
                                if (b2.f4357g == null) {
                                    b2.f4357g = new ArrayList();
                                }
                                list = b2.f4357g;
                            }
                            Iterator<a> it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (str2.equalsIgnoreCase(it.next().a)) {
                                        break;
                                    }
                                } else {
                                    a aVar2 = new a(str2, aVar);
                                    aVar2.c = b.this.f4346f.getAndIncrement();
                                    list.add(aVar2);
                                    break;
                                }
                            }
                        }
                    }
                    g.i.b.e.h.b.c("halley-downloader-DownloadUrlMgr", "addUrlByApn...apn:" + str + ",type:" + aVar + ",url:" + str2);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final boolean e(boolean z) {
        g.i.b.e.b.e.d();
        String str = g.i.b.e.b.e.f4111f;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        a aVar = this.c.get(str);
        if (aVar != null) {
            return !z ? !aVar.f4360j : !aVar.f4359i;
        }
    }

    public final void f(boolean z) {
        a b2;
        g.i.b.e.b.e.d();
        String str = g.i.b.e.b.e.f4111f;
        if (TextUtils.isEmpty(str) || (b2 = b(str)) == null) {
            return;
        }
        if (z) {
            b2.f4359i = true;
        } else {
            b2.f4360j = true;
        }
    }
}
