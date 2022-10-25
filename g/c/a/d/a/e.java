package g.c.a.d.a;

import android.view.View;
import android.widget.EditText;
import com.apkpure.aegon.cms.activity.SearchActivity;
import g.c.a.f.b;
import g.i.c.a.a.i.b;
import i.o.c.h;
import org.slf4j.Logger;

public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ SearchActivity b;

    public /* synthetic */ e(SearchActivity searchActivity) {
        this.b = searchActivity;
    }

    public final void onClick(View view) {
        EditText editText;
        SearchActivity searchActivity = this.b;
        Logger logger = SearchActivity.u;
        h.e(searchActivity, "this$0");
        b bVar = searchActivity.r;
        if (!(bVar == null || (editText = bVar.f2003d) == null)) {
            editText.setText("");
        }
        b.C0166b.a.j(view);
    }
}
