package com.ola.qsea.v;

import android.content.Context;
import com.ola.qsea.shellapi.IDependency;
import com.ola.qsea.u.b;

public class d implements c {
    public static volatile d a;
    public c b;

    public static void a(IDependency iDependency) {
        b.a().a("SdkInfo", iDependency);
    }

    public static d b() {
        if (a == null) {
            synchronized (d.class) {
                if (a == null) {
                    a = new d();
                }
            }
        }
        return a;
    }

    public synchronized Context F() {
        if (a() == null) {
            return null;
        }
        return a().F();
    }

    public String L() {
        return a() == null ? "" : a().L();
    }

    public final c a() {
        IDependency a2 = b.a().a("SdkInfo");
        if (!(a2 instanceof c)) {
            return null;
        }
        c cVar = (c) a2;
        this.b = cVar;
        return cVar;
    }

    public String getSdkVersion() {
        return a() == null ? "" : a().getSdkVersion();
    }
}
