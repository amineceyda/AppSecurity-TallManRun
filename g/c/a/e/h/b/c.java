package g.c.a.e.h.b;

import com.apkpure.aegon.application.AegonApplication;
import g.e.a.b.a.a.a;

public final class c implements Runnable {
    public void run() {
        String str;
        try {
            str = a.a(AegonApplication.getApplication()).a;
        } catch (Exception e2) {
            e2.printStackTrace();
            str = "gaid_exception";
        }
        d.l("gaid", str);
    }
}
