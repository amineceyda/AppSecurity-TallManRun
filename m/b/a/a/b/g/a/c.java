package m.b.a.a.b.g.a;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import m.b.a.a.b.g.b.a.b;

public class c implements e, d {
    public final b a;

    public c(OutputStream outputStream) throws IOException {
        b bVar = new b(outputStream);
        this.a = bVar;
        bVar.writeByte(1);
        bVar.writeChar(49344);
        bVar.writeChar(4103);
    }

    public void b(a aVar) {
        boolean z;
        boolean[] zArr = aVar.c;
        int length = zArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            } else if (zArr[i2]) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            try {
                this.a.writeByte(17);
                this.a.writeLong(aVar.a);
                this.a.writeUTF(aVar.b);
                b bVar = this.a;
                boolean[] zArr2 = aVar.c;
                Objects.requireNonNull(bVar);
                int length2 = zArr2.length;
                if ((length2 & -128) == 0) {
                    bVar.writeByte(length2);
                } else {
                    bVar.writeByte((length2 & 127) | 128);
                    bVar.a(length2 >>> 7);
                }
                int i3 = 0;
                int i4 = 0;
                for (boolean z2 : zArr2) {
                    if (z2) {
                        i4 |= 1 << i3;
                    }
                    i3++;
                    if (i3 == 8) {
                        bVar.writeByte(i4);
                        i3 = 0;
                        i4 = 0;
                    }
                }
                if (i3 > 0) {
                    bVar.writeByte(i4);
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public void c(f fVar) {
        try {
            this.a.writeByte(16);
            this.a.writeUTF(fVar.b());
            this.a.writeLong(fVar.d());
            this.a.writeLong(fVar.a());
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}
