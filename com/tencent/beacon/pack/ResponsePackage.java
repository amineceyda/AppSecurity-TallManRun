package com.tencent.beacon.pack;

public final class ResponsePackage extends AbstractResponseCommon {
    public static byte[] cache_sBuffer;
    public int cmd = 0;
    public String encryKey = "";
    public String encryPublicKey = "";
    public byte encryType = 0;
    public byte result = 0;
    public byte[] sBuffer = null;
    public byte zipType = 0;

    public ResponsePackage() {
    }

    public ResponsePackage(byte b, int i2, byte[] bArr, String str, byte b2, byte b3, long j2, String str2, String str3) {
        this.result = b;
        this.cmd = i2;
        this.sBuffer = bArr;
        this.srcGatewayIp = str;
        this.encryType = b2;
        this.zipType = b3;
        this.serverTime = j2;
        this.encryKey = str2;
        this.encryPublicKey = str3;
    }

    public void readFrom(a aVar) {
        this.result = aVar.a(this.result, 0, true);
        this.cmd = aVar.a(this.cmd, 1, true);
        if (cache_sBuffer == null) {
            byte[] bArr = new byte[1];
            cache_sBuffer = bArr;
            bArr[0] = 0;
        }
        this.sBuffer = aVar.a(cache_sBuffer, 2, true);
        this.srcGatewayIp = aVar.a(3, true);
        this.encryType = aVar.a(this.encryType, 4, true);
        this.zipType = aVar.a(this.zipType, 5, true);
        this.serverTime = aVar.a(this.serverTime, 6, true);
        this.encryKey = aVar.a(7, false);
        this.encryPublicKey = aVar.a(8, false);
    }

    public void writeTo(b bVar) {
        bVar.a(this.result, 0);
        bVar.a(this.cmd, 1);
        bVar.a(this.sBuffer, 2);
        bVar.a(this.srcGatewayIp, 3);
        bVar.a(this.encryType, 4);
        bVar.a(this.zipType, 5);
        bVar.a(this.serverTime, 6);
        String str = this.encryKey;
        if (str != null) {
            bVar.a(str, 7);
        }
        String str2 = this.encryPublicKey;
        if (str2 != null) {
            bVar.a(str2, 8);
        }
    }
}
