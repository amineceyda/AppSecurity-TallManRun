package e.b.e.a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import e.b.e.a.b;

@SuppressLint({"RestrictedAPI"})
public class d extends b {
    public a o;
    public boolean p;

    public static class a extends b.c {
        public int[][] J;

        public a(a aVar, d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[this.f976g.length][];
            }
        }

        public void e() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.J = iArr2;
        }

        public int g(int[] iArr) {
            int[][] iArr2 = this.J;
            int i2 = this.f977h;
            for (int i3 = 0; i3 < i2; i3++) {
                if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                    return i3;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new d(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new d(this, resources);
        }
    }

    public d(a aVar) {
    }

    public d(a aVar, Resources resources) {
        e(new a(aVar, this, resources));
        onStateChange(getState());
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    public void e(b.c cVar) {
        this.b = cVar;
        int i2 = this.f967h;
        if (i2 >= 0) {
            Drawable d2 = cVar.d(i2);
            this.f963d = d2;
            if (d2 != null) {
                c(d2);
            }
        }
        this.f964e = null;
        if (cVar instanceof a) {
            this.o = (a) cVar;
        }
    }

    /* renamed from: f */
    public a b() {
        return new a(this.o, this, (Resources) null);
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.p) {
            super.mutate();
            if (this == this) {
                this.o.e();
                this.p = true;
            }
        }
        return this;
    }

    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int g2 = this.o.g(iArr);
        if (g2 < 0) {
            g2 = this.o.g(StateSet.WILD_CARD);
        }
        return d(g2) || onStateChange;
    }
}
