package g.e.a.b.e.c;

import com.google.android.gms.common.ConnectionResult;
import g.a.a.a.a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

public final class q8<T> implements y8<T> {
    public static final int[] o = new int[0];
    public static final Unsafe p = v9.k();
    public final int[] a;
    public final Object[] b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3023d;

    /* renamed from: e  reason: collision with root package name */
    public final o8 f3024e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3025f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3026g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f3027h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3028i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3029j;

    /* renamed from: k  reason: collision with root package name */
    public final c8 f3030k;

    /* renamed from: l  reason: collision with root package name */
    public final l9 f3031l;

    /* renamed from: m  reason: collision with root package name */
    public final c7 f3032m;
    public final j8 n;

    public q8(int[] iArr, Object[] objArr, int i2, int i3, o8 o8Var, boolean z, int[] iArr2, int i4, int i5, s8 s8Var, c8 c8Var, l9 l9Var, c7 c7Var, j8 j8Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i2;
        this.f3023d = i3;
        this.f3026g = z;
        this.f3025f = c7Var != null && c7Var.c(o8Var);
        this.f3027h = iArr2;
        this.f3028i = i4;
        this.f3029j = i5;
        this.f3030k = c8Var;
        this.f3031l = l9Var;
        this.f3032m = c7Var;
        this.f3024e = o8Var;
        this.n = j8Var;
    }

    public static m9 B(Object obj) {
        o7 o7Var = (o7) obj;
        m9 m9Var = o7Var.zzc;
        if (m9Var != m9.f3001f) {
            return m9Var;
        }
        m9 b2 = m9.b();
        o7Var.zzc = b2;
        return b2;
    }

