package g.c.a.j.b;

import android.content.Context;
import android.preference.Preference;
import com.apkpure.aegon.application.AegonApplication;
import e.e.d.l.a;
import g.c.a.e.j.b;
import g.c.a.m.c;
import i.o.c.h;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public final class g extends c {
    @Deprecated
    public static long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(String str) {
        super(str);
        h.e(str, "key");
    }

    public boolean a(Preference preference) {
        File[] listFiles;
        h.e(preference, "preference");
        if (System.currentTimeMillis() - c < 500) {
            c = System.currentTimeMillis();
            return false;
        }
        Context context = this.b;
        File file = new File(a.B("/dye_compress"));
        if (file.exists()) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(file);
            while (!linkedList.isEmpty()) {
                File file2 = (File) linkedList.remove(0);
                if (file2.exists()) {
                    if (file2.isFile() || (listFiles = file2.listFiles()) == null || listFiles.length == 0) {
                        file2.delete();
                    } else {
                        for (File file3 : listFiles) {
                            if (file3.isDirectory()) {
                                linkedList.add(file3);
                            } else {
                                file3.delete();
                            }
                        }
                    }
                }
            }
        }
        String B = a.B("/log/");
        String B2 = a.B("/dye_compress");
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmm");
        StringBuilder i2 = g.a.a.a.a.i("DyeLog_");
        i2.append(simpleDateFormat.format(date));
        i2.append(".zip");
        String sb = i2.toString();
        f fVar = new f(B2, sb, context);
        b D = e.e.i.b.D();
        c cVar = new c(B, B2, sb, fVar);
        AegonApplication.getApplication().getString(2131821518);
        D.a(cVar);
        return false;
    }
}
