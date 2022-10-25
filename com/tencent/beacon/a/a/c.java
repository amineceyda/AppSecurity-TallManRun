package com.tencent.beacon.a.a;

import g.a.a.a.a;
import java.util.Map;
import org.slf4j.helpers.MessageFormatter;

public final class c {
    public int a;
    public Map<String, Object> b;

    public c(int i2) {
        this.a = i2;
    }

    public c(int i2, Map<String, Object> map) {
        this.a = i2;
        this.b = map;
    }

    public String toString() {
        StringBuilder i2 = a.i("BusEvent{channel=");
        i2.append(this.a);
        i2.append(", params=");
        i2.append(this.b);
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
