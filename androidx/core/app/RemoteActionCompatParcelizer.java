package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import java.util.Objects;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.a;
        if (versionedParcel.i(1)) {
            obj = versionedParcel.o();
        }
        remoteActionCompat.a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.b;
        if (versionedParcel.i(2)) {
            charSequence = versionedParcel.h();
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (versionedParcel.i(3)) {
            charSequence2 = versionedParcel.h();
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.f156d = (PendingIntent) versionedParcel.m(remoteActionCompat.f156d, 4);
        boolean z = remoteActionCompat.f157e;
        if (versionedParcel.i(5)) {
            z = versionedParcel.f();
        }
        remoteActionCompat.f157e = z;
        boolean z2 = remoteActionCompat.f158f;
        if (versionedParcel.i(6)) {
            z2 = versionedParcel.f();
        }
        remoteActionCompat.f158f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        Objects.requireNonNull(versionedParcel);
        IconCompat iconCompat = remoteActionCompat.a;
        versionedParcel.p(1);
        versionedParcel.w(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        versionedParcel.p(2);
        versionedParcel.s(charSequence);
        CharSequence charSequence2 = remoteActionCompat.c;
        versionedParcel.p(3);
        versionedParcel.s(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f156d;
        versionedParcel.p(4);
        versionedParcel.u(pendingIntent);
        boolean z = remoteActionCompat.f157e;
        versionedParcel.p(5);
        versionedParcel.q(z);
        boolean z2 = remoteActionCompat.f158f;
        versionedParcel.p(6);
        versionedParcel.q(z2);
    }
}
