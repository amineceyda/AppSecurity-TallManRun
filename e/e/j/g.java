package e.e.j;

import android.view.View;
import android.view.ViewParent;
import e.e.d.l.a;

public class g {
    public ViewParent a;
    public ViewParent b;
    public final View c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1336d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f1337e;

    public g(View view) {
        this.c = view;
    }

    public final boolean a(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent b2;
        int i7;
        int i8;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!this.f1336d || (b2 = b(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.c.getLocationInWindow(iArr4);
            i8 = iArr4[0];
            i7 = iArr4[1];
        } else {
            i8 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.f1337e == null) {
                this.f1337e = new int[2];
            }
            int[] iArr5 = this.f1337e;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr3 = iArr5;
        } else {
            iArr3 = iArr2;
        }
        a.f0(b2, this.c, i2, i3, i4, i5, i6, iArr3);
        if (iArr4 != null) {
            this.c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i8;
            iArr4[1] = iArr4[1] - i7;
        }
        return true;
    }

    public final ViewParent b(int i2) {
        if (i2 == 0) {
            return this.a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.b;
    }
}
