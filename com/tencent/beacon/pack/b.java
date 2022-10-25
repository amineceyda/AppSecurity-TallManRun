package com.tencent.beacon.pack;

import com.tencent.raft.measure.utils.MeasureConst;
import g.a.a.a.a;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class b {
    public static final byte[] a = new byte[0];
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public String c;

    /* renamed from: d  reason: collision with root package name */
    private ByteBuffer f762d;

    public b() {
        this(128);
    }

    public b(int i2) {
        this.c = "GBK";
        this.f762d = ByteBuffer.allocate(i2);
    }

    private void a(Object[] objArr, int i2) {
        a(8);
        b((byte) 9, i2);
        a(objArr.length, 0);
        for (Object a2 : objArr) {
            a(a2, 0);
        }
    }

    public int a(String str) {
        this.c = str;
        return 0;
    }

    public ByteBuffer a() {
        return this.f762d;
    }

    public void a(byte b2, int i2) {
        a(3);
        if (b2 == 0) {
            b(AbstractJceStruct.ZERO_TAG, i2);
            return;
        }
        b((byte) 0, i2);
        this.f762d.put(b2);
    }

    public void a(double d2, int i2) {
        a(10);
        b((byte) 5, i2);
        this.f762d.putDouble(d2);
    }

    public void a(float f2, int i2) {
        a(6);
        b((byte) 4, i2);
        this.f762d.putFloat(f2);
    }

    public void a(int i2) {
        if (this.f762d.remaining() < i2) {
            try {
                ByteBuffer allocate = ByteBuffer.allocate((this.f762d.capacity() + i2) * 2);
                allocate.put(this.f762d.array(), 0, this.f762d.position());
                this.f762d = allocate;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }

    public void a(int i2, int i3) {
        a(6);
        if (i2 < -32768 || i2 > 32767) {
            b((byte) 2, i3);
            this.f762d.putInt(i2);
            return;
        }
        a((short) i2, i3);
    }

    public void a(long j2, int i2) {
        a(10);
        if (j2 < -2147483648L || j2 > 2147483647L) {
            b((byte) 3, i2);
            this.f762d.putLong(j2);
            return;
        }
        a((int) j2, i2);
    }

    public void a(AbstractJceStruct abstractJceStruct, int i2) {
        a(2);
        b((byte) 10, i2);
        abstractJceStruct.writeTo(this);
        a(2);
        b(AbstractJceStruct.STRUCT_END, 0);
    }

    public void a(Object obj, int i2) {
        Collection collection;
        if (obj == null) {
            obj = "";
        }
        if (obj instanceof Byte) {
            a(((Byte) obj).byteValue(), i2);
        } else if (obj instanceof Boolean) {
            a(((Boolean) obj).booleanValue(), i2);
        } else if (obj instanceof Short) {
            a(((Short) obj).shortValue(), i2);
        } else if (obj instanceof Integer) {
            a(((Integer) obj).intValue(), i2);
        } else if (obj instanceof Long) {
            a(((Long) obj).longValue(), i2);
        } else if (obj instanceof Float) {
            a(((Float) obj).floatValue(), i2);
        } else if (obj instanceof Double) {
            a(((Double) obj).doubleValue(), i2);
        } else if (obj instanceof String) {
            a((String) obj, i2);
        } else if (obj instanceof Map) {
            a((Map) obj, i2);
        } else {
            if (obj instanceof List) {
                collection = (List) obj;
            } else if (obj instanceof AbstractJceStruct) {
                a((AbstractJceStruct) obj, i2);
                return;
            } else if (obj instanceof byte[]) {
                a((byte[]) obj, i2);
                return;
            } else if (obj instanceof boolean[]) {
                a((boolean[]) obj, i2);
                return;
            } else if (obj instanceof short[]) {
                a((short[]) obj, i2);
                return;
            } else if (obj instanceof int[]) {
                a((int[]) obj, i2);
                return;
            } else if (obj instanceof long[]) {
                a((long[]) obj, i2);
                return;
            } else if (obj instanceof float[]) {
                a((float[]) obj, i2);
                return;
            } else if (obj instanceof double[]) {
                a((double[]) obj, i2);
                return;
            } else if (obj.getClass().isArray()) {
                a((Object[]) obj, i2);
                return;
            } else if (obj instanceof Collection) {
                collection = (Collection) obj;
            } else {
                StringBuilder i3 = a.i("write object error: unsupport type. ");
                i3.append(obj.getClass());
                throw new RuntimeException(i3.toString());
            }
            a(collection, i2);
        }
    }

    public void a(String str, int i2) {
        byte[] bArr;
        try {
            bArr = str.getBytes(this.c);
        } catch (UnsupportedEncodingException unused) {
            bArr = str.getBytes(Charset.forName(MeasureConst.CHARSET_UTF8));
        }
        a(bArr.length + 10);
        if (bArr.length > 255) {
            b((byte) 7, i2);
            this.f762d.putInt(bArr.length);
        } else {
            b((byte) 6, i2);
            this.f762d.put((byte) bArr.length);
        }
        this.f762d.put(bArr);
    }

    public <T> void a(Collection<T> collection, int i2) {
        a(8);
        b((byte) 9, i2);
        a(collection == null ? 0 : collection.size(), 0);
        if (collection != null) {
            for (T a2 : collection) {
                a((Object) a2, 0);
            }
        }
    }

    public <K, V> void a(Map<K, V> map, int i2) {
        a(8);
        b((byte) 8, i2);
        a(map == null ? 0 : map.size(), 0);
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                a(next.getKey(), 0);
                a(next.getValue(), 1);
            }
        }
    }

    public void a(short s, int i2) {
        a(4);
        if (s < -128 || s > 127) {
            b((byte) 1, i2);
            this.f762d.putShort(s);
            return;
        }
        a((byte) s, i2);
    }

    public void a(boolean z, int i2) {
        a(z ? (byte) 1 : 0, i2);
    }

    public void a(byte[] bArr, int i2) {
        a(bArr.length + 8);
        b(AbstractJceStruct.SIMPLE_LIST, i2);
        b((byte) 0, 0);
        a(bArr.length, 0);
        this.f762d.put(bArr);
    }

    public void a(double[] dArr, int i2) {
        a(8);
        b((byte) 9, i2);
        a(dArr.length, 0);
        for (double a2 : dArr) {
            a(a2, 0);
        }
    }

    public void a(float[] fArr, int i2) {
        a(8);
        b((byte) 9, i2);
        a(fArr.length, 0);
        for (float a2 : fArr) {
            a(a2, 0);
        }
    }

    public void a(int[] iArr, int i2) {
        a(8);
        b((byte) 9, i2);
        a(iArr.length, 0);
        for (int a2 : iArr) {
            a(a2, 0);
        }
    }

    public void a(long[] jArr, int i2) {
        a(8);
        b((byte) 9, i2);
        a(jArr.length, 0);
        for (long a2 : jArr) {
            a(a2, 0);
        }
    }

    public void a(short[] sArr, int i2) {
        a(8);
        b((byte) 9, i2);
        a(sArr.length, 0);
        for (short a2 : sArr) {
            a(a2, 0);
        }
    }

    public void a(boolean[] zArr, int i2) {
        a(8);
        b((byte) 9, i2);
        a(zArr.length, 0);
        for (boolean a2 : zArr) {
            a(a2, 0);
        }
    }

    public void b(byte b2, int i2) {
        if (i2 < 15) {
            this.f762d.put((byte) (b2 | (i2 << 4)));
        } else if (i2 < 256) {
            this.f762d.put((byte) (b2 | 240));
            this.f762d.put((byte) i2);
        } else {
            throw new RuntimeException(a.q("tag is too large: ", i2));
        }
    }

    public byte[] b() {
        byte[] bArr = new byte[this.f762d.position()];
        System.arraycopy(this.f762d.array(), 0, bArr, 0, this.f762d.position());
        return bArr;
    }
}
