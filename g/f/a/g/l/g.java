package g.f.a.g.l;

import g.f.a.d.f;
import g.f.a.d.i;
import g.f.a.i.c;

public class g<T, ID> extends b<T, ID> {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int f4009i = 0;

    /* renamed from: g  reason: collision with root package name */
    public final i f4010g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4011h;

    public g(c<T, ID> cVar, String str, i[] iVarArr, i iVar, int i2) {
        super(cVar, str, iVarArr);
        this.f4010g = iVar;
        this.f4011h = i2;
    }

    public static boolean e(i iVar, i iVar2) {
        if (iVar == iVar2) {
            return false;
        }
        f fVar = iVar.f3876e;
        return !fVar.F && !fVar.E;
    }
}
