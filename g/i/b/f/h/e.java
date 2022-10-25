package g.i.b.f.h;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import g.i.b.e.b.g;
import g.i.b.f.a;
import g.i.b.f.c;
import g.i.b.f.k.b;
import g.i.b.f.k.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Vector;

public class e implements g, c, d.e {

    /* renamed from: g  reason: collision with root package name */
    public static volatile e f4269g;
    public Vector<g.i.b.f.k.e> b = new Vector<>();
    public d.C0160d c = new d.C0160d(this);

    /* renamed from: d  reason: collision with root package name */
    public b.c f4270d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4271e = false;

    /* renamed from: f  reason: collision with root package name */
    public String f4272f = "";

    public e() {
        g.i.b.e.b.e.a("downloader", this);
        this.f4270d = new b.c(g.i.b.e.c.f4125g);
    }

    public static e b() {
        if (f4269g == null) {
            synchronized (e.class) {
                if (f4269g == null) {
                    f4269g = new e();
                }
            }
        }
        return f4269g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03dd A[EDGE_INSN: B:229:0x03dd->B:161:0x03dd ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x044c  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x04d3  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0558  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void f(java.util.HashMap<java.lang.String, java.lang.String> r15, g.i.b.f.k.e r16, int r17, int r18) {
        /*
            r1 = r15
            r2 = r16
            r0 = r17
            r3 = -1
            r5 = -40
            if (r0 == r5) goto L_0x0013
            r5 = -12
            if (r0 == r5) goto L_0x0013
            r5 = -45
            if (r0 != r5) goto L_0x0078
        L_0x0013:
            java.lang.String r5 = "C11"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.Context r0 = g.i.b.e.c.f4125g     // Catch:{ all -> 0x0039 }
            java.io.File r0 = r0.getFilesDir()     // Catch:{ all -> 0x0039 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0039 }
            android.os.StatFs r7 = new android.os.StatFs     // Catch:{ all -> 0x0039 }
            r7.<init>(r0)     // Catch:{ all -> 0x0039 }
            r7.restat(r0)     // Catch:{ all -> 0x0039 }
            int r0 = r7.getAvailableBlocks()     // Catch:{ all -> 0x0039 }
            long r8 = (long) r0     // Catch:{ all -> 0x0039 }
            int r0 = r7.getBlockSize()     // Catch:{ all -> 0x0039 }
            long r10 = (long) r0
            long r8 = r8 * r10
            goto L_0x003e
        L_0x0039:
            r0 = move-exception
            r0.printStackTrace()
            r8 = r3
        L_0x003e:
            r6.append(r8)
            java.lang.String r0 = r6.toString()
            r15.put(r5, r0)
            java.lang.String r5 = "C12"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.os.StatFs r0 = new android.os.StatFs     // Catch:{ all -> 0x0069 }
            java.io.File r7 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ all -> 0x0069 }
            java.lang.String r7 = r7.getAbsolutePath()     // Catch:{ all -> 0x0069 }
            r0.<init>(r7)     // Catch:{ all -> 0x0069 }
            int r7 = r0.getBlockSize()     // Catch:{ all -> 0x0069 }
            long r7 = (long) r7     // Catch:{ all -> 0x0069 }
            int r0 = r0.getAvailableBlocks()     // Catch:{ all -> 0x0069 }
            long r9 = (long) r0
            long r7 = r7 * r9
            goto L_0x006e
        L_0x0069:
            r0 = move-exception
            r0.printStackTrace()
            r7 = r3
        L_0x006e:
            r6.append(r7)
            java.lang.String r0 = r6.toString()
            r15.put(r5, r0)
        L_0x0078:
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "C16"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            long r8 = r2.B
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r15.put(r0, r7)
            java.lang.String r0 = "C17"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r15.put(r0, r5)
            java.lang.String r0 = "C20"
            java.lang.String r5 = r16.g()
            java.lang.String r5 = g.i.b.e.h.e.g(r5)
            r15.put(r0, r5)
            g.i.b.f.k.f.b r0 = r2.f4310f
            if (r0 == 0) goto L_0x00ed
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            g.i.b.f.k.f.a r6 = r0.b
            java.lang.String r7 = ";"
            if (r6 == 0) goto L_0x00c1
            java.lang.String r6 = "0,"
            r5.append(r6)
            g.i.b.f.k.f.a r6 = r0.b
            r5.append(r6)
            r5.append(r7)
        L_0x00c1:
            java.util.Map<java.lang.String, g.i.b.f.k.f.b$a> r6 = r0.c
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x00cb:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00e8
            java.lang.Object r8 = r6.next()
            java.lang.String r8 = (java.lang.String) r8
            java.util.Map<java.lang.String, g.i.b.f.k.f.b$a> r9 = r0.c
            java.lang.Object r8 = r9.get(r8)
            g.i.b.f.k.f.b$a r8 = (g.i.b.f.k.f.b.a) r8
            if (r8 == 0) goto L_0x00cb
            r5.append(r8)
            r5.append(r7)
            goto L_0x00cb
        L_0x00e8:
            java.lang.String r0 = r5.toString()
            goto L_0x00ef
        L_0x00ed:
            java.lang.String r0 = ""
        L_0x00ef:
            int r5 = r0.length()
            r6 = 600(0x258, float:8.41E-43)
            r7 = 0
            if (r5 <= r6) goto L_0x00fc
            java.lang.String r0 = r0.substring(r7, r6)
        L_0x00fc:
            java.lang.String r5 = "C26"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r15.put(r5, r0)
            java.lang.String r0 = "C27"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r6 = r2.V
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r15.put(r0, r5)
            g.i.b.f.k.g.d r0 = r2.q0
            if (r0 == 0) goto L_0x015e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            g.i.b.f.k.g.c r6 = r0.a
            if (r6 == 0) goto L_0x012c
            java.lang.String r6 = r6.i()
            r5.append(r6)
        L_0x012c:
            g.i.b.f.k.g.c r6 = r0.b
            if (r6 == 0) goto L_0x0137
            java.lang.String r6 = r6.i()
            r5.append(r6)
        L_0x0137:
            java.util.ArrayList<g.i.b.f.k.g.c> r6 = r0.c
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0159
            java.util.ArrayList<g.i.b.f.k.g.c> r0 = r0.c
            java.util.Iterator r0 = r0.iterator()
        L_0x0145:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0159
            java.lang.Object r6 = r0.next()
            g.i.b.f.k.g.c r6 = (g.i.b.f.k.g.c) r6
            java.lang.String r6 = r6.i()
            r5.append(r6)
            goto L_0x0145
        L_0x0159:
            java.lang.String r0 = r5.toString()
            goto L_0x0160
        L_0x015e:
            java.lang.String r0 = ""
        L_0x0160:
            int r5 = r0.length()
            r6 = 4000(0xfa0, float:5.605E-42)
            if (r5 <= r6) goto L_0x016c
            java.lang.String r0 = r0.substring(r7, r6)
        L_0x016c:
            java.lang.String r5 = "C37"
            r15.put(r5, r0)
            if (r18 != 0) goto L_0x0190
            g.i.b.f.k.d r0 = r2.f4313i
            int r0 = r0.f4295f
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r0 <= r5) goto L_0x0190
            java.lang.String r0 = "C48"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            g.i.b.f.k.d r6 = r2.f4313i
            int r6 = r6.f4295f
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r15.put(r0, r5)
        L_0x0190:
            g.i.b.f.k.b r0 = r2.f4314j
            if (r0 == 0) goto L_0x019a
            long r5 = r0.f4287d
            long r8 = r0.c
            long r5 = r5 - r8
            goto L_0x019b
        L_0x019a:
            r5 = r3
        L_0x019b:
            r8 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x01bb
            java.lang.String r0 = "C72"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            g.i.b.f.k.b r6 = r2.f4314j
            if (r6 == 0) goto L_0x01b1
            long r3 = r6.f4287d
            long r8 = r6.c
            long r3 = r3 - r8
        L_0x01b1:
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r15.put(r0, r3)
        L_0x01bb:
            boolean r0 = r2.Y
            if (r0 == 0) goto L_0x01c6
            java.lang.String r0 = "C74"
            java.lang.String r3 = "1"
            r15.put(r0, r3)
        L_0x01c6:
            java.lang.String r0 = "C78"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            g.i.b.f.k.g.d r4 = r2.q0
            if (r4 == 0) goto L_0x0213
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            g.i.b.f.k.g.c r6 = r4.a
            if (r6 == 0) goto L_0x01e1
            java.lang.String r6 = r6.j()
            r5.append(r6)
        L_0x01e1:
            g.i.b.f.k.g.c r6 = r4.b
            if (r6 == 0) goto L_0x01ec
            java.lang.String r6 = r6.j()
            r5.append(r6)
        L_0x01ec:
            java.util.ArrayList<g.i.b.f.k.g.c> r6 = r4.c
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x020e
            java.util.ArrayList<g.i.b.f.k.g.c> r4 = r4.c
            java.util.Iterator r4 = r4.iterator()
        L_0x01fa:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x020e
            java.lang.Object r6 = r4.next()
            g.i.b.f.k.g.c r6 = (g.i.b.f.k.g.c) r6
            java.lang.String r6 = r6.j()
            r5.append(r6)
            goto L_0x01fa
        L_0x020e:
            java.lang.String r4 = r5.toString()
            goto L_0x0215
        L_0x0213:
            java.lang.String r4 = ""
        L_0x0215:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r15.put(r0, r3)
            java.lang.String r0 = "C79"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            g.i.b.f.k.e$b r4 = r2.r0
            if (r4 == 0) goto L_0x0283
            java.util.List<g.i.b.f.k.e$b$a> r5 = r4.a
            monitor-enter(r5)
            java.util.List<g.i.b.f.k.e$b$a> r6 = r4.a     // Catch:{ all -> 0x0280 }
            int r6 = r6.size()     // Catch:{ all -> 0x0280 }
            if (r6 != 0) goto L_0x0238
            java.lang.String r4 = ""
            goto L_0x027e
        L_0x0238:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0280 }
            r6.<init>()     // Catch:{ all -> 0x0280 }
            java.util.List<g.i.b.f.k.e$b$a> r4 = r4.a     // Catch:{ all -> 0x0280 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0280 }
        L_0x0243:
            boolean r8 = r4.hasNext()     // Catch:{ all -> 0x0280 }
            if (r8 == 0) goto L_0x027a
            java.lang.Object r8 = r4.next()     // Catch:{ all -> 0x0280 }
            g.i.b.f.k.e$b$a r8 = (g.i.b.f.k.e.b.a) r8     // Catch:{ all -> 0x0280 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0280 }
            r9.<init>()     // Catch:{ all -> 0x0280 }
            long r10 = r8.a     // Catch:{ all -> 0x0280 }
            r9.append(r10)     // Catch:{ all -> 0x0280 }
            java.lang.String r10 = ","
            r9.append(r10)     // Catch:{ all -> 0x0280 }
            int r10 = r8.b     // Catch:{ all -> 0x0280 }
            r9.append(r10)     // Catch:{ all -> 0x0280 }
            java.lang.String r10 = ","
            r9.append(r10)     // Catch:{ all -> 0x0280 }
            java.lang.String r8 = r8.c     // Catch:{ all -> 0x0280 }
            r9.append(r8)     // Catch:{ all -> 0x0280 }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x0280 }
            r6.append(r8)     // Catch:{ all -> 0x0280 }
            java.lang.String r8 = ";"
            r6.append(r8)     // Catch:{ all -> 0x0280 }
            goto L_0x0243
        L_0x027a:
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x0280 }
        L_0x027e:
            monitor-exit(r5)     // Catch:{ all -> 0x0280 }
            goto L_0x0285
        L_0x0280:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0280 }
            throw r0
        L_0x0283:
            java.lang.String r4 = ""
        L_0x0285:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r15.put(r0, r3)
            java.lang.String r0 = r2.u
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02aa
            java.lang.String r0 = "C80"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r2.u
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r15.put(r0, r3)
        L_0x02aa:
            java.lang.String r0 = "B90"
            g.i.b.f.k.f.b r3 = r2.f4310f
            java.util.Map<java.lang.String, g.i.b.f.k.f.b$a> r3 = r3.c
            java.lang.String r4 = g.i.b.e.b.e.f4111f
            java.lang.Object r3 = r3.get(r4)
            g.i.b.f.k.f.b$a r3 = (g.i.b.f.k.f.b.a) r3
            r4 = 1
            if (r3 != 0) goto L_0x02bc
            goto L_0x02d7
        L_0x02bc:
            java.util.List<g.i.b.f.k.f.a> r5 = r3.f4354d
            if (r5 == 0) goto L_0x02c8
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x02c8
            r5 = 1
            goto L_0x02c9
        L_0x02c8:
            r5 = 0
        L_0x02c9:
            if (r5 != 0) goto L_0x02d8
            java.util.List<g.i.b.f.k.f.a> r3 = r3.f4355e
            if (r3 == 0) goto L_0x02d7
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x02d7
            r5 = 1
            goto L_0x02d8
        L_0x02d7:
            r5 = 0
        L_0x02d8:
            java.lang.String r3 = "1"
            java.lang.String r6 = "0"
            if (r5 == 0) goto L_0x02e0
            r5 = r3
            goto L_0x02e1
        L_0x02e0:
            r5 = r6
        L_0x02e1:
            g.i.b.f.k.f.b r8 = r2.f4310f
            long r8 = r8.f4347g
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x02fc
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            g.i.b.f.k.f.b r9 = r2.f4310f
            long r9 = r9.f4347g
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            goto L_0x02fd
        L_0x02fc:
            r8 = r6
        L_0x02fd:
            g.i.b.f.k.f.b r9 = r2.f4310f
            java.util.List r9 = r9.c()
            if (r9 == 0) goto L_0x0317
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x0317
            g.i.b.f.k.f.b r9 = r2.f4310f
            java.lang.String r9 = r9.f4351k
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x0317
            r9 = r3
            goto L_0x0318
        L_0x0317:
            r9 = r6
        L_0x0318:
            g.i.b.f.k.f.b r10 = r2.f4310f
            java.lang.String r10 = r10.f4350j
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0323
            goto L_0x0324
        L_0x0323:
            r3 = r6
        L_0x0324:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = ","
            r6.append(r5)
            r6.append(r8)
            r6.append(r5)
            r6.append(r9)
            r6.append(r5)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String r5 = "hijack"
            g.i.b.e.h.b.f(r5, r3)
            r15.put(r0, r3)
            java.lang.String r0 = "B91"
            g.i.b.f.g.b r3 = r2.C0
            g.i.b.f.k.a r5 = r2.f4311g
            java.util.List<g.i.b.f.g.c> r6 = r2.f0
            int r8 = r2.y0
            long r9 = r2.D0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            int r12 = r3.a
            r11.append(r12)
            java.lang.String r12 = ","
            r11.append(r12)
            long r12 = r3.b
            r11.append(r12)
            java.lang.String r12 = ","
            r11.append(r12)
            int r12 = r3.f4245d
            r11.append(r12)
            java.lang.String r12 = ","
            r11.append(r12)
            long r12 = r3.c
            r11.append(r12)
            java.lang.String r12 = ","
            r11.append(r12)
            long r12 = r3.f4246e
            r11.append(r12)
            java.lang.String r12 = ","
            r11.append(r12)
            java.lang.String r12 = r3.f4247f
            r11.append(r12)
            java.lang.String r12 = ","
            r11.append(r12)
            java.lang.String r12 = "down_hijack_force_feature"
            int r4 = g.h.a.a.b(r12, r7, r4, r7)
            int r7 = r6.size()
            if (r7 <= 0) goto L_0x03bf
            java.util.Iterator r7 = r6.iterator()
        L_0x03a9:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x03bf
            java.lang.Object r12 = r7.next()
            g.i.b.f.g.c r12 = (g.i.b.f.g.c) r12
            boolean r13 = r12.c
            if (r13 == 0) goto L_0x03a9
            java.lang.String r7 = r12.f4254i
            r3.f4248g = r7
            r7 = 1
            goto L_0x03c0
        L_0x03bf:
            r7 = 0
        L_0x03c0:
            int r12 = r6.size()
            if (r12 <= 0) goto L_0x03dd
            java.util.Iterator r6 = r6.iterator()
        L_0x03ca:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto L_0x03db
            java.lang.Object r12 = r6.next()
            g.i.b.f.g.c r12 = (g.i.b.f.g.c) r12
            boolean r12 = r12.c
            if (r12 != 0) goto L_0x03ca
            goto L_0x03dd
        L_0x03db:
            r6 = 1
            goto L_0x03de
        L_0x03dd:
            r6 = 0
        L_0x03de:
            if (r5 == 0) goto L_0x0413
            java.util.List<g.i.b.f.k.g.a> r12 = r5.f4282h
            monitor-enter(r12)
            java.util.List<g.i.b.f.k.g.a> r5 = r5.f4282h     // Catch:{ all -> 0x0410 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0410 }
            r13 = 0
        L_0x03ea:
            boolean r14 = r5.hasNext()     // Catch:{ all -> 0x0410 }
            if (r14 == 0) goto L_0x040a
            java.lang.Object r14 = r5.next()     // Catch:{ all -> 0x0410 }
            g.i.b.f.k.g.a r14 = (g.i.b.f.k.g.a) r14     // Catch:{ all -> 0x0410 }
            r17 = r0
            long r0 = (long) r13     // Catch:{ all -> 0x0410 }
            r18 = r3
            long r2 = r14.f4364e     // Catch:{ all -> 0x0410 }
            long r13 = r14.f4363d     // Catch:{ all -> 0x0410 }
            long r2 = r2 - r13
            long r2 = r2 + r0
            int r13 = (int) r2     // Catch:{ all -> 0x0410 }
            r1 = r15
            r2 = r16
            r0 = r17
            r3 = r18
            goto L_0x03ea
        L_0x040a:
            r17 = r0
            r18 = r3
            monitor-exit(r12)     // Catch:{ all -> 0x0410 }
            goto L_0x0418
        L_0x0410:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0410 }
            throw r0
        L_0x0413:
            r17 = r0
            r18 = r3
            r13 = -1
        L_0x0418:
            r11.append(r4)
            java.lang.String r0 = ","
            r11.append(r0)
            if (r7 == 0) goto L_0x0425
            java.lang.String r0 = "1"
            goto L_0x0427
        L_0x0425:
            java.lang.String r0 = "0"
        L_0x0427:
            r11.append(r0)
            java.lang.String r0 = ","
            r11.append(r0)
            if (r6 == 0) goto L_0x0434
            java.lang.String r0 = "1"
            goto L_0x0436
        L_0x0434:
            java.lang.String r0 = "0"
        L_0x0436:
            r11.append(r0)
            java.lang.String r0 = ","
            r11.append(r0)
            r11.append(r13)
            java.lang.String r0 = ","
            r11.append(r0)
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0451
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            goto L_0x0453
        L_0x0451:
            java.lang.String r0 = "0"
        L_0x0453:
            r11.append(r0)
            java.lang.String r0 = ","
            r11.append(r0)
            r11.append(r8)
            java.lang.String r0 = ","
            r11.append(r0)
            r0 = r18
            java.lang.String r0 = r0.f4248g
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            java.lang.String r1 = "hijack"
            g.i.b.e.h.b.f(r1, r0)
            r1 = r15
            r2 = r17
            r15.put(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = r16
            java.util.List<g.i.b.f.g.c> r3 = r2.f0
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x04b2
            java.util.List<g.i.b.f.g.c> r3 = r2.f0
            java.util.Iterator r3 = r3.iterator()
        L_0x048e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a9
            java.lang.Object r4 = r3.next()
            g.i.b.f.g.c r4 = (g.i.b.f.g.c) r4
            g.i.b.f.g.c$b r4 = r4.f4252g
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r4 = ";"
            r0.append(r4)
            goto L_0x048e
        L_0x04a9:
            int r3 = r0.length()
            int r3 = r3 + -1
            r0.deleteCharAt(r3)
        L_0x04b2:
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "hijack"
            g.i.b.e.h.b.f(r3, r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x04c6
            java.lang.String r3 = "C92"
            r15.put(r3, r0)
        L_0x04c6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.List<g.i.b.f.g.c> r3 = r2.f0
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0549
            java.util.List<g.i.b.f.g.c> r3 = r2.f0
            java.util.Iterator r3 = r3.iterator()
        L_0x04d9:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x053a
            java.lang.Object r4 = r3.next()
            g.i.b.f.g.c r4 = (g.i.b.f.g.c) r4
            java.lang.String r5 = ""
            boolean r6 = r4.c()
            if (r6 != 0) goto L_0x04f2
            int r6 = r4.p
            r7 = 7
            if (r6 != r7) goto L_0x052b
        L_0x04f2:
            java.lang.StringBuilder r5 = g.a.a.a.a.i(r5)
            int r6 = r4.p
            r5.append(r6)
            java.lang.String r6 = ","
            r5.append(r6)
            int r7 = r4.t
            r5.append(r7)
            r5.append(r6)
            g.i.b.f.k.f.a r7 = r4.b
            int r7 = r7.c
            r5.append(r7)
            r5.append(r6)
            int r7 = r4.u
            r5.append(r7)
            r5.append(r6)
            g.i.b.f.f.a.e r4 = r4.n
            java.lang.String r4 = r4.h()
            java.lang.String r4 = g.i.b.e.h.e.g(r4)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
        L_0x052b:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L_0x04d9
            r0.append(r5)
            java.lang.String r4 = ";"
            r0.append(r4)
            goto L_0x04d9
        L_0x053a:
            int r3 = r0.length()
            if (r3 <= 0) goto L_0x0549
            int r3 = r0.length()
            int r3 = r3 + -1
            r0.deleteCharAt(r3)
        L_0x0549:
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "hijack"
            g.i.b.e.h.b.f(r3, r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x055d
            java.lang.String r3 = "C93"
            r15.put(r3, r0)
        L_0x055d:
            java.lang.String r0 = "C94"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            g.i.b.f.k.f.b r2 = r2.f4310f
            int r2 = r2.f4345e
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r15.put(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.f.h.e.f(java.util.HashMap, g.i.b.f.k.e, int, int):void");
    }

    public final void a(int i2, String str) {
        List<a> i3 = i();
        if (((LinkedList) i3).size() > 0) {
            Iterator<a> it = i3.iterator();
            while (it.hasNext()) {
                ((g.i.b.f.k.e) it.next()).L(i2, str);
            }
        }
    }

    public final void c(a aVar) {
        if (this.f4271e) {
            b.c cVar = this.f4270d;
            if (!aVar.h()) {
                try {
                    SQLiteDatabase writableDatabase = cVar.getWritableDatabase();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("taskid", aVar.f());
                    contentValues.put("type", Integer.valueOf(aVar.i()));
                    contentValues.put("knownsize", Long.valueOf(aVar.q()));
                    contentValues.put("priority", Integer.valueOf(aVar.getPriority().ordinal()));
                    contentValues.put("category", Integer.valueOf(aVar.y().ordinal()));
                    contentValues.put("url", aVar.r());
                    contentValues.put("saveDir", aVar.z());
                    contentValues.put("saveName", aVar.o());
                    g.i.b.f.e p = aVar.p();
                    contentValues.put("status", Integer.valueOf(p.ordinal() <= 2 ? 5 : p.ordinal()));
                    contentValues.put("totalLen", Long.valueOf(aVar.s()));
                    contentValues.put("rcvLen", Long.valueOf(aVar.m()));
                    contentValues.put("pencent", Integer.valueOf(aVar.d()));
                    int update = writableDatabase.update("history_task_table", contentValues, "saveDir=? and saveName=?", new String[]{aVar.z(), aVar.o()});
                    g.i.b.e.h.b.c("HistoryTaskDb", "updateRet:".concat(String.valueOf(update)));
                    if (update <= 0) {
                        g.i.b.e.h.b.c("HistoryTaskDb", "insertRet:".concat(String.valueOf(writableDatabase.insert("history_task_table", (String) null, contentValues))));
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public final void d(g.i.b.f.k.e eVar, int i2) {
        String str;
        long j2;
        g.i.b.f.k.e eVar2 = eVar;
        int i3 = i2;
        if (eVar2 != null) {
            try {
                g.i.b.e.h.b.f("halley-downloader-TaskManager", "try reportResult task:" + eVar.r() + ", result:" + i3 + ",costTime:" + eVar2.y + ",receivedLen:" + eVar.m() + ",totalLen:" + eVar.s() + ",flow:" + eVar2.c);
                HashMap hashMap = new HashMap();
                int i4 = eVar2.S;
                if (i3 == 0) {
                    i4 = 0;
                }
                boolean z = true;
                String str2 = eVar2.k0 == g.i.b.f.b.Cate_DefaultEase ? "HLDownTiny" : "B_DLSDK_Result";
                int c2 = g.h.a.a.c(str2, g.i.b.e.c.f4126h, i4, (Map<String, String>) null);
                if (!g.h.a.a.g(c2)) {
                    g.i.b.e.h.b.h("halley-downloader-TaskManager", "Event:" + str2 + " did not report by rate:" + c2);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(g.i.b.e.c.f4126h);
                hashMap.put("D1", sb.toString());
                hashMap.put("B1", eVar2.v);
                hashMap.put("B2", g.i.b.e.h.e.i());
                hashMap.put("B3", g.i.b.e.c.a);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(g.i.b.e.c.c);
                hashMap.put("B4", sb2.toString());
                hashMap.put("B6", g.i.b.e.c.f4129k);
                hashMap.put("C13", eVar.w());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(eVar2.w);
                hashMap.put("B14", sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append(eVar2.y);
                hashMap.put("B15", sb4.toString());
                hashMap.put("B21", String.valueOf(i4));
                hashMap.put("B22", String.valueOf(i2));
                hashMap.put("B23", eVar.R());
                StringBuilder sb5 = new StringBuilder();
                sb5.append(g.i.b.e.b.e.f4112g);
                hashMap.put("B25", sb5.toString());
                StringBuilder sb6 = new StringBuilder();
                sb6.append(eVar2.W ? 1 : 0);
                hashMap.put("B28", sb6.toString());
                StringBuilder sb7 = new StringBuilder();
                sb7.append(eVar2.k0.ordinal());
                hashMap.put("B85", sb7.toString());
                StringBuilder sb8 = new StringBuilder();
                g.i.b.f.k.a aVar = eVar2.f4311g;
                if (aVar != null) {
                    str = str2;
                    j2 = aVar.d() - aVar.b;
                } else {
                    str = str2;
                    j2 = 0;
                }
                sb8.append(j2);
                hashMap.put("B33", sb8.toString());
                StringBuilder sb9 = new StringBuilder();
                sb9.append(eVar.m());
                hashMap.put("B41", sb9.toString());
                StringBuilder sb10 = new StringBuilder();
                sb10.append(eVar2.c);
                hashMap.put("B44", sb10.toString());
                StringBuilder sb11 = new StringBuilder();
                sb11.append(eVar2.f4308d.getAndSet(0));
                hashMap.put("B45", sb11.toString());
                StringBuilder sb12 = new StringBuilder();
                sb12.append(eVar2.x0);
                hashMap.put("B66", sb12.toString());
                StringBuilder sb13 = new StringBuilder();
                sb13.append(eVar2.w0);
                hashMap.put("B96", sb13.toString());
                hashMap.put("B97", "0");
                try {
                    e(hashMap, eVar2, i3);
                    int b2 = g.h.a.a.b("down_report_detail", 0, 1, 1);
                    g.i.b.e.h.b.a("halley-downloader-TaskManager", "reportDetail:".concat(String.valueOf(b2)));
                    if (b2 == 1) {
                        f(hashMap, eVar2, i4, i3);
                    }
                    String str3 = str;
                    if (i4 != 0) {
                        z = false;
                    }
                    g.i.b.e.h.b.h("halley-downloader-TaskManager", "Event:" + str3 + " report ret:" + g.h.a.a.j(str3, z, hashMap, false));
                } catch (Throwable th) {
                    th = th;
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                th = th2;
                th.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(java.util.HashMap<java.lang.String, java.lang.String> r8, g.i.b.f.k.e r9, int r10) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x000d
            java.lang.String r1 = "B5"
            r8.put(r1, r0)
        L_0x000d:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0018
            java.lang.String r1 = "B9"
            r8.put(r1, r0)
        L_0x0018:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0023
            java.lang.String r1 = "B10"
            r8.put(r1, r0)
        L_0x0023:
            java.lang.String r0 = r9.f4317m
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x003e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r9.f4317m
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "B7"
            r8.put(r1, r0)
        L_0x003e:
            java.lang.String r0 = r9.n
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0059
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r9.n
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "B8"
            r8.put(r1, r0)
        L_0x0059:
            long r0 = r9.C
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0069
            long r4 = r9.Q
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x0069
            long r4 = r4 - r0
            goto L_0x006b
        L_0x0069:
            r4 = -1
        L_0x006b:
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "B38"
            r8.put(r1, r0)
            java.lang.String r0 = r7.f4272f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0083
            java.lang.String r0 = r7.f4272f
            java.lang.String r1 = "YYB1"
            r8.put(r1, r0)
        L_0x0083:
            java.lang.String r0 = r9.u0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0092
            java.lang.String r0 = r9.u0
            java.lang.String r1 = "YYB2"
            r8.put(r1, r0)
        L_0x0092:
            g.i.b.f.h.a r0 = g.i.b.f.h.a.a()
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = "isdual"
            java.lang.String r1 = "0"
            r8.put(r0, r1)
            java.lang.String r0 = "halley-downloader-TaskManager"
            java.lang.String r1 = "reportDualDownload, isdual==0"
            g.i.b.e.h.b.f(r0, r1)
            int r0 = r9.U
            r1 = -1
            if (r0 == r1) goto L_0x00bf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r9.U
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "B18"
            r8.put(r1, r0)
        L_0x00bf:
            java.lang.String r0 = r9.f4316l
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00da
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r9.f4316l
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "B19"
            r8.put(r1, r0)
        L_0x00da:
            r0 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00e8
            java.lang.String r0 = "B24"
            java.lang.String r1 = "null"
            r8.put(r0, r1)
        L_0x00e8:
            long r0 = r9.z
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0101
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r9.z
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "B34"
            r8.put(r1, r0)
        L_0x0101:
            if (r10 == 0) goto L_0x0109
            long r0 = android.os.SystemClock.elapsedRealtime()
            r9.Q = r0
        L_0x0109:
            boolean r0 = r9.b0
            if (r0 == 0) goto L_0x0114
            java.lang.String r0 = "B46"
            java.lang.String r1 = "1"
            r8.put(r0, r1)
        L_0x0114:
            r0 = 2
            r0 = 1
            if (r10 != r0) goto L_0x0128
            r10 = 0
            java.lang.String r1 = "down_report_exception"
            int r10 = g.h.a.a.b(r1, r10, r0, r10)
            if (r10 != r0) goto L_0x0128
            java.lang.String r9 = r9.t
            java.lang.String r10 = "C95"
            r8.put(r10, r9)
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.f.h.e.e(java.util.HashMap, g.i.b.f.k.e, int):void");
    }

    public final boolean e() {
        List<a> i2 = i();
        int size = ((LinkedList) i2).size();
        Iterator<a> it = i2.iterator();
        boolean z = false;
        while (it.hasNext()) {
            g.i.b.f.k.e eVar = (g.i.b.f.k.e) it.next();
            if (eVar.x0 < size) {
                eVar.x0 = size;
            }
            if (eVar.e()) {
                z = true;
            }
        }
        return z;
    }

    public final void g() {
        d.C0160d dVar = this.c;
        if (dVar != null) {
            try {
                if (dVar.f4307f) {
                    synchronized (dVar.f4306e) {
                        dVar.f4306e.notify();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final List<a> h() {
        LinkedList linkedList = new LinkedList();
        synchronized (this.b) {
            linkedList.addAll(this.b);
        }
        return linkedList;
    }

    public final List<a> i() {
        LinkedList linkedList = new LinkedList();
        synchronized (this.b) {
            Iterator<g.i.b.f.k.e> it = this.b.iterator();
            while (it.hasNext()) {
                g.i.b.f.k.e next = it.next();
                if (next.isRunning()) {
                    linkedList.add(next);
                }
            }
        }
        return linkedList;
    }

    public final long j() {
        long j2;
        synchronized (this.b) {
            Iterator<g.i.b.f.k.e> it = this.b.iterator();
            j2 = 0;
            while (it.hasNext()) {
                g.i.b.f.k.e next = it.next();
                if (next.isRunning()) {
                    d.c cVar = next.f4312h;
                    j2 += cVar != null ? cVar.a : 0;
                }
            }
        }
        return j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        r0 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k() {
        /*
            r6 = this;
            java.util.Vector<g.i.b.f.k.e> r0 = r6.b
            monitor-enter(r0)
            java.util.Vector<g.i.b.f.k.e> r1 = r6.b     // Catch:{ all -> 0x006a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x006a }
        L_0x0009:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x006a }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x006a }
            g.i.b.f.k.e r2 = (g.i.b.f.k.e) r2     // Catch:{ all -> 0x006a }
            boolean r5 = r2.isRunning()     // Catch:{ all -> 0x006a }
            if (r5 != 0) goto L_0x002a
            g.i.b.f.k.d r2 = r2.f4313i     // Catch:{ all -> 0x006a }
            g.i.b.f.e r2 = r2.a     // Catch:{ all -> 0x006a }
            g.i.b.f.e r5 = g.i.b.f.e.PENDING     // Catch:{ all -> 0x006a }
            if (r2 != r5) goto L_0x0027
            r2 = 1
            goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            if (r2 == 0) goto L_0x0009
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            r0 = 1
            goto L_0x002f
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            r0 = 0
        L_0x002f:
            if (r0 == 0) goto L_0x0050
            g.i.b.f.k.d$d r0 = r6.c
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "halley-downloader-SaveService"
            java.lang.String r2 = "start SaveService..."
            g.i.b.e.h.b.f(r1, r2)
            java.lang.Object r1 = r0.f4305d
            monitor-enter(r1)
            boolean r2 = r0.c     // Catch:{ all -> 0x004d }
            if (r2 != 0) goto L_0x004b
            r0.c = r4     // Catch:{ all -> 0x004d }
            java.lang.Object r0 = r0.f4305d     // Catch:{ all -> 0x004d }
            r0.notify()     // Catch:{ all -> 0x004d }
        L_0x004b:
            monitor-exit(r1)     // Catch:{ all -> 0x004d }
            return
        L_0x004d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004d }
            throw r0
        L_0x0050:
            g.i.b.f.k.d$d r0 = r6.c
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "halley-downloader-SaveService"
            java.lang.String r2 = "stop SaveService..."
            g.i.b.e.h.b.f(r1, r2)
            java.lang.Object r1 = r0.f4305d
            monitor-enter(r1)
            boolean r2 = r0.c     // Catch:{ all -> 0x0067 }
            if (r2 == 0) goto L_0x0065
            r0.c = r3     // Catch:{ all -> 0x0067 }
        L_0x0065:
            monitor-exit(r1)     // Catch:{ all -> 0x0067 }
            return
        L_0x0067:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0067 }
            throw r0
        L_0x006a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            goto L_0x006e
        L_0x006d:
            throw r1
        L_0x006e:
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.f.h.e.k():void");
    }

    public void onTaskCompletedMainloop(a aVar) {
        k();
        g.i.b.e.h.b.c("halley-downloader-TaskManager".concat(String.valueOf(aVar)), "onTaskCompletedMainloop task:".concat(String.valueOf(aVar)));
    }

    public void onTaskCompletedSubloop(a aVar) {
        c(aVar);
        d((g.i.b.f.k.e) aVar, 0);
    }

    public void onTaskDetectedMainloop(a aVar) {
        String concat = "halley-downloader-TaskManager".concat(String.valueOf(aVar));
        g.i.b.e.h.b.c(concat, "onTaskDetectedMainloop task:" + aVar + ",detectLen:" + ((g.i.b.f.k.e) aVar).s());
    }

    public void onTaskDetectedSubloop(a aVar) {
        c(aVar);
    }

    public void onTaskFailedMainloop(a aVar) {
        k();
        String concat = "halley-downloader-TaskManager".concat(String.valueOf(aVar));
        g.i.b.e.h.b.c(concat, "onTaskFailedMainloop task:" + aVar + ",retCode:" + ((g.i.b.f.k.e) aVar).S + ",failInfo:" + ((g.i.b.f.k.e) aVar).g());
    }

    public void onTaskFailedSubloop(a aVar) {
        c(aVar);
        d((g.i.b.f.k.e) aVar, 1);
    }

    public void onTaskPausedMainloop(a aVar) {
        k();
        String concat = "halley-downloader-TaskManager".concat(String.valueOf(aVar));
        StringBuilder sb = new StringBuilder("onTaskPausedMainloop task:");
        sb.append(aVar);
        sb.append(",isPausedOnMobile:");
        Objects.requireNonNull((g.i.b.f.k.e) aVar);
        sb.append(false);
        g.i.b.e.h.b.c(concat, sb.toString());
    }

    public void onTaskPausedSubloop(a aVar) {
        c(aVar);
        d((g.i.b.f.k.e) aVar, 2);
    }

    public void onTaskPendingMainloop(a aVar) {
    }

    public void onTaskReceivedMainloop(a aVar) {
        String concat = "halley-downloader-TaskManager".concat(String.valueOf(aVar));
        StringBuilder sb = new StringBuilder("onTaskReceivedMainloop task:");
        sb.append(aVar);
        sb.append(",detectLen:");
        g.i.b.f.k.e eVar = (g.i.b.f.k.e) aVar;
        sb.append(eVar.s());
        sb.append(",receivedLen:");
        sb.append(eVar.m());
        sb.append(",percentage:");
        sb.append(eVar.d());
        g.i.b.e.h.b.c(concat, sb.toString());
    }

    public void onTaskReceivedSubloop(a aVar) {
        c(aVar);
    }

    public void onTaskStartedMainloop(a aVar) {
        k();
    }

    public void onTaskStartedSubloop(a aVar) {
        c(aVar);
    }
}
