package k.h0.i;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import k.h0.b;

public class h extends b {
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ List f4843d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f4844e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f f4845f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(f fVar, String str, Object[] objArr, int i2, List list, boolean z) {
        super(str, objArr);
        this.f4845f = fVar;
        this.c = i2;
        this.f4843d = list;
        this.f4844e = z;
    }

    public void a() {
        Objects.requireNonNull(this.f4845f.f4827k);
        try {
            this.f4845f.s.k(this.c, a.f4790g);
            synchronized (this.f4845f) {
                this.f4845f.u.remove(Integer.valueOf(this.c));
            }
        } catch (IOException unused) {
        }
    }
}
