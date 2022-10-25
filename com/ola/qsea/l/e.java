package com.ola.qsea.l;

import android.content.Context;
import android.os.SystemClock;
import com.ola.qsea.k.a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

public class e {
    public String a;

    public e(Context context, String str) {
        if (context != null) {
            this.a = str;
        }
    }

    public String a() {
        String b = b();
        String e2 = a.c(this.a).e("f_uptimes");
        LinkedList linkedList = new LinkedList();
        boolean z = false;
        for (String str : e2.split(";")) {
            if (!str.isEmpty()) {
                linkedList.add(str);
            }
        }
        if (linkedList.size() == 0 || !((String) linkedList.getFirst()).equals(b)) {
            linkedList.addFirst(b);
            z = true;
        }
        if (linkedList.size() > 5) {
            linkedList.remove(linkedList.size() - 1);
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(";");
        }
        sb.deleteCharAt(sb.length() - 1);
        if (z) {
            a.c(this.a).b("f_uptimes", sb.toString());
        }
        return sb.toString();
    }

    public final String b() {
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        Date date = new Date();
        date.setTime(currentTimeMillis);
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(date);
    }
}
