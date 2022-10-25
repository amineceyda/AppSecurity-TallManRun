package g.e.a.b.f.b;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzab;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzks;
import com.google.android.gms.measurement.internal.zzp;
import g.c.b.b.f;
import g.e.a.b.b.c;
import g.e.a.b.b.d;
import g.e.a.b.b.h.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class g5 extends u2 {
    public final k9 a;
    public Boolean b;
    public String c = null;

    public g5(k9 k9Var) {
        Objects.requireNonNull(k9Var, "null reference");
        this.a = k9Var;
    }

    public final void A(Runnable runnable) {
        if (this.a.b().t()) {
            runnable.run();
        } else {
            this.a.b().r(runnable);
        }
    }

    public final void B(zzp zzp) {
        Objects.requireNonNull(zzp, "null reference");
        f.k(zzp.zza);
        C(zzp.zza, false);
        this.a.Q().J(zzp.zzb, zzp.zzq);
    }

    public final void C(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.b == null) {
                        if (!"com.google.android.gms".equals(this.c) && !e.k(this.a.f3238l.a, Binder.getCallingUid())) {
                            if (!d.a(this.a.f3238l.a).b(Binder.getCallingUid())) {
                                z2 = false;
                                this.b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.b = Boolean.valueOf(z2);
                    }
                    if (this.b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e2) {
                    this.a.d().f3136f.b("Measurement Service called with invalid calling package. appId", f3.t(str));
                    throw e2;
                }
            }
            if (this.c == null) {
                Context context = this.a.f3238l.a;
                int callingUid = Binder.getCallingUid();
                boolean z3 = c.a;
                if (e.o(context, callingUid, str)) {
                    this.c = str;
                }
            }
            if (!str.equals(this.c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.a.d().f3136f.a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    public final void b(zzp zzp) {
        f.k(zzp.zza);
        Objects.requireNonNull(zzp.zzv, "null reference");
        y4 y4Var = new y4(this, zzp);
        if (this.a.b().t()) {
            y4Var.run();
        } else {
            this.a.b().s(y4Var);
        }
    }

    public final void c(long j2, String str, String str2, String str3) {
        A(new f5(this, str2, str3, str, j2));
    }

    public final void e(Bundle bundle, zzp zzp) {
        B(zzp);
        String str = zzp.zza;
        Objects.requireNonNull(str, "null reference");
        A(new o4(this, str, bundle));
    }

    public final List f(String str, String str2, boolean z, zzp zzp) {
        B(zzp);
        String str3 = zzp.zza;
        Objects.requireNonNull(str3, "null reference");
        try {
            List<o9> list = (List) ((FutureTask) this.a.b().p(new r4(this, str3, str, str2))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (o9 o9Var : list) {
                if (z || !q9.U(o9Var.c)) {
                    arrayList.add(new zzks(o9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.a.d().f3136f.c("Failed to query user properties. appId", f3.t(zzp.zza), e2);
            return Collections.emptyList();
        }
    }

    public final void g(zzab zzab, zzp zzp) {
        Objects.requireNonNull(zzab, "null reference");
        Objects.requireNonNull(zzab.zzc, "null reference");
        B(zzp);
        zzab zzab2 = new zzab(zzab);
        zzab2.zza = zzp.zza;
        A(new p4(this, zzab2, zzp));
    }

    public final List h(String str, String str2, String str3, boolean z) {
        C(str, true);
        try {
            List<o9> list = (List) ((FutureTask) this.a.b().p(new s4(this, str, str2, str3))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (o9 o9Var : list) {
                if (z || !q9.U(o9Var.c)) {
                    arrayList.add(new zzks(o9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.a.d().f3136f.c("Failed to get user properties as. appId", f3.t(str), e2);
            return Collections.emptyList();
        }
    }

    public final void i(zzp zzp) {
        f.k(zzp.zza);
        C(zzp.zza, false);
        A(new v4(this, zzp));
    }

    public final String o(zzp zzp) {
        B(zzp);
        k9 k9Var = this.a;
        try {
            return (String) ((FutureTask) k9Var.b().p(new g9(k9Var, zzp))).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            k9Var.d().f3136f.c("Failed to get app instance id. appId", f3.t(zzp.zza), e2);
            return null;
        }
    }

    public final void q(zzks zzks, zzp zzp) {
        Objects.requireNonNull(zzks, "null reference");
        B(zzp);
        A(new c5(this, zzks, zzp));
    }

    public final List r(String str, String str2, String str3) {
        C(str, true);
        try {
            return (List) ((FutureTask) this.a.b().p(new u4(this, str, str2, str3))).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.a.d().f3136f.b("Failed to get conditional user properties as", e2);
            return Collections.emptyList();
        }
    }

    public final void s(zzp zzp) {
        B(zzp);
        A(new e5(this, zzp));
    }

    public final void t(zzau zzau, zzp zzp) {
        Objects.requireNonNull(zzau, "null reference");
        B(zzp);
        A(new z4(this, zzau, zzp));
    }

    public final List u(String str, String str2, zzp zzp) {
        B(zzp);
        String str3 = zzp.zza;
        Objects.requireNonNull(str3, "null reference");
        try {
            return (List) ((FutureTask) this.a.b().p(new t4(this, str3, str, str2))).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.a.d().f3136f.b("Failed to get conditional user properties", e2);
            return Collections.emptyList();
        }
    }

    public final void w(zzp zzp) {
        B(zzp);
        A(new x4(this, zzp));
    }

    public final byte[] x(zzau zzau, String str) {
        f.k(str);
        Objects.requireNonNull(zzau, "null reference");
        C(str, true);
        this.a.d().f3143m.b("Log and bundle. event", this.a.f3238l.f3264m.d(zzau.zza));
        Objects.requireNonNull((g.e.a.b.b.h.c) this.a.e());
        long nanoTime = System.nanoTime() / 1000000;
        k4 b2 = this.a.b();
        b5 b5Var = new b5(this, zzau, str);
        b2.k();
        i4 i4Var = new i4(b2, b5Var, true);
        if (Thread.currentThread() == b2.c) {
            i4Var.run();
        } else {
            b2.u(i4Var);
        }
        try {
            byte[] bArr = (byte[]) i4Var.get();
            if (bArr == null) {
                this.a.d().f3136f.b("Log and bundle returned null. appId", f3.t(str));
                bArr = new byte[0];
            }
            Objects.requireNonNull((g.e.a.b.b.h.c) this.a.e());
            this.a.d().f3143m.d("Log and bundle processed. event, size, time_ms", this.a.f3238l.f3264m.d(zzau.zza), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e2) {
            this.a.d().f3136f.d("Failed to log and bundle. appId, event, error", f3.t(str), this.a.f3238l.f3264m.d(zzau.zza), e2);
            return null;
        }
    }
}
