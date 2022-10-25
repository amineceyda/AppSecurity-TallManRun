package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f220d;

    /* renamed from: e  reason: collision with root package name */
    public final int f221e;

    /* renamed from: f  reason: collision with root package name */
    public final int f222f;

    /* renamed from: g  reason: collision with root package name */
    public final String f223g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f224h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f225i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f226j;

    /* renamed from: k  reason: collision with root package name */
    public final Bundle f227k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f228l;

    /* renamed from: m  reason: collision with root package name */
    public final int f229m;
    public Bundle n;

    public class a implements Parcelable.Creator<FragmentState> {
        public Object createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        public Object[] newArray(int i2) {
            return new FragmentState[i2];
        }
    }

    public FragmentState(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readString();
        boolean z = true;
        this.f220d = parcel.readInt() != 0;
        this.f221e = parcel.readInt();
        this.f222f = parcel.readInt();
        this.f223g = parcel.readString();
        this.f224h = parcel.readInt() != 0;
        this.f225i = parcel.readInt() != 0;
        this.f226j = parcel.readInt() != 0;
        this.f227k = parcel.readBundle();
        this.f228l = parcel.readInt() == 0 ? false : z;
        this.n = parcel.readBundle();
        this.f229m = parcel.readInt();
    }

    public FragmentState(Fragment fragment) {
        this.b = fragment.getClass().getName();
        this.c = fragment.mWho;
        this.f220d = fragment.mFromLayout;
        this.f221e = fragment.mFragmentId;
        this.f222f = fragment.mContainerId;
        this.f223g = fragment.mTag;
        this.f224h = fragment.mRetainInstance;
        this.f225i = fragment.mRemoving;
        this.f226j = fragment.mDetached;
        this.f227k = fragment.mArguments;
        this.f228l = fragment.mHidden;
        this.f229m = fragment.mMaxState.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.b);
        sb.append(" (");
        sb.append(this.c);
        sb.append(")}:");
        if (this.f220d) {
            sb.append(" fromLayout");
        }
        if (this.f222f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f222f));
        }
        String str = this.f223g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f223g);
        }
        if (this.f224h) {
            sb.append(" retainInstance");
        }
        if (this.f225i) {
            sb.append(" removing");
        }
        if (this.f226j) {
            sb.append(" detached");
        }
        if (this.f228l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.f220d ? 1 : 0);
        parcel.writeInt(this.f221e);
        parcel.writeInt(this.f222f);
        parcel.writeString(this.f223g);
        parcel.writeInt(this.f224h ? 1 : 0);
        parcel.writeInt(this.f225i ? 1 : 0);
        parcel.writeInt(this.f226j ? 1 : 0);
        parcel.writeBundle(this.f227k);
        parcel.writeInt(this.f228l ? 1 : 0);
        parcel.writeBundle(this.n);
        parcel.writeInt(this.f229m);
    }
}
