package g.c.b.b.m;

import g.c.b.b.c;
import g.c.b.b.f;
import g.c.b.c.b.a;
import i.j;
import i.o.c.h;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class a {
    public final g.c.b.c.b.a a;
    public final g.c.b.b.i.a b;
    public final Logger c = LoggerFactory.getLogger("ExpansionLog");

    public a(g.c.b.c.b.a aVar, g.c.b.b.i.a aVar2) {
        Object obj;
        h.e(aVar, "xapk");
        h.e(aVar2, "callback");
        this.a = aVar;
        this.b = aVar2;
        List<a.b> list = aVar.f2312h;
        if (list != null) {
            if (list.isEmpty()) {
                ((c.f) aVar2).d(11, f.C(11));
            }
            long j2 = 0;
            for (a.b bVar : list) {
                j2 += bVar.b;
            }
            if (j2 <= 0) {
                this.b.d(12, f.C(12));
            }
            try {
                a(list, this.a, this.b, j2);
                obj = j.a;
            } catch (Throwable th) {
                obj = f.v(th);
            }
            Throwable a2 = i.f.a(obj);
            if (a2 != null) {
                for (a.b bVar2 : list) {
                    String str = bVar2.c;
                    if (str != null) {
                        new File(str).delete();
                    }
                }
                this.b.d(13, f.D(a2));
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void a(List<a.b> list, g.c.b.c.b.a aVar, g.c.b.b.i.a aVar2, long j2) {
        Throwable th;
        g.c.b.b.i.a aVar3 = aVar2;
        this.c.info(h.j("installObb begin ", Integer.valueOf(list.size())));
        byte[] bArr = new byte[16384];
        int i2 = 0;
        long j3 = 0;
        int i3 = 0;
        for (a.b bVar : list) {
            i3++;
            this.c.info(h.j("installObb expansionFile.path ", bVar.a));
            String str = bVar.a;
            if (str == null) {
                g.c.b.c.b.a aVar4 = aVar;
            } else {
                this.c.info(h.j("installObb path ", str));
                InputStream g2 = aVar.a.g(str);
                if (g2 != null) {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(g2);
                    try {
                        String str2 = bVar.c;
                        if (str2 == null) {
                            f.s(bufferedInputStream, (Throwable) null);
                        } else {
                            File file = new File(str2);
                            this.c.info(h.j("installObb installPath ", bVar.c));
                            if (file.getParentFile() != null && !file.getParentFile().exists()) {
                                file.getParentFile().mkdirs();
                            }
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                            while (true) {
                                try {
                                    int read = bufferedInputStream.read(bArr);
                                    if (read <= 0) {
                                        this.c.info(h.j("installObb ok ", str));
                                        if (i3 == list.size()) {
                                            this.c.info("installObb  done");
                                            String path = file.getPath();
                                            h.d(path, "file.path");
                                            aVar3.a(path);
                                        }
                                        long j4 = j2;
                                    } else {
                                        bufferedOutputStream.write(bArr, i2, read);
                                        String str3 = str;
                                        j3 += (long) read;
                                        if (aVar3.c(((float) j3) / ((float) j2), 1)) {
                                            aVar3.d(7, h.j(f.C(7), "_installObb"));
                                            break;
                                        } else {
                                            str = str3;
                                            i2 = 0;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    Throwable th3 = th2;
                                    f.s(bufferedOutputStream, th);
                                    throw th3;
                                }
                            }
                            f.s(bufferedOutputStream, (Throwable) null);
                            f.s(bufferedInputStream, (Throwable) null);
                            this.c.info("installObb over once");
                            i2 = 0;
                        }
                    } catch (Throwable th4) {
                        Throwable th5 = th4;
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            Throwable th7 = th6;
                            f.s(bufferedInputStream, th5);
                            throw th7;
                        }
                    }
                }
            }
        }
    }
}
