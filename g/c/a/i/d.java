package g.c.a.i;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.apkpure.aegon.application.AegonApplication;
import e.e.c.a;
import i.o.c.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class d implements c {

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f2032e = LoggerFactory.getLogger("Garbage|RequestPermission");
    public int a;
    public List<String> b = new ArrayList();
    public a c;

    /* renamed from: d  reason: collision with root package name */
    public List<String> f2033d;

    public void a(String[] strArr, int[] iArr, boolean z) {
        h.e(strArr, "permissions");
        h.e(iArr, "grantResults");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length - 1;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (iArr[i2] != 0) {
                    arrayList.add(strArr[i2]);
                }
                if (i3 > length) {
                    break;
                }
                i2 = i3;
            }
        }
        if (arrayList.isEmpty()) {
            a aVar = this.c;
            if (aVar != null) {
                h.c(aVar);
                aVar.a(this.b, z, this.a);
                return;
            }
            return;
        }
        a aVar2 = this.c;
        if (aVar2 != null) {
            h.c(aVar2);
            aVar2.b(arrayList, z, this.a);
        }
    }

    public final d b(a aVar) {
        h.e(aVar, "callback");
        this.c = aVar;
        return this;
    }

    public final void c(boolean z) {
        a aVar = this.c;
        if (aVar != null) {
            h.c(aVar);
            aVar.a(this.b, z, this.a);
        }
    }

    public final d d(String str) {
        h.e(str, "permission");
        this.b.add(str);
        return this;
    }

    public final void e(Activity activity, int i2) {
        boolean z;
        h.e(activity, "activity");
        this.a = i2;
        if (Build.VERSION.SDK_INT < 23) {
            c(false);
            return;
        }
        List<String> list = this.b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            String str = (String) next;
            Context context = AegonApplication.getContext();
            Integer valueOf = context == null ? null : Integer.valueOf(a.a(context, str));
            if (valueOf != null && valueOf.intValue() == 0) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        this.f2033d = arrayList;
        if (!arrayList.isEmpty()) {
            z = false;
        }
        if (z) {
            c(false);
            return;
        }
        List<String> list2 = this.f2033d;
        Objects.requireNonNull(list2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
        ArrayList arrayList2 = (ArrayList) list2;
        h.e(arrayList2, "permissions");
        b bVar = new b();
        Bundle bundle = new Bundle();
        Object[] array = arrayList2.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        bundle.putStringArray("permission_list", (String[]) array);
        bundle.putInt("permission_request_code", i2);
        bVar.setArguments(bundle);
        bVar.b = this;
        try {
            activity.getFragmentManager().beginTransaction().add(bVar, "RequestPermission").commitAllowingStateLoss();
        } catch (Exception unused) {
            List<String> list3 = this.b;
            a aVar = this.c;
            if (aVar != null) {
                h.c(aVar);
                aVar.b(list3, false, this.a);
            }
        }
    }
}
