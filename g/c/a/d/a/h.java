package g.c.a.d.a;

import android.widget.EditText;
import com.apkpure.aegon.cms.activity.SearchActivity;
import com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano.SearchTopKeywordInfo;
import g.a.a.a.a;
import g.c.a.d.b.i;
import g.c.a.f.b;
import java.util.Objects;
import org.slf4j.Logger;

public final class h implements i.a {
    public final /* synthetic */ SearchActivity a;

    public h(SearchActivity searchActivity) {
        this.a = searchActivity;
    }

    public void a(SearchTopKeywordInfo searchTopKeywordInfo, int i2) {
        EditText editText;
        SearchActivity searchActivity = this.a;
        Logger logger = SearchActivity.u;
        Objects.requireNonNull(searchActivity);
        String str = searchTopKeywordInfo.link;
        boolean z = true;
        if (!(str == null || str.length() == 0)) {
            Logger logger2 = SearchActivity.u;
            StringBuilder i3 = a.i("Key work link[");
            i3.append(searchTopKeywordInfo.link);
            i3.append("].");
            logger2.debug(i3.toString());
        }
        String str2 = searchTopKeywordInfo.keyword;
        if (!(str2 == null || str2.length() == 0)) {
            z = false;
        }
        if (z) {
            SearchActivity.u.info("Key work is null or empty.");
            return;
        }
        b bVar = searchActivity.r;
        if (!(bVar == null || (editText = bVar.f2003d) == null)) {
            editText.setText(searchTopKeywordInfo.keyword.toString());
        }
        searchActivity.y();
    }
}
