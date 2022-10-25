package com.tencent.beacon.base.net.adapter;

import com.tencent.beacon.base.net.BResponse;
import com.tencent.beacon.base.net.b.d;
import com.tencent.beacon.base.net.call.Callback;
import com.tencent.beacon.base.net.call.JceRequestEntity;
import com.tencent.beacon.base.net.call.e;
import com.tencent.beacon.base.util.c;
import com.tencent.raft.measure.utils.MeasureConst;
import g.a.a.a.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class b extends AbstractNetAdapter {
    private BResponse a(String str, String str2, Map<String, String> map, byte[] bArr) throws IOException {
        HttpURLConnection a = a(str, str2, map);
        a.connect();
        OutputStream outputStream = a.getOutputStream();
        if (!(outputStream == null || bArr == null)) {
            outputStream.write(bArr);
            outputStream.close();
        }
        return new BResponse(a.getHeaderFields(), a.getResponseCode(), a.getResponseMessage(), a(a.getInputStream()));
    }

    private HttpURLConnection a(String str, String str2, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(AbstractNetAdapter.CONNECT_TIMEOUT);
        httpURLConnection.setReadTimeout(AbstractNetAdapter.READ_TIMEOUT);
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        for (Map.Entry next : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
        return httpURLConnection;
    }

    private byte[] a(InputStream inputStream) throws IOException {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        IOException e2;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        byteArrayOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        inputStream.close();
                        com.tencent.beacon.base.util.b.a(inputStream, byteArrayOutputStream);
                        return byteArray;
                    }
                }
            } catch (IOException e3) {
                e2 = e3;
                try {
                    c.a((Throwable) e2);
                    com.tencent.beacon.base.util.b.a(inputStream, byteArrayOutputStream);
                    throw e2;
                } catch (Throwable th2) {
                    ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
                    th = th2;
                    byteArrayOutputStream2 = byteArrayOutputStream3;
                    com.tencent.beacon.base.util.b.a(inputStream, byteArrayOutputStream2);
                    throw th;
                }
            }
        } catch (IOException e4) {
            IOException iOException = e4;
            byteArrayOutputStream = null;
            e2 = iOException;
            c.a((Throwable) e2);
            com.tencent.beacon.base.util.b.a(inputStream, byteArrayOutputStream);
            throw e2;
        } catch (Throwable th3) {
            th = th3;
            com.tencent.beacon.base.util.b.a(inputStream, byteArrayOutputStream2);
            throw th;
        }
    }

    private byte[] buildBody(e eVar) throws UnsupportedEncodingException {
        String str;
        int i2 = a.a[eVar.a().ordinal()];
        if (i2 == 1) {
            return eVar.c();
        }
        if (i2 == 2) {
            str = d.b(eVar.d());
        } else if (i2 != 3) {
            return null;
        } else {
            str = eVar.f();
        }
        return str.getBytes(MeasureConst.CHARSET_UTF8);
    }

    public void request(JceRequestEntity jceRequestEntity, Callback<byte[]> callback) {
        com.tencent.beacon.base.net.d dVar;
        String name = jceRequestEntity.getType().name();
        try {
            BResponse a = a(jceRequestEntity.getUrl(), "POST", jceRequestEntity.getHeader(), jceRequestEntity.getContent());
            int i2 = a.code;
            if (i2 != 200) {
                StringBuilder sb = new StringBuilder();
                sb.append("response status code != 2XX. msg: ");
                sb.append(a.msg);
                callback.onFailure(new com.tencent.beacon.base.net.d(name, "452", i2, sb.toString()));
            } else if (!d.a(a.headers)) {
                callback.onFailure(new com.tencent.beacon.base.net.d(name, "454", a.code, "server encrypt-status error!"));
            } else {
                callback.onResponse(a.body);
            }
        } catch (ConnectException e2) {
            ConnectException connectException = e2;
            c.a((Throwable) connectException);
            StringBuilder i3 = a.i("https connect timeout: ");
            i3.append(connectException.getMessage());
            dVar = new com.tencent.beacon.base.net.d(name, "451", -1, i3.toString(), connectException);
            callback.onFailure(dVar);
        } catch (Throwable th) {
            Throwable th2 = th;
            c.a(th2);
            StringBuilder i4 = a.i("https connect error: ");
            i4.append(th2.getMessage());
            dVar = new com.tencent.beacon.base.net.d(name, "499", -1, i4.toString(), th2);
            callback.onFailure(dVar);
        }
    }

    public void request(e eVar, Callback<BResponse> callback) {
        com.tencent.beacon.base.net.d dVar;
        String h2 = eVar.h();
        try {
            BResponse a = a(eVar.i(), eVar.g().name(), eVar.e(), buildBody(eVar));
            int i2 = a.code;
            if (i2 != 200) {
                StringBuilder sb = new StringBuilder();
                sb.append("response status code != 2XX. msg: ");
                sb.append(a.msg);
                callback.onFailure(new com.tencent.beacon.base.net.d(h2, "452", i2, sb.toString()));
                return;
            }
            callback.onResponse(a);
        } catch (ConnectException e2) {
            ConnectException connectException = e2;
            c.a((Throwable) connectException);
            StringBuilder i3 = a.i("https connect timeout: ");
            i3.append(connectException.getMessage());
            dVar = new com.tencent.beacon.base.net.d(h2, "451", -1, i3.toString(), connectException);
            callback.onFailure(dVar);
        } catch (Throwable th) {
            Throwable th2 = th;
            c.a(th2);
            StringBuilder i4 = a.i("https connect error: ");
            i4.append(th2.getMessage());
            dVar = new com.tencent.beacon.base.net.d(h2, "499", -1, i4.toString(), th2);
            callback.onFailure(dVar);
        }
    }
}
