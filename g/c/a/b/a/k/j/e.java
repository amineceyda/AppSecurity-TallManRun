package g.c.a.b.a.k.j;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.apkpure.aegon.application.RealApplicationLike;
import e.e.f.b;
import g.c.a.b.a.k.f;
import g.c.a.h.a.a;
import g.c.a.m.l;
import g.i.c.a.a.i.b;
import java.util.Objects;

public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ o b;

    public /* synthetic */ e(o oVar) {
        this.b = oVar;
    }

    public final void onClick(View view) {
        f fVar = this.b.c;
        Objects.requireNonNull(fVar);
        Context context = RealApplicationLike.getContext();
        String f2 = fVar.f();
        int i2 = a.a;
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").encodedAuthority("api.pureapk.com").appendEncodedPath(String.format("m/v%s/%s", new Object[]{"3", "page/report-content.html"})).appendQueryParameter("hl", b.A(l.b()));
        if (!TextUtils.isEmpty(f2)) {
            appendQueryParameter.appendQueryParameter("pkg", f2);
        }
        g.c.a.g.d.a.d(context, appendQueryParameter.build().toString());
        b.C0166b.a.j(view);
    }
}
