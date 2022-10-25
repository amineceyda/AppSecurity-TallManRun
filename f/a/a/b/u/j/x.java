package f.a.a.b.u.j;

import f.a.a.b.w.d;
import f.a.a.b.z.k;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class x extends d implements a {

    /* renamed from: e  reason: collision with root package name */
    public final i f1836e;

    /* renamed from: f  reason: collision with root package name */
    public final u f1837f;

    /* renamed from: g  reason: collision with root package name */
    public int f1838g = 0;

    /* renamed from: h  reason: collision with root package name */
    public long f1839h = 0;

    /* renamed from: i  reason: collision with root package name */
    public final f f1840i;

    /* renamed from: j  reason: collision with root package name */
    public final k f1841j;

    /* renamed from: k  reason: collision with root package name */
    public final d f1842k;

    public class a implements Runnable {
        public Date b;

        public a(Date date) {
            this.b = date;
        }

        public void run() {
            x xVar = x.this;
            Date date = this.b;
            h hVar = new h(xVar.f1840i);
            List<q> d2 = hVar.d(xVar.f1836e.v());
            List<String> e2 = hVar.e(hVar.b(((q) ((ArrayList) d2).get(0)).a(hVar.a), d2, 1));
            w wVar = new w(xVar, date);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) e2;
            for (String str : (String[]) arrayList2.toArray(new String[0])) {
                if (wVar.accept((File) null, str)) {
                    arrayList.add(str);
                    arrayList2.remove(str);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                xVar.s(new File((String) it.next()));
            }
            long j2 = xVar.f1839h;
            long j3 = 0;
            if (j2 != 0 && j2 > 0) {
                String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                k kVar = xVar.f1841j;
                Objects.requireNonNull(kVar);
                Arrays.sort(strArr, new j(kVar));
                long j4 = 0;
                for (String file : strArr) {
                    File file2 = new File(file);
                    Objects.requireNonNull(xVar.f1840i);
                    long length = file2.length();
                    if (j4 + length > xVar.f1839h) {
                        xVar.n("Deleting [" + file2 + "] of size " + new k(length));
                        if (!xVar.s(file2)) {
                            length = 0;
                        }
                        j3 += length;
                    }
                    j4 += length;
                }
                StringBuilder i2 = g.a.a.a.a.i("Removed  ");
                i2.append(new k(j3));
                i2.append(" of files");
                xVar.n(i2.toString());
            }
            h hVar2 = new h(xVar.f1840i);
            List<q> d3 = hVar2.d(xVar.f1836e.v());
            ArrayList arrayList3 = new ArrayList();
            hVar2.a(((q) ((ArrayList) d3).get(0)).a(hVar2.a), d3, 1, arrayList3);
            List<String> e3 = hVar2.e(arrayList3);
            Collections.reverse(e3);
            ArrayDeque arrayDeque = new ArrayDeque();
            Iterator it2 = ((ArrayList) e3).iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                f fVar = xVar.f1840i;
                File file3 = new File(str2);
                Objects.requireNonNull(fVar);
                int length2 = file3.list((FilenameFilter) null).length;
                if (length2 == 0 || (length2 == 1 && arrayDeque.size() > 0 && str2.equals(arrayDeque.peekLast()))) {
                    arrayDeque.add(str2);
                }
            }
            for (String file4 : Arrays.asList(arrayDeque.toArray(new String[0]))) {
                xVar.s(new File(file4));
            }
        }
    }

    public x(i iVar, u uVar, f fVar) {
        this.f1836e = iVar;
        this.f1837f = uVar;
        this.f1840i = fVar;
        d dVar = new d(iVar);
        this.f1842k = dVar;
        this.f1841j = new k(dVar, new m(iVar));
    }

    public final boolean s(File file) {
        n("deleting " + file);
        Objects.requireNonNull(this.f1840i);
        boolean delete = file.delete();
        if (!delete) {
            p("cannot delete " + file);
        }
        return delete;
    }

    public String toString() {
        return "c.q.l.core.rolling.helper.TimeBasedArchiveRemover";
    }
}
