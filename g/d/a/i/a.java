package g.d.a.i;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import com.tencent.raft.raftframework.sla.SLAConstant;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a implements Closeable {
    public final File b;
    public final File c;

    /* renamed from: d  reason: collision with root package name */
    public final File f2354d;

    /* renamed from: e  reason: collision with root package name */
    public final File f2355e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2356f;

    /* renamed from: g  reason: collision with root package name */
    public long f2357g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2358h;

    /* renamed from: i  reason: collision with root package name */
    public long f2359i = 0;

    /* renamed from: j  reason: collision with root package name */
    public Writer f2360j;

    /* renamed from: k  reason: collision with root package name */
    public final LinkedHashMap<String, d> f2361k = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: l  reason: collision with root package name */
    public int f2362l;

    /* renamed from: m  reason: collision with root package name */
    public long f2363m = 0;
    public final ThreadPoolExecutor n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b((C0078a) null));
    public final Callable<Void> o = new C0078a();

    /* renamed from: g.d.a.i.a$a  reason: collision with other inner class name */
    public class C0078a implements Callable<Void> {
        public C0078a() {
        }

        public Object call() throws Exception {
            synchronized (a.this) {
                a aVar = a.this;
                if (aVar.f2360j != null) {
                    aVar.x();
                    if (a.this.n()) {
                        a.this.u();
                        a.this.f2362l = 0;
                    }
                }
            }
            return null;
        }
    }

    public static final class b implements ThreadFactory {
        public b(C0078a aVar) {
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class c {
        public final d a;
        public final boolean[] b;
        public boolean c;

        public c(d dVar, C0078a aVar) {
            boolean[] zArr;
            this.a = dVar;
            if (dVar.f2366e) {
                zArr = null;
            } else {
                zArr = new boolean[a.this.f2358h];
            }
            this.b = zArr;
        }

        public void a() throws IOException {
            a.a(a.this, this, false);
        }

        public File b(int i2) throws IOException {
            File file;
            synchronized (a.this) {
                d dVar = this.a;
                if (dVar.f2367f == this) {
                    if (!dVar.f2366e) {
                        this.b[i2] = true;
                    }
                    file = dVar.f2365d[i2];
                    if (!a.this.b.exists()) {
                        a.this.b.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }
    }

    public final class d {
        public final String a;
        public final long[] b;
        public File[] c;

        /* renamed from: d  reason: collision with root package name */
        public File[] f2365d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2366e;

        /* renamed from: f  reason: collision with root package name */
        public c f2367f;

        /* renamed from: g  reason: collision with root package name */
        public long f2368g;

        public d(String str, C0078a aVar) {
            this.a = str;
            int i2 = a.this.f2358h;
            this.b = new long[i2];
            this.c = new File[i2];
            this.f2365d = new File[i2];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i3 = 0; i3 < a.this.f2358h; i3++) {
                sb.append(i3);
                this.c[i3] = new File(a.this.b, sb.toString());
                sb.append(".tmp");
                this.f2365d[i3] = new File(a.this.b, sb.toString());
                sb.setLength(length);
            }
        }

        public String a() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        public final IOException b(String[] strArr) throws IOException {
            StringBuilder i2 = g.a.a.a.a.i("unexpected journal line: ");
            i2.append(Arrays.toString(strArr));
            throw new IOException(i2.toString());
        }
    }

    public final class e {
        public final File[] a;

        public e(a aVar, String str, long j2, File[] fileArr, long[] jArr, C0078a aVar2) {
            this.a = fileArr;
        }
    }

    public a(File file, int i2, int i3, long j2) {
        File file2 = file;
        this.b = file2;
        this.f2356f = i2;
        this.c = new File(file2, "journal");
        this.f2354d = new File(file2, "journal.tmp");
        this.f2355e = new File(file2, "journal.bkp");
        this.f2358h = i3;
        this.f2357g = j2;
    }

    public static void a(a aVar, c cVar, boolean z) throws IOException {
        synchronized (aVar) {
            d dVar = cVar.a;
            if (dVar.f2367f == cVar) {
                if (z && !dVar.f2366e) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= aVar.f2358h) {
                            break;
                        } else if (!cVar.b[i2]) {
                            cVar.a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                        } else if (!dVar.f2365d[i2].exists()) {
                            cVar.a();
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                for (int i3 = 0; i3 < aVar.f2358h; i3++) {
                    File file = dVar.f2365d[i3];
                    if (!z) {
                        f(file);
                    } else if (file.exists()) {
                        File file2 = dVar.c[i3];
                        file.renameTo(file2);
                        long j2 = dVar.b[i3];
                        long length = file2.length();
                        dVar.b[i3] = length;
                        aVar.f2359i = (aVar.f2359i - j2) + length;
                    }
                }
                aVar.f2362l++;
                dVar.f2367f = null;
                if (dVar.f2366e || z) {
                    dVar.f2366e = true;
                    aVar.f2360j.append("CLEAN");
                    aVar.f2360j.append(' ');
                    aVar.f2360j.append(dVar.a);
                    aVar.f2360j.append(dVar.a());
                    aVar.f2360j.append(10);
                    if (z) {
                        long j3 = aVar.f2363m;
                        aVar.f2363m = 1 + j3;
                        dVar.f2368g = j3;
                    }
                } else {
                    aVar.f2361k.remove(dVar.a);
                    aVar.f2360j.append("REMOVE");
                    aVar.f2360j.append(' ');
                    aVar.f2360j.append(dVar.a);
                    aVar.f2360j.append(10);
                }
                j(aVar.f2360j);
                if (aVar.f2359i > aVar.f2357g || aVar.n()) {
                    aVar.n.submit(aVar.o);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @TargetApi(26)
    public static void d(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void f(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void j(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static a o(File file, int i2, int i3, long j2) throws IOException {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i3 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    v(file2, file3, false);
                }
            }
            a aVar = new a(file, i2, i3, j2);
            if (aVar.c.exists()) {
                try {
                    aVar.s();
                    aVar.q();
                    return aVar;
                } catch (IOException e2) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                    aVar.close();
                    c.a(aVar.b);
                }
            }
            file.mkdirs();
            a aVar2 = new a(file, i2, i3, j2);
            aVar2.u();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    public static void v(File file, File file2, boolean z) throws IOException {
        if (z) {
            f(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final void b() {
        if (this.f2360j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized void close() throws IOException {
        if (this.f2360j != null) {
            Iterator it = new ArrayList(this.f2361k.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).f2367f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            x();
            d(this.f2360j);
            this.f2360j = null;
        }
    }

    public c g(String str) throws IOException {
        synchronized (this) {
            b();
            d dVar = this.f2361k.get(str);
            if (dVar == null) {
                dVar = new d(str, (C0078a) null);
                this.f2361k.put(str, dVar);
            } else if (dVar.f2367f != null) {
                return null;
            }
            c cVar = new c(dVar, (C0078a) null);
            dVar.f2367f = cVar;
            this.f2360j.append("DIRTY");
            this.f2360j.append(' ');
            this.f2360j.append(str);
            this.f2360j.append(10);
            j(this.f2360j);
            return cVar;
        }
    }

    public synchronized e k(String str) throws IOException {
        b();
        d dVar = this.f2361k.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f2366e) {
            return null;
        }
        for (File exists : dVar.c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f2362l++;
        this.f2360j.append("READ");
        this.f2360j.append(' ');
        this.f2360j.append(str);
        this.f2360j.append(10);
        if (n()) {
            this.n.submit(this.o);
        }
        return new e(this, str, dVar.f2368g, dVar.c, dVar.b, (C0078a) null);
    }

    public final boolean n() {
        int i2 = this.f2362l;
        return i2 >= 2000 && i2 >= this.f2361k.size();
    }

    public final void q() throws IOException {
        f(this.f2354d);
        Iterator<d> it = this.f2361k.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i2 = 0;
            if (next.f2367f == null) {
                while (i2 < this.f2358h) {
                    this.f2359i += next.b[i2];
                    i2++;
                }
            } else {
                next.f2367f = null;
                while (i2 < this.f2358h) {
                    f(next.c[i2]);
                    f(next.f2365d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:16|17|(1:19)|(1:21)(1:22)|23|24|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f2362l = r2 - r9.f2361k.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        if (r1.f2372f == -1) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r0 != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r9.f2360j = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.c, true), g.d.a.i.c.a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0060 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0060=Splitter:B:16:0x0060, B:28:0x0091=Splitter:B:28:0x0091} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            g.d.a.i.b r1 = new g.d.a.i.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.c
            r2.<init>(r3)
            java.nio.charset.Charset r3 = g.d.a.i.c.a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.b()     // Catch:{ all -> 0x00bf }
            java.lang.String r3 = r1.b()     // Catch:{ all -> 0x00bf }
            java.lang.String r4 = r1.b()     // Catch:{ all -> 0x00bf }
            java.lang.String r5 = r1.b()     // Catch:{ all -> 0x00bf }
            java.lang.String r6 = r1.b()     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00bf }
            if (r7 == 0) goto L_0x0091
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00bf }
            if (r7 == 0) goto L_0x0091
            int r7 = r9.f2356f     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00bf }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x0091
            int r4 = r9.f2358h     // Catch:{ all -> 0x00bf }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00bf }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x0091
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x0091
            r0 = 0
            r2 = 0
        L_0x0056:
            java.lang.String r3 = r1.b()     // Catch:{ EOFException -> 0x0060 }
            r9.t(r3)     // Catch:{ EOFException -> 0x0060 }
            int r2 = r2 + 1
            goto L_0x0056
        L_0x0060:
            java.util.LinkedHashMap<java.lang.String, g.d.a.i.a$d> r3 = r9.f2361k     // Catch:{ all -> 0x00bf }
            int r3 = r3.size()     // Catch:{ all -> 0x00bf }
            int r2 = r2 - r3
            r9.f2362l = r2     // Catch:{ all -> 0x00bf }
            int r2 = r1.f2372f     // Catch:{ all -> 0x00bf }
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L_0x0070
            r0 = 1
        L_0x0070:
            if (r0 == 0) goto L_0x0076
            r9.u()     // Catch:{ all -> 0x00bf }
            goto L_0x008b
        L_0x0076:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00bf }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00bf }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00bf }
            java.io.File r5 = r9.c     // Catch:{ all -> 0x00bf }
            r3.<init>(r5, r4)     // Catch:{ all -> 0x00bf }
            java.nio.charset.Charset r4 = g.d.a.i.c.a     // Catch:{ all -> 0x00bf }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00bf }
            r0.<init>(r2)     // Catch:{ all -> 0x00bf }
            r9.f2360j = r0     // Catch:{ all -> 0x00bf }
        L_0x008b:
            r1.close()     // Catch:{ RuntimeException -> 0x008f, Exception -> 0x008e }
        L_0x008e:
            return
        L_0x008f:
            r0 = move-exception
            throw r0
        L_0x0091:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00bf }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            r7.<init>()     // Catch:{ all -> 0x00bf }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00bf }
            r7.append(r2)     // Catch:{ all -> 0x00bf }
            r7.append(r0)     // Catch:{ all -> 0x00bf }
            r7.append(r3)     // Catch:{ all -> 0x00bf }
            r7.append(r0)     // Catch:{ all -> 0x00bf }
            r7.append(r5)     // Catch:{ all -> 0x00bf }
            r7.append(r0)     // Catch:{ all -> 0x00bf }
            r7.append(r6)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00bf }
            r4.<init>(r0)     // Catch:{ all -> 0x00bf }
            throw r4     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r0 = move-exception
            r1.close()     // Catch:{ RuntimeException -> 0x00c4, Exception -> 0x00c3 }
        L_0x00c3:
            throw r0
        L_0x00c4:
            r0 = move-exception
            goto L_0x00c7
        L_0x00c6:
            throw r0
        L_0x00c7:
            goto L_0x00c6
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.i.a.s():void");
    }

    public final void t(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i2);
            if (indexOf2 == -1) {
                str2 = str.substring(i2);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f2361k.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i2, indexOf2);
            }
            d dVar = this.f2361k.get(str2);
            if (dVar == null) {
                dVar = new d(str2, (C0078a) null);
                this.f2361k.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f2366e = true;
                dVar.f2367f = null;
                if (split.length == a.this.f2358h) {
                    int i3 = 0;
                    while (i3 < split.length) {
                        try {
                            dVar.b[i3] = Long.parseLong(split[i3]);
                            i3++;
                        } catch (NumberFormatException unused) {
                            dVar.b(split);
                            throw null;
                        }
                    }
                    return;
                }
                dVar.b(split);
                throw null;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f2367f = new c(dVar, (C0078a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException(g.a.a.a.a.w("unexpected journal line: ", str));
            }
        } else {
            throw new IOException(g.a.a.a.a.w("unexpected journal line: ", str));
        }
    }

    public final synchronized void u() throws IOException {
        String str;
        Writer writer = this.f2360j;
        if (writer != null) {
            d(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f2354d), c.a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write(SLAConstant.TYPE_DEPRECATED_START);
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f2356f));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f2358h));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d next : this.f2361k.values()) {
                if (next.f2367f != null) {
                    str = "DIRTY " + next.a + 10;
                } else {
                    str = "CLEAN " + next.a + next.a() + 10;
                }
                bufferedWriter.write(str);
            }
            d(bufferedWriter);
            if (this.c.exists()) {
                v(this.c, this.f2355e, true);
            }
            v(this.f2354d, this.c, false);
            this.f2355e.delete();
            this.f2360j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c, true), c.a));
        } catch (Throwable th) {
            d(bufferedWriter);
            throw th;
        }
    }

    public final void x() throws IOException {
        while (this.f2359i > this.f2357g) {
            String str = (String) this.f2361k.entrySet().iterator().next().getKey();
            synchronized (this) {
                b();
                d dVar = this.f2361k.get(str);
                if (dVar != null) {
                    if (dVar.f2367f == null) {
                        for (int i2 = 0; i2 < this.f2358h; i2++) {
                            File file = dVar.c[i2];
                            if (file.exists()) {
                                if (!file.delete()) {
                                    throw new IOException("failed to delete " + file);
                                }
                            }
                            long j2 = this.f2359i;
                            long[] jArr = dVar.b;
                            this.f2359i = j2 - jArr[i2];
                            jArr[i2] = 0;
                        }
                        this.f2362l++;
                        this.f2360j.append("REMOVE");
                        this.f2360j.append(' ');
                        this.f2360j.append(str);
                        this.f2360j.append(10);
                        this.f2361k.remove(str);
                        if (n()) {
                            this.n.submit(this.o);
                        }
                    }
                }
            }
        }
    }
}
