package m.a.b.a.a.c;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

public final class c {
    public static void a(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        int i2 = 0;
        while (i2 < remaining) {
            int read = readableByteChannel.read(byteBuffer);
            if (read <= 0) {
                break;
            }
            i2 += read;
        }
        if (i2 < remaining) {
            throw new EOFException();
        }
    }
}
