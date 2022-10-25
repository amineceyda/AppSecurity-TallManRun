package g.e.a.b.b.h;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.measurement.zzkh;
import com.google.firebase.components.DependencyCycleException;
import com.tencent.beacon.pack.AbstractJceStruct;
import com.tencent.raft.codegenmeta.utils.Constants;
import g.a.a.a.a;
import g.e.a.b.b.d;
import g.e.a.b.e.c.c6;
import g.e.a.b.e.c.d6;
import g.e.a.b.e.c.e6;
import g.e.a.b.e.c.f;
import g.e.a.b.e.c.g;
import g.e.a.b.e.c.h4;
import g.e.a.b.e.c.i;
import g.e.a.b.e.c.i5;
import g.e.a.b.e.c.j;
import g.e.a.b.e.c.k6;
import g.e.a.b.e.c.l;
import g.e.a.b.e.c.l0;
import g.e.a.b.e.c.m;
import g.e.a.b.e.c.m7;
import g.e.a.b.e.c.m9;
import g.e.a.b.e.c.o7;
import g.e.a.b.e.c.o8;
import g.e.a.b.e.c.p;
import g.e.a.b.e.c.p7;
import g.e.a.b.e.c.q;
import g.e.a.b.e.c.q8;
import g.e.a.b.e.c.r6;
import g.e.a.b.e.c.s6;
import g.e.a.b.e.c.t;
import g.e.a.b.e.c.u7;
import g.e.a.b.e.c.v7;
import g.e.a.b.e.c.w9;
import g.e.a.b.e.c.y8;
import g.e.a.b.e.c.y9;
import g.e.a.b.e.c.z4;
import g.e.a.b.f.b.b;
import g.e.a.b.f.b.f3;
import g.e.a.b.g.b0;
import g.e.a.b.g.c0;
import g.e.a.b.g.h;
import g.e.a.b.g.k;
import g.e.b.k.n;
import g.e.b.k.s;
import g.e.b.k.u;
import g.e.b.k.v;
import g.e.b.l.j.j.i0;
import g.e.b.l.j.j.j0;
import g.e.b.t.c;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

