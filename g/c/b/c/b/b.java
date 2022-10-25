package g.c.b.c.b;

import android.content.Context;
import android.os.Build;
import i.o.b.l;
import i.o.c.h;
import i.o.c.i;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.EnumSet;
import m.a.a.a.a.b.b0;
import m.a.b.a.a.a.b.h0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class b {
    public static final b a = new b();
    public static final Logger b = LoggerFactory.getLogger("XApkParser");

    public static final class a extends i implements l<String, InputStream> {
        public final /* synthetic */ Object $xapkFile;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Object obj) {
            super(1);
            this.$xapkFile = obj;
        }

        public Object g(Object obj) {
            return b.a.a(this.$xapkFile, (String) obj);
        }
    }

    public final InputStream a(Object obj, String str) {
        b0 a2;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            if (obj instanceof h0) {
                m.a.b.a.a.a.b.b0 a3 = ((h0) obj).a(str);
                if (a3 == null) {
                    return null;
                }
                return ((h0) obj).b(a3);
            } else if (!(obj instanceof m.a.a.a.a.b.h0) || (a2 = ((m.a.a.a.a.b.h0) obj).a(str)) == null) {
                return null;
            } else {
                return ((m.a.a.a.a.b.h0) obj).b(a2);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final Object b(File file) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                return new h0(Files.newByteChannel(file.toPath(), EnumSet.of(StandardOpenOption.READ), new FileAttribute[0]), file.getAbsolutePath(), "UTF8", true, true);
            }
            return new m.a.a.a.a.b.h0(file);
        } catch (Exception unused) {
            return null;
        }
    }

    public final a c(Context context, String str) {
        h.e(context, "context");
        h.e(str, "path");
        return d(context, b(new File(str)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d0, code lost:
        if ((r7 == null || r7.length() == 0) == false) goto L_0x00d7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x015b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g.c.b.c.b.a d(android.content.Context r14, java.lang.Object r15) {
        /*
            r13 = this;
            r14 = 0
            if (r15 != 0) goto L_0x0004
            return r14
        L_0x0004:
            java.lang.String r0 = "manifest.json"
            java.io.InputStream r0 = r13.a(r15, r0)
            if (r0 != 0) goto L_0x000d
            goto L_0x003f
        L_0x000d:
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x003f }
            java.lang.String r2 = "UTF8"
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x003f }
            java.lang.Class<g.c.b.c.a.c> r0 = g.c.b.c.a.c.class
            g.e.c.e r2 = new g.e.c.e     // Catch:{ Exception -> 0x003b }
            r2.<init>()     // Catch:{ Exception -> 0x003b }
            r2.b()     // Catch:{ Exception -> 0x003b }
            com.google.gson.Gson r2 = r2.a()     // Catch:{ Exception -> 0x003b }
            g.e.c.v.a r3 = new g.e.c.v.a     // Catch:{ Exception -> 0x003b }
            r3.<init>(r1)     // Catch:{ Exception -> 0x003b }
            boolean r1 = r2.f387j     // Catch:{ Exception -> 0x003b }
            r3.c = r1     // Catch:{ Exception -> 0x003b }
            java.lang.Object r1 = r2.c(r3, r0)     // Catch:{ Exception -> 0x003b }
            com.google.gson.Gson.a(r1, r3)     // Catch:{ Exception -> 0x003b }
            java.lang.Class r0 = g.c.b.b.f.y0(r0)     // Catch:{ Exception -> 0x003b }
            java.lang.Object r0 = r0.cast(r1)     // Catch:{ Exception -> 0x003b }
            goto L_0x003c
        L_0x003b:
            r0 = r14
        L_0x003c:
            g.c.b.c.a.c r0 = (g.c.b.c.a.c) r0     // Catch:{ Exception -> 0x003f }
            goto L_0x0040
        L_0x003f:
            r0 = r14
        L_0x0040:
            if (r0 != 0) goto L_0x0043
            return r14
        L_0x0043:
            int r1 = r0.i()
            r2 = 1
            if (r1 < r2) goto L_0x031b
            java.lang.String r1 = r0.e()
            r2 = 0
            if (r1 == 0) goto L_0x005a
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r1 = 0
            goto L_0x005b
        L_0x005a:
            r1 = 1
        L_0x005b:
            if (r1 == 0) goto L_0x005f
            goto L_0x031b
        L_0x005f:
            g.c.b.c.b.a r1 = new g.c.b.c.b.a
            g.c.b.c.b.b$a r3 = new g.c.b.c.b.b$a
            r3.<init>(r15)
            r1.<init>(r3)
            java.lang.String r3 = r0.e()
            r1.b = r3
            java.util.Map r3 = r0.d()
            java.lang.String r4 = "getDefault(Locale.Category.DISPLAY)"
            java.lang.String r5 = "getDefault()"
            r6 = 26
            if (r3 != 0) goto L_0x007c
            goto L_0x00d3
        L_0x007c:
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r6) goto L_0x0088
            java.util.Locale$Category r3 = java.util.Locale.Category.DISPLAY
            java.util.Locale r3 = java.util.Locale.getDefault(r3)
            r7 = r4
            goto L_0x008d
        L_0x0088:
            java.util.Locale r3 = java.util.Locale.getDefault()
            r7 = r5
        L_0x008d:
            i.o.c.h.d(r3, r7)
            java.util.Map r7 = r0.d()
            if (r7 != 0) goto L_0x0098
            r7 = r14
            goto L_0x00a2
        L_0x0098:
            java.lang.String r8 = r3.toString()
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
        L_0x00a2:
            if (r7 == 0) goto L_0x00ad
            int r8 = r7.length()
            if (r8 != 0) goto L_0x00ab
            goto L_0x00ad
        L_0x00ab:
            r8 = 0
            goto L_0x00ae
        L_0x00ad:
            r8 = 1
        L_0x00ae:
            if (r8 != 0) goto L_0x00b1
            goto L_0x00d7
        L_0x00b1:
            java.util.Map r7 = r0.d()
            if (r7 != 0) goto L_0x00b9
            r7 = r14
            goto L_0x00c4
        L_0x00b9:
            java.lang.String r3 = r3.getLanguage()
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r7 = r3
        L_0x00c4:
            if (r7 == 0) goto L_0x00cf
            int r3 = r7.length()
            if (r3 != 0) goto L_0x00cd
            goto L_0x00cf
        L_0x00cd:
            r3 = 0
            goto L_0x00d0
        L_0x00cf:
            r3 = 1
        L_0x00d0:
            if (r3 != 0) goto L_0x00d3
            goto L_0x00d7
        L_0x00d3:
            java.lang.String r7 = r0.c()
        L_0x00d7:
            r1.c = r7
            int r3 = r0.i()
            r7 = 3
            if (r3 >= r7) goto L_0x00e3
            java.lang.String r3 = "icon.png"
            goto L_0x00e7
        L_0x00e3:
            java.lang.String r3 = r0.b()
        L_0x00e7:
            r1.f2308d = r3
            java.lang.String r3 = r0.h()
            r1.f2309e = r3
            java.lang.String r3 = r0.g()
            r1.f2310f = r3
            int r3 = r0.i()
            r7 = 2
            if (r3 >= r7) goto L_0x015b
            java.lang.String r3 = r0.e()
            if (r3 == 0) goto L_0x010b
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0109
            goto L_0x010b
        L_0x0109:
            r3 = 0
            goto L_0x010c
        L_0x010b:
            r3 = 1
        L_0x010c:
            if (r3 == 0) goto L_0x010f
            goto L_0x0168
        L_0x010f:
            g.c.b.c.b.a$a r3 = new g.c.b.c.b.a$a
            r3.<init>()
            java.lang.String r8 = r0.e()
            java.lang.String r9 = ".apk"
            java.lang.String r8 = i.o.c.h.j(r8, r9)
            r3.a = r8
            if (r8 == 0) goto L_0x012b
            int r9 = r8.length()
            if (r9 != 0) goto L_0x0129
            goto L_0x012b
        L_0x0129:
            r9 = 0
            goto L_0x012c
        L_0x012b:
            r9 = 1
        L_0x012c:
            if (r9 == 0) goto L_0x012f
            goto L_0x0151
        L_0x012f:
            boolean r9 = r15 instanceof m.a.b.a.a.a.b.h0     // Catch:{ Exception -> 0x0151 }
            if (r9 == 0) goto L_0x0140
            r9 = r15
            m.a.b.a.a.a.b.h0 r9 = (m.a.b.a.a.a.b.h0) r9     // Catch:{ Exception -> 0x0151 }
            m.a.b.a.a.a.b.b0 r8 = r9.a(r8)     // Catch:{ Exception -> 0x0151 }
            if (r8 != 0) goto L_0x013d
            goto L_0x0151
        L_0x013d:
            long r8 = r8.c     // Catch:{ Exception -> 0x0151 }
            goto L_0x0153
        L_0x0140:
            boolean r9 = r15 instanceof m.a.a.a.a.b.h0     // Catch:{ Exception -> 0x0151 }
            if (r9 == 0) goto L_0x0151
            r9 = r15
            m.a.a.a.a.b.h0 r9 = (m.a.a.a.a.b.h0) r9     // Catch:{ Exception -> 0x0151 }
            m.a.a.a.a.b.b0 r8 = r9.a(r8)     // Catch:{ Exception -> 0x0151 }
            if (r8 != 0) goto L_0x014e
            goto L_0x0151
        L_0x014e:
            long r8 = r8.c     // Catch:{ Exception -> 0x0151 }
            goto L_0x0153
        L_0x0151:
            r8 = 0
        L_0x0153:
            r3.b = r8
            java.util.List r3 = g.c.b.b.f.V(r3)
            goto L_0x01db
        L_0x015b:
            java.util.List r3 = r0.f()
            if (r3 != 0) goto L_0x0162
            goto L_0x0168
        L_0x0162:
            java.util.List r3 = r0.f()
            if (r3 != 0) goto L_0x016b
        L_0x0168:
            r3 = r14
            goto L_0x01db
        L_0x016b:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0174:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x01da
            java.lang.Object r9 = r3.next()
            g.c.b.c.a.a r9 = (g.c.b.c.a.a) r9
            java.lang.String r10 = r9.a()
            if (r10 == 0) goto L_0x018f
            int r10 = r10.length()
            if (r10 != 0) goto L_0x018d
            goto L_0x018f
        L_0x018d:
            r10 = 0
            goto L_0x0190
        L_0x018f:
            r10 = 1
        L_0x0190:
            if (r10 != 0) goto L_0x01d3
            g.c.b.c.b.a$a r10 = new g.c.b.c.b.a$a
            r10.<init>()
            java.lang.String r9 = r9.a()
            r10.a = r9
            if (r9 == 0) goto L_0x01a8
            int r11 = r9.length()
            if (r11 != 0) goto L_0x01a6
            goto L_0x01a8
        L_0x01a6:
            r11 = 0
            goto L_0x01a9
        L_0x01a8:
            r11 = 1
        L_0x01a9:
            if (r11 == 0) goto L_0x01ac
            goto L_0x01ce
        L_0x01ac:
            boolean r11 = r15 instanceof m.a.b.a.a.a.b.h0     // Catch:{ Exception -> 0x01ce }
            if (r11 == 0) goto L_0x01bd
            r11 = r15
            m.a.b.a.a.a.b.h0 r11 = (m.a.b.a.a.a.b.h0) r11     // Catch:{ Exception -> 0x01ce }
            m.a.b.a.a.a.b.b0 r9 = r11.a(r9)     // Catch:{ Exception -> 0x01ce }
            if (r9 != 0) goto L_0x01ba
            goto L_0x01ce
        L_0x01ba:
            long r11 = r9.c     // Catch:{ Exception -> 0x01ce }
            goto L_0x01d0
        L_0x01bd:
            boolean r11 = r15 instanceof m.a.a.a.a.b.h0     // Catch:{ Exception -> 0x01ce }
            if (r11 == 0) goto L_0x01ce
            r11 = r15
            m.a.a.a.a.b.h0 r11 = (m.a.a.a.a.b.h0) r11     // Catch:{ Exception -> 0x01ce }
            m.a.a.a.a.b.b0 r9 = r11.a(r9)     // Catch:{ Exception -> 0x01ce }
            if (r9 != 0) goto L_0x01cb
            goto L_0x01ce
        L_0x01cb:
            long r11 = r9.c     // Catch:{ Exception -> 0x01ce }
            goto L_0x01d0
        L_0x01ce:
            r11 = 0
        L_0x01d0:
            r10.b = r11
            goto L_0x01d4
        L_0x01d3:
            r10 = r14
        L_0x01d4:
            if (r10 == 0) goto L_0x0174
            r8.add(r10)
            goto L_0x0174
        L_0x01da:
            r3 = r8
        L_0x01db:
            r1.f2311g = r3
            java.util.List r3 = r0.a()
            if (r3 != 0) goto L_0x01e5
            goto L_0x0318
        L_0x01e5:
            java.util.List r3 = r0.a()
            if (r3 != 0) goto L_0x01ed
            goto L_0x0318
        L_0x01ed:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x01f6:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x0317
            java.lang.Object r9 = r3.next()
            g.c.b.c.a.b r9 = (g.c.b.c.a.b) r9
            java.lang.String r10 = r9.a()
            if (r10 == 0) goto L_0x0211
            boolean r10 = i.t.e.j(r10)
            if (r10 == 0) goto L_0x020f
            goto L_0x0211
        L_0x020f:
            r10 = 0
            goto L_0x0212
        L_0x0211:
            r10 = 1
        L_0x0212:
            if (r10 != 0) goto L_0x030c
            g.c.b.c.b.a$b r10 = new g.c.b.c.b.a$b
            r10.<init>()
            java.lang.String r11 = r9.a()
            r10.a = r11
            if (r11 == 0) goto L_0x022a
            int r12 = r11.length()
            if (r12 != 0) goto L_0x0228
            goto L_0x022a
        L_0x0228:
            r12 = 0
            goto L_0x022b
        L_0x022a:
            r12 = 1
        L_0x022b:
            if (r12 == 0) goto L_0x022e
            goto L_0x0250
        L_0x022e:
            boolean r12 = r15 instanceof m.a.b.a.a.a.b.h0     // Catch:{ Exception -> 0x0250 }
            if (r12 == 0) goto L_0x023f
            r12 = r15
            m.a.b.a.a.a.b.h0 r12 = (m.a.b.a.a.a.b.h0) r12     // Catch:{ Exception -> 0x0250 }
            m.a.b.a.a.a.b.b0 r11 = r12.a(r11)     // Catch:{ Exception -> 0x0250 }
            if (r11 != 0) goto L_0x023c
            goto L_0x0250
        L_0x023c:
            long r11 = r11.c     // Catch:{ Exception -> 0x0250 }
            goto L_0x0252
        L_0x023f:
            boolean r12 = r15 instanceof m.a.a.a.a.b.h0     // Catch:{ Exception -> 0x0250 }
            if (r12 == 0) goto L_0x0250
            r12 = r15
            m.a.a.a.a.b.h0 r12 = (m.a.a.a.a.b.h0) r12     // Catch:{ Exception -> 0x0250 }
            m.a.a.a.a.b.b0 r11 = r12.a(r11)     // Catch:{ Exception -> 0x0250 }
            if (r11 != 0) goto L_0x024d
            goto L_0x0250
        L_0x024d:
            long r11 = r11.c     // Catch:{ Exception -> 0x0250 }
            goto L_0x0252
        L_0x0250:
            r11 = 0
        L_0x0252:
            r10.b = r11
            java.io.File r11 = new java.io.File
            java.lang.String r12 = r9.a()
            i.o.c.h.c(r12)
            r11.<init>(r12)
            java.lang.String r11 = r11.getName()
            java.lang.String r12 = "fileName"
            i.o.c.h.d(r11, r12)
            java.lang.String r12 = r9.b()
            if (r12 == 0) goto L_0x0278
            int r12 = r12.length()
            if (r12 != 0) goto L_0x0276
            goto L_0x0278
        L_0x0276:
            r12 = 0
            goto L_0x0279
        L_0x0278:
            r12 = 1
        L_0x0279:
            if (r12 != 0) goto L_0x02ae
            java.lang.String r12 = r9.c()
            if (r12 == 0) goto L_0x028a
            int r12 = r12.length()
            if (r12 != 0) goto L_0x0288
            goto L_0x028a
        L_0x0288:
            r12 = 0
            goto L_0x028b
        L_0x028a:
            r12 = 1
        L_0x028b:
            if (r12 != 0) goto L_0x02ae
            java.lang.String r2 = r9.b()
            java.lang.String r6 = "EXTERNAL_STORAGE"
            boolean r2 = i.o.c.h.a(r2, r6)
            if (r2 == 0) goto L_0x0308
            java.io.File r2 = new java.io.File
            java.io.File r6 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r9 = r9.c()
            i.o.c.h.c(r9)
            r2.<init>(r6, r9)
        L_0x02a9:
            java.lang.String r2 = r2.getAbsolutePath()
            goto L_0x0309
        L_0x02ae:
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 < r6) goto L_0x02ba
            java.util.Locale$Category r6 = java.util.Locale.Category.DISPLAY
            java.util.Locale r6 = java.util.Locale.getDefault(r6)
            r9 = r4
            goto L_0x02bf
        L_0x02ba:
            java.util.Locale r6 = java.util.Locale.getDefault()
            r9 = r5
        L_0x02bf:
            i.o.c.h.d(r6, r9)
            java.lang.String r6 = r11.toLowerCase(r6)
            java.lang.String r9 = "(this as java.lang.String).toLowerCase(locale)"
            i.o.c.h.d(r6, r9)
            java.lang.String r9 = ".obb"
            boolean r2 = i.t.e.b(r6, r9, r2, r7)
            if (r2 == 0) goto L_0x0308
            java.lang.String r2 = r0.e()
            if (r2 == 0) goto L_0x02e2
            int r2 = r2.length()
            if (r2 != 0) goto L_0x02e0
            goto L_0x02e2
        L_0x02e0:
            r2 = 0
            goto L_0x02e3
        L_0x02e2:
            r2 = 1
        L_0x02e3:
            if (r2 != 0) goto L_0x0308
            java.io.File r2 = new java.io.File
            java.io.File r6 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r9 = "Android/obb/"
            java.lang.StringBuilder r9 = g.a.a.a.a.i(r9)
            java.lang.String r12 = r0.e()
            r9.append(r12)
            r12 = 47
            r9.append(r12)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r2.<init>(r6, r9)
            goto L_0x02a9
        L_0x0308:
            r2 = r14
        L_0x0309:
            r10.c = r2
            goto L_0x030d
        L_0x030c:
            r10 = r14
        L_0x030d:
            if (r10 == 0) goto L_0x0312
            r8.add(r10)
        L_0x0312:
            r2 = 0
            r6 = 26
            goto L_0x01f6
        L_0x0317:
            r14 = r8
        L_0x0318:
            r1.f2312h = r14
            return r1
        L_0x031b:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.b.c.b.b.d(android.content.Context, java.lang.Object):g.c.b.c.b.a");
    }
}
