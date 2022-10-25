package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

public final class q {
    public static final Logger a = Logger.getLogger(q.class.getName());

    public class a implements y {
        public final /* synthetic */ z b;
        public final /* synthetic */ InputStream c;

        public a(z zVar, InputStream inputStream) {
            this.b = zVar;
            this.c = inputStream;
        }

        public long M(e eVar, long j2) throws IOException {
            if (j2 < 0) {
                throw new IllegalArgumentException(g.a.a.a.a.s("byteCount < 0: ", j2));
            } else if (j2 == 0) {
                return 0;
            } else {
                try {
                    this.b.f();
                    u s = eVar.s(1);
                    int read = this.c.read(s.a, s.c, (int) Math.min(j2, (long) (8192 - s.c)));
                    if (read == -1) {
                        return -1;
                    }
                    s.c += read;
                    long j3 = (long) read;
                    eVar.c += j3;
                    return j3;
                } catch (AssertionError e2) {
                    if (q.a(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
            }
        }

        public void close() throws IOException {
            this.c.close();
        }

        public z i() {
            return this.b;
        }

        public String toString() {
            StringBuilder i2 = g.a.a.a.a.i("source(");
            i2.append(this.c);
            i2.append(")");
            return i2.toString();
        }
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static x b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            r rVar = new r(socket);
            OutputStream outputStream = socket.getOutputStream();
            if (outputStream != null) {
                return new a(rVar, new p(rVar, outputStream));
            }
            throw new IllegalArgumentException("out == null");
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    public static y c(InputStream inputStream, z zVar) {
        if (inputStream != null) {
            return new a(zVar, inputStream);
        }
        throw new IllegalArgumentException("in == null");
    }

    public static y d(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            r rVar = new r(socket);
            return new b(rVar, c(socket.getInputStream(), rVar));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }
}
