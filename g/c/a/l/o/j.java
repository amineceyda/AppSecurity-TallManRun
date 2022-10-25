package g.c.a.l.o;

import com.apkpure.aegon.signstuff.walle.IdNotFoundException;
import i.o.c.f;
import i.o.c.h;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class j {
    public static final j a = null;
    public static final Logger b = LoggerFactory.getLogger("WalleSyncManager");

    public j(f fVar) {
    }

    /* JADX INFO: finally extract failed */
    public final String a(File file, int i2) throws Exception {
        Throwable th;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            FileChannel channel = randomAccessFile.getChannel();
            l lVar = l.a;
            h.d(channel, "fileChannel");
            long b2 = l.b(channel);
            long a2 = l.a(channel, b2);
            long j2 = b2 - a2;
            channel.position(j2);
            int i3 = 0;
            long j3 = 0;
            while (true) {
                channel.position(j2 + j3 + ((long) (i3 * 8)));
                l lVar2 = l.a;
                ByteBuffer c = l.c(channel);
                long j4 = c.getLong();
                int i4 = c.getInt();
                Logger logger = b;
                logger.info("id:" + i4 + "\tidValueLen:" + j4);
                if (i4 == i2) {
                    long j5 = j4 - ((long) 4);
                    long position = channel.position();
                    byte[] bArr = new byte[((int) j5)];
                    c cVar = new c(file, position, j5);
                    try {
                        cVar.read(bArr);
                        Charset charset = StandardCharsets.UTF_8;
                        h.d(charset, "UTF_8");
                        String str = new String(bArr, charset);
                        g.c.b.b.f.s(cVar, (Throwable) null);
                        g.c.b.b.f.s(randomAccessFile, (Throwable) null);
                        return str;
                    } catch (Throwable th2) {
                        Throwable th3 = th2;
                        g.c.b.b.f.s(cVar, th);
                        throw th3;
                    }
                } else if (j3 < a2) {
                    j3 += j4;
                    i3++;
                } else {
                    throw new IdNotFoundException();
                }
            }
        } catch (Throwable th4) {
            Throwable th5 = th4;
            try {
                throw th5;
            } catch (Throwable th6) {
                Throwable th7 = th6;
                g.c.b.b.f.s(randomAccessFile, th5);
                throw th7;
            }
        }
    }
}
