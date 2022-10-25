package androidx.media;

import androidx.versionedparcelable.VersionedParcel;
import java.util.Objects;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.a;
        if (versionedParcel.i(1)) {
            obj = versionedParcel.o();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        Objects.requireNonNull(versionedParcel);
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        versionedParcel.p(1);
        versionedParcel.w(audioAttributesImpl);
    }
}
