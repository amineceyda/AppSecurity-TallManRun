package com.tencent.crabshell.builder;

import g.a.a.a.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import m.b.a.a.b.f;

public class UnZipUtils {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final int BUFF_SIZE = 1048576;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = f.a(3310140197473293927L, "com/tencent/crabshell/builder/UnZipUtils", 27);
        $jacocoData = a;
        return a;
    }

    public UnZipUtils() {
        $jacocoInit()[0] = true;
    }

    public static void upZipFile(File file, String str) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        File file2 = new File(str);
        $jacocoInit[2] = true;
        if (file2.exists()) {
            $jacocoInit[3] = true;
        } else {
            $jacocoInit[4] = true;
            file2.mkdirs();
            $jacocoInit[5] = true;
        }
        ZipFile zipFile = new ZipFile(file);
        $jacocoInit[6] = true;
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        $jacocoInit[7] = true;
        while (entries.hasMoreElements()) {
            $jacocoInit[8] = true;
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            $jacocoInit[9] = true;
            InputStream inputStream = zipFile.getInputStream(zipEntry);
            $jacocoInit[10] = true;
            StringBuilder i2 = a.i(str);
            i2.append(File.separator);
            i2.append(zipEntry.getName());
            String sb = i2.toString();
            $jacocoInit[11] = true;
            String str2 = new String(sb.getBytes("8859_1"), "GB2312");
            $jacocoInit[12] = true;
            File file3 = new File(str2);
            $jacocoInit[13] = true;
            if (file3.exists()) {
                $jacocoInit[14] = true;
            } else {
                $jacocoInit[15] = true;
                File parentFile = file3.getParentFile();
                $jacocoInit[16] = true;
                if (parentFile.exists()) {
                    $jacocoInit[17] = true;
                } else {
                    $jacocoInit[18] = true;
                    parentFile.mkdirs();
                    $jacocoInit[19] = true;
                }
                file3.createNewFile();
                $jacocoInit[20] = true;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            byte[] bArr = new byte[BUFF_SIZE];
            $jacocoInit[21] = true;
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                $jacocoInit[22] = true;
                fileOutputStream.write(bArr, 0, read);
                $jacocoInit[23] = true;
            }
            inputStream.close();
            $jacocoInit[24] = true;
            fileOutputStream.close();
            $jacocoInit[25] = true;
        }
        $jacocoInit[26] = true;
    }

    public static void upZipFile(String str, String str2) throws ZipException, IOException {
        boolean[] $jacocoInit = $jacocoInit();
        upZipFile(new File(str), str2);
        $jacocoInit[1] = true;
    }
}
