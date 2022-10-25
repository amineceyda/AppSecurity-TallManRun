package com.tencent.qmsp.sdk.b;

import com.tencent.beacon.pack.AbstractJceStruct;
import com.tencent.qmsp.sdk.f.h;
import com.tencent.raft.measure.utils.MeasureConst;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

public class a {
    private static final byte[] a = {49, 99, -3, 81, 63, 117, 116, -14, 40};
    private static final byte[] b = {4, 85, Byte.MIN_VALUE};
    private static final byte[] c = {4, 85, Byte.MIN_VALUE, 15, AbstractJceStruct.SIMPLE_LIST, 25, 84, -78, 21, 91, -112, 115, 123, AbstractJceStruct.STRUCT_END, 118, -7, 33, 121, -67, 71};

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f769d = {-58, -26, -51, -19};

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f770e = {-58, -26, -51, -19, 30, -3, -21, -29, 87, 39, 40, AbstractJceStruct.ZERO_TAG, -119, -40, -84, 65};

    /* renamed from: f  reason: collision with root package name */
    private static final b f771f = b.AES;

    /* renamed from: g  reason: collision with root package name */
    private static ThreadLocal<Integer> f772g = new ThreadLocal<>();

    /* renamed from: com.tencent.qmsp.sdk.b.a$a  reason: collision with other inner class name */
    public static /* synthetic */ class C0011a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000d */
        static {
            /*
                com.tencent.qmsp.sdk.b.a.b.values()
                r0 = 3
                int[] r0 = new int[r0]
                a = r0
                com.tencent.qmsp.sdk.b.a$b r1 = com.tencent.qmsp.sdk.b.a.b.AES     // Catch:{ NoSuchFieldError -> 0x000d }
                r1 = 1
                r0[r1] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.tencent.qmsp.sdk.b.a$b r1 = com.tencent.qmsp.sdk.b.a.b.f774e     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1 = 2
                r0[r1] = r1     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.b.a.C0011a.<clinit>():void");
        }
    }

    public enum b {
        UNKNOWN(0, ""),
        AES(1, ""),
        f774e(2, "");
        
        private short a;
        private String b;

        private b(short s, String str) {
            this.a = s;
            this.b = str;
        }

        public static b a(int i2) {
            return i2 != 1 ? i2 != 2 ? UNKNOWN : f774e : AES;
        }

        public int a() {
            return this.a;
        }

        public String toString() {
            return this.b;
        }
    }

    public enum c {
        c(0, ""),
        OVERLOAD(1, ""),
        FATAL(2, ""),
        CMD_UNKNOWN(3, ""),
        HOST_UNKNOWN(10, ""),
        CONN_ERR(11, ""),
        SEND_ERR(12, ""),
        RECV_ERR(13, ""),
        WRONG_FORMAT(14, ""),
        SYS_ERR(15, ""),
        DECIPHER_ERR(16, ""),
        DECODE_JSON(20, "");
        
        private int a;
        private String b;

        private c(int i2, String str) {
            this.a = i2;
            this.b = str;
        }

        public int a() {
            return this.a;
        }

        public String toString() {
            return this.b;
        }
    }

    public static class d {
        public JSONObject a;
        public int b;

        public d(JSONObject jSONObject, int i2) {
            this.a = jSONObject;
            this.b = i2;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [org.json.JSONObject, java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:22|23|63|24|25|26|29) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:34|35|61|36|37|38|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r5 = new com.tencent.qmsp.sdk.b.a.d(r3, com.tencent.qmsp.sdk.b.a.c.f781i.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        a((java.io.Closeable) r3);
        a((java.io.Closeable) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0096, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        r8.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r4 = new com.tencent.qmsp.sdk.b.a.d(r3, com.tencent.qmsp.sdk.b.a.c.f780h.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a9, code lost:
        a((java.io.Closeable) r3);
        a((java.io.Closeable) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b3, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b4, code lost:
        r8.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b7, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b8, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0081 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x009e */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.qmsp.sdk.b.a.d a(int r8, java.lang.String r9, int r10, org.json.JSONObject r11) {
        /*
            java.lang.ThreadLocal<java.lang.Integer> r0 = f772g
            com.tencent.qmsp.sdk.b.a$c r1 = com.tencent.qmsp.sdk.b.a.c.c
            int r1 = r1.a()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.set(r1)
            java.net.InetSocketAddress r0 = new java.net.InetSocketAddress
            byte[] r1 = a
            java.lang.String r1 = com.tencent.qmsp.sdk.f.h.a(r1)
            r2 = 33445(0x82a5, float:4.6866E-41)
            r0.<init>(r1, r2)
            r1 = 0
        L_0x001e:
            r2 = 1
            r3 = 0
            if (r1 >= r2) goto L_0x00ea
            java.net.Socket r2 = new java.net.Socket
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r4 = com.tencent.qmsp.sdk.app.a.getAtomConnTimeOut()     // Catch:{ IOException -> 0x009e }
            int r4 = r4.get()     // Catch:{ IOException -> 0x009e }
            r2.connect(r0, r4)     // Catch:{ IOException -> 0x009e }
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0080 }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0080 }
            java.io.OutputStream r6 = r2.getOutputStream()     // Catch:{ IOException -> 0x0080 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0080 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0080 }
            a(r8, r9, r10, r11, r4)     // Catch:{ IOException -> 0x0081 }
            java.util.concurrent.atomic.AtomicInteger r5 = com.tencent.qmsp.sdk.app.a.getAtomReadTimeOut()     // Catch:{ all -> 0x009b }
            int r5 = r5.get()     // Catch:{ all -> 0x009b }
            r2.setSoTimeout(r5)     // Catch:{ all -> 0x009b }
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ all -> 0x009b }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ all -> 0x009b }
            java.io.InputStream r7 = r2.getInputStream()     // Catch:{ all -> 0x009b }
            r6.<init>(r7)     // Catch:{ all -> 0x009b }
            r5.<init>(r6)     // Catch:{ all -> 0x009b }
            org.json.JSONObject r3 = a((java.io.DataInputStream) r5)     // Catch:{ all -> 0x009c }
            com.tencent.qmsp.sdk.b.a$d r6 = new com.tencent.qmsp.sdk.b.a$d     // Catch:{ all -> 0x009c }
            java.lang.ThreadLocal<java.lang.Integer> r7 = f772g     // Catch:{ all -> 0x009c }
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x009c }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x009c }
            int r7 = r7.intValue()     // Catch:{ all -> 0x009c }
            r6.<init>(r3, r7)     // Catch:{ all -> 0x009c }
            a((java.io.Closeable) r5)
            a((java.io.Closeable) r4)
            r2.close()     // Catch:{ IOException -> 0x007b }
            goto L_0x007f
        L_0x007b:
            r8 = move-exception
            r8.printStackTrace()
        L_0x007f:
            return r6
        L_0x0080:
            r4 = r3
        L_0x0081:
            com.tencent.qmsp.sdk.b.a$d r5 = new com.tencent.qmsp.sdk.b.a$d     // Catch:{ all -> 0x009b }
            com.tencent.qmsp.sdk.b.a$c r6 = com.tencent.qmsp.sdk.b.a.c.SEND_ERR     // Catch:{ all -> 0x009b }
            int r6 = r6.a()     // Catch:{ all -> 0x009b }
            r5.<init>(r3, r6)     // Catch:{ all -> 0x009b }
            a((java.io.Closeable) r3)
            a((java.io.Closeable) r4)
            r2.close()     // Catch:{ IOException -> 0x0096 }
            goto L_0x009a
        L_0x0096:
            r8 = move-exception
            r8.printStackTrace()
        L_0x009a:
            return r5
        L_0x009b:
            r5 = r3
        L_0x009c:
            r3 = r4
            goto L_0x00b9
        L_0x009e:
            com.tencent.qmsp.sdk.b.a$d r4 = new com.tencent.qmsp.sdk.b.a$d     // Catch:{ all -> 0x00b8 }
            com.tencent.qmsp.sdk.b.a$c r5 = com.tencent.qmsp.sdk.b.a.c.CONN_ERR     // Catch:{ all -> 0x00b8 }
            int r5 = r5.a()     // Catch:{ all -> 0x00b8 }
            r4.<init>(r3, r5)     // Catch:{ all -> 0x00b8 }
            a((java.io.Closeable) r3)
            a((java.io.Closeable) r3)
            r2.close()     // Catch:{ IOException -> 0x00b3 }
            goto L_0x00b7
        L_0x00b3:
            r8 = move-exception
            r8.printStackTrace()
        L_0x00b7:
            return r4
        L_0x00b8:
            r5 = r3
        L_0x00b9:
            java.lang.ThreadLocal<java.lang.Integer> r4 = f772g     // Catch:{ all -> 0x00da }
            com.tencent.qmsp.sdk.b.a$c r6 = com.tencent.qmsp.sdk.b.a.c.SYS_ERR     // Catch:{ all -> 0x00da }
            int r6 = r6.a()     // Catch:{ all -> 0x00da }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00da }
            r4.set(r6)     // Catch:{ all -> 0x00da }
            a((java.io.Closeable) r5)
            a((java.io.Closeable) r3)
            r2.close()     // Catch:{ IOException -> 0x00d2 }
            goto L_0x00d6
        L_0x00d2:
            r2 = move-exception
            r2.printStackTrace()
        L_0x00d6:
            int r1 = r1 + 1
            goto L_0x001e
        L_0x00da:
            r8 = move-exception
            a((java.io.Closeable) r5)
            a((java.io.Closeable) r3)
            r2.close()     // Catch:{ IOException -> 0x00e5 }
            goto L_0x00e9
        L_0x00e5:
            r9 = move-exception
            r9.printStackTrace()
        L_0x00e9:
            throw r8
        L_0x00ea:
            com.tencent.qmsp.sdk.b.a$d r8 = new com.tencent.qmsp.sdk.b.a$d
            java.lang.ThreadLocal<java.lang.Integer> r9 = f772g
            java.lang.Object r9 = r9.get()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r8.<init>(r3, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.b.a.a(int, java.lang.String, int, org.json.JSONObject):com.tencent.qmsp.sdk.b.a$d");
    }

    private static JSONObject a(b bVar, byte[] bArr) {
        int i2 = C0011a.a[bVar.ordinal()];
        if (i2 == 1) {
            byte[] bArr2 = f770e;
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, h.a(b));
            Cipher instance = Cipher.getInstance(h.a(c));
            instance.init(2, secretKeySpec, new IvParameterSpec(bArr2));
            return new JSONObject(new String(instance.doFinal(bArr), Charset.forName(MeasureConst.CHARSET_UTF8)));
        } else if (i2 != 2) {
            return null;
        } else {
            return new JSONObject(new String(bArr, Charset.forName(MeasureConst.CHARSET_UTF8)));
        }
    }

    private static JSONObject a(DataInputStream dataInputStream) {
        ThreadLocal<Integer> threadLocal;
        c cVar;
        byte[] bArr = new byte[28];
        try {
            dataInputStream.readFully(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr, 18, 10);
            f772g.set(Integer.valueOf(wrap.getShort()));
            b a2 = b.a(wrap.getShort());
            int i2 = wrap.getShort();
            int i3 = wrap.getInt();
            dataInputStream.readFully(new byte[i2]);
            byte[] bArr2 = new byte[i3];
            dataInputStream.readFully(bArr2);
            if (i3 == 0) {
                return null;
            }
            try {
                return a(a2, bArr2);
            } catch (Exception unused) {
                threadLocal = f772g;
                cVar = c.DECIPHER_ERR;
                threadLocal.set(Integer.valueOf(cVar.a()));
                return null;
            }
        } catch (IOException unused2) {
            threadLocal = f772g;
            cVar = c.RECV_ERR;
            threadLocal.set(Integer.valueOf(cVar.a()));
            return null;
        }
    }

    private static void a(int i2, String str, int i3, JSONObject jSONObject, DataOutputStream dataOutputStream) {
        byte[] bArr;
        dataOutputStream.write(f769d);
        dataOutputStream.writeInt(i2);
        dataOutputStream.writeInt(i3);
        dataOutputStream.writeInt(0);
        dataOutputStream.writeShort(0);
        dataOutputStream.writeShort(0);
        b bVar = f771f;
        try {
            bArr = a(bVar, jSONObject);
        } catch (Exception unused) {
            bArr = jSONObject.toString().getBytes(MeasureConst.CHARSET_UTF8);
            bVar = b.f774e;
        }
        dataOutputStream.writeShort(bVar.a());
        byte[] bytes = str.getBytes(MeasureConst.CHARSET_UTF8);
        dataOutputStream.writeShort(bytes.length + 3);
        dataOutputStream.writeInt(bArr.length);
        dataOutputStream.write(1);
        dataOutputStream.writeShort(bytes.length);
        dataOutputStream.write(bytes);
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static byte[] a(b bVar, JSONObject jSONObject) {
        byte[] bytes = jSONObject.toString().getBytes(MeasureConst.CHARSET_UTF8);
        int i2 = C0011a.a[bVar.ordinal()];
        if (i2 == 1) {
            byte[] bArr = f770e;
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, h.a(b));
            Cipher instance = Cipher.getInstance(h.a(c));
            instance.init(1, secretKeySpec, new IvParameterSpec(bArr));
            return instance.doFinal(bytes);
        } else if (i2 == 2) {
            return bytes;
        } else {
            throw new IOException("unsupported");
        }
    }
}
