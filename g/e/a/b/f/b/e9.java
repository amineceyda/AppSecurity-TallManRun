package g.e.a.b.f.b;

import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import g.e.a.b.b.h.c;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class e9 implements h3 {
    public final /* synthetic */ String a;
    public final /* synthetic */ k9 b;

    public e9(k9 k9Var, String str) {
        this.b = k9Var;
        this.a = str;
    }

    /* JADX INFO: finally extract failed */
    public final void a(String str, int i2, Throwable th, byte[] bArr, Map map) {
        k kVar;
        k9 k9Var = this.b;
        k9Var.b().h();
        k9Var.g();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                k9Var.t = false;
                k9Var.B();
                throw th2;
            }
        }
        List<Long> list = k9Var.x;
        Objects.requireNonNull(list, "null reference");
        k9Var.x = null;
        if (i2 != 200) {
            if (i2 == 204) {
                i2 = 204;
            }
            k9Var.d().n.c("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th);
            p3 p3Var = k9Var.f3235i.f3187k;
            Objects.requireNonNull((c) k9Var.e());
            p3Var.b(System.currentTimeMillis());
            if (i2 == 503 || i2 == 429) {
                p3 p3Var2 = k9Var.f3235i.f3185i;
                Objects.requireNonNull((c) k9Var.e());
                p3Var2.b(System.currentTimeMillis());
            }
            k kVar2 = k9Var.c;
            k9.I(kVar2);
            kVar2.Q(list);
            k9Var.D();
            k9Var.t = false;
            k9Var.B();
        }
        if (th == null) {
            try {
                p3 p3Var3 = k9Var.f3235i.f3186j;
                Objects.requireNonNull((c) k9Var.e());
                p3Var3.b(System.currentTimeMillis());
                k9Var.f3235i.f3187k.b(0);
                k9Var.D();
                k9Var.d().n.c("Successful upload. Got network response. code, size", Integer.valueOf(i2), Integer.valueOf(bArr.length));
                k kVar3 = k9Var.c;
                k9.I(kVar3);
                kVar3.O();
                try {
                    for (Long l2 : list) {
                        try {
                            kVar = k9Var.c;
                            k9.I(kVar);
                            long longValue = l2.longValue();
                            kVar.h();
                            kVar.i();
                            if (kVar.A().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e2) {
                            kVar.a.d().f3136f.b("Failed to delete a bundle in a queue table", e2);
                            throw e2;
                        } catch (SQLiteException e3) {
                            List list2 = k9Var.y;
                            if (list2 == null || !list2.contains(l2)) {
                                throw e3;
                            }
                        }
                    }
                    k kVar4 = k9Var.c;
                    k9.I(kVar4);
                    kVar4.m();
                    k kVar5 = k9Var.c;
                    k9.I(kVar5);
                    kVar5.P();
                    k9Var.y = null;
                    k3 k3Var = k9Var.b;
                    k9.I(k3Var);
                    if (!k3Var.l() || !k9Var.F()) {
                        k9Var.z = -1;
                        k9Var.D();
                    } else {
                        k9Var.u();
                    }
                    k9Var.o = 0;
                    k9Var.t = false;
                    k9Var.B();
                } catch (Throwable th3) {
                    k kVar6 = k9Var.c;
                    k9.I(kVar6);
                    kVar6.P();
                    throw th3;
                }
            } catch (SQLiteException e4) {
                k9Var.d().f3136f.b("Database error while trying to delete uploaded bundles", e4);
                Objects.requireNonNull((c) k9Var.e());
                k9Var.o = SystemClock.elapsedRealtime();
                k9Var.d().n.b("Disable upload, time", Long.valueOf(k9Var.o));
            }
        }
        k9Var.d().n.c("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th);
        p3 p3Var4 = k9Var.f3235i.f3187k;
        Objects.requireNonNull((c) k9Var.e());
        p3Var4.b(System.currentTimeMillis());
        p3 p3Var22 = k9Var.f3235i.f3185i;
        Objects.requireNonNull((c) k9Var.e());
        p3Var22.b(System.currentTimeMillis());
        k kVar22 = k9Var.c;
        k9.I(kVar22);
        kVar22.Q(list);
        k9Var.D();
        k9Var.t = false;
        k9Var.B();
    }
}
