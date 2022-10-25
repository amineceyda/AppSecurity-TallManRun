package androidx.drawerlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

public class DrawerLayout$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<DrawerLayout$SavedState> CREATOR = new a();
    public int b = 0;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f179d;

    /* renamed from: e  reason: collision with root package name */
    public int f180e;

    /* renamed from: f  reason: collision with root package name */
    public int f181f;

    public static class a implements Parcelable.ClassLoaderCreator<DrawerLayout$SavedState> {
        public Object createFromParcel(Parcel parcel) {
            return new DrawerLayout$SavedState(parcel, (ClassLoader) null);
        }

        public Object[] newArray(int i2) {
            return new DrawerLayout$SavedState[i2];
        }

        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new DrawerLayout$SavedState(parcel, classLoader);
        }
    }

    public DrawerLayout$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.f179d = parcel.readInt();
        this.f180e = parcel.readInt();
        this.f181f = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.f179d);
        parcel.writeInt(this.f180e);
        parcel.writeInt(this.f181f);
    }
}
