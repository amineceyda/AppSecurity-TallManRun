package g.c.b.b.k;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.apkpure.components.installer.ui.TransparentActivity;
import g.c.b.b.c;
import g.c.b.b.h.b;
import g.c.b.b.j.a;
import g.c.b.b.l.e;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class q {
    public static final Logger a = LoggerFactory.getLogger("InstallerNoActivityLog");
    public static String b = "";
    public static a c = null;

    public static void a(boolean z, Context context, int i2) {
        boolean z2 = true;
        a.info("InstallerNoActivity install isRemove:{}, context: {}, commit:{}", Boolean.valueOf(z), context, Integer.valueOf(i2));
        if (z) {
            if (i2 != 3) {
                z2 = false;
            }
            e.f(context, z2);
        }
        c.d().u(context, i2, new p(), false);
    }

    public static void b(Context context, int i2, String str) {
        if (!(context instanceof Activity)) {
            a.info("无法使用 application context 展示 dialog");
            return;
        }
        e.f(context, i2 == 3);
        a.debug("No Activity showSetPermissionDialog {}, commit {}", (Object) context, (Object) Integer.valueOf(i2));
        b bVar = new b(context, false);
        bVar.f(2131821012);
        bVar.b(2131821022);
        bVar.a(false);
        bVar.e(17039370, new l(context, i2, str));
        bVar.d(17039360, new m(i2, context, str));
        bVar.show();
    }

    public static void c(Context context, int i2, String str) {
        b = str;
        c = null;
        int i3 = Build.VERSION.SDK_INT;
        boolean canRequestPackageInstalls = i3 >= 26 ? context.getPackageManager().canRequestPackageInstalls() : true;
        a.info("InstallerNoActivity startAction, context:{}, commit:{}, filePath:{}, have installer permission:{}", context, Integer.valueOf(i2), b, Boolean.valueOf(canRequestPackageInstalls));
        if (canRequestPackageInstalls) {
            a(true, context, i2);
        } else if (i3 < 26) {
        } else {
            if (!TextUtils.isEmpty(e.a(context)) || !TextUtils.isEmpty(e.h(context))) {
                b(context, i2, str);
            } else {
                d(context, i2, str);
            }
        }
    }

    public static void d(Context context, int i2, String str) {
        e.d(context, i2 == 3, str);
        a.info("request install use TransparentActivity");
        Intent intent = new Intent(context, TransparentActivity.class);
        intent.addFlags(268435456);
        Logger logger = TransparentActivity.f345d;
        intent.putExtra("intent_key_commit", i2);
        intent.putExtra("intent_key_task_path", str);
        context.startActivity(intent);
    }
}
