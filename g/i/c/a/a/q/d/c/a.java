package g.i.c.a.a.q.d.c;

import android.content.Context;
import android.text.TextUtils;
import g.i.c.a.a.b0.f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

public class a {
    public static final Set<String> b = new HashSet();
    public String a = null;

    public static class b {
        public static a a = new a((C0176a) null);
    }

    public a(C0176a aVar) {
    }

    public final String a() {
        String str;
        if (TextUtils.isEmpty(this.a)) {
            Context c = f.c();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = null;
            try {
                InputStream open = c.getAssets().open("js/js_api_source.js");
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = open.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                str = byteArrayOutputStream.toString();
                g.c.b.b.f.v0("readAssets", str);
                try {
                    byteArrayOutputStream.close();
                    open.close();
                } catch (IOException e2) {
                    g.c.b.b.f.x("BaseUtils", "exception " + e2);
                }
            } catch (Exception e3) {
                g.c.b.b.f.x("readAssets", e3.getMessage());
                try {
                    byteArrayOutputStream.close();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e4) {
                    g.c.b.b.f.x("BaseUtils", "exception " + e4);
                }
                str = "";
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e5) {
                    g.c.b.b.f.x("BaseUtils", "exception " + e5);
                }
                throw th;
            }
            this.a = str;
        }
        return this.a;
    }
}
