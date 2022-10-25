package android.support.v4.media.session;

import android.os.Bundle;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

public class MediaControllerCompat$MediaControllerImplApi21 {

    public static class ExtraBinderRequestResultReceiver extends ResultReceiver {
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> mMediaControllerImpl;

        public void onReceiveResult(int i2, Bundle bundle) {
            if (((MediaControllerCompat$MediaControllerImplApi21) this.mMediaControllerImpl.get()) != null && bundle != null) {
                throw null;
            }
        }
    }
}
