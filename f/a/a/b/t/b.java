package f.a.a.b.t;

import f.a.a.b.c;
import f.a.a.b.d;
import g.a.a.a.a;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class b extends OutputStream {
    public int b = 0;
    public int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public d f1791d;

    /* renamed from: e  reason: collision with root package name */
    public a f1792e;

    /* renamed from: f  reason: collision with root package name */
    public OutputStream f1793f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1794g = true;

    /* renamed from: h  reason: collision with root package name */
    public File f1795h;

    /* renamed from: i  reason: collision with root package name */
    public FileOutputStream f1796i;

    public b(File file, boolean z, long j2) throws FileNotFoundException {
        this.f1795h = file;
        this.f1796i = new FileOutputStream(file, z);
        this.f1793f = new BufferedOutputStream(this.f1796i, (int) j2);
        this.f1794g = true;
    }

    public void a(f.a.a.b.x.d dVar) {
        d dVar2 = this.f1791d;
        if (dVar2 == null) {
            int i2 = this.b;
            this.b = i2 + 1;
            if (i2 == 0) {
                PrintStream printStream = System.out;
                printStream.println("LOGBACK: No context given for " + this);
                return;
            }
            return;
        }
        c cVar = dVar2.f1685d;
        if (cVar != null) {
            cVar.a(dVar);
        }
    }

    public void b(f.a.a.b.x.d dVar) {
        int i2 = this.c + 1;
        this.c = i2;
        if (i2 < 8) {
            a(dVar);
        }
        if (this.c == 8) {
            a(dVar);
            StringBuilder i3 = a.i("Will supress future messages regarding ");
            i3.append(f());
            a(new f.a.a.b.x.b(i3.toString(), this));
        }
    }

    public void close() {
        OutputStream outputStream = this.f1793f;
        if (outputStream != null) {
            outputStream.close();
        }
    }

    public void d() {
        try {
            close();
        } catch (IOException unused) {
        }
        StringBuilder i2 = a.i("Attempting to recover from IO failure on ");
        i2.append(f());
        b(new f.a.a.b.x.b(i2.toString(), this));
        try {
            this.f1796i = new FileOutputStream(this.f1795h, true);
            this.f1793f = new BufferedOutputStream(this.f1796i);
            this.f1794g = true;
        } catch (IOException e2) {
            StringBuilder i3 = a.i("Failed to open ");
            i3.append(f());
            b(new f.a.a.b.x.a(i3.toString(), this, e2));
        }
    }

    public String f() {
        StringBuilder i2 = a.i("file [");
        i2.append(this.f1795h);
        i2.append("]");
        return i2.toString();
    }

    public void flush() {
        OutputStream outputStream = this.f1793f;
        if (outputStream != null) {
            try {
                outputStream.flush();
                k();
            } catch (IOException e2) {
                j(e2);
            }
        }
    }

    public final boolean g() {
        return this.f1792e != null && !this.f1794g;
    }

    public void j(IOException iOException) {
        StringBuilder i2 = a.i("IO failure while writing to ");
        i2.append(f());
        b(new f.a.a.b.x.a(i2.toString(), this, iOException));
        this.f1794g = false;
        if (this.f1792e == null) {
            this.f1792e = new a();
        }
    }

    public final void k() {
        if (this.f1792e != null) {
            this.f1792e = null;
            this.c = 0;
            StringBuilder i2 = a.i("Recovered from IO failure on ");
            i2.append(f());
            a(new f.a.a.b.x.b(i2.toString(), this));
        }
    }

    public String toString() {
        StringBuilder i2 = a.i("c.q.l.c.recovery.ResilientFileOutputStream@");
        i2.append(System.identityHashCode(this));
        return i2.toString();
    }

    public void write(int i2) {
        if (!g()) {
            try {
                this.f1793f.write(i2);
                k();
            } catch (IOException e2) {
                j(e2);
            }
        } else if (!this.f1792e.a()) {
            d();
        }
    }

    public void write(byte[] bArr, int i2, int i3) {
        if (!g()) {
            try {
                this.f1793f.write(bArr, i2, i3);
                k();
            } catch (IOException e2) {
                j(e2);
            }
        } else if (!this.f1792e.a()) {
            d();
        }
    }
}
