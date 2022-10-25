package g.e.a.b.c;

import android.os.IBinder;
import android.os.IInterface;
import g.e.a.b.e.b.b;

public interface a extends IInterface {

    /* renamed from: g.e.a.b.c.a$a  reason: collision with other inner class name */
    public static abstract class C0109a extends b implements a {
        public C0109a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a A(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new c(iBinder);
        }
    }
}
