package g.c.a.g.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.view.View;
import com.apkpure.aegon.application.AegonApplication;
import com.apkpure.aegon.components.models.Asset;
import com.apkpure.aegon.main.activity.MainTabActivity;
import com.apkpure.aegon.signstuff.view.StuffApkInstallView;
import com.tencent.raft.raftframework.sla.SLAConstant;
import g.c.a.e.h.b.a;
import g.c.a.l.d;
import g.c.a.l.g;
import g.c.a.l.l.b0;
import g.c.a.l.l.d0;
import g.c.a.l.l.e0;
import g.c.a.l.l.o;
import g.c.a.l.l.r;
import g.c.a.l.l.v;
import g.c.a.l.n.i;
import g.c.a.l.n.j;
import g.c.b.b.f;
import i.o.b.l;
import i.o.c.h;
import j.a.y;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.slf4j.Logger;

public final /* synthetic */ class e implements l {
    public final /* synthetic */ MainTabActivity b;

    public /* synthetic */ e(MainTabActivity mainTabActivity) {
        this.b = mainTabActivity;
    }

    public final Object g(Object obj) {
        String str;
        Logger logger;
        int i2;
        d0 d0Var;
        String j2;
        MainTabActivity mainTabActivity = this.b;
        o oVar = (o) obj;
        Objects.requireNonNull(mainTabActivity);
        if (oVar != null) {
            d dVar = d.a;
            if (!dVar.c()) {
                StuffApkInstallView stuffApkInstallView = mainTabActivity.t;
                a aVar = mainTabActivity.p;
                Objects.requireNonNull(stuffApkInstallView);
                h.e(aVar, "dtPageInfo");
                a aVar2 = stuffApkInstallView.Q;
                if (aVar2 != null) {
                    aVar2.activeType = aVar.activeType;
                }
                if (aVar2 != null) {
                    aVar2.extendField = aVar.extendField;
                }
                if (aVar2 != null) {
                    aVar2.moduleName = aVar.moduleName;
                }
                if (aVar2 != null) {
                    aVar2.sourceModelType = aVar.sourceModelType;
                }
                if (aVar2 != null) {
                    aVar2.sourceModuleName = aVar.sourceModuleName;
                }
                if (aVar2 != null) {
                    aVar2.sourcePosition = aVar.sourcePosition;
                }
                if (aVar2 != null) {
                    aVar2.sourceScene = aVar.sourceScene;
                }
                if (aVar2 != null) {
                    aVar2.sourceSmallPosition = aVar.sourceSmallPosition;
                }
                stuffApkInstallView.i(oVar);
                if (stuffApkInstallView.B == null) {
                    StuffApkInstallView.S.info("Start fail, apkDescription is null.");
                } else {
                    stuffApkInstallView.e();
                    stuffApkInstallView.d();
                    stuffApkInstallView.w.addListener(new i(stuffApkInstallView));
                    j jVar = new j(stuffApkInstallView);
                    stuffApkInstallView.R = jVar;
                    h.c(jVar);
                    h.e(jVar, "listener");
                    List<e0> list = d.f2043f;
                    synchronized (list) {
                        if (!list.contains(jVar)) {
                            list.add(jVar);
                        }
                    }
                    if (!stuffApkInstallView.A) {
                        StuffApkInstallView.S.debug("No need to do data report.");
                    } else {
                        Context context = AegonApplication.getContext();
                        h.d(context, "getContext()");
                        stuffApkInstallView.z = dVar.e(context);
                        g.c.a.l.i iVar = g.c.a.l.i.a;
                        o oVar2 = stuffApkInstallView.B;
                        String g2 = oVar2 == null ? null : oVar2.g();
                        boolean z = stuffApkInstallView.z;
                        if (z) {
                            Context context2 = AegonApplication.getContext();
                            h.d(context2, "getContext()");
                            h.e(context2, "context");
                            SharedPreferences sharedPreferences = context2.getSharedPreferences("micro_download_config", 0);
                            h.d(sharedPreferences, "context.getSharedPreferences(\n                PREFERENCE_NAME_MICRO_DOWNLOAD_CONFIG, Context.MODE_PRIVATE)");
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putBoolean("is_first_show_pop_key", false);
                            edit.apply();
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("scene", 2140L);
                        hashMap.put("pop_type", "fast_download_pop");
                        if (g2 == null) {
                            g2 = "";
                        }
                        hashMap.put("package_name", g2);
                        hashMap.put("report_element", "pop");
                        hashMap.put("eid", "pop");
                        String str2 = SLAConstant.TYPE_DEPRECATED_START;
                        hashMap.put("is_first_pop", z ? str2 : "2");
                        hashMap.put("area", iVar.d());
                        g.c.a.e.h.b.d.g(stuffApkInstallView, "pop", hashMap);
                        iVar.e(stuffApkInstallView);
                        g.c.a.e.h.b.d.d(stuffApkInstallView);
                        View view = stuffApkInstallView.s;
                        o oVar3 = stuffApkInstallView.B;
                        String g3 = oVar3 == null ? null : oVar3.g();
                        boolean z2 = stuffApkInstallView.z;
                        String str3 = "";
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("pop_type", "fast_download_pop");
                        if (g3 == null) {
                            g3 = str3;
                        }
                        hashMap2.put("package_name", g3);
                        hashMap2.put("report_element", "fold_button");
                        hashMap2.put("eid", "fold_button");
                        if (!z2) {
                            str2 = "2";
                        }
                        hashMap2.put("is_first_pop", str2);
                        hashMap2.put("area", iVar.d());
                        g.c.a.e.h.b.d.g(view, "fold_button", hashMap2);
                        iVar.e(view);
                        g.c.a.e.h.b.d.d(view);
                    }
                    String str4 = null;
                    f.S(stuffApkInstallView.v, (i.m.f) null, (y) null, new g.c.a.l.n.h(stuffApkInstallView, (i.m.d<? super g.c.a.l.n.h>) null), 3, (Object) null);
                    a aVar3 = stuffApkInstallView.Q;
                    if (aVar3 == null) {
                        aVar3 = new a();
                    }
                    h.e(aVar3, "dtPageInfo");
                    if (d.f2047j) {
                        logger = d.b;
                        str = "Start install had install.";
                    } else {
                        d.f2047j = true;
                        o oVar4 = d.f2041d;
                        if (oVar4 == null) {
                            d.b.info("Start install XApk. apkDescription is null.");
                            dVar.i(d.f2041d);
                        } else {
                            g.c.a.l.j jVar2 = oVar4.b;
                            if (jVar2 == null) {
                                i2 = -1;
                            } else {
                                i2 = d.a.a[jVar2.ordinal()];
                            }
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    o oVar5 = d.f2041d;
                                    h.c(oVar5);
                                    oVar5.c = 11;
                                    o oVar6 = d.f2041d;
                                    h.c(oVar6);
                                    oVar6.f2071e = 0;
                                    dVar.i(d.f2041d);
                                    Logger logger2 = d.b;
                                    StringBuilder i3 = g.a.a.a.a.i("Start install XApk apkDescription suffix[");
                                    o oVar7 = d.f2041d;
                                    if (oVar7 != null) {
                                        str4 = oVar7.i();
                                    }
                                    i3.append(str4);
                                    i3.append("] illegal.");
                                    Logger logger3 = logger2;
                                    str = i3.toString();
                                    logger = logger3;
                                } else if (d.f2041d == null) {
                                    d.b.info("Start install XApk after download. apkDescription is null.");
                                    o oVar8 = d.f2041d;
                                    if (oVar8 != null) {
                                        oVar8.c = 11;
                                    }
                                    dVar.i(oVar8);
                                } else {
                                    d0 d0Var2 = d.f2042e;
                                    if (d0Var2 != null) {
                                        d0Var2.f();
                                        d.b.info(h.j("销毁 ", d.f2042e));
                                    }
                                    r rVar = new r();
                                    d.f2042e = rVar;
                                    o oVar9 = d.f2041d;
                                    h.c(oVar9);
                                    rVar.c(oVar9, aVar3, new g.c.a.l.h());
                                }
                            } else if (d.f2041d == null) {
                                d.b.info("Start install XApk after download. apkDescription is null.");
                                dVar.i(d.f2041d);
                            } else {
                                if (Build.VERSION.SDK_INT >= 24) {
                                    o oVar10 = d.f2041d;
                                    if (!(oVar10 == null || (j2 = oVar10.j()) == null)) {
                                        str4 = j2.toUpperCase(Locale.ROOT);
                                        h.d(str4, "(this as java.lang.Strin….toUpperCase(Locale.ROOT)");
                                    }
                                    if (h.a(str4, Asset.TYPE_XAPK)) {
                                        d0Var = new b0();
                                        d.f2042e = d0Var;
                                        o oVar11 = d.f2041d;
                                        h.c(oVar11);
                                        d0Var.c(oVar11, aVar3, new g());
                                    }
                                }
                                d0Var = new v();
                                d.f2042e = d0Var;
                                o oVar112 = d.f2041d;
                                h.c(oVar112);
                                d0Var.c(oVar112, aVar3, new g());
                            }
                        }
                    }
                    logger.info(str);
                }
            }
        }
        return i.j.a;
    }
}
