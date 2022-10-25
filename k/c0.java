package k;

import java.io.Closeable;
import javax.annotation.Nullable;
import k.q;
import org.slf4j.helpers.MessageFormatter;

public final class c0 implements Closeable {
    public final x b;
    public final v c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4688d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4689e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final p f4690f;

    /* renamed from: g  reason: collision with root package name */
    public final q f4691g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final e0 f4692h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final c0 f4693i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final c0 f4694j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public final c0 f4695k;

    /* renamed from: l  reason: collision with root package name */
    public final long f4696l;

    /* renamed from: m  reason: collision with root package name */
    public final long f4697m;

    public static class a {
        @Nullable
        public x a;
        @Nullable
        public v b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public String f4698d;
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        public p f4699e;

        /* renamed from: f  reason: collision with root package name */
        public q.a f4700f;
        @Nullable

        /* renamed from: g  reason: collision with root package name */
        public e0 f4701g;
        @Nullable

        /* renamed from: h  reason: collision with root package name */
        public c0 f4702h;
        @Nullable

        /* renamed from: i  reason: collision with root package name */
        public c0 f4703i;
        @Nullable

        /* renamed from: j  reason: collision with root package name */
        public c0 f4704j;

        /* renamed from: k  reason: collision with root package name */
        public long f4705k;

        /* renamed from: l  reason: collision with root package name */
        public long f4706l;

        public a() {
            this.c = -1;
            this.f4700f = new q.a();
        }

        public a(c0 c0Var) {
            this.c = -1;
            this.a = c0Var.b;
            this.b = c0Var.c;
            this.c = c0Var.f4688d;
            this.f4698d = c0Var.f4689e;
            this.f4699e = c0Var.f4690f;
            this.f4700f = c0Var.f4691g.e();
            this.f4701g = c0Var.f4692h;
            this.f4702h = c0Var.f4693i;
            this.f4703i = c0Var.f4694j;
            this.f4704j = c0Var.f4695k;
            this.f4705k = c0Var.f4696l;
            this.f4706l = c0Var.f4697m;
        }

        public c0 a() {
            if (this.a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.c < 0) {
                StringBuilder i2 = g.a.a.a.a.i("code < 0: ");
                i2.append(this.c);
                throw new IllegalStateException(i2.toString());
            } else if (this.f4698d != null) {
                return new c0(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        public a b(@Nullable c0 c0Var) {
            if (c0Var != null) {
                c("cacheResponse", c0Var);
            }
            this.f4703i = c0Var;
            return this;
        }

        public final void c(String str, c0 c0Var) {
            if (c0Var.f4692h != null) {
                throw new IllegalArgumentException(g.a.a.a.a.w(str, ".body != null"));
            } else if (c0Var.f4693i != null) {
                throw new IllegalArgumentException(g.a.a.a.a.w(str, ".networkResponse != null"));
            } else if (c0Var.f4694j != null) {
                throw new IllegalArgumentException(g.a.a.a.a.w(str, ".cacheResponse != null"));
            } else if (c0Var.f4695k != null) {
                throw new IllegalArgumentException(g.a.a.a.a.w(str, ".priorResponse != null"));
            }
        }

        public a d(q qVar) {
            this.f4700f = qVar.e();
            return this;
        }
    }

    public c0(a aVar) {
        this.b = aVar.a;
        this.c = aVar.b;
        this.f4688d = aVar.c;
        this.f4689e = aVar.f4698d;
        this.f4690f = aVar.f4699e;
        this.f4691g = new q(aVar.f4700f);
        this.f4692h = aVar.f4701g;
        this.f4693i = aVar.f4702h;
        this.f4694j = aVar.f4703i;
        this.f4695k = aVar.f4704j;
        this.f4696l = aVar.f4705k;
        this.f4697m = aVar.f4706l;
    }

    @Nullable
    public e0 a() {
        return this.f4692h;
    }

    public boolean b() {
        int i2 = this.f4688d;
        return i2 >= 200 && i2 < 300;
    }

    public void close() {
        e0 e0Var = this.f4692h;
        if (e0Var != null) {
            e0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("Response{protocol=");
        i2.append(this.c);
        i2.append(", code=");
        i2.append(this.f4688d);
        i2.append(", message=");
        i2.append(this.f4689e);
        i2.append(", url=");
        i2.append(this.b.a);
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
