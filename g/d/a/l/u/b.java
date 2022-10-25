package g.d.a.l.u;

import g.d.a.e;
import g.d.a.l.s.d;
import g.d.a.l.u.n;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class b<Data> implements n<byte[], Data> {
    public final C0090b<Data> a;

    public static class a implements o<byte[], ByteBuffer> {

        /* renamed from: g.d.a.l.u.b$a$a  reason: collision with other inner class name */
        public class C0089a implements C0090b<ByteBuffer> {
            public C0089a(a aVar) {
            }

            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            public Object b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        public n<byte[], ByteBuffer> b(r rVar) {
            return new b(new C0089a(this));
        }

        public void c() {
        }
    }

    /* renamed from: g.d.a.l.u.b$b  reason: collision with other inner class name */
    public interface C0090b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    public static class c<Data> implements g.d.a.l.s.d<Data> {
        public final byte[] b;
        public final C0090b<Data> c;

        public c(byte[] bArr, C0090b<Data> bVar) {
            this.b = bArr;
            this.c = bVar;
        }

        public Class<Data> a() {
            return this.c.a();
        }

        public void b() {
        }

        public void cancel() {
        }

        public g.d.a.l.a e() {
            return g.d.a.l.a.LOCAL;
        }

        public void f(e eVar, d.a<? super Data> aVar) {
            aVar.d(this.c.b(this.b));
        }
    }

    public static class d implements o<byte[], InputStream> {

        public class a implements C0090b<InputStream> {
            public a(d dVar) {
            }

            public Class<InputStream> a() {
                return InputStream.class;
            }

            public Object b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        public n<byte[], InputStream> b(r rVar) {
            return new b(new a(this));
        }

        public void c() {
        }
    }

    public b(C0090b<Data> bVar) {
        this.a = bVar;
    }

    public n.a a(Object obj, int i2, int i3, g.d.a.l.n nVar) {
        byte[] bArr = (byte[]) obj;
        return new n.a(new g.d.a.q.b(bArr), new c(bArr, this.a));
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj) {
        byte[] bArr = (byte[]) obj;
        return true;
    }
}
