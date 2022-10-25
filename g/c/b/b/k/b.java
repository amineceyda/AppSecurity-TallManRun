package g.c.b.b.k;

import android.widget.TextView;
import com.apkpure.components.installer.ui.InstallApksActivity;
import g.c.b.b.j.a;
import i.o.c.h;
import java.util.Arrays;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ TextView b;
    public final /* synthetic */ boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ InstallApksActivity f2295d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a f2296e;

    public /* synthetic */ b(TextView textView, boolean z, InstallApksActivity installApksActivity, a aVar) {
        this.b = textView;
        this.c = z;
        this.f2295d = installApksActivity;
        this.f2296e = aVar;
    }

    public final void run() {
        String str;
        TextView textView = this.b;
        boolean z = this.c;
        InstallApksActivity installApksActivity = this.f2295d;
        a aVar = this.f2296e;
        InstallApksActivity.a aVar2 = InstallApksActivity.r;
        h.e(textView, "$this_apply");
        h.e(installApksActivity, "this$0");
        h.e(aVar, "$installTask");
        if (z) {
            String string = installApksActivity.getString(2131821016);
            h.d(string, "getString(R.string.installer_installing_obb)");
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.f2275h);
            sb.append('%');
            str = String.format(string, Arrays.copyOf(new Object[]{sb.toString()}, 1));
        } else {
            String string2 = installApksActivity.getString(2131821011);
            h.d(string2, "getString(R.string.installer_extracting_apk)");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aVar.f2275h);
            sb2.append('%');
            str = String.format(string2, Arrays.copyOf(new Object[]{sb2.toString()}, 1));
        }
        h.d(str, "java.lang.String.format(format, *args)");
        textView.setText(str);
        if (aVar.f2275h == 100) {
            textView.setText(installApksActivity.getString(2131821014));
        }
        if (aVar.f2275h == 100 && h.a(aVar.f2273f, ".apk")) {
            installApksActivity.f344m = true;
        }
    }
}
