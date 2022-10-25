package com.apkpure.aegon.components.models;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.trpcprotocol.projecta.common.assetinfo.nano.AssetInfo;
import g.c.a.e.k.f.b;
import g.e.c.s.c;
import java.io.File;
import java.io.FileInputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public class Asset implements Parcelable {
    public static final Parcelable.Creator<Asset> CREATOR = new a();
    public static final String TYPE_APK = "APK";
    public static final String TYPE_XAPK = "XAPK";
    @c("expiry_date")
    @g.e.c.s.a
    private String expiryDate;
    @c("name")
    @g.e.c.s.a
    private String name;
    @c("sha1")
    @g.e.c.s.a
    private String sha1;
    @c("size")
    @g.e.c.s.a
    private long size = -1;
    @c("thread_count")
    @g.e.c.s.a
    private int threadCount = 1;
    @c("torrent_url")
    @g.e.c.s.a
    private String torrentUrl;
    @c("trackers")
    @g.e.c.s.a
    private List<String> trackers;
    @c("type")
    @g.e.c.s.a
    private String type;
    @c("url")
    @g.e.c.s.a
    private String url;
    @c("url_seed")
    @g.e.c.s.a
    private String urlSeed;
    @c("_urls")
    @g.e.c.s.a
    private String[] urls;

    public static class a implements Parcelable.Creator<Asset> {
        public Object createFromParcel(Parcel parcel) {
            return new Asset(parcel, (a) null);
        }

        public Object[] newArray(int i2) {
            return new Asset[i2];
        }
    }

    public Asset() {
    }

    public Asset(Parcel parcel, a aVar) {
        this.url = parcel.readString();
        this.expiryDate = parcel.readString();
        this.name = parcel.readString();
        this.type = parcel.readString();
        this.size = parcel.readLong();
        this.sha1 = parcel.readString();
        this.torrentUrl = parcel.readString();
        this.urlSeed = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.trackers = arrayList;
        parcel.readStringList(arrayList);
        this.threadCount = parcel.readInt();
        this.urls = parcel.createStringArray();
    }

    public static Asset i(AssetInfo assetInfo) {
        Asset asset = new Asset();
        asset.url = assetInfo.url;
        asset.expiryDate = assetInfo.expiryDate;
        asset.name = assetInfo.name;
        asset.type = assetInfo.type;
        asset.size = assetInfo.size;
        asset.sha1 = assetInfo.sha1;
        asset.torrentUrl = assetInfo.torrentUrl;
        asset.urlSeed = assetInfo.urlSeed;
        String[] strArr = assetInfo.trackers;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, strArr);
        asset.trackers = arrayList;
        asset.threadCount = (int) assetInfo.threadCount;
        asset.urls = assetInfo.urls;
        return asset;
    }

    public String a() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = this.name;
        String path = Uri.parse(this.url).getPath();
        MessageDigest messageDigest = g.c.a.e.k.b.a.a;
        byte[] bytes = path.getBytes();
        MessageDigest c = g.c.a.e.k.b.a.c();
        String str2 = null;
        if (c == null) {
            str = null;
        } else {
            String a2 = g.c.a.e.k.b.a.a(c.digest(bytes));
            str = "";
            for (int i2 = 0; i2 < 8; i2++) {
                int i3 = i2 * 4;
                long parseLong = 1073741823 & Long.parseLong(a2.substring(i3, i3 + 4), 16);
                StringBuilder i4 = g.a.a.a.a.i(str);
                i4.append(g.c.a.e.k.b.a.c[Integer.valueOf((parseLong % 16) + "").intValue()]);
                i4.append("");
                str = i4.toString();
            }
        }
        objArr[1] = str;
        String replaceAll = String.format("%s_%s", objArr).trim().replaceAll("[\\s`~!@#$%^&*()+=|{}':;',\\\\[\\\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]", "_");
        if (TYPE_APK.equals(this.type)) {
            str2 = "apk";
        } else if (TYPE_XAPK.equals(this.type)) {
            str2 = "xapk";
        }
        return str2 != null ? g.a.a.a.a.c(replaceAll, ".", str2) : replaceAll;
    }

    public String b() {
        return g.c.a.e.k.b.a.b(g.c.a.e.k.b.a.c(), Uri.parse(this.url).getPath());
    }

    public String c() {
        return this.name;
    }

    public long d() {
        return this.size;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.type;
    }

    public boolean equals(Object obj) {
        return (obj == null || !(obj instanceof Asset)) ? super.equals(obj) : b().equals(((Asset) obj).b());
    }

    public String f() {
        return this.url;
    }

    public boolean g() {
        Date date;
        String str = this.expiryDate;
        String[] strArr = g.c.a.e.k.c.a.a;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                date = null;
                break;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(strArr[i2], Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            try {
                date = simpleDateFormat.parse(str);
                break;
            } catch (Exception unused) {
                i2++;
            }
        }
        if (date == null || new Date().compareTo(date) <= 0) {
            return false;
        }
        return true;
    }

    public boolean h() {
        return new ArrayList(Arrays.asList(new String[]{TYPE_APK, TYPE_XAPK})).contains(this.type);
    }

    public boolean j(File file) {
        String str;
        String str2 = this.sha1;
        if (str2 == null || str2.isEmpty()) {
            return true;
        }
        try {
            DigestInputStream digestInputStream = new DigestInputStream(new FileInputStream(file), g.c.a.e.k.b.a.d());
            while (digestInputStream.read(new byte[16384]) != -1) {
            }
            str = g.c.a.e.k.b.a.a(digestInputStream.getMessageDigest().digest());
        } catch (Exception unused) {
            str = null;
        }
        if (str == null || !str.equals(this.sha1)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return String.format("%s (%s)", new Object[]{a(), b.a(this.size)});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.url);
        parcel.writeString(this.expiryDate);
        parcel.writeString(this.name);
        parcel.writeString(this.type);
        parcel.writeLong(this.size);
        parcel.writeString(this.sha1);
        parcel.writeString(this.torrentUrl);
        parcel.writeString(this.urlSeed);
        parcel.writeStringList(this.trackers);
        parcel.writeInt(this.threadCount);
        parcel.writeStringArray(this.urls);
    }
}
