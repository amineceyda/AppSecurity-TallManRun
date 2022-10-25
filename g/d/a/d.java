package g.d.a;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.Registry;
import g.d.a.b;
import g.d.a.l.t.b0.b;
import g.d.a.l.t.l;
import g.d.a.p.e;
import g.d.a.p.i.f;
import java.util.List;
import java.util.Map;

public class d extends ContextWrapper {

    /* renamed from: k  reason: collision with root package name */
    public static final h<?, ?> f2333k = new a();
    public final b a;
    public final Registry b;
    public final f c;

    /* renamed from: d  reason: collision with root package name */
    public final b.a f2334d;

    /* renamed from: e  reason: collision with root package name */
    public final List<g.d.a.p.d<Object>> f2335e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Class<?>, h<?, ?>> f2336f;

    /* renamed from: g  reason: collision with root package name */
    public final l f2337g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2338h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2339i;

    /* renamed from: j  reason: collision with root package name */
    public e f2340j;

    public d(Context context, g.d.a.l.t.b0.b bVar, Registry registry, f fVar, b.a aVar, Map<Class<?>, h<?, ?>> map, List<g.d.a.p.d<Object>> list, l lVar, boolean z, int i2) {
        super(context.getApplicationContext());
        this.a = bVar;
        this.b = registry;
        this.c = fVar;
        this.f2334d = aVar;
        this.f2335e = list;
        this.f2336f = map;
        this.f2337g = lVar;
        this.f2338h = z;
        this.f2339i = i2;
    }
}
