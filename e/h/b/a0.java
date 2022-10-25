package e.h.b;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentState;
import e.e.j.q;
import e.h.b.q0;
import e.k.e;
import e.k.y;
import e.k.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

public class a0 {
    public final v a;
    public final b0 b;
    public final Fragment c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1407d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f1408e = -1;

    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;

        public a(a0 a0Var, View view) {
            this.b = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            q.l(this.b);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public a0(v vVar, b0 b0Var, Fragment fragment) {
        this.a = vVar;
        this.b = b0Var;
        this.c = fragment;
    }

    public a0(v vVar, b0 b0Var, Fragment fragment, FragmentState fragmentState) {
        this.a = vVar;
        this.b = b0Var;
        this.c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.n;
        fragment.mSavedFragmentState = bundle == null ? new Bundle() : bundle;
    }

    public a0(v vVar, b0 b0Var, ClassLoader classLoader, s sVar, FragmentState fragmentState) {
        this.a = vVar;
        this.b = b0Var;
        Fragment a2 = sVar.a(classLoader, fragmentState.b);
        this.c = a2;
        Bundle bundle = fragmentState.f227k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.setArguments(fragmentState.f227k);
        a2.mWho = fragmentState.c;
        a2.mFromLayout = fragmentState.f220d;
        a2.mRestored = true;
        a2.mFragmentId = fragmentState.f221e;
        a2.mContainerId = fragmentState.f222f;
        a2.mTag = fragmentState.f223g;
        a2.mRetainInstance = fragmentState.f224h;
        a2.mRemoving = fragmentState.f225i;
        a2.mDetached = fragmentState.f226j;
        a2.mHidden = fragmentState.f228l;
        a2.mMaxState = e.b.values()[fragmentState.f229m];
        Bundle bundle2 = fragmentState.n;
        a2.mSavedFragmentState = bundle2 == null ? new Bundle() : bundle2;
        if (FragmentManager.N(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public void a() {
        if (FragmentManager.N(3)) {
            StringBuilder i2 = g.a.a.a.a.i("moveto ACTIVITY_CREATED: ");
            i2.append(this.c);
            Log.d("FragmentManager", i2.toString());
        }
        Fragment fragment = this.c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        v vVar = this.a;
        Fragment fragment2 = this.c;
        vVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    public void b() {
        View view;
        View view2;
        b0 b0Var = this.b;
        Fragment fragment = this.c;
        Objects.requireNonNull(b0Var);
        ViewGroup viewGroup = fragment.mContainer;
        int i2 = -1;
        if (viewGroup != null) {
            int indexOf = b0Var.a.indexOf(fragment);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= b0Var.a.size()) {
                            break;
                        }
                        Fragment fragment2 = b0Var.a.get(indexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            i2 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = b0Var.a.get(i3);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        i2 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        Fragment fragment4 = this.c;
        fragment4.mContainer.addView(fragment4.mView, i2);
    }

    public void c() {
        if (FragmentManager.N(3)) {
            StringBuilder i2 = g.a.a.a.a.i("moveto ATTACHED: ");
            i2.append(this.c);
            Log.d("FragmentManager", i2.toString());
        }
        Fragment fragment = this.c;
        Fragment fragment2 = fragment.mTarget;
        a0 a0Var = null;
        if (fragment2 != null) {
            a0 h2 = this.b.h(fragment2.mWho);
            if (h2 != null) {
                Fragment fragment3 = this.c;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                a0Var = h2;
            } else {
                StringBuilder i3 = g.a.a.a.a.i("Fragment ");
                i3.append(this.c);
                i3.append(" declared target fragment ");
                i3.append(this.c.mTarget);
                i3.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(i3.toString());
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (a0Var = this.b.h(str)) == null) {
                StringBuilder i4 = g.a.a.a.a.i("Fragment ");
                i4.append(this.c);
                i4.append(" declared target fragment ");
                throw new IllegalStateException(g.a.a.a.a.f(i4, this.c.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (a0Var != null) {
            a0Var.k();
        }
        Fragment fragment4 = this.c;
        FragmentManager fragmentManager = fragment4.mFragmentManager;
        fragment4.mHost = fragmentManager.q;
        fragment4.mParentFragment = fragmentManager.s;
        this.a.g(fragment4, false);
        this.c.performAttach();
        this.a.b(this.c, false);
    }

    public int d() {
        q0.d dVar;
        q0.d.b bVar;
        Fragment fragment = this.c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i2 = this.f1408e;
        int ordinal = fragment.mMaxState.ordinal();
        if (ordinal == 1) {
            i2 = Math.min(i2, 0);
        } else if (ordinal == 2) {
            i2 = Math.min(i2, 1);
        } else if (ordinal == 3) {
            i2 = Math.min(i2, 5);
        } else if (ordinal != 4) {
            i2 = Math.min(i2, -1);
        }
        Fragment fragment2 = this.c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                i2 = Math.max(this.f1408e, 2);
                View view = this.c.mView;
                if (view != null && view.getParent() == null) {
                    i2 = Math.min(i2, 2);
                }
            } else {
                i2 = this.f1408e < 4 ? Math.min(i2, fragment2.mState) : Math.min(i2, 1);
            }
        }
        if (!this.c.mAdded) {
            i2 = Math.min(i2, 1);
        }
        Fragment fragment3 = this.c;
        ViewGroup viewGroup = fragment3.mContainer;
        q0.d.b bVar2 = null;
        if (viewGroup != null) {
            q0 f2 = q0.f(viewGroup, fragment3.getParentFragmentManager());
            Objects.requireNonNull(f2);
            q0.d d2 = f2.d(this.c);
            if (d2 != null) {
                bVar = d2.b;
            } else {
                Fragment fragment4 = this.c;
                Iterator<q0.d> it = f2.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        dVar = null;
                        break;
                    }
                    dVar = it.next();
                    if (dVar.c.equals(fragment4) && !dVar.f1497f) {
                        break;
                    }
                }
                if (dVar != null) {
                    bVar = dVar.b;
                }
            }
            bVar2 = bVar;
        }
        if (bVar2 == q0.d.b.ADDING) {
            i2 = Math.min(i2, 6);
        } else if (bVar2 == q0.d.b.REMOVING) {
            i2 = Math.max(i2, 3);
        } else {
            Fragment fragment5 = this.c;
            if (fragment5.mRemoving) {
                i2 = fragment5.isInBackStack() ? Math.min(i2, 1) : Math.min(i2, -1);
            }
        }
        Fragment fragment6 = this.c;
        if (fragment6.mDeferStart && fragment6.mState < 5) {
            i2 = Math.min(i2, 4);
        }
        if (FragmentManager.N(2)) {
            StringBuilder j2 = g.a.a.a.a.j("computeExpectedState() of ", i2, " for ");
            j2.append(this.c);
            Log.v("FragmentManager", j2.toString());
        }
        return i2;
    }

    public void e() {
        if (FragmentManager.N(3)) {
            StringBuilder i2 = g.a.a.a.a.i("moveto CREATED: ");
            i2.append(this.c);
            Log.d("FragmentManager", i2.toString());
        }
        Fragment fragment = this.c;
        if (!fragment.mIsCreated) {
            this.a.h(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.c;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            v vVar = this.a;
            Fragment fragment3 = this.c;
            vVar.c(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.c.mState = 1;
    }

    public void f() {
        String str;
        if (!this.c.mFromLayout) {
            if (FragmentManager.N(3)) {
                StringBuilder i2 = g.a.a.a.a.i("moveto CREATE_VIEW: ");
                i2.append(this.c);
                Log.d("FragmentManager", i2.toString());
            }
            Fragment fragment = this.c;
            LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
            ViewGroup viewGroup = null;
            Fragment fragment2 = this.c;
            ViewGroup viewGroup2 = fragment2.mContainer;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i3 = fragment2.mContainerId;
                if (i3 != 0) {
                    if (i3 != -1) {
                        viewGroup = (ViewGroup) fragment2.mFragmentManager.r.c(i3);
                        if (viewGroup == null) {
                            Fragment fragment3 = this.c;
                            if (!fragment3.mRestored) {
                                try {
                                    str = fragment3.getResources().getResourceName(this.c.mContainerId);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                StringBuilder i4 = g.a.a.a.a.i("No view found for id 0x");
                                i4.append(Integer.toHexString(this.c.mContainerId));
                                i4.append(" (");
                                i4.append(str);
                                i4.append(") for fragment ");
                                i4.append(this.c);
                                throw new IllegalArgumentException(i4.toString());
                            }
                        }
                    } else {
                        StringBuilder i5 = g.a.a.a.a.i("Cannot create fragment ");
                        i5.append(this.c);
                        i5.append(" for a container view with no id");
                        throw new IllegalArgumentException(i5.toString());
                    }
                }
            }
            Fragment fragment4 = this.c;
            fragment4.mContainer = viewGroup;
            fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
            View view = this.c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment5 = this.c;
                fragment5.mView.setTag(2131296889, fragment5);
                if (viewGroup != null) {
                    b();
                }
                Fragment fragment6 = this.c;
                if (fragment6.mHidden) {
                    fragment6.mView.setVisibility(8);
                }
                View view2 = this.c.mView;
                WeakHashMap<View, String> weakHashMap = q.a;
                if (view2.isAttachedToWindow()) {
                    q.l(this.c.mView);
                } else {
                    View view3 = this.c.mView;
                    view3.addOnAttachStateChangeListener(new a(this, view3));
                }
                this.c.performViewCreated();
                v vVar = this.a;
                Fragment fragment7 = this.c;
                vVar.m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
                int visibility = this.c.mView.getVisibility();
                this.c.setPostOnViewCreatedAlpha(this.c.mView.getAlpha());
                Fragment fragment8 = this.c;
                if (fragment8.mContainer != null && visibility == 0) {
                    View findFocus = fragment8.mView.findFocus();
                    if (findFocus != null) {
                        this.c.setFocusedView(findFocus);
                        if (FragmentManager.N(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.c);
                        }
                    }
                    this.c.mView.setAlpha(0.0f);
                }
            }
            this.c.mState = 2;
        }
    }

    public void g() {
        Fragment d2;
        if (FragmentManager.N(3)) {
            StringBuilder i2 = g.a.a.a.a.i("movefrom CREATED: ");
            i2.append(this.c);
            Log.d("FragmentManager", i2.toString());
        }
        Fragment fragment = this.c;
        boolean z = true;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        if (z2 || this.b.c.e(this.c)) {
            t<?> tVar = this.c.mHost;
            if (tVar instanceof z) {
                z = this.b.c.f1510g;
            } else {
                Context context = tVar.c;
                if (context instanceof Activity) {
                    z = true ^ ((Activity) context).isChangingConfigurations();
                }
            }
            if (z2 || z) {
                x xVar = this.b.c;
                Fragment fragment2 = this.c;
                Objects.requireNonNull(xVar);
                if (FragmentManager.N(3)) {
                    Log.d("FragmentManager", "Clearing non-config state for " + fragment2);
                }
                x xVar2 = xVar.f1507d.get(fragment2.mWho);
                if (xVar2 != null) {
                    xVar2.a();
                    xVar.f1507d.remove(fragment2.mWho);
                }
                y yVar = xVar.f1508e.get(fragment2.mWho);
                if (yVar != null) {
                    yVar.a();
                    xVar.f1508e.remove(fragment2.mWho);
                }
            }
            this.c.performDestroy();
            this.a.d(this.c, false);
            Iterator it = ((ArrayList) this.b.f()).iterator();
            while (it.hasNext()) {
                a0 a0Var = (a0) it.next();
                if (a0Var != null) {
                    Fragment fragment3 = a0Var.c;
                    if (this.c.mWho.equals(fragment3.mTargetWho)) {
                        fragment3.mTarget = this.c;
                        fragment3.mTargetWho = null;
                    }
                }
            }
            Fragment fragment4 = this.c;
            String str = fragment4.mTargetWho;
            if (str != null) {
                fragment4.mTarget = this.b.d(str);
            }
            this.b.k(this);
            return;
        }
        String str2 = this.c.mTargetWho;
        if (!(str2 == null || (d2 = this.b.d(str2)) == null || !d2.mRetainInstance)) {
            this.c.mTarget = d2;
        }
        this.c.mState = 0;
    }

    public void h() {
        View view;
        if (FragmentManager.N(3)) {
            StringBuilder i2 = g.a.a.a.a.i("movefrom CREATE_VIEW: ");
            i2.append(this.c);
            Log.d("FragmentManager", i2.toString());
        }
        Fragment fragment = this.c;
        ViewGroup viewGroup = fragment.mContainer;
        if (!(viewGroup == null || (view = fragment.mView) == null)) {
            viewGroup.removeView(view);
        }
        this.c.performDestroyView();
        this.a.n(this.c, false);
        Fragment fragment2 = this.c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.g(null);
        this.c.mInLayout = false;
    }

    public void i() {
        if (FragmentManager.N(3)) {
            StringBuilder i2 = g.a.a.a.a.i("movefrom ATTACHED: ");
            i2.append(this.c);
            Log.d("FragmentManager", i2.toString());
        }
        this.c.performDetach();
        boolean z = false;
        this.a.e(this.c, false);
        Fragment fragment = this.c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (z || this.b.c.e(this.c)) {
            if (FragmentManager.N(3)) {
                StringBuilder i3 = g.a.a.a.a.i("initState called for fragment: ");
                i3.append(this.c);
                Log.d("FragmentManager", i3.toString());
            }
            this.c.initState();
        }
    }

    public void j() {
        Fragment fragment = this.c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.N(3)) {
                StringBuilder i2 = g.a.a.a.a.i("moveto CREATE_VIEW: ");
                i2.append(this.c);
                Log.d("FragmentManager", i2.toString());
            }
            Fragment fragment2 = this.c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), (ViewGroup) null, this.c.mSavedFragmentState);
            View view = this.c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.c;
                fragment3.mView.setTag(2131296889, fragment3);
                Fragment fragment4 = this.c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.c.performViewCreated();
                v vVar = this.a;
                Fragment fragment5 = this.c;
                vVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.c.mState = 2;
            }
        }
    }

    public void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        q0.d.b bVar = q0.d.b.NONE;
        if (!this.f1407d) {
            boolean z = false;
            z = true;
            try {
                while (true) {
                    int d2 = d();
                    Fragment fragment = this.c;
                    int i2 = fragment.mState;
                    if (d2 != i2) {
                        if (d2 <= i2) {
                            switch (i2 - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    g();
                                    break;
                                case 1:
                                    h();
                                    this.c.mState = z ? 1 : 0;
                                    break;
                                case 2:
                                    fragment.mInLayout = z;
                                    fragment.mState = 2;
                                    break;
                                case 3:
                                    if (FragmentManager.N(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.c);
                                    }
                                    Fragment fragment2 = this.c;
                                    if (fragment2.mView != null && fragment2.mSavedViewState == null) {
                                        o();
                                    }
                                    Fragment fragment3 = this.c;
                                    if (!(fragment3.mView == null || (viewGroup2 = fragment3.mContainer) == null)) {
                                        q0 f2 = q0.f(viewGroup2, fragment3.getParentFragmentManager());
                                        Objects.requireNonNull(f2);
                                        if (FragmentManager.N(2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + this.c);
                                        }
                                        f2.a(q0.d.c.REMOVED, q0.d.b.REMOVING, this);
                                    }
                                    this.c.mState = 3;
                                    break;
                                case 4:
                                    q();
                                    break;
                                case 5:
                                    fragment.mState = 5;
                                    break;
                                case 6:
                                    l();
                                    break;
                            }
                        } else {
                            switch (i2 + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(fragment.mView == null || (viewGroup3 = fragment.mContainer) == null)) {
                                        q0 f3 = q0.f(viewGroup3, fragment.getParentFragmentManager());
                                        q0.d.c b2 = q0.d.c.b(this.c.mView.getVisibility());
                                        Objects.requireNonNull(f3);
                                        if (FragmentManager.N(2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + this.c);
                                        }
                                        f3.a(b2, q0.d.b.ADDING, this);
                                    }
                                    this.c.mState = 4;
                                    break;
                                case 5:
                                    p();
                                    break;
                                case 6:
                                    fragment.mState = 6;
                                    break;
                                case 7:
                                    n();
                                    break;
                            }
                        }
                    } else {
                        if (fragment.mHiddenChanged) {
                            if (!(fragment.mView == null || (viewGroup = fragment.mContainer) == null)) {
                                q0 f4 = q0.f(viewGroup, fragment.getParentFragmentManager());
                                if (this.c.mHidden) {
                                    Objects.requireNonNull(f4);
                                    if (FragmentManager.N(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + this.c);
                                    }
                                    f4.a(q0.d.c.GONE, bVar, this);
                                } else {
                                    Objects.requireNonNull(f4);
                                    if (FragmentManager.N(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + this.c);
                                    }
                                    f4.a(q0.d.c.VISIBLE, bVar, this);
                                }
                            }
                            Fragment fragment4 = this.c;
                            FragmentManager fragmentManager = fragment4.mFragmentManager;
                            if (fragmentManager != null && fragment4.mAdded && fragmentManager.O(fragment4)) {
                                fragmentManager.A = z;
                            }
                            Fragment fragment5 = this.c;
                            fragment5.mHiddenChanged = z;
                            fragment5.onHiddenChanged(fragment5.mHidden);
                        }
                        this.f1407d = z;
                        return;
                    }
                }
            } finally {
                this.f1407d = z;
            }
        } else if (FragmentManager.N(2)) {
            StringBuilder i3 = g.a.a.a.a.i("Ignoring re-entrant call to moveToExpectedState() for ");
            i3.append(this.c);
            Log.v("FragmentManager", i3.toString());
        }
    }

    public void l() {
        if (FragmentManager.N(3)) {
            StringBuilder i2 = g.a.a.a.a.i("movefrom RESUMED: ");
            i2.append(this.c);
            Log.d("FragmentManager", i2.toString());
        }
        this.c.performPause();
        this.a.f(this.c, false);
    }

    public void m(ClassLoader classLoader) {
        Bundle bundle = this.c.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.c;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.c;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
            Fragment fragment3 = this.c;
            fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
            Fragment fragment4 = this.c;
            if (fragment4.mTargetWho != null) {
                fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.c;
            Boolean bool = fragment5.mSavedUserVisibleHint;
            if (bool != null) {
                fragment5.mUserVisibleHint = bool.booleanValue();
                this.c.mSavedUserVisibleHint = null;
            } else {
                fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.c;
            if (!fragment6.mUserVisibleHint) {
                fragment6.mDeferStart = true;
            }
        }
    }

    public void n() {
        if (FragmentManager.N(3)) {
            StringBuilder i2 = g.a.a.a.a.i("moveto RESUMED: ");
            i2.append(this.c);
            Log.d("FragmentManager", i2.toString());
        }
        View focusedView = this.c.getFocusedView();
        if (focusedView != null) {
            boolean z = true;
            if (focusedView != this.c.mView) {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent == null) {
                        z = false;
                        break;
                    } else if (parent == this.c.mView) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            if (z) {
                boolean requestFocus = focusedView.requestFocus();
                if (FragmentManager.N(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("requestFocus: Restoring focused view ");
                    sb.append(focusedView);
                    sb.append(" ");
                    sb.append(requestFocus ? "succeeded" : "failed");
                    sb.append(" on Fragment ");
                    sb.append(this.c);
                    sb.append(" resulting in focused view ");
                    sb.append(this.c.mView.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            }
        }
        this.c.setFocusedView((View) null);
        this.c.performResume();
        this.a.i(this.c, false);
        Fragment fragment = this.c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public void o() {
        if (this.c.mView != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.c.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.c.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.c.mViewLifecycleOwner.f1489d.b(bundle);
            if (!bundle.isEmpty()) {
                this.c.mSavedViewRegistryState = bundle;
            }
        }
    }

    public void p() {
        if (FragmentManager.N(3)) {
            StringBuilder i2 = g.a.a.a.a.i("moveto STARTED: ");
            i2.append(this.c);
            Log.d("FragmentManager", i2.toString());
        }
        this.c.performStart();
        this.a.k(this.c, false);
    }

    public void q() {
        if (FragmentManager.N(3)) {
            StringBuilder i2 = g.a.a.a.a.i("movefrom STARTED: ");
            i2.append(this.c);
            Log.d("FragmentManager", i2.toString());
        }
        this.c.performStop();
        this.a.l(this.c, false);
    }
}
