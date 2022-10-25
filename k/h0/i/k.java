package k.h0.i;

import g.a.a.a.a;
import java.io.IOException;
import k.h0.b;
import k.h0.i.f;

public class k extends b {
    public final /* synthetic */ o c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f.C0197f f4852d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(f.C0197f fVar, String str, Object[] objArr, o oVar) {
        super(str, objArr);
        this.f4852d = fVar;
        this.c = oVar;
    }

    public void a() {
        try {
            f.this.c.b(this.c);
        } catch (IOException e2) {
            k.h0.j.f fVar = k.h0.j.f.a;
            StringBuilder i2 = a.i("Http2Connection.Listener failure for ");
            i2.append(f.this.f4821e);
            fVar.l(4, i2.toString(), e2);
            try {
                this.c.c(a.PROTOCOL_ERROR);
            } catch (IOException unused) {
            }
        }
    }
}
