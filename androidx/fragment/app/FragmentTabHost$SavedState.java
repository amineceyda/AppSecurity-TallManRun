package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public class FragmentTabHost$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<FragmentTabHost$SavedState> CREATOR = new a();
    public String b;

    public class a implements Parcelable.Creator<FragmentTabHost$SavedState> {
        public Object createFromParcel(Parcel parcel) {
            return new FragmentTabHost$SavedState(parcel);
        }

        public Object[] newArray(int i2) {
            return new FragmentTabHost$SavedState[i2];
        }
    }

    public FragmentTabHost$SavedState(Parcel parcel) {
        super(parcel);
        this.b = parcel.readString();
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("FragmentTabHost.SavedState{");
        i2.append(Integer.toHexString(System.identityHashCode(this)));
        i2.append(" curTab=");
        return g.a.a.a.a.f(i2, this.b, "}");
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.b);
    }
}
