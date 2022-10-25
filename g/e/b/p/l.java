package g.e.b.p;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class l {
    public final SharedPreferences a;

    public l(Context context, String str) {
        this.a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        long j2 = this.a.getLong("fire-count", 0);
        String str = null;
        String str2 = "";
        for (Map.Entry next : this.a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String str3 : (Set) next.getValue()) {
                    if (str == null || str.compareTo(str3) > 0) {
                        str2 = (String) next.getKey();
                        str = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.a.getStringSet(str2, new HashSet()));
        hashSet.remove(str);
        this.a.edit().putStringSet(str2, hashSet).putLong("fire-count", j2 - 1).commit();
    }

    public synchronized void b() {
        SharedPreferences.Editor edit = this.a.edit();
        for (Map.Entry next : this.a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                edit.remove((String) next.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized java.util.List<g.e.b.p.m> c() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x005c }
            r0.<init>()     // Catch:{ all -> 0x005c }
            android.content.SharedPreferences r1 = r5.a     // Catch:{ all -> 0x005c }
            java.util.Map r1 = r1.getAll()     // Catch:{ all -> 0x005c }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x005c }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x005c }
        L_0x0014:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0042
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x005c }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x005c }
            java.lang.Object r3 = r2.getValue()     // Catch:{ all -> 0x005c }
            boolean r3 = r3 instanceof java.util.Set     // Catch:{ all -> 0x005c }
            if (r3 == 0) goto L_0x0014
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x005c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x005c }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x005c }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x005c }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x005c }
            r4.<init>(r2)     // Catch:{ all -> 0x005c }
            g.e.b.p.f r2 = new g.e.b.p.f     // Catch:{ all -> 0x005c }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x005c }
            r0.add(r2)     // Catch:{ all -> 0x005c }
            goto L_0x0014
        L_0x0042:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005c }
            monitor-enter(r5)     // Catch:{ all -> 0x005c }
            android.content.SharedPreferences r3 = r5.a     // Catch:{ all -> 0x0059 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x0059 }
            java.lang.String r4 = "fire-global"
            android.content.SharedPreferences$Editor r1 = r3.putLong(r4, r1)     // Catch:{ all -> 0x0059 }
            r1.commit()     // Catch:{ all -> 0x0059 }
            monitor-exit(r5)     // Catch:{ all -> 0x005c }
            monitor-exit(r5)
            return r0
        L_0x0059:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005c }
            throw r0     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            monitor-exit(r5)
            goto L_0x0060
        L_0x005f:
            throw r0
        L_0x0060:
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.p.l.c():java.util.List");
    }

    public final synchronized String d(long j2) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j2).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j2));
    }

    public synchronized void e(long j2, String str) {
        String d2 = d(j2);
        if (!this.a.getString("last-used-date", "").equals(d2)) {
            long j3 = this.a.getLong("fire-count", 0);
            if (j3 + 1 == 30) {
                a();
                j3 = this.a.getLong("fire-count", 0);
            }
            HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
            hashSet.add(d2);
            this.a.edit().putStringSet(str, hashSet).putLong("fire-count", j3 + 1).putString("last-used-date", d2).commit();
        }
    }
}
