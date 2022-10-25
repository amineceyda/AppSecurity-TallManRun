package com.apkpure.aegon.components.models;

import android.os.Parcel;
import android.os.Parcelable;
import g.e.c.s.c;
import java.util.ArrayList;
import java.util.List;

public class AppDigestForUpdate implements Parcelable {
    public static final Parcelable.Creator<AppDigestForUpdate> CREATOR = new a();
    @c("is_system")
    @g.e.c.s.a
    private boolean isSystemApp;
    @c("package_name")
    @g.e.c.s.a
    private String packageName;
    @c("signatures")
    @g.e.c.s.a
    private List<String> signatures;
    @c("version_code")
    @g.e.c.s.a
    private int versionCode = -1;
    @c("version_id")
    @g.e.c.s.a
    private String versionId;

    public static class a implements Parcelable.Creator<AppDigestForUpdate> {
        public Object createFromParcel(Parcel parcel) {
            return new AppDigestForUpdate(parcel);
        }

        public Object[] newArray(int i2) {
            return new AppDigestForUpdate[i2];
        }
    }

    public AppDigestForUpdate() {
    }

    public AppDigestForUpdate(Parcel parcel) {
        this.packageName = parcel.readString();
        this.versionCode = parcel.readInt();
        if (this.signatures == null) {
            this.signatures = new ArrayList();
        }
        parcel.readStringList(this.signatures);
        this.isSystemApp = parcel.readByte() != 0;
        this.versionId = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.packageName);
        parcel.writeInt(this.versionCode);
        parcel.writeStringList(this.signatures);
        parcel.writeByte(this.isSystemApp ? (byte) 1 : 0);
        parcel.writeString(this.versionId);
    }
}
