package com.ola.qsea.s;

import android.content.Context;
import com.ola.qsea.encrypt.U;
import com.ola.qsea.o.c;
import java.io.File;
import java.util.Arrays;

public class b {
    public boolean a;

    public static final class a {
        public static final b a = new b();
    }

    public b() {
    }

    public static b b() {
        return a.a;
    }

    public byte a(String str, String str2) {
        a();
        byte a2 = U.a(str2, System.currentTimeMillis());
        b(str, a2);
        return a2;
    }

    public String a(String str) {
        byte[] a2;
        if (!this.a || (a2 = U.a(System.currentTimeMillis())) == null || a2.length <= 1) {
            return "";
        }
        byte b = a2[0];
        a(str, b);
        return (b == 0 || b == 100) ? new String(Arrays.copyOfRange(a2, 1, a2.length)) : "";
    }

    public final void a() {
        if (!this.a) {
            throw new RuntimeException("LocalStorage has not been initiated.");
        }
    }

    public final void a(String str, byte b) {
        if (b != 0 && b != 104 && b != 101) {
            if (b == 100) {
                com.ola.qsea.r.a.a(str).d();
            } else {
                c.a(str, b);
            }
        }
    }

    public boolean a(Context context, String str) {
        if (this.a) {
            return true;
        }
        if (context == null) {
            return false;
        }
        File filesDir = context.getFilesDir();
        if (!filesDir.exists()) {
            filesDir.mkdir();
        }
        boolean a2 = U.a(context, new File(filesDir, str).getAbsolutePath());
        this.a = a2;
        com.ola.qsea.m.a.b("SDK_INIT ｜ LOCAL-ENCRYPTION", "loading finished（%b）,file:%s ", Boolean.valueOf(a2), str);
        return this.a;
    }

    public final void b(String str, byte b) {
        if (b != 0) {
            c.a(str, b);
        }
    }
}
