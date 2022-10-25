package com.tencent.beacon.pack;

import java.util.HashMap;
import java.util.Map;

public final class RequestPacket extends AbstractJceStruct {
    public static Map<String, String> cache_context;
    public static byte[] cache_sBuffer;
    public byte cPacketType = 0;
    public Map<String, String> context;
    public int iMessageType = 0;
    public int iRequestId = 0;
    public int iTimeout = 0;
    public short iVersion = 3;
    public byte[] sBuffer;
    public String sFuncName = null;
    public String sServantName = null;
    public Map<String, String> status;

    public void readFrom(a aVar) {
        try {
            this.iVersion = aVar.a(this.iVersion, 1, true);
            this.cPacketType = aVar.a(this.cPacketType, 2, true);
            this.iMessageType = aVar.a(this.iMessageType, 3, true);
            this.iRequestId = aVar.a(this.iRequestId, 4, true);
            this.sServantName = aVar.a(5, true);
            this.sFuncName = aVar.a(6, true);
            if (cache_sBuffer == null) {
                cache_sBuffer = new byte[]{0};
            }
            this.sBuffer = aVar.a(cache_sBuffer, 7, true);
            this.iTimeout = aVar.a(this.iTimeout, 8, true);
            if (cache_context == null) {
                HashMap hashMap = new HashMap();
                cache_context = hashMap;
                hashMap.put("", "");
            }
            this.context = (Map) aVar.a(cache_context, 9, true);
            if (cache_context == null) {
                HashMap hashMap2 = new HashMap();
                cache_context = hashMap2;
                hashMap2.put("", "");
            }
            this.status = (Map) aVar.a(cache_context, 10, true);
        } catch (Exception e2) {
            e2.printStackTrace();
            throw new RuntimeException(e2);
        }
    }

    public void writeTo(b bVar) {
        bVar.a(this.iVersion, 1);
        bVar.a(this.cPacketType, 2);
        bVar.a(this.iMessageType, 3);
        bVar.a(this.iRequestId, 4);
        bVar.a(this.sServantName, 5);
        bVar.a(this.sFuncName, 6);
        bVar.a(this.sBuffer, 7);
        bVar.a(this.iTimeout, 8);
        bVar.a(this.context, 9);
        bVar.a(this.status, 10);
    }
}
