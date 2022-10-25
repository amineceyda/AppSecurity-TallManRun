package com.apkpure.aegon.main.launcher;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import g.e.c.s.c;
import java.util.LinkedHashMap;

public class PageConfig implements Parcelable {
    public static final Parcelable.Creator<PageConfig> CREATOR = new a();
    /* access modifiers changed from: private */
    @c("arguments")
    @g.e.c.s.a
    public LinkedHashMap<String, String> arguments;
    /* access modifiers changed from: private */
    @c("title")
    @g.e.c.s.a
    public String title;
    /* access modifiers changed from: private */
    @c("type")
    @g.e.c.s.a
    public String type;

    public static class a implements Parcelable.Creator<PageConfig> {
        public Object createFromParcel(Parcel parcel) {
            return new PageConfig(parcel, (a) null);
        }

        public Object[] newArray(int i2) {
            return new PageConfig[i2];
        }
    }

    public static class b {
        public PageConfig a = new PageConfig((a) null);

        public b(Context context) {
        }
    }

    public PageConfig() {
    }

    public PageConfig(Parcel parcel, a aVar) {
        this.title = parcel.readString();
        this.type = parcel.readString();
        if (this.arguments == null) {
            this.arguments = new LinkedHashMap<>();
        }
        LinkedHashMap<String, String> linkedHashMap = this.arguments;
        parcel.readMap(linkedHashMap, linkedHashMap.getClass().getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.title);
        parcel.writeString(this.type);
        if (this.arguments == null) {
            this.arguments = new LinkedHashMap<>();
        }
        parcel.writeMap(this.arguments);
    }

    public PageConfig(a aVar) {
    }
}
