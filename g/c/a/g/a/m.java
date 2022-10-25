package g.c.a.g.a;

import android.database.DataSetObserver;
import android.os.Handler;
import android.os.Looper;
import com.apkpure.aegon.main.activity.MainTabActivity;
import java.util.Objects;

public class m extends DataSetObserver {
    public final /* synthetic */ MainTabActivity a;

    public m(MainTabActivity mainTabActivity) {
        this.a = mainTabActivity;
    }

    public void onChanged() {
        if (this.a.r.getCount() > 0) {
            MainTabActivity mainTabActivity = this.a;
            Objects.requireNonNull(mainTabActivity);
            new Handler(Looper.getMainLooper()).postDelayed(new h(mainTabActivity), 500);
        }
    }
}
