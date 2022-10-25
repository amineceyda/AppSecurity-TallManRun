package com.tencent.beacon.pack;

import java.util.HashMap;
import java.util.Map;

public final class SocketResponsePackage extends AbstractJceStruct {
    public static byte[] cache_body;
    public static Map<String, String> cache_header;
    public byte[] body = null;
    public Map<String, String> header = null;
    public String msg = "";
    public int statusCode = 0;

    static {
        HashMap hashMap = new HashMap();
        cache_header = hashMap;
        hashMap.put("", "");
        byte[] bArr = new byte[1];
        cache_body = bArr;
        bArr[0] = 0;
    }

    public SocketResponsePackage() {
    }

    public SocketResponsePackage(int i2, Map<String, String> map, byte[] bArr, String str) {
        this.statusCode = i2;
        this.header = map;
        this.body = bArr;
        this.msg = str;
    }

    public void readFrom(a aVar) {
        this.statusCode = aVar.a(this.statusCode, 0, true);
        this.header = (Map) aVar.a(cache_header, 1, true);
        this.body = aVar.a(cache_body, 2, true);
        this.msg = aVar.a(3, false);
    }

    public void writeTo(b bVar) {
        bVar.a(this.statusCode, 0);
        bVar.a(this.header, 1);
        bVar.a(this.body, 2);
        String str = this.msg;
        if (str != null) {
            bVar.a(str, 3);
        }
    }
}
