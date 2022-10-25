package g.c.a.l;

import android.content.Context;
import android.view.View;
import com.apkpure.aegon.application.AegonApplication;
import com.tencent.raft.codegenmeta.utils.Constants;
import com.tencent.raft.raftframework.sla.SLAConstant;
import e.e.i.b;
import g.a.a.a.a;
import g.c.a.e.h.b.d;
import g.c.a.l.l.o;
import g.c.b.b.l.e;
import g.i.c.a.a.k.c;
import g.i.c.a.a.r.e;
import java.util.HashMap;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class i {
    public static final i a = new i();
    public static final Logger b = LoggerFactory.getLogger("StuffDtUtilsLog");

    public static void b(i iVar, int i2, int i3, String str, String str2, String str3, int i4) {
        if ((i4 & 8) != 0) {
            str2 = "";
        }
        if ((i4 & 16) != 0) {
            str3 = "";
        }
        Logger logger = b;
        StringBuilder k2 = a.k("dtExtract,  status:", i2, ", returnCode: ", i3, ",packageName:");
        k2.append(str2);
        k2.append(", fastDownloadId:");
        k2.append(str3);
        logger.debug(k2.toString());
        HashMap hashMap = new HashMap();
        e.e.d.l.a.j0(hashMap, "is_lite_package", SLAConstant.TYPE_DEPRECATED_START);
        e.e.d.l.a.j0(hashMap, "status", String.valueOf(i2));
        e.e.d.l.a.j0(hashMap, "return_code", String.valueOf(i3));
        e.e.d.l.a.j0(hashMap, "package_name", str2);
        e.e.d.l.a.j0(hashMap, "fast_download_id", str3);
        d.e("AppExtract", (Object) null, hashMap);
    }

    public final void a(String str, int i2) {
        Logger logger = b;
        logger.debug("dtExtract, packageName:" + str + ", returnCode: " + i2);
        HashMap hashMap = new HashMap();
        e.e.d.l.a.j0(hashMap, "is_lite_package", SLAConstant.TYPE_DEPRECATED_START);
        e.e.d.l.a.j0(hashMap, "package_name", str);
        e.e.d.l.a.j0(hashMap, "return_code", String.valueOf(i2));
        d.e("AppExtract", (Object) null, hashMap);
    }

    public final void c(o oVar) {
        if (oVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("pop_type", "fast_download_pop");
            e.e.d.l.a.j0(hashMap, "is_lite_package", SLAConstant.TYPE_DEPRECATED_START);
            e.e.d.l.a.j0(hashMap, "package_name", oVar.g());
            e.e.d.l.a.j0(hashMap, Constants.Raft.VERSION, oVar.m());
            e.e.d.l.a.j0(hashMap, "version_code", String.valueOf(oVar.k()));
            hashMap.put("install_type", "0");
            hashMap.put("apk_id", "0");
            hashMap.put("op_type", "0");
            hashMap.put("fail_desc", "0");
            hashMap.put("install_fail_code", "0");
            d.e("AppInstallPurview", (Object) null, hashMap);
        }
    }

    public final String d() {
        Context context = AegonApplication.getContext();
        boolean z = true;
        if (!e.b() || 1 != e.c(context)) {
            z = false;
        }
        return z ? SLAConstant.TYPE_DEPRECATED_START : "0";
    }

    public final void e(View view) {
        c cVar = c.REPORT_NONE;
        Logger logger = d.a;
        Logger logger2 = g.c.a.e.h.b.e.a;
        Objects.requireNonNull(e.b.a);
        b.Q(view, cVar, "element_expose_policy");
        b.Q(view, g.i.c.a.a.k.a.REPORT_NONE, "element_click_policy");
    }
}
