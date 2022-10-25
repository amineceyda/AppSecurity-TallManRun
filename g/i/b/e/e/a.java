package g.i.b.e.e;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.beacon.base.net.adapter.AbstractNetAdapter;
import com.tencent.raft.measure.report.ATTAReporter;
import g.i.b.e.b.k;
import g.i.b.e.e.b;
import g.i.b.e.e.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class a {
    public static int r = 20;
    public final String a = "halley-cloud-HalleyAction";
    public AtomicInteger b = new AtomicInteger(0);
    public Handler c;

    /* renamed from: d  reason: collision with root package name */
    public b f4157d;

    /* renamed from: e  reason: collision with root package name */
    public AtomicInteger f4158e = new AtomicInteger(0);

    /* renamed from: f  reason: collision with root package name */
    public List<String> f4159f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f4160g = false;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f4161h = false;

    /* renamed from: i  reason: collision with root package name */
    public AtomicInteger f4162i = new AtomicInteger(0);

    /* renamed from: j  reason: collision with root package name */
    public int f4163j;

    /* renamed from: k  reason: collision with root package name */
    public int f4164k = 0;

    /* renamed from: l  reason: collision with root package name */
    public long f4165l = 0;

    /* renamed from: m  reason: collision with root package name */
    public AtomicInteger f4166m = new AtomicInteger(0);
    public volatile boolean n = false;
    public final Runnable o = new C0149a();
    public final Runnable p = new b();
    public b.a q = new c();

    /* renamed from: g.i.b.e.e.a$a  reason: collision with other inner class name */
    public class C0149a implements Runnable {
        public C0149a() {
        }

        public final void run() {
            if (a.this.f4159f.size() == 0) {
                a.this.f4166m.incrementAndGet();
                String str = a.this.a;
                g.i.b.e.h.b.f(str, "trigger incrementAndGet()...mRealTimerMissNum:" + a.this.f4166m.get());
                a.this.b(false, true);
                return;
            }
            g.i.b.e.h.b.c(a.this.a, "trigger report in real timer...");
            a.a(a.this, true, true);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            g.i.b.e.h.b.c(a.this.a, "trigger reportTimer...");
            a.a(a.this, false, true);
        }
    }

    public class c implements b.a {
        public c() {
        }
    }

    public abstract class d implements Runnable {
        public d(byte b2) {
        }

        public final void a(boolean z) {
            if (!z) {
                a.this.c.post(this);
            } else if (!a.this.c.postAtFrontOfQueue(this)) {
                a.this.c.post(this);
            }
        }
    }

    public final class e extends d {
        public String c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4167d;

        public e(String str, boolean z) {
            super((byte) 0);
            this.c = str;
            this.f4167d = z;
        }

        public final void run() {
            a.this.f4162i.decrementAndGet();
            if (!TextUtils.isEmpty(this.c)) {
                Objects.requireNonNull(a.this);
                int b = g.h.a.a.b("report_new_record_num", 1, 50, 10);
                if (!this.f4167d) {
                    String str = a.this.a;
                    g.i.b.e.h.b.a(str, "try insert HalleyAction Record to db. content:" + this.c);
                    Objects.requireNonNull(a.this);
                    long d2 = e.b("beacon").d(this.c);
                    if (d2 != -1) {
                        if (a.this.n) {
                            g.i.b.e.h.b.c(a.this.a, "trigger insert to db and reset timer");
                            a.this.n = false;
                            a.this.b(false, false);
                        }
                        int incrementAndGet = a.this.f4158e.incrementAndGet();
                        String str2 = a.this.a;
                        g.i.b.e.h.b.c(str2, "insert record to db succ. id:" + d2 + ",newCount:" + incrementAndGet + ",newRecordCount2Report:" + b);
                        if (incrementAndGet >= b) {
                            g.i.b.e.h.b.c(a.this.a, "trigger upload...");
                            a.a(a.this, this.f4167d, true);
                            return;
                        }
                        return;
                    }
                    g.i.b.e.h.b.h(a.this.a, "insert record to db failed.");
                    return;
                }
                a.this.f4159f.add(this.c);
                if (a.this.f4159f.size() >= b) {
                    g.i.b.e.h.b.c(a.this.a, "trigger upload by cache num...");
                    a.this.f4166m.set(1);
                    a.a(a.this, this.f4167d, true);
                } else if (a.this.f4166m.get() == 0) {
                    g.i.b.e.h.b.c(a.this.a, "trigger real timer...");
                    a.this.f4166m.set(1);
                    a.this.b(false, true);
                }
            }
        }
    }

    public final class f extends d {
        public g c;

        public f(g gVar) {
            super((byte) 0);
            this.c = gVar;
        }

        public final void run() {
            a.this.f4160g = false;
            Objects.requireNonNull(a.this);
            a.this.f4165l = SystemClock.elapsedRealtime();
            g gVar = this.c;
            if (gVar.f4172f) {
                a aVar = a.this;
                int i2 = aVar.f4164k;
                if (i2 > 0) {
                    aVar.f4164k = i2 - 10;
                }
                aVar.b.addAndGet(gVar.f4174h);
                g gVar2 = this.c;
                if (!gVar2.f4170d) {
                    int size = gVar2.f4173g.size();
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < size; i3++) {
                        arrayList.add(Long.valueOf(this.c.f4173g.get(i3).a));
                    }
                    Objects.requireNonNull(a.this);
                    e b = e.b("beacon");
                    Objects.requireNonNull(b);
                    if (arrayList.size() > 0) {
                        try {
                            SQLiteDatabase writableDatabase = b.getWritableDatabase();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("state", "remove");
                            e.f("deleteRecords update start");
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                long longValue = ((Long) it.next()).longValue();
                                writableDatabase.update("halley_action_tbl", contentValues, "key=?", new String[]{String.valueOf(longValue)});
                                g.i.b.e.h.b.a("halley-cloud-HalleyActionDB", "update record key:" + longValue + " state to remove");
                            }
                            e.f("deleteRecords update end");
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                long longValue2 = ((Long) it2.next()).longValue();
                                int delete = writableDatabase.delete("halley_action_tbl", "key=?", new String[]{String.valueOf(longValue2)});
                                g.i.b.e.h.b.a("halley-cloud-HalleyActionDB", "delete record num:" + delete + ",id:" + longValue2);
                            }
                            e.f("deleteRecords delete end");
                            int a = b.a(false, true);
                            if (a > 0) {
                                g.i.b.e.h.b.c("halley-cloud-HalleyActionDB", "remove fail, removeNum:".concat(String.valueOf(a)));
                                if (b.a(true, false) <= 0) {
                                    e.c(writableDatabase);
                                    e.e(writableDatabase);
                                }
                            }
                        } catch (Exception e2) {
                            g.i.b.e.h.b.e("halley-cloud-HalleyActionDB", "deleteRecords failed.", e2);
                        }
                    }
                    if (a.this.f4161h) {
                        a.this.f4161h = false;
                        g.i.b.e.h.b.c(a.this.a, "reportFinishTask: needReportFinishing right now");
                        a.a(a.this, true, this.c.f4171e);
                        return;
                    }
                }
                if (!this.c.c) {
                    SystemClock.sleep(200);
                    String str = a.this.a;
                    g.i.b.e.h.b.c(str, "trigger reportFinishTask: notClear and reReport needReportRightNow:" + this.c.f4170d);
                    a aVar2 = a.this;
                    g gVar3 = this.c;
                    a.a(aVar2, gVar3.f4170d, gVar3.f4171e);
                    return;
                }
                a.this.n = true;
                return;
            }
            if (g.i.b.e.b.e.f4109d) {
                a aVar3 = a.this;
                if (aVar3.f4164k > 0) {
                    int b2 = g.h.a.a.b("report_interval_forbid_limit", 30, 1440, 60);
                    a aVar4 = a.this;
                    int i4 = aVar4.f4164k;
                    if (i4 < b2) {
                        aVar4.f4164k = i4 * 2;
                    }
                } else {
                    aVar3.f4164k = 5;
                }
            }
            g gVar4 = this.c;
            if (gVar4.f4171e && gVar4.f4170d) {
                int size2 = gVar4.f4173g.size();
                g.i.b.e.h.b.c(a.this.a, "CacheData has been transferred to dbData..Size:".concat(String.valueOf(size2)));
                for (int i5 = 0; i5 < size2; i5++) {
                    Objects.requireNonNull(a.this);
                    e.b("beacon").d(this.c.f4173g.get(i5).b);
                }
            }
        }
    }

    public final class g extends d {
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4170d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4171e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f4172f = false;

        /* renamed from: g  reason: collision with root package name */
        public List<e.a> f4173g;

        /* renamed from: h  reason: collision with root package name */
        public int f4174h;

        public g(boolean z, boolean z2) {
            super((byte) 0);
            this.f4170d = z;
            this.f4171e = z2;
        }

        /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.String, java.lang.String[], android.database.Cursor] */
        /* JADX WARNING: type inference failed for: r4v2, types: [java.util.List<g.i.b.e.e.e$a>, java.util.List] */
        /* JADX WARNING: type inference failed for: r4v30 */
        /* JADX WARNING: type inference failed for: r4v33 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00b8  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00cb  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r18 = this;
                r1 = r18
                r2 = 0
                r1.c = r2
                java.lang.String r0 = "report_max_report_count"
                r3 = 10
                r4 = 100
                r5 = 20
                int r0 = g.h.a.a.b(r0, r3, r4, r5)
                g.i.b.e.e.a.r = r0
                boolean r0 = r1.f4170d
                r3 = 1
                r4 = 0
                if (r0 == 0) goto L_0x0077
                g.i.b.e.e.a r0 = g.i.b.e.e.a.this
                java.util.List<java.lang.String> r0 = r0.f4159f
                int r0 = r0.size()
                if (r0 != 0) goto L_0x0025
                goto L_0x0199
            L_0x0025:
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                r6 = 0
                r7 = 0
            L_0x0031:
                if (r6 >= r0) goto L_0x0053
                int r8 = g.i.b.e.e.a.r
                if (r7 >= r8) goto L_0x0053
                g.i.b.e.e.a r8 = g.i.b.e.e.a.this
                java.util.List<java.lang.String> r8 = r8.f4159f
                java.lang.Object r8 = r8.get(r6)
                java.lang.String r8 = (java.lang.String) r8
                g.i.b.e.e.e$a r9 = new g.i.b.e.e.e$a
                r10 = 0
                r9.<init>(r10, r8)
                r5.add(r9)
                r4.add(r8)
                int r6 = r6 + 1
                int r7 = r7 + 1
                goto L_0x0031
            L_0x0053:
                r0 = 0
            L_0x0054:
                int r6 = r4.size()
                if (r0 >= r6) goto L_0x0068
                g.i.b.e.e.a r6 = g.i.b.e.e.a.this
                java.util.List<java.lang.String> r6 = r6.f4159f
                java.lang.Object r7 = r4.get(r0)
                r6.remove(r7)
                int r0 = r0 + 1
                goto L_0x0054
            L_0x0068:
                g.i.b.e.e.a r0 = g.i.b.e.e.a.this
                java.util.List<java.lang.String> r0 = r0.f4159f
                int r0 = r0.size()
                if (r0 != 0) goto L_0x0074
                r1.c = r3
            L_0x0074:
                r4 = r5
                goto L_0x0199
            L_0x0077:
                r0 = 10000(0x2710, float:1.4013E-41)
                r5 = 1000(0x3e8, float:1.401E-42)
                java.lang.String r6 = "report_clear_db_num"
                int r5 = g.h.a.a.b(r6, r3, r0, r5)
                g.i.b.e.e.a r0 = g.i.b.e.e.a.this
                java.util.Objects.requireNonNull(r0)
                java.lang.String r6 = "beacon"
                g.i.b.e.e.e r7 = g.i.b.e.e.e.b(r6)
                int r0 = r7.a(r3, r3)
                java.lang.String r8 = "halley-cloud-HalleyActionDB"
                if (r0 <= r5) goto L_0x00b5
                android.database.sqlite.SQLiteDatabase r0 = r7.getWritableDatabase()     // Catch:{ Exception -> 0x009f }
                java.lang.String r9 = "halley_action_tbl"
                r0.delete(r9, r4, r4)     // Catch:{ Exception -> 0x009f }
                r0 = 1
                goto L_0x00b6
            L_0x009f:
                r0 = move-exception
                java.lang.String r9 = "clearOverCount failed."
                g.i.b.e.h.b.e(r8, r9, r0)
                int r0 = r7.a(r3, r3)
                if (r0 <= r5) goto L_0x00b5
                android.database.sqlite.SQLiteDatabase r0 = r7.getWritableDatabase()     // Catch:{ all -> 0x00b5 }
                g.i.b.e.e.e.c(r0)     // Catch:{ all -> 0x00b5 }
                g.i.b.e.e.e.e(r0)     // Catch:{ all -> 0x00b5 }
            L_0x00b5:
                r0 = 0
            L_0x00b6:
                if (r0 == 0) goto L_0x00cb
                g.i.b.e.e.a r0 = g.i.b.e.e.a.this
                java.lang.String r0 = r0.a
                java.lang.String r3 = java.lang.String.valueOf(r5)
                java.lang.String r5 = "!!!clearOverCount max:"
                java.lang.String r3 = r5.concat(r3)
                g.i.b.e.h.b.h(r0, r3)
                goto L_0x0199
            L_0x00cb:
                g.i.b.e.e.a r0 = g.i.b.e.e.a.this
                java.util.Objects.requireNonNull(r0)
                g.i.b.e.e.e r0 = g.i.b.e.e.e.b(r6)
                int r5 = g.i.b.e.e.a.r
                int r5 = r5 + r3
                java.util.Objects.requireNonNull(r0)
                java.lang.String r6 = ",ret Count:"
                java.lang.String r7 = "queryRecords maxNum:"
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                android.database.sqlite.SQLiteDatabase r10 = r0.getWritableDatabase()     // Catch:{ all -> 0x015f }
                java.lang.String r11 = "halley_action_tbl"
                r12 = 0
                java.lang.String r13 = "state=?"
                java.lang.String r0 = "add"
                java.lang.String[] r14 = new java.lang.String[]{r0}     // Catch:{ all -> 0x015f }
                r15 = 0
                r16 = 0
                r17 = 0
                android.database.Cursor r4 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x015f }
                if (r4 == 0) goto L_0x0154
                int r0 = r4.getCount()     // Catch:{ all -> 0x015f }
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x015f }
                java.lang.String r11 = "current new record num in db:"
                r10.<init>(r11)     // Catch:{ all -> 0x015f }
                r10.append(r0)     // Catch:{ all -> 0x015f }
                java.lang.String r11 = ",maxNum:"
                r10.append(r11)     // Catch:{ all -> 0x015f }
                r10.append(r5)     // Catch:{ all -> 0x015f }
                java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x015f }
                g.i.b.e.h.b.a(r8, r10)     // Catch:{ all -> 0x015f }
                int r0 = java.lang.Math.min(r0, r5)     // Catch:{ all -> 0x015f }
                boolean r10 = r4.moveToFirst()     // Catch:{ all -> 0x015f }
                if (r10 == 0) goto L_0x0154
                r10 = 0
            L_0x0125:
                java.lang.String r11 = "key"
                int r11 = r4.getColumnIndex(r11)     // Catch:{ all -> 0x015f }
                long r11 = r4.getLong(r11)     // Catch:{ all -> 0x015f }
                java.lang.String r13 = "data"
                int r13 = r4.getColumnIndex(r13)     // Catch:{ all -> 0x015f }
                java.lang.String r13 = r4.getString(r13)     // Catch:{ all -> 0x015f }
                java.lang.String r14 = "state"
                int r14 = r4.getColumnIndex(r14)     // Catch:{ all -> 0x015f }
                java.lang.String r14 = r4.getString(r14)     // Catch:{ all -> 0x015f }
                g.i.b.e.e.e$a r15 = new g.i.b.e.e.e$a     // Catch:{ all -> 0x015f }
                r15.<init>(r11, r13, r14)     // Catch:{ all -> 0x015f }
                r9.add(r15)     // Catch:{ all -> 0x015f }
                int r10 = r10 + r3
                if (r10 >= r0) goto L_0x0154
                boolean r11 = r4.moveToNext()     // Catch:{ all -> 0x015f }
                if (r11 != 0) goto L_0x0125
            L_0x0154:
                if (r4 == 0) goto L_0x0159
                r4.close()
            L_0x0159:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r7)
                goto L_0x016d
            L_0x015f:
                r0 = move-exception
                r0.printStackTrace()     // Catch:{ all -> 0x02c0 }
                if (r4 == 0) goto L_0x0168
                r4.close()
            L_0x0168:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r7)
            L_0x016d:
                r0.append(r5)
                r0.append(r6)
                int r4 = r9.size()
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                g.i.b.e.h.b.c(r8, r0)
                int r0 = r9.size()
                int r4 = g.i.b.e.e.a.r
                if (r0 > r4) goto L_0x0190
                r1.c = r3
                g.i.b.e.e.a r0 = g.i.b.e.e.a.this
                r0.n = r3
                goto L_0x0198
            L_0x0190:
                int r0 = r9.size()
                int r0 = r0 - r3
                r9.remove(r0)
            L_0x0198:
                r4 = r9
            L_0x0199:
                r1.f4173g = r4
                if (r4 == 0) goto L_0x02bb
                int r0 = r4.size()
                if (r0 != 0) goto L_0x01a5
                goto L_0x02bb
            L_0x01a5:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r3 = 0
            L_0x01ab:
                java.util.List<g.i.b.e.e.e$a> r4 = r1.f4173g
                int r4 = r4.size()
                if (r3 >= r4) goto L_0x01c8
                java.util.List<g.i.b.e.e.e$a> r4 = r1.f4173g
                java.lang.Object r4 = r4.get(r3)
                g.i.b.e.e.e$a r4 = (g.i.b.e.e.e.a) r4
                java.lang.String r4 = r4.b
                r0.append(r4)
                java.lang.String r4 = "\n"
                r0.append(r4)
                int r3 = r3 + 1
                goto L_0x01ab
            L_0x01c8:
                java.lang.String r0 = r0.toString()
                g.i.b.e.e.a r3 = g.i.b.e.e.a.this
                java.lang.String r3 = r3.a
                java.lang.String r4 = java.lang.String.valueOf(r0)
                java.lang.String r5 = "reportData:"
                java.lang.String r4 = r5.concat(r4)
                g.i.b.e.h.b.c(r3, r4)
                boolean r3 = r1.f4170d
                if (r3 == 0) goto L_0x01f7
                java.lang.String r3 = "client_report_time"
                boolean r4 = r0.contains(r3)
                if (r4 == 0) goto L_0x01f7
                long r4 = java.lang.System.currentTimeMillis()
                java.lang.String r6 = "yyyy-MM-dd HH:mm:ss"
                java.lang.String r4 = g.i.b.e.h.e.c(r4, r6)
                java.lang.String r0 = r0.replace(r3, r4)
            L_0x01f7:
                byte[] r0 = r0.getBytes()
                int r3 = r0.length
                r1.f4174h = r3
                int r4 = r0.length
                if (r4 != 0) goto L_0x0202
                goto L_0x022e
            L_0x0202:
                java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
                r4.<init>()
                java.util.zip.Deflater r5 = new java.util.zip.Deflater
                r5.<init>()
                r5.setInput(r0)
                r5.finish()
                r0 = 256(0x100, float:3.59E-43)
                byte[] r0 = new byte[r0]
            L_0x0216:
                boolean r6 = r5.finished()
                if (r6 != 0) goto L_0x0224
                int r6 = r5.deflate(r0)
                r4.write(r0, r2, r6)
                goto L_0x0216
            L_0x0224:
                r5.finish()
                r5.end()
                byte[] r0 = r4.toByteArray()
            L_0x022e:
                g.i.b.e.e.a r4 = g.i.b.e.e.a.this
                g.i.b.e.e.b r5 = r4.f4157d
                boolean r6 = r1.f4170d
                g.i.b.e.e.b$a r4 = r4.q
                r10 = r5
                g.i.b.e.e.a$i r10 = (g.i.b.e.e.a.i) r10
                java.util.Objects.requireNonNull(r10)
                long r11 = android.os.SystemClock.elapsedRealtime()
                r10.b = r4
                r10.a = r1
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                java.lang.String r4 = java.lang.String.valueOf(r3)
                java.lang.String r7 = "B-Length"
                r5.put(r7, r4)
                if (r6 == 0) goto L_0x0257
                java.lang.String r4 = "realtime_speed"
                goto L_0x0259
            L_0x0257:
                java.lang.String r4 = "hllog"
            L_0x0259:
                java.lang.String r6 = "HLReportCmd"
                r5.put(r6, r4)
                r7 = 20000(0x4e20, float:2.8026E-41)
                java.lang.String r8 = g.i.b.e.h.e.j()
                r9 = 0
                java.lang.String r4 = "https://up-hl.3g.qq.com/upreport"
                r6 = r0
                g.i.b.e.d.a.c r4 = g.i.b.e.d.a.c.a(r4, r5, r6, r7, r8, r9)
                r4.f4145m = r2
                java.lang.String r5 = "event"
                r4.s = r5
                g.i.b.e.e.a$h r5 = new g.i.b.e.e.a$h
                r5.<init>(r10, r4, r11)
                g.i.b.e.b.f r4 = g.i.b.e.b.f.a()     // Catch:{ all -> 0x0281 }
                java.util.concurrent.ThreadPoolExecutor r4 = r4.a     // Catch:{ all -> 0x0281 }
                r4.execute(r5)     // Catch:{ all -> 0x0281 }
                goto L_0x0284
            L_0x0281:
                r10.a(r2)
            L_0x0284:
                g.i.b.e.e.a r2 = g.i.b.e.e.a.this
                java.lang.String r2 = r2.a
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "ReportTask count:"
                r4.<init>(r5)
                java.util.List<g.i.b.e.e.e$a> r5 = r1.f4173g
                int r5 = r5.size()
                r4.append(r5)
                java.lang.String r5 = " compressLen:"
                r4.append(r5)
                int r0 = r0.length
                r4.append(r0)
                java.lang.String r0 = ",oriLen:"
                r4.append(r0)
                r4.append(r3)
                java.lang.String r0 = ",isCleared:"
                r4.append(r0)
                boolean r0 = r1.c
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                g.i.b.e.h.b.f(r2, r0)
                return
            L_0x02bb:
                g.i.b.e.e.a r0 = g.i.b.e.e.a.this
                r0.f4160g = r2
                return
            L_0x02c0:
                r0 = move-exception
                r2 = r0
                if (r4 == 0) goto L_0x02c7
                r4.close()
            L_0x02c7:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r7)
                r0.append(r5)
                r0.append(r6)
                int r3 = r9.size()
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                g.i.b.e.h.b.c(r8, r0)
                goto L_0x02e2
            L_0x02e1:
                throw r2
            L_0x02e2:
                goto L_0x02e1
            */
            throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.e.a.g.run():void");
        }
    }

    public final class h implements Runnable {
        public final /* synthetic */ g.i.b.e.d.a.c b;
        public final /* synthetic */ long c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ i f4176d;

        public h(i iVar, g.i.b.e.d.a.c cVar, long j2) {
            this.f4176d = iVar;
            this.b = cVar;
            this.c = j2;
        }

        public final void run() {
            boolean z = false;
            try {
                g.i.b.e.d.a.f c2 = this.b.c();
                this.b.f4138j = SystemClock.elapsedRealtime() - this.c;
                this.b.b(z);
                if (c2.a == 0 && c2.c == 200) {
                    z = true;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            } finally {
                this.f4176d.a(z);
            }
        }
    }

    public final class i extends b {
        public final boolean a(boolean z) {
            b.a aVar = this.b;
            Object obj = this.a;
            c cVar = (c) aVar;
            Objects.requireNonNull(cVar);
            g gVar = (g) obj;
            gVar.f4172f = z;
            g.i.b.e.h.b.c(a.this.a, "reportUploadFinishCallback..ret:".concat(String.valueOf(z)));
            new f(gVar).a(true);
            return z;
        }
    }

    public a() {
        String str;
        String str2;
        String str3;
        Context context = g.i.b.e.c.f4125g;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("null");
        stringBuffer.append(";Android ");
        try {
            str = Build.VERSION.RELEASE;
        } catch (Throwable th) {
            th.printStackTrace();
            str = "null";
        }
        stringBuffer.append(str);
        stringBuffer.append(",level ");
        try {
            str2 = Build.VERSION.SDK;
        } catch (Throwable th2) {
            th2.printStackTrace();
            str2 = "null";
        }
        stringBuffer.append(str2);
        c.a = stringBuffer.toString();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String str4 = packageInfo.versionName;
            int i2 = packageInfo.versionCode;
            if (str4 != null) {
                if (str4.trim().length() > 0) {
                    str3 = str4.trim().replace(10, ' ').replace(13, ' ').replace("|", "%7C");
                    char[] charArray = str3.toCharArray();
                    int i3 = 0;
                    for (char c2 : charArray) {
                        if (c2 == '.') {
                            i3++;
                        }
                    }
                    if (i3 < 3) {
                        str3 = str3 + "." + i2;
                    }
                    c.b = str3;
                    context.getPackageName();
                    c.c = "null";
                    c.f4177d = "null";
                    this.c = g.h.a.a.d("ReportAction");
                    this.f4157d = new i();
                    b(true, false);
                    this.f4163j = g.h.a.a.b("report_insert_new_record_num_limit", 5, 100, 100);
                }
            }
            str3 = String.valueOf(i2);
        } catch (Throwable unused) {
            str3 = "";
        }
        c.b = str3;
        context.getPackageName();
        c.c = "null";
        c.f4177d = "null";
        this.c = g.h.a.a.d("ReportAction");
        this.f4157d = new i();
        b(true, false);
        this.f4163j = g.h.a.a.b("report_insert_new_record_num_limit", 5, 100, 100);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:19|20|21|22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0071 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(g.i.b.e.e.a r7, boolean r8, boolean r9) {
        /*
            monitor-enter(r7)
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L_0x000b
            if (r9 == 0) goto L_0x000b
            r7.b(r1, r0)     // Catch:{ all -> 0x0075 }
            goto L_0x000e
        L_0x000b:
            r7.b(r1, r1)     // Catch:{ all -> 0x0075 }
        L_0x000e:
            boolean r2 = r7.f4160g     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x001e
            java.lang.String r9 = r7.a     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = "isReporting, failed to execute report"
            g.i.b.e.h.b.c(r9, r1)     // Catch:{ all -> 0x0075 }
            if (r8 == 0) goto L_0x0073
            r7.f4161h = r0     // Catch:{ all -> 0x0075 }
            goto L_0x0073
        L_0x001e:
            if (r8 != 0) goto L_0x0025
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f4158e     // Catch:{ all -> 0x0075 }
            r2.set(r1)     // Catch:{ all -> 0x0075 }
        L_0x0025:
            long r2 = r7.f4165l     // Catch:{ all -> 0x0075 }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x005f
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0075 }
            long r4 = r7.f4165l     // Catch:{ all -> 0x0075 }
            long r2 = r2 - r4
            int r4 = r7.f4164k     // Catch:{ all -> 0x0075 }
            int r4 = r4 * 60
            int r4 = r4 * 1000
            long r4 = (long) r4     // Catch:{ all -> 0x0075 }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x005f
            java.util.List<java.lang.String> r8 = r7.f4159f     // Catch:{ all -> 0x0075 }
            r8.clear()     // Catch:{ all -> 0x0075 }
            java.lang.String r8 = r7.a     // Catch:{ all -> 0x0075 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = "report time more frequently: mReportLimitTime:"
            r9.<init>(r0)     // Catch:{ all -> 0x0075 }
            int r0 = r7.f4164k     // Catch:{ all -> 0x0075 }
            r9.append(r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = " and clear cacheEvents"
            r9.append(r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0075 }
            g.i.b.e.h.b.c(r8, r9)     // Catch:{ all -> 0x0075 }
            goto L_0x0073
        L_0x005f:
            r7.f4160g = r0     // Catch:{ all -> 0x0075 }
            java.lang.String r2 = r7.a     // Catch:{ all -> 0x0071 }
            java.lang.String r3 = "ready to execute reportTask"
            g.i.b.e.h.b.c(r2, r3)     // Catch:{ all -> 0x0071 }
            g.i.b.e.e.a$g r2 = new g.i.b.e.e.a$g     // Catch:{ all -> 0x0071 }
            r2.<init>(r8, r9)     // Catch:{ all -> 0x0071 }
            r2.a(r0)     // Catch:{ all -> 0x0071 }
            goto L_0x0073
        L_0x0071:
            r7.f4160g = r1     // Catch:{ all -> 0x0075 }
        L_0x0073:
            monitor-exit(r7)
            return
        L_0x0075:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.e.a.a(g.i.b.e.e.a, boolean, boolean):void");
    }

    public final void b(boolean z, boolean z2) {
        if (!z2) {
            String str = this.a;
            g.i.b.e.h.b.c(str, "trigger to reset reportTimer and isInit:" + z + " isDbClear:" + this.n);
            if (z) {
                k.a().b(this.p, 10000);
            } else if (!this.n) {
                k.a().b(this.p, (long) g.h.a.a.b("report_timer_interval", AbstractNetAdapter.CONNECT_TIMEOUT, 600000, ATTAReporter.TIMEOUT));
            }
        } else if (this.f4166m.get() > 3) {
            g.i.b.e.h.b.c(this.a, "trigger close real timer...");
            this.f4166m.set(0);
        } else {
            k.a().b(this.o, (long) (g.h.a.a.b("report_real_timer_interval", 1, 60, 5) * 1000));
        }
    }
}
