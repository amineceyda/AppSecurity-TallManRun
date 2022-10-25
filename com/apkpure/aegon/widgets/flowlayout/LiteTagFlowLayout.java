package com.apkpure.aegon.widgets.flowlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import g.c.a.o.b.b;
import g.c.a.o.b.c;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class LiteTagFlowLayout extends g.c.a.o.b.a implements b.a {

    /* renamed from: i  reason: collision with root package name */
    public g.c.a.o.b.b f303i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f304j = true;

    /* renamed from: k  reason: collision with root package name */
    public int f305k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f306l = Integer.MAX_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public MotionEvent f307m;
    public Set<Integer> n = new HashSet();
    public a o;
    public b p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;

    public interface a {
        void a(Set<Integer> set);
    }

    public interface b {
        boolean a(View view, int i2, g.c.a.o.b.a aVar);
    }

    public LiteTagFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.c.a.a.b);
        this.f304j = obtainStyledAttributes.getBoolean(0, true);
        this.f305k = obtainStyledAttributes.getInt(3, -1);
        this.f306l = obtainStyledAttributes.getInt(2, Integer.MAX_VALUE);
        obtainStyledAttributes.recycle();
        if (this.f304j) {
            setClickable(true);
        }
        setMaxLines(this.f306l);
    }

    public static int b(Context context, float f2) {
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void a() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        removeAllViews();
        g.c.a.o.b.b bVar = this.f303i;
        HashSet<Integer> hashSet = bVar.c;
        int i2 = 0;
        while (true) {
            List<T> list = bVar.a;
            if (i2 < (list == null ? 0 : list.size())) {
                View a2 = bVar.a(this, i2, bVar.a.get(i2));
                c cVar = new c(getContext());
                a2.setDuplicateParentStateEnabled(true);
                if (a2.getLayoutParams() != null) {
                    marginLayoutParams = a2.getLayoutParams();
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
                    if (this.f306l == 1 && !this.u) {
                        marginLayoutParams2.setMargins(b(getContext(), 5.0f), b(getContext(), 0.0f), b(getContext(), 5.0f), b(getContext(), 0.0f));
                        marginLayoutParams = marginLayoutParams2;
                    } else if (this.u) {
                        marginLayoutParams2.setMargins(b(getContext(), (float) this.q), this.r, b(getContext(), (float) this.s), this.t);
                        marginLayoutParams = marginLayoutParams2;
                    } else {
                        marginLayoutParams2.setMargins(b(getContext(), 5.0f), b(getContext(), 5.0f), b(getContext(), 5.0f), b(getContext(), 5.0f));
                        marginLayoutParams = marginLayoutParams2;
                    }
                }
                cVar.setLayoutParams(marginLayoutParams);
                cVar.addView(a2);
                addView(cVar);
                if (hashSet.contains(Integer.valueOf(i2))) {
                    cVar.setChecked(true);
                }
                g.c.a.o.b.b bVar2 = this.f303i;
                bVar.a.get(i2);
                Objects.requireNonNull(bVar2);
                i2++;
            } else {
                this.n.addAll(hashSet);
                return;
            }
        }
    }

    public g.c.a.o.b.b getAdapter() {
        return this.f303i;
    }

    public Set<Integer> getSelectedList() {
        return new HashSet(this.n);
    }

    public void onMeasure(int i2, int i3) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            c cVar = (c) getChildAt(i4);
            if (cVar.getVisibility() != 8 && cVar.getTagView().getVisibility() == 8) {
                cVar.setVisibility(8);
            }
        }
        super.onMeasure(i2, i3);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            String string = bundle.getString("key_choose_pos");
            if (!TextUtils.isEmpty(string)) {
                for (String parseInt : string.split("\\|")) {
                    int parseInt2 = Integer.parseInt(parseInt);
                    this.n.add(Integer.valueOf(parseInt2));
                    c cVar = (c) getChildAt(parseInt2);
                    if (cVar != null) {
                        cVar.setChecked(true);
                    }
                }
            }
            super.onRestoreInstanceState(bundle.getParcelable("key_default"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_default", super.onSaveInstanceState());
        String str = "";
        if (this.n.size() > 0) {
            for (Integer intValue : this.n) {
                str = g.a.a.a.a.r(str, intValue.intValue(), "|");
            }
            str = str.substring(0, str.length() - 1);
        }
        bundle.putString("key_choose_pos", str);
        return bundle;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.f307m = MotionEvent.obtain(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean performClick() {
        MotionEvent motionEvent = this.f307m;
        if (motionEvent == null) {
            return super.performClick();
        }
        int x = (int) motionEvent.getX();
        int y = (int) this.f307m.getY();
        c cVar = null;
        this.f307m = null;
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            c cVar2 = (c) getChildAt(i2);
            if (cVar2.getVisibility() != 8) {
                Rect rect = new Rect();
                cVar2.getHitRect(rect);
                if (rect.contains(x, y)) {
                    cVar = cVar2;
                    break;
                }
            }
            i2++;
        }
        int childCount2 = getChildCount();
        int i3 = 0;
        while (true) {
            if (i3 >= childCount2) {
                i3 = -1;
                break;
            } else if (getChildAt(i3) == cVar) {
                break;
            } else {
                i3++;
            }
        }
        if (cVar == null) {
            return true;
        }
        if (this.f304j) {
            if (!cVar.isChecked()) {
                if (this.f305k == 1 && this.n.size() == 1) {
                    Integer next = this.n.iterator().next();
                    ((c) getChildAt(next.intValue())).setChecked(false);
                    cVar.setChecked(true);
                    this.n.remove(next);
                } else if (this.f305k <= 0 || this.n.size() < this.f305k) {
                    cVar.setChecked(true);
                }
                this.n.add(Integer.valueOf(i3));
            } else {
                cVar.setChecked(false);
                this.n.remove(Integer.valueOf(i3));
            }
            a aVar = this.o;
            if (aVar != null) {
                aVar.a(new HashSet(this.n));
            }
        }
        b bVar = this.p;
        if (bVar != null) {
            return bVar.a(cVar.getTagView(), i3, this);
        }
        return true;
    }

    public void setAdapter(g.c.a.o.b.b bVar) {
        this.f303i = bVar;
        bVar.b = this;
        this.n.clear();
        a();
    }

    public void setMaxSelectCount(int i2) {
        if (this.n.size() > i2) {
            Log.w("TagFlowLayout", "you has already select more than " + i2 + " views , so it will be clear .");
            this.n.clear();
        }
        this.f305k = i2;
    }

    public void setOnSelectListener(a aVar) {
        this.o = aVar;
        if (aVar != null) {
            setClickable(true);
        }
    }

    public void setOnTagClickListener(b bVar) {
        this.p = bVar;
        if (bVar != null) {
            setClickable(true);
        }
    }
}
