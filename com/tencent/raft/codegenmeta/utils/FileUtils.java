package com.tencent.raft.codegenmeta.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static final String TAG = "FileUtils";

    public static List<Pair<String, String>> analyzeIndexFile(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        File file = new File(str);
        try {
            if (file.isFile() && file.exists()) {
                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(Constants.KEY_INDEX_FILE_SEPARATOR);
                    if (split.length == 2) {
                        arrayList.add(new Pair(split[0], str2 + File.separator + split[1]));
                    }
                }
                bufferedReader.close();
                inputStreamReader.close();
            }
        } catch (Exception e2) {
            RLog.d(TAG, "analyzeIndexFile error: " + e2);
        }
        return arrayList;
    }

    public static boolean deleteFile(File file) {
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory()) {
            String[] list = file.list();
            if (list == null) {
                return true;
            }
            for (String file2 : list) {
                if (!deleteFile(new File(file, file2))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ac A[SYNTHETIC, Splitter:B:39:0x00ac] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b6 A[SYNTHETIC, Splitter:B:44:0x00b6] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c2 A[SYNTHETIC, Splitter:B:50:0x00c2] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cc A[SYNTHETIC, Splitter:B:55:0x00cc] */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void writeToIndexFile(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r0 = 0
            java.lang.String r1 = ""
            java.lang.String r6 = r6.replace(r7, r1)     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            r7.<init>()     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            r7.append(r5)     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            java.lang.String r5 = ":"
            r7.append(r5)     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            r7.append(r6)     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            java.lang.String r5 = r7.toString()     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            r6.<init>(r4)     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            java.lang.String r7 = "rw"
            r4.<init>(r6, r7)     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            java.nio.channels.FileChannel r6 = r4.getChannel()     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            java.nio.channels.FileLock r0 = r6.lock()     // Catch:{ IOException -> 0x00a0 }
        L_0x002f:
            java.lang.String r7 = r4.readLine()     // Catch:{ IOException -> 0x00a0 }
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L_0x003f
            boolean r7 = com.tencent.raft.codegenmeta.utils.TextUtils.equals(r7, r5)     // Catch:{ IOException -> 0x00a0 }
            if (r7 == 0) goto L_0x002f
            r7 = 1
            goto L_0x0040
        L_0x003f:
            r7 = 0
        L_0x0040:
            if (r7 == 0) goto L_0x006f
            java.lang.String r4 = "FileUtils"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x00a0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a0 }
            r1.<init>()     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r3 = "statement has cache before: "
            r1.append(r3)     // Catch:{ IOException -> 0x00a0 }
            r1.append(r5)     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r5 = r1.toString()     // Catch:{ IOException -> 0x00a0 }
            r7[r2] = r5     // Catch:{ IOException -> 0x00a0 }
            com.tencent.raft.codegenmeta.utils.RLog.d(r4, r7)     // Catch:{ IOException -> 0x00a0 }
            if (r0 == 0) goto L_0x0066
            r0.release()     // Catch:{ IOException -> 0x0062 }
            goto L_0x0066
        L_0x0062:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0066:
            r6.close()     // Catch:{ IOException -> 0x006a }
            goto L_0x006e
        L_0x006a:
            r4 = move-exception
            r4.printStackTrace()
        L_0x006e:
            return
        L_0x006f:
            long r1 = r4.length()     // Catch:{ IOException -> 0x00a0 }
            r4.seek(r1)     // Catch:{ IOException -> 0x00a0 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a0 }
            r4.<init>()     // Catch:{ IOException -> 0x00a0 }
            r4.append(r5)     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r5 = "\n"
            r4.append(r5)     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x00a0 }
            byte[] r4 = r4.getBytes()     // Catch:{ IOException -> 0x00a0 }
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)     // Catch:{ IOException -> 0x00a0 }
            r6.write(r4)     // Catch:{ IOException -> 0x00a0 }
            if (r0 == 0) goto L_0x009c
            r0.release()     // Catch:{ IOException -> 0x0098 }
            goto L_0x009c
        L_0x0098:
            r4 = move-exception
            r4.printStackTrace()
        L_0x009c:
            r6.close()     // Catch:{ IOException -> 0x00ba }
            goto L_0x00be
        L_0x00a0:
            r4 = move-exception
            goto L_0x00a7
        L_0x00a2:
            r4 = move-exception
            r6 = r0
            goto L_0x00c0
        L_0x00a5:
            r4 = move-exception
            r6 = r0
        L_0x00a7:
            r4.printStackTrace()     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00b4
            r0.release()     // Catch:{ IOException -> 0x00b0 }
            goto L_0x00b4
        L_0x00b0:
            r4 = move-exception
            r4.printStackTrace()
        L_0x00b4:
            if (r6 == 0) goto L_0x00be
            r6.close()     // Catch:{ IOException -> 0x00ba }
            goto L_0x00be
        L_0x00ba:
            r4 = move-exception
            r4.printStackTrace()
        L_0x00be:
            return
        L_0x00bf:
            r4 = move-exception
        L_0x00c0:
            if (r0 == 0) goto L_0x00ca
            r0.release()     // Catch:{ IOException -> 0x00c6 }
            goto L_0x00ca
        L_0x00c6:
            r5 = move-exception
            r5.printStackTrace()
        L_0x00ca:
            if (r6 == 0) goto L_0x00d4
            r6.close()     // Catch:{ IOException -> 0x00d0 }
            goto L_0x00d4
        L_0x00d0:
            r5 = move-exception
            r5.printStackTrace()
        L_0x00d4:
            goto L_0x00d6
        L_0x00d5:
            throw r4
        L_0x00d6:
            goto L_0x00d5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.raft.codegenmeta.utils.FileUtils.writeToIndexFile(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
