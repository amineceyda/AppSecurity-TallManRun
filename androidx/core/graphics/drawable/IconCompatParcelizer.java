package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;
import java.nio.charset.Charset;
import java.util.Objects;

public class IconCompatParcelizer {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.core.graphics.drawable.IconCompat read(androidx.versionedparcelable.VersionedParcel r5) {
        /*
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            int r1 = r0.a
            r2 = 1
            int r1 = r5.k(r1, r2)
            r0.a = r1
            byte[] r1 = r0.c
            r2 = 2
            boolean r3 = r5.i(r2)
            if (r3 != 0) goto L_0x0018
            goto L_0x001c
        L_0x0018:
            byte[] r1 = r5.g()
        L_0x001c:
            r0.c = r1
            android.os.Parcelable r1 = r0.f162d
            r3 = 3
            android.os.Parcelable r1 = r5.m(r1, r3)
            r0.f162d = r1
            int r1 = r0.f163e
            r4 = 4
            int r1 = r5.k(r1, r4)
            r0.f163e = r1
            int r1 = r0.f164f
            r4 = 5
            int r1 = r5.k(r1, r4)
            r0.f164f = r1
            android.content.res.ColorStateList r1 = r0.f165g
            r4 = 6
            android.os.Parcelable r1 = r5.m(r1, r4)
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            r0.f165g = r1
            java.lang.String r1 = r0.f167i
            r4 = 7
            boolean r4 = r5.i(r4)
            if (r4 != 0) goto L_0x004e
            goto L_0x0052
        L_0x004e:
            java.lang.String r1 = r5.n()
        L_0x0052:
            r0.f167i = r1
            java.lang.String r1 = r0.f168j
            r4 = 8
            boolean r4 = r5.i(r4)
            if (r4 != 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            java.lang.String r1 = r5.n()
        L_0x0063:
            r0.f168j = r1
            java.lang.String r5 = r0.f167i
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.valueOf(r5)
            r0.f166h = r5
            int r5 = r0.a
            r1 = 0
            switch(r5) {
                case -1: goto L_0x00ad;
                case 0: goto L_0x0073;
                case 1: goto L_0x009c;
                case 2: goto L_0x0079;
                case 3: goto L_0x0074;
                case 4: goto L_0x0079;
                case 5: goto L_0x009c;
                case 6: goto L_0x0079;
                default: goto L_0x0073;
            }
        L_0x0073:
            goto L_0x00bc
        L_0x0074:
            byte[] r5 = r0.c
            r0.b = r5
            goto L_0x00bc
        L_0x0079:
            java.lang.String r5 = new java.lang.String
            byte[] r3 = r0.c
            java.lang.String r4 = "UTF-16"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            r5.<init>(r3, r4)
            r0.b = r5
            int r3 = r0.a
            if (r3 != r2) goto L_0x00bc
            java.lang.String r2 = r0.f168j
            if (r2 != 0) goto L_0x00bc
            r2 = -1
            java.lang.String r3 = ":"
            java.lang.String[] r5 = r5.split(r3, r2)
            r5 = r5[r1]
            r0.f168j = r5
            goto L_0x00bc
        L_0x009c:
            android.os.Parcelable r5 = r0.f162d
            if (r5 == 0) goto L_0x00a1
            goto L_0x00b1
        L_0x00a1:
            byte[] r5 = r0.c
            r0.b = r5
            r0.a = r3
            r0.f163e = r1
            int r5 = r5.length
            r0.f164f = r5
            goto L_0x00bc
        L_0x00ad:
            android.os.Parcelable r5 = r0.f162d
            if (r5 == 0) goto L_0x00b4
        L_0x00b1:
            r0.b = r5
            goto L_0x00bc
        L_0x00b4:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid icon"
            r5.<init>(r0)
            throw r5
        L_0x00bc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompatParcelizer.read(androidx.versionedparcelable.VersionedParcel):androidx.core.graphics.drawable.IconCompat");
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        Objects.requireNonNull(versionedParcel);
        iconCompat.f167i = iconCompat.f166h.name();
        switch (iconCompat.a) {
            case -1:
            case 1:
            case 5:
                iconCompat.f162d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.a;
        if (-1 != i2) {
            versionedParcel.p(1);
            versionedParcel.t(i2);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            versionedParcel.p(2);
            versionedParcel.r(bArr);
        }
        Parcelable parcelable = iconCompat.f162d;
        if (parcelable != null) {
            versionedParcel.p(3);
            versionedParcel.u(parcelable);
        }
        int i3 = iconCompat.f163e;
        if (i3 != 0) {
            versionedParcel.p(4);
            versionedParcel.t(i3);
        }
        int i4 = iconCompat.f164f;
        if (i4 != 0) {
            versionedParcel.p(5);
            versionedParcel.t(i4);
        }
        ColorStateList colorStateList = iconCompat.f165g;
        if (colorStateList != null) {
            versionedParcel.p(6);
            versionedParcel.u(colorStateList);
        }
        String str = iconCompat.f167i;
        if (str != null) {
            versionedParcel.p(7);
            versionedParcel.v(str);
        }
        String str2 = iconCompat.f168j;
        if (str2 != null) {
            versionedParcel.p(8);
            versionedParcel.v(str2);
        }
    }
}
