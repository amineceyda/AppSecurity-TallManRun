package com.apkpure.aegon.widgets.layout;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.apkpure.aegon.application.AegonApplication;
import com.apkpure.aegon.cms.activity.PictureBrowseActivity;
import g.c.a.m.k;
import g.c.a.o.c.b;
import g.c.a.o.c.c;
import g.c.a.o.c.d;
import java.util.Objects;

public class FingerFrameLayout extends FrameLayout {

    /* renamed from: j  reason: collision with root package name */
    public static final int f308j;
    public boolean b = true;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public View f309d;

    /* renamed from: e  reason: collision with root package name */
    public PointF f310e = new PointF();

    /* renamed from: f  reason: collision with root package name */
    public boolean f311f = true;

    /* renamed from: g  reason: collision with root package name */
    public float f312g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f313h = false;

    /* renamed from: i  reason: collision with root package name */
    public a f314i;

    public interface a {
    }

    static {
        double a2 = (double) k.a(AegonApplication.getContext());
        Double.isNaN(a2);
        f308j = (int) (a2 * 0.25d);
    }

    public FingerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }

    public static void a(FingerFrameLayout fingerFrameLayout) {
        a aVar = fingerFrameLayout.f314i;
        if (aVar != null) {
            ((PictureBrowseActivity.a) aVar).a(fingerFrameLayout.f312g);
            if (fingerFrameLayout.b) {
                Objects.requireNonNull((PictureBrowseActivity.a) fingerFrameLayout.f314i);
            }
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f309d = getChildAt(0);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f311f) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction() & motionEvent.getActionMasked();
        if (action == 0) {
            this.f310e.x = motionEvent.getRawX();
            this.f310e.y = motionEvent.getRawY();
            return false;
        } else if (action == 1) {
            PointF pointF = this.f310e;
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return false;
        } else if (action != 2) {
            return false;
        } else {
            float abs = Math.abs(motionEvent.getRawX() - this.f310e.x);
            float abs2 = Math.abs(motionEvent.getRawY() - this.f310e.y);
            if (this.f309d == null) {
                return false;
            }
            int i2 = this.c;
            return abs2 > ((float) i2) && abs < ((float) i2) && abs2 > abs;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f311f) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction() & motionEvent.getActionMasked();
        float f2 = 0.0f;
        if (action != 1) {
            if (action == 2 && this.f309d != null) {
                float rawY = motionEvent.getRawY() - this.f310e.y;
                this.f312g = rawY;
                float abs = 1.0f - Math.abs(rawY / ((float) this.f309d.getHeight()));
                if (abs > 1.0f) {
                    f2 = 1.0f;
                } else if (abs >= 0.0f) {
                    f2 = abs;
                }
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (!(viewGroup == null || viewGroup.getBackground() == null || !this.b)) {
                    viewGroup.getBackground().mutate().setAlpha((int) (f2 * 255.0f));
                }
                a aVar = this.f314i;
                if (aVar != null) {
                    ((PictureBrowseActivity.a) aVar).a(this.f312g);
                    if (this.b) {
                        Objects.requireNonNull((PictureBrowseActivity.a) this.f314i);
                    }
                }
                setScrollY(-((int) this.f312g));
            }
        } else if (Math.abs(this.f312g) > ((float) f308j)) {
            float[] fArr = new float[2];
            float f3 = this.f312g;
            fArr[0] = f3;
            fArr[1] = (float) (f3 > 0.0f ? getHeight() : -getHeight());
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            ofFloat.addUpdateListener(new b(this));
            ofFloat.addListener(new c(this));
            ofFloat.setDuration(200);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.start();
        } else {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{this.f312g, 0.0f});
            ofFloat2.setDuration(200);
            ofFloat2.addUpdateListener(new g.c.a.o.c.a(this));
            ofFloat2.addListener(new d(this));
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.start();
        }
        return true;
    }

    public void setFinger(boolean z) {
        this.f311f = z;
    }

    public void setOnAlphaChangeListener(a aVar) {
        this.f314i = aVar;
    }

    public void setUpdateAlpha(boolean z) {
        this.b = z;
    }
}
