package e.h.b;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class u implements LayoutInflater.Factory2 {
    public final FragmentManager b;

    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ a0 b;

        public a(a0 a0Var) {
            this.b = a0Var;
        }

        public void onViewAttachedToWindow(View view) {
            a0 a0Var = this.b;
            Fragment fragment = a0Var.c;
            a0Var.k();
            q0.f((ViewGroup) fragment.mView.getParent(), u.this.b).e();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public u(FragmentManager fragmentManager) {
        this.b = fragmentManager;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.View r10, java.lang.String r11, android.content.Context r12, android.util.AttributeSet r13) {
        /*
            r9 = this;
            java.lang.Class<e.h.b.q> r0 = e.h.b.q.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0014
            e.h.b.q r10 = new e.h.b.q
            androidx.fragment.app.FragmentManager r11 = r9.b
            r10.<init>(r12, r13, r11)
            return r10
        L_0x0014:
            java.lang.String r0 = "fragment"
            boolean r11 = r0.equals(r11)
            r0 = 0
            if (r11 != 0) goto L_0x001e
            return r0
        L_0x001e:
            java.lang.String r11 = "class"
            java.lang.String r11 = r13.getAttributeValue(r0, r11)
            int[] r1 = e.h.a.a
            android.content.res.TypedArray r1 = r12.obtainStyledAttributes(r13, r1)
            r2 = 0
            if (r11 != 0) goto L_0x0031
            java.lang.String r11 = r1.getString(r2)
        L_0x0031:
            r3 = 1
            r4 = -1
            int r5 = r1.getResourceId(r3, r4)
            r6 = 2
            java.lang.String r7 = r1.getString(r6)
            r1.recycle()
            if (r11 == 0) goto L_0x01a2
            java.lang.ClassLoader r1 = r12.getClassLoader()
            e.d.g<java.lang.ClassLoader, e.d.g<java.lang.String, java.lang.Class<?>>> r8 = e.h.b.s.a
            java.lang.Class r1 = e.h.b.s.b(r1, r11)     // Catch:{ ClassNotFoundException -> 0x0052 }
            java.lang.Class<androidx.fragment.app.Fragment> r8 = androidx.fragment.app.Fragment.class
            boolean r1 = r8.isAssignableFrom(r1)     // Catch:{ ClassNotFoundException -> 0x0052 }
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            if (r1 != 0) goto L_0x0057
            goto L_0x01a2
        L_0x0057:
            if (r10 == 0) goto L_0x005d
            int r2 = r10.getId()
        L_0x005d:
            if (r2 != r4) goto L_0x0082
            if (r5 != r4) goto L_0x0082
            if (r7 == 0) goto L_0x0064
            goto L_0x0082
        L_0x0064:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r13.getPositionDescription()
            r12.append(r13)
            java.lang.String r13 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L_0x0082:
            if (r5 == r4) goto L_0x008a
            androidx.fragment.app.FragmentManager r0 = r9.b
            androidx.fragment.app.Fragment r0 = r0.G(r5)
        L_0x008a:
            if (r0 != 0) goto L_0x0094
            if (r7 == 0) goto L_0x0094
            androidx.fragment.app.FragmentManager r0 = r9.b
            androidx.fragment.app.Fragment r0 = r0.H(r7)
        L_0x0094:
            if (r0 != 0) goto L_0x009e
            if (r2 == r4) goto L_0x009e
            androidx.fragment.app.FragmentManager r0 = r9.b
            androidx.fragment.app.Fragment r0 = r0.G(r2)
        L_0x009e:
            java.lang.String r1 = "Fragment "
            java.lang.String r4 = "FragmentManager"
            if (r0 != 0) goto L_0x00ea
            androidx.fragment.app.FragmentManager r0 = r9.b
            e.h.b.s r0 = r0.J()
            java.lang.ClassLoader r12 = r12.getClassLoader()
            androidx.fragment.app.Fragment r0 = r0.a(r12, r11)
            r0.mFromLayout = r3
            if (r5 == 0) goto L_0x00b8
            r12 = r5
            goto L_0x00b9
        L_0x00b8:
            r12 = r2
        L_0x00b9:
            r0.mFragmentId = r12
            r0.mContainerId = r2
            r0.mTag = r7
            r0.mInLayout = r3
            androidx.fragment.app.FragmentManager r12 = r9.b
            r0.mFragmentManager = r12
            e.h.b.t<?> r12 = r12.q
            r0.mHost = r12
            android.content.Context r12 = r12.c
            android.os.Bundle r2 = r0.mSavedFragmentState
            r0.onInflate((android.content.Context) r12, (android.util.AttributeSet) r13, (android.os.Bundle) r2)
            androidx.fragment.app.FragmentManager r12 = r9.b
            e.h.b.a0 r12 = r12.a(r0)
            boolean r13 = androidx.fragment.app.FragmentManager.N(r6)
            if (r13 == 0) goto L_0x012b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r1)
            r13.append(r0)
            java.lang.String r2 = " has been inflated via the <fragment> tag: id=0x"
            goto L_0x011a
        L_0x00ea:
            boolean r12 = r0.mInLayout
            if (r12 != 0) goto L_0x0164
            r0.mInLayout = r3
            androidx.fragment.app.FragmentManager r12 = r9.b
            r0.mFragmentManager = r12
            e.h.b.t<?> r12 = r12.q
            r0.mHost = r12
            android.content.Context r12 = r12.c
            android.os.Bundle r2 = r0.mSavedFragmentState
            r0.onInflate((android.content.Context) r12, (android.util.AttributeSet) r13, (android.os.Bundle) r2)
            androidx.fragment.app.FragmentManager r12 = r9.b
            e.h.b.a0 r12 = r12.h(r0)
            boolean r13 = androidx.fragment.app.FragmentManager.N(r6)
            if (r13 == 0) goto L_0x012b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r2 = "Retained Fragment "
            r13.append(r2)
            r13.append(r0)
            java.lang.String r2 = " has been re-attached via the <fragment> tag: id=0x"
        L_0x011a:
            r13.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r5)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            android.util.Log.v(r4, r13)
        L_0x012b:
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r0.mContainer = r10
            r12.k()
            r12.j()
            android.view.View r10 = r0.mView
            if (r10 == 0) goto L_0x0158
            if (r5 == 0) goto L_0x013e
            r10.setId(r5)
        L_0x013e:
            android.view.View r10 = r0.mView
            java.lang.Object r10 = r10.getTag()
            if (r10 != 0) goto L_0x014b
            android.view.View r10 = r0.mView
            r10.setTag(r7)
        L_0x014b:
            android.view.View r10 = r0.mView
            e.h.b.u$a r11 = new e.h.b.u$a
            r11.<init>(r12)
            r10.addOnAttachStateChangeListener(r11)
            android.view.View r10 = r0.mView
            return r10
        L_0x0158:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r12 = " did not create a view."
            java.lang.String r11 = g.a.a.a.a.c(r1, r11, r12)
            r10.<init>(r11)
            throw r10
        L_0x0164:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r13.getPositionDescription()
            r12.append(r13)
            java.lang.String r13 = ": Duplicate id 0x"
            r12.append(r13)
            java.lang.String r13 = java.lang.Integer.toHexString(r5)
            r12.append(r13)
            java.lang.String r13 = ", tag "
            r12.append(r13)
            r12.append(r7)
            java.lang.String r13 = ", or parent id 0x"
            r12.append(r13)
            java.lang.String r13 = java.lang.Integer.toHexString(r2)
            r12.append(r13)
            java.lang.String r13 = " with another fragment for "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L_0x01a2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.b.u.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
