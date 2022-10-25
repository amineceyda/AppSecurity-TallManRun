package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import g.e.a.a.e.c;
import g.e.a.a.f.v.d;
import g.e.a.a.f.v.h;
import g.e.a.a.f.v.m;

@Keep
public class CctBackendFactory implements d {
    public m create(h hVar) {
        return new c(hVar.a(), hVar.d(), hVar.c());
    }
}
