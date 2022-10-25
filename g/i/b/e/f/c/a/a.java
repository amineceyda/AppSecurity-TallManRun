package g.i.b.e.f.c.a;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.tencent.raft.raftframework.remote.RemoteProxyUtil;
import com.tencent.raft.raftframework.sla.SLAConstant;
import g.i.b.e.f.j;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public abstract class a {
    public C0150a a;

    /* renamed from: g.i.b.e.f.c.a.a$a  reason: collision with other inner class name */
    public class C0150a extends SQLiteOpenHelper {
        public C0150a(a aVar, Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r15 = this;
                java.lang.String r0 = "apn"
                java.lang.String r1 = "halley-cloud-AbsScheduleStorager"
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ef }
                r2.<init>()     // Catch:{ Exception -> 0x00ef }
                java.lang.String r3 = "apn_cache_num"
                r4 = 100
                r5 = 8
                r6 = 1
                int r3 = g.h.a.a.b(r3, r6, r4, r5)     // Catch:{ Exception -> 0x00ef }
                java.lang.String r4 = "removeRecordIfNeeded...maxApnNum:"
                java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x00ef }
                java.lang.String r4 = r4.concat(r5)     // Catch:{ Exception -> 0x00ef }
                g.i.b.e.h.b.h(r1, r4)     // Catch:{ Exception -> 0x00ef }
                android.database.sqlite.SQLiteDatabase r4 = r15.getWritableDatabase()     // Catch:{ Exception -> 0x00ef }
                r5 = 0
                java.lang.String r8 = "halley_schedule_tbl"
                java.lang.String[] r9 = new java.lang.String[]{r0}     // Catch:{ all -> 0x00e8 }
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                java.lang.String r14 = "key"
                r7 = r4
                android.database.Cursor r5 = r7.query(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00e8 }
                if (r5 != 0) goto L_0x003f
                if (r5 == 0) goto L_0x003e
                r5.close()     // Catch:{ Exception -> 0x00ef }
            L_0x003e:
                return
            L_0x003f:
                int r7 = r5.getCount()     // Catch:{ all -> 0x00e8 }
                int r7 = r7 - r3
                if (r7 <= 0) goto L_0x007d
                boolean r3 = r5.moveToFirst()     // Catch:{ all -> 0x00e8 }
                if (r3 == 0) goto L_0x007d
            L_0x004c:
                int r3 = r5.getColumnIndex(r0)     // Catch:{ all -> 0x00e8 }
                java.lang.String r3 = r5.getString(r3)     // Catch:{ all -> 0x00e8 }
                boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x00e8 }
                if (r8 != 0) goto L_0x0070
                boolean r8 = r2.contains(r3)     // Catch:{ all -> 0x00e8 }
                if (r8 != 0) goto L_0x0070
                r2.add(r3)     // Catch:{ all -> 0x00e8 }
                java.lang.String r8 = "removeRecordIfNeeded...found apnName in db:"
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x00e8 }
                java.lang.String r3 = r8.concat(r3)     // Catch:{ all -> 0x00e8 }
                g.i.b.e.h.b.a(r1, r3)     // Catch:{ all -> 0x00e8 }
            L_0x0070:
                boolean r3 = r5.moveToNext()     // Catch:{ all -> 0x00e8 }
                if (r3 == 0) goto L_0x007d
                int r3 = r7 + -1
                if (r7 > 0) goto L_0x007b
                goto L_0x007d
            L_0x007b:
                r7 = r3
                goto L_0x004c
            L_0x007d:
                r5.close()     // Catch:{ Exception -> 0x00ef }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ef }
                java.lang.String r3 = "found apnNames size:"
                r0.<init>(r3)     // Catch:{ Exception -> 0x00ef }
                int r3 = r2.size()     // Catch:{ Exception -> 0x00ef }
                r0.append(r3)     // Catch:{ Exception -> 0x00ef }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00ef }
                g.i.b.e.h.b.a(r1, r0)     // Catch:{ Exception -> 0x00ef }
                int r0 = r2.size()     // Catch:{ Exception -> 0x00ef }
                if (r0 <= 0) goto L_0x00e7
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ef }
                java.lang.String r3 = "trying to delete apn num:"
                r0.<init>(r3)     // Catch:{ Exception -> 0x00ef }
                int r3 = r2.size()     // Catch:{ Exception -> 0x00ef }
                r0.append(r3)     // Catch:{ Exception -> 0x00ef }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00ef }
                g.i.b.e.h.b.a(r1, r0)     // Catch:{ Exception -> 0x00ef }
                java.util.Iterator r0 = r2.iterator()     // Catch:{ Exception -> 0x00ef }
            L_0x00b4:
                boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x00ef }
                if (r2 == 0) goto L_0x00e7
                java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x00ef }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00ef }
                java.lang.String r3 = "halley_schedule_tbl"
                java.lang.String r5 = "apn=?"
                java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ Exception -> 0x00ef }
                r8 = 0
                r7[r8] = r2     // Catch:{ Exception -> 0x00ef }
                int r3 = r4.delete(r3, r5, r7)     // Catch:{ Exception -> 0x00ef }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ef }
                java.lang.String r7 = "removeRecordIfNeeded...delete apn:"
                r5.<init>(r7)     // Catch:{ Exception -> 0x00ef }
                r5.append(r2)     // Catch:{ Exception -> 0x00ef }
                java.lang.String r2 = ", ret:"
                r5.append(r2)     // Catch:{ Exception -> 0x00ef }
                r5.append(r3)     // Catch:{ Exception -> 0x00ef }
                java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x00ef }
                g.i.b.e.h.b.h(r1, r2)     // Catch:{ Exception -> 0x00ef }
                goto L_0x00b4
            L_0x00e7:
                return
            L_0x00e8:
                r0 = move-exception
                if (r5 == 0) goto L_0x00ee
                r5.close()     // Catch:{ Exception -> 0x00ef }
            L_0x00ee:
                throw r0     // Catch:{ Exception -> 0x00ef }
            L_0x00ef:
                r0 = move-exception
                r0.printStackTrace()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.f.c.a.a.C0150a.a():void");
        }

        public final synchronized void b(String str, byte[] bArr) {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                int delete = writableDatabase.delete("halley_schedule_tbl", "apn=?", new String[]{str});
                ContentValues contentValues = new ContentValues();
                contentValues.put("apn", str);
                contentValues.put(RemoteProxyUtil.KEY_RESULT, bArr);
                contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                long insert = writableDatabase.insert("halley_schedule_tbl", (String) null, contentValues);
                g.i.b.e.h.b.f("halley-cloud-AbsScheduleStorager", "insert record...ret:" + insert + ",apnName:" + str);
                if (-1 != insert && delete <= 0) {
                    a();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0041 A[Catch:{ all -> 0x003d, all -> 0x0045 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized byte[] c(java.lang.String r10) {
            /*
                r9 = this;
                monitor-enter(r9)
                r0 = 0
                android.database.sqlite.SQLiteDatabase r1 = r9.getReadableDatabase()     // Catch:{ all -> 0x0045 }
                java.lang.String r2 = "halley_schedule_tbl"
                r3 = 0
                java.lang.String r4 = "apn=?"
                r5 = 1
                java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ all -> 0x003d }
                r6 = 0
                r5[r6] = r10     // Catch:{ all -> 0x003d }
                r6 = 0
                r7 = 0
                r8 = 0
                android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x003d }
                if (r10 == 0) goto L_0x0037
                boolean r1 = r10.moveToFirst()     // Catch:{ all -> 0x0035 }
                if (r1 == 0) goto L_0x0037
                java.lang.String r1 = "result"
                int r1 = r10.getColumnIndex(r1)     // Catch:{ all -> 0x0035 }
                byte[] r1 = r10.getBlob(r1)     // Catch:{ all -> 0x0035 }
                boolean r2 = g.i.b.e.h.e.f(r1)     // Catch:{ all -> 0x0035 }
                if (r2 != 0) goto L_0x0037
                r10.close()     // Catch:{ all -> 0x0045 }
                monitor-exit(r9)
                return r1
            L_0x0035:
                r1 = move-exception
                goto L_0x003f
            L_0x0037:
                if (r10 == 0) goto L_0x0049
                r10.close()     // Catch:{ all -> 0x0045 }
                goto L_0x0049
            L_0x003d:
                r1 = move-exception
                r10 = r0
            L_0x003f:
                if (r10 == 0) goto L_0x0044
                r10.close()     // Catch:{ all -> 0x0045 }
            L_0x0044:
                throw r1     // Catch:{ all -> 0x0045 }
            L_0x0045:
                r10 = move-exception
                r10.printStackTrace()     // Catch:{ all -> 0x004b }
            L_0x0049:
                monitor-exit(r9)
                return r0
            L_0x004b:
                r10 = move-exception
                monitor-exit(r9)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.f.c.a.a.C0150a.c(java.lang.String):byte[]");
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS halley_schedule_tbl (key INTEGER PRIMARY KEY AUTOINCREMENT,apn TEXT,result BLOB,timestamp INTEGER);");
                g.i.b.e.h.b.f("halley-cloud-AbsScheduleStorager", "db created.");
            } catch (Exception e2) {
                e2.printStackTrace();
                g.i.b.e.h.b.e("halley-cloud-AbsScheduleStorager", "db create failed.", e2);
            }
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS halley_schedule_tbl");
            } catch (SQLException e2) {
                try {
                    e2.printStackTrace();
                } catch (SQLException e3) {
                    throw e3;
                } catch (Exception e4) {
                    e4.printStackTrace();
                    return;
                }
            }
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS halley_schedule_tbl (key INTEGER PRIMARY KEY AUTOINCREMENT,apn TEXT,result BLOB,timestamp INTEGER);");
            g.i.b.e.h.b.f("halley-cloud-AbsScheduleStorager", "db created.");
        }

        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            super.onOpen(sQLiteDatabase);
            try {
                int version = sQLiteDatabase.getVersion();
                if (version <= 0) {
                    onUpgrade(sQLiteDatabase, version, 1);
                } else if (version > 1) {
                    onDowngrade(sQLiteDatabase, version, 1);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS halley_schedule_tbl");
            } catch (SQLException e2) {
                try {
                    e2.printStackTrace();
                } catch (SQLException e3) {
                    throw e3;
                } catch (Exception e4) {
                    e4.printStackTrace();
                    return;
                }
            }
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS halley_schedule_tbl (key INTEGER PRIMARY KEY AUTOINCREMENT,apn TEXT,result BLOB,timestamp INTEGER);");
            g.i.b.e.h.b.f("halley-cloud-AbsScheduleStorager", "db created.");
        }
    }

    public abstract class b {
        public boolean a = false;
        public List<String> b;
        public Map<String, byte[]> c;

        /* renamed from: d  reason: collision with root package name */
        public int f4182d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f4183e = 0;

        /* renamed from: f  reason: collision with root package name */
        public String f4184f;

        /* renamed from: g  reason: collision with root package name */
        public byte f4185g;

        /* renamed from: h  reason: collision with root package name */
        public int f4186h;

        /* renamed from: i  reason: collision with root package name */
        public int f4187i;

        /* renamed from: j  reason: collision with root package name */
        public Map<String, String> f4188j;

        /* renamed from: k  reason: collision with root package name */
        public Map<String, String> f4189k;

        /* renamed from: l  reason: collision with root package name */
        public long f4190l;

        /* renamed from: m  reason: collision with root package name */
        public int f4191m;
        public int n = 0;

        public b(String str, byte b2, List<String> list) {
            this.f4184f = str;
            this.f4185g = b2;
            this.b = list;
            this.f4191m = list.size();
        }

        public static b a(String str, byte b2, List<String> list) {
            b bVar = null;
            if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
                g.i.b.e.h.b.i("halley-cloud-AbsDetectTask", "createDetectTask fail because targets is empty or taskId is empty");
                return null;
            }
            boolean z = true;
            if (b2 == 1 || b2 == 2) {
                bVar = new g(str, b2, list);
            } else if (b2 == 3) {
                bVar = new h(str, b2, list);
            } else if (b2 != 4) {
                z = false;
                switch (b2) {
                    case 12:
                        bVar = new g(str, b2, list);
                        break;
                    case ConnectionResult.CANCELED:
                        bVar = new h(str, b2, list);
                        break;
                    case ConnectionResult.TIMEOUT:
                        bVar = new e(str, b2, list);
                        break;
                }
            } else {
                bVar = new e(str, b2, list);
            }
            bVar.a = z;
            return bVar;
        }

        public static final String b(Map<String, String> map) {
            if (map == null || map.size() <= 0) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (String next : map.keySet()) {
                sb.append(next);
                sb.append(",");
                sb.append(map.get(next));
                sb.append(";");
            }
            return sb.toString();
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0067 A[SYNTHETIC, Splitter:B:23:0x0067] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c() {
            /*
                r12 = this;
                java.util.HashMap r4 = new java.util.HashMap
                r4.<init>()
                r0 = 0
                boolean r1 = g.i.b.e.b.e.e()     // Catch:{ all -> 0x0115 }
                java.lang.String r2 = "halley-cloud-AbsDetectTask"
                r3 = 1
                if (r1 == 0) goto L_0x0058
                byte[] r1 = r12.g()     // Catch:{ all -> 0x0115 }
                if (r1 == 0) goto L_0x001a
                int r5 = r1.length     // Catch:{ all -> 0x0115 }
                if (r5 == 0) goto L_0x001a
                r5 = 1
                goto L_0x001b
            L_0x001a:
                r5 = 0
            L_0x001b:
                if (r5 == 0) goto L_0x0058
                java.lang.String r5 = "detect_send_traffic_limit"
                r6 = 2048(0x800, float:2.87E-42)
                r7 = 512(0x200, float:7.175E-43)
                int r5 = g.h.a.a.b(r5, r3, r6, r7)     // Catch:{ all -> 0x0115 }
                int r5 = r5 << 10
                int r6 = r1.length     // Catch:{ all -> 0x0115 }
                if (r6 <= r5) goto L_0x0058
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
                java.lang.String r6 = "request body is too large,abandon this request: length:"
                r5.<init>(r6)     // Catch:{ all -> 0x0115 }
                int r6 = r1.length     // Catch:{ all -> 0x0115 }
                r5.append(r6)     // Catch:{ all -> 0x0115 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0115 }
                g.i.b.e.h.b.i(r2, r5)     // Catch:{ all -> 0x0115 }
                int r5 = r12.f4191m     // Catch:{ all -> 0x0115 }
                r12.n = r5     // Catch:{ all -> 0x0115 }
                java.lang.String r5 = "D33"
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
                r6.<init>()     // Catch:{ all -> 0x0115 }
                int r1 = r1.length     // Catch:{ all -> 0x0115 }
                r6.append(r1)     // Catch:{ all -> 0x0115 }
                java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0115 }
                r4.put(r5, r1)     // Catch:{ all -> 0x0115 }
                r1 = -503(0xfffffffffffffe09, float:NaN)
                r5 = 0
                goto L_0x005a
            L_0x0058:
                r1 = 0
                r5 = 1
            L_0x005a:
                if (r5 != 0) goto L_0x0067
                r2 = -503(0xfffffffffffffe09, float:NaN)
            L_0x005e:
                r3 = 0
            L_0x005f:
                r5 = 0
                java.lang.String r1 = "HLDetectEvent"
                r0 = r12
                r0.d(r1, r2, r3, r4, r5)
                return
            L_0x0067:
                r12.f()     // Catch:{ all -> 0x0110 }
                r5 = 0
            L_0x006b:
                int r6 = r12.f4191m     // Catch:{ all -> 0x0110 }
                if (r0 >= r6) goto L_0x00f0
                boolean r6 = g.i.b.e.b.e.f4109d     // Catch:{ all -> 0x0110 }
                if (r6 != 0) goto L_0x0088
                int r5 = r5 + 1
                java.lang.String r6 = "NoNet: abandon one target...noNetNum:"
                java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0110 }
                java.lang.String r6 = r6.concat(r7)     // Catch:{ all -> 0x0110 }
                g.i.b.e.h.b.i(r2, r6)     // Catch:{ all -> 0x0110 }
                r6 = 1000(0x3e8, double:4.94E-321)
                android.os.SystemClock.sleep(r6)     // Catch:{ all -> 0x0110 }
                goto L_0x00ec
            L_0x0088:
                boolean r6 = r12.i()     // Catch:{ all -> 0x0110 }
                if (r6 == 0) goto L_0x00a9
                int r3 = r12.f4191m     // Catch:{ all -> 0x0110 }
                int r3 = r3 - r0
                r12.n = r3     // Catch:{ all -> 0x0110 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
                java.lang.String r3 = "netType changed, abandonNum:"
                r0.<init>(r3)     // Catch:{ all -> 0x0110 }
                int r3 = r12.n     // Catch:{ all -> 0x0110 }
                r0.append(r3)     // Catch:{ all -> 0x0110 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0110 }
                g.i.b.e.h.b.i(r2, r0)     // Catch:{ all -> 0x0110 }
                r0 = -500(0xfffffffffffffe0c, float:NaN)
                goto L_0x00f1
            L_0x00a9:
                long r6 = r12.f4190l     // Catch:{ all -> 0x0110 }
                long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0110 }
                int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r10 >= 0) goto L_0x00ce
                int r3 = r12.f4191m     // Catch:{ all -> 0x0110 }
                int r3 = r3 - r0
                r12.n = r3     // Catch:{ all -> 0x0110 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
                java.lang.String r3 = "over due, abandon detect task， abandonNum:"
                r0.<init>(r3)     // Catch:{ all -> 0x0110 }
                int r3 = r12.n     // Catch:{ all -> 0x0110 }
                r0.append(r3)     // Catch:{ all -> 0x0110 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0110 }
                g.i.b.e.h.b.i(r2, r0)     // Catch:{ all -> 0x0110 }
                r0 = -501(0xfffffffffffffe0b, float:NaN)
                goto L_0x00f1
            L_0x00ce:
                java.util.List<java.lang.String> r6 = r12.b     // Catch:{ all -> 0x0110 }
                java.lang.Object r6 = r6.get(r0)     // Catch:{ all -> 0x0110 }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0110 }
                boolean r6 = r12.e(r6)     // Catch:{ all -> 0x0110 }
                if (r6 == 0) goto L_0x00e2
                int r6 = r12.f4182d     // Catch:{ all -> 0x0110 }
                int r6 = r6 + r3
                r12.f4182d = r6     // Catch:{ all -> 0x0110 }
                goto L_0x00e7
            L_0x00e2:
                int r6 = r12.n     // Catch:{ all -> 0x0110 }
                int r6 = r6 + r3
                r12.n = r6     // Catch:{ all -> 0x0110 }
            L_0x00e7:
                r6 = 100
                android.os.SystemClock.sleep(r6)     // Catch:{ all -> 0x0110 }
            L_0x00ec:
                int r0 = r0 + 1
                goto L_0x006b
            L_0x00f0:
                r0 = r1
            L_0x00f1:
                if (r5 <= 0) goto L_0x010d
                java.lang.String r1 = "NoNet: abandon num:"
                java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0115 }
                java.lang.String r1 = r1.concat(r3)     // Catch:{ all -> 0x0115 }
                g.i.b.e.h.b.i(r2, r1)     // Catch:{ all -> 0x0115 }
                int r1 = r12.n     // Catch:{ all -> 0x0115 }
                int r1 = r1 + r5
                r12.n = r1     // Catch:{ all -> 0x0115 }
                if (r0 < 0) goto L_0x010d
                r0 = -505(0xfffffffffffffe07, float:NaN)
                r2 = -505(0xfffffffffffffe07, float:NaN)
                goto L_0x005e
            L_0x010d:
                r2 = r0
                goto L_0x005e
            L_0x0110:
                r0 = move-exception
                r11 = r1
                r1 = r0
                r0 = r11
                goto L_0x0116
            L_0x0115:
                r1 = move-exception
            L_0x0116:
                int r2 = r12.f4191m     // Catch:{ all -> 0x014d }
                int r3 = r12.f4182d     // Catch:{ all -> 0x014d }
                int r2 = r2 - r3
                r12.n = r2     // Catch:{ all -> 0x014d }
                r0 = -515(0xfffffffffffffdfd, float:NaN)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0148 }
                r2.<init>()     // Catch:{ all -> 0x0148 }
                java.lang.Class r3 = r1.getClass()     // Catch:{ all -> 0x0148 }
                java.lang.String r3 = r3.getSimpleName()     // Catch:{ all -> 0x0148 }
                r2.append(r3)     // Catch:{ all -> 0x0148 }
                java.lang.String r3 = "("
                r2.append(r3)     // Catch:{ all -> 0x0148 }
                java.lang.String r1 = r1.getLocalizedMessage()     // Catch:{ all -> 0x0148 }
                r2.append(r1)     // Catch:{ all -> 0x0148 }
                java.lang.String r1 = ")"
                r2.append(r1)     // Catch:{ all -> 0x0148 }
                java.lang.String r3 = r2.toString()     // Catch:{ all -> 0x0148 }
                r2 = -515(0xfffffffffffffdfd, float:NaN)
                goto L_0x005f
            L_0x0148:
                r1 = move-exception
                r6 = r1
                r2 = -515(0xfffffffffffffdfd, float:NaN)
                goto L_0x0150
            L_0x014d:
                r1 = move-exception
                r2 = r0
                r6 = r1
            L_0x0150:
                r3 = 0
                r5 = 0
                java.lang.String r1 = "HLDetectEvent"
                r0 = r12
                r0.d(r1, r2, r3, r4, r5)
                goto L_0x015a
            L_0x0159:
                throw r6
            L_0x015a:
                goto L_0x0159
            */
            throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.f.c.a.a.b.c():void");
        }

        public final void d(String str, int i2, String str2, Map<String, String> map, boolean z) {
            String str3;
            int i3;
            boolean z2 = true;
            if (!z && str.equals("HLDetectEvent")) {
                if (i2 >= 0) {
                    i3 = 100;
                    str3 = "report_detect_succ_denominator_value";
                } else {
                    str3 = "report_detect_fail_denominator_value";
                    i3 = 1;
                }
                int a2 = g.h.a.a.a(str3, i3);
                map.put("D37", String.valueOf(a2));
                boolean g2 = g.h.a.a.g(a2);
                g.i.b.e.h.b.c("halley-cloud-AbsDetectTask", "AbsDetectTask report sampling denominator:" + a2 + " canReport:" + g2);
                if (g2) {
                    if (this.f4182d > 0) {
                        g.i.b.e.h.b.c("halley-cloud-AbsDetectTask", "report executeNum:" + this.f4182d);
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f4182d);
                        map.put("D36", sb.toString());
                    }
                    if (this.n > 0) {
                        g.i.b.e.h.b.c("halley-cloud-AbsDetectTask", "report abandonNum:" + this.n + " and error Code:" + i2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.n);
                        map.put("D34", sb2.toString());
                    }
                } else {
                    return;
                }
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f4185g);
            map.put("D4", sb3.toString());
            String c2 = g.i.b.e.b.e.c();
            if (!TextUtils.isEmpty(c2)) {
                map.put("D39", c2);
            }
            map.put("D1", this.f4184f);
            if (!TextUtils.isEmpty(b(this.f4188j))) {
                map.put("D2", b(this.f4188j));
            }
            if (!TextUtils.isEmpty(b(this.f4189k))) {
                map.put("D3", b(this.f4189k));
            }
            map.put("D5", String.valueOf(i2));
            if (!TextUtils.isEmpty(str2)) {
                map.put("D6", str2);
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(g.i.b.e.b.e.c);
            map.put("D9", sb4.toString());
            map.put("D40", g.i.b.e.c.f4129k);
            boolean z3 = false;
            if (z) {
                map.put("D38", SLAConstant.TYPE_DEPRECATED_START);
                map.put("D8", "client_report_time");
                if (i2 >= 0) {
                    z3 = true;
                }
                g.h.a.a.j(str, z3, map, true);
                return;
            }
            if (i2 < 0) {
                z2 = false;
            }
            g.h.a.a.j(str, z2, map, false);
        }

        public abstract boolean e(String str);

        public abstract void f();

        public final byte[] g() {
            byte[] bArr;
            Map<String, byte[]> map = this.c;
            if (map == null || !map.containsKey("body") || (bArr = this.c.get("body")) == null || bArr.length == 0) {
                return null;
            }
            return bArr;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
            r0 = r3.c.get("read_timeout");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int h() {
            /*
                r3 = this;
                java.util.Map<java.lang.String, byte[]> r0 = r3.c
                if (r0 == 0) goto L_0x0020
                java.lang.String r1 = "read_timeout"
                boolean r0 = r0.containsKey(r1)
                if (r0 == 0) goto L_0x0020
                java.util.Map<java.lang.String, byte[]> r0 = r3.c
                java.lang.Object r0 = r0.get(r1)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L_0x0020
                int r1 = r0.length
                r2 = 1
                if (r1 != r2) goto L_0x0020
                r1 = 0
                byte r0 = r0[r1]
                int r0 = r0 * 1000
                return r0
            L_0x0020:
                r0 = 30000(0x7530, float:4.2039E-41)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.f.c.a.a.b.h():int");
        }

        public final boolean i() {
            if ((!g.i.b.e.b.e.e() || d.f4195h == this.f4187i) && g.i.b.e.b.e.f4112g == this.f4186h) {
                return false;
            }
            return true;
        }
    }

    public final class c extends Thread {
        public volatile boolean b;
        public BlockingQueue<b> c;

        /* renamed from: d  reason: collision with root package name */
        public C0151a f4192d;

        /* renamed from: e  reason: collision with root package name */
        public AtomicInteger f4193e;

        /* renamed from: g.i.b.e.f.c.a.a$c$a  reason: collision with other inner class name */
        public interface C0151a {
        }

        public c(BlockingQueue<b> blockingQueue, C0151a aVar, AtomicInteger atomicInteger) {
            this.c = blockingQueue;
            this.f4192d = aVar;
            this.f4193e = atomicInteger;
        }

        public final void a(int i2) {
            if (g.i.b.e.b.e.e() || i2 > 0) {
                SharedPreferences a = j.a(false);
                int i3 = (a != null ? a.getInt("total_traffic", 0) : -1) + i2;
                SharedPreferences a2 = j.a(false);
                if (a2 != null) {
                    a2.edit().putInt("total_traffic", i3).commit();
                }
                g.i.b.e.h.b.c("halley-cloud-DetectThread", "calculate total traffic:".concat(String.valueOf(i3)));
            }
            this.b = false;
            this.c = null;
            d.C0152a aVar = (d.C0152a) this.f4192d;
            Objects.requireNonNull(aVar);
            Object obj = d.f4194g;
            synchronized (d.f4194g) {
                d dVar = d.this;
                dVar.b = null;
                dVar.a = null;
                synchronized (g.i.b.e.b.e.f4114i) {
                    g.i.b.e.b.e.f4114i.remove("halley-cloud-DetectorImpl");
                }
            }
        }

        public final void run() {
            this.b = true;
            int i2 = 0;
            while (true) {
                try {
                    b bVar = (b) this.c.poll();
                    if (bVar == null) {
                        g.i.b.e.h.b.c("halley-cloud-DetectThread", "queue is empty, ready to exit thread");
                        return;
                    }
                    bVar.c();
                    this.f4193e.getAndAdd(bVar.f4191m);
                    if (g.i.b.e.b.e.e()) {
                        i2 += bVar.f4183e;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    return;
                } finally {
                    a(i2);
                }
            }
        }
    }

    public class d implements f {

        /* renamed from: g  reason: collision with root package name */
        public static final Object f4194g = new Object();

        /* renamed from: h  reason: collision with root package name */
        public static volatile int f4195h;

        /* renamed from: i  reason: collision with root package name */
        public static volatile d f4196i;
        public BlockingQueue<b> a;
        public c b;
        public final c.C0151a c = new C0152a();

        /* renamed from: d  reason: collision with root package name */
        public long f4197d = -1;

        /* renamed from: e  reason: collision with root package name */
        public AtomicInteger f4198e = new AtomicInteger();

        /* renamed from: f  reason: collision with root package name */
        public g.i.b.e.b.g f4199f = new b(this);

        /* renamed from: g.i.b.e.f.c.a.a$d$a  reason: collision with other inner class name */
        public class C0152a implements c.C0151a {
            public C0152a() {
            }
        }

        public class b implements g.i.b.e.b.g {
            public b(d dVar) {
            }

            public final void a(int i2, String str) {
                d.f4195h = g.i.b.e.b.e.f().intValue();
                g.i.b.e.h.b.c("halley-cloud-DetectorImpl", "refresh opType:" + i2 + " apn:" + str + " sOpType:" + d.f4195h);
            }
        }

        public static boolean b(List<b> list) {
            List<b> list2 = list;
            SharedPreferences a2 = j.a(false);
            int i2 = a2 != null ? a2.getInt("total_traffic", 0) : -1;
            int b2 = g.h.a.a.b("detect_total_traffic_limit", 4, 32768, 1024) << 10;
            SharedPreferences a3 = j.a(false);
            long j2 = a3 != null ? a3.getLong("next_clear_total_traffic_time", 0) : -1;
            if (j2 != 0 && System.currentTimeMillis() > j2) {
                j.d("next_clear_total_traffic_time", System.currentTimeMillis() + ((long) (g.h.a.a.b("detect_traffic_clear_interval", 1, 672, 24) * 60 * 60 * 1000)));
                g.i.b.e.h.b.c("halley-cloud-DetectorImpl", "clear total traffic reset nextClearTotalTraffic time.");
                SharedPreferences a4 = j.a(false);
                if (a4 != null) {
                    a4.edit().putInt("total_traffic", 0).commit();
                }
                i2 = 0;
            } else if (j2 == 0) {
                j.d("next_clear_total_traffic_time", System.currentTimeMillis() + ((long) (g.h.a.a.b("detect_traffic_clear_interval", 1, 672, 24) * 60 * 60 * 1000)));
                g.i.b.e.h.b.c("halley-cloud-DetectorImpl", "init nextClearTotalTrafficTime.");
            }
            if (i2 <= b2) {
                return true;
            }
            g.i.b.e.h.b.i("halley-cloud-DetectorImpl", "total traffic overflow, abandon detect task.And total traffic:".concat(String.valueOf(i2)));
            HashMap hashMap = new HashMap();
            hashMap.put("D32", String.valueOf(i2));
            for (int i3 = 0; i3 < list.size(); i3++) {
                list2.get(i3).n = list2.get(i3).f4191m;
                list2.get(i3).d("HLDetectEvent", -503, (String) null, hashMap, false);
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x00da A[Catch:{ all -> 0x017d }] */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x017c A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(java.util.List<g.i.b.e.f.c.a.a.b> r15) {
            /*
                r14 = this;
                r0 = 0
                java.lang.String r1 = "halley-cloud-DetectorImpl"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x017d }
                java.lang.String r3 = "beforeQueue and remainingQueueCapacity is:"
                r2.<init>(r3)     // Catch:{ all -> 0x017d }
                java.util.concurrent.atomic.AtomicInteger r3 = r14.f4198e     // Catch:{ all -> 0x017d }
                int r3 = r3.get()     // Catch:{ all -> 0x017d }
                r2.append(r3)     // Catch:{ all -> 0x017d }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x017d }
                g.i.b.e.h.b.c(r1, r2)     // Catch:{ all -> 0x017d }
                long r1 = r14.f4197d     // Catch:{ all -> 0x017d }
                r3 = -1
                r5 = 1000(0x3e8, float:1.401E-42)
                r6 = 1
                int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r7 == 0) goto L_0x0074
                java.lang.String r1 = "detect_received_interval"
                r2 = 3600(0xe10, float:5.045E-42)
                r3 = 5
                int r1 = g.h.a.a.b(r1, r6, r2, r3)     // Catch:{ all -> 0x017d }
                int r1 = r1 * 1000
                long r1 = (long) r1     // Catch:{ all -> 0x017d }
                long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x017d }
                long r7 = r14.f4197d     // Catch:{ all -> 0x017d }
                long r3 = r3 - r7
                int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r7 >= 0) goto L_0x0074
                java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x017d }
                r1.<init>()     // Catch:{ all -> 0x017d }
                r2 = 0
            L_0x0042:
                int r3 = r15.size()     // Catch:{ all -> 0x017d }
                if (r2 >= r3) goto L_0x006c
                java.lang.Object r3 = r15.get(r2)     // Catch:{ all -> 0x017d }
                g.i.b.e.f.c.a.a$b r3 = (g.i.b.e.f.c.a.a.b) r3     // Catch:{ all -> 0x017d }
                java.lang.Object r4 = r15.get(r2)     // Catch:{ all -> 0x017d }
                g.i.b.e.f.c.a.a$b r4 = (g.i.b.e.f.c.a.a.b) r4     // Catch:{ all -> 0x017d }
                int r4 = r4.f4191m     // Catch:{ all -> 0x017d }
                r3.n = r4     // Catch:{ all -> 0x017d }
                java.lang.Object r3 = r15.get(r2)     // Catch:{ all -> 0x017d }
                r8 = r3
                g.i.b.e.f.c.a.a$b r8 = (g.i.b.e.f.c.a.a.b) r8     // Catch:{ all -> 0x017d }
                java.lang.String r9 = "HLDetectEvent"
                r10 = -504(0xfffffffffffffe08, float:NaN)
                r11 = 0
                r13 = 0
                r12 = r1
                r8.d(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x017d }
                int r2 = r2 + 1
                goto L_0x0042
            L_0x006c:
                java.lang.String r1 = "halley-cloud-DetectorImpl"
                java.lang.String r2 = "receive data too fast, abandon data.."
                g.i.b.e.h.b.i(r1, r2)     // Catch:{ all -> 0x017d }
                goto L_0x00ca
            L_0x0074:
                java.util.concurrent.atomic.AtomicInteger r1 = r14.f4198e     // Catch:{ all -> 0x017d }
                int r1 = r1.get()     // Catch:{ all -> 0x017d }
                if (r1 >= 0) goto L_0x00cc
                java.lang.String r1 = "halley-cloud-DetectorImpl"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x017d }
                java.lang.String r3 = "queue is full and remainingQueue:"
                r2.<init>(r3)     // Catch:{ all -> 0x017d }
                java.util.concurrent.atomic.AtomicInteger r3 = r14.f4198e     // Catch:{ all -> 0x017d }
                int r3 = r3.get()     // Catch:{ all -> 0x017d }
                r2.append(r3)     // Catch:{ all -> 0x017d }
                java.lang.String r3 = ", and abandon data.."
                r2.append(r3)     // Catch:{ all -> 0x017d }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x017d }
                g.i.b.e.h.b.i(r1, r2)     // Catch:{ all -> 0x017d }
                java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x017d }
                r1.<init>()     // Catch:{ all -> 0x017d }
                r2 = 0
            L_0x00a0:
                int r3 = r15.size()     // Catch:{ all -> 0x017d }
                if (r2 >= r3) goto L_0x00ca
                java.lang.Object r3 = r15.get(r2)     // Catch:{ all -> 0x017d }
                g.i.b.e.f.c.a.a$b r3 = (g.i.b.e.f.c.a.a.b) r3     // Catch:{ all -> 0x017d }
                java.lang.Object r4 = r15.get(r2)     // Catch:{ all -> 0x017d }
                g.i.b.e.f.c.a.a$b r4 = (g.i.b.e.f.c.a.a.b) r4     // Catch:{ all -> 0x017d }
                int r4 = r4.f4191m     // Catch:{ all -> 0x017d }
                r3.n = r4     // Catch:{ all -> 0x017d }
                java.lang.Object r3 = r15.get(r2)     // Catch:{ all -> 0x017d }
                r7 = r3
                g.i.b.e.f.c.a.a$b r7 = (g.i.b.e.f.c.a.a.b) r7     // Catch:{ all -> 0x017d }
                java.lang.String r8 = "HLDetectEvent"
                r9 = -502(0xfffffffffffffe0a, float:NaN)
                r10 = 0
                r12 = 0
                r11 = r1
                r7.d(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x017d }
                int r2 = r2 + 1
                goto L_0x00a0
            L_0x00ca:
                r1 = 0
                goto L_0x00d8
            L_0x00cc:
                boolean r1 = g.i.b.e.b.e.e()     // Catch:{ all -> 0x017d }
                if (r1 == 0) goto L_0x00d7
                boolean r1 = b(r15)     // Catch:{ all -> 0x017d }
                goto L_0x00d8
            L_0x00d7:
                r1 = 1
            L_0x00d8:
                if (r1 == 0) goto L_0x017c
                long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x017d }
                r14.f4197d = r1     // Catch:{ all -> 0x017d }
                java.lang.Object r1 = f4194g     // Catch:{ all -> 0x017d }
                monitor-enter(r1)     // Catch:{ all -> 0x017d }
                java.util.concurrent.BlockingQueue<g.i.b.e.f.c.a.a$b> r2 = r14.a     // Catch:{ all -> 0x0179 }
                if (r2 == 0) goto L_0x00eb
                g.i.b.e.f.c.a.a$c r2 = r14.b     // Catch:{ all -> 0x0179 }
                if (r2 != 0) goto L_0x011a
            L_0x00eb:
                java.util.concurrent.atomic.AtomicInteger r2 = r14.f4198e     // Catch:{ all -> 0x0179 }
                java.lang.String r3 = "detect_num_limit"
                r4 = 100
                int r3 = g.h.a.a.b(r3, r6, r5, r4)     // Catch:{ all -> 0x0179 }
                r2.set(r3)     // Catch:{ all -> 0x0179 }
                java.util.concurrent.LinkedBlockingQueue r2 = new java.util.concurrent.LinkedBlockingQueue     // Catch:{ all -> 0x0179 }
                r2.<init>()     // Catch:{ all -> 0x0179 }
                r14.a = r2     // Catch:{ all -> 0x0179 }
                g.i.b.e.f.c.a.a$c r2 = new g.i.b.e.f.c.a.a$c     // Catch:{ all -> 0x0179 }
                java.util.concurrent.BlockingQueue<g.i.b.e.f.c.a.a$b> r3 = r14.a     // Catch:{ all -> 0x0179 }
                g.i.b.e.f.c.a.a$c$a r4 = r14.c     // Catch:{ all -> 0x0179 }
                java.util.concurrent.atomic.AtomicInteger r5 = r14.f4198e     // Catch:{ all -> 0x0179 }
                r2.<init>(r3, r4, r5)     // Catch:{ all -> 0x0179 }
                r14.b = r2     // Catch:{ all -> 0x0179 }
                java.lang.String r2 = "halley-cloud-DetectorImpl"
                g.i.b.e.b.g r3 = r14.f4199f     // Catch:{ all -> 0x0179 }
                g.i.b.e.b.e.a(r2, r3)     // Catch:{ all -> 0x0179 }
                java.lang.String r2 = "halley-cloud-DetectorImpl"
                java.lang.String r3 = "DetectThread init.."
                g.i.b.e.h.b.c(r2, r3)     // Catch:{ all -> 0x0179 }
            L_0x011a:
                java.lang.Integer r2 = g.i.b.e.b.e.f()     // Catch:{ all -> 0x0179 }
                int r2 = r2.intValue()     // Catch:{ all -> 0x0179 }
                f4195h = r2     // Catch:{ all -> 0x0179 }
                int r2 = g.i.b.e.b.e.f4112g     // Catch:{ all -> 0x0179 }
                r3 = 0
            L_0x0127:
                int r4 = r15.size()     // Catch:{ all -> 0x0179 }
                if (r3 >= r4) goto L_0x0153
                java.lang.Object r4 = r15.get(r3)     // Catch:{ all -> 0x0179 }
                g.i.b.e.f.c.a.a$b r4 = (g.i.b.e.f.c.a.a.b) r4     // Catch:{ all -> 0x0179 }
                int r5 = f4195h     // Catch:{ all -> 0x0179 }
                r4.f4186h = r2     // Catch:{ all -> 0x0179 }
                r4.f4187i = r5     // Catch:{ all -> 0x0179 }
                java.util.concurrent.BlockingQueue<g.i.b.e.f.c.a.a$b> r4 = r14.a     // Catch:{ all -> 0x0179 }
                java.lang.Object r5 = r15.get(r3)     // Catch:{ all -> 0x0179 }
                r4.offer(r5)     // Catch:{ all -> 0x0179 }
                java.util.concurrent.atomic.AtomicInteger r4 = r14.f4198e     // Catch:{ all -> 0x0179 }
                java.lang.Object r5 = r15.get(r3)     // Catch:{ all -> 0x0179 }
                g.i.b.e.f.c.a.a$b r5 = (g.i.b.e.f.c.a.a.b) r5     // Catch:{ all -> 0x0179 }
                int r5 = r5.f4191m     // Catch:{ all -> 0x0179 }
                int r5 = -r5
                r4.getAndAdd(r5)     // Catch:{ all -> 0x0179 }
                int r3 = r3 + 1
                goto L_0x0127
            L_0x0153:
                g.i.b.e.f.c.a.a$c r15 = r14.b     // Catch:{ all -> 0x0179 }
                boolean r15 = r15.b     // Catch:{ all -> 0x0179 }
                if (r15 != 0) goto L_0x015e
                g.i.b.e.f.c.a.a$c r15 = r14.b     // Catch:{ all -> 0x0179 }
                r15.start()     // Catch:{ all -> 0x0179 }
            L_0x015e:
                monitor-exit(r1)     // Catch:{ all -> 0x0179 }
                java.lang.String r15 = "halley-cloud-DetectorImpl"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x017d }
                java.lang.String r2 = "insert into detect queue..remaining capacity:"
                r1.<init>(r2)     // Catch:{ all -> 0x017d }
                java.util.concurrent.atomic.AtomicInteger r2 = r14.f4198e     // Catch:{ all -> 0x017d }
                int r2 = r2.get()     // Catch:{ all -> 0x017d }
                r1.append(r2)     // Catch:{ all -> 0x017d }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x017d }
                g.i.b.e.h.b.c(r15, r1)     // Catch:{ all -> 0x017d }
                return r6
            L_0x0179:
                r15 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0179 }
                throw r15     // Catch:{ all -> 0x017d }
            L_0x017c:
                return r0
            L_0x017d:
                r15 = move-exception
                r15.printStackTrace()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.f.c.a.a.d.a(java.util.List):boolean");
        }
    }

    public final class e extends b {
        public int o;
        public boolean p = false;

        public e(String str, byte b, List<String> list) {
            super(str, b, list);
        }

        /* JADX WARNING: Removed duplicated region for block: B:58:0x0146  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x0162  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean e(java.lang.String r16) {
            /*
                r15 = this;
                r7 = r15
                java.lang.String r1 = ","
                java.lang.String r2 = "halley-cloud-AbsDetectTask"
                java.lang.StringBuffer r3 = new java.lang.StringBuffer
                r3.<init>()
                r4 = 0
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00a9 }
                r5 = 21
                if (r0 < r5) goto L_0x0099
                android.content.Context r0 = g.i.b.e.c.f4125g     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r5 = "connectivity"
                java.lang.Object r0 = r0.getSystemService(r5)     // Catch:{ Exception -> 0x00a9 }
                android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ Exception -> 0x00a9 }
                android.net.Network[] r5 = r0.getAllNetworks()     // Catch:{ Exception -> 0x00a9 }
                r6 = 0
            L_0x0020:
                int r8 = r5.length     // Catch:{ Exception -> 0x00a9 }
                if (r6 >= r8) goto L_0x0099
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r9 = "length:"
                r8.<init>(r9)     // Catch:{ Exception -> 0x00a9 }
                int r9 = r5.length     // Catch:{ Exception -> 0x00a9 }
                r8.append(r9)     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r9 = " seqId:"
                r8.append(r9)     // Catch:{ Exception -> 0x00a9 }
                r9 = r5[r6]     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00a9 }
                r8.append(r9)     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x00a9 }
                g.i.b.e.h.b.c(r2, r8)     // Catch:{ Exception -> 0x00a9 }
                r8 = r5[r6]     // Catch:{ Exception -> 0x00a9 }
                android.net.NetworkInfo r8 = r0.getNetworkInfo(r8)     // Catch:{ Exception -> 0x00a9 }
                boolean r8 = r8.isConnected()     // Catch:{ Exception -> 0x00a9 }
                if (r8 == 0) goto L_0x0096
                r5 = r5[r6]     // Catch:{ Exception -> 0x00a9 }
                android.net.LinkProperties r0 = r0.getLinkProperties(r5)     // Catch:{ Exception -> 0x00a9 }
                java.util.List r0 = r0.getDnsServers()     // Catch:{ Exception -> 0x00a9 }
                r5 = 0
            L_0x005a:
                int r6 = r0.size()     // Catch:{ Exception -> 0x00a9 }
                if (r5 >= r6) goto L_0x0099
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r8 = "inetAddressList["
                r6.<init>(r8)     // Catch:{ Exception -> 0x00a9 }
                r6.append(r5)     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r8 = "]:"
                r6.append(r8)     // Catch:{ Exception -> 0x00a9 }
                java.lang.Object r8 = r0.get(r5)     // Catch:{ Exception -> 0x00a9 }
                java.net.InetAddress r8 = (java.net.InetAddress) r8     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r8 = r8.getHostAddress()     // Catch:{ Exception -> 0x00a9 }
                r6.append(r8)     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00a9 }
                g.i.b.e.h.b.c(r2, r6)     // Catch:{ Exception -> 0x00a9 }
                java.lang.Object r6 = r0.get(r5)     // Catch:{ Exception -> 0x00a9 }
                java.net.InetAddress r6 = (java.net.InetAddress) r6     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r6 = r6.getHostAddress()     // Catch:{ Exception -> 0x00a9 }
                r3.append(r6)     // Catch:{ Exception -> 0x00a9 }
                r3.append(r1)     // Catch:{ Exception -> 0x00a9 }
                int r5 = r5 + 1
                goto L_0x005a
            L_0x0096:
                int r6 = r6 + 1
                goto L_0x0020
            L_0x0099:
                int r0 = r3.capacity()     // Catch:{ Exception -> 0x00a9 }
                if (r0 <= 0) goto L_0x00ad
                int r0 = r3.length()     // Catch:{ Exception -> 0x00a9 }
                int r0 = r0 + -1
                r3.deleteCharAt(r0)     // Catch:{ Exception -> 0x00a9 }
                goto L_0x00ad
            L_0x00a9:
                r0 = move-exception
                r0.printStackTrace()
            L_0x00ad:
                r5 = -1
                r8 = 0
                r9 = 1
                int r0 = r7.f4183e     // Catch:{ all -> 0x00f1 }
                int r0 = r0 + 128
                r7.f4183e = r0     // Catch:{ all -> 0x00f1 }
                long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00f1 }
                java.net.InetAddress[] r0 = java.net.InetAddress.getAllByName(r16)     // Catch:{ all -> 0x00f1 }
                long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00f1 }
                long r12 = r12 - r10
                boolean r10 = r7.p     // Catch:{ all -> 0x00f1 }
                if (r10 == 0) goto L_0x00dc
                if (r0 == 0) goto L_0x00dc
                int r10 = r0.length     // Catch:{ all -> 0x00f1 }
                java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ all -> 0x00f1 }
                r11 = 0
            L_0x00ce:
                int r14 = r0.length     // Catch:{ all -> 0x00ec }
                if (r11 >= r14) goto L_0x00ef
                r14 = r0[r11]     // Catch:{ all -> 0x00ec }
                java.lang.String r14 = r14.getHostAddress()     // Catch:{ all -> 0x00ec }
                r10[r11] = r14     // Catch:{ all -> 0x00ec }
                int r11 = r11 + 1
                goto L_0x00ce
            L_0x00dc:
                if (r0 == 0) goto L_0x00ee
                int r10 = r0.length     // Catch:{ all -> 0x00f1 }
                if (r10 == 0) goto L_0x00ee
                java.lang.String[] r10 = new java.lang.String[r9]     // Catch:{ all -> 0x00f1 }
                r0 = r0[r4]     // Catch:{ all -> 0x00ec }
                java.lang.String r0 = r0.getHostAddress()     // Catch:{ all -> 0x00ec }
                r10[r4] = r0     // Catch:{ all -> 0x00ec }
                goto L_0x00ef
            L_0x00ec:
                r0 = move-exception
                goto L_0x00f3
            L_0x00ee:
                r10 = r8
            L_0x00ef:
                r0 = 0
                goto L_0x013b
            L_0x00f1:
                r0 = move-exception
                r10 = r8
            L_0x00f3:
                r0.printStackTrace()
                boolean r11 = g.i.b.e.b.e.f4109d
                if (r11 != 0) goto L_0x00fe
                r0 = -505(0xfffffffffffffe07, float:NaN)
            L_0x00fc:
                r12 = r5
                goto L_0x013b
            L_0x00fe:
                boolean r11 = r15.i()
                if (r11 == 0) goto L_0x0107
                r0 = -500(0xfffffffffffffe0c, float:NaN)
                goto L_0x00fc
            L_0x0107:
                r8 = -515(0xfffffffffffffdfd, float:NaN)
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.Class r12 = r0.getClass()
                java.lang.String r12 = r12.getSimpleName()
                r11.append(r12)
                java.lang.String r12 = "("
                r11.append(r12)
                java.lang.String r12 = r0.getLocalizedMessage()
                r11.append(r12)
                java.lang.String r12 = ")"
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                boolean r0 = r0 instanceof java.net.UnknownHostException
                if (r0 == 0) goto L_0x0137
                r0 = -512(0xfffffffffffffe00, float:NaN)
                r12 = r5
                r8 = r11
                goto L_0x013b
            L_0x0137:
                r12 = r5
                r8 = r11
                r0 = -515(0xfffffffffffffdfd, float:NaN)
            L_0x013b:
                int r11 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r11 == 0) goto L_0x0162
                int r5 = r7.o
                long r5 = (long) r5
                int r11 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r11 >= 0) goto L_0x0162
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "dnsCostTime is too small to abandon, dnsCostTime:"
                r0.<init>(r1)
                r0.append(r12)
                java.lang.String r1 = " and limitTime:"
                r0.append(r1)
                int r1 = r7.o
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                g.i.b.e.h.b.c(r2, r0)
                return r4
            L_0x0162:
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                java.lang.String r6 = java.lang.String.valueOf(r12)
                java.lang.String r11 = "D11"
                r5.put(r11, r6)
                if (r10 == 0) goto L_0x019b
                int r6 = r10.length
                if (r6 == 0) goto L_0x019b
                java.lang.StringBuffer r2 = new java.lang.StringBuffer
                r2.<init>()
            L_0x017a:
                int r6 = r10.length
                if (r4 >= r6) goto L_0x0188
                r6 = r10[r4]
                r2.append(r6)
                r2.append(r1)
                int r4 = r4 + 1
                goto L_0x017a
            L_0x0188:
                int r1 = r2.length()
                int r1 = r1 + -1
                r2.deleteCharAt(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "D12"
                r5.put(r2, r1)
                goto L_0x01a0
            L_0x019b:
                java.lang.String r1 = "queryIps is null"
                g.i.b.e.h.b.i(r2, r1)
            L_0x01a0:
                int r1 = r3.capacity()
                if (r1 <= 0) goto L_0x01af
                java.lang.String r1 = r3.toString()
                java.lang.String r2 = "D10"
                r5.put(r2, r1)
            L_0x01af:
                java.lang.String r1 = "D7"
                r2 = r16
                r5.put(r1, r2)
                boolean r6 = r7.a
                if (r6 == 0) goto L_0x01bd
                java.lang.String r1 = "HLDnsDetectEvent"
                goto L_0x01bf
            L_0x01bd:
                java.lang.String r1 = "HLNotRealDnsDetectEvent"
            L_0x01bf:
                r2 = r1
                r1 = r15
                r3 = r0
                r4 = r8
                r1.d(r2, r3, r4, r5, r6)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.f.c.a.a.e.e(java.lang.String):boolean");
        }

        public final void f() {
            byte[] bArr;
            boolean z = false;
            this.o = g.h.a.a.b("detect_dns_costtime_abandon_limit", 0, 100, 0);
            Map<String, byte[]> map = this.c;
            if (map != null && map.containsKey("is_dns_query_all") && (bArr = this.c.get("is_dns_query_all")) != null && bArr.length == 1 && bArr[0] == 1) {
                z = true;
            }
            this.p = z;
        }
    }

    public interface f {
    }

    public final class g extends b {
        public int o;
        public int p;
        public byte[] q;

        public g(String str, byte b, List<String> list) {
            super(str, b, list);
        }

        /* JADX WARNING: Removed duplicated region for block: B:105:0x01fa A[SYNTHETIC, Splitter:B:105:0x01fa] */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x0202 A[Catch:{ all -> 0x01fe }] */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x0207 A[Catch:{ all -> 0x01fe }] */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x0232  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x0277  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x027a  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00ae A[Catch:{ all -> 0x0138 }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00f7  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0124 A[Catch:{ all -> 0x012d }] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0129 A[Catch:{ all -> 0x012d }] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x014b A[Catch:{ all -> 0x0286, all -> 0x028e }] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x0152 A[Catch:{ all -> 0x0286, all -> 0x028e }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean e(java.lang.String r25) {
            /*
                r24 = this;
                r7 = r24
                r1 = r25
                long r2 = android.os.SystemClock.elapsedRealtime()
                java.lang.String r0 = java.lang.String.valueOf(r25)
                java.lang.String r4 = "start detect ipTask:"
                java.lang.String r0 = r4.concat(r0)
                java.lang.String r4 = "halley-cloud-AbsDetectTask"
                g.i.b.e.h.b.c(r4, r0)
                java.lang.String r0 = r25.trim()
                java.lang.String r5 = ":"
                java.lang.String[] r0 = r0.split(r5)
                int r5 = r0.length
                r6 = 65535(0xffff, float:9.1834E-41)
                java.lang.String r8 = "port is not correct.. when dest:"
                r9 = 2
                r10 = 1
                r11 = 0
                if (r5 != r9) goto L_0x0040
                r5 = r0[r11]
                r0 = r0[r10]
                int r0 = java.lang.Integer.parseInt(r0)
                if (r0 < 0) goto L_0x0038
                if (r0 <= r6) goto L_0x0086
            L_0x0038:
                java.lang.String r0 = r8.concat(r1)
            L_0x003c:
                g.i.b.e.h.b.i(r4, r0)
                return r11
            L_0x0040:
                int r5 = r0.length
                if (r5 <= r9) goto L_0x02a8
                int r5 = r0.length
                int r5 = r5 - r10
                r5 = r0[r5]
                int r5 = java.lang.Integer.parseInt(r5)
                if (r5 < 0) goto L_0x029f
                if (r5 <= r6) goto L_0x0051
                goto L_0x029f
            L_0x0051:
                int r6 = r0.length
                int r6 = r6 - r10
                r0 = r0[r6]
                int r0 = r0.length()
                int r6 = r25.length()
                int r6 = r6 - r0
                int r6 = r6 - r10
                java.lang.String r0 = r1.substring(r11, r6)
                java.lang.String r6 = java.lang.String.valueOf(r0)
                java.lang.String r8 = "after cut ipv6:"
                java.lang.String r6 = r8.concat(r6)
                g.i.b.e.h.b.c(r4, r6)
                boolean r6 = g.i.b.e.h.e.h(r0)
                if (r6 != 0) goto L_0x0081
                java.lang.String r0 = java.lang.String.valueOf(r0)
                java.lang.String r1 = "detect ip is not valid when ip:"
                java.lang.String r0 = r1.concat(r0)
                goto L_0x003c
            L_0x0081:
                r23 = r5
                r5 = r0
                r0 = r23
            L_0x0086:
                java.net.InetSocketAddress r6 = new java.net.InetSocketAddress
                r6.<init>(r5, r0)
                int r0 = r7.f4183e     // Catch:{ all -> 0x013b }
                int r0 = r0 + 128
                r7.f4183e = r0     // Catch:{ all -> 0x013b }
                java.net.Socket r9 = new java.net.Socket     // Catch:{ all -> 0x013b }
                r9.<init>()     // Catch:{ all -> 0x013b }
                int r0 = r7.p     // Catch:{ all -> 0x0138 }
                r9.setSoTimeout(r0)     // Catch:{ all -> 0x0138 }
                long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0138 }
                int r0 = r7.o     // Catch:{ all -> 0x0138 }
                r9.connect(r6, r0)     // Catch:{ all -> 0x0138 }
                long r16 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0138 }
                long r14 = r16 - r14
                byte[] r0 = r7.q     // Catch:{ all -> 0x0138 }
                if (r0 == 0) goto L_0x00f7
                int r6 = r7.f4183e     // Catch:{ all -> 0x0138 }
                int r0 = r0.length     // Catch:{ all -> 0x0138 }
                int r6 = r6 + r0
                r7.f4183e = r6     // Catch:{ all -> 0x0138 }
                long r16 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0138 }
                java.io.OutputStream r6 = r9.getOutputStream()     // Catch:{ all -> 0x00f0 }
                byte[] r0 = r7.q     // Catch:{ all -> 0x00ec }
                r6.write(r0)     // Catch:{ all -> 0x00ec }
                r6.flush()     // Catch:{ all -> 0x00ec }
                long r18 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00ec }
                long r16 = r18 - r16
                long r18 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00ec }
                java.io.InputStream r20 = r9.getInputStream()     // Catch:{ all -> 0x00e6 }
                r20.read()     // Catch:{ all -> 0x00e0 }
                long r21 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00e0 }
                long r21 = r21 - r18
                r12 = r16
                r10 = r21
                goto L_0x00fe
            L_0x00e0:
                r0 = move-exception
                r12 = r16
                r10 = r18
                goto L_0x0144
            L_0x00e6:
                r0 = move-exception
                r12 = r16
                r10 = r18
                goto L_0x0142
            L_0x00ec:
                r0 = move-exception
                r12 = r16
                goto L_0x00f4
            L_0x00f0:
                r0 = move-exception
                r12 = r16
                r6 = 0
            L_0x00f4:
                r10 = -1
                goto L_0x0142
            L_0x00f7:
                r6 = 0
                r10 = -1
                r12 = -1
                r20 = 0
            L_0x00fe:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0136 }
                java.lang.String r8 = "ip detect time:"
                r0.<init>(r8)     // Catch:{ all -> 0x0136 }
                r0.append(r14)     // Catch:{ all -> 0x0136 }
                java.lang.String r8 = " write time:"
                r0.append(r8)     // Catch:{ all -> 0x0136 }
                r0.append(r12)     // Catch:{ all -> 0x0136 }
                java.lang.String r8 = " read time:"
                r0.append(r8)     // Catch:{ all -> 0x0136 }
                r0.append(r10)     // Catch:{ all -> 0x0136 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0136 }
                g.i.b.e.h.b.c(r4, r0)     // Catch:{ all -> 0x0136 }
                r9.close()     // Catch:{ all -> 0x012d }
                if (r6 == 0) goto L_0x0127
                r6.close()     // Catch:{ all -> 0x012d }
            L_0x0127:
                if (r20 == 0) goto L_0x0131
                r20.close()     // Catch:{ all -> 0x012d }
                goto L_0x0131
            L_0x012d:
                r0 = move-exception
                r0.printStackTrace()
            L_0x0131:
                r4 = 0
                r18 = 0
                goto L_0x0213
            L_0x0136:
                r0 = move-exception
                goto L_0x0144
            L_0x0138:
                r0 = move-exception
                r6 = 0
                goto L_0x013e
            L_0x013b:
                r0 = move-exception
                r6 = 0
                r9 = 0
            L_0x013e:
                r10 = -1
                r12 = -1
            L_0x0142:
                r20 = 0
            L_0x0144:
                r0.printStackTrace()     // Catch:{ all -> 0x0286 }
                boolean r4 = g.i.b.e.b.e.f4109d     // Catch:{ all -> 0x0286 }
                if (r4 != 0) goto L_0x0152
                r0 = -505(0xfffffffffffffe07, float:NaN)
                r4 = -505(0xfffffffffffffe07, float:NaN)
            L_0x014f:
                r8 = 0
                goto L_0x01f8
            L_0x0152:
                boolean r4 = r24.i()     // Catch:{ all -> 0x0286 }
                if (r4 == 0) goto L_0x015d
                r0 = -500(0xfffffffffffffe0c, float:NaN)
                r4 = -500(0xfffffffffffffe0c, float:NaN)
                goto L_0x014f
            L_0x015d:
                r4 = -515(0xfffffffffffffdfd, float:NaN)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0286 }
                r8.<init>()     // Catch:{ all -> 0x0286 }
                java.lang.Class r14 = r0.getClass()     // Catch:{ all -> 0x0286 }
                java.lang.String r14 = r14.getName()     // Catch:{ all -> 0x0286 }
                r8.append(r14)     // Catch:{ all -> 0x0286 }
                java.lang.String r14 = "("
                r8.append(r14)     // Catch:{ all -> 0x0286 }
                java.lang.String r14 = r0.getLocalizedMessage()     // Catch:{ all -> 0x0286 }
                r8.append(r14)     // Catch:{ all -> 0x0286 }
                java.lang.String r14 = ")"
                r8.append(r14)     // Catch:{ all -> 0x0286 }
                java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0286 }
                boolean r14 = r0 instanceof java.net.SocketTimeoutException     // Catch:{ all -> 0x0286 }
                if (r14 == 0) goto L_0x01b2
                java.lang.String r4 = r0.getLocalizedMessage()     // Catch:{ all -> 0x0286 }
                if (r4 == 0) goto L_0x01a9
                java.lang.String r14 = r4.toLowerCase()     // Catch:{ all -> 0x0286 }
                java.lang.String r15 = "connect"
                boolean r14 = r14.contains(r15)     // Catch:{ all -> 0x0286 }
                if (r14 != 0) goto L_0x01a6
                java.lang.String r4 = r4.toLowerCase()     // Catch:{ all -> 0x0286 }
                java.lang.String r14 = "connection"
                boolean r4 = r4.contains(r14)     // Catch:{ all -> 0x0286 }
                if (r4 == 0) goto L_0x01a9
            L_0x01a6:
                r18 = 1
                goto L_0x01ab
            L_0x01a9:
                r18 = 0
            L_0x01ab:
                if (r18 == 0) goto L_0x01b0
                r4 = -509(0xfffffffffffffe03, float:NaN)
                goto L_0x01b2
            L_0x01b0:
                r4 = -510(0xfffffffffffffe02, float:NaN)
            L_0x01b2:
                boolean r14 = r0 instanceof java.net.ConnectException     // Catch:{ all -> 0x0286 }
                if (r14 == 0) goto L_0x01b8
                r4 = -511(0xfffffffffffffe01, float:NaN)
            L_0x01b8:
                boolean r14 = r0 instanceof java.net.SocketException     // Catch:{ all -> 0x0286 }
                if (r14 == 0) goto L_0x01be
                r4 = -513(0xfffffffffffffdff, float:NaN)
            L_0x01be:
                boolean r14 = r0 instanceof java.io.IOException     // Catch:{ all -> 0x0286 }
                if (r14 == 0) goto L_0x01c4
                r4 = -514(0xfffffffffffffdfe, float:NaN)
            L_0x01c4:
                java.lang.String r14 = r0.getMessage()     // Catch:{ all -> 0x0286 }
                if (r14 == 0) goto L_0x01f8
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0286 }
                java.lang.String r14 = "Permission denied"
                boolean r14 = r0.contains(r14)     // Catch:{ all -> 0x0286 }
                if (r14 != 0) goto L_0x01f4
                java.lang.String r14 = "ECONNREFUSED"
                boolean r14 = r0.contains(r14)     // Catch:{ all -> 0x0286 }
                if (r14 == 0) goto L_0x01df
                goto L_0x01f4
            L_0x01df:
                java.lang.String r14 = "EHOSTUNREACH"
                boolean r14 = r0.contains(r14)     // Catch:{ all -> 0x0286 }
                if (r14 != 0) goto L_0x01ef
                java.lang.String r14 = "No route to host"
                boolean r0 = r0.contains(r14)     // Catch:{ all -> 0x0286 }
                if (r0 == 0) goto L_0x01f8
            L_0x01ef:
                r0 = -506(0xfffffffffffffe06, float:NaN)
                r4 = -506(0xfffffffffffffe06, float:NaN)
                goto L_0x01f8
            L_0x01f4:
                r0 = -507(0xfffffffffffffe05, float:NaN)
                r4 = -507(0xfffffffffffffe05, float:NaN)
            L_0x01f8:
                if (r9 == 0) goto L_0x0200
                r9.close()     // Catch:{ all -> 0x01fe }
                goto L_0x0200
            L_0x01fe:
                r0 = move-exception
                goto L_0x020b
            L_0x0200:
                if (r6 == 0) goto L_0x0205
                r6.close()     // Catch:{ all -> 0x01fe }
            L_0x0205:
                if (r20 == 0) goto L_0x020e
                r20.close()     // Catch:{ all -> 0x01fe }
                goto L_0x020e
            L_0x020b:
                r0.printStackTrace()
            L_0x020e:
                r18 = r4
                r4 = r8
                r14 = -1
            L_0x0213:
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r14)
                java.lang.String r6 = r6.toString()
                java.lang.String r8 = "D13"
                r0.put(r8, r6)
                java.lang.String r6 = "D12"
                r0.put(r6, r5)
                byte[] r5 = r7.q
                if (r5 == 0) goto L_0x0258
                java.lang.String r5 = java.lang.String.valueOf(r10)
                java.lang.String r6 = "D17"
                r0.put(r6, r5)
                java.lang.String r5 = java.lang.String.valueOf(r12)
                java.lang.String r6 = "D16"
                r0.put(r6, r5)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                byte[] r6 = r7.q
                int r6 = r6.length
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "D20"
                r0.put(r6, r5)
            L_0x0258:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                long r8 = android.os.SystemClock.elapsedRealtime()
                long r8 = r8 - r2
                r5.append(r8)
                java.lang.String r2 = r5.toString()
                java.lang.String r3 = "D18"
                r0.put(r3, r2)
                java.lang.String r2 = "D7"
                r0.put(r2, r1)
                boolean r6 = r7.a
                if (r6 == 0) goto L_0x027a
                java.lang.String r2 = "HLIpDetectEvent"
                goto L_0x027c
            L_0x027a:
                java.lang.String r2 = "HLNotRealIpDetectEvent"
            L_0x027c:
                r1 = r24
                r3 = r18
                r5 = r0
                r1.d(r2, r3, r4, r5, r6)
                r1 = 1
                return r1
            L_0x0286:
                r0 = move-exception
                r1 = r0
                if (r9 == 0) goto L_0x0290
                r9.close()     // Catch:{ all -> 0x028e }
                goto L_0x0290
            L_0x028e:
                r0 = move-exception
                goto L_0x029b
            L_0x0290:
                if (r6 == 0) goto L_0x0295
                r6.close()     // Catch:{ all -> 0x028e }
            L_0x0295:
                if (r20 == 0) goto L_0x029e
                r20.close()     // Catch:{ all -> 0x028e }
                goto L_0x029e
            L_0x029b:
                r0.printStackTrace()
            L_0x029e:
                throw r1
            L_0x029f:
                java.lang.String r0 = r8.concat(r1)
                g.i.b.e.h.b.i(r4, r0)
                r2 = 0
                return r2
            L_0x02a8:
                r2 = 0
                java.lang.String r0 = "ipTask is abandoned because dest is invalid:"
                java.lang.String r0 = r0.concat(r1)
                g.i.b.e.h.b.i(r4, r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.f.c.a.a.g.e(java.lang.String):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
            r0 = r3.c.get("connect_timeout");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void f() {
            /*
                r3 = this;
                java.util.Map<java.lang.String, byte[]> r0 = r3.c
                if (r0 == 0) goto L_0x0020
                java.lang.String r1 = "connect_timeout"
                boolean r0 = r0.containsKey(r1)
                if (r0 == 0) goto L_0x0020
                java.util.Map<java.lang.String, byte[]> r0 = r3.c
                java.lang.Object r0 = r0.get(r1)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L_0x0020
                int r1 = r0.length
                r2 = 1
                if (r1 != r2) goto L_0x0020
                r1 = 0
                byte r0 = r0[r1]
                int r0 = r0 * 1000
                goto L_0x0022
            L_0x0020:
                r0 = 2000(0x7d0, float:2.803E-42)
            L_0x0022:
                r3.o = r0
                int r0 = r3.h()
                r3.p = r0
                byte[] r0 = r3.g()
                r3.q = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.f.c.a.a.g.f():void");
        }
    }

    public final class h extends b {
        public int o;
        public int p;
        public byte[] q;
        public byte r;
        public long s;
        public long t = -1;
        public long u = -1;
        public long v = -1;

        /* renamed from: g.i.b.e.f.c.a.a$h$a  reason: collision with other inner class name */
        public class C0153a extends SSLSocketFactory {
            public C0153a() {
            }

            public final Socket createSocket(String str, int i2) {
                return null;
            }

            public final Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) {
                return null;
            }

            public final Socket createSocket(InetAddress inetAddress, int i2) {
                return null;
            }

            public final Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) {
                return null;
            }

            public final Socket createSocket(Socket socket, String str, int i2, boolean z) {
                h.this.t = SystemClock.elapsedRealtime();
                h hVar = h.this;
                int i3 = hVar.o - ((int) (hVar.t - hVar.s));
                if (i3 <= 0) {
                    i3 = 0;
                }
                StringBuilder sb = new StringBuilder("handshakeTimeout:");
                sb.append(i3);
                sb.append(" and connectTime:");
                h hVar2 = h.this;
                sb.append(hVar2.t - hVar2.s);
                g.i.b.e.h.b.c("halley-cloud-AbsDetectTask", sb.toString());
                SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getInsecure(i3, (SSLSessionCache) null);
                SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(socket, str, i2, z);
                sSLSocket.setEnabledProtocols(sSLSocket.getEnabledProtocols());
                sSLCertificateSocketFactory.setUseSessionTickets(sSLSocket, false);
                sSLCertificateSocketFactory.setHostname(sSLSocket, str);
                h.this.u = SystemClock.elapsedRealtime();
                sSLSocket.startHandshake();
                h.this.v = SystemClock.elapsedRealtime();
                return sSLSocket;
            }

            public final String[] getDefaultCipherSuites() {
                return new String[0];
            }

            public final String[] getSupportedCipherSuites() {
                return new String[0];
            }
        }

        public h(String str, byte b, List<String> list) {
            super(str, b, list);
        }

        public static void j(HttpURLConnection httpURLConnection, OutputStream outputStream) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x02ac  */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x0307  */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x031a  */
        /* JADX WARNING: Removed duplicated region for block: B:157:0x0363  */
        /* JADX WARNING: Removed duplicated region for block: B:160:0x037f  */
        /* JADX WARNING: Removed duplicated region for block: B:161:0x0382  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x010f A[SYNTHETIC, Splitter:B:43:0x010f] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0133 A[Catch:{ all -> 0x012d, all -> 0x01c7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0161  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x01e4 A[Catch:{ all -> 0x038f }] */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x01e9 A[Catch:{ all -> 0x038f }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean e(java.lang.String r25) {
            /*
                r24 = this;
                r7 = r24
                r1 = r25
                java.lang.String r2 = "https"
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                long r3 = android.os.SystemClock.elapsedRealtime()
                java.lang.String r0 = java.lang.String.valueOf(r25)
                java.lang.String r6 = "start detect urlTask:"
                java.lang.String r0 = r6.concat(r0)
                java.lang.String r6 = "halley-cloud-AbsDetectTask"
                g.i.b.e.h.b.f(r6, r0)
                r8 = 0
                java.net.URL r9 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0394 }
                r9.<init>(r1)     // Catch:{ MalformedURLException -> 0x0394 }
                java.lang.String r0 = r9.getHost()
                r10 = -1
                long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x003c }
                java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch:{ all -> 0x003c }
                long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x003c }
                long r14 = r14 - r12
                java.lang.String r0 = r0.getHostAddress()     // Catch:{ all -> 0x003c }
                goto L_0x0043
            L_0x003c:
                r0 = move-exception
                r0.printStackTrace()
                java.lang.String r0 = ""
                r14 = r10
            L_0x0043:
                java.lang.String r12 = java.lang.String.valueOf(r14)
                java.lang.String r13 = "D11"
                r5.put(r13, r12)
                boolean r12 = android.text.TextUtils.isEmpty(r0)
                if (r12 != 0) goto L_0x0057
                java.lang.String r12 = "D12"
                r5.put(r12, r0)
            L_0x0057:
                r14 = 1
                java.lang.String r0 = r9.getProtocol()     // Catch:{ all -> 0x01d5 }
                java.lang.String r0 = r0.toLowerCase()     // Catch:{ all -> 0x01d5 }
                boolean r0 = r0.startsWith(r2)     // Catch:{ all -> 0x01d5 }
                if (r0 == 0) goto L_0x007b
                java.net.URLConnection r0 = r9.openConnection()     // Catch:{ all -> 0x0075 }
                javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch:{ all -> 0x0075 }
                g.i.b.e.f.c.a.a$h$a r9 = new g.i.b.e.f.c.a.a$h$a     // Catch:{ all -> 0x0075 }
                r9.<init>()     // Catch:{ all -> 0x0075 }
                r0.setSSLSocketFactory(r9)     // Catch:{ all -> 0x0075 }
                goto L_0x0083
            L_0x0075:
                r0 = move-exception
                r9 = 0
            L_0x0077:
                r12 = 0
                r15 = -1
                goto L_0x01d9
            L_0x007b:
                r7.t = r10     // Catch:{ all -> 0x01d5 }
                java.net.URLConnection r0 = r9.openConnection()     // Catch:{ all -> 0x01d5 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ all -> 0x01d5 }
            L_0x0083:
                r9 = r0
                r9.setDoInput(r8)     // Catch:{ all -> 0x01d2 }
                r9.setDoOutput(r8)     // Catch:{ all -> 0x01d2 }
                r9.setUseCaches(r8)     // Catch:{ all -> 0x01d2 }
                r9.setInstanceFollowRedirects(r8)     // Catch:{ all -> 0x01d2 }
                int r0 = r7.o     // Catch:{ all -> 0x01d2 }
                r9.setConnectTimeout(r0)     // Catch:{ all -> 0x01d2 }
                int r0 = r7.p     // Catch:{ all -> 0x01d2 }
                r9.setReadTimeout(r0)     // Catch:{ all -> 0x01d2 }
                java.lang.String r0 = "Accept-Encoding"
                java.lang.String r15 = "identity"
                r9.setRequestProperty(r0, r15)     // Catch:{ all -> 0x01d2 }
                java.lang.String r0 = "Connection"
                java.lang.String r15 = "close"
                r9.setRequestProperty(r0, r15)     // Catch:{ all -> 0x01d2 }
                byte r0 = r7.r     // Catch:{ all -> 0x01d2 }
                if (r0 == 0) goto L_0x00c9
                if (r0 != r14) goto L_0x00c1
                java.lang.String r0 = "POST"
                r9.setRequestMethod(r0)     // Catch:{ all -> 0x00bf }
                r9.setDoOutput(r14)     // Catch:{ all -> 0x00bf }
                byte[] r0 = r7.q     // Catch:{ all -> 0x00bf }
                if (r0 == 0) goto L_0x00c9
                int r0 = r0.length     // Catch:{ all -> 0x00bf }
                if (r0 == 0) goto L_0x00c9
                r15 = 1
                goto L_0x00ca
            L_0x00bf:
                r0 = move-exception
                goto L_0x0077
            L_0x00c1:
                r15 = 2
                if (r0 != r15) goto L_0x00c9
                java.lang.String r0 = "HEAD"
                r9.setRequestMethod(r0)     // Catch:{ all -> 0x00bf }
            L_0x00c9:
                r15 = 0
            L_0x00ca:
                int r0 = r7.f4183e     // Catch:{ all -> 0x01cc }
                int r0 = r0 + 128
                r7.f4183e = r0     // Catch:{ all -> 0x01cc }
                long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01cc }
                r7.s = r13     // Catch:{ all -> 0x01cc }
                r9.connect()     // Catch:{ all -> 0x01cc }
                long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01cc }
                long r10 = r7.s     // Catch:{ all -> 0x01cc }
                long r13 = r13 - r10
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cc }
                java.lang.String r10 = "connect time:"
                r0.<init>(r10)     // Catch:{ all -> 0x01cc }
                r0.append(r13)     // Catch:{ all -> 0x01cc }
                java.lang.String r10 = " SSLHandshakeTime:"
                r0.append(r10)     // Catch:{ all -> 0x01cc }
                long r10 = r7.v     // Catch:{ all -> 0x01cc }
                r18 = r13
                long r12 = r7.u     // Catch:{ all -> 0x01cc }
                long r10 = r10 - r12
                r0.append(r10)     // Catch:{ all -> 0x01cc }
                java.lang.String r10 = " tcp handshake:"
                r0.append(r10)     // Catch:{ all -> 0x01cc }
                long r10 = r7.t     // Catch:{ all -> 0x01cc }
                long r12 = r7.s     // Catch:{ all -> 0x01cc }
                long r10 = r10 - r12
                r0.append(r10)     // Catch:{ all -> 0x01cc }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01cc }
                g.i.b.e.h.b.c(r6, r0)     // Catch:{ all -> 0x01cc }
                if (r15 == 0) goto L_0x0133
                int r0 = r7.f4183e     // Catch:{ all -> 0x012d }
                byte[] r10 = r7.q     // Catch:{ all -> 0x012d }
                int r10 = r10.length     // Catch:{ all -> 0x012d }
                int r0 = r0 + r10
                r7.f4183e = r0     // Catch:{ all -> 0x012d }
                long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x012d }
                java.io.OutputStream r12 = r9.getOutputStream()     // Catch:{ all -> 0x012d }
                byte[] r0 = r7.q     // Catch:{ all -> 0x01c7 }
                r12.write(r0)     // Catch:{ all -> 0x01c7 }
                r12.flush()     // Catch:{ all -> 0x01c7 }
                long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01c7 }
                long r13 = r13 - r10
                goto L_0x0136
            L_0x012d:
                r0 = move-exception
                r21 = r15
                r12 = 0
                goto L_0x01ca
            L_0x0133:
                r12 = 0
                r13 = -1
            L_0x0136:
                long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01c7 }
                int r0 = r9.getResponseCode()     // Catch:{ all -> 0x01c7 }
                long r20 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01c7 }
                long r10 = r20 - r10
                int r8 = r9.getContentLength()     // Catch:{ all -> 0x01c7 }
                r21 = r15
                java.lang.String r15 = "Content-Type"
                java.lang.String r15 = r9.getHeaderField(r15)     // Catch:{ all -> 0x01c1 }
                r22 = r15
                r15 = 200(0xc8, float:2.8E-43)
                if (r0 != r15) goto L_0x0176
                r15 = -1
                if (r8 != r15) goto L_0x0176
                java.lang.String r15 = "Transfer-Encoding"
                java.lang.String r15 = r9.getHeaderField(r15)     // Catch:{ all -> 0x016f }
                if (r15 == 0) goto L_0x0176
                r17 = r8
                java.lang.String r8 = "chunked"
                boolean r8 = r15.equals(r8)     // Catch:{ all -> 0x016d }
                if (r8 == 0) goto L_0x0178
                r8 = -2
                goto L_0x017a
            L_0x016d:
                r0 = move-exception
                goto L_0x0172
            L_0x016f:
                r0 = move-exception
                r17 = r8
            L_0x0172:
                r15 = r17
                goto L_0x01dd
            L_0x0176:
                r17 = r8
            L_0x0178:
                r8 = r17
            L_0x017a:
                java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x01be }
                java.lang.String r1 = "Http:errorCode:"
                r15.<init>(r1)     // Catch:{ all -> 0x01be }
                r15.append(r0)     // Catch:{ all -> 0x01be }
                java.lang.String r1 = " connCostTime:"
                r15.append(r1)     // Catch:{ all -> 0x01be }
                r23 = r0
                r0 = r18
                r15.append(r0)     // Catch:{ all -> 0x01be }
                r18 = r0
                java.lang.String r0 = " readTime:"
                r15.append(r0)     // Catch:{ all -> 0x01be }
                r15.append(r10)     // Catch:{ all -> 0x01be }
                java.lang.String r0 = " writeTime:"
                r15.append(r0)     // Catch:{ all -> 0x01be }
                r15.append(r13)     // Catch:{ all -> 0x01be }
                java.lang.String r0 = " contentLen:"
                r15.append(r0)     // Catch:{ all -> 0x01be }
                r15.append(r8)     // Catch:{ all -> 0x01be }
                java.lang.String r0 = r15.toString()     // Catch:{ all -> 0x01be }
                g.i.b.e.h.b.c(r6, r0)     // Catch:{ all -> 0x01be }
                j(r9, r12)
                r0 = r18
                r15 = r21
                r6 = r23
                r16 = 0
                goto L_0x02aa
            L_0x01be:
                r0 = move-exception
                r15 = r8
                goto L_0x01dd
            L_0x01c1:
                r0 = move-exception
                r17 = r8
                r15 = r17
                goto L_0x01db
            L_0x01c7:
                r0 = move-exception
                r21 = r15
            L_0x01ca:
                r15 = -1
                goto L_0x01db
            L_0x01cc:
                r0 = move-exception
                r21 = r15
                r15 = -1
                r12 = 0
                goto L_0x01db
            L_0x01d2:
                r0 = move-exception
                r15 = -1
                goto L_0x01d8
            L_0x01d5:
                r0 = move-exception
                r15 = -1
                r9 = 0
            L_0x01d8:
                r12 = 0
            L_0x01d9:
                r21 = 0
            L_0x01db:
                r22 = 0
            L_0x01dd:
                r0.printStackTrace()     // Catch:{ all -> 0x038f }
                boolean r1 = g.i.b.e.b.e.f4109d     // Catch:{ all -> 0x038f }
                if (r1 != 0) goto L_0x01e9
                r0 = -505(0xfffffffffffffe07, float:NaN)
            L_0x01e6:
                r13 = 0
                goto L_0x029b
            L_0x01e9:
                boolean r1 = r24.i()     // Catch:{ all -> 0x038f }
                if (r1 == 0) goto L_0x01f2
                r0 = -500(0xfffffffffffffe0c, float:NaN)
                goto L_0x01e6
            L_0x01f2:
                r1 = -515(0xfffffffffffffdfd, float:NaN)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x038f }
                r6.<init>()     // Catch:{ all -> 0x038f }
                java.lang.Class r8 = r0.getClass()     // Catch:{ all -> 0x038f }
                java.lang.String r8 = r8.getSimpleName()     // Catch:{ all -> 0x038f }
                r6.append(r8)     // Catch:{ all -> 0x038f }
                java.lang.String r8 = "("
                r6.append(r8)     // Catch:{ all -> 0x038f }
                java.lang.String r8 = r0.getLocalizedMessage()     // Catch:{ all -> 0x038f }
                r6.append(r8)     // Catch:{ all -> 0x038f }
                java.lang.String r8 = ")"
                r6.append(r8)     // Catch:{ all -> 0x038f }
                java.lang.String r13 = r6.toString()     // Catch:{ all -> 0x038f }
                boolean r6 = r0 instanceof java.net.SocketTimeoutException     // Catch:{ all -> 0x038f }
                if (r6 == 0) goto L_0x0251
                java.lang.String r1 = r0.getLocalizedMessage()     // Catch:{ all -> 0x038f }
                if (r1 == 0) goto L_0x0249
                java.lang.String r6 = r1.toLowerCase()     // Catch:{ all -> 0x038f }
                java.lang.String r8 = "connect"
                boolean r6 = r6.contains(r8)     // Catch:{ all -> 0x038f }
                if (r6 != 0) goto L_0x0247
                java.lang.String r6 = r1.toLowerCase()     // Catch:{ all -> 0x038f }
                java.lang.String r8 = "connection"
                boolean r6 = r6.contains(r8)     // Catch:{ all -> 0x038f }
                if (r6 != 0) goto L_0x0247
                java.lang.String r1 = r1.toLowerCase()     // Catch:{ all -> 0x038f }
                java.lang.String r6 = "ssl handshake"
                boolean r1 = r1.contains(r6)     // Catch:{ all -> 0x038f }
                if (r1 == 0) goto L_0x0249
            L_0x0247:
                r8 = 1
                goto L_0x024a
            L_0x0249:
                r8 = 0
            L_0x024a:
                if (r8 == 0) goto L_0x024f
                r1 = -509(0xfffffffffffffe03, float:NaN)
                goto L_0x0251
            L_0x024f:
                r1 = -510(0xfffffffffffffe02, float:NaN)
            L_0x0251:
                boolean r6 = r0 instanceof java.net.UnknownHostException     // Catch:{ all -> 0x038f }
                if (r6 == 0) goto L_0x0257
                r1 = -512(0xfffffffffffffe00, float:NaN)
            L_0x0257:
                boolean r6 = r0 instanceof java.net.ConnectException     // Catch:{ all -> 0x038f }
                if (r6 == 0) goto L_0x025d
                r1 = -511(0xfffffffffffffe01, float:NaN)
            L_0x025d:
                boolean r6 = r0 instanceof java.net.SocketException     // Catch:{ all -> 0x038f }
                if (r6 == 0) goto L_0x0263
                r1 = -513(0xfffffffffffffdff, float:NaN)
            L_0x0263:
                boolean r6 = r0 instanceof java.io.IOException     // Catch:{ all -> 0x038f }
                if (r6 == 0) goto L_0x0269
                r1 = -514(0xfffffffffffffdfe, float:NaN)
            L_0x0269:
                java.lang.String r6 = r0.getMessage()     // Catch:{ all -> 0x038f }
                if (r6 == 0) goto L_0x029a
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x038f }
                java.lang.String r6 = "Permission denied"
                boolean r6 = r0.contains(r6)     // Catch:{ all -> 0x038f }
                if (r6 != 0) goto L_0x0297
                java.lang.String r6 = "ECONNREFUSED"
                boolean r6 = r0.contains(r6)     // Catch:{ all -> 0x038f }
                if (r6 == 0) goto L_0x0284
                goto L_0x0297
            L_0x0284:
                java.lang.String r6 = "EHOSTUNREACH"
                boolean r6 = r0.contains(r6)     // Catch:{ all -> 0x038f }
                if (r6 != 0) goto L_0x0294
                java.lang.String r6 = "No route to host"
                boolean r0 = r0.contains(r6)     // Catch:{ all -> 0x038f }
                if (r0 == 0) goto L_0x029a
            L_0x0294:
                r0 = -506(0xfffffffffffffe06, float:NaN)
                goto L_0x029b
            L_0x0297:
                r0 = -507(0xfffffffffffffe05, float:NaN)
                goto L_0x029b
            L_0x029a:
                r0 = r1
            L_0x029b:
                j(r9, r12)
                r6 = r0
                r16 = r13
                r8 = r15
                r15 = r21
                r0 = -1
                r10 = -1
                r13 = -1
            L_0x02aa:
                if (r15 == 0) goto L_0x02d1
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r13)
                java.lang.String r9 = r9.toString()
                java.lang.String r12 = "D16"
                r5.put(r12, r9)
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                byte[] r12 = r7.q
                int r12 = r12.length
                r9.append(r12)
                java.lang.String r9 = r9.toString()
                java.lang.String r12 = "D20"
                r5.put(r12, r9)
            L_0x02d1:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                java.lang.String r10 = "D17"
                r5.put(r10, r9)
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                long r10 = android.os.SystemClock.elapsedRealtime()
                long r10 = r10 - r3
                r9.append(r10)
                java.lang.String r3 = r9.toString()
                java.lang.String r4 = "D18"
                r5.put(r4, r3)
                java.lang.String r3 = java.lang.String.valueOf(r8)
                java.lang.String r4 = "D19"
                r5.put(r4, r3)
                boolean r3 = android.text.TextUtils.isEmpty(r22)
                if (r3 != 0) goto L_0x0310
                java.lang.String r3 = g.i.b.e.h.e.g(r22)
                java.lang.String r4 = "D35"
                r5.put(r4, r3)
            L_0x0310:
                r3 = r25
                boolean r2 = r3.startsWith(r2)
                java.lang.String r4 = "D13"
                if (r2 == 0) goto L_0x0363
                long r8 = r7.t
                r10 = -1
                int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r2 == 0) goto L_0x0351
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                long r1 = r7.t
                long r8 = r7.s
                long r1 = r1 - r8
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r5.put(r4, r0)
                long r0 = r7.v
                long r8 = r7.u
                long r0 = r0 - r8
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r8 = 0
                int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r4 < 0) goto L_0x0347
                r10 = r0
            L_0x0347:
                r2.append(r10)
                java.lang.String r0 = r2.toString()
                java.lang.String r1 = "D14"
                goto L_0x035f
            L_0x0351:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                java.lang.String r1 = "D15"
            L_0x035f:
                r5.put(r1, r0)
                goto L_0x0372
            L_0x0363:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r5.put(r4, r0)
            L_0x0372:
                java.lang.String r0 = g.i.b.e.h.e.g(r25)
                java.lang.String r1 = "D7"
                r5.put(r1, r0)
                boolean r0 = r7.a
                if (r0 == 0) goto L_0x0382
                java.lang.String r2 = "HLUrlDetectEvent"
                goto L_0x0384
            L_0x0382:
                java.lang.String r2 = "HLNotRealUrlDetectEvent"
            L_0x0384:
                r1 = r24
                r3 = r6
                r4 = r16
                r6 = r0
                r1.d(r2, r3, r4, r5, r6)
                r1 = 1
                return r1
            L_0x038f:
                r0 = move-exception
                j(r9, r12)
                throw r0
            L_0x0394:
                java.lang.String r0 = "MalformedURLException is called"
                g.i.b.e.h.b.i(r6, r0)
                r1 = 0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.f.c.a.a.h.e(java.lang.String):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r0 = r4.c.get("connect_timeout");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void f() {
            /*
                r4 = this;
                java.util.Map<java.lang.String, byte[]> r0 = r4.c
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0020
                java.lang.String r3 = "connect_timeout"
                boolean r0 = r0.containsKey(r3)
                if (r0 == 0) goto L_0x0020
                java.util.Map<java.lang.String, byte[]> r0 = r4.c
                java.lang.Object r0 = r0.get(r3)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L_0x0020
                int r3 = r0.length
                if (r3 != r1) goto L_0x0020
                byte r0 = r0[r2]
                int r0 = r0 * 1000
                goto L_0x0022
            L_0x0020:
                r0 = 31000(0x7918, float:4.344E-41)
            L_0x0022:
                r4.o = r0
                int r0 = r4.h()
                r4.p = r0
                byte[] r0 = r4.g()
                r4.q = r0
                java.util.Map<java.lang.String, byte[]> r0 = r4.c
                if (r0 == 0) goto L_0x004b
                java.lang.String r3 = "request_method"
                boolean r0 = r0.containsKey(r3)
                if (r0 == 0) goto L_0x004b
                java.util.Map<java.lang.String, byte[]> r0 = r4.c
                java.lang.Object r0 = r0.get(r3)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L_0x004b
                int r3 = r0.length
                if (r3 != r1) goto L_0x004b
                byte r2 = r0[r2]
            L_0x004b:
                r4.r = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.f.c.a.a.h.f():void");
        }
    }

    public a(String str) {
        String str2 = g.i.b.e.c.o ? "_test_" : "_";
        this.a = new C0150a(this, g.i.b.e.c.f4125g, "halley_schedule_" + g.i.b.e.c.f4126h + str2 + g.i.b.e.c.a() + "_" + str + ".db");
    }

    public final synchronized void a(String str, byte[] bArr) {
        if (!TextUtils.isEmpty(str) && bArr != null) {
            this.a.b(str, bArr);
        }
    }

    public final synchronized byte[] b(String str) {
        return this.a.c(str);
    }
}
