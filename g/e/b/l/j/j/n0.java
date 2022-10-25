package g.e.b.l.j.j;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.datatransport.cct.CCTDestination;
import com.tencent.raft.measure.utils.MeasureConst;
import g.a.a.a.a;
import g.e.a.a.b;
import g.e.a.a.f.h;
import g.e.a.a.f.i;
import g.e.a.a.f.l;
import g.e.a.a.f.p;
import g.e.a.a.f.q;
import g.e.a.a.f.r;
import g.e.a.a.f.s;
import g.e.b.l.j.f;
import g.e.b.l.j.k.k;
import g.e.b.l.j.l.a0;
import g.e.b.l.j.l.b0;
import g.e.b.l.j.l.c;
import g.e.b.l.j.l.d;
import g.e.b.l.j.l.d0.g;
import g.e.b.l.j.l.k;
import g.e.b.l.j.l.l;
import g.e.b.l.j.l.t;
import g.e.b.l.j.n.e;
import g.e.b.l.j.o.c;
import g.e.b.l.j.q.d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

public class n0 {
    public final d0 a;
    public final e b;
    public final c c;

    /* renamed from: d  reason: collision with root package name */
    public final g.e.b.l.j.k.e f3517d;

    /* renamed from: e  reason: collision with root package name */
    public final k f3518e;

    public n0(d0 d0Var, e eVar, c cVar, g.e.b.l.j.k.e eVar2, k kVar) {
        this.a = d0Var;
        this.b = eVar;
        this.c = cVar;
        this.f3517d = eVar2;
        this.f3518e = kVar;
    }

