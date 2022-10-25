package com.tencent.beacon.pack;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Set;

public class c {
    private static HashMap<String, byte[]> a;
    public final RequestPacket b = new RequestPacket();
    public HashMap<String, byte[]> c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public String f763d = "GBK";

    /* renamed from: e  reason: collision with root package name */
    public a f764e = new a();

    static {
        HashMap<String, byte[]> hashMap = new HashMap<>();
        a = hashMap;
        hashMap.put("", new byte[0]);
    }

    private Object a(byte[] bArr, Object obj) {
        this.f764e.a(bArr);
        this.f764e.a(this.f763d);
        return this.f764e.a(obj, 0, true);
    }

    private byte[] a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        byte[] bArr = new byte[position];
        System.arraycopy(byteBuffer.array(), 0, bArr, 0, position);
        return bArr;
    }

    private void b() {
        a aVar = new a(this.b.sBuffer);
        aVar.a(this.f763d);
        this.c = aVar.a(a, 0, false);
    }

    public <T> T a(String str, T t) throws Exception {
        if (!this.c.containsKey(str)) {
            return null;
        }
        try {
            return a(this.c.get(str), (Object) t);
        } catch (Exception e2) {
            throw new Exception(e2);
        }
    }

    public void a(int i2) {
        this.b.iRequestId = i2;
    }

    public void a(String str) {
        this.b.sFuncName = str;
    }

    public void a(byte[] bArr) {
        if (bArr.length >= 4) {
            try {
                a aVar = new a(bArr, 4);
                aVar.a(this.f763d);
                this.b.readFrom(aVar);
                b();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } else {
            throw new IllegalArgumentException("decode package must include size head");
        }
    }

    public byte[] a() {
        b bVar = new b(0);
        bVar.a(this.f763d);
        bVar.a(this.c, 0);
        RequestPacket requestPacket = this.b;
        requestPacket.iVersion = 3;
        requestPacket.sBuffer = a(bVar.a());
        b bVar2 = new b(0);
        bVar2.a(this.f763d);
        this.b.writeTo(bVar2);
        byte[] a2 = a(bVar2.a());
        int length = a2.length + 4;
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length).put(a2).flip();
        return allocate.array();
    }

    public void b(String str) {
        this.b.sServantName = str;
    }

    public <T> void b(String str, T t) {
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        } else if (t == null) {
            throw new IllegalArgumentException("put value can not is null");
        } else if (!(t instanceof Set)) {
            b bVar = new b();
            bVar.a(this.f763d);
            bVar.a((Object) t, 0);
            this.c.put(str, a(bVar.a()));
        } else {
            throw new IllegalArgumentException("can not support Set");
        }
    }
}
