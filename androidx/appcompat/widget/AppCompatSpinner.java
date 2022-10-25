package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import e.b.c.g;
import e.b.h.f0;
import e.b.h.h0;
import e.b.h.k0;
import e.b.h.t0;
import e.e.j.p;
import e.e.j.q;
import g.i.c.a.a.i.b;
import java.util.Objects;
import java.util.WeakHashMap;

public class AppCompatSpinner extends Spinner implements p {

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f120j = {16843505};
    public final e.b.h.d b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public h0 f121d;

    /* renamed from: e  reason: collision with root package name */
    public SpinnerAdapter f122e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f123f;

    /* renamed from: g  reason: collision with root package name */
    public e f124g;

    /* renamed from: h  reason: collision with root package name */
    public int f125h;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f126i = new Rect();

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean b;

        public class a implements Parcelable.Creator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.b = parcel.readByte() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.b ? (byte) 1 : 0);
        }
    }

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().b()) {
                AppCompatSpinner.this.b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    public class b implements e, DialogInterface.OnClickListener {
        public g b;
        public ListAdapter c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f127d;

        public b() {
        }

        public int a() {
            return 0;
        }

        public boolean b() {
            g gVar = this.b;
            if (gVar != null) {
                return gVar.isShowing();
            }
            return false;
        }

        public void dismiss() {
            g gVar = this.b;
            if (gVar != null) {
                gVar.dismiss();
                this.b = null;
            }
        }

        public Drawable f() {
            return null;
        }

        public void h(CharSequence charSequence) {
            this.f127d = charSequence;
        }

        public void i(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        public void j(int i2) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public void k(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        public void l(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        public void m(int i2, int i3) {
            if (this.c != null) {
                g.a aVar = new g.a(AppCompatSpinner.this.getPopupContext());
                CharSequence charSequence = this.f127d;
                if (charSequence != null) {
                    aVar.a.f35d = charSequence;
                }
                ListAdapter listAdapter = this.c;
                int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
                AlertController.b bVar = aVar.a;
                bVar.p = listAdapter;
                bVar.q = this;
                bVar.t = selectedItemPosition;
                bVar.s = true;
                g a = aVar.a();
                this.b = a;
                ListView listView = a.f941d.f28g;
                listView.setTextDirection(i2);
                listView.setTextAlignment(i3);
                this.b.show();
            }
        }

        public int n() {
            return 0;
        }

        public CharSequence o() {
            return this.f127d;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            AppCompatSpinner.this.setSelection(i2);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick((View) null, i2, this.c.getItemId(i2));
            }
            g gVar = this.b;
            if (gVar != null) {
                gVar.dismiss();
                this.b = null;
            }
        }

        public void p(ListAdapter listAdapter) {
            this.c = listAdapter;
        }
    }

    public static class c implements ListAdapter, SpinnerAdapter {
        public SpinnerAdapter b;
        public ListAdapter c;

        public c(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.c = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof t0) {
                t0 t0Var = (t0) spinnerAdapter;
                if (t0Var.getDropDownViewTheme() == null) {
                    t0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        public Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        public long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.b;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i2);
        }

        public int getItemViewType(int i2) {
            return 0;
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.b;
            View dropDownView = spinnerAdapter == null ? null : spinnerAdapter.getDropDownView(i2, view, viewGroup);
            g.i.c.a.a.i.b bVar = b.C0166b.a;
            SpinnerAdapter spinnerAdapter2 = this.b;
            bVar.h(i2, view, viewGroup, spinnerAdapter2 == null ? -1 : spinnerAdapter2.getItemId(i2));
            return dropDownView;
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class d extends k0 implements e {
        public CharSequence R;
        public ListAdapter S;
        public final Rect T = new Rect();
        public int U;

        public class a implements AdapterView.OnItemClickListener {
            public a(AppCompatSpinner appCompatSpinner) {
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                AppCompatSpinner.this.setSelection(i2);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    d dVar = d.this;
                    AppCompatSpinner.this.performItemClick(view, i2, dVar.S.getItemId(i2));
                }
                d.this.dismiss();
                b.C0166b.a.g(adapterView, view, i2);
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            public void onGlobalLayout() {
                d dVar = d.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                Objects.requireNonNull(dVar);
                WeakHashMap<View, String> weakHashMap = q.a;
                if (!(appCompatSpinner.isAttachedToWindow() && appCompatSpinner.getGlobalVisibleRect(dVar.T))) {
                    d.this.dismiss();
                    return;
                }
                d.this.u();
                d.this.d();
            }
        }

        public class c implements PopupWindow.OnDismissListener {
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener b;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.b = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.b);
                }
            }
        }

        public d(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2, 0);
            this.q = AppCompatSpinner.this;
            s(true);
            this.o = 0;
            this.r = new a(AppCompatSpinner.this);
        }

        public void h(CharSequence charSequence) {
            this.R = charSequence;
        }

        public void k(int i2) {
            this.U = i2;
        }

        public void m(int i2, int i3) {
            ViewTreeObserver viewTreeObserver;
            boolean b2 = b();
            u();
            this.A.setInputMethodMode(2);
            d();
            f0 f0Var = this.f1158d;
            f0Var.setChoiceMode(1);
            f0Var.setTextDirection(i2);
            f0Var.setTextAlignment(i3);
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            f0 f0Var2 = this.f1158d;
            if (b() && f0Var2 != null) {
                f0Var2.setListSelectionHidden(false);
                f0Var2.setSelection(selectedItemPosition);
                if (f0Var2.getChoiceMode() != 0) {
                    f0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!b2 && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                this.A.setOnDismissListener(new c(bVar));
            }
        }

        public CharSequence o() {
            return this.R;
        }

        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.S = listAdapter;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0096  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void u() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.f()
                r1 = 0
                if (r0 == 0) goto L_0x0026
                androidx.appcompat.widget.AppCompatSpinner r1 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r1 = r1.f126i
                r0.getPadding(r1)
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                boolean r0 = e.b.h.d1.b(r0)
                if (r0 == 0) goto L_0x001d
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.f126i
                int r0 = r0.right
                goto L_0x0024
            L_0x001d:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.f126i
                int r0 = r0.left
                int r0 = -r0
            L_0x0024:
                r1 = r0
                goto L_0x002e
            L_0x0026:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.f126i
                r0.right = r1
                r0.left = r1
            L_0x002e:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.AppCompatSpinner r2 = androidx.appcompat.widget.AppCompatSpinner.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.AppCompatSpinner r3 = androidx.appcompat.widget.AppCompatSpinner.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.AppCompatSpinner r4 = androidx.appcompat.widget.AppCompatSpinner.this
                int r5 = r4.f125h
                r6 = -2
                if (r5 != r6) goto L_0x0078
                android.widget.ListAdapter r5 = r8.S
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.f()
                int r4 = r4.a(r5, r6)
                androidx.appcompat.widget.AppCompatSpinner r5 = androidx.appcompat.widget.AppCompatSpinner.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.AppCompatSpinner r6 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r6 = r6.f126i
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L_0x0070
                r4 = r5
            L_0x0070:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L_0x007e
            L_0x0078:
                r4 = -1
                if (r5 != r4) goto L_0x0082
                int r4 = r3 - r0
                int r4 = r4 - r2
            L_0x007e:
                r8.r(r4)
                goto L_0x0085
            L_0x0082:
                r8.r(r5)
            L_0x0085:
                androidx.appcompat.widget.AppCompatSpinner r4 = androidx.appcompat.widget.AppCompatSpinner.this
                boolean r4 = e.b.h.d1.b(r4)
                if (r4 == 0) goto L_0x0096
                int r3 = r3 - r2
                int r0 = r8.f1160f
                int r3 = r3 - r0
                int r0 = r8.U
                int r3 = r3 - r0
                int r3 = r3 + r1
                goto L_0x009b
            L_0x0096:
                int r2 = r8.U
                int r0 = r0 + r2
                int r3 = r0 + r1
            L_0x009b:
                r8.f1161g = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.d.u():void");
        }
    }

    public interface e {
        int a();

        boolean b();

        void dismiss();

        Drawable f();

        void h(CharSequence charSequence);

        void i(Drawable drawable);

        void j(int i2);

        void k(int i2);

        void l(int i2);

        void m(int i2, int i3);

        int n();

        CharSequence o();

        void p(ListAdapter listAdapter);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r4 != null) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.f126i = r0
            android.content.Context r0 = r9.getContext()
            e.b.h.s0.a(r9, r0)
            int[] r0 = e.b.b.u
            r1 = 0
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r11, r0, r12, r1)
            e.b.h.d r2 = new e.b.h.d
            r2.<init>(r9)
            r9.b = r2
            r2 = 4
            int r2 = r0.getResourceId(r2, r1)
            if (r2 == 0) goto L_0x002e
            e.b.g.c r3 = new e.b.g.c
            r3.<init>((android.content.Context) r10, (int) r2)
            r9.c = r3
            goto L_0x0030
        L_0x002e:
            r9.c = r10
        L_0x0030:
            r2 = 0
            r3 = -1
            int[] r4 = f120j     // Catch:{ Exception -> 0x004c, all -> 0x0049 }
            android.content.res.TypedArray r4 = r10.obtainStyledAttributes(r11, r4, r12, r1)     // Catch:{ Exception -> 0x004c, all -> 0x0049 }
            boolean r5 = r4.hasValue(r1)     // Catch:{ Exception -> 0x0047 }
            if (r5 == 0) goto L_0x0058
            int r3 = r4.getInt(r1, r1)     // Catch:{ Exception -> 0x0047 }
            goto L_0x0058
        L_0x0043:
            r10 = move-exception
            r2 = r4
            goto L_0x00d0
        L_0x0047:
            r5 = move-exception
            goto L_0x004f
        L_0x0049:
            r10 = move-exception
            goto L_0x00d0
        L_0x004c:
            r4 = move-exception
            r5 = r4
            r4 = r2
        L_0x004f:
            java.lang.String r6 = "AppCompatSpinner"
            java.lang.String r7 = "Could not read android:spinnerMode"
            android.util.Log.i(r6, r7, r5)     // Catch:{ all -> 0x0043 }
            if (r4 == 0) goto L_0x005b
        L_0x0058:
            r4.recycle()
        L_0x005b:
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0097
            if (r3 == r5) goto L_0x0062
            goto L_0x00a5
        L_0x0062:
            androidx.appcompat.widget.AppCompatSpinner$d r3 = new androidx.appcompat.widget.AppCompatSpinner$d
            android.content.Context r6 = r9.c
            r3.<init>(r6, r11, r12)
            android.content.Context r6 = r9.c
            int[] r7 = e.b.b.u
            e.b.h.x0 r6 = e.b.h.x0.o(r6, r11, r7, r12, r1)
            r7 = 3
            r8 = -2
            int r7 = r6.i(r7, r8)
            r9.f125h = r7
            android.graphics.drawable.Drawable r7 = r6.e(r5)
            android.widget.PopupWindow r8 = r3.A
            r8.setBackgroundDrawable(r7)
            java.lang.String r4 = r0.getString(r4)
            r3.R = r4
            android.content.res.TypedArray r4 = r6.b
            r4.recycle()
            r9.f124g = r3
            e.b.h.v r4 = new e.b.h.v
            r4.<init>(r9, r9, r3)
            r9.f121d = r4
            goto L_0x00a5
        L_0x0097:
            androidx.appcompat.widget.AppCompatSpinner$b r3 = new androidx.appcompat.widget.AppCompatSpinner$b
            r3.<init>()
            r9.f124g = r3
            java.lang.String r4 = r0.getString(r4)
            r3.h(r4)
        L_0x00a5:
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 == 0) goto L_0x00bc
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r10, r4, r1)
            r10 = 2131493269(0x7f0c0195, float:1.8610013E38)
            r3.setDropDownViewResource(r10)
            r9.setAdapter((android.widget.SpinnerAdapter) r3)
        L_0x00bc:
            r0.recycle()
            r9.f123f = r5
            android.widget.SpinnerAdapter r10 = r9.f122e
            if (r10 == 0) goto L_0x00ca
            r9.setAdapter((android.widget.SpinnerAdapter) r10)
            r9.f122e = r2
        L_0x00ca:
            e.b.h.d r10 = r9.b
            r10.d(r11, r12)
            return
        L_0x00d0:
            if (r2 == 0) goto L_0x00d5
            r2.recycle()
        L_0x00d5:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        drawable.getPadding(this.f126i);
        Rect rect = this.f126i;
        return i3 + rect.left + rect.right;
    }

    public void b() {
        this.f124g.m(getTextDirection(), getTextAlignment());
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e.b.h.d dVar = this.b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        e eVar = this.f124g;
        return eVar != null ? eVar.a() : super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        e eVar = this.f124g;
        return eVar != null ? eVar.n() : super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return this.f124g != null ? this.f125h : super.getDropDownWidth();
    }

    public final e getInternalPopup() {
        return this.f124g;
    }

    public Drawable getPopupBackground() {
        e eVar = this.f124g;
        return eVar != null ? eVar.f() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.c;
    }

    public CharSequence getPrompt() {
        e eVar = this.f124g;
        return eVar != null ? eVar.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        e.b.h.d dVar = this.b;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e.b.h.d dVar = this.b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.f124g;
        if (eVar != null && eVar.b()) {
            this.f124g.dismiss();
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f124g != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.b && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new a());
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        e eVar = this.f124g;
        savedState.b = eVar != null && eVar.b();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var = this.f121d;
        if (h0Var == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        e eVar = this.f124g;
        if (eVar == null) {
            return super.performClick();
        }
        if (eVar.b()) {
            return true;
        }
        b();
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f123f) {
            this.f122e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f124g != null) {
            Context context = this.c;
            if (context == null) {
                context = getContext();
            }
            this.f124g.p(new c(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e.b.h.d dVar = this.b;
        if (dVar != null) {
            dVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e.b.h.d dVar = this.b;
        if (dVar != null) {
            dVar.f(i2);
        }
    }

    public void setDropDownHorizontalOffset(int i2) {
        e eVar = this.f124g;
        if (eVar != null) {
            eVar.k(i2);
            this.f124g.l(i2);
            return;
        }
        super.setDropDownHorizontalOffset(i2);
    }

    public void setDropDownVerticalOffset(int i2) {
        e eVar = this.f124g;
        if (eVar != null) {
            eVar.j(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    public void setDropDownWidth(int i2) {
        if (this.f124g != null) {
            this.f125h = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        e eVar = this.f124g;
        if (eVar != null) {
            eVar.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(e.b.d.a.a.b(getPopupContext(), i2));
    }

    public void setPrompt(CharSequence charSequence) {
        e eVar = this.f124g;
        if (eVar != null) {
            eVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e.b.h.d dVar = this.b;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e.b.h.d dVar = this.b;
        if (dVar != null) {
            dVar.i(mode);
        }
    }
}
