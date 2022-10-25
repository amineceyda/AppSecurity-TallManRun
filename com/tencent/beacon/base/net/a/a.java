package com.tencent.beacon.base.net.a;

import com.tencent.beacon.base.net.a.c;
import com.tencent.beacon.e.g;
import com.tencent.beacon.pack.AbstractJceStruct;
import com.tencent.beacon.pack.RequestPackage;
import com.tencent.beacon.pack.ResponsePackage;

public final class a extends c.a<byte[], AbstractJceStruct> {
    private final C0006a a = new C0006a();
    private final b b = new b();

    /* renamed from: com.tencent.beacon.base.net.a.a$a  reason: collision with other inner class name */
    public static final class C0006a implements c<RequestPackage, byte[]> {
        private byte[] a(byte[] bArr) {
            g b = g.b();
            return b != null ? com.tencent.beacon.base.util.b.b(bArr, 2, 3, b.a()) : bArr;
        }

        private byte[] b(RequestPackage requestPackage) {
            com.tencent.beacon.pack.c cVar = new com.tencent.beacon.pack.c();
            cVar.a(1);
            cVar.b("test");
            cVar.a("test");
            cVar.b("detail", requestPackage);
            return cVar.a();
        }

        public byte[] a(RequestPackage requestPackage) {
            if (requestPackage == null) {
                return null;
            }
            StringBuilder i2 = g.a.a.a.a.i("RequestPackage: ");
            i2.append(requestPackage.toString());
            com.tencent.beacon.base.util.c.a("[BeaconNet]", i2.toString(), new Object[0]);
            byte[] a = a(b(requestPackage));
            if (a != null) {
                StringBuilder i3 = g.a.a.a.a.i("request package after processing size: ");
                i3.append(a.length);
                com.tencent.beacon.base.util.c.a("[BeaconNet]", i3.toString(), new Object[0]);
            }
            return a;
        }
    }

    public static final class b implements c<byte[], ResponsePackage> {
        private ResponsePackage b(byte[] bArr) {
            if (bArr == null) {
                return null;
            }
            try {
                if (bArr.length <= 0) {
                    return null;
                }
                com.tencent.beacon.pack.c cVar = new com.tencent.beacon.pack.c();
                cVar.a(bArr);
                return (ResponsePackage) cVar.a("detail", new ResponsePackage());
            } catch (Throwable unused) {
                return null;
            }
        }

        private byte[] c(byte[] bArr) {
            return com.tencent.beacon.base.util.b.a(bArr, 2, 3, g.b().a());
        }

        public ResponsePackage a(byte[] bArr) {
            if (bArr == null) {
                return null;
            }
            return b(c(bArr));
        }
    }

    public static a a() {
        return new a();
    }

    public c<byte[], ResponsePackage> b() {
        return this.b;
    }

    public c<RequestPackage, byte[]> c() {
        return this.a;
    }
}
