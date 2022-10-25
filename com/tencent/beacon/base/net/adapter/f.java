package com.tencent.beacon.base.net.adapter;

import android.text.TextUtils;
import com.tencent.beacon.base.net.BResponse;
import com.tencent.beacon.base.net.NetException;
import com.tencent.beacon.base.net.RequestType;
import com.tencent.beacon.base.net.a.c;
import com.tencent.beacon.base.net.a.d;
import com.tencent.beacon.base.net.a.e;
import com.tencent.beacon.base.net.call.Callback;
import com.tencent.beacon.base.net.call.JceRequestEntity;
import com.tencent.beacon.pack.AbstractJceStruct;
import com.tencent.beacon.pack.SocketRequestPackage;
import com.tencent.beacon.pack.SocketResponsePackage;
import com.tencent.beacon.pack.b;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class f extends AbstractNetAdapter {
    private c<byte[], SocketResponsePackage> a = new e();
    private c<JceRequestEntity, SocketRequestPackage> b = new d();

    private f() {
    }

    public static AbstractNetAdapter a() {
        return new f();
    }

    private Socket a(String str, int i2) throws IOException {
        com.tencent.beacon.base.util.c.a("SocketAdapter", "create socket domain: %s, port: %d", str, Integer.valueOf(i2));
        Socket socket = new Socket(InetAddress.getByName(str).getHostAddress(), i2);
        socket.setSoTimeout(AbstractNetAdapter.CONNECT_TIMEOUT);
        return socket;
    }

    private void a(Callback<byte[]> callback, String str, SocketResponsePackage socketResponsePackage) throws NetException {
        String str2 = socketResponsePackage.msg;
        if (str2 == null || !str2.equals("decrypt Data fail!")) {
            callback.onResponse(socketResponsePackage.body);
        } else {
            callback.onFailure(new com.tencent.beacon.base.net.d(str, "405", socketResponsePackage.statusCode, "server encrypt-status error!"));
        }
    }

    private void a(Socket socket, SocketRequestPackage socketRequestPackage) throws IOException {
        b bVar = new b();
        socketRequestPackage.writeTo(bVar);
        OutputStream outputStream = socket.getOutputStream();
        byte[] b2 = bVar.b();
        outputStream.write(a(b2, b2.length));
        outputStream.flush();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.io.InputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] a(java.net.Socket r8, boolean r9) throws java.lang.Throwable {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            r3 = 2
            java.io.InputStream r8 = r8.getInputStream()     // Catch:{ all -> 0x004c }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0048 }
            r4.<init>()     // Catch:{ all -> 0x0048 }
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0046 }
        L_0x0011:
            int r5 = r8.read(r0)     // Catch:{ all -> 0x0046 }
            r6 = -1
            if (r5 == r6) goto L_0x001c
            r4.write(r0, r2, r5)     // Catch:{ all -> 0x0046 }
            goto L_0x0011
        L_0x001c:
            r4.flush()     // Catch:{ all -> 0x0046 }
            byte[] r0 = r4.toByteArray()     // Catch:{ all -> 0x0046 }
            if (r9 != 0) goto L_0x0036
            int r9 = r0.length     // Catch:{ all -> 0x0046 }
            int r9 = r9 + -4
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.allocate(r9)     // Catch:{ all -> 0x0046 }
            int r5 = r0.length     // Catch:{ all -> 0x0046 }
            int r5 = r5 + -4
            r9.put(r0, r3, r5)     // Catch:{ all -> 0x0046 }
            byte[] r0 = r9.array()     // Catch:{ all -> 0x0046 }
        L_0x0036:
            r4.close()     // Catch:{ all -> 0x0046 }
            r8.close()     // Catch:{ all -> 0x0046 }
            java.io.Closeable[] r9 = new java.io.Closeable[r3]
            r9[r2] = r8
            r9[r1] = r4
            com.tencent.beacon.base.util.b.a((java.io.Closeable[]) r9)
            return r0
        L_0x0046:
            r9 = move-exception
            goto L_0x004a
        L_0x0048:
            r9 = move-exception
            r4 = r0
        L_0x004a:
            r0 = r8
            goto L_0x004e
        L_0x004c:
            r9 = move-exception
            r4 = r0
        L_0x004e:
            com.tencent.beacon.base.util.c.a((java.lang.Throwable) r9)     // Catch:{ all -> 0x005b }
            java.io.Closeable[] r8 = new java.io.Closeable[r3]
            r8[r2] = r0
            r8[r1] = r4
            com.tencent.beacon.base.util.b.a((java.io.Closeable[]) r8)
            throw r9
        L_0x005b:
            r8 = move-exception
            java.io.Closeable[] r9 = new java.io.Closeable[r3]
            r9[r2] = r0
            r9[r1] = r4
            com.tencent.beacon.base.util.b.a((java.io.Closeable[]) r9)
            goto L_0x0067
        L_0x0066:
            throw r8
        L_0x0067:
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.base.net.adapter.f.a(java.net.Socket, boolean):byte[]");
    }

    private byte[] a(byte[] bArr, int i2) {
        int i3 = i2 + 4;
        ByteBuffer allocate = ByteBuffer.allocate(i3);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.putShort((short) (i3 & 65535));
        allocate.put(bArr);
        allocate.put(AbstractJceStruct.SIMPLE_LIST);
        allocate.put((byte) 10);
        if (i2 >= 65532) {
            com.tencent.beacon.base.util.c.b("[Error] send bytes exceed 64kB will failure!", new Object[0]);
        }
        return allocate.array();
    }

    public void request(JceRequestEntity jceRequestEntity, Callback<byte[]> callback) {
        com.tencent.beacon.base.net.d dVar;
        String domain = jceRequestEntity.getDomain();
        if (!TextUtils.isEmpty(domain)) {
            String name = jceRequestEntity.getType().name();
            try {
                Socket a2 = a(domain, jceRequestEntity.getPort());
                StringBuilder sb = new StringBuilder();
                sb.append("send data size: ");
                sb.append(jceRequestEntity.getContent().length);
                com.tencent.beacon.base.util.c.a("SocketAdapter", 0, sb.toString(), new Object[0]);
                a(a2, this.b.a(jceRequestEntity));
                byte[] a3 = a(a2, jceRequestEntity.getType() == RequestType.EVENT);
                if (a3 != null) {
                    if (a3.length > 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("receivedData: ");
                        sb2.append(a3.length);
                        com.tencent.beacon.base.util.c.a("SocketAdapter", 1, sb2.toString(), new Object[0]);
                        SocketResponsePackage a4 = this.a.a(a3);
                        if (a4 == null) {
                            callback.onFailure(new com.tencent.beacon.base.net.d(name, "402", -1, "responsePackage == null"));
                            return;
                        }
                        com.tencent.beacon.base.util.c.a("SocketAdapter", 2, "socket response code: %s, header: %s, msg: %s", Integer.valueOf(a4.statusCode), a4.header, a4.msg);
                        int i2 = a4.statusCode;
                        if (i2 == 200) {
                            a(callback, name, a4);
                            return;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("responsePackage msg: ");
                        sb3.append(a4.msg);
                        callback.onFailure(new com.tencent.beacon.base.net.d(name, "402", i2, sb3.toString()));
                        return;
                    }
                }
                callback.onFailure(new com.tencent.beacon.base.net.d(name, "402", -1, "receiveData == null"));
            } catch (ConnectException e2) {
                dVar = new com.tencent.beacon.base.net.d(name, "401", -1, " connect time more than 30s", e2);
                callback.onFailure(dVar);
            } catch (SocketTimeoutException e3) {
                dVar = new com.tencent.beacon.base.net.d(name, "401", -1, " request time more than 30s", e3);
                callback.onFailure(dVar);
            } catch (Throwable th) {
                Throwable th2 = th;
                com.tencent.beacon.base.util.c.b("SocketAdapter socket request error: %s", th2.getMessage());
                com.tencent.beacon.base.util.c.a(th2);
                dVar = new com.tencent.beacon.base.net.d(name, "449", -1, " unknown request error!", th2);
                callback.onFailure(dVar);
            }
        }
    }

    public void request(com.tencent.beacon.base.net.call.e eVar, Callback<BResponse> callback) {
    }
}
