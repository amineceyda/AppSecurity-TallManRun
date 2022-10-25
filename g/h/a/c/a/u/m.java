package g.h.a.c.a.u;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import g.c.b.b.f;
import g.i.c.a.a.q.d.c.a;
import java.util.Objects;
import java.util.Set;

public final class m extends WebChromeClient {
    public Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        return defaultVideoPoster == null ? Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565) : defaultVideoPoster;
    }

    @Override
    public void onProgressChanged(WebView webView, int i2) {
        Set<String> set = a.b;
        a aVar = a.b.a;
        Objects.requireNonNull(aVar);
        if (webView != null) {
            String str = webView.hashCode() + "";
            if (i2 >= 25) {
                Set<String> set2 = a.b;
                if (!set2.contains(str)) {
                    boolean z = false;
                    if (!g.i.c.a.a.n.d.a.a.a) {
                        f.w0("JsInjector", "webView report not support, don't inject js source!");
                    } else if (!TextUtils.isEmpty(aVar.a())) {
                        StringBuilder i3 = g.a.a.a.a.i("javascript:");
                        i3.append(aVar.a());
                        g.h.a.a.N(webView, i3.toString());
                        z = true;
                    }
                    if (z) {
                        set2.add(str);
                    }
                }
            }
        }
        super.onProgressChanged(webView, i2);
    }
}
