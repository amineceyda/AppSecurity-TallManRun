package com.ola.qsea.o;

import com.ola.qsea.e.c;
import com.ola.qsea.m.a;

public class h implements c {
    public final /* synthetic */ String a;
    public final /* synthetic */ i b;

    public h(i iVar, String str) {
        this.b = iVar;
        this.a = str;
    }

    public void a(String str) {
        a.b("UPLOAD", "(appKey: %s) Report ok. %s", this.a, str);
    }

    public void a(String str, int i2, String str2) {
        a.b("UPLOAD", "Report failed. error: %s,%d,%s", str, Integer.valueOf(i2), str2);
    }
}
