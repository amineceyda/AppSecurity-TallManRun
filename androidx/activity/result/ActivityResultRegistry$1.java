package androidx.activity.result;

import e.a.e.a;
import e.a.e.d;
import e.k.e;
import e.k.f;
import e.k.h;

public class ActivityResultRegistry$1 implements f {
    public final /* synthetic */ String b;
    public final /* synthetic */ a c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e.a.e.f.a f23d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d f24e;

    public ActivityResultRegistry$1(d dVar, String str, a aVar, e.a.e.f.a aVar2) {
        this.f24e = dVar;
        this.b = str;
        this.c = aVar;
        this.f23d = aVar2;
    }

    public void d(h hVar, e.a aVar) {
        if (e.a.ON_START.equals(aVar)) {
            this.f24e.f920f.put(this.b, new d.b(this.c, this.f23d));
            if (this.f24e.f921g.containsKey(this.b)) {
                Object obj = this.f24e.f921g.get(this.b);
                this.f24e.f921g.remove(this.b);
                this.c.a(obj);
            }
            ActivityResult activityResult = (ActivityResult) this.f24e.f922h.getParcelable(this.b);
            if (activityResult != null) {
                this.f24e.f922h.remove(this.b);
                this.c.a(this.f23d.c(activityResult.b(), activityResult.a()));
            }
        } else if (e.a.ON_STOP.equals(aVar)) {
            this.f24e.f920f.remove(this.b);
        } else if (e.a.ON_DESTROY.equals(aVar)) {
            this.f24e.e(this.b);
        }
    }
}
