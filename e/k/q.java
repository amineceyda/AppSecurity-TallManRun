package e.k;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import e.p.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class q {

    /* renamed from: e  reason: collision with root package name */
    public static final Class[] f1523e;
    public final Map<String, Object> a;
    public final Map<String, a.b> b;
    public final Map<String, Object<?>> c;

    /* renamed from: d  reason: collision with root package name */
    public final a.b f1524d;

    public class a implements a.b {
        public a() {
        }

        public Bundle a() {
            for (Map.Entry entry : new HashMap(q.this.b).entrySet()) {
                Bundle a2 = ((a.b) entry.getValue()).a();
                q qVar = q.this;
                String str = (String) entry.getKey();
                Objects.requireNonNull(qVar);
                if (a2 != null) {
                    Class[] clsArr = q.f1523e;
                    int length = clsArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        if (!clsArr[i2].isInstance(a2)) {
                            i2++;
                        }
                    }
                    StringBuilder i3 = g.a.a.a.a.i("Can't put value with type ");
                    i3.append(a2.getClass());
                    i3.append(" into saved state");
                    throw new IllegalArgumentException(i3.toString());
                }
                m mVar = (m) qVar.c.get(str);
                if (mVar != null) {
                    mVar.g(a2);
                } else {
                    qVar.a.put(str, a2);
                }
            }
            Set<String> keySet = q.this.a.keySet();
            ArrayList arrayList = new ArrayList(keySet.size());
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (String next : keySet) {
                arrayList.add(next);
                arrayList2.add(q.this.a.get(next));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("keys", arrayList);
            bundle.putParcelableArrayList("values", arrayList2);
            return bundle;
        }
    }

    static {
        Class[] clsArr = new Class[29];
        clsArr[0] = Boolean.TYPE;
        clsArr[1] = boolean[].class;
        clsArr[2] = Double.TYPE;
        clsArr[3] = double[].class;
        Class<SizeF> cls = Integer.TYPE;
        clsArr[4] = cls;
        clsArr[5] = int[].class;
        clsArr[6] = Long.TYPE;
        clsArr[7] = long[].class;
        clsArr[8] = String.class;
        clsArr[9] = String[].class;
        clsArr[10] = Binder.class;
        clsArr[11] = Bundle.class;
        clsArr[12] = Byte.TYPE;
        clsArr[13] = byte[].class;
        clsArr[14] = Character.TYPE;
        clsArr[15] = char[].class;
        clsArr[16] = CharSequence.class;
        clsArr[17] = CharSequence[].class;
        clsArr[18] = ArrayList.class;
        clsArr[19] = Float.TYPE;
        clsArr[20] = float[].class;
        clsArr[21] = Parcelable.class;
        clsArr[22] = Parcelable[].class;
        clsArr[23] = Serializable.class;
        clsArr[24] = Short.TYPE;
        clsArr[25] = short[].class;
        clsArr[26] = SparseArray.class;
        int i2 = Build.VERSION.SDK_INT;
        clsArr[27] = i2 >= 21 ? Size.class : cls;
        if (i2 >= 21) {
            cls = SizeF.class;
        }
        clsArr[28] = cls;
        f1523e = clsArr;
    }

    public q() {
        this.b = new HashMap();
        this.c = new HashMap();
        this.f1524d = new a();
        this.a = new HashMap();
    }

    public q(Map<String, Object> map) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.f1524d = new a();
        this.a = new HashMap(map);
    }
}
