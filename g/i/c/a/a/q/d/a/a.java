package g.i.c.a.a.q.d.a;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import g.c.b.b.f;
import g.i.c.a.a.q.d.b.d.c;
import java.util.Map;

public class a extends WebView {
    public boolean b = false;
    public boolean c = false;

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public final void i() {
        boolean z;
        if (!g.i.c.a.a.n.d.a.a.a) {
            f.w0("JsBinderHelper", "webView report not support!");
            z = false;
        } else {
            f.w("JsBinderHelper", "on bind javascript bridge");
            z = true;
        }
        if (z) {
            if (!this.b) {
                this.b = true;
                addJavascriptInterface(new g.i.c.a.a.q.d.b.c.a(this), "DTJsBridgeInterface");
            }
            if (!this.c) {
                this.c = true;
                addJavascriptInterface(new c(this), "dtBridge");
            }
        }
    }

    public void loadData(String str, String str2, String str3) {
        super.loadData(str, str2, str3);
        i();
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        i();
    }

    public void loadUrl(String str) {
        super.loadUrl(str);
        i();
    }

    public void loadUrl(String str, Map<String, String> map) {
        super.loadUrl(str, map);
        i();
    }
}
