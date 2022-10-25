package e.b.h;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import e.b.a;
import e.e.c.c.b;
import e.e.c.c.g;
import e.e.d.d;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

public class x0 {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    public x0(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static x0 n(Context context, AttributeSet attributeSet, int[] iArr) {
        return new x0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static x0 o(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new x0(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public boolean a(int i2, boolean z) {
        return this.b.getBoolean(i2, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = e.b.d.a.a.a(r2.a, (r0 = r2.b.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList b(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.a
            android.content.res.ColorStateList r0 = e.b.d.a.a.a(r1, r0)
            if (r0 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.b
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.x0.b(int):android.content.res.ColorStateList");
    }

    public int c(int i2, int i3) {
        return this.b.getDimensionPixelOffset(i2, i3);
    }

    public int d(int i2, int i3) {
        return this.b.getDimensionPixelSize(i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.b.getResourceId(r3, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable e(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.a
            android.graphics.drawable.Drawable r3 = e.b.d.a.a.b(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.x0.e(int):android.graphics.drawable.Drawable");
    }

    public Drawable f(int i2) {
        int resourceId;
        Drawable g2;
        if (!this.b.hasValue(i2) || (resourceId = this.b.getResourceId(i2, 0)) == 0) {
            return null;
        }
        i a2 = i.a();
        Context context = this.a;
        synchronized (a2) {
            g2 = a2.a.g(context, resourceId, true);
        }
        return g2;
    }

    public Typeface g(int i2, int i3, g gVar) {
        String str;
        StringBuilder sb;
        int resourceId = this.b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        Context context = this.a;
        TypedValue typedValue = this.c;
        if (context.isRestricted()) {
            return null;
        }
        Resources resources = context.getResources();
        resources.getValue(resourceId, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (charSequence2.startsWith("res/")) {
                Typeface b2 = d.b.b(d.c(resources, resourceId, i3));
                if (b2 != null) {
                    gVar.b(b2, (Handler) null);
                    return b2;
                }
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        b r = a.r(resources.getXml(resourceId), resources);
                        if (r != null) {
                            return d.a(context, r, resources, resourceId, i3, gVar, (Handler) null, true);
                        }
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        gVar.a(-3, (Handler) null);
                        return null;
                    }
                    Typeface b3 = d.b(context, resources, resourceId, charSequence2, i3);
                    if (b3 != null) {
                        gVar.b(b3, (Handler) null);
                    } else {
                        gVar.a(-3, (Handler) null);
                    }
                    return b3;
                } catch (XmlPullParserException e2) {
                    e = e2;
                    sb = new StringBuilder();
                    str = "Failed to parse xml resource ";
                    sb.append(str);
                    sb.append(charSequence2);
                    Log.e("ResourcesCompat", sb.toString(), e);
                    gVar.a(-3, (Handler) null);
                    return null;
                } catch (IOException e3) {
                    e = e3;
                    sb = new StringBuilder();
                    str = "Failed to read xml resource ";
                    sb.append(str);
                    sb.append(charSequence2);
                    Log.e("ResourcesCompat", sb.toString(), e);
                    gVar.a(-3, (Handler) null);
                    return null;
                }
            }
            gVar.a(-3, (Handler) null);
            return null;
        }
        StringBuilder i4 = g.a.a.a.a.i("Resource \"");
        i4.append(resources.getResourceName(resourceId));
        i4.append("\" (");
        i4.append(Integer.toHexString(resourceId));
        i4.append(") is not a Font: ");
        i4.append(typedValue);
        throw new Resources.NotFoundException(i4.toString());
    }

    public int h(int i2, int i3) {
        return this.b.getInt(i2, i3);
    }

    public int i(int i2, int i3) {
        return this.b.getLayoutDimension(i2, i3);
    }

    public int j(int i2, int i3) {
        return this.b.getResourceId(i2, i3);
    }

    public String k(int i2) {
        return this.b.getString(i2);
    }

    public CharSequence l(int i2) {
        return this.b.getText(i2);
    }

    public boolean m(int i2) {
        return this.b.hasValue(i2);
    }
}
