package f.a.a.b.u.j;

import f.a.a.b.w.d;

public class t extends d {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.io.BufferedOutputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0180 A[SYNTHETIC, Splitter:B:68:0x0180] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0187 A[SYNTHETIC, Splitter:B:72:0x0187] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s(java.lang.String r12, java.lang.String r13) throws ch.qos.logback.core.rolling.RolloverFailure {
        /*
            r11 = this;
            boolean r0 = r12.equals(r13)
            if (r0 == 0) goto L_0x0020
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Source and target files are the same ["
            r13.append(r0)
            r13.append(r12)
            java.lang.String r12 = "]. Skipping."
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.p(r12)
            return
        L_0x0020:
            java.io.File r0 = new java.io.File
            r0.<init>(r12)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x01d7
            java.io.File r1 = new java.io.File
            r1.<init>(r13)
            boolean r2 = f.a.a.b.z.l.s(r1)
            java.lang.String r3 = "]"
            if (r2 == 0) goto L_0x01bd
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Renaming file ["
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = "] to ["
            r2.append(r4)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r11.n(r2)
            boolean r2 = r0.renameTo(r1)
            if (r2 != 0) goto L_0x01bc
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Failed to rename file ["
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = "] as ["
            r2.append(r5)
            r2.append(r1)
            java.lang.String r5 = "]."
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r11.p(r2)
            r2 = 7
            boolean r2 = f.a.a.b.z.i.a(r2)
            r5 = 0
            r6 = 0
            if (r2 != 0) goto L_0x008a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x00d7
        L_0x008a:
            java.io.File r2 = r1.getAbsoluteFile()
            java.io.File r2 = r2.getParentFile()
            java.lang.String r7 = "Parent of target file ["
            if (r2 != 0) goto L_0x00a4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r1)
            java.lang.String r1 = "] is null"
            goto L_0x00b7
        L_0x00a4:
            boolean r8 = r2.exists()
            if (r8 != 0) goto L_0x00c2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r1)
            java.lang.String r1 = "] does not exist"
        L_0x00b7:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11.p(r0)
            goto L_0x00d6
        L_0x00c2:
            boolean r0 = e.e.d.l.a.e(r0, r2)     // Catch:{ RolloverFailure -> 0x00d0 }
            if (r0 != 0) goto L_0x00ca
            r0 = 1
            goto L_0x00cb
        L_0x00ca:
            r0 = 0
        L_0x00cb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ RolloverFailure -> 0x00d0 }
            goto L_0x00d7
        L_0x00d0:
            r0 = move-exception
            java.lang.String r1 = "Error while checking file store equality"
            r11.q(r1, r0)
        L_0x00d6:
            r0 = r6
        L_0x00d7:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x018b
            java.lang.String r0 = "Detected different file systems for source ["
            java.lang.String r1 = "] and target ["
            java.lang.String r2 = "]. Attempting rename by copying."
            java.lang.String r0 = g.a.a.a.a.d(r0, r12, r1, r13, r2)
            r11.p(r0)
            f.a.a.b.z.l r0 = new f.a.a.b.z.l
            f.a.a.b.d r1 = r11.c
            r0.<init>(r1)
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0156, all -> 0x0153 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0156, all -> 0x0153 }
            r2.<init>(r12)     // Catch:{ IOException -> 0x0156, all -> 0x0153 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0156, all -> 0x0153 }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x014c }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x014c }
            r7.<init>(r13)     // Catch:{ IOException -> 0x014c }
            r2.<init>(r7)     // Catch:{ IOException -> 0x014c }
            r7 = 32768(0x8000, float:4.5918E-41)
            byte[] r7 = new byte[r7]     // Catch:{ IOException -> 0x0147, all -> 0x0144 }
        L_0x010c:
            int r8 = r1.read(r7)     // Catch:{ IOException -> 0x0147, all -> 0x0144 }
            r9 = -1
            if (r8 == r9) goto L_0x0117
            r2.write(r7, r5, r8)     // Catch:{ IOException -> 0x0147, all -> 0x0144 }
            goto L_0x010c
        L_0x0117:
            r1.close()     // Catch:{ IOException -> 0x0147, all -> 0x0144 }
            r2.close()     // Catch:{ IOException -> 0x013f, all -> 0x013d }
            java.io.File r13 = new java.io.File
            r13.<init>(r12)
            boolean r13 = r13.delete()
            if (r13 != 0) goto L_0x013c
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Could not delete "
            r13.append(r0)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.p(r12)
        L_0x013c:
            return
        L_0x013d:
            r12 = move-exception
            goto L_0x017e
        L_0x013f:
            r1 = move-exception
            r10 = r6
            r6 = r2
            r2 = r10
            goto L_0x0150
        L_0x0144:
            r12 = move-exception
            r6 = r2
            goto L_0x017c
        L_0x0147:
            r5 = move-exception
            r6 = r2
            goto L_0x0159
        L_0x014a:
            r12 = move-exception
            goto L_0x017c
        L_0x014c:
            r2 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
        L_0x0150:
            r5 = r1
            r1 = r2
            goto L_0x0159
        L_0x0153:
            r12 = move-exception
            r2 = r6
            goto L_0x017e
        L_0x0156:
            r1 = move-exception
            r5 = r1
            r1 = r6
        L_0x0159:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x014a }
            r2.<init>()     // Catch:{ all -> 0x014a }
            java.lang.String r7 = "Failed to copy ["
            r2.append(r7)     // Catch:{ all -> 0x014a }
            r2.append(r12)     // Catch:{ all -> 0x014a }
            r2.append(r4)     // Catch:{ all -> 0x014a }
            r2.append(r13)     // Catch:{ all -> 0x014a }
            r2.append(r3)     // Catch:{ all -> 0x014a }
            java.lang.String r12 = r2.toString()     // Catch:{ all -> 0x014a }
            r0.c(r12, r5)     // Catch:{ all -> 0x014a }
            ch.qos.logback.core.rolling.RolloverFailure r13 = new ch.qos.logback.core.rolling.RolloverFailure     // Catch:{ all -> 0x014a }
            r13.<init>(r12)     // Catch:{ all -> 0x014a }
            throw r13     // Catch:{ all -> 0x014a }
        L_0x017c:
            r2 = r6
            r6 = r1
        L_0x017e:
            if (r6 == 0) goto L_0x0185
            r6.close()     // Catch:{ IOException -> 0x0184 }
            goto L_0x0185
        L_0x0184:
        L_0x0185:
            if (r2 == 0) goto L_0x018a
            r2.close()     // Catch:{ IOException -> 0x018a }
        L_0x018a:
            throw r12
        L_0x018b:
            java.lang.String r12 = "Please consider leaving the [file] option of "
            java.lang.StringBuilder r12 = g.a.a.a.a.i(r12)
            java.lang.Class<f.a.a.b.u.b> r13 = f.a.a.b.u.b.class
            java.lang.String r13 = r13.getSimpleName()
            r12.append(r13)
            java.lang.String r13 = " empty."
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.p(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "See also "
            r12.append(r13)
            java.lang.String r13 = "http://logback.qos.ch/codes.html#renamingError"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.p(r12)
        L_0x01bc:
            return
        L_0x01bd:
            ch.qos.logback.core.rolling.RolloverFailure r12 = new ch.qos.logback.core.rolling.RolloverFailure
            java.lang.String r13 = "Failed to create parent directories for ["
            java.lang.StringBuilder r13 = g.a.a.a.a.i(r13)
            java.lang.String r0 = r1.getAbsolutePath()
            r13.append(r0)
            r13.append(r3)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x01d7:
            ch.qos.logback.core.rolling.RolloverFailure r13 = new ch.qos.logback.core.rolling.RolloverFailure
            java.lang.String r0 = "File ["
            java.lang.String r1 = "] does not exist."
            java.lang.String r12 = g.a.a.a.a.c(r0, r12, r1)
            r13.<init>(r12)
            goto L_0x01e6
        L_0x01e5:
            throw r13
        L_0x01e6:
            goto L_0x01e5
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.b.u.j.t.s(java.lang.String, java.lang.String):void");
    }

    public String toString() {
        return "c.q.l.co.rolling.helper.RenameUtil";
    }
}
