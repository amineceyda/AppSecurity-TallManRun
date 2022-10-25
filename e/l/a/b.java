package e.l.a;

import e.k.h;
import e.k.m;
import e.k.n;
import e.k.s;
import e.k.u;
import e.k.v;
import e.k.x;
import e.k.y;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;

public class b extends a {
    public final h a;
    public final C0050b b;

    public static class a<D> extends m<D> {
        public void d() {
            throw null;
        }

        public void e() {
            throw null;
        }

        public void f(n<? super D> nVar) {
            super.f(nVar);
        }

        public void g(D d2) {
            super.g(d2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(0);
            sb.append(" : ");
            e.e.i.b.c((Object) null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: e.l.a.b$b  reason: collision with other inner class name */
    public static class C0050b extends s {

        /* renamed from: d  reason: collision with root package name */
        public static final u f1529d = new a();
        public e.d.h<a> c = new e.d.h<>();

        /* renamed from: e.l.a.b$b$a */
        public static class a implements u {
            public <T extends s> T a(Class<T> cls) {
                return new C0050b();
            }
        }

        public void a() {
            if (this.c.e() <= 0) {
                e.d.h<a> hVar = this.c;
                int i2 = hVar.f1262d;
                Object[] objArr = hVar.c;
                for (int i3 = 0; i3 < i2; i3++) {
                    objArr[i3] = null;
                }
                hVar.f1262d = 0;
                return;
            }
            Objects.requireNonNull(this.c.f(0));
            throw null;
        }
    }

    public b(h hVar, y yVar) {
        this.a = hVar;
        u uVar = C0050b.f1529d;
        Class cls = C0050b.class;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String w = g.a.a.a.a.w("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            s sVar = yVar.a.get(w);
            if (!cls.isInstance(sVar)) {
                sVar = uVar instanceof v ? ((v) uVar).c(w, cls) : ((C0050b.a) uVar).a(cls);
                s put = yVar.a.put(w, sVar);
                if (put != null) {
                    put.a();
                }
            } else if (uVar instanceof x) {
                ((x) uVar).b(sVar);
            }
            this.b = (C0050b) sVar;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C0050b bVar = this.b;
        if (bVar.c.e() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (bVar.c.e() > 0) {
                printWriter.print(str);
                printWriter.print("  #");
                e.d.h<a> hVar = bVar.c;
                Objects.requireNonNull(hVar);
                printWriter.print(hVar.b[0]);
                printWriter.print(": ");
                printWriter.println(bVar.c.f(0).toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println((Object) null);
                throw null;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        e.e.i.b.c(this.a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
