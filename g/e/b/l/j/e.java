package g.e.b.l.j;

import android.content.Context;
import g.e.b.l.j.j.l;
import java.io.IOException;

public class e {
    public final Context a;
    public b b = null;

    public class b {
        public final String a;
        public final String b;

        public b(e eVar, a aVar) {
            int f2 = l.f(eVar.a, "com.google.firebase.crashlytics.unity_version", "string");
            if (f2 != 0) {
                this.a = "Unity";
                String string = eVar.a.getResources().getString(f2);
                this.b = string;
                f fVar = f.a;
                fVar.e("Unity Editor version is: " + string);
                return;
            }
            boolean z = false;
            try {
                if (eVar.a.getAssets() != null) {
                    String[] list = eVar.a.getAssets().list("flutter_assets");
                    if (list != null && list.length > 0) {
                        z = true;
                    }
                }
            } catch (IOException unused) {
            }
            if (z) {
                this.a = "Flutter";
                this.b = null;
                f.a.e("Development platform is: Flutter");
                return;
            }
            this.a = null;
            this.b = null;
        }
    }

    public e(Context context) {
        this.a = context;
    }
}
