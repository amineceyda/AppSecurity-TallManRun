package g.e.a.b.b;

import java.lang.ref.WeakReference;

public abstract class s extends q {

    /* renamed from: d  reason: collision with root package name */
    public static final WeakReference<byte[]> f2873d = new WeakReference<>((Object) null);
    public WeakReference<byte[]> c = f2873d;

    public s(byte[] bArr) {
        super(bArr);
    }

    public final byte[] B() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.c.get();
            if (bArr == null) {
                bArr = C();
                this.c = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    public abstract byte[] C();
}
