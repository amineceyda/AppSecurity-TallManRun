package g.e.b.p;

import android.util.Base64OutputStream;
import com.tencent.raft.codegenmeta.utils.Constants;
import com.tencent.raft.measure.utils.MeasureConst;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public final /* synthetic */ class c implements Callable {
    public final /* synthetic */ g a;

    public /* synthetic */ c(g gVar) {
        this.a = gVar;
    }

    public final Object call() {
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        g gVar = this.a;
        synchronized (gVar) {
            l lVar = gVar.a.get();
            List<m> c = lVar.c();
            lVar.b();
            JSONArray jSONArray = new JSONArray();
            int i2 = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) c;
                if (i2 < arrayList.size()) {
                    m mVar = (m) arrayList.get(i2);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", mVar.b());
                    jSONObject.put("dates", new JSONArray(mVar.a()));
                    jSONArray.put(jSONObject);
                    i2++;
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("heartbeats", jSONArray);
                    jSONObject2.put(Constants.Raft.VERSION, "2");
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                    try {
                        gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        gZIPOutputStream.write(jSONObject2.toString().getBytes(MeasureConst.CHARSET_UTF8));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString(MeasureConst.CHARSET_UTF8);
                    } catch (Throwable th) {
                        try {
                            base64OutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
        }
        return byteArrayOutputStream;
        throw th;
    }
}
