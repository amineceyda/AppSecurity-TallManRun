package g.d.a.l.v.g;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import e.e.d.l.a;
import g.d.a.l.n;
import g.d.a.l.p;
import g.d.a.l.t.b0.b;
import g.d.a.l.t.v;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public class j implements p<InputStream, c> {
    public final List<ImageHeaderParser> a;
    public final p<ByteBuffer, c> b;
    public final b c;

    public j(List<ImageHeaderParser> list, p<ByteBuffer, c> pVar, b bVar) {
        this.a = list;
        this.b = pVar;
        this.c = bVar;
    }

    public v a(Object obj, int i2, int i3, n nVar) throws IOException {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e2);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(bArr), i2, i3, nVar);
    }

    public boolean b(Object obj, n nVar) throws IOException {
        return !((Boolean) nVar.c(i.b)).booleanValue() && a.M(this.a, (InputStream) obj, this.c) == ImageHeaderParser.ImageType.GIF;
    }
}
