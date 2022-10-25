package f.a.a.b.z;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.regex.Pattern;

public class k {
    public final long a;

    static {
        Pattern.compile("([0-9]+)\\s*(|kb|mb|gb)s?", 2);
    }

    public k(long j2) {
        this.a = j2;
    }

    public String toString() {
        long j2 = this.a;
        long j3 = j2 / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (j3 == 0) {
            return this.a + " Bytes";
        }
        long j4 = j2 / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        if (j4 == 0) {
            return j3 + " KB";
        }
        long j5 = j2 / 1073741824;
        if (j5 == 0) {
            return j4 + " MB";
        }
        return j5 + " GB";
    }
}
