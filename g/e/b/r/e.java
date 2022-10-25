package g.e.b.r;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.tencent.raft.codegenmeta.utils.Constants;
import g.c.b.b.f;
import g.e.a.b.g.b0;
import g.e.a.b.g.g;
import g.e.b.h;
import g.e.b.p.j;
import g.e.b.r.l.a;
import g.e.b.r.l.b;
import g.e.b.r.l.c;
import g.e.b.r.l.d;
import g.e.b.r.m.b;
import g.e.b.r.m.c;
import g.e.b.r.m.f;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

public class e implements f {

    /* renamed from: m  reason: collision with root package name */
    public static final Object f3728m = new Object();
    public static final ThreadFactory n = new a();
    public final h a;
    public final c b;
    public final g.e.b.r.l.c c;

    /* renamed from: d  reason: collision with root package name */
    public final j f3729d;

    /* renamed from: e  reason: collision with root package name */
    public final b f3730e;

    /* renamed from: f  reason: collision with root package name */
    public final h f3731f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f3732g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public final ExecutorService f3733h;

    /* renamed from: i  reason: collision with root package name */
    public final ExecutorService f3734i;

    /* renamed from: j  reason: collision with root package name */
    public String f3735j;

    /* renamed from: k  reason: collision with root package name */
    public Set<g.e.b.r.k.a> f3736k = new HashSet();

    /* renamed from: l  reason: collision with root package name */
    public final List<i> f3737l = new ArrayList();

