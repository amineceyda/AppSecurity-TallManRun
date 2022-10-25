package g.e.a.a.e;

import com.google.firebase.encoders.EncodingException;
import com.tencent.beacon.base.net.adapter.AbstractNetAdapter;
import com.tencent.raft.measure.report.ATTAReporter;
import e.e.d.l.a;
import g.e.a.a.e.c;
import g.e.a.a.e.d.m;
import g.e.a.a.e.d.s;
import g.e.b.n.i.d;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Objects;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final /* synthetic */ class b {
    public final /* synthetic */ c a;

    public /* synthetic */ b(c cVar) {
        this.a = cVar;
    }

    public final Object a(Object obj) {
        GZIPOutputStream gZIPOutputStream;
        InputStream gZIPInputStream;
        c cVar = this.a;
        c.a aVar = (c.a) obj;
        Objects.requireNonNull(cVar);
        a.t("CctTransportBackend", "Making request to: %s", aVar.a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.a.openConnection();
        httpURLConnection.setConnectTimeout(AbstractNetAdapter.CONNECT_TIMEOUT);
        httpURLConnection.setReadTimeout(cVar.f2685g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[]{"3.1.2"}));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty(ATTAReporter.KEY_CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
                ((d) cVar.a).a(aVar.b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                a.P("CctTransportBackend", "Status Code: " + responseCode);
                a.P("CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField(ATTAReporter.KEY_CONTENT_TYPE));
                a.P("CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new c.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                }
                if (responseCode != 200) {
                    return new c.b(responseCode, (URL) null, 0);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                    c.b bVar = new c.b(responseCode, (URL) null, ((m) s.a(new BufferedReader(new InputStreamReader(gZIPInputStream)))).a);
                    if (gZIPInputStream != null) {
                        gZIPInputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
                throw th;
                throw th;
            } catch (Throwable th3) {
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th3;
            }
        } catch (ConnectException | UnknownHostException e2) {
            a.w("CctTransportBackend", "Couldn't open connection, returning with 500", e2);
            return new c.b(500, (URL) null, 0);
        } catch (EncodingException | IOException e3) {
            a.w("CctTransportBackend", "Couldn't encode request, returning with 400", e3);
            return new c.b(400, (URL) null, 0);
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
    }
}
