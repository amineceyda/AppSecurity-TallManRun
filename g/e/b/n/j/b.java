package g.e.b.n.j;

import com.google.firebase.encoders.EncodingException;
import g.a.a.a.a;
import g.e.b.n.d;
import g.e.b.n.e;

public final /* synthetic */ class b implements d {
    public static final /* synthetic */ b a = new b();

    public final void a(Object obj, Object obj2) {
        e eVar = (e) obj2;
        StringBuilder i2 = a.i("Couldn't find encoder for type ");
        i2.append(obj.getClass().getCanonicalName());
        throw new EncodingException(i2.toString());
    }
}
