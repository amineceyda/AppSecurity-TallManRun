package g.d.a.l.u;

import g.d.a.e;
import g.d.a.l.s.d;
import g.d.a.l.u.n;

public class v<Model> implements n<Model, Model> {
    public static final v<?> a = new v<>();

    public static class a<Model> implements o<Model, Model> {
        public static final a<?> a = new a<>();

        public n<Model, Model> b(r rVar) {
            return v.a;
        }

        public void c() {
        }
    }

    public static class b<Model> implements d<Model> {
        public final Model b;

        public b(Model model) {
            this.b = model;
        }

        public Class<Model> a() {
            return this.b.getClass();
        }

        public void b() {
        }

        public void cancel() {
        }

        public g.d.a.l.a e() {
            return g.d.a.l.a.LOCAL;
        }

        public void f(e eVar, d.a<? super Model> aVar) {
            aVar.d(this.b);
        }
    }

    public n.a<Model> a(Model model, int i2, int i3, g.d.a.l.n nVar) {
        return new n.a<>(new g.d.a.q.b(model), new b(model));
    }

    public boolean b(Model model) {
        return true;
    }
}
