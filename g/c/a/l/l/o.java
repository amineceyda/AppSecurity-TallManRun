package g.c.a.l.l;

import android.graphics.Bitmap;
import g.c.a.l.j;
import g.e.c.s.a;
import g.e.c.s.c;
import i.o.c.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class o {
    public double a;
    @c("apkId")
    @a
    private int apkId;
    public j b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public Bitmap f2070d;

    /* renamed from: e  reason: collision with root package name */
    public int f2071e;

    /* renamed from: f  reason: collision with root package name */
    public g.c.b.b.j.a f2072f;
    @c("fastDownloadId")
    @a
    private String fastDownloadId;
    @c("fastRecommendId")
    @a
    private String fastRecommendId;

    /* renamed from: g  reason: collision with root package name */
    public Map<String, ? extends Object> f2073g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2074h;
    @c("icon")
    @a
    private String icon;
    @c("iconBase64")
    @a
    private String iconBase64;
    @c("name")
    @a
    private String name;
    @c(alternate = {"package_name"}, value = "packageName")
    @a
    private String packageName;
    @c("sha1")
    @a
    private String sha1;
    @c("signatures")
    @a
    private List<String> signatures;
    @c("suffix")
    @a
    private String suffix;
    @c("type")
    @a
    private String type;
    @c("url")
    @a
    private String url;
    @c("urlSeed")
    @a
    private String urlSeed;
    @c("version")
    @a
    private int version;
    @c(alternate = {"version_code"}, value = "versionCode")
    @a
    private int versionCode;
    @c("versionId")
    @a
    private String versionId;
    @c("versionName")
    @a
    private String versionName;

    public o() {
        this(0, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, 0.0d, (j) null, 0, (Bitmap) null, 0, (g.c.b.b.j.a) null, (Map) null, false, 33554431);
    }

    public o(int i2, String str, String str2, int i3, String str3, String str4, String str5, int i4, String str6, String str7, String str8, String str9, String str10, List list, String str11, String str12, String str13, double d2, j jVar, int i5, Bitmap bitmap, int i6, g.c.b.b.j.a aVar, Map map, boolean z, int i7) {
        int i8;
        j jVar2;
        int i9 = i7;
        int i10 = (i9 & 1) != 0 ? 0 : i2;
        String str14 = (i9 & 2) != 0 ? "" : null;
        String str15 = (i9 & 4) != 0 ? "" : null;
        int i11 = (i9 & 8) != 0 ? 0 : i3;
        String str16 = (i9 & 16) != 0 ? "" : null;
        String str17 = (i9 & 32) != 0 ? "" : null;
        String str18 = (i9 & 64) != 0 ? "" : null;
        int i12 = (i9 & 128) != 0 ? 0 : i4;
        String str19 = (i9 & 256) != 0 ? "" : null;
        String str20 = (i9 & 512) != 0 ? "" : null;
        String str21 = (i9 & 1024) != 0 ? "" : null;
        String str22 = (i9 & 2048) != 0 ? "" : null;
        String str23 = (i9 & 4096) != 0 ? "" : null;
        String str24 = "";
        ArrayList arrayList = (i9 & 8192) != 0 ? new ArrayList() : null;
        int i13 = i12;
        String str25 = (i9 & 16384) != 0 ? str24 : null;
        String str26 = (i9 & 32768) != 0 ? str24 : null;
        String str27 = (i9 & 65536) != 0 ? str24 : null;
        double d3 = (i9 & 131072) != 0 ? 0.0d : d2;
        if ((i9 & 262144) != 0) {
            i8 = i11;
            jVar2 = j.UN_KNOW;
        } else {
            i8 = i11;
            jVar2 = null;
        }
        int i14 = (i9 & 524288) != 0 ? 0 : i5;
        int i15 = i9 & 1048576;
        int i16 = (i9 & 2097152) != 0 ? 0 : i6;
        int i17 = i9 & 4194304;
        int i18 = i9 & 8388608;
        boolean z2 = (i9 & 16777216) != 0 ? false : z;
        h.e(str14, "name");
        h.e(str15, "icon");
        h.e(str16, "suffix");
        h.e(str17, "type");
        h.e(str18, "versionName");
        h.e(str19, "packageName");
        h.e(str20, "url");
        h.e(str21, "sha1");
        h.e(str22, "urlSeed");
        h.e(str23, "versionId");
        h.e(arrayList, "signatures");
        h.e(str25, "iconBase64");
        h.e(jVar2, "stuffType");
        this.version = i10;
        this.name = str14;
        this.icon = str15;
        this.apkId = i8;
        this.suffix = str16;
        this.type = str17;
        this.versionName = str18;
        this.versionCode = i13;
        this.packageName = str19;
        this.url = str20;
        this.sha1 = str21;
        this.urlSeed = str22;
        this.versionId = str23;
        this.signatures = arrayList;
        this.iconBase64 = str25;
        this.fastDownloadId = str26;
        this.fastRecommendId = str27;
        this.a = d3;
        this.b = jVar2;
        this.c = i14;
        this.f2070d = null;
        this.f2071e = i16;
        this.f2072f = null;
        this.f2073g = null;
        this.f2074h = z2;
    }

    public final int a() {
        return this.apkId;
    }

    public final String b() {
        return this.fastDownloadId;
    }

    public final String c() {
        return this.fastRecommendId;
    }

    public final String d() {
        return this.icon;
    }

    public final String e() {
        return this.iconBase64;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.version == oVar.version && h.a(this.name, oVar.name) && h.a(this.icon, oVar.icon) && this.apkId == oVar.apkId && h.a(this.suffix, oVar.suffix) && h.a(this.type, oVar.type) && h.a(this.versionName, oVar.versionName) && this.versionCode == oVar.versionCode && h.a(this.packageName, oVar.packageName) && h.a(this.url, oVar.url) && h.a(this.sha1, oVar.sha1) && h.a(this.urlSeed, oVar.urlSeed) && h.a(this.versionId, oVar.versionId) && h.a(this.signatures, oVar.signatures) && h.a(this.iconBase64, oVar.iconBase64) && h.a(this.fastDownloadId, oVar.fastDownloadId) && h.a(this.fastRecommendId, oVar.fastRecommendId) && h.a(Double.valueOf(this.a), Double.valueOf(oVar.a)) && this.b == oVar.b && this.c == oVar.c && h.a(this.f2070d, oVar.f2070d) && this.f2071e == oVar.f2071e && h.a(this.f2072f, oVar.f2072f) && h.a(this.f2073g, oVar.f2073g) && this.f2074h == oVar.f2074h;
    }

    public final String f() {
        return this.name;
    }

    public final String g() {
        return this.packageName;
    }

    public final List<String> h() {
        return this.signatures;
    }

    public int hashCode() {
        int a2 = g.a.a.a.a.a(this.iconBase64, (this.signatures.hashCode() + g.a.a.a.a.a(this.versionId, g.a.a.a.a.a(this.urlSeed, g.a.a.a.a.a(this.sha1, g.a.a.a.a.a(this.url, g.a.a.a.a.a(this.packageName, (g.a.a.a.a.a(this.versionName, g.a.a.a.a.a(this.type, g.a.a.a.a.a(this.suffix, (g.a.a.a.a.a(this.icon, g.a.a.a.a.a(this.name, this.version * 31, 31), 31) + this.apkId) * 31, 31), 31), 31) + this.versionCode) * 31, 31), 31), 31), 31), 31)) * 31, 31);
        String str = this.fastDownloadId;
        int i2 = 0;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fastRecommendId;
        int hashCode2 = (((this.b.hashCode() + ((Double.doubleToLongBits(this.a) + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31) + this.c) * 31;
        Bitmap bitmap = this.f2070d;
        int hashCode3 = (((hashCode2 + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + this.f2071e) * 31;
        g.c.b.b.j.a aVar = this.f2072f;
        int hashCode4 = (hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Map<String, ? extends Object> map = this.f2073g;
        if (map != null) {
            i2 = map.hashCode();
        }
        int i3 = (hashCode4 + i2) * 31;
        boolean z = this.f2074h;
        if (z) {
            z = true;
        }
        return i3 + (z ? 1 : 0);
    }

    public final String i() {
        return this.suffix;
    }

    public final String j() {
        return this.type;
    }

    public final int k() {
        return this.versionCode;
    }

    public final String l() {
        return this.versionId;
    }

    public final String m() {
        return this.versionName;
    }

    public final void n(String str) {
        this.fastDownloadId = str;
    }

    public final void o(String str) {
        this.fastRecommendId = str;
    }

    public final void p(String str) {
        h.e(str, "<set-?>");
        this.icon = str;
    }

    public final void q(String str) {
        h.e(str, "<set-?>");
        this.name = str;
    }

    public final void r(int i2) {
        this.versionCode = i2;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("ApkDescription(version=");
        i2.append(this.version);
        i2.append(", name=");
        i2.append(this.name);
        i2.append(", icon=");
        i2.append(this.icon);
        i2.append(", apkId=");
        i2.append(this.apkId);
        i2.append(", suffix=");
        i2.append(this.suffix);
        i2.append(", type=");
        i2.append(this.type);
        i2.append(", versionName=");
        i2.append(this.versionName);
        i2.append(", versionCode=");
        i2.append(this.versionCode);
        i2.append(", packageName=");
        i2.append(this.packageName);
        i2.append(", url=");
        i2.append(this.url);
        i2.append(", sha1=");
        i2.append(this.sha1);
        i2.append(", urlSeed=");
        i2.append(this.urlSeed);
        i2.append(", versionId=");
        i2.append(this.versionId);
        i2.append(", signatures=");
        i2.append(this.signatures);
        i2.append(", iconBase64=");
        i2.append(this.iconBase64);
        i2.append(", fastDownloadId=");
        i2.append(this.fastDownloadId);
        i2.append(", fastRecommendId=");
        i2.append(this.fastRecommendId);
        i2.append(", progress=");
        i2.append(this.a);
        i2.append(", stuffType=");
        i2.append(this.b);
        i2.append(", status=");
        i2.append(this.c);
        i2.append(", iconBitmap=");
        i2.append(this.f2070d);
        i2.append(", statusCode=");
        i2.append(this.f2071e);
        i2.append(", installingTask=");
        i2.append(this.f2072f);
        i2.append(", commonParams=");
        i2.append(this.f2073g);
        i2.append(", isV1=");
        i2.append(this.f2074h);
        i2.append(')');
        return i2.toString();
    }
}
