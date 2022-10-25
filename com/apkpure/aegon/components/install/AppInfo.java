package com.apkpure.aegon.components.install;

import android.os.Parcel;
import android.os.Parcelable;
import com.apkpure.aegon.components.models.AppDigest;
import java.util.ArrayList;
import java.util.List;

public class AppInfo implements Parcelable {
    public static final Parcelable.Creator<AppInfo> CREATOR = new a();
    public List<String> apksFilePath;
    public long appLength;
    public long firstInstallTime;
    public String iconUrl;
    public boolean isCoreApp;
    public boolean isEnabled;
    public boolean isExpandApks;
    public boolean isExpandXApk;
    public boolean isObbExists;
    public boolean isSystemApp;
    public boolean isUninstalled;
    public boolean isUploadFile;
    public String label;
    public long lastUpdateTime;
    public String minSdkVersion;
    public String packageName;
    public List<String> permissionsArrays;
    public List<String> signatures;
    public String sourceDir;
    public String[] splitSourceDirs;
    public String targetSdkVersion;
    public int versionCode;
    public String versionName;
    public String xApkFileName;
    public String xApkMainObbAbsolutePath;
    public String xApkMainObbPath;
    public long xApkObbSize;
    public String xApkPatchObbAbsolutePath;
    public String xApkPatchObbPath;

    public static class a implements Parcelable.Creator<AppInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new AppInfo(parcel);
        }

        public Object[] newArray(int i2) {
            return new AppInfo[i2];
        }
    }

    public AppInfo() {
    }

    public AppInfo(Parcel parcel) {
        this.label = parcel.readString();
        this.iconUrl = parcel.readString();
        this.versionName = parcel.readString();
        this.versionCode = parcel.readInt();
        this.packageName = parcel.readString();
        if (this.signatures == null) {
            this.signatures = new ArrayList();
        }
        parcel.readStringList(this.signatures);
        this.firstInstallTime = parcel.readLong();
        this.lastUpdateTime = parcel.readLong();
        boolean z = true;
        this.isSystemApp = parcel.readByte() != 0;
        this.isCoreApp = parcel.readByte() != 0;
        this.isEnabled = parcel.readByte() != 0;
        this.isUninstalled = parcel.readByte() != 0;
        this.appLength = parcel.readLong();
        this.sourceDir = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            String[] strArr = new String[readInt];
            this.splitSourceDirs = strArr;
            parcel.readStringArray(strArr);
        }
        this.isUploadFile = parcel.readByte() != 0;
        this.targetSdkVersion = parcel.readString();
        this.minSdkVersion = parcel.readString();
        this.isExpandXApk = parcel.readByte() != 0;
        this.xApkMainObbPath = parcel.readString();
        this.xApkMainObbAbsolutePath = parcel.readString();
        this.xApkPatchObbPath = parcel.readString();
        this.xApkPatchObbAbsolutePath = parcel.readString();
        this.xApkObbSize = parcel.readLong();
        this.xApkFileName = parcel.readString();
        if (this.permissionsArrays == null) {
            this.permissionsArrays = new ArrayList();
        }
        parcel.readStringList(this.permissionsArrays);
        if (this.apksFilePath == null) {
            this.apksFilePath = new ArrayList();
        }
        parcel.readStringList(this.apksFilePath);
        this.isObbExists = parcel.readByte() != 0;
        this.isExpandApks = parcel.readByte() == 0 ? false : z;
    }

    public AppDigest a() {
        return AppDigest.e(this.packageName, this.versionCode, this.signatures, "");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return obj instanceof AppInfo ? a().equals(((AppInfo) obj).a()) : super.equals(obj);
    }

    public String toString() {
        return String.format("%s - %s [%s]", new Object[]{this.label, this.packageName, String.valueOf(this.versionCode)});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.label);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.versionName);
        parcel.writeInt(this.versionCode);
        parcel.writeString(this.packageName);
        parcel.writeStringList(this.signatures);
        parcel.writeLong(this.firstInstallTime);
        parcel.writeLong(this.lastUpdateTime);
        parcel.writeByte(this.isSystemApp ? (byte) 1 : 0);
        parcel.writeByte(this.isCoreApp ? (byte) 1 : 0);
        parcel.writeByte(this.isEnabled ? (byte) 1 : 0);
        parcel.writeByte(this.isUninstalled ? (byte) 1 : 0);
        parcel.writeLong(this.appLength);
        parcel.writeString(this.sourceDir);
        parcel.writeStringArray(this.splitSourceDirs);
        parcel.writeByte(this.isUploadFile ? (byte) 1 : 0);
        parcel.writeString(this.targetSdkVersion);
        parcel.writeString(this.minSdkVersion);
        parcel.writeByte(this.isExpandXApk ? (byte) 1 : 0);
        parcel.writeString(this.xApkMainObbPath);
        parcel.writeString(this.xApkMainObbAbsolutePath);
        parcel.writeString(this.xApkPatchObbPath);
        parcel.writeString(this.xApkPatchObbAbsolutePath);
        parcel.writeLong(this.xApkObbSize);
        parcel.writeString(this.xApkFileName);
        parcel.writeStringList(this.permissionsArrays);
        parcel.writeStringList(this.apksFilePath);
        parcel.writeByte(this.isObbExists ? (byte) 1 : 0);
        parcel.writeByte(this.isExpandApks ? (byte) 1 : 0);
    }
}
