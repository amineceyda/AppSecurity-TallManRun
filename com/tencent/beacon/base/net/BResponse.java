package com.tencent.beacon.base.net;

import g.a.a.a.a;
import java.util.List;
import java.util.Map;
import org.slf4j.helpers.MessageFormatter;

public class BResponse {
    public byte[] body;
    public int code;
    public Map<String, List<String>> headers;
    public String msg;

    public BResponse(Map<String, List<String>> map, int i2, String str, byte[] bArr) {
        this.headers = map;
        this.code = i2;
        this.msg = str;
        this.body = bArr;
    }

    public String toString() {
        StringBuilder i2 = a.i("BResponse{code=");
        i2.append(this.code);
        i2.append(", msg='");
        i2.append(this.msg);
        i2.append('\'');
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
