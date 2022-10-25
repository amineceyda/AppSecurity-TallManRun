package l;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

public interface f extends x, WritableByteChannel {
    f C(int i2) throws IOException;

    f K() throws IOException;

    f W(String str) throws IOException;

    void flush() throws IOException;

    e h();

    f r(long j2) throws IOException;

    f write(byte[] bArr) throws IOException;

    f writeByte(int i2) throws IOException;

    f writeInt(int i2) throws IOException;

    f writeShort(int i2) throws IOException;
}
