package com.tencent.beacon.a.d;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import com.tencent.beacon.base.util.c;
import com.tencent.beacon.base.util.e;
import g.a.a.a.a;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class g {
    /* access modifiers changed from: private */
    public final Object a = new Object();
    /* access modifiers changed from: private */
    public FileChannel b;
    /* access modifiers changed from: private */
    public JSONObject c = new JSONObject();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public MappedByteBuffer f615d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public long f616e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f617f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f618g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f619h;

    private g(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.b = randomAccessFile.getChannel();
        this.f616e = randomAccessFile.length();
        StringBuilder i2 = a.i("file size: ");
        i2.append(this.f616e);
        c.a("[properties]", i2.toString(), new Object[0]);
        e();
    }

    public static g a(Context context, String str) throws IOException {
        File file = new File(context.getFilesDir(), "beacon");
        if (!(!file.exists() ? file.mkdirs() : true)) {
            StringBuilder i2 = a.i("mkdir ");
            i2.append(file.getName());
            i2.append(" exception!");
            e.a(i2.toString());
        }
        return new g(new File(file, a.w(str, "V1")));
    }

    /* access modifiers changed from: private */
    public void a(long j2) throws IOException {
        if (j2 <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) {
            this.f615d.rewind();
            this.f615d = this.b.map(FileChannel.MapMode.READ_WRITE, 0, j2);
            return;
        }
        throw new IllegalArgumentException("file size to reach maximum!");
    }

    private void a(Runnable runnable) {
        com.tencent.beacon.a.b.a.a().a((Runnable) new f(this, runnable));
    }

    private byte[] a(ByteBuffer byteBuffer) {
        int i2 = byteBuffer.getInt(0);
        if (i2 <= 1 || i2 > 2097152 || byteBuffer.capacity() <= 10) {
            return null;
        }
        byteBuffer.position(10);
        byte[] bArr = new byte[i2];
        byteBuffer.get(bArr, 0, i2);
        return bArr;
    }

    public static byte[] a(byte[] bArr) throws Exception {
        return com.tencent.beacon.base.net.b.c.b(3, "BEACONDEFAULTAES", bArr);
    }

    private static byte[] a(byte[] bArr, String str) {
        try {
            return com.tencent.beacon.base.net.b.c.a(3, str, bArr);
        } catch (Throwable th) {
            c.a(th);
            com.tencent.beacon.a.b.g e2 = com.tencent.beacon.a.b.g.e();
            e2.a("513", "unEncrypt error: key=" + str, th);
            return null;
        }
    }

    public static byte[] b(byte[] bArr) {
        byte[] a2 = a(bArr, "BEACONDEFAULTAES");
        if (a2 != null) {
            return a2;
        }
        com.tencent.beacon.a.b.g.e().a("517", "default aesKey unEncryption failed");
        byte[] a3 = a(bArr, com.tencent.beacon.a.c.g.e().a());
        return a3 != null ? a3 : a(bArr, "");
    }

    private Object c(String str) {
        Object obj = null;
        try {
            synchronized (this.a) {
                obj = this.c.get(str);
            }
        } catch (Exception unused) {
            c.a("[properties]", a.w("current jsonObject not exist key: ", str), new Object[0]);
        }
        return obj;
    }

    private boolean c() {
        if (!this.f618g) {
            return false;
        }
        c.a("[properties]", "File is close!", new Object[0]);
        return true;
    }

    private Runnable d() {
        if (this.f617f == null) {
            this.f617f = new e(this);
        }
        return this.f617f;
    }

    private void e() throws IOException {
        if (this.f616e <= 10) {
            this.f619h = true;
            this.f616e = 4;
        }
        MappedByteBuffer map = this.b.map(FileChannel.MapMode.READ_WRITE, 0, this.f616e);
        this.f615d = map;
        map.rewind();
        if (this.f619h) {
            this.f615d.putInt(0, 1);
            a(d());
            return;
        }
        byte[] a2 = a((ByteBuffer) this.f615d);
        if (a2 != null) {
            try {
                this.c = new JSONObject(new String(b(a2), "ISO8859-1"));
            } catch (Exception e2) {
                StringBuilder i2 = a.i("init error");
                i2.append(e2.getMessage());
                c.a("[properties]", i2.toString(), new Object[0]);
                com.tencent.beacon.a.b.g e3 = com.tencent.beacon.a.b.g.e();
                StringBuilder i3 = a.i("[properties] init error! msg: ");
                i3.append(e2.getMessage());
                i3.append(". file size: ");
                i3.append(this.f616e);
                e3.a("504", i3.toString(), e2);
            }
            StringBuilder i4 = a.i("init json: ");
            i4.append(this.c.toString());
            c.a("[properties]", i4.toString(), new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T> T a(java.lang.String r2, T r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.c()     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r1)
            return r3
        L_0x0009:
            java.lang.Object r2 = r1.c((java.lang.String) r2)     // Catch:{ all -> 0x0013 }
            if (r2 != 0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r3 = r2
        L_0x0011:
            monitor-exit(r1)
            return r3
        L_0x0013:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.a.d.g.a(java.lang.String, java.lang.Object):java.lang.Object");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized <T> java.util.Set<T> a(java.lang.String r4, java.util.Set<T> r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.c()     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r3)
            return r5
        L_0x0009:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ JSONException -> 0x003e }
            r0.<init>()     // Catch:{ JSONException -> 0x003e }
            java.lang.Object r1 = r3.a     // Catch:{ JSONException -> 0x003e }
            monitor-enter(r1)     // Catch:{ JSONException -> 0x003e }
            org.json.JSONObject r2 = r3.c     // Catch:{ all -> 0x003b }
            org.json.JSONObject r4 = r2.getJSONObject(r4)     // Catch:{ all -> 0x003b }
            monitor-exit(r1)     // Catch:{ all -> 0x003b }
            if (r4 == 0) goto L_0x0032
            java.util.Iterator r1 = r4.keys()     // Catch:{ JSONException -> 0x003e }
        L_0x001e:
            boolean r2 = r1.hasNext()     // Catch:{ JSONException -> 0x003e }
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r1.next()     // Catch:{ JSONException -> 0x003e }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ JSONException -> 0x003e }
            java.lang.Object r2 = r4.get(r2)     // Catch:{ JSONException -> 0x003e }
            r0.add(r2)     // Catch:{ JSONException -> 0x003e }
            goto L_0x001e
        L_0x0032:
            boolean r4 = r0.isEmpty()     // Catch:{ JSONException -> 0x003e }
            if (r4 == 0) goto L_0x0039
            goto L_0x0065
        L_0x0039:
            r5 = r0
            goto L_0x0065
        L_0x003b:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003b }
            throw r4     // Catch:{ JSONException -> 0x003e }
        L_0x003e:
            r4 = move-exception
            com.tencent.beacon.a.b.g r0 = com.tencent.beacon.a.b.g.e()     // Catch:{ all -> 0x0067 }
            java.lang.String r1 = "504"
            java.lang.String r2 = "[properties] JSON getSet error!"
            r0.a(r1, r2, r4)     // Catch:{ all -> 0x0067 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0067 }
            r0.<init>()     // Catch:{ all -> 0x0067 }
            java.lang.String r1 = "[properties] JSON get error!"
            r0.append(r1)     // Catch:{ all -> 0x0067 }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x0067 }
            r0.append(r4)     // Catch:{ all -> 0x0067 }
            java.lang.String r4 = r0.toString()     // Catch:{ all -> 0x0067 }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0067 }
            com.tencent.beacon.base.util.c.b(r4, r0)     // Catch:{ all -> 0x0067 }
        L_0x0065:
            monitor-exit(r3)
            return r5
        L_0x0067:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x006b
        L_0x006a:
            throw r4
        L_0x006b:
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.a.d.g.a(java.lang.String, java.util.Set):java.util.Set");
    }

    public synchronized void a() {
        this.c = new JSONObject();
        a(d());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            org.json.JSONObject r1 = r3.c     // Catch:{ all -> 0x0021 }
            java.util.Iterator r1 = r1.keys()     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x001e
        L_0x000b:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0021 }
            if (r2 == 0) goto L_0x001e
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0021 }
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0021 }
            if (r2 == 0) goto L_0x000b
            r4 = 1
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return r4
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            r4 = 0
            return r4
        L_0x0021:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            goto L_0x0025
        L_0x0024:
            throw r4
        L_0x0025:
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.a.d.g.a(java.lang.String):boolean");
    }

    public Map<String, ?> b() {
        synchronized (this.a) {
            JSONObject jSONObject = this.c;
            if (jSONObject == null) {
                return null;
            }
            Iterator<String> keys = jSONObject.keys();
            HashMap hashMap = new HashMap();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    hashMap.put(next, this.c.get(next));
                } catch (JSONException e2) {
                    c.a((Throwable) e2);
                }
            }
            return hashMap;
        }
    }

    public synchronized void b(String str) {
        synchronized (this.a) {
            this.c.remove(str);
        }
        a(d());
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void b(java.lang.String r4, java.lang.Object r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.c()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r3)
            return
        L_0x0009:
            r0 = 0
            java.lang.Object r1 = r3.c((java.lang.String) r4)     // Catch:{ Exception -> 0x004d }
            if (r1 == 0) goto L_0x0018
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x004d }
            if (r1 == 0) goto L_0x0018
            monitor-exit(r3)
            return
        L_0x0018:
            boolean r1 = r5 instanceof java.lang.String     // Catch:{ Exception -> 0x004d }
            if (r1 == 0) goto L_0x0039
            r1 = r5
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x004d }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x004d }
            if (r1 == 0) goto L_0x0027
            monitor-exit(r3)
            return
        L_0x0027:
            r1 = r5
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x004d }
            boolean r1 = com.tencent.beacon.base.util.f.a(r1)     // Catch:{ Exception -> 0x004d }
            if (r1 != 0) goto L_0x0039
            java.lang.String r4 = "[properties] JSON put value not english ! !"
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x004d }
            com.tencent.beacon.base.util.c.b(r4, r5)     // Catch:{ Exception -> 0x004d }
            monitor-exit(r3)
            return
        L_0x0039:
            java.lang.Object r1 = r3.a     // Catch:{ Exception -> 0x004d }
            monitor-enter(r1)     // Catch:{ Exception -> 0x004d }
            org.json.JSONObject r2 = r3.c     // Catch:{ all -> 0x004a }
            r2.put(r4, r5)     // Catch:{ all -> 0x004a }
            monitor-exit(r1)     // Catch:{ all -> 0x004a }
            java.lang.Runnable r4 = r3.d()     // Catch:{ Exception -> 0x004d }
            r3.a((java.lang.Runnable) r4)     // Catch:{ Exception -> 0x004d }
            goto L_0x0073
        L_0x004a:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004a }
            throw r4     // Catch:{ Exception -> 0x004d }
        L_0x004d:
            r4 = move-exception
            com.tencent.beacon.a.b.g r5 = com.tencent.beacon.a.b.g.e()     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = "504"
            java.lang.String r2 = "[properties] JSON put error!"
            r5.a(r1, r2, r4)     // Catch:{ all -> 0x0075 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r5.<init>()     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = "[properties] JSON put error!"
            r5.append(r1)     // Catch:{ all -> 0x0075 }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x0075 }
            r5.append(r4)     // Catch:{ all -> 0x0075 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0075 }
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x0075 }
            com.tencent.beacon.base.util.c.b(r4, r5)     // Catch:{ all -> 0x0075 }
        L_0x0073:
            monitor-exit(r3)
            return
        L_0x0075:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.a.d.g.b(java.lang.String, java.lang.Object):void");
    }

    public synchronized <T> void b(String str, Set<T> set) {
        if (!c()) {
            try {
                JSONObject jSONObject = new JSONObject();
                Iterator<T> it = set.iterator();
                for (int i2 = 0; i2 < set.size(); i2++) {
                    if (it.hasNext()) {
                        jSONObject.put(String.valueOf(i2), it.next());
                    }
                }
                b(str, (Object) jSONObject);
            } catch (JSONException e2) {
                c.a((Throwable) e2);
                com.tencent.beacon.a.b.g.e().a("504", "[properties] JSON put set error!", e2);
            }
        } else {
            return;
        }
        return;
    }
}
