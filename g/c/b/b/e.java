package g.c.b.b;

import android.content.Context;
import com.tencent.raft.raftframework.remote.RemoteProxyUtil;
import g.c.b.b.i.c;
import g.c.b.b.j.b;
import i.j;
import i.o.c.h;
import i.o.c.i;
import java.util.List;
import java.util.Objects;
import org.slf4j.Logger;

public final class e implements g.c.b.b.i.a {
    public final /* synthetic */ g.c.b.b.i.a a;
    public final /* synthetic */ c b;
    public final /* synthetic */ Context c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f2244d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f2245e;

    public static final class a extends i implements i.o.b.a<j> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ boolean $haveInstallUi;
        public final /* synthetic */ b $options;
        public final /* synthetic */ List<String> $results;
        public final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, Context context, List<String> list, b bVar, boolean z) {
            super(0);
            this.this$0 = cVar;
            this.$context = context;
            this.$results = list;
            this.$options = bVar;
            this.$haveInstallUi = z;
        }

        public Object a() {
            c.a(this.this$0, this.$context, this.$results, this.$options, this.$haveInstallUi);
            return j.a;
        }
    }

    public e(g.c.b.b.i.a aVar, c cVar, Context context, b bVar, boolean z) {
        this.a = aVar;
        this.b = cVar;
        this.c = context;
        this.f2244d = bVar;
        this.f2245e = z;
    }

    public void a(String str) {
        h.e(this, "this");
        h.e(str, RemoteProxyUtil.KEY_RESULT);
    }

    public void b(List<String> list) {
        c cVar;
        h.e(list, "results");
        c.n.info("installer, seekableByteChannel onComplete");
        this.a.b(list);
        b bVar = this.b.f2228e;
        c cVar2 = null;
        if (bVar == null) {
            cVar = null;
        } else {
            cVar = bVar.f2285j;
        }
        if (cVar instanceof g.c.b.b.i.b) {
            if (bVar != null) {
                cVar2 = bVar.f2285j;
            }
            Objects.requireNonNull(cVar2, "null cannot be cast to non-null type com.apkpure.components.installer.inter.ForegroundInstallListener");
            if (!((g.c.b.b.i.b) cVar2).d()) {
                c cVar3 = this.b;
                cVar3.f2235l = new a(cVar3, this.c, list, this.f2244d, this.f2245e);
                return;
            }
        }
        c.a(this.b, this.c, list, this.f2244d, this.f2245e);
    }

    public boolean c(float f2, int i2) {
        this.a.c(f2, i2);
        return false;
    }

    public void d(int i2, String str) {
        h.e(str, "msg");
        Logger logger = c.n;
        logger.info("installer, seekableByteChannel error: " + i2 + ", " + str);
        this.a.d(i2, str);
    }
}
