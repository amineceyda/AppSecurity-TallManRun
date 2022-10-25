package g.e.b.n.j;

import com.google.firebase.encoders.EncodingException;
import g.e.b.n.c;
import g.e.b.n.g;
import java.io.IOException;

public class i implements g {
    public boolean a = false;
    public boolean b = false;
    public c c;

    /* renamed from: d  reason: collision with root package name */
    public final g f3724d;

    public i(g gVar) {
        this.f3724d = gVar;
    }

    public g d(String str) throws IOException {
        if (!this.a) {
            this.a = true;
            this.f3724d.d(this.c, str, this.b);
            return this;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    public g e(boolean z) throws IOException {
        if (!this.a) {
            this.a = true;
            this.f3724d.e(this.c, z ? 1 : 0, this.b);
            return this;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }
}
