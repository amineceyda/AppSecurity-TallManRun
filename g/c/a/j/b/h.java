package g.c.a.j.b;

import android.content.Context;
import android.preference.Preference;
import com.apkpure.aegon.application.RealApplicationLike;
import com.tencent.crabshell.builder.ShellBuilderService;
import g.c.c.k;
import g.c.c.n.f;
import g.h.a.c.a.t.d;
import java.util.Objects;

public final class h extends c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(String str) {
        super(str);
        i.o.c.h.e(str, "key");
    }

    public boolean a(Preference preference) {
        String str;
        i.o.c.h.e(preference, "preference");
        Context context = this.b;
        if (context != null) {
            d.b(context, i.o.c.h.j("Click ", preference.getTitle()));
        }
        String key = preference.getKey();
        if (key == null) {
            return false;
        }
        switch (key.hashCode()) {
            case -1992116135:
                str = "developer_version_show";
                break;
            case -1969796570:
                str = "developer_install";
                break;
            case -1828849068:
                if (!key.equals("developer_load_crab")) {
                    return false;
                }
                k.a().c(this.b, "/sdcard/update.apk");
                return false;
            case -608612918:
                if (!key.equals("developer_restart_process")) {
                    return false;
                }
                g.c.a.g.a.o.d.b(RealApplicationLike.getContext());
                return false;
            case 303264867:
                if (!key.equals("developer_fetch_crab_version")) {
                    return false;
                }
                f.a();
                return false;
            case 1612919092:
                if (!key.equals("developer_roll_back")) {
                    return false;
                }
                k a = k.a();
                Context context2 = RealApplicationLike.getContext();
                Objects.requireNonNull(a);
                new ShellBuilderService().cleanLastVersion(context2);
                a.a = true;
                return false;
            default:
                return false;
        }
        key.equals(str);
        return false;
    }

    public void c(Context context, Preference preference) {
        this.b = context;
    }
}
