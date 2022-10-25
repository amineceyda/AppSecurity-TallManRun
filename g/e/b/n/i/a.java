package g.e.b.n.i;

import com.google.firebase.encoders.EncodingException;
import g.e.b.n.d;
import g.e.b.n.e;
import g.e.b.n.i.e;

public final /* synthetic */ class a implements d {
    public static final /* synthetic */ a a = new a();

    public final void a(Object obj, Object obj2) {
        e eVar = (e) obj2;
        e.a aVar = e.f3711e;
        StringBuilder i2 = g.a.a.a.a.i("Couldn't find encoder for type ");
        i2.append(obj.getClass().getCanonicalName());
        throw new EncodingException(i2.toString());
    }
}
