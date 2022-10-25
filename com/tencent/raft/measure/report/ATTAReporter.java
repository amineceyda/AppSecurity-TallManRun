package com.tencent.raft.measure.report;

import android.net.TrafficStats;
import android.os.Build;
import com.tencent.raft.measure.RAFTMeasure;
import com.tencent.raft.measure.log.RLog;
import com.tencent.raft.measure.utils.MeasureConst;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ATTAReporter {
    public static final String ATTA_TYPE = "Atta-Type";
    private static final String AT_URL = "https://h.trace.qq.com/kv";
    public static final String BATCH_REPORT = "batch-report";
    private static final String KEY_ATTA_ID = "attaid";
    public static final String KEY_CONTENT_LENGTH = "Content-Length";
    public static final String KEY_CONTENT_TYPE = "Content-Type";
    private static final String KEY_DATA = "datas";
    private static final String KEY_TOKEN = "token";
    private static final String KEY_TYPE = "type";
    private static final String KEY_VERSION = "version";
    private static final String METHOD_POST = "POST";
    private static final String TAG = "ATTAReporter";
    public static final int TIMEOUT = 300000;
    private static final String VAL_BATCH = "batch";
    public static final String VAL_TEXT_PLAIN_CHARSET_UTF_8 = "text/plain;charset=UTF-8";
    private static final String VAL_VERSION_DEFAULT = "v1.0.0";
    private final String attaId;
    private final String token;

    public ATTAReporter(String str, String str2) {
        this.attaId = str;
        this.token = str2;
    }

    private void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    private void doPost(String str, String str2) {
        byte[] bArr;
        Closeable closeable;
        if (Build.VERSION.SDK_INT >= 26) {
            TrafficStats.getAndSetThreadStatsTag(26);
        }
        RLog.d(TAG, "Req " + str + " msg " + str2);
        try {
            bArr = str2.getBytes(MeasureConst.CHARSET_UTF8);
        } catch (UnsupportedEncodingException unused) {
            bArr = new byte[0];
        }
        OutputStream outputStream = null;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod(METHOD_POST);
            httpURLConnection.setConnectTimeout(TIMEOUT);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty(ATTA_TYPE, BATCH_REPORT);
            httpURLConnection.setRequestProperty(KEY_CONTENT_TYPE, VAL_TEXT_PLAIN_CHARSET_UTF_8);
            httpURLConnection.setRequestProperty(KEY_CONTENT_LENGTH, String.valueOf(bArr.length));
            OutputStream outputStream2 = httpURLConnection.getOutputStream();
            try {
                outputStream2.write(bArr);
                outputStream2.flush();
                InputStream inputStream = httpURLConnection.getInputStream();
                if (RAFTMeasure.getAppConfig().isDebug()) {
                    RLog.d(TAG, "code = " + httpURLConnection.getResponseCode() + ", resp=" + httpURLConnection.getResponseMessage());
                }
                httpURLConnection.disconnect();
                closeQuietly(outputStream2);
                closeQuietly(inputStream);
            } catch (Exception e2) {
                e = e2;
                closeable = null;
                outputStream = outputStream2;
                try {
                    RLog.e(TAG, "doPost err", e);
                    closeQuietly(outputStream);
                    closeQuietly(closeable);
                } catch (Throwable th) {
                    th = th;
                    closeQuietly(outputStream);
                    closeQuietly(closeable);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = null;
                outputStream = outputStream2;
                closeQuietly(outputStream);
                closeQuietly(closeable);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            closeable = null;
            RLog.e(TAG, "doPost err", e);
            closeQuietly(outputStream);
            closeQuietly(closeable);
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            closeQuietly(outputStream);
            closeQuietly(closeable);
            throw th;
        }
    }

    public final void doPostBatchReport(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(KEY_ATTA_ID, this.attaId);
            jSONObject.put(KEY_TOKEN, this.token);
            jSONObject.put(KEY_TYPE, VAL_BATCH);
            jSONObject.put("version", VAL_VERSION_DEFAULT);
            jSONObject.put(KEY_DATA, jSONArray);
            doPost(AT_URL, jSONObject.toString());
        } catch (JSONException e2) {
            RLog.e(TAG, "doPostBatchReport err", e2);
        }
    }
}
