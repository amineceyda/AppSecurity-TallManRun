package i.m.i;

import g.c.b.b.f;
import i.m.d;
import i.m.j.a.g;
import i.o.b.p;
import i.o.c.r;
import java.util.Objects;

public final class b extends g {
    public final /* synthetic */ d $completion;
    public final /* synthetic */ Object $receiver$inlined;
    public final /* synthetic */ p $this_createCoroutineUnintercepted$inlined;
    private int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(d dVar, d dVar2, p pVar, Object obj) {
        super(dVar2);
        this.$completion = dVar;
        this.$this_createCoroutineUnintercepted$inlined = pVar;
        this.$receiver$inlined = obj;
    }

    public Object l(Object obj) {
        int i2 = this.label;
        if (i2 == 0) {
            this.label = 1;
            f.q0(obj);
            p pVar = this.$this_createCoroutineUnintercepted$inlined;
            Objects.requireNonNull(pVar, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            r.b(pVar, 2);
            return pVar.d(this.$receiver$inlined, this);
        } else if (i2 == 1) {
            this.label = 2;
            f.q0(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
