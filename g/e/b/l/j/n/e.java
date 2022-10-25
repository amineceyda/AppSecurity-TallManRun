package g.e.b.l.j.n;

import com.tencent.raft.measure.utils.MeasureConst;
import g.a.a.a.a;
import g.e.b.l.j.l.a0;
import g.e.b.l.j.l.d0.g;
import g.e.b.l.j.p.f;
import g.e.b.n.i.d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class e {

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f3686d = Charset.forName(MeasureConst.CHARSET_UTF8);

    /* renamed from: e  reason: collision with root package name */
    public static final int f3687e = 15;

    /* renamed from: f  reason: collision with root package name */
    public static final g f3688f = new g();

    /* renamed from: g  reason: collision with root package name */
    public static final Comparator<? super File> f3689g = a.b;

    /* renamed from: h  reason: collision with root package name */
    public static final FilenameFilter f3690h = d.a;
    public final AtomicInteger a = new AtomicInteger(0);
    public final f b;
    public final f c;

    public e(f fVar, f fVar2) {
        this.b = fVar;
        this.c = fVar2;
    }

    public static String e(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f3686d);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        throw th;
    }

    public static void f(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f3686d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final void a(List<File> list) {
        for (File delete : list) {
            delete.delete();
        }
    }

    public final List<File> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.b.c());
        arrayList.addAll(this.b.b());
        Comparator<? super File> comparator = f3689g;
        Collections.sort(arrayList, comparator);
        List<File> d2 = this.b.d();
        Collections.sort(d2, comparator);
        arrayList.addAll(d2);
        return arrayList;
    }

    public SortedSet<String> c() {
        return new TreeSet(f.i(this.b.b.list())).descendingSet();
    }

    public void d(a0.e.d dVar, String str, boolean z) {
        int i2 = ((g.e.b.l.j.p.e) this.c).b().a().a;
        Objects.requireNonNull(f3688f);
        d dVar2 = (d) g.a;
        Objects.requireNonNull(dVar2);
        StringWriter stringWriter = new StringWriter();
        try {
            dVar2.a(dVar, stringWriter);
        } catch (IOException unused) {
        }
        try {
            f(this.b.f(str, a.c("event", String.format(Locale.US, "%010d", new Object[]{Integer.valueOf(this.a.getAndIncrement())}), z ? "_" : "")), stringWriter.toString());
        } catch (IOException e2) {
            g.e.b.l.j.f.a.g("Could not persist event for session " + str, e2);
        }
        List<File> i3 = f.i(this.b.e(str).listFiles(b.a));
        Collections.sort(i3, c.b);
        int size = i3.size();
        for (File file : i3) {
            if (size > i2) {
                f.h(file);
                size--;
            } else {
                return;
            }
        }
    }
}
