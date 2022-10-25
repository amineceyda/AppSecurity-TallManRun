package f.a.a.a.l;

import java.util.HashMap;

public class h {
    public HashMap<String, b> a = new HashMap<>();

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005b A[SYNTHETIC, Splitter:B:36:0x005b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final f.a.a.a.l.b a(f.a.a.a.l.i r4, java.lang.ClassLoader r5) {
        /*
            r3 = this;
            java.lang.StackTraceElement r4 = r4.ste
            java.lang.String r4 = r4.getClassName()
            java.util.HashMap<java.lang.String, f.a.a.a.l.b> r0 = r3.a
            java.lang.Object r0 = r0.get(r4)
            f.a.a.a.l.b r0 = (f.a.a.a.l.b) r0
            if (r0 == 0) goto L_0x0011
            return r0
        L_0x0011:
            r0 = 0
            if (r5 != 0) goto L_0x0015
            goto L_0x001e
        L_0x0015:
            java.lang.Class r1 = r5.loadClass(r4)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x001e, Exception -> 0x001a }
            goto L_0x001f
        L_0x001a:
            r1 = move-exception
            r1.printStackTrace()
        L_0x001e:
            r1 = r0
        L_0x001f:
            if (r1 == 0) goto L_0x0023
        L_0x0021:
            r0 = r1
            goto L_0x0046
        L_0x0023:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r2 = r2.getContextClassLoader()
            if (r2 == r5) goto L_0x003a
            if (r2 != 0) goto L_0x0030
            goto L_0x0039
        L_0x0030:
            java.lang.Class r1 = r2.loadClass(r4)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x0039, Exception -> 0x0035 }
            goto L_0x003a
        L_0x0035:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0039:
            r1 = r0
        L_0x003a:
            if (r1 == 0) goto L_0x003d
            goto L_0x0021
        L_0x003d:
            java.lang.Class r0 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x0046, Exception -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0046:
            java.lang.String r5 = "na"
            if (r0 != 0) goto L_0x004c
        L_0x004a:
            r1 = r5
            goto L_0x0059
        L_0x004c:
            java.lang.Package r1 = r0.getPackage()
            if (r1 == 0) goto L_0x004a
            java.lang.String r1 = r1.getImplementationVersion()
            if (r1 != 0) goto L_0x0059
            goto L_0x004a
        L_0x0059:
            if (r0 == 0) goto L_0x007f
            java.security.ProtectionDomain r0 = r0.getProtectionDomain()     // Catch:{ Exception -> 0x007f }
            java.security.CodeSource r0 = r0.getCodeSource()     // Catch:{ Exception -> 0x007f }
            if (r0 == 0) goto L_0x007f
            java.net.URL r0 = r0.getLocation()     // Catch:{ Exception -> 0x007f }
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x007f }
            r2 = 47
            java.lang.String r2 = r3.b(r0, r2)     // Catch:{ Exception -> 0x007f }
            if (r2 == 0) goto L_0x0079
            r5 = r2
            goto L_0x007f
        L_0x0079:
            r2 = 92
            java.lang.String r5 = r3.b(r0, r2)     // Catch:{ Exception -> 0x007f }
        L_0x007f:
            f.a.a.a.l.b r0 = new f.a.a.a.l.b
            r2 = 0
            r0.<init>(r5, r1, r2)
            java.util.HashMap<java.lang.String, f.a.a.a.l.b> r5 = r3.a
            r5.put(r4, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.a.l.h.a(f.a.a.a.l.i, java.lang.ClassLoader):f.a.a.a.l.b");
    }

    public final String b(String str, char c) {
        int lastIndexOf = str.lastIndexOf(c);
        if (lastIndexOf != -1 && lastIndexOf + 1 == str.length()) {
            return str.substring(str.lastIndexOf(c, lastIndexOf - 1) + 1);
        }
        if (lastIndexOf > 0) {
            return str.substring(lastIndexOf + 1);
        }
        return null;
    }

    public final void c(i[] iVarArr) {
        int i2;
        StackTraceElement[] stackTrace = new Throwable("local stack reference").getStackTrace();
        if (iVarArr == null) {
            i2 = 0;
        } else {
            int length = stackTrace.length - 1;
            int length2 = iVarArr.length - 1;
            i2 = 0;
            while (length >= 0 && length2 >= 0 && stackTrace[length].equals(iVarArr[length2].ste)) {
                i2++;
                length--;
                length2--;
            }
        }
        int length3 = iVarArr.length - i2;
        for (int i3 = 0; i3 < i2; i3++) {
            i iVar = iVarArr[length3 + i3];
            iVar.b(a(iVar, (ClassLoader) null));
        }
        int length4 = iVarArr.length - i2;
        for (int i4 = 0; i4 < length4; i4++) {
            i iVar2 = iVarArr[i4];
            iVar2.b(a(iVar2, (ClassLoader) null));
        }
    }
}
