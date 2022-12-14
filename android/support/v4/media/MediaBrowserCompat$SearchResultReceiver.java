package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import d.a.a.a.c;
import java.util.ArrayList;

public class MediaBrowserCompat$SearchResultReceiver extends ResultReceiver {
    private final c mCallback;
    private final Bundle mExtras;
    private final String mQuery;

    public void a(int i2, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        if (i2 != 0 || bundle == null || !bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        if (parcelableArray != null) {
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
            }
        }
        throw null;
    }
}
