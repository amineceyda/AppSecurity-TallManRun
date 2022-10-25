package com.apkpure.aegon.widgets.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class CustomViewPager extends ViewPager {
    public boolean q0 = false;
    public boolean r0 = true;

    public CustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.q0) {
                return false;
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.q0) {
                return false;
            }
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public void setCurrentItem(int i2) {
        if (this.r0) {
            super.setCurrentItem(i2);
            return;
        }
        this.w = false;
        w(i2, false, false, 0);
    }

    public void setNoScroll(boolean z) {
        this.q0 = z;
    }

    public void setScroll(boolean z) {
        this.q0 = !z;
    }

    public void setSmoothScroll(boolean z) {
        this.r0 = z;
    }
}
