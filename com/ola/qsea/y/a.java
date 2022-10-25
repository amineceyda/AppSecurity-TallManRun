package com.ola.qsea.y;

import com.ola.qsea.strategy.terminal.ITerminalStrategy;

public class a implements ITerminalStrategy {
    public boolean a = false;
    public boolean b = true;
    public boolean c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f537d = true;

    /* renamed from: e  reason: collision with root package name */
    public boolean f538e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f539f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f540g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f541h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f542i = true;

    /* renamed from: j  reason: collision with root package name */
    public String f543j = "";

    /* renamed from: k  reason: collision with root package name */
    public String f544k = "";

    /* renamed from: l  reason: collision with root package name */
    public String f545l = "";

    /* renamed from: m  reason: collision with root package name */
    public String f546m = "";
    public String n = "";
    public String o = "";
    public String p = "";
    public String q = "";

    public String a() {
        return this.n;
    }

    public String b() {
        return this.q;
    }

    public String c() {
        return this.p;
    }

    public String d() {
        return this.f545l;
    }

    public String e() {
        return this.f546m;
    }

    public ITerminalStrategy enableAndroidId(boolean z) {
        this.f537d = z;
        return this;
    }

    public ITerminalStrategy enableAudit(boolean z) {
        this.f541h = z;
        return this;
    }

    public ITerminalStrategy enableBuildModel(boolean z) {
        this.f542i = z;
        return this;
    }

    public ITerminalStrategy enableCid(boolean z) {
        this.f539f = z;
        return this;
    }

    public ITerminalStrategy enableIMEI(boolean z) {
        this.b = z;
        return this;
    }

    public ITerminalStrategy enableIMSI(boolean z) {
        this.c = z;
        return this;
    }

    public ITerminalStrategy enableMAC(boolean z) {
        this.f538e = z;
        return this;
    }

    public ITerminalStrategy enableProcessInfo(boolean z) {
        this.f540g = z;
        return this;
    }

    public String f() {
        return this.o;
    }

    public String g() {
        return this.f544k;
    }

    public String h() {
        return this.f543j;
    }

    public boolean i() {
        return this.f537d;
    }

    public boolean j() {
        return this.f541h;
    }

    public boolean k() {
        return this.f542i;
    }

    public boolean l() {
        return this.f539f;
    }

    public boolean m() {
        return this.b;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.f538e;
    }

    public boolean p() {
        return this.f540g;
    }

    public ITerminalStrategy setAndroidId(String str) {
        this.n = str;
        return this;
    }

    public ITerminalStrategy setBuildModel(String str) {
        this.q = str;
        return this;
    }

    public ITerminalStrategy setCid(String str) {
        this.p = str;
        return this;
    }

    public ITerminalStrategy setIMEI(String str) {
        this.f545l = str;
        return this;
    }

    public ITerminalStrategy setIMSI(String str) {
        this.f546m = str;
        return this;
    }

    public ITerminalStrategy setMAC(String str) {
        this.o = str;
        return this;
    }

    public ITerminalStrategy setReportDomain(String str) {
        this.f543j = str;
        return this;
    }
}
