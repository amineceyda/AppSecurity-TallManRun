package g.e.b.l.j.l.d0;

import android.util.JsonReader;
import g.e.b.l.j.l.a0;
import g.e.b.l.j.l.b0;
import g.e.b.l.j.l.o;
import g.e.b.n.i.d;
import g.e.b.n.i.e;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Objects;

public class g {
    public static final g.e.b.n.a a;

    public interface a<T> {
        T a(JsonReader jsonReader) throws IOException;
    }

    static {
        e eVar = new e();
        ((g.e.b.l.j.l.a) g.e.b.l.j.l.a.a).a(eVar);
        eVar.f3712d = true;
        a = new d(eVar);
    }

    public static <T> b0<T> a(JsonReader jsonReader, a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return new b0<>(arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: g.e.b.l.j.l.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: g.e.b.l.j.l.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: g.e.b.l.j.l.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: g.e.b.l.j.l.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: g.e.b.l.j.l.a0$e$d$a$b$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: g.e.b.l.j.l.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: g.e.b.l.j.l.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: g.e.b.l.j.l.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: g.e.b.l.j.l.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: g.e.b.l.j.l.a0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v19, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: g.e.b.l.j.l.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v23, resolved type: g.e.b.l.j.l.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v24, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v8, resolved type: g.e.b.l.j.l.a0$e$d$a$b$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v28, resolved type: g.e.b.l.j.l.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v32, resolved type: java.lang.Long} */
    /* JADX WARNING: type inference failed for: r20v0 */
    /* JADX WARNING: type inference failed for: r20v1, types: [g.e.b.l.j.l.a0$a] */
    /* JADX WARNING: type inference failed for: r19v1, types: [g.e.b.l.j.l.a0$e$d$a$b$b] */
    /* JADX WARNING: type inference failed for: r20v2 */
    /* JADX WARNING: type inference failed for: r20v3 */
    /* JADX WARNING: type inference failed for: r19v4 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0225  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g.e.b.l.j.l.a0.e.d b(android.util.JsonReader r29) throws java.io.IOException {
        /*
            r0 = r29
            g.e.b.l.j.l.k$b r1 = new g.e.b.l.j.l.k$b
            r1.<init>()
            r29.beginObject()
        L_0x000a:
            boolean r2 = r29.hasNext()
            if (r2 == 0) goto L_0x0488
            java.lang.String r2 = r29.nextName()
            r2.hashCode()
            int r3 = r2.hashCode()
            java.lang.String r4 = "timestamp"
            r5 = 3
            r6 = 4
            r7 = 1
            r8 = 2
            switch(r3) {
                case -1335157162: goto L_0x004f;
                case 96801: goto L_0x0044;
                case 107332: goto L_0x0039;
                case 3575610: goto L_0x002e;
                case 55126294: goto L_0x0025;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x005a
        L_0x0025:
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x002c
            goto L_0x005a
        L_0x002c:
            r2 = 4
            goto L_0x005b
        L_0x002e:
            java.lang.String r3 = "type"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0037
            goto L_0x005a
        L_0x0037:
            r2 = 3
            goto L_0x005b
        L_0x0039:
            java.lang.String r3 = "log"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0042
            goto L_0x005a
        L_0x0042:
            r2 = 2
            goto L_0x005b
        L_0x0044:
            java.lang.String r3 = "app"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x004d
            goto L_0x005a
        L_0x004d:
            r2 = 1
            goto L_0x005b
        L_0x004f:
            java.lang.String r3 = "device"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r2 = 0
            goto L_0x005b
        L_0x005a:
            r2 = -1
        L_0x005b:
            java.lang.String r3 = ""
            java.lang.String r9 = "Missing required properties:"
            r10 = 0
            r11 = 5
            if (r2 == 0) goto L_0x03c3
            if (r2 == r7) goto L_0x00c6
            if (r2 == r8) goto L_0x007f
            if (r2 == r5) goto L_0x0077
            if (r2 == r6) goto L_0x006f
            r29.skipValue()
            goto L_0x000a
        L_0x006f:
            long r2 = r29.nextLong()
            r1.d(r2)
            goto L_0x000a
        L_0x0077:
            java.lang.String r2 = r29.nextString()
            r1.e(r2)
            goto L_0x000a
        L_0x007f:
            r29.beginObject()
            r2 = r10
        L_0x0083:
            boolean r4 = r29.hasNext()
            if (r4 == 0) goto L_0x00a6
            java.lang.String r4 = r29.nextName()
            r4.hashCode()
            java.lang.String r5 = "content"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x009c
            r29.skipValue()
            goto L_0x0083
        L_0x009c:
            java.lang.String r2 = r29.nextString()
            java.lang.String r4 = "Null content"
            java.util.Objects.requireNonNull(r2, r4)
            goto L_0x0083
        L_0x00a6:
            r29.endObject()
            if (r2 != 0) goto L_0x00ad
            java.lang.String r3 = " content"
        L_0x00ad:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x00bc
            g.e.b.l.j.l.t r3 = new g.e.b.l.j.l.t
            r3.<init>(r2, r10)
            r1.f3656e = r3
            goto L_0x000a
        L_0x00bc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = g.a.a.a.a.w(r9, r3)
            r0.<init>(r1)
            throw r0
        L_0x00c6:
            r29.beginObject()
            r2 = r10
            r11 = r2
            r12 = r11
            r13 = r12
            r14 = r13
        L_0x00ce:
            boolean r15 = r29.hasNext()
            if (r15 == 0) goto L_0x0390
            java.lang.String r15 = r29.nextName()
            r15.hashCode()
            int r16 = r15.hashCode()
            switch(r16) {
                case -1332194002: goto L_0x010f;
                case -1090974952: goto L_0x0104;
                case -80231855: goto L_0x00f9;
                case 555169704: goto L_0x00ee;
                case 928737948: goto L_0x00e3;
                default: goto L_0x00e2;
            }
        L_0x00e2:
            goto L_0x011a
        L_0x00e3:
            java.lang.String r6 = "uiOrientation"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x00ec
            goto L_0x011a
        L_0x00ec:
            r6 = 4
            goto L_0x011b
        L_0x00ee:
            java.lang.String r6 = "customAttributes"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x00f7
            goto L_0x011a
        L_0x00f7:
            r6 = 3
            goto L_0x011b
        L_0x00f9:
            java.lang.String r6 = "internalKeys"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x0102
            goto L_0x011a
        L_0x0102:
            r6 = 2
            goto L_0x011b
        L_0x0104:
            java.lang.String r6 = "execution"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x010d
            goto L_0x011a
        L_0x010d:
            r6 = 1
            goto L_0x011b
        L_0x010f:
            java.lang.String r6 = "background"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x0118
            goto L_0x011a
        L_0x0118:
            r6 = 0
            goto L_0x011b
        L_0x011a:
            r6 = -1
        L_0x011b:
            if (r6 == 0) goto L_0x0383
            if (r6 == r7) goto L_0x0145
            if (r6 == r8) goto L_0x013d
            if (r6 == r5) goto L_0x0135
            r15 = 4
            if (r6 == r15) goto L_0x012b
            r29.skipValue()
            goto L_0x038d
        L_0x012b:
            int r2 = r29.nextInt()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x038d
        L_0x0135:
            g.e.b.l.j.l.d0.f r6 = g.e.b.l.j.l.d0.f.a
            g.e.b.l.j.l.b0 r11 = a(r0, r6)
            goto L_0x038d
        L_0x013d:
            g.e.b.l.j.l.d0.f r6 = g.e.b.l.j.l.d0.f.a
            g.e.b.l.j.l.b0 r12 = a(r0, r6)
            goto L_0x038d
        L_0x0145:
            r29.beginObject()
            r18 = r14
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
        L_0x0152:
            boolean r6 = r29.hasNext()
            if (r6 == 0) goto L_0x0357
            java.lang.String r6 = r29.nextName()
            r6.hashCode()
            int r10 = r6.hashCode()
            switch(r10) {
                case -1375141843: goto L_0x0193;
                case -1337936983: goto L_0x0188;
                case -902467928: goto L_0x017d;
                case 937615455: goto L_0x0172;
                case 1481625679: goto L_0x0167;
                default: goto L_0x0166;
            }
        L_0x0166:
            goto L_0x019e
        L_0x0167:
            java.lang.String r10 = "exception"
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L_0x0170
            goto L_0x019e
        L_0x0170:
            r6 = 4
            goto L_0x019f
        L_0x0172:
            java.lang.String r10 = "binaries"
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L_0x017b
            goto L_0x019e
        L_0x017b:
            r6 = 3
            goto L_0x019f
        L_0x017d:
            java.lang.String r10 = "signal"
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L_0x0186
            goto L_0x019e
        L_0x0186:
            r6 = 2
            goto L_0x019f
        L_0x0188:
            java.lang.String r10 = "threads"
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L_0x0191
            goto L_0x019e
        L_0x0191:
            r6 = 1
            goto L_0x019f
        L_0x0193:
            java.lang.String r10 = "appExitInfo"
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L_0x019c
            goto L_0x019e
        L_0x019c:
            r6 = 0
            goto L_0x019f
        L_0x019e:
            r6 = -1
        L_0x019f:
            if (r6 == 0) goto L_0x0273
            if (r6 == r7) goto L_0x0269
            if (r6 == r8) goto L_0x01ba
            if (r6 == r5) goto L_0x01b3
            r10 = 4
            if (r6 == r10) goto L_0x01ae
            r29.skipValue()
            goto L_0x0152
        L_0x01ae:
            g.e.b.l.j.l.a0$e$d$a$b$b r19 = c(r29)
            goto L_0x0152
        L_0x01b3:
            g.e.b.l.j.l.d0.e r6 = g.e.b.l.j.l.d0.e.a
            g.e.b.l.j.l.b0 r22 = a(r0, r6)
            goto L_0x0152
        L_0x01ba:
            r29.beginObject()
            r24 = r14
            r25 = r24
        L_0x01c1:
            boolean r6 = r29.hasNext()
            if (r6 == 0) goto L_0x022f
            java.lang.String r6 = r29.nextName()
            r6.hashCode()
            int r10 = r6.hashCode()
            r15 = -1147692044(0xffffffffbb979bf4, float:-0.0046267454)
            if (r10 == r15) goto L_0x01f8
            r15 = 3059181(0x2eaded, float:4.286826E-39)
            if (r10 == r15) goto L_0x01ed
            r15 = 3373707(0x337a8b, float:4.72757E-39)
            if (r10 == r15) goto L_0x01e2
            goto L_0x0200
        L_0x01e2:
            java.lang.String r10 = "name"
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L_0x01eb
            goto L_0x0200
        L_0x01eb:
            r6 = 2
            goto L_0x0203
        L_0x01ed:
            java.lang.String r10 = "code"
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L_0x01f6
            goto L_0x0200
        L_0x01f6:
            r6 = 1
            goto L_0x0203
        L_0x01f8:
            java.lang.String r10 = "address"
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L_0x0202
        L_0x0200:
            r6 = -1
            goto L_0x0203
        L_0x0202:
            r6 = 0
        L_0x0203:
            if (r6 == 0) goto L_0x0225
            if (r6 == r7) goto L_0x0219
            if (r6 == r8) goto L_0x020d
            r29.skipValue()
            goto L_0x01c1
        L_0x020d:
            java.lang.String r6 = r29.nextString()
            java.lang.String r10 = "Null name"
            java.util.Objects.requireNonNull(r6, r10)
            r24 = r6
            goto L_0x01c1
        L_0x0219:
            java.lang.String r6 = r29.nextString()
            java.lang.String r10 = "Null code"
            java.util.Objects.requireNonNull(r6, r10)
            r25 = r6
            goto L_0x01c1
        L_0x0225:
            long r14 = r29.nextLong()
            java.lang.Long r6 = java.lang.Long.valueOf(r14)
            r14 = r6
            goto L_0x01c1
        L_0x022f:
            r29.endObject()
            if (r24 != 0) goto L_0x0237
            java.lang.String r6 = " name"
            goto L_0x0238
        L_0x0237:
            r6 = r3
        L_0x0238:
            if (r25 != 0) goto L_0x0240
            java.lang.String r10 = " code"
            java.lang.String r6 = g.a.a.a.a.w(r6, r10)
        L_0x0240:
            if (r14 != 0) goto L_0x0248
            java.lang.String r10 = " address"
            java.lang.String r6 = g.a.a.a.a.w(r6, r10)
        L_0x0248:
            boolean r10 = r6.isEmpty()
            if (r10 == 0) goto L_0x025f
            g.e.b.l.j.l.p r6 = new g.e.b.l.j.l.p
            long r26 = r14.longValue()
            r28 = 0
            r23 = r6
            r23.<init>(r24, r25, r26, r28)
            r21 = r6
            goto L_0x0354
        L_0x025f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = g.a.a.a.a.w(r9, r6)
            r0.<init>(r1)
            throw r0
        L_0x0269:
            g.e.b.l.j.l.d0.c r6 = g.e.b.l.j.l.d0.c.a
            g.e.b.l.j.l.b0 r6 = a(r0, r6)
            r18 = r6
            goto L_0x0354
        L_0x0273:
            g.e.b.l.j.l.c$b r6 = new g.e.b.l.j.l.c$b
            r6.<init>()
            r29.beginObject()
        L_0x027b:
            boolean r10 = r29.hasNext()
            if (r10 == 0) goto L_0x034b
            java.lang.String r10 = r29.nextName()
            r10.hashCode()
            int r14 = r10.hashCode()
            switch(r14) {
                case 110987: goto L_0x02dc;
                case 111312: goto L_0x02d1;
                case 113234: goto L_0x02c6;
                case 55126294: goto L_0x02bd;
                case 202325402: goto L_0x02b2;
                case 722137681: goto L_0x02a7;
                case 723857505: goto L_0x029c;
                case 2125650548: goto L_0x0291;
                default: goto L_0x028f;
            }
        L_0x028f:
            goto L_0x02e7
        L_0x0291:
            java.lang.String r14 = "importance"
            boolean r10 = r10.equals(r14)
            if (r10 != 0) goto L_0x029a
            goto L_0x02e7
        L_0x029a:
            r10 = 7
            goto L_0x02e8
        L_0x029c:
            java.lang.String r14 = "traceFile"
            boolean r10 = r10.equals(r14)
            if (r10 != 0) goto L_0x02a5
            goto L_0x02e7
        L_0x02a5:
            r10 = 6
            goto L_0x02e8
        L_0x02a7:
            java.lang.String r14 = "reasonCode"
            boolean r10 = r10.equals(r14)
            if (r10 != 0) goto L_0x02b0
            goto L_0x02e7
        L_0x02b0:
            r10 = 5
            goto L_0x02e8
        L_0x02b2:
            java.lang.String r14 = "processName"
            boolean r10 = r10.equals(r14)
            if (r10 != 0) goto L_0x02bb
            goto L_0x02e7
        L_0x02bb:
            r10 = 4
            goto L_0x02e8
        L_0x02bd:
            boolean r10 = r10.equals(r4)
            if (r10 != 0) goto L_0x02c4
            goto L_0x02e7
        L_0x02c4:
            r10 = 3
            goto L_0x02e8
        L_0x02c6:
            java.lang.String r14 = "rss"
            boolean r10 = r10.equals(r14)
            if (r10 != 0) goto L_0x02cf
            goto L_0x02e7
        L_0x02cf:
            r10 = 2
            goto L_0x02e8
        L_0x02d1:
            java.lang.String r14 = "pss"
            boolean r10 = r10.equals(r14)
            if (r10 != 0) goto L_0x02da
            goto L_0x02e7
        L_0x02da:
            r10 = 1
            goto L_0x02e8
        L_0x02dc:
            java.lang.String r14 = "pid"
            boolean r10 = r10.equals(r14)
            if (r10 != 0) goto L_0x02e5
            goto L_0x02e7
        L_0x02e5:
            r10 = 0
            goto L_0x02e8
        L_0x02e7:
            r10 = -1
        L_0x02e8:
            switch(r10) {
                case 0: goto L_0x033f;
                case 1: goto L_0x0333;
                case 2: goto L_0x0327;
                case 3: goto L_0x031b;
                case 4: goto L_0x030e;
                case 5: goto L_0x0302;
                case 6: goto L_0x02fa;
                case 7: goto L_0x02ef;
                default: goto L_0x02eb;
            }
        L_0x02eb:
            r29.skipValue()
            goto L_0x027b
        L_0x02ef:
            int r10 = r29.nextInt()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6.f3616d = r10
            goto L_0x027b
        L_0x02fa:
            java.lang.String r10 = r29.nextString()
            r6.f3620h = r10
            goto L_0x027b
        L_0x0302:
            int r10 = r29.nextInt()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6.c = r10
            goto L_0x027b
        L_0x030e:
            java.lang.String r10 = r29.nextString()
            java.lang.String r14 = "Null processName"
            java.util.Objects.requireNonNull(r10, r14)
            r6.b = r10
            goto L_0x027b
        L_0x031b:
            long r14 = r29.nextLong()
            java.lang.Long r10 = java.lang.Long.valueOf(r14)
            r6.f3619g = r10
            goto L_0x027b
        L_0x0327:
            long r14 = r29.nextLong()
            java.lang.Long r10 = java.lang.Long.valueOf(r14)
            r6.f3618f = r10
            goto L_0x027b
        L_0x0333:
            long r14 = r29.nextLong()
            java.lang.Long r10 = java.lang.Long.valueOf(r14)
            r6.f3617e = r10
            goto L_0x027b
        L_0x033f:
            int r10 = r29.nextInt()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6.a = r10
            goto L_0x027b
        L_0x034b:
            r29.endObject()
            g.e.b.l.j.l.a0$a r6 = r6.a()
            r20 = r6
        L_0x0354:
            r14 = 0
            goto L_0x0152
        L_0x0357:
            r29.endObject()
            if (r21 != 0) goto L_0x035f
            java.lang.String r6 = " signal"
            goto L_0x0360
        L_0x035f:
            r6 = r3
        L_0x0360:
            if (r22 != 0) goto L_0x0368
            java.lang.String r10 = " binaries"
            java.lang.String r6 = g.a.a.a.a.w(r6, r10)
        L_0x0368:
            boolean r10 = r6.isEmpty()
            if (r10 == 0) goto L_0x0379
            g.e.b.l.j.l.m r6 = new g.e.b.l.j.l.m
            r23 = 0
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r10 = r6
            goto L_0x038c
        L_0x0379:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = g.a.a.a.a.w(r9, r6)
            r0.<init>(r1)
            throw r0
        L_0x0383:
            boolean r6 = r29.nextBoolean()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r13 = r6
        L_0x038c:
            r14 = 0
        L_0x038d:
            r6 = 4
            goto L_0x00ce
        L_0x0390:
            r29.endObject()
            if (r10 != 0) goto L_0x0397
            java.lang.String r3 = " execution"
        L_0x0397:
            if (r2 != 0) goto L_0x039f
            java.lang.String r4 = " uiOrientation"
            java.lang.String r3 = g.a.a.a.a.w(r3, r4)
        L_0x039f:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x03b9
            g.e.b.l.j.l.l r9 = new g.e.b.l.j.l.l
            int r7 = r2.intValue()
            r8 = 0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.b(r9)
            goto L_0x000a
        L_0x03b9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = g.a.a.a.a.w(r9, r3)
            r0.<init>(r1)
            throw r0
        L_0x03c3:
            g.e.b.l.j.l.s$b r2 = new g.e.b.l.j.l.s$b
            r2.<init>()
            r29.beginObject()
        L_0x03cb:
            boolean r3 = r29.hasNext()
            if (r3 == 0) goto L_0x047c
            java.lang.String r3 = r29.nextName()
            r3.hashCode()
            int r4 = r3.hashCode()
            switch(r4) {
                case -1708606089: goto L_0x0417;
                case -1455558134: goto L_0x040c;
                case -1439500848: goto L_0x0401;
                case 279795450: goto L_0x03f6;
                case 976541947: goto L_0x03eb;
                case 1516795582: goto L_0x03e0;
                default: goto L_0x03df;
            }
        L_0x03df:
            goto L_0x0422
        L_0x03e0:
            java.lang.String r4 = "proximityOn"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x03e9
            goto L_0x0422
        L_0x03e9:
            r3 = 5
            goto L_0x0423
        L_0x03eb:
            java.lang.String r4 = "ramUsed"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x03f4
            goto L_0x0422
        L_0x03f4:
            r3 = 4
            goto L_0x0423
        L_0x03f6:
            java.lang.String r4 = "diskUsed"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x03ff
            goto L_0x0422
        L_0x03ff:
            r3 = 3
            goto L_0x0423
        L_0x0401:
            java.lang.String r4 = "orientation"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x040a
            goto L_0x0422
        L_0x040a:
            r3 = 2
            goto L_0x0423
        L_0x040c:
            java.lang.String r4 = "batteryVelocity"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0415
            goto L_0x0422
        L_0x0415:
            r3 = 1
            goto L_0x0423
        L_0x0417:
            java.lang.String r4 = "batteryLevel"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0420
            goto L_0x0422
        L_0x0420:
            r3 = 0
            goto L_0x0423
        L_0x0422:
            r3 = -1
        L_0x0423:
            if (r3 == 0) goto L_0x046f
            if (r3 == r7) goto L_0x0462
            r4 = 4
            if (r3 == r8) goto L_0x0456
            if (r3 == r5) goto L_0x044a
            if (r3 == r4) goto L_0x043f
            if (r3 == r11) goto L_0x0434
            r29.skipValue()
            goto L_0x03cb
        L_0x0434:
            boolean r3 = r29.nextBoolean()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.c = r3
            goto L_0x03cb
        L_0x043f:
            long r9 = r29.nextLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r2.f3674e = r3
            goto L_0x03cb
        L_0x044a:
            long r9 = r29.nextLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r2.f3675f = r3
            goto L_0x03cb
        L_0x0456:
            int r3 = r29.nextInt()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.f3673d = r3
            goto L_0x03cb
        L_0x0462:
            r4 = 4
            int r3 = r29.nextInt()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.b = r3
            goto L_0x03cb
        L_0x046f:
            r4 = 4
            double r9 = r29.nextDouble()
            java.lang.Double r3 = java.lang.Double.valueOf(r9)
            r2.a = r3
            goto L_0x03cb
        L_0x047c:
            r29.endObject()
            g.e.b.l.j.l.a0$e$d$c r2 = r2.a()
            r1.c(r2)
            goto L_0x000a
        L_0x0488:
            r29.endObject()
            g.e.b.l.j.l.a0$e$d r0 = r1.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.l.j.l.d0.g.b(android.util.JsonReader):g.e.b.l.j.l.a0$e$d");
    }

    public static a0.e.d.a.b.C0117b c(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        Integer num = null;
        String str = null;
        String str2 = null;
        b0 b0Var = null;
        a0.e.d.a.b.C0117b bVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    b0Var = a(jsonReader, b.a);
                    break;
                case 1:
                    str2 = jsonReader.nextString();
                    break;
                case 2:
                    str = jsonReader.nextString();
                    Objects.requireNonNull(str, "Null type");
                    break;
                case 3:
                    bVar = c(jsonReader);
                    break;
                case 4:
                    num = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String str3 = str == null ? " type" : "";
        if (b0Var == null) {
            str3 = g.a.a.a.a.w(str3, " frames");
        }
        if (num == null) {
            str3 = g.a.a.a.a.w(str3, " overflowCount");
        }
        if (str3.isEmpty()) {
            return new o(str, str2, b0Var, bVar, num.intValue(), (o.a) null);
        }
        throw new IllegalStateException(g.a.a.a.a.w("Missing required properties:", str3));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01d5, code lost:
        r17 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01f2, code lost:
        r17 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x021a, code lost:
        r8 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x021b, code lost:
        if (r8 == 0) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x021e, code lost:
        if (r8 == 1) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0221, code lost:
        if (r8 == 2) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0224, code lost:
        if (r8 == 3) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0227, code lost:
        if (r8 == 4) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x022a, code lost:
        if (r8 == 5) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x022c, code lost:
        r31.skipValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0230, code lost:
        r25 = r31.nextString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0237, code lost:
        r27 = r31.nextString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x023e, code lost:
        r3 = r31.nextString();
        java.util.Objects.requireNonNull(r3, "Null version");
        r24 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0248, code lost:
        r29 = r31.nextString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x024f, code lost:
        r28 = r31.nextString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0256, code lost:
        r3 = r31.nextString();
        java.util.Objects.requireNonNull(r3, "Null identifier");
        r23 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x025f, code lost:
        r3 = r17;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g.e.b.l.j.l.a0 d(android.util.JsonReader r31) throws java.io.IOException {
        /*
            r0 = r31
            java.nio.charset.Charset r1 = g.e.b.l.j.l.a0.a
            g.e.b.l.j.l.b$b r1 = new g.e.b.l.j.l.b$b
            r1.<init>()
            r31.beginObject()
        L_0x000c:
            boolean r2 = r31.hasNext()
            if (r2 == 0) goto L_0x054b
            java.lang.String r2 = r31.nextName()
            r2.hashCode()
            int r3 = r2.hashCode()
            java.lang.String r4 = "displayVersion"
            java.lang.String r5 = "platform"
            java.lang.String r6 = "installationUuid"
            java.lang.String r7 = "buildVersion"
            r8 = 0
            switch(r3) {
                case -2118372775: goto L_0x006f;
                case -1962630338: goto L_0x0064;
                case -911706486: goto L_0x005b;
                case 344431858: goto L_0x0050;
                case 719853845: goto L_0x0047;
                case 1874684019: goto L_0x003e;
                case 1975623094: goto L_0x0035;
                case 1984987798: goto L_0x002a;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x007a
        L_0x002a:
            java.lang.String r3 = "session"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0033
            goto L_0x007a
        L_0x0033:
            r2 = 7
            goto L_0x007b
        L_0x0035:
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x003c
            goto L_0x007a
        L_0x003c:
            r2 = 6
            goto L_0x007b
        L_0x003e:
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0045
            goto L_0x007a
        L_0x0045:
            r2 = 5
            goto L_0x007b
        L_0x0047:
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x004e
            goto L_0x007a
        L_0x004e:
            r2 = 4
            goto L_0x007b
        L_0x0050:
            java.lang.String r3 = "gmpAppId"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0059
            goto L_0x007a
        L_0x0059:
            r2 = 3
            goto L_0x007b
        L_0x005b:
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x0062
            goto L_0x007a
        L_0x0062:
            r2 = 2
            goto L_0x007b
        L_0x0064:
            java.lang.String r3 = "sdkVersion"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x006d
            goto L_0x007a
        L_0x006d:
            r2 = 1
            goto L_0x007b
        L_0x006f:
            java.lang.String r3 = "ndkPayload"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r2 = 0
            goto L_0x007b
        L_0x007a:
            r2 = -1
        L_0x007b:
            java.lang.String r3 = ""
            java.lang.String r9 = "Missing required properties:"
            java.lang.String r10 = "Null buildVersion"
            switch(r2) {
                case 0: goto L_0x04f3;
                case 1: goto L_0x04e6;
                case 2: goto L_0x04db;
                case 3: goto L_0x04ce;
                case 4: goto L_0x04c1;
                case 5: goto L_0x04b5;
                case 6: goto L_0x04a8;
                case 7: goto L_0x0088;
                default: goto L_0x0084;
            }
        L_0x0084:
            r31.skipValue()
            goto L_0x000c
        L_0x0088:
            g.e.b.l.j.l.g$b r2 = new g.e.b.l.j.l.g$b
            r2.<init>()
            r2.b(r8)
            r31.beginObject()
        L_0x0093:
            boolean r8 = r31.hasNext()
            if (r8 == 0) goto L_0x049d
            java.lang.String r8 = r31.nextName()
            r8.hashCode()
            int r11 = r8.hashCode()
            java.lang.String r12 = "identifier"
            switch(r11) {
                case -2128794476: goto L_0x0120;
                case -1618432855: goto L_0x0117;
                case -1606742899: goto L_0x010c;
                case -1335157162: goto L_0x0101;
                case -1291329255: goto L_0x00f6;
                case 3556: goto L_0x00eb;
                case 96801: goto L_0x00e0;
                case 3599307: goto L_0x00d5;
                case 286956243: goto L_0x00c7;
                case 1025385094: goto L_0x00b9;
                case 2047016109: goto L_0x00ab;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            goto L_0x012b
        L_0x00ab:
            java.lang.String r11 = "generatorType"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x00b5
            goto L_0x012b
        L_0x00b5:
            r8 = 10
            goto L_0x012c
        L_0x00b9:
            java.lang.String r11 = "crashed"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x00c3
            goto L_0x012b
        L_0x00c3:
            r8 = 9
            goto L_0x012c
        L_0x00c7:
            java.lang.String r11 = "generator"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x00d1
            goto L_0x012b
        L_0x00d1:
            r8 = 8
            goto L_0x012c
        L_0x00d5:
            java.lang.String r11 = "user"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x00de
            goto L_0x012b
        L_0x00de:
            r8 = 7
            goto L_0x012c
        L_0x00e0:
            java.lang.String r11 = "app"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x00e9
            goto L_0x012b
        L_0x00e9:
            r8 = 6
            goto L_0x012c
        L_0x00eb:
            java.lang.String r11 = "os"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x00f4
            goto L_0x012b
        L_0x00f4:
            r8 = 5
            goto L_0x012c
        L_0x00f6:
            java.lang.String r11 = "events"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x00ff
            goto L_0x012b
        L_0x00ff:
            r8 = 4
            goto L_0x012c
        L_0x0101:
            java.lang.String r11 = "device"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x010a
            goto L_0x012b
        L_0x010a:
            r8 = 3
            goto L_0x012c
        L_0x010c:
            java.lang.String r11 = "endedAt"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x0115
            goto L_0x012b
        L_0x0115:
            r8 = 2
            goto L_0x012c
        L_0x0117:
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x011e
            goto L_0x012b
        L_0x011e:
            r8 = 1
            goto L_0x012c
        L_0x0120:
            java.lang.String r11 = "startedAt"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x0129
            goto L_0x012b
        L_0x0129:
            r8 = 0
            goto L_0x012c
        L_0x012b:
            r8 = -1
        L_0x012c:
            java.lang.String r11 = "Null version"
            java.lang.String r13 = " version"
            java.lang.String r14 = "version"
            java.lang.String r15 = "Null identifier"
            java.lang.String r16 = " identifier"
            switch(r8) {
                case 0: goto L_0x048d;
                case 1: goto L_0x0478;
                case 2: goto L_0x046b;
                case 3: goto L_0x0363;
                case 4: goto L_0x0357;
                case 5: goto L_0x0294;
                case 6: goto L_0x01a7;
                case 7: goto L_0x015f;
                case 8: goto L_0x0153;
                case 9: goto L_0x014b;
                case 10: goto L_0x0140;
                default: goto L_0x0139;
            }
        L_0x0139:
            r17 = r3
            r31.skipValue()
            goto L_0x0499
        L_0x0140:
            int r8 = r31.nextInt()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r2.f3636k = r8
            goto L_0x0199
        L_0x014b:
            boolean r8 = r31.nextBoolean()
            r2.b(r8)
            goto L_0x0199
        L_0x0153:
            java.lang.String r8 = r31.nextString()
            java.lang.String r11 = "Null generator"
            java.util.Objects.requireNonNull(r8, r11)
            r2.a = r8
            goto L_0x0199
        L_0x015f:
            r31.beginObject()
            r8 = 0
        L_0x0163:
            boolean r11 = r31.hasNext()
            if (r11 == 0) goto L_0x0182
            java.lang.String r11 = r31.nextName()
            r11.hashCode()
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x017a
            r31.skipValue()
            goto L_0x0163
        L_0x017a:
            java.lang.String r8 = r31.nextString()
            java.util.Objects.requireNonNull(r8, r15)
            goto L_0x0163
        L_0x0182:
            r31.endObject()
            if (r8 != 0) goto L_0x018a
            r11 = r16
            goto L_0x018b
        L_0x018a:
            r11 = r3
        L_0x018b:
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x019d
            g.e.b.l.j.l.v r11 = new g.e.b.l.j.l.v
            r12 = 0
            r11.<init>(r8, r12)
            r2.f3632g = r11
        L_0x0199:
            r17 = r3
            goto L_0x0499
        L_0x019d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = g.a.a.a.a.w(r9, r11)
            r0.<init>(r1)
            throw r0
        L_0x01a7:
            r31.beginObject()
            r8 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = r8
            r24 = r17
            r25 = r18
            r27 = r19
            r28 = r20
            r29 = r21
        L_0x01c1:
            boolean r8 = r31.hasNext()
            if (r8 == 0) goto L_0x0263
            java.lang.String r8 = r31.nextName()
            r8.hashCode()
            int r17 = r8.hashCode()
            switch(r17) {
                case -1618432855: goto L_0x020f;
                case -519438642: goto L_0x0202;
                case 213652010: goto L_0x01f5;
                case 351608024: goto L_0x01ea;
                case 719853845: goto L_0x01e1;
                case 1975623094: goto L_0x01d8;
                default: goto L_0x01d5;
            }
        L_0x01d5:
            r17 = r3
            goto L_0x021a
        L_0x01d8:
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x01df
            goto L_0x01d5
        L_0x01df:
            r8 = 5
            goto L_0x01f2
        L_0x01e1:
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L_0x01e8
            goto L_0x01d5
        L_0x01e8:
            r8 = 4
            goto L_0x01f2
        L_0x01ea:
            boolean r8 = r8.equals(r14)
            if (r8 != 0) goto L_0x01f1
            goto L_0x01d5
        L_0x01f1:
            r8 = 3
        L_0x01f2:
            r17 = r3
            goto L_0x021b
        L_0x01f5:
            r17 = r3
            java.lang.String r3 = "developmentPlatformVersion"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x0200
            goto L_0x021a
        L_0x0200:
            r8 = 2
            goto L_0x021b
        L_0x0202:
            r17 = r3
            java.lang.String r3 = "developmentPlatform"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x020d
            goto L_0x021a
        L_0x020d:
            r8 = 1
            goto L_0x021b
        L_0x020f:
            r17 = r3
            boolean r3 = r8.equals(r12)
            if (r3 != 0) goto L_0x0218
            goto L_0x021a
        L_0x0218:
            r8 = 0
            goto L_0x021b
        L_0x021a:
            r8 = -1
        L_0x021b:
            if (r8 == 0) goto L_0x0256
            r3 = 1
            if (r8 == r3) goto L_0x024f
            r3 = 2
            if (r8 == r3) goto L_0x0248
            r3 = 3
            if (r8 == r3) goto L_0x023e
            r3 = 4
            if (r8 == r3) goto L_0x0237
            r3 = 5
            if (r8 == r3) goto L_0x0230
            r31.skipValue()
            goto L_0x025f
        L_0x0230:
            java.lang.String r3 = r31.nextString()
            r25 = r3
            goto L_0x025f
        L_0x0237:
            java.lang.String r3 = r31.nextString()
            r27 = r3
            goto L_0x025f
        L_0x023e:
            java.lang.String r3 = r31.nextString()
            java.util.Objects.requireNonNull(r3, r11)
            r24 = r3
            goto L_0x025f
        L_0x0248:
            java.lang.String r3 = r31.nextString()
            r29 = r3
            goto L_0x025f
        L_0x024f:
            java.lang.String r3 = r31.nextString()
            r28 = r3
            goto L_0x025f
        L_0x0256:
            java.lang.String r3 = r31.nextString()
            java.util.Objects.requireNonNull(r3, r15)
            r23 = r3
        L_0x025f:
            r3 = r17
            goto L_0x01c1
        L_0x0263:
            r17 = r3
            r31.endObject()
            if (r23 != 0) goto L_0x026d
            r3 = r16
            goto L_0x026f
        L_0x026d:
            r3 = r17
        L_0x026f:
            if (r24 != 0) goto L_0x0275
            java.lang.String r3 = g.a.a.a.a.w(r3, r13)
        L_0x0275:
            boolean r8 = r3.isEmpty()
            if (r8 == 0) goto L_0x028a
            g.e.b.l.j.l.h r3 = new g.e.b.l.j.l.h
            r26 = 0
            r30 = 0
            r22 = r3
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30)
            r2.f3631f = r3
            goto L_0x0499
        L_0x028a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = g.a.a.a.a.w(r9, r3)
            r0.<init>(r1)
            throw r0
        L_0x0294:
            r17 = r3
            r31.beginObject()
            r3 = 0
            r8 = 0
            r12 = 0
            r15 = 0
            r20 = r12
            r21 = r15
        L_0x02a1:
            boolean r12 = r31.hasNext()
            if (r12 == 0) goto L_0x0312
            java.lang.String r12 = r31.nextName()
            r12.hashCode()
            int r15 = r12.hashCode()
            switch(r15) {
                case -911706486: goto L_0x02d3;
                case -293026577: goto L_0x02c8;
                case 351608024: goto L_0x02bf;
                case 1874684019: goto L_0x02b6;
                default: goto L_0x02b5;
            }
        L_0x02b5:
            goto L_0x02dc
        L_0x02b6:
            boolean r12 = r12.equals(r5)
            if (r12 != 0) goto L_0x02bd
            goto L_0x02dc
        L_0x02bd:
            r12 = 3
            goto L_0x02dd
        L_0x02bf:
            boolean r12 = r12.equals(r14)
            if (r12 != 0) goto L_0x02c6
            goto L_0x02dc
        L_0x02c6:
            r12 = 2
            goto L_0x02dd
        L_0x02c8:
            java.lang.String r15 = "jailbroken"
            boolean r12 = r12.equals(r15)
            if (r12 != 0) goto L_0x02d1
            goto L_0x02dc
        L_0x02d1:
            r12 = 1
            goto L_0x02dd
        L_0x02d3:
            boolean r12 = r12.equals(r7)
            if (r12 != 0) goto L_0x02da
            goto L_0x02dc
        L_0x02da:
            r12 = 0
            goto L_0x02dd
        L_0x02dc:
            r12 = -1
        L_0x02dd:
            if (r12 == 0) goto L_0x0308
            r15 = 1
            if (r12 == r15) goto L_0x02ff
            r15 = 2
            if (r12 == r15) goto L_0x02f5
            r15 = 3
            if (r12 == r15) goto L_0x02ec
            r31.skipValue()
            goto L_0x02a1
        L_0x02ec:
            int r8 = r31.nextInt()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x02a1
        L_0x02f5:
            java.lang.String r12 = r31.nextString()
            java.util.Objects.requireNonNull(r12, r11)
            r20 = r12
            goto L_0x02a1
        L_0x02ff:
            boolean r3 = r31.nextBoolean()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x02a1
        L_0x0308:
            java.lang.String r12 = r31.nextString()
            java.util.Objects.requireNonNull(r12, r10)
            r21 = r12
            goto L_0x02a1
        L_0x0312:
            r31.endObject()
            if (r8 != 0) goto L_0x031a
            java.lang.String r11 = " platform"
            goto L_0x031c
        L_0x031a:
            r11 = r17
        L_0x031c:
            if (r20 != 0) goto L_0x0322
            java.lang.String r11 = g.a.a.a.a.w(r11, r13)
        L_0x0322:
            if (r21 != 0) goto L_0x032a
            java.lang.String r12 = " buildVersion"
            java.lang.String r11 = g.a.a.a.a.w(r11, r12)
        L_0x032a:
            if (r3 != 0) goto L_0x0332
            java.lang.String r12 = " jailbroken"
            java.lang.String r11 = g.a.a.a.a.w(r11, r12)
        L_0x0332:
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x034d
            g.e.b.l.j.l.u r11 = new g.e.b.l.j.l.u
            int r19 = r8.intValue()
            boolean r22 = r3.booleanValue()
            r23 = 0
            r18 = r11
            r18.<init>(r19, r20, r21, r22, r23)
            r2.f3633h = r11
            goto L_0x0499
        L_0x034d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = g.a.a.a.a.w(r9, r11)
            r0.<init>(r1)
            throw r0
        L_0x0357:
            r17 = r3
            g.e.b.l.j.l.d0.a r3 = g.e.b.l.j.l.d0.a.a
            g.e.b.l.j.l.b0 r3 = a(r0, r3)
            r2.f3635j = r3
            goto L_0x0499
        L_0x0363:
            r17 = r3
            g.e.b.l.j.l.j$b r3 = new g.e.b.l.j.l.j$b
            r3.<init>()
            r31.beginObject()
        L_0x036d:
            boolean r8 = r31.hasNext()
            if (r8 == 0) goto L_0x0461
            java.lang.String r8 = r31.nextName()
            r8.hashCode()
            int r11 = r8.hashCode()
            switch(r11) {
                case -1981332476: goto L_0x03de;
                case -1969347631: goto L_0x03d3;
                case 112670: goto L_0x03c8;
                case 3002454: goto L_0x03bd;
                case 81784169: goto L_0x03b2;
                case 94848180: goto L_0x03a7;
                case 104069929: goto L_0x039c;
                case 109757585: goto L_0x0391;
                case 2078953423: goto L_0x0383;
                default: goto L_0x0381;
            }
        L_0x0381:
            goto L_0x03e9
        L_0x0383:
            java.lang.String r11 = "modelClass"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x038d
            goto L_0x03e9
        L_0x038d:
            r8 = 8
            goto L_0x03ea
        L_0x0391:
            java.lang.String r11 = "state"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x039a
            goto L_0x03e9
        L_0x039a:
            r8 = 7
            goto L_0x03ea
        L_0x039c:
            java.lang.String r11 = "model"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x03a5
            goto L_0x03e9
        L_0x03a5:
            r8 = 6
            goto L_0x03ea
        L_0x03a7:
            java.lang.String r11 = "cores"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x03b0
            goto L_0x03e9
        L_0x03b0:
            r8 = 5
            goto L_0x03ea
        L_0x03b2:
            java.lang.String r11 = "diskSpace"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x03bb
            goto L_0x03e9
        L_0x03bb:
            r8 = 4
            goto L_0x03ea
        L_0x03bd:
            java.lang.String r11 = "arch"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x03c6
            goto L_0x03e9
        L_0x03c6:
            r8 = 3
            goto L_0x03ea
        L_0x03c8:
            java.lang.String r11 = "ram"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x03d1
            goto L_0x03e9
        L_0x03d1:
            r8 = 2
            goto L_0x03ea
        L_0x03d3:
            java.lang.String r11 = "manufacturer"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x03dc
            goto L_0x03e9
        L_0x03dc:
            r8 = 1
            goto L_0x03ea
        L_0x03de:
            java.lang.String r11 = "simulator"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x03e7
            goto L_0x03e9
        L_0x03e7:
            r8 = 0
            goto L_0x03ea
        L_0x03e9:
            r8 = -1
        L_0x03ea:
            switch(r8) {
                case 0: goto L_0x0455;
                case 1: goto L_0x0448;
                case 2: goto L_0x043c;
                case 3: goto L_0x0430;
                case 4: goto L_0x0424;
                case 5: goto L_0x0418;
                case 6: goto L_0x040b;
                case 7: goto L_0x03ff;
                case 8: goto L_0x03f2;
                default: goto L_0x03ed;
            }
        L_0x03ed:
            r31.skipValue()
            goto L_0x036d
        L_0x03f2:
            java.lang.String r8 = r31.nextString()
            java.lang.String r11 = "Null modelClass"
            java.util.Objects.requireNonNull(r8, r11)
            r3.f3652i = r8
            goto L_0x036d
        L_0x03ff:
            int r8 = r31.nextInt()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3.f3650g = r8
            goto L_0x036d
        L_0x040b:
            java.lang.String r8 = r31.nextString()
            java.lang.String r11 = "Null model"
            java.util.Objects.requireNonNull(r8, r11)
            r3.b = r8
            goto L_0x036d
        L_0x0418:
            int r8 = r31.nextInt()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3.c = r8
            goto L_0x036d
        L_0x0424:
            long r11 = r31.nextLong()
            java.lang.Long r8 = java.lang.Long.valueOf(r11)
            r3.f3648e = r8
            goto L_0x036d
        L_0x0430:
            int r8 = r31.nextInt()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3.a = r8
            goto L_0x036d
        L_0x043c:
            long r11 = r31.nextLong()
            java.lang.Long r8 = java.lang.Long.valueOf(r11)
            r3.f3647d = r8
            goto L_0x036d
        L_0x0448:
            java.lang.String r8 = r31.nextString()
            java.lang.String r11 = "Null manufacturer"
            java.util.Objects.requireNonNull(r8, r11)
            r3.f3651h = r8
            goto L_0x036d
        L_0x0455:
            boolean r8 = r31.nextBoolean()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r3.f3649f = r8
            goto L_0x036d
        L_0x0461:
            r31.endObject()
            g.e.b.l.j.l.a0$e$c r3 = r3.a()
            r2.f3634i = r3
            goto L_0x0499
        L_0x046b:
            r17 = r3
            long r11 = r31.nextLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r11)
            r2.f3629d = r3
            goto L_0x0499
        L_0x0478:
            r17 = r3
            java.lang.String r3 = r31.nextString()
            r8 = 2
            byte[] r3 = android.util.Base64.decode(r3, r8)
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r11 = g.e.b.l.j.l.a0.a
            r8.<init>(r3, r11)
            r2.b = r8
            goto L_0x0499
        L_0x048d:
            r17 = r3
            long r11 = r31.nextLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r11)
            r2.c = r3
        L_0x0499:
            r3 = r17
            goto L_0x0093
        L_0x049d:
            r31.endObject()
            g.e.b.l.j.l.a0$e r2 = r2.a()
            r1.f3609g = r2
            goto L_0x000c
        L_0x04a8:
            java.lang.String r2 = r31.nextString()
            java.lang.String r3 = "Null displayVersion"
            java.util.Objects.requireNonNull(r2, r3)
            r1.f3608f = r2
            goto L_0x000c
        L_0x04b5:
            int r2 = r31.nextInt()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.c = r2
            goto L_0x000c
        L_0x04c1:
            java.lang.String r2 = r31.nextString()
            java.lang.String r3 = "Null installationUuid"
            java.util.Objects.requireNonNull(r2, r3)
            r1.f3606d = r2
            goto L_0x000c
        L_0x04ce:
            java.lang.String r2 = r31.nextString()
            java.lang.String r3 = "Null gmpAppId"
            java.util.Objects.requireNonNull(r2, r3)
            r1.b = r2
            goto L_0x000c
        L_0x04db:
            java.lang.String r2 = r31.nextString()
            java.util.Objects.requireNonNull(r2, r10)
            r1.f3607e = r2
            goto L_0x000c
        L_0x04e6:
            java.lang.String r2 = r31.nextString()
            java.lang.String r3 = "Null sdkVersion"
            java.util.Objects.requireNonNull(r2, r3)
            r1.a = r2
            goto L_0x000c
        L_0x04f3:
            r17 = r3
            r31.beginObject()
            r2 = 0
            r3 = 0
        L_0x04fa:
            boolean r4 = r31.hasNext()
            if (r4 == 0) goto L_0x0527
            java.lang.String r4 = r31.nextName()
            r4.hashCode()
            java.lang.String r5 = "files"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0520
            java.lang.String r5 = "orgId"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x051b
            r31.skipValue()
            goto L_0x04fa
        L_0x051b:
            java.lang.String r2 = r31.nextString()
            goto L_0x04fa
        L_0x0520:
            g.e.b.l.j.l.d0.d r3 = g.e.b.l.j.l.d0.d.a
            g.e.b.l.j.l.b0 r3 = a(r0, r3)
            goto L_0x04fa
        L_0x0527:
            r31.endObject()
            if (r3 != 0) goto L_0x052f
            java.lang.String r4 = " files"
            goto L_0x0531
        L_0x052f:
            r4 = r17
        L_0x0531:
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x0541
            g.e.b.l.j.l.e r4 = new g.e.b.l.j.l.e
            r5 = 0
            r4.<init>(r3, r2, r5)
            r1.f3610h = r4
            goto L_0x000c
        L_0x0541:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = g.a.a.a.a.w(r9, r4)
            r0.<init>(r1)
            throw r0
        L_0x054b:
            r31.endObject()
            g.e.b.l.j.l.a0 r0 = r1.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.l.j.l.d0.g.d(android.util.JsonReader):g.e.b.l.j.l.a0");
    }

    public a0 e(String str) throws IOException {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            a0 d2 = d(jsonReader);
            jsonReader.close();
            return d2;
        } catch (IllegalStateException e2) {
            throw new IOException(e2);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public String f(a0 a0Var) {
        d dVar = (d) a;
        Objects.requireNonNull(dVar);
        StringWriter stringWriter = new StringWriter();
        try {
            dVar.a(a0Var, stringWriter);
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }
}
