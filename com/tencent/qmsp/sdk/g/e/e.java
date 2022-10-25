package com.tencent.qmsp.sdk.g.e;

import g.a.a.a.a;
import org.slf4j.helpers.MessageFormatter;

public class e {
    public int a;
    public long b = (System.currentTimeMillis() + 86400000);
    public String c;

    public e(String str, int i2) {
        this.c = str;
        this.a = i2;
    }

    public String toString() {
        StringBuilder i2 = a.i("ValueData{value='");
        a.p(i2, this.c, '\'', ", code=");
        i2.append(this.a);
        i2.append(", expired=");
        i2.append(this.b);
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
