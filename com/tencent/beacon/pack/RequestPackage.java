package com.tencent.beacon.pack;

public final class RequestPackage extends AbstractJceStruct {
    public static byte[] cache_sBuffer;
    public String appVersion = "";
    public String appkey = "";
    public int cmd = 0;
    public byte encryType = 0;
    public String model = "";
    public String osVersion = "";
    public byte platformId = 0;
    public String reserved = "";
    public byte[] sBuffer = null;
    public String sdkId = "";
    public String sdkVersion = "";
    public byte zipType = 0;

    public RequestPackage() {
    }

    public RequestPackage(byte b, String str, String str2, String str3, String str4, int i2, byte[] bArr, byte b2, byte b3, String str5, String str6, String str7) {
        this.platformId = b;
        this.appkey = str;
        this.appVersion = str2;
        this.sdkId = str3;
        this.sdkVersion = str4;
        this.cmd = i2;
        this.sBuffer = bArr;
        this.encryType = b2;
        this.zipType = b3;
        this.model = str5;
        this.osVersion = str6;
        this.reserved = str7;
    }

    public void readFrom(a aVar) {
        this.platformId = aVar.a(this.platformId, 0, true);
        this.appkey = aVar.a(1, true);
        this.appVersion = aVar.a(2, true);
        this.sdkId = aVar.a(3, true);
        this.sdkVersion = aVar.a(4, true);
        this.cmd = aVar.a(this.cmd, 5, true);
        if (cache_sBuffer == null) {
            byte[] bArr = new byte[1];
            cache_sBuffer = bArr;
            bArr[0] = 0;
        }
        this.sBuffer = aVar.a(cache_sBuffer, 6, true);
        this.encryType = aVar.a(this.encryType, 7, true);
        this.zipType = aVar.a(this.zipType, 8, true);
        this.model = aVar.a(9, false);
        this.osVersion = aVar.a(10, false);
        this.reserved = aVar.a(11, false);
    }

    public void writeTo(b bVar) {
        bVar.a(this.platformId, 0);
        bVar.a(this.appkey, 1);
        bVar.a(this.appVersion, 2);
        bVar.a(this.sdkId, 3);
        bVar.a(this.sdkVersion, 4);
        bVar.a(this.cmd, 5);
        bVar.a(this.sBuffer, 6);
        bVar.a(this.encryType, 7);
        bVar.a(this.zipType, 8);
        String str = this.model;
        if (str != null) {
            bVar.a(str, 9);
        }
        String str2 = this.osVersion;
        if (str2 != null) {
            bVar.a(str2, 10);
        }
        String str3 = this.reserved;
        if (str3 != null) {
            bVar.a(str3, 11);
        }
    }
}
