package com.tencent.beacon.base.net.a;

import com.tencent.beacon.base.net.a.c;
import com.tencent.beacon.e.g;
import com.tencent.beacon.pack.AbstractJceStruct;
import com.tencent.beacon.pack.RequestPackageV2;
import com.tencent.beacon.pack.ResponsePackageV2;

public class b extends c.a<byte[], AbstractJceStruct> {
    private final a a = new a();
    private final C0007b b = new C0007b();

    public static final class a implements c<RequestPackageV2, byte[]> {
        private byte[] a(byte[] bArr) {
            g b = g.b();
            return b != null ? com.tencent.beacon.e.b.a().j() ? com.tencent.beacon.base.util.b.b(bArr, 2, 3, b.a()) : com.tencent.beacon.base.util.b.b(bArr, 2) : bArr;
        }

        public byte[] a(RequestPackageV2 requestPackageV2) {
            if (requestPackageV2 == null) {
                return null;
            }
            StringBuilder i2 = g.a.a.a.a.i("RequestPackageV2: ");
            i2.append(requestPackageV2.toString());
            com.tencent.beacon.base.util.c.a("[BeaconNet]", i2.toString(), new Object[0]);
            com.tencent.beacon.pack.b bVar = new com.tencent.beacon.pack.b();
            requestPackageV2.writeTo(bVar);
            byte[] a = a(bVar.b());
            if (a != null) {
                StringBuilder i3 = g.a.a.a.a.i("request package after processing size: ");
                i3.append(a.length);
                com.tencent.beacon.base.util.c.a("[BeaconNet]", i3.toString(), new Object[0]);
            }
            return a;
        }
    }

    /* renamed from: com.tencent.beacon.base.net.a.b$b  reason: collision with other inner class name */
    public static final class C0007b implements c<byte[], ResponsePackageV2> {
        private byte[] b(byte[] bArr) {
            return com.tencent.beacon.e.b.a().j() ? com.tencent.beacon.base.util.b.a(bArr, 2, 3, g.b().a()) : com.tencent.beacon.base.util.b.a(bArr, 2);
        }

        public ResponsePackageV2 a(byte[] bArr) {
            if (bArr == null) {
                return null;
            }
            byte[] b = b(bArr);
            ResponsePackageV2 responsePackageV2 = new ResponsePackageV2();
            responsePackageV2.readFrom(new com.tencent.beacon.pack.a(b));
            return responsePackageV2;
        }
    }

    public static b a() {
        return new b();
    }

    public c<byte[], ResponsePackageV2> b() {
        return this.b;
    }

    public c<RequestPackageV2, byte[]> c() {
        return this.a;
    }
}
