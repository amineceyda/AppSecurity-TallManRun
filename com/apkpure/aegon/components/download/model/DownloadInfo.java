package com.apkpure.aegon.components.download.model;

import android.os.Parcel;
import android.os.Parcelable;
import g.e.c.s.c;

public class DownloadInfo implements Parcelable {
    public static final Parcelable.Creator<DownloadInfo> CREATOR = new a();
    @c("download_average_speed_f")
    @g.e.c.s.a
    public String downloadAverageSpeedF;
    @c("download_average_speed_kb")
    @g.e.c.s.a
    public long downloadAverageSpeedKb;
    @c("download_name")
    @g.e.c.s.a
    public String downloadName;
    @c("download_package_name")
    @g.e.c.s.a
    public String downloadPackageName;
    @c("download_speed")
    @g.e.c.s.a
    public String downloadSpeed;
    @c("download_speed_kb")
    @g.e.c.s.a
    public long downloadSpeedKb;
    @c("download_speed_original")
    @g.e.c.s.a
    public String downloadSpeedOriginal;
    @c("download_status")
    @g.e.c.s.a
    public String downloadStatus;
    @c("engine")
    @g.e.c.s.a
    public String engine;
    @c("has_single_machine")
    @g.e.c.s.a
    public boolean hasSingleMachine;

    public static class a implements Parcelable.Creator<DownloadInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new DownloadInfo(parcel);
        }

        public Object[] newArray(int i2) {
            return new DownloadInfo[i2];
        }
    }

    public DownloadInfo() {
    }

    public DownloadInfo(Parcel parcel) {
        this.downloadStatus = parcel.readString();
        this.engine = parcel.readString();
        this.downloadPackageName = parcel.readString();
        this.downloadName = parcel.readString();
        this.downloadSpeedOriginal = parcel.readString();
        this.downloadSpeed = parcel.readString();
        this.downloadSpeedKb = parcel.readLong();
        this.downloadAverageSpeedKb = parcel.readLong();
        this.downloadAverageSpeedF = parcel.readString();
        this.hasSingleMachine = parcel.readByte() == 1 ? false : true;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.downloadStatus);
        parcel.writeString(this.engine);
        parcel.writeString(this.downloadPackageName);
        parcel.writeString(this.downloadName);
        parcel.writeString(this.downloadSpeedOriginal);
        parcel.writeString(this.downloadSpeed);
        parcel.writeLong(this.downloadSpeedKb);
        parcel.writeLong(this.downloadAverageSpeedKb);
        parcel.writeString(this.downloadAverageSpeedF);
        parcel.writeByte(this.hasSingleMachine ? (byte) 1 : 0);
    }
}
