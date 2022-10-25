package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import d.a.a.a.a;

public class MediaBrowserCompat$CustomActionResultReceiver extends ResultReceiver {
    private final String mAction;
    private final a mCallback;
    private final Bundle mExtras;

    public void a(int i2, Bundle bundle) {
        if (this.mCallback != null) {
            MediaSessionCompat.a(bundle);
            if (i2 == -1) {
                throw null;
            } else if (i2 == 0) {
                throw null;
            } else if (i2 != 1) {
                StringBuilder j2 = g.a.a.a.a.j("Unknown result code: ", i2, " (extras=");
                j2.append(this.mExtras);
                j2.append(", resultData=");
                j2.append(bundle);
                j2.append(")");
                Log.w("MediaBrowserCompat", j2.toString());
            } else {
                throw null;
            }
        }
    }
}
