package e.g.a;

import android.content.res.AssetManager;
import android.util.Log;
import com.tencent.raft.measure.utils.MeasureConst;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

public class a {
    public static final c[] A;
    public static final c B = new c("StripOffsets", 273, 3);
    public static final c[] C;
    public static final c[] D;
    public static final c[] E;
    public static final c[] F;
    public static final c[][] G;
    public static final c[] H = {new c("SubIFDPointer", 330, 4), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("InteroperabilityIFDPointer", 40965, 4), new c("CameraSettingsIFDPointer", 8224, 1), new c("ImageProcessingIFDPointer", 8256, 1)};
    public static final HashMap<Integer, c>[] I;
    public static final HashMap<String, c>[] J;
    public static final HashSet<String> K = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    public static final HashMap<Integer, Integer> L = new HashMap<>();
    public static final Charset M;
    public static final byte[] N;

    /* renamed from: l  reason: collision with root package name */
    public static final List<Integer> f1392l = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: m  reason: collision with root package name */
    public static final List<Integer> f1393m = Arrays.asList(new Integer[]{2, 7, 4, 5});
    public static final int[] n = {8, 8, 8};
    public static final int[] o = {8};
    public static final byte[] p = {-1, -40, -1};
    public static final byte[] q = {79, 76, 89, 77, 80, 0};
    public static final byte[] r = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static SimpleDateFormat s;
    public static final String[] t = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    public static final int[] u = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] v = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final c[] w;
    public static final c[] x;
    public static final c[] y;
    public static final c[] z;
    public final AssetManager.AssetInputStream a;
    public int b;
    public final HashMap<String, b>[] c;

    /* renamed from: d  reason: collision with root package name */
    public Set<Integer> f1394d;

    /* renamed from: e  reason: collision with root package name */
    public ByteOrder f1395e = ByteOrder.BIG_ENDIAN;

    /* renamed from: f  reason: collision with root package name */
    public int f1396f;

    /* renamed from: g  reason: collision with root package name */
    public int f1397g;

    /* renamed from: h  reason: collision with root package name */
    public int f1398h;

    /* renamed from: i  reason: collision with root package name */
    public int f1399i;

    /* renamed from: j  reason: collision with root package name */
    public int f1400j;

    /* renamed from: k  reason: collision with root package name */
    public int f1401k;

    /* renamed from: e.g.a.a$a  reason: collision with other inner class name */
    public static class C0047a extends InputStream implements DataInput {

        /* renamed from: f  reason: collision with root package name */
        public static final ByteOrder f1402f = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: g  reason: collision with root package name */
        public static final ByteOrder f1403g = ByteOrder.BIG_ENDIAN;
        public DataInputStream b;
        public ByteOrder c;

        /* renamed from: d  reason: collision with root package name */
        public final int f1404d;

        /* renamed from: e  reason: collision with root package name */
        public int f1405e;

        public C0047a(InputStream inputStream) throws IOException {
            this.c = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.b = dataInputStream;
            int available = dataInputStream.available();
            this.f1404d = available;
            this.f1405e = 0;
            this.b.mark(available);
        }

        public C0047a(byte[] bArr) throws IOException {
            this((InputStream) new ByteArrayInputStream(bArr));
        }

        public long a() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        public int available() throws IOException {
            return this.b.available();
        }

        public void b(long j2) throws IOException {
            int i2 = this.f1405e;
            if (((long) i2) > j2) {
                this.f1405e = 0;
                this.b.reset();
                this.b.mark(this.f1404d);
            } else {
                j2 -= (long) i2;
            }
            int i3 = (int) j2;
            if (skipBytes(i3) != i3) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public int read() throws IOException {
            this.f1405e++;
            return this.b.read();
        }

        public int read(byte[] bArr, int i2, int i3) throws IOException {
            int read = this.b.read(bArr, i2, i3);
            this.f1405e += read;
            return read;
        }

        public boolean readBoolean() throws IOException {
            this.f1405e++;
            return this.b.readBoolean();
        }

        public byte readByte() throws IOException {
            int i2 = this.f1405e + 1;
            this.f1405e = i2;
            if (i2 <= this.f1404d) {
                int read = this.b.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public char readChar() throws IOException {
            this.f1405e += 2;
            return this.b.readChar();
        }

        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr) throws IOException {
            int length = this.f1405e + bArr.length;
            this.f1405e = length;
            if (length > this.f1404d) {
                throw new EOFException();
            } else if (this.b.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public void readFully(byte[] bArr, int i2, int i3) throws IOException {
            int i4 = this.f1405e + i3;
            this.f1405e = i4;
            if (i4 > this.f1404d) {
                throw new EOFException();
            } else if (this.b.read(bArr, i2, i3) != i3) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public int readInt() throws IOException {
            int i2 = this.f1405e + 4;
            this.f1405e = i2;
            if (i2 <= this.f1404d) {
                int read = this.b.read();
                int read2 = this.b.read();
                int read3 = this.b.read();
                int read4 = this.b.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.c;
                    if (byteOrder == f1402f) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f1403g) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    StringBuilder i3 = g.a.a.a.a.i("Invalid byte order: ");
                    i3.append(this.c);
                    throw new IOException(i3.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public long readLong() throws IOException {
            int i2 = this.f1405e + 8;
            this.f1405e = i2;
            if (i2 <= this.f1404d) {
                int read = this.b.read();
                int read2 = this.b.read();
                int read3 = this.b.read();
                int read4 = this.b.read();
                int read5 = this.b.read();
                int read6 = this.b.read();
                int read7 = this.b.read();
                int read8 = this.b.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.c;
                    if (byteOrder == f1402f) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    if (byteOrder == f1403g) {
                        return (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    StringBuilder i3 = g.a.a.a.a.i("Invalid byte order: ");
                    i3.append(this.c);
                    throw new IOException(i3.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public short readShort() throws IOException {
            int i2 = this.f1405e + 2;
            this.f1405e = i2;
            if (i2 <= this.f1404d) {
                int read = this.b.read();
                int read2 = this.b.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.c;
                    if (byteOrder == f1402f) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f1403g) {
                        return (short) ((read << 8) + read2);
                    }
                    StringBuilder i3 = g.a.a.a.a.i("Invalid byte order: ");
                    i3.append(this.c);
                    throw new IOException(i3.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readUTF() throws IOException {
            this.f1405e += 2;
            return this.b.readUTF();
        }

        public int readUnsignedByte() throws IOException {
            this.f1405e++;
            return this.b.readUnsignedByte();
        }

        public int readUnsignedShort() throws IOException {
            int i2 = this.f1405e + 2;
            this.f1405e = i2;
            if (i2 <= this.f1404d) {
                int read = this.b.read();
                int read2 = this.b.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.c;
                    if (byteOrder == f1402f) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f1403g) {
                        return (read << 8) + read2;
                    }
                    StringBuilder i3 = g.a.a.a.a.i("Invalid byte order: ");
                    i3.append(this.c);
                    throw new IOException(i3.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public int skipBytes(int i2) throws IOException {
            int min = Math.min(i2, this.f1404d - this.f1405e);
            int i3 = 0;
            while (i3 < min) {
                i3 += this.b.skipBytes(min - i3);
            }
            this.f1405e += i3;
            return i3;
        }
    }

    public static class b {
        public final int a;
        public final int b;
        public final byte[] c;

        public b(int i2, int i3, byte[] bArr) {
            this.a = i2;
            this.b = i3;
            this.c = bArr;
        }

        public static b a(String str) {
            byte[] bytes = (str + 0).getBytes(a.M);
            return new b(2, bytes.length, bytes);
        }

        public static b b(long j2, ByteOrder byteOrder) {
            long[] jArr = {j2};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.u[4] * 1)]);
            wrap.order(byteOrder);
            for (int i2 = 0; i2 < 1; i2++) {
                wrap.putInt((int) jArr[i2]);
            }
            return new b(4, 1, wrap.array());
        }

        public static b c(d dVar, ByteOrder byteOrder) {
            d[] dVarArr = {dVar};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.u[5] * 1)]);
            wrap.order(byteOrder);
            for (int i2 = 0; i2 < 1; i2++) {
                d dVar2 = dVarArr[i2];
                wrap.putInt((int) dVar2.a);
                wrap.putInt((int) dVar2.b);
            }
            return new b(5, 1, wrap.array());
        }

        public static b d(int i2, ByteOrder byteOrder) {
            int[] iArr = {i2};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.u[3] * 1)]);
            wrap.order(byteOrder);
            for (int i3 = 0; i3 < 1; i3++) {
                wrap.putShort((short) iArr[i3]);
            }
            return new b(3, 1, wrap.array());
        }

        public double e(ByteOrder byteOrder) {
            Object h2 = h(byteOrder);
            if (h2 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (h2 instanceof String) {
                return Double.parseDouble((String) h2);
            } else {
                if (h2 instanceof long[]) {
                    long[] jArr = (long[]) h2;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h2 instanceof int[]) {
                    int[] iArr = (int[]) h2;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h2 instanceof double[]) {
                    double[] dArr = (double[]) h2;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h2 instanceof d[]) {
                    d[] dVarArr = (d[]) h2;
                    if (dVarArr.length == 1) {
                        d dVar = dVarArr[0];
                        double d2 = (double) dVar.a;
                        double d3 = (double) dVar.b;
                        Double.isNaN(d2);
                        Double.isNaN(d3);
                        Double.isNaN(d2);
                        Double.isNaN(d3);
                        return d2 / d3;
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public int f(ByteOrder byteOrder) {
            Object h2 = h(byteOrder);
            if (h2 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (h2 instanceof String) {
                return Integer.parseInt((String) h2);
            } else {
                if (h2 instanceof long[]) {
                    long[] jArr = (long[]) h2;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h2 instanceof int[]) {
                    int[] iArr = (int[]) h2;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public String g(ByteOrder byteOrder) {
            Object h2 = h(byteOrder);
            if (h2 == null) {
                return null;
            }
            if (h2 instanceof String) {
                return (String) h2;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            if (h2 instanceof long[]) {
                long[] jArr = (long[]) h2;
                while (i2 < jArr.length) {
                    sb.append(jArr[i2]);
                    i2++;
                    if (i2 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (h2 instanceof int[]) {
                int[] iArr = (int[]) h2;
                while (i2 < iArr.length) {
                    sb.append(iArr[i2]);
                    i2++;
                    if (i2 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (h2 instanceof double[]) {
                double[] dArr = (double[]) h2;
                while (i2 < dArr.length) {
                    sb.append(dArr[i2]);
                    i2++;
                    if (i2 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(h2 instanceof d[])) {
                return null;
            } else {
                d[] dVarArr = (d[]) h2;
                while (i2 < dVarArr.length) {
                    sb.append(dVarArr[i2].a);
                    sb.append('/');
                    sb.append(dVarArr[i2].b);
                    i2++;
                    if (i2 != dVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:164:0x01a2 A[SYNTHETIC, Splitter:B:164:0x01a2] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object h(java.nio.ByteOrder r11) {
            /*
                r10 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                e.g.a.a$a r3 = new e.g.a.a$a     // Catch:{ IOException -> 0x018c, all -> 0x018a }
                byte[] r4 = r10.c     // Catch:{ IOException -> 0x018c, all -> 0x018a }
                r3.<init>((byte[]) r4)     // Catch:{ IOException -> 0x018c, all -> 0x018a }
                r3.c = r11     // Catch:{ IOException -> 0x0188 }
                int r11 = r10.a     // Catch:{ IOException -> 0x0188 }
                r4 = 1
                r5 = 0
                switch(r11) {
                    case 1: goto L_0x0147;
                    case 2: goto L_0x00fc;
                    case 3: goto L_0x00e2;
                    case 4: goto L_0x00c8;
                    case 5: goto L_0x00a5;
                    case 6: goto L_0x0147;
                    case 7: goto L_0x00fc;
                    case 8: goto L_0x008b;
                    case 9: goto L_0x0071;
                    case 10: goto L_0x004c;
                    case 11: goto L_0x0031;
                    case 12: goto L_0x0017;
                    default: goto L_0x0015;
                }     // Catch:{ IOException -> 0x0188 }
            L_0x0015:
                goto L_0x017f
            L_0x0017:
                int r11 = r10.b     // Catch:{ IOException -> 0x0188 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0188 }
            L_0x001b:
                int r4 = r10.b     // Catch:{ IOException -> 0x0188 }
                if (r5 >= r4) goto L_0x0028
                double r6 = r3.readDouble()     // Catch:{ IOException -> 0x0188 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0188 }
                int r5 = r5 + 1
                goto L_0x001b
            L_0x0028:
                r3.close()     // Catch:{ IOException -> 0x002c }
                goto L_0x0030
            L_0x002c:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0030:
                return r11
            L_0x0031:
                int r11 = r10.b     // Catch:{ IOException -> 0x0188 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0188 }
            L_0x0035:
                int r4 = r10.b     // Catch:{ IOException -> 0x0188 }
                if (r5 >= r4) goto L_0x0043
                float r4 = r3.readFloat()     // Catch:{ IOException -> 0x0188 }
                double r6 = (double) r4     // Catch:{ IOException -> 0x0188 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0188 }
                int r5 = r5 + 1
                goto L_0x0035
            L_0x0043:
                r3.close()     // Catch:{ IOException -> 0x0047 }
                goto L_0x004b
            L_0x0047:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x004b:
                return r11
            L_0x004c:
                int r11 = r10.b     // Catch:{ IOException -> 0x0188 }
                e.g.a.a$d[] r11 = new e.g.a.a.d[r11]     // Catch:{ IOException -> 0x0188 }
            L_0x0050:
                int r4 = r10.b     // Catch:{ IOException -> 0x0188 }
                if (r5 >= r4) goto L_0x0068
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0188 }
                long r6 = (long) r4     // Catch:{ IOException -> 0x0188 }
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0188 }
                long r8 = (long) r4     // Catch:{ IOException -> 0x0188 }
                e.g.a.a$d r4 = new e.g.a.a$d     // Catch:{ IOException -> 0x0188 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0188 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0188 }
                int r5 = r5 + 1
                goto L_0x0050
            L_0x0068:
                r3.close()     // Catch:{ IOException -> 0x006c }
                goto L_0x0070
            L_0x006c:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0070:
                return r11
            L_0x0071:
                int r11 = r10.b     // Catch:{ IOException -> 0x0188 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0188 }
            L_0x0075:
                int r4 = r10.b     // Catch:{ IOException -> 0x0188 }
                if (r5 >= r4) goto L_0x0082
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0188 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0188 }
                int r5 = r5 + 1
                goto L_0x0075
            L_0x0082:
                r3.close()     // Catch:{ IOException -> 0x0086 }
                goto L_0x008a
            L_0x0086:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x008a:
                return r11
            L_0x008b:
                int r11 = r10.b     // Catch:{ IOException -> 0x0188 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0188 }
            L_0x008f:
                int r4 = r10.b     // Catch:{ IOException -> 0x0188 }
                if (r5 >= r4) goto L_0x009c
                short r4 = r3.readShort()     // Catch:{ IOException -> 0x0188 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0188 }
                int r5 = r5 + 1
                goto L_0x008f
            L_0x009c:
                r3.close()     // Catch:{ IOException -> 0x00a0 }
                goto L_0x00a4
            L_0x00a0:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00a4:
                return r11
            L_0x00a5:
                int r11 = r10.b     // Catch:{ IOException -> 0x0188 }
                e.g.a.a$d[] r11 = new e.g.a.a.d[r11]     // Catch:{ IOException -> 0x0188 }
            L_0x00a9:
                int r4 = r10.b     // Catch:{ IOException -> 0x0188 }
                if (r5 >= r4) goto L_0x00bf
                long r6 = r3.a()     // Catch:{ IOException -> 0x0188 }
                long r8 = r3.a()     // Catch:{ IOException -> 0x0188 }
                e.g.a.a$d r4 = new e.g.a.a$d     // Catch:{ IOException -> 0x0188 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0188 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0188 }
                int r5 = r5 + 1
                goto L_0x00a9
            L_0x00bf:
                r3.close()     // Catch:{ IOException -> 0x00c3 }
                goto L_0x00c7
            L_0x00c3:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00c7:
                return r11
            L_0x00c8:
                int r11 = r10.b     // Catch:{ IOException -> 0x0188 }
                long[] r11 = new long[r11]     // Catch:{ IOException -> 0x0188 }
            L_0x00cc:
                int r4 = r10.b     // Catch:{ IOException -> 0x0188 }
                if (r5 >= r4) goto L_0x00d9
                long r6 = r3.a()     // Catch:{ IOException -> 0x0188 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0188 }
                int r5 = r5 + 1
                goto L_0x00cc
            L_0x00d9:
                r3.close()     // Catch:{ IOException -> 0x00dd }
                goto L_0x00e1
            L_0x00dd:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00e1:
                return r11
            L_0x00e2:
                int r11 = r10.b     // Catch:{ IOException -> 0x0188 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0188 }
            L_0x00e6:
                int r4 = r10.b     // Catch:{ IOException -> 0x0188 }
                if (r5 >= r4) goto L_0x00f3
                int r4 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x0188 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0188 }
                int r5 = r5 + 1
                goto L_0x00e6
            L_0x00f3:
                r3.close()     // Catch:{ IOException -> 0x00f7 }
                goto L_0x00fb
            L_0x00f7:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00fb:
                return r11
            L_0x00fc:
                int r11 = r10.b     // Catch:{ IOException -> 0x0188 }
                byte[] r6 = e.g.a.a.v     // Catch:{ IOException -> 0x0188 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0188 }
                if (r11 < r6) goto L_0x0119
                r11 = 0
            L_0x0104:
                byte[] r6 = e.g.a.a.v     // Catch:{ IOException -> 0x0188 }
                int r7 = r6.length     // Catch:{ IOException -> 0x0188 }
                if (r11 >= r7) goto L_0x0116
                byte[] r7 = r10.c     // Catch:{ IOException -> 0x0188 }
                byte r7 = r7[r11]     // Catch:{ IOException -> 0x0188 }
                byte r8 = r6[r11]     // Catch:{ IOException -> 0x0188 }
                if (r7 == r8) goto L_0x0113
                r4 = 0
                goto L_0x0116
            L_0x0113:
                int r11 = r11 + 1
                goto L_0x0104
            L_0x0116:
                if (r4 == 0) goto L_0x0119
                int r5 = r6.length     // Catch:{ IOException -> 0x0188 }
            L_0x0119:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0188 }
                r11.<init>()     // Catch:{ IOException -> 0x0188 }
            L_0x011e:
                int r4 = r10.b     // Catch:{ IOException -> 0x0188 }
                if (r5 >= r4) goto L_0x013a
                byte[] r4 = r10.c     // Catch:{ IOException -> 0x0188 }
                byte r4 = r4[r5]     // Catch:{ IOException -> 0x0188 }
                if (r4 != 0) goto L_0x0129
                goto L_0x013a
            L_0x0129:
                r6 = 32
                if (r4 < r6) goto L_0x0132
                char r4 = (char) r4     // Catch:{ IOException -> 0x0188 }
                r11.append(r4)     // Catch:{ IOException -> 0x0188 }
                goto L_0x0137
            L_0x0132:
                r4 = 63
                r11.append(r4)     // Catch:{ IOException -> 0x0188 }
            L_0x0137:
                int r5 = r5 + 1
                goto L_0x011e
            L_0x013a:
                java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0188 }
                r3.close()     // Catch:{ IOException -> 0x0142 }
                goto L_0x0146
            L_0x0142:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0146:
                return r11
            L_0x0147:
                byte[] r11 = r10.c     // Catch:{ IOException -> 0x0188 }
                int r6 = r11.length     // Catch:{ IOException -> 0x0188 }
                if (r6 != r4) goto L_0x016d
                byte r6 = r11[r5]     // Catch:{ IOException -> 0x0188 }
                if (r6 < 0) goto L_0x016d
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x0188 }
                if (r11 > r4) goto L_0x016d
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0188 }
                char[] r4 = new char[r4]     // Catch:{ IOException -> 0x0188 }
                byte[] r6 = r10.c     // Catch:{ IOException -> 0x0188 }
                byte r6 = r6[r5]     // Catch:{ IOException -> 0x0188 }
                int r6 = r6 + 48
                char r6 = (char) r6     // Catch:{ IOException -> 0x0188 }
                r4[r5] = r6     // Catch:{ IOException -> 0x0188 }
                r11.<init>(r4)     // Catch:{ IOException -> 0x0188 }
                r3.close()     // Catch:{ IOException -> 0x0168 }
                goto L_0x016c
            L_0x0168:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x016c:
                return r11
            L_0x016d:
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0188 }
                byte[] r4 = r10.c     // Catch:{ IOException -> 0x0188 }
                java.nio.charset.Charset r5 = e.g.a.a.M     // Catch:{ IOException -> 0x0188 }
                r11.<init>(r4, r5)     // Catch:{ IOException -> 0x0188 }
                r3.close()     // Catch:{ IOException -> 0x017a }
                goto L_0x017e
            L_0x017a:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x017e:
                return r11
            L_0x017f:
                r3.close()     // Catch:{ IOException -> 0x0183 }
                goto L_0x0187
            L_0x0183:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x0187:
                return r2
            L_0x0188:
                r11 = move-exception
                goto L_0x018e
            L_0x018a:
                r11 = move-exception
                goto L_0x01a0
            L_0x018c:
                r11 = move-exception
                r3 = r2
            L_0x018e:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r11)     // Catch:{ all -> 0x019e }
                if (r3 == 0) goto L_0x019d
                r3.close()     // Catch:{ IOException -> 0x0199 }
                goto L_0x019d
            L_0x0199:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x019d:
                return r2
            L_0x019e:
                r11 = move-exception
                r2 = r3
            L_0x01a0:
                if (r2 == 0) goto L_0x01aa
                r2.close()     // Catch:{ IOException -> 0x01a6 }
                goto L_0x01aa
            L_0x01a6:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x01aa:
                goto L_0x01ac
            L_0x01ab:
                throw r11
            L_0x01ac:
                goto L_0x01ab
            */
            throw new UnsupportedOperationException("Method not decompiled: e.g.a.a.b.h(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            StringBuilder i2 = g.a.a.a.a.i("(");
            i2.append(a.t[this.a]);
            i2.append(", data length:");
            return g.a.a.a.a.e(i2, this.c.length, ")");
        }
    }

    public static class c {
        public final int a;
        public final String b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f1406d;

        public c(String str, int i2, int i3) {
            this.b = str;
            this.a = i2;
            this.c = i3;
            this.f1406d = -1;
        }

        public c(String str, int i2, int i3, int i4) {
            this.b = str;
            this.a = i2;
            this.c = i3;
            this.f1406d = i4;
        }
    }

    public static class d {
        public final long a;
        public final long b;

        public d(long j2, long j3) {
            if (j3 == 0) {
                this.a = 0;
                this.b = 1;
                return;
            }
            this.a = j2;
            this.b = j3;
        }

        public String toString() {
            return this.a + "/" + this.b;
        }
    }

    static {
        c[] cVarArr = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ImageWidth", 256, 3, 4), new c("ImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("SensorTopBorder", 4, 4), new c("SensorLeftBorder", 5, 4), new c("SensorBottomBorder", 6, 4), new c("SensorRightBorder", 7, 4), new c("ISO", 23, 3), new c("JpgFromRaw", 46, 7)};
        w = cVarArr;
        c[] cVarArr2 = {new c("ExposureTime", 33434, 5), new c("FNumber", 33437, 5), new c("ExposureProgram", 34850, 3), new c("SpectralSensitivity", 34852, 2), new c("PhotographicSensitivity", 34855, 3), new c("OECF", 34856, 7), new c("ExifVersion", 36864, 2), new c("DateTimeOriginal", 36867, 2), new c("DateTimeDigitized", 36868, 2), new c("ComponentsConfiguration", 37121, 7), new c("CompressedBitsPerPixel", 37122, 5), new c("ShutterSpeedValue", 37377, 10), new c("ApertureValue", 37378, 5), new c("BrightnessValue", 37379, 10), new c("ExposureBiasValue", 37380, 10), new c("MaxApertureValue", 37381, 5), new c("SubjectDistance", 37382, 5), new c("MeteringMode", 37383, 3), new c("LightSource", 37384, 3), new c("Flash", 37385, 3), new c("FocalLength", 37386, 5), new c("SubjectArea", 37396, 3), new c("MakerNote", 37500, 7), new c("UserComment", 37510, 7), new c("SubSecTime", 37520, 2), new c("SubSecTimeOriginal", 37521, 2), new c("SubSecTimeDigitized", 37522, 2), new c("FlashpixVersion", 40960, 7), new c("ColorSpace", 40961, 3), new c("PixelXDimension", 40962, 3, 4), new c("PixelYDimension", 40963, 3, 4), new c("RelatedSoundFile", 40964, 2), new c("InteroperabilityIFDPointer", 40965, 4), new c("FlashEnergy", 41483, 5), new c("SpatialFrequencyResponse", 41484, 7), new c("FocalPlaneXResolution", 41486, 5), new c("FocalPlaneYResolution", 41487, 5), new c("FocalPlaneResolutionUnit", 41488, 3), new c("SubjectLocation", 41492, 3), new c("ExposureIndex", 41493, 5), new c("SensingMethod", 41495, 3), new c("FileSource", 41728, 7), new c("SceneType", 41729, 7), new c("CFAPattern", 41730, 7), new c("CustomRendered", 41985, 3), new c("ExposureMode", 41986, 3), new c("WhiteBalance", 41987, 3), new c("DigitalZoomRatio", 41988, 5), new c("FocalLengthIn35mmFilm", 41989, 3), new c("SceneCaptureType", 41990, 3), new c("GainControl", 41991, 3), new c("Contrast", 41992, 3), new c("Saturation", 41993, 3), new c("Sharpness", 41994, 3), new c("DeviceSettingDescription", 41995, 7), new c("SubjectDistanceRange", 41996, 3), new c("ImageUniqueID", 42016, 2), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
        x = cVarArr2;
        c[] cVarArr3 = {new c("GPSVersionID", 0, 1), new c("GPSLatitudeRef", 1, 2), new c("GPSLatitude", 2, 5), new c("GPSLongitudeRef", 3, 2), new c("GPSLongitude", 4, 5), new c("GPSAltitudeRef", 5, 1), new c("GPSAltitude", 6, 5), new c("GPSTimeStamp", 7, 5), new c("GPSSatellites", 8, 2), new c("GPSStatus", 9, 2), new c("GPSMeasureMode", 10, 2), new c("GPSDOP", 11, 5), new c("GPSSpeedRef", 12, 2), new c("GPSSpeed", 13, 5), new c("GPSTrackRef", 14, 2), new c("GPSTrack", 15, 5), new c("GPSImgDirectionRef", 16, 2), new c("GPSImgDirection", 17, 5), new c("GPSMapDatum", 18, 2), new c("GPSDestLatitudeRef", 19, 2), new c("GPSDestLatitude", 20, 5), new c("GPSDestLongitudeRef", 21, 2), new c("GPSDestLongitude", 22, 5), new c("GPSDestBearingRef", 23, 2), new c("GPSDestBearing", 24, 5), new c("GPSDestDistanceRef", 25, 2), new c("GPSDestDistance", 26, 5), new c("GPSProcessingMethod", 27, 7), new c("GPSAreaInformation", 28, 7), new c("GPSDateStamp", 29, 2), new c("GPSDifferential", 30, 3)};
        y = cVarArr3;
        c[] cVarArr4 = {new c("InteroperabilityIndex", 1, 2)};
        z = cVarArr4;
        c[] cVarArr5 = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ThumbnailImageWidth", 256, 3, 4), new c("ThumbnailImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
        A = cVarArr5;
        c[] cVarArr6 = {new c("ThumbnailImage", 256, 7), new c("CameraSettingsIFDPointer", 8224, 4), new c("ImageProcessingIFDPointer", 8256, 4)};
        C = cVarArr6;
        c[] cVarArr7 = {new c("PreviewImageStart", 257, 4), new c("PreviewImageLength", 258, 4)};
        D = cVarArr7;
        c[] cVarArr8 = {new c("AspectFrame", 4371, 3)};
        E = cVarArr8;
        c[] cVarArr9 = {new c("ColorSpace", 55, 3)};
        F = cVarArr9;
        c[][] cVarArr10 = {cVarArr, cVarArr2, cVarArr3, cVarArr4, cVarArr5, cVarArr, cVarArr6, cVarArr7, cVarArr8, cVarArr9};
        G = cVarArr10;
        I = new HashMap[cVarArr10.length];
        J = new HashMap[cVarArr10.length];
        Charset forName = Charset.forName("US-ASCII");
        M = forName;
        N = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        s = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            c[][] cVarArr11 = G;
            if (i2 < cVarArr11.length) {
                I[i2] = new HashMap<>();
                J[i2] = new HashMap<>();
                for (c cVar : cVarArr11[i2]) {
                    I[i2].put(Integer.valueOf(cVar.a), cVar);
                    J[i2].put(cVar.b, cVar);
                }
                i2++;
            } else {
                HashMap<Integer, Integer> hashMap = L;
                c[] cVarArr12 = H;
                hashMap.put(Integer.valueOf(cVarArr12[0].a), 5);
                hashMap.put(Integer.valueOf(cVarArr12[1].a), 1);
                hashMap.put(Integer.valueOf(cVarArr12[2].a), 2);
                hashMap.put(Integer.valueOf(cVarArr12[3].a), 3);
                hashMap.put(Integer.valueOf(cVarArr12[4].a), 7);
                hashMap.put(Integer.valueOf(cVarArr12[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
        }
    }

    public a(InputStream inputStream) throws IOException {
        c[][] cVarArr = G;
        this.c = new HashMap[cVarArr.length];
        this.f1394d = new HashSet(cVarArr.length);
        if (inputStream != null) {
            this.a = inputStream instanceof AssetManager.AssetInputStream ? (AssetManager.AssetInputStream) inputStream : null;
            int i2 = 0;
            while (i2 < G.length) {
                try {
                    this.c[i2] = new HashMap<>();
                    i2++;
                } catch (IOException unused) {
                } catch (Throwable th) {
                    a();
                    throw th;
                }
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, MeasureConst.DEFAULT_REPORT_DELAY_TIME);
            this.b = f(bufferedInputStream);
            C0047a aVar = new C0047a((InputStream) bufferedInputStream);
            switch (this.b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    i(aVar);
                    break;
                case 4:
                    e(aVar, 0, 0);
                    break;
                case 7:
                    g(aVar);
                    break;
                case 9:
                    h(aVar);
                    break;
                case 10:
                    j(aVar);
                    break;
            }
            p(aVar);
            a();
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null");
    }

    public static long[] b(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = (long) iArr[i2];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    public final void a() {
        String c2 = c("DateTimeOriginal");
        if (c2 != null && c("DateTime") == null) {
            this.c[0].put("DateTime", b.a(c2));
        }
        if (c("ImageWidth") == null) {
            this.c[0].put("ImageWidth", b.b(0, this.f1395e));
        }
        if (c("ImageLength") == null) {
            this.c[0].put("ImageLength", b.b(0, this.f1395e));
        }
        if (c("Orientation") == null) {
            this.c[0].put("Orientation", b.b(0, this.f1395e));
        }
        if (c("LightSource") == null) {
            this.c[1].put("LightSource", b.b(0, this.f1395e));
        }
    }

    public String c(String str) {
        String str2;
        b d2 = d(str);
        if (d2 != null) {
            if (!K.contains(str)) {
                return d2.g(this.f1395e);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = d2.a;
                if (i2 == 5 || i2 == 10) {
                    d[] dVarArr = (d[]) d2.h(this.f1395e);
                    if (dVarArr == null || dVarArr.length != 3) {
                        StringBuilder i3 = g.a.a.a.a.i("Invalid GPS Timestamp array. array=");
                        i3.append(Arrays.toString(dVarArr));
                        str2 = i3.toString();
                    } else {
                        return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) dVarArr[0].a) / ((float) dVarArr[0].b))), Integer.valueOf((int) (((float) dVarArr[1].a) / ((float) dVarArr[1].b))), Integer.valueOf((int) (((float) dVarArr[2].a) / ((float) dVarArr[2].b)))});
                    }
                } else {
                    StringBuilder i4 = g.a.a.a.a.i("GPS Timestamp format is not rational. format=");
                    i4.append(d2.a);
                    str2 = i4.toString();
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(d2.e(this.f1395e));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final b d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i2 = 0; i2 < G.length; i2++) {
            b bVar = this.c[i2].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0086 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00fc A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(e.g.a.a.C0047a r9, int r10, int r11) throws java.io.IOException {
        /*
            r8 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r9.c = r0
            long r0 = (long) r10
            r9.b(r0)
            byte r0 = r9.readByte()
            java.lang.String r1 = "Invalid marker: "
            r2 = -1
            if (r0 != r2) goto L_0x014f
            r3 = 1
            int r10 = r10 + r3
            byte r4 = r9.readByte()
            r5 = -40
            if (r4 != r5) goto L_0x0138
            int r10 = r10 + r3
        L_0x001c:
            byte r0 = r9.readByte()
            if (r0 != r2) goto L_0x011f
            int r10 = r10 + r3
            byte r0 = r9.readByte()
            int r10 = r10 + r3
            r1 = -39
            if (r0 == r1) goto L_0x011a
            r1 = -38
            if (r0 != r1) goto L_0x0032
            goto L_0x011a
        L_0x0032:
            int r1 = r9.readUnsignedShort()
            int r1 = r1 + -2
            int r10 = r10 + 2
            java.lang.String r4 = "Invalid length"
            if (r1 < 0) goto L_0x0114
            r5 = -31
            java.lang.String r6 = "Invalid exif"
            if (r0 == r5) goto L_0x00b7
            r5 = -2
            if (r0 == r5) goto L_0x008e
            switch(r0) {
                case -64: goto L_0x0055;
                case -63: goto L_0x0055;
                case -62: goto L_0x0055;
                case -61: goto L_0x0055;
                default: goto L_0x004a;
            }
        L_0x004a:
            switch(r0) {
                case -59: goto L_0x0055;
                case -58: goto L_0x0055;
                case -57: goto L_0x0055;
                default: goto L_0x004d;
            }
        L_0x004d:
            switch(r0) {
                case -55: goto L_0x0055;
                case -54: goto L_0x0055;
                case -53: goto L_0x0055;
                default: goto L_0x0050;
            }
        L_0x0050:
            switch(r0) {
                case -51: goto L_0x0055;
                case -50: goto L_0x0055;
                case -49: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x00e9
        L_0x0055:
            int r0 = r9.skipBytes(r3)
            if (r0 != r3) goto L_0x0086
            java.util.HashMap<java.lang.String, e.g.a.a$b>[] r0 = r8.c
            r0 = r0[r11]
            int r5 = r9.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r8.f1395e
            e.g.a.a$b r5 = e.g.a.a.b.b(r5, r7)
            java.lang.String r6 = "ImageLength"
            r0.put(r6, r5)
            java.util.HashMap<java.lang.String, e.g.a.a$b>[] r0 = r8.c
            r0 = r0[r11]
            int r5 = r9.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r8.f1395e
            e.g.a.a$b r5 = e.g.a.a.b.b(r5, r7)
            java.lang.String r6 = "ImageWidth"
            r0.put(r6, r5)
            int r1 = r1 + -5
            goto L_0x00e9
        L_0x0086:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "Invalid SOFx"
            r9.<init>(r10)
            throw r9
        L_0x008e:
            byte[] r0 = new byte[r1]
            int r5 = r9.read(r0)
            if (r5 != r1) goto L_0x00b1
            java.lang.String r1 = "UserComment"
            java.lang.String r5 = r8.c(r1)
            if (r5 != 0) goto L_0x00e8
            java.util.HashMap<java.lang.String, e.g.a.a$b>[] r5 = r8.c
            r5 = r5[r3]
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r7 = M
            r6.<init>(r0, r7)
            e.g.a.a$b r0 = e.g.a.a.b.a(r6)
            r5.put(r1, r0)
            goto L_0x00e8
        L_0x00b1:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r6)
            throw r9
        L_0x00b7:
            r0 = 6
            if (r1 >= r0) goto L_0x00bb
            goto L_0x00e9
        L_0x00bb:
            byte[] r5 = new byte[r0]
            int r7 = r9.read(r5)
            if (r7 != r0) goto L_0x010e
            int r10 = r10 + 6
            int r1 = r1 + -6
            byte[] r0 = N
            boolean r0 = java.util.Arrays.equals(r5, r0)
            if (r0 != 0) goto L_0x00d0
            goto L_0x00e9
        L_0x00d0:
            if (r1 <= 0) goto L_0x0108
            r8.f1397g = r10
            byte[] r0 = new byte[r1]
            int r5 = r9.read(r0)
            if (r5 != r1) goto L_0x0102
            int r10 = r10 + r1
            e.g.a.a$a r5 = new e.g.a.a$a
            r5.<init>((byte[]) r0)
            r8.m(r5, r1)
            r8.o(r5, r11)
        L_0x00e8:
            r1 = 0
        L_0x00e9:
            if (r1 < 0) goto L_0x00fc
            int r0 = r9.skipBytes(r1)
            if (r0 != r1) goto L_0x00f4
            int r10 = r10 + r1
            goto L_0x001c
        L_0x00f4:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "Invalid JPEG segment"
            r9.<init>(r10)
            throw r9
        L_0x00fc:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r4)
            throw r9
        L_0x0102:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r6)
            throw r9
        L_0x0108:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r6)
            throw r9
        L_0x010e:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r6)
            throw r9
        L_0x0114:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r4)
            throw r9
        L_0x011a:
            java.nio.ByteOrder r10 = r8.f1395e
            r9.c = r10
            return
        L_0x011f:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "Invalid marker:"
            java.lang.StringBuilder r10 = g.a.a.a.a.i(r10)
            r11 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0138:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r10 = g.a.a.a.a.i(r1)
            r11 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x014f:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r10 = g.a.a.a.a.i(r1)
            r11 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            goto L_0x0167
        L_0x0166:
            throw r9
        L_0x0167:
            goto L_0x0166
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.a.a.e(e.g.a.a$a, int, int):void");
    }

    public final int f(BufferedInputStream bufferedInputStream) throws IOException {
        boolean z2;
        boolean z3;
        boolean z4;
        bufferedInputStream.mark(MeasureConst.DEFAULT_REPORT_DELAY_TIME);
        byte[] bArr = new byte[MeasureConst.DEFAULT_REPORT_DELAY_TIME];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i2 = 0;
        while (true) {
            byte[] bArr2 = p;
            z2 = true;
            if (i2 >= bArr2.length) {
                z3 = true;
                break;
            } else if (bArr[i2] != bArr2[i2]) {
                z3 = false;
                break;
            } else {
                i2++;
            }
        }
        if (z3) {
            return 4;
        }
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        int i3 = 0;
        while (true) {
            if (i3 >= bytes.length) {
                z4 = true;
                break;
            } else if (bArr[i3] != bytes[i3]) {
                z4 = false;
                break;
            } else {
                i3++;
            }
        }
        if (z4) {
            return 9;
        }
        C0047a aVar = new C0047a(bArr);
        ByteOrder n2 = n(aVar);
        this.f1395e = n2;
        aVar.c = n2;
        short readShort = aVar.readShort();
        aVar.close();
        if (readShort == 20306 || readShort == 21330) {
            return 7;
        }
        C0047a aVar2 = new C0047a(bArr);
        ByteOrder n3 = n(aVar2);
        this.f1395e = n3;
        aVar2.c = n3;
        short readShort2 = aVar2.readShort();
        aVar2.close();
        if (readShort2 != 85) {
            z2 = false;
        }
        if (z2) {
            return 10;
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(e.g.a.a.C0047a r7) throws java.io.IOException {
        /*
            r6 = this;
            r6.i(r7)
            java.util.HashMap<java.lang.String, e.g.a.a$b>[] r7 = r6.c
            r0 = 1
            r7 = r7[r0]
            java.lang.String r1 = "MakerNote"
            java.lang.Object r7 = r7.get(r1)
            e.g.a.a$b r7 = (e.g.a.a.b) r7
            if (r7 == 0) goto L_0x00ef
            e.g.a.a$a r1 = new e.g.a.a$a
            byte[] r7 = r7.c
            r1.<init>((byte[]) r7)
            java.nio.ByteOrder r7 = r6.f1395e
            r1.c = r7
            byte[] r7 = q
            int r2 = r7.length
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            r3 = 0
            r1.b(r3)
            byte[] r3 = r
            int r4 = r3.length
            byte[] r4 = new byte[r4]
            r1.readFully(r4)
            boolean r7 = java.util.Arrays.equals(r2, r7)
            if (r7 == 0) goto L_0x003b
            r2 = 8
            goto L_0x0043
        L_0x003b:
            boolean r7 = java.util.Arrays.equals(r4, r3)
            if (r7 == 0) goto L_0x0046
            r2 = 12
        L_0x0043:
            r1.b(r2)
        L_0x0046:
            r7 = 6
            r6.o(r1, r7)
            java.util.HashMap<java.lang.String, e.g.a.a$b>[] r7 = r6.c
            r1 = 7
            r7 = r7[r1]
            java.lang.String r2 = "PreviewImageStart"
            java.lang.Object r7 = r7.get(r2)
            e.g.a.a$b r7 = (e.g.a.a.b) r7
            java.util.HashMap<java.lang.String, e.g.a.a$b>[] r2 = r6.c
            r1 = r2[r1]
            java.lang.String r2 = "PreviewImageLength"
            java.lang.Object r1 = r1.get(r2)
            e.g.a.a$b r1 = (e.g.a.a.b) r1
            if (r7 == 0) goto L_0x007a
            if (r1 == 0) goto L_0x007a
            java.util.HashMap<java.lang.String, e.g.a.a$b>[] r2 = r6.c
            r3 = 5
            r2 = r2[r3]
            java.lang.String r4 = "JPEGInterchangeFormat"
            r2.put(r4, r7)
            java.util.HashMap<java.lang.String, e.g.a.a$b>[] r7 = r6.c
            r7 = r7[r3]
            java.lang.String r2 = "JPEGInterchangeFormatLength"
            r7.put(r2, r1)
        L_0x007a:
            java.util.HashMap<java.lang.String, e.g.a.a$b>[] r7 = r6.c
            r1 = 8
            r7 = r7[r1]
            java.lang.String r1 = "AspectFrame"
            java.lang.Object r7 = r7.get(r1)
            e.g.a.a$b r7 = (e.g.a.a.b) r7
            if (r7 == 0) goto L_0x00ef
            java.nio.ByteOrder r1 = r6.f1395e
            java.lang.Object r7 = r7.h(r1)
            int[] r7 = (int[]) r7
            if (r7 == 0) goto L_0x00d9
            int r1 = r7.length
            r2 = 4
            if (r1 == r2) goto L_0x0099
            goto L_0x00d9
        L_0x0099:
            r1 = 2
            r2 = r7[r1]
            r3 = 0
            r4 = r7[r3]
            if (r2 <= r4) goto L_0x00ef
            r2 = 3
            r4 = r7[r2]
            r5 = r7[r0]
            if (r4 <= r5) goto L_0x00ef
            r1 = r7[r1]
            r4 = r7[r3]
            int r1 = r1 - r4
            int r1 = r1 + r0
            r2 = r7[r2]
            r7 = r7[r0]
            int r2 = r2 - r7
            int r2 = r2 + r0
            if (r1 >= r2) goto L_0x00ba
            int r1 = r1 + r2
            int r2 = r1 - r2
            int r1 = r1 - r2
        L_0x00ba:
            java.nio.ByteOrder r7 = r6.f1395e
            e.g.a.a$b r7 = e.g.a.a.b.d(r1, r7)
            java.nio.ByteOrder r0 = r6.f1395e
            e.g.a.a$b r0 = e.g.a.a.b.d(r2, r0)
            java.util.HashMap<java.lang.String, e.g.a.a$b>[] r1 = r6.c
            r1 = r1[r3]
            java.lang.String r2 = "ImageWidth"
            r1.put(r2, r7)
            java.util.HashMap<java.lang.String, e.g.a.a$b>[] r7 = r6.c
            r7 = r7[r3]
            java.lang.String r1 = "ImageLength"
            r7.put(r1, r0)
            goto L_0x00ef
        L_0x00d9:
            java.lang.String r0 = "Invalid aspect frame values. frame="
            java.lang.StringBuilder r0 = g.a.a.a.a.i(r0)
            java.lang.String r7 = java.util.Arrays.toString(r7)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "ExifInterface"
            android.util.Log.w(r0, r7)
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.a.a.g(e.g.a.a$a):void");
    }

    public final void h(C0047a aVar) throws IOException {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        e(aVar, i2, 5);
        aVar.b((long) i3);
        aVar.c = ByteOrder.BIG_ENDIAN;
        int readInt = aVar.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == B.a) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                b d2 = b.d(readShort, this.f1395e);
                b d3 = b.d(readShort2, this.f1395e);
                this.c[0].put("ImageLength", d2);
                this.c[0].put("ImageWidth", d3);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    public final void i(C0047a aVar) throws IOException {
        b bVar;
        m(aVar, aVar.available());
        o(aVar, 0);
        r(aVar, 0);
        r(aVar, 5);
        r(aVar, 4);
        q(0, 5);
        q(0, 4);
        q(5, 4);
        b bVar2 = this.c[1].get("PixelXDimension");
        b bVar3 = this.c[1].get("PixelYDimension");
        if (!(bVar2 == null || bVar3 == null)) {
            this.c[0].put("ImageWidth", bVar2);
            this.c[0].put("ImageLength", bVar3);
        }
        if (this.c[4].isEmpty() && l(this.c[5])) {
            HashMap<String, b>[] hashMapArr = this.c;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!l(this.c[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        if (this.b == 8 && (bVar = this.c[1].get("MakerNote")) != null) {
            C0047a aVar2 = new C0047a(bVar.c);
            aVar2.c = this.f1395e;
            aVar2.b(6);
            o(aVar2, 9);
            b bVar4 = this.c[9].get("ColorSpace");
            if (bVar4 != null) {
                this.c[1].put("ColorSpace", bVar4);
            }
        }
    }

    public final void j(C0047a aVar) throws IOException {
        i(aVar);
        if (this.c[0].get("JpgFromRaw") != null) {
            e(aVar, this.f1401k, 5);
        }
        b bVar = this.c[0].get("ISO");
        b bVar2 = this.c[1].get("PhotographicSensitivity");
        if (bVar != null && bVar2 == null) {
            this.c[1].put("PhotographicSensitivity", bVar);
        }
    }

    public final void k(C0047a aVar, HashMap hashMap) throws IOException {
        int i2;
        b bVar = (b) hashMap.get("JPEGInterchangeFormat");
        b bVar2 = (b) hashMap.get("JPEGInterchangeFormatLength");
        if (bVar != null && bVar2 != null) {
            int f2 = bVar.f(this.f1395e);
            int min = Math.min(bVar2.f(this.f1395e), aVar.available() - f2);
            int i3 = this.b;
            if (i3 == 4 || i3 == 9 || i3 == 10) {
                i2 = this.f1397g;
            } else {
                if (i3 == 7) {
                    i2 = this.f1398h;
                }
                if (f2 > 0 && min > 0 && this.a == null) {
                    aVar.b((long) f2);
                    aVar.readFully(new byte[min]);
                    return;
                }
                return;
            }
            f2 += i2;
            if (f2 > 0) {
            }
        }
    }

    public final boolean l(HashMap hashMap) throws IOException {
        b bVar = (b) hashMap.get("ImageLength");
        b bVar2 = (b) hashMap.get("ImageWidth");
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar.f(this.f1395e) <= 512 && bVar2.f(this.f1395e) <= 512;
    }

    public final void m(C0047a aVar, int i2) throws IOException {
        ByteOrder n2 = n(aVar);
        this.f1395e = n2;
        aVar.c = n2;
        int readUnsignedShort = aVar.readUnsignedShort();
        int i3 = this.b;
        if (i3 == 7 || i3 == 10 || readUnsignedShort == 42) {
            int readInt = aVar.readInt();
            if (readInt < 8 || readInt >= i2) {
                throw new IOException(g.a.a.a.a.q("Invalid first Ifd offset: ", readInt));
            }
            int i4 = readInt - 8;
            if (i4 > 0 && aVar.skipBytes(i4) != i4) {
                throw new IOException(g.a.a.a.a.q("Couldn't jump to first Ifd: ", i4));
            }
            return;
        }
        StringBuilder i5 = g.a.a.a.a.i("Invalid start code: ");
        i5.append(Integer.toHexString(readUnsignedShort));
        throw new IOException(i5.toString());
    }

    public final ByteOrder n(C0047a aVar) throws IOException {
        short readShort = aVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        StringBuilder i2 = g.a.a.a.a.i("Invalid byte order: ");
        i2.append(Integer.toHexString(readShort));
        throw new IOException(i2.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007b, code lost:
        r13 = r12.f1406d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0206  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(e.g.a.a.C0047a r24, int r25) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.util.Set<java.lang.Integer> r3 = r0.f1394d
            int r4 = r1.f1405e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.f1405e
            int r3 = r3 + 2
            int r4 = r1.f1404d
            if (r3 <= r4) goto L_0x001a
            return
        L_0x001a:
            short r3 = r24.readShort()
            int r4 = r1.f1405e
            int r5 = r3 * 12
            int r5 = r5 + r4
            int r4 = r1.f1404d
            if (r5 > r4) goto L_0x0324
            if (r3 > 0) goto L_0x002b
            goto L_0x0324
        L_0x002b:
            r4 = 0
        L_0x002c:
            java.lang.String r5 = "ExifInterface"
            r6 = 4
            if (r4 >= r3) goto L_0x02c5
            int r7 = r24.readUnsignedShort()
            int r8 = r24.readUnsignedShort()
            int r9 = r24.readInt()
            int r10 = r1.f1405e
            long r10 = (long) r10
            r12 = 4
            long r10 = r10 + r12
            java.util.HashMap<java.lang.Integer, e.g.a.a$c>[] r12 = I
            r12 = r12[r2]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            java.lang.Object r12 = r12.get(r13)
            e.g.a.a$c r12 = (e.g.a.a.c) r12
            r13 = 7
            if (r12 != 0) goto L_0x0069
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r13 = "Skip the tag entry since tag number is not defined: "
            r6.append(r13)
            r6.append(r7)
        L_0x0061:
            java.lang.String r6 = r6.toString()
            android.util.Log.w(r5, r6)
            goto L_0x00bb
        L_0x0069:
            if (r8 <= 0) goto L_0x00f1
            int[] r15 = u
            int r14 = r15.length
            if (r8 < r14) goto L_0x0072
            goto L_0x00f1
        L_0x0072:
            int r14 = r12.c
            if (r14 == r13) goto L_0x00a0
            if (r8 != r13) goto L_0x0079
            goto L_0x00a0
        L_0x0079:
            if (r14 == r8) goto L_0x00a0
            int r13 = r12.f1406d
            if (r13 != r8) goto L_0x0080
            goto L_0x00a0
        L_0x0080:
            if (r14 == r6) goto L_0x0084
            if (r13 != r6) goto L_0x0088
        L_0x0084:
            r6 = 3
            if (r8 != r6) goto L_0x0088
            goto L_0x00a0
        L_0x0088:
            r6 = 9
            if (r14 == r6) goto L_0x008e
            if (r13 != r6) goto L_0x0093
        L_0x008e:
            r6 = 8
            if (r8 != r6) goto L_0x0093
            goto L_0x00a0
        L_0x0093:
            r6 = 12
            if (r14 == r6) goto L_0x0099
            if (r13 != r6) goto L_0x009e
        L_0x0099:
            r6 = 11
            if (r8 != r6) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            r6 = 0
            goto L_0x00a1
        L_0x00a0:
            r6 = 1
        L_0x00a1:
            if (r6 != 0) goto L_0x00bf
            java.lang.String r6 = "Skip the tag entry since data format ("
            java.lang.StringBuilder r6 = g.a.a.a.a.i(r6)
            java.lang.String[] r13 = t
            r13 = r13[r8]
            r6.append(r13)
            java.lang.String r13 = ") is unexpected for tag: "
            r6.append(r13)
            java.lang.String r13 = r12.b
            r6.append(r13)
            goto L_0x0061
        L_0x00bb:
            r15 = r3
            r17 = r4
            goto L_0x0108
        L_0x00bf:
            r6 = 7
            if (r8 != r6) goto L_0x00c3
            r8 = r14
        L_0x00c3:
            long r13 = (long) r9
            r6 = r15[r8]
            r15 = r3
            r17 = r4
            long r3 = (long) r6
            long r3 = r3 * r13
            r13 = 0
            int r6 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r6 < 0) goto L_0x00dc
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r6 <= 0) goto L_0x00da
            goto L_0x00dc
        L_0x00da:
            r14 = 1
            goto L_0x010b
        L_0x00dc:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r13 = "Skip the tag entry since the number of components is invalid: "
            r6.append(r13)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            android.util.Log.w(r5, r6)
            goto L_0x010a
        L_0x00f1:
            r15 = r3
            r17 = r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip the tag entry since data format is invalid: "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r5, r3)
        L_0x0108:
            r3 = 0
        L_0x010a:
            r14 = 0
        L_0x010b:
            if (r14 != 0) goto L_0x0114
            r1.b(r10)
            r16 = r15
            goto L_0x02be
        L_0x0114:
            java.lang.String r6 = "Compression"
            r13 = 4
            int r16 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r16 <= 0) goto L_0x01b8
            int r13 = r24.readInt()
            int r14 = r0.b
            r16 = r15
            r15 = 7
            if (r14 != r15) goto L_0x0184
            java.lang.String r14 = r12.b
            java.lang.String r15 = "MakerNote"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x0134
            r0.f1398h = r13
            goto L_0x017e
        L_0x0134:
            r14 = 6
            if (r2 != r14) goto L_0x017e
            java.lang.String r14 = r12.b
            java.lang.String r15 = "ThumbnailImage"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x017e
            r0.f1399i = r13
            r0.f1400j = r9
            java.nio.ByteOrder r14 = r0.f1395e
            r15 = 6
            e.g.a.a$b r14 = e.g.a.a.b.d(r15, r14)
            int r15 = r0.f1399i
            r18 = r10
            long r10 = (long) r15
            java.nio.ByteOrder r15 = r0.f1395e
            e.g.a.a$b r10 = e.g.a.a.b.b(r10, r15)
            int r11 = r0.f1400j
            r20 = r8
            r15 = r9
            long r8 = (long) r11
            java.nio.ByteOrder r11 = r0.f1395e
            e.g.a.a$b r8 = e.g.a.a.b.b(r8, r11)
            java.util.HashMap<java.lang.String, e.g.a.a$b>[] r9 = r0.c
            r11 = 4
            r9 = r9[r11]
            r9.put(r6, r14)
            java.util.HashMap<java.lang.String, e.g.a.a$b>[] r9 = r0.c
            r9 = r9[r11]
            java.lang.String r14 = "JPEGInterchangeFormat"
            r9.put(r14, r10)
            java.util.HashMap<java.lang.String, e.g.a.a$b>[] r9 = r0.c
            r9 = r9[r11]
            java.lang.String r10 = "JPEGInterchangeFormatLength"
            r9.put(r10, r8)
            goto L_0x0199
        L_0x017e:
            r20 = r8
            r15 = r9
            r18 = r10
            goto L_0x0199
        L_0x0184:
            r20 = r8
            r15 = r9
            r18 = r10
            r8 = 10
            if (r14 != r8) goto L_0x0199
            java.lang.String r8 = r12.b
            java.lang.String r9 = "JpgFromRaw"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x0199
            r0.f1401k = r13
        L_0x0199:
            long r8 = (long) r13
            long r10 = r8 + r3
            int r14 = r1.f1404d
            r21 = r15
            long r14 = (long) r14
            int r22 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r22 > 0) goto L_0x01a9
            r1.b(r8)
            goto L_0x01c0
        L_0x01a9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip the tag entry since data offset is invalid: "
            r3.append(r4)
            r3.append(r13)
            goto L_0x024c
        L_0x01b8:
            r20 = r8
            r21 = r9
            r18 = r10
            r16 = r15
        L_0x01c0:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r8 = L
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r8.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x0254
            r3 = -1
            r6 = 3
            r8 = r20
            if (r8 == r6) goto L_0x01f4
            r6 = 4
            if (r8 == r6) goto L_0x01ef
            r6 = 8
            if (r8 == r6) goto L_0x01ea
            r6 = 9
            if (r8 == r6) goto L_0x01e5
            r6 = 13
            if (r8 == r6) goto L_0x01e5
            goto L_0x01f9
        L_0x01e5:
            int r3 = r24.readInt()
            goto L_0x01f8
        L_0x01ea:
            short r3 = r24.readShort()
            goto L_0x01f8
        L_0x01ef:
            long r3 = r24.a()
            goto L_0x01f9
        L_0x01f4:
            int r3 = r24.readUnsignedShort()
        L_0x01f8:
            long r3 = (long) r3
        L_0x01f9:
            r8 = 0
            int r6 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x023e
            int r6 = r1.f1404d
            long r8 = (long) r6
            int r6 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x023e
            java.util.Set<java.lang.Integer> r6 = r0.f1394d
            int r8 = (int) r3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r6 = r6.contains(r8)
            if (r6 != 0) goto L_0x021f
            r1.b(r3)
            int r3 = r7.intValue()
            r0.o(r1, r3)
            goto L_0x02b9
        L_0x021f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Skip jump into the IFD since it has already been read: IfdType "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r7 = " (at "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = ")"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            goto L_0x0250
        L_0x023e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip jump into the IFD since its offset is invalid: "
            r6.append(r7)
            r6.append(r3)
            r3 = r6
        L_0x024c:
            java.lang.String r3 = r3.toString()
        L_0x0250:
            android.util.Log.w(r5, r3)
            goto L_0x02b9
        L_0x0254:
            r8 = r20
            int r4 = (int) r3
            byte[] r3 = new byte[r4]
            r1.readFully(r3)
            e.g.a.a$b r4 = new e.g.a.a$b
            r5 = r21
            r4.<init>(r8, r5, r3)
            java.util.HashMap<java.lang.String, e.g.a.a$b>[] r3 = r0.c
            r3 = r3[r2]
            java.lang.String r5 = r12.b
            r3.put(r5, r4)
            java.lang.String r3 = r12.b
            java.lang.String r5 = "DNGVersion"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0279
            r3 = 3
            r0.b = r3
        L_0x0279:
            java.lang.String r3 = r12.b
            java.lang.String r5 = "Make"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x028d
            java.lang.String r3 = r12.b
            java.lang.String r5 = "Model"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x029b
        L_0x028d:
            java.nio.ByteOrder r3 = r0.f1395e
            java.lang.String r3 = r4.g(r3)
            java.lang.String r5 = "PENTAX"
            boolean r3 = r3.contains(r5)
            if (r3 != 0) goto L_0x02ae
        L_0x029b:
            java.lang.String r3 = r12.b
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x02b2
            java.nio.ByteOrder r3 = r0.f1395e
            int r3 = r4.f(r3)
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r3 != r4) goto L_0x02b2
        L_0x02ae:
            r3 = 8
            r0.b = r3
        L_0x02b2:
            int r3 = r1.f1405e
            long r3 = (long) r3
            int r5 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r5 == 0) goto L_0x02be
        L_0x02b9:
            r10 = r18
            r1.b(r10)
        L_0x02be:
            int r4 = r17 + 1
            short r4 = (short) r4
            r3 = r16
            goto L_0x002c
        L_0x02c5:
            int r2 = r1.f1405e
            int r2 = r2 + 4
            int r3 = r1.f1404d
            if (r2 > r3) goto L_0x0324
            int r2 = r24.readInt()
            long r3 = (long) r2
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0310
            int r6 = r1.f1404d
            if (r2 >= r6) goto L_0x0310
            java.util.Set<java.lang.Integer> r6 = r0.f1394d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x0308
            r1.b(r3)
            java.util.HashMap<java.lang.String, e.g.a.a$b>[] r2 = r0.c
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02f8
            r2 = 4
            goto L_0x0304
        L_0x02f8:
            java.util.HashMap<java.lang.String, e.g.a.a$b>[] r2 = r0.c
            r3 = 5
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0324
            r2 = 5
        L_0x0304:
            r0.o(r1, r2)
            goto L_0x0324
        L_0x0308:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            goto L_0x0317
        L_0x0310:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
        L_0x0317:
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r5, r1)
        L_0x0324:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.a.a.o(e.g.a.a$a, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (java.util.Arrays.equals(r1, o) != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        if (java.util.Arrays.equals(r1, r5) != false) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(e.g.a.a.C0047a r13) throws java.io.IOException {
        /*
            r12 = this;
            java.util.HashMap<java.lang.String, e.g.a.a$b>[] r0 = r12.c
            r1 = 4
            r0 = r0[r1]
            java.lang.String r1 = "Compression"
            java.lang.Object r1 = r0.get(r1)
            e.g.a.a$b r1 = (e.g.a.a.b) r1
            r2 = 6
            if (r1 == 0) goto L_0x00d5
            java.nio.ByteOrder r3 = r12.f1395e
            int r1 = r1.f(r3)
            r12.f1396f = r1
            r3 = 1
            if (r1 == r3) goto L_0x0022
            if (r1 == r2) goto L_0x00d7
            r4 = 7
            if (r1 == r4) goto L_0x0022
            goto L_0x00da
        L_0x0022:
            java.lang.String r1 = "BitsPerSample"
            java.lang.Object r1 = r0.get(r1)
            e.g.a.a$b r1 = (e.g.a.a.b) r1
            r4 = 0
            if (r1 == 0) goto L_0x0066
            java.nio.ByteOrder r5 = r12.f1395e
            java.lang.Object r1 = r1.h(r5)
            int[] r1 = (int[]) r1
            int[] r5 = n
            boolean r6 = java.util.Arrays.equals(r5, r1)
            if (r6 == 0) goto L_0x003e
            goto L_0x0067
        L_0x003e:
            int r6 = r12.b
            r7 = 3
            if (r6 != r7) goto L_0x0066
            java.lang.String r6 = "PhotometricInterpretation"
            java.lang.Object r6 = r0.get(r6)
            e.g.a.a$b r6 = (e.g.a.a.b) r6
            if (r6 == 0) goto L_0x0066
            java.nio.ByteOrder r7 = r12.f1395e
            int r6 = r6.f(r7)
            if (r6 != r3) goto L_0x005d
            int[] r7 = o
            boolean r7 = java.util.Arrays.equals(r1, r7)
            if (r7 != 0) goto L_0x0067
        L_0x005d:
            if (r6 != r2) goto L_0x0066
            boolean r1 = java.util.Arrays.equals(r1, r5)
            if (r1 == 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r3 = 0
        L_0x0067:
            if (r3 == 0) goto L_0x00da
            java.lang.String r1 = "StripOffsets"
            java.lang.Object r1 = r0.get(r1)
            e.g.a.a$b r1 = (e.g.a.a.b) r1
            java.lang.String r2 = "StripByteCounts"
            java.lang.Object r0 = r0.get(r2)
            e.g.a.a$b r0 = (e.g.a.a.b) r0
            if (r1 == 0) goto L_0x00da
            if (r0 == 0) goto L_0x00da
            java.nio.ByteOrder r2 = r12.f1395e
            java.lang.Object r1 = r1.h(r2)
            long[] r1 = b(r1)
            java.nio.ByteOrder r2 = r12.f1395e
            java.lang.Object r0 = r0.h(r2)
            long[] r0 = b(r0)
            java.lang.String r2 = "ExifInterface"
            if (r1 != 0) goto L_0x0098
            java.lang.String r13 = "stripOffsets should not be null."
            goto L_0x009c
        L_0x0098:
            if (r0 != 0) goto L_0x00a0
            java.lang.String r13 = "stripByteCounts should not be null."
        L_0x009c:
            android.util.Log.w(r2, r13)
            goto L_0x00da
        L_0x00a0:
            r5 = 0
            int r3 = r0.length
            r7 = 0
        L_0x00a4:
            if (r7 >= r3) goto L_0x00ac
            r8 = r0[r7]
            long r5 = r5 + r8
            int r7 = r7 + 1
            goto L_0x00a4
        L_0x00ac:
            int r3 = (int) r5
            byte[] r3 = new byte[r3]
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x00b2:
            int r8 = r1.length
            if (r5 >= r8) goto L_0x00da
            r8 = r1[r5]
            int r9 = (int) r8
            r10 = r0[r5]
            int r8 = (int) r10
            int r9 = r9 - r6
            if (r9 >= 0) goto L_0x00c3
            java.lang.String r10 = "Invalid strip offset value"
            android.util.Log.d(r2, r10)
        L_0x00c3:
            long r10 = (long) r9
            r13.b(r10)
            int r6 = r6 + r9
            byte[] r9 = new byte[r8]
            r13.read(r9)
            int r6 = r6 + r8
            java.lang.System.arraycopy(r9, r4, r3, r7, r8)
            int r7 = r7 + r8
            int r5 = r5 + 1
            goto L_0x00b2
        L_0x00d5:
            r12.f1396f = r2
        L_0x00d7:
            r12.k(r13, r0)
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.a.a.p(e.g.a.a$a):void");
    }

    public final void q(int i2, int i3) throws IOException {
        if (!this.c[i2].isEmpty() && !this.c[i3].isEmpty()) {
            b bVar = this.c[i2].get("ImageLength");
            b bVar2 = this.c[i2].get("ImageWidth");
            b bVar3 = this.c[i3].get("ImageLength");
            b bVar4 = this.c[i3].get("ImageWidth");
            if (bVar != null && bVar2 != null && bVar3 != null && bVar4 != null) {
                int f2 = bVar.f(this.f1395e);
                int f3 = bVar2.f(this.f1395e);
                int f4 = bVar3.f(this.f1395e);
                int f5 = bVar4.f(this.f1395e);
                if (f2 < f4 && f3 < f5) {
                    HashMap<String, b>[] hashMapArr = this.c;
                    HashMap<String, b> hashMap = hashMapArr[i2];
                    hashMapArr[i2] = hashMapArr[i3];
                    hashMapArr[i3] = hashMap;
                }
            }
        }
    }

    public final void r(C0047a aVar, int i2) throws IOException {
        b bVar;
        StringBuilder sb;
        String str;
        b bVar2;
        b bVar3;
        b bVar4 = this.c[i2].get("DefaultCropSize");
        b bVar5 = this.c[i2].get("SensorTopBorder");
        b bVar6 = this.c[i2].get("SensorLeftBorder");
        b bVar7 = this.c[i2].get("SensorBottomBorder");
        b bVar8 = this.c[i2].get("SensorRightBorder");
        if (bVar4 != null) {
            if (bVar4.a == 5) {
                d[] dVarArr = (d[]) bVar4.h(this.f1395e);
                if (dVarArr == null || dVarArr.length != 2) {
                    sb = g.a.a.a.a.i("Invalid crop size values. cropSize=");
                    str = Arrays.toString(dVarArr);
                    sb.append(str);
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                bVar3 = b.c(dVarArr[0], this.f1395e);
                bVar2 = b.c(dVarArr[1], this.f1395e);
            } else {
                int[] iArr = (int[]) bVar4.h(this.f1395e);
                if (iArr == null || iArr.length != 2) {
                    sb = g.a.a.a.a.i("Invalid crop size values. cropSize=");
                    str = Arrays.toString(iArr);
                    sb.append(str);
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                bVar3 = b.d(iArr[0], this.f1395e);
                bVar2 = b.d(iArr[1], this.f1395e);
            }
            this.c[i2].put("ImageWidth", bVar3);
            this.c[i2].put("ImageLength", bVar2);
        } else if (bVar5 == null || bVar6 == null || bVar7 == null || bVar8 == null) {
            b bVar9 = this.c[i2].get("ImageLength");
            b bVar10 = this.c[i2].get("ImageWidth");
            if ((bVar9 == null || bVar10 == null) && (bVar = this.c[i2].get("JPEGInterchangeFormat")) != null) {
                e(aVar, bVar.f(this.f1395e), i2);
            }
        } else {
            int f2 = bVar5.f(this.f1395e);
            int f3 = bVar7.f(this.f1395e);
            int f4 = bVar8.f(this.f1395e);
            int f5 = bVar6.f(this.f1395e);
            if (f3 > f2 && f4 > f5) {
                b d2 = b.d(f3 - f2, this.f1395e);
                b d3 = b.d(f4 - f5, this.f1395e);
                this.c[i2].put("ImageLength", d2);
                this.c[i2].put("ImageWidth", d3);
            }
        }
    }
}
