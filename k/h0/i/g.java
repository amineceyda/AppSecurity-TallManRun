package k.h0.i;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import k.h0.b;

public class g extends b {
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ List f4841d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f4842e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(f fVar, String str, Object[] objArr, int i2, List list) {
        super(str, objArr);
        this.f4842e = fVar;
        this.c = i2;
        this.f4841d = list;
    }

    public void a() {
        Objects.requireNonNull(this.f4842e.f4827k);
        try {
            this.f4842e.s.k(this.c, a.f4790g);
            synchronized (this.f4842e) {
                this.f4842e.u.remove(Integer.valueOf(this.c));
            }
        } catch (IOException unused) {
        }
    }
}
