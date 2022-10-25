package g.c.b.b.k;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;

public final /* synthetic */ class l implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f2297d;

    public /* synthetic */ l(Context context, int i2, String str) {
        this.b = context;
        this.c = i2;
        this.f2297d = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        Context context = this.b;
        int i3 = this.c;
        String str = this.f2297d;
        dialogInterface.dismiss();
        if (Build.VERSION.SDK_INT >= 26) {
            q.d(context, i3, str);
        }
        ((Activity) context).finish();
    }
}
