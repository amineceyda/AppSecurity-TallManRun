package g.c.a.b.a;

import android.content.Intent;
import android.view.View;
import com.apkpure.aegon.app.activity.ManagerActivity;
import com.apkpure.aegon.person.activity.SettingsActivity;
import g.c.a.g.d.a;
import g.i.c.a.a.i.b;
import i.o.c.h;
import org.slf4j.Logger;

public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ ManagerActivity b;

    public /* synthetic */ d(ManagerActivity managerActivity) {
        this.b = managerActivity;
    }

    public final void onClick(View view) {
        ManagerActivity managerActivity = this.b;
        int i2 = ManagerActivity.A;
        h.e(managerActivity, "this$0");
        Logger logger = a.a;
        managerActivity.startActivity(new Intent(managerActivity, SettingsActivity.class));
        b.C0166b.a.j(view);
    }
}
