package g.d.a.l.s;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.HttpException;
import g.d.a.e;
import g.d.a.l.s.d;
import g.d.a.l.u.g;
import g.d.a.r.c;
import g.d.a.r.f;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

public class j implements d<InputStream> {

    /* renamed from: g  reason: collision with root package name */
    public static final b f2420g = new a();
    public final g b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public HttpURLConnection f2421d;

    /* renamed from: e  reason: collision with root package name */
    public InputStream f2422e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f2423f;

    public static class a implements b {
    }

    public interface b {
    }

    public j(g gVar, int i2) {
        this.b = gVar;
        this.c = i2;
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    public void b() {
        InputStream inputStream = this.f2422e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f2421d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f2421d = null;
    }

    public final InputStream c(URL url, int i2, URL url2, Map<String, String> map) throws IOException {
        if (i2 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f2421d = (HttpURLConnection) url.openConnection();
            for (Map.Entry next : map.entrySet()) {
                this.f2421d.addRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            this.f2421d.setConnectTimeout(this.c);
            this.f2421d.setReadTimeout(this.c);
            boolean z = false;
            this.f2421d.setUseCaches(false);
            this.f2421d.setDoInput(true);
            this.f2421d.setInstanceFollowRedirects(false);
            this.f2421d.connect();
            this.f2422e = this.f2421d.getInputStream();
            if (this.f2423f) {
                return null;
            }
            int responseCode = this.f2421d.getResponseCode();
            int i3 = responseCode / 100;
            if (i3 == 2) {
                HttpURLConnection httpURLConnection = this.f2421d;
                if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                    this.f2422e = new c(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
                } else {
                    if (Log.isLoggable("HttpUrlFetcher", 3)) {
                        StringBuilder i4 = g.a.a.a.a.i("Got non empty content encoding: ");
                        i4.append(httpURLConnection.getContentEncoding());
                        Log.d("HttpUrlFetcher", i4.toString());
                    }
                    this.f2422e = httpURLConnection.getInputStream();
                }
                return this.f2422e;
            }
            if (i3 == 3) {
                z = true;
            }
            if (z) {
                String headerField = this.f2421d.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    b();
                    return c(url3, i2 + 1, url, map);
                }
                throw new HttpException("Received empty or null redirect url");
            } else if (responseCode == -1) {
                throw new HttpException(g.a.a.a.a.q("Http request failed with status code: ", responseCode), responseCode);
            } else {
                throw new HttpException(this.f2421d.getResponseMessage(), responseCode);
            }
        } else {
            throw new HttpException("Too many (> 5) redirects!");
        }
    }

    public void cancel() {
        this.f2423f = true;
    }

    public g.d.a.l.a e() {
        return g.d.a.l.a.REMOTE;
    }

    public void f(e eVar, d.a<? super InputStream> aVar) {
        StringBuilder sb;
        int i2 = f.b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            g gVar = this.b;
            if (gVar.f2549f == null) {
                gVar.f2549f = new URL(gVar.d());
            }
            aVar.d(c(gVar.f2549f, 0, (URL) null, this.b.b.a()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(f.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (IOException e2) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e2);
            }
            aVar.c(e2);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder i3 = g.a.a.a.a.i("Finished http url fetcher fetch in ");
                i3.append(f.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", i3.toString());
            }
            throw th;
        }
    }
}
