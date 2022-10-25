package l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

public interface g extends y, ReadableByteChannel {
    int A() throws IOException;

    boolean D() throws IOException;

    byte[] E(long j2) throws IOException;

    short J() throws IOException;

    String N(long j2) throws IOException;

    void U(long j2) throws IOException;

    long Z(byte b) throws IOException;

    boolean a0(long j2, h hVar) throws IOException;

    long b0() throws IOException;

    void c(long j2) throws IOException;

    String c0(Charset charset) throws IOException;

    InputStream d0();

    h e(long j2) throws IOException;

    e h();

    byte readByte() throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    String y() throws IOException;

    byte[] z() throws IOException;
}
