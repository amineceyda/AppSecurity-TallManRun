package g.d.a.r;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

public class d extends InputStream {

    /* renamed from: d  reason: collision with root package name */
    public static final Queue<d> f2679d = new ArrayDeque(0);
    public InputStream b;
    public IOException c;

    static {
        char[] cArr = j.a;
    }

    public void a() {
        this.c = null;
        this.b = null;
        Queue<d> queue = f2679d;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public int available() throws IOException {
        return this.b.available();
    }

    public void close() throws IOException {
        this.b.close();
    }

    public void mark(int i2) {
        this.b.mark(i2);
    }

    public boolean markSupported() {
        return this.b.markSupported();
    }

    public int read() {
        try {
            return this.b.read();
        } catch (IOException e2) {
            this.c = e2;
            return -1;
        }
    }

    public int read(byte[] bArr) {
        try {
            return this.b.read(bArr);
        } catch (IOException e2) {
            this.c = e2;
            return -1;
        }
    }

    public int read(byte[] bArr, int i2, int i3) {
        try {
            return this.b.read(bArr, i2, i3);
        } catch (IOException e2) {
            this.c = e2;
            return -1;
        }
    }

    public synchronized void reset() throws IOException {
        this.b.reset();
    }

    public long skip(long j2) {
        try {
            return this.b.skip(j2);
        } catch (IOException e2) {
            this.c = e2;
            return 0;
        }
    }
}
