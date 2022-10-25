package com.apkpure.aegon.cms.activity.picture_browse;

import android.os.Parcel;
import android.os.Parcelable;

public class PictureBean implements Parcelable {
    public static final Parcelable.Creator<PictureBean> CREATOR = new a();
    public static final int IMAGE = 0;
    public static final int VIDEO = 1;
    public String lengthSeconds;
    public String originalUrl;
    public String platform;
    public String playUrl;
    public String thumbnailUrl;
    public int type;
    public String videoId;

    public static class a implements Parcelable.Creator<PictureBean> {
        public Object createFromParcel(Parcel parcel) {
            return new PictureBean(parcel);
        }

        public Object[] newArray(int i2) {
            return new PictureBean[i2];
        }
    }

    public PictureBean() {
    }

    public PictureBean(Parcel parcel) {
        this.thumbnailUrl = parcel.readString();
        this.originalUrl = parcel.readString();
        this.type = parcel.readInt();
        this.videoId = parcel.readString();
        this.lengthSeconds = parcel.readString();
        this.platform = parcel.readString();
        this.playUrl = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.thumbnailUrl);
        parcel.writeString(this.originalUrl);
        parcel.writeInt(this.type);
        parcel.writeString(this.videoId);
        parcel.writeString(this.lengthSeconds);
        parcel.writeString(this.platform);
        parcel.writeString(this.playUrl);
    }
}
