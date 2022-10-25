package com.tencent.beacon.a.d;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.beacon.a.c.c;
import com.tencent.beacon.base.util.e;
import java.util.Map;
import java.util.Set;

public class a implements SharedPreferences {
    private static volatile a a;
    private boolean b;
    private g c;

    /* renamed from: d  reason: collision with root package name */
    private C0005a f613d;

    /* renamed from: e  reason: collision with root package name */
    private SharedPreferences f614e;

    /* renamed from: com.tencent.beacon.a.d.a$a  reason: collision with other inner class name */
    public static class C0005a implements SharedPreferences.Editor {
        private g a;

        public C0005a(g gVar) {
            this.a = gVar;
        }

        public void apply() {
        }

        public SharedPreferences.Editor clear() {
            this.a.a();
            return this;
        }

        public boolean commit() {
            return true;
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.a.b(str, (Object) Boolean.valueOf(z));
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f2) {
            this.a.b(str, (Object) Float.valueOf(f2));
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i2) {
            this.a.b(str, (Object) Integer.valueOf(i2));
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j2) {
            this.a.b(str, (Object) Long.valueOf(j2));
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            this.a.b(str, (Object) str2);
            return this;
        }

        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            this.a.b(str, set);
            return this;
        }

        public SharedPreferences.Editor remove(String str) {
            this.a.b(str);
            return this;
        }
    }

    private a() {
    }

    public static a a() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        return a;
    }

    private <T> Object a(String str, T t) {
        if (!this.b) {
            return t;
        }
        T a2 = this.c.a(str, t);
        if (a2 == null || a2 == t) {
            Context c2 = c.d().c();
            if (this.f614e == null) {
                this.f614e = c2.getSharedPreferences("DENGTA_META", 0);
            }
            if (t instanceof Boolean) {
                a2 = Boolean.valueOf(this.f614e.getBoolean(str, ((Boolean) t).booleanValue()));
            } else if (t instanceof String) {
                a2 = this.f614e.getString(str, (String) t);
            } else if (t instanceof Integer) {
                a2 = Integer.valueOf(this.f614e.getInt(str, ((Integer) t).intValue()));
            } else if (t instanceof Long) {
                a2 = Long.valueOf(this.f614e.getLong(str, ((Long) t).longValue()));
            } else if (t instanceof Float) {
                a2 = Float.valueOf(this.f614e.getFloat(str, ((Float) t).floatValue()));
            }
            if (!(a2 == null || a2 == t)) {
                this.c.b(str, (Object) a2);
            }
        }
        return a2 == null ? t : a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(android.content.Context r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.b     // Catch:{ all -> 0x004e }
            if (r0 != 0) goto L_0x004c
            if (r4 != 0) goto L_0x0008
            goto L_0x004c
        L_0x0008:
            java.lang.String r0 = com.tencent.beacon.a.c.b.c(r4)     // Catch:{ IOException -> 0x0038 }
            java.lang.String r1 = r4.getPackageName()     // Catch:{ IOException -> 0x0038 }
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)     // Catch:{ IOException -> 0x0038 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0038 }
            r1.<init>()     // Catch:{ IOException -> 0x0038 }
            java.lang.String r2 = "prop_"
            r1.append(r2)     // Catch:{ IOException -> 0x0038 }
            r1.append(r0)     // Catch:{ IOException -> 0x0038 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0038 }
            com.tencent.beacon.a.d.g r4 = com.tencent.beacon.a.d.g.a((android.content.Context) r4, (java.lang.String) r0)     // Catch:{ IOException -> 0x0038 }
            r3.c = r4     // Catch:{ IOException -> 0x0038 }
            com.tencent.beacon.a.d.a$a r0 = new com.tencent.beacon.a.d.a$a     // Catch:{ IOException -> 0x0038 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0038 }
            r3.f613d = r0     // Catch:{ IOException -> 0x0038 }
            r4 = 1
            r3.b = r4     // Catch:{ IOException -> 0x0038 }
            goto L_0x004a
        L_0x0038:
            r4 = move-exception
            com.tencent.beacon.base.util.c.a((java.lang.Throwable) r4)     // Catch:{ all -> 0x004e }
            com.tencent.beacon.a.b.g r0 = com.tencent.beacon.a.b.g.e()     // Catch:{ all -> 0x004e }
            java.lang.String r1 = "504"
            java.lang.String r2 = "[properties] PropertiesFile create error!"
            r0.a(r1, r2, r4)     // Catch:{ all -> 0x004e }
            r4 = 0
            r3.b = r4     // Catch:{ all -> 0x004e }
        L_0x004a:
            monitor-exit(r3)
            return
        L_0x004c:
            monitor-exit(r3)
            return
        L_0x004e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.a.d.a.a(android.content.Context):void");
    }

    public boolean contains(String str) {
        return this.c.a(str);
    }

    public C0005a edit() {
        if (!this.b) {
            e.a("BeaconProperties has not init!");
            a(c.d().c());
        }
        return this.f613d;
    }

    public Map<String, ?> getAll() {
        return this.c.b();
    }

    public boolean getBoolean(String str, boolean z) {
        Object a2 = a(str, Boolean.valueOf(z));
        return a2 instanceof Boolean ? ((Boolean) a2).booleanValue() : z;
    }

    public float getFloat(String str, float f2) {
        Object a2 = a(str, Float.valueOf(f2));
        return a2 instanceof Number ? ((Number) a2).floatValue() : f2;
    }

    public int getInt(String str, int i2) {
        Object a2 = a(str, Integer.valueOf(i2));
        return a2 instanceof Number ? ((Number) a2).intValue() : i2;
    }

    public long getLong(String str, long j2) {
        Object a2 = a(str, Long.valueOf(j2));
        return a2 instanceof Number ? ((Number) a2).longValue() : j2;
    }

    public String getString(String str, String str2) {
        Object a2 = a(str, str2);
        return a2 instanceof String ? (String) a2 : str2;
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        return !this.b ? set : this.c.a(str, set);
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }
}
