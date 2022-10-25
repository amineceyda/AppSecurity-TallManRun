package com.apkpure.aegon.components.utils.device;

import android.os.Parcel;
import android.os.Parcelable;

public class StorageBean implements Parcelable {
    public static final Parcelable.Creator<StorageBean> CREATOR = new a();
    private long availableSize;
    private String mounted;
    private String path;
    private boolean removable;
    private long totalSize;

    public static class a implements Parcelable.Creator<StorageBean> {
        public Object createFromParcel(Parcel parcel) {
            return new StorageBean(parcel);
        }

        public Object[] newArray(int i2) {
            return new StorageBean[i2];
        }
    }

    public StorageBean() {
    }

    public StorageBean(Parcel parcel) {
        this.path = parcel.readString();
        this.mounted = parcel.readString();
        this.removable = parcel.readByte() != 0;
        this.totalSize = parcel.readLong();
        this.availableSize = parcel.readLong();
    }

    public String a() {
        return this.path;
    }

    public void b(long j2) {
        this.availableSize = j2;
    }

    public void c(String str) {
        this.mounted = str;
    }

    public void d(String str) {
        this.path = str;
    }

    public int describeContents() {
        return 0;
    }

    public void e(boolean z) {
        this.removable = z;
    }

    public void f(long j2) {
        this.totalSize = j2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.path);
        parcel.writeString(this.mounted);
        parcel.writeByte(this.removable ? (byte) 1 : 0);
        parcel.writeLong(this.totalSize);
        parcel.writeLong(this.availableSize);
    }
}
