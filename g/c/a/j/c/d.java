package g.c.a.j.c;

import android.content.Context;
import android.content.DialogInterface;
import android.preference.Preference;
import android.widget.TextView;
import com.apkpure.crabshell.GlobalConst;
import g.c.a.m.g;
import g.c.a.n.b.b;
import i.o.c.h;
import i.o.c.n;
import org.slf4j.Logger;

public final class d extends g {
    public final String c = "https://apkpure.com";

    /* renamed from: d  reason: collision with root package name */
    public final String f2037d = "support@apkpure.com";

    /* renamed from: e  reason: collision with root package name */
    public final String f2038e = "https://api.pureapk.com/m/v3/page/contact-us.html?hl=zh-Hans-CN&type=feedback&subject=&displayMessage=";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(String str) {
        super(str);
        h.e(str, "key");
    }

    public boolean a(Preference preference) {
        h.e(preference, "preference");
        Context context = this.b;
        if (context != null) {
            StringBuilder sb = new StringBuilder();
            Logger logger = g.a;
            sb.append(GlobalConst.VERSION_NAME);
            sb.append("\tbuild");
            sb.append(g.b());
            String sb2 = sb.toString();
            b bVar = new b(context, true);
            bVar.a.f35d = context.getString(2131820578, new Object[]{context.getString(2131820584)});
            bVar.l(context.getString(2131820577, new Object[]{h.j(sb2, "<br>"), this.c, this.f2037d}));
            bVar.n(17039370, (DialogInterface.OnClickListener) null);
            c cVar = new c(context, this);
            bVar.f2116k = bVar.c.getText(2131820826);
            bVar.f2117l = cVar;
            e.b.c.g e2 = bVar.e();
            n nVar = new n();
            b bVar2 = new b(nVar);
            TextView textView = (TextView) e2.findViewById(2131297129);
            if (textView != null) {
                textView.setOnClickListener(new a(nVar, bVar2));
            }
        }
        return false;
    }
}
