package g.c.a.g.a.n.j;

import com.tencent.trpcprotocol.projecta.common.common_card.nano.CommonCardItem;
import g.a.a.a.a;
import g.c.a.m.e;
import i.o.c.h;
import org.slf4j.Logger;

public final /* synthetic */ class b implements e {
    public final /* synthetic */ f a;

    public /* synthetic */ b(f fVar) {
        this.a = fVar;
    }

    public final void a(Object obj) {
        f fVar = this.a;
        CommonCardItem[] commonCardItemArr = (CommonCardItem[]) obj;
        h.e(fVar, "this$0");
        Logger logger = f.o;
        StringBuilder i2 = a.i("onBindViewHolder count[");
        i2.append(commonCardItemArr == null ? null : Integer.valueOf(commonCardItemArr.length));
        i2.append(']');
        logger.debug(i2.toString());
        fVar.n = true;
        if (commonCardItemArr != null) {
            fVar.k(commonCardItemArr);
        }
    }
}
