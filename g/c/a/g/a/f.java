package g.c.a.g.a;

import android.content.Intent;
import android.view.View;
import com.apkpure.aegon.cms.activity.SearchActivity;
import com.apkpure.aegon.main.activity.MainTabActivity;
import g.c.a.g.d.a;
import g.i.c.a.a.i.b;
import java.util.Objects;
import org.slf4j.Logger;

public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ MainTabActivity b;

    public /* synthetic */ f(MainTabActivity mainTabActivity) {
        this.b = mainTabActivity;
    }

    public final void onClick(View view) {
        MainTabActivity mainTabActivity = this.b;
        Objects.requireNonNull(mainTabActivity);
        Logger logger = a.a;
        mainTabActivity.startActivity(new Intent(mainTabActivity, SearchActivity.class));
        b.C0166b.a.j(view);
    }
}
