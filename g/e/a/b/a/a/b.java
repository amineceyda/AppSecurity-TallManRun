package g.e.a.b.a.a;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public final class b extends Thread {
    public final /* synthetic */ Map b;

    public b(Map map) {
        this.b = map;
    }

    public final void run() {
        String sb;
        Exception exc;
        HttpURLConnection httpURLConnection;
        Map map = this.b;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        String uri = buildUpon.build().toString();
        try {
            httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 65);
                sb2.append("Received non-success response code ");
                sb2.append(responseCode);
                sb2.append(" from pinging URL: ");
                sb2.append(uri);
                Log.w("HttpUrlPinger", sb2.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e2) {
            String message = e2.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(uri).length() + 32 + String.valueOf(message).length());
            sb3.append("Error while parsing ping URL: ");
            sb3.append(uri);
            sb3.append(". ");
            sb3.append(message);
            sb = sb3.toString();
            exc = e2;
            Log.w("HttpUrlPinger", sb, exc);
        } catch (IOException | RuntimeException e3) {
            String message2 = e3.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(message2).length());
            sb4.append("Error while pinging URL: ");
            sb4.append(uri);
            sb4.append(". ");
            sb4.append(message2);
            sb = sb4.toString();
            exc = e3;
            Log.w("HttpUrlPinger", sb, exc);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
