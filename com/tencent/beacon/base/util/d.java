package com.tencent.beacon.base.util;

import android.os.Build;
import com.tencent.raft.measure.utils.MeasureConst;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

public class d {
    private static boolean a;

    public static boolean a() {
        ArrayList<String> e2 = e();
        if (e2 == null || e2.size() <= 0) {
            c.a("[core] no response}", new Object[0]);
            return false;
        }
        Iterator<String> it = e2.iterator();
        while (it.hasNext()) {
            String next = it.next();
            c.a(next, new Object[0]);
            if (next.contains("not found")) {
                return false;
            }
        }
        c.a("[core] sufile}", new Object[0]);
        return true;
    }

    public static boolean b() {
        try {
            if (new File("/system/app/Superuser.apk").exists()) {
                c.a("[core] super_apk", new Object[0]);
                return true;
            }
        } catch (Exception e2) {
            c.a((Throwable) e2);
        }
        return false;
    }

    public static boolean c() {
        String str = Build.TAGS;
        if (str == null || !str.contains("test-keys")) {
            return false;
        }
        c.a("[core] test-keys", new Object[0]);
        return true;
    }

    public static boolean d() {
        boolean z = true;
        if (a) {
            return true;
        }
        if (!c() && !b() && !a()) {
            z = false;
        }
        a = z;
        return z;
    }

    private static ArrayList<String> e() {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Process exec = Runtime.getRuntime().exec(new String[]{"/system/bin/sh", "-c", "type su"});
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream(), Charset.forName(MeasureConst.CHARSET_UTF8)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(exec.getErrorStream(), Charset.forName(MeasureConst.CHARSET_UTF8)));
            while (true) {
                String readLine2 = bufferedReader2.readLine();
                if (readLine2 == null) {
                    return arrayList;
                }
                arrayList.add(readLine2);
            }
        } catch (Throwable th) {
            c.a(th);
            return null;
        }
    }
}
