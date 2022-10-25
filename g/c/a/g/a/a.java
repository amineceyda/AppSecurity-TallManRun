package g.c.a.g.a;

import android.content.Intent;
import android.view.View;
import com.apkpure.aegon.app.activity.ManagerActivity;
import com.apkpure.aegon.main.activity.MainTabActivity;
import g.i.c.a.a.i.b;
import java.util.Objects;
import org.slf4j.Logger;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ MainTabActivity b;

    public /* synthetic */ a(MainTabActivity mainTabActivity) {
        this.b = mainTabActivity;
    }

    public final void onClick(View view) {
        MainTabActivity mainTabActivity = this.b;
        Objects.requireNonNull(mainTabActivity);
        Logger logger = g.c.a.g.d.a.a;
        mainTabActivity.startActivity(new Intent(mainTabActivity, ManagerActivity.class));
        b.C0166b.a.j(view);
    }
}
