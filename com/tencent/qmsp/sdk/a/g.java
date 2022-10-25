package com.tencent.qmsp.sdk.a;

public class g {
    private StringBuilder a;
    private boolean b;

    public g() {
        a();
    }

    private void b() {
        b(",");
    }

    private void b(String str) {
        if (this.b) {
            this.a.append(str);
        }
        this.b = true;
    }

    public g a() {
        this.a = new StringBuilder();
        this.b = false;
        return this;
    }

    public g a(int i2) {
        return a(String.format("%d", new Object[]{Integer.valueOf(i2)}));
    }

    public g a(String str) {
        b();
        this.a.append(str.replace(',', ';'));
        return this;
    }

    public String toString() {
        return this.a.toString();
    }
}
