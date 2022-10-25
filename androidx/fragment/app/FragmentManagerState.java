package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();
    public ArrayList<FragmentState> b;
    public ArrayList<String> c;

    /* renamed from: d  reason: collision with root package name */
    public BackStackState[] f214d;

    /* renamed from: e  reason: collision with root package name */
    public int f215e;

    /* renamed from: f  reason: collision with root package name */
    public String f216f = null;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<String> f217g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<Bundle> f218h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f219i;

    public class a implements Parcelable.Creator<FragmentManagerState> {
        public Object createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        public Object[] newArray(int i2) {
            return new FragmentManagerState[i2];
        }
    }

    public FragmentManagerState() {
    }

    public FragmentManagerState(Parcel parcel) {
        this.b = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.c = parcel.createStringArrayList();
        this.f214d = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f215e = parcel.readInt();
        this.f216f = parcel.readString();
        this.f217g = parcel.createStringArrayList();
        this.f218h = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f219i = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.b);
        parcel.writeStringList(this.c);
        parcel.writeTypedArray(this.f214d, i2);
        parcel.writeInt(this.f215e);
        parcel.writeString(this.f216f);
        parcel.writeStringList(this.f217g);
        parcel.writeTypedList(this.f218h);
        parcel.writeTypedList(this.f219i);
    }
}
