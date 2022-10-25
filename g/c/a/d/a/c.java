package g.c.a.d.a;

import android.view.View;
import com.apkpure.aegon.cms.activity.SearchActivity;
import g.i.c.a.a.i.b;
import i.o.c.h;
import org.slf4j.Logger;

public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ SearchActivity b;

    public /* synthetic */ c(SearchActivity searchActivity) {
        this.b = searchActivity;
    }

    public final void onClick(View view) {
        SearchActivity searchActivity = this.b;
        Logger logger = SearchActivity.u;
        h.e(searchActivity, "this$0");
        searchActivity.y();
        b.C0166b.a.j(view);
    }
}
