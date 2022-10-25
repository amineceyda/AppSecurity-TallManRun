package g.e.b.r.m;

import android.content.Context;
import android.util.JsonReader;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.tencent.raft.measure.utils.MeasureConst;
import g.c.b.b.f;
import g.e.b.p.j;
import g.e.b.q.b;
import g.e.b.r.m.a;
import g.e.b.r.m.b;
import g.e.b.r.m.d;
import g.e.b.r.m.f;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f3754d = Pattern.compile("[0-9]+s");

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f3755e = Charset.forName(MeasureConst.CHARSET_UTF8);
    public final Context a;
    public final b<j> b;
    public final e c = new e();

    public c(Context context, b<j> bVar) {
        this.a = context;
        this.b = bVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.net.HttpURLConnection r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            java.io.InputStream r0 = r10.getErrorStream()
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 3
            if (r0 != 0) goto L_0x000c
            goto L_0x0052
        L_0x000c:
            java.io.BufferedReader r6 = new java.io.BufferedReader
            java.io.InputStreamReader r7 = new java.io.InputStreamReader
            java.nio.charset.Charset r8 = f3755e
            r7.<init>(r0, r8)
            r6.<init>(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r0.<init>()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
        L_0x001d:
            java.lang.String r7 = r6.readLine()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            if (r7 == 0) goto L_0x002c
            r0.append(r7)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r7 = 10
            r0.append(r7)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            goto L_0x001d
        L_0x002c:
            java.lang.String r7 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            int r9 = r10.getResponseCode()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r8[r4] = r9     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.lang.String r10 = r10.getResponseMessage()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r8[r3] = r10     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r8[r2] = r0     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.lang.String r10 = java.lang.String.format(r7, r8)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r1 = r10
            goto L_0x004d
        L_0x0048:
            r10 = move-exception
            r6.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            throw r10
        L_0x004d:
            r6.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0052
        L_0x0051:
        L_0x0052:
            boolean r10 = android.text.TextUtils.isEmpty(r1)
            if (r10 != 0) goto L_0x007d
            java.lang.String r10 = "Firebase-Installations"
            android.util.Log.w(r10, r1)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r12
            r0[r3] = r13
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 == 0) goto L_0x006c
            java.lang.String r11 = ""
            goto L_0x0072
        L_0x006c:
            java.lang.String r12 = ", "
            java.lang.String r11 = g.a.a.a.a.w(r12, r11)
        L_0x0072:
            r0[r2] = r11
            java.lang.String r11 = "Firebase options used while communicating with Firebase server APIs: %s, %s%s"
            java.lang.String r11 = java.lang.String.format(r11, r0)
            android.util.Log.w(r10, r11)
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.r.m.c.b(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static long d(String str) {
        f.h(f3754d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static void i(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    public final URL a(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", str}));
        } catch (MalformedURLException e2) {
            throw new FirebaseInstallationsException(e2.getMessage(), FirebaseInstallationsException.a.UNAVAILABLE);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0089 A[Catch:{ NameNotFoundException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008a A[Catch:{ NameNotFoundException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009a A[Catch:{ NameNotFoundException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b5 A[Catch:{ NameNotFoundException -> 0x00dd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.net.HttpURLConnection c(java.net.URL r9, java.lang.String r10) throws com.google.firebase.installations.FirebaseInstallationsException {
        /*
            r8 = this;
            java.net.URLConnection r9 = r9.openConnection()     // Catch:{ IOException -> 0x00ff }
            java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch:{ IOException -> 0x00ff }
            r0 = 10000(0x2710, float:1.4013E-41)
            r9.setConnectTimeout(r0)
            r1 = 0
            r9.setUseCaches(r1)
            r9.setReadTimeout(r0)
            java.lang.String r0 = "application/json"
            java.lang.String r2 = "Content-Type"
            r9.addRequestProperty(r2, r0)
            java.lang.String r2 = "Accept"
            r9.addRequestProperty(r2, r0)
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r2 = "gzip"
            r9.addRequestProperty(r0, r2)
            java.lang.String r0 = "Cache-Control"
            java.lang.String r2 = "no-cache"
            r9.addRequestProperty(r0, r2)
            android.content.Context r0 = r8.a
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r2 = "X-Android-Package"
            r9.addRequestProperty(r2, r0)
            g.e.b.q.b<g.e.b.p.j> r0 = r8.b
            java.lang.Object r0 = r0.get()
            g.e.b.p.j r0 = (g.e.b.p.j) r0
            java.lang.String r2 = "ContentValues"
            if (r0 == 0) goto L_0x0062
            java.lang.String r3 = "x-firebase-client"
            g.e.a.b.g.f r0 = r0.a()     // Catch:{ ExecutionException -> 0x005c, InterruptedException -> 0x0053 }
            java.lang.Object r0 = g.e.a.b.b.h.e.a(r0)     // Catch:{ ExecutionException -> 0x005c, InterruptedException -> 0x0053 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ExecutionException -> 0x005c, InterruptedException -> 0x0053 }
            r9.addRequestProperty(r3, r0)     // Catch:{ ExecutionException -> 0x005c, InterruptedException -> 0x0053 }
            goto L_0x0062
        L_0x0053:
            r0 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
            goto L_0x005d
        L_0x005c:
            r0 = move-exception
        L_0x005d:
            java.lang.String r3 = "Failed to get heartbeats header"
            android.util.Log.w(r2, r3, r0)
        L_0x0062:
            r0 = 0
            android.content.Context r3 = r8.a     // Catch:{ NameNotFoundException -> 0x00dd }
            java.lang.String r4 = r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x00dd }
            g.e.a.b.b.i.a r3 = g.e.a.b.b.i.b.a(r3)     // Catch:{ NameNotFoundException -> 0x00dd }
            android.content.Context r3 = r3.a     // Catch:{ NameNotFoundException -> 0x00dd }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00dd }
            r5 = 64
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x00dd }
            android.content.pm.Signature[] r4 = r3.signatures     // Catch:{ NameNotFoundException -> 0x00dd }
            if (r4 == 0) goto L_0x0097
            int r4 = r4.length     // Catch:{ NameNotFoundException -> 0x00dd }
            r5 = 1
            if (r4 != r5) goto L_0x0097
            java.lang.String r4 = "SHA1"
            java.security.MessageDigest r4 = g.e.a.b.b.h.a.a(r4)     // Catch:{ NameNotFoundException -> 0x00dd }
            if (r4 != 0) goto L_0x008a
            goto L_0x0097
        L_0x008a:
            android.content.pm.Signature[] r3 = r3.signatures     // Catch:{ NameNotFoundException -> 0x00dd }
            r3 = r3[r1]     // Catch:{ NameNotFoundException -> 0x00dd }
            byte[] r3 = r3.toByteArray()     // Catch:{ NameNotFoundException -> 0x00dd }
            byte[] r3 = r4.digest(r3)     // Catch:{ NameNotFoundException -> 0x00dd }
            goto L_0x0098
        L_0x0097:
            r3 = r0
        L_0x0098:
            if (r3 != 0) goto L_0x00b5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x00dd }
            r1.<init>()     // Catch:{ NameNotFoundException -> 0x00dd }
            java.lang.String r3 = "Could not get fingerprint hash for package: "
            r1.append(r3)     // Catch:{ NameNotFoundException -> 0x00dd }
            android.content.Context r3 = r8.a     // Catch:{ NameNotFoundException -> 0x00dd }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x00dd }
            r1.append(r3)     // Catch:{ NameNotFoundException -> 0x00dd }
            java.lang.String r1 = r1.toString()     // Catch:{ NameNotFoundException -> 0x00dd }
            android.util.Log.e(r2, r1)     // Catch:{ NameNotFoundException -> 0x00dd }
            goto L_0x00f4
        L_0x00b5:
            int r4 = r3.length     // Catch:{ NameNotFoundException -> 0x00dd }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x00dd }
            int r6 = r4 + r4
            r5.<init>(r6)     // Catch:{ NameNotFoundException -> 0x00dd }
        L_0x00bd:
            if (r1 >= r4) goto L_0x00d8
            char[] r6 = g.e.a.b.b.h.d.a     // Catch:{ NameNotFoundException -> 0x00dd }
            byte r7 = r3[r1]     // Catch:{ NameNotFoundException -> 0x00dd }
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >>> 4
            char r7 = r6[r7]     // Catch:{ NameNotFoundException -> 0x00dd }
            r5.append(r7)     // Catch:{ NameNotFoundException -> 0x00dd }
            byte r7 = r3[r1]     // Catch:{ NameNotFoundException -> 0x00dd }
            r7 = r7 & 15
            char r6 = r6[r7]     // Catch:{ NameNotFoundException -> 0x00dd }
            r5.append(r6)     // Catch:{ NameNotFoundException -> 0x00dd }
            int r1 = r1 + 1
            goto L_0x00bd
        L_0x00d8:
            java.lang.String r0 = r5.toString()     // Catch:{ NameNotFoundException -> 0x00dd }
            goto L_0x00f4
        L_0x00dd:
            r1 = move-exception
            java.lang.String r3 = "No such package: "
            java.lang.StringBuilder r3 = g.a.a.a.a.i(r3)
            android.content.Context r4 = r8.a
            java.lang.String r4 = r4.getPackageName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r2, r3, r1)
        L_0x00f4:
            java.lang.String r1 = "X-Android-Cert"
            r9.addRequestProperty(r1, r0)
            java.lang.String r0 = "x-goog-api-key"
            r9.addRequestProperty(r0, r10)
            return r9
        L_0x00ff:
            com.google.firebase.installations.FirebaseInstallationsException r9 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$a r10 = com.google.firebase.installations.FirebaseInstallationsException.a.UNAVAILABLE
            java.lang.String r0 = "Firebase Installations Service is unavailable. Please try again later."
            r9.<init>(r0, r10)
            goto L_0x010a
        L_0x0109:
            throw r9
        L_0x010a:
            goto L_0x0109
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.r.m.c.c(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }

    public final d e(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f3755e));
        f.a a2 = f.a();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        f fVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        ((b.C0127b) a2).a = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        a2.b(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                fVar = a2.a();
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new a(str, str2, str3, fVar, d.a.OK, (a.C0126a) null);
    }

    public final f f(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f3755e));
        f.a a2 = f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                ((b.C0127b) a2).a = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                a2.b(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        b.C0127b bVar = (b.C0127b) a2;
        bVar.c = f.b.OK;
        return bVar.a();
    }

    public final void g(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.1");
            i(httpURLConnection, jSONObject.toString().getBytes(MeasureConst.CHARSET_UTF8));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public final void h(HttpURLConnection httpURLConnection) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes(MeasureConst.CHARSET_UTF8));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
