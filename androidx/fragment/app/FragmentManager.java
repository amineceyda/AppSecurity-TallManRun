package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.Fragment;
import e.h.b.a0;
import e.h.b.b0;
import e.h.b.c0;
import e.h.b.j0;
import e.h.b.p;
import e.h.b.p0;
import e.h.b.q;
import e.h.b.q0;
import e.h.b.r0;
import e.h.b.s;
import e.h.b.t;
import e.h.b.u;
import e.h.b.v;
import e.h.b.x;
import e.h.b.y;
import e.k.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class FragmentManager {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public ArrayList<e.h.b.a> F;
    public ArrayList<Boolean> G;
    public ArrayList<Fragment> H;
    public ArrayList<m> I;
    public x J;
    public Runnable K = new g();
    public final ArrayList<k> a = new ArrayList<>();
    public boolean b;
    public final b0 c = new b0();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<e.h.b.a> f204d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<Fragment> f205e;

    /* renamed from: f  reason: collision with root package name */
    public final u f206f = new u(this);

    /* renamed from: g  reason: collision with root package name */
    public OnBackPressedDispatcher f207g;

    /* renamed from: h  reason: collision with root package name */
    public final e.a.b f208h = new c(false);

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f209i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, Bundle> f210j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, Object> f211k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    public Map<Fragment, HashSet<e.e.f.a>> f212l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m  reason: collision with root package name */
    public final j0.a f213m = new d();
    public final v n = new v(this);
    public final CopyOnWriteArrayList<y> o = new CopyOnWriteArrayList<>();
    public int p = -1;
    public t<?> q;
    public p r;
    public Fragment s;
    public Fragment t;
    public s u = new e();
    public r0 v = new f(this);
    public e.a.e.b<Intent> w;
    public e.a.e.b<IntentSenderRequest> x;
    public e.a.e.b<String[]> y;
    public ArrayDeque<LaunchedFragmentInfo> z = new ArrayDeque<>();

    /* renamed from: androidx.fragment.app.FragmentManager$6  reason: invalid class name */
    public class AnonymousClass6 implements e.k.f {
        public void d(e.k.h hVar, e.a aVar) {
            if (aVar == e.a.ON_START) {
                throw null;
            } else if (aVar == e.a.ON_DESTROY) {
                throw null;
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();
        public String b;
        public int c;

        public class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            public Object[] newArray(int i2) {
                return new LaunchedFragmentInfo[i2];
            }
        }

        public LaunchedFragmentInfo(Parcel parcel) {
            this.b = parcel.readString();
            this.c = parcel.readInt();
        }

        public LaunchedFragmentInfo(String str, int i2) {
            this.b = str;
            this.c = i2;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.b);
            parcel.writeInt(this.c);
        }
    }

    public class a implements e.a.e.a<ActivityResult> {
        public a() {
        }

        public void a(Object obj) {
            StringBuilder sb;
            ActivityResult activityResult = (ActivityResult) obj;
            LaunchedFragmentInfo pollFirst = FragmentManager.this.z.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder();
                sb.append("No IntentSenders were started for ");
                sb.append(this);
            } else {
                String str = pollFirst.b;
                int i2 = pollFirst.c;
                Fragment e2 = FragmentManager.this.c.e(str);
                if (e2 == null) {
                    sb = new StringBuilder();
                    sb.append("Intent Sender result delivered for unknown Fragment ");
                    sb.append(str);
                } else {
                    e2.onActivityResult(i2, activityResult.b(), activityResult.a());
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    public class b implements e.a.e.a<Map<String, Boolean>> {
        public b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void a(Object obj) {
            StringBuilder sb;
            Map map = (Map) obj;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.z.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
            } else {
                String str = pollFirst.b;
                int i3 = pollFirst.c;
                Fragment e2 = FragmentManager.this.c.e(str);
                if (e2 == null) {
                    sb = g.a.a.a.a.l("Permission request result delivered for unknown Fragment ", str);
                } else {
                    e2.onRequestPermissionsResult(i3, strArr, iArr);
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    public class c extends e.a.b {
        public c(boolean z) {
            super(z);
        }

        public void a() {
            FragmentManager fragmentManager = FragmentManager.this;
            fragmentManager.C(true);
            if (fragmentManager.f208h.a) {
                fragmentManager.X();
            } else {
                fragmentManager.f207g.a();
            }
        }
    }

    public class d implements j0.a {
        public d() {
        }

        public void a(Fragment fragment, e.e.f.a aVar) {
            boolean z;
            synchronized (aVar) {
                z = aVar.a;
            }
            if (!z) {
                FragmentManager fragmentManager = FragmentManager.this;
                HashSet hashSet = fragmentManager.f212l.get(fragment);
                if (hashSet != null && hashSet.remove(aVar) && hashSet.isEmpty()) {
                    fragmentManager.f212l.remove(fragment);
                    if (fragment.mState < 5) {
                        fragmentManager.i(fragment);
                        fragmentManager.U(fragment, fragmentManager.p);
                    }
                }
            }
        }

        public void b(Fragment fragment, e.e.f.a aVar) {
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.f212l.get(fragment) == null) {
                fragmentManager.f212l.put(fragment, new HashSet());
            }
            fragmentManager.f212l.get(fragment).add(aVar);
        }
    }

    public class e extends s {
        public e() {
        }

        public Fragment a(ClassLoader classLoader, String str) {
            t<?> tVar = FragmentManager.this.q;
            Context context = tVar.c;
            Objects.requireNonNull(tVar);
            return Fragment.instantiate(context, str, (Bundle) null);
        }
    }

    public class f implements r0 {
        public f(FragmentManager fragmentManager) {
        }
    }

    public class g implements Runnable {
        public g() {
        }

        public void run() {
            FragmentManager.this.C(true);
        }
    }

    public class h implements y {
        public final /* synthetic */ Fragment b;

        public h(FragmentManager fragmentManager, Fragment fragment) {
            this.b = fragment;
        }

        public void a(FragmentManager fragmentManager, Fragment fragment) {
            this.b.onAttachFragment(fragment);
        }
    }

    public class i implements e.a.e.a<ActivityResult> {
        public i() {
        }

        public void a(Object obj) {
            StringBuilder sb;
            ActivityResult activityResult = (ActivityResult) obj;
            LaunchedFragmentInfo pollFirst = FragmentManager.this.z.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder();
                sb.append("No Activities were started for result for ");
                sb.append(this);
            } else {
                String str = pollFirst.b;
                int i2 = pollFirst.c;
                Fragment e2 = FragmentManager.this.c.e(str);
                if (e2 == null) {
                    sb = new StringBuilder();
                    sb.append("Activity result delivered for unknown Fragment ");
                    sb.append(str);
                } else {
                    e2.onActivityResult(i2, activityResult.b(), activityResult.a());
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    public static class j extends e.a.e.f.a<IntentSenderRequest, ActivityResult> {
        public /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
            return d((IntentSenderRequest) obj);
        }

        public Object c(int i2, Intent intent) {
            return new ActivityResult(i2, intent);
        }

        public Intent d(IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a = intentSenderRequest.a();
            if (!(a == null || (bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest(intentSenderRequest.d(), (Intent) null, intentSenderRequest.b(), intentSenderRequest.c());
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.N(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }
    }

    public interface k {
        boolean a(ArrayList<e.h.b.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    public class l implements k {
        public final int a;
        public final int b;

        public l(String str, int i2, int i3) {
            this.a = i2;
            this.b = i3;
        }

        public boolean a(ArrayList<e.h.b.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.t;
            if (fragment != null && this.a < 0 && fragment.getChildFragmentManager().X()) {
                return false;
            }
            return FragmentManager.this.Y(arrayList, arrayList2, (String) null, this.a, this.b);
        }
    }

    public static class m implements Fragment.k {
        public final boolean a;
        public final e.h.b.a b;
        public int c;

        public void a() {
            boolean z = this.c > 0;
            for (Fragment next : this.b.p.K()) {
                next.setOnStartEnterTransitionListener((Fragment.k) null);
                if (z && next.isPostponed()) {
                    next.startPostponedEnterTransition();
                }
            }
            e.h.b.a aVar = this.b;
            aVar.p.g(aVar, this.a, !z, true);
        }
    }

    public static boolean N(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    public void A(k kVar, boolean z2) {
        if (!z2) {
            if (this.q == null) {
                if (this.D) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (R()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            if (this.q != null) {
                this.a.add(kVar);
                d0();
            } else if (!z2) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public final void B(boolean z2) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.q == null) {
            if (this.D) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.q.f1504d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (z2 || !R()) {
            if (this.F == null) {
                this.F = new ArrayList<>();
                this.G = new ArrayList<>();
            }
            this.b = true;
            try {
                E((ArrayList<e.h.b.a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.b = false;
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean C(boolean z2) {
        boolean z3;
        B(z2);
        boolean z4 = false;
        while (true) {
            ArrayList<e.h.b.a> arrayList = this.F;
            ArrayList<Boolean> arrayList2 = this.G;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z3 = false;
                } else {
                    int size = this.a.size();
                    z3 = false;
                    for (int i2 = 0; i2 < size; i2++) {
                        z3 |= this.a.get(i2).a(arrayList, arrayList2);
                    }
                    this.a.clear();
                    this.q.f1504d.removeCallbacks(this.K);
                }
            }
            if (z3) {
                this.b = true;
                try {
                    a0(this.F, this.G);
                    e();
                    z4 = true;
                } catch (Throwable th) {
                    e();
                    throw th;
                }
            } else {
                k0();
                x();
                this.c.b();
                return z4;
            }
        }
        while (true) {
        }
    }

    public final void D(ArrayList<e.h.b.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ViewGroup viewGroup;
        int i4;
        int i5;
        ArrayList<e.h.b.a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i6 = i2;
        int i7 = i3;
        boolean z2 = arrayList3.get(i6).o;
        ArrayList<Fragment> arrayList5 = this.H;
        if (arrayList5 == null) {
            this.H = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.H.addAll(this.c.i());
        Fragment fragment = this.t;
        int i8 = i6;
        boolean z3 = false;
        while (true) {
            int i9 = 1;
            if (i8 < i7) {
                e.h.b.a aVar = arrayList3.get(i8);
                int i10 = 3;
                if (!arrayList4.get(i8).booleanValue()) {
                    ArrayList<Fragment> arrayList6 = this.H;
                    int i11 = 0;
                    while (i11 < aVar.a.size()) {
                        c0.a aVar2 = aVar.a.get(i11);
                        int i12 = aVar2.a;
                        if (i12 != i9) {
                            if (i12 == 2) {
                                Fragment fragment2 = aVar2.b;
                                int i13 = fragment2.mContainerId;
                                int size = arrayList6.size() - 1;
                                boolean z4 = false;
                                while (size >= 0) {
                                    Fragment fragment3 = arrayList6.get(size);
                                    if (fragment3.mContainerId != i13) {
                                        i5 = i13;
                                    } else if (fragment3 == fragment2) {
                                        i5 = i13;
                                        z4 = true;
                                    } else {
                                        if (fragment3 == fragment) {
                                            i5 = i13;
                                            aVar.a.add(i11, new c0.a(9, fragment3));
                                            i11++;
                                            fragment = null;
                                        } else {
                                            i5 = i13;
                                        }
                                        c0.a aVar3 = new c0.a(3, fragment3);
                                        aVar3.c = aVar2.c;
                                        aVar3.f1430e = aVar2.f1430e;
                                        aVar3.f1429d = aVar2.f1429d;
                                        aVar3.f1431f = aVar2.f1431f;
                                        aVar.a.add(i11, aVar3);
                                        arrayList6.remove(fragment3);
                                        i11++;
                                    }
                                    size--;
                                    ArrayList<Boolean> arrayList7 = arrayList2;
                                    i13 = i5;
                                }
                                if (z4) {
                                    aVar.a.remove(i11);
                                    i11--;
                                } else {
                                    i4 = 1;
                                    aVar2.a = 1;
                                    arrayList6.add(fragment2);
                                    i11 += i4;
                                    ArrayList<Boolean> arrayList8 = arrayList2;
                                    int i14 = i2;
                                    i9 = 1;
                                    i10 = 3;
                                }
                            } else if (i12 == i10 || i12 == 6) {
                                arrayList6.remove(aVar2.b);
                                Fragment fragment4 = aVar2.b;
                                if (fragment4 == fragment) {
                                    aVar.a.add(i11, new c0.a(9, fragment4));
                                    i11++;
                                    i4 = 1;
                                    fragment = null;
                                    i11 += i4;
                                    ArrayList<Boolean> arrayList82 = arrayList2;
                                    int i142 = i2;
                                    i9 = 1;
                                    i10 = 3;
                                }
                            } else if (i12 != 7) {
                                if (i12 == 8) {
                                    aVar.a.add(i11, new c0.a(9, fragment));
                                    i11++;
                                    fragment = aVar2.b;
                                }
                            }
                            i4 = 1;
                            i11 += i4;
                            ArrayList<Boolean> arrayList822 = arrayList2;
                            int i1422 = i2;
                            i9 = 1;
                            i10 = 3;
                        }
                        i4 = 1;
                        arrayList6.add(aVar2.b);
                        i11 += i4;
                        ArrayList<Boolean> arrayList8222 = arrayList2;
                        int i14222 = i2;
                        i9 = 1;
                        i10 = 3;
                    }
                } else {
                    int i15 = 1;
                    ArrayList<Fragment> arrayList9 = this.H;
                    int size2 = aVar.a.size() - 1;
                    while (size2 >= 0) {
                        c0.a aVar4 = aVar.a.get(size2);
                        int i16 = aVar4.a;
                        if (i16 != i15) {
                            if (i16 != 3) {
                                switch (i16) {
                                    case 6:
                                        break;
                                    case 7:
                                        break;
                                    case 8:
                                        fragment = null;
                                        break;
                                    case 9:
                                        fragment = aVar4.b;
                                        break;
                                    case 10:
                                        aVar4.f1433h = aVar4.f1432g;
                                        break;
                                }
                            }
                            arrayList9.add(aVar4.b);
                            size2--;
                            i15 = 1;
                        }
                        arrayList9.remove(aVar4.b);
                        size2--;
                        i15 = 1;
                    }
                }
                z3 = z3 || aVar.f1422g;
                i8++;
                arrayList4 = arrayList2;
                int i17 = i2;
            } else {
                this.H.clear();
                if (!z2 && this.p >= 1) {
                    for (int i18 = i2; i18 < i7; i18++) {
                        Iterator<c0.a> it = arrayList3.get(i18).a.iterator();
                        while (it.hasNext()) {
                            Fragment fragment5 = it.next().b;
                            if (!(fragment5 == null || fragment5.mFragmentManager == null)) {
                                this.c.j(h(fragment5));
                            }
                        }
                    }
                }
                int i19 = i2;
                while (i19 < i7) {
                    e.h.b.a aVar5 = arrayList3.get(i19);
                    if (arrayList2.get(i19).booleanValue()) {
                        aVar5.f(-1);
                        aVar5.j(i19 == i7 + -1);
                    } else {
                        aVar5.f(1);
                        aVar5.i();
                    }
                    i19++;
                }
                ArrayList<Boolean> arrayList10 = arrayList2;
                boolean booleanValue = arrayList10.get(i7 - 1).booleanValue();
                for (int i20 = i2; i20 < i7; i20++) {
                    e.h.b.a aVar6 = arrayList3.get(i20);
                    if (booleanValue) {
                        for (int size3 = aVar6.a.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment6 = aVar6.a.get(size3).b;
                            if (fragment6 != null) {
                                h(fragment6).k();
                            }
                        }
                    } else {
                        Iterator<c0.a> it2 = aVar6.a.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment7 = it2.next().b;
                            if (fragment7 != null) {
                                h(fragment7).k();
                            }
                        }
                    }
                }
                T(this.p, true);
                HashSet hashSet = new HashSet();
                for (int i21 = i2; i21 < i7; i21++) {
                    Iterator<c0.a> it3 = arrayList3.get(i21).a.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment8 = it3.next().b;
                        if (!(fragment8 == null || (viewGroup = fragment8.mContainer) == null)) {
                            hashSet.add(q0.g(viewGroup, L()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    q0 q0Var = (q0) it4.next();
                    q0Var.f1492d = booleanValue;
                    q0Var.h();
                    q0Var.c();
                }
                for (int i22 = i2; i22 < i7; i22++) {
                    e.h.b.a aVar7 = arrayList3.get(i22);
                    if (arrayList10.get(i22).booleanValue() && aVar7.r >= 0) {
                        aVar7.r = -1;
                    }
                    Objects.requireNonNull(aVar7);
                }
                return;
            }
        }
    }

    public final void E(ArrayList<e.h.b.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<m> arrayList3 = this.I;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            m mVar = this.I.get(i2);
            if (arrayList == null || mVar.a || (indexOf2 = arrayList.indexOf(mVar.b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if ((mVar.c == 0) || (arrayList != null && mVar.b.l(arrayList, 0, arrayList.size()))) {
                    this.I.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || mVar.a || (indexOf = arrayList.indexOf(mVar.b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        mVar.a();
                    }
                }
                i2++;
            } else {
                this.I.remove(i2);
                i2--;
                size--;
            }
            e.h.b.a aVar = mVar.b;
            aVar.p.g(aVar, mVar.a, false, false);
            i2++;
        }
    }

    public Fragment F(String str) {
        return this.c.d(str);
    }

    public Fragment G(int i2) {
        b0 b0Var = this.c;
        int size = b0Var.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = b0Var.a.get(size);
                if (fragment != null && fragment.mFragmentId == i2) {
                    return fragment;
                }
            } else {
                for (a0 next : b0Var.b.values()) {
                    if (next != null) {
                        Fragment fragment2 = next.c;
                        if (fragment2.mFragmentId == i2) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public Fragment H(String str) {
        b0 b0Var = this.c;
        Objects.requireNonNull(b0Var);
        if (str != null) {
            int size = b0Var.a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Fragment fragment = b0Var.a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (a0 next : b0Var.b.values()) {
                if (next != null) {
                    Fragment fragment2 = next.c;
                    if (str.equals(fragment2.mTag)) {
                        return fragment2;
                    }
                }
            }
        }
        return null;
    }

    public final ViewGroup I(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.r.d()) {
            View c2 = this.r.c(fragment.mContainerId);
            if (c2 instanceof ViewGroup) {
                return (ViewGroup) c2;
            }
        }
        return null;
    }

    public s J() {
        Fragment fragment = this.s;
        return fragment != null ? fragment.mFragmentManager.J() : this.u;
    }

    public List<Fragment> K() {
        return this.c.i();
    }

    public r0 L() {
        Fragment fragment = this.s;
        return fragment != null ? fragment.mFragmentManager.L() : this.v;
    }

    public void M(Fragment fragment) {
        if (N(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            h0(fragment);
        }
    }

    public final boolean O(Fragment fragment) {
        boolean z2;
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mChildFragmentManager;
        Iterator it = ((ArrayList) fragmentManager.c.g()).iterator();
        boolean z3 = false;
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null) {
                z3 = fragmentManager.O(fragment2);
                continue;
            }
            if (z3) {
                z2 = true;
                break;
            }
        }
        return z2;
    }

    public boolean P(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public boolean Q(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (!fragment.equals(fragmentManager.t) || !Q(fragmentManager.s)) {
            return false;
        }
        return true;
    }

    public boolean R() {
        return this.B || this.C;
    }

    public void S(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        Fragment fragment2 = fragment;
        int i6 = i2;
        Bundle bundle2 = bundle;
        if (this.x != null) {
            if (bundle2 != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (N(2)) {
                    Log.v("FragmentManager", "ActivityOptions " + bundle2 + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle2);
            } else {
                intent2 = intent;
            }
            IntentSender intentSender2 = intentSender;
            IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intentSender, intent2, i3, i4);
            this.z.addLast(new LaunchedFragmentInfo(fragment2.mWho, i2));
            if (N(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
            }
            this.x.a(intentSenderRequest);
            return;
        }
        IntentSender intentSender3 = intentSender;
        int i7 = i3;
        int i8 = i4;
        t<?> tVar = this.q;
        Objects.requireNonNull(tVar);
        if (i6 == -1) {
            Activity activity = tVar.b;
            int i9 = e.e.b.a.b;
            activity.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    public void T(int i2, boolean z2) {
        t<?> tVar;
        if (this.q == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.p) {
            this.p = i2;
            b0 b0Var = this.c;
            Iterator<Fragment> it = b0Var.a.iterator();
            while (it.hasNext()) {
                a0 a0Var = b0Var.b.get(it.next().mWho);
                if (a0Var != null) {
                    a0Var.k();
                }
            }
            Iterator<a0> it2 = b0Var.b.values().iterator();
            while (true) {
                boolean z3 = false;
                if (!it2.hasNext()) {
                    break;
                }
                a0 next = it2.next();
                if (next != null) {
                    next.k();
                    Fragment fragment = next.c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        z3 = true;
                    }
                    if (z3) {
                        b0Var.k(next);
                    }
                }
            }
            j0();
            if (this.A && (tVar = this.q) != null && this.p == 7) {
                tVar.j();
                this.A = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r1 != 5) goto L_0x01ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void U(androidx.fragment.app.Fragment r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r7 = r17
            e.h.b.b0 r1 = r0.c
            java.lang.String r2 = r7.mWho
            e.h.b.a0 r1 = r1.h(r2)
            r8 = 1
            if (r1 != 0) goto L_0x001a
            e.h.b.a0 r1 = new e.h.b.a0
            e.h.b.v r2 = r0.n
            e.h.b.b0 r3 = r0.c
            r1.<init>(r2, r3, r7)
            r1.f1408e = r8
        L_0x001a:
            r9 = r1
            boolean r1 = r7.mFromLayout
            r10 = 2
            if (r1 == 0) goto L_0x002f
            boolean r1 = r7.mInLayout
            if (r1 == 0) goto L_0x002f
            int r1 = r7.mState
            if (r1 != r10) goto L_0x002f
            r1 = r18
            int r1 = java.lang.Math.max(r1, r10)
            goto L_0x0031
        L_0x002f:
            r1 = r18
        L_0x0031:
            int r2 = r9.d()
            int r11 = java.lang.Math.min(r1, r2)
            int r1 = r7.mState
            r12 = 3
            java.lang.String r13 = "FragmentManager"
            r2 = -1
            r3 = 5
            r4 = 4
            if (r1 > r11) goto L_0x0085
            if (r1 >= r11) goto L_0x0050
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<e.e.f.a>> r1 = r0.f212l
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0050
            r16.d(r17)
        L_0x0050:
            int r1 = r7.mState
            if (r1 == r2) goto L_0x0060
            if (r1 == 0) goto L_0x0065
            if (r1 == r8) goto L_0x006a
            if (r1 == r10) goto L_0x0074
            if (r1 == r4) goto L_0x0079
            if (r1 == r3) goto L_0x007e
            goto L_0x01ba
        L_0x0060:
            if (r11 <= r2) goto L_0x0065
            r9.c()
        L_0x0065:
            if (r11 <= 0) goto L_0x006a
            r9.e()
        L_0x006a:
            if (r11 <= r2) goto L_0x006f
            r9.j()
        L_0x006f:
            if (r11 <= r8) goto L_0x0074
            r9.f()
        L_0x0074:
            if (r11 <= r10) goto L_0x0079
            r9.a()
        L_0x0079:
            if (r11 <= r4) goto L_0x007e
            r9.p()
        L_0x007e:
            if (r11 <= r3) goto L_0x01ba
            r9.n()
            goto L_0x01ba
        L_0x0085:
            if (r1 <= r11) goto L_0x01ba
            if (r1 == 0) goto L_0x01b3
            if (r1 == r8) goto L_0x01a3
            if (r1 == r10) goto L_0x00cf
            if (r1 == r4) goto L_0x00a0
            if (r1 == r3) goto L_0x009b
            r5 = 7
            if (r1 == r5) goto L_0x0096
            goto L_0x01ba
        L_0x0096:
            if (r11 >= r5) goto L_0x009b
            r9.l()
        L_0x009b:
            if (r11 >= r3) goto L_0x00a0
            r9.q()
        L_0x00a0:
            if (r11 >= r4) goto L_0x00cf
            boolean r1 = N(r12)
            if (r1 == 0) goto L_0x00bc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "movefrom ACTIVITY_CREATED: "
            r1.append(r3)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r13, r1)
        L_0x00bc:
            android.view.View r1 = r7.mView
            if (r1 == 0) goto L_0x00cf
            e.h.b.t<?> r1 = r0.q
            boolean r1 = r1.h(r7)
            if (r1 == 0) goto L_0x00cf
            android.util.SparseArray<android.os.Parcelable> r1 = r7.mSavedViewState
            if (r1 != 0) goto L_0x00cf
            r9.o()
        L_0x00cf:
            if (r11 >= r10) goto L_0x01a3
            r1 = 0
            android.view.View r3 = r7.mView
            if (r3 == 0) goto L_0x0198
            android.view.ViewGroup r4 = r7.mContainer
            if (r4 == 0) goto L_0x0198
            r4.endViewTransition(r3)
            android.view.View r3 = r7.mView
            r3.clearAnimation()
            boolean r3 = r17.isRemovingParent()
            if (r3 != 0) goto L_0x0198
            int r3 = r0.p
            r4 = 0
            if (r3 <= r2) goto L_0x010c
            boolean r2 = r0.D
            if (r2 != 0) goto L_0x010c
            android.view.View r2 = r7.mView
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x010c
            float r2 = r7.mPostponedAlpha
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x010c
            e.h.b.t<?> r1 = r0.q
            android.content.Context r1 = r1.c
            r2 = 0
            boolean r3 = r17.getPopDirection()
            e.h.b.n r1 = e.e.f.b.t(r1, r7, r2, r3)
        L_0x010c:
            r7.mPostponedAlpha = r4
            android.view.ViewGroup r14 = r7.mContainer
            android.view.View r15 = r7.mView
            if (r1 == 0) goto L_0x0166
            e.h.b.j0$a r2 = r0.f213m
            r14.startViewTransition(r15)
            e.e.f.a r6 = new e.e.f.a
            r6.<init>()
            e.h.b.k r3 = new e.h.b.k
            r3.<init>(r7)
            r6.b(r3)
            r5 = r2
            androidx.fragment.app.FragmentManager$d r5 = (androidx.fragment.app.FragmentManager.d) r5
            r5.b(r7, r6)
            android.view.animation.Animation r2 = r1.a
            if (r2 == 0) goto L_0x014a
            e.h.b.o r2 = new e.h.b.o
            android.view.animation.Animation r1 = r1.a
            r2.<init>(r1, r14, r15)
            android.view.View r1 = r7.mView
            r7.setAnimatingAway(r1)
            e.h.b.l r1 = new e.h.b.l
            r1.<init>(r14, r7, r5, r6)
            r2.setAnimationListener(r1)
            android.view.View r1 = r7.mView
            r1.startAnimation(r2)
            goto L_0x0166
        L_0x014a:
            android.animation.Animator r4 = r1.b
            r7.setAnimator(r4)
            e.h.b.m r3 = new e.h.b.m
            r1 = r3
            r2 = r14
            r12 = r3
            r3 = r15
            r8 = r4
            r4 = r17
            r1.<init>(r2, r3, r4, r5, r6)
            r8.addListener(r12)
            android.view.View r1 = r7.mView
            r8.setTarget(r1)
            r8.start()
        L_0x0166:
            r14.removeView(r15)
            boolean r1 = N(r10)
            if (r1 == 0) goto L_0x0193
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Removing view "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " for fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " from container "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r13, r1)
        L_0x0193:
            android.view.ViewGroup r1 = r7.mContainer
            if (r14 == r1) goto L_0x0198
            return
        L_0x0198:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<e.e.f.a>> r1 = r0.f212l
            java.lang.Object r1 = r1.get(r7)
            if (r1 != 0) goto L_0x01a3
            r9.h()
        L_0x01a3:
            r1 = 1
            if (r11 >= r1) goto L_0x01b3
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<e.e.f.a>> r2 = r0.f212l
            java.lang.Object r2 = r2.get(r7)
            if (r2 == 0) goto L_0x01b0
            r8 = 1
            goto L_0x01b4
        L_0x01b0:
            r9.g()
        L_0x01b3:
            r8 = r11
        L_0x01b4:
            if (r8 >= 0) goto L_0x01b9
            r9.i()
        L_0x01b9:
            r11 = r8
        L_0x01ba:
            int r1 = r7.mState
            if (r1 == r11) goto L_0x01ed
            r1 = 3
            boolean r1 = N(r1)
            if (r1 == 0) goto L_0x01eb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveToState: Fragment state for "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " not updated inline; expected state "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = " found "
            r1.append(r2)
            int r2 = r7.mState
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r13, r1)
        L_0x01eb:
            r7.mState = r11
        L_0x01ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.U(androidx.fragment.app.Fragment, int):void");
    }

    public void V() {
        if (this.q != null) {
            this.B = false;
            this.C = false;
            this.J.f1511h = false;
            for (Fragment next : this.c.i()) {
                if (next != null) {
                    next.noteStateNotSaved();
                }
            }
        }
    }

    public void W(a0 a0Var) {
        Fragment fragment = a0Var.c;
        if (!fragment.mDeferStart) {
            return;
        }
        if (this.b) {
            this.E = true;
            return;
        }
        fragment.mDeferStart = false;
        a0Var.k();
    }

    public boolean X() {
        C(false);
        B(true);
        Fragment fragment = this.t;
        if (fragment != null && fragment.getChildFragmentManager().X()) {
            return true;
        }
        boolean Y = Y(this.F, this.G, (String) null, -1, 0);
        if (Y) {
            this.b = true;
            try {
                a0(this.F, this.G);
            } finally {
                e();
            }
        }
        k0();
        x();
        this.c.b();
        return Y;
    }

    public boolean Y(ArrayList<e.h.b.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        ArrayList<e.h.b.a> arrayList3 = this.f204d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f204d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            int i4 = -1;
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    e.h.b.a aVar = this.f204d.get(size2);
                    if ((str != null && str.equals(aVar.f1423h)) || (i2 >= 0 && i2 == aVar.r)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        e.h.b.a aVar2 = this.f204d.get(size2);
                        if ((str == null || !str.equals(aVar2.f1423h)) && (i2 < 0 || i2 != aVar2.r)) {
                            break;
                        }
                    }
                }
                i4 = size2;
            }
            if (i4 == this.f204d.size() - 1) {
                return false;
            }
            for (int size3 = this.f204d.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f204d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public void Z(Fragment fragment) {
        if (N(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z2 = !fragment.isInBackStack();
        if (!fragment.mDetached || z2) {
            this.c.l(fragment);
            if (O(fragment)) {
                this.A = true;
            }
            fragment.mRemoving = true;
            h0(fragment);
        }
    }

    public a0 a(Fragment fragment) {
        if (N(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        a0 h2 = h(fragment);
        fragment.mFragmentManager = this;
        this.c.j(h2);
        if (!fragment.mDetached) {
            this.c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (O(fragment)) {
                this.A = true;
            }
        }
        return h2;
    }

    public final void a0(ArrayList<e.h.b.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                E(arrayList, arrayList2);
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    if (!arrayList.get(i2).o) {
                        if (i3 != i2) {
                            D(arrayList, arrayList2, i3, i2);
                        }
                        i3 = i2 + 1;
                        if (arrayList2.get(i2).booleanValue()) {
                            while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).o) {
                                i3++;
                            }
                        }
                        D(arrayList, arrayList2, i2, i3);
                        i2 = i3 - 1;
                    }
                    i2++;
                }
                if (i3 != size) {
                    D(arrayList, arrayList2, i3, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: e.a.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v33, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v39, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(e.h.b.t<?> r5, e.h.b.p r6, androidx.fragment.app.Fragment r7) {
        /*
            r4 = this;
            e.h.b.t<?> r0 = r4.q
            if (r0 != 0) goto L_0x0150
            r4.q = r5
            r4.r = r6
            r4.s = r7
            if (r7 == 0) goto L_0x0012
            androidx.fragment.app.FragmentManager$h r6 = new androidx.fragment.app.FragmentManager$h
            r6.<init>(r4, r7)
            goto L_0x0019
        L_0x0012:
            boolean r6 = r5 instanceof e.h.b.y
            if (r6 == 0) goto L_0x001e
            r6 = r5
            e.h.b.y r6 = (e.h.b.y) r6
        L_0x0019:
            java.util.concurrent.CopyOnWriteArrayList<e.h.b.y> r0 = r4.o
            r0.add(r6)
        L_0x001e:
            androidx.fragment.app.Fragment r6 = r4.s
            if (r6 == 0) goto L_0x0025
            r4.k0()
        L_0x0025:
            boolean r6 = r5 instanceof e.a.c
            if (r6 == 0) goto L_0x0052
            r6 = r5
            e.a.c r6 = (e.a.c) r6
            androidx.activity.OnBackPressedDispatcher r0 = r6.b()
            r4.f207g = r0
            if (r7 == 0) goto L_0x0035
            r6 = r7
        L_0x0035:
            e.a.b r1 = r4.f208h
            java.util.Objects.requireNonNull(r0)
            e.k.e r6 = r6.getLifecycle()
            r2 = r6
            e.k.i r2 = (e.k.i) r2
            e.k.e$b r2 = r2.b
            e.k.e$b r3 = e.k.e.b.DESTROYED
            if (r2 != r3) goto L_0x0048
            goto L_0x0052
        L_0x0048:
            androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r2 = new androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            r2.<init>(r6, r1)
            java.util.concurrent.CopyOnWriteArrayList<e.a.a> r6 = r1.b
            r6.add(r2)
        L_0x0052:
            if (r7 == 0) goto L_0x0075
            androidx.fragment.app.FragmentManager r5 = r7.mFragmentManager
            e.h.b.x r5 = r5.J
            java.util.HashMap<java.lang.String, e.h.b.x> r6 = r5.f1507d
            java.lang.String r0 = r7.mWho
            java.lang.Object r6 = r6.get(r0)
            e.h.b.x r6 = (e.h.b.x) r6
            if (r6 != 0) goto L_0x0072
            e.h.b.x r6 = new e.h.b.x
            boolean r0 = r5.f1509f
            r6.<init>(r0)
            java.util.HashMap<java.lang.String, e.h.b.x> r5 = r5.f1507d
            java.lang.String r0 = r7.mWho
            r5.put(r0, r6)
        L_0x0072:
            r4.J = r6
            goto L_0x00db
        L_0x0075:
            boolean r6 = r5 instanceof e.k.z
            if (r6 == 0) goto L_0x00d3
            e.k.z r5 = (e.k.z) r5
            e.k.y r5 = r5.getViewModelStore()
            e.k.u r6 = e.h.b.x.f1506i
            java.lang.Class<e.h.b.x> r0 = e.h.b.x.class
            java.lang.String r1 = r0.getCanonicalName()
            if (r1 == 0) goto L_0x00cb
            java.lang.String r2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r1 = g.a.a.a.a.w(r2, r1)
            java.util.HashMap<java.lang.String, e.k.s> r2 = r5.a
            java.lang.Object r2 = r2.get(r1)
            e.k.s r2 = (e.k.s) r2
            boolean r3 = r0.isInstance(r2)
            if (r3 == 0) goto L_0x00a7
            boolean r5 = r6 instanceof e.k.x
            if (r5 == 0) goto L_0x00c6
            e.k.x r6 = (e.k.x) r6
            r6.b(r2)
            goto L_0x00c6
        L_0x00a7:
            boolean r2 = r6 instanceof e.k.v
            if (r2 == 0) goto L_0x00b2
            e.k.v r6 = (e.k.v) r6
            e.k.s r6 = r6.c(r1, r0)
            goto L_0x00b8
        L_0x00b2:
            e.h.b.x$a r6 = (e.h.b.x.a) r6
            e.k.s r6 = r6.a(r0)
        L_0x00b8:
            r2 = r6
            java.util.HashMap<java.lang.String, e.k.s> r5 = r5.a
            java.lang.Object r5 = r5.put(r1, r2)
            e.k.s r5 = (e.k.s) r5
            if (r5 == 0) goto L_0x00c6
            r5.a()
        L_0x00c6:
            e.h.b.x r2 = (e.h.b.x) r2
            r4.J = r2
            goto L_0x00db
        L_0x00cb:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Local and anonymous classes can not be ViewModels"
            r5.<init>(r6)
            throw r5
        L_0x00d3:
            e.h.b.x r5 = new e.h.b.x
            r6 = 0
            r5.<init>(r6)
            r4.J = r5
        L_0x00db:
            e.h.b.x r5 = r4.J
            boolean r6 = r4.R()
            r5.f1511h = r6
            e.h.b.b0 r5 = r4.c
            e.h.b.x r6 = r4.J
            r5.c = r6
            e.h.b.t<?> r5 = r4.q
            boolean r6 = r5 instanceof e.a.e.e
            if (r6 == 0) goto L_0x014f
            e.a.e.e r5 = (e.a.e.e) r5
            e.a.e.d r5 = r5.f()
            if (r7 == 0) goto L_0x0105
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.mWho
            java.lang.String r0 = ":"
            java.lang.String r6 = g.a.a.a.a.f(r6, r7, r0)
            goto L_0x0107
        L_0x0105:
            java.lang.String r6 = ""
        L_0x0107:
            java.lang.String r7 = "FragmentManager:"
            java.lang.String r6 = g.a.a.a.a.w(r7, r6)
            java.lang.String r7 = "StartActivityForResult"
            java.lang.String r7 = g.a.a.a.a.w(r6, r7)
            e.a.e.f.c r0 = new e.a.e.f.c
            r0.<init>()
            androidx.fragment.app.FragmentManager$i r1 = new androidx.fragment.app.FragmentManager$i
            r1.<init>()
            e.a.e.b r7 = r5.c(r7, r0, r1)
            r4.w = r7
            java.lang.String r7 = "StartIntentSenderForResult"
            java.lang.String r7 = g.a.a.a.a.w(r6, r7)
            androidx.fragment.app.FragmentManager$j r0 = new androidx.fragment.app.FragmentManager$j
            r0.<init>()
            androidx.fragment.app.FragmentManager$a r1 = new androidx.fragment.app.FragmentManager$a
            r1.<init>()
            e.a.e.b r7 = r5.c(r7, r0, r1)
            r4.x = r7
            java.lang.String r7 = "RequestPermissions"
            java.lang.String r6 = g.a.a.a.a.w(r6, r7)
            e.a.e.f.b r7 = new e.a.e.f.b
            r7.<init>()
            androidx.fragment.app.FragmentManager$b r0 = new androidx.fragment.app.FragmentManager$b
            r0.<init>()
            e.a.e.b r5 = r5.c(r6, r7, r0)
            r4.y = r5
        L_0x014f:
            return
        L_0x0150:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Already attached"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.b(e.h.b.t, e.h.b.p, androidx.fragment.app.Fragment):void");
    }

    public void b0(Parcelable parcelable) {
        a0 a0Var;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.b != null) {
                this.c.b.clear();
                Iterator<FragmentState> it = fragmentManagerState.b.iterator();
                while (it.hasNext()) {
                    FragmentState next = it.next();
                    if (next != null) {
                        Fragment fragment = this.J.c.get(next.c);
                        if (fragment != null) {
                            if (N(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                            }
                            a0Var = new a0(this.n, this.c, fragment, next);
                        } else {
                            a0Var = new a0(this.n, this.c, this.q.c.getClassLoader(), J(), next);
                        }
                        Fragment fragment2 = a0Var.c;
                        fragment2.mFragmentManager = this;
                        if (N(2)) {
                            StringBuilder i2 = g.a.a.a.a.i("restoreSaveState: active (");
                            i2.append(fragment2.mWho);
                            i2.append("): ");
                            i2.append(fragment2);
                            Log.v("FragmentManager", i2.toString());
                        }
                        a0Var.m(this.q.c.getClassLoader());
                        this.c.j(a0Var);
                        a0Var.f1408e = this.p;
                    }
                }
                x xVar = this.J;
                Objects.requireNonNull(xVar);
                Iterator it2 = new ArrayList(xVar.c.values()).iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = (Fragment) it2.next();
                    if (!this.c.c(fragment3.mWho)) {
                        if (N(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.b);
                        }
                        this.J.d(fragment3);
                        fragment3.mFragmentManager = this;
                        a0 a0Var2 = new a0(this.n, this.c, fragment3);
                        a0Var2.f1408e = 1;
                        a0Var2.k();
                        fragment3.mRemoving = true;
                        a0Var2.k();
                    }
                }
                b0 b0Var = this.c;
                ArrayList<String> arrayList = fragmentManagerState.c;
                b0Var.a.clear();
                if (arrayList != null) {
                    for (String next2 : arrayList) {
                        Fragment d2 = b0Var.d(next2);
                        if (d2 != null) {
                            if (N(2)) {
                                Log.v("FragmentManager", "restoreSaveState: added (" + next2 + "): " + d2);
                            }
                            b0Var.a(d2);
                        } else {
                            throw new IllegalStateException(g.a.a.a.a.c("No instantiated fragment for (", next2, ")"));
                        }
                    }
                }
                if (fragmentManagerState.f214d != null) {
                    this.f204d = new ArrayList<>(fragmentManagerState.f214d.length);
                    int i3 = 0;
                    while (true) {
                        BackStackState[] backStackStateArr = fragmentManagerState.f214d;
                        if (i3 >= backStackStateArr.length) {
                            break;
                        }
                        BackStackState backStackState = backStackStateArr[i3];
                        Objects.requireNonNull(backStackState);
                        e.h.b.a aVar = new e.h.b.a(this);
                        int i4 = 0;
                        int i5 = 0;
                        while (true) {
                            int[] iArr = backStackState.b;
                            if (i4 >= iArr.length) {
                                break;
                            }
                            c0.a aVar2 = new c0.a();
                            int i6 = i4 + 1;
                            aVar2.a = iArr[i4];
                            if (N(2)) {
                                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i5 + " base fragment #" + backStackState.b[i6]);
                            }
                            String str = backStackState.c.get(i5);
                            aVar2.b = str != null ? this.c.d(str) : null;
                            aVar2.f1432g = e.b.values()[backStackState.f182d[i5]];
                            aVar2.f1433h = e.b.values()[backStackState.f183e[i5]];
                            int[] iArr2 = backStackState.b;
                            int i7 = i6 + 1;
                            int i8 = iArr2[i6];
                            aVar2.c = i8;
                            int i9 = i7 + 1;
                            int i10 = iArr2[i7];
                            aVar2.f1429d = i10;
                            int i11 = i9 + 1;
                            int i12 = iArr2[i9];
                            aVar2.f1430e = i12;
                            int i13 = iArr2[i11];
                            aVar2.f1431f = i13;
                            aVar.b = i8;
                            aVar.c = i10;
                            aVar.f1419d = i12;
                            aVar.f1420e = i13;
                            aVar.b(aVar2);
                            i5++;
                            i4 = i11 + 1;
                        }
                        aVar.f1421f = backStackState.f184f;
                        aVar.f1423h = backStackState.f185g;
                        aVar.r = backStackState.f186h;
                        aVar.f1422g = true;
                        aVar.f1424i = backStackState.f187i;
                        aVar.f1425j = backStackState.f188j;
                        aVar.f1426k = backStackState.f189k;
                        aVar.f1427l = backStackState.f190l;
                        aVar.f1428m = backStackState.f191m;
                        aVar.n = backStackState.n;
                        aVar.o = backStackState.o;
                        aVar.f(1);
                        if (N(2)) {
                            StringBuilder j2 = g.a.a.a.a.j("restoreAllState: back stack #", i3, " (index ");
                            j2.append(aVar.r);
                            j2.append("): ");
                            j2.append(aVar);
                            Log.v("FragmentManager", j2.toString());
                            PrintWriter printWriter = new PrintWriter(new p0("FragmentManager"));
                            aVar.h("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f204d.add(aVar);
                        i3++;
                    }
                } else {
                    this.f204d = null;
                }
                this.f209i.set(fragmentManagerState.f215e);
                String str2 = fragmentManagerState.f216f;
                if (str2 != null) {
                    Fragment F2 = F(str2);
                    this.t = F2;
                    t(F2);
                }
                ArrayList<String> arrayList2 = fragmentManagerState.f217g;
                if (arrayList2 != null) {
                    for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                        Bundle bundle = fragmentManagerState.f218h.get(i14);
                        bundle.setClassLoader(this.q.c.getClassLoader());
                        this.f210j.put(arrayList2.get(i14), bundle);
                    }
                }
                this.z = new ArrayDeque<>(fragmentManagerState.f219i);
            }
        }
    }

    public void c(Fragment fragment) {
        if (N(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.c.a(fragment);
                if (N(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (O(fragment)) {
                    this.A = true;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.fragment.app.BackStackState[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: androidx.fragment.app.BackStackState[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: androidx.fragment.app.BackStackState[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: androidx.fragment.app.BackStackState[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: androidx.fragment.app.BackStackState[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: androidx.fragment.app.BackStackState[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: androidx.fragment.app.BackStackState[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: androidx.fragment.app.BackStackState[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: androidx.fragment.app.BackStackState[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: androidx.fragment.app.BackStackState[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: androidx.fragment.app.BackStackState[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: android.os.Bundle} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable c0() {
        /*
            r11 = this;
            java.util.Set r0 = r11.f()
            java.util.HashSet r0 = (java.util.HashSet) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0021
            java.lang.Object r1 = r0.next()
            e.h.b.q0 r1 = (e.h.b.q0) r1
            boolean r3 = r1.f1493e
            if (r3 == 0) goto L_0x000a
            r1.f1493e = r2
            r1.c()
            goto L_0x000a
        L_0x0021:
            r11.z()
            r0 = 1
            r11.C(r0)
            r11.B = r0
            e.h.b.x r1 = r11.J
            r1.f1511h = r0
            e.h.b.b0 r0 = r11.c
            java.util.Objects.requireNonNull(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.HashMap<java.lang.String, e.h.b.a0> r3 = r0.b
            int r3 = r3.size()
            r1.<init>(r3)
            java.util.HashMap<java.lang.String, e.h.b.a0> r0 = r0.b
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0048:
            boolean r3 = r0.hasNext()
            r4 = 0
            r5 = 2
            if (r3 == 0) goto L_0x0127
            java.lang.Object r3 = r0.next()
            e.h.b.a0 r3 = (e.h.b.a0) r3
            if (r3 == 0) goto L_0x0048
            androidx.fragment.app.Fragment r6 = r3.c
            androidx.fragment.app.FragmentState r7 = new androidx.fragment.app.FragmentState
            r7.<init>((androidx.fragment.app.Fragment) r6)
            androidx.fragment.app.Fragment r8 = r3.c
            int r9 = r8.mState
            r10 = -1
            if (r9 <= r10) goto L_0x00f8
            android.os.Bundle r9 = r7.n
            if (r9 != 0) goto L_0x00f8
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            androidx.fragment.app.Fragment r9 = r3.c
            r9.performSaveInstanceState(r8)
            e.h.b.v r9 = r3.a
            androidx.fragment.app.Fragment r10 = r3.c
            r9.j(r10, r8, r2)
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x0082
            goto L_0x0083
        L_0x0082:
            r4 = r8
        L_0x0083:
            androidx.fragment.app.Fragment r8 = r3.c
            android.view.View r8 = r8.mView
            if (r8 == 0) goto L_0x008c
            r3.o()
        L_0x008c:
            androidx.fragment.app.Fragment r8 = r3.c
            android.util.SparseArray<android.os.Parcelable> r8 = r8.mSavedViewState
            if (r8 == 0) goto L_0x00a2
            if (r4 != 0) goto L_0x0099
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
        L_0x0099:
            androidx.fragment.app.Fragment r8 = r3.c
            android.util.SparseArray<android.os.Parcelable> r8 = r8.mSavedViewState
            java.lang.String r9 = "android:view_state"
            r4.putSparseParcelableArray(r9, r8)
        L_0x00a2:
            androidx.fragment.app.Fragment r8 = r3.c
            android.os.Bundle r8 = r8.mSavedViewRegistryState
            if (r8 == 0) goto L_0x00b8
            if (r4 != 0) goto L_0x00af
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
        L_0x00af:
            androidx.fragment.app.Fragment r8 = r3.c
            android.os.Bundle r8 = r8.mSavedViewRegistryState
            java.lang.String r9 = "android:view_registry_state"
            r4.putBundle(r9, r8)
        L_0x00b8:
            androidx.fragment.app.Fragment r8 = r3.c
            boolean r8 = r8.mUserVisibleHint
            if (r8 != 0) goto L_0x00ce
            if (r4 != 0) goto L_0x00c5
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
        L_0x00c5:
            androidx.fragment.app.Fragment r8 = r3.c
            boolean r8 = r8.mUserVisibleHint
            java.lang.String r9 = "android:user_visible_hint"
            r4.putBoolean(r9, r8)
        L_0x00ce:
            r7.n = r4
            androidx.fragment.app.Fragment r8 = r3.c
            java.lang.String r8 = r8.mTargetWho
            if (r8 == 0) goto L_0x00fc
            if (r4 != 0) goto L_0x00df
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r7.n = r4
        L_0x00df:
            android.os.Bundle r4 = r7.n
            androidx.fragment.app.Fragment r8 = r3.c
            java.lang.String r8 = r8.mTargetWho
            java.lang.String r9 = "android:target_state"
            r4.putString(r9, r8)
            androidx.fragment.app.Fragment r3 = r3.c
            int r3 = r3.mTargetRequestCode
            if (r3 == 0) goto L_0x00fc
            android.os.Bundle r4 = r7.n
            java.lang.String r8 = "android:target_req_state"
            r4.putInt(r8, r3)
            goto L_0x00fc
        L_0x00f8:
            android.os.Bundle r3 = r8.mSavedFragmentState
            r7.n = r3
        L_0x00fc:
            r1.add(r7)
            boolean r3 = N(r5)
            if (r3 == 0) goto L_0x0048
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Saved state of "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = ": "
            r3.append(r4)
            android.os.Bundle r4 = r7.n
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "FragmentManager"
            android.util.Log.v(r4, r3)
            goto L_0x0048
        L_0x0127:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x013b
            boolean r0 = N(r5)
            if (r0 == 0) goto L_0x013a
            java.lang.String r0 = "FragmentManager"
            java.lang.String r1 = "saveAllState: no fragments!"
            android.util.Log.v(r0, r1)
        L_0x013a:
            return r4
        L_0x013b:
            e.h.b.b0 r0 = r11.c
            java.util.ArrayList<androidx.fragment.app.Fragment> r3 = r0.a
            monitor-enter(r3)
            java.util.ArrayList<androidx.fragment.app.Fragment> r6 = r0.a     // Catch:{ all -> 0x0210 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0210 }
            if (r6 == 0) goto L_0x014b
            monitor-exit(r3)     // Catch:{ all -> 0x0210 }
            r6 = r4
            goto L_0x0195
        L_0x014b:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0210 }
            java.util.ArrayList<androidx.fragment.app.Fragment> r7 = r0.a     // Catch:{ all -> 0x0210 }
            int r7 = r7.size()     // Catch:{ all -> 0x0210 }
            r6.<init>(r7)     // Catch:{ all -> 0x0210 }
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r0.a     // Catch:{ all -> 0x0210 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0210 }
        L_0x015c:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x0210 }
            if (r7 == 0) goto L_0x0194
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x0210 }
            androidx.fragment.app.Fragment r7 = (androidx.fragment.app.Fragment) r7     // Catch:{ all -> 0x0210 }
            java.lang.String r8 = r7.mWho     // Catch:{ all -> 0x0210 }
            r6.add(r8)     // Catch:{ all -> 0x0210 }
            boolean r8 = N(r5)     // Catch:{ all -> 0x0210 }
            if (r8 == 0) goto L_0x015c
            java.lang.String r8 = "FragmentManager"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0210 }
            r9.<init>()     // Catch:{ all -> 0x0210 }
            java.lang.String r10 = "saveAllState: adding fragment ("
            r9.append(r10)     // Catch:{ all -> 0x0210 }
            java.lang.String r10 = r7.mWho     // Catch:{ all -> 0x0210 }
            r9.append(r10)     // Catch:{ all -> 0x0210 }
            java.lang.String r10 = "): "
            r9.append(r10)     // Catch:{ all -> 0x0210 }
            r9.append(r7)     // Catch:{ all -> 0x0210 }
            java.lang.String r7 = r9.toString()     // Catch:{ all -> 0x0210 }
            android.util.Log.v(r8, r7)     // Catch:{ all -> 0x0210 }
            goto L_0x015c
        L_0x0194:
            monitor-exit(r3)     // Catch:{ all -> 0x0210 }
        L_0x0195:
            java.util.ArrayList<e.h.b.a> r0 = r11.f204d
            if (r0 == 0) goto L_0x01d5
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01d5
            androidx.fragment.app.BackStackState[] r4 = new androidx.fragment.app.BackStackState[r0]
        L_0x01a1:
            if (r2 >= r0) goto L_0x01d5
            androidx.fragment.app.BackStackState r3 = new androidx.fragment.app.BackStackState
            java.util.ArrayList<e.h.b.a> r7 = r11.f204d
            java.lang.Object r7 = r7.get(r2)
            e.h.b.a r7 = (e.h.b.a) r7
            r3.<init>((e.h.b.a) r7)
            r4[r2] = r3
            boolean r3 = N(r5)
            if (r3 == 0) goto L_0x01d2
            java.lang.String r3 = "FragmentManager"
            java.lang.String r7 = "saveAllState: adding back stack #"
            java.lang.String r8 = ": "
            java.lang.StringBuilder r7 = g.a.a.a.a.j(r7, r2, r8)
            java.util.ArrayList<e.h.b.a> r8 = r11.f204d
            java.lang.Object r8 = r8.get(r2)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r3, r7)
        L_0x01d2:
            int r2 = r2 + 1
            goto L_0x01a1
        L_0x01d5:
            androidx.fragment.app.FragmentManagerState r0 = new androidx.fragment.app.FragmentManagerState
            r0.<init>()
            r0.b = r1
            r0.c = r6
            r0.f214d = r4
            java.util.concurrent.atomic.AtomicInteger r1 = r11.f209i
            int r1 = r1.get()
            r0.f215e = r1
            androidx.fragment.app.Fragment r1 = r11.t
            if (r1 == 0) goto L_0x01f0
            java.lang.String r1 = r1.mWho
            r0.f216f = r1
        L_0x01f0:
            java.util.ArrayList<java.lang.String> r1 = r0.f217g
            java.util.Map<java.lang.String, android.os.Bundle> r2 = r11.f210j
            java.util.Set r2 = r2.keySet()
            r1.addAll(r2)
            java.util.ArrayList<android.os.Bundle> r1 = r0.f218h
            java.util.Map<java.lang.String, android.os.Bundle> r2 = r11.f210j
            java.util.Collection r2 = r2.values()
            r1.addAll(r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r2 = r11.z
            r1.<init>(r2)
            r0.f219i = r1
            return r0
        L_0x0210:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0210 }
            goto L_0x0214
        L_0x0213:
            throw r0
        L_0x0214:
            goto L_0x0213
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.c0():android.os.Parcelable");
    }

    public final void d(Fragment fragment) {
        HashSet hashSet = this.f212l.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((e.e.f.a) it.next()).a();
            }
            hashSet.clear();
            i(fragment);
            this.f212l.remove(fragment);
        }
    }

    public void d0() {
        synchronized (this.a) {
            ArrayList<m> arrayList = this.I;
            boolean z2 = false;
            boolean z3 = arrayList != null && !arrayList.isEmpty();
            if (this.a.size() == 1) {
                z2 = true;
            }
            if (z3 || z2) {
                this.q.f1504d.removeCallbacks(this.K);
                this.q.f1504d.post(this.K);
                k0();
            }
        }
    }

    public final void e() {
        this.b = false;
        this.G.clear();
        this.F.clear();
    }

    public void e0(Fragment fragment, boolean z2) {
        ViewGroup I2 = I(fragment);
        if (I2 != null && (I2 instanceof q)) {
            ((q) I2).setDrawDisappearingViewsLast(!z2);
        }
    }

    public final Set<q0> f() {
        HashSet hashSet = new HashSet();
        Iterator it = ((ArrayList) this.c.f()).iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((a0) it.next()).c.mContainer;
            if (viewGroup != null) {
                hashSet.add(q0.g(viewGroup, L()));
            }
        }
        return hashSet;
    }

    public void f0(Fragment fragment, e.b bVar) {
        if (!fragment.equals(F(fragment.mWho)) || !(fragment.mHost == null || fragment.mFragmentManager == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.mMaxState = bVar;
    }

    public void g(e.h.b.a aVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            aVar.j(z4);
        } else {
            aVar.i();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3 && this.p >= 1) {
            j0.q(this.q.c, this.r, arrayList, arrayList2, 0, 1, true, this.f213m);
        }
        if (z4) {
            T(this.p, true);
        }
        Iterator it = ((ArrayList) this.c.g()).iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && aVar.k(fragment.mContainerId)) {
                float f2 = fragment.mPostponedAlpha;
                if (f2 > 0.0f) {
                    fragment.mView.setAlpha(f2);
                }
                if (z4) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    public void g0(Fragment fragment) {
        if (fragment == null || (fragment.equals(F(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.t;
            this.t = fragment;
            t(fragment2);
            t(this.t);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public a0 h(Fragment fragment) {
        a0 h2 = this.c.h(fragment.mWho);
        if (h2 != null) {
            return h2;
        }
        a0 a0Var = new a0(this.n, this.c, fragment);
        a0Var.m(this.q.c.getClassLoader());
        a0Var.f1408e = this.p;
        return a0Var;
    }

    public final void h0(Fragment fragment) {
        ViewGroup I2 = I(fragment);
        if (I2 != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (I2.getTag(2131297883) == null) {
                    I2.setTag(2131297883, fragment);
                }
                ((Fragment) I2.getTag(2131297883)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void i(Fragment fragment) {
        fragment.performDestroyView();
        this.n.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.g(null);
        fragment.mInLayout = false;
    }

    public void i0(Fragment fragment) {
        if (N(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public void j(Fragment fragment) {
        if (N(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (N(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.c.l(fragment);
                if (O(fragment)) {
                    this.A = true;
                }
                h0(fragment);
            }
        }
    }

    public final void j0() {
        Iterator it = ((ArrayList) this.c.f()).iterator();
        while (it.hasNext()) {
            W((a0) it.next());
        }
    }

    public void k(Configuration configuration) {
        for (Fragment next : this.c.i()) {
            if (next != null) {
                next.performConfigurationChanged(configuration);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r1 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r1 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r1 <= 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (Q(r4.s) == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r0.a = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r0 = r4.f208h;
        r1 = r4.f204d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k0() {
        /*
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$k> r0 = r4.a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$k> r1 = r4.a     // Catch:{ all -> 0x002f }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002f }
            r2 = 1
            if (r1 != 0) goto L_0x0012
            e.a.b r1 = r4.f208h     // Catch:{ all -> 0x002f }
            r1.a = r2     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            e.a.b r0 = r4.f208h
            java.util.ArrayList<e.h.b.a> r1 = r4.f204d
            r3 = 0
            if (r1 == 0) goto L_0x001f
            int r1 = r1.size()
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            if (r1 <= 0) goto L_0x002b
            androidx.fragment.app.Fragment r1 = r4.s
            boolean r1 = r4.Q(r1)
            if (r1 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            r0.a = r2
            return
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.k0():void");
    }

    public boolean l(MenuItem menuItem) {
        if (this.p < 1) {
            return false;
        }
        for (Fragment next : this.c.i()) {
            if (next != null && next.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        this.B = false;
        this.C = false;
        this.J.f1511h = false;
        w(1);
    }

    public boolean n(Menu menu, MenuInflater menuInflater) {
        if (this.p < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z2 = false;
        for (Fragment next : this.c.i()) {
            if (next != null && P(next) && next.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z2 = true;
            }
        }
        if (this.f205e != null) {
            for (int i2 = 0; i2 < this.f205e.size(); i2++) {
                Fragment fragment = this.f205e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.onDestroyOptionsMenu();
                }
            }
        }
        this.f205e = arrayList;
        return z2;
    }

    public void o() {
        this.D = true;
        C(true);
        z();
        w(-1);
        this.q = null;
        this.r = null;
        this.s = null;
        if (this.f207g != null) {
            Iterator<e.a.a> it = this.f208h.b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.f207g = null;
        }
        e.a.e.b<Intent> bVar = this.w;
        if (bVar != null) {
            bVar.c();
            this.x.c();
            this.y.c();
        }
    }

    public void p() {
        for (Fragment next : this.c.i()) {
            if (next != null) {
                next.performLowMemory();
            }
        }
    }

    public void q(boolean z2) {
        for (Fragment next : this.c.i()) {
            if (next != null) {
                next.performMultiWindowModeChanged(z2);
            }
        }
    }

    public boolean r(MenuItem menuItem) {
        if (this.p < 1) {
            return false;
        }
        for (Fragment next : this.c.i()) {
            if (next != null && next.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void s(Menu menu) {
        if (this.p >= 1) {
            for (Fragment next : this.c.i()) {
                if (next != null) {
                    next.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    public final void t(Fragment fragment) {
        if (fragment != null && fragment.equals(F(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.s;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.s;
        } else {
            t<?> tVar = this.q;
            if (tVar != null) {
                sb.append(tVar.getClass().getSimpleName());
                sb.append("{");
                obj = this.q;
            } else {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    public void u(boolean z2) {
        for (Fragment next : this.c.i()) {
            if (next != null) {
                next.performPictureInPictureModeChanged(z2);
            }
        }
    }

    public boolean v(Menu menu) {
        boolean z2 = false;
        if (this.p < 1) {
            return false;
        }
        for (Fragment next : this.c.i()) {
            if (next != null && P(next) && next.performPrepareOptionsMenu(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX INFO: finally extract failed */
    public final void w(int i2) {
        try {
            this.b = true;
            for (a0 next : this.c.b.values()) {
                if (next != null) {
                    next.f1408e = i2;
                }
            }
            T(i2, false);
            Iterator it = ((HashSet) f()).iterator();
            while (it.hasNext()) {
                ((q0) it.next()).e();
            }
            this.b = false;
            C(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void x() {
        if (this.E) {
            this.E = false;
            j0();
        }
    }

    public void y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String w2 = g.a.a.a.a.w(str, "    ");
        b0 b0Var = this.c;
        Objects.requireNonNull(b0Var);
        String str2 = str + "    ";
        if (!b0Var.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (a0 next : b0Var.b.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment fragment = next.c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = b0Var.a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(b0Var.a.get(i2).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f205e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.f205e.get(i3).toString());
            }
        }
        ArrayList<e.h.b.a> arrayList2 = this.f204d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                e.h.b.a aVar = this.f204d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.h(w2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f209i.get());
        synchronized (this.a) {
            int size4 = this.a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i5 = 0; i5 < size4; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(this.a.get(i5));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.q);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.r);
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.s);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.p);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.B);
        printWriter.print(" mStopped=");
        printWriter.print(this.C);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.D);
        if (this.A) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.A);
        }
    }

    public final void z() {
        Iterator it = ((HashSet) f()).iterator();
        while (it.hasNext()) {
            ((q0) it.next()).e();
        }
    }
}
