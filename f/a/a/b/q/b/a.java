package f.a.a.b.q.b;

import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.JoranException;
import e.e.f.b;
import f.a.a.b.q.d.i;
import f.a.a.b.z.m;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import org.xml.sax.Attributes;

public abstract class a extends b {

    /* renamed from: e  reason: collision with root package name */
    public String f1709e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1710f;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065 A[SYNTHETIC, Splitter:B:16:0x0065] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s(f.a.a.b.q.d.i r9, java.lang.String r10, org.xml.sax.Attributes r11) throws ch.qos.logback.core.joran.spi.ActionException {
        /*
            r8 = this;
            r10 = 0
            r8.f1709e = r10
            java.lang.String r0 = "optional"
            java.lang.String r0 = r11.getValue(r0)
            r1 = 0
            boolean r0 = e.e.f.b.z(r0, r1)
            r8.f1710f = r0
            java.lang.String r0 = "file"
            java.lang.String r2 = r11.getValue(r0)
            java.lang.String r3 = "url"
            java.lang.String r4 = r11.getValue(r3)
            java.lang.String r5 = "resource"
            java.lang.String r6 = r11.getValue(r5)
            boolean r2 = e.e.f.b.s(r2)
            r7 = 1
            r2 = r2 ^ r7
            boolean r4 = e.e.f.b.s(r4)
            if (r4 != 0) goto L_0x0030
            int r2 = r2 + 1
        L_0x0030:
            boolean r4 = e.e.f.b.s(r6)
            if (r4 != 0) goto L_0x0038
            int r2 = r2 + 1
        L_0x0038:
            r4 = 2
            r6 = 3
            if (r2 != 0) goto L_0x004b
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r1] = r0
            r2[r7] = r5
            r2[r4] = r3
            java.lang.String r0 = "One of \"%1$s\", \"%2$s\" or \"%3$s\" attributes must be set."
            java.lang.String r0 = java.lang.String.format(r0, r2)
            goto L_0x005b
        L_0x004b:
            if (r2 <= r7) goto L_0x005f
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r1] = r0
            r2[r7] = r5
            r2[r4] = r3
            java.lang.String r0 = "Only one of \"%1$s\", \"%2$s\" or \"%3$s\" attributes should be set."
            java.lang.String r0 = java.lang.String.format(r0, r2)
        L_0x005b:
            r8.y(r0, r10)
            goto L_0x0062
        L_0x005f:
            if (r2 != r7) goto L_0x0083
            r1 = 1
        L_0x0062:
            if (r1 != 0) goto L_0x0065
            return
        L_0x0065:
            java.net.URL r10 = r8.w(r9, r11)     // Catch:{ JoranException -> 0x006f }
            if (r10 == 0) goto L_0x0082
            r8.z(r9, r10)     // Catch:{ JoranException -> 0x006f }
            goto L_0x0082
        L_0x006f:
            r9 = move-exception
            java.lang.String r10 = "Error while parsing "
            java.lang.StringBuilder r10 = g.a.a.a.a.i(r10)
            java.lang.String r11 = r8.f1709e
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r8.y(r10, r9)
        L_0x0082:
            return
        L_0x0083:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Count value ["
            java.lang.String r11 = "] is not expected"
            java.lang.String r10 = g.a.a.a.a.r(r10, r2, r11)
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.b.q.b.a.s(f.a.a.b.q.d.i, java.lang.String, org.xml.sax.Attributes):void");
    }

    public void u(i iVar, String str) throws ActionException {
    }

    public final URL w(i iVar, Attributes attributes) {
        String str;
        StringBuilder sb;
        String value = attributes.getValue("file");
        String value2 = attributes.getValue("url");
        String value3 = attributes.getValue("resource");
        if (!b.s(value)) {
            String w = iVar.w(value);
            this.f1709e = w;
            File file = new File(w);
            if (!file.exists() || !file.isFile()) {
                y(g.a.a.a.a.c("File does not exist [", w, "]"), new FileNotFoundException(w));
                return null;
            }
            try {
                return file.toURI().toURL();
            } catch (MalformedURLException e2) {
                e2.printStackTrace();
                return null;
            }
        } else if (!b.s(value2)) {
            String w2 = iVar.w(value2);
            this.f1709e = w2;
            try {
                URL url = new URL(w2);
                url.openStream().close();
                return url;
            } catch (MalformedURLException e3) {
                e = e3;
                sb = g.a.a.a.a.l("URL [", w2);
                str = "] is not well formed.";
                sb.append(str);
                y(sb.toString(), e);
                return null;
            } catch (IOException e4) {
                e = e4;
                sb = g.a.a.a.a.l("URL [", w2);
                str = "] cannot be opened.";
                sb.append(str);
                y(sb.toString(), e);
                return null;
            }
        } else if (!b.s(value3)) {
            String w3 = iVar.w(value3);
            this.f1709e = w3;
            URL b = m.b(w3);
            if (b != null) {
                return b;
            }
            y("Could not find resource corresponding to [" + w3 + "]", (Exception) null);
            return null;
        } else {
            throw new IllegalStateException("A URL stream should have been returned");
        }
    }

    public void x(String str, Exception exc) {
        if (exc == null || (!(exc instanceof FileNotFoundException) && !(exc instanceof UnknownHostException))) {
            c(str, exc);
        } else {
            q(str, exc);
        }
    }

    public void y(String str, Exception exc) {
        if (!this.f1710f) {
            x(str, exc);
        }
    }

    public abstract void z(i iVar, URL url) throws JoranException;
}
