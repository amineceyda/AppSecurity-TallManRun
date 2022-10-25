package com.tencent.qmsp.sdk.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.tencent.beacon.base.net.adapter.AbstractNetAdapter;
import com.tencent.beacon.pack.AbstractJceStruct;
import com.tencent.qmsp.sdk.a.d;
import com.tencent.qmsp.sdk.a.f;
import com.tencent.qmsp.sdk.b.e;
import com.tencent.qmsp.sdk.f.h;
import com.tencent.trpcprotocol.projecta.vl_recall_app_detail.vl_recall_app_detail.nano.vlRecallAppDetail;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public class g {

    /* renamed from: f  reason: collision with root package name */
    private static final byte[] f812f = {51, 117, -95};

    /* renamed from: g  reason: collision with root package name */
    private static final byte[] f813g = {38, 114, -96};

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f814h = {20, 125, -96, 80, AbstractJceStruct.SIMPLE_LIST, 57, 57, -7, 36, 100};

    /* renamed from: i  reason: collision with root package name */
    private static final byte[] f815i = {20, 125, -96, 80, AbstractJceStruct.SIMPLE_LIST, 57, 91, -20, 49};

    /* renamed from: j  reason: collision with root package name */
    private static final byte[] f816j = {52, 100};

    /* renamed from: k  reason: collision with root package name */
    private static final byte[] f817k = {20, 125, -96, 80, 96, 24, 117};

    /* renamed from: l  reason: collision with root package name */
    private static final byte[][] f818l = {new byte[]{54, 100}, new byte[]{49, 99, -70}, new byte[]{54, 115}};

    /* renamed from: m  reason: collision with root package name */
    private static g f819m;
    private ConcurrentHashMap<Integer, Integer> a = new ConcurrentHashMap<>();
    private CopyOnWriteArrayList<c> b = new CopyOnWriteArrayList<>();
    private SharedPreferences c = null;

    /* renamed from: d  reason: collision with root package name */
    private long f820d = ((long) com.tencent.qmsp.sdk.app.a.getAtomCbTimeout().get());

    /* renamed from: e  reason: collision with root package name */
    private int f821e = 0;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            g.this.a(false);
        }
    }

    public class b implements e {
        public b() {
        }

        public void a(int i2, JSONObject jSONObject) {
            if (i2 == 161 && jSONObject != null) {
                g.this.a(jSONObject);
            }
        }
    }

    public interface c {
        void a(List<Pair<Integer, Integer>> list);
    }

    private g() {
        Context context = com.tencent.qmsp.sdk.app.a.getContext();
        this.c = context.getSharedPreferences(b.a + a(f815i), 0);
        b();
    }

    private int a(int i2, int i3) {
        return a((Pair<Integer, Integer>) new Pair(Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    private int a(Pair<Integer, Integer> pair) {
        if (pair == null) {
            return -1;
        }
        switch (((Integer) pair.first).intValue()) {
            case AbstractNetAdapter.READ_TIMEOUT:
                if (com.tencent.qmsp.sdk.app.a.getAtomConnTimeOut().get() != ((Integer) pair.second).intValue() && ((Integer) pair.second).intValue() > 5000) {
                    com.tencent.qmsp.sdk.app.a.getAtomConnTimeOut().set(((Integer) pair.second).intValue());
                    String a2 = a(f817k);
                    StringBuilder i2 = g.a.a.a.a.i("[CB-CYC] Socket Conn TimeOut: ");
                    i2.append(com.tencent.qmsp.sdk.app.a.getAtomConnTimeOut().get());
                    com.tencent.qmsp.sdk.f.g.a(a2, 1, i2.toString());
                }
                return 0;
            case 10001:
                if (com.tencent.qmsp.sdk.app.a.getAtomReadTimeOut().get() != ((Integer) pair.second).intValue() && ((Integer) pair.second).intValue() > 5000) {
                    com.tencent.qmsp.sdk.app.a.getAtomReadTimeOut().set(((Integer) pair.second).intValue());
                    String a3 = a(f817k);
                    StringBuilder i3 = g.a.a.a.a.i("[CB-CYC] Socket Read TimeOut: ");
                    i3.append(com.tencent.qmsp.sdk.app.a.getAtomReadTimeOut().get());
                    com.tencent.qmsp.sdk.f.g.a(a3, 1, i3.toString());
                }
                return 0;
            case 10002:
                if (com.tencent.qmsp.sdk.app.a.getAtomCbTimeout().get() != ((Integer) pair.second).intValue() && ((Integer) pair.second).intValue() > 3600000) {
                    com.tencent.qmsp.sdk.app.a.getAtomCbTimeout().set(((Integer) pair.second).intValue());
                    String a4 = a(f817k);
                    StringBuilder i4 = g.a.a.a.a.i("[CB-CYC] CB Ruery TimeOut : ");
                    i4.append(com.tencent.qmsp.sdk.app.a.getAtomCbTimeout().get());
                    com.tencent.qmsp.sdk.f.g.a(a4, 1, i4.toString());
                }
                return 0;
            case 10003:
                if (com.tencent.qmsp.sdk.app.a.getAtomUpdateInterval().get() != ((Integer) pair.second).intValue() && ((Integer) pair.second).intValue() > 3600000) {
                    com.tencent.qmsp.sdk.app.a.getAtomUpdateInterval().set(((Integer) pair.second).intValue());
                    String a5 = a(f817k);
                    StringBuilder i5 = g.a.a.a.a.i("[CB-CYC] Plugin Ruery TimeOut : ");
                    i5.append(com.tencent.qmsp.sdk.app.a.getAtomUpdateInterval().get());
                    com.tencent.qmsp.sdk.f.g.a(a5, 1, i5.toString());
                }
                return 0;
            default:
                return -1;
        }
    }

    private Pair<Integer, Integer> a(String str, JSONObject jSONObject) {
        try {
            return new Pair<>(Integer.valueOf(Integer.parseInt(str)), Integer.valueOf(jSONObject.getInt(str)));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private String a(byte[] bArr) {
        return h.a(bArr);
    }

    private void a(int i2, int i3, int i4) {
        com.tencent.qmsp.sdk.f.g.a(a(f817k), 1, String.format("[CB] report: funType=%d, result=%d,  NowTaskID=%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
        com.tencent.qmsp.sdk.a.g gVar = new com.tencent.qmsp.sdk.a.g();
        try {
            gVar.a(i2).a(i3).a(i4);
            f.a(gVar.toString(), 1);
        } catch (Exception e2) {
            e2.printStackTrace();
            com.tencent.qmsp.sdk.f.g.b(com.tencent.qmsp.sdk.f.g.a, 0, "onReport error!");
        }
    }

    private void a(long j2) {
        f.i().c().postDelayed(new a(), j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        if (r3.byteValue() != ((java.lang.Integer) r2.second).intValue()) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r6) {
        /*
            r5 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0067 }
            r1.<init>(r6)     // Catch:{ Exception -> 0x0067 }
            byte[] r6 = f812f     // Catch:{ Exception -> 0x0067 }
            java.lang.String r6 = r5.a((byte[]) r6)     // Catch:{ Exception -> 0x0067 }
            int r6 = r1.getInt(r6)     // Catch:{ Exception -> 0x0067 }
            r2 = 1
            if (r6 == r2) goto L_0x0018
            return
        L_0x0018:
            byte[] r6 = f813g     // Catch:{ Exception -> 0x0067 }
            java.lang.String r6 = r5.a((byte[]) r6)     // Catch:{ Exception -> 0x0067 }
            org.json.JSONObject r6 = r1.getJSONObject(r6)     // Catch:{ Exception -> 0x0067 }
            if (r6 == 0) goto L_0x0073
            java.util.Iterator r1 = r6.keys()     // Catch:{ Exception -> 0x0067 }
            if (r1 == 0) goto L_0x0073
        L_0x002a:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0067 }
            if (r2 == 0) goto L_0x0073
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0067 }
            android.util.Pair r2 = r5.a((java.lang.String) r2, (org.json.JSONObject) r6)     // Catch:{ Exception -> 0x0067 }
            if (r2 == 0) goto L_0x002a
            r5.a((android.util.Pair<java.lang.Integer, java.lang.Integer>) r2)     // Catch:{ Exception -> 0x0067 }
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> r3 = r5.a     // Catch:{ Exception -> 0x0067 }
            java.lang.Object r4 = r2.first     // Catch:{ Exception -> 0x0067 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x0067 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x0067 }
            if (r3 != 0) goto L_0x004c
            goto L_0x005a
        L_0x004c:
            byte r3 = r3.byteValue()     // Catch:{ Exception -> 0x0067 }
            java.lang.Object r4 = r2.second     // Catch:{ Exception -> 0x0067 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x0067 }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x0067 }
            if (r3 == r4) goto L_0x005d
        L_0x005a:
            r0.add(r2)     // Catch:{ Exception -> 0x0067 }
        L_0x005d:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> r3 = r5.a     // Catch:{ Exception -> 0x0067 }
            java.lang.Object r4 = r2.first     // Catch:{ Exception -> 0x0067 }
            java.lang.Object r2 = r2.second     // Catch:{ Exception -> 0x0067 }
            r3.put(r4, r2)     // Catch:{ Exception -> 0x0067 }
            goto L_0x002a
        L_0x0067:
            r6 = move-exception
            int r1 = r5.f821e
            r2 = 1002(0x3ea, float:1.404E-42)
            r3 = -1
            r5.a(r2, r3, r1)
            r6.printStackTrace()
        L_0x0073:
            r5.g()
            boolean r6 = r0.isEmpty()
            if (r6 != 0) goto L_0x0092
            java.util.concurrent.CopyOnWriteArrayList<com.tencent.qmsp.sdk.c.g$c> r6 = r5.b
            java.util.Iterator r6 = r6.iterator()
        L_0x0082:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0092
            java.lang.Object r1 = r6.next()
            com.tencent.qmsp.sdk.c.g$c r1 = (com.tencent.qmsp.sdk.c.g.c) r1
            r1.a(r0)
            goto L_0x0082
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.c.g.a(java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("cb-->Result: ");
            sb.append(jSONObject);
            com.tencent.qmsp.sdk.f.g.a("Task: ", 0, sb.toString());
            int i2 = -1;
            byte[][] bArr = f818l;
            if (!jSONObject.isNull(a(bArr[0])) && !jSONObject.isNull(a(bArr[1])) && !jSONObject.isNull(a(bArr[2]))) {
                i2 = jSONObject.optInt(a(bArr[0]));
                this.f821e = Integer.valueOf(jSONObject.optString(a(bArr[1]))).intValue();
                String optString = jSONObject.optString(a(bArr[2]));
                if (i2 == 0 && optString != null) {
                    if (!optString.equals("")) {
                        a(optString);
                    }
                }
            }
            a(vlRecallAppDetail.AppNotFound, i2, this.f821e);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0044 A[SYNTHETIC, Splitter:B:22:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(byte[] r4) {
        /*
            r3 = this;
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0032 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0032 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0032 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0032 }
        L_0x000b:
            int r4 = r1.available()     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            if (r4 == 0) goto L_0x0039
            int r4 = r1.readInt()     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            int r0 = r1.readInt()     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            r3.a((int) r4, (int) r0)     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> r2 = r3.a     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            r2.put(r4, r0)     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            goto L_0x000b
        L_0x002a:
            r4 = move-exception
            r0 = r1
            goto L_0x0042
        L_0x002d:
            r4 = move-exception
            r0 = r1
            goto L_0x0033
        L_0x0030:
            r4 = move-exception
            goto L_0x0042
        L_0x0032:
            r4 = move-exception
        L_0x0033:
            r4.printStackTrace()     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x0041
            r1 = r0
        L_0x0039:
            r1.close()     // Catch:{ IOException -> 0x003d }
            goto L_0x0041
        L_0x003d:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0041:
            return
        L_0x0042:
            if (r0 == 0) goto L_0x004c
            r0.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x004c
        L_0x0048:
            r0 = move-exception
            r0.printStackTrace()
        L_0x004c:
            goto L_0x004e
        L_0x004d:
            throw r4
        L_0x004e:
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.c.g.b(byte[]):void");
    }

    private JSONObject c() {
        try {
            SharedPreferences.Editor edit = this.c.edit();
            edit.putLong(a(f816j), System.currentTimeMillis());
            edit.commit();
            JSONObject jSONObject = new JSONObject();
            JSONObject a2 = d.a(1);
            if (a2 == null) {
                com.tencent.qmsp.sdk.f.g.d(a(f817k), 0, "make query head Fail!");
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.tencent.qmsp.sdk.a.e.a(20), 1);
            jSONObject2.put(com.tencent.qmsp.sdk.a.e.a(21), 512);
            jSONObject.put(com.tencent.qmsp.sdk.a.e.a(15), a2);
            jSONObject.put(com.tencent.qmsp.sdk.a.e.a(16), jSONObject2);
            return jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static g d() {
        if (f819m == null) {
            synchronized (g.class) {
                if (f819m == null) {
                    f819m = new g();
                }
            }
        }
        return f819m;
    }

    private String e() {
        return com.tencent.qmsp.sdk.a.b.a() + File.separator + a(f814h);
    }

    private boolean f() {
        try {
            this.f820d = (long) com.tencent.qmsp.sdk.app.a.getAtomCbTimeout().get();
            long j2 = 0;
            long currentTimeMillis = System.currentTimeMillis() - this.c.getLong(a(f816j), 0);
            if (currentTimeMillis >= 0) {
                j2 = currentTimeMillis;
            }
            if (j2 >= ((long) com.tencent.qmsp.sdk.app.a.getAtomCbTimeout().get())) {
                return true;
            }
            this.f820d -= j2;
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return true;
        }
    }

    private void g() {
        byte[] h2 = h();
        if (h2 != null) {
            new m().a(e(), h2, (String) null, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069 A[SYNTHETIC, Splitter:B:32:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0073 A[SYNTHETIC, Splitter:B:37:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0082 A[SYNTHETIC, Splitter:B:45:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008c A[SYNTHETIC, Splitter:B:50:0x008c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] h() {
        /*
            r7 = this;
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0060, all -> 0x005d }
            r1.<init>()     // Catch:{ IOException -> 0x0060, all -> 0x005d }
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0059, all -> 0x0053 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0059, all -> 0x0053 }
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> r3 = r7.a     // Catch:{ IOException -> 0x0051 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ IOException -> 0x0051 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x0051 }
        L_0x0015:
            boolean r4 = r3.hasNext()     // Catch:{ IOException -> 0x0051 }
            if (r4 == 0) goto L_0x003c
            java.lang.Object r4 = r3.next()     // Catch:{ IOException -> 0x0051 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ IOException -> 0x0051 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ IOException -> 0x0051 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ IOException -> 0x0051 }
            int r5 = r5.intValue()     // Catch:{ IOException -> 0x0051 }
            r2.writeInt(r5)     // Catch:{ IOException -> 0x0051 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ IOException -> 0x0051 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ IOException -> 0x0051 }
            int r4 = r4.intValue()     // Catch:{ IOException -> 0x0051 }
            r2.writeInt(r4)     // Catch:{ IOException -> 0x0051 }
            goto L_0x0015
        L_0x003c:
            byte[] r0 = r1.toByteArray()     // Catch:{ IOException -> 0x0051 }
            r1.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0048:
            r2.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x0050
        L_0x004c:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0050:
            return r0
        L_0x0051:
            r3 = move-exception
            goto L_0x0064
        L_0x0053:
            r2 = move-exception
            r6 = r2
            r2 = r0
            r0 = r1
            r1 = r6
            goto L_0x0080
        L_0x0059:
            r2 = move-exception
            r3 = r2
            r2 = r0
            goto L_0x0064
        L_0x005d:
            r1 = move-exception
            r2 = r0
            goto L_0x0080
        L_0x0060:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r2 = r1
        L_0x0064:
            r3.printStackTrace()     // Catch:{ all -> 0x007c }
            if (r1 == 0) goto L_0x0071
            r1.close()     // Catch:{ IOException -> 0x006d }
            goto L_0x0071
        L_0x006d:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0071:
            if (r2 == 0) goto L_0x007b
            r2.close()     // Catch:{ IOException -> 0x0077 }
            goto L_0x007b
        L_0x0077:
            r1 = move-exception
            r1.printStackTrace()
        L_0x007b:
            return r0
        L_0x007c:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L_0x0080:
            if (r0 == 0) goto L_0x008a
            r0.close()     // Catch:{ IOException -> 0x0086 }
            goto L_0x008a
        L_0x0086:
            r0 = move-exception
            r0.printStackTrace()
        L_0x008a:
            if (r2 == 0) goto L_0x0094
            r2.close()     // Catch:{ IOException -> 0x0090 }
            goto L_0x0094
        L_0x0090:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0094:
            goto L_0x0096
        L_0x0095:
            throw r1
        L_0x0096:
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.c.g.h():byte[]");
    }

    private void i() {
        try {
            a(1003, 0, this.f821e);
            JSONObject c2 = c();
            String a2 = a(f817k);
            StringBuilder sb = new StringBuilder();
            sb.append("CB: ");
            sb.append(c2.toString());
            com.tencent.qmsp.sdk.f.g.d(a2, 0, sb.toString());
            com.tencent.qmsp.sdk.b.g.b().a(1, com.tencent.qmsp.sdk.app.a.getAppID(), 1, c2, new b());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public int a(int i2) {
        Integer num = this.a.get(Integer.valueOf(i2));
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public void a() {
        if (f819m != null) {
            f819m = null;
        }
    }

    public void a(c cVar) {
        this.b.add(cVar);
    }

    public void a(boolean z) {
        String str;
        StringBuilder sb;
        if (!com.tencent.qmsp.sdk.app.a.getTaskStatus()) {
            com.tencent.qmsp.sdk.f.g.a(a(f817k), 1, "cb Task Finish！");
            return;
        }
        try {
            byte[] bArr = f817k;
            com.tencent.qmsp.sdk.f.g.a(a(bArr), 1, "Start to query cb!");
            if (!z) {
                if (!f()) {
                    com.tencent.qmsp.sdk.f.g.a(a(bArr), 1, "time has not arrived!");
                } else {
                    i();
                }
            }
            str = a(bArr);
            sb = new StringBuilder();
        } catch (Throwable th) {
            String a2 = a(f817k);
            StringBuilder i2 = g.a.a.a.a.i("next time: ");
            i2.append(this.f820d);
            com.tencent.qmsp.sdk.f.g.a(a2, 0, i2.toString());
            a(this.f820d);
            throw th;
        }
        sb.append("next time: ");
        sb.append(this.f820d);
        com.tencent.qmsp.sdk.f.g.a(str, 0, sb.toString());
        a(this.f820d);
    }

    public void b() {
        byte[] a2 = new m().a(e(), (String) null, 1);
        if (a2 != null) {
            b(a2);
        }
    }
}
