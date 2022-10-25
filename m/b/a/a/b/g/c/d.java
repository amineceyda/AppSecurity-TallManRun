package m.b.a.a.b.g.c;

import java.io.IOException;
import java.io.InputStream;
import m.b.a.a.b.g.b.a.a;
import org.jacoco.agent.rt.internal_8ff85ea.core.data.IncompatibleExecDataVersionException;

public class d {
    public final a a;
    public boolean b = true;
    public c c;

    public d(InputStream inputStream) throws IOException {
        this.a = new a(inputStream);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void c() throws IOException {
        if (this.a.readChar() == 49344) {
            char readChar = this.a.readChar();
            if (readChar != 4103) {
                throw new IncompatibleExecDataVersionException(readChar);
            }
            return;
        }
        throw new IOException("Invalid execution data file.");
    }

    public boolean a() {
        boolean z;
        do {
            int read = this.a.read();
            z = false;
            if (read == -1) {
                return false;
            }
            byte b2 = (byte) read;
            if (!this.b || b2 == 1) {
                this.b = false;
                if (b2 != 32) {
                    if (b2 != 64) {
                        if (b2 == 1) {
                            c();
                        } else if (b2 == 16) {
                            e();
                            throw null;
                        } else if (b2 == 17) {
                            b();
                            throw null;
                        } else {
                            throw new IOException(String.format("Unknown block type %x.", new Object[]{Byte.valueOf(b2)}));
                        }
                    } else if (this.c != null) {
                        this.c.a(this.a.readBoolean(), this.a.readBoolean());
                    } else {
                        throw new IOException("No remote command visitor.");
                    }
                    z = true;
                    continue;
                }
            } else {
                throw new IOException("Invalid execution data file.");
            }
        } while (z);
        return true;
    }

    public final void b() {
        throw new IOException("No execution data visitor.");
    }

    public final void e() {
        throw new IOException("No session info visitor.");
    }
}
