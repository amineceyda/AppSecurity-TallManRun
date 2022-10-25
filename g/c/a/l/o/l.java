package g.c.a.l.o;

import i.o.c.h;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class l {
    public static final l a = null;
    public static final Logger b = LoggerFactory.getLogger("WalleUtils");

    public static final long a(FileChannel fileChannel, long j2) throws Exception {
        h.e(fileChannel, "fileChannel");
        fileChannel.position(j2 - ((long) 24));
        ByteBuffer allocate = ByteBuffer.allocate(24);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        fileChannel.read(allocate);
        return allocate.getLong(0);
    }

    public static final long b(FileChannel fileChannel) throws Exception {
        h.e(fileChannel, "fileChannel");
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        fileChannel.position(fileChannel.size() - ((long) 6));
        fileChannel.read(allocate);
        long j2 = (long) allocate.getInt(0);
        b.info(h.j("centralDirStartOffset: ", Long.valueOf(j2)));
        return j2;
    }

    public static final ByteBuffer c(FileChannel fileChannel) throws Exception {
        h.e(fileChannel, "fileChannel");
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        fileChannel.read(allocate);
        allocate.position(0);
        h.d(allocate, "lenByteBuffer");
        return allocate;
    }
}
