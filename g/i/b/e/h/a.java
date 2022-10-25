package g.i.b.e.h;

import com.tencent.beacon.pack.AbstractJceStruct;

public final class a {
    public static byte[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, AbstractJceStruct.STRUCT_END, AbstractJceStruct.ZERO_TAG, AbstractJceStruct.SIMPLE_LIST, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    public static boolean a(int i2, int i3, int i4) {
        return i2 < i3 && i4 == -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        if (r7 == -1) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        r1.append((char) (((r6 & 15) << 4) | ((r7 & 60) >>> 2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        r6 = r3 + 1;
        r3 = r10[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006c, code lost:
        if (r3 != 61) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        return r1.toString().getBytes("iso8859-1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        r3 = a[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        if (a(r6, r2, r3) != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0081, code lost:
        if (r3 == -1) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0083, code lost:
        r1.append((char) (r3 | ((r7 & 3) << 6)));
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008e, code lost:
        r3 = r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] b(java.lang.String r10) {
        /*
            r0 = 0
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            r1.<init>()     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            java.lang.String r2 = "US-ASCII"
            byte[] r10 = r10.getBytes(r2)     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            int r2 = r10.length     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            r3 = 0
        L_0x000e:
            java.lang.String r4 = "iso8859-1"
            if (r3 >= r2) goto L_0x0097
        L_0x0012:
            byte[] r5 = a     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            int r6 = r3 + 1
            byte r3 = r10[r3]     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            byte r3 = r5[r3]     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            boolean r5 = a(r6, r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            if (r5 != 0) goto L_0x0094
            r5 = -1
            if (r3 == r5) goto L_0x0097
        L_0x0023:
            byte[] r7 = a     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            int r8 = r6 + 1
            byte r6 = r10[r6]     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            byte r6 = r7[r6]     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            boolean r7 = a(r8, r2, r6)     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            if (r7 != 0) goto L_0x0092
            if (r6 == r5) goto L_0x0097
            int r3 = r3 << 2
            r7 = r6 & 48
            int r7 = r7 >>> 4
            r3 = r3 | r7
            char r3 = (char) r3     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            r1.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
        L_0x003e:
            int r3 = r8 + 1
            byte r7 = r10[r8]     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            r8 = 61
            if (r7 != r8) goto L_0x004f
            java.lang.String r10 = r1.toString()     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            byte[] r10 = r10.getBytes(r4)     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            return r10
        L_0x004f:
            byte[] r9 = a     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            byte r7 = r9[r7]     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            boolean r9 = a(r3, r2, r7)     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            if (r9 != 0) goto L_0x0090
            if (r7 == r5) goto L_0x0097
            r6 = r6 & 15
            int r6 = r6 << 4
            r9 = r7 & 60
            int r9 = r9 >>> 2
            r6 = r6 | r9
            char r6 = (char) r6     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            r1.append(r6)     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
        L_0x0068:
            int r6 = r3 + 1
            byte r3 = r10[r3]     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            if (r3 != r8) goto L_0x0077
            java.lang.String r10 = r1.toString()     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            byte[] r10 = r10.getBytes(r4)     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            return r10
        L_0x0077:
            byte[] r9 = a     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            byte r3 = r9[r3]     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            boolean r9 = a(r6, r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            if (r9 != 0) goto L_0x008e
            if (r3 == r5) goto L_0x0097
            r4 = r7 & 3
            int r4 = r4 << 6
            r3 = r3 | r4
            char r3 = (char) r3     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            r1.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            r3 = r6
            goto L_0x000e
        L_0x008e:
            r3 = r6
            goto L_0x0068
        L_0x0090:
            r8 = r3
            goto L_0x003e
        L_0x0092:
            r6 = r8
            goto L_0x0023
        L_0x0094:
            r3 = r6
            goto L_0x0012
        L_0x0097:
            java.lang.String r10 = r1.toString()     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            byte[] r10 = r10.getBytes(r4)     // Catch:{ UnsupportedEncodingException -> 0x00a0 }
            return r10
        L_0x00a0:
            r10 = move-exception
            r10.printStackTrace()
            byte[] r10 = new byte[r0]
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.h.a.b(java.lang.String):byte[]");
    }
}
