package e.q.a.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import e.b.a;
import e.e.c.c.h;
import org.xmlpull.v1.XmlPullParser;

public class e implements Interpolator {
    public float[] a;
    public float[] b;

    public e(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray e2 = h.e(context.getResources(), context.getTheme(), attributeSet, a.f1549l);
        if (h.d(xmlPullParser, "pathData")) {
            String c = h.c(e2, xmlPullParser, "pathData", 4);
            Path i2 = a.i(c);
            if (i2 != null) {
                a(i2);
            } else {
                throw new InflateException(g.a.a.a.a.w("The path is null, which is created from ", c));
            }
        } else if (!h.d(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (h.d(xmlPullParser, "controlY1")) {
            float f2 = !h.d(xmlPullParser, "controlX1") ? 0.0f : e2.getFloat(0, 0.0f);
            float f3 = !h.d(xmlPullParser, "controlY1") ? 0.0f : e2.getFloat(1, 0.0f);
            boolean d2 = h.d(xmlPullParser, "controlX2");
            if (d2 != h.d(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!d2) {
                Path path = new Path();
                path.moveTo(0.0f, 0.0f);
                path.quadTo(f2, f3, 1.0f, 1.0f);
                a(path);
            } else {
                float f4 = !h.d(xmlPullParser, "controlX2") ? 0.0f : e2.getFloat(2, 0.0f);
                float f5 = !h.d(xmlPullParser, "controlY2") ? 0.0f : e2.getFloat(3, 0.0f);
                Path path2 = new Path();
                path2.moveTo(0.0f, 0.0f);
                path2.cubicTo(f2, f3, f4, f5, 1.0f, 1.0f);
                a(path2);
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        e2.recycle();
    }

    public final void a(Path path) {
        int i2 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.a = new float[min];
            this.b = new float[min];
            float[] fArr = new float[2];
            for (int i3 = 0; i3 < min; i3++) {
                pathMeasure.getPosTan((((float) i3) * length) / ((float) (min - 1)), fArr, (float[]) null);
                this.a[i3] = fArr[0];
                this.b[i3] = fArr[1];
            }
            if (((double) Math.abs(this.a[0])) <= 1.0E-5d && ((double) Math.abs(this.b[0])) <= 1.0E-5d) {
                int i4 = min - 1;
                if (((double) Math.abs(this.a[i4] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.b[i4] - 1.0f)) <= 1.0E-5d) {
                    float f2 = 0.0f;
                    int i5 = 0;
                    while (i2 < min) {
                        float[] fArr2 = this.a;
                        int i6 = i5 + 1;
                        float f3 = fArr2[i5];
                        if (f3 >= f2) {
                            fArr2[i2] = f3;
                            i2++;
                            f2 = f3;
                            i5 = i6;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f3);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder i7 = g.a.a.a.a.i("The Path must start at (0,0) and end at (1,1) start: ");
            i7.append(this.a[0]);
            i7.append(",");
            i7.append(this.b[0]);
            i7.append(" end:");
            int i8 = min - 1;
            i7.append(this.a[i8]);
            i7.append(",");
            i7.append(this.b[i8]);
            throw new IllegalArgumentException(i7.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int i2 = 0;
        int length = this.a.length - 1;
        while (length - i2 > 1) {
            int i3 = (i2 + length) / 2;
            if (f2 < this.a[i3]) {
                length = i3;
            } else {
                i2 = i3;
            }
        }
        float[] fArr = this.a;
        float f3 = fArr[length] - fArr[i2];
        if (f3 == 0.0f) {
            return this.b[i2];
        }
        float[] fArr2 = this.b;
        float f4 = fArr2[i2];
        return ((fArr2[length] - f4) * ((f2 - fArr[i2]) / f3)) + f4;
    }
}
