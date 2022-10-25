package g.c.a.g.a.n;

import com.tencent.trpcprotocol.projecta.common.common_card.nano.CommonCardItem;
import g.c.a.g.a.n.i;
import g.c.a.m.e;
import g.c.a.m.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;

public final /* synthetic */ class g implements e {
    public final /* synthetic */ i a;
    public final /* synthetic */ i.a b;

    public /* synthetic */ g(i iVar, i.a aVar) {
        this.a = iVar;
        this.b = aVar;
    }

    public final void a(Object obj) {
        Logger logger;
        String str;
        int i2;
        ArrayList arrayList;
        i iVar = this.a;
        i.a aVar = this.b;
        CommonCardItem[] commonCardItemArr = (CommonCardItem[]) obj;
        if (iVar.b != null) {
            if (commonCardItemArr == null || commonCardItemArr.length == 0) {
                logger = i.f2013e;
                str = "首页拉取到第 {} 页的数据为空";
                i2 = iVar.f2014d;
            } else {
                Logger logger2 = i.f2013e;
                logger2.debug("新拉取到的数据: ");
                iVar.e(Arrays.asList(commonCardItemArr));
                logger2.info("首页拉取到第 {} 页的数据,本次拉取到的长度为: {}, (未去重)", (Object) Integer.valueOf(iVar.f2014d), (Object) Integer.valueOf(commonCardItemArr.length));
                i.a aVar2 = i.a.loadMore;
                List<CommonCardItem> asList = Arrays.asList(commonCardItemArr);
                if (aVar == aVar2) {
                    synchronized (iVar) {
                        arrayList = new ArrayList();
                        for (CommonCardItem commonCardItem : asList) {
                            if (iVar.a(commonCardItem) && iVar.d(commonCardItem)) {
                                iVar.a.add(commonCardItem);
                                arrayList.add(commonCardItem);
                            }
                        }
                    }
                    i.f2013e.info("去重后: 首页拉取到第 {} 页的数据,本次拉取到的长度为: {},", (Object) Integer.valueOf(iVar.f2014d), (Object) Integer.valueOf(arrayList.size()));
                    iVar.f2014d++;
                    iVar.b.a(aVar, iVar.a, arrayList);
                } else {
                    iVar.a.clear();
                    if (aVar == i.a.refresh) {
                        iVar.f2014d = 1;
                    }
                    for (CommonCardItem commonCardItem2 : asList) {
                        if (iVar.a(commonCardItem2) && iVar.d(commonCardItem2)) {
                            iVar.a.add(commonCardItem2);
                        }
                    }
                    f<i.a, List<CommonCardItem>, List<CommonCardItem>> fVar = iVar.b;
                    List<CommonCardItem> list = iVar.a;
                    fVar.a(aVar, list, list);
                }
                logger = i.f2013e;
                logger.debug("处理完之后的 list : ");
                iVar.e(iVar.a);
                str = "本次拉取后的长度: {}";
                i2 = iVar.a.size();
            }
            logger.info(str, (Object) Integer.valueOf(i2));
        }
    }
}
