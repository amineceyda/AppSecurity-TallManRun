package e.e.j;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import java.util.Locale;
import java.util.Objects;

public final class c {
    public final ClipData a;
    public final int b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final Uri f1331d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f1332e;

    public static final class a {
        public ClipData a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public Uri f1333d;

        /* renamed from: e  reason: collision with root package name */
        public Bundle f1334e;

        public a(ClipData clipData, int i2) {
            this.a = clipData;
            this.b = i2;
        }
    }

    public c(a aVar) {
        ClipData clipData = aVar.a;
        Objects.requireNonNull(clipData);
        this.a = clipData;
        int i2 = aVar.b;
        if (i2 < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{"source", 0, 3}));
        } else if (i2 <= 3) {
            this.b = i2;
            int i3 = aVar.c;
            if ((i3 & 1) == i3) {
                this.c = i3;
                this.f1331d = aVar.f1333d;
                this.f1332e = aVar.f1334e;
                return;
            }
            StringBuilder i4 = g.a.a.a.a.i("Requested flags 0x");
            i4.append(Integer.toHexString(i3));
            i4.append(", but only 0x");
            i4.append(Integer.toHexString(1));
            i4.append(" are allowed");
            throw new IllegalArgumentException(i4.toString());
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{"source", 0, 3}));
        }
    }

    public String toString() {
        String str;
        StringBuilder i2 = g.a.a.a.a.i("ContentInfoCompat{clip=");
        i2.append(this.a);
        i2.append(", source=");
        int i3 = this.b;
        i2.append(i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? String.valueOf(i3) : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
        i2.append(", flags=");
        int i4 = this.c;
        if ((i4 & 1) != 0) {
            str = "FLAG_CONVERT_TO_PLAIN_TEXT";
        } else {
            str = String.valueOf(i4);
        }
        i2.append(str);
        i2.append(", linkUri=");
        i2.append(this.f1331d);
        i2.append(", extras=");
        i2.append(this.f1332e);
        i2.append("}");
        return i2.toString();
    }
}
