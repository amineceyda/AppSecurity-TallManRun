package g.c.a.o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.apkpure.aegon.widgets.textview.RoundTextView;
import g.c.a.o.b.b;
import i.o.c.h;
import java.util.ArrayList;

public final class a extends b<String> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f2119d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Context f2120e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(boolean z, Context context, ArrayList<String> arrayList) {
        super(arrayList);
        this.f2119d = z;
        this.f2120e = context;
    }

    public View a(g.c.a.o.b.a aVar, int i2, Object obj) {
        String str;
        TextView textView;
        String str2 = (String) obj;
        h.e(aVar, "parent");
        h.e(str2, "text");
        if (!this.f2119d || i2 != 0) {
            View inflate = View.inflate(this.f2120e, 2131492937, (ViewGroup) null);
            View findViewById = inflate.findViewById(2131297912);
            h.d(findViewById, "appFlagLl.findViewById(R.id.xapk_flag_tv)");
            ((RoundTextView) findViewById).setText(str2);
            str = "{\n                    val appFlagLl = View.inflate(this@buildAppFlag, R.layout.app_flag_rtv, null)\n                    val appFlagRtv: RoundTextView = appFlagLl.findViewById(R.id.xapk_flag_tv)\n                    appFlagRtv.text = text\n                    appFlagLl\n                }";
            textView = inflate;
        } else {
            TextView textView2 = (TextView) View.inflate(this.f2120e, 2131492938, (ViewGroup) null).findViewById(2131296449);
            textView2.setText(str2);
            str = "{\n                    val appDescView = View.inflate(this@buildAppFlag, R.layout.app_title_view, null)\n                    val appTitle = appDescView.findViewById<TextView>(R.id.app_title_tv)\n                    appTitle.text = text\n                    appTitle\n                }";
            textView = textView2;
        }
        h.d(textView, str);
        return textView;
    }
}
