package g.d.a.l.u;

import com.bumptech.glide.load.engine.GlideException;
import e.e.i.c;
import g.d.a.e;
import g.d.a.l.l;
import g.d.a.l.s.d;
import g.d.a.l.u.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.slf4j.helpers.MessageFormatter;

public class q<Model, Data> implements n<Model, Data> {
    public final List<n<Model, Data>> a;
    public final c<List<Throwable>> b;

    public static class a<Data> implements d<Data>, d.a<Data> {
        public final List<d<Data>> b;
        public final c<List<Throwable>> c;

        /* renamed from: d  reason: collision with root package name */
        public int f2554d;

        /* renamed from: e  reason: collision with root package name */
        public e f2555e;

        /* renamed from: f  reason: collision with root package name */
        public d.a<? super Data> f2556f;

        /* renamed from: g  reason: collision with root package name */
        public List<Throwable> f2557g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2558h;

        public a(List<d<Data>> list, c<List<Throwable>> cVar) {
            this.c = cVar;
            if (!list.isEmpty()) {
                this.b = list;
                this.f2554d = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        public Class<Data> a() {
            return this.b.get(0).a();
        }

        public void b() {
            List<Throwable> list = this.f2557g;
            if (list != null) {
                this.c.a(list);
            }
            this.f2557g = null;
            for (d<Data> b2 : this.b) {
                b2.b();
            }
        }

        public void c(Exception exc) {
            List<Throwable> list = this.f2557g;
            Objects.requireNonNull(list, "Argument must not be null");
            list.add(exc);
            g();
        }

        public void cancel() {
            this.f2558h = true;
            for (d<Data> cancel : this.b) {
                cancel.cancel();
            }
        }

        public void d(Data data) {
            if (data != null) {
                this.f2556f.d(data);
            } else {
                g();
            }
        }

        public g.d.a.l.a e() {
            return this.b.get(0).e();
        }

        public void f(e eVar, d.a<? super Data> aVar) {
            this.f2555e = eVar;
            this.f2556f = aVar;
            this.f2557g = this.c.b();
            this.b.get(this.f2554d).f(eVar, this);
            if (this.f2558h) {
                cancel();
            }
        }

        public final void g() {
            if (!this.f2558h) {
                if (this.f2554d < this.b.size() - 1) {
                    this.f2554d++;
                    f(this.f2555e, this.f2556f);
                    return;
                }
                Objects.requireNonNull(this.f2557g, "Argument must not be null");
                this.f2556f.c(new GlideException("Fetch failed", (List<Throwable>) new ArrayList(this.f2557g)));
            }
        }
    }

    public q(List<n<Model, Data>> list, c<List<Throwable>> cVar) {
        this.a = list;
        this.b = cVar;
    }

    public n.a<Data> a(Model model, int i2, int i3, g.d.a.l.n nVar) {
        n.a a2;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        l lVar = null;
        for (int i4 = 0; i4 < size; i4++) {
            n nVar2 = this.a.get(i4);
            if (nVar2.b(model) && (a2 = nVar2.a(model, i2, i3, nVar)) != null) {
                lVar = a2.a;
                arrayList.add(a2.c);
            }
        }
        if (arrayList.isEmpty() || lVar == null) {
            return null;
        }
        return new n.a<>(lVar, new a(arrayList, this.b));
    }

    public boolean b(Model model) {
        for (n<Model, Data> b2 : this.a) {
            if (b2.b(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("MultiModelLoader{modelLoaders=");
        i2.append(Arrays.toString(this.a.toArray()));
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
