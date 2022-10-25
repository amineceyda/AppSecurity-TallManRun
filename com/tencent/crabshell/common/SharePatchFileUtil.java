package com.tencent.crabshell.common;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.zip.ZipFile;
import m.b.a.a.b.f;

public class SharePatchFileUtil {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final int MD5_FILE_BUF_LENGTH = 102400;
    private static final String TEST_DEX_NAME = "test.dex";

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = f.a(-4375578557887109132L, "com/tencent/crabshell/common/SharePatchFileUtil", 67);
        $jacocoData = a;
        return a;
    }

    public SharePatchFileUtil() {
        $jacocoInit()[0] = true;
    }

    public static void close(Closeable closeable) {
        boolean[] $jacocoInit = $jacocoInit();
        if (closeable != null) {
            $jacocoInit[61] = true;
            try {
                closeable.close();
                $jacocoInit[63] = true;
            } catch (Exception e2) {
                $jacocoInit[64] = true;
                e2.printStackTrace();
                $jacocoInit[65] = true;
            }
            $jacocoInit[66] = true;
            return;
        }
        $jacocoInit[62] = true;
    }

    @SuppressLint({"NewApi"})
    public static void closeQuietly(Object obj) {
        boolean[] $jacocoInit = $jacocoInit();
        if (obj == null) {
            $jacocoInit[1] = true;
            return;
        }
        if (obj instanceof Closeable) {
            try {
                $jacocoInit[2] = true;
                ((Closeable) obj).close();
                $jacocoInit[3] = true;
            } catch (Throwable unused) {
                $jacocoInit[4] = true;
            }
        } else if (!(obj instanceof AutoCloseable)) {
            $jacocoInit[6] = true;
            if (obj instanceof ZipFile) {
                try {
                    $jacocoInit[10] = true;
                    ((ZipFile) obj).close();
                    $jacocoInit[11] = true;
                } catch (Throwable unused2) {
                    $jacocoInit[12] = true;
                }
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("obj: " + obj + " cannot be closed.");
                $jacocoInit[13] = true;
                throw illegalArgumentException;
            }
        } else {
            try {
                $jacocoInit[7] = true;
                ((AutoCloseable) obj).close();
                $jacocoInit[8] = true;
            } catch (Throwable unused3) {
                $jacocoInit[9] = true;
            }
        }
        $jacocoInit[14] = true;
    }

    public static int compareFiles(File file, File file2, Map<String, Boolean> map) {
        int i2;
        int i3;
        boolean[] $jacocoInit = $jacocoInit();
        int i4 = 0;
        if (file != null) {
            $jacocoInit[17] = true;
        } else if (file2 != null) {
            $jacocoInit[18] = true;
        } else {
            $jacocoInit[19] = true;
            return 0;
        }
        if (file == null) {
            $jacocoInit[20] = true;
            return -1;
        } else if (file2 == null) {
            $jacocoInit[21] = true;
            return 1;
        } else {
            String name = file.getName();
            $jacocoInit[22] = true;
            String name2 = file2.getName();
            $jacocoInit[23] = true;
            if (name.equals(name2)) {
                $jacocoInit[24] = true;
                return 0;
            }
            $jacocoInit[25] = true;
            if (name.startsWith(TEST_DEX_NAME)) {
                $jacocoInit[26] = true;
                return 1;
            } else if (name2.startsWith(TEST_DEX_NAME)) {
                $jacocoInit[27] = true;
                return -1;
            } else {
                boolean booleanValue = map.get(name).booleanValue();
                $jacocoInit[28] = true;
                boolean booleanValue2 = map.get(name2).booleanValue();
                if (!booleanValue) {
                    $jacocoInit[29] = true;
                } else if (!booleanValue2) {
                    $jacocoInit[30] = true;
                } else {
                    $jacocoInit[31] = true;
                    int indexOf = name.indexOf(46);
                    $jacocoInit[32] = true;
                    int indexOf2 = name2.indexOf(46);
                    $jacocoInit[33] = true;
                    if (indexOf > 7) {
                        i2 = Integer.parseInt(name.substring(7, indexOf));
                        $jacocoInit[34] = true;
                    } else {
                        $jacocoInit[35] = true;
                        i2 = 1;
                    }
                    $jacocoInit[36] = true;
                    if (indexOf2 > 7) {
                        i3 = Integer.parseInt(name2.substring(7, indexOf2));
                        $jacocoInit[37] = true;
                    } else {
                        $jacocoInit[38] = true;
                        i3 = 1;
                    }
                    if (i2 == i3) {
                        $jacocoInit[39] = true;
                    } else if (i2 < i3) {
                        $jacocoInit[40] = true;
                        i4 = -1;
                    } else {
                        $jacocoInit[41] = true;
                        i4 = 1;
                    }
                    $jacocoInit[42] = true;
                    return i4;
                }
                if (booleanValue) {
                    $jacocoInit[43] = true;
                    return -1;
                } else if (booleanValue2) {
                    $jacocoInit[44] = true;
                    return 1;
                } else {
                    int compareTo = name.compareTo(name2);
                    $jacocoInit[45] = true;
                    return compareTo;
                }
            }
        }
    }

    public static boolean copy(String str, String str2) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        boolean[] $jacocoInit = $jacocoInit();
        if (TextUtils.isEmpty(str)) {
            $jacocoInit[46] = true;
        } else if (TextUtils.isEmpty(str2)) {
            $jacocoInit[47] = true;
        } else {
            File file = new File(str);
            $jacocoInit[49] = true;
            if (!file.exists()) {
                $jacocoInit[50] = true;
                return false;
            }
            BufferedInputStream bufferedInputStream = null;
            try {
                $jacocoInit[51] = true;
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                try {
                    $jacocoInit[52] = true;
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(str2)));
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = null;
                    bufferedInputStream = bufferedInputStream2;
                    close(bufferedInputStream);
                    $jacocoInit[59] = true;
                    close(bufferedOutputStream);
                    $jacocoInit[60] = true;
                    throw th;
                }
                try {
                    byte[] bArr = new byte[5120];
                    $jacocoInit[53] = true;
                    while (true) {
                        int read = bufferedInputStream2.read(bArr);
                        if (read != -1) {
                            $jacocoInit[54] = true;
                            bufferedOutputStream.write(bArr, 0, read);
                            $jacocoInit[55] = true;
                        } else {
                            bufferedOutputStream.flush();
                            $jacocoInit[56] = true;
                            close(bufferedInputStream2);
                            $jacocoInit[57] = true;
                            close(bufferedOutputStream);
                            $jacocoInit[58] = true;
                            return true;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream2;
                    close(bufferedInputStream);
                    $jacocoInit[59] = true;
                    close(bufferedOutputStream);
                    $jacocoInit[60] = true;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
                close(bufferedInputStream);
                $jacocoInit[59] = true;
                close(bufferedOutputStream);
                $jacocoInit[60] = true;
                throw th;
            }
        }
        $jacocoInit[48] = true;
        return false;
    }

    public static String getLengthAndLastModifyTime(File file) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!file.exists()) {
            $jacocoInit[15] = true;
            return "";
        }
        String str = file.length() + "_" + file.lastModified();
        $jacocoInit[16] = true;
        return str;
    }
}
