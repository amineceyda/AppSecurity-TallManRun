package g.e.a.b.e.c;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import e.d.a;
import e.d.f;
import e.d.g;
import g.e.a.b.b.h.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class g5 implements j5 {

    /* renamed from: g  reason: collision with root package name */
    public static final Map f2933g = new a();

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f2934h = {"key", "value"};
    public final ContentResolver a;
    public final Uri b;
    public final ContentObserver c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f2935d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public volatile Map f2936e;

    /* renamed from: f  reason: collision with root package name */
    public final List f2937f = new ArrayList();

    public g5(ContentResolver contentResolver, Uri uri) {
        f5 f5Var = new f5(this);
        this.c = f5Var;
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        this.a = contentResolver;
        this.b = uri;
        contentResolver.registerContentObserver(uri, false, f5Var);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|10)|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g.e.a.b.e.c.g5 b(android.content.ContentResolver r4, android.net.Uri r5) {
        /*
            java.lang.Class<g.e.a.b.e.c.g5> r0 = g.e.a.b.e.c.g5.class
            monitor-enter(r0)
            java.util.Map r1 = f2933g     // Catch:{ all -> 0x001b }
            r2 = r1
            e.d.g r2 = (e.d.g) r2     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ all -> 0x001b }
            g.e.a.b.e.c.g5 r2 = (g.e.a.b.e.c.g5) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x001e
            g.e.a.b.e.c.g5 r3 = new g.e.a.b.e.c.g5     // Catch:{ SecurityException -> 0x001e }
            r3.<init>(r4, r5)     // Catch:{ SecurityException -> 0x001e }
            e.d.g r1 = (e.d.g) r1     // Catch:{ SecurityException -> 0x001d }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x001d }
            goto L_0x001d
        L_0x001b:
            r4 = move-exception
            goto L_0x0020
        L_0x001d:
            r2 = r3
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return r2
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.g5.b(android.content.ContentResolver, android.net.Uri):g.e.a.b.e.c.g5");
    }

    public static synchronized void d() {
        synchronized (g5.class) {
            Iterator it = ((f.e) ((a) f2933g).values()).iterator();
            while (it.hasNext()) {
                g5 g5Var = (g5) it.next();
                g5Var.a.unregisterContentObserver(g5Var.c);
            }
            ((g) f2933g).clear();
        }
    }

    public final /* bridge */ /* synthetic */ Object a(String str) {
        return (String) c().get(str);
    }

    /* JADX INFO: finally extract failed */
    public final Map c() {
        Map map;
        Map map2 = this.f2936e;
        if (map2 == null) {
            synchronized (this.f2935d) {
                map2 = this.f2936e;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) e.w(new e5(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        try {
                            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                    this.f2936e = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }
}
