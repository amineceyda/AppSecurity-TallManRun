package com.ola.qsea.h;

import android.net.ConnectivityManager;
import android.net.Network;

public class a extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    public void onAvailable(Network network) {
        if (!this.a.c) {
            boolean unused = this.a.c = true;
            com.ola.qsea.m.a.b("QSEA", "current network switched to the available state", new Object[0]);
            this.a.c();
        }
    }

    public void onLost(Network network) {
        boolean unused = this.a.c = false;
        com.ola.qsea.m.a.b("QSEA", "current network lost", new Object[0]);
        this.a.d();
    }
}
