package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import e.h.b.c0;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();
    private static final String TAG = "FragmentManager";
    public final int[] b;
    public final ArrayList<String> c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f182d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f183e;

    /* renamed from: f  reason: collision with root package name */
    public final int f184f;

    /* renamed from: g  reason: collision with root package name */
    public final String f185g;

    /* renamed from: h  reason: collision with root package name */
    public final int f186h;

    /* renamed from: i  reason: collision with root package name */
    public final int f187i;

    /* renamed from: j  reason: collision with root package name */
    public final CharSequence f188j;

    /* renamed from: k  reason: collision with root package name */
    public final int f189k;

    /* renamed from: l  reason: collision with root package name */
    public final CharSequence f190l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<String> f191m;
    public final ArrayList<String> n;
    public final boolean o;

    public class a implements Parcelable.Creator<BackStackState> {
        public Object createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        public Object[] newArray(int i2) {
            return new BackStackState[i2];
        }
    }

    public BackStackState(Parcel parcel) {
        this.b = parcel.createIntArray();
        this.c = parcel.createStringArrayList();
        this.f182d = parcel.createIntArray();
        this.f183e = parcel.createIntArray();
        this.f184f = parcel.readInt();
        this.f185g = parcel.readString();
        this.f186h = parcel.readInt();
        this.f187i = parcel.readInt();
        this.f188j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f189k = parcel.readInt();
        this.f190l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f191m = parcel.createStringArrayList();
        this.n = parcel.createStringArrayList();
        this.o = parcel.readInt() != 0;
    }

    public BackStackState(e.h.b.a aVar) {
        int size = aVar.a.size();
        this.b = new int[(size * 5)];
        if (aVar.f1422g) {
            this.c = new ArrayList<>(size);
            this.f182d = new int[size];
            this.f183e = new int[size];
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                c0.a aVar2 = aVar.a.get(i2);
                int i4 = i3 + 1;
                this.b[i3] = aVar2.a;
                ArrayList<String> arrayList = this.c;
                Fragment fragment = aVar2.b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.b;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.c;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f1429d;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f1430e;
                iArr[i7] = aVar2.f1431f;
                this.f182d[i2] = aVar2.f1432g.ordinal();
                this.f183e[i2] = aVar2.f1433h.ordinal();
                i2++;
                i3 = i7 + 1;
            }
            this.f184f = aVar.f1421f;
            this.f185g = aVar.f1423h;
            this.f186h = aVar.r;
            this.f187i = aVar.f1424i;
            this.f188j = aVar.f1425j;
            this.f189k = aVar.f1426k;
            this.f190l = aVar.f1427l;
            this.f191m = aVar.f1428m;
            this.n = aVar.n;
            this.o = aVar.o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.b);
        parcel.writeStringList(this.c);
        parcel.writeIntArray(this.f182d);
        parcel.writeIntArray(this.f183e);
        parcel.writeInt(this.f184f);
        parcel.writeString(this.f185g);
        parcel.writeInt(this.f186h);
        parcel.writeInt(this.f187i);
        TextUtils.writeToParcel(this.f188j, parcel, 0);
        parcel.writeInt(this.f189k);
        TextUtils.writeToParcel(this.f190l, parcel, 0);
        parcel.writeStringList(this.f191m);
        parcel.writeStringList(this.n);
        parcel.writeInt(this.o ? 1 : 0);
    }
}
