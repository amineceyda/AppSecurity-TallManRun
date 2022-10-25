package j.a.t1;

import i.m.f;
import i.o.c.h;
import i.o.c.i;
import j.a.m1;
import java.util.Objects;

public final class p {
    public static final n a = new n("ZERO");

    public static final class a extends i implements i.o.b.p<Object, f.a, Object> {
        public static final a b = new a();

        public a() {
            super(2);
        }

        public Object d(Object obj, Object obj2) {
            f.a aVar = (f.a) obj2;
            if (!(aVar instanceof m1)) {
                return obj;
            }
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? aVar : Integer.valueOf(intValue + 1);
        }
    }

    public static final class b extends i implements i.o.b.p<m1<?>, f.a, m1<?>> {
        public static final b b = new b();

        public b() {
            super(2);
        }

        public Object d(Object obj, Object obj2) {
            m1 m1Var = (m1) obj;
            f.a aVar = (f.a) obj2;
            if (m1Var != null) {
                return m1Var;
            }
            if (!(aVar instanceof m1)) {
                aVar = null;
            }
            return (m1) aVar;
        }
    }

    public static final class c extends i implements i.o.b.p<s, f.a, s> {
        public static final c b = new c();

        public c() {
            super(2);
        }

        public Object d(Object obj, Object obj2) {
            s sVar = (s) obj;
            f.a aVar = (f.a) obj2;
            if (aVar instanceof m1) {
                f fVar = sVar.c;
                Object[] objArr = sVar.a;
                int i2 = sVar.b;
                sVar.b = i2 + 1;
                ((m1) aVar).j(fVar, objArr[i2]);
            }
            return sVar;
        }
    }

    public static final class d extends i implements i.o.b.p<s, f.a, s> {
        public static final d b = new d();

        public d() {
            super(2);
        }

        public Object d(Object obj, Object obj2) {
            s sVar = (s) obj;
            f.a aVar = (f.a) obj2;
            if (aVar instanceof m1) {
                Object t = ((m1) aVar).t(sVar.c);
                Object[] objArr = sVar.a;
                int i2 = sVar.b;
                sVar.b = i2 + 1;
                objArr[i2] = t;
            }
            return sVar;
        }
    }

    public static final void a(f fVar, Object obj) {
        if (obj != a) {
            if (obj instanceof s) {
                ((s) obj).b = 0;
                fVar.fold(obj, c.b);
                return;
            }
            Object fold = fVar.fold(null, b.b);
            Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((m1) fold).j(fVar, obj);
        }
    }

    public static final Object b(f fVar) {
        Object fold = fVar.fold(0, a.b);
        h.c(fold);
        return fold;
    }

    public static final Object c(f fVar, Object obj) {
        if (obj == null) {
            obj = b(fVar);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return fVar.fold(new s(fVar, ((Number) obj).intValue()), d.b);
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((m1) obj).t(fVar);
    }
}
