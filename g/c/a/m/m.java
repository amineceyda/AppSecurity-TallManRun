package g.c.a.m;

import android.app.Activity;
import android.content.res.Resources;
import android.view.KeyCharacterMap;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;

public final class m implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ Activity c;

    public m(View view, Activity activity) {
        this.b = view;
        this.c = activity;
    }

    public void onGlobalLayout() {
        int i2;
        this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int a = k.a(this.c);
        Activity activity = this.c;
        boolean hasPermanentMenuKey = ViewConfiguration.get(activity).hasPermanentMenuKey();
        boolean deviceHasKey = KeyCharacterMap.deviceHasKey(4);
        if (hasPermanentMenuKey || deviceHasKey) {
            i2 = 0;
        } else {
            Resources resources = activity.getResources();
            i2 = resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
        }
        if (this.b.getHeight() + i2 == a) {
            this.b.setPadding(0, 0, 0, 0);
        }
    }
}
