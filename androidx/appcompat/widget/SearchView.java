package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import e.b.h.d1;
import e.b.h.i0;
import e.b.h.r0;
import e.b.h.x0;
import e.e.j.q;
import g.i.c.a.a.i.b;
import g.i.c.a.a.r.e;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

public class SearchView extends i0 implements e.b.g.b {
    public static final n E0 = (Build.VERSION.SDK_INT < 29 ? new n() : null);
    public Rect A;
    public final TextView.OnEditorActionListener A0;
    public Rect B;
    public final AdapterView.OnItemClickListener B0;
    public int[] C;
    public final AdapterView.OnItemSelectedListener C0;
    public TextWatcher D0;
    public int[] Q;
    public final ImageView R;
    public final Drawable S;
    public final int T;
    public final int U;
    public final Intent V;
    public final Intent W;
    public final CharSequence a0;
    public l b0;
    public k c0;
    public View.OnFocusChangeListener d0;
    public m e0;
    public View.OnClickListener f0;
    public boolean g0;
    public boolean h0;
    public e.f.a.a i0;
    public boolean j0;
    public CharSequence k0;
    public boolean l0;
    public boolean m0;
    public int n0;
    public boolean o0;
    public CharSequence p0;
    public final SearchAutoComplete q;
    public CharSequence q0;
    public final View r;
    public boolean r0;
    public final View s;
    public int s0;
    public final View t;
    public SearchableInfo t0;
    public final ImageView u;
    public Bundle u0;
    public final ImageView v;
    public final Runnable v0;
    public final ImageView w;
    public Runnable w0;
    public final ImageView x;
    public final WeakHashMap<String, Drawable.ConstantState> x0;
    public final View y;
    public final View.OnClickListener y0;
    public o z;
    public View.OnKeyListener z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean b;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.b = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder i2 = g.a.a.a.a.i("SearchView.SavedState{");
            i2.append(Integer.toHexString(System.identityHashCode(this)));
            i2.append(" isIconified=");
            i2.append(this.b);
            i2.append("}");
            return i2.toString();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeValue(Boolean.valueOf(this.b));
        }
    }

    public static class SearchAutoComplete extends e.b.h.c {

        /* renamed from: e  reason: collision with root package name */
        public int f135e = getThreshold();

        /* renamed from: f  reason: collision with root package name */
        public SearchView f136f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f137g;

        /* renamed from: h  reason: collision with root package name */
        public final Runnable f138h = new a();

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f137g) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f137g = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, 2130968647);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        public void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            n nVar = SearchView.E0;
            Objects.requireNonNull(nVar);
            n.a();
            Method method = nVar.c;
            if (method != null) {
                try {
                    method.invoke(this, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }

        public boolean enoughToFilter() {
            return this.f135e <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f137g) {
                removeCallbacks(this.f138h);
                post(this.f138h);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z, int i2, Rect rect) {
            super.onFocusChanged(z, i2, rect);
            SearchView searchView = this.f136f;
            searchView.F(searchView.h0);
            searchView.post(searchView.v0);
            if (searchView.q.hasFocus()) {
                searchView.r();
            }
        }

        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f136f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f136f.hasFocus() && getVisibility() == 0) {
                boolean z2 = true;
                this.f137g = true;
                Context context = getContext();
                n nVar = SearchView.E0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z2 = false;
                }
                if (z2) {
                    a();
                }
            }
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f137g = false;
                removeCallbacks(this.f138h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f137g = false;
                removeCallbacks(this.f138h);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f137g = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f136f = searchView;
        }

        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f135e = i2;
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.q.getText();
            searchView.q0 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.E(z);
            searchView.G(!z);
            searchView.A();
            searchView.D();
            if (searchView.b0 != null && !TextUtils.equals(charSequence, searchView.p0)) {
                searchView.b0.a(charSequence.toString());
            }
            searchView.p0 = charSequence.toString();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            SearchView.this.B();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            e.f.a.a aVar = SearchView.this.i0;
            if (aVar instanceof r0) {
                aVar.b((Cursor) null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.d0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            SearchView searchView = SearchView.this;
            if (searchView.y.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.s.getPaddingLeft();
                Rect rect = new Rect();
                boolean b2 = d1.b(searchView);
                int dimensionPixelSize = searchView.g0 ? resources.getDimensionPixelSize(2131165226) + resources.getDimensionPixelSize(2131165225) : 0;
                searchView.q.getDropDownBackground().getPadding(rect);
                searchView.q.setDropDownHorizontalOffset(b2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.q.setDropDownWidth((((searchView.y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.u) {
                searchView.x();
            } else if (view == searchView.w) {
                searchView.t();
            } else if (view == searchView.v) {
                searchView.y();
            } else if (view == searchView.x) {
                SearchableInfo searchableInfo = searchView.t0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.V);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.q(searchView.W, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                    }
                }
            } else if (view == searchView.q) {
                searchView.r();
            }
            b.C0166b.a.j(view);
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.t0 == null) {
                return false;
            }
            if (searchView.q.isPopupShowing() && SearchView.this.q.getListSelection() != -1) {
                return SearchView.this.z(i2, keyEvent);
            }
            if ((TextUtils.getTrimmedLength(SearchView.this.q.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.s(0, (String) null, searchView2.q.getText().toString());
            return true;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            SearchView.this.y();
            g.i.c.a.a.i.b bVar = b.C0166b.a;
            Objects.requireNonNull(bVar);
            g.i.c.a.a.r.e eVar = e.b.a;
            if (eVar.a) {
                StringBuilder i3 = g.a.a.a.a.i("onEditorAction, v = ");
                i3.append(g.i.c.a.a.b0.n.b(textView));
                i3.append(" actionId = ");
                i3.append(i2);
                g.c.b.b.f.K("EventCollector", i3.toString());
            }
            if (eVar.i()) {
                g.i.c.a.a.i.e.d dVar = (g.i.c.a.a.i.e.d) g.i.c.a.a.b0.g.a(11);
                dVar.d(textView, i2, keyEvent, 1);
                bVar.b.a(textView, dVar);
            }
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.u(i2);
            b.C0166b.a.g(adapterView, view, i2);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.v(i2);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public interface k {
        boolean a();
    }

    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    public interface m {
        boolean a(int i2);

        boolean b(int i2);
    }

    public static class n {
        public Method a = null;
        public Method b = null;
        public Method c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public n() {
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public static class o extends TouchDelegate {
        public final View a;
        public final Rect b = new Rect();
        public final Rect c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        public final Rect f139d = new Rect();

        /* renamed from: e  reason: collision with root package name */
        public final int f140e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f141f;

        public o(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f140e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.f139d.set(rect);
            Rect rect3 = this.f139d;
            int i2 = this.f140e;
            rect3.inset(-i2, -i2);
            this.c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.f141f
                r7.f141f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.f141f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.f139d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.f141f = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x006e
                if (r2 == 0) goto L_0x005b
                android.graphics.Rect r2 = r7.c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005b
                android.view.View r0 = r7.a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                goto L_0x0064
            L_0x005b:
                android.graphics.Rect r2 = r7.c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
            L_0x0064:
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                android.view.View r0 = r7.a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x006e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.o.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969529);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Context context2 = context;
        this.A = new Rect();
        this.B = new Rect();
        this.C = new int[2];
        this.Q = new int[2];
        this.v0 = new b();
        this.w0 = new c();
        this.x0 = new WeakHashMap<>();
        f fVar = new f();
        this.y0 = fVar;
        this.z0 = new g();
        h hVar = new h();
        this.A0 = hVar;
        i iVar = new i();
        this.B0 = iVar;
        j jVar = new j();
        this.C0 = jVar;
        this.D0 = new a();
        x0 x0Var = new x0(context2, context2.obtainStyledAttributes(attributeSet, e.b.b.t, i2, 0));
        LayoutInflater.from(context).inflate(x0Var.j(9, 2131492889), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(2131297514);
        this.q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.r = findViewById(2131297503);
        View findViewById = findViewById(2131297512);
        this.s = findViewById;
        View findViewById2 = findViewById(2131297627);
        this.t = findViewById2;
        ImageView imageView = (ImageView) findViewById(2131297497);
        this.u = imageView;
        ImageView imageView2 = (ImageView) findViewById(2131297505);
        this.v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(2131297498);
        this.w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(2131297520);
        this.x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(2131297509);
        this.R = imageView5;
        Drawable e2 = x0Var.e(10);
        WeakHashMap<View, String> weakHashMap = q.a;
        findViewById.setBackground(e2);
        findViewById2.setBackground(x0Var.e(14));
        imageView.setImageDrawable(x0Var.e(13));
        imageView2.setImageDrawable(x0Var.e(7));
        imageView3.setImageDrawable(x0Var.e(4));
        imageView4.setImageDrawable(x0Var.e(16));
        imageView5.setImageDrawable(x0Var.e(13));
        this.S = x0Var.e(12);
        e.b.a.u(imageView, getResources().getString(2131820570));
        this.T = x0Var.j(15, 2131492888);
        this.U = x0Var.j(5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.D0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.z0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(x0Var.a(8, true));
        int d2 = x0Var.d(1, -1);
        if (d2 != -1) {
            setMaxWidth(d2);
        }
        this.a0 = x0Var.l(6);
        this.k0 = x0Var.l(11);
        int h2 = x0Var.h(3, -1);
        if (h2 != -1) {
            setImeOptions(h2);
        }
        int h3 = x0Var.h(2, -1);
        if (h3 != -1) {
            setInputType(h3);
        }
        setFocusable(x0Var.a(0, true));
        x0Var.b.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.V = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.W = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.y = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        F(this.g0);
        C();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(2131165238);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(2131165239);
    }

    private void setQuery(CharSequence charSequence) {
        this.q.setText(charSequence);
        this.q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final void A() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.q.getText());
        int i2 = 0;
        if (!z3 && (!this.g0 || this.r0)) {
            z2 = false;
        }
        ImageView imageView = this.w;
        if (!z2) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.w.getDrawable();
        if (drawable != null) {
            drawable.setState(z3 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void B() {
        int[] iArr = this.q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void C() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.q;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.g0 && this.S != null) {
            double textSize = (double) searchAutoComplete.getTextSize();
            Double.isNaN(textSize);
            Double.isNaN(textSize);
            int i2 = (int) (textSize * 1.25d);
            this.S.setBounds(0, 0, i2, i2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.S), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void D() {
        int i2 = 0;
        if (!((this.j0 || this.o0) && !this.h0) || !(this.v.getVisibility() == 0 || this.x.getVisibility() == 0)) {
            i2 = 8;
        }
        this.t.setVisibility(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r2.o0 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.j0
            r1 = 0
            if (r0 == 0) goto L_0x0021
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.o0
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.h0
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.o0
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r3 = r2.v
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.E(boolean):void");
    }

    public final void F(boolean z2) {
        this.h0 = z2;
        int i2 = 0;
        int i3 = z2 ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.q.getText());
        this.u.setVisibility(i3);
        E(z3);
        this.r.setVisibility(z2 ? 8 : 0);
        if (this.R.getDrawable() == null || this.g0) {
            i2 = 8;
        }
        this.R.setVisibility(i2);
        A();
        G(!z3);
        D();
    }

    public final void G(boolean z2) {
        int i2 = 8;
        if (this.o0 && !this.h0 && z2) {
            this.v.setVisibility(8);
            i2 = 0;
        }
        this.x.setVisibility(i2);
    }

    public void c() {
        if (!this.r0) {
            this.r0 = true;
            int imeOptions = this.q.getImeOptions();
            this.s0 = imeOptions;
            this.q.setImeOptions(imeOptions | 33554432);
            this.q.setText("");
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.m0 = true;
        super.clearFocus();
        this.q.clearFocus();
        this.q.setImeVisibility(false);
        this.m0 = false;
    }

    public void d() {
        this.q.setText("");
        SearchAutoComplete searchAutoComplete = this.q;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.q0 = "";
        clearFocus();
        F(true);
        this.q.setImeOptions(this.s0);
        this.r0 = false;
    }

    public int getImeOptions() {
        return this.q.getImeOptions();
    }

    public int getInputType() {
        return this.q.getInputType();
    }

    public int getMaxWidth() {
        return this.n0;
    }

    public CharSequence getQuery() {
        return this.q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.k0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.t0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.a0 : getContext().getText(this.t0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.U;
    }

    public int getSuggestionRowLayout() {
        return this.T;
    }

    public e.f.a.a getSuggestionsAdapter() {
        return this.i0;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.v0);
        post(this.w0);
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            SearchAutoComplete searchAutoComplete = this.q;
            Rect rect = this.A;
            searchAutoComplete.getLocationInWindow(this.C);
            getLocationInWindow(this.Q);
            int[] iArr = this.C;
            int i6 = iArr[1];
            int[] iArr2 = this.Q;
            int i7 = i6 - iArr2[1];
            int i8 = iArr[0] - iArr2[0];
            rect.set(i8, i7, searchAutoComplete.getWidth() + i8, searchAutoComplete.getHeight() + i7);
            Rect rect2 = this.B;
            Rect rect3 = this.A;
            rect2.set(rect3.left, 0, rect3.right, i5 - i3);
            o oVar = this.z;
            if (oVar == null) {
                o oVar2 = new o(this.B, this.A, this.q);
                this.z = oVar2;
                setTouchDelegate(oVar2);
                return;
            }
            oVar.a(this.B, this.A);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0 <= 0) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.h0
            if (r0 == 0) goto L_0x0008
            super.onMeasure(r4, r5)
            return
        L_0x0008:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002a
            if (r0 == 0) goto L_0x0020
            if (r0 == r2) goto L_0x001b
            goto L_0x0037
        L_0x001b:
            int r0 = r3.n0
            if (r0 <= 0) goto L_0x0037
            goto L_0x002e
        L_0x0020:
            int r4 = r3.n0
            if (r4 <= 0) goto L_0x0025
            goto L_0x0037
        L_0x0025:
            int r4 = r3.getPreferredWidth()
            goto L_0x0037
        L_0x002a:
            int r0 = r3.n0
            if (r0 <= 0) goto L_0x002f
        L_0x002e:
            goto L_0x0033
        L_0x002f:
            int r0 = r3.getPreferredWidth()
        L_0x0033:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0037:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x0049
            if (r0 == 0) goto L_0x0044
            goto L_0x0051
        L_0x0044:
            int r5 = r3.getPreferredHeight()
            goto L_0x0051
        L_0x0049:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0051:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        F(savedState.b);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.b = this.h0;
        return savedState;
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.v0);
    }

    public final Intent p(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.q0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.u0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.t0.getSearchActivity());
        return intent;
    }

    public final Intent q(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.u0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i2 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i2 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i2);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public void r() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.q.refreshAutoCompleteResults();
            return;
        }
        n nVar = E0;
        SearchAutoComplete searchAutoComplete = this.q;
        Objects.requireNonNull(nVar);
        n.a();
        Method method = nVar.a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        n nVar2 = E0;
        SearchAutoComplete searchAutoComplete2 = this.q;
        Objects.requireNonNull(nVar2);
        n.a();
        Method method2 = nVar2.b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public boolean requestFocus(int i2, Rect rect) {
        if (this.m0 || !isFocusable()) {
            return false;
        }
        if (this.h0) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.q.requestFocus(i2, rect);
        if (requestFocus) {
            F(false);
        }
        return requestFocus;
    }

    public void s(int i2, String str, String str2) {
        getContext().startActivity(p("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i2, (String) null));
    }

    public void setAppSearchData(Bundle bundle) {
        this.u0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            t();
        } else {
            x();
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.g0 != z2) {
            this.g0 = z2;
            F(z2);
            C();
        }
    }

    public void setImeOptions(int i2) {
        this.q.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.q.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.n0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.c0 = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.d0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.b0 = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f0 = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.e0 = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.k0 = charSequence;
        C();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.l0 = z2;
        e.f.a.a aVar = this.i0;
        if (aVar instanceof r0) {
            ((r0) aVar).r = z2 ? 2 : 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.t0 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r7 == 0) goto L_0x006e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.q
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.q
            android.app.SearchableInfo r3 = r6.t0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.t0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L_0x0036
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.t0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L_0x0036
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L_0x0036:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.q
            r3.setInputType(r7)
            e.f.a.a r7 = r6.i0
            if (r7 == 0) goto L_0x0042
            r7.b(r2)
        L_0x0042:
            android.app.SearchableInfo r7 = r6.t0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L_0x006b
            e.b.h.r0 r7 = new e.b.h.r0
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.t0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.x0
            r7.<init>(r3, r6, r4, r5)
            r6.i0 = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.q
            r3.setAdapter(r7)
            e.f.a.a r7 = r6.i0
            e.b.h.r0 r7 = (e.b.h.r0) r7
            boolean r3 = r6.l0
            if (r3 == 0) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = 1
        L_0x0069:
            r7.r = r3
        L_0x006b:
            r6.C()
        L_0x006e:
            android.app.SearchableInfo r7 = r6.t0
            r3 = 0
            if (r7 == 0) goto L_0x009f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L_0x009f
            android.app.SearchableInfo r7 = r6.t0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L_0x0084
            android.content.Intent r2 = r6.V
            goto L_0x008e
        L_0x0084:
            android.app.SearchableInfo r7 = r6.t0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L_0x008e
            android.content.Intent r2 = r6.W
        L_0x008e:
            if (r2 == 0) goto L_0x009f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r0 = 0
        L_0x00a0:
            r6.o0 = r0
            if (r0 == 0) goto L_0x00ab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.q
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        L_0x00ab:
            boolean r7 = r6.h0
            r6.F(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.j0 = z2;
        F(this.h0);
    }

    public void setSuggestionsAdapter(e.f.a.a aVar) {
        this.i0 = aVar;
        this.q.setAdapter(aVar);
    }

    public void t() {
        if (!TextUtils.isEmpty(this.q.getText())) {
            this.q.setText("");
            this.q.requestFocus();
            this.q.setImeVisibility(true);
        } else if (this.g0) {
            k kVar = this.c0;
            if (kVar == null || !kVar.a()) {
                clearFocus();
                F(true);
            }
        }
    }

    public boolean u(int i2) {
        int i3;
        String h2;
        m mVar = this.e0;
        if (mVar != null && mVar.b(i2)) {
            return false;
        }
        Cursor cursor = this.i0.f1383d;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intent = null;
            try {
                int i4 = r0.z;
                String h3 = r0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h3 == null) {
                    h3 = this.t0.getSuggestIntentAction();
                }
                if (h3 == null) {
                    h3 = "android.intent.action.SEARCH";
                }
                String str = h3;
                String h4 = r0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h4 == null) {
                    h4 = this.t0.getSuggestIntentData();
                }
                if (!(h4 == null || (h2 = r0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) == null)) {
                    h4 = h4 + "/" + Uri.encode(h2);
                }
                intent = p(str, h4 == null ? null : Uri.parse(h4), r0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), r0.h(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, (String) null);
            } catch (RuntimeException e2) {
                try {
                    i3 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i3 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e3);
                }
            }
        }
        this.q.setImeVisibility(false);
        this.q.dismissDropDown();
        return true;
    }

    public boolean v(int i2) {
        CharSequence c2;
        m mVar = this.e0;
        if (mVar != null && mVar.a(i2)) {
            return false;
        }
        Editable text = this.q.getText();
        Cursor cursor = this.i0.f1383d;
        if (cursor == null) {
            return true;
        }
        if (!cursor.moveToPosition(i2) || (c2 = this.i0.c(cursor)) == null) {
            setQuery(text);
            return true;
        }
        setQuery(c2);
        return true;
    }

    public void w(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void x() {
        F(false);
        this.q.requestFocus();
        this.q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void y() {
        Editable text = this.q.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            l lVar = this.b0;
            if (lVar == null || !lVar.b(text.toString())) {
                if (this.t0 != null) {
                    s(0, (String) null, text.toString());
                }
                this.q.setImeVisibility(false);
                this.q.dismissDropDown();
            }
        }
    }

    public boolean z(int i2, KeyEvent keyEvent) {
        if (this.t0 != null && this.i0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return u(this.q.getListSelection());
            }
            if (i2 == 21 || i2 == 22) {
                this.q.setSelection(i2 == 21 ? 0 : this.q.length());
                this.q.setListSelection(0);
                this.q.clearListSelection();
                this.q.a();
                return true;
            } else if (i2 != 19 || this.q.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }
}
