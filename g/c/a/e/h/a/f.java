package g.c.a.e.h.a;

import android.text.TextUtils;
import com.apkpure.aegon.application.AegonApplication;
import com.tencent.beacon.base.net.BResponse;
import com.tencent.beacon.base.net.RequestType;
import com.tencent.beacon.base.net.adapter.AbstractNetAdapter;
import com.tencent.beacon.base.net.call.Callback;
import com.tencent.beacon.base.net.call.JceRequestEntity;
import com.tencent.beacon.base.net.call.e;
import com.tencent.beacon.base.net.d;
import com.tencent.beacon.e.g;
import com.tencent.beacon.pack.EventRecordV2;
import com.tencent.beacon.pack.RequestPackageV2;
import com.tencent.beacon.pack.ResponsePackageV2;
import com.tencent.beacon.pack.b;
import com.tencent.crabshell.common.DataSavingUtils;
import com.tencent.raft.measure.report.ATTAReporter;
import g.c.a.e.e.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public class f extends AbstractNetAdapter {
    public static final Long b = 1L;
    public static final Long c = 100L;

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f1977d = {31, -117, 8, 0, 0, 0, 0, 0, 2, -1, 99, 100, 56, 33, -58, 103, 104, 104, -87, 103, 104, 98, -82, 103, 104, -96, 103, 100, 98, -84, -52, -64, -64, 88, -5, 90, 100, -50, 59, 51, -10, -30, -46, -28, -28, -44, -30, 98, 0, -72, -59, 109, 68, 37, 0, 0, 0};

    /* renamed from: e  reason: collision with root package name */
    public static String f1978e = "";

    /* renamed from: f  reason: collision with root package name */
    public static String f1979f = "dt_origin_vst;first_open;AppClickToDownload;AppStartDownload;AppContinueDownload;AppSuccDownload;AppDownloadConnectionSucc;AppFailDownload;AppPauseDownload;AppClickToInstall;AppStartInstall;AppCancelInstall;AppFailInstall;AppSuccInstall;AppExtract;LiteStartFetchDownloadUrl;LiteSuccFetchDownloadUrl;LiteFailFetchDownloadUrl;LiteStartDownload;LitePauseDownload;LiteSuccDownload;LiteFailDownload;LiteStartUpgrade;LiteSuccUnzip;LiteFailUnzip;LiteSuccUpgrade;LiteFailUpgrade;LiteFailResetProcess";

    /* renamed from: g  reason: collision with root package name */
    public static ArrayList<String> f1980g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public static boolean f1981h;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f1982i;

    /* renamed from: j  reason: collision with root package name */
    public static String f1983j = f();
    public ResponsePackageV2 a;

    public f() {
        h();
        if (TextUtils.isEmpty(f1978e)) {
            f1978e = "https://r.apkpure.net/appReport?pro=1";
        }
        f1978e = f1978e;
    }

    public static BResponse a(String str, String str2, Map<String, String> map, byte[] bArr, boolean z) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(AbstractNetAdapter.CONNECT_TIMEOUT);
        httpURLConnection.setReadTimeout(AbstractNetAdapter.READ_TIMEOUT);
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        for (Map.Entry next : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
        httpURLConnection.setInstanceFollowRedirects(z);
        httpURLConnection.connect();
        a.a("BeaconHttpAdapter", "url: " + str + " openFollowRedirects: " + z);
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (!(outputStream == null || bArr == null)) {
            outputStream.write(bArr);
            outputStream.close();
        }
        int responseCode = httpURLConnection.getResponseCode();
        String responseMessage = httpURLConnection.getResponseMessage();
        InputStream inputStream = httpURLConnection.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                byte[] bArr2 = new byte[2048];
                while (true) {
                    int read = inputStream.read(bArr2);
                    if (read != -1) {
                        byteArrayOutputStream2.write(bArr2, 0, read);
                    } else {
                        byteArrayOutputStream2.flush();
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        byteArrayOutputStream2.close();
                        inputStream.close();
                        byteArrayOutputStream2.close();
                        inputStream.close();
                        return new BResponse(httpURLConnection.getHeaderFields(), responseCode, responseMessage, byteArray);
                    }
                }
            } catch (IOException e2) {
                e = e2;
                byteArrayOutputStream = byteArrayOutputStream2;
                byteArrayOutputStream.close();
                inputStream.close();
                throw e;
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                byteArrayOutputStream.close();
                inputStream.close();
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            byteArrayOutputStream.close();
            inputStream.close();
            throw e;
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream.close();
            inputStream.close();
            throw th;
        }
    }

    public static String f() {
        String dataString = DataSavingUtils.getDataString(AegonApplication.getApplication(), "report_beacon_type");
        return TextUtils.isEmpty(dataString) ? "3" : dataString;
    }

    public static void h() {
        f1982i = g.c.a.e.h.b.f.b("logReportSampleBeacon", c.longValue());
        f1981h = g.c.a.e.h.b.f.b("logReportSampleEs", b.longValue());
        f1983j = f();
        String dataString = DataSavingUtils.getDataString(AegonApplication.getContext(), "needReportKey");
        if (!TextUtils.isEmpty(dataString)) {
            f1979f = dataString;
        }
        String[] split = f1979f.split(";");
        f1980g.clear();
        for (String add : split) {
            f1980g.add(add);
        }
        StringBuilder i2 = g.a.a.a.a.i("updateNeedReport:");
        i2.append(f1980g.toString());
        i2.append(",needReportBeacon:");
        i2.append(f1982i);
        i2.append(",reportType:");
        i2.append(f1983j);
        i2.append(",needReportEs:");
        i2.append(f1981h);
        a.b("BeaconHttpAdapter", i2.toString());
    }

    public static void i() {
        String dataString = DataSavingUtils.getDataString(AegonApplication.getContext(), "esReportUrl");
        a.b("BeaconHttpAdapter", "fetch report es url: " + dataString);
        if (!TextUtils.isEmpty(dataString)) {
            f1978e = dataString;
        }
    }

    public static void j() {
        f1983j = f();
        StringBuilder i2 = g.a.a.a.a.i("updateNeedReport:");
        i2.append(f1980g.toString());
        i2.append(",needReportBeacon:");
        i2.append(f1982i);
        i2.append(",reportType:");
        i2.append(f1983j);
        i2.append(",needReportEs:");
        i2.append(f1981h);
        a.b("BeaconHttpAdapter", i2.toString());
    }

    public final BResponse b(JceRequestEntity jceRequestEntity) throws IOException {
        if (!f1982i) {
            return null;
        }
        return a(jceRequestEntity.getUrl(), "POST", jceRequestEntity.getHeader(), jceRequestEntity.getContent(), false);
    }

    public final BResponse c(JceRequestEntity jceRequestEntity) throws IOException {
        RequestPackageV2 requestPackageV2;
        jceRequestEntity.getHeader().put(ATTAReporter.KEY_CONTENT_TYPE, "application/octet-stream; charset=UTF-8");
        if (f1981h || DataSavingUtils.getDataBoolean(AegonApplication.getContext(), "tag_parse_report_save")) {
            return a(f1978e, "POST", jceRequestEntity.getHeader(), jceRequestEntity.getContent(), false);
        }
        if (jceRequestEntity.getType() != RequestType.EVENT) {
            return null;
        }
        System.currentTimeMillis();
        byte[] content = jceRequestEntity.getContent();
        if (content == null) {
            requestPackageV2 = null;
        } else {
            byte[] g2 = g(content);
            requestPackageV2 = new RequestPackageV2();
            requestPackageV2.readFrom(new com.tencent.beacon.pack.a(g2));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<EventRecordV2> it = requestPackageV2.events.iterator();
        while (it.hasNext()) {
            EventRecordV2 next = it.next();
            if (f1980g.contains(next.eventCode) || (!TextUtils.isEmpty(next.eventCode) && next.eventCode.startsWith("plugin_"))) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        requestPackageV2.events.clear();
        requestPackageV2.events.addAll(arrayList);
        b bVar = new b();
        requestPackageV2.writeTo(bVar);
        return a(f1978e, "POST", jceRequestEntity.getHeader(), d(bVar.b()), false);
    }

    public final byte[] d(byte[] bArr) {
        g b2 = g.b();
        return b2 != null ? com.tencent.beacon.e.b.a().j() ? com.tencent.beacon.base.util.b.b(bArr, 2, 3, b2.a()) : com.tencent.beacon.base.util.b.b(bArr, 2) : bArr;
    }

    public final ResponsePackageV2 e() {
        if (this.a == null) {
            byte[] g2 = g(f1977d);
            ResponsePackageV2 responsePackageV2 = new ResponsePackageV2();
            responsePackageV2.readFrom(new com.tencent.beacon.pack.a(g2));
            this.a = responsePackageV2;
        }
        return this.a;
    }

    public final byte[] g(byte[] bArr) {
        return com.tencent.beacon.e.b.a().j() ? com.tencent.beacon.base.util.b.a(bArr, 2, 3, g.b().a()) : com.tencent.beacon.base.util.b.a(bArr, 2);
    }

    public void request(JceRequestEntity jceRequestEntity, Callback<byte[]> callback) {
        if (jceRequestEntity == null) {
            a.a("BeaconHttpAdapter", "requestInner return, entity == null");
            return;
        }
        BResponse bResponse = null;
        try {
            String str = f1983j;
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 48) {
                if (hashCode != 50) {
                    if (hashCode == 51) {
                        if (str.equals("3")) {
                            c2 = 2;
                        }
                    }
                } else if (str.equals("2")) {
                    c2 = 1;
                }
            } else if (str.equals("0")) {
                c2 = 0;
            }
            if (c2 == 0) {
                a.a("BeaconHttpAdapter", "requestInner return, type = REPORT_BEACON_TYPE_NONE");
            } else if (c2 == 1) {
                bResponse = b(jceRequestEntity);
            } else if (c2 != 2) {
                BResponse c3 = c(jceRequestEntity);
                if (c3 != null) {
                    JSONObject jSONObject = new JSONObject(new String(c3.body, Charset.defaultCharset()));
                    ResponsePackageV2 e2 = e();
                    e2.serverTime = jSONObject.optLong("serverTime", System.currentTimeMillis());
                    b bVar = new b();
                    e2.writeTo(bVar);
                    c3.body = d(bVar.b());
                    bResponse = c3;
                }
            } else {
                bResponse = b(jceRequestEntity);
                c(jceRequestEntity);
            }
            a.a("BeaconHttpAdapter", "requestInner response = " + bResponse + ", type = " + f1983j + ", requestUrl = " + f1978e + ", entity.getUrl() = " + jceRequestEntity.getUrl() + ", entity.getHeader() = " + jceRequestEntity.getHeader());
            if (bResponse != null) {
                callback.onResponse(bResponse.body);
                return;
            }
            ResponsePackageV2 e3 = e();
            e3.serverTime = System.currentTimeMillis();
            b bVar2 = new b();
            e3.writeTo(bVar2);
            callback.onResponse(d(bVar2.b()));
        } catch (Throwable th) {
            Throwable th2 = th;
            StringBuilder i2 = g.a.a.a.a.i("https other error: ");
            i2.append(th2.getMessage());
            callback.onFailure(new d("BeaconHttpAdapter", "499", -1, i2.toString(), th2));
        }
    }

    public void request(e eVar, Callback<BResponse> callback) {
    }
}
