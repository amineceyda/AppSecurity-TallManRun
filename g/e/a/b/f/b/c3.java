package g.e.a.b.f.b;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.tencent.raft.codegenmeta.utils.Constants;
import g.e.a.b.b.h.f;

public final class c3 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f3115d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f3116e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f3117f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f3 f3118g;

    public c3(f3 f3Var, int i2, String str, Object obj, Object obj2, Object obj3) {
        this.f3118g = f3Var;
        this.b = i2;
        this.c = str;
        this.f3115d = obj;
        this.f3116e = obj2;
        this.f3117f = obj3;
    }

    public final void run() {
        char c2;
        f3 f3Var;
        s3 t = this.f3118g.a.t();
        if (t.n()) {
            f3 f3Var2 = this.f3118g;
            if (f3Var2.c == 0) {
                f fVar = f3Var2.a.f3258g;
                if (fVar.f3133d == null) {
                    synchronized (fVar) {
                        if (fVar.f3133d == null) {
                            ApplicationInfo applicationInfo = fVar.a.a.getApplicationInfo();
                            String a = f.a();
                            if (applicationInfo != null) {
                                String str = applicationInfo.processName;
                                fVar.f3133d = Boolean.valueOf(str != null && str.equals(a));
                            }
                            if (fVar.f3133d == null) {
                                fVar.f3133d = Boolean.TRUE;
                                fVar.a.d().f3136f.a("My process not in the list of running processes");
                            }
                        }
                    }
                }
                if (fVar.f3133d.booleanValue()) {
                    f3Var = this.f3118g;
                    b bVar = f3Var.a.f3257f;
                    c2 = 'C';
                } else {
                    f3Var = this.f3118g;
                    b bVar2 = f3Var.a.f3257f;
                    c2 = 'c';
                }
                f3Var.c = c2;
            }
            f3 f3Var3 = this.f3118g;
            if (f3Var3.f3134d < 0) {
                f3Var3.a.f3258g.p();
                f3Var3.f3134d = 55005;
            }
            char charAt = "01VDIWEA?".charAt(this.b);
            f3 f3Var4 = this.f3118g;
            char c3 = f3Var4.c;
            long j2 = f3Var4.f3134d;
            String u = f3.u(true, this.c, this.f3115d, this.f3116e, this.f3117f);
            StringBuilder sb = new StringBuilder(u.length() + 24);
            sb.append("2");
            sb.append(charAt);
            sb.append(c3);
            sb.append(j2);
            sb.append(Constants.KEY_INDEX_FILE_SEPARATOR);
            sb.append(u);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.c.substring(0, 1024);
            }
            q3 q3Var = t.f3337d;
            if (q3Var != null) {
                q3Var.f3301e.h();
                if (q3Var.f3301e.o().getLong(q3Var.a, 0) == 0) {
                    q3Var.a();
                }
                if (sb2 == null) {
                    sb2 = "";
                }
                long j3 = q3Var.f3301e.o().getLong(q3Var.b, 0);
                if (j3 <= 0) {
                    SharedPreferences.Editor edit = q3Var.f3301e.o().edit();
                    edit.putString(q3Var.c, sb2);
                    edit.putLong(q3Var.b, 1);
                    edit.apply();
                    return;
                }
                long nextLong = q3Var.f3301e.a.A().s().nextLong();
                long j4 = j3 + 1;
                SharedPreferences.Editor edit2 = q3Var.f3301e.o().edit();
                if ((Long.MAX_VALUE & nextLong) < Long.MAX_VALUE / j4) {
                    edit2.putString(q3Var.c, sb2);
                }
                edit2.putLong(q3Var.b, j4);
                edit2.apply();
                return;
            }
            return;
        }
        Log.println(6, this.f3118g.w(), "Persisted config not initialized. Not logging error/warn");
    }
}
