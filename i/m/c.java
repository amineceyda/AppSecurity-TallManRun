package i.m;

import i.j;
import i.m.f;
import i.o.b.p;
import i.o.c.h;
import i.o.c.i;
import i.o.c.n;
import java.io.Serializable;
import java.util.Objects;

public final class c implements f, Serializable {
    private final f.a element;
    private final f left;

    public static final class a implements Serializable {
        private static final long serialVersionUID = 0;
        private final f[] elements;

        public a(f[] fVarArr) {
            h.e(fVarArr, "elements");
            this.elements = fVarArr;
        }

        private final Object readResolve() {
            f[] fVarArr = this.elements;
            f fVar = h.b;
            for (f plus : fVarArr) {
                fVar = fVar.plus(plus);
            }
            return fVar;
        }
    }

    public static final class b extends i implements p<String, f.a, String> {
        public static final b b = new b();

        public b() {
            super(2);
        }

        public Object d(Object obj, Object obj2) {
            String str = (String) obj;
            f.a aVar = (f.a) obj2;
            h.e(str, "acc");
            h.e(aVar, "element");
            if (str.length() == 0) {
                return aVar.toString();
            }
            return str + ", " + aVar;
        }
    }

    /* renamed from: i.m.c$c  reason: collision with other inner class name */
    public static final class C0190c extends i implements p<j, f.a, j> {
        public final /* synthetic */ f[] $elements;
        public final /* synthetic */ n $index;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0190c(f[] fVarArr, n nVar) {
            super(2);
            this.$elements = fVarArr;
            this.$index = nVar;
        }

        public Object d(Object obj, Object obj2) {
            f.a aVar = (f.a) obj2;
            h.e((j) obj, "<anonymous parameter 0>");
            h.e(aVar, "element");
            f[] fVarArr = this.$elements;
            n nVar = this.$index;
            int i2 = nVar.element;
            nVar.element = i2 + 1;
            fVarArr[i2] = aVar;
            return j.a;
        }
    }

    public c(f fVar, f.a aVar) {
        h.e(fVar, "left");
        h.e(aVar, "element");
        this.left = fVar;
        this.element = aVar;
    }

    private final Object writeReplace() {
        int c = c();
        f[] fVarArr = new f[c];
        n nVar = new n();
        boolean z = false;
        nVar.element = 0;
        fold(j.a, new C0190c(fVarArr, nVar));
        if (nVar.element == c) {
            z = true;
        }
        if (z) {
            return new a(fVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int c() {
        int i2 = 2;
        c cVar = this;
        while (true) {
            f fVar = cVar.left;
            if (!(fVar instanceof c)) {
                fVar = null;
            }
            cVar = (c) fVar;
            if (cVar == null) {
                return i2;
            }
            i2++;
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.c() != c()) {
                return false;
            }
            Objects.requireNonNull(cVar);
            c cVar2 = this;
            while (true) {
                f.a aVar = cVar2.element;
                if (h.a(cVar.get(aVar.getKey()), aVar)) {
                    f fVar = cVar2.left;
                    if (!(fVar instanceof c)) {
                        Objects.requireNonNull(fVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        f.a aVar2 = (f.a) fVar;
                        z = h.a(cVar.get(aVar2.getKey()), aVar2);
                        break;
                    }
                    cVar2 = (c) fVar;
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r, p<? super R, ? super f.a, ? extends R> pVar) {
        h.e(pVar, "operation");
        return pVar.d(this.left.fold(r, pVar), this.element);
    }

    public <E extends f.a> E get(f.b<E> bVar) {
        h.e(bVar, "key");
        c cVar = this;
        while (true) {
            E e2 = cVar.element.get(bVar);
            if (e2 != null) {
                return e2;
            }
            f fVar = cVar.left;
            if (!(fVar instanceof c)) {
                return fVar.get(bVar);
            }
            cVar = (c) fVar;
        }
    }

    public int hashCode() {
        return this.element.hashCode() + this.left.hashCode();
    }

    public f minusKey(f.b<?> bVar) {
        h.e(bVar, "key");
        if (this.element.get(bVar) != null) {
            return this.left;
        }
        f minusKey = this.left.minusKey(bVar);
        return minusKey == this.left ? this : minusKey == h.b ? this.element : new c(minusKey, this.element);
    }

    public f plus(f fVar) {
        h.e(fVar, "context");
        h.e(fVar, "context");
        return fVar == h.b ? this : (f) fVar.fold(this, g.b);
    }

    public String toString() {
        return g.a.a.a.a.f(g.a.a.a.a.i("["), (String) fold("", b.b), "]");
    }
}
