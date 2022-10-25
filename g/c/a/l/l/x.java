package g.c.a.l.l;

import com.tencent.raft.raftframework.remote.RemoteProxyUtil;
import g.c.b.b.f;
import i.j;
import i.m.d;
import i.m.j.a.e;
import i.m.j.a.h;
import i.o.b.p;
import j.a.y;
import java.util.List;

public final class x implements g.c.b.b.i.a {
    public final /* synthetic */ b0 a;

    @e(c = "com.apkpure.aegon.signstuff.apk.ApkManagerSeekableManager$getExpansionListener$1$onError$1", f = "ApkManagerSeekableManager.kt", l = {}, m = "invokeSuspend")
    public static final class a extends h implements p<j.a.x, d<? super j>, Object> {
        public int label;
        public final /* synthetic */ b0 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b0 b0Var, d<? super a> dVar) {
            super(2, dVar);
            this.this$0 = b0Var;
        }

        public final d<j> a(Object obj, d<?> dVar) {
            return new a(this.this$0, dVar);
        }

        public Object d(Object obj, Object obj2) {
            j.a.x xVar = (j.a.x) obj;
            a aVar = new a(this.this$0, (d) obj2);
            j jVar = j.a;
            aVar.l(jVar);
            return jVar;
        }

        public final Object l(Object obj) {
            if (this.label == 0) {
                f.q0(obj);
                b0 b0Var = this.this$0;
                o oVar = b0Var.f2063f;
                oVar.c = 62;
                oVar.f2071e = 2010;
                e0 e0Var = b0Var.f2064g;
                if (e0Var != null) {
                    e0Var.a(oVar);
                }
                return j.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @e(c = "com.apkpure.aegon.signstuff.apk.ApkManagerSeekableManager$getExpansionListener$1$onProgress$1", f = "ApkManagerSeekableManager.kt", l = {}, m = "invokeSuspend")
    public static final class b extends h implements p<j.a.x, d<? super j>, Object> {
        public final /* synthetic */ float $percent;
        public int label;
        public final /* synthetic */ b0 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(b0 b0Var, float f2, d<? super b> dVar) {
            super(2, dVar);
            this.this$0 = b0Var;
            this.$percent = f2;
        }

        public final d<j> a(Object obj, d<?> dVar) {
            return new b(this.this$0, this.$percent, dVar);
        }

        public Object d(Object obj, Object obj2) {
            j.a.x xVar = (j.a.x) obj;
            b bVar = new b(this.this$0, this.$percent, (d) obj2);
            j jVar = j.a;
            bVar.l(jVar);
            return jVar;
        }

        public final Object l(Object obj) {
            if (this.label == 0) {
                f.q0(obj);
                o oVar = this.this$0.f2063f;
                oVar.c = 21;
                double d2 = (double) this.$percent;
                double d3 = (double) 100;
                Double.isNaN(d2);
                Double.isNaN(d3);
                double d4 = d2 * d3;
                oVar.a = d4;
                b0.p.debug(i.o.c.h.j("xapk ExpansionListener percent:", new Double(d4)));
                b0 b0Var = this.this$0;
                o oVar2 = b0Var.f2063f;
                double d5 = oVar2.a;
                double d6 = (double) b0Var.o;
                Double.isNaN(d6);
                if (d5 - d6 > 1.0d) {
                    e0 e0Var = b0Var.f2064g;
                    if (e0Var != null) {
                        e0Var.a(oVar2);
                    }
                    b0 b0Var2 = this.this$0;
                    b0Var2.o = (int) b0Var2.f2063f.a;
                }
                return j.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public x(b0 b0Var) {
        this.a = b0Var;
    }

    public void a(String str) {
        i.o.c.h.e(str, RemoteProxyUtil.KEY_RESULT);
        b0.p.info(i.o.c.h.j("ExpansionListener onComplete:", str));
    }

    public void b(List<String> list) {
        i.o.c.h.e(list, "results");
        b0.p.info(i.o.c.h.j("ExpansionListener onComplete:", Integer.valueOf(list.size())));
    }

    public boolean c(float f2, int i2) {
        b0 b0Var = this.a;
        f.S(b0Var.c, (i.m.f) null, (y) null, new b(b0Var, f2, (d<? super b>) null), 3, (Object) null);
        return true;
    }

    public void d(int i2, String str) {
        i.o.c.h.e(str, "msg");
        b0.p.info(i.o.c.h.j("ExpansionListener onError", str));
        b0 b0Var = this.a;
        f.S(b0Var.c, (i.m.f) null, (y) null, new a(b0Var, (d<? super a>) null), 3, (Object) null);
    }
}
