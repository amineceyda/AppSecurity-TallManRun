package com.apkpure.aegon.components.statistics.datong;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.raft.measure.utils.MeasureConst;
import g.c.a.e.h.b.e;
import g.c.a.e.k.h.b;
import g.e.c.s.c;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;

public class DTStatInfo implements Cloneable, Parcelable {
    public static final Parcelable.Creator<DTStatInfo> CREATOR = new a();
    @c("active_type")
    @g.e.c.s.a
    public String activeType = String.valueOf(0);
    @c("appId")
    @g.e.c.s.a
    public int appId = -1;
    @c("download_error_code")
    @g.e.c.s.a
    public String downloadErrorCode = "";
    @c("downloadId")
    @g.e.c.s.a
    public String downloadId = "";
    @c("downloadStartTime")
    @g.e.c.s.a
    public long downloadStartTime = -1;
    @c("extended_field")
    @g.e.c.s.a
    private String extendedField = "";
    @g.e.c.s.a(deserialize = false, serialize = false)
    private Map<String, Object> extendedFieldMap = new HashMap();
    @c("is_apks")
    @g.e.c.s.a
    public String isApks = "-1";
    @c("is_retry_download")
    @g.e.c.s.a
    public int isRetryDownload = 0;
    @c("is_update")
    @g.e.c.s.a
    public int isUpdate = -1;
    @c("model_type")
    @g.e.c.s.a
    public int modelType = -1;
    @c("module_name")
    @g.e.c.s.a
    public String moduleName = "";
    @c("open_install_params")
    @g.e.c.s.a
    public String openInstallParams = "2";
    @c("packageId")
    @g.e.c.s.a
    public long packageId = -1;
    @c("pop_type")
    @g.e.c.s.a
    public String popType = "";
    @c("position")
    @g.e.c.s.a
    public String position = "";
    @c("recommend_id")
    @g.e.c.s.a
    public String recommendId = "";
    @c("report_element")
    @g.e.c.s.a
    public String reportElement = "open_install_button";
    @c("scene")
    @g.e.c.s.a
    public long scene = 0;
    @c("search_id")
    @g.e.c.s.a
    public String searchId = "";
    @c("search_input_keyword")
    @g.e.c.s.a
    public String searchInputKeyword = "";
    @c("search_request_keyword")
    @g.e.c.s.a
    public String searchRequestKeyword = "";
    @c("search_type")
    @g.e.c.s.a
    public String searchType = "";
    @c("small_position")
    @g.e.c.s.a
    public String smallPosition = "";
    @c("source_model_type")
    @g.e.c.s.a
    public int sourceModelType = -1;
    @c("source_module_name")
    @g.e.c.s.a
    public String sourceModuleName = "";
    @c("source_position")
    @g.e.c.s.a
    public String sourcePosition = "";
    @c("source_scene")
    @g.e.c.s.a
    public long sourceScene = 0;
    @c("source_small_position")
    @g.e.c.s.a
    public String sourceSmallPosition = "";

