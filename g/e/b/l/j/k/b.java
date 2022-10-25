package g.e.b.l.j.k;

import android.util.Log;
import g.e.b.l.j.f;
import g.e.b.l.j.j.l;
import g.e.b.l.j.k.k;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.json.JSONObject;

public final /* synthetic */ class b implements Callable {
    public final /* synthetic */ k.a a;

    public /* synthetic */ b(k.a aVar) {
        this.a = aVar;
    }

    public final Object call() {
        Map<String, String> map;
        File file;
        BufferedWriter bufferedWriter;
        k.a aVar = this.a;
        BufferedWriter bufferedWriter2 = null;
        aVar.b.set((Object) null);
        synchronized (aVar) {
            if (aVar.a.isMarked()) {
                map = aVar.a.getReference().a();
                AtomicMarkableReference<d> atomicMarkableReference = aVar.a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
            } else {
                map = null;
            }
        }
        if (map != null) {
            k kVar = k.this;
            g gVar = kVar.a;
            String str = kVar.c;
            if (aVar.c) {
                file = gVar.a.f(str, "internal-keys");
            } else {
                file = gVar.a.f(str, "keys");
            }
            try {
                String jSONObject = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), g.b));
                try {
                    bufferedWriter.write(jSONObject);
                    bufferedWriter.flush();
                } catch (Exception e2) {
                    e = e2;
                } catch (Throwable th) {
                    th = th;
                    l.a(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                bufferedWriter = null;
                try {
                    if (f.a.a(6)) {
                        Log.e("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                    }
                    l.a(bufferedWriter, "Failed to close key/value metadata file.");
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter2 = bufferedWriter;
                    bufferedWriter = bufferedWriter2;
                    l.a(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedWriter = bufferedWriter2;
                l.a(bufferedWriter, "Failed to close key/value metadata file.");
                throw th;
            }
            l.a(bufferedWriter, "Failed to close key/value metadata file.");
        }
        return null;
    }
}