public final class e {
    public static Context a;
    public static Boolean b;
    public static b c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        if (r0 == false) goto L_0x0040;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0080 A[Catch:{ all -> 0x00e4, SQLiteException -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb A[Catch:{ all -> 0x00e4, SQLiteException -> 0x00e9 }, LOOP:1: B:31:0x00bb->B:36:0x00cd, LOOP_START, PHI: r14 
      PHI: (r14v1 int) = (r14v0 int), (r14v2 int) binds: [B:30:0x00b9, B:36:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d6 A[Catch:{ all -> 0x00e4, SQLiteException -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[Catch:{  }, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A(g.e.a.b.f.b.f3 r15, android.database.sqlite.SQLiteDatabase r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String[] r20) throws android.database.sqlite.SQLiteException {
        /*
            r1 = r15
            r10 = r16
            r11 = r17
            r12 = r20
            if (r1 == 0) goto L_0x00fa
            r13 = 0
            r14 = 0
            java.lang.String r0 = "name"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch:{ SQLiteException -> 0x0032, all -> 0x002f }
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0032, all -> 0x002f }
            r6[r14] = r11     // Catch:{ SQLiteException -> 0x0032, all -> 0x002f }
            java.lang.String r3 = "SQLITE_MASTER"
            java.lang.String r5 = "name=?"
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r16
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0032, all -> 0x002f }
            boolean r0 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x002d }
            r2.close()
            if (r0 != 0) goto L_0x0045
            goto L_0x0040
        L_0x002d:
            r0 = move-exception
            goto L_0x0034
        L_0x002f:
            r0 = move-exception
            goto L_0x00f4
        L_0x0032:
            r0 = move-exception
            r2 = r13
        L_0x0034:
            g.e.a.b.f.b.d3 r3 = r1.f3139i     // Catch:{ all -> 0x00f2 }
            java.lang.String r4 = "Error querying for table"
            r3.c(r4, r11, r0)     // Catch:{ all -> 0x00f2 }
            if (r2 == 0) goto L_0x0040
            r2.close()
        L_0x0040:
            r2 = r18
            r10.execSQL(r2)
        L_0x0045:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ SQLiteException -> 0x00e9 }
            r0.<init>()     // Catch:{ SQLiteException -> 0x00e9 }
            int r2 = r17.length()     // Catch:{ SQLiteException -> 0x00e9 }
            int r2 = r2 + 22
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00e9 }
            r3.<init>(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = "SELECT * FROM "
            r3.append(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            r3.append(r11)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = " LIMIT 0"
            r3.append(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = r3.toString()     // Catch:{ SQLiteException -> 0x00e9 }
            android.database.Cursor r2 = r10.rawQuery(r2, r13)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String[] r3 = r2.getColumnNames()     // Catch:{ all -> 0x00e4 }
            java.util.Collections.addAll(r0, r3)     // Catch:{ all -> 0x00e4 }
            r2.close()     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = ","
            r3 = r19
            java.lang.String[] r2 = r3.split(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            int r3 = r2.length     // Catch:{ SQLiteException -> 0x00e9 }
            r4 = 0
        L_0x007e:
            if (r4 >= r3) goto L_0x00b9
            r5 = r2[r4]     // Catch:{ SQLiteException -> 0x00e9 }
            boolean r6 = r0.remove(r5)     // Catch:{ SQLiteException -> 0x00e9 }
            if (r6 == 0) goto L_0x008b
            int r4 = r4 + 1
            goto L_0x007e
        L_0x008b:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x00e9 }
            int r2 = r17.length()     // Catch:{ SQLiteException -> 0x00e9 }
            int r2 = r2 + 35
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x00e9 }
            int r3 = r3.length()     // Catch:{ SQLiteException -> 0x00e9 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00e9 }
            r3.<init>(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = "Table "
            r3.append(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            r3.append(r11)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = " is missing required column: "
            r3.append(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            r3.append(r5)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = r3.toString()     // Catch:{ SQLiteException -> 0x00e9 }
            r0.<init>(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            throw r0     // Catch:{ SQLiteException -> 0x00e9 }
        L_0x00b9:
            if (r12 == 0) goto L_0x00d0
        L_0x00bb:
            int r2 = r12.length     // Catch:{ SQLiteException -> 0x00e9 }
            if (r14 >= r2) goto L_0x00d0
            r2 = r12[r14]     // Catch:{ SQLiteException -> 0x00e9 }
            boolean r2 = r0.remove(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            if (r2 != 0) goto L_0x00cd
            int r2 = r14 + 1
            r2 = r12[r2]     // Catch:{ SQLiteException -> 0x00e9 }
            r10.execSQL(r2)     // Catch:{ SQLiteException -> 0x00e9 }
        L_0x00cd:
            int r14 = r14 + 2
            goto L_0x00bb
        L_0x00d0:
            boolean r2 = r0.isEmpty()     // Catch:{ SQLiteException -> 0x00e9 }
            if (r2 != 0) goto L_0x00e3
            g.e.a.b.f.b.d3 r2 = r1.f3139i     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r3 = "Table has extra columns. table, columns"
            java.lang.String r4 = ", "
            java.lang.String r0 = android.text.TextUtils.join(r4, r0)     // Catch:{ SQLiteException -> 0x00e9 }
            r2.c(r3, r11, r0)     // Catch:{ SQLiteException -> 0x00e9 }
        L_0x00e3:
            return
        L_0x00e4:
            r0 = move-exception
            r2.close()     // Catch:{ SQLiteException -> 0x00e9 }
            throw r0     // Catch:{ SQLiteException -> 0x00e9 }
        L_0x00e9:
            r0 = move-exception
            g.e.a.b.f.b.d3 r1 = r1.f3136f
            java.lang.String r2 = "Failed to verify columns on table that was just created"
            r1.b(r2, r11)
            throw r0
        L_0x00f2:
            r0 = move-exception
            r13 = r2
        L_0x00f4:
            if (r13 == 0) goto L_0x00f9
            r13.close()
        L_0x00f9:
            throw r0
        L_0x00fa:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Monitor must not be null"
            r0.<init>(r1)
            goto L_0x0103
        L_0x0102:
            throw r0
        L_0x0103:
            goto L_0x0102
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.b.h.e.A(g.e.a.b.f.b.f3, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static int B(int i2) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        int i3 = 0;
        while (i3 < 6) {
            int i4 = iArr[i3];
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            } else if (i5 == i2) {
                return i4;
            } else {
                i3++;
            }
        }
        return 1;
    }

    public static int C(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2) || d2 == 0.0d) {
            return 0;
        }
        double d3 = (double) (d2 > 0.0d ? 1 : -1);
        double floor = Math.floor(Math.abs(d2));
        Double.isNaN(d3);
        return (int) ((long) ((floor * d3) % 4.294967296E9d));
    }

    public static int D(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static f E(f fVar, h4 h4Var, j jVar, Boolean bool, Boolean bool2) {
        f fVar2 = new f();
        Iterator x = fVar.x();
        while (x.hasNext()) {
            int intValue = ((Integer) x.next()).intValue();
            if (fVar.B(intValue)) {
                p a2 = jVar.a(h4Var, Arrays.asList(new p[]{fVar.v(intValue), new i(Double.valueOf((double) intValue)), fVar}));
                if (a2.m().equals(bool)) {
                    return fVar2;
                }
                if (bool2 == null || a2.m().equals(bool2)) {
                    fVar2.A(intValue, a2);
                }
            }
        }
        return fVar2;
    }

    public static p F(Object obj) {
        if (obj == null) {
            return p.F;
        }
        if (obj instanceof String) {
            return new t((String) obj);
        }
        if (obj instanceof Double) {
            return new i((Double) obj);
        }
        if (obj instanceof Long) {
            return new i(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new i(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new g((Boolean) obj);
        }
        if (obj instanceof Map) {
            m mVar = new m();
            Map map = (Map) obj;
            for (Object next : map.keySet()) {
                p F = F(map.get(next));
                if (next != null) {
                    if (!(next instanceof String)) {
                        next = next.toString();
                    }
                    mVar.p((String) next, F);
                }
            }
            return mVar;
        } else if (obj instanceof List) {
            f fVar = new f();
            for (Object F2 : (List) obj) {
                fVar.A(fVar.r(), F(F2));
            }
            return fVar;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    public static void G(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static void H(f3 f3Var, SQLiteDatabase sQLiteDatabase) {
        if (f3Var != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                f3Var.f3139i.a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                f3Var.f3139i.a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                f3Var.f3139i.a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                f3Var.f3139i.a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    public static <T> void I(g.e.a.b.g.f<T> fVar, g.e.a.b.g.j<? super T> jVar) {
        Executor executor = h.b;
        fVar.c(executor, jVar);
        fVar.b(executor, jVar);
        fVar.a(executor, jVar);
    }

    public static final void J(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            for (Object J : (List) obj) {
                J(sb, i2, str, J);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry J2 : ((Map) obj).entrySet()) {
                J(sb, i2, str, J2);
            }
        } else {
            sb.append(10);
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                s6 s6Var = s6.b;
                sb.append(z(new r6(((String) obj).getBytes(v7.a))));
                sb.append('\"');
            } else if (obj instanceof s6) {
                sb.append(": \"");
                sb.append(z((s6) obj));
                sb.append('\"');
            } else if (obj instanceof o7) {
                sb.append(" {");
                Q((o7) obj, sb, i2 + 2);
                sb.append("\n");
                while (i3 < i2) {
                    sb.append(' ');
                    i3++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i5 = i2 + 2;
                J(sb, i5, "key", entry.getKey());
                J(sb, i5, "value", entry.getValue());
                sb.append("\n");
                while (i3 < i2) {
                    sb.append(' ');
                    i3++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    public static int K(h4 h4Var) {
        int C = C(h4Var.d("runtime.counter").d().doubleValue() + 1.0d);
        if (C <= 1000000) {
            h4Var.f("runtime.counter", new i(Double.valueOf((double) C)));
            return C;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static int L(y8 y8Var, byte[] bArr, int i2, int i3, int i4, k6 k6Var) throws IOException {
        q8 q8Var = (q8) y8Var;
        Object r = ((o7) q8Var.f3024e).r(4, (Object) null, (Object) null);
        int A = q8Var.A(r, bArr, i2, i3, i4, k6Var);
        q8Var.a(r);
        k6Var.c = r;
        return A;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0097 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g.e.a.b.e.c.p M(g.e.a.b.e.c.f r9, g.e.a.b.e.c.h4 r10, java.util.List r11, boolean r12) {
        /*
            java.lang.String r0 = "reduce"
            r1 = 1
            c0(r0, r1, r11)
            r2 = 2
            e0(r0, r2, r11)
            r0 = 0
            java.lang.Object r3 = r11.get(r0)
            g.e.a.b.e.c.p r3 = (g.e.a.b.e.c.p) r3
            g.e.a.b.e.c.p r3 = r10.b(r3)
            boolean r4 = r3 instanceof g.e.a.b.e.c.j
            if (r4 == 0) goto L_0x00a0
            int r4 = r11.size()
            if (r4 != r2) goto L_0x0036
            java.lang.Object r11 = r11.get(r1)
            g.e.a.b.e.c.p r11 = (g.e.a.b.e.c.p) r11
            g.e.a.b.e.c.p r11 = r10.b(r11)
            boolean r4 = r11 instanceof g.e.a.b.e.c.h
            if (r4 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Failed to parse initial value"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            int r11 = r9.r()
            if (r11 == 0) goto L_0x0098
            r11 = 0
        L_0x003d:
            g.e.a.b.e.c.j r3 = (g.e.a.b.e.c.j) r3
            int r4 = r9.r()
            if (r12 == 0) goto L_0x0047
            r5 = 0
            goto L_0x0049
        L_0x0047:
            int r5 = r4 + -1
        L_0x0049:
            r6 = -1
            if (r12 == 0) goto L_0x004e
            int r4 = r4 + r6
            goto L_0x004f
        L_0x004e:
            r4 = 0
        L_0x004f:
            if (r1 == r12) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r6 = 1
        L_0x0053:
            if (r11 != 0) goto L_0x005a
            g.e.a.b.e.c.p r11 = r9.v(r5)
            goto L_0x0095
        L_0x005a:
            int r12 = r4 - r5
            int r12 = r12 * r6
            if (r12 < 0) goto L_0x0097
            boolean r12 = r9.B(r5)
            if (r12 == 0) goto L_0x0095
            r12 = 4
            g.e.a.b.e.c.p[] r12 = new g.e.a.b.e.c.p[r12]
            r12[r0] = r11
            g.e.a.b.e.c.p r11 = r9.v(r5)
            r12[r1] = r11
            g.e.a.b.e.c.i r11 = new g.e.a.b.e.c.i
            double r7 = (double) r5
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r11.<init>(r7)
            r12[r2] = r11
            r11 = 3
            r12[r11] = r9
            java.util.List r11 = java.util.Arrays.asList(r12)
            g.e.a.b.e.c.p r11 = r3.a(r10, r11)
            boolean r12 = r11 instanceof g.e.a.b.e.c.h
            if (r12 != 0) goto L_0x008d
            goto L_0x0095
        L_0x008d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Reduce operation failed"
            r9.<init>(r10)
            throw r9
        L_0x0095:
            int r5 = r5 + r6
            goto L_0x005a
        L_0x0097:
            return r11
        L_0x0098:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Empty array with no initial value error"
            r9.<init>(r10)
            throw r9
        L_0x00a0:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Callback should be a method"
            r9.<init>(r10)
            goto L_0x00a9
        L_0x00a8:
            throw r9
        L_0x00a9:
            goto L_0x00a8
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.b.h.e.M(g.e.a.b.e.c.f, g.e.a.b.e.c.h4, java.util.List, boolean):g.e.a.b.e.c.p");
    }

    public static final String N(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int O(g.e.a.b.e.c.y8 r6, byte[] r7, int r8, int r9, g.e.a.b.e.c.k6 r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = f0(r8, r7, r0, r10)
            int r8 = r10.a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.b()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.d(r1, r2, r3, r4, r5)
            r6.a(r9)
            r10.c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.measurement.zzkh r6 = com.google.android.gms.internal.measurement.zzkh.d()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.b.h.e.O(g.e.a.b.e.c.y8, byte[], int, int, g.e.a.b.e.c.k6):int");
    }

    public static long P(double d2) {
        return ((long) C(d2)) & 4294967295L;
    }

    public static void Q(o8 o8Var, StringBuilder sb, int i2) {
        Object obj;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : o8Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    J(sb, i2, N(concat), o7.j(method2, o8Var, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    J(sb, i2, N(concat2), o7.j(method3, o8Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object j2 = o7.j(method4, o8Var, new Object[0]);
                    if (method5 == null) {
                        if (j2 instanceof Boolean) {
                            if (!((Boolean) j2).booleanValue()) {
                            }
                        } else if (j2 instanceof Integer) {
                            if (((Integer) j2).intValue() == 0) {
                            }
                        } else if (j2 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) j2).floatValue()) == 0) {
                            }
                        } else if (!(j2 instanceof Double)) {
                            if (j2 instanceof String) {
                                obj = "";
                            } else if (j2 instanceof s6) {
                                obj = s6.b;
                            } else if (j2 instanceof o8) {
                                if (j2 == ((o8) j2).c()) {
                                }
                            } else if ((j2 instanceof Enum) && ((Enum) j2).ordinal() == 0) {
                            }
                            if (j2.equals(obj)) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) j2).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) o7.j(method5, o8Var, new Object[0])).booleanValue()) {
                    }
                    J(sb, i2, N(concat3), j2);
                }
            }
        }
        if (!(o8Var instanceof m7)) {
            m9 m9Var = ((o7) o8Var).zzc;
            if (m9Var != null) {
                for (int i3 = 0; i3 < m9Var.a; i3++) {
                    J(sb, i2, String.valueOf(m9Var.b[i3] >>> 3), m9Var.c[i3]);
                }
                return;
            }
            return;
        }
        m7 m7Var = (m7) o8Var;
        throw null;
    }

    public static /* synthetic */ boolean R(byte b2) {
        return b2 >= 0;
    }

    public static int S(y8 y8Var, int i2, byte[] bArr, int i3, int i4, u7 u7Var, k6 k6Var) throws IOException {
        int O = O(y8Var, bArr, i3, i4, k6Var);
        while (true) {
            u7Var.add(k6Var.c);
            if (O >= i4) {
                break;
            }
            int d0 = d0(bArr, O, k6Var);
            if (i2 != k6Var.a) {
                break;
            }
            O = O(y8Var, bArr, d0, i4, k6Var);
        }
        return O;
    }

    public static l0 T(String str) {
        l0 l0Var = null;
        if (str != null && !str.isEmpty()) {
            l0Var = (l0) l0.C0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (l0Var != null) {
            return l0Var;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", new Object[]{str}));
    }

    public static boolean U(byte b2) {
        return b2 > -65;
    }

    public static int V(byte[] bArr, int i2, u7 u7Var, k6 k6Var) throws IOException {
        p7 p7Var = (p7) u7Var;
        int d0 = d0(bArr, i2, k6Var);
        int i3 = k6Var.a + d0;
        while (d0 < i3) {
            d0 = d0(bArr, d0, k6Var);
            p7Var.h(k6Var.a);
        }
        if (d0 == i3) {
            return d0;
        }
        throw zzkh.d();
    }

    public static Object W(p pVar) {
        if (p.F.equals(pVar)) {
            return null;
        }
        if (p.E.equals(pVar)) {
            return "";
        }
        if (pVar instanceof m) {
            return Y((m) pVar);
        }
        if (!(pVar instanceof f)) {
            return !pVar.d().isNaN() ? pVar.d() : pVar.e();
        }
        ArrayList arrayList = new ArrayList();
        f fVar = (f) pVar;
        Objects.requireNonNull(fVar);
        g.e.a.b.e.c.e eVar = new g.e.a.b.e.c.e(fVar);
        while (eVar.hasNext()) {
            Object W = W((p) eVar.next());
            if (W != null) {
                arrayList.add(W);
            }
        }
        return arrayList;
    }

    public static int X(byte[] bArr, int i2, k6 k6Var) throws zzkh {
        int d0 = d0(bArr, i2, k6Var);
        int i3 = k6Var.a;
        if (i3 < 0) {
            throw zzkh.b();
        } else if (i3 == 0) {
            k6Var.c = "";
            return d0;
        } else {
            k6Var.c = new String(bArr, d0, i3, v7.a);
            return d0 + i3;
        }
    }

    public static Map Y(m mVar) {
        HashMap hashMap = new HashMap();
        Objects.requireNonNull(mVar);
        Iterator it = new ArrayList(mVar.b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object W = W(mVar.h(str));
            if (W != null) {
                hashMap.put(str, W);
            }
        }
        return hashMap;
    }

    public static int Z(byte[] bArr, int i2, k6 k6Var) throws zzkh {
        int i3;
        int i4;
        int d0 = d0(bArr, i2, k6Var);
        int i5 = k6Var.a;
        if (i5 < 0) {
            throw zzkh.b();
        } else if (i5 == 0) {
            k6Var.c = "";
            return d0;
        } else {
            w9 w9Var = y9.a;
            int length = bArr.length;
            if ((d0 | i5 | ((length - d0) - i5)) >= 0) {
                int i6 = d0 + i5;
                char[] cArr = new char[i5];
                int i7 = 0;
                while (i3 < i6) {
                    byte b2 = bArr[i3];
                    if (!R(b2)) {
                        break;
                    }
                    d0 = i3 + 1;
                    cArr[i4] = (char) b2;
                    i7 = i4 + 1;
                }
                while (i3 < i6) {
                    int i8 = i3 + 1;
                    byte b3 = bArr[i3];
                    if (R(b3)) {
                        int i9 = i4 + 1;
                        cArr[i4] = (char) b3;
                        i3 = i8;
                        while (true) {
                            i4 = i9;
                            if (i3 >= i6) {
                                break;
                            }
                            byte b4 = bArr[i3];
                            if (!R(b4)) {
                                break;
                            }
                            i3++;
                            i9 = i4 + 1;
                            cArr[i4] = (char) b4;
                        }
                    } else if (b3 < -32) {
                        if (i8 < i6) {
                            int i10 = i8 + 1;
                            int i11 = i4 + 1;
                            byte b5 = bArr[i8];
                            if (b3 < -62 || U(b5)) {
                                throw zzkh.a();
                            }
                            cArr[i4] = (char) (((b3 & 31) << 6) | (b5 & 63));
                            i3 = i10;
                            i4 = i11;
                        } else {
                            throw zzkh.a();
                        }
                    } else if (b3 < -16) {
                        if (i8 < i6 - 1) {
                            int i12 = i8 + 1;
                            int i13 = i12 + 1;
                            int i14 = i4 + 1;
                            byte b6 = bArr[i8];
                            byte b7 = bArr[i12];
                            if (!U(b6)) {
                                if (b3 == -32) {
                                    if (b6 >= -96) {
                                        b3 = -32;
                                    }
                                }
                                if (b3 == -19) {
                                    if (b6 < -96) {
                                        b3 = -19;
                                    }
                                }
                                if (!U(b7)) {
                                    cArr[i4] = (char) (((b3 & 15) << AbstractJceStruct.ZERO_TAG) | ((b6 & 63) << 6) | (b7 & 63));
                                    i3 = i13;
                                    i4 = i14;
                                }
                            }
                            throw zzkh.a();
                        }
                        throw zzkh.a();
                    } else if (i8 < i6 - 2) {
                        int i15 = i8 + 1;
                        int i16 = i15 + 1;
                        int i17 = i16 + 1;
                        byte b8 = bArr[i8];
                        byte b9 = bArr[i15];
                        byte b10 = bArr[i16];
                        if (!U(b8)) {
                            if ((((b8 + 112) + (b3 << 28)) >> 30) == 0 && !U(b9) && !U(b10)) {
                                byte b11 = ((b3 & 7) << 18) | ((b8 & 63) << AbstractJceStruct.ZERO_TAG) | ((b9 & 63) << 6) | (b10 & 63);
                                cArr[i4] = (char) ((b11 >>> 10) + 55232);
                                cArr[i4 + 1] = (char) ((b11 & 1023) + AbstractJceStruct.BYTE);
                                i4 += 2;
                                i3 = i17;
                            }
                        }
                        throw zzkh.a();
                    } else {
                        throw zzkh.a();
                    }
                }
                k6Var.c = new String(cArr, 0, i4);
                return i6;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(d0), Integer.valueOf(i5)}));
        }
    }

    public static <TResult> TResult a(g.e.a.b.g.f<TResult> fVar) throws ExecutionException, InterruptedException {
        g.c.b.b.f.m("Must not be called on the main application thread");
        g.c.b.b.f.o(fVar, "Task must not be null");
        if (fVar.j()) {
            return x(fVar);
        }
        g.e.a.b.g.i iVar = new g.e.a.b.g.i();
        I(fVar, iVar);
        iVar.a.await();
        return x(fVar);
    }

    public static void a0(String str, int i2, List list) {
        if (list.size() != i2) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(list.size())}));
        }
    }

    public static <TResult> TResult b(g.e.a.b.g.f<TResult> fVar, long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        g.c.b.b.f.m("Must not be called on the main application thread");
        g.c.b.b.f.o(fVar, "Task must not be null");
        g.c.b.b.f.o(timeUnit, "TimeUnit must not be null");
        if (fVar.j()) {
            return x(fVar);
        }
        g.e.a.b.g.i iVar = new g.e.a.b.g.i();
        I(fVar, iVar);
        if (iVar.a.await(j2, timeUnit)) {
            return x(fVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static int b0(int i2, byte[] bArr, int i3, int i4, m9 m9Var, k6 k6Var) throws zzkh {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 == 0) {
                int j0 = j0(bArr, i3, k6Var);
                m9Var.c(i2, Long.valueOf(k6Var.b));
                return j0;
            } else if (i5 == 1) {
                m9Var.c(i2, Long.valueOf(k0(bArr, i3)));
                return i3 + 8;
            } else if (i5 == 2) {
                int d0 = d0(bArr, i3, k6Var);
                int i6 = k6Var.a;
                if (i6 < 0) {
                    throw zzkh.b();
                } else if (i6 <= bArr.length - d0) {
                    m9Var.c(i2, i6 == 0 ? s6.b : s6.y(bArr, d0, i6));
                    return d0 + i6;
                } else {
                    throw zzkh.d();
                }
            } else if (i5 == 3) {
                int i7 = (i2 & -8) | 4;
                m9 b2 = m9.b();
                int i8 = 0;
                while (true) {
                    if (i3 >= i4) {
                        break;
                    }
                    int d02 = d0(bArr, i3, k6Var);
                    int i9 = k6Var.a;
                    i8 = i9;
                    if (i9 == i7) {
                        i3 = d02;
                        break;
                    }
                    int b0 = b0(i8, bArr, d02, i4, b2, k6Var);
                    i8 = i9;
                    i3 = b0;
                }
                if (i3 > i4 || i8 != i7) {
                    throw zzkh.c();
                }
                m9Var.c(i2, b2);
                return i3;
            } else if (i5 == 5) {
                m9Var.c(i2, Integer.valueOf(D(bArr, i3)));
                return i3 + 4;
            } else {
                throw new zzkh("Protocol message contained an invalid tag (zero).");
            }
        } else {
            throw new zzkh("Protocol message contained an invalid tag (zero).");
        }
    }

    public static ExecutorService c(String str) {
        String str2 = str;
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new i0(str2, new AtomicLong(1)), new ThreadPoolExecutor.DiscardPolicy()));
        Runtime.getRuntime().addShutdownHook(new Thread(new j0(str, unconfigurableExecutorService, 2, TimeUnit.SECONDS), a.w("Crashlytics Shutdown Hook for ", str2)));
        return unconfigurableExecutorService;
    }

    public static void c0(String str, int i2, List list) {
        if (list.size() < i2) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(list.size())}));
        }
    }

    @Deprecated
    public static <TResult> g.e.a.b.g.f<TResult> d(Executor executor, Callable<TResult> callable) {
        g.c.b.b.f.o(executor, "Executor must not be null");
        g.c.b.b.f.o(callable, "Callback must not be null");
        b0 b0Var = new b0();
        executor.execute(new c0(b0Var, callable));
        return b0Var;
    }

    public static int d0(byte[] bArr, int i2, k6 k6Var) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return f0(b2, bArr, i3, k6Var);
        }
        k6Var.a = b2;
        return i3;
    }

    public static n<?> e(String str, String str2) {
        c cVar = new c(str, str2);
        n.b<g.e.b.t.f> a2 = n.a(g.e.b.t.f.class);
        a2.f3464d = 1;
        a2.d(new g.e.b.k.a(cVar));
        return a2.b();
    }

    public static void e0(String str, int i2, List list) {
        if (list.size() > i2) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(list.size())}));
        }
    }

    public static String f(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (i2 != 0) {
                if (Character.isUpperCase(charAt)) {
                    stringBuffer.append('_');
                }
                stringBuffer.append(charAt);
            }
            charAt = Character.toLowerCase(charAt);
            stringBuffer.append(charAt);
        }
        return stringBuffer.toString();
    }

    public static int f0(int i2, byte[] bArr, int i3, k6 k6Var) {
        int i4;
        int i5;
        int i6 = i2 & 127;
        int i7 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            i4 = b2 << 7;
        } else {
            int i8 = i6 | ((b2 & Byte.MAX_VALUE) << 7);
            int i9 = i7 + 1;
            byte b3 = bArr[i7];
            if (b3 >= 0) {
                i5 = b3 << 14;
            } else {
                i6 = i8 | ((b3 & Byte.MAX_VALUE) << 14);
                i7 = i9 + 1;
                byte b4 = bArr[i9];
                if (b4 >= 0) {
                    i4 = b4 << 21;
                } else {
                    i8 = i6 | ((b4 & Byte.MAX_VALUE) << 21);
                    i9 = i7 + 1;
                    byte b5 = bArr[i7];
                    if (b5 >= 0) {
                        i5 = b5 << 28;
                    } else {
                        int i10 = i8 | ((b5 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i11 = i9 + 1;
                            if (bArr[i9] < 0) {
                                i9 = i11;
                            } else {
                                k6Var.a = i10;
                                return i11;
                            }
                        }
                    }
                }
            }
            k6Var.a = i8 | i5;
            return i9;
        }
        k6Var.a = i6 | i4;
        return i7;
    }

    public static void g(List<n<?>> list) {
        Set<g.e.b.k.t> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator<n<?>> it = list.iterator();
        while (true) {
            int i2 = 0;
            if (it.hasNext()) {
                n next = it.next();
                g.e.b.k.t tVar = new g.e.b.k.t(next);
                Iterator<Class<? super T>> it2 = next.a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Class next2 = it2.next();
                        u uVar = new u(next2, !next.b(), (s) null);
                        if (!hashMap.containsKey(uVar)) {
                            hashMap.put(uVar, new HashSet());
                        }
                        Set set2 = (Set) hashMap.get(uVar);
                        if (set2.isEmpty() || uVar.b) {
                            set2.add(tVar);
                        } else {
                            throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{next2}));
                        }
                    }
                }
            } else {
                for (Set<g.e.b.k.t> it3 : hashMap.values()) {
                    for (g.e.b.k.t tVar2 : it3) {
                        for (v next3 : tVar2.a.b) {
                            if ((next3.c == 0) && (set = (Set) hashMap.get(new u(next3.a, next3.a(), (s) null))) != null) {
                                for (g.e.b.k.t tVar3 : set) {
                                    tVar2.b.add(tVar3);
                                    tVar3.c.add(tVar2);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set addAll : hashMap.values()) {
                    hashSet.addAll(addAll);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    g.e.b.k.t tVar4 = (g.e.b.k.t) it4.next();
                    if (tVar4.a()) {
                        hashSet2.add(tVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    g.e.b.k.t tVar5 = (g.e.b.k.t) hashSet2.iterator().next();
                    hashSet2.remove(tVar5);
                    i2++;
                    for (g.e.b.k.t next4 : tVar5.b) {
                        next4.c.remove(tVar5);
                        if (next4.a()) {
                            hashSet2.add(next4);
                        }
                    }
                }
                if (i2 != list.size()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it5 = hashSet.iterator();
                    while (it5.hasNext()) {
                        g.e.b.k.t tVar6 = (g.e.b.k.t) it5.next();
                        if (!tVar6.a() && !tVar6.b.isEmpty()) {
                            arrayList.add(tVar6.a);
                        }
                    }
                    throw new DependencyCycleException(arrayList);
                }
                return;
            }
        }
    }

    public static boolean g0(p pVar) {
        if (pVar == null) {
            return false;
        }
        Double d2 = pVar.d();
        return !d2.isNaN() && d2.doubleValue() >= 0.0d && d2.equals(Double.valueOf(Math.floor(d2.doubleValue())));
    }

    public static <TResult> g.e.a.b.g.f<TResult> h(TResult tresult) {
        b0 b0Var = new b0();
        b0Var.n(tresult);
        return b0Var;
    }

    public static int h0(int i2, byte[] bArr, int i3, int i4, u7 u7Var, k6 k6Var) {
        p7 p7Var = (p7) u7Var;
        int d0 = d0(bArr, i3, k6Var);
        while (true) {
            p7Var.h(k6Var.a);
            if (d0 >= i4) {
                break;
            }
            int d02 = d0(bArr, d0, k6Var);
            if (i2 != k6Var.a) {
                break;
            }
            d0 = d0(bArr, d02, k6Var);
        }
        return d0;
    }

    public static n<?> i(String str, g.e.b.t.g<Context> gVar) {
        n.b<g.e.b.t.f> a2 = n.a(g.e.b.t.f.class);
        a2.f3464d = 1;
        a2.a(new v(Context.class, 1, 0));
        a2.d(new g.e.b.t.b(str, gVar));
        return a2.b();
    }

    public static boolean i0(p pVar, p pVar2) {
        if (!pVar.getClass().equals(pVar2.getClass())) {
            return false;
        }
        if ((pVar instanceof g.e.a.b.e.c.u) || (pVar instanceof g.e.a.b.e.c.n)) {
            return true;
        }
        if (!(pVar instanceof i)) {
            return pVar instanceof t ? pVar.e().equals(pVar2.e()) : pVar instanceof g ? pVar.m().equals(pVar2.m()) : pVar == pVar2;
        }
        if (Double.isNaN(pVar.d().doubleValue()) || Double.isNaN(pVar2.d().doubleValue())) {
            return false;
        }
        return pVar.d().equals(pVar2.d());
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static int j0(byte[] bArr, int i2, k6 k6Var) {
        int i3 = i2 + 1;
        long j2 = (long) bArr[i2];
        if (j2 >= 0) {
            k6Var.b = j2;
            return i3;
        }
        int i4 = i3 + 1;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | (((long) (b2 & Byte.MAX_VALUE)) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            byte b3 = bArr[i4];
            i5 += 7;
            j3 |= ((long) (b3 & Byte.MAX_VALUE)) << i5;
            int i7 = i6;
            b2 = b3;
            i4 = i7;
        }
        k6Var.b = j3;
        return i4;
    }

    public static boolean k(Context context, int i2) {
        if (!o(context, i2, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            d a2 = d.a(context);
            Objects.requireNonNull(a2);
            if (packageInfo == null) {
                return false;
            }
            if (!d.d(packageInfo, false)) {
                if (!d.d(packageInfo, true)) {
                    return false;
                }
                if (!g.e.a.b.b.c.a(a2.a)) {
                    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    public static long k0(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:18|19|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean l(android.content.Context r4) {
        /*
            java.lang.Class<g.e.a.b.b.h.e> r0 = g.e.a.b.b.h.e.class
            monitor-enter(r0)
            android.content.Context r1 = r4.getApplicationContext()     // Catch:{ all -> 0x004b }
            android.content.Context r2 = a     // Catch:{ all -> 0x004b }
            if (r2 == 0) goto L_0x0018
            java.lang.Boolean r3 = b     // Catch:{ all -> 0x004b }
            if (r3 == 0) goto L_0x0018
            if (r2 == r1) goto L_0x0012
            goto L_0x0018
        L_0x0012:
            boolean r4 = r3.booleanValue()     // Catch:{ all -> 0x004b }
            monitor-exit(r0)
            return r4
        L_0x0018:
            r2 = 0
            b = r2     // Catch:{ all -> 0x004b }
            boolean r2 = j()     // Catch:{ all -> 0x004b }
            if (r2 == 0) goto L_0x0030
            android.content.pm.PackageManager r4 = r1.getPackageManager()     // Catch:{ all -> 0x004b }
            boolean r4 = r4.isInstantApp()     // Catch:{ all -> 0x004b }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x004b }
        L_0x002d:
            b = r4     // Catch:{ all -> 0x004b }
            goto L_0x0041
        L_0x0030:
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x003e }
            java.lang.String r2 = "com.google.android.instantapps.supervisor.InstantAppsRuntime"
            r4.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x003e }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x003e }
            b = r4     // Catch:{ ClassNotFoundException -> 0x003e }
            goto L_0x0041
        L_0x003e:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x004b }
            goto L_0x002d
        L_0x0041:
            a = r1     // Catch:{ all -> 0x004b }
            java.lang.Boolean r4 = b     // Catch:{ all -> 0x004b }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x004b }
            monitor-exit(r0)
            return r4
        L_0x004b:
            r4 = move-exception
            monitor-exit(r0)
            goto L_0x004f
        L_0x004e:
            throw r4
        L_0x004f:
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.b.h.e.l(android.content.Context):boolean");
    }

    public static List<g.f.a.i.b<?>> m(BufferedReader bufferedReader) throws SQLException {
        char c2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        while (true) {
            g.f.a.i.b bVar = new g.f.a.i.b();
            char c3 = 0;
            boolean z = false;
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null && !readLine.equals("# --table-end--")) {
                        int i2 = 2;
                        int i3 = -2;
                        if (readLine.equals("# --table-fields-start--")) {
                            ArrayList arrayList4 = new ArrayList();
                            while (true) {
                                try {
                                    String readLine2 = bufferedReader.readLine();
                                    if (readLine2 == null || readLine2.equals("# --table-fields-end--")) {
                                        break;
                                    }
                                    g.f.a.d.b bVar2 = g.f.a.d.g.a;
                                    g.f.a.d.f fVar = new g.f.a.d.f();
                                    boolean z2 = false;
                                    while (true) {
                                        try {
                                            String readLine3 = bufferedReader.readLine();
                                            if (readLine3 != null && !readLine3.equals("# --field-end--")) {
                                                if (readLine3.length() == 0 || readLine3.startsWith("#") || readLine3.equals("# --field-start--")) {
                                                    arrayList2 = arrayList3;
                                                    c2 = 0;
                                                    i2 = 2;
                                                    i3 = -2;
                                                } else {
                                                    String[] split = readLine3.split("=", i3);
                                                    if (split.length == i2) {
                                                        String str = split[c2];
                                                        String str2 = split[1];
                                                        if (str.equals("fieldName")) {
                                                            fVar.a = str2;
                                                        } else if (str.equals("columnName")) {
                                                            fVar.b = str2;
                                                        } else if (str.equals("dataPersister")) {
                                                            fVar.f3865d = g.f.a.d.d.valueOf(str2).a();
                                                        } else if (str.equals("defaultValue")) {
                                                            fVar.f3866e = str2;
                                                        } else if (str.equals("width")) {
                                                            fVar.f3867f = Integer.parseInt(str2);
                                                        } else if (str.equals("canBeNull")) {
                                                            fVar.f3868g = Boolean.parseBoolean(str2);
                                                        } else if (str.equals("id")) {
                                                            fVar.f3869h = Boolean.parseBoolean(str2);
                                                        } else if (str.equals("generatedId")) {
                                                            fVar.f3870i = Boolean.parseBoolean(str2);
                                                        } else if (str.equals("generatedIdSequence")) {
                                                            fVar.f3871j = str2;
                                                        } else if (str.equals("foreign")) {
                                                            fVar.f3872k = Boolean.parseBoolean(str2);
                                                        } else if (str.equals("useGetSet")) {
                                                            fVar.f3873l = Boolean.parseBoolean(str2);
                                                        } else {
                                                            if (str.equals("unknownEnumValue")) {
                                                                String[] split2 = str2.split("#", i3);
                                                                if (split2.length == i2) {
                                                                    try {
                                                                        Object[] enumConstants = Class.forName(split2[c2]).getEnumConstants();
                                                                        if (enumConstants != null) {
                                                                            Enum<?>[] enumArr = (Enum[]) enumConstants;
                                                                            int length = enumArr.length;
                                                                            int i4 = 0;
                                                                            boolean z3 = false;
                                                                            while (i4 < length) {
                                                                                Enum<?> enumR = enumArr[i4];
                                                                                ArrayList arrayList5 = arrayList3;
                                                                                if (enumR.name().equals(split2[1])) {
                                                                                    fVar.f3874m = enumR;
                                                                                    z3 = true;
                                                                                }
                                                                                i4++;
                                                                                arrayList3 = arrayList5;
                                                                            }
                                                                            arrayList2 = arrayList3;
                                                                            if (!z3) {
                                                                                throw new IllegalArgumentException(a.w("Invalid enum value name for unknownEnumvalue: ", str2));
                                                                            }
                                                                        } else {
                                                                            throw new IllegalArgumentException(a.w("Invalid class is not an Enum for unknownEnumValue: ", str2));
                                                                        }
                                                                    } catch (ClassNotFoundException unused) {
                                                                        throw new IllegalArgumentException(a.w("Unknown class specified for unknownEnumValue: ", str2));
                                                                    }
                                                                } else {
                                                                    throw new IllegalArgumentException(a.w("Invalid value for unknownEnumValue which should be in class#name format: ", str2));
                                                                }
                                                            } else {
                                                                arrayList2 = arrayList3;
                                                                if (str.equals("throwIfNull")) {
                                                                    fVar.n = Boolean.parseBoolean(str2);
                                                                } else if (str.equals("format")) {
                                                                    fVar.p = str2;
                                                                } else if (str.equals("unique")) {
                                                                    fVar.q = Boolean.parseBoolean(str2);
                                                                } else if (str.equals("uniqueCombo")) {
                                                                    fVar.r = Boolean.parseBoolean(str2);
                                                                } else if (str.equals("index")) {
                                                                    fVar.s = Boolean.parseBoolean(str2);
                                                                } else if (str.equals("indexName")) {
                                                                    fVar.s = true;
                                                                    fVar.t = str2;
                                                                } else if (str.equals("uniqueIndex")) {
                                                                    fVar.u = Boolean.parseBoolean(str2);
                                                                } else if (str.equals("uniqueIndexName")) {
                                                                    fVar.u = true;
                                                                    fVar.v = str2;
                                                                } else if (str.equals("foreignAutoRefresh")) {
                                                                    fVar.w = Boolean.parseBoolean(str2);
                                                                } else if (str.equals("maxForeignAutoRefreshLevel")) {
                                                                    fVar.x = Integer.parseInt(str2);
                                                                } else if (str.equals("persisterClass")) {
                                                                    try {
                                                                        fVar.y = Class.forName(str2);
                                                                    } catch (ClassNotFoundException unused2) {
                                                                        throw new IllegalArgumentException(a.w("Could not find persisterClass: ", str2));
                                                                    }
                                                                } else if (str.equals("allowGeneratedIdInsert")) {
                                                                    fVar.z = Boolean.parseBoolean(str2);
                                                                } else if (str.equals("columnDefinition")) {
                                                                    fVar.A = str2;
                                                                } else if (!str.equals("fullColumnDefinition")) {
                                                                    if (str.equals("foreignAutoCreate")) {
                                                                        fVar.B = Boolean.parseBoolean(str2);
                                                                    } else if (str.equals(Constants.Raft.VERSION)) {
                                                                        fVar.C = Boolean.parseBoolean(str2);
                                                                    } else if (str.equals("foreignColumnName")) {
                                                                        fVar.D = str2;
                                                                    } else if (str.equals("readOnly")) {
                                                                        fVar.E = Boolean.parseBoolean(str2);
                                                                    } else if (str.equals("foreignCollection")) {
                                                                        fVar.F = Boolean.parseBoolean(str2);
                                                                    } else if (str.equals("foreignCollectionEager")) {
                                                                        fVar.G = Boolean.parseBoolean(str2);
                                                                    } else if (str.equals("maxEagerForeignCollectionLevel") || str.equals("foreignCollectionMaxEagerLevel")) {
                                                                        fVar.H = Integer.parseInt(str2);
                                                                    } else if (!str.equals("foreignCollectionColumnName")) {
                                                                        if (str.equals("foreignCollectionOrderColumn") || str.equals("foreignCollectionOrderColumnName")) {
                                                                            fVar.I = str2;
                                                                        } else if (str.equals("foreignCollectionOrderAscending")) {
                                                                            fVar.J = Boolean.parseBoolean(str2);
                                                                        } else if (str.equals("foreignCollectionForeignColumnName") || str.equals("foreignCollectionForeignFieldName")) {
                                                                            fVar.K = str2;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            c2 = 0;
                                                            i2 = 2;
                                                            i3 = -2;
                                                            z2 = true;
                                                        }
                                                        arrayList2 = arrayList3;
                                                        c2 = 0;
                                                        i2 = 2;
                                                        i3 = -2;
                                                        z2 = true;
                                                    } else {
                                                        throw new SQLException(a.w("DatabaseFieldConfig reading from stream cannot parse line: ", readLine3));
                                                    }
                                                }
                                                arrayList3 = arrayList2;
                                            }
                                        } catch (IOException e2) {
                                            throw e.e.i.b.j("Could not read DatabaseFieldConfig from stream", e2);
                                        }
                                    }
                                    if (!z2) {
                                        fVar = null;
                                    }
                                    if (fVar == null) {
                                        break;
                                    }
                                    arrayList4.add(fVar);
                                } catch (IOException e3) {
                                    throw e.e.i.b.j("Could not read next field from config file", e3);
                                }
                            }
                            arrayList = arrayList3;
                            bVar.c = arrayList4;
                        } else {
                            arrayList = arrayList3;
                            if (readLine.length() != 0 && !readLine.startsWith("#") && !readLine.equals("# --table-start--")) {
                                String[] split3 = readLine.split("=", -2);
                                if (split3.length == 2) {
                                    String str3 = split3[0];
                                    String str4 = split3[1];
                                    if (str3.equals("dataClass")) {
                                        try {
                                            bVar.a = Class.forName(str4);
                                        } catch (ClassNotFoundException unused3) {
                                            throw new IllegalArgumentException(a.w("Unknown class specified for dataClass: ", str4));
                                        }
                                    } else if (str3.equals("tableName")) {
                                        bVar.b = str4;
                                    }
                                    c3 = 0;
                                    z = true;
                                    arrayList3 = arrayList;
                                } else {
                                    throw new SQLException(a.w("DatabaseTableConfig reading from stream cannot parse line: ", readLine));
                                }
                            }
                        }
                        c3 = 0;
                        arrayList3 = arrayList;
                    }
                } catch (IOException e4) {
                    throw e.e.i.b.j("Could not read DatabaseTableConfig from stream", e4);
                }
            }
            if (!z) {
                bVar = null;
            }
            if (bVar == null) {
                return arrayList3;
            }
            arrayList3.add(bVar);
        }
    }

    public static void n(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException, InvocationTargetException {
        Object obj2 = obj;
        StringBuffer stringBuffer3 = stringBuffer;
        StringBuffer stringBuffer4 = stringBuffer2;
        if (obj2 != null) {
            if (obj2 instanceof g.e.d.a.d) {
                int length = stringBuffer.length();
                if (str != null) {
                    stringBuffer4.append(stringBuffer3);
                    stringBuffer4.append(f(str));
                    stringBuffer4.append(" <\n");
                    stringBuffer3.append("  ");
                }
                Class<?> cls = obj.getClass();
                for (Field field : cls.getFields()) {
                    int modifiers = field.getModifiers();
                    String name = field.getName();
                    if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                        Class<?> type = field.getType();
                        Object obj3 = field.get(obj2);
                        if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                            n(name, obj3, stringBuffer3, stringBuffer4);
                        } else {
                            int length2 = obj3 == null ? 0 : Array.getLength(obj3);
                            for (int i2 = 0; i2 < length2; i2++) {
                                n(name, Array.get(obj3, i2), stringBuffer3, stringBuffer4);
                            }
                        }
                    }
                }
                for (Method name2 : cls.getMethods()) {
                    String name3 = name2.getName();
                    if (name3.startsWith("set")) {
                        String substring = name3.substring(3);
                        try {
                            if (((Boolean) cls.getMethod("has" + substring, new Class[0]).invoke(obj2, new Object[0])).booleanValue()) {
                                n(substring, cls.getMethod("get" + substring, new Class[0]).invoke(obj2, new Object[0]), stringBuffer3, stringBuffer4);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                }
                if (str != null) {
                    stringBuffer3.setLength(length);
                    stringBuffer4.append(stringBuffer3);
                    stringBuffer4.append(">\n");
                }
            } else if (obj2 instanceof Map) {
                String f2 = f(str);
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    stringBuffer4.append(stringBuffer3);
                    stringBuffer4.append(f2);
                    stringBuffer4.append(" <\n");
                    int length3 = stringBuffer.length();
                    stringBuffer3.append("  ");
                    n("key", entry.getKey(), stringBuffer3, stringBuffer4);
                    n("value", entry.getValue(), stringBuffer3, stringBuffer4);
                    stringBuffer3.setLength(length3);
                    stringBuffer4.append(stringBuffer3);
                    stringBuffer4.append(">\n");
                }
            } else {
                String f3 = f(str);
                stringBuffer4.append(stringBuffer3);
                stringBuffer4.append(f3);
                stringBuffer4.append(": ");
                if (obj2 instanceof String) {
                    String str2 = (String) obj2;
                    if (!str2.startsWith("http") && str2.length() > 200) {
                        str2 = str2.substring(0, 200) + "[...]";
                    }
                    int length4 = str2.length();
                    StringBuilder sb = new StringBuilder(length4);
                    for (int i3 = 0; i3 < length4; i3++) {
                        char charAt = str2.charAt(i3);
                        if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                            sb.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                        } else {
                            sb.append(charAt);
                        }
                    }
                    String sb2 = sb.toString();
                    stringBuffer4.append("\"");
                    stringBuffer4.append(sb2);
                    stringBuffer4.append("\"");
                } else if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    stringBuffer4.append('\"');
                    for (byte b2 : bArr) {
                        byte b3 = b2 & 255;
                        if (b3 == 92 || b3 == 34) {
                            stringBuffer4.append('\\');
                        } else if (b3 < 32 || b3 >= Byte.MAX_VALUE) {
                            stringBuffer4.append(String.format("\\%03o", new Object[]{Integer.valueOf(b3)}));
                        }
                        stringBuffer4.append((char) b3);
                    }
                    stringBuffer4.append('\"');
                } else {
                    stringBuffer4.append(obj2);
                }
                stringBuffer4.append("\n");
            }
        }
    }

    @TargetApi(19)
    public static boolean o(Context context, int i2, String str) {
        g.e.a.b.b.i.a a2 = g.e.a.b.b.i.b.a(context);
        Objects.requireNonNull(a2);
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a2.a.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i2, str);
                return true;
            }
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static g.e.a.b.g.f<Void> p(Collection<? extends g.e.a.b.g.f<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return h((Object) null);
        }
        for (g.e.a.b.g.f requireNonNull : collection) {
            Objects.requireNonNull(requireNonNull, "null tasks are not accepted");
        }
        b0 b0Var = new b0();
        k kVar = new k(collection.size(), b0Var);
        for (g.e.a.b.g.f I : collection) {
            I(I, kVar);
        }
        return b0Var;
    }

    public static double q(double d2) {
        if (Double.isNaN(d2)) {
            return 0.0d;
        }
        if (Double.isInfinite(d2) || d2 == 0.0d || d2 == 0.0d) {
            return d2;
        }
        double d3 = (double) (d2 > 0.0d ? 1 : -1);
        double floor = Math.floor(Math.abs(d2));
        Double.isNaN(d3);
        return floor * d3;
    }

    public static int r(byte[] bArr, int i2, k6 k6Var) throws zzkh {
        int d0 = d0(bArr, i2, k6Var);
        int i3 = k6Var.a;
        if (i3 < 0) {
            throw zzkh.b();
        } else if (i3 > bArr.length - d0) {
            throw zzkh.d();
        } else if (i3 == 0) {
            k6Var.c = s6.b;
            return d0;
        } else {
            k6Var.c = s6.y(bArr, d0, i3);
            return d0 + i3;
        }
    }

    public static p s(l lVar, p pVar, h4 h4Var, List list) {
        t tVar = (t) pVar;
        if (lVar.c(tVar.b)) {
            p h2 = lVar.h(tVar.b);
            if (h2 instanceof j) {
                return ((j) h2).a(h4Var, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", new Object[]{tVar.b}));
        } else if ("hasOwnProperty".equals(tVar.b)) {
            a0("hasOwnProperty", 1, list);
            return lVar.c(h4Var.b((p) list.get(0)).e()) ? p.J : p.K;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", new Object[]{tVar.b}));
        }
    }

    public static p t(z4 z4Var) {
        if (z4Var == null) {
            return p.E;
        }
        int B = z4Var.B() - 1;
        if (B == 1) {
            return z4Var.A() ? new t(z4Var.v()) : p.L;
        }
        if (B == 2) {
            return z4Var.z() ? new i(Double.valueOf(z4Var.s())) : new i((Double) null);
        }
        if (B == 3) {
            return z4Var.y() ? new g(Boolean.valueOf(z4Var.x())) : new g((Boolean) null);
        }
        if (B == 4) {
            List<z4> w = z4Var.w();
            ArrayList arrayList = new ArrayList();
            for (z4 t : w) {
                arrayList.add(t(t));
            }
            return new q(z4Var.u(), arrayList);
        }
        throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
    }

    public static c6 u(c6 c6Var) {
        return ((c6Var instanceof e6) || (c6Var instanceof d6)) ? c6Var : c6Var instanceof Serializable ? new d6(c6Var) : new e6(c6Var);
    }

    public static Object v(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{str, cls.getCanonicalName(), obj2.getClass().getCanonicalName()}));
    }

    public static Object w(i5 i5Var) {
        long clearCallingIdentity;
        try {
            return i5Var.c();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            Object c2 = i5Var.c();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return c2;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    public static <TResult> TResult x(g.e.a.b.g.f<TResult> fVar) throws ExecutionException {
        if (fVar.k()) {
            return fVar.h();
        }
        if (fVar.i()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(fVar.g());
    }

    public static String y(Context context) {
        try {
            return context.getResources().getResourcePackageName(2131820813);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static String z(s6 s6Var) {
        String str;
        StringBuilder sb = new StringBuilder(s6Var.h());
        for (int i2 = 0; i2 < s6Var.h(); i2++) {
            int c2 = s6Var.c(i2);
            if (c2 == 34) {
                str = "\\\"";
            } else if (c2 == 39) {
                str = "\\'";
            } else if (c2 != 92) {
                switch (c2) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case ConnectionResult.CANCELED:
                        str = "\\r";
                        break;
                    default:
                        if (c2 < 32 || c2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((c2 >>> 6) & 3) + 48));
                            sb.append((char) (((c2 >>> 3) & 7) + 48));
                            c2 = (c2 & 7) + 48;
                        }
                        sb.append((char) c2);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
