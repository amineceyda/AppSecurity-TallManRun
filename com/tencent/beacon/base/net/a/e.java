package com.tencent.beacon.base.net.a;

import com.tencent.beacon.base.net.b.d;
import com.tencent.beacon.pack.SocketResponsePackage;
import com.tencent.beacon.pack.a;

public final class e implements c<byte[], SocketResponsePackage> {
    public SocketResponsePackage a(byte[] bArr) {
        SocketResponsePackage socketResponsePackage = new SocketResponsePackage();
        socketResponsePackage.readFrom(new a(bArr));
        d.c(socketResponsePackage.header);
        return socketResponsePackage;
    }
}
