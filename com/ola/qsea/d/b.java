package com.ola.qsea.d;

import com.ola.qsea.encrypt.U;
import com.ola.qsea.l.h;
import com.tencent.raft.codegenmeta.utils.Constants;

public class b {
    public static synchronized String a(int i2) {
        String str;
        synchronized (b.class) {
            String[] a = U.a(i2);
            if (a == null) {
                return null;
            }
            h.a(a);
            for (int i3 = 0; i3 < a.length; i3++) {
                a[i3] = h.a(a[i3]);
            }
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < a.length; i4++) {
                if (i4 >= 9) {
                    sb.append("k");
                    sb.append(i4 + 2);
                    sb.append(Constants.KEY_INDEX_FILE_SEPARATOR);
                    sb.append(a[i4]);
                    str = ";";
                } else {
                    sb.append("k");
                    sb.append(i4 + 1);
                    sb.append(Constants.KEY_INDEX_FILE_SEPARATOR);
                    sb.append(a[i4]);
                    str = ";";
                }
                sb.append(str);
            }
            sb.append("k10:");
            sb.append(1);
            String sb2 = sb.toString();
            return sb2;
        }
    }
}
