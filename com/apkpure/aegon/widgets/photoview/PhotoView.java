package com.apkpure.aegon.widgets.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import e.e.d.l.a;
import g.c.a.o.d.c;
import g.c.a.o.d.d;
import g.c.a.o.d.e;
import g.c.a.o.d.f;
import g.c.a.o.d.g;
import g.c.a.o.d.h;
import g.c.a.o.d.i;
import g.c.a.o.d.j;
import g.c.a.o.d.k;
import java.util.Objects;

public class PhotoView extends ImageView {
    public j b = new j(this);
    public ImageView.ScaleType c;

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.c;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.c = null;
        }
    }

    public j getAttacher() {
        return this.b;
    }

    public RectF getDisplayRect() {
        return this.b.c();
    }

    public Matrix getImageMatrix() {
        return this.b.f2142m;
    }

    public float getMaximumScale() {
        return this.b.f2135f;
    }

    public float getMediumScale() {
        return this.b.f2134e;
    }

    public float getMinimumScale() {
        return this.b.f2133d;
    }

    public float getScale() {
        return this.b.h();
    }

    public ImageView.ScaleType getScaleType() {
        return this.b.C;
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.b.f2136g = z;
    }

    public boolean setFrame(int i2, int i3, int i4, int i5) {
        boolean frame = super.setFrame(i2, i3, i4, i5);
        if (frame) {
            this.b.k();
        }
        return frame;
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        j jVar = this.b;
        if (jVar != null) {
            jVar.k();
        }
    }

    public void setImageResource(int i2) {
        super.setImageResource(i2);
        j jVar = this.b;
        if (jVar != null) {
            jVar.k();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        j jVar = this.b;
        if (jVar != null) {
            jVar.k();
        }
    }

    public void setMaximumScale(float f2) {
        j jVar = this.b;
        a.j(jVar.f2133d, jVar.f2134e, f2);
        jVar.f2135f = f2;
    }

    public void setMediumScale(float f2) {
        j jVar = this.b;
        a.j(jVar.f2133d, f2, jVar.f2135f);
        jVar.f2134e = f2;
    }

    public void setMinimumScale(float f2) {
        j jVar = this.b;
        a.j(f2, jVar.f2134e, jVar.f2135f);
        jVar.f2133d = f2;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.b.u = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.b.f2139j.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.b.v = onLongClickListener;
    }

    public void setOnMatrixChangeListener(c cVar) {
        this.b.q = cVar;
    }

    public void setOnOutsidePhotoTapListener(d dVar) {
        this.b.s = dVar;
    }

    public void setOnPhotoTapListener(e eVar) {
        this.b.r = eVar;
    }

    public void setOnScaleChangeListener(f fVar) {
        this.b.w = fVar;
    }

    public void setOnSingleFlingListener(g gVar) {
        this.b.x = gVar;
    }

    public void setOnViewDragListener(h hVar) {
        this.b.y = hVar;
    }

    public void setOnViewTapListener(i iVar) {
        this.b.t = iVar;
    }

    public void setRotationBy(float f2) {
        j jVar = this.b;
        jVar.n.postRotate(f2 % 360.0f);
        jVar.a();
    }

    public void setRotationTo(float f2) {
        j jVar = this.b;
        jVar.n.setRotate(f2 % 360.0f);
        jVar.a();
    }

    public void setScale(float f2) {
        j jVar = this.b;
        jVar.j(f2, (float) (jVar.f2138i.getRight() / 2), (float) (jVar.f2138i.getBottom() / 2), false);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        j jVar = this.b;
        if (jVar == null) {
            this.c = scaleType;
            return;
        }
        Objects.requireNonNull(jVar);
        boolean z = true;
        if (scaleType == null) {
            z = false;
        } else if (k.a[scaleType.ordinal()] == 1) {
            throw new IllegalStateException("Matrix scale type is not supported");
        }
        if (z && scaleType != jVar.C) {
            jVar.C = scaleType;
            jVar.k();
        }
    }

    public void setZoomTransitionDuration(int i2) {
        this.b.c = i2;
    }

    public void setZoomable(boolean z) {
        j jVar = this.b;
        jVar.B = z;
        jVar.k();
    }
}
