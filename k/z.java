package k;

import java.io.IOException;
import javax.annotation.Nullable;
import l.f;
import l.s;

public class z extends b0 {
    public final /* synthetic */ t a;
    public final /* synthetic */ int b;
    public final /* synthetic */ byte[] c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4961d;

    public z(t tVar, int i2, byte[] bArr, int i3) {
        this.a = tVar;
        this.b = i2;
        this.c = bArr;
        this.f4961d = i3;
    }

    public long a() {
        return (long) this.b;
    }

    @Nullable
    public t b() {
        return this.a;
    }

    public void e(f fVar) throws IOException {
        ((s) fVar).b(this.c, this.f4961d, this.b);
    }
}
