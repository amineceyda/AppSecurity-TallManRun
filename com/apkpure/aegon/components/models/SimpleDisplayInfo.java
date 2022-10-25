package com.apkpure.aegon.components.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import com.tencent.trpcprotocol.projecta.common.bannerimage.nano.BannerImage;
import com.tencent.trpcprotocol.projecta.common.cmsresponse.nano.CmsItemList;
import com.tencent.trpcprotocol.projecta.common.imageinfo.nano.ImageInfo;
import g.e.c.s.c;

public class SimpleDisplayInfo implements Parcelable {
    public static final Parcelable.Creator<SimpleDisplayInfo> CREATOR = new a();
    private CmsItemList cmsItemList;
    @c("cmsItemList_bytes")
    @g.e.c.s.a
    private byte[] cmsItemListByte;
    @c("download_count")
    @g.e.c.s.a
    private long downloadCount;
    @c("editor_recommend_info")
    @g.e.c.s.a
    private String editorRecommendInfo;
    @c("icon_url")
    @g.e.c.s.a
    private String iconUrl;
    @c("is_pack_name_icon")
    @g.e.c.s.a
    private boolean isPackNameIcon;
    @c("native_code")
    @g.e.c.s.a
    private String[] nativeCode;
    @c("pack_name")
    @g.e.c.s.a
    private String packName;
    @c("recommend_type")
    @g.e.c.s.a
    private String recommendType;
    @c("select_tab_from")
    @g.e.c.s.a
    private int selectTabFrom;
    @c("title")
    @g.e.c.s.a
    private String title;
    @c("version_code")
    @g.e.c.s.a
    private String versionCode;
    @c("version_id")
    @g.e.c.s.a
    private String versionId;

    public static class a implements Parcelable.Creator<SimpleDisplayInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new SimpleDisplayInfo(parcel);
        }

        public Object[] newArray(int i2) {
            return new SimpleDisplayInfo[i2];
        }
    }

    public SimpleDisplayInfo() {
    }

    public SimpleDisplayInfo(Parcel parcel) {
        this.title = parcel.readString();
        this.iconUrl = parcel.readString();
        this.packName = parcel.readString();
        this.versionCode = parcel.readString();
        this.cmsItemListByte = parcel.createByteArray();
        this.selectTabFrom = parcel.readInt();
        this.recommendType = parcel.readString();
        this.editorRecommendInfo = parcel.readString();
        this.isPackNameIcon = parcel.readByte() != 0;
        this.versionId = parcel.readString();
        this.downloadCount = parcel.readLong();
        this.nativeCode = parcel.createStringArray();
    }

    public static SimpleDisplayInfo f(AppDetailInfo appDetailInfo) {
        int i2;
        ImageInfo imageInfo;
        String str;
        if (appDetailInfo == null || appDetailInfo.packageName == null) {
            return new SimpleDisplayInfo();
        }
        try {
            i2 = Integer.parseInt(appDetailInfo.versionCode);
        } catch (Exception unused) {
            i2 = -1;
        }
        String str2 = appDetailInfo.label;
        String str3 = null;
        if (str2 == null) {
            str2 = null;
        }
        BannerImage bannerImage = appDetailInfo.icon;
        if (!(bannerImage == null || (imageInfo = bannerImage.original) == null || (str = imageInfo.url) == null)) {
            str3 = str;
        }
        SimpleDisplayInfo g2 = g(str2, str3, appDetailInfo.packageName);
        g2.versionCode = String.valueOf(i2);
        g2.versionId = appDetailInfo.versionId;
        g2.downloadCount = appDetailInfo.downloadCount;
        g2.nativeCode = appDetailInfo.nativeCode;
        return g2;
    }

    public static SimpleDisplayInfo g(String str, String str2, String str3) {
        return h(str, str2, str3, (String) null, (byte[]) null, 0, (String) null, (String) null, false, (String) null, 0, (String[]) null);
    }

    public static SimpleDisplayInfo h(String str, String str2, String str3, String str4, byte[] bArr, int i2, String str5, String str6, boolean z, String str7, long j2, String[] strArr) {
        SimpleDisplayInfo simpleDisplayInfo = new SimpleDisplayInfo();
        simpleDisplayInfo.title = str;
        simpleDisplayInfo.iconUrl = str2;
        simpleDisplayInfo.packName = str3;
        simpleDisplayInfo.versionCode = null;
        simpleDisplayInfo.cmsItemListByte = null;
        simpleDisplayInfo.selectTabFrom = i2;
        simpleDisplayInfo.recommendType = null;
        simpleDisplayInfo.editorRecommendInfo = null;
        simpleDisplayInfo.isPackNameIcon = z;
        simpleDisplayInfo.versionId = null;
        simpleDisplayInfo.downloadCount = j2;
        simpleDisplayInfo.nativeCode = null;
        return simpleDisplayInfo;
    }

    public String a() {
        return this.iconUrl;
    }

    public String b() {
        return this.packName;
    }

    public String c() {
        return this.title;
    }

    public String d() {
        return this.versionCode;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.versionId;
    }

    public void i(int i2) {
        this.selectTabFrom = i2;
    }

    public void j(String str) {
        this.versionCode = str;
    }

    public void k(String str) {
        this.versionId = str;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.title);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.packName);
        parcel.writeString(this.versionCode);
        parcel.writeByteArray(this.cmsItemListByte);
        parcel.writeInt(this.selectTabFrom);
        parcel.writeString(this.recommendType);
        parcel.writeString(this.editorRecommendInfo);
        parcel.writeByte(this.isPackNameIcon ? (byte) 1 : 0);
        parcel.writeString(this.versionId);
        parcel.writeLong(this.downloadCount);
        parcel.writeStringArray(this.nativeCode);
    }
}
