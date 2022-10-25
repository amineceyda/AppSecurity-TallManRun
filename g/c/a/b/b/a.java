package g.c.a.b.b;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Build;
import g.c.a.g.a.o.c;
import g.c.a.i.d;
import i.o.c.h;
import i.o.c.o;
import java.util.Objects;
import org.slf4j.Logger;

public final /* synthetic */ class a implements DialogInterface.OnClickListener {
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Activity f1909d;

    public /* synthetic */ a(String str, int i2, Activity activity) {
        this.b = str;
        this.c = i2;
        this.f1909d = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        String str = this.b;
        int i3 = this.c;
        Activity activity = this.f1909d;
        h.e(str, "$filePath");
        dialogInterface.dismiss();
        o oVar = new o();
        T c2 = c.b().c();
        if (c2 == null || c2.isDestroyed()) {
            Logger logger = d.b;
            logger.info("Get top activity is not Activity or is null");
            T a = c.b().a();
            if (a == null || a.isDestroyed()) {
                logger.info("Get main activity is not Activity or is null");
                Objects.requireNonNull(a, "null cannot be cast to non-null type android.app.Activity");
            }
            c2 = a;
        }
        oVar.element = c2;
        h.e(activity, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            SharedPreferences sharedPreferences = activity.getSharedPreferences("install_manager_config", 0);
            h.d(sharedPreferences, "context.getSharedPreferences(PREFERENCE_NAME_INSTALL_MANAGER_CONFIG, Context.MODE_PRIVATE)");
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("need_restart_for_storage_permission", true);
            edit.apply();
        }
        d dVar = new d();
        dVar.d("android.permission.WRITE_EXTERNAL_STORAGE");
        dVar.b(new e(oVar, str, i3));
        dVar.e((Activity) oVar.element, 2001);
    }
}
