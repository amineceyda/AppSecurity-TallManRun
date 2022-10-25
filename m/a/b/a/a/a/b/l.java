package m.a.b.a.a.a.b;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class l implements g0 {
    public final k0 b;
    public byte[] c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f5179d;

    public enum a {
        DES(26113),
        RC2pre52(26114),
        TripleDES168(26115),
        TripleDES192(26121),
        AES128(26126),
        AES192(26127),
        AES256(26128),
        RC2(26370),
        RC4(26625),
        UNKNOWN(65535);
        

        /* renamed from: l  reason: collision with root package name */
        public static final Map<Integer, a> f5188l = null;
        private final int code;

        /* access modifiers changed from: public */
        static {
            HashMap hashMap = new HashMap();
            a[] values = values();
            for (int i2 = 0; i2 < 10; i2++) {
                a aVar = values[i2];
                hashMap.put(Integer.valueOf(aVar.code), aVar);
            }
            f5188l = Collections.unmodifiableMap(hashMap);
        }

        /* access modifiers changed from: public */
        a(int i2) {
            this.code = i2;
        }
    }

    public enum b {
        b(0),
        CRC32(1),
        MD5(32771),
        f5191e(32772),
        RIPEND160(32775),
        SHA256(32780),
        SHA384(32781),
        SHA512(32782);
        

        /* renamed from: j  reason: collision with root package name */
        public static final Map<Integer, b> f5196j = null;
        private final int code;

        /* access modifiers changed from: public */
        static {
            HashMap hashMap = new HashMap();
            b[] values = values();
            for (int i2 = 0; i2 < 8; i2++) {
                b bVar = values[i2];
                hashMap.put(Integer.valueOf(bVar.code), bVar);
            }
            f5196j = Collections.unmodifiableMap(hashMap);
        }

        /* access modifiers changed from: public */
        b(int i2) {
            this.code = i2;
        }

        public static b a(int i2) {
            return f5196j.get(Integer.valueOf(i2));
        }
    }

    public l(k0 k0Var) {
        this.b = k0Var;
    }

    public k0 a() {
        return this.b;
    }

    public k0 b() {
        byte[] bArr = this.c;
        return new k0(bArr != null ? bArr.length : 0);
    }

    public byte[] c() {
        byte[] bArr = this.f5179d;
        return bArr != null ? l0.a(bArr) : h();
    }

    public k0 d() {
        byte[] bArr = this.f5179d;
        return bArr != null ? new k0(bArr.length) : b();
    }

    public void e(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.f5179d = l0.a(bArr2);
        if (this.c == null) {
            this.c = l0.a(bArr2);
        }
    }

    public void g(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.c = l0.a(bArr2);
    }

    public byte[] h() {
        return l0.a(this.c);
    }
}
