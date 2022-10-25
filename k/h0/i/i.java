package k.h0.i;

import java.io.IOException;
import java.util.Objects;
import k.h0.b;
import k.h0.i.r;
import l.e;

public class i extends b {
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e f4846d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f4847e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f4848f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f f4849g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(f fVar, String str, Object[] objArr, int i2, e eVar, int i3, boolean z) {
        super(str, objArr);
        this.f4849g = fVar;
        this.c = i2;
        this.f4846d = eVar;
        this.f4847e = i3;
        this.f4848f = z;
    }

    public void a() {
        try {
            r rVar = this.f4849g.f4827k;
            e eVar = this.f4846d;
            int i2 = this.f4847e;
            Objects.requireNonNull((r.a) rVar);
            eVar.c((long) i2);
            this.f4849g.s.k(this.c, a.f4790g);
            synchronized (this.f4849g) {
                this.f4849g.u.remove(Integer.valueOf(this.c));
            }
        } catch (IOException unused) {
        }
    }
}
