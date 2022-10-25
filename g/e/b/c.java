package g.e.b;

import android.content.Context;
import com.google.firebase.FirebaseCommonRegistrar;
import g.e.b.t.g;

public final /* synthetic */ class c implements g {
    public static final /* synthetic */ c a = new c();

    public final String a(Object obj) {
        Context context = (Context) obj;
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
    }
}
