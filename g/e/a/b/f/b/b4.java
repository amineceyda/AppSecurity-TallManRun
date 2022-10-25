package g.e.a.b.f.b;

import com.tencent.raft.codegenmeta.utils.Constants;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final /* synthetic */ class b4 implements Callable {
    public final /* synthetic */ g4 a;
    public final /* synthetic */ String b;

    public /* synthetic */ b4(g4 g4Var, String str) {
        this.a = g4Var;
        this.b = str;
    }

    public final Object call() {
        g4 g4Var = this.a;
        String str = this.b;
        k kVar = g4Var.b.c;
        k9.I(kVar);
        w4 C = kVar.C(str);
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.Raft.PLATFORM, "android");
        hashMap.put("package_name", str);
        g4Var.a.f3258g.p();
        hashMap.put("gmp_version", 55005L);
        if (C != null) {
            String O = C.O();
            if (O != null) {
                hashMap.put("app_version", O);
            }
            hashMap.put("app_version_int", Long.valueOf(C.A()));
            hashMap.put("dynamite_version", Long.valueOf(C.D()));
        }
        return hashMap;
    }
}
