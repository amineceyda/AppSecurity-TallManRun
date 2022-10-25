package l;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

public interface x extends Closeable, Flushable {
    void close() throws IOException;

    void flush() throws IOException;

    z i();

    void m(e eVar, long j2) throws IOException;
}
