package g.e.c.t.z;

import com.google.gson.Gson;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper;
import g.e.c.q;
import g.e.c.u.a;
import java.io.IOException;
import java.lang.reflect.Field;

public class c extends ReflectiveTypeAdapterFactory.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Field f3784d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f3785e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ q f3786f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Gson f3787g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a f3788h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f3789i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory, String str, boolean z, boolean z2, Field field, boolean z3, q qVar, Gson gson, a aVar, boolean z4) {
        super(str, z, z2);
        this.f3784d = field;
        this.f3785e = z3;
        this.f3786f = qVar;
        this.f3787g = gson;
        this.f3788h = aVar;
        this.f3789i = z4;
    }

    public void a(g.e.c.v.a aVar, Object obj) throws IOException, IllegalAccessException {
        Object a = this.f3786f.a(aVar);
        if (a != null || !this.f3789i) {
            this.f3784d.set(obj, a);
        }
    }

    public void b(g.e.c.v.c cVar, Object obj) throws IOException, IllegalAccessException {
        q qVar;
        Object obj2 = this.f3784d.get(obj);
        if (this.f3785e) {
            qVar = this.f3786f;
        } else {
            qVar = new TypeAdapterRuntimeTypeWrapper(this.f3787g, this.f3786f, this.f3788h.b);
        }
        qVar.c(cVar, obj2);
    }

    public boolean c(Object obj) throws IOException, IllegalAccessException {
        return this.b && this.f3784d.get(obj) != obj;
    }
}
