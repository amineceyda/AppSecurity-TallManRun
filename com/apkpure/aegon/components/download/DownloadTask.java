package com.apkpure.aegon.components.download;

import android.os.Parcel;
import android.os.Parcelable;
import com.apkpure.aegon.components.models.Asset;
import com.apkpure.aegon.components.models.SimpleDisplayInfo;
import com.apkpure.aegon.components.statistics.datong.DTStatInfo;
import java.util.Comparator;
import java.util.Date;

public class DownloadTask implements Parcelable {
    public static final String COMPLETE_ACTION_NONE = "NONE";
    public static final String COMPLETE_ACTION_OPEN = "OPEN";
    public static final Parcelable.Creator<DownloadTask> CREATOR = new a();
    public static final String DOWNLOAD_STATUS_CANCEL = "CANCEL";
    public static final String DOWNLOAD_STATUS_DOWNLOADING = "DOWNLOADING";
    public static final String DOWNLOAD_STATUS_ERROR = "ERROR";
    public static final String DOWNLOAD_STATUS_EXPIRE = "EXPIRE";
    public static final String DOWNLOAD_STATUS_INVALID = "INVALID";
    public static final String DOWNLOAD_STATUS_MISSING = "MISSING";
    public static final String DOWNLOAD_STATUS_PREPARING = "PREPARING";
    public static final String DOWNLOAD_STATUS_SUCCESS = "SUCCESS";
    public static final String DOWNLOAD_STATUS_WAITING = "WAITING";
    public Asset asset;
    public String completeAction;
    public String downloadFilePath;
    public boolean isFirstProgressChanged = false;
    public SimpleDisplayInfo simpleDisplayInfo;
    public DTStatInfo statInfo;
    public String userData;

    public static class a implements Parcelable.Creator<DownloadTask> {
        public Object createFromParcel(Parcel parcel) {
            return new DownloadTask(parcel);
        }

        public Object[] newArray(int i2) {
            return new DownloadTask[i2];
        }
    }

    public static class b implements Comparator<DownloadTask> {
        public int compare(Object obj, Object obj2) {
            DownloadTask downloadTask = (DownloadTask) obj;
            DownloadTask downloadTask2 = (DownloadTask) obj2;
            if (downloadTask == null && downloadTask2 == null) {
                return 0;
            }
            if (downloadTask != null) {
                if (downloadTask2 != null) {
                    if (downloadTask.getDownloadDate() == null && downloadTask2.getDownloadDate() == null) {
                        return 0;
                    }
                    if (downloadTask.getDownloadDate() != null) {
                        if (downloadTask2.getDownloadDate() != null) {
                            return downloadTask.getDownloadDate().compareTo(downloadTask2.getDownloadDate());
                        }
                    }
                }
                return -1;
            }
            return 1;
        }
    }

    public DownloadTask() {
    }

    public DownloadTask(Parcel parcel) {
        boolean z = false;
        this.asset = (Asset) parcel.readParcelable(Asset.class.getClassLoader());
        this.simpleDisplayInfo = (SimpleDisplayInfo) parcel.readParcelable(SimpleDisplayInfo.class.getClassLoader());
        this.completeAction = parcel.readString();
        this.userData = parcel.readString();
        this.downloadFilePath = parcel.readString();
        this.isFirstProgressChanged = parcel.readByte() != 0 ? true : z;
        this.statInfo = (DTStatInfo) parcel.readParcelable(DTStatInfo.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public Asset getAsset() {
        return this.asset;
    }

    public String getCompleteAction() {
        return this.completeAction;
    }

    public Date getDownloadDate() {
        return null;
    }

    public String getDownloadErrorCode() {
        DTStatInfo dTStatInfo = this.statInfo;
        if (dTStatInfo == null) {
            return null;
        }
        return dTStatInfo.downloadErrorCode;
    }

    public String getDownloadFilePath() {
        return this.downloadFilePath;
    }

    public float getDownloadPercent() {
        return 0.0f;
    }

    public long getDownloadSize() {
        return 0;
    }

    public long getDownloadSpeed() {
        return -1;
    }

    public long getRealTimeDownloadSpeed() {
        return -1;
    }

    public SimpleDisplayInfo getSimpleDisplayInfo() {
        return this.simpleDisplayInfo;
    }

    public DTStatInfo getStatInfo() {
        return this.statInfo;
    }

    public long getTotalSize() {
        return 0;
    }

    public String getUserData() {
        return this.userData;
    }

    public boolean isAborted() {
        return false;
    }

    public boolean isCanceled() {
        return false;
    }

    public boolean isDownloading() {
        return false;
    }

    public boolean isExpired() {
        return false;
    }

    public boolean isFailed() {
        return false;
    }

    public boolean isInvalid() {
        return false;
    }

    public boolean isMissing() {
        return false;
    }

    public boolean isPreparing() {
        return false;
    }

    public boolean isSuccess() {
        return false;
    }

    public boolean isWaiting() {
        return false;
    }

    public void setDownloadErrorCode(String str) {
        DTStatInfo dTStatInfo = this.statInfo;
        if (dTStatInfo != null) {
            dTStatInfo.downloadErrorCode = str;
        }
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.asset, 0);
        parcel.writeParcelable(this.simpleDisplayInfo, 0);
        parcel.writeString(this.completeAction);
        parcel.writeString(this.userData);
        parcel.writeString(this.downloadFilePath);
        parcel.writeByte(this.isFirstProgressChanged ? (byte) 1 : 0);
        parcel.writeParcelable(this.statInfo, 0);
    }
}
