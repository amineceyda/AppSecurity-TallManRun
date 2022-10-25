package com.tencent.beacon.pack;

import java.util.HashMap;
import java.util.Map;

public final class SocketRequestPackage extends AbstractJceStruct {
    public static byte[] cache_body;
    public static Map<String, String> cache_header;
    public byte[] body = null;
    public Map<String, String> header = null;

    static {
        HashMap hashMap = new HashMap();
        cache_header = hashMap;
        hashMap.put("", "");
        byte[] bArr = new byte[1];
        cache_body = bArr;
        bArr[0] = 0;
    }

    public SocketRequestPackage() {
    }

    public SocketRequestPackage(Map<String, String> map, byte[] bArr) {
        this.header = map;
        this.body = bArr;
    }

    public void readFrom(a aVar) {
        this.header = (Map) aVar.a(cache_header, 0, true);
        this.body = aVar.a(cache_body, 1, true);
    }

    public void writeTo(b bVar) {
        bVar.a(this.header, 0);
        bVar.a(this.body, 1);
    }
}
