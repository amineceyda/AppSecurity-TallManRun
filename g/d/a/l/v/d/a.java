package g.d.a.l.v.d;

import g.d.a.l.s.e;
import java.io.IOException;
import java.nio.ByteBuffer;

public class a implements e<ByteBuffer> {
    public final ByteBuffer a;

    /* renamed from: g.d.a.l.v.d.a$a  reason: collision with other inner class name */
    public static class C0095a implements e.a<ByteBuffer> {
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        public e b(Object obj) {
            return new a((ByteBuffer) obj);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    public Object a() throws IOException {
        this.a.position(0);
        return this.a;
    }

    public void b() {
    }
}
