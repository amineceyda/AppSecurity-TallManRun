package com.apkpure.aegon.components.download.model;

import android.os.Parcel;
import android.os.Parcelable;
import g.e.c.s.c;

public class UploadApkParam implements Parcelable {
    public static final Parcelable.Creator<UploadApkParam> CREATOR = new a();
    @c("file_path")
    @g.e.c.s.a
    private String filePath;
    @c("install_xapk_path")
    @g.e.c.s.a
    private String installXApkPath;
    @c("is_expand_xapk")
    @g.e.c.s.a
    private boolean isInstallAppExpandXApk;
    @c("label")
    @g.e.c.s.a
    private String label;
    @c("package_name")
    @g.e.c.s.a
    private String packageName;
    @c("version_code")
    @g.e.c.s.a
    private int versionCode;
    @c("version_name")
    @g.e.c.s.a
    private String versionName;

    public static class a implements Parcelable.Creator<UploadApkParam> {
        public Object createFromParcel(Parcel parcel) {
            return new UploadApkParam(parcel);
        }

        public Object[] newArray(int i2) {
            return new UploadApkParam[i2];
        }
    }

    public UploadApkParam() {
    }

    public UploadApkParam(Parcel parcel) {
        this.label = parcel.readString();
        this.versionCode = parcel.readInt();
        this.versionName = parcel.readString();
        this.packageName = parcel.readString();
        this.filePath = parcel.readString();
        this.isInstallAppExpandXApk = parcel.readByte() != 0;
        this.installXApkPath = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.label);
        parcel.writeInt(this.versionCode);
        parcel.writeString(this.versionName);
        parcel.writeString(this.packageName);
        parcel.writeString(this.filePath);
        parcel.writeByte(this.isInstallAppExpandXApk ? (byte) 1 : 0);
        parcel.writeString(this.installXApkPath);
    }
}
