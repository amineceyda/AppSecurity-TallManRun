package e.j.a;

import android.content.BroadcastReceiver;
import android.os.PowerManager;
import android.util.SparseArray;

@Deprecated
public abstract class a extends BroadcastReceiver {
    public static final SparseArray<PowerManager.WakeLock> b = new SparseArray<>();
    public static int c = 1;
}