    public static a0.a b(ApplicationExitInfo applicationExitInfo) {
        String str;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = traceInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                str = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                c.b bVar = new c.b();
                bVar.f3616d = Integer.valueOf(applicationExitInfo.getImportance());
                String processName = applicationExitInfo.getProcessName();
                Objects.requireNonNull(processName, "Null processName");
                bVar.b = processName;
                bVar.c = Integer.valueOf(applicationExitInfo.getReason());
                bVar.f3619g = Long.valueOf(applicationExitInfo.getTimestamp());
                bVar.a = Integer.valueOf(applicationExitInfo.getPid());
                bVar.f3617e = Long.valueOf(applicationExitInfo.getPss());
                bVar.f3618f = Long.valueOf(applicationExitInfo.getRss());
                bVar.f3620h = str;
                return bVar.a();
            }
        } catch (IOException e2) {
            f fVar = f.a;
            StringBuilder i2 = a.i("Could not get input trace in application exit info: ");
            i2.append(applicationExitInfo.toString());
            i2.append(" Error: ");
            i2.append(e2);
            fVar.f(i2.toString());
        }
        str = null;
        c.b bVar2 = new c.b();
        bVar2.f3616d = Integer.valueOf(applicationExitInfo.getImportance());
        String processName2 = applicationExitInfo.getProcessName();
        Objects.requireNonNull(processName2, "Null processName");
        bVar2.b = processName2;
        bVar2.c = Integer.valueOf(applicationExitInfo.getReason());
        bVar2.f3619g = Long.valueOf(applicationExitInfo.getTimestamp());
        bVar2.a = Integer.valueOf(applicationExitInfo.getPid());
        bVar2.f3617e = Long.valueOf(applicationExitInfo.getPss());
        bVar2.f3618f = Long.valueOf(applicationExitInfo.getRss());
        bVar2.f3620h = str;
        return bVar2.a();
    }

    public static n0 c(Context context, k0 k0Var, g.e.b.l.j.n.f fVar, h hVar, g.e.b.l.j.k.e eVar, k kVar, d dVar, g.e.b.l.j.p.f fVar2) {
        Context context2 = context;
        k0 k0Var2 = k0Var;
        h hVar2 = hVar;
        d0 d0Var = new d0(context, k0Var, hVar, dVar);
        g.e.b.l.j.n.f fVar3 = fVar;
        e eVar2 = new e(fVar, fVar2);
        g gVar = g.e.b.l.j.o.c.b;
        s.b(context);
        s a2 = s.a();
        CCTDestination cCTDestination = new CCTDestination(g.e.b.l.j.o.c.c, g.e.b.l.j.o.c.f3693d);
        Objects.requireNonNull(a2);
        Set<T> unmodifiableSet = Collections.unmodifiableSet(CCTDestination.f355f);
        p.a a3 = p.a();
        a3.b("cct");
        i.b bVar = (i.b) a3;
        bVar.b = cCTDestination.b();
        p a4 = bVar.a();
        g.e.a.a.a aVar = new g.e.a.a.a("json");
        g.e.a.a.c<a0, byte[]> cVar = g.e.b.l.j.o.c.f3694e;
        if (unmodifiableSet.contains(aVar)) {
            return new n0(d0Var, eVar2, new g.e.b.l.j.o.c(new q(a4, "FIREBASE_CRASHLYTICS_REPORT", aVar, cVar, a2), cVar), eVar, kVar);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{aVar, unmodifiableSet}));
    }

    public static List<a0.c> e(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Objects.requireNonNull(str, "Null key");
            String str2 = (String) next.getValue();
            Objects.requireNonNull(str2, "Null value");
            arrayList.add(new g.e.b.l.j.l.d(str, str2, (d.a) null));
        }
        Collections.sort(arrayList, d.b);
        return arrayList;
    }

    public final a0.e.d a(a0.e.d dVar, g.e.b.l.j.k.e eVar, k kVar) {
        a0.e.d.b f2 = dVar.f();
        String b2 = eVar.b.b();
        if (b2 != null) {
            ((k.b) f2).f3656e = new t(b2, (t.a) null);
        } else {
            f.a.e("No log data to include with this event.");
        }
        List<a0.c> e2 = e(kVar.f3538d.a.getReference().a());
        List<a0.c> e3 = e(kVar.f3539e.a.getReference().a());
        if (!((ArrayList) e2).isEmpty() || !((ArrayList) e3).isEmpty()) {
            l.b bVar = (l.b) dVar.a().f();
            bVar.b = new b0<>(e2);
            bVar.c = new b0<>(e3);
            f2.b(bVar.a());
        }
        return f2.a();
    }

    public final ApplicationExitInfo d(String str, List<ApplicationExitInfo> list) {
        long lastModified = this.b.b.f(str, "start-time").lastModified();
        for (ApplicationExitInfo next : list) {
            if (next.getTimestamp() < lastModified) {
                return null;
            }
            if (next.getReason() == 6) {
                return next;
            }
        }
        return null;
    }

    public g.e.a.b.g.f<Void> f(Executor executor) {
        List<File> b2 = this.b.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) b2).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                arrayList.add(new i(e.f3688f.e(e.e(file)), file.getName(), file));
            } catch (IOException e2) {
                f fVar = f.a;
                fVar.g("Could not load report file " + file + "; deleting", e2);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            e0 e0Var = (e0) it2.next();
            g.e.b.l.j.o.c cVar = this.c;
            Objects.requireNonNull(cVar);
            a0 a2 = e0Var.a();
            g.e.a.b.g.g gVar = new g.e.a.b.g.g();
            g.e.a.a.d<a0> dVar = cVar.a;
            b bVar = b.HIGHEST;
            Objects.requireNonNull(a2, "Null payload");
            g.e.b.l.j.o.b bVar2 = new g.e.b.l.j.o.b(gVar, e0Var);
            q qVar = (q) dVar;
            r rVar = qVar.f2773e;
            p pVar = qVar.a;
            Objects.requireNonNull(pVar, "Null transportContext");
            String str = qVar.b;
            Objects.requireNonNull(str, "Null transportName");
            g.e.a.a.c<T, byte[]> cVar2 = qVar.f2772d;
            Objects.requireNonNull(cVar2, "Null transformer");
            g.e.a.a.a aVar = qVar.c;
            Objects.requireNonNull(aVar, "Null encoding");
            s sVar = (s) rVar;
            g.e.a.a.f.z.e eVar = sVar.c;
            p.a a3 = p.a();
            a3.b(pVar.b());
            a3.c(bVar);
            i.b bVar3 = (i.b) a3;
            bVar3.b = pVar.c();
            p a4 = bVar3.a();
            l.a a5 = g.e.a.a.f.l.a();
            a5.e(sVar.a.a());
            a5.g(sVar.b.a());
            a5.f(str);
            g.e.b.l.j.o.a aVar2 = (g.e.b.l.j.o.a) cVar2;
            a5.d(new g.e.a.a.f.k(aVar, g.e.b.l.j.o.c.b.f(a2).getBytes(Charset.forName(MeasureConst.CHARSET_UTF8))));
            h.b bVar4 = (h.b) a5;
            bVar4.b = null;
            eVar.a(a4, bVar4.b(), bVar2);
            arrayList2.add(gVar.a.e(executor, new c(this)));
        }
        return g.e.a.b.b.h.e.p(arrayList2);
    }
}
