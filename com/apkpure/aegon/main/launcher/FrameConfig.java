package com.apkpure.aegon.main.launcher;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.apkpure.aegon.main.launcher.PageConfig;
import g.e.c.s.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class FrameConfig implements Parcelable {
    public static final Parcelable.Creator<FrameConfig> CREATOR = new a();
    @c("is_root")
    @g.e.c.s.a
    private boolean isRoot = false;
    /* access modifiers changed from: private */
    @c("pages")
    @g.e.c.s.a
    public List<PageConfig> pages;
    @c("subtitle")
    @g.e.c.s.a
    private String subtitle;
    /* access modifiers changed from: private */
    @c("title")
    @g.e.c.s.a
    public String title;

    public static class a implements Parcelable.Creator<FrameConfig> {
        public Object createFromParcel(Parcel parcel) {
            return new FrameConfig(parcel);
        }

        public Object[] newArray(int i2) {
            return new FrameConfig[i2];
        }
    }

    public static class b {
        public Context a;
        public FrameConfig b = new FrameConfig((a) null);
        public PageConfig.b c;

        public b(Context context) {
            this.a = context;
        }

        public b a(String str, String str2) {
            c();
            PageConfig.b bVar = new PageConfig.b(this.a);
            this.c = bVar;
            String unused = bVar.a.title = str;
            String unused2 = bVar.a.type = str2;
            return this;
        }

        public b b(String str, String str2) {
            PageConfig.b bVar = this.c;
            if (bVar != null) {
                if (bVar.a.arguments == null) {
                    LinkedHashMap unused = bVar.a.arguments = new LinkedHashMap();
                }
                bVar.a.arguments.put(str, str2);
            }
            return this;
        }

        public final b c() {
            PageConfig.b bVar = this.c;
            if (bVar != null) {
                PageConfig pageConfig = bVar.a;
                if (pageConfig != null) {
                    if (this.b.pages == null) {
                        List unused = this.b.pages = new ArrayList();
                    }
                    this.b.pages.add(pageConfig);
                }
                this.c = null;
            }
            return this;
        }
    }

    public FrameConfig() {
    }

    public FrameConfig(Parcel parcel) {
        boolean z = false;
        this.title = parcel.readString();
        this.subtitle = parcel.readString();
        this.isRoot = parcel.readByte() != 0 ? true : z;
        this.pages = parcel.createTypedArrayList(PageConfig.CREATOR);
    }

    public FrameConfig(a aVar) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeByte(this.isRoot ? (byte) 1 : 0);
        parcel.writeTypedList(this.pages);
    }
}
