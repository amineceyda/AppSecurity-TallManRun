package e.b.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import e.b.h.n0;

public final class i {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static i c;
    public n0 a;

    public class a implements n0.f {
        public final int[] a = {2131230802, 2131230800, 2131230726};
        public final int[] b = {2131230750, 2131230785, 2131230757, 2131230752, 2131230753, 2131230756, 2131230755};
        public final int[] c = {2131230799, 2131230801, 2131230743, 2131230795, 2131230796, 2131230797, 2131230798};

        /* renamed from: d  reason: collision with root package name */
        public final int[] f1143d = {2131230775, 2131230741, 2131230774};

        /* renamed from: e  reason: collision with root package name */
        public final int[] f1144e = {2131230793, 2131230803};

        /* renamed from: f  reason: collision with root package name */
        public final int[] f1145f = {2131230729, 2131230735, 2131230730, 2131230736};

        public final boolean a(int[] iArr, int i2) {
            for (int i3 : iArr) {
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList b(Context context, int i2) {
            int c2 = s0.c(context, 2130968833);
            int b2 = s0.b(context, 2130968831);
            return new ColorStateList(new int[][]{s0.b, s0.f1187d, s0.c, s0.f1189f}, new int[]{b2, e.e.d.a.a(c2, i2), e.e.d.a.a(c2, i2), i2});
        }

        public final LayerDrawable c(n0 n0Var, Context context, int i2) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
            Drawable f2 = n0Var.f(context, 2131230789);
            Drawable f3 = n0Var.f(context, 2131230790);
            if ((f2 instanceof BitmapDrawable) && f2.getIntrinsicWidth() == dimensionPixelSize && f2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) f2;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f2.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((f3 instanceof BitmapDrawable) && f3.getIntrinsicWidth() == dimensionPixelSize && f3.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) f3;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                f3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f3.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        public ColorStateList d(Context context, int i2) {
            if (i2 == 2131230746) {
                return e.b.d.a.a.a(context, 2131099669);
            }
            if (i2 == 2131230792) {
                return e.b.d.a.a.a(context, 2131099672);
            }
            if (i2 == 2131230791) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList d2 = s0.d(context, 2130968850);
                if (d2 == null || !d2.isStateful()) {
                    iArr[0] = s0.b;
                    iArr2[0] = s0.b(context, 2130968850);
                    iArr[1] = s0.f1188e;
                    iArr2[1] = s0.c(context, 2130968832);
                    iArr[2] = s0.f1189f;
                    iArr2[2] = s0.c(context, 2130968850);
                } else {
                    iArr[0] = s0.b;
                    iArr2[0] = d2.getColorForState(iArr[0], 0);
                    iArr[1] = s0.f1188e;
                    iArr2[1] = s0.c(context, 2130968832);
                    iArr[2] = s0.f1189f;
                    iArr2[2] = d2.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i2 == 2131230734) {
                return b(context, s0.c(context, 2130968831));
            } else {
                if (i2 == 2131230728) {
                    return b(context, 0);
                }
                if (i2 == 2131230733) {
                    return b(context, s0.c(context, 2130968829));
                }
                if (i2 == 2131230787 || i2 == 2131230788) {
                    return e.b.d.a.a.a(context, 2131099671);
                }
                if (a(this.b, i2)) {
                    return s0.d(context, 2130968834);
                }
                if (a(this.f1144e, i2)) {
                    return e.b.d.a.a.a(context, 2131099668);
                }
                if (a(this.f1145f, i2)) {
                    return e.b.d.a.a.a(context, 2131099667);
                }
                if (i2 == 2131230784) {
                    return e.b.d.a.a.a(context, 2131099670);
                }
                return null;
            }
        }

        public final void e(Drawable drawable, int i2, PorterDuff.Mode mode) {
            PorterDuffColorFilter h2;
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = i.b;
            }
            synchronized (i.class) {
                h2 = n0.h(i2, mode);
            }
            drawable.setColorFilter(h2);
        }
    }

    public static synchronized i a() {
        i iVar;
        synchronized (i.class) {
            if (c == null) {
                d();
            }
            iVar = c;
        }
        return iVar;
    }

    public static synchronized void d() {
        synchronized (i.class) {
            if (c == null) {
                i iVar = new i();
                c = iVar;
                iVar.a = n0.d();
                n0 n0Var = c.a;
                a aVar = new a();
                synchronized (n0Var) {
                    n0Var.f1175g = aVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, v0 v0Var, int[] iArr) {
        PorterDuff.Mode mode = n0.f1169h;
        if (!e0.a(drawable) || drawable.mutate() == drawable) {
            boolean z = v0Var.f1200d;
            if (z || v0Var.c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = z ? v0Var.a : null;
                PorterDuff.Mode mode2 = v0Var.c ? v0Var.b : n0.f1169h;
                if (!(colorStateList == null || mode2 == null)) {
                    porterDuffColorFilter = n0.h(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public synchronized Drawable b(Context context, int i2) {
        return this.a.f(context, i2);
    }

    public synchronized ColorStateList c(Context context, int i2) {
        return this.a.i(context, i2);
    }
}
