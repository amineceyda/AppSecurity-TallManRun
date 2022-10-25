package androidx.coordinatorlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.customview.view.AbsSavedState;

public class CoordinatorLayout$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<CoordinatorLayout$SavedState> CREATOR = new a();
    public SparseArray<Parcelable> b;

    public static class a implements Parcelable.ClassLoaderCreator<CoordinatorLayout$SavedState> {
        public Object createFromParcel(Parcel parcel) {
            return new CoordinatorLayout$SavedState(parcel, (ClassLoader) null);
        }

        public Object[] newArray(int i2) {
            return new CoordinatorLayout$SavedState[i2];
        }

        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new CoordinatorLayout$SavedState(parcel, classLoader);
        }
    }

    public CoordinatorLayout$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.b = new SparseArray<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.b.append(iArr[i2], readParcelableArray[i2]);
        }
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        SparseArray<Parcelable> sparseArray = this.b;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = this.b.keyAt(i3);
            parcelableArr[i3] = this.b.valueAt(i3);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i2);
    }
}
