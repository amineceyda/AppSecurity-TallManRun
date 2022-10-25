package g.c.a.g.a.n.j;

import com.tencent.trpcprotocol.projecta.common.common_card.nano.CommonCardItem;
import g.c.a.m.e;
import i.o.c.h;
import org.slf4j.Logger;

public final /* synthetic */ class a implements e {
    public final /* synthetic */ e a;

    public /* synthetic */ a(e eVar) {
        this.a = eVar;
    }

    public final void a(Object obj) {
        e eVar = this.a;
        CommonCardItem[] commonCardItemArr = (CommonCardItem[]) obj;
        h.e(eVar, "this$0");
        Logger logger = e.o;
        StringBuilder i2 = g.a.a.a.a.i("onBindViewHolder count[");
        i2.append(commonCardItemArr == null ? null : Integer.valueOf(commonCardItemArr.length));
        i2.append(']');
        logger.info(i2.toString());
        eVar.n = true;
        if (commonCardItemArr != null) {
            eVar.k(commonCardItemArr);
        }
    }
}
