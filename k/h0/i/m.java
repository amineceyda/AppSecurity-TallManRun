package k.h0.i;

import java.io.IOException;
import k.h0.b;
import k.h0.i.f;

public class m extends b {
    public final /* synthetic */ s c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f.C0197f f4853d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(f.C0197f fVar, String str, Object[] objArr, s sVar) {
        super(str, objArr);
        this.f4853d = fVar;
        this.c = sVar;
    }

    public void a() {
        try {
            f.this.s.a(this.c);
        } catch (IOException unused) {
            f.a(f.this);
        }
    }
}
