package f.a.a.b.q.d;

import f.a.a.b.w.d;
import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

public class b extends d {

    /* renamed from: e  reason: collision with root package name */
    public URL f1736e;

    /* renamed from: f  reason: collision with root package name */
    public List<File> f1737f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public List<Long> f1738g = new ArrayList();

    public final void s(URL url) {
        File file;
        if ("file".equals(url.getProtocol())) {
            file = new File(URLDecoder.decode(url.getFile()));
        } else {
            n("URL [" + url + "] is not of type file");
            file = null;
        }
        if (file != null) {
            this.f1737f.add(file);
            this.f1738g.add(Long.valueOf(file.lastModified()));
        }
    }
}
