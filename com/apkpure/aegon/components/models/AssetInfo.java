package com.apkpure.aegon.components.models;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import g.e.c.s.c;

public class AssetInfo implements Parcelable, Object {
    public static final Parcelable.Creator<AssetInfo> CREATOR = new a();
    @c("file_path")
    @g.e.c.s.a
    public String filePath;
    public Drawable icon;
    public String iconUrl;
    public boolean isInstallSplitXApk;
    public boolean isInstallXapkObb;
    @c("label")
    @g.e.c.s.a
    public String label;
    public long lastModified;
    @c("package_name")
    @g.e.c.s.a
    public String packageName;
    @c("size")
    @g.e.c.s.a
    public long size;
    @c("type")
    @g.e.c.s.a
    public String type;
    @c("version_code")
    @g.e.c.s.a
    public int versionCode;
    @c("versionId")
    @g.e.c.s.a
    public String versionId;
    @c("version_name")
    @g.e.c.s.a
    public String versionName;

    public static class a implements Parcelable.Creator<AssetInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new AssetInfo(parcel, (a) null);
        }

        public Object[] newArray(int i2) {
            return new AssetInfo[i2];
        }
    }

    public AssetInfo() {
    }

    public AssetInfo(Parcel parcel, a aVar) {
        this.packageName = parcel.readString();
        this.filePath = parcel.readString();
        this.label = parcel.readString();
        this.size = parcel.readLong();
        this.versionName = parcel.readString();
        this.versionCode = parcel.readInt();
        this.type = parcel.readString();
        this.iconUrl = parcel.readString();
        boolean z = false;
        this.isInstallSplitXApk = parcel.readByte() != 0;
        this.isInstallXapkObb = parcel.readByte() != 0 ? true : z;
        this.lastModified = parcel.readLong();
        this.versionId = parcel.readString();
    }

    public int compare(Object obj, Object obj2) {
        AssetInfo assetInfo = (AssetInfo) obj;
        AssetInfo assetInfo2 = (AssetInfo) obj2;
        if (assetInfo == null && assetInfo2 == null) {
            return 0;
        }
        if (assetInfo == null) {
            return 1;
        }
        if (assetInfo2 == null) {
            return -1;
        }
        return Long.compare(assetInfo2.lastModified, assetInfo.lastModified);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj == null || !(obj instanceof AssetInfo)) ? super.equals(obj) : this.filePath.equals(((AssetInfo) obj).filePath);
    }

    public String toString() {
        return String.format("%s - %s [%s]", new Object[]{this.filePath, this.packageName, String.valueOf(this.versionCode)});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.packageName);
        parcel.writeString(this.filePath);
        parcel.writeString(this.label);
        parcel.writeLong(this.size);
        parcel.writeString(this.versionName);
        parcel.writeInt(this.versionCode);
        parcel.writeString(this.type);
        parcel.writeString(this.iconUrl);
        parcel.writeByte(this.isInstallSplitXApk ? (byte) 1 : 0);
        parcel.writeByte(this.isInstallXapkObb ? (byte) 1 : 0);
        parcel.writeLong(this.lastModified);
        parcel.writeString(this.versionId);
    }
}
