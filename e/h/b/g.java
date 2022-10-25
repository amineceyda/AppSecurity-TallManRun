package e.h.b;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import e.h.b.c0;
import e.k.h;
import e.k.n;
import java.util.Objects;

public class g extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler b;
    public Runnable c = new a();

    /* renamed from: d  reason: collision with root package name */
    public DialogInterface.OnCancelListener f1436d = new b();

    /* renamed from: e  reason: collision with root package name */
    public DialogInterface.OnDismissListener f1437e = new c();

    /* renamed from: f  reason: collision with root package name */
    public int f1438f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f1439g = 0;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1440h = true;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1441i = true;

    /* renamed from: j  reason: collision with root package name */
    public int f1442j = -1;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1443k;

    /* renamed from: l  reason: collision with root package name */
    public n<h> f1444l = new d();

    /* renamed from: m  reason: collision with root package name */
    public Dialog f1445m;
    public boolean n;
    public boolean o;
    public boolean p = false;

    public class a implements Runnable {
        public a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            g gVar = g.this;
            gVar.f1437e.onDismiss(gVar.f1445m);
        }
    }

    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            g gVar = g.this;
            Dialog dialog = gVar.f1445m;
            if (dialog != null) {
                gVar.onCancel(dialog);
            }
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            g gVar = g.this;
            Dialog dialog = gVar.f1445m;
            if (dialog != null) {
                gVar.onDismiss(dialog);
            }
        }
    }

    public class d implements n<h> {
        public d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void a(Object obj) {
            if (((h) obj) != null) {
                g gVar = g.this;
                if (gVar.f1441i) {
                    View requireView = gVar.requireView();
                    if (requireView.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    } else if (g.this.f1445m != null) {
                        if (FragmentManager.N(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + g.this.f1445m);
                        }
                        g.this.f1445m.setContentView(requireView);
                    }
                }
            }
        }
    }

    public class e extends p {
        public final /* synthetic */ p a;

        public e(p pVar) {
            this.a = pVar;
        }

        public View c(int i2) {
            if (this.a.d()) {
                return this.a.c(i2);
            }
            Dialog dialog = g.this.f1445m;
            if (dialog != null) {
                return dialog.findViewById(i2);
            }
            return null;
        }

        public boolean d() {
            return this.a.d() || g.this.p;
        }
    }

    public Dialog a() {
        if (FragmentManager.N(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(requireContext(), this.f1439g);
    }

    public p createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        LiveData<h> viewLifecycleOwnerLiveData = getViewLifecycleOwnerLiveData();
        n<h> nVar = this.f1444l;
        Objects.requireNonNull(viewLifecycleOwnerLiveData);
        LiveData.a("observeForever");
        LiveData.a aVar = new LiveData.a(viewLifecycleOwnerLiveData, nVar);
        LiveData.b h2 = viewLifecycleOwnerLiveData.b.h(nVar, aVar);
        if (!(h2 instanceof LiveData.LifecycleBoundObserver)) {
            if (h2 == null) {
                aVar.h(true);
            }
            this.o = false;
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b = new Handler();
        this.f1441i = this.mContainerId == 0;
        if (bundle != null) {
            this.f1438f = bundle.getInt("android:style", 0);
            this.f1439g = bundle.getInt("android:theme", 0);
            this.f1440h = bundle.getBoolean("android:cancelable", true);
            this.f1441i = bundle.getBoolean("android:showsDialog", this.f1441i);
            this.f1442j = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f1445m;
        if (dialog != null) {
            this.n = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f1445m.dismiss();
            if (!this.o) {
                onDismiss(this.f1445m);
            }
            this.f1445m = null;
            this.p = false;
        }
    }

    public void onDetach() {
        super.onDetach();
        if (!this.o) {
            this.o = true;
        }
        getViewLifecycleOwnerLiveData().f(this.f1444l);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.n) {
            if (FragmentManager.N(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            if (!this.o) {
                this.o = true;
                Dialog dialog = this.f1445m;
                if (dialog != null) {
                    dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                    this.f1445m.dismiss();
                }
                this.n = true;
                if (this.f1442j >= 0) {
                    FragmentManager parentFragmentManager = getParentFragmentManager();
                    int i2 = this.f1442j;
                    Objects.requireNonNull(parentFragmentManager);
                    if (i2 >= 0) {
                        parentFragmentManager.A(new FragmentManager.l((String) null, i2, 1), false);
                        this.f1442j = -1;
                        return;
                    }
                    throw new IllegalArgumentException(g.a.a.a.a.q("Bad id: ", i2));
                }
                a aVar = new a(getParentFragmentManager());
                FragmentManager fragmentManager = this.mFragmentManager;
                if (fragmentManager == null || fragmentManager == aVar.p) {
                    aVar.b(new c0.a(3, this));
                    aVar.g(true);
                    return;
                }
                StringBuilder i3 = g.a.a.a.a.i("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
                i3.append(toString());
                i3.append(" is already attached to a FragmentManager.");
                throw new IllegalStateException(i3.toString());
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046 A[Catch:{ all -> 0x006b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.onGetLayoutInflater(r8)
            boolean r0 = r7.f1441i
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L_0x009b
            boolean r3 = r7.f1443k
            if (r3 == 0) goto L_0x0011
            goto L_0x009b
        L_0x0011:
            if (r0 != 0) goto L_0x0014
            goto L_0x006f
        L_0x0014:
            boolean r0 = r7.p
            if (r0 != 0) goto L_0x006f
            r0 = 0
            r3 = 1
            r7.f1443k = r3     // Catch:{ all -> 0x006b }
            android.app.Dialog r4 = r7.a()     // Catch:{ all -> 0x006b }
            r7.f1445m = r4     // Catch:{ all -> 0x006b }
            boolean r5 = r7.f1441i     // Catch:{ all -> 0x006b }
            if (r5 == 0) goto L_0x0065
            int r5 = r7.f1438f     // Catch:{ all -> 0x006b }
            if (r5 == r3) goto L_0x003b
            if (r5 == r2) goto L_0x003b
            r6 = 3
            if (r5 == r6) goto L_0x0030
            goto L_0x003e
        L_0x0030:
            android.view.Window r5 = r4.getWindow()     // Catch:{ all -> 0x006b }
            if (r5 == 0) goto L_0x003b
            r6 = 24
            r5.addFlags(r6)     // Catch:{ all -> 0x006b }
        L_0x003b:
            r4.requestWindowFeature(r3)     // Catch:{ all -> 0x006b }
        L_0x003e:
            android.content.Context r4 = r7.getContext()     // Catch:{ all -> 0x006b }
            boolean r5 = r4 instanceof android.app.Activity     // Catch:{ all -> 0x006b }
            if (r5 == 0) goto L_0x004d
            android.app.Dialog r5 = r7.f1445m     // Catch:{ all -> 0x006b }
            android.app.Activity r4 = (android.app.Activity) r4     // Catch:{ all -> 0x006b }
            r5.setOwnerActivity(r4)     // Catch:{ all -> 0x006b }
        L_0x004d:
            android.app.Dialog r4 = r7.f1445m     // Catch:{ all -> 0x006b }
            boolean r5 = r7.f1440h     // Catch:{ all -> 0x006b }
            r4.setCancelable(r5)     // Catch:{ all -> 0x006b }
            android.app.Dialog r4 = r7.f1445m     // Catch:{ all -> 0x006b }
            android.content.DialogInterface$OnCancelListener r5 = r7.f1436d     // Catch:{ all -> 0x006b }
            r4.setOnCancelListener(r5)     // Catch:{ all -> 0x006b }
            android.app.Dialog r4 = r7.f1445m     // Catch:{ all -> 0x006b }
            android.content.DialogInterface$OnDismissListener r5 = r7.f1437e     // Catch:{ all -> 0x006b }
            r4.setOnDismissListener(r5)     // Catch:{ all -> 0x006b }
            r7.p = r3     // Catch:{ all -> 0x006b }
            goto L_0x0068
        L_0x0065:
            r3 = 0
            r7.f1445m = r3     // Catch:{ all -> 0x006b }
        L_0x0068:
            r7.f1443k = r0
            goto L_0x006f
        L_0x006b:
            r8 = move-exception
            r7.f1443k = r0
            throw r8
        L_0x006f:
            boolean r0 = androidx.fragment.app.FragmentManager.N(r2)
            if (r0 == 0) goto L_0x008e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "get layout inflater for DialogFragment "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r2 = " from dialog context"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L_0x008e:
            android.app.Dialog r0 = r7.f1445m
            if (r0 == 0) goto L_0x009a
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r0)
        L_0x009a:
            return r8
        L_0x009b:
            boolean r0 = androidx.fragment.app.FragmentManager.N(r2)
            if (r0 == 0) goto L_0x00d2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r2 = r7.f1441i
            if (r2 != 0) goto L_0x00be
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mShowsDialog = false: "
            goto L_0x00c5
        L_0x00be:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mCreatingDialog = true: "
        L_0x00c5:
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
        L_0x00d2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.b.g.onGetLayoutInflater(android.os.Bundle):android.view.LayoutInflater");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f1445m;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i2 = this.f1438f;
        if (i2 != 0) {
            bundle.putInt("android:style", i2);
        }
        int i3 = this.f1439g;
        if (i3 != 0) {
            bundle.putInt("android:theme", i3);
        }
        boolean z = this.f1440h;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f1441i;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i4 = this.f1442j;
        if (i4 != -1) {
            bundle.putInt("android:backStackId", i4);
        }
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = this.f1445m;
        if (dialog != null) {
            this.n = false;
            dialog.show();
            View decorView = this.f1445m.getWindow().getDecorView();
            decorView.setTag(2131297878, this);
            decorView.setTag(2131297880, this);
            decorView.setTag(2131297879, this);
        }
    }

    public void onStop() {
        super.onStop();
        Dialog dialog = this.f1445m;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f1445m != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f1445m.onRestoreInstanceState(bundle2);
        }
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView == null && this.f1445m != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f1445m.onRestoreInstanceState(bundle2);
        }
    }
}
