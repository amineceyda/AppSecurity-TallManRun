package g.c.a.b.a.k;

import android.text.TextUtils;
import com.apkpure.aegon.application.AegonApplication;
import com.apkpure.aegon.components.models.SimpleDisplayInfo;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import g.c.a.e.k.f.b;
import g.c.a.m.e;
import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class f {

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f1878d = LoggerFactory.getLogger("AppDetailModelLog");
    public SimpleDisplayInfo a = null;
    public AppDetailInfo b = null;
    public e<a> c;

    public enum a {
        parse,
        fetch
    }

    public void a() {
        if (TextUtils.isEmpty(f())) {
            f1878d.warn("详情页从 intent 中获取包名失败");
            g.c.b.b.f.j0(AegonApplication.getContext(), AegonApplication.getContext().getString(2131821132));
            return;
        }
        e.a(f(), new d(this));
    }

    public boolean b() {
        return this.b == null;
    }

    public String c() {
        AppDetailInfo appDetailInfo = this.b;
        return (appDetailInfo == null || TextUtils.isEmpty(appDetailInfo.description)) ? "" : this.b.description;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r0 = (r0 = r0.icon).original;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String d() {
        /*
            r1 = this;
            com.apkpure.aegon.components.models.SimpleDisplayInfo r0 = r1.a
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = r0.a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0015
            com.apkpure.aegon.components.models.SimpleDisplayInfo r0 = r1.a
            java.lang.String r0 = r0.a()
            return r0
        L_0x0015:
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r0 = r1.b
            if (r0 == 0) goto L_0x0032
            com.tencent.trpcprotocol.projecta.common.bannerimage.nano.BannerImage r0 = r0.icon
            if (r0 == 0) goto L_0x0032
            com.tencent.trpcprotocol.projecta.common.imageinfo.nano.ImageInfo r0 = r0.original
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = r0.url
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0032
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r0 = r1.b
            com.tencent.trpcprotocol.projecta.common.bannerimage.nano.BannerImage r0 = r0.icon
            com.tencent.trpcprotocol.projecta.common.imageinfo.nano.ImageInfo r0 = r0.original
            java.lang.String r0 = r0.url
            return r0
        L_0x0032:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.b.a.k.f.d():java.lang.String");
    }

    public String e() {
        SimpleDisplayInfo simpleDisplayInfo = this.a;
        if (simpleDisplayInfo != null && !TextUtils.isEmpty(simpleDisplayInfo.c())) {
            return this.a.c();
        }
        AppDetailInfo appDetailInfo = this.b;
        return (appDetailInfo == null || TextUtils.isEmpty(appDetailInfo.label)) ? "" : this.b.label;
    }

    public String f() {
        AppDetailInfo appDetailInfo = this.b;
        if (appDetailInfo != null && !TextUtils.isEmpty(appDetailInfo.packageName)) {
            return this.b.packageName;
        }
        SimpleDisplayInfo simpleDisplayInfo = this.a;
        return (simpleDisplayInfo == null || TextUtils.isEmpty(simpleDisplayInfo.b())) ? "" : this.a.b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.asset;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String g() {
        /*
            r2 = this;
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r0 = r2.b
            if (r0 == 0) goto L_0x000f
            com.tencent.trpcprotocol.projecta.common.assetinfo.nano.AssetInfo r0 = r0.asset
            if (r0 == 0) goto L_0x000f
            long r0 = r0.size
            java.lang.String r0 = g.c.a.e.k.f.b.a(r0)
            return r0
        L_0x000f:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.b.a.k.f.g():java.lang.String");
    }

    public String h() {
        int parseInt;
        AppDetailInfo appDetailInfo = this.b;
        if (appDetailInfo == null || TextUtils.isEmpty(appDetailInfo.versionName) || TextUtils.isEmpty(this.b.versionCode)) {
            return "";
        }
        AppDetailInfo appDetailInfo2 = this.b;
        String str = appDetailInfo2.versionName;
        String str2 = appDetailInfo2.versionCode;
        int i2 = b.a;
        if (TextUtils.isEmpty(str2) || !Pattern.compile("^[-\\+]?[\\d]*$").matcher(str2).matches() || (parseInt = Integer.parseInt(str2)) < 0) {
            return str;
        }
        return String.format(g.c.a.e.i.b.a.c.c(), "%s (%d)", new Object[]{str, Integer.valueOf(parseInt)});
    }
}
