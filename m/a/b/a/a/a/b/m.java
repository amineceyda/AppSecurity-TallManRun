package m.a.b.a.a.a.b;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class m implements e0 {
    public final char[] a;
    public final List<a> b;

    public static final class a implements Comparable<a> {
        public final char b;
        public final byte c;

        public a(byte b2, char c2) {
            this.c = b2;
            this.b = c2;
        }

        public int compareTo(Object obj) {
            return this.b - ((a) obj).b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c;
        }

        public int hashCode() {
            return this.b;
        }

        public String toString() {
            StringBuilder i2 = g.a.a.a.a.i("0x");
            i2.append(Integer.toHexString(this.b & 65535));
            i2.append("->0x");
            i2.append(Integer.toHexString(this.c & 255));
            return i2.toString();
        }
    }

    public m(char[] cArr) {
        char[] cArr2 = (char[]) cArr.clone();
        this.a = cArr2;
        ArrayList arrayList = new ArrayList(cArr2.length);
        byte b2 = Byte.MAX_VALUE;
        for (char aVar : cArr2) {
            b2 = (byte) (b2 + 1);
            arrayList.add(new a(b2, aVar));
        }
        Collections.sort(arrayList);
        this.b = Collections.unmodifiableList(arrayList);
    }

    public String a(byte[] bArr) throws IOException {
        char[] cArr = new char[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            cArr[i2] = b2 >= 0 ? (char) b2 : this.a[b2 + 128];
        }
        return new String(cArr);
    }
}
