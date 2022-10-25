package g.e.b.l.j.k;

import android.util.Log;
import g.e.b.l.j.f;
import g.e.b.l.j.j.l;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.concurrent.Callable;

public final /* synthetic */ class a implements Callable {
    public final /* synthetic */ k a;

    public /* synthetic */ a(k kVar) {
        this.a = kVar;
    }

    public final Object call() {
        boolean z;
        BufferedWriter bufferedWriter;
        String str;
        BufferedWriter bufferedWriter2;
        k kVar = this.a;
        synchronized (kVar.f3540f) {
            z = false;
            bufferedWriter = null;
            if (kVar.f3540f.isMarked()) {
                str = kVar.f3540f.getReference();
                kVar.f3540f.set(str, false);
                z = true;
            } else {
                str = null;
            }
        }
        if (z) {
            File f2 = kVar.a.a.f(kVar.c, "user-data");
            try {
                String jSONObject = new f(str).toString();
                bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f2), g.b));
                try {
                    bufferedWriter2.write(jSONObject);
                    bufferedWriter2.flush();
                } catch (Exception e2) {
                    e = e2;
                } catch (Throwable th) {
                    th = th;
                    l.a(bufferedWriter2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                bufferedWriter2 = null;
                try {
                    if (f.a.a(6)) {
                        Log.e("FirebaseCrashlytics", "Error serializing user metadata.", e);
                    }
                    l.a(bufferedWriter2, "Failed to close user metadata file.");
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    bufferedWriter2 = bufferedWriter;
                    l.a(bufferedWriter2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedWriter2 = bufferedWriter;
                l.a(bufferedWriter2, "Failed to close user metadata file.");
                throw th;
            }
            l.a(bufferedWriter2, "Failed to close user metadata file.");
        }
        return null;
    }
}
