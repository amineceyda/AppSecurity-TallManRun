package com.ola.qsea.w;

import android.content.Context;

public class c implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ k c;

    public c(String str, Context context, k kVar) {
        this.a = str;
        this.b = context;
        this.c = kVar;
    }

    public void run() {
        f.a(this.a).a(this.b, this.c);
    }
}
