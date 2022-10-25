package g.c.a.d.a;

import android.view.KeyEvent;
import android.view.View;
import com.apkpure.aegon.cms.activity.SearchActivity;
import i.o.c.h;
import org.slf4j.Logger;

public final /* synthetic */ class d implements View.OnKeyListener {
    public final /* synthetic */ SearchActivity b;

    public /* synthetic */ d(SearchActivity searchActivity) {
        this.b = searchActivity;
    }

    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        SearchActivity searchActivity = this.b;
        Logger logger = SearchActivity.u;
        h.e(searchActivity, "this$0");
        if (i2 != 66) {
            return false;
        }
        searchActivity.y();
        return false;
    }
}
