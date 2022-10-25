package g.d.a.l.s;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

public class n extends b<InputStream> {
    public n(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    public void c(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    public Object d(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
