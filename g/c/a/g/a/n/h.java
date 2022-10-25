package g.c.a.g.a.n;

import com.tencent.raft.raftframework.sla.SLAConstant;
import com.tencent.trpcprotocol.projecta.common.common_card.nano.CommonCardData;
import com.tencent.trpcprotocol.projecta.common.common_card.nano.CommonCardItem;
import g.c.a.m.e;
import g.c.b.a.e;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class h {
    public static final Logger a = LoggerFactory.getLogger("MainTabActivityApiLog");

    public enum a {
        GAME_24H("game-24h"),
        APP_24H("app-24h"),
        GAME("trending-game"),
        APP("games-on-sale");
        
        /* access modifiers changed from: private */
        public final String type;

        /* access modifiers changed from: public */
        a(String str) {
            this.type = str;
        }
    }

    public enum b {
        trending("trending"),
        trendingGames("trending-games"),
        trendingApps("trending-apps"),
        gameOnSale("games-on-sale"),
        recentHotGames("recent-hot-games");
        
        private final String type;

        /* access modifiers changed from: public */
        b(String str) {
            this.type = str;
        }

        public String a() {
            return this.type;
        }
    }

    public static void a(a aVar, int i2, int i3, e<CommonCardItem[]> eVar) {
        e.a aVar2 = new e.a();
        aVar2.f("get_app_category");
        i.o.c.h.e("GET", "method");
        aVar2.a = "GET";
        aVar2.a("category_id", aVar.type);
        aVar2.a("top", SLAConstant.TYPE_DEPRECATED_START);
        aVar2.a("page_no", String.valueOf(i2));
        aVar2.a("page_size", String.valueOf(i3));
        aVar2.d(e.b);
        aVar2.c(CommonCardData.class, new d(eVar));
        aVar2.b(new f(eVar));
        aVar2.e();
    }
}
