package com.apkpure.aegon.cms.activity.picture_browse;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.trpcprotocol.projecta.common.bannerimage.nano.BannerImage;
import com.tencent.trpcprotocol.projecta.common.commentimage.nano.CommentImage;
import com.tencent.trpcprotocol.projecta.common.imageinfo.nano.ImageInfo;
import com.tencent.trpcprotocol.projecta.common.tube.nano.TubeInfo;
import java.util.ArrayList;
import java.util.List;

public class PictureBrowseConfigBean implements Parcelable {
    public static final Parcelable.Creator<PictureBrowseConfigBean> CREATOR = new a();
    private String cmsType;
    /* access modifiers changed from: private */
    public boolean isAutoPlayVideo;
    /* access modifiers changed from: private */
    public List<PictureBean> pictureBeanList;
    /* access modifiers changed from: private */
    public int selectIndex;

    public static class a implements Parcelable.Creator<PictureBrowseConfigBean> {
        public Object createFromParcel(Parcel parcel) {
            return new PictureBrowseConfigBean(parcel);
        }

        public Object[] newArray(int i2) {
            return new PictureBrowseConfigBean[i2];
        }
    }

    public static class b {
        public PictureBrowseConfigBean a;

        public b() {
            PictureBrowseConfigBean pictureBrowseConfigBean = new PictureBrowseConfigBean();
            this.a = pictureBrowseConfigBean;
            if (pictureBrowseConfigBean.pictureBeanList == null) {
                List unused = this.a.pictureBeanList = new ArrayList();
            }
        }

        public <T> b a(T t) {
            int i2;
            String str;
            ImageInfo imageInfo;
            String str2;
            ImageInfo imageInfo2;
            String str3;
            PictureBean pictureBean = new PictureBean();
            if (t instanceof BannerImage) {
                BannerImage bannerImage = (BannerImage) t;
                pictureBean.originalUrl = bannerImage.original.url;
                str = bannerImage.thumbnail.url;
            } else if (t instanceof TubeInfo) {
                TubeInfo tubeInfo = (TubeInfo) t;
                CommentImage commentImage = tubeInfo.imageInfo;
                if (!(commentImage == null || (imageInfo2 = commentImage.original) == null || (str3 = imageInfo2.url) == null)) {
                    pictureBean.originalUrl = str3;
                }
                if (!(commentImage == null || (imageInfo = commentImage.thumbnail) == null || (str2 = imageInfo.url) == null)) {
                    pictureBean.thumbnailUrl = str2;
                }
                pictureBean.videoId = tubeInfo.id;
                pictureBean.lengthSeconds = tubeInfo.lengthSeconds;
                pictureBean.platform = tubeInfo.platform;
                pictureBean.playUrl = tubeInfo.playUrl;
                i2 = 1;
                pictureBean.type = i2;
                this.a.pictureBeanList.add(pictureBean);
                return this;
            } else {
                if (t instanceof String) {
                    pictureBean.originalUrl = t.toString();
                    str = t.toString();
                }
                this.a.pictureBeanList.add(pictureBean);
                return this;
            }
            pictureBean.thumbnailUrl = str;
            i2 = 0;
            pictureBean.type = i2;
            this.a.pictureBeanList.add(pictureBean);
            return this;
        }
    }

    public PictureBrowseConfigBean() {
    }

    public PictureBrowseConfigBean(Parcel parcel) {
        this.selectIndex = parcel.readInt();
        this.pictureBeanList = parcel.createTypedArrayList(PictureBean.CREATOR);
        this.isAutoPlayVideo = parcel.readByte() != 0;
        this.cmsType = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public List<PictureBean> f() {
        return this.pictureBeanList;
    }

    public int g() {
        return this.selectIndex;
    }

    public boolean h() {
        return this.isAutoPlayVideo;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.selectIndex);
        parcel.writeTypedList(this.pictureBeanList);
        parcel.writeByte(this.isAutoPlayVideo ? (byte) 1 : 0);
        parcel.writeString(this.cmsType);
    }
}
