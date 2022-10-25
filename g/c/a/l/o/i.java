package g.c.a.l.o;

import i.o.c.h;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;

public final class i implements SeekableByteChannel {
    public final FileChannel b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f2081d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2082e = true;

    /* renamed from: f  reason: collision with root package name */
    public long f2083f;

    public i(FileChannel fileChannel, long j2, long j3) {
        h.e(fileChannel, "fileChannel");
        this.b = fileChannel;
        this.c = j2;
        this.f2081d = j3;
    }

    public void close() {
        this.b.close();
    }

    public boolean isOpen() {
        return this.f2082e;
    }

    public long position() {
        return this.f2083f;
    }

    public SeekableByteChannel position(long j2) {
        if (this.f2082e) {
            this.f2083f = j2;
            return this;
        }
        throw new ClosedChannelException();
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        int i2;
        h.e(byteBuffer, "dst");
        if (this.f2082e) {
            long j2 = this.f2083f;
            if (j2 >= this.f2081d) {
                return -1;
            }
            this.b.position(this.c + j2);
            if (((long) byteBuffer.remaining()) <= this.f2081d - this.f2083f) {
                i2 = this.b.read(byteBuffer);
            } else {
                int limit = byteBuffer.limit();
                byteBuffer.limit(byteBuffer.position() + ((int) (this.f2081d - this.f2083f)));
                int read = this.b.read(byteBuffer);
                byteBuffer.limit(limit);
                i2 = read;
            }
            if (i2 == -1) {
                return -1;
            }
            this.f2083f += (long) i2;
            return i2;
        }
        throw new ClosedChannelException();
    }

    public long size() {
        return this.f2081d;
    }

    public SeekableByteChannel truncate(long j2) {
        throw new IOException("Unsupported truncate operation");
    }

    public int write(ByteBuffer byteBuffer) {
        throw new IOException("Unsupported write operation");
    }
}
