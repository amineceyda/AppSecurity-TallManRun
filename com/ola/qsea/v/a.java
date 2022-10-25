package com.ola.qsea.v;

import com.ola.qsea.shellapi.IDependency;
import com.ola.qsea.u.b;

public class a implements b {
    public final String a;
    public b b;

    public a(String str) {
        this.a = str;
    }

    public static void a(IDependency iDependency, String str) {
        b a2 = b.a();
        a2.a("BizInfo" + str, iDependency);
    }

    public String E() {
        return a() == null ? "" : a().E();
    }

    public String G() {
        return a() == null ? "" : a().G();
    }

    public String H() {
        return a() == null ? "" : a().H();
    }

    public String I() {
        return a() == null ? "" : a().I();
    }

    public String J() {
        return a() == null ? "" : a().J();
    }

    public void K() {
        if (a() != null) {
            a().K();
        }
    }

    public final b a() {
        b bVar = this.b;
        if (bVar != null) {
            return bVar;
        }
        b a2 = b.a();
        StringBuilder i2 = g.a.a.a.a.i("BizInfo");
        i2.append(this.a);
        IDependency a3 = a2.a(i2.toString());
        if (!(a3 instanceof b)) {
            return null;
        }
        b bVar2 = (b) a3;
        this.b = bVar2;
        return bVar2;
    }
}
