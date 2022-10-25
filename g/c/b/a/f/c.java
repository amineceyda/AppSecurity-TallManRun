package g.c.b.a.f;

import com.jakewharton.disklrucache.DiskLruCache;
import g.a.a.a.a;
import g.c.b.a.d;
import i.o.c.h;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import k.d0;
import k.e0;
import k.t;
import l.e;
import l.g;

public final class c implements Serializable {
    private int code;
    private String command;
    private String contentType;
    private Object data;
    private Map<String, String> headers;
    private String message;
    private String requestMethod;
    private String respContentType;
    private String scheme;
    private String url;

    public c() {
    }

    /* JADX INFO: finally extract failed */
    public c(d<Object> dVar) {
        String str;
        h.e(dVar, "response");
        g.c.b.a.c cVar = dVar.a;
        String str2 = cVar.b;
        this.scheme = str2;
        this.url = cVar.f2197f;
        this.requestMethod = cVar.f2199h;
        this.contentType = cVar.f2198g;
        this.command = cVar.f2196e;
        this.headers = cVar.c;
        this.code = dVar.c;
        this.message = dVar.f2205d;
        if (h.a(str2, "https://")) {
            T t = dVar.b;
            if (t instanceof e0) {
                t b = ((e0) t).b();
                if (b == null) {
                    str = null;
                } else {
                    str = b.a;
                }
                this.respContentType = str;
                e0 e0Var = (e0) dVar.b;
                long a = e0Var.a();
                if (a <= 2147483647L) {
                    g d2 = e0Var.d();
                    try {
                        byte[] z = d2.z();
                        k.h0.c.f(d2);
                        if (a == -1 || a == ((long) z.length)) {
                            this.data = z;
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Content-Length (");
                        sb.append(a);
                        sb.append(") and stream length (");
                        throw new IOException(a.e(sb, z.length, ") disagree"));
                    } catch (Throwable th) {
                        k.h0.c.f(d2);
                        throw th;
                    }
                } else {
                    throw new IOException(a.s("Cannot buffer entire body for content length: ", a));
                }
            }
        }
    }

    public final d<Object> a(g.c.b.a.c cVar) throws IllegalArgumentException {
        Object obj;
        h.e(cVar, "request");
        if (!h.a(this.scheme, "https://") || !(this.data instanceof byte[])) {
            obj = this.data;
        } else {
            t a = t.a(this.respContentType);
            Object obj2 = this.data;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.ByteArray");
            byte[] bArr = (byte[]) obj2;
            e eVar = new e();
            eVar.u(bArr);
            obj = new d0(a, (long) bArr.length, eVar);
        }
        if (!(h.a(this.url, cVar.f2197f) && h.a(this.requestMethod, cVar.f2199h))) {
            return null;
        }
        String str = this.message;
        if (str == null) {
            str = "success.";
        }
        return new d<>(cVar, obj, 0, str);
    }

    public final void b(DiskLruCache.Editor editor) throws IOException {
        h.e(editor, "editor");
        OutputStream newOutputStream = editor.newOutputStream(0);
        h.d(newOutputStream, "editor.newOutputStream(0)");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(newOutputStream);
        objectOutputStream.writeObject(this);
        objectOutputStream.close();
        editor.commit();
    }
}
