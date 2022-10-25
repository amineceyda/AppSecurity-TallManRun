package e.r;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.Method;

public class a extends VersionedParcel {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f1602d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f1603e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1604f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1605g;

    /* renamed from: h  reason: collision with root package name */
    public final String f1606h;

    /* renamed from: i  reason: collision with root package name */
    public int f1607i;

    /* renamed from: j  reason: collision with root package name */
    public int f1608j;

    /* renamed from: k  reason: collision with root package name */
    public int f1609k;

    public a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new e.d.a(), new e.d.a(), new e.d.a());
    }

    public a(Parcel parcel, int i2, int i3, String str, e.d.a<String, Method> aVar, e.d.a<String, Method> aVar2, e.d.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f1602d = new SparseIntArray();
        this.f1607i = -1;
        this.f1608j = 0;
        this.f1609k = -1;
        this.f1603e = parcel;
        this.f1604f = i2;
        this.f1605g = i3;
        this.f1608j = i2;
        this.f1606h = str;
    }

    public void a() {
        int i2 = this.f1607i;
        if (i2 >= 0) {
            int i3 = this.f1602d.get(i2);
            int dataPosition = this.f1603e.dataPosition();
            this.f1603e.setDataPosition(i3);
            this.f1603e.writeInt(dataPosition - i3);
            this.f1603e.setDataPosition(dataPosition);
        }
    }

    public VersionedParcel b() {
        Parcel parcel = this.f1603e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f1608j;
        if (i2 == this.f1604f) {
            i2 = this.f1605g;
        }
        return new a(parcel, dataPosition, i2, g.a.a.a.a.f(new StringBuilder(), this.f1606h, "  "), this.a, this.b, this.c);
    }

    public boolean f() {
        return this.f1603e.readInt() != 0;
    }

    public byte[] g() {
        int readInt = this.f1603e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f1603e.readByteArray(bArr);
        return bArr;
    }

    public CharSequence h() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f1603e);
    }

    public boolean i(int i2) {
        while (this.f1608j < this.f1605g) {
            int i3 = this.f1609k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.f1603e.setDataPosition(this.f1608j);
            int readInt = this.f1603e.readInt();
            this.f1609k = this.f1603e.readInt();
            this.f1608j += readInt;
        }
        return this.f1609k == i2;
    }

    public int j() {
        return this.f1603e.readInt();
    }

    public <T extends Parcelable> T l() {
        return this.f1603e.readParcelable(a.class.getClassLoader());
    }

    public String n() {
        return this.f1603e.readString();
    }

    public void p(int i2) {
        a();
        this.f1607i = i2;
        this.f1602d.put(i2, this.f1603e.dataPosition());
        this.f1603e.writeInt(0);
        this.f1603e.writeInt(i2);
    }

    public void q(boolean z) {
        this.f1603e.writeInt(z ? 1 : 0);
    }

    public void r(byte[] bArr) {
        if (bArr != null) {
            this.f1603e.writeInt(bArr.length);
            this.f1603e.writeByteArray(bArr);
            return;
        }
        this.f1603e.writeInt(-1);
    }

    public void s(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f1603e, 0);
    }

    public void t(int i2) {
        this.f1603e.writeInt(i2);
    }

    public void u(Parcelable parcelable) {
        this.f1603e.writeParcelable(parcelable, 0);
    }

    public void v(String str) {
        this.f1603e.writeString(str);
    }
}
