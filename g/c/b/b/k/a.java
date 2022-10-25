package g.c.b.b.k;

import android.widget.TextView;
import com.apkpure.components.installer.ui.InstallApksActivity;
import i.o.c.h;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ InstallApksActivity b;
    public final /* synthetic */ String c;

    public /* synthetic */ a(InstallApksActivity installApksActivity, String str) {
        this.b = installApksActivity;
        this.c = str;
    }

    public final void run() {
        InstallApksActivity installApksActivity = this.b;
        String str = this.c;
        InstallApksActivity.a aVar = InstallApksActivity.r;
        h.e(installApksActivity, "this$0");
        h.e(str, "$label");
        g.c.b.b.g.a aVar2 = installApksActivity.f343l;
        if (aVar2 != null) {
            TextView textView = aVar2.f2254l;
            if (str.length() == 0) {
                str = "";
            }
            textView.setText(str);
            return;
        }
        h.k("binding");
        throw null;
    }
}
