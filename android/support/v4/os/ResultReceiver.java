package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import d.a.a.b.a;

@SuppressLint({"BanParcelableUsage"})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();
    public d.a.a.b.a b;

    public class a implements Parcelable.Creator<ResultReceiver> {
        public Object createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        public Object[] newArray(int i2) {
            return new ResultReceiver[i2];
        }
    }

    public class b extends a.C0029a {
        public b() {
        }
    }

    public ResultReceiver(Parcel parcel) {
        d.a.a.b.a aVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i2 = a.C0029a.a;
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof d.a.a.b.a)) ? new a.C0029a.C0030a(readStrongBinder) : (d.a.a.b.a) queryLocalInterface;
        }
        this.b = aVar;
    }

    public void a(int i2, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        synchronized (this) {
            if (this.b == null) {
                this.b = new b();
            }
            parcel.writeStrongBinder(this.b.asBinder());
        }
    }
}
