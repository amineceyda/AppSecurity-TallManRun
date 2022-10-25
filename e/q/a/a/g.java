package e.q.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class g extends f {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f1555k = PorterDuff.Mode.SRC_IN;
    public h c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuffColorFilter f1556d;

    /* renamed from: e  reason: collision with root package name */
    public ColorFilter f1557e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1558f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1559g;

    /* renamed from: h  reason: collision with root package name */
    public final float[] f1560h;

    /* renamed from: i  reason: collision with root package name */
    public final Matrix f1561i;

    /* renamed from: j  reason: collision with root package name */
    public final Rect f1562j;

    public static class b extends f {
        public b() {
        }

        public b(b bVar) {
            super(bVar);
        }

        public boolean c() {
            return true;
        }
    }

    public static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        public int[] f1563e;

        /* renamed from: f  reason: collision with root package name */
        public e.e.c.c.a f1564f;

        /* renamed from: g  reason: collision with root package name */
        public float f1565g = 0.0f;

        /* renamed from: h  reason: collision with root package name */
        public e.e.c.c.a f1566h;

        /* renamed from: i  reason: collision with root package name */
        public float f1567i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f1568j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f1569k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f1570l = 1.0f;

        /* renamed from: m  reason: collision with root package name */
        public float f1571m = 0.0f;
        public Paint.Cap n = Paint.Cap.BUTT;
        public Paint.Join o = Paint.Join.MITER;
        public float p = 4.0f;

        public c() {
        }

        public c(c cVar) {
            super(cVar);
            this.f1563e = cVar.f1563e;
            this.f1564f = cVar.f1564f;
            this.f1565g = cVar.f1565g;
            this.f1567i = cVar.f1567i;
            this.f1566h = cVar.f1566h;
            this.c = cVar.c;
            this.f1568j = cVar.f1568j;
            this.f1569k = cVar.f1569k;
            this.f1570l = cVar.f1570l;
            this.f1571m = cVar.f1571m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
        }

        public boolean a() {
            return this.f1566h.c() || this.f1564f.c();
        }

        public boolean b(int[] iArr) {
            return this.f1564f.d(iArr) | this.f1566h.d(iArr);
        }

        public float getFillAlpha() {
            return this.f1568j;
        }

        public int getFillColor() {
            return this.f1566h.c;
        }

        public float getStrokeAlpha() {
            return this.f1567i;
        }

        public int getStrokeColor() {
            return this.f1564f.c;
        }

        public float getStrokeWidth() {
            return this.f1565g;
        }

        public float getTrimPathEnd() {
            return this.f1570l;
        }

        public float getTrimPathOffset() {
            return this.f1571m;
        }

        public float getTrimPathStart() {
            return this.f1569k;
        }

        public void setFillAlpha(float f2) {
            this.f1568j = f2;
        }

        public void setFillColor(int i2) {
            this.f1566h.c = i2;
        }

        public void setStrokeAlpha(float f2) {
            this.f1567i = f2;
        }

        public void setStrokeColor(int i2) {
            this.f1564f.c = i2;
        }

        public void setStrokeWidth(float f2) {
            this.f1565g = f2;
        }

        public void setTrimPathEnd(float f2) {
            this.f1570l = f2;
        }

        public void setTrimPathOffset(float f2) {
            this.f1571m = f2;
        }

        public void setTrimPathStart(float f2) {
            this.f1569k = f2;
        }
    }

    public static class d extends e {
        public final Matrix a;
        public final ArrayList<e> b;
        public float c;

        /* renamed from: d  reason: collision with root package name */
        public float f1572d;

        /* renamed from: e  reason: collision with root package name */
        public float f1573e;

        /* renamed from: f  reason: collision with root package name */
        public float f1574f;

        /* renamed from: g  reason: collision with root package name */
        public float f1575g;

        /* renamed from: h  reason: collision with root package name */
        public float f1576h;

        /* renamed from: i  reason: collision with root package name */
        public float f1577i;

        /* renamed from: j  reason: collision with root package name */
        public final Matrix f1578j;

        /* renamed from: k  reason: collision with root package name */
        public int f1579k;

        /* renamed from: l  reason: collision with root package name */
        public int[] f1580l;

        /* renamed from: m  reason: collision with root package name */
        public String f1581m;

        public d() {
            super((a) null);
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.f1572d = 0.0f;
            this.f1573e = 0.0f;
            this.f1574f = 1.0f;
            this.f1575g = 1.0f;
            this.f1576h = 0.0f;
            this.f1577i = 0.0f;
            this.f1578j = new Matrix();
            this.f1581m = null;
        }

        public d(d dVar, e.d.a<String, Object> aVar) {
            super((a) null);
            f fVar;
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.f1572d = 0.0f;
            this.f1573e = 0.0f;
            this.f1574f = 1.0f;
            this.f1575g = 1.0f;
            this.f1576h = 0.0f;
            this.f1577i = 0.0f;
            Matrix matrix = new Matrix();
            this.f1578j = matrix;
            this.f1581m = null;
            this.c = dVar.c;
            this.f1572d = dVar.f1572d;
            this.f1573e = dVar.f1573e;
            this.f1574f = dVar.f1574f;
            this.f1575g = dVar.f1575g;
            this.f1576h = dVar.f1576h;
            this.f1577i = dVar.f1577i;
            this.f1580l = dVar.f1580l;
            String str = dVar.f1581m;
            this.f1581m = str;
            this.f1579k = dVar.f1579k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f1578j);
            ArrayList<e> arrayList = dVar.b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e eVar = arrayList.get(i2);
                if (eVar instanceof d) {
                    this.b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        fVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.b.add(fVar);
                    String str2 = fVar.b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        public boolean a() {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                if (this.b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        public boolean b(int[] iArr) {
            boolean z = false;
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                z |= this.b.get(i2).b(iArr);
            }
            return z;
        }

        public final void c() {
            this.f1578j.reset();
            this.f1578j.postTranslate(-this.f1572d, -this.f1573e);
            this.f1578j.postScale(this.f1574f, this.f1575g);
            this.f1578j.postRotate(this.c, 0.0f, 0.0f);
            this.f1578j.postTranslate(this.f1576h + this.f1572d, this.f1577i + this.f1573e);
        }

        public String getGroupName() {
            return this.f1581m;
        }

        public Matrix getLocalMatrix() {
            return this.f1578j;
        }

        public float getPivotX() {
            return this.f1572d;
        }

        public float getPivotY() {
            return this.f1573e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f1574f;
        }

        public float getScaleY() {
            return this.f1575g;
        }

        public float getTranslateX() {
            return this.f1576h;
        }

        public float getTranslateY() {
            return this.f1577i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f1572d) {
                this.f1572d = f2;
                c();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f1573e) {
                this.f1573e = f2;
                c();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.c) {
                this.c = f2;
                c();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f1574f) {
                this.f1574f = f2;
                c();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f1575g) {
                this.f1575g = f2;
                c();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f1576h) {
                this.f1576h = f2;
                c();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.f1577i) {
                this.f1577i = f2;
                c();
            }
        }
    }

    public static abstract class e {
        public e() {
        }

        public e(a aVar) {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    public static abstract class f extends e {
        public e.e.d.c[] a = null;
        public String b;
        public int c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1582d;

        public f() {
            super((a) null);
        }

        public f(f fVar) {
            super((a) null);
            this.b = fVar.b;
            this.f1582d = fVar.f1582d;
            this.a = e.b.a.j(fVar.a);
        }

        public boolean c() {
            return false;
        }

        public e.e.d.c[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(e.e.d.c[] cVarArr) {
            if (!e.b.a.a(this.a, cVarArr)) {
                this.a = e.b.a.j(cVarArr);
                return;
            }
            e.e.d.c[] cVarArr2 = this.a;
            for (int i2 = 0; i2 < cVarArr.length; i2++) {
                cVarArr2[i2].a = cVarArr[i2].a;
                for (int i3 = 0; i3 < cVarArr[i2].b.length; i3++) {
                    cVarArr2[i2].b[i3] = cVarArr[i2].b[i3];
                }
            }
        }
    }

    /* renamed from: e.q.a.a.g$g  reason: collision with other inner class name */
    public static class C0055g {
        public static final Matrix q = new Matrix();
        public final Path a;
        public final Path b;
        public final Matrix c;

        /* renamed from: d  reason: collision with root package name */
        public Paint f1583d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f1584e;

        /* renamed from: f  reason: collision with root package name */
        public PathMeasure f1585f;

        /* renamed from: g  reason: collision with root package name */
        public int f1586g;

        /* renamed from: h  reason: collision with root package name */
        public final d f1587h;

        /* renamed from: i  reason: collision with root package name */
        public float f1588i;

        /* renamed from: j  reason: collision with root package name */
        public float f1589j;

        /* renamed from: k  reason: collision with root package name */
        public float f1590k;

        /* renamed from: l  reason: collision with root package name */
        public float f1591l;

        /* renamed from: m  reason: collision with root package name */
        public int f1592m;
        public String n;
        public Boolean o;
        public final e.d.a<String, Object> p;

        public C0055g() {
            this.c = new Matrix();
            this.f1588i = 0.0f;
            this.f1589j = 0.0f;
            this.f1590k = 0.0f;
            this.f1591l = 0.0f;
            this.f1592m = 255;
            this.n = null;
            this.o = null;
            this.p = new e.d.a<>();
            this.f1587h = new d();
            this.a = new Path();
            this.b = new Path();
        }

        public C0055g(C0055g gVar) {
            this.c = new Matrix();
            this.f1588i = 0.0f;
            this.f1589j = 0.0f;
            this.f1590k = 0.0f;
            this.f1591l = 0.0f;
            this.f1592m = 255;
            this.n = null;
            this.o = null;
            e.d.a<String, Object> aVar = new e.d.a<>();
            this.p = aVar;
            this.f1587h = new d(gVar.f1587h, aVar);
            this.a = new Path(gVar.a);
            this.b = new Path(gVar.b);
            this.f1588i = gVar.f1588i;
            this.f1589j = gVar.f1589j;
            this.f1590k = gVar.f1590k;
            this.f1591l = gVar.f1591l;
            this.f1586g = gVar.f1586g;
            this.f1592m = gVar.f1592m;
            this.n = gVar.n;
            String str = gVar.n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.o = gVar.o;
        }

        /* JADX WARNING: type inference failed for: r11v0 */
        /* JADX WARNING: type inference failed for: r11v1, types: [boolean] */
        /* JADX WARNING: type inference failed for: r11v2 */
        public final void a(d dVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            C0055g gVar;
            C0055g gVar2 = this;
            d dVar2 = dVar;
            Canvas canvas2 = canvas;
            ColorFilter colorFilter2 = colorFilter;
            dVar2.a.set(matrix);
            dVar2.a.preConcat(dVar2.f1578j);
            canvas.save();
            ? r11 = 0;
            int i4 = 0;
            while (i4 < dVar2.b.size()) {
                e eVar = dVar2.b.get(i4);
                if (eVar instanceof d) {
                    a((d) eVar, dVar2.a, canvas, i2, i3, colorFilter);
                } else if (eVar instanceof f) {
                    f fVar = (f) eVar;
                    float f2 = ((float) i2) / gVar2.f1590k;
                    float f3 = ((float) i3) / gVar2.f1591l;
                    float min = Math.min(f2, f3);
                    Matrix matrix2 = dVar2.a;
                    gVar2.c.set(matrix2);
                    gVar2.c.postScale(f2, f3);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float f4 = min;
                    float f5 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max((float) Math.hypot((double) fArr[r11], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
                    float abs = max > 0.0f ? Math.abs(f5) / max : 0.0f;
                    if (abs == 0.0f) {
                        gVar = this;
                    } else {
                        gVar = this;
                        Path path = gVar.a;
                        Objects.requireNonNull(fVar);
                        path.reset();
                        e.e.d.c[] cVarArr = fVar.a;
                        if (cVarArr != null) {
                            e.e.d.c.b(cVarArr, path);
                        }
                        Path path2 = gVar.a;
                        gVar.b.reset();
                        if (fVar.c()) {
                            gVar.b.setFillType(fVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            gVar.b.addPath(path2, gVar.c);
                            canvas2.clipPath(gVar.b);
                        } else {
                            c cVar = (c) fVar;
                            float f6 = cVar.f1569k;
                            if (!(f6 == 0.0f && cVar.f1570l == 1.0f)) {
                                float f7 = cVar.f1571m;
                                float f8 = (f6 + f7) % 1.0f;
                                float f9 = (cVar.f1570l + f7) % 1.0f;
                                if (gVar.f1585f == null) {
                                    gVar.f1585f = new PathMeasure();
                                }
                                gVar.f1585f.setPath(gVar.a, r11);
                                float length = gVar.f1585f.getLength();
                                float f10 = f8 * length;
                                float f11 = f9 * length;
                                path2.reset();
                                if (f10 > f11) {
                                    gVar.f1585f.getSegment(f10, length, path2, true);
                                    gVar.f1585f.getSegment(0.0f, f11, path2, true);
                                } else {
                                    gVar.f1585f.getSegment(f10, f11, path2, true);
                                }
                                path2.rLineTo(0.0f, 0.0f);
                            }
                            gVar.b.addPath(path2, gVar.c);
                            e.e.c.c.a aVar = cVar.f1566h;
                            if (aVar.b() || aVar.c != 0) {
                                e.e.c.c.a aVar2 = cVar.f1566h;
                                if (gVar.f1584e == null) {
                                    Paint paint = new Paint(1);
                                    gVar.f1584e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = gVar.f1584e;
                                if (aVar2.b()) {
                                    Shader shader = aVar2.a;
                                    shader.setLocalMatrix(gVar.c);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(cVar.f1568j * 255.0f));
                                } else {
                                    paint2.setShader((Shader) null);
                                    paint2.setAlpha(255);
                                    int i5 = aVar2.c;
                                    float f12 = cVar.f1568j;
                                    PorterDuff.Mode mode = g.f1555k;
                                    paint2.setColor((i5 & 16777215) | (((int) (((float) Color.alpha(i5)) * f12)) << 24));
                                }
                                paint2.setColorFilter(colorFilter2);
                                gVar.b.setFillType(cVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas2.drawPath(gVar.b, paint2);
                            }
                            e.e.c.c.a aVar3 = cVar.f1564f;
                            if (aVar3.b() || aVar3.c != 0) {
                                e.e.c.c.a aVar4 = cVar.f1564f;
                                if (gVar.f1583d == null) {
                                    Paint paint3 = new Paint(1);
                                    gVar.f1583d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = gVar.f1583d;
                                Paint.Join join = cVar.o;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = cVar.n;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(cVar.p);
                                if (aVar4.b()) {
                                    Shader shader2 = aVar4.a;
                                    shader2.setLocalMatrix(gVar.c);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(cVar.f1567i * 255.0f));
                                } else {
                                    paint4.setShader((Shader) null);
                                    paint4.setAlpha(255);
                                    int i6 = aVar4.c;
                                    float f13 = cVar.f1567i;
                                    PorterDuff.Mode mode2 = g.f1555k;
                                    paint4.setColor((i6 & 16777215) | (((int) (((float) Color.alpha(i6)) * f13)) << 24));
                                }
                                paint4.setColorFilter(colorFilter2);
                                paint4.setStrokeWidth(cVar.f1565g * abs * f4);
                                canvas2.drawPath(gVar.b, paint4);
                            }
                        }
                    }
                    i4++;
                    gVar2 = gVar;
                    r11 = 0;
                }
                int i7 = i2;
                int i8 = i3;
                gVar = gVar2;
                i4++;
                gVar2 = gVar;
                r11 = 0;
            }
            C0055g gVar3 = gVar2;
            canvas.restore();
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f1592m;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.f1592m = i2;
        }
    }

    public static class h extends Drawable.ConstantState {
        public int a;
        public C0055g b;
        public ColorStateList c;

        /* renamed from: d  reason: collision with root package name */
        public PorterDuff.Mode f1593d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1594e;

        /* renamed from: f  reason: collision with root package name */
        public Bitmap f1595f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f1596g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f1597h;

        /* renamed from: i  reason: collision with root package name */
        public int f1598i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f1599j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f1600k;

        /* renamed from: l  reason: collision with root package name */
        public Paint f1601l;

        public h() {
            this.c = null;
            this.f1593d = g.f1555k;
            this.b = new C0055g();
        }

        public h(h hVar) {
            this.c = null;
            this.f1593d = g.f1555k;
            if (hVar != null) {
                this.a = hVar.a;
                C0055g gVar = new C0055g(hVar.b);
                this.b = gVar;
                if (hVar.b.f1584e != null) {
                    gVar.f1584e = new Paint(hVar.b.f1584e);
                }
                if (hVar.b.f1583d != null) {
                    this.b.f1583d = new Paint(hVar.b.f1583d);
                }
                this.c = hVar.c;
                this.f1593d = hVar.f1593d;
                this.f1594e = hVar.f1594e;
            }
        }

        public boolean a() {
            C0055g gVar = this.b;
            if (gVar.o == null) {
                gVar.o = Boolean.valueOf(gVar.f1587h.a());
            }
            return gVar.o.booleanValue();
        }

        public void b(int i2, int i3) {
            this.f1595f.eraseColor(0);
            Canvas canvas = new Canvas(this.f1595f);
            C0055g gVar = this.b;
            gVar.a(gVar.f1587h, C0055g.q, canvas, i2, i3, (ColorFilter) null);
        }

        public int getChangingConfigurations() {
            return this.a;
        }

        public Drawable newDrawable() {
            return new g(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new g(this);
        }
    }

    public static class i extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public i(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            g gVar = new g();
            gVar.b = (VectorDrawable) this.a.newDrawable();
            return gVar;
        }

        public Drawable newDrawable(Resources resources) {
            g gVar = new g();
            gVar.b = (VectorDrawable) this.a.newDrawable(resources);
            return gVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g gVar = new g();
            gVar.b = (VectorDrawable) this.a.newDrawable(resources, theme);
            return gVar;
        }
    }

    public g() {
        this.f1559g = true;
        this.f1560h = new float[9];
        this.f1561i = new Matrix();
        this.f1562j = new Rect();
        this.c = new h();
    }

    public g(h hVar) {
        this.f1559g = true;
        this.f1560h = new float[9];
        this.f1561i = new Matrix();
        this.f1562j = new Rect();
        this.c = hVar;
        this.f1556d = b(hVar.c, hVar.f1593d);
    }

    public static g a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        g gVar = new g();
        gVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return gVar;
    }

    public PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.b;
        if (drawable == null) {
            return false;
        }
        e.e.d.l.a.h(drawable);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d3, code lost:
        if ((r1 == r7.getWidth() && r3 == r6.f1595f.getHeight()) == false) goto L_0x00d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            android.graphics.drawable.Drawable r0 = r10.b
            if (r0 == 0) goto L_0x0008
            r0.draw(r11)
            return
        L_0x0008:
            android.graphics.Rect r0 = r10.f1562j
            r10.copyBounds(r0)
            android.graphics.Rect r0 = r10.f1562j
            int r0 = r0.width()
            if (r0 <= 0) goto L_0x016b
            android.graphics.Rect r0 = r10.f1562j
            int r0 = r0.height()
            if (r0 > 0) goto L_0x001f
            goto L_0x016b
        L_0x001f:
            android.graphics.ColorFilter r0 = r10.f1557e
            if (r0 != 0) goto L_0x0025
            android.graphics.PorterDuffColorFilter r0 = r10.f1556d
        L_0x0025:
            android.graphics.Matrix r1 = r10.f1561i
            r11.getMatrix(r1)
            android.graphics.Matrix r1 = r10.f1561i
            float[] r2 = r10.f1560h
            r1.getValues(r2)
            float[] r1 = r10.f1560h
            r2 = 0
            r1 = r1[r2]
            float r1 = java.lang.Math.abs(r1)
            float[] r3 = r10.f1560h
            r4 = 4
            r3 = r3[r4]
            float r3 = java.lang.Math.abs(r3)
            float[] r4 = r10.f1560h
            r5 = 1
            r4 = r4[r5]
            float r4 = java.lang.Math.abs(r4)
            float[] r6 = r10.f1560h
            r7 = 3
            r6 = r6[r7]
            float r6 = java.lang.Math.abs(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0060
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0064
        L_0x0060:
            r1 = 1065353216(0x3f800000, float:1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0064:
            android.graphics.Rect r4 = r10.f1562j
            int r4 = r4.width()
            float r4 = (float) r4
            float r4 = r4 * r1
            int r1 = (int) r4
            android.graphics.Rect r4 = r10.f1562j
            int r4 = r4.height()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = (int) r4
            r4 = 2048(0x800, float:2.87E-42)
            int r1 = java.lang.Math.min(r4, r1)
            int r3 = java.lang.Math.min(r4, r3)
            if (r1 <= 0) goto L_0x016b
            if (r3 > 0) goto L_0x0088
            goto L_0x016b
        L_0x0088:
            int r4 = r11.save()
            android.graphics.Rect r6 = r10.f1562j
            int r9 = r6.left
            float r9 = (float) r9
            int r6 = r6.top
            float r6 = (float) r6
            r11.translate(r9, r6)
            boolean r6 = r10.isAutoMirrored()
            if (r6 == 0) goto L_0x00a5
            int r6 = e.e.d.l.a.E(r10)
            if (r6 != r5) goto L_0x00a5
            r6 = 1
            goto L_0x00a6
        L_0x00a5:
            r6 = 0
        L_0x00a6:
            if (r6 == 0) goto L_0x00b7
            android.graphics.Rect r6 = r10.f1562j
            int r6 = r6.width()
            float r6 = (float) r6
            r11.translate(r6, r8)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11.scale(r6, r7)
        L_0x00b7:
            android.graphics.Rect r6 = r10.f1562j
            r6.offsetTo(r2, r2)
            e.q.a.a.g$h r6 = r10.c
            android.graphics.Bitmap r7 = r6.f1595f
            if (r7 == 0) goto L_0x00d5
            int r7 = r7.getWidth()
            if (r1 != r7) goto L_0x00d2
            android.graphics.Bitmap r7 = r6.f1595f
            int r7 = r7.getHeight()
            if (r3 != r7) goto L_0x00d2
            r7 = 1
            goto L_0x00d3
        L_0x00d2:
            r7 = 0
        L_0x00d3:
            if (r7 != 0) goto L_0x00df
        L_0x00d5:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r1, r3, r7)
            r6.f1595f = r7
            r6.f1600k = r5
        L_0x00df:
            boolean r6 = r10.f1559g
            if (r6 != 0) goto L_0x00e9
            e.q.a.a.g$h r6 = r10.c
            r6.b(r1, r3)
            goto L_0x012d
        L_0x00e9:
            e.q.a.a.g$h r6 = r10.c
            boolean r7 = r6.f1600k
            if (r7 != 0) goto L_0x010d
            android.content.res.ColorStateList r7 = r6.f1596g
            android.content.res.ColorStateList r8 = r6.c
            if (r7 != r8) goto L_0x010d
            android.graphics.PorterDuff$Mode r7 = r6.f1597h
            android.graphics.PorterDuff$Mode r8 = r6.f1593d
            if (r7 != r8) goto L_0x010d
            boolean r7 = r6.f1599j
            boolean r8 = r6.f1594e
            if (r7 != r8) goto L_0x010d
            int r7 = r6.f1598i
            e.q.a.a.g$g r6 = r6.b
            int r6 = r6.getRootAlpha()
            if (r7 != r6) goto L_0x010d
            r6 = 1
            goto L_0x010e
        L_0x010d:
            r6 = 0
        L_0x010e:
            if (r6 != 0) goto L_0x012d
            e.q.a.a.g$h r6 = r10.c
            r6.b(r1, r3)
            e.q.a.a.g$h r1 = r10.c
            android.content.res.ColorStateList r3 = r1.c
            r1.f1596g = r3
            android.graphics.PorterDuff$Mode r3 = r1.f1593d
            r1.f1597h = r3
            e.q.a.a.g$g r3 = r1.b
            int r3 = r3.getRootAlpha()
            r1.f1598i = r3
            boolean r3 = r1.f1594e
            r1.f1599j = r3
            r1.f1600k = r2
        L_0x012d:
            e.q.a.a.g$h r1 = r10.c
            android.graphics.Rect r3 = r10.f1562j
            e.q.a.a.g$g r6 = r1.b
            int r6 = r6.getRootAlpha()
            r7 = 255(0xff, float:3.57E-43)
            if (r6 >= r7) goto L_0x013c
            r2 = 1
        L_0x013c:
            r6 = 0
            if (r2 != 0) goto L_0x0143
            if (r0 != 0) goto L_0x0143
            r0 = r6
            goto L_0x0163
        L_0x0143:
            android.graphics.Paint r2 = r1.f1601l
            if (r2 != 0) goto L_0x0151
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.f1601l = r2
            r2.setFilterBitmap(r5)
        L_0x0151:
            android.graphics.Paint r2 = r1.f1601l
            e.q.a.a.g$g r5 = r1.b
            int r5 = r5.getRootAlpha()
            r2.setAlpha(r5)
            android.graphics.Paint r2 = r1.f1601l
            r2.setColorFilter(r0)
            android.graphics.Paint r0 = r1.f1601l
        L_0x0163:
            android.graphics.Bitmap r1 = r1.f1595f
            r11.drawBitmap(r1, r6, r3, r0)
            r11.restoreToCount(r4)
        L_0x016b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.q.a.a.g.draw(android.graphics.Canvas):void");
    }

    public int getAlpha() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.c.b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.c.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.b;
        if (drawable == null) {
            return this.f1557e;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.b != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.b.getConstantState());
        }
        this.c.a = getChangingConfigurations();
        return this.c;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.c.b.f1589j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.c.b.f1588i;
    }

    public int getOpacity() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:202:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void inflate(android.content.res.Resources r28, org.xmlpull.v1.XmlPullParser r29, android.util.AttributeSet r30, android.content.res.Resources.Theme r31) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            android.graphics.drawable.Drawable r0 = r1.b
            if (r0 == 0) goto L_0x001c
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r3 < r4) goto L_0x0018
            r0.inflate(r2, r9, r10, r11)
            goto L_0x001b
        L_0x0018:
            r0.inflate(r2, r9, r10)
        L_0x001b:
            return
        L_0x001c:
            e.q.a.a.g$h r12 = r1.c
            e.q.a.a.g$g r0 = new e.q.a.a.g$g
            r0.<init>()
            r12.b = r0
            int[] r0 = e.q.a.a.a.a
            android.content.res.TypedArray r3 = e.e.c.c.h.e(r2, r11, r10, r0)
            e.q.a.a.g$h r4 = r1.c
            e.q.a.a.g$g r5 = r4.b
            java.lang.String r0 = "tintMode"
            boolean r0 = e.e.c.c.h.d(r9, r0)
            r13 = 6
            r14 = -1
            if (r0 != 0) goto L_0x003b
            r0 = -1
            goto L_0x003f
        L_0x003b:
            int r0 = r3.getInt(r13, r14)
        L_0x003f:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_IN
            r15 = 9
            r8 = 5
            r7 = 3
            if (r0 == r7) goto L_0x005b
            if (r0 == r8) goto L_0x005d
            if (r0 == r15) goto L_0x0058
            switch(r0) {
                case 14: goto L_0x0055;
                case 15: goto L_0x0052;
                case 16: goto L_0x004f;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x005d
        L_0x004f:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.ADD
            goto L_0x005d
        L_0x0052:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SCREEN
            goto L_0x005d
        L_0x0055:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x005d
        L_0x0058:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_ATOP
            goto L_0x005d
        L_0x005b:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_OVER
        L_0x005d:
            r4.f1593d = r6
            java.lang.String r0 = "tint"
            boolean r0 = e.e.c.c.h.d(r9, r0)
            r13 = 0
            r15 = 1
            r14 = 2
            if (r0 == 0) goto L_0x00be
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r3.getValue(r15, r0)
            int r6 = r0.type
            if (r6 == r14) goto L_0x009f
            r14 = 28
            if (r6 < r14) goto L_0x0085
            r14 = 31
            if (r6 > r14) goto L_0x0085
            int r0 = r0.data
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            goto L_0x00bf
        L_0x0085:
            android.content.res.Resources r0 = r3.getResources()
            int r6 = r3.getResourceId(r15, r13)
            android.content.res.XmlResourceParser r6 = r0.getXml(r6)     // Catch:{ Exception -> 0x0096 }
            android.content.res.ColorStateList r0 = e.b.a.f(r0, r6, r11)     // Catch:{ Exception -> 0x0096 }
            goto L_0x00bf
        L_0x0096:
            r0 = move-exception
            java.lang.String r6 = "CSLCompat"
            java.lang.String r14 = "Failed to inflate ColorStateList."
            android.util.Log.e(r6, r14, r0)
            goto L_0x00be
        L_0x009f:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to resolve attribute at index "
            r3.append(r4)
            r3.append(r15)
            java.lang.String r4 = ": "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x00be:
            r0 = 0
        L_0x00bf:
            if (r0 == 0) goto L_0x00c3
            r4.c = r0
        L_0x00c3:
            boolean r0 = r4.f1594e
            java.lang.String r6 = "autoMirrored"
            boolean r6 = e.e.c.c.h.d(r9, r6)
            if (r6 != 0) goto L_0x00ce
            goto L_0x00d2
        L_0x00ce:
            boolean r0 = r3.getBoolean(r8, r0)
        L_0x00d2:
            r4.f1594e = r0
            float r0 = r5.f1590k
            java.lang.String r4 = "viewportWidth"
            boolean r4 = e.e.c.c.h.d(r9, r4)
            r14 = 7
            if (r4 != 0) goto L_0x00e0
            goto L_0x00e4
        L_0x00e0:
            float r0 = r3.getFloat(r14, r0)
        L_0x00e4:
            r5.f1590k = r0
            float r0 = r5.f1591l
            java.lang.String r4 = "viewportHeight"
            boolean r4 = e.e.c.c.h.d(r9, r4)
            r6 = 8
            if (r4 != 0) goto L_0x00f3
            goto L_0x00f7
        L_0x00f3:
            float r0 = r3.getFloat(r6, r0)
        L_0x00f7:
            r5.f1591l = r0
            float r4 = r5.f1590k
            r19 = 0
            int r4 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r4 <= 0) goto L_0x04e2
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x04c6
            float r0 = r5.f1588i
            float r0 = r3.getDimension(r7, r0)
            r5.f1588i = r0
            float r0 = r5.f1589j
            r4 = 2
            float r0 = r3.getDimension(r4, r0)
            r5.f1589j = r0
            float r4 = r5.f1588i
            int r4 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r4 <= 0) goto L_0x04aa
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x048e
            float r0 = r5.getAlpha()
            java.lang.String r4 = "alpha"
            boolean r4 = e.e.c.c.h.d(r9, r4)
            r14 = 4
            if (r4 != 0) goto L_0x012e
            goto L_0x0132
        L_0x012e:
            float r0 = r3.getFloat(r14, r0)
        L_0x0132:
            r5.setAlpha(r0)
            java.lang.String r0 = r3.getString(r13)
            if (r0 == 0) goto L_0x0142
            r5.n = r0
            e.d.a<java.lang.String, java.lang.Object> r4 = r5.p
            r4.put(r0, r5)
        L_0x0142:
            r3.recycle()
            int r0 = r27.getChangingConfigurations()
            r12.a = r0
            r12.f1600k = r15
            e.q.a.a.g$h r0 = r1.c
            e.q.a.a.g$g r5 = r0.b
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            e.q.a.a.g$d r3 = r5.f1587h
            r4.push(r3)
            int r3 = r29.getEventType()
            int r20 = r29.getDepth()
            int r14 = r20 + 1
            r20 = 1
        L_0x0167:
            if (r3 == r15) goto L_0x0475
            int r6 = r29.getDepth()
            if (r6 >= r14) goto L_0x0171
            if (r3 == r7) goto L_0x0475
        L_0x0171:
            java.lang.String r6 = "group"
            r7 = 2
            if (r3 != r7) goto L_0x0446
            java.lang.String r3 = r29.getName()
            java.lang.Object r7 = r4.peek()
            e.q.a.a.g$d r7 = (e.q.a.a.g.d) r7
            java.lang.String r8 = "path"
            boolean r8 = r8.equals(r3)
            java.lang.String r15 = "fillType"
            java.lang.String r13 = "pathData"
            if (r8 == 0) goto L_0x031c
            e.q.a.a.g$c r8 = new e.q.a.a.g$c
            r8.<init>()
            int[] r3 = e.q.a.a.a.c
            android.content.res.TypedArray r6 = e.e.c.c.h.e(r2, r11, r10, r3)
            r3 = 0
            r8.f1563e = r3
            boolean r13 = e.e.c.c.h.d(r9, r13)
            if (r13 != 0) goto L_0x01b1
            r24 = r4
            r25 = r5
            r1 = r6
            r13 = r8
            r18 = r14
            r17 = -1
            r21 = 8
            r22 = 9
            r14 = r7
            goto L_0x02ee
        L_0x01b1:
            r13 = 0
            java.lang.String r3 = r6.getString(r13)
            if (r3 == 0) goto L_0x01ba
            r8.b = r3
        L_0x01ba:
            r3 = 2
            java.lang.String r13 = r6.getString(r3)
            if (r13 == 0) goto L_0x01c7
            e.e.d.c[] r3 = e.b.a.h(r13)
            r8.a = r3
        L_0x01c7:
            r13 = 1
            r20 = 0
            java.lang.String r23 = "fillColor"
            r18 = 0
            r3 = r6
            r24 = r4
            r4 = r29
            r25 = r5
            r5 = r31
            r26 = r6
            r6 = r23
            r18 = r14
            r1 = 3
            r14 = r7
            r7 = r13
            r13 = r8
            r1 = 5
            r8 = r20
            e.e.c.c.a r3 = e.e.c.c.h.b(r3, r4, r5, r6, r7, r8)
            r13.f1566h = r3
            r3 = 12
            float r4 = r13.f1568j
            java.lang.String r5 = "fillAlpha"
            boolean r5 = e.e.c.c.h.d(r9, r5)
            r8 = r26
            if (r5 != 0) goto L_0x01f9
            goto L_0x01fd
        L_0x01f9:
            float r4 = r8.getFloat(r3, r4)
        L_0x01fd:
            r13.f1568j = r4
            java.lang.String r3 = "strokeLineCap"
            boolean r3 = e.e.c.c.h.d(r9, r3)
            if (r3 != 0) goto L_0x020b
            r3 = -1
            r7 = 8
            goto L_0x0213
        L_0x020b:
            r3 = -1
            r7 = 8
            int r4 = r8.getInt(r7, r3)
            r3 = r4
        L_0x0213:
            android.graphics.Paint$Cap r4 = r13.n
            if (r3 == 0) goto L_0x0224
            r5 = 1
            if (r3 == r5) goto L_0x0221
            r5 = 2
            if (r3 == r5) goto L_0x021e
            goto L_0x0226
        L_0x021e:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.SQUARE
            goto L_0x0226
        L_0x0221:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.ROUND
            goto L_0x0226
        L_0x0224:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.BUTT
        L_0x0226:
            r13.n = r4
            java.lang.String r3 = "strokeLineJoin"
            boolean r3 = e.e.c.c.h.d(r9, r3)
            if (r3 != 0) goto L_0x0235
            r3 = -1
            r5 = -1
            r6 = 9
            goto L_0x023c
        L_0x0235:
            r5 = -1
            r6 = 9
            int r3 = r8.getInt(r6, r5)
        L_0x023c:
            android.graphics.Paint$Join r4 = r13.o
            if (r3 == 0) goto L_0x024d
            r5 = 1
            if (r3 == r5) goto L_0x024a
            r5 = 2
            if (r3 == r5) goto L_0x0247
            goto L_0x024f
        L_0x0247:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.BEVEL
            goto L_0x024f
        L_0x024a:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.ROUND
            goto L_0x024f
        L_0x024d:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.MITER
        L_0x024f:
            r13.o = r4
            r3 = 10
            float r4 = r13.p
            java.lang.String r5 = "strokeMiterLimit"
            boolean r5 = e.e.c.c.h.d(r9, r5)
            if (r5 != 0) goto L_0x025e
            goto L_0x0262
        L_0x025e:
            float r4 = r8.getFloat(r3, r4)
        L_0x0262:
            r13.p = r4
            r16 = 3
            r20 = 0
            java.lang.String r21 = "strokeColor"
            r3 = r8
            r4 = r29
            r17 = -1
            r5 = r31
            r22 = 9
            r6 = r21
            r21 = 8
            r7 = r16
            r1 = r8
            r8 = r20
            e.e.c.c.a r3 = e.e.c.c.h.b(r3, r4, r5, r6, r7, r8)
            r13.f1564f = r3
            r3 = 11
            float r4 = r13.f1567i
            java.lang.String r5 = "strokeAlpha"
            boolean r5 = e.e.c.c.h.d(r9, r5)
            if (r5 != 0) goto L_0x028f
            goto L_0x0293
        L_0x028f:
            float r4 = r1.getFloat(r3, r4)
        L_0x0293:
            r13.f1567i = r4
            float r3 = r13.f1565g
            java.lang.String r4 = "strokeWidth"
            boolean r4 = e.e.c.c.h.d(r9, r4)
            if (r4 != 0) goto L_0x02a0
            goto L_0x02a5
        L_0x02a0:
            r4 = 4
            float r3 = r1.getFloat(r4, r3)
        L_0x02a5:
            r13.f1565g = r3
            float r3 = r13.f1570l
            java.lang.String r4 = "trimPathEnd"
            boolean r4 = e.e.c.c.h.d(r9, r4)
            if (r4 != 0) goto L_0x02b2
            goto L_0x02b7
        L_0x02b2:
            r4 = 6
            float r3 = r1.getFloat(r4, r3)
        L_0x02b7:
            r13.f1570l = r3
            float r3 = r13.f1571m
            java.lang.String r4 = "trimPathOffset"
            boolean r4 = e.e.c.c.h.d(r9, r4)
            if (r4 != 0) goto L_0x02c4
            goto L_0x02c9
        L_0x02c4:
            r4 = 7
            float r3 = r1.getFloat(r4, r3)
        L_0x02c9:
            r13.f1571m = r3
            float r3 = r13.f1569k
            java.lang.String r4 = "trimPathStart"
            boolean r4 = e.e.c.c.h.d(r9, r4)
            if (r4 != 0) goto L_0x02d6
            goto L_0x02db
        L_0x02d6:
            r4 = 5
            float r3 = r1.getFloat(r4, r3)
        L_0x02db:
            r13.f1569k = r3
            r3 = 13
            int r4 = r13.c
            boolean r5 = e.e.c.c.h.d(r9, r15)
            if (r5 != 0) goto L_0x02e8
            goto L_0x02ec
        L_0x02e8:
            int r4 = r1.getInt(r3, r4)
        L_0x02ec:
            r13.c = r4
        L_0x02ee:
            r1.recycle()
            java.util.ArrayList<e.q.a.a.g$e> r1 = r14.b
            r1.add(r13)
            java.lang.String r1 = r13.getPathName()
            if (r1 == 0) goto L_0x0308
            r1 = r25
            e.d.a<java.lang.String, java.lang.Object> r3 = r1.p
            java.lang.String r4 = r13.getPathName()
            r3.put(r4, r13)
            goto L_0x030a
        L_0x0308:
            r1 = r25
        L_0x030a:
            int r3 = r0.a
            int r4 = r13.f1582d
            r3 = r3 | r4
            r0.a = r3
            r4 = r24
            r6 = 0
            r7 = 5
            r8 = 1
            r13 = 2
            r15 = 4
            r20 = 0
            goto L_0x0443
        L_0x031c:
            r24 = r4
            r1 = r5
            r18 = r14
            r17 = -1
            r21 = 8
            r22 = 9
            r14 = r7
            java.lang.String r4 = "clip-path"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x0388
            e.q.a.a.g$b r3 = new e.q.a.a.g$b
            r3.<init>()
            boolean r4 = e.e.c.c.h.d(r9, r13)
            if (r4 != 0) goto L_0x033c
            goto L_0x036b
        L_0x033c:
            int[] r4 = e.q.a.a.a.f1541d
            android.content.res.TypedArray r4 = e.e.c.c.h.e(r2, r11, r10, r4)
            r5 = 0
            java.lang.String r6 = r4.getString(r5)
            if (r6 == 0) goto L_0x034b
            r3.b = r6
        L_0x034b:
            r5 = 1
            java.lang.String r6 = r4.getString(r5)
            if (r6 == 0) goto L_0x0358
            e.e.d.c[] r5 = e.b.a.h(r6)
            r3.a = r5
        L_0x0358:
            boolean r5 = e.e.c.c.h.d(r9, r15)
            if (r5 != 0) goto L_0x0360
            r13 = 0
            goto L_0x0366
        L_0x0360:
            r5 = 0
            r6 = 2
            int r13 = r4.getInt(r6, r5)
        L_0x0366:
            r3.c = r13
            r4.recycle()
        L_0x036b:
            java.util.ArrayList<e.q.a.a.g$e> r4 = r14.b
            r4.add(r3)
            java.lang.String r4 = r3.getPathName()
            if (r4 == 0) goto L_0x037f
            e.d.a<java.lang.String, java.lang.Object> r4 = r1.p
            java.lang.String r5 = r3.getPathName()
            r4.put(r5, r3)
        L_0x037f:
            int r4 = r0.a
            int r3 = r3.f1582d
            r3 = r3 | r4
            r0.a = r3
            goto L_0x043c
        L_0x0388:
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x043c
            e.q.a.a.g$d r3 = new e.q.a.a.g$d
            r3.<init>()
            int[] r4 = e.q.a.a.a.b
            android.content.res.TypedArray r4 = e.e.c.c.h.e(r2, r11, r10, r4)
            r5 = 0
            r3.f1580l = r5
            float r6 = r3.c
            java.lang.String r7 = "rotation"
            boolean r7 = e.e.c.c.h.d(r9, r7)
            if (r7 != 0) goto L_0x03a8
            r7 = 5
            goto L_0x03ad
        L_0x03a8:
            r7 = 5
            float r6 = r4.getFloat(r7, r6)
        L_0x03ad:
            r3.c = r6
            float r6 = r3.f1572d
            r8 = 1
            float r6 = r4.getFloat(r8, r6)
            r3.f1572d = r6
            float r6 = r3.f1573e
            r13 = 2
            float r6 = r4.getFloat(r13, r6)
            r3.f1573e = r6
            float r6 = r3.f1574f
            java.lang.String r15 = "scaleX"
            boolean r15 = e.e.c.c.h.d(r9, r15)
            if (r15 != 0) goto L_0x03cc
            goto L_0x03d1
        L_0x03cc:
            r15 = 3
            float r6 = r4.getFloat(r15, r6)
        L_0x03d1:
            r3.f1574f = r6
            float r6 = r3.f1575g
            java.lang.String r15 = "scaleY"
            boolean r15 = e.e.c.c.h.d(r9, r15)
            if (r15 != 0) goto L_0x03df
            r15 = 4
            goto L_0x03e4
        L_0x03df:
            r15 = 4
            float r6 = r4.getFloat(r15, r6)
        L_0x03e4:
            r3.f1575g = r6
            float r6 = r3.f1576h
            java.lang.String r5 = "translateX"
            boolean r5 = e.e.c.c.h.d(r9, r5)
            if (r5 != 0) goto L_0x03f2
            r5 = 6
            goto L_0x03f7
        L_0x03f2:
            r5 = 6
            float r6 = r4.getFloat(r5, r6)
        L_0x03f7:
            r3.f1576h = r6
            float r6 = r3.f1577i
            java.lang.String r5 = "translateY"
            boolean r5 = e.e.c.c.h.d(r9, r5)
            if (r5 != 0) goto L_0x0405
            r5 = 7
            goto L_0x040a
        L_0x0405:
            r5 = 7
            float r6 = r4.getFloat(r5, r6)
        L_0x040a:
            r3.f1577i = r6
            r6 = 0
            java.lang.String r5 = r4.getString(r6)
            if (r5 == 0) goto L_0x0415
            r3.f1581m = r5
        L_0x0415:
            r3.c()
            r4.recycle()
            java.util.ArrayList<e.q.a.a.g$e> r4 = r14.b
            r4.add(r3)
            r4 = r24
            r4.push(r3)
            java.lang.String r5 = r3.getGroupName()
            if (r5 == 0) goto L_0x0434
            e.d.a<java.lang.String, java.lang.Object> r5 = r1.p
            java.lang.String r14 = r3.getGroupName()
            r5.put(r14, r3)
        L_0x0434:
            int r5 = r0.a
            int r3 = r3.f1579k
            r3 = r3 | r5
            r0.a = r3
            goto L_0x0443
        L_0x043c:
            r4 = r24
            r6 = 0
            r7 = 5
            r8 = 1
            r13 = 2
            r15 = 4
        L_0x0443:
            r5 = 3
            r14 = 0
            goto L_0x0464
        L_0x0446:
            r1 = r5
            r18 = r14
            r5 = 3
            r7 = 5
            r8 = 1
            r13 = 2
            r14 = 0
            r15 = 4
            r17 = -1
            r21 = 8
            r22 = 9
            if (r3 != r5) goto L_0x0464
            java.lang.String r3 = r29.getName()
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0464
            r4.pop()
        L_0x0464:
            int r3 = r29.next()
            r6 = 8
            r7 = 3
            r8 = 5
            r13 = 0
            r15 = 1
            r5 = r1
            r14 = r18
            r1 = r27
            goto L_0x0167
        L_0x0475:
            if (r20 != 0) goto L_0x0484
            android.content.res.ColorStateList r0 = r12.c
            android.graphics.PorterDuff$Mode r1 = r12.f1593d
            r2 = r27
            android.graphics.PorterDuffColorFilter r0 = r2.b(r0, r1)
            r2.f1556d = r0
            return
        L_0x0484:
            r2 = r27
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "no path defined"
            r0.<init>(r1)
            throw r0
        L_0x048e:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires height > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x04aa:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires width > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x04c6:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportHeight > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x04e2:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportWidth > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            goto L_0x04ff
        L_0x04fe:
            throw r0
        L_0x04ff:
            goto L_0x04fe
        */
        throw new UnsupportedOperationException("Method not decompiled: e.q.a.a.g.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public void invalidateSelf() {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.c.f1594e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.c.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.b
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            e.q.a.a.g$h r0 = r1.c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0028
            e.q.a.a.g$h r0 = r1.c
            android.content.res.ColorStateList r0 = r0.c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.q.a.a.g.isStateful():boolean");
    }

    public Drawable mutate() {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f1558f && super.mutate() == this) {
            this.c = new h(this.c);
            this.f1558f = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        h hVar = this.c;
        ColorStateList colorStateList = hVar.c;
        if (!(colorStateList == null || (mode = hVar.f1593d) == null)) {
            this.f1556d = b(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (hVar.a()) {
            boolean b2 = hVar.b.f1587h.b(iArr);
            hVar.f1600k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.c.b.getRootAlpha() != i2) {
            this.c.b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.c.f1594e = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f1557e = colorFilter;
        invalidateSelf();
    }

    public void setTint(int i2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            e.e.d.l.a.E0(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.b;
        if (drawable != null) {
            e.e.d.l.a.F0(drawable, colorStateList);
            return;
        }
        h hVar = this.c;
        if (hVar.c != colorStateList) {
            hVar.c = colorStateList;
            this.f1556d = b(colorStateList, hVar.f1593d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.b;
        if (drawable != null) {
            e.e.d.l.a.G0(drawable, mode);
            return;
        }
        h hVar = this.c;
        if (hVar.f1593d != mode) {
            hVar.f1593d = mode;
            this.f1556d = b(hVar.c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
