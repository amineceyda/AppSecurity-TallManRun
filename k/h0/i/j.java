package k.h0.i;

import java.util.Objects;
import k.h0.b;
import k.h0.i.r;

public class j extends b {
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a f4850d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f4851e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(f fVar, String str, Object[] objArr, int i2, a aVar) {
        super(str, objArr);
        this.f4851e = fVar;
        this.c = i2;
        this.f4850d = aVar;
    }

    public void a() {
        Objects.requireNonNull((r.a) this.f4851e.f4827k);
        synchronized (this.f4851e) {
            this.f4851e.u.remove(Integer.valueOf(this.c));
        }
    }
}
