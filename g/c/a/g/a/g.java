package g.c.a.g.a;

import android.content.Intent;
import android.view.View;
import com.apkpure.aegon.main.activity.MainTabActivity;
import com.apkpure.aegon.person.activity.SettingsActivity;
import g.c.a.g.d.a;
import g.i.c.a.a.i.b;
import java.util.Objects;
import org.slf4j.Logger;

public final /* synthetic */ class g implements View.OnClickListener {
    public final /* synthetic */ MainTabActivity b;

    public /* synthetic */ g(MainTabActivity mainTabActivity) {
        this.b = mainTabActivity;
    }

    public final void onClick(View view) {
        MainTabActivity mainTabActivity = this.b;
        Objects.requireNonNull(mainTabActivity);
        Logger logger = a.a;
        mainTabActivity.startActivity(new Intent(mainTabActivity, SettingsActivity.class));
        b.C0166b.a.j(view);
    }
}
