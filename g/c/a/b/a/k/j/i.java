package g.c.a.b.a.k.j;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.apkpure.aegon.app.activity.ManagerActivity;
import g.c.a.g.d.a;
import g.i.c.a.a.i.b;
import org.slf4j.Logger;

public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ r b;

    public /* synthetic */ i(r rVar) {
        this.b = rVar;
    }

    public final void onClick(View view) {
        Activity activity = this.b.a;
        Logger logger = a.a;
        activity.startActivity(new Intent(activity, ManagerActivity.class));
        b.C0166b.a.j(view);
    }
}
