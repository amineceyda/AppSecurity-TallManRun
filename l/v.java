package l;

import android.support.v4.media.session.PlaybackStateCompat;
import javax.annotation.Nullable;

public final class v {
    @Nullable
    public static u a;
    public static long b;

    public static void a(u uVar) {
        if (uVar.f4986f != null || uVar.f4987g != null) {
            throw new IllegalArgumentException();
        } else if (!uVar.f4984d) {
            synchronized (v.class) {
                long j2 = b + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                if (j2 <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                    b = j2;
                    uVar.f4986f = a;
                    uVar.c = 0;
                    uVar.b = 0;
                    a = uVar;
                }
            }
        }
    }

    public static u b() {
        synchronized (v.class) {
            u uVar = a;
            if (uVar == null) {
                return new u();
            }
            a = uVar.f4986f;
            uVar.f4986f = null;
            b -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            return uVar;
        }
    }
}
