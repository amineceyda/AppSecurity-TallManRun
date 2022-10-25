package e.a.e.f;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;

public final class c extends a<Intent, ActivityResult> {
    public Intent a(Context context, Object obj) {
        return (Intent) obj;
    }

    public Object c(int i2, Intent intent) {
        return new ActivityResult(i2, intent);
    }
}
