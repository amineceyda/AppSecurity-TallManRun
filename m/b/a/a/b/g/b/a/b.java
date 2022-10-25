package m.b.a.a.b.g.b.a;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class b extends DataOutputStream {
    public b(OutputStream outputStream) {
        super(outputStream);
    }

    public void a(int i2) throws IOException {
        if ((i2 & -128) == 0) {
            writeByte(i2);
            return;
        }
        writeByte((i2 & 127) | 128);
        a(i2 >>> 7);
    }
}
