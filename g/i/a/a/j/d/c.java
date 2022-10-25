package g.i.a.a.j.d;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.util.SparseIntArray;
import java.lang.reflect.Field;

public class c extends a<Class<? extends Service>> {

    /* renamed from: d  reason: collision with root package name */
    public static final SparseIntArray f4090d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4090d = sparseIntArray;
        sparseIntArray.put(31, 27);
        sparseIntArray.put(30, 26);
        sparseIntArray.put(29, 24);
        sparseIntArray.put(28, 30);
        sparseIntArray.put(27, 26);
    }

    public c(String str, Class<? extends Service> cls) {
        super(str, cls);
    }

    public String b() {
        return "TRANSACTION_startService";
    }

    public String c() {
        return "START_SERVICE_TRANSACTION";
    }

    public long d(ComponentName componentName, Parcel parcel) throws Exception {
        Intent intent = new Intent();
        intent.setComponent(componentName);
        parcel.writeInterfaceToken("android.app.IActivityManager");
        parcel.writeStrongBinder((IBinder) null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            parcel.writeInt(1);
        }
        intent.writeToParcel(parcel, 0);
        parcel.writeString((String) null);
        if (i2 >= 26) {
            parcel.writeInt(0);
        }
        if (i2 > 22) {
            parcel.writeString(componentName.getPackageName());
        }
        parcel.writeInt(0);
        Field declaredField = Parcel.class.getDeclaredField("mNativePtr");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(parcel);
        return i2 >= 21 ? ((Long) obj).longValue() : Long.parseLong(((Integer) obj).toString());
    }

    public int e() {
        int i2 = this.a;
        if (i2 > 0) {
            return i2;
        }
        return f4090d.get(Build.VERSION.SDK_INT, -1);
    }
}
