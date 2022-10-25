package com.apkpure.aegon.components.models;

import android.os.Parcel;
import android.os.Parcelable;
import g.c.a.e.k.h.b;
import g.e.c.s.c;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.helpers.MessageFormatter;

public class AppDigest implements Parcelable {
    public static final Parcelable.Creator<AppDigest> CREATOR = new a();
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
    private String versionId = "";

    public static class a implements Parcelable.Creator<AppDigest> {
        public Object createFromParcel(Parcel parcel) {
            return new AppDigest(parcel, (a) null);
        }

        public Object[] newArray(int i2) {
            return new AppDigest[i2];
        }
    }

    public AppDigest() {
    }

    public AppDigest(Parcel parcel, a aVar) {
        this.packageName = parcel.readString();
        this.versionCode = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        this.signatures = arrayList;
        parcel.readStringList(arrayList);
        this.versionId = parcel.readString();
    }

    public static AppDigest d(String str) {
        return (AppDigest) b.b(str, AppDigest.class);
    }

    public static AppDigest e(String str, int i2, List<String> list, String str2) {
        AppDigest appDigest = new AppDigest();
        appDigest.packageName = str;
        appDigest.versionCode = i2;
        appDigest.signatures = list;
        if (str2 == null) {
            str2 = "";
        }
        appDigest.versionId = str2;
        return appDigest;
    }

    public String a() {
        return this.packageName;
    }

    public int b() {
        return this.versionCode;
    }

    public boolean c(AppDigest appDigest) {
        String str = this.packageName;
        return str != null && str.equals(appDigest.packageName) && this.versionCode == appDigest.versionCode;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AppDigest)) {
            return super.equals(obj);
        }
        AppDigest appDigest = (AppDigest) obj;
        if (!this.packageName.equals(appDigest.packageName) || this.versionCode != appDigest.versionCode) {
            return false;
        }
        String str = this.versionId;
        if (str != null && !str.equals(appDigest.versionId)) {
            return false;
        }
        List<String> list = this.signatures;
        List<String> list2 = appDigest.signatures;
        return list != null ? list.equals(list2) : list2 == null;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("AppDigest{packageName='");
        g.a.a.a.a.p(i2, this.packageName, '\'', ", versionCode=");
        i2.append(this.versionCode);
        i2.append(", signatures=");
        i2.append(this.signatures);
        i2.append(", versionId='");
        i2.append(this.versionId);
        i2.append('\'');
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.packageName);
        parcel.writeInt(this.versionCode);
        parcel.writeStringList(this.signatures);
        parcel.writeString(this.versionId);
    }
}
