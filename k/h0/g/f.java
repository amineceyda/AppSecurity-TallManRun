package k.h0.g;

import g.a.a.a.a;
import java.io.IOException;
import java.util.List;
import k.c0;
import k.d;
import k.h0.f.c;
import k.n;
import k.s;
import k.x;

public final class f implements s.a {
    public final List<s> a;
    public final k.h0.f.f b;
    public final c c;

    /* renamed from: d  reason: collision with root package name */
    public final c f4762d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4763e;

    /* renamed from: f  reason: collision with root package name */
    public final x f4764f;

    /* renamed from: g  reason: collision with root package name */
    public final d f4765g;

    /* renamed from: h  reason: collision with root package name */
    public final n f4766h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4767i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4768j;

    /* renamed from: k  reason: collision with root package name */
    public final int f4769k;

    /* renamed from: l  reason: collision with root package name */
    public int f4770l;

    public f(List<s> list, k.h0.f.f fVar, c cVar, c cVar2, int i2, x xVar, d dVar, n nVar, int i3, int i4, int i5) {
        this.a = list;
        this.f4762d = cVar2;
        this.b = fVar;
        this.c = cVar;
        this.f4763e = i2;
        this.f4764f = xVar;
        this.f4765g = dVar;
        this.f4766h = nVar;
        this.f4767i = i3;
        this.f4768j = i4;
        this.f4769k = i5;
    }

    public c0 a(x xVar) throws IOException {
        return b(xVar, this.b, this.c, this.f4762d);
    }

    public c0 b(x xVar, k.h0.f.f fVar, c cVar, c cVar2) throws IOException {
        if (this.f4763e < this.a.size()) {
            this.f4770l++;
            if (this.c == null) {
                x xVar2 = xVar;
            } else if (!this.f4762d.k(xVar.a)) {
                StringBuilder i2 = a.i("network interceptor ");
                i2.append(this.a.get(this.f4763e - 1));
                i2.append(" must retain the same host and port");
                throw new IllegalStateException(i2.toString());
            }
            if (this.c == null || this.f4770l <= 1) {
                List<s> list = this.a;
                int i3 = this.f4763e;
                d dVar = this.f4765g;
                n nVar = this.f4766h;
                int i4 = this.f4767i;
                int i5 = this.f4768j;
                String str = "network interceptor ";
                String str2 = " must call proceed() exactly once";
                f fVar2 = new f(list, fVar, cVar, cVar2, i3 + 1, xVar, dVar, nVar, i4, i5, this.f4769k);
                s sVar = list.get(i3);
                c0 a2 = sVar.a(fVar2);
                if (cVar != null && this.f4763e + 1 < this.a.size() && fVar2.f4770l != 1) {
                    throw new IllegalStateException(str + sVar + str2);
                } else if (a2 == null) {
                    throw new NullPointerException("interceptor " + sVar + " returned null");
                } else if (a2.f4692h != null) {
                    return a2;
                } else {
                    throw new IllegalStateException("interceptor " + sVar + " returned a response with no body");
                }
            } else {
                StringBuilder i6 = a.i("network interceptor ");
                i6.append(this.a.get(this.f4763e - 1));
                i6.append(" must call proceed() exactly once");
                throw new IllegalStateException(i6.toString());
            }
        } else {
            throw new AssertionError();
        }
    }
}
