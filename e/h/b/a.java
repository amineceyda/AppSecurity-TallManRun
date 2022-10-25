package e.h.b;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import e.h.b.c0;
import e.k.e;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public final class a extends c0 implements FragmentManager.k {
    public final FragmentManager p;
    public boolean q;
    public int r;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(androidx.fragment.app.FragmentManager r3) {
        /*
            r2 = this;
            e.h.b.s r0 = r3.J()
            e.h.b.t<?> r1 = r3.q
            if (r1 == 0) goto L_0x000f
            android.content.Context r1 = r1.c
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            r2.<init>(r0, r1)
            r0 = -1
            r2.r = r0
            r2.p = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.b.a.<init>(androidx.fragment.app.FragmentManager):void");
    }

    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.N(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1422g) {
            return true;
        }
        FragmentManager fragmentManager = this.p;
        if (fragmentManager.f204d == null) {
            fragmentManager.f204d = new ArrayList<>();
        }
        fragmentManager.f204d.add(this);
        return true;
    }

    /* JADX INFO: finally extract failed */
    public void c() {
        if (!this.f1422g) {
            FragmentManager fragmentManager = this.p;
            if (fragmentManager.q != null && !fragmentManager.D) {
                fragmentManager.B(true);
                a(fragmentManager.F, fragmentManager.G);
                fragmentManager.b = true;
                try {
                    fragmentManager.a0(fragmentManager.F, fragmentManager.G);
                    fragmentManager.e();
                    fragmentManager.k0();
                    fragmentManager.x();
                    fragmentManager.c.b();
                } catch (Throwable th) {
                    fragmentManager.e();
                    throw th;
                }
            }
        } else {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
    }

    public void d(int i2, Fragment fragment, String str, int i3) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder i4 = g.a.a.a.a.i("Fragment ");
            i4.append(cls.getCanonicalName());
            i4.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(i4.toString());
        }
        if (str != null) {
            String str2 = fragment.mTag;
            if (str2 == null || str.equals(str2)) {
                fragment.mTag = str;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                throw new IllegalStateException(g.a.a.a.a.g(sb, fragment.mTag, " now ", str));
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i5 = fragment.mFragmentId;
                if (i5 == 0 || i5 == i2) {
                    fragment.mFragmentId = i2;
                    fragment.mContainerId = i2;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i2);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        b(new c0.a(i3, fragment));
        fragment.mFragmentManager = this.p;
    }

    public c0 e(Fragment fragment, e.b bVar) {
        if (fragment.mFragmentManager != this.p) {
            StringBuilder i2 = g.a.a.a.a.i("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            i2.append(this.p);
            throw new IllegalArgumentException(i2.toString());
        } else if (bVar == e.b.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        } else if (bVar != e.b.DESTROYED) {
            b(new c0.a(10, fragment, bVar));
            return this;
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    public void f(int i2) {
        if (this.f1422g) {
            if (FragmentManager.N(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.a.size();
            for (int i3 = 0; i3 < size; i3++) {
                c0.a aVar = this.a.get(i3);
                Fragment fragment = aVar.b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i2;
                    if (FragmentManager.N(2)) {
                        StringBuilder i4 = g.a.a.a.a.i("Bump nesting of ");
                        i4.append(aVar.b);
                        i4.append(" to ");
                        i4.append(aVar.b.mBackStackNesting);
                        Log.v("FragmentManager", i4.toString());
                    }
                }
            }
        }
    }

    public int g(boolean z) {
        if (!this.q) {
            if (FragmentManager.N(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new p0("FragmentManager"));
                h("  ", printWriter, true);
                printWriter.close();
            }
            this.q = true;
            this.r = this.f1422g ? this.p.f209i.getAndIncrement() : -1;
            this.p.A(this, z);
            return this.r;
        }
        throw new IllegalStateException("commit already called");
    }

    public void h(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1423h);
            printWriter.print(" mIndex=");
            printWriter.print(this.r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.q);
            if (this.f1421f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1421f));
            }
            if (!(this.b == 0 && this.c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (!(this.f1419d == 0 && this.f1420e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1419d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1420e));
            }
            if (!(this.f1424i == 0 && this.f1425j == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1424i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1425j);
            }
            if (!(this.f1426k == 0 && this.f1427l == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1426k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1427l);
            }
        }
        if (!this.a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                c0.a aVar = this.a.get(i2);
                switch (aVar.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder i3 = g.a.a.a.a.i("cmd=");
                        i3.append(aVar.a);
                        str2 = i3.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.b);
                if (z) {
                    if (!(aVar.c == 0 && aVar.f1429d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1429d));
                    }
                    if (aVar.f1430e != 0 || aVar.f1431f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1430e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1431f));
                    }
                }
            }
        }
    }

    public void i() {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            c0.a aVar = this.a.get(i2);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f1421f);
                fragment.setSharedElementNames(this.f1428m, this.n);
            }
            switch (aVar.a) {
                case 1:
                    fragment.setAnimations(aVar.c, aVar.f1429d, aVar.f1430e, aVar.f1431f);
                    this.p.e0(fragment, false);
                    this.p.a(fragment);
                    break;
                case 3:
                    fragment.setAnimations(aVar.c, aVar.f1429d, aVar.f1430e, aVar.f1431f);
                    this.p.Z(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.c, aVar.f1429d, aVar.f1430e, aVar.f1431f);
                    this.p.M(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.c, aVar.f1429d, aVar.f1430e, aVar.f1431f);
                    this.p.e0(fragment, false);
                    this.p.i0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.c, aVar.f1429d, aVar.f1430e, aVar.f1431f);
                    this.p.j(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.c, aVar.f1429d, aVar.f1430e, aVar.f1431f);
                    this.p.e0(fragment, false);
                    this.p.c(fragment);
                    break;
                case 8:
                    this.p.g0(fragment);
                    break;
                case 9:
                    this.p.g0((Fragment) null);
                    break;
                case 10:
                    this.p.f0(fragment, aVar.f1433h);
                    break;
                default:
                    StringBuilder i3 = g.a.a.a.a.i("Unknown cmd: ");
                    i3.append(aVar.a);
                    throw new IllegalArgumentException(i3.toString());
            }
            if (!this.o) {
                int i4 = aVar.a;
            }
        }
    }

    public void j(boolean z) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            c0.a aVar = this.a.get(size);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.setPopDirection(true);
                int i2 = this.f1421f;
                int i3 = 8194;
                if (i2 != 4097) {
                    i3 = i2 != 4099 ? i2 != 8194 ? 0 : 4097 : 4099;
                }
                fragment.setNextTransition(i3);
                fragment.setSharedElementNames(this.n, this.f1428m);
            }
            switch (aVar.a) {
                case 1:
                    fragment.setAnimations(aVar.c, aVar.f1429d, aVar.f1430e, aVar.f1431f);
                    this.p.e0(fragment, true);
                    this.p.Z(fragment);
                    break;
                case 3:
                    fragment.setAnimations(aVar.c, aVar.f1429d, aVar.f1430e, aVar.f1431f);
                    this.p.a(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.c, aVar.f1429d, aVar.f1430e, aVar.f1431f);
                    this.p.i0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.c, aVar.f1429d, aVar.f1430e, aVar.f1431f);
                    this.p.e0(fragment, true);
                    this.p.M(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.c, aVar.f1429d, aVar.f1430e, aVar.f1431f);
                    this.p.c(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.c, aVar.f1429d, aVar.f1430e, aVar.f1431f);
                    this.p.e0(fragment, true);
                    this.p.j(fragment);
                    break;
                case 8:
                    this.p.g0((Fragment) null);
                    break;
                case 9:
                    this.p.g0(fragment);
                    break;
                case 10:
                    this.p.f0(fragment, aVar.f1432g);
                    break;
                default:
                    StringBuilder i4 = g.a.a.a.a.i("Unknown cmd: ");
                    i4.append(aVar.a);
                    throw new IllegalArgumentException(i4.toString());
            }
            if (!this.o) {
                int i5 = aVar.a;
            }
        }
    }

    public boolean k(int i2) {
        int size = this.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.a.get(i3).b;
            int i4 = fragment != null ? fragment.mContainerId : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    public boolean l(ArrayList<a> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.a.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            Fragment fragment = this.a.get(i5).b;
            int i6 = fragment != null ? fragment.mContainerId : 0;
            if (!(i6 == 0 || i6 == i4)) {
                for (int i7 = i2; i7 < i3; i7++) {
                    a aVar = arrayList.get(i7);
                    int size2 = aVar.a.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        Fragment fragment2 = aVar.a.get(i8).b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.r >= 0) {
            sb.append(" #");
            sb.append(this.r);
        }
        if (this.f1423h != null) {
            sb.append(" ");
            sb.append(this.f1423h);
        }
        sb.append("}");
        return sb.toString();
    }
}