    public static q8 C(l8 l8Var, s8 s8Var, c8 c8Var, l9 l9Var, c7 c7Var, j8 j8Var) {
        if (l8Var instanceof x8) {
            return D((x8) l8Var, s8Var, c8Var, l9Var, c7Var, j8Var);
        }
        j9 j9Var = (j9) l8Var;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0392  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g.e.a.b.e.c.q8 D(g.e.a.b.e.c.x8 r35, g.e.a.b.e.c.s8 r36, g.e.a.b.e.c.c8 r37, g.e.a.b.e.c.l9 r38, g.e.a.b.e.c.c7 r39, g.e.a.b.e.c.j8 r40) {
        /*
            r0 = r35
            int r1 = r0.f3085d
            r2 = 1
            r1 = r1 & r2
            r3 = 2
            if (r1 != r2) goto L_0x000b
            r1 = 1
            goto L_0x000c
        L_0x000b:
            r1 = 2
        L_0x000c:
            r4 = 0
            if (r1 != r3) goto L_0x0011
            r11 = 1
            goto L_0x0012
        L_0x0011:
            r11 = 0
        L_0x0012:
            java.lang.String r1 = r0.b
            int r3 = r1.length()
            char r5 = r1.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x002c
            r5 = 1
        L_0x0022:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x002d
            r5 = r7
            goto L_0x0022
        L_0x002c:
            r7 = 1
        L_0x002d:
            int r5 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x004c
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0039:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0049
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x0039
        L_0x0049:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r10
        L_0x004c:
            if (r7 != 0) goto L_0x0059
            int[] r7 = o
            r13 = r7
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            goto L_0x016a
        L_0x0059:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0078
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0065:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0075
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x0065
        L_0x0075:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r10
        L_0x0078:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0097
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0084:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x0094
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x0084
        L_0x0094:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r12
        L_0x0097:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00b6
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00a3:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00b3
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x00a3
        L_0x00b3:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00b6:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00d5
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00c2:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00d2
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00c2
        L_0x00d2:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00d5:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00f4
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e1:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x00f1
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00e1
        L_0x00f1:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00f4:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x0115
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0100:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0111
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0100
        L_0x0111:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0115:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0138
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0121:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0133
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0121
        L_0x0133:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0138:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x015d
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r4 = r16
            r16 = 13
        L_0x0146:
            int r18 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r6) goto L_0x0158
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r16
            r15 = r15 | r4
            int r16 = r16 + 13
            r4 = r18
            goto L_0x0146
        L_0x0158:
            int r4 = r4 << r16
            r15 = r15 | r4
            r16 = r18
        L_0x015d:
            int r4 = r15 + r13
            int r4 = r4 + r14
            int[] r4 = new int[r4]
            int r14 = r5 + r5
            int r14 = r14 + r7
            r7 = r13
            r13 = r4
            r4 = r5
            r5 = r16
        L_0x016a:
            sun.misc.Unsafe r8 = p
            java.lang.Object[] r2 = r0.c
            g.e.a.b.e.c.o8 r6 = r0.a
            java.lang.Class r6 = r6.getClass()
            r20 = r5
            int r5 = r12 * 3
            int[] r5 = new int[r5]
            int r12 = r12 + r12
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r21 = r15 + r7
            r23 = r15
            r7 = r20
            r24 = r21
            r20 = 0
            r22 = 0
        L_0x0189:
            if (r7 >= r3) goto L_0x03e4
            int r25 = r7 + 1
            char r7 = r1.charAt(r7)
            r26 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r3) goto L_0x01bd
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r3 = r25
            r25 = 13
        L_0x019e:
            int r27 = r3 + 1
            char r3 = r1.charAt(r3)
            r28 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x01b7
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r25
            r7 = r7 | r3
            int r25 = r25 + 13
            r3 = r27
            r15 = r28
            goto L_0x019e
        L_0x01b7:
            int r3 = r3 << r25
            r7 = r7 | r3
            r3 = r27
            goto L_0x01c1
        L_0x01bd:
            r28 = r15
            r3 = r25
        L_0x01c1:
            int r15 = r3 + 1
            char r3 = r1.charAt(r3)
            r25 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x01f3
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r15 = r25
            r25 = 13
        L_0x01d4:
            int r27 = r15 + 1
            char r15 = r1.charAt(r15)
            r29 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x01ed
            r10 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r25
            r3 = r3 | r10
            int r25 = r25 + 13
            r15 = r27
            r10 = r29
            goto L_0x01d4
        L_0x01ed:
            int r10 = r15 << r25
            r3 = r3 | r10
            r15 = r27
            goto L_0x01f7
        L_0x01f3:
            r29 = r10
            r15 = r25
        L_0x01f7:
            r10 = r3 & 255(0xff, float:3.57E-43)
            r25 = r9
            r9 = r3 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0205
            int r9 = r22 + 1
            r13[r22] = r20
            r22 = r9
        L_0x0205:
            r9 = 51
            if (r10 < r9) goto L_0x02b0
            int r9 = r15 + 1
            char r15 = r1.charAt(r15)
            r27 = r9
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r9) goto L_0x023d
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
            r34 = r27
            r27 = r15
            r15 = r34
        L_0x0220:
            int r33 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r9) goto L_0x0236
            r9 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r32
            r27 = r27 | r9
            int r32 = r32 + 13
            r15 = r33
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0220
        L_0x0236:
            int r9 = r15 << r32
            r15 = r27 | r9
            r9 = r33
            goto L_0x023f
        L_0x023d:
            r9 = r27
        L_0x023f:
            r27 = r9
            int r9 = r10 + -51
            r0 = 9
            if (r9 == r0) goto L_0x0260
            r0 = 17
            if (r9 != r0) goto L_0x024c
            goto L_0x0260
        L_0x024c:
            r0 = 12
            if (r9 != r0) goto L_0x026e
            if (r11 != 0) goto L_0x026e
            int r0 = r20 / 3
            int r9 = r14 + 1
            int r0 = r0 + r0
            r18 = 1
            int r0 = r0 + 1
            r14 = r2[r14]
            r12[r0] = r14
            goto L_0x026d
        L_0x0260:
            int r0 = r20 / 3
            int r9 = r14 + 1
            int r0 = r0 + r0
            r18 = 1
            int r0 = r0 + 1
            r14 = r2[r14]
            r12[r0] = r14
        L_0x026d:
            r14 = r9
        L_0x026e:
            int r15 = r15 + r15
            r0 = r2[r15]
            boolean r9 = r0 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x0278
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            goto L_0x0280
        L_0x0278:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = o(r6, r0)
            r2[r15] = r0
        L_0x0280:
            r9 = r4
            r32 = r5
            long r4 = r8.objectFieldOffset(r0)
            int r0 = (int) r4
            int r15 = r15 + 1
            r4 = r2[r15]
            boolean r5 = r4 instanceof java.lang.reflect.Field
            if (r5 == 0) goto L_0x0293
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            goto L_0x029b
        L_0x0293:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.reflect.Field r4 = o(r6, r4)
            r2[r15] = r4
        L_0x029b:
            long r4 = r8.objectFieldOffset(r4)
            int r5 = (int) r4
            r4 = r0
            r19 = r1
            r31 = r14
            r15 = r27
            r0 = 55296(0xd800, float:7.7486E-41)
            r18 = 1
            r14 = r6
            r6 = 0
            goto L_0x03ab
        L_0x02b0:
            r9 = r4
            r32 = r5
            int r0 = r14 + 1
            r4 = r2[r14]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.reflect.Field r4 = o(r6, r4)
            r5 = 49
            r14 = 9
            if (r10 == r14) goto L_0x0325
            r14 = 17
            if (r10 != r14) goto L_0x02c8
            goto L_0x0325
        L_0x02c8:
            r14 = 27
            if (r10 == r14) goto L_0x0314
            if (r10 != r5) goto L_0x02cf
            goto L_0x0314
        L_0x02cf:
            r14 = 12
            if (r10 == r14) goto L_0x0304
            r14 = 30
            if (r10 == r14) goto L_0x0304
            r14 = 44
            if (r10 != r14) goto L_0x02dc
            goto L_0x0304
        L_0x02dc:
            r14 = 50
            if (r10 != r14) goto L_0x0301
            int r14 = r23 + 1
            r13[r23] = r20
            int r23 = r20 / 3
            int r23 = r23 + r23
            int r27 = r0 + 1
            r0 = r2[r0]
            r12[r23] = r0
            r0 = r3 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x02fd
            int r0 = r27 + 1
            int r23 = r23 + 1
            r27 = r2[r27]
            r12[r23] = r27
            r23 = r14
            goto L_0x0301
        L_0x02fd:
            r23 = r14
            r0 = r27
        L_0x0301:
            r18 = 1
            goto L_0x0332
        L_0x0304:
            if (r11 != 0) goto L_0x0301
            int r14 = r20 / 3
            int r27 = r0 + 1
            int r14 = r14 + r14
            r18 = 1
            int r14 = r14 + 1
            r0 = r2[r0]
            r12[r14] = r0
            goto L_0x0321
        L_0x0314:
            r18 = 1
            int r14 = r20 / 3
            int r27 = r0 + 1
            int r14 = r14 + r14
            int r14 = r14 + 1
            r0 = r2[r0]
            r12[r14] = r0
        L_0x0321:
            r14 = r6
            r0 = r27
            goto L_0x0333
        L_0x0325:
            r18 = 1
            int r14 = r20 / 3
            int r14 = r14 + r14
            int r14 = r14 + 1
            java.lang.Class r27 = r4.getType()
            r12[r14] = r27
        L_0x0332:
            r14 = r6
        L_0x0333:
            long r5 = r8.objectFieldOffset(r4)
            int r4 = (int) r5
            r5 = r3 & 4096(0x1000, float:5.74E-42)
            r6 = 4096(0x1000, float:5.74E-42)
            if (r5 != r6) goto L_0x0392
            r5 = 17
            if (r10 > r5) goto L_0x0392
            int r5 = r15 + 1
            char r6 = r1.charAt(r15)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r15) goto L_0x0367
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L_0x0351:
            int r30 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r15) goto L_0x0363
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r19
            r6 = r6 | r5
            int r19 = r19 + 13
            r5 = r30
            goto L_0x0351
        L_0x0363:
            int r5 = r5 << r19
            r6 = r6 | r5
            goto L_0x0369
        L_0x0367:
            r30 = r5
        L_0x0369:
            int r5 = r9 + r9
            int r19 = r6 / 32
            int r19 = r19 + r5
            r5 = r2[r19]
            boolean r15 = r5 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x0378
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            goto L_0x0380
        L_0x0378:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r5 = o(r14, r5)
            r2[r19] = r5
        L_0x0380:
            r31 = r0
            r19 = r1
            long r0 = r8.objectFieldOffset(r5)
            int r1 = (int) r0
            int r6 = r6 % 32
            r5 = r1
            r15 = r30
            r0 = 55296(0xd800, float:7.7486E-41)
            goto L_0x039d
        L_0x0392:
            r31 = r0
            r19 = r1
            r0 = 55296(0xd800, float:7.7486E-41)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = 0
        L_0x039d:
            r1 = 18
            if (r10 < r1) goto L_0x03ab
            r1 = 49
            if (r10 > r1) goto L_0x03ab
            int r1 = r24 + 1
            r13[r24] = r4
            r24 = r1
        L_0x03ab:
            int r1 = r20 + 1
            r32[r20] = r7
            int r7 = r1 + 1
            r0 = r3 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x03b8
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03b9
        L_0x03b8:
            r0 = 0
        L_0x03b9:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x03c0
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c1
        L_0x03c0:
            r3 = 0
        L_0x03c1:
            r0 = r0 | r3
            int r3 = r10 << 20
            r0 = r0 | r3
            r0 = r0 | r4
            r32[r1] = r0
            int r20 = r7 + 1
            int r0 = r6 << 20
            r0 = r0 | r5
            r32[r7] = r0
            r0 = r35
            r4 = r9
            r6 = r14
            r7 = r15
            r1 = r19
            r9 = r25
            r3 = r26
            r15 = r28
            r10 = r29
            r14 = r31
            r5 = r32
            goto L_0x0189
        L_0x03e4:
            r32 = r5
            r25 = r9
            r29 = r10
            r28 = r15
            g.e.a.b.e.c.q8 r0 = new g.e.a.b.e.c.q8
            r1 = r35
            g.e.a.b.e.c.o8 r10 = r1.a
            r1 = r32
            r5 = r0
            r6 = r1
            r7 = r12
            r8 = r25
            r9 = r29
            r12 = r13
            r13 = r28
            r14 = r21
            r15 = r36
            r16 = r37
            r17 = r38
            r18 = r39
            r19 = r40
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.q8.D(g.e.a.b.e.c.x8, g.e.a.b.e.c.s8, g.e.a.b.e.c.c8, g.e.a.b.e.c.l9, g.e.a.b.e.c.c7, g.e.a.b.e.c.j8):g.e.a.b.e.c.q8");
    }

    public static double E(Object obj, long j2) {
        return ((Double) v9.j(obj, j2)).doubleValue();
    }

    public static float F(Object obj, long j2) {
        return ((Float) v9.j(obj, j2)).floatValue();
    }

    public static int I(Object obj, long j2) {
        return ((Integer) v9.j(obj, j2)).intValue();
    }

    public static long k(Object obj, long j2) {
        return ((Long) v9.j(obj, j2)).longValue();
    }

    public static Field o(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            throw new RuntimeException(a.f(sb, " not found. Known fields are ", arrays));
        }
    }

    public static boolean x(Object obj, long j2) {
        return ((Boolean) v9.j(obj, j2)).booleanValue();
    }

    public static final void z(int i2, Object obj, y6 y6Var) throws IOException {
        if (obj instanceof String) {
            y6Var.a.l(i2, (String) obj);
            return;
        }
        y6Var.a.e(i2, (s6) obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v52, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v53, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v99, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02cd, code lost:
        r12 = r36;
        r16 = r5;
        r3 = r7;
        r2 = r22;
        r5 = r35;
        r7 = r1;
        r1 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02db, code lost:
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02f2, code lost:
        r5 = r35;
        r12 = r0;
        r0 = r8;
        r8 = r6;
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02fa, code lost:
        r18 = r35;
        r2 = r3;
        r9 = r6;
        r27 = r7;
        r30 = r11;
        r7 = r12;
        r6 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03a5, code lost:
        if (r0 != r15) goto L_0x03f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03f2, code lost:
        if (r0 != r15) goto L_0x03f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03f4, code lost:
        r15 = r32;
        r14 = r33;
        r4 = r34;
        r6 = r36;
        r12 = r6;
        r1 = r37;
        r13 = r38;
        r5 = r18;
        r2 = r22;
        r16 = r25;
        r7 = r26;
        r3 = r27;
        r11 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0157, code lost:
        r11.putInt(r14, r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0170, code lost:
        r1 = r13.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x019b, code lost:
        r11.putObject(r14, r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x019e, code lost:
        r8 = r0;
        r0 = r12 | r25;
        r1 = r6;
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x020e, code lost:
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0239, code lost:
        r6 = r2;
        r3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0258, code lost:
        r1 = r12 | r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0277, code lost:
        r0.putLong(r1, r9, r17);
        r0 = r12 | r25;
        r1 = r6;
        r4 = r4;
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0286, code lost:
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0287, code lost:
        r6 = r10;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v7, types: [byte, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, g.e.a.b.e.c.k6 r38) throws java.io.IOException {
        /*
            r32 = this;
            r15 = r32
            r14 = r33
            r12 = r36
            r13 = r38
            sun.misc.Unsafe r11 = p
            r4 = r34
            r0 = r35
            r1 = r37
            r6 = r12
            r2 = -1
            r3 = 0
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r7 = 0
            r16 = 0
        L_0x0019:
            r17 = 0
            if (r0 >= r6) goto L_0x048d
            int r9 = r0 + 1
            byte r0 = r4[r0]
            if (r0 >= 0) goto L_0x002e
            int r0 = g.e.a.b.b.h.e.f0(r0, r4, r9, r13)
            int r9 = r13.a
            r31 = r9
            r9 = r0
            r0 = r31
        L_0x002e:
            int r10 = r0 >>> 3
            r8 = r0 & 7
            r35 = r0
            r0 = 3
            if (r10 <= r2) goto L_0x0049
            int r3 = r3 / r0
            int r2 = r15.c
            if (r10 < r2) goto L_0x0045
            int r2 = r15.f3023d
            if (r10 > r2) goto L_0x0045
            int r2 = r15.O(r10, r3)
            goto L_0x0046
        L_0x0045:
            r2 = -1
        L_0x0046:
            r3 = r2
            r2 = 0
            goto L_0x0059
        L_0x0049:
            int r2 = r15.c
            if (r10 < r2) goto L_0x0057
            int r2 = r15.f3023d
            if (r10 > r2) goto L_0x0057
            r2 = 0
            int r3 = r15.O(r10, r2)
            goto L_0x0059
        L_0x0057:
            r2 = 0
            r3 = -1
        L_0x0059:
            r12 = -1
            if (r3 != r12) goto L_0x006e
            r6 = r1
            r18 = r5
            r2 = r9
            r22 = r10
            r30 = r11
            r19 = -1
            r20 = 0
            r27 = 0
            r9 = r35
            goto L_0x0416
        L_0x006e:
            int[] r1 = r15.a
            int r16 = r3 + 1
            r12 = r1[r16]
            int r2 = r12 >>> 20
            r2 = r2 & 255(0xff, float:3.57E-43)
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r12 & r16
            r16 = r9
            r22 = r10
            long r9 = (long) r0
            r0 = 17
            r23 = r12
            if (r2 > r0) goto L_0x0309
            int r0 = r3 + 2
            r0 = r1[r0]
            int r1 = r0 >>> 20
            r12 = 1
            int r25 = r12 << r1
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            if (r0 == r5) goto L_0x00a5
            if (r5 == r1) goto L_0x009d
            long r12 = (long) r5
            r11.putInt(r14, r12, r7)
        L_0x009d:
            long r12 = (long) r0
            int r7 = r11.getInt(r14, r12)
            r12 = r7
            r7 = r0
            goto L_0x00a7
        L_0x00a5:
            r12 = r7
            r7 = r5
        L_0x00a7:
            r0 = 5
            switch(r2) {
                case 0: goto L_0x02ac;
                case 1: goto L_0x028a;
                case 2: goto L_0x025c;
                case 3: goto L_0x025c;
                case 4: goto L_0x023f;
                case 5: goto L_0x0210;
                case 6: goto L_0x01f5;
                case 7: goto L_0x01cc;
                case 8: goto L_0x01a6;
                case 9: goto L_0x0173;
                case 10: goto L_0x015b;
                case 11: goto L_0x023f;
                case 12: goto L_0x0123;
                case 13: goto L_0x01f5;
                case 14: goto L_0x0210;
                case 15: goto L_0x0108;
                case 16: goto L_0x00d8;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            r5 = r35
            r13 = r38
            r35 = r7
            r0 = 3
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 != r0) goto L_0x02db
            g.e.a.b.e.c.y8 r0 = r15.m(r7)
            int r1 = r22 << 3
            r4 = r1 | 4
            r1 = r34
            r2 = r3
            r3 = r36
            r6 = r5
            r5 = r38
            int r0 = g.e.a.b.b.h.e.L(r0, r1, r2, r3, r4, r5)
            r1 = r12 & r25
            if (r1 != 0) goto L_0x02dd
            java.lang.Object r1 = r13.c
            goto L_0x02e7
        L_0x00d8:
            if (r8 != 0) goto L_0x00f7
            r13 = r38
            r5 = r16
            int r8 = g.e.a.b.b.h.e.j0(r4, r5, r13)
            long r1 = r13.b
            long r17 = g.e.a.b.e.c.t6.b(r1)
            r5 = r35
            r0 = r11
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r33
            r35 = r7
            r20 = 0
            r7 = r3
            goto L_0x0277
        L_0x00f7:
            r10 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            r3 = r5
            goto L_0x0287
        L_0x0108:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            if (r8 != 0) goto L_0x0239
            int r0 = g.e.a.b.b.h.e.d0(r4, r5, r13)
            int r1 = r13.a
            int r1 = g.e.a.b.e.c.t6.a(r1)
            goto L_0x0157
        L_0x0123:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            if (r8 != 0) goto L_0x0239
            int r0 = g.e.a.b.b.h.e.d0(r4, r5, r13)
            int r1 = r13.a
            g.e.a.b.e.c.r7 r3 = r15.l(r7)
            if (r3 == 0) goto L_0x0157
            boolean r3 = r3.a(r1)
            if (r3 == 0) goto L_0x0146
            goto L_0x0157
        L_0x0146:
            g.e.a.b.e.c.m9 r3 = B(r33)
            long r8 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r3.c(r2, r1)
            r5 = r35
            r8 = r2
            goto L_0x0352
        L_0x0157:
            r11.putInt(r14, r9, r1)
            goto L_0x019e
        L_0x015b:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r0 = 2
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            if (r8 != r0) goto L_0x0239
            int r0 = g.e.a.b.b.h.e.r(r4, r5, r13)
        L_0x0170:
            java.lang.Object r1 = r13.c
            goto L_0x019b
        L_0x0173:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r0 = 2
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            if (r8 != r0) goto L_0x0239
            g.e.a.b.e.c.y8 r0 = r15.m(r7)
            int r0 = g.e.a.b.b.h.e.O(r0, r4, r5, r6, r13)
            r1 = r12 & r25
            if (r1 != 0) goto L_0x0191
            goto L_0x0170
        L_0x0191:
            java.lang.Object r1 = r11.getObject(r14, r9)
            java.lang.Object r3 = r13.c
            java.lang.Object r1 = g.e.a.b.e.c.v7.c(r1, r3)
        L_0x019b:
            r11.putObject(r14, r9, r1)
        L_0x019e:
            r1 = r12 | r25
            r8 = r0
            r0 = r1
            r1 = r6
            r6 = r2
            goto L_0x02f2
        L_0x01a6:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r0 = 2
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            if (r8 != r0) goto L_0x0239
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r23 & r0
            if (r0 != 0) goto L_0x01c2
            int r0 = g.e.a.b.b.h.e.X(r4, r5, r13)
            goto L_0x01c6
        L_0x01c2:
            int r0 = g.e.a.b.b.h.e.Z(r4, r5, r13)
        L_0x01c6:
            java.lang.Object r1 = r13.c
            r11.putObject(r14, r9, r1)
            goto L_0x020e
        L_0x01cc:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            if (r8 != 0) goto L_0x0239
            int r0 = g.e.a.b.b.h.e.j0(r4, r5, r13)
            r3 = r0
            long r0 = r13.b
            r23 = 0
            int r5 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r5 == 0) goto L_0x01eb
            r0 = 1
            goto L_0x01ec
        L_0x01eb:
            r0 = 0
        L_0x01ec:
            g.e.a.b.e.c.u9 r1 = g.e.a.b.e.c.v9.f3057d
            r1.c(r14, r9, r0)
            r5 = r2
            r0 = r3
            goto L_0x0258
        L_0x01f5:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            if (r8 != r0) goto L_0x0239
            int r0 = g.e.a.b.b.h.e.D(r4, r5)
            r11.putInt(r14, r9, r0)
            int r0 = r5 + 4
        L_0x020e:
            r5 = r2
            goto L_0x0258
        L_0x0210:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r0 = 1
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            if (r8 != r0) goto L_0x0239
            long r17 = g.e.a.b.b.h.e.k0(r4, r5)
            r0 = r11
            r1 = r33
            r8 = r2
            r2 = r9
            r9 = r4
            r10 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r0 = r10 + 8
            r1 = r12 | r25
            r5 = r8
            r4 = r9
            goto L_0x02cd
        L_0x0239:
            r8 = r2
            r10 = r5
            r6 = r8
            r3 = r10
            goto L_0x02fa
        L_0x023f:
            r5 = r35
            r13 = r38
            r35 = r7
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 != 0) goto L_0x0286
            int r0 = g.e.a.b.b.h.e.d0(r4, r3, r13)
            int r1 = r13.a
            r11.putInt(r14, r9, r1)
        L_0x0258:
            r1 = r12 | r25
            goto L_0x02cd
        L_0x025c:
            r5 = r35
            r13 = r38
            r35 = r7
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 != 0) goto L_0x0286
            int r8 = g.e.a.b.b.h.e.j0(r4, r3, r13)
            long r2 = r13.b
            r0 = r11
            r1 = r33
            r17 = r2
        L_0x0277:
            r2 = r9
            r9 = r4
            r10 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            r0 = r12 | r25
            r1 = r6
            r4 = r9
            r6 = r10
            goto L_0x02f2
        L_0x0286:
            r10 = r5
        L_0x0287:
            r6 = r10
            goto L_0x02fa
        L_0x028a:
            r5 = r35
            r13 = r38
            r1 = r4
            r35 = r7
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 != r0) goto L_0x02db
            int r0 = g.e.a.b.b.h.e.D(r1, r3)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            g.e.a.b.e.c.u9 r2 = g.e.a.b.e.c.v9.f3057d
            r2.f(r14, r9, r0)
            int r0 = r3 + 4
            r4 = r1
            goto L_0x0258
        L_0x02ac:
            r5 = r35
            r13 = r38
            r1 = r4
            r35 = r7
            r0 = 1
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 != r0) goto L_0x02db
            long r17 = g.e.a.b.b.h.e.k0(r1, r3)
            r4 = r1
            double r0 = java.lang.Double.longBitsToDouble(r17)
            g.e.a.b.e.c.v9.m(r14, r9, r0)
            int r0 = r3 + 8
            goto L_0x0258
        L_0x02cd:
            r12 = r36
            r16 = r5
            r3 = r7
            r2 = r22
            r5 = r35
            r7 = r1
            r1 = r37
            goto L_0x0019
        L_0x02db:
            r6 = r5
            goto L_0x02fa
        L_0x02dd:
            java.lang.Object r1 = r11.getObject(r14, r9)
            java.lang.Object r2 = r13.c
            java.lang.Object r1 = g.e.a.b.e.c.v7.c(r1, r2)
        L_0x02e7:
            r11.putObject(r14, r9, r1)
            r1 = r12 | r25
            r4 = r34
            r8 = r0
            r0 = r1
            r1 = r36
        L_0x02f2:
            r5 = r35
            r12 = r0
            r0 = r8
            r8 = r6
            r6 = r1
            goto L_0x0352
        L_0x02fa:
            r18 = r35
            r2 = r3
            r9 = r6
            r27 = r7
            r30 = r11
            r7 = r12
            r19 = -1
            r6 = r37
            goto L_0x0416
        L_0x0309:
            r6 = r35
            r12 = r7
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r0 = 27
            if (r2 != r0) goto L_0x036d
            r0 = 2
            if (r8 != r0) goto L_0x035e
            java.lang.Object r0 = r11.getObject(r14, r9)
            g.e.a.b.e.c.u7 r0 = (g.e.a.b.e.c.u7) r0
            boolean r1 = r0.k()
            if (r1 != 0) goto L_0x0338
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0330
            r1 = 10
            goto L_0x0331
        L_0x0330:
            int r1 = r1 + r1
        L_0x0331:
            g.e.a.b.e.c.u7 r0 = r0.o(r1)
            r11.putObject(r14, r9, r0)
        L_0x0338:
            r8 = r0
            g.e.a.b.e.c.y8 r0 = r15.m(r7)
            r1 = r6
            r2 = r34
            r4 = r36
            r18 = r5
            r5 = r8
            r8 = r6
            r6 = r38
            int r0 = g.e.a.b.b.h.e.S(r0, r1, r2, r3, r4, r5, r6)
            r4 = r34
            r6 = r36
            r5 = r18
        L_0x0352:
            r1 = r37
            r3 = r7
            r16 = r8
            r7 = r12
            r2 = r22
            r12 = r36
            goto L_0x0019
        L_0x035e:
            r18 = r5
            r15 = r3
            r25 = r6
            r27 = r7
            r30 = r11
            r26 = r12
            r19 = -1
            goto L_0x03c5
        L_0x036d:
            r18 = r5
            r0 = 49
            if (r2 > r0) goto L_0x03ab
            r5 = r23
            long r4 = (long) r5
            r0 = r32
            r1 = r33
            r35 = r2
            r2 = r34
            r21 = r3
            r23 = r4
            r4 = r36
            r5 = r6
            r25 = r6
            r6 = r22
            r27 = r7
            r26 = r12
            r7 = r8
            r8 = r27
            r28 = r9
            r12 = r21
            r19 = -1
            r9 = r23
            r30 = r11
            r11 = r35
            r15 = r12
            r12 = r28
            r14 = r38
            int r0 = r0.M(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x03a8
            goto L_0x03f4
        L_0x03a8:
            r9 = r0
            goto L_0x040f
        L_0x03ab:
            r35 = r2
            r15 = r3
            r25 = r6
            r27 = r7
            r28 = r9
            r30 = r11
            r26 = r12
            r5 = r23
            r19 = -1
            r0 = 50
            r9 = r35
            if (r9 != r0) goto L_0x03d8
            r0 = 2
            if (r8 == r0) goto L_0x03c7
        L_0x03c5:
            r9 = r15
            goto L_0x040f
        L_0x03c7:
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r15
            r4 = r36
            r5 = r27
            r6 = r28
            r0.J(r1, r2, r3, r4, r5, r6)
            throw r17
        L_0x03d8:
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r15
            r4 = r36
            r10 = r5
            r5 = r25
            r6 = r22
            r7 = r8
            r8 = r10
            r10 = r28
            r12 = r27
            r13 = r38
            int r0 = r0.K(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x03a8
        L_0x03f4:
            r15 = r32
            r14 = r33
            r4 = r34
            r6 = r36
            r12 = r6
            r1 = r37
            r13 = r38
            r5 = r18
            r2 = r22
            r16 = r25
            r7 = r26
            r3 = r27
            r11 = r30
            goto L_0x0019
        L_0x040f:
            r6 = r37
            r2 = r9
            r9 = r25
            r7 = r26
        L_0x0416:
            if (r9 != r6) goto L_0x0424
            if (r6 == 0) goto L_0x0424
            r8 = r32
            r12 = r33
            r0 = r2
            r1 = r6
            r5 = r18
            goto L_0x0497
        L_0x0424:
            r8 = r32
            boolean r0 = r8.f3025f
            if (r0 == 0) goto L_0x0464
            r10 = r38
            g.e.a.b.e.c.b7 r0 = r10.f2972d
            g.e.a.b.e.c.b7 r1 = g.e.a.b.e.c.b7.a()
            if (r0 == r1) goto L_0x0461
            g.e.a.b.e.c.o8 r0 = r8.f3024e
            g.e.a.b.e.c.b7 r1 = r10.f2972d
            java.util.Map r1 = r1.a
            g.e.a.b.e.c.a7 r3 = new g.e.a.b.e.c.a7
            r11 = r22
            r3.<init>(r0, r11)
            java.lang.Object r0 = r1.get(r3)
            g.e.a.b.e.c.n7 r0 = (g.e.a.b.e.c.n7) r0
            if (r0 != 0) goto L_0x045b
            g.e.a.b.e.c.m9 r4 = B(r33)
            r0 = r9
            r1 = r34
            r3 = r36
            r5 = r38
            int r0 = g.e.a.b.b.h.e.b0(r0, r1, r2, r3, r4, r5)
            r12 = r33
            goto L_0x0479
        L_0x045b:
            r12 = r33
            r0 = r12
            g.e.a.b.e.c.m7 r0 = (g.e.a.b.e.c.m7) r0
            throw r17
        L_0x0461:
            r12 = r33
            goto L_0x0468
        L_0x0464:
            r12 = r33
            r10 = r38
        L_0x0468:
            r11 = r22
            g.e.a.b.e.c.m9 r4 = B(r33)
            r0 = r9
            r1 = r34
            r3 = r36
            r5 = r38
            int r0 = g.e.a.b.b.h.e.b0(r0, r1, r2, r3, r4, r5)
        L_0x0479:
            r4 = r34
            r1 = r6
            r15 = r8
            r16 = r9
            r13 = r10
            r2 = r11
            r14 = r12
            r5 = r18
            r3 = r27
            r11 = r30
            r6 = r36
            r12 = r6
            goto L_0x0019
        L_0x048d:
            r18 = r5
            r26 = r7
            r30 = r11
            r12 = r14
            r8 = r15
            r9 = r16
        L_0x0497:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r5 == r2) goto L_0x04a2
            long r3 = (long) r5
            r5 = r30
            r5.putInt(r12, r3, r7)
        L_0x04a2:
            int r3 = r8.f3028i
        L_0x04a4:
            int r4 = r8.f3029j
            if (r3 >= r4) goto L_0x04cf
            int[] r4 = r8.f3027h
            r4 = r4[r3]
            int[] r5 = r8.a
            r5 = r5[r4]
            int r5 = r8.j(r4)
            r5 = r5 & r2
            long r5 = (long) r5
            java.lang.Object r5 = g.e.a.b.e.c.v9.j(r12, r5)
            if (r5 != 0) goto L_0x04bd
            goto L_0x04c3
        L_0x04bd:
            g.e.a.b.e.c.r7 r6 = r8.l(r4)
            if (r6 != 0) goto L_0x04c6
        L_0x04c3:
            int r3 = r3 + 1
            goto L_0x04a4
        L_0x04c6:
            g.e.a.b.e.c.i8 r5 = (g.e.a.b.e.c.i8) r5
            java.lang.Object r0 = r8.n(r4)
            g.e.a.b.e.c.h8 r0 = (g.e.a.b.e.c.h8) r0
            throw r17
        L_0x04cf:
            r2 = r36
            if (r1 != 0) goto L_0x04db
            if (r0 != r2) goto L_0x04d6
            goto L_0x04df
        L_0x04d6:
            com.google.android.gms.internal.measurement.zzkh r0 = com.google.android.gms.internal.measurement.zzkh.c()
            throw r0
        L_0x04db:
            if (r0 > r2) goto L_0x04e0
            if (r9 != r1) goto L_0x04e0
        L_0x04df:
            return r0
        L_0x04e0:
            com.google.android.gms.internal.measurement.zzkh r0 = com.google.android.gms.internal.measurement.zzkh.c()
            goto L_0x04e6
        L_0x04e5:
            throw r0
        L_0x04e6:
            goto L_0x04e5
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.q8.A(java.lang.Object, byte[], int, int, int, g.e.a.b.e.c.k6):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0324, code lost:
        r1 = r1 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x035b, code lost:
        r1 = g.e.a.b.e.c.x6.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0388, code lost:
        r6 = g.e.a.b.e.c.x6.a(r8 << 3);
        r1 = ((g.e.a.b.e.c.s6) r1).h();
        r3 = ((g.e.a.b.e.c.x6.a(r1) + r1) + r6) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03b5, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03c5, code lost:
        r1 = r0.getInt(r15, r12);
        r6 = g.e.a.b.e.c.x6.a(r8 << 3);
        r1 = g.e.a.b.e.c.x6.t(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03d3, code lost:
        r1 = r1 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03de, code lost:
        r6 = r0.getLong(r15, r12);
        r1 = g.e.a.b.e.c.x6.a(r8 << 3);
        r6 = g.e.a.b.e.c.x6.b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03ec, code lost:
        r1 = r1 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03f2, code lost:
        r1 = g.e.a.b.e.c.x6.a(r8 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03f8, code lost:
        r1 = r1 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03ff, code lost:
        r1 = g.e.a.b.e.c.x6.a(r8 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0405, code lost:
        r1 = r1 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0408, code lost:
        r2 = r2 + 3;
        r1 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
        r1 = g.e.a.b.e.c.x6.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e0, code lost:
        r6 = g.e.a.b.e.c.x6.a(r8 << 3);
        r1 = ((g.e.a.b.e.c.s6) r1).h();
        r7 = (g.e.a.b.e.c.x6.a(r1) + r1) + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0124, code lost:
        r1 = I(r15, r12);
        r6 = g.e.a.b.e.c.x6.a(r8 << 3);
        r1 = g.e.a.b.e.c.x6.t(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0141, code lost:
        r6 = k(r15, r12);
        r1 = g.e.a.b.e.c.x6.a(r8 << 3);
        r6 = g.e.a.b.e.c.x6.b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0157, code lost:
        r1 = g.e.a.b.e.c.x6.a(r8 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0165, code lost:
        r1 = g.e.a.b.e.c.x6.a(r8 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0247, code lost:
        r7 = (g.e.a.b.e.c.x6.a(r1) + g.e.a.b.e.c.x6.w(r8)) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0251, code lost:
        r3 = r3 + r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int G(java.lang.Object r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = p
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 0
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
        L_0x000b:
            int[] r6 = r14.a
            int r6 = r6.length
            if (r2 >= r6) goto L_0x040f
            int r6 = r14.j(r2)
            int[] r7 = r14.a
            r8 = r7[r2]
            int r9 = r6 >>> 20
            r9 = r9 & 255(0xff, float:3.57E-43)
            r10 = 17
            r11 = 1
            if (r9 > r10) goto L_0x0035
            int r10 = r2 + 2
            r7 = r7[r10]
            r10 = r7 & r1
            int r7 = r7 >>> 20
            int r7 = r11 << r7
            if (r10 == r4) goto L_0x0036
            long r4 = (long) r10
            int r4 = r0.getInt(r15, r4)
            r5 = r4
            r4 = r10
            goto L_0x0036
        L_0x0035:
            r7 = 0
        L_0x0036:
            r1 = r1 & r6
            long r12 = (long) r1
            r1 = 63
            switch(r9) {
                case 0: goto L_0x03fb;
                case 1: goto L_0x03ee;
                case 2: goto L_0x03da;
                case 3: goto L_0x03d5;
                case 4: goto L_0x03c1;
                case 5: goto L_0x03bc;
                case 6: goto L_0x03b7;
                case 7: goto L_0x03ab;
                case 8: goto L_0x037c;
                case 9: goto L_0x036a;
                case 10: goto L_0x0361;
                case 11: goto L_0x034d;
                case 12: goto L_0x0347;
                case 13: goto L_0x0341;
                case 14: goto L_0x033b;
                case 15: goto L_0x0327;
                case 16: goto L_0x030e;
                case 17: goto L_0x02fa;
                case 18: goto L_0x02ee;
                case 19: goto L_0x02e2;
                case 20: goto L_0x02d6;
                case 21: goto L_0x02c9;
                case 22: goto L_0x02bc;
                case 23: goto L_0x02ee;
                case 24: goto L_0x02e2;
                case 25: goto L_0x02b0;
                case 26: goto L_0x02a4;
                case 27: goto L_0x0294;
                case 28: goto L_0x0288;
                case 29: goto L_0x027b;
                case 30: goto L_0x026e;
                case 31: goto L_0x02e2;
                case 32: goto L_0x02ee;
                case 33: goto L_0x0261;
                case 34: goto L_0x0254;
                case 35: goto L_0x023b;
                case 36: goto L_0x022e;
                case 37: goto L_0x0221;
                case 38: goto L_0x0214;
                case 39: goto L_0x0207;
                case 40: goto L_0x01fa;
                case 41: goto L_0x01ed;
                case 42: goto L_0x01de;
                case 43: goto L_0x01d0;
                case 44: goto L_0x01c2;
                case 45: goto L_0x01b4;
                case 46: goto L_0x01a6;
                case 47: goto L_0x0198;
                case 48: goto L_0x018a;
                case 49: goto L_0x017a;
                case 50: goto L_0x016d;
                case 51: goto L_0x015f;
                case 52: goto L_0x0151;
                case 53: goto L_0x013b;
                case 54: goto L_0x0134;
                case 55: goto L_0x011e;
                case 56: goto L_0x0117;
                case 57: goto L_0x0110;
                case 58: goto L_0x0102;
                case 59: goto L_0x00d2;
                case 60: goto L_0x00be;
                case 61: goto L_0x00b3;
                case 62: goto L_0x009d;
                case 63: goto L_0x0095;
                case 64: goto L_0x008d;
                case 65: goto L_0x0085;
                case 66: goto L_0x006f;
                case 67: goto L_0x0055;
                case 68: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0408
        L_0x003f:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0408
            java.lang.Object r1 = r0.getObject(r15, r12)
            g.e.a.b.e.c.o8 r1 = (g.e.a.b.e.c.o8) r1
            g.e.a.b.e.c.y8 r6 = r14.m(r2)
            int r1 = g.e.a.b.e.c.x6.s(r8, r1, r6)
            goto L_0x0407
        L_0x0055:
            boolean r6 = r14.w(r15, r8, r2)
            if (r6 == 0) goto L_0x0408
            long r6 = k(r15, r12)
            int r8 = r8 << 3
            int r8 = g.e.a.b.e.c.x6.a(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = g.e.a.b.e.c.x6.b(r6)
            goto L_0x0324
        L_0x006f:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0408
            int r1 = I(r15, r12)
            int r6 = r8 << 3
            int r6 = g.e.a.b.e.c.x6.a(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            goto L_0x00ad
        L_0x0085:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0408
            goto L_0x0165
        L_0x008d:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0408
            goto L_0x0157
        L_0x0095:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0408
            goto L_0x0124
        L_0x009d:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0408
            int r1 = I(r15, r12)
            int r6 = r8 << 3
            int r6 = g.e.a.b.e.c.x6.a(r6)
        L_0x00ad:
            int r1 = g.e.a.b.e.c.x6.a(r1)
            goto L_0x03d3
        L_0x00b3:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0408
            java.lang.Object r1 = r0.getObject(r15, r12)
            goto L_0x00e0
        L_0x00be:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0408
            java.lang.Object r1 = r0.getObject(r15, r12)
            g.e.a.b.e.c.y8 r6 = r14.m(r2)
            int r1 = g.e.a.b.e.c.a9.H(r8, r1, r6)
            goto L_0x0407
        L_0x00d2:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0408
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof g.e.a.b.e.c.s6
            if (r6 == 0) goto L_0x00f4
        L_0x00e0:
            g.e.a.b.e.c.s6 r1 = (g.e.a.b.e.c.s6) r1
            int r6 = r8 << 3
            int r6 = g.e.a.b.e.c.x6.a(r6)
            int r1 = r1.h()
            int r7 = g.e.a.b.e.c.x6.a(r1)
            int r7 = r7 + r1
            int r7 = r7 + r6
            goto L_0x0251
        L_0x00f4:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = g.e.a.b.e.c.x6.a(r6)
            int r1 = g.e.a.b.e.c.x6.v(r1)
            goto L_0x03d3
        L_0x0102:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0408
            int r1 = r8 << 3
            int r1 = g.e.a.b.e.c.x6.a(r1)
            goto L_0x03b5
        L_0x0110:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0408
            goto L_0x0157
        L_0x0117:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0408
            goto L_0x0165
        L_0x011e:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0408
        L_0x0124:
            int r1 = I(r15, r12)
            int r6 = r8 << 3
            int r6 = g.e.a.b.e.c.x6.a(r6)
            int r1 = g.e.a.b.e.c.x6.t(r1)
            goto L_0x03d3
        L_0x0134:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0408
            goto L_0x0141
        L_0x013b:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0408
        L_0x0141:
            long r6 = k(r15, r12)
            int r1 = r8 << 3
            int r1 = g.e.a.b.e.c.x6.a(r1)
            int r6 = g.e.a.b.e.c.x6.b(r6)
            goto L_0x03ec
        L_0x0151:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0408
        L_0x0157:
            int r1 = r8 << 3
            int r1 = g.e.a.b.e.c.x6.a(r1)
            goto L_0x03f8
        L_0x015f:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0408
        L_0x0165:
            int r1 = r8 << 3
            int r1 = g.e.a.b.e.c.x6.a(r1)
            goto L_0x0405
        L_0x016d:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.lang.Object r6 = r14.n(r2)
            g.e.a.b.e.c.j8.a(r8, r1, r6)
            goto L_0x0408
        L_0x017a:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            g.e.a.b.e.c.y8 r6 = r14.m(r2)
            int r1 = g.e.a.b.e.c.a9.C(r8, r1, r6)
            goto L_0x0407
        L_0x018a:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = g.e.a.b.e.c.a9.M(r1)
            if (r1 <= 0) goto L_0x0408
            goto L_0x0247
        L_0x0198:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = g.e.a.b.e.c.a9.K(r1)
            if (r1 <= 0) goto L_0x0408
            goto L_0x0247
        L_0x01a6:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = g.e.a.b.e.c.a9.B(r1)
            if (r1 <= 0) goto L_0x0408
            goto L_0x0247
        L_0x01b4:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = g.e.a.b.e.c.a9.z(r1)
            if (r1 <= 0) goto L_0x0408
            goto L_0x0247
        L_0x01c2:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = g.e.a.b.e.c.a9.x(r1)
            if (r1 <= 0) goto L_0x0408
            goto L_0x0247
        L_0x01d0:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = g.e.a.b.e.c.a9.P(r1)
            if (r1 <= 0) goto L_0x0408
            goto L_0x0247
        L_0x01de:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            java.lang.Class r6 = g.e.a.b.e.c.a9.a
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0408
            goto L_0x0247
        L_0x01ed:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = g.e.a.b.e.c.a9.z(r1)
            if (r1 <= 0) goto L_0x0408
            goto L_0x0247
        L_0x01fa:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = g.e.a.b.e.c.a9.B(r1)
            if (r1 <= 0) goto L_0x0408
            goto L_0x0247
        L_0x0207:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = g.e.a.b.e.c.a9.E(r1)
            if (r1 <= 0) goto L_0x0408
            goto L_0x0247
        L_0x0214:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = g.e.a.b.e.c.a9.R(r1)
            if (r1 <= 0) goto L_0x0408
            goto L_0x0247
        L_0x0221:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = g.e.a.b.e.c.a9.G(r1)
            if (r1 <= 0) goto L_0x0408
            goto L_0x0247
        L_0x022e:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = g.e.a.b.e.c.a9.z(r1)
            if (r1 <= 0) goto L_0x0408
            goto L_0x0247
        L_0x023b:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = g.e.a.b.e.c.a9.B(r1)
            if (r1 <= 0) goto L_0x0408
        L_0x0247:
            int r6 = g.e.a.b.e.c.x6.w(r8)
            int r7 = g.e.a.b.e.c.x6.a(r1)
            int r7 = r7 + r6
            int r7 = r7 + r1
        L_0x0251:
            int r3 = r3 + r7
            goto L_0x0408
        L_0x0254:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = g.e.a.b.e.c.a9.L(r8, r1, r6)
            goto L_0x0407
        L_0x0261:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = g.e.a.b.e.c.a9.J(r8, r6, r1)
            goto L_0x0407
        L_0x026e:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = g.e.a.b.e.c.a9.w(r8, r6, r1)
            goto L_0x0407
        L_0x027b:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = g.e.a.b.e.c.a9.O(r8, r6, r1)
            goto L_0x0407
        L_0x0288:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = g.e.a.b.e.c.a9.v(r8, r1)
            goto L_0x0407
        L_0x0294:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            g.e.a.b.e.c.y8 r6 = r14.m(r2)
            int r1 = g.e.a.b.e.c.a9.I(r8, r1, r6)
            goto L_0x0407
        L_0x02a4:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = g.e.a.b.e.c.a9.N(r8, r1)
            goto L_0x0407
        L_0x02b0:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = g.e.a.b.e.c.a9.s(r8, r1)
            goto L_0x0407
        L_0x02bc:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = g.e.a.b.e.c.a9.D(r8, r1, r6)
            goto L_0x0407
        L_0x02c9:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = g.e.a.b.e.c.a9.Q(r8, r6, r1)
            goto L_0x0407
        L_0x02d6:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = g.e.a.b.e.c.a9.F(r8, r1)
            goto L_0x0407
        L_0x02e2:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = g.e.a.b.e.c.a9.y(r8, r1)
            goto L_0x0407
        L_0x02ee:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = g.e.a.b.e.c.a9.A(r8, r1)
            goto L_0x0407
        L_0x02fa:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0408
            java.lang.Object r1 = r0.getObject(r15, r12)
            g.e.a.b.e.c.o8 r1 = (g.e.a.b.e.c.o8) r1
            g.e.a.b.e.c.y8 r6 = r14.m(r2)
            int r1 = g.e.a.b.e.c.x6.s(r8, r1, r6)
            goto L_0x0407
        L_0x030e:
            r6 = r7 & r5
            if (r6 == 0) goto L_0x0408
            long r6 = r0.getLong(r15, r12)
            int r8 = r8 << 3
            int r8 = g.e.a.b.e.c.x6.a(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = g.e.a.b.e.c.x6.b(r6)
        L_0x0324:
            int r1 = r1 + r8
            goto L_0x0407
        L_0x0327:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0408
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = g.e.a.b.e.c.x6.a(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            goto L_0x035b
        L_0x033b:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0408
            goto L_0x03ff
        L_0x0341:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0408
            goto L_0x03f2
        L_0x0347:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0408
            goto L_0x03c5
        L_0x034d:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0408
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = g.e.a.b.e.c.x6.a(r6)
        L_0x035b:
            int r1 = g.e.a.b.e.c.x6.a(r1)
            goto L_0x03d3
        L_0x0361:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0408
            java.lang.Object r1 = r0.getObject(r15, r12)
            goto L_0x0388
        L_0x036a:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0408
            java.lang.Object r1 = r0.getObject(r15, r12)
            g.e.a.b.e.c.y8 r6 = r14.m(r2)
            int r1 = g.e.a.b.e.c.a9.H(r8, r1, r6)
            goto L_0x0407
        L_0x037c:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0408
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof g.e.a.b.e.c.s6
            if (r6 == 0) goto L_0x039e
        L_0x0388:
            g.e.a.b.e.c.s6 r1 = (g.e.a.b.e.c.s6) r1
            int r6 = r8 << 3
            int r6 = g.e.a.b.e.c.x6.a(r6)
            int r1 = r1.h()
            int r7 = g.e.a.b.e.c.x6.a(r1)
            int r7 = r7 + r1
            int r7 = r7 + r6
            int r7 = r7 + r3
            r3 = r7
            goto L_0x0408
        L_0x039e:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = g.e.a.b.e.c.x6.a(r6)
            int r1 = g.e.a.b.e.c.x6.v(r1)
            goto L_0x03d3
        L_0x03ab:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0408
            int r1 = r8 << 3
            int r1 = g.e.a.b.e.c.x6.a(r1)
        L_0x03b5:
            int r1 = r1 + r11
            goto L_0x0407
        L_0x03b7:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0408
            goto L_0x03f2
        L_0x03bc:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0408
            goto L_0x03ff
        L_0x03c1:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0408
        L_0x03c5:
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = g.e.a.b.e.c.x6.a(r6)
            int r1 = g.e.a.b.e.c.x6.t(r1)
        L_0x03d3:
            int r1 = r1 + r6
            goto L_0x0407
        L_0x03d5:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0408
            goto L_0x03de
        L_0x03da:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0408
        L_0x03de:
            long r6 = r0.getLong(r15, r12)
            int r1 = r8 << 3
            int r1 = g.e.a.b.e.c.x6.a(r1)
            int r6 = g.e.a.b.e.c.x6.b(r6)
        L_0x03ec:
            int r1 = r1 + r6
            goto L_0x0407
        L_0x03ee:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0408
        L_0x03f2:
            int r1 = r8 << 3
            int r1 = g.e.a.b.e.c.x6.a(r1)
        L_0x03f8:
            int r1 = r1 + 4
            goto L_0x0407
        L_0x03fb:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0408
        L_0x03ff:
            int r1 = r8 << 3
            int r1 = g.e.a.b.e.c.x6.a(r1)
        L_0x0405:
            int r1 = r1 + 8
        L_0x0407:
            int r3 = r3 + r1
        L_0x0408:
            int r2 = r2 + 3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000b
        L_0x040f:
            g.e.a.b.e.c.l9 r0 = r14.f3031l
            java.lang.Object r1 = r0.c(r15)
            int r0 = r0.a(r1)
            int r0 = r0 + r3
            boolean r1 = r14.f3025f
            if (r1 != 0) goto L_0x041f
            return r0
        L_0x041f:
            g.e.a.b.e.c.c7 r0 = r14.f3032m
            r0.a(r15)
            r15 = 0
            goto L_0x0427
        L_0x0426:
            throw r15
        L_0x0427:
            goto L_0x0426
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.q8.G(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0288, code lost:
        r5 = g.e.a.b.e.c.x6.a(r6 << 3);
        r4 = g.e.a.b.e.c.x6.b((r7 >> 63) ^ (r7 + r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02a3, code lost:
        r5 = g.e.a.b.e.c.x6.a(r6 << 3);
        r4 = (r4 >> 31) ^ (r4 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02d1, code lost:
        r5 = g.e.a.b.e.c.x6.a(r6 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02d7, code lost:
        r4 = g.e.a.b.e.c.x6.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02e3, code lost:
        r4 = g.e.a.b.e.c.v9.j(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02ee, code lost:
        r4 = g.e.a.b.e.c.a9.H(r6, g.e.a.b.e.c.v9.j(r12, r7), m(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0308, code lost:
        if ((r4 instanceof g.e.a.b.e.c.s6) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x030a, code lost:
        r5 = g.e.a.b.e.c.x6.a(r6 << 3);
        r4 = ((g.e.a.b.e.c.s6) r4).h();
        r6 = (g.e.a.b.e.c.x6.a(r4) + r4) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x031c, code lost:
        r3 = r3 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x031f, code lost:
        r5 = g.e.a.b.e.c.x6.a(r6 << 3);
        r4 = g.e.a.b.e.c.x6.v((java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0332, code lost:
        r4 = g.e.a.b.e.c.x6.a(r6 << 3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x034f, code lost:
        r4 = g.e.a.b.e.c.v9.g(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0353, code lost:
        r5 = g.e.a.b.e.c.x6.a(r6 << 3);
        r4 = g.e.a.b.e.c.x6.t(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x035d, code lost:
        r4 = r4 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x036c, code lost:
        r4 = g.e.a.b.e.c.v9.h(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0370, code lost:
        r4 = g.e.a.b.e.c.x6.b(r4) + g.e.a.b.e.c.x6.a(r6 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0382, code lost:
        r4 = g.e.a.b.e.c.x6.a(r6 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0391, code lost:
        r4 = g.e.a.b.e.c.x6.a(r6 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0399, code lost:
        r3 = r3 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x039a, code lost:
        r2 = r2 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0097, code lost:
        if ((r4 instanceof g.e.a.b.e.c.s6) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b9, code lost:
        r4 = I(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cc, code lost:
        r4 = k(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01bc, code lost:
        r6 = (g.e.a.b.e.c.x6.a(r4) + g.e.a.b.e.c.x6.w(r6)) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x026e, code lost:
        r4 = g.e.a.b.e.c.x6.s(r6, (g.e.a.b.e.c.o8) g.e.a.b.e.c.v9.j(r12, r7), m(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int H(java.lang.Object r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = p
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0005:
            int[] r4 = r11.a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x039e
            int r4 = r11.j(r2)
            int r5 = r4 >>> 20
            r5 = r5 & 255(0xff, float:3.57E-43)
            int[] r6 = r11.a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            g.e.a.b.e.c.h7 r4 = g.e.a.b.e.c.h7.DOUBLE_LIST_PACKED
            int r4 = r4.c()
            if (r5 < r4) goto L_0x0031
            g.e.a.b.e.c.h7 r4 = g.e.a.b.e.c.h7.SINT64_LIST_PACKED
            int r4 = r4.c()
            if (r5 > r4) goto L_0x0031
            int[] r4 = r11.a
            int r9 = r2 + 2
            r4 = r4[r9]
        L_0x0031:
            r4 = 63
            switch(r5) {
                case 0: goto L_0x038b;
                case 1: goto L_0x037c;
                case 2: goto L_0x0366;
                case 3: goto L_0x035f;
                case 4: goto L_0x0349;
                case 5: goto L_0x0342;
                case 6: goto L_0x033b;
                case 7: goto L_0x032c;
                case 8: goto L_0x02fc;
                case 9: goto L_0x02e8;
                case 10: goto L_0x02dd;
                case 11: goto L_0x02c7;
                case 12: goto L_0x02bf;
                case 13: goto L_0x02b7;
                case 14: goto L_0x02af;
                case 15: goto L_0x0299;
                case 16: goto L_0x027e;
                case 17: goto L_0x0268;
                case 18: goto L_0x025c;
                case 19: goto L_0x0250;
                case 20: goto L_0x0244;
                case 21: goto L_0x0238;
                case 22: goto L_0x022c;
                case 23: goto L_0x025c;
                case 24: goto L_0x0250;
                case 25: goto L_0x0220;
                case 26: goto L_0x0214;
                case 27: goto L_0x0204;
                case 28: goto L_0x01f8;
                case 29: goto L_0x01ec;
                case 30: goto L_0x01e0;
                case 31: goto L_0x0250;
                case 32: goto L_0x025c;
                case 33: goto L_0x01d4;
                case 34: goto L_0x01c8;
                case 35: goto L_0x01b0;
                case 36: goto L_0x01a3;
                case 37: goto L_0x0196;
                case 38: goto L_0x0189;
                case 39: goto L_0x017c;
                case 40: goto L_0x016f;
                case 41: goto L_0x0162;
                case 42: goto L_0x0153;
                case 43: goto L_0x0145;
                case 44: goto L_0x0137;
                case 45: goto L_0x0129;
                case 46: goto L_0x011b;
                case 47: goto L_0x010d;
                case 48: goto L_0x00ff;
                case 49: goto L_0x00ef;
                case 50: goto L_0x00e2;
                case 51: goto L_0x00da;
                case 52: goto L_0x00d2;
                case 53: goto L_0x00c6;
                case 54: goto L_0x00bf;
                case 55: goto L_0x00b3;
                case 56: goto L_0x00ab;
                case 57: goto L_0x00a3;
                case 58: goto L_0x009b;
                case 59: goto L_0x008b;
                case 60: goto L_0x0083;
                case 61: goto L_0x007b;
                case 62: goto L_0x006f;
                case 63: goto L_0x0068;
                case 64: goto L_0x0060;
                case 65: goto L_0x0058;
                case 66: goto L_0x004c;
                case 67: goto L_0x0040;
                case 68: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x039a
        L_0x0038:
            boolean r4 = r11.w(r12, r6, r2)
            if (r4 == 0) goto L_0x039a
            goto L_0x026e
        L_0x0040:
            boolean r5 = r11.w(r12, r6, r2)
            if (r5 == 0) goto L_0x039a
            long r7 = k(r12, r7)
            goto L_0x0288
        L_0x004c:
            boolean r4 = r11.w(r12, r6, r2)
            if (r4 == 0) goto L_0x039a
            int r4 = I(r12, r7)
            goto L_0x02a3
        L_0x0058:
            boolean r4 = r11.w(r12, r6, r2)
            if (r4 == 0) goto L_0x039a
            goto L_0x0391
        L_0x0060:
            boolean r4 = r11.w(r12, r6, r2)
            if (r4 == 0) goto L_0x039a
            goto L_0x0382
        L_0x0068:
            boolean r4 = r11.w(r12, r6, r2)
            if (r4 == 0) goto L_0x039a
            goto L_0x00b9
        L_0x006f:
            boolean r4 = r11.w(r12, r6, r2)
            if (r4 == 0) goto L_0x039a
            int r4 = I(r12, r7)
            goto L_0x02d1
        L_0x007b:
            boolean r4 = r11.w(r12, r6, r2)
            if (r4 == 0) goto L_0x039a
            goto L_0x02e3
        L_0x0083:
            boolean r4 = r11.w(r12, r6, r2)
            if (r4 == 0) goto L_0x039a
            goto L_0x02ee
        L_0x008b:
            boolean r4 = r11.w(r12, r6, r2)
            if (r4 == 0) goto L_0x039a
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r12, r7)
            boolean r5 = r4 instanceof g.e.a.b.e.c.s6
            if (r5 == 0) goto L_0x031f
            goto L_0x030a
        L_0x009b:
            boolean r4 = r11.w(r12, r6, r2)
            if (r4 == 0) goto L_0x039a
            goto L_0x0332
        L_0x00a3:
            boolean r4 = r11.w(r12, r6, r2)
            if (r4 == 0) goto L_0x039a
            goto L_0x0382
        L_0x00ab:
            boolean r4 = r11.w(r12, r6, r2)
            if (r4 == 0) goto L_0x039a
            goto L_0x0391
        L_0x00b3:
            boolean r4 = r11.w(r12, r6, r2)
            if (r4 == 0) goto L_0x039a
        L_0x00b9:
            int r4 = I(r12, r7)
            goto L_0x0353
        L_0x00bf:
            boolean r4 = r11.w(r12, r6, r2)
            if (r4 == 0) goto L_0x039a
            goto L_0x00cc
        L_0x00c6:
            boolean r4 = r11.w(r12, r6, r2)
            if (r4 == 0) goto L_0x039a
        L_0x00cc:
            long r4 = k(r12, r7)
            goto L_0x0370
        L_0x00d2:
            boolean r4 = r11.w(r12, r6, r2)
            if (r4 == 0) goto L_0x039a
            goto L_0x0382
        L_0x00da:
            boolean r4 = r11.w(r12, r6, r2)
            if (r4 == 0) goto L_0x039a
            goto L_0x0391
        L_0x00e2:
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r12, r7)
            java.lang.Object r5 = r11.n(r2)
            g.e.a.b.e.c.j8.a(r6, r4, r5)
            goto L_0x039a
        L_0x00ef:
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r12, r7)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.y8 r5 = r11.m(r2)
            int r4 = g.e.a.b.e.c.a9.C(r6, r4, r5)
            goto L_0x0399
        L_0x00ff:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.M(r4)
            if (r4 <= 0) goto L_0x039a
            goto L_0x01bc
        L_0x010d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.K(r4)
            if (r4 <= 0) goto L_0x039a
            goto L_0x01bc
        L_0x011b:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.B(r4)
            if (r4 <= 0) goto L_0x039a
            goto L_0x01bc
        L_0x0129:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.z(r4)
            if (r4 <= 0) goto L_0x039a
            goto L_0x01bc
        L_0x0137:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.x(r4)
            if (r4 <= 0) goto L_0x039a
            goto L_0x01bc
        L_0x0145:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.P(r4)
            if (r4 <= 0) goto L_0x039a
            goto L_0x01bc
        L_0x0153:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            java.lang.Class r5 = g.e.a.b.e.c.a9.a
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x039a
            goto L_0x01bc
        L_0x0162:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.z(r4)
            if (r4 <= 0) goto L_0x039a
            goto L_0x01bc
        L_0x016f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.B(r4)
            if (r4 <= 0) goto L_0x039a
            goto L_0x01bc
        L_0x017c:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.E(r4)
            if (r4 <= 0) goto L_0x039a
            goto L_0x01bc
        L_0x0189:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.R(r4)
            if (r4 <= 0) goto L_0x039a
            goto L_0x01bc
        L_0x0196:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.G(r4)
            if (r4 <= 0) goto L_0x039a
            goto L_0x01bc
        L_0x01a3:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.z(r4)
            if (r4 <= 0) goto L_0x039a
            goto L_0x01bc
        L_0x01b0:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.B(r4)
            if (r4 <= 0) goto L_0x039a
        L_0x01bc:
            int r5 = g.e.a.b.e.c.x6.w(r6)
            int r6 = g.e.a.b.e.c.x6.a(r4)
            int r6 = r6 + r5
            int r6 = r6 + r4
            goto L_0x031c
        L_0x01c8:
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.L(r6, r4, r1)
            goto L_0x0399
        L_0x01d4:
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.J(r6, r4, r1)
            goto L_0x0399
        L_0x01e0:
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.w(r6, r4, r1)
            goto L_0x0399
        L_0x01ec:
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.O(r6, r4, r1)
            goto L_0x0399
        L_0x01f8:
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.v(r6, r4)
            goto L_0x0399
        L_0x0204:
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r12, r7)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.y8 r5 = r11.m(r2)
            int r4 = g.e.a.b.e.c.a9.I(r6, r4, r5)
            goto L_0x0399
        L_0x0214:
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.N(r6, r4)
            goto L_0x0399
        L_0x0220:
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.s(r6, r4)
            goto L_0x0399
        L_0x022c:
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.D(r6, r4, r1)
            goto L_0x0399
        L_0x0238:
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.Q(r6, r4, r1)
            goto L_0x0399
        L_0x0244:
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.F(r6, r4)
            goto L_0x0399
        L_0x0250:
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.y(r6, r4)
            goto L_0x0399
        L_0x025c:
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = g.e.a.b.e.c.a9.A(r6, r4)
            goto L_0x0399
        L_0x0268:
            boolean r4 = r11.u(r12, r2)
            if (r4 == 0) goto L_0x039a
        L_0x026e:
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r12, r7)
            g.e.a.b.e.c.o8 r4 = (g.e.a.b.e.c.o8) r4
            g.e.a.b.e.c.y8 r5 = r11.m(r2)
            int r4 = g.e.a.b.e.c.x6.s(r6, r4, r5)
            goto L_0x0399
        L_0x027e:
            boolean r5 = r11.u(r12, r2)
            if (r5 == 0) goto L_0x039a
            long r7 = g.e.a.b.e.c.v9.h(r12, r7)
        L_0x0288:
            int r5 = r6 << 3
            int r5 = g.e.a.b.e.c.x6.a(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = g.e.a.b.e.c.x6.b(r6)
            goto L_0x035d
        L_0x0299:
            boolean r4 = r11.u(r12, r2)
            if (r4 == 0) goto L_0x039a
            int r4 = g.e.a.b.e.c.v9.g(r12, r7)
        L_0x02a3:
            int r5 = r6 << 3
            int r5 = g.e.a.b.e.c.x6.a(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            goto L_0x02d7
        L_0x02af:
            boolean r4 = r11.u(r12, r2)
            if (r4 == 0) goto L_0x039a
            goto L_0x0391
        L_0x02b7:
            boolean r4 = r11.u(r12, r2)
            if (r4 == 0) goto L_0x039a
            goto L_0x0382
        L_0x02bf:
            boolean r4 = r11.u(r12, r2)
            if (r4 == 0) goto L_0x039a
            goto L_0x034f
        L_0x02c7:
            boolean r4 = r11.u(r12, r2)
            if (r4 == 0) goto L_0x039a
            int r4 = g.e.a.b.e.c.v9.g(r12, r7)
        L_0x02d1:
            int r5 = r6 << 3
            int r5 = g.e.a.b.e.c.x6.a(r5)
        L_0x02d7:
            int r4 = g.e.a.b.e.c.x6.a(r4)
            goto L_0x035d
        L_0x02dd:
            boolean r4 = r11.u(r12, r2)
            if (r4 == 0) goto L_0x039a
        L_0x02e3:
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r12, r7)
            goto L_0x030a
        L_0x02e8:
            boolean r4 = r11.u(r12, r2)
            if (r4 == 0) goto L_0x039a
        L_0x02ee:
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r12, r7)
            g.e.a.b.e.c.y8 r5 = r11.m(r2)
            int r4 = g.e.a.b.e.c.a9.H(r6, r4, r5)
            goto L_0x0399
        L_0x02fc:
            boolean r4 = r11.u(r12, r2)
            if (r4 == 0) goto L_0x039a
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r12, r7)
            boolean r5 = r4 instanceof g.e.a.b.e.c.s6
            if (r5 == 0) goto L_0x031f
        L_0x030a:
            g.e.a.b.e.c.s6 r4 = (g.e.a.b.e.c.s6) r4
            int r5 = r6 << 3
            int r5 = g.e.a.b.e.c.x6.a(r5)
            int r4 = r4.h()
            int r6 = g.e.a.b.e.c.x6.a(r4)
            int r6 = r6 + r4
            int r6 = r6 + r5
        L_0x031c:
            int r3 = r3 + r6
            goto L_0x039a
        L_0x031f:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = g.e.a.b.e.c.x6.a(r5)
            int r4 = g.e.a.b.e.c.x6.v(r4)
            goto L_0x035d
        L_0x032c:
            boolean r4 = r11.u(r12, r2)
            if (r4 == 0) goto L_0x039a
        L_0x0332:
            int r4 = r6 << 3
            int r4 = g.e.a.b.e.c.x6.a(r4)
            int r4 = r4 + 1
            goto L_0x0399
        L_0x033b:
            boolean r4 = r11.u(r12, r2)
            if (r4 == 0) goto L_0x039a
            goto L_0x0382
        L_0x0342:
            boolean r4 = r11.u(r12, r2)
            if (r4 == 0) goto L_0x039a
            goto L_0x0391
        L_0x0349:
            boolean r4 = r11.u(r12, r2)
            if (r4 == 0) goto L_0x039a
        L_0x034f:
            int r4 = g.e.a.b.e.c.v9.g(r12, r7)
        L_0x0353:
            int r5 = r6 << 3
            int r5 = g.e.a.b.e.c.x6.a(r5)
            int r4 = g.e.a.b.e.c.x6.t(r4)
        L_0x035d:
            int r4 = r4 + r5
            goto L_0x0399
        L_0x035f:
            boolean r4 = r11.u(r12, r2)
            if (r4 == 0) goto L_0x039a
            goto L_0x036c
        L_0x0366:
            boolean r4 = r11.u(r12, r2)
            if (r4 == 0) goto L_0x039a
        L_0x036c:
            long r4 = g.e.a.b.e.c.v9.h(r12, r7)
        L_0x0370:
            int r6 = r6 << 3
            int r6 = g.e.a.b.e.c.x6.a(r6)
            int r4 = g.e.a.b.e.c.x6.b(r4)
            int r4 = r4 + r6
            goto L_0x0399
        L_0x037c:
            boolean r4 = r11.u(r12, r2)
            if (r4 == 0) goto L_0x039a
        L_0x0382:
            int r4 = r6 << 3
            int r4 = g.e.a.b.e.c.x6.a(r4)
            int r4 = r4 + 4
            goto L_0x0399
        L_0x038b:
            boolean r4 = r11.u(r12, r2)
            if (r4 == 0) goto L_0x039a
        L_0x0391:
            int r4 = r6 << 3
            int r4 = g.e.a.b.e.c.x6.a(r4)
            int r4 = r4 + 8
        L_0x0399:
            int r3 = r3 + r4
        L_0x039a:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x039e:
            g.e.a.b.e.c.l9 r0 = r11.f3031l
            java.lang.Object r12 = r0.c(r12)
            int r12 = r0.a(r12)
            int r12 = r12 + r3
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.q8.H(java.lang.Object):int");
    }

    public final int J(Object obj, byte[] bArr, int i2, int i3, int i4, long j2) throws IOException {
        Unsafe unsafe = p;
        Object n2 = n(i4);
        Object object = unsafe.getObject(obj, j2);
        if (!((i8) object).b()) {
            i8 i8Var = i8.b;
            i8 i8Var2 = i8Var.isEmpty() ? new i8() : new i8(i8Var);
            j8.b(i8Var2, object);
            unsafe.putObject(obj, j2, i8Var2);
        }
        h8 h8Var = (h8) n2;
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c7, code lost:
        if (r15 == null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ca, code lost:
        r3 = g.e.a.b.e.c.v7.c(r15, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00db, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fe, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014c, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015a, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015e, code lost:
        r12.putObject(r1, r9, r3);
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0164, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004e, code lost:
        if (r15 == null) goto L_0x00db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int K(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, g.e.a.b.e.c.k6 r29) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = p
            int[] r7 = r0.a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 2
            r15 = 5
            switch(r25) {
                case 51: goto L_0x017d;
                case 52: goto L_0x0165;
                case 53: goto L_0x0151;
                case 54: goto L_0x0151;
                case 55: goto L_0x0143;
                case 56: goto L_0x012e;
                case 57: goto L_0x0119;
                case 58: goto L_0x0103;
                case 59: goto L_0x00cf;
                case 60: goto L_0x00ad;
                case 61: goto L_0x00a1;
                case 62: goto L_0x0143;
                case 63: goto L_0x0072;
                case 64: goto L_0x0119;
                case 65: goto L_0x012e;
                case 66: goto L_0x0062;
                case 67: goto L_0x0052;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0196
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x0196
            g.e.a.b.e.c.y8 r5 = r0.m(r6)
            r2 = r2 & -8
            r6 = r2 | 4
            r2 = r5
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r29
            int r2 = g.e.a.b.b.h.e.L(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            java.lang.Object r3 = r11.c
            if (r15 != 0) goto L_0x00ca
            goto L_0x00db
        L_0x0052:
            if (r5 == 0) goto L_0x0056
            goto L_0x0196
        L_0x0056:
            int r2 = g.e.a.b.b.h.e.j0(r3, r4, r11)
            long r3 = r11.b
            long r3 = g.e.a.b.e.c.t6.b(r3)
            goto L_0x015a
        L_0x0062:
            if (r5 == 0) goto L_0x0066
            goto L_0x0196
        L_0x0066:
            int r2 = g.e.a.b.b.h.e.d0(r3, r4, r11)
            int r3 = r11.a
            int r3 = g.e.a.b.e.c.t6.a(r3)
            goto L_0x014c
        L_0x0072:
            if (r5 != 0) goto L_0x0196
            int r3 = g.e.a.b.b.h.e.d0(r3, r4, r11)
            int r4 = r11.a
            g.e.a.b.e.c.r7 r5 = r0.l(r6)
            if (r5 == 0) goto L_0x0094
            boolean r5 = r5.a(r4)
            if (r5 == 0) goto L_0x0087
            goto L_0x0094
        L_0x0087:
            g.e.a.b.e.c.m9 r1 = B(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.c(r2, r4)
            goto L_0x009e
        L_0x0094:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
        L_0x009e:
            r2 = r3
            goto L_0x0197
        L_0x00a1:
            if (r5 == r7) goto L_0x00a5
            goto L_0x0196
        L_0x00a5:
            int r2 = g.e.a.b.b.h.e.r(r3, r4, r11)
            java.lang.Object r3 = r11.c
            goto L_0x015e
        L_0x00ad:
            if (r5 != r7) goto L_0x0196
            g.e.a.b.e.c.y8 r2 = r0.m(r6)
            r5 = r20
            int r2 = g.e.a.b.b.h.e.O(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00c4
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00c5
        L_0x00c4:
            r15 = 0
        L_0x00c5:
            java.lang.Object r3 = r11.c
            if (r15 != 0) goto L_0x00ca
            goto L_0x00db
        L_0x00ca:
            java.lang.Object r3 = g.e.a.b.e.c.v7.c(r15, r3)
            goto L_0x00db
        L_0x00cf:
            if (r5 != r7) goto L_0x0196
            int r2 = g.e.a.b.b.h.e.d0(r3, r4, r11)
            int r4 = r11.a
            if (r4 != 0) goto L_0x00df
            java.lang.String r3 = ""
        L_0x00db:
            r12.putObject(r1, r9, r3)
            goto L_0x00fe
        L_0x00df:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x00f3
            int r5 = r2 + r4
            boolean r5 = g.e.a.b.e.c.y9.d(r3, r2, r5)
            if (r5 == 0) goto L_0x00ee
            goto L_0x00f3
        L_0x00ee:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.a()
            throw r1
        L_0x00f3:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = g.e.a.b.e.c.v7.a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x00fe:
            r12.putInt(r1, r13, r8)
            goto L_0x0197
        L_0x0103:
            if (r5 != 0) goto L_0x0196
            int r2 = g.e.a.b.b.h.e.j0(r3, r4, r11)
            long r3 = r11.b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0113
            r15 = 1
            goto L_0x0114
        L_0x0113:
            r15 = 0
        L_0x0114:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x015e
        L_0x0119:
            if (r5 == r15) goto L_0x011d
            goto L_0x0196
        L_0x011d:
            int r2 = g.e.a.b.b.h.e.D(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 4
            return r1
        L_0x012e:
            r2 = 1
            if (r5 == r2) goto L_0x0132
            goto L_0x0196
        L_0x0132:
            long r2 = g.e.a.b.b.h.e.k0(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 8
            return r1
        L_0x0143:
            if (r5 == 0) goto L_0x0146
            goto L_0x0196
        L_0x0146:
            int r2 = g.e.a.b.b.h.e.d0(r3, r4, r11)
            int r3 = r11.a
        L_0x014c:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x015e
        L_0x0151:
            if (r5 == 0) goto L_0x0154
            goto L_0x0196
        L_0x0154:
            int r2 = g.e.a.b.b.h.e.j0(r3, r4, r11)
            long r3 = r11.b
        L_0x015a:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x015e:
            r12.putObject(r1, r9, r3)
            r12.putInt(r1, r13, r8)
            return r2
        L_0x0165:
            if (r5 == r15) goto L_0x0168
            goto L_0x0196
        L_0x0168:
            int r2 = g.e.a.b.b.h.e.D(r18, r19)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 4
            return r1
        L_0x017d:
            r2 = 1
            if (r5 == r2) goto L_0x0181
            goto L_0x0196
        L_0x0181:
            long r2 = g.e.a.b.b.h.e.k0(r18, r19)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 8
            return r1
        L_0x0196:
            r2 = r4
        L_0x0197:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.q8.K(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, g.e.a.b.e.c.k6):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02d9, code lost:
        if (r0 != r15) goto L_0x0323;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0321, code lost:
        if (r0 != r15) goto L_0x0323;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0323, code lost:
        r5 = r0;
        r2 = r19;
        r10 = r26;
        r9 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f7, code lost:
        r12.putInt(r11, r13, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        r9 = r9 | r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0111, code lost:
        r19 = r4;
        r13 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012e, code lost:
        r1 = r8.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0152, code lost:
        r12.putObject(r11, r13, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0188, code lost:
        r9 = r9 | r23;
        r2 = r4;
        r4 = r11;
        r14 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ac, code lost:
        r5 = r5;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01fc, code lost:
        r16 = r0;
        r0 = r9 | r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0201, code lost:
        r9 = r0;
        r2 = r4;
        r4 = r11;
        r28 = r12;
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0231, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int L(java.lang.Object r30, byte[] r31, int r32, int r33, g.e.a.b.e.c.k6 r34) throws java.io.IOException {
        /*
            r29 = this;
            r15 = r33
            sun.misc.Unsafe r14 = p
            r12 = -1
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r11 = 0
            r6 = r29
            r4 = r30
            r7 = r31
            r0 = r32
            r8 = r34
            r1 = -1
            r2 = 0
            r9 = 0
            r10 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            if (r0 >= r15) goto L_0x0356
            int r3 = r0 + 1
            byte r0 = r7[r0]
            if (r0 >= 0) goto L_0x002b
            int r0 = g.e.a.b.b.h.e.f0(r0, r7, r3, r8)
            int r3 = r8.a
            r5 = r0
            r16 = r3
            goto L_0x002e
        L_0x002b:
            r16 = r0
            r5 = r3
        L_0x002e:
            int r3 = r16 >>> 3
            r0 = r16 & 7
            if (r3 <= r1) goto L_0x0043
            int r2 = r2 / 3
            int r1 = r6.c
            if (r3 < r1) goto L_0x0051
            int r1 = r6.f3023d
            if (r3 > r1) goto L_0x0051
            int r1 = r6.O(r3, r2)
            goto L_0x004f
        L_0x0043:
            int r1 = r6.c
            if (r3 < r1) goto L_0x0051
            int r1 = r6.f3023d
            if (r3 > r1) goto L_0x0051
            int r1 = r6.O(r3, r11)
        L_0x004f:
            r2 = r1
            goto L_0x0052
        L_0x0051:
            r2 = -1
        L_0x0052:
            if (r2 != r12) goto L_0x005d
            r24 = r3
            r12 = r14
            r2 = 0
            r25 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0232
        L_0x005d:
            int[] r1 = r6.a
            int r17 = r2 + 1
            r11 = r1[r17]
            int r12 = r11 >>> 20
            r12 = r12 & 255(0xff, float:3.57E-43)
            r32 = r3
            r3 = r11 & r13
            r19 = r14
            long r13 = (long) r3
            r3 = 17
            r21 = r11
            if (r12 > r3) goto L_0x023d
            int r3 = r2 + 2
            r1 = r1[r3]
            int r3 = r1 >>> 20
            r11 = 1
            int r23 = r11 << r3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r3
            r20 = r12
            if (r1 == r10) goto L_0x009a
            if (r10 == r3) goto L_0x008e
            long r11 = (long) r10
            r10 = r19
            r10.putInt(r4, r11, r9)
            goto L_0x0090
        L_0x008e:
            r10 = r19
        L_0x0090:
            if (r1 == r3) goto L_0x0097
            long r11 = (long) r1
            int r9 = r10.getInt(r4, r11)
        L_0x0097:
            r12 = r10
            r10 = r1
            goto L_0x009c
        L_0x009a:
            r12 = r19
        L_0x009c:
            r1 = 5
            switch(r20) {
                case 0: goto L_0x020e;
                case 1: goto L_0x01e4;
                case 2: goto L_0x01c5;
                case 3: goto L_0x01c5;
                case 4: goto L_0x01b2;
                case 5: goto L_0x018f;
                case 6: goto L_0x0175;
                case 7: goto L_0x0157;
                case 8: goto L_0x0138;
                case 9: goto L_0x0116;
                case 10: goto L_0x00fb;
                case 11: goto L_0x01b2;
                case 12: goto L_0x00e8;
                case 13: goto L_0x0175;
                case 14: goto L_0x018f;
                case 15: goto L_0x00d4;
                case 16: goto L_0x00a8;
                default: goto L_0x00a0;
            }
        L_0x00a0:
            r24 = r32
            r4 = r2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0231
        L_0x00a8:
            if (r0 != 0) goto L_0x00cc
            int r11 = g.e.a.b.b.h.e.j0(r7, r5, r8)
            long r0 = r8.b
            long r19 = g.e.a.b.e.c.t6.b(r0)
            r0 = r12
            r1 = r30
            r24 = r32
            r5 = r2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r13
            r13 = r4
            r14 = r5
            r4 = r19
            r0.putLong(r1, r2, r4)
            r0 = r9 | r23
            r9 = r0
            r0 = r11
            r11 = r13
            r4 = r14
            goto L_0x0111
        L_0x00cc:
            r24 = r32
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            goto L_0x0231
        L_0x00d4:
            r24 = r32
            r11 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != 0) goto L_0x0231
            int r0 = g.e.a.b.b.h.e.d0(r7, r5, r8)
            int r1 = r8.a
            int r1 = g.e.a.b.e.c.t6.a(r1)
            goto L_0x00f7
        L_0x00e8:
            r24 = r32
            r11 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != 0) goto L_0x0231
            int r0 = g.e.a.b.b.h.e.d0(r7, r5, r8)
            int r1 = r8.a
        L_0x00f7:
            r12.putInt(r11, r13, r1)
            goto L_0x010e
        L_0x00fb:
            r24 = r32
            r11 = r4
            r1 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != r1) goto L_0x0231
            int r0 = g.e.a.b.b.h.e.r(r7, r5, r8)
            java.lang.Object r1 = r8.c
            r12.putObject(r11, r13, r1)
        L_0x010e:
            r1 = r9 | r23
            r9 = r1
        L_0x0111:
            r19 = r4
            r13 = r6
            goto L_0x0284
        L_0x0116:
            r24 = r32
            r11 = r4
            r1 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != r1) goto L_0x0231
            g.e.a.b.e.c.y8 r0 = r6.m(r4)
            int r0 = g.e.a.b.b.h.e.O(r0, r7, r5, r15, r8)
            java.lang.Object r1 = r12.getObject(r11, r13)
            if (r1 != 0) goto L_0x0131
        L_0x012e:
            java.lang.Object r1 = r8.c
            goto L_0x0152
        L_0x0131:
            java.lang.Object r2 = r8.c
            java.lang.Object r1 = g.e.a.b.e.c.v7.c(r1, r2)
            goto L_0x0152
        L_0x0138:
            r24 = r32
            r11 = r4
            r1 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != r1) goto L_0x0231
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x014d
            int r0 = g.e.a.b.b.h.e.X(r7, r5, r8)
            goto L_0x012e
        L_0x014d:
            int r0 = g.e.a.b.b.h.e.Z(r7, r5, r8)
            goto L_0x012e
        L_0x0152:
            r12.putObject(r11, r13, r1)
            goto L_0x01fc
        L_0x0157:
            r24 = r32
            r11 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != 0) goto L_0x01ac
            int r0 = g.e.a.b.b.h.e.j0(r7, r5, r8)
            long r1 = r8.b
            r19 = 0
            int r3 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r3 == 0) goto L_0x016e
            r1 = 1
            goto L_0x016f
        L_0x016e:
            r1 = 0
        L_0x016f:
            g.e.a.b.e.c.u9 r2 = g.e.a.b.e.c.v9.f3057d
            r2.c(r11, r13, r1)
            goto L_0x0188
        L_0x0175:
            r24 = r32
            r11 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != r1) goto L_0x01ac
            int r0 = g.e.a.b.b.h.e.D(r7, r5)
            r12.putInt(r11, r13, r0)
            int r5 = r5 + 4
            r0 = r5
        L_0x0188:
            r9 = r9 | r23
            r2 = r4
            r4 = r11
            r14 = r12
            goto L_0x0289
        L_0x018f:
            r24 = r32
            r11 = r4
            r1 = 1
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != r1) goto L_0x01ac
            long r19 = g.e.a.b.b.h.e.k0(r7, r5)
            r0 = r12
            r1 = r30
            r2 = r13
            r14 = r4
            r13 = r5
            r4 = r19
            r0.putLong(r1, r2, r4)
            int r0 = r13 + 8
            r4 = r14
            goto L_0x01fc
        L_0x01ac:
            r14 = r4
            r13 = r5
            r5 = r13
            r4 = r14
            goto L_0x0231
        L_0x01b2:
            r24 = r32
            r11 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != 0) goto L_0x0231
            int r0 = g.e.a.b.b.h.e.d0(r7, r5, r8)
            int r1 = r8.a
            r12.putInt(r11, r13, r1)
            goto L_0x01fc
        L_0x01c5:
            r24 = r32
            r11 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != 0) goto L_0x0231
            int r16 = g.e.a.b.b.h.e.j0(r7, r5, r8)
            long r2 = r8.b
            r0 = r12
            r1 = r30
            r19 = r2
            r2 = r13
            r13 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            r0 = r9 | r23
            r4 = r13
            goto L_0x0201
        L_0x01e4:
            r24 = r32
            r11 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != r1) goto L_0x0231
            int r0 = g.e.a.b.b.h.e.D(r7, r5)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            g.e.a.b.e.c.u9 r1 = g.e.a.b.e.c.v9.f3057d
            r1.f(r11, r13, r0)
            int r0 = r5 + 4
        L_0x01fc:
            r1 = r9 | r23
            r16 = r0
            r0 = r1
        L_0x0201:
            r9 = r0
            r2 = r4
            r4 = r11
            r28 = r12
            r0 = r16
            r18 = 0
            r21 = -1
            goto L_0x034e
        L_0x020e:
            r24 = r32
            r11 = r4
            r1 = 1
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != r1) goto L_0x0231
            long r0 = g.e.a.b.b.h.e.k0(r7, r5)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            g.e.a.b.e.c.v9.m(r11, r13, r0)
            int r5 = r5 + 8
            r0 = r9 | r23
            r2 = r4
            r4 = r11
            r28 = r12
            r18 = 0
            r21 = -1
            goto L_0x034c
        L_0x0231:
            r2 = r4
        L_0x0232:
            r19 = r2
            r2 = r5
            r28 = r12
            r18 = 0
            r21 = -1
            goto L_0x0330
        L_0x023d:
            r24 = r32
            r11 = r4
            r20 = r12
            r12 = r19
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r1 = 27
            r3 = r20
            if (r3 != r1) goto L_0x02a1
            r1 = 2
            if (r0 != r1) goto L_0x0292
            java.lang.Object r0 = r12.getObject(r11, r13)
            g.e.a.b.e.c.u7 r0 = (g.e.a.b.e.c.u7) r0
            boolean r1 = r0.k()
            if (r1 != 0) goto L_0x026e
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0266
            r1 = 10
            goto L_0x0267
        L_0x0266:
            int r1 = r1 + r1
        L_0x0267:
            g.e.a.b.e.c.u7 r0 = r0.o(r1)
            r12.putObject(r11, r13, r0)
        L_0x026e:
            r13 = r0
            g.e.a.b.e.c.y8 r0 = r6.m(r4)
            r1 = r16
            r2 = r31
            r3 = r5
            r19 = r4
            r4 = r33
            r5 = r13
            r13 = r6
            r6 = r34
            int r0 = g.e.a.b.b.h.e.S(r0, r1, r2, r3, r4, r5, r6)
        L_0x0284:
            r4 = r11
            r14 = r12
            r6 = r13
            r2 = r19
        L_0x0289:
            r1 = r24
        L_0x028b:
            r11 = 0
            r12 = -1
            r13 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0019
        L_0x0292:
            r19 = r4
            r15 = r5
            r27 = r9
            r26 = r10
            r28 = r12
            r18 = 0
            r21 = -1
            goto L_0x02f7
        L_0x02a1:
            r19 = r4
            r1 = 49
            if (r3 > r1) goto L_0x02de
            r8 = r21
            long r7 = (long) r8
            r11 = r0
            r0 = r29
            r1 = r30
            r2 = r31
            r6 = r3
            r3 = r5
            r4 = r33
            r15 = r5
            r5 = r16
            r20 = r6
            r6 = r24
            r21 = r7
            r7 = r11
            r8 = r19
            r11 = r9
            r26 = r10
            r9 = r21
            r27 = r11
            r18 = 0
            r11 = r20
            r17 = r12
            r21 = -1
            r12 = r13
            r28 = r17
            r14 = r34
            int r0 = r0.M(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02dc
            goto L_0x0323
        L_0x02dc:
            r5 = r0
            goto L_0x032b
        L_0x02de:
            r11 = r0
            r20 = r3
            r15 = r5
            r27 = r9
            r26 = r10
            r28 = r12
            r8 = r21
            r18 = 0
            r21 = -1
            r0 = 50
            r9 = r20
            if (r9 != r0) goto L_0x030a
            r0 = 2
            if (r11 == r0) goto L_0x02f9
        L_0x02f7:
            r5 = r15
            goto L_0x032b
        L_0x02f9:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r19
            r6 = r13
            r0.J(r1, r2, r3, r4, r5, r6)
            r0 = 0
            throw r0
        L_0x030a:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r16
            r6 = r24
            r7 = r11
            r10 = r13
            r12 = r19
            r13 = r34
            int r0 = r0.K(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02dc
        L_0x0323:
            r5 = r0
            r2 = r19
            r10 = r26
            r9 = r27
            goto L_0x0343
        L_0x032b:
            r2 = r5
            r10 = r26
            r9 = r27
        L_0x0330:
            g.e.a.b.e.c.m9 r4 = B(r30)
            r0 = r16
            r1 = r31
            r3 = r33
            r5 = r34
            int r0 = g.e.a.b.b.h.e.b0(r0, r1, r2, r3, r4, r5)
            r5 = r0
            r2 = r19
        L_0x0343:
            r6 = r29
            r4 = r30
            r7 = r31
            r8 = r34
            r0 = r9
        L_0x034c:
            r9 = r0
            r0 = r5
        L_0x034e:
            r15 = r33
            r1 = r24
            r14 = r28
            goto L_0x028b
        L_0x0356:
            r27 = r9
            r28 = r14
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r10 == r1) goto L_0x0369
            long r1 = (long) r10
            r3 = r30
            r9 = r27
            r4 = r28
            r4.putInt(r3, r1, r9)
        L_0x0369:
            r1 = r33
            if (r0 != r1) goto L_0x036e
            return r0
        L_0x036e:
            com.google.android.gms.internal.measurement.zzkh r0 = com.google.android.gms.internal.measurement.zzkh.c()
            goto L_0x0374
        L_0x0373:
            throw r0
        L_0x0374:
            goto L_0x0373
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.q8.L(java.lang.Object, byte[], int, int, g.e.a.b.e.c.k6):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02ba, code lost:
        if (r7.b != 0) goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02bd, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02be, code lost:
        r13.e(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02c1, code lost:
        if (r1 >= r5) goto L_0x02d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02c3, code lost:
        r4 = g.e.a.b.b.h.e.d0(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02c9, code lost:
        if (r2 == r7.a) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02cc, code lost:
        r1 = g.e.a.b.b.h.e.j0(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02d4, code lost:
        if (r7.b == 0) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02d6, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02d8, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0186, code lost:
        if (r4 == 0) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0189, code lost:
        r13.add(g.e.a.b.e.c.s6.y(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0191, code lost:
        if (r1 >= r5) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0193, code lost:
        r4 = g.e.a.b.b.h.e.d0(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0199, code lost:
        if (r2 == r7.a) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x019c, code lost:
        r1 = g.e.a.b.b.h.e.d0(r3, r4, r7);
        r4 = r7.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a2, code lost:
        if (r4 < 0) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a6, code lost:
        if (r4 > (r3.length - r1)) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a8, code lost:
        if (r4 != 0) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01aa, code lost:
        r13.add(g.e.a.b.e.c.s6.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01b4, code lost:
        throw com.google.android.gms.internal.measurement.zzkh.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01b9, code lost:
        throw com.google.android.gms.internal.measurement.zzkh.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01ba, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0249  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int M(java.lang.Object r18, byte[] r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, long r29, g.e.a.b.e.c.k6 r31) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r2 = r22
            r8 = r23
            r6 = r24
            r9 = r25
            r10 = r29
            r7 = r31
            sun.misc.Unsafe r12 = p
            java.lang.Object r13 = r12.getObject(r1, r10)
            g.e.a.b.e.c.u7 r13 = (g.e.a.b.e.c.u7) r13
            boolean r14 = r13.k()
            if (r14 != 0) goto L_0x0035
            int r14 = r13.size()
            if (r14 != 0) goto L_0x002d
            r14 = 10
            goto L_0x002e
        L_0x002d:
            int r14 = r14 + r14
        L_0x002e:
            g.e.a.b.e.c.u7 r13 = r13.o(r14)
            r12.putObject(r1, r10, r13)
        L_0x0035:
            r10 = 5
            r11 = 2
            r14 = 0
            r12 = 1
            switch(r28) {
                case 18: goto L_0x03f9;
                case 19: goto L_0x03ae;
                case 20: goto L_0x0376;
                case 21: goto L_0x0376;
                case 22: goto L_0x035b;
                case 23: goto L_0x031c;
                case 24: goto L_0x02d9;
                case 25: goto L_0x0287;
                case 26: goto L_0x01e0;
                case 27: goto L_0x01c5;
                case 28: goto L_0x0178;
                case 29: goto L_0x035b;
                case 30: goto L_0x00da;
                case 31: goto L_0x02d9;
                case 32: goto L_0x031c;
                case 33: goto L_0x009a;
                case 34: goto L_0x005a;
                case 35: goto L_0x03f9;
                case 36: goto L_0x03ae;
                case 37: goto L_0x0376;
                case 38: goto L_0x0376;
                case 39: goto L_0x035b;
                case 40: goto L_0x031c;
                case 41: goto L_0x02d9;
                case 42: goto L_0x0287;
                case 43: goto L_0x035b;
                case 44: goto L_0x00da;
                case 45: goto L_0x02d9;
                case 46: goto L_0x031c;
                case 47: goto L_0x009a;
                case 48: goto L_0x005a;
                default: goto L_0x003d;
            }
        L_0x003d:
            r1 = 3
            if (r6 != r1) goto L_0x0461
            g.e.a.b.e.c.y8 r1 = r0.m(r9)
            r6 = r2 & -8
            r6 = r6 | 4
            r23 = r1
            r24 = r19
            r25 = r20
            r26 = r21
            r27 = r6
            r28 = r31
            int r4 = g.e.a.b.b.h.e.L(r23, r24, r25, r26, r27, r28)
            goto L_0x043f
        L_0x005a:
            if (r6 != r11) goto L_0x007e
            g.e.a.b.e.c.d8 r13 = (g.e.a.b.e.c.d8) r13
            int r1 = g.e.a.b.b.h.e.d0(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x0065:
            if (r1 >= r2) goto L_0x0075
            int r1 = g.e.a.b.b.h.e.j0(r3, r1, r7)
            long r4 = r7.b
            long r4 = g.e.a.b.e.c.t6.b(r4)
            r13.h(r4)
            goto L_0x0065
        L_0x0075:
            if (r1 != r2) goto L_0x0079
            goto L_0x0462
        L_0x0079:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.d()
            throw r1
        L_0x007e:
            if (r6 != 0) goto L_0x0461
            g.e.a.b.e.c.d8 r13 = (g.e.a.b.e.c.d8) r13
        L_0x0082:
            int r1 = g.e.a.b.b.h.e.j0(r3, r4, r7)
            long r8 = r7.b
            long r8 = g.e.a.b.e.c.t6.b(r8)
            r13.h(r8)
            if (r1 >= r5) goto L_0x0099
            int r4 = g.e.a.b.b.h.e.d0(r3, r1, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x0082
        L_0x0099:
            return r1
        L_0x009a:
            if (r6 != r11) goto L_0x00be
            g.e.a.b.e.c.p7 r13 = (g.e.a.b.e.c.p7) r13
            int r1 = g.e.a.b.b.h.e.d0(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x00a5:
            if (r1 >= r2) goto L_0x00b5
            int r1 = g.e.a.b.b.h.e.d0(r3, r1, r7)
            int r4 = r7.a
            int r4 = g.e.a.b.e.c.t6.a(r4)
            r13.h(r4)
            goto L_0x00a5
        L_0x00b5:
            if (r1 != r2) goto L_0x00b9
            goto L_0x0462
        L_0x00b9:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.d()
            throw r1
        L_0x00be:
            if (r6 != 0) goto L_0x0461
            g.e.a.b.e.c.p7 r13 = (g.e.a.b.e.c.p7) r13
        L_0x00c2:
            int r1 = g.e.a.b.b.h.e.d0(r3, r4, r7)
            int r4 = r7.a
            int r4 = g.e.a.b.e.c.t6.a(r4)
            r13.h(r4)
            if (r1 >= r5) goto L_0x00d9
            int r4 = g.e.a.b.b.h.e.d0(r3, r1, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x00c2
        L_0x00d9:
            return r1
        L_0x00da:
            if (r6 != r11) goto L_0x00e1
            int r2 = g.e.a.b.b.h.e.V(r3, r4, r13, r7)
            goto L_0x00f2
        L_0x00e1:
            if (r6 != 0) goto L_0x0461
            r2 = r22
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r13
            r7 = r31
            int r2 = g.e.a.b.b.h.e.h0(r2, r3, r4, r5, r6, r7)
        L_0x00f2:
            g.e.a.b.e.c.o7 r1 = (g.e.a.b.e.c.o7) r1
            g.e.a.b.e.c.m9 r3 = r1.zzc
            g.e.a.b.e.c.m9 r4 = g.e.a.b.e.c.m9.f3001f
            if (r3 != r4) goto L_0x00fb
            r3 = 0
        L_0x00fb:
            g.e.a.b.e.c.r7 r4 = r0.l(r9)
            g.e.a.b.e.c.l9 r5 = r0.f3031l
            java.lang.Class r6 = g.e.a.b.e.c.a9.a
            if (r4 != 0) goto L_0x0106
            goto L_0x016e
        L_0x0106:
            boolean r6 = r13 instanceof java.util.RandomAccess
            if (r6 == 0) goto L_0x0146
            int r6 = r13.size()
            r7 = 0
            r12 = 0
        L_0x0110:
            if (r12 >= r6) goto L_0x013b
            java.lang.Object r9 = r13.get(r12)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            boolean r10 = r4.a(r9)
            if (r10 == 0) goto L_0x012e
            if (r12 == r7) goto L_0x012b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r13.set(r7, r9)
        L_0x012b:
            int r7 = r7 + 1
            goto L_0x0138
        L_0x012e:
            if (r3 != 0) goto L_0x0134
            java.lang.Object r3 = r5.e()
        L_0x0134:
            long r9 = (long) r9
            r5.f(r3, r8, r9)
        L_0x0138:
            int r12 = r12 + 1
            goto L_0x0110
        L_0x013b:
            if (r7 != r6) goto L_0x013e
            goto L_0x016e
        L_0x013e:
            java.util.List r4 = r13.subList(r7, r6)
            r4.clear()
            goto L_0x016e
        L_0x0146:
            java.util.Iterator r6 = r13.iterator()
        L_0x014a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x016e
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            boolean r9 = r4.a(r7)
            if (r9 != 0) goto L_0x014a
            if (r3 != 0) goto L_0x0166
            java.lang.Object r3 = r5.e()
        L_0x0166:
            long r9 = (long) r7
            r5.f(r3, r8, r9)
            r6.remove()
            goto L_0x014a
        L_0x016e:
            if (r3 != 0) goto L_0x0173
            r1 = r2
            goto L_0x0462
        L_0x0173:
            g.e.a.b.e.c.m9 r3 = (g.e.a.b.e.c.m9) r3
            r1.zzc = r3
            return r2
        L_0x0178:
            if (r6 != r11) goto L_0x0461
            int r1 = g.e.a.b.b.h.e.d0(r3, r4, r7)
            int r4 = r7.a
            if (r4 < 0) goto L_0x01c0
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x01bb
            if (r4 != 0) goto L_0x0189
            goto L_0x01aa
        L_0x0189:
            g.e.a.b.e.c.s6 r6 = g.e.a.b.e.c.s6.y(r3, r1, r4)
            r13.add(r6)
            int r1 = r1 + r4
        L_0x0191:
            if (r1 >= r5) goto L_0x01ba
            int r4 = g.e.a.b.b.h.e.d0(r3, r1, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x019c
            goto L_0x01ba
        L_0x019c:
            int r1 = g.e.a.b.b.h.e.d0(r3, r4, r7)
            int r4 = r7.a
            if (r4 < 0) goto L_0x01b5
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x01b0
            if (r4 != 0) goto L_0x0189
        L_0x01aa:
            g.e.a.b.e.c.s6 r4 = g.e.a.b.e.c.s6.b
            r13.add(r4)
            goto L_0x0191
        L_0x01b0:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.d()
            throw r1
        L_0x01b5:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.b()
            throw r1
        L_0x01ba:
            return r1
        L_0x01bb:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.d()
            throw r1
        L_0x01c0:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.b()
            throw r1
        L_0x01c5:
            if (r6 == r11) goto L_0x01c9
            goto L_0x0461
        L_0x01c9:
            g.e.a.b.e.c.y8 r1 = r0.m(r9)
            r23 = r1
            r24 = r22
            r25 = r19
            r26 = r20
            r27 = r21
            r28 = r13
            r29 = r31
            int r1 = g.e.a.b.b.h.e.S(r23, r24, r25, r26, r27, r28, r29)
            return r1
        L_0x01e0:
            if (r6 != r11) goto L_0x0461
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r26 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            int r4 = g.e.a.b.b.h.e.d0(r3, r4, r7)
            if (r6 != 0) goto L_0x022d
            int r6 = r7.a
            if (r6 < 0) goto L_0x0228
            if (r6 != 0) goto L_0x01f8
            goto L_0x0217
        L_0x01f8:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = g.e.a.b.e.c.v7.a
            r8.<init>(r3, r4, r6, r9)
        L_0x01ff:
            r13.add(r8)
            int r4 = r4 + r6
        L_0x0203:
            if (r4 >= r5) goto L_0x0461
            int r6 = g.e.a.b.b.h.e.d0(r3, r4, r7)
            int r8 = r7.a
            if (r2 != r8) goto L_0x0461
            int r4 = g.e.a.b.b.h.e.d0(r3, r6, r7)
            int r6 = r7.a
            if (r6 < 0) goto L_0x0223
            if (r6 != 0) goto L_0x021b
        L_0x0217:
            r13.add(r1)
            goto L_0x0203
        L_0x021b:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = g.e.a.b.e.c.v7.a
            r8.<init>(r3, r4, r6, r9)
            goto L_0x01ff
        L_0x0223:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.b()
            throw r1
        L_0x0228:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.b()
            throw r1
        L_0x022d:
            int r6 = r7.a
            if (r6 < 0) goto L_0x0282
            if (r6 != 0) goto L_0x0235
        L_0x0233:
            r8 = r4
            goto L_0x025c
        L_0x0235:
            int r8 = r4 + r6
            boolean r9 = g.e.a.b.e.c.y9.d(r3, r4, r8)
            if (r9 == 0) goto L_0x027d
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = g.e.a.b.e.c.v7.a
            r9.<init>(r3, r4, r6, r10)
        L_0x0244:
            r13.add(r9)
        L_0x0247:
            if (r8 >= r5) goto L_0x027a
            int r4 = g.e.a.b.b.h.e.d0(r3, r8, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x027a
            int r4 = g.e.a.b.b.h.e.d0(r3, r4, r7)
            int r6 = r7.a
            if (r6 < 0) goto L_0x0275
            if (r6 != 0) goto L_0x0260
            goto L_0x0233
        L_0x025c:
            r13.add(r1)
            goto L_0x0247
        L_0x0260:
            int r8 = r4 + r6
            boolean r9 = g.e.a.b.e.c.y9.d(r3, r4, r8)
            if (r9 == 0) goto L_0x0270
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = g.e.a.b.e.c.v7.a
            r9.<init>(r3, r4, r6, r10)
            goto L_0x0244
        L_0x0270:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.a()
            throw r1
        L_0x0275:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.b()
            throw r1
        L_0x027a:
            r4 = r8
            goto L_0x0461
        L_0x027d:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.a()
            throw r1
        L_0x0282:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.b()
            throw r1
        L_0x0287:
            if (r6 != r11) goto L_0x02ae
            g.e.a.b.e.c.l6 r13 = (g.e.a.b.e.c.l6) r13
            int r1 = g.e.a.b.b.h.e.d0(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x0292:
            if (r1 >= r2) goto L_0x02a5
            int r1 = g.e.a.b.b.h.e.j0(r3, r1, r7)
            long r4 = r7.b
            int r6 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02a0
            r4 = 1
            goto L_0x02a1
        L_0x02a0:
            r4 = 0
        L_0x02a1:
            r13.e(r4)
            goto L_0x0292
        L_0x02a5:
            if (r1 != r2) goto L_0x02a9
            goto L_0x0462
        L_0x02a9:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.d()
            throw r1
        L_0x02ae:
            if (r6 != 0) goto L_0x0461
            g.e.a.b.e.c.l6 r13 = (g.e.a.b.e.c.l6) r13
            int r1 = g.e.a.b.b.h.e.j0(r3, r4, r7)
            long r8 = r7.b
            int r4 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x02bd
            goto L_0x02d6
        L_0x02bd:
            r4 = 0
        L_0x02be:
            r13.e(r4)
            if (r1 >= r5) goto L_0x02d8
            int r4 = g.e.a.b.b.h.e.d0(r3, r1, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x02cc
            goto L_0x02d8
        L_0x02cc:
            int r1 = g.e.a.b.b.h.e.j0(r3, r4, r7)
            long r8 = r7.b
            int r4 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x02bd
        L_0x02d6:
            r4 = 1
            goto L_0x02be
        L_0x02d8:
            return r1
        L_0x02d9:
            if (r6 != r11) goto L_0x02f9
            g.e.a.b.e.c.p7 r13 = (g.e.a.b.e.c.p7) r13
            int r1 = g.e.a.b.b.h.e.d0(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x02e4:
            if (r1 >= r2) goto L_0x02f0
            int r4 = g.e.a.b.b.h.e.D(r3, r1)
            r13.h(r4)
            int r1 = r1 + 4
            goto L_0x02e4
        L_0x02f0:
            if (r1 != r2) goto L_0x02f4
            goto L_0x0462
        L_0x02f4:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.d()
            throw r1
        L_0x02f9:
            if (r6 != r10) goto L_0x0461
            g.e.a.b.e.c.p7 r13 = (g.e.a.b.e.c.p7) r13
            int r1 = g.e.a.b.b.h.e.D(r19, r20)
        L_0x0301:
            r13.h(r1)
            int r4 = r4 + 4
            if (r4 >= r5) goto L_0x031b
            int r1 = g.e.a.b.b.h.e.d0(r3, r4, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x0311
            goto L_0x031b
        L_0x0311:
            int r4 = g.e.a.b.b.h.e.D(r3, r1)
            r16 = r4
            r4 = r1
            r1 = r16
            goto L_0x0301
        L_0x031b:
            return r4
        L_0x031c:
            if (r6 != r11) goto L_0x033c
            g.e.a.b.e.c.d8 r13 = (g.e.a.b.e.c.d8) r13
            int r1 = g.e.a.b.b.h.e.d0(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x0327:
            if (r1 >= r2) goto L_0x0333
            long r4 = g.e.a.b.b.h.e.k0(r3, r1)
            r13.h(r4)
            int r1 = r1 + 8
            goto L_0x0327
        L_0x0333:
            if (r1 != r2) goto L_0x0337
            goto L_0x0462
        L_0x0337:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.d()
            throw r1
        L_0x033c:
            if (r6 != r12) goto L_0x0461
            g.e.a.b.e.c.d8 r13 = (g.e.a.b.e.c.d8) r13
            long r8 = g.e.a.b.b.h.e.k0(r19, r20)
        L_0x0344:
            r13.h(r8)
            int r4 = r4 + 8
            if (r4 >= r5) goto L_0x035a
            int r1 = g.e.a.b.b.h.e.d0(r3, r4, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x0354
            goto L_0x035a
        L_0x0354:
            long r8 = g.e.a.b.b.h.e.k0(r3, r1)
            r4 = r1
            goto L_0x0344
        L_0x035a:
            return r4
        L_0x035b:
            if (r6 != r11) goto L_0x0363
            int r1 = g.e.a.b.b.h.e.V(r3, r4, r13, r7)
            goto L_0x0462
        L_0x0363:
            if (r6 == 0) goto L_0x0367
            goto L_0x0461
        L_0x0367:
            r23 = r19
            r24 = r20
            r25 = r21
            r26 = r13
            r27 = r31
            int r1 = g.e.a.b.b.h.e.h0(r22, r23, r24, r25, r26, r27)
            return r1
        L_0x0376:
            if (r6 != r11) goto L_0x0396
            g.e.a.b.e.c.d8 r13 = (g.e.a.b.e.c.d8) r13
            int r1 = g.e.a.b.b.h.e.d0(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x0381:
            if (r1 >= r2) goto L_0x038d
            int r1 = g.e.a.b.b.h.e.j0(r3, r1, r7)
            long r4 = r7.b
            r13.h(r4)
            goto L_0x0381
        L_0x038d:
            if (r1 != r2) goto L_0x0391
            goto L_0x0462
        L_0x0391:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.d()
            throw r1
        L_0x0396:
            if (r6 != 0) goto L_0x0461
            g.e.a.b.e.c.d8 r13 = (g.e.a.b.e.c.d8) r13
        L_0x039a:
            int r1 = g.e.a.b.b.h.e.j0(r3, r4, r7)
            long r8 = r7.b
            r13.h(r8)
            if (r1 >= r5) goto L_0x03ad
            int r4 = g.e.a.b.b.h.e.d0(r3, r1, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x039a
        L_0x03ad:
            return r1
        L_0x03ae:
            if (r6 != r11) goto L_0x03d2
            g.e.a.b.e.c.i7 r13 = (g.e.a.b.e.c.i7) r13
            int r1 = g.e.a.b.b.h.e.d0(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x03b9:
            if (r1 >= r2) goto L_0x03c9
            int r4 = g.e.a.b.b.h.e.D(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r13.e(r4)
            int r1 = r1 + 4
            goto L_0x03b9
        L_0x03c9:
            if (r1 != r2) goto L_0x03cd
            goto L_0x0462
        L_0x03cd:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.d()
            throw r1
        L_0x03d2:
            if (r6 != r10) goto L_0x0461
            g.e.a.b.e.c.i7 r13 = (g.e.a.b.e.c.i7) r13
            int r1 = g.e.a.b.b.h.e.D(r19, r20)
        L_0x03da:
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r13.e(r1)
            int r4 = r4 + 4
            if (r4 >= r5) goto L_0x03f8
            int r1 = g.e.a.b.b.h.e.d0(r3, r4, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x03ee
            goto L_0x03f8
        L_0x03ee:
            int r4 = g.e.a.b.b.h.e.D(r3, r1)
            r16 = r4
            r4 = r1
            r1 = r16
            goto L_0x03da
        L_0x03f8:
            return r4
        L_0x03f9:
            if (r6 != r11) goto L_0x041c
            g.e.a.b.e.c.z6 r13 = (g.e.a.b.e.c.z6) r13
            int r1 = g.e.a.b.b.h.e.d0(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x0404:
            if (r1 >= r2) goto L_0x0414
            long r4 = g.e.a.b.b.h.e.k0(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r13.e(r4)
            int r1 = r1 + 8
            goto L_0x0404
        L_0x0414:
            if (r1 != r2) goto L_0x0417
            goto L_0x0462
        L_0x0417:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.d()
            throw r1
        L_0x041c:
            if (r6 != r12) goto L_0x0461
            g.e.a.b.e.c.z6 r13 = (g.e.a.b.e.c.z6) r13
            long r8 = g.e.a.b.b.h.e.k0(r19, r20)
        L_0x0424:
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r13.e(r8)
            int r4 = r4 + 8
            if (r4 >= r5) goto L_0x043e
            int r1 = g.e.a.b.b.h.e.d0(r3, r4, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x0438
            goto L_0x043e
        L_0x0438:
            long r8 = g.e.a.b.b.h.e.k0(r3, r1)
            r4 = r1
            goto L_0x0424
        L_0x043e:
            return r4
        L_0x043f:
            java.lang.Object r8 = r7.c
            r13.add(r8)
            if (r4 >= r5) goto L_0x0460
            int r8 = g.e.a.b.b.h.e.d0(r3, r4, r7)
            int r9 = r7.a
            if (r2 == r9) goto L_0x044f
            goto L_0x0460
        L_0x044f:
            r23 = r1
            r24 = r19
            r25 = r8
            r26 = r21
            r27 = r6
            r28 = r31
            int r4 = g.e.a.b.b.h.e.L(r23, r24, r25, r26, r27, r28)
            goto L_0x043f
        L_0x0460:
            return r4
        L_0x0461:
            r1 = r4
        L_0x0462:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.q8.M(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, g.e.a.b.e.c.k6):int");
    }

    public final int N(int i2) {
        return this.a[i2 + 2];
    }

    public final int O(int i2, int i3) {
        int length = (this.a.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.a[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    public final void a(Object obj) {
        int i2;
        int i3 = this.f3028i;
        while (true) {
            i2 = this.f3029j;
            if (i3 >= i2) {
                break;
            }
            long j2 = (long) (j(this.f3027h[i3]) & 1048575);
            Object j3 = v9.j(obj, j2);
            if (j3 != null) {
                ((i8) j3).a();
                v9.f3057d.p(obj, j2, j3);
            }
            i3++;
        }
        int length = this.f3027h.length;
        while (i2 < length) {
            this.f3030k.a(obj, (long) this.f3027h[i2]);
            i2++;
        }
        this.f3031l.g(obj);
        if (this.f3025f) {
            this.f3032m.b(obj);
        }
    }

    public final Object b() {
        return ((o7) this.f3024e).r(4, (Object) null, (Object) null);
    }

    public final boolean c(Object obj) {
        int i2;
        int i3;
        Object obj2 = obj;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.f3028i) {
            int i7 = this.f3027h[i6];
            int i8 = this.a[i7];
            int j2 = j(i7);
            int i9 = this.a[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = p.getInt(obj2, (long) i10);
                }
                i2 = i5;
                i3 = i10;
            } else {
                i3 = i4;
                i2 = i5;
            }
            if ((268435456 & j2) != 0 && !v(obj, i7, i3, i2, i11)) {
                return false;
            }
            int i12 = (j2 >>> 20) & 255;
            if (i12 != 9 && i12 != 17) {
                if (i12 != 27) {
                    if (i12 == 60 || i12 == 68) {
                        if (w(obj2, i8, i7) && !m(i7).c(v9.j(obj2, (long) (j2 & 1048575)))) {
                            return false;
                        }
                    } else if (i12 != 49) {
                        if (i12 == 50 && !((i8) v9.j(obj2, (long) (j2 & 1048575))).isEmpty()) {
                            h8 h8Var = (h8) n(i7);
                            throw null;
                        }
                    }
                }
                List list = (List) v9.j(obj2, (long) (j2 & 1048575));
                if (!list.isEmpty()) {
                    y8 m2 = m(i7);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!m2.c(list.get(i13))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (v(obj, i7, i3, i2, i11) && !m(i7).c(v9.j(obj2, (long) (j2 & 1048575)))) {
                return false;
            }
            i6++;
            i4 = i3;
            i5 = i2;
        }
        if (!this.f3025f) {
            return true;
        }
        this.f3032m.a(obj2);
        throw null;
    }

    public final void d(Object obj, byte[] bArr, int i2, int i3, k6 k6Var) throws IOException {
        if (this.f3026g) {
            L(obj, bArr, i2, i3, k6Var);
        } else {
            A(obj, bArr, i2, i3, 0, k6Var);
        }
    }

    public final int e(Object obj) {
        return this.f3026g ? H(obj) : G(obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        g.e.a.b.e.c.v9.f3057d.p(r7, r2, g.e.a.b.e.c.v9.j(r8, r2));
        s(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        g.e.a.b.e.c.v9.f3057d.p(r7, r2, g.e.a.b.e.c.v9.j(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c7, code lost:
        g.e.a.b.e.c.v9.f3057d.n(r7, r2, g.e.a.b.e.c.v9.g(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00de, code lost:
        g.e.a.b.e.c.v9.n(r7, r2, g.e.a.b.e.c.v9.h(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0103, code lost:
        r(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0106, code lost:
        r0 = r0 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            java.util.Objects.requireNonNull(r8)
            r0 = 0
        L_0x0004:
            int[] r1 = r6.a
            int r1 = r1.length
            if (r0 >= r1) goto L_0x010a
            int r1 = r6.j(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.a
            r4 = r4[r0]
            int r1 = r1 >>> 20
            r1 = r1 & 255(0xff, float:3.57E-43)
            switch(r1) {
                case 0: goto L_0x00f6;
                case 1: goto L_0x00e6;
                case 2: goto L_0x00d8;
                case 3: goto L_0x00d1;
                case 4: goto L_0x00c1;
                case 5: goto L_0x00ba;
                case 6: goto L_0x00b3;
                case 7: goto L_0x00a3;
                case 8: goto L_0x0093;
                case 9: goto L_0x008e;
                case 10: goto L_0x0087;
                case 11: goto L_0x0080;
                case 12: goto L_0x0079;
                case 13: goto L_0x0072;
                case 14: goto L_0x006a;
                case 15: goto L_0x0063;
                case 16: goto L_0x005b;
                case 17: goto L_0x008e;
                case 18: goto L_0x0054;
                case 19: goto L_0x0054;
                case 20: goto L_0x0054;
                case 21: goto L_0x0054;
                case 22: goto L_0x0054;
                case 23: goto L_0x0054;
                case 24: goto L_0x0054;
                case 25: goto L_0x0054;
                case 26: goto L_0x0054;
                case 27: goto L_0x0054;
                case 28: goto L_0x0054;
                case 29: goto L_0x0054;
                case 30: goto L_0x0054;
                case 31: goto L_0x0054;
                case 32: goto L_0x0054;
                case 33: goto L_0x0054;
                case 34: goto L_0x0054;
                case 35: goto L_0x0054;
                case 36: goto L_0x0054;
                case 37: goto L_0x0054;
                case 38: goto L_0x0054;
                case 39: goto L_0x0054;
                case 40: goto L_0x0054;
                case 41: goto L_0x0054;
                case 42: goto L_0x0054;
                case 43: goto L_0x0054;
                case 44: goto L_0x0054;
                case 45: goto L_0x0054;
                case 46: goto L_0x0054;
                case 47: goto L_0x0054;
                case 48: goto L_0x0054;
                case 49: goto L_0x0054;
                case 50: goto L_0x003f;
                case 51: goto L_0x002b;
                case 52: goto L_0x002b;
                case 53: goto L_0x002b;
                case 54: goto L_0x002b;
                case 55: goto L_0x002b;
                case 56: goto L_0x002b;
                case 57: goto L_0x002b;
                case 58: goto L_0x002b;
                case 59: goto L_0x002b;
                case 60: goto L_0x0026;
                case 61: goto L_0x001f;
                case 62: goto L_0x001f;
                case 63: goto L_0x001f;
                case 64: goto L_0x001f;
                case 65: goto L_0x001f;
                case 66: goto L_0x001f;
                case 67: goto L_0x001f;
                case 68: goto L_0x0026;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0106
        L_0x001f:
            boolean r1 = r6.w(r8, r4, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x0031
        L_0x0026:
            r6.q(r7, r8, r0)
            goto L_0x0106
        L_0x002b:
            boolean r1 = r6.w(r8, r4, r0)
            if (r1 == 0) goto L_0x0106
        L_0x0031:
            java.lang.Object r1 = g.e.a.b.e.c.v9.j(r8, r2)
            g.e.a.b.e.c.u9 r5 = g.e.a.b.e.c.v9.f3057d
            r5.p(r7, r2, r1)
            r6.s(r7, r4, r0)
            goto L_0x0106
        L_0x003f:
            java.lang.Class r1 = g.e.a.b.e.c.a9.a
            java.lang.Object r1 = g.e.a.b.e.c.v9.j(r7, r2)
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r8, r2)
            java.lang.Object r1 = g.e.a.b.e.c.j8.b(r1, r4)
            g.e.a.b.e.c.u9 r4 = g.e.a.b.e.c.v9.f3057d
            r4.p(r7, r2, r1)
            goto L_0x0106
        L_0x0054:
            g.e.a.b.e.c.c8 r1 = r6.f3030k
            r1.b(r7, r8, r2)
            goto L_0x0106
        L_0x005b:
            boolean r1 = r6.u(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00de
        L_0x0063:
            boolean r1 = r6.u(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x006a:
            boolean r1 = r6.u(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00de
        L_0x0072:
            boolean r1 = r6.u(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x0079:
            boolean r1 = r6.u(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x0080:
            boolean r1 = r6.u(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x0087:
            boolean r1 = r6.u(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x0099
        L_0x008e:
            r6.p(r7, r8, r0)
            goto L_0x0106
        L_0x0093:
            boolean r1 = r6.u(r8, r0)
            if (r1 == 0) goto L_0x0106
        L_0x0099:
            java.lang.Object r1 = g.e.a.b.e.c.v9.j(r8, r2)
            g.e.a.b.e.c.u9 r4 = g.e.a.b.e.c.v9.f3057d
            r4.p(r7, r2, r1)
            goto L_0x0103
        L_0x00a3:
            boolean r1 = r6.u(r8, r0)
            if (r1 == 0) goto L_0x0106
            boolean r1 = g.e.a.b.e.c.v9.r(r8, r2)
            g.e.a.b.e.c.u9 r4 = g.e.a.b.e.c.v9.f3057d
            r4.c(r7, r2, r1)
            goto L_0x0103
        L_0x00b3:
            boolean r1 = r6.u(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x00ba:
            boolean r1 = r6.u(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00de
        L_0x00c1:
            boolean r1 = r6.u(r8, r0)
            if (r1 == 0) goto L_0x0106
        L_0x00c7:
            int r1 = g.e.a.b.e.c.v9.g(r8, r2)
            g.e.a.b.e.c.u9 r4 = g.e.a.b.e.c.v9.f3057d
            r4.n(r7, r2, r1)
            goto L_0x0103
        L_0x00d1:
            boolean r1 = r6.u(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00de
        L_0x00d8:
            boolean r1 = r6.u(r8, r0)
            if (r1 == 0) goto L_0x0106
        L_0x00de:
            long r4 = g.e.a.b.e.c.v9.h(r8, r2)
            g.e.a.b.e.c.v9.n(r7, r2, r4)
            goto L_0x0103
        L_0x00e6:
            boolean r1 = r6.u(r8, r0)
            if (r1 == 0) goto L_0x0106
            float r1 = g.e.a.b.e.c.v9.f(r8, r2)
            g.e.a.b.e.c.u9 r4 = g.e.a.b.e.c.v9.f3057d
            r4.f(r7, r2, r1)
            goto L_0x0103
        L_0x00f6:
            boolean r1 = r6.u(r8, r0)
            if (r1 == 0) goto L_0x0106
            double r4 = g.e.a.b.e.c.v9.e(r8, r2)
            g.e.a.b.e.c.v9.m(r7, r2, r4)
        L_0x0103:
            r6.r(r7, r0)
        L_0x0106:
            int r0 = r0 + 3
            goto L_0x0004
        L_0x010a:
            g.e.a.b.e.c.l9 r0 = r6.f3031l
            java.lang.Class r1 = g.e.a.b.e.c.a9.a
            java.lang.Object r1 = r0.c(r7)
            java.lang.Object r2 = r0.c(r8)
            java.lang.Object r1 = r0.d(r1, r2)
            r0.h(r7, r1)
            boolean r7 = r6.f3025f
            if (r7 != 0) goto L_0x0122
            return
        L_0x0122:
            g.e.a.b.e.c.c7 r7 = r6.f3032m
            r7.a(r8)
            r7 = 0
            goto L_0x012a
        L_0x0129:
            throw r7
        L_0x012a:
            goto L_0x0129
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.q8.f(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b6, code lost:
        r2 = r2 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            int[] r0 = r8.a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r2 >= r0) goto L_0x01ba
            int r3 = r8.j(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r3 & r4
            long r5 = (long) r5
            int r3 = r3 >>> 20
            r3 = r3 & 255(0xff, float:3.57E-43)
            switch(r3) {
                case 0: goto L_0x019a;
                case 1: goto L_0x0181;
                case 2: goto L_0x016e;
                case 3: goto L_0x015b;
                case 4: goto L_0x014a;
                case 5: goto L_0x0136;
                case 6: goto L_0x0124;
                case 7: goto L_0x0112;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00be;
                case 12: goto L_0x00ac;
                case 13: goto L_0x009a;
                case 14: goto L_0x0086;
                case 15: goto L_0x0074;
                case 16: goto L_0x0060;
                case 17: goto L_0x004a;
                case 18: goto L_0x003a;
                case 19: goto L_0x003a;
                case 20: goto L_0x003a;
                case 21: goto L_0x003a;
                case 22: goto L_0x003a;
                case 23: goto L_0x003a;
                case 24: goto L_0x003a;
                case 25: goto L_0x003a;
                case 26: goto L_0x003a;
                case 27: goto L_0x003a;
                case 28: goto L_0x003a;
                case 29: goto L_0x003a;
                case 30: goto L_0x003a;
                case 31: goto L_0x003a;
                case 32: goto L_0x003a;
                case 33: goto L_0x003a;
                case 34: goto L_0x003a;
                case 35: goto L_0x003a;
                case 36: goto L_0x003a;
                case 37: goto L_0x003a;
                case 38: goto L_0x003a;
                case 39: goto L_0x003a;
                case 40: goto L_0x003a;
                case 41: goto L_0x003a;
                case 42: goto L_0x003a;
                case 43: goto L_0x003a;
                case 44: goto L_0x003a;
                case 45: goto L_0x003a;
                case 46: goto L_0x003a;
                case 47: goto L_0x003a;
                case 48: goto L_0x003a;
                case 49: goto L_0x003a;
                case 50: goto L_0x003a;
                case 51: goto L_0x001a;
                case 52: goto L_0x001a;
                case 53: goto L_0x001a;
                case 54: goto L_0x001a;
                case 55: goto L_0x001a;
                case 56: goto L_0x001a;
                case 57: goto L_0x001a;
                case 58: goto L_0x001a;
                case 59: goto L_0x001a;
                case 60: goto L_0x001a;
                case 61: goto L_0x001a;
                case 62: goto L_0x001a;
                case 63: goto L_0x001a;
                case 64: goto L_0x001a;
                case 65: goto L_0x001a;
                case 66: goto L_0x001a;
                case 67: goto L_0x001a;
                case 68: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x01b6
        L_0x001a:
            int r3 = r8.N(r2)
            r3 = r3 & r4
            long r3 = (long) r3
            int r7 = g.e.a.b.e.c.v9.g(r9, r3)
            int r3 = g.e.a.b.e.c.v9.g(r10, r3)
            if (r7 != r3) goto L_0x01b5
            java.lang.Object r3 = g.e.a.b.e.c.v9.j(r9, r5)
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r10, r5)
            boolean r3 = g.e.a.b.e.c.a9.a(r3, r4)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x003a:
            java.lang.Object r3 = g.e.a.b.e.c.v9.j(r9, r5)
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r10, r5)
            boolean r3 = g.e.a.b.e.c.a9.a(r3, r4)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x004a:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = g.e.a.b.e.c.v9.j(r9, r5)
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r10, r5)
            boolean r3 = g.e.a.b.e.c.a9.a(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0060:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = g.e.a.b.e.c.v9.h(r9, r5)
            long r5 = g.e.a.b.e.c.v9.h(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0074:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = g.e.a.b.e.c.v9.g(r9, r5)
            int r4 = g.e.a.b.e.c.v9.g(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0086:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = g.e.a.b.e.c.v9.h(r9, r5)
            long r5 = g.e.a.b.e.c.v9.h(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x009a:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = g.e.a.b.e.c.v9.g(r9, r5)
            int r4 = g.e.a.b.e.c.v9.g(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00ac:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = g.e.a.b.e.c.v9.g(r9, r5)
            int r4 = g.e.a.b.e.c.v9.g(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00be:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = g.e.a.b.e.c.v9.g(r9, r5)
            int r4 = g.e.a.b.e.c.v9.g(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00d0:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = g.e.a.b.e.c.v9.j(r9, r5)
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r10, r5)
            boolean r3 = g.e.a.b.e.c.a9.a(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00e6:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = g.e.a.b.e.c.v9.j(r9, r5)
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r10, r5)
            boolean r3 = g.e.a.b.e.c.a9.a(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00fc:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = g.e.a.b.e.c.v9.j(r9, r5)
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r10, r5)
            boolean r3 = g.e.a.b.e.c.a9.a(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0112:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            boolean r3 = g.e.a.b.e.c.v9.r(r9, r5)
            boolean r4 = g.e.a.b.e.c.v9.r(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0124:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = g.e.a.b.e.c.v9.g(r9, r5)
            int r4 = g.e.a.b.e.c.v9.g(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0136:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = g.e.a.b.e.c.v9.h(r9, r5)
            long r5 = g.e.a.b.e.c.v9.h(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x014a:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = g.e.a.b.e.c.v9.g(r9, r5)
            int r4 = g.e.a.b.e.c.v9.g(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x015b:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = g.e.a.b.e.c.v9.h(r9, r5)
            long r5 = g.e.a.b.e.c.v9.h(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x016e:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = g.e.a.b.e.c.v9.h(r9, r5)
            long r5 = g.e.a.b.e.c.v9.h(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0181:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            float r3 = g.e.a.b.e.c.v9.f(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            float r4 = g.e.a.b.e.c.v9.f(r10, r5)
            int r4 = java.lang.Float.floatToIntBits(r4)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x019a:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            double r3 = g.e.a.b.e.c.v9.e(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = g.e.a.b.e.c.v9.e(r10, r5)
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x01b5:
            return r1
        L_0x01b6:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01ba:
            g.e.a.b.e.c.l9 r0 = r8.f3031l
            java.lang.Object r0 = r0.c(r9)
            g.e.a.b.e.c.l9 r2 = r8.f3031l
            java.lang.Object r2 = r2.c(r10)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01cd
            return r1
        L_0x01cd:
            boolean r0 = r8.f3025f
            if (r0 != 0) goto L_0x01d3
            r9 = 1
            return r9
        L_0x01d3:
            g.e.a.b.e.c.c7 r0 = r8.f3032m
            r0.a(r9)
            g.e.a.b.e.c.c7 r9 = r8.f3032m
            r9.a(r10)
            r9 = 0
            goto L_0x01e0
        L_0x01df:
            throw r9
        L_0x01e0:
            goto L_0x01df
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.q8.g(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02e3, code lost:
        r12.b(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02f4, code lost:
        r12.a(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0305, code lost:
        r12.a.h(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0318, code lost:
        r12.a.f(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x032b, code lost:
        r12.a.j(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x033e, code lost:
        r12.a.n(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x034b, code lost:
        r12.a.e(r5, (g.e.a.b.e.c.s6) g.e.a.b.e.c.v9.j(r11, (long) (r4 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0360, code lost:
        r12.f(r5, g.e.a.b.e.c.v9.j(r11, (long) (r4 & 1048575)), m(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0375, code lost:
        z(r5, g.e.a.b.e.c.v9.j(r11, (long) (r4 & 1048575)), r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x038c, code lost:
        r12.a.d(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x039f, code lost:
        r12.a.f(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03b1, code lost:
        r12.a.h(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03c3, code lost:
        r12.a.j(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03d5, code lost:
        r12.a.p(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03e7, code lost:
        r12.a.p(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03f9, code lost:
        r12.d(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0409, code lost:
        r12.c(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02c8, code lost:
        r12.e(r5, g.e.a.b.e.c.v9.j(r11, (long) (r4 & 1048575)), m(r3));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(java.lang.Object r11, g.e.a.b.e.c.y6 r12) throws java.io.IOException {
        /*
            r10 = this;
            boolean r0 = r10.f3026g
            if (r0 == 0) goto L_0x0420
            boolean r0 = r10.f3025f
            r1 = 0
            if (r0 != 0) goto L_0x041a
            int[] r0 = r10.a
            int r0 = r0.length
            r2 = 0
            r3 = 0
        L_0x000e:
            if (r3 >= r0) goto L_0x0410
            int r4 = r10.j(r3)
            int[] r5 = r10.a
            r5 = r5[r3]
            int r6 = r4 >>> 20
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = 1
            r8 = 1048575(0xfffff, float:1.469367E-39)
            switch(r6) {
                case 0: goto L_0x03fd;
                case 1: goto L_0x03ed;
                case 2: goto L_0x03db;
                case 3: goto L_0x03c9;
                case 4: goto L_0x03b7;
                case 5: goto L_0x03a5;
                case 6: goto L_0x0393;
                case 7: goto L_0x0380;
                case 8: goto L_0x036f;
                case 9: goto L_0x035a;
                case 10: goto L_0x0345;
                case 11: goto L_0x0332;
                case 12: goto L_0x031f;
                case 13: goto L_0x030c;
                case 14: goto L_0x02f9;
                case 15: goto L_0x02e8;
                case 16: goto L_0x02d7;
                case 17: goto L_0x02c2;
                case 18: goto L_0x02b5;
                case 19: goto L_0x02a8;
                case 20: goto L_0x029b;
                case 21: goto L_0x028e;
                case 22: goto L_0x0281;
                case 23: goto L_0x0274;
                case 24: goto L_0x0267;
                case 25: goto L_0x025a;
                case 26: goto L_0x024d;
                case 27: goto L_0x023c;
                case 28: goto L_0x022f;
                case 29: goto L_0x0222;
                case 30: goto L_0x0215;
                case 31: goto L_0x0208;
                case 32: goto L_0x01fb;
                case 33: goto L_0x01ee;
                case 34: goto L_0x01e1;
                case 35: goto L_0x01d4;
                case 36: goto L_0x01c7;
                case 37: goto L_0x01ba;
                case 38: goto L_0x01ad;
                case 39: goto L_0x01a0;
                case 40: goto L_0x0193;
                case 41: goto L_0x0186;
                case 42: goto L_0x0179;
                case 43: goto L_0x016c;
                case 44: goto L_0x015f;
                case 45: goto L_0x0152;
                case 46: goto L_0x0145;
                case 47: goto L_0x0138;
                case 48: goto L_0x012b;
                case 49: goto L_0x011a;
                case 50: goto L_0x0109;
                case 51: goto L_0x00fb;
                case 52: goto L_0x00ed;
                case 53: goto L_0x00df;
                case 54: goto L_0x00d1;
                case 55: goto L_0x00c3;
                case 56: goto L_0x00b5;
                case 57: goto L_0x00a7;
                case 58: goto L_0x0099;
                case 59: goto L_0x0091;
                case 60: goto L_0x0089;
                case 61: goto L_0x0081;
                case 62: goto L_0x0073;
                case 63: goto L_0x0065;
                case 64: goto L_0x0057;
                case 65: goto L_0x0049;
                case 66: goto L_0x003b;
                case 67: goto L_0x002d;
                case 68: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x040c
        L_0x0025:
            boolean r6 = r10.w(r11, r5, r3)
            if (r6 == 0) goto L_0x040c
            goto L_0x02c8
        L_0x002d:
            boolean r6 = r10.w(r11, r5, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            long r6 = k(r11, r6)
            goto L_0x02e3
        L_0x003b:
            boolean r6 = r10.w(r11, r5, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            int r4 = I(r11, r6)
            goto L_0x02f4
        L_0x0049:
            boolean r6 = r10.w(r11, r5, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            long r6 = k(r11, r6)
            goto L_0x0305
        L_0x0057:
            boolean r6 = r10.w(r11, r5, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            int r4 = I(r11, r6)
            goto L_0x0318
        L_0x0065:
            boolean r6 = r10.w(r11, r5, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            int r4 = I(r11, r6)
            goto L_0x032b
        L_0x0073:
            boolean r6 = r10.w(r11, r5, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            int r4 = I(r11, r6)
            goto L_0x033e
        L_0x0081:
            boolean r6 = r10.w(r11, r5, r3)
            if (r6 == 0) goto L_0x040c
            goto L_0x034b
        L_0x0089:
            boolean r6 = r10.w(r11, r5, r3)
            if (r6 == 0) goto L_0x040c
            goto L_0x0360
        L_0x0091:
            boolean r6 = r10.w(r11, r5, r3)
            if (r6 == 0) goto L_0x040c
            goto L_0x0375
        L_0x0099:
            boolean r6 = r10.w(r11, r5, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            boolean r4 = x(r11, r6)
            goto L_0x038c
        L_0x00a7:
            boolean r6 = r10.w(r11, r5, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            int r4 = I(r11, r6)
            goto L_0x039f
        L_0x00b5:
            boolean r6 = r10.w(r11, r5, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            long r6 = k(r11, r6)
            goto L_0x03b1
        L_0x00c3:
            boolean r6 = r10.w(r11, r5, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            int r4 = I(r11, r6)
            goto L_0x03c3
        L_0x00d1:
            boolean r6 = r10.w(r11, r5, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            long r6 = k(r11, r6)
            goto L_0x03d5
        L_0x00df:
            boolean r6 = r10.w(r11, r5, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            long r6 = k(r11, r6)
            goto L_0x03e7
        L_0x00ed:
            boolean r6 = r10.w(r11, r5, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            float r4 = F(r11, r6)
            goto L_0x03f9
        L_0x00fb:
            boolean r6 = r10.w(r11, r5, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            double r6 = E(r11, r6)
            goto L_0x0409
        L_0x0109:
            r4 = r4 & r8
            long r4 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r4)
            if (r4 != 0) goto L_0x0113
            goto L_0x040c
        L_0x0113:
            java.lang.Object r11 = r10.n(r3)
            g.e.a.b.e.c.h8 r11 = (g.e.a.b.e.c.h8) r11
            throw r1
        L_0x011a:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.y8 r6 = r10.m(r3)
            g.e.a.b.e.c.a9.i(r5, r4, r12, r6)
            goto L_0x040c
        L_0x012b:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.p(r5, r4, r12, r7)
            goto L_0x040c
        L_0x0138:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.o(r5, r4, r12, r7)
            goto L_0x040c
        L_0x0145:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.n(r5, r4, r12, r7)
            goto L_0x040c
        L_0x0152:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.m(r5, r4, r12, r7)
            goto L_0x040c
        L_0x015f:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.e(r5, r4, r12, r7)
            goto L_0x040c
        L_0x016c:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.r(r5, r4, r12, r7)
            goto L_0x040c
        L_0x0179:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.b(r5, r4, r12, r7)
            goto L_0x040c
        L_0x0186:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.f(r5, r4, r12, r7)
            goto L_0x040c
        L_0x0193:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.g(r5, r4, r12, r7)
            goto L_0x040c
        L_0x01a0:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.j(r5, r4, r12, r7)
            goto L_0x040c
        L_0x01ad:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.t(r5, r4, r12, r7)
            goto L_0x040c
        L_0x01ba:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.k(r5, r4, r12, r7)
            goto L_0x040c
        L_0x01c7:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.h(r5, r4, r12, r7)
            goto L_0x040c
        L_0x01d4:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.d(r5, r4, r12, r7)
            goto L_0x040c
        L_0x01e1:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.p(r5, r4, r12, r2)
            goto L_0x040c
        L_0x01ee:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.o(r5, r4, r12, r2)
            goto L_0x040c
        L_0x01fb:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.n(r5, r4, r12, r2)
            goto L_0x040c
        L_0x0208:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.m(r5, r4, r12, r2)
            goto L_0x040c
        L_0x0215:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.e(r5, r4, r12, r2)
            goto L_0x040c
        L_0x0222:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.r(r5, r4, r12, r2)
            goto L_0x040c
        L_0x022f:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.c(r5, r4, r12)
            goto L_0x040c
        L_0x023c:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.y8 r6 = r10.m(r3)
            g.e.a.b.e.c.a9.l(r5, r4, r12, r6)
            goto L_0x040c
        L_0x024d:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.q(r5, r4, r12)
            goto L_0x040c
        L_0x025a:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.b(r5, r4, r12, r2)
            goto L_0x040c
        L_0x0267:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.f(r5, r4, r12, r2)
            goto L_0x040c
        L_0x0274:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.g(r5, r4, r12, r2)
            goto L_0x040c
        L_0x0281:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.j(r5, r4, r12, r2)
            goto L_0x040c
        L_0x028e:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.t(r5, r4, r12, r2)
            goto L_0x040c
        L_0x029b:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.k(r5, r4, r12, r2)
            goto L_0x040c
        L_0x02a8:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.h(r5, r4, r12, r2)
            goto L_0x040c
        L_0x02b5:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            g.e.a.b.e.c.a9.d(r5, r4, r12, r2)
            goto L_0x040c
        L_0x02c2:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x040c
        L_0x02c8:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r6)
            g.e.a.b.e.c.y8 r6 = r10.m(r3)
            r12.e(r5, r4, r6)
            goto L_0x040c
        L_0x02d7:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            long r6 = g.e.a.b.e.c.v9.h(r11, r6)
        L_0x02e3:
            r12.b(r5, r6)
            goto L_0x040c
        L_0x02e8:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            int r4 = g.e.a.b.e.c.v9.g(r11, r6)
        L_0x02f4:
            r12.a(r5, r4)
            goto L_0x040c
        L_0x02f9:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            long r6 = g.e.a.b.e.c.v9.h(r11, r6)
        L_0x0305:
            g.e.a.b.e.c.x6 r4 = r12.a
            r4.h(r5, r6)
            goto L_0x040c
        L_0x030c:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            int r4 = g.e.a.b.e.c.v9.g(r11, r6)
        L_0x0318:
            g.e.a.b.e.c.x6 r6 = r12.a
            r6.f(r5, r4)
            goto L_0x040c
        L_0x031f:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            int r4 = g.e.a.b.e.c.v9.g(r11, r6)
        L_0x032b:
            g.e.a.b.e.c.x6 r6 = r12.a
            r6.j(r5, r4)
            goto L_0x040c
        L_0x0332:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            int r4 = g.e.a.b.e.c.v9.g(r11, r6)
        L_0x033e:
            g.e.a.b.e.c.x6 r6 = r12.a
            r6.n(r5, r4)
            goto L_0x040c
        L_0x0345:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x040c
        L_0x034b:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r6)
            g.e.a.b.e.c.s6 r4 = (g.e.a.b.e.c.s6) r4
            g.e.a.b.e.c.x6 r6 = r12.a
            r6.e(r5, r4)
            goto L_0x040c
        L_0x035a:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x040c
        L_0x0360:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r6)
            g.e.a.b.e.c.y8 r6 = r10.m(r3)
            r12.f(r5, r4, r6)
            goto L_0x040c
        L_0x036f:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x040c
        L_0x0375:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = g.e.a.b.e.c.v9.j(r11, r6)
            z(r5, r4, r12)
            goto L_0x040c
        L_0x0380:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            boolean r4 = g.e.a.b.e.c.v9.r(r11, r6)
        L_0x038c:
            g.e.a.b.e.c.x6 r6 = r12.a
            r6.d(r5, r4)
            goto L_0x040c
        L_0x0393:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            int r4 = g.e.a.b.e.c.v9.g(r11, r6)
        L_0x039f:
            g.e.a.b.e.c.x6 r6 = r12.a
            r6.f(r5, r4)
            goto L_0x040c
        L_0x03a5:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            long r6 = g.e.a.b.e.c.v9.h(r11, r6)
        L_0x03b1:
            g.e.a.b.e.c.x6 r4 = r12.a
            r4.h(r5, r6)
            goto L_0x040c
        L_0x03b7:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            int r4 = g.e.a.b.e.c.v9.g(r11, r6)
        L_0x03c3:
            g.e.a.b.e.c.x6 r6 = r12.a
            r6.j(r5, r4)
            goto L_0x040c
        L_0x03c9:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            long r6 = g.e.a.b.e.c.v9.h(r11, r6)
        L_0x03d5:
            g.e.a.b.e.c.x6 r4 = r12.a
            r4.p(r5, r6)
            goto L_0x040c
        L_0x03db:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            long r6 = g.e.a.b.e.c.v9.h(r11, r6)
        L_0x03e7:
            g.e.a.b.e.c.x6 r4 = r12.a
            r4.p(r5, r6)
            goto L_0x040c
        L_0x03ed:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            float r4 = g.e.a.b.e.c.v9.f(r11, r6)
        L_0x03f9:
            r12.d(r5, r4)
            goto L_0x040c
        L_0x03fd:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x040c
            r4 = r4 & r8
            long r6 = (long) r4
            double r6 = g.e.a.b.e.c.v9.e(r11, r6)
        L_0x0409:
            r12.c(r5, r6)
        L_0x040c:
            int r3 = r3 + 3
            goto L_0x000e
        L_0x0410:
            g.e.a.b.e.c.l9 r0 = r10.f3031l
            java.lang.Object r11 = r0.c(r11)
            r0.i(r11, r12)
            return
        L_0x041a:
            g.e.a.b.e.c.c7 r12 = r10.f3032m
            r12.a(r11)
            throw r1
        L_0x0420:
            r10.y(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.q8.h(java.lang.Object, g.e.a.b.e.c.y6):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        r2 = r2 * 53;
        r3 = I(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a2, code lost:
        r2 = r2 * 53;
        r3 = k(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        if (r3 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cb, code lost:
        r2 = r2 * 53;
        r3 = g.e.a.b.e.c.v9.j(r9, r5).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00da, code lost:
        if (r3 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dc, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e4, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) g.e.a.b.e.c.v9.j(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f7, code lost:
        r3 = g.e.a.b.e.c.v7.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0110, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011b, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011f, code lost:
        r3 = g.e.a.b.e.c.v7.b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0123, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0125, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x0129
            int r3 = r8.j(r1)
            int[] r4 = r8.a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = r3 >>> 20
            r3 = r3 & 255(0xff, float:3.57E-43)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0115;
                case 1: goto L_0x010a;
                case 2: goto L_0x0103;
                case 3: goto L_0x0103;
                case 4: goto L_0x00fc;
                case 5: goto L_0x0103;
                case 6: goto L_0x00fc;
                case 7: goto L_0x00f1;
                case 8: goto L_0x00e4;
                case 9: goto L_0x00d6;
                case 10: goto L_0x00cb;
                case 11: goto L_0x00fc;
                case 12: goto L_0x00fc;
                case 13: goto L_0x00fc;
                case 14: goto L_0x0103;
                case 15: goto L_0x00fc;
                case 16: goto L_0x0103;
                case 17: goto L_0x00c4;
                case 18: goto L_0x00cb;
                case 19: goto L_0x00cb;
                case 20: goto L_0x00cb;
                case 21: goto L_0x00cb;
                case 22: goto L_0x00cb;
                case 23: goto L_0x00cb;
                case 24: goto L_0x00cb;
                case 25: goto L_0x00cb;
                case 26: goto L_0x00cb;
                case 27: goto L_0x00cb;
                case 28: goto L_0x00cb;
                case 29: goto L_0x00cb;
                case 30: goto L_0x00cb;
                case 31: goto L_0x00cb;
                case 32: goto L_0x00cb;
                case 33: goto L_0x00cb;
                case 34: goto L_0x00cb;
                case 35: goto L_0x00cb;
                case 36: goto L_0x00cb;
                case 37: goto L_0x00cb;
                case 38: goto L_0x00cb;
                case 39: goto L_0x00cb;
                case 40: goto L_0x00cb;
                case 41: goto L_0x00cb;
                case 42: goto L_0x00cb;
                case 43: goto L_0x00cb;
                case 44: goto L_0x00cb;
                case 45: goto L_0x00cb;
                case 46: goto L_0x00cb;
                case 47: goto L_0x00cb;
                case 48: goto L_0x00cb;
                case 49: goto L_0x00cb;
                case 50: goto L_0x00cb;
                case 51: goto L_0x00b7;
                case 52: goto L_0x00aa;
                case 53: goto L_0x009c;
                case 54: goto L_0x0095;
                case 55: goto L_0x0087;
                case 56: goto L_0x0080;
                case 57: goto L_0x0079;
                case 58: goto L_0x006b;
                case 59: goto L_0x0063;
                case 60: goto L_0x005b;
                case 61: goto L_0x0053;
                case 62: goto L_0x004c;
                case 63: goto L_0x0045;
                case 64: goto L_0x003e;
                case 65: goto L_0x0036;
                case 66: goto L_0x002f;
                case 67: goto L_0x0027;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0125
        L_0x001f:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00cb
        L_0x0027:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00a2
        L_0x002f:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x0036:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00a2
        L_0x003e:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x0045:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x004c:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x0053:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00cb
        L_0x005b:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00cb
        L_0x0063:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00e4
        L_0x006b:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            int r2 = r2 * 53
            boolean r3 = x(r9, r5)
            goto L_0x00f7
        L_0x0079:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x0080:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00a2
        L_0x0087:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
        L_0x008d:
            int r2 = r2 * 53
            int r3 = I(r9, r5)
            goto L_0x0123
        L_0x0095:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00a2
        L_0x009c:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
        L_0x00a2:
            int r2 = r2 * 53
            long r3 = k(r9, r5)
            goto L_0x011f
        L_0x00aa:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            int r2 = r2 * 53
            float r3 = F(r9, r5)
            goto L_0x0110
        L_0x00b7:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            int r2 = r2 * 53
            double r3 = E(r9, r5)
            goto L_0x011b
        L_0x00c4:
            java.lang.Object r3 = g.e.a.b.e.c.v9.j(r9, r5)
            if (r3 == 0) goto L_0x00e0
            goto L_0x00dc
        L_0x00cb:
            int r2 = r2 * 53
            java.lang.Object r3 = g.e.a.b.e.c.v9.j(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0123
        L_0x00d6:
            java.lang.Object r3 = g.e.a.b.e.c.v9.j(r9, r5)
            if (r3 == 0) goto L_0x00e0
        L_0x00dc:
            int r7 = r3.hashCode()
        L_0x00e0:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0125
        L_0x00e4:
            int r2 = r2 * 53
            java.lang.Object r3 = g.e.a.b.e.c.v9.j(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0123
        L_0x00f1:
            int r2 = r2 * 53
            boolean r3 = g.e.a.b.e.c.v9.r(r9, r5)
        L_0x00f7:
            int r3 = g.e.a.b.e.c.v7.a(r3)
            goto L_0x0123
        L_0x00fc:
            int r2 = r2 * 53
            int r3 = g.e.a.b.e.c.v9.g(r9, r5)
            goto L_0x0123
        L_0x0103:
            int r2 = r2 * 53
            long r3 = g.e.a.b.e.c.v9.h(r9, r5)
            goto L_0x011f
        L_0x010a:
            int r2 = r2 * 53
            float r3 = g.e.a.b.e.c.v9.f(r9, r5)
        L_0x0110:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0123
        L_0x0115:
            int r2 = r2 * 53
            double r3 = g.e.a.b.e.c.v9.e(r9, r5)
        L_0x011b:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x011f:
            int r3 = g.e.a.b.e.c.v7.b(r3)
        L_0x0123:
            int r3 = r3 + r2
            r2 = r3
        L_0x0125:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0129:
            int r2 = r2 * 53
            g.e.a.b.e.c.l9 r0 = r8.f3031l
            java.lang.Object r0 = r0.c(r9)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r8.f3025f
            if (r1 != 0) goto L_0x013b
            return r0
        L_0x013b:
            g.e.a.b.e.c.c7 r0 = r8.f3032m
            r0.a(r9)
            r9 = 0
            goto L_0x0143
        L_0x0142:
            throw r9
        L_0x0143:
            goto L_0x0142
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.q8.i(java.lang.Object):int");
    }

    public final int j(int i2) {
        return this.a[i2 + 1];
    }

    public final r7 l(int i2) {
        int i3 = i2 / 3;
        return (r7) this.b[i3 + i3 + 1];
    }

    public final y8 m(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        Object[] objArr = this.b;
        y8 y8Var = (y8) objArr[i4];
        if (y8Var != null) {
            return y8Var;
        }
        y8 a2 = v8.c.a((Class) objArr[i4 + 1]);
        this.b[i4] = a2;
        return a2;
    }

    public final Object n(int i2) {
        int i3 = i2 / 3;
        return this.b[i3 + i3];
    }

    public final void p(Object obj, Object obj2, int i2) {
        long j2 = (long) (this.a[i2 + 1] & 1048575);
        if (u(obj2, i2)) {
            Object j3 = v9.j(obj, j2);
            Object j4 = v9.j(obj2, j2);
            if (j3 != null && j4 != null) {
                v9.f3057d.p(obj, j2, v7.c(j3, j4));
                r(obj, i2);
            } else if (j4 != null) {
                v9.f3057d.p(obj, j2, j4);
                r(obj, i2);
            }
        }
    }

    public final void q(Object obj, Object obj2, int i2) {
        int[] iArr = this.a;
        int i3 = iArr[i2 + 1];
        int i4 = iArr[i2];
        long j2 = (long) (i3 & 1048575);
        if (w(obj2, i4, i2)) {
            Object j3 = w(obj, i4, i2) ? v9.j(obj, j2) : null;
            Object j4 = v9.j(obj2, j2);
            if (j3 != null && j4 != null) {
                v9.f3057d.p(obj, j2, v7.c(j3, j4));
                s(obj, i4, i2);
            } else if (j4 != null) {
                v9.f3057d.p(obj, j2, j4);
                s(obj, i4, i2);
            }
        }
    }

    public final void r(Object obj, int i2) {
        int i3 = this.a[i2 + 2];
        long j2 = (long) (1048575 & i3);
        if (j2 != 1048575) {
            v9.f3057d.n(obj, j2, (1 << (i3 >>> 20)) | v9.g(obj, j2));
        }
    }

    public final void s(Object obj, int i2, int i3) {
        v9.f3057d.n(obj, (long) (this.a[i3 + 2] & 1048575), i2);
    }

    public final boolean t(Object obj, Object obj2, int i2) {
        return u(obj, i2) == u(obj2, i2);
    }

    public final boolean u(Object obj, int i2) {
        int[] iArr = this.a;
        int i3 = iArr[i2 + 2];
        long j2 = (long) (i3 & 1048575);
        if (j2 != 1048575) {
            return (v9.g(obj, j2) & (1 << (i3 >>> 20))) != 0;
        }
        int i4 = iArr[i2 + 1];
        long j3 = (long) (i4 & 1048575);
        switch ((i4 >>> 20) & 255) {
            case 0:
                return Double.doubleToRawLongBits(v9.e(obj, j3)) != 0;
            case 1:
                return Float.floatToRawIntBits(v9.f(obj, j3)) != 0;
            case 2:
                return v9.h(obj, j3) != 0;
            case 3:
                return v9.h(obj, j3) != 0;
            case 4:
                return v9.g(obj, j3) != 0;
            case 5:
                return v9.h(obj, j3) != 0;
            case 6:
                return v9.g(obj, j3) != 0;
            case 7:
                return v9.r(obj, j3);
            case 8:
                Object j4 = v9.j(obj, j3);
                if (j4 instanceof String) {
                    return !((String) j4).isEmpty();
                }
                if (j4 instanceof s6) {
                    return !s6.b.equals(j4);
                }
                throw new IllegalArgumentException();
            case 9:
                return v9.j(obj, j3) != null;
            case 10:
                return !s6.b.equals(v9.j(obj, j3));
            case 11:
                return v9.g(obj, j3) != 0;
            case 12:
                return v9.g(obj, j3) != 0;
            case ConnectionResult.CANCELED:
                return v9.g(obj, j3) != 0;
            case ConnectionResult.TIMEOUT:
                return v9.h(obj, j3) != 0;
            case ConnectionResult.INTERRUPTED:
                return v9.g(obj, j3) != 0;
            case ConnectionResult.API_UNAVAILABLE:
                return v9.h(obj, j3) != 0;
            case ConnectionResult.SIGN_IN_FAILED:
                return v9.j(obj, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean v(Object obj, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? u(obj, i2) : (i4 & i5) != 0;
    }

    public final boolean w(Object obj, int i2, int i3) {
        return v9.g(obj, (long) (this.a[i3 + 2] & 1048575)) == i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:164:0x046e, code lost:
        r8 = r8 + 3;
        r6 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0250, code lost:
        g.e.a.b.e.c.a9.p(r11, r6, r2, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x025b, code lost:
        g.e.a.b.e.c.a9.o(r12, (java.util.List) r5.getObject(r1, r6), r2, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x026c, code lost:
        g.e.a.b.e.c.a9.n(r12, (java.util.List) r5.getObject(r1, r6), r2, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x027d, code lost:
        g.e.a.b.e.c.a9.m(r12, (java.util.List) r5.getObject(r1, r6), r2, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x028e, code lost:
        g.e.a.b.e.c.a9.e(r12, (java.util.List) r5.getObject(r1, r6), r2, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x029f, code lost:
        g.e.a.b.e.c.a9.r(r12, (java.util.List) r5.getObject(r1, r6), r2, r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y(java.lang.Object r17, g.e.a.b.e.c.y6 r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f3025f
            r4 = 0
            if (r3 != 0) goto L_0x047f
            int[] r3 = r0.a
            int r3 = r3.length
            sun.misc.Unsafe r5 = p
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 0
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r10 = 0
        L_0x0018:
            if (r8 >= r3) goto L_0x0475
            int r11 = r0.j(r8)
            int[] r12 = r0.a
            r13 = r12[r8]
            int r14 = r11 >>> 20
            r14 = r14 & 255(0xff, float:3.57E-43)
            r15 = 17
            r7 = 1
            if (r14 > r15) goto L_0x003e
            int r15 = r8 + 2
            r12 = r12[r15]
            r15 = r12 & r6
            if (r15 == r9) goto L_0x0039
            long r9 = (long) r15
            int r10 = r5.getInt(r1, r9)
            r9 = r15
        L_0x0039:
            int r12 = r12 >>> 20
            int r12 = r7 << r12
            goto L_0x003f
        L_0x003e:
            r12 = 0
        L_0x003f:
            r11 = r11 & r6
            long r6 = (long) r11
            switch(r14) {
                case 0: goto L_0x0462;
                case 1: goto L_0x0455;
                case 2: goto L_0x0446;
                case 3: goto L_0x0437;
                case 4: goto L_0x0428;
                case 5: goto L_0x0419;
                case 6: goto L_0x040a;
                case 7: goto L_0x03fb;
                case 8: goto L_0x03ed;
                case 9: goto L_0x03db;
                case 10: goto L_0x03c9;
                case 11: goto L_0x03b9;
                case 12: goto L_0x03a9;
                case 13: goto L_0x0399;
                case 14: goto L_0x0389;
                case 15: goto L_0x037b;
                case 16: goto L_0x036d;
                case 17: goto L_0x035b;
                case 18: goto L_0x034b;
                case 19: goto L_0x033b;
                case 20: goto L_0x032b;
                case 21: goto L_0x031b;
                case 22: goto L_0x030b;
                case 23: goto L_0x02fb;
                case 24: goto L_0x02eb;
                case 25: goto L_0x02db;
                case 26: goto L_0x02cc;
                case 27: goto L_0x02b9;
                case 28: goto L_0x02aa;
                case 29: goto L_0x0299;
                case 30: goto L_0x0288;
                case 31: goto L_0x0277;
                case 32: goto L_0x0266;
                case 33: goto L_0x0255;
                case 34: goto L_0x0245;
                case 35: goto L_0x0235;
                case 36: goto L_0x0225;
                case 37: goto L_0x0215;
                case 38: goto L_0x0205;
                case 39: goto L_0x01f5;
                case 40: goto L_0x01e5;
                case 41: goto L_0x01d5;
                case 42: goto L_0x01c5;
                case 43: goto L_0x01bd;
                case 44: goto L_0x01b5;
                case 45: goto L_0x01ad;
                case 46: goto L_0x01a5;
                case 47: goto L_0x019d;
                case 48: goto L_0x0190;
                case 49: goto L_0x017d;
                case 50: goto L_0x016e;
                case 51: goto L_0x015f;
                case 52: goto L_0x0150;
                case 53: goto L_0x013f;
                case 54: goto L_0x012e;
                case 55: goto L_0x011d;
                case 56: goto L_0x010c;
                case 57: goto L_0x00fb;
                case 58: goto L_0x00ea;
                case 59: goto L_0x00db;
                case 60: goto L_0x00c8;
                case 61: goto L_0x00b5;
                case 62: goto L_0x00a5;
                case 63: goto L_0x0095;
                case 64: goto L_0x0085;
                case 65: goto L_0x0075;
                case 66: goto L_0x0067;
                case 67: goto L_0x0059;
                case 68: goto L_0x0047;
                default: goto L_0x0044;
            }
        L_0x0044:
            r14 = 0
            goto L_0x046e
        L_0x0047:
            boolean r11 = r0.w(r1, r13, r8)
            if (r11 == 0) goto L_0x0044
            java.lang.Object r6 = r5.getObject(r1, r6)
            g.e.a.b.e.c.y8 r7 = r0.m(r8)
            r2.e(r13, r6, r7)
            goto L_0x0044
        L_0x0059:
            boolean r11 = r0.w(r1, r13, r8)
            if (r11 == 0) goto L_0x0044
            long r6 = k(r1, r6)
            r2.b(r13, r6)
            goto L_0x0044
        L_0x0067:
            boolean r11 = r0.w(r1, r13, r8)
            if (r11 == 0) goto L_0x0044
            int r6 = I(r1, r6)
            r2.a(r13, r6)
            goto L_0x0044
        L_0x0075:
            boolean r11 = r0.w(r1, r13, r8)
            if (r11 == 0) goto L_0x0044
            long r6 = k(r1, r6)
            g.e.a.b.e.c.x6 r11 = r2.a
            r11.h(r13, r6)
            goto L_0x0044
        L_0x0085:
            boolean r11 = r0.w(r1, r13, r8)
            if (r11 == 0) goto L_0x0044
            int r6 = I(r1, r6)
            g.e.a.b.e.c.x6 r7 = r2.a
            r7.f(r13, r6)
            goto L_0x0044
        L_0x0095:
            boolean r11 = r0.w(r1, r13, r8)
            if (r11 == 0) goto L_0x0044
            int r6 = I(r1, r6)
            g.e.a.b.e.c.x6 r7 = r2.a
            r7.j(r13, r6)
            goto L_0x0044
        L_0x00a5:
            boolean r11 = r0.w(r1, r13, r8)
            if (r11 == 0) goto L_0x0044
            int r6 = I(r1, r6)
            g.e.a.b.e.c.x6 r7 = r2.a
            r7.n(r13, r6)
            goto L_0x0044
        L_0x00b5:
            boolean r11 = r0.w(r1, r13, r8)
            if (r11 == 0) goto L_0x0044
            java.lang.Object r6 = r5.getObject(r1, r6)
            g.e.a.b.e.c.s6 r6 = (g.e.a.b.e.c.s6) r6
            g.e.a.b.e.c.x6 r7 = r2.a
            r7.e(r13, r6)
            goto L_0x0044
        L_0x00c8:
            boolean r11 = r0.w(r1, r13, r8)
            if (r11 == 0) goto L_0x0044
            java.lang.Object r6 = r5.getObject(r1, r6)
            g.e.a.b.e.c.y8 r7 = r0.m(r8)
            r2.f(r13, r6, r7)
            goto L_0x0044
        L_0x00db:
            boolean r11 = r0.w(r1, r13, r8)
            if (r11 == 0) goto L_0x0044
            java.lang.Object r6 = r5.getObject(r1, r6)
            z(r13, r6, r2)
            goto L_0x0044
        L_0x00ea:
            boolean r11 = r0.w(r1, r13, r8)
            if (r11 == 0) goto L_0x0044
            boolean r6 = x(r1, r6)
            g.e.a.b.e.c.x6 r7 = r2.a
            r7.d(r13, r6)
            goto L_0x0044
        L_0x00fb:
            boolean r11 = r0.w(r1, r13, r8)
            if (r11 == 0) goto L_0x0044
            int r6 = I(r1, r6)
            g.e.a.b.e.c.x6 r7 = r2.a
            r7.f(r13, r6)
            goto L_0x0044
        L_0x010c:
            boolean r11 = r0.w(r1, r13, r8)
            if (r11 == 0) goto L_0x0044
            long r6 = k(r1, r6)
            g.e.a.b.e.c.x6 r11 = r2.a
            r11.h(r13, r6)
            goto L_0x0044
        L_0x011d:
            boolean r11 = r0.w(r1, r13, r8)
            if (r11 == 0) goto L_0x0044
            int r6 = I(r1, r6)
            g.e.a.b.e.c.x6 r7 = r2.a
            r7.j(r13, r6)
            goto L_0x0044
        L_0x012e:
            boolean r11 = r0.w(r1, r13, r8)
            if (r11 == 0) goto L_0x0044
            long r6 = k(r1, r6)
            g.e.a.b.e.c.x6 r11 = r2.a
            r11.p(r13, r6)
            goto L_0x0044
        L_0x013f:
            boolean r11 = r0.w(r1, r13, r8)
            if (r11 == 0) goto L_0x0044
            long r6 = k(r1, r6)
            g.e.a.b.e.c.x6 r11 = r2.a
            r11.p(r13, r6)
            goto L_0x0044
        L_0x0150:
            boolean r11 = r0.w(r1, r13, r8)
            if (r11 == 0) goto L_0x0044
            float r6 = F(r1, r6)
            r2.d(r13, r6)
            goto L_0x0044
        L_0x015f:
            boolean r11 = r0.w(r1, r13, r8)
            if (r11 == 0) goto L_0x0044
            double r6 = E(r1, r6)
            r2.c(r13, r6)
            goto L_0x0044
        L_0x016e:
            java.lang.Object r6 = r5.getObject(r1, r6)
            if (r6 != 0) goto L_0x0176
            goto L_0x0044
        L_0x0176:
            java.lang.Object r1 = r0.n(r8)
            g.e.a.b.e.c.h8 r1 = (g.e.a.b.e.c.h8) r1
            throw r4
        L_0x017d:
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            g.e.a.b.e.c.y8 r7 = r0.m(r8)
            g.e.a.b.e.c.a9.i(r11, r6, r2, r7)
            goto L_0x0044
        L_0x0190:
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r7 = 1
            goto L_0x0250
        L_0x019d:
            int[] r11 = r0.a
            r11 = r11[r8]
            r12 = r11
            r11 = 1
            goto L_0x025b
        L_0x01a5:
            int[] r11 = r0.a
            r11 = r11[r8]
            r12 = r11
            r11 = 1
            goto L_0x026c
        L_0x01ad:
            int[] r11 = r0.a
            r11 = r11[r8]
            r12 = r11
            r11 = 1
            goto L_0x027d
        L_0x01b5:
            int[] r11 = r0.a
            r11 = r11[r8]
            r12 = r11
            r11 = 1
            goto L_0x028e
        L_0x01bd:
            int[] r11 = r0.a
            r11 = r11[r8]
            r12 = r11
            r11 = 1
            goto L_0x029f
        L_0x01c5:
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r12 = 1
            g.e.a.b.e.c.a9.b(r11, r6, r2, r12)
            goto L_0x0044
        L_0x01d5:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            g.e.a.b.e.c.a9.f(r11, r6, r2, r12)
            goto L_0x0044
        L_0x01e5:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            g.e.a.b.e.c.a9.g(r11, r6, r2, r12)
            goto L_0x0044
        L_0x01f5:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            g.e.a.b.e.c.a9.j(r11, r6, r2, r12)
            goto L_0x0044
        L_0x0205:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            g.e.a.b.e.c.a9.t(r11, r6, r2, r12)
            goto L_0x0044
        L_0x0215:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            g.e.a.b.e.c.a9.k(r11, r6, r2, r12)
            goto L_0x0044
        L_0x0225:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            g.e.a.b.e.c.a9.h(r11, r6, r2, r12)
            goto L_0x0044
        L_0x0235:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            g.e.a.b.e.c.a9.d(r11, r6, r2, r12)
            goto L_0x0044
        L_0x0245:
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r7 = 0
        L_0x0250:
            g.e.a.b.e.c.a9.p(r11, r6, r2, r7)
            goto L_0x0044
        L_0x0255:
            int[] r11 = r0.a
            r11 = r11[r8]
            r12 = r11
            r11 = 0
        L_0x025b:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            g.e.a.b.e.c.a9.o(r12, r6, r2, r11)
            goto L_0x0044
        L_0x0266:
            int[] r11 = r0.a
            r11 = r11[r8]
            r12 = r11
            r11 = 0
        L_0x026c:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            g.e.a.b.e.c.a9.n(r12, r6, r2, r11)
            goto L_0x0044
        L_0x0277:
            int[] r11 = r0.a
            r11 = r11[r8]
            r12 = r11
            r11 = 0
        L_0x027d:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            g.e.a.b.e.c.a9.m(r12, r6, r2, r11)
            goto L_0x0044
        L_0x0288:
            int[] r11 = r0.a
            r11 = r11[r8]
            r12 = r11
            r11 = 0
        L_0x028e:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            g.e.a.b.e.c.a9.e(r12, r6, r2, r11)
            goto L_0x0044
        L_0x0299:
            int[] r11 = r0.a
            r11 = r11[r8]
            r12 = r11
            r11 = 0
        L_0x029f:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            g.e.a.b.e.c.a9.r(r12, r6, r2, r11)
            goto L_0x0044
        L_0x02aa:
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            g.e.a.b.e.c.a9.c(r11, r6, r2)
            goto L_0x0044
        L_0x02b9:
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            g.e.a.b.e.c.y8 r7 = r0.m(r8)
            g.e.a.b.e.c.a9.l(r11, r6, r2, r7)
            goto L_0x0044
        L_0x02cc:
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            g.e.a.b.e.c.a9.q(r11, r6, r2)
            goto L_0x0044
        L_0x02db:
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r14 = 0
            g.e.a.b.e.c.a9.b(r11, r6, r2, r14)
            goto L_0x046e
        L_0x02eb:
            r14 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            g.e.a.b.e.c.a9.f(r11, r6, r2, r14)
            goto L_0x046e
        L_0x02fb:
            r14 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            g.e.a.b.e.c.a9.g(r11, r6, r2, r14)
            goto L_0x046e
        L_0x030b:
            r14 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            g.e.a.b.e.c.a9.j(r11, r6, r2, r14)
            goto L_0x046e
        L_0x031b:
            r14 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            g.e.a.b.e.c.a9.t(r11, r6, r2, r14)
            goto L_0x046e
        L_0x032b:
            r14 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            g.e.a.b.e.c.a9.k(r11, r6, r2, r14)
            goto L_0x046e
        L_0x033b:
            r14 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            g.e.a.b.e.c.a9.h(r11, r6, r2, r14)
            goto L_0x046e
        L_0x034b:
            r14 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            g.e.a.b.e.c.a9.d(r11, r6, r2, r14)
            goto L_0x046e
        L_0x035b:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x046e
            java.lang.Object r6 = r5.getObject(r1, r6)
            g.e.a.b.e.c.y8 r7 = r0.m(r8)
            r2.e(r13, r6, r7)
            goto L_0x046e
        L_0x036d:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x046e
            long r6 = r5.getLong(r1, r6)
            r2.b(r13, r6)
            goto L_0x046e
        L_0x037b:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x046e
            int r6 = r5.getInt(r1, r6)
            r2.a(r13, r6)
            goto L_0x046e
        L_0x0389:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x046e
            long r6 = r5.getLong(r1, r6)
            g.e.a.b.e.c.x6 r11 = r2.a
            r11.h(r13, r6)
            goto L_0x046e
        L_0x0399:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x046e
            int r6 = r5.getInt(r1, r6)
            g.e.a.b.e.c.x6 r7 = r2.a
            r7.f(r13, r6)
            goto L_0x046e
        L_0x03a9:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x046e
            int r6 = r5.getInt(r1, r6)
            g.e.a.b.e.c.x6 r7 = r2.a
            r7.j(r13, r6)
            goto L_0x046e
        L_0x03b9:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x046e
            int r6 = r5.getInt(r1, r6)
            g.e.a.b.e.c.x6 r7 = r2.a
            r7.n(r13, r6)
            goto L_0x046e
        L_0x03c9:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x046e
            java.lang.Object r6 = r5.getObject(r1, r6)
            g.e.a.b.e.c.s6 r6 = (g.e.a.b.e.c.s6) r6
            g.e.a.b.e.c.x6 r7 = r2.a
            r7.e(r13, r6)
            goto L_0x046e
        L_0x03db:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x046e
            java.lang.Object r6 = r5.getObject(r1, r6)
            g.e.a.b.e.c.y8 r7 = r0.m(r8)
            r2.f(r13, r6, r7)
            goto L_0x046e
        L_0x03ed:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x046e
            java.lang.Object r6 = r5.getObject(r1, r6)
            z(r13, r6, r2)
            goto L_0x046e
        L_0x03fb:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x046e
            boolean r6 = g.e.a.b.e.c.v9.r(r1, r6)
            g.e.a.b.e.c.x6 r7 = r2.a
            r7.d(r13, r6)
            goto L_0x046e
        L_0x040a:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x046e
            int r6 = r5.getInt(r1, r6)
            g.e.a.b.e.c.x6 r7 = r2.a
            r7.f(r13, r6)
            goto L_0x046e
        L_0x0419:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x046e
            long r6 = r5.getLong(r1, r6)
            g.e.a.b.e.c.x6 r11 = r2.a
            r11.h(r13, r6)
            goto L_0x046e
        L_0x0428:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x046e
            int r6 = r5.getInt(r1, r6)
            g.e.a.b.e.c.x6 r7 = r2.a
            r7.j(r13, r6)
            goto L_0x046e
        L_0x0437:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x046e
            long r6 = r5.getLong(r1, r6)
            g.e.a.b.e.c.x6 r11 = r2.a
            r11.p(r13, r6)
            goto L_0x046e
        L_0x0446:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x046e
            long r6 = r5.getLong(r1, r6)
            g.e.a.b.e.c.x6 r11 = r2.a
            r11.p(r13, r6)
            goto L_0x046e
        L_0x0455:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x046e
            float r6 = g.e.a.b.e.c.v9.f(r1, r6)
            r2.d(r13, r6)
            goto L_0x046e
        L_0x0462:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x046e
            double r6 = g.e.a.b.e.c.v9.e(r1, r6)
            r2.c(r13, r6)
        L_0x046e:
            int r8 = r8 + 3
            r6 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0018
        L_0x0475:
            g.e.a.b.e.c.l9 r3 = r0.f3031l
            java.lang.Object r1 = r3.c(r1)
            r3.i(r1, r2)
            return
        L_0x047f:
            g.e.a.b.e.c.c7 r2 = r0.f3032m
            r2.a(r1)
            goto L_0x0486
        L_0x0485:
            throw r4
        L_0x0486:
            goto L_0x0485
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.q8.y(java.lang.Object, g.e.a.b.e.c.y6):void");
    }
}
