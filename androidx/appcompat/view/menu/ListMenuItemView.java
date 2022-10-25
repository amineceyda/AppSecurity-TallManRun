package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import e.b.b;
import e.b.g.i.i;
import e.b.g.i.n;
import e.b.h.x0;
import e.e.j.q;
import java.util.Objects;
import java.util.WeakHashMap;

public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {
    public i b;
    public ImageView c;

    /* renamed from: d  reason: collision with root package name */
    public RadioButton f77d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f78e;

    /* renamed from: f  reason: collision with root package name */
    public CheckBox f79f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f80g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f81h;

    /* renamed from: i  reason: collision with root package name */
    public ImageView f82i;

    /* renamed from: j  reason: collision with root package name */
    public LinearLayout f83j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f84k;

    /* renamed from: l  reason: collision with root package name */
    public int f85l;

    /* renamed from: m  reason: collision with root package name */
    public Context f86m;
    public boolean n;
    public Drawable o;
    public boolean p;
    public LayoutInflater q;
    public boolean r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        x0 o2 = x0.o(getContext(), attributeSet, b.q, 2130969261, 0);
        this.f84k = o2.e(5);
        this.f85l = o2.j(1, -1);
        this.n = o2.a(7, false);
        this.f86m = context;
        this.o = o2.e(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, 2130968963, 0);
        this.p = obtainStyledAttributes.hasValue(0);
        o2.b.recycle();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f81h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(2131492878, this, false);
        this.f79f = checkBox;
        LinearLayout linearLayout = this.f83j;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f82i;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f82i.getLayoutParams();
            rect.top = this.f82i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    public final void b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(2131492881, this, false);
        this.f77d = radioButton;
        LinearLayout linearLayout = this.f83j;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    public void c(i iVar, int i2) {
        this.b = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.f1056e);
        setCheckable(iVar.isCheckable());
        boolean m2 = iVar.m();
        iVar.e();
        d(m2);
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.q);
    }

    public void d(boolean z) {
        String str;
        int i2;
        int i3 = (!z || !this.b.m()) ? 8 : 0;
        if (i3 == 0) {
            TextView textView = this.f80g;
            i iVar = this.b;
            char e2 = iVar.e();
            if (e2 == 0) {
                str = "";
            } else {
                Resources resources = iVar.n.a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(iVar.n.a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(2131820566));
                }
                int i4 = iVar.n.n() ? iVar.f1062k : iVar.f1060i;
                i.c(sb, i4, 65536, resources.getString(2131820562));
                i.c(sb, i4, 4096, resources.getString(2131820558));
                i.c(sb, i4, 2, resources.getString(2131820557));
                i.c(sb, i4, 1, resources.getString(2131820563));
                i.c(sb, i4, 4, resources.getString(2131820565));
                i.c(sb, i4, 8, resources.getString(2131820561));
                if (e2 == 8) {
                    i2 = 2131820559;
                } else if (e2 == 10) {
                    i2 = 2131820560;
                } else if (e2 != ' ') {
                    sb.append(e2);
                    str = sb.toString();
                } else {
                    i2 = 2131820564;
                }
                sb.append(resources.getString(i2));
                str = sb.toString();
            }
            textView.setText(str);
        }
        if (this.f80g.getVisibility() != i3) {
            this.f80g.setVisibility(i3);
        }
    }

    public i getItemData() {
        return this.b;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f84k;
        WeakHashMap<View, String> weakHashMap = q.a;
        setBackground(drawable);
        TextView textView = (TextView) findViewById(2131297689);
        this.f78e = textView;
        int i2 = this.f85l;
        if (i2 != -1) {
            textView.setTextAppearance(this.f86m, i2);
        }
        this.f80g = (TextView) findViewById(2131297552);
        ImageView imageView = (ImageView) findViewById(2131297626);
        this.f81h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.o);
        }
        this.f82i = (ImageView) findViewById(2131296911);
        this.f83j = (LinearLayout) findViewById(2131296676);
    }

    public void onMeasure(int i2, int i3) {
        if (this.c != null && this.n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.c.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f77d != null || this.f79f != null) {
            if (this.b.h()) {
                if (this.f77d == null) {
                    b();
                }
                compoundButton2 = this.f77d;
                compoundButton = this.f79f;
            } else {
                if (this.f79f == null) {
                    a();
                }
                compoundButton2 = this.f79f;
                compoundButton = this.f77d;
            }
            if (z) {
                compoundButton2.setChecked(this.b.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f79f;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f77d;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.b.h()) {
            if (this.f77d == null) {
                b();
            }
            compoundButton = this.f77d;
        } else {
            if (this.f79f == null) {
                a();
            }
            compoundButton = this.f79f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.r = z;
        this.n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f82i;
        if (imageView != null) {
            imageView.setVisibility((this.p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        Objects.requireNonNull(this.b.n);
        boolean z = this.r;
        if (z || this.n) {
            ImageView imageView = this.c;
            if (imageView != null || drawable != null || this.n) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(2131492879, this, false);
                    this.c = imageView2;
                    LinearLayout linearLayout = this.f83j;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.n) {
                    ImageView imageView3 = this.c;
                    if (!z) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.c.getVisibility() != 0) {
                        this.c.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.c.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i2;
        if (charSequence != null) {
            this.f78e.setText(charSequence);
            if (this.f78e.getVisibility() != 0) {
                textView = this.f78e;
                i2 = 0;
            } else {
                return;
            }
        } else {
            i2 = 8;
            if (this.f78e.getVisibility() != 8) {
                textView = this.f78e;
            } else {
                return;
            }
        }
        textView.setVisibility(i2);
    }
}
