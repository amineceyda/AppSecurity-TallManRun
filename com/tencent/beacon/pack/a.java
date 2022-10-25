package com.tencent.beacon.pack;

import com.google.android.gms.common.ConnectionResult;
import com.tencent.beacon.base.util.c;
import com.tencent.raft.measure.utils.MeasureConst;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a {
    public String a = "GBK";
    private ByteBuffer b;

    /* renamed from: com.tencent.beacon.pack.a$a  reason: collision with other inner class name */
    public static class C0009a {
        public byte a;
        public int b;
    }

    public a() {
    }

    public a(byte[] bArr) {
        this.b = ByteBuffer.wrap(bArr);
    }

    public a(byte[] bArr, int i2) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.b = wrap;
        wrap.position(i2);
    }

    public static int a(C0009a aVar, ByteBuffer byteBuffer) {
        byte b2 = byteBuffer.get();
        aVar.a = (byte) (b2 & 15);
        int i2 = (b2 & 240) >> 4;
        aVar.b = i2;
        if (i2 != 15) {
            return 1;
        }
        aVar.b = byteBuffer.get() & 255;
        return 2;
    }

    private <K, V> Map<K, V> a(Map<K, V> map, Map<K, V> map2, int i2, boolean z) {
        if (map2 == null || map2.isEmpty()) {
            return new HashMap();
        }
        Map.Entry next = map2.entrySet().iterator().next();
        Object key = next.getKey();
        Object value = next.getValue();
        if (a(i2)) {
            if (g.a.a.a.a.b(this).a == 8) {
                int a2 = a(0, 0, true);
                if (a2 >= 0) {
                    for (int i3 = 0; i3 < a2; i3++) {
                        map.put(a(key, 0, true), a(value, 1, true));
                    }
                } else {
                    throw new RuntimeException(g.a.a.a.a.q("size invalid: ", a2));
                }
            } else {
                throw new RuntimeException("type mismatch.");
            }
        } else if (z) {
            throw new RuntimeException("require field not exist.");
        }
        return map;
    }

    private void a(byte b2) {
        int i2;
        int i3 = 0;
        switch (b2) {
            case 0:
                b(1);
                return;
            case 1:
                b(2);
                return;
            case 2:
            case 4:
                b(4);
                return;
            case 3:
            case 5:
                b(8);
                return;
            case 6:
                i2 = this.b.get();
                if (i2 < 0) {
                    i2 += 256;
                    break;
                }
                break;
            case 7:
                i2 = this.b.getInt();
                break;
            case 8:
                int a2 = a(0, 0, true);
                while (i3 < a2 * 2) {
                    b();
                    i3++;
                }
                return;
            case 9:
                int a3 = a(0, 0, true);
                while (i3 < a3) {
                    b();
                    i3++;
                }
                return;
            case 10:
                a();
                return;
            case 11:
            case 12:
                return;
            case ConnectionResult.CANCELED:
                C0009a b3 = g.a.a.a.a.b(this);
                if (b3.a == 0) {
                    i2 = a(0, 0, true);
                    break;
                } else {
                    StringBuilder j2 = g.a.a.a.a.j("skipField with invalid type, type value: ", b2, ", ");
                    j2.append(b3.a);
                    throw new RuntimeException(j2.toString());
                }
            default:
                throw new RuntimeException("invalid type.");
        }
        b(i2);
    }

    private int b(C0009a aVar) {
        return a(aVar, this.b.duplicate());
    }

    private void b() {
        a(g.a.a.a.a.b(this).a);
    }

    private void b(int i2) {
        ByteBuffer byteBuffer = this.b;
        byteBuffer.position(byteBuffer.position() + i2);
    }

    private <T> T[] b(T t, int i2, boolean z) {
        if (a(i2)) {
            if (g.a.a.a.a.b(this).a == 9) {
                int a2 = a(0, 0, true);
                if (a2 >= 0) {
                    T[] tArr = (Object[]) Array.newInstance(t.getClass(), a2);
                    for (int i3 = 0; i3 < a2; i3++) {
                        tArr[i3] = a(t, 0, true);
                    }
                    return tArr;
                }
                throw new RuntimeException(g.a.a.a.a.q("size invalid: ", a2));
            }
            throw new RuntimeException("type mismatch.");
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException("require field not exist.");
        }
    }

    public byte a(byte b2, int i2, boolean z) {
        if (a(i2)) {
            byte b3 = g.a.a.a.a.b(this).a;
            if (b3 == 0) {
                return this.b.get();
            }
            if (b3 == 12) {
                return 0;
            }
            throw new RuntimeException("type mismatch.");
        } else if (!z) {
            return b2;
        } else {
            throw new RuntimeException("require field not exist.");
        }
    }

    public double a(double d2, int i2, boolean z) {
        if (a(i2)) {
            byte b2 = g.a.a.a.a.b(this).a;
            if (b2 == 4) {
                return (double) this.b.getFloat();
            }
            if (b2 == 5) {
                return this.b.getDouble();
            }
            if (b2 == 12) {
                return 0.0d;
            }
            throw new RuntimeException("type mismatch.");
        } else if (!z) {
            return d2;
        } else {
            throw new RuntimeException("require field not exist.");
        }
    }

    public float a(float f2, int i2, boolean z) {
        if (a(i2)) {
            byte b2 = g.a.a.a.a.b(this).a;
            if (b2 == 4) {
                return this.b.getFloat();
            }
            if (b2 == 12) {
                return 0.0f;
            }
            throw new RuntimeException("type mismatch.");
        } else if (!z) {
            return f2;
        } else {
            throw new RuntimeException("require field not exist.");
        }
    }

    public int a(int i2, int i3, boolean z) {
        if (a(i3)) {
            byte b2 = g.a.a.a.a.b(this).a;
            if (b2 == 0) {
                return this.b.get();
            }
            if (b2 == 1) {
                return this.b.getShort();
            }
            if (b2 == 2) {
                return this.b.getInt();
            }
            if (b2 == 12) {
                return 0;
            }
            throw new RuntimeException("type mismatch.");
        } else if (!z) {
            return i2;
        } else {
            throw new RuntimeException("require field not exist.");
        }
    }

    public int a(String str) {
        this.a = str;
        return 0;
    }

    public long a(long j2, int i2, boolean z) {
        int i3;
        if (a(i2)) {
            byte b2 = g.a.a.a.a.b(this).a;
            if (b2 == 12) {
                return 0;
            }
            if (b2 == 0) {
                i3 = this.b.get();
            } else if (b2 == 1) {
                i3 = this.b.getShort();
            } else if (b2 == 2) {
                i3 = this.b.getInt();
            } else if (b2 == 3) {
                return this.b.getLong();
            } else {
                throw new RuntimeException("type mismatch.");
            }
            return (long) i3;
        } else if (!z) {
            return j2;
        } else {
            throw new RuntimeException("require field not exist.");
        }
    }

    public AbstractJceStruct a(AbstractJceStruct abstractJceStruct, int i2, boolean z) {
        if (a(i2)) {
            try {
                AbstractJceStruct abstractJceStruct2 = (AbstractJceStruct) abstractJceStruct.getClass().newInstance();
                if (g.a.a.a.a.b(this).a == 10) {
                    abstractJceStruct2.readFrom(this);
                    a();
                    return abstractJceStruct2;
                }
                throw new RuntimeException("type mismatch.");
            } catch (Exception e2) {
                throw new RuntimeException(e2.getMessage());
            }
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException("require field not exist.");
        }
    }

    public <T> Object a(T t, int i2, boolean z) {
        if (t instanceof Byte) {
            return Byte.valueOf(a((byte) 0, i2, z));
        }
        if (t instanceof Boolean) {
            return Boolean.valueOf(a(false, i2, z));
        }
        if (t instanceof Short) {
            return Short.valueOf(a(0, i2, z));
        }
        if (t instanceof Integer) {
            return Integer.valueOf(a(0, i2, z));
        }
        if (t instanceof Long) {
            return Long.valueOf(a(0, i2, z));
        }
        if (t instanceof Float) {
            return Float.valueOf(a(0.0f, i2, z));
        }
        if (t instanceof Double) {
            return Double.valueOf(a(0.0d, i2, z));
        }
        if (t instanceof String) {
            return a(i2, z);
        }
        if (t instanceof Map) {
            return a((Map) t, i2, z);
        }
        if (t instanceof List) {
            return a((List) t, i2, z);
        }
        if (t instanceof AbstractJceStruct) {
            return a((AbstractJceStruct) t, i2, z);
        }
        if (t.getClass().isArray()) {
            return ((t instanceof byte[]) || (t instanceof Byte[])) ? a((byte[]) null, i2, z) : t instanceof boolean[] ? a((boolean[]) null, i2, z) : t instanceof short[] ? a((short[]) null, i2, z) : t instanceof int[] ? a((int[]) null, i2, z) : t instanceof long[] ? a((long[]) null, i2, z) : t instanceof float[] ? a((float[]) null, i2, z) : t instanceof double[] ? a((double[]) null, i2, z) : a((T[]) (Object[]) t, i2, z);
        }
        throw new RuntimeException("read object error: unsupport type.");
    }

    public String a(int i2, boolean z) {
        if (a(i2)) {
            byte b2 = g.a.a.a.a.b(this).a;
            if (b2 == 6) {
                int i3 = this.b.get();
                if (i3 < 0) {
                    i3 += 256;
                }
                byte[] bArr = new byte[i3];
                this.b.get(bArr);
                try {
                    return new String(bArr, this.a);
                } catch (UnsupportedEncodingException unused) {
                    return new String(bArr, Charset.forName(MeasureConst.CHARSET_UTF8));
                }
            } else if (b2 == 7) {
                int i4 = this.b.getInt();
                if (i4 > 104857600 || i4 < 0 || i4 > this.b.capacity()) {
                    throw new RuntimeException(g.a.a.a.a.q("String too long: ", i4));
                }
                byte[] bArr2 = new byte[i4];
                this.b.get(bArr2);
                try {
                    return new String(bArr2, this.a);
                } catch (UnsupportedEncodingException unused2) {
                    return new String(bArr2, Charset.forName(MeasureConst.CHARSET_UTF8));
                }
            } else {
                throw new RuntimeException("type mismatch.");
            }
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException("require field not exist.");
        }
    }

    public <K, V> HashMap<K, V> a(Map<K, V> map, int i2, boolean z) {
        return (HashMap) a(new HashMap(), map, i2, z);
    }

    public <T> List<T> a(List<T> list, int i2, boolean z) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        Object[] b2 = b(list.get(0), i2, z);
        if (b2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object add : b2) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public short a(short s, int i2, boolean z) {
        if (a(i2)) {
            byte b2 = g.a.a.a.a.b(this).a;
            if (b2 == 0) {
                return (short) this.b.get();
            }
            if (b2 == 1) {
                return this.b.getShort();
            }
            if (b2 == 12) {
                return 0;
            }
            throw new RuntimeException("type mismatch.");
        } else if (!z) {
            return s;
        } else {
            throw new RuntimeException("require field not exist.");
        }
    }

    public void a() {
        C0009a aVar = new C0009a();
        do {
            a(aVar);
            a(aVar.a);
        } while (aVar.a != 11);
    }

    public void a(C0009a aVar) {
        a(aVar, this.b);
    }

    public void a(byte[] bArr) {
        this.b = ByteBuffer.wrap(bArr);
    }

    public boolean a(int i2) {
        try {
            C0009a aVar = new C0009a();
            while (true) {
                int b2 = b(aVar);
                if (aVar.a == 11) {
                    return false;
                }
                int i3 = aVar.b;
                if (i2 <= i3) {
                    return i2 == i3;
                }
                b(b2);
                a(aVar.a);
            }
        } catch (RuntimeException | BufferUnderflowException e2) {
            c.a(e2);
            return false;
        }
    }

    public boolean a(boolean z, int i2, boolean z2) {
        return a((byte) 0, i2, z2) != 0;
    }

    public byte[] a(byte[] bArr, int i2, boolean z) {
        if (a(i2)) {
            C0009a b2 = g.a.a.a.a.b(this);
            byte b3 = b2.a;
            if (b3 == 9) {
                int a2 = a(0, 0, true);
                if (a2 < 0 || a2 > this.b.capacity()) {
                    throw new RuntimeException(g.a.a.a.a.q("size invalid: ", a2));
                }
                byte[] bArr2 = new byte[a2];
                for (int i3 = 0; i3 < a2; i3++) {
                    bArr2[i3] = a(bArr2[0], 0, true);
                }
                return bArr2;
            } else if (b3 == 13) {
                C0009a b4 = g.a.a.a.a.b(this);
                if (b4.a == 0) {
                    int a3 = a(0, 0, true);
                    if (a3 < 0 || a3 > this.b.capacity()) {
                        StringBuilder j2 = g.a.a.a.a.j("invalid size, tag: ", i2, ", type: ");
                        j2.append(b2.a);
                        j2.append(", ");
                        j2.append(b4.a);
                        j2.append(", size: ");
                        j2.append(a3);
                        throw new RuntimeException(j2.toString());
                    }
                    byte[] bArr3 = new byte[a3];
                    this.b.get(bArr3);
                    return bArr3;
                }
                StringBuilder j3 = g.a.a.a.a.j("type mismatch, tag: ", i2, ", type: ");
                j3.append(b2.a);
                j3.append(", ");
                j3.append(b4.a);
                throw new RuntimeException(j3.toString());
            } else {
                throw new RuntimeException("type mismatch.");
            }
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException("require field not exist.");
        }
    }

    public double[] a(double[] dArr, int i2, boolean z) {
        if (a(i2)) {
            if (g.a.a.a.a.b(this).a == 9) {
                int a2 = a(0, 0, true);
                if (a2 >= 0) {
                    double[] dArr2 = new double[a2];
                    for (int i3 = 0; i3 < a2; i3++) {
                        dArr2[i3] = a(dArr2[0], 0, true);
                    }
                    return dArr2;
                }
                throw new RuntimeException(g.a.a.a.a.q("size invalid: ", a2));
            }
            throw new RuntimeException("type mismatch.");
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException("require field not exist.");
        }
    }

    public float[] a(float[] fArr, int i2, boolean z) {
        if (a(i2)) {
            if (g.a.a.a.a.b(this).a == 9) {
                int a2 = a(0, 0, true);
                if (a2 >= 0) {
                    float[] fArr2 = new float[a2];
                    for (int i3 = 0; i3 < a2; i3++) {
                        fArr2[i3] = a(fArr2[0], 0, true);
                    }
                    return fArr2;
                }
                throw new RuntimeException(g.a.a.a.a.q("size invalid: ", a2));
            }
            throw new RuntimeException("type mismatch.");
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException("require field not exist.");
        }
    }

    public int[] a(int[] iArr, int i2, boolean z) {
        if (a(i2)) {
            if (g.a.a.a.a.b(this).a == 9) {
                int a2 = a(0, 0, true);
                if (a2 >= 0) {
                    int[] iArr2 = new int[a2];
                    for (int i3 = 0; i3 < a2; i3++) {
                        iArr2[i3] = a(iArr2[0], 0, true);
                    }
                    return iArr2;
                }
                throw new RuntimeException(g.a.a.a.a.q("size invalid: ", a2));
            }
            throw new RuntimeException("type mismatch.");
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException("require field not exist.");
        }
    }

    public long[] a(long[] jArr, int i2, boolean z) {
        if (a(i2)) {
            if (g.a.a.a.a.b(this).a == 9) {
                int a2 = a(0, 0, true);
                if (a2 >= 0) {
                    long[] jArr2 = new long[a2];
                    for (int i3 = 0; i3 < a2; i3++) {
                        jArr2[i3] = a(jArr2[0], 0, true);
                    }
                    return jArr2;
                }
                throw new RuntimeException(g.a.a.a.a.q("size invalid: ", a2));
            }
            throw new RuntimeException("type mismatch.");
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException("require field not exist.");
        }
    }

    public <T> T[] a(T[] tArr, int i2, boolean z) {
        if (tArr != null && tArr.length != 0) {
            return b(tArr[0], i2, z);
        }
        throw new RuntimeException("unable to get type of key and value.");
    }

    public short[] a(short[] sArr, int i2, boolean z) {
        if (a(i2)) {
            if (g.a.a.a.a.b(this).a == 9) {
                int a2 = a(0, 0, true);
                if (a2 >= 0) {
                    short[] sArr2 = new short[a2];
                    for (int i3 = 0; i3 < a2; i3++) {
                        sArr2[i3] = a(sArr2[0], 0, true);
                    }
                    return sArr2;
                }
                throw new RuntimeException(g.a.a.a.a.q("size invalid: ", a2));
            }
            throw new RuntimeException("type mismatch.");
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException("require field not exist.");
        }
    }

    public boolean[] a(boolean[] zArr, int i2, boolean z) {
        if (a(i2)) {
            if (g.a.a.a.a.b(this).a == 9) {
                int a2 = a(0, 0, true);
                if (a2 >= 0) {
                    boolean[] zArr2 = new boolean[a2];
                    for (int i3 = 0; i3 < a2; i3++) {
                        zArr2[i3] = a(zArr2[0], 0, true);
                    }
                    return zArr2;
                }
                throw new RuntimeException(g.a.a.a.a.q("size invalid: ", a2));
            }
            throw new RuntimeException("type mismatch.");
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException("require field not exist.");
        }
    }
}