    public static class a implements Parcelable.Creator<DTStatInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new DTStatInfo(parcel);
        }

        public Object[] newArray(int i2) {
            return new DTStatInfo[i2];
        }
    }

    public DTStatInfo() {
    }

    public DTStatInfo(Parcel parcel) {
        this.downloadId = parcel.readString();
        this.appId = parcel.readInt();
        this.packageId = parcel.readLong();
        this.downloadStartTime = parcel.readLong();
        this.scene = parcel.readLong();
        this.position = parcel.readString();
        this.smallPosition = parcel.readString();
        this.sourceScene = parcel.readLong();
        this.sourcePosition = parcel.readString();
        this.sourceSmallPosition = parcel.readString();
        this.modelType = parcel.readInt();
        this.sourceModelType = parcel.readInt();
        this.moduleName = parcel.readString();
        this.sourceModuleName = parcel.readString();
        this.extendedField = parcel.readString();
        this.isRetryDownload = parcel.readInt();
        this.isUpdate = parcel.readInt();
        this.isApks = parcel.readString();
        this.openInstallParams = parcel.readString();
        this.recommendId = parcel.readString();
        this.reportElement = parcel.readString();
        this.activeType = parcel.readString();
        this.searchId = parcel.readString();
        this.searchInputKeyword = parcel.readString();
        this.searchRequestKeyword = parcel.readString();
        this.searchType = parcel.readString();
        this.downloadErrorCode = parcel.readString();
        this.popType = parcel.readString();
    }

    public DTStatInfo(g.c.a.e.h.b.a aVar) {
        if (aVar != null) {
            this.scene = aVar.scene;
            this.position = aVar.position;
            this.smallPosition = aVar.smallPosition;
            this.sourceScene = aVar.sourceScene;
            this.sourcePosition = aVar.sourcePosition;
            this.sourceSmallPosition = aVar.sourceSmallPosition;
            this.modelType = aVar.modelType;
            this.sourceModelType = aVar.sourceModelType;
            this.moduleName = aVar.moduleName;
            this.sourceModuleName = aVar.sourceModuleName;
            this.recommendId = aVar.sourceRecommendId;
            this.activeType = aVar.activeType;
            this.searchId = aVar.searchId;
            this.searchInputKeyword = aVar.searchInputKeyword;
            this.searchRequestKeyword = aVar.searchRequestKeyword;
            this.searchType = aVar.searchType;
            this.popType = aVar.pop_type;
        }
    }

    public static DTStatInfo a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new DTStatInfo();
        }
        DTStatInfo dTStatInfo = (DTStatInfo) b.b(str, DTStatInfo.class);
        if (dTStatInfo != null && !TextUtils.isEmpty(dTStatInfo.extendedField)) {
            String str2 = dTStatInfo.extendedField;
            Logger logger = e.a;
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(str2)) {
                String[] split = str2.split("&");
                for (String split2 : split) {
                    String[] split3 = split2.split("=");
                    if (split3.length == 2) {
                        String str3 = split3[0];
                        String str4 = split3[1];
                        if (str4 == null || str4.isEmpty()) {
                            str4 = "";
                        } else {
                            try {
                                str4 = URLDecoder.decode(str4, Charset.forName(MeasureConst.CHARSET_UTF8).name());
                            } catch (Exception e2) {
                                e.a.warn("TextUtil", (Object) "encodeStr: " + e2);
                            }
                        }
                        hashMap.put(str3, str4);
                    }
                }
            }
            Map<String, Object> map = dTStatInfo.extendedFieldMap;
            if (map != null) {
                map.putAll(hashMap);
            }
        }
        return dTStatInfo;
    }

    public String b() {
        return this.extendedField;
    }

    public void c(Map<String, Object> map) {
        Map<String, Object> map2 = this.extendedFieldMap;
        if (map2 != null) {
            map2.clear();
        } else {
            this.extendedFieldMap = new HashMap();
        }
        String str = null;
        this.extendedField = null;
        if (!map.isEmpty()) {
            for (Map.Entry next : map.entrySet()) {
                String str2 = (String) next.getKey();
                Object value = next.getValue();
                if (!TextUtils.isEmpty(str2) && value != null) {
                    this.extendedFieldMap.put(str2, value);
                }
            }
            Map<String, Object> map3 = this.extendedFieldMap;
            Logger logger = e.a;
            if (map3 != null && !map3.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                boolean z = true;
                for (Map.Entry next2 : map3.entrySet()) {
                    String str3 = (String) next2.getKey();
                    Object value2 = next2.getValue();
                    if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(value2.toString())) {
                        if (z) {
                            z = false;
                        } else {
                            sb.append("&");
                        }
                        sb.append(e.a(str3));
                        sb.append("=");
                        sb.append(e.a(value2.toString()));
                    }
                }
                str = sb.toString();
            }
            this.extendedField = str;
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.downloadId);
        parcel.writeInt(this.appId);
        parcel.writeLong(this.packageId);
        parcel.writeLong(this.downloadStartTime);
        parcel.writeLong(this.scene);
        parcel.writeString(this.position);
        parcel.writeString(this.smallPosition);
        parcel.writeLong(this.sourceScene);
        parcel.writeString(this.sourcePosition);
        parcel.writeString(this.sourceSmallPosition);
        parcel.writeInt(this.modelType);
        parcel.writeInt(this.sourceModelType);
        parcel.writeString(this.moduleName);
        parcel.writeString(this.sourceModuleName);
        parcel.writeString(this.extendedField);
        parcel.writeInt(this.isRetryDownload);
        parcel.writeInt(this.isUpdate);
        parcel.writeString(this.isApks);
        parcel.writeString(this.openInstallParams);
        parcel.writeString(this.recommendId);
        parcel.writeString(this.reportElement);
        parcel.writeString(this.activeType);
        parcel.writeString(this.searchId);
        parcel.writeString(this.searchInputKeyword);
        parcel.writeString(this.searchRequestKeyword);
        parcel.writeString(this.searchType);
        parcel.writeString(this.downloadErrorCode);
        parcel.writeString(this.popType);
    }
}