    public class a implements ThreadFactory {
        public final AtomicInteger a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.a.getAndIncrement())}));
        }
    }

    public e(h hVar, g.e.b.q.b<j> bVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = n;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, timeUnit, linkedBlockingQueue, threadFactory);
        hVar.a();
        c cVar = new c(hVar.a, bVar);
        g.e.b.r.l.c cVar2 = new g.e.b.r.l.c(hVar);
        j c2 = j.c();
        b bVar2 = new b(hVar);
        h hVar2 = new h();
        this.a = hVar;
        this.b = cVar;
        this.c = cVar2;
        this.f3729d = c2;
        this.f3730e = bVar2;
        this.f3731f = hVar2;
        this.f3733h = threadPoolExecutor;
        this.f3734i = new ThreadPoolExecutor(0, 1, 30, timeUnit, new LinkedBlockingQueue(), threadFactory);
    }

    public static e d() {
        h b2 = h.b();
        f.h(true, "Null is not a valid value of FirebaseApp.");
        b2.a();
        return (e) b2.f3443d.a(f.class);
    }

    public final d a(d dVar) throws FirebaseInstallationsException {
        g.e.b.r.m.f f2;
        f.a a2;
        f.b bVar;
        FirebaseInstallationsException.a aVar = FirebaseInstallationsException.a.UNAVAILABLE;
        c cVar = this.b;
        String b2 = b();
        g.e.b.r.l.a aVar2 = (g.e.b.r.l.a) dVar;
        String str = aVar2.b;
        String e2 = e();
        String str2 = aVar2.f3740e;
        if (cVar.c.a()) {
            URL a3 = cVar.a(String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{e2, str}));
            int i2 = 0;
            while (i2 <= 1) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c2 = cVar.c(a3, b2);
                try {
                    c2.setRequestMethod("POST");
                    c2.addRequestProperty("Authorization", "FIS_v2 " + str2);
                    c2.setDoOutput(true);
                    cVar.h(c2);
                    int responseCode = c2.getResponseCode();
                    cVar.c.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        f2 = cVar.f(c2);
                    } else {
                        c.b(c2, (String) null, b2, e2);
                        if (responseCode == 401) {
                            a2 = g.e.b.r.m.f.a();
                            bVar = f.b.AUTH_ERROR;
                        } else if (responseCode == 404) {
                            a2 = g.e.b.r.m.f.a();
                            bVar = f.b.AUTH_ERROR;
                        } else if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.a.TOO_MANY_REQUESTS);
                        } else if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            a2 = g.e.b.r.m.f.a();
                            bVar = f.b.BAD_CONFIG;
                        } else {
                            c2.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i2++;
                        }
                        b.C0127b bVar2 = (b.C0127b) a2;
                        bVar2.c = bVar;
                        f2 = bVar2.a();
                    }
                    c2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    g.e.b.r.m.b bVar3 = (g.e.b.r.m.b) f2;
                    int ordinal = bVar3.c.ordinal();
                    if (ordinal == 0) {
                        String str3 = bVar3.a;
                        long j2 = bVar3.b;
                        long b3 = this.f3729d.b();
                        a.b bVar4 = (a.b) dVar.j();
                        bVar4.c = str3;
                        bVar4.f3745e = Long.valueOf(j2);
                        bVar4.f3746f = Long.valueOf(b3);
                        return bVar4.a();
                    } else if (ordinal == 1) {
                        a.b bVar5 = (a.b) dVar.j();
                        bVar5.f3747g = "BAD CONFIG";
                        bVar5.b(c.a.REGISTER_ERROR);
                        return bVar5.a();
                    } else if (ordinal == 2) {
                        synchronized (this) {
                            try {
                                this.f3735j = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        d.a j3 = dVar.j();
                        j3.b(c.a.NOT_GENERATED);
                        return j3.a();
                    } else {
                        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", aVar);
                    }
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th2) {
                    c2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", aVar);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", aVar);
    }

    public String b() {
        h hVar = this.a;
        hVar.a();
        return hVar.c.a;
    }

    public String c() {
        h hVar = this.a;
        hVar.a();
        return hVar.c.b;
    }

    public String e() {
        h hVar = this.a;
        hVar.a();
        return hVar.c.f3452g;
    }

    public g.e.a.b.g.f<String> f() {
        String str;
        g.c.b.b.f.l(c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        g.c.b.b.f.l(e(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        g.c.b.b.f.l(b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String c2 = c();
        Pattern pattern = j.c;
        g.c.b.b.f.h(c2.contains(Constants.KEY_INDEX_FILE_SEPARATOR), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        g.c.b.b.f.h(j.c.matcher(b()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        synchronized (this) {
            str = this.f3735j;
        }
        if (str != null) {
            return g.e.a.b.b.h.e.h(str);
        }
        g gVar = new g();
        g gVar2 = new g(gVar);
        synchronized (this.f3732g) {
            this.f3737l.add(gVar2);
        }
        b0<TResult> b0Var = gVar.a;
        this.f3733h.execute(new b(this));
        return b0Var;
    }

    public final String g(d dVar) {
        String string;
        h hVar = this.a;
        hVar.a();
        if (hVar.b.equals("CHIME_ANDROID_SDK") || this.a.g()) {
            if (((g.e.b.r.l.a) dVar).c == c.a.ATTEMPT_MIGRATION) {
                g.e.b.r.l.b bVar = this.f3730e;
                synchronized (bVar.a) {
                    synchronized (bVar.a) {
                        string = bVar.a.getString("|S|id", (String) null);
                    }
                    if (string == null) {
                        string = bVar.a();
                    }
                }
                return TextUtils.isEmpty(string) ? this.f3731f.a() : string;
            }
        }
        return this.f3731f.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0061 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g.e.b.r.l.d h(g.e.b.r.l.d r24) throws com.google.firebase.installations.FirebaseInstallationsException {
        /*
            r23 = this;
            r1 = r23
            com.google.firebase.installations.FirebaseInstallationsException$a r0 = com.google.firebase.installations.FirebaseInstallationsException.a.UNAVAILABLE
            r2 = r24
            g.e.b.r.l.a r2 = (g.e.b.r.l.a) r2
            java.lang.String r3 = r2.b
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x0069
            int r3 = r3.length()
            r6 = 11
            if (r3 != r6) goto L_0x0069
            g.e.b.r.l.b r3 = r1.f3730e
            android.content.SharedPreferences r6 = r3.a
            monitor-enter(r6)
            java.lang.String[] r7 = g.e.b.r.l.b.c     // Catch:{ all -> 0x0066 }
            int r8 = r7.length     // Catch:{ all -> 0x0066 }
            r9 = 0
        L_0x001f:
            if (r9 >= r8) goto L_0x0061
            r10 = r7[r9]     // Catch:{ all -> 0x0066 }
            java.lang.String r11 = r3.b     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            r12.<init>()     // Catch:{ all -> 0x0066 }
            java.lang.String r13 = "|T|"
            r12.append(r13)     // Catch:{ all -> 0x0066 }
            r12.append(r11)     // Catch:{ all -> 0x0066 }
            java.lang.String r11 = "|"
            r12.append(r11)     // Catch:{ all -> 0x0066 }
            r12.append(r10)     // Catch:{ all -> 0x0066 }
            java.lang.String r10 = r12.toString()     // Catch:{ all -> 0x0066 }
            android.content.SharedPreferences r11 = r3.a     // Catch:{ all -> 0x0066 }
            java.lang.String r10 = r11.getString(r10, r4)     // Catch:{ all -> 0x0066 }
            if (r10 == 0) goto L_0x0063
            boolean r11 = r10.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r11 != 0) goto L_0x0063
            java.lang.String r3 = "{"
            boolean r3 = r10.startsWith(r3)     // Catch:{ all -> 0x0066 }
            if (r3 == 0) goto L_0x0060
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0061 }
            r3.<init>(r10)     // Catch:{ JSONException -> 0x0061 }
            java.lang.String r7 = "token"
            java.lang.String r4 = r3.getString(r7)     // Catch:{ JSONException -> 0x0061 }
            goto L_0x0061
        L_0x0060:
            r4 = r10
        L_0x0061:
            monitor-exit(r6)     // Catch:{ all -> 0x0066 }
            goto L_0x0069
        L_0x0063:
            int r9 = r9 + 1
            goto L_0x001f
        L_0x0066:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0066 }
            throw r0
        L_0x0069:
            g.e.b.r.m.c r3 = r1.b
            java.lang.String r6 = r23.b()
            java.lang.String r2 = r2.b
            java.lang.String r7 = r23.e()
            java.lang.String r8 = r23.c()
            g.e.b.r.m.e r9 = r3.c
            boolean r9 = r9.a()
            java.lang.String r10 = "Firebase Installations Service is unavailable. Please try again later."
            if (r9 == 0) goto L_0x0187
            r9 = 1
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r5] = r7
            java.lang.String r12 = "projects/%s/installations"
            java.lang.String r11 = java.lang.String.format(r12, r11)
            java.net.URL r11 = r3.a(r11)
            r12 = 0
        L_0x0093:
            if (r12 > r9) goto L_0x0181
            r13 = 32769(0x8001, float:4.5919E-41)
            android.net.TrafficStats.setThreadStatsTag(r13)
            java.net.HttpURLConnection r13 = r3.c(r11, r6)
            java.lang.String r14 = "POST"
            r13.setRequestMethod(r14)     // Catch:{ IOException | AssertionError -> 0x0176, all -> 0x016e }
            r13.setDoOutput(r9)     // Catch:{ IOException | AssertionError -> 0x0176, all -> 0x016e }
            if (r4 == 0) goto L_0x00ae
            java.lang.String r14 = "x-goog-fis-android-iid-migration-auth"
            r13.addRequestProperty(r14, r4)     // Catch:{ IOException | AssertionError -> 0x0176, all -> 0x016e }
        L_0x00ae:
            r3.g(r13, r2, r8)     // Catch:{ IOException | AssertionError -> 0x0176, all -> 0x016e }
            int r14 = r13.getResponseCode()     // Catch:{ IOException | AssertionError -> 0x0176, all -> 0x016e }
            g.e.b.r.m.e r15 = r3.c     // Catch:{ IOException | AssertionError -> 0x0176, all -> 0x016e }
            r15.b(r14)     // Catch:{ IOException | AssertionError -> 0x0176, all -> 0x016e }
            r15 = 200(0xc8, float:2.8E-43)
            if (r14 < r15) goto L_0x00c4
            r15 = 300(0x12c, float:4.2E-43)
            if (r14 >= r15) goto L_0x00c4
            r15 = 1
            goto L_0x00c5
        L_0x00c4:
            r15 = 0
        L_0x00c5:
            if (r15 == 0) goto L_0x00d2
            g.e.b.r.m.d r2 = r3.e(r13)     // Catch:{ IOException | AssertionError -> 0x0176, all -> 0x016e }
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x0104
        L_0x00d2:
            g.e.b.r.m.c.b(r13, r8, r6, r7)     // Catch:{ IOException | AssertionError -> 0x0176, all -> 0x016e }
            r15 = 429(0x1ad, float:6.01E-43)
            if (r14 == r15) goto L_0x0164
            r15 = 500(0x1f4, float:7.0E-43)
            if (r14 < r15) goto L_0x00e3
            r15 = 600(0x258, float:8.41E-43)
            if (r14 >= r15) goto L_0x00e3
            goto L_0x0176
        L_0x00e3:
            java.lang.String r14 = "Firebase-Installations"
            java.lang.String r15 = "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."
            android.util.Log.e(r14, r15)     // Catch:{ IOException | AssertionError -> 0x0176, all -> 0x016e }
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            g.e.b.r.m.d$a r21 = g.e.b.r.m.d.a.BAD_CONFIG     // Catch:{ IOException | AssertionError -> 0x0176, all -> 0x016e }
            g.e.b.r.m.a r14 = new g.e.b.r.m.a     // Catch:{ IOException | AssertionError -> 0x0176, all -> 0x016e }
            r22 = 0
            r16 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch:{ IOException | AssertionError -> 0x0176, all -> 0x016e }
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r2 = r14
        L_0x0104:
            g.e.b.r.m.a r2 = (g.e.b.r.m.a) r2
            g.e.b.r.m.d$a r3 = r2.f3753e
            int r3 = r3.ordinal()
            if (r3 == 0) goto L_0x012c
            if (r3 != r9) goto L_0x0124
            java.lang.String r0 = "BAD CONFIG"
            g.e.b.r.l.d$a r2 = r24.j()
            g.e.b.r.l.a$b r2 = (g.e.b.r.l.a.b) r2
            r2.f3747g = r0
            g.e.b.r.l.c$a r0 = g.e.b.r.l.c.a.REGISTER_ERROR
            r2.b(r0)
            g.e.b.r.l.d r0 = r2.a()
            return r0
        L_0x0124:
            com.google.firebase.installations.FirebaseInstallationsException r2 = new com.google.firebase.installations.FirebaseInstallationsException
            java.lang.String r3 = "Firebase Installations Service is unavailable. Please try again later."
            r2.<init>(r3, r0)
            throw r2
        L_0x012c:
            java.lang.String r0 = r2.b
            java.lang.String r3 = r2.c
            g.e.b.r.j r4 = r1.f3729d
            long r4 = r4.b()
            g.e.b.r.m.f r6 = r2.f3752d
            java.lang.String r6 = r6.c()
            g.e.b.r.m.f r2 = r2.f3752d
            long r7 = r2.d()
            g.e.b.r.l.d$a r2 = r24.j()
            g.e.b.r.l.a$b r2 = (g.e.b.r.l.a.b) r2
            r2.a = r0
            g.e.b.r.l.c$a r0 = g.e.b.r.l.c.a.REGISTERED
            r2.b(r0)
            r2.c = r6
            r2.f3744d = r3
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r2.f3745e = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r2.f3746f = r0
            g.e.b.r.l.d r0 = r2.a()
            return r0
        L_0x0164:
            com.google.firebase.installations.FirebaseInstallationsException r14 = new com.google.firebase.installations.FirebaseInstallationsException     // Catch:{ IOException | AssertionError -> 0x0176, all -> 0x016e }
            java.lang.String r15 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            com.google.firebase.installations.FirebaseInstallationsException$a r5 = com.google.firebase.installations.FirebaseInstallationsException.a.TOO_MANY_REQUESTS     // Catch:{ IOException | AssertionError -> 0x0176, all -> 0x016e }
            r14.<init>(r15, r5)     // Catch:{ IOException | AssertionError -> 0x0176, all -> 0x016e }
            throw r14     // Catch:{ IOException | AssertionError -> 0x0176, all -> 0x016e }
        L_0x016e:
            r0 = move-exception
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0176:
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            int r12 = r12 + 1
            r5 = 0
            goto L_0x0093
        L_0x0181:
            com.google.firebase.installations.FirebaseInstallationsException r2 = new com.google.firebase.installations.FirebaseInstallationsException
            r2.<init>(r10, r0)
            throw r2
        L_0x0187:
            com.google.firebase.installations.FirebaseInstallationsException r2 = new com.google.firebase.installations.FirebaseInstallationsException
            r2.<init>(r10, r0)
            goto L_0x018e
        L_0x018d:
            throw r2
        L_0x018e:
            goto L_0x018d
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.r.e.h(g.e.b.r.l.d):g.e.b.r.l.d");
    }

    public final void i(Exception exc) {
        synchronized (this.f3732g) {
            Iterator<i> it = this.f3737l.iterator();
            while (it.hasNext()) {
                if (it.next().a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void j(d dVar) {
        synchronized (this.f3732g) {
            Iterator<i> it = this.f3737l.iterator();
            while (it.hasNext()) {
                if (it.next().b(dVar)) {
                    it.remove();
                }
            }
        }
    }
}
