package e.n;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import e.e.f.b;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public final class c implements Closeable {
    public final File b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final File f1535d;

    /* renamed from: e  reason: collision with root package name */
    public final RandomAccessFile f1536e;

    /* renamed from: f  reason: collision with root package name */
    public final FileChannel f1537f;

    /* renamed from: g  reason: collision with root package name */
    public final FileLock f1538g;

    public static class a extends File {
        public long crc = -1;

        public a(File file, String str) {
            super(file, str);
        }
    }

    public c(File file, File file2) throws IOException {
        StringBuilder i2 = g.a.a.a.a.i("MultiDexExtractor(");
        i2.append(file.getPath());
        i2.append(", ");
        i2.append(file2.getPath());
        i2.append(")");
        Log.i("MultiDex", i2.toString());
        this.b = file;
        this.f1535d = file2;
        this.c = f(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f1536e = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f1537f = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f1538g = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e2) {
                e = e2;
                a(this.f1537f);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                a(this.f1537f);
                throw e;
            } catch (Error e4) {
                e = e4;
                a(this.f1537f);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e5) {
            a(this.f1536e);
            throw e5;
        }
    }

    public static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            Log.w("MultiDex", "Failed to close resource", e2);
        }
    }

    public static void b(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        ZipOutputStream zipOutputStream;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile(g.a.a.a.a.w("tmp-", str), ".zip", file.getParentFile());
        StringBuilder i2 = g.a.a.a.a.i("Extracting ");
        i2.append(createTempFile.getPath());
        Log.i("MultiDex", i2.toString());
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (createTempFile.renameTo(file)) {
                    a(inputStream);
                    createTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } catch (Throwable th) {
            a(inputStream);
            createTempFile.delete();
            throw th;
        }
    }

    public static long d(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    /* JADX INFO: finally extract failed */
    public static long f(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            d g2 = b.g(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j2 = g2.b;
            randomAccessFile.seek(g2.a);
            int min = (int) Math.min(PlaybackStateCompat.ACTION_PREPARE, j2);
            byte[] bArr = new byte[16384];
            while (true) {
                int read = randomAccessFile.read(bArr, 0, min);
                if (read == -1) {
                    break;
                }
                crc32.update(bArr, 0, read);
                j2 -= (long) read;
                if (j2 == 0) {
                    break;
                }
                min = (int) Math.min(PlaybackStateCompat.ACTION_PREPARE, j2);
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    public static void n(Context context, String str, long j2, long j3, List<a> list) {
        SharedPreferences.Editor edit = context.getSharedPreferences("multidex.version", 4).edit();
        edit.putLong(str + "timestamp", j2);
        edit.putLong(g.a.a.a.a.f(new StringBuilder(), str, "crc"), j3);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i2 = 2;
        for (a next : list) {
            edit.putLong(str + "dex.crc." + i2, next.crc);
            edit.putLong(str + "dex.time." + i2, next.lastModified());
            i2++;
        }
        edit.commit();
    }

    public void close() throws IOException {
        this.f1538g.release();
        this.f1537f.close();
        this.f1536e.close();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x007e A[SYNTHETIC, Splitter:B:10:0x007e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<? extends java.io.File> g(android.content.Context r13, java.lang.String r14, boolean r15) throws java.io.IOException {
        /*
            r12 = this;
            java.lang.String r0 = "MultiDexExtractor.load("
            java.lang.StringBuilder r0 = g.a.a.a.a.i(r0)
            java.io.File r1 = r12.b
            java.lang.String r1 = r1.getPath()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r0.append(r15)
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MultiDex"
            android.util.Log.i(r1, r0)
            java.nio.channels.FileLock r0 = r12.f1538g
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L_0x00c1
            if (r15 != 0) goto L_0x008a
            java.io.File r0 = r12.b
            long r2 = r12.c
            r4 = 4
            java.lang.String r5 = "multidex.version"
            android.content.SharedPreferences r4 = r13.getSharedPreferences(r5, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r14)
            java.lang.String r6 = "timestamp"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r6 = -1
            long r8 = r4.getLong(r5, r6)
            long r10 = d(r0)
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x007b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            java.lang.String r5 = "crc"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            long r4 = r4.getLong(r0, r6)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r0 = 0
            goto L_0x007c
        L_0x007b:
            r0 = 1
        L_0x007c:
            if (r0 != 0) goto L_0x008a
            java.util.List r13 = r12.j(r13, r14)     // Catch:{ IOException -> 0x0083 }
            goto L_0x00a7
        L_0x0083:
            r15 = move-exception
            java.lang.String r0 = "Failed to reload existing extracted secondary dex files, falling back to fresh extraction"
            android.util.Log.w(r1, r0, r15)
            goto L_0x0094
        L_0x008a:
            if (r15 == 0) goto L_0x008f
            java.lang.String r15 = "Forced extraction must be performed."
            goto L_0x0091
        L_0x008f:
            java.lang.String r15 = "Detected that extraction must be performed."
        L_0x0091:
            android.util.Log.i(r1, r15)
        L_0x0094:
            java.util.List r15 = r12.k()
            java.io.File r0 = r12.b
            long r4 = d(r0)
            long r6 = r12.c
            r2 = r13
            r3 = r14
            r8 = r15
            n(r2, r3, r4, r6, r8)
            r13 = r15
        L_0x00a7:
            java.lang.String r14 = "load found "
            java.lang.StringBuilder r14 = g.a.a.a.a.i(r14)
            int r15 = r13.size()
            r14.append(r15)
            java.lang.String r15 = " secondary dex files"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            android.util.Log.i(r1, r14)
            return r13
        L_0x00c1:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "MultiDexExtractor was closed"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: e.n.c.g(android.content.Context, java.lang.String, boolean):java.util.List");
    }

    public final List<a> j(Context context, String str) throws IOException {
        String str2 = str;
        Log.i("MultiDex", "loading existing secondary dex files");
        String str3 = this.b.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i2 = sharedPreferences.getInt(str2 + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i2 + -1);
        int i3 = 2;
        while (i3 <= i2) {
            a aVar = new a(this.f1535d, g.a.a.a.a.r(str3, i3, ".zip"));
            if (aVar.isFile()) {
                aVar.crc = f(aVar);
                long j2 = sharedPreferences.getLong(str2 + "dex.crc." + i3, -1);
                long j3 = sharedPreferences.getLong(str2 + "dex.time." + i3, -1);
                long lastModified = aVar.lastModified();
                if (j3 == lastModified) {
                    String str4 = str3;
                    SharedPreferences sharedPreferences2 = sharedPreferences;
                    if (j2 == aVar.crc) {
                        arrayList.add(aVar);
                        i3++;
                        sharedPreferences = sharedPreferences2;
                        str3 = str4;
                    }
                }
                throw new IOException("Invalid extracted dex: " + aVar + " (key \"" + str2 + "\"), expected modification time: " + j3 + ", modification time: " + lastModified + ", expected crc: " + j2 + ", file crc: " + aVar.crc);
            }
            StringBuilder i4 = g.a.a.a.a.i("Missing extracted secondary dex file '");
            i4.append(aVar.getPath());
            i4.append("'");
            throw new IOException(i4.toString());
        }
        return arrayList;
    }

    public final List<a> k() throws IOException {
        a aVar;
        boolean z;
        String str = this.b.getName() + ".classes";
        File[] listFiles = this.f1535d.listFiles(new b(this));
        if (listFiles == null) {
            StringBuilder i2 = g.a.a.a.a.i("Failed to list secondary dex dir content (");
            i2.append(this.f1535d.getPath());
            i2.append(").");
            Log.w("MultiDex", i2.toString());
        } else {
            for (File file : listFiles) {
                StringBuilder i3 = g.a.a.a.a.i("Trying to delete old file ");
                i3.append(file.getPath());
                i3.append(" of size ");
                i3.append(file.length());
                Log.i("MultiDex", i3.toString());
                if (!file.delete()) {
                    StringBuilder i4 = g.a.a.a.a.i("Failed to delete old file ");
                    i4.append(file.getPath());
                    Log.w("MultiDex", i4.toString());
                } else {
                    StringBuilder i5 = g.a.a.a.a.i("Deleted old file ");
                    i5.append(file.getPath());
                    Log.i("MultiDex", i5.toString());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.b);
        int i6 = 2;
        String str2 = "classes2.dex";
        while (true) {
            try {
                ZipEntry entry = zipFile.getEntry(str2);
                if (entry != null) {
                    aVar = new a(this.f1535d, str + i6 + ".zip");
                    arrayList.add(aVar);
                    Log.i("MultiDex", "Extraction is needed for file " + aVar);
                    int i7 = 0;
                    z = false;
                    while (i7 < 3 && !z) {
                        i7++;
                        b(zipFile, entry, aVar, str);
                        aVar.crc = f(aVar);
                        z = true;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Extraction ");
                        sb.append(z ? "succeeded" : "failed");
                        sb.append(" '");
                        sb.append(aVar.getAbsolutePath());
                        sb.append("': length ");
                        sb.append(aVar.length());
                        sb.append(" - crc: ");
                        sb.append(aVar.crc);
                        Log.i("MultiDex", sb.toString());
                        if (!z) {
                            aVar.delete();
                            if (aVar.exists()) {
                                Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + aVar.getPath() + "'");
                            }
                        }
                    }
                    if (z) {
                        i6++;
                        str2 = "classes" + i6 + ".dex";
                    } else {
                        throw new IOException("Could not create zip file " + aVar.getAbsolutePath() + " for secondary dex (" + i6 + ")");
                    }
                } else {
                    try {
                        zipFile.close();
                    } catch (IOException e2) {
                        Log.w("MultiDex", "Failed to close resource", e2);
                    }
                    return arrayList;
                }
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to read crc from " + aVar.getAbsolutePath(), e3);
                z = false;
            } catch (Throwable th) {
                try {
                    zipFile.close();
                } catch (IOException e4) {
                    Log.w("MultiDex", "Failed to close resource", e4);
                }
                throw th;
            }
        }
    }
}
