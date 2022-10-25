package g.i.c.a.a.n;

import android.text.TextUtils;
import g.c.b.b.f;
import g.i.c.a.a.a;
import g.i.c.a.a.b0.d;
import g.i.c.a.a.j.c;
import g.i.c.a.a.n.f.a;
import g.i.c.a.a.n.f.d;
import g.i.c.a.a.r.e;
import g.i.c.a.a.t.a;
import java.util.ArrayList;
import java.util.List;

public class a {
    public g.i.c.a.a.a a;

    public static class b {
        public g.i.c.a.a.n.b.b a;
        public List<c> b;
        public a.C0163a c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4464d;

        /* renamed from: e  reason: collision with root package name */
        public int f4465e = 1;

        public b(g.i.c.a.a.n.b.b bVar) {
            if (bVar != null) {
                this.a = bVar;
                this.c = new a.C0163a();
                this.b = new ArrayList();
                return;
            }
            throw new IllegalArgumentException("dtParamProvider不可为空");
        }
    }

    public a(b bVar, C0169a aVar) {
        String str;
        d aVar2 = bVar.f4465e != 2 ? new g.i.c.a.a.n.e.a() : new g.i.c.a.a.n.e.b();
        a.C0163a aVar3 = bVar.c;
        aVar3.a = 900000;
        aVar3.f4400f = aVar2;
        aVar3.f4407m = false;
        g.i.c.a.a.a aVar4 = new g.i.c.a.a.a(aVar3);
        e eVar = e.b.a;
        if (eVar.a) {
            f.K("Configuration", "build: " + aVar4);
        }
        this.a = aVar4;
        boolean z = bVar.f4464d;
        eVar.a = z;
        g.i.c.a.a.b0.e.b = z;
        if (z) {
            f.K("VideoReportInner", "setDebugMode: debugMode=" + z);
        }
        if (bVar.f4464d) {
            g.i.c.a.a.r.d dVar = new g.i.c.a.a.r.d(new g.i.c.a.a.n.f.c());
            if (eVar.a) {
                f.K("VideoReportInner", "addReporter: reporter=" + dVar);
            }
            eVar.c.add(dVar);
        }
        List<c> list = bVar.b;
        if (eVar.a) {
            f.K("VideoReportInner", "addReporter: reporters=" + list);
        }
        if (list != null) {
            eVar.c.addAll(list);
        }
        g.i.c.a.a.n.f.d dVar2 = d.b.a;
        if (eVar.a) {
            f.w("VideoReportInner", "registerEventDynamicParams: dynamicParams=" + dVar2);
        }
        eVar.f4498g = dVar2;
        a.e.a.v = a.b.a;
        g.i.c.a.a.n.e.d.f.f4468e = bVar.f4465e;
        d.b.a.a = bVar.a;
        if (eVar.a) {
            g.i.c.a.a.a aVar5 = this.a;
            if (aVar5 == null) {
                str = "config is null";
            } else {
                int i2 = aVar5.u;
                if (i2 < 5) {
                    str = "AudioTimePinInterval value below 5s, may cause performance issues";
                } else if (aVar5.t < i2) {
                    str = "AudioReportHeartBeatInterval can not be less than audioTimePinInterval";
                } else {
                    int i3 = aVar5.s;
                    if (i3 < 5) {
                        str = "AppTimeReportTimePinInterval value below 5s, may cause performance issues";
                    } else {
                        str = aVar5.r < i3 ? "AppReportHeartBeatInterval can not be less than appTimePinInterval" : "";
                    }
                }
            }
            if (!TextUtils.isEmpty(str)) {
                throw new RuntimeException(str);
            }
        }
    }

    public g.i.c.a.a.a a() {
        return this.a;
    }
}
