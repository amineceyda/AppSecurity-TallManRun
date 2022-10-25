package com.tencent.qmsp.sdk.f;

import com.tencent.crabshell.common.SharePatchFileUtil;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class a {

    /* renamed from: e  reason: collision with root package name */
    private static a f877e = new a(SharePatchFileUtil.MD5_FILE_BUF_LENGTH);

    /* renamed from: f  reason: collision with root package name */
    public static final Comparator<byte[]> f878f = new C0016a();
    private List<byte[]> a = new LinkedList();
    private List<byte[]> b = new ArrayList(64);
    private int c = 0;

    /* renamed from: d  reason: collision with root package name */
    private final int f879d;

    /* renamed from: com.tencent.qmsp.sdk.f.a$a  reason: collision with other inner class name */
    public static class C0016a implements Comparator<byte[]> {
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public a(int i2) {
        this.f879d = i2;
    }

    public static a a() {
        return f877e;
    }

    private synchronized void b() {
        while (this.c > this.f879d) {
            byte[] remove = this.a.remove(0);
            this.b.remove(remove);
            this.c -= remove.length;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(byte[] r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x002e
            int r0 = r3.length     // Catch:{ all -> 0x002b }
            int r1 = r2.f879d     // Catch:{ all -> 0x002b }
            if (r0 <= r1) goto L_0x0009
            goto L_0x002e
        L_0x0009:
            java.util.List<byte[]> r0 = r2.a     // Catch:{ all -> 0x002b }
            r0.add(r3)     // Catch:{ all -> 0x002b }
            java.util.List<byte[]> r0 = r2.b     // Catch:{ all -> 0x002b }
            java.util.Comparator<byte[]> r1 = f878f     // Catch:{ all -> 0x002b }
            int r0 = java.util.Collections.binarySearch(r0, r3, r1)     // Catch:{ all -> 0x002b }
            if (r0 >= 0) goto L_0x001b
            int r0 = -r0
            int r0 = r0 + -1
        L_0x001b:
            java.util.List<byte[]> r1 = r2.b     // Catch:{ all -> 0x002b }
            r1.add(r0, r3)     // Catch:{ all -> 0x002b }
            int r0 = r2.c     // Catch:{ all -> 0x002b }
            int r3 = r3.length     // Catch:{ all -> 0x002b }
            int r0 = r0 + r3
            r2.c = r0     // Catch:{ all -> 0x002b }
            r2.b()     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x002e:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.f.a.a(byte[]):void");
    }

    public synchronized byte[] a(int i2) {
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            byte[] bArr = this.b.get(i3);
            if (bArr.length >= i2) {
                this.c -= bArr.length;
                this.b.remove(i3);
                this.a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i2];
    }
}
