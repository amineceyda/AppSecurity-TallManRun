package androidx.slidingpanelayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

public class SlidingPaneLayout$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<SlidingPaneLayout$SavedState> CREATOR = new a();
    public boolean b;

    public static class a implements Parcelable.ClassLoaderCreator<SlidingPaneLayout$SavedState> {
        public Object createFromParcel(Parcel parcel) {
            return new SlidingPaneLayout$SavedState(parcel, (ClassLoader) null);
        }

        public Object[] newArray(int i2) {
            return new SlidingPaneLayout$SavedState[i2];
        }

        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new SlidingPaneLayout$SavedState(parcel, (ClassLoader) null);
        }
    }

    public SlidingPaneLayout$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, (ClassLoader) null);
        this.b = parcel.readInt() != 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
