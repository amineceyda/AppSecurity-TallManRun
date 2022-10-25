package g.i.a.a.j.d;

import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.util.SparseIntArray;
import java.lang.reflect.Field;

public class b extends a<Class<? extends Instrumentation>> {

    /* renamed from: d  reason: collision with root package name */
    public static final SparseIntArray f4089d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4089d = sparseIntArray;
        sparseIntArray.put(31, 37);
        sparseIntArray.put(30, 36);
        sparseIntArray.put(29, 34);
        sparseIntArray.put(28, 39);
        sparseIntArray.put(27, 34);
    }

    public b(String str, Class<? extends Instrumentation> cls) {
        super(str, cls);
    }

    public String b() {
        return "TRANSACTION_startInstrumentation";
    }

    public String c() {
        return "START_INSTRUMENTATION_TRANSACTION";
    }

    public long d(ComponentName componentName, Parcel parcel) throws Exception {
        new Intent().setComponent(componentName);
        parcel.writeInterfaceToken("android.app.IActivityManager");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            parcel.writeInt(1);
        }
        componentName.writeToParcel(parcel, 0);
        parcel.writeString((String) null);
        parcel.writeInt(0);
        parcel.writeInt(0);
        parcel.writeStrongBinder((IBinder) null);
        parcel.writeStrongBinder((IBinder) null);
        parcel.writeInt(0);
        parcel.writeString((String) null);
        Field declaredField = Parcel.class.getDeclaredField("mNativePtr");
        declaredField.setAccessible(true);
        return i2 >= 21 ? declaredField.getLong(parcel) : Long.parseLong(declaredField.get(parcel).toString());
    }

    public int e() {
        int i2 = this.a;
        if (i2 > 0) {
            return i2;
        }
        return f4089d.get(Build.VERSION.SDK_INT, -1);
    }
}
