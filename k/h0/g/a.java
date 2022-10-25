package k.h0.g;

import com.tencent.raft.measure.report.ATTAReporter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;
import k.b0;
import k.c0;
import k.h0.c;
import k.j;
import k.k;
import k.q;
import k.s;
import k.t;
import k.x;
import l.n;

public final class a implements s {
    public final k a;

    public a(k kVar) {
        this.a = kVar;
    }

    public c0 a(s.a aVar) throws IOException {
        boolean z;
        f fVar = (f) aVar;
        x xVar = fVar.f4764f;
        Objects.requireNonNull(xVar);
        x.a aVar2 = new x.a(xVar);
        b0 b0Var = xVar.f4956d;
        if (b0Var != null) {
            t b = b0Var.b();
            if (b != null) {
                aVar2.c(ATTAReporter.KEY_CONTENT_TYPE, b.a);
            }
            long a2 = b0Var.a();
            if (a2 != -1) {
                aVar2.c(ATTAReporter.KEY_CONTENT_LENGTH, Long.toString(a2));
                aVar2.c.c("Transfer-Encoding");
            } else {
                aVar2.c("Transfer-Encoding", "chunked");
                aVar2.c.c(ATTAReporter.KEY_CONTENT_LENGTH);
            }
        }
        if (xVar.c.c("Host") == null) {
            aVar2.c("Host", c.o(xVar.a, false));
        }
        if (xVar.c.c("Connection") == null) {
            aVar2.c("Connection", "Keep-Alive");
        }
        if (xVar.c.c("Accept-Encoding") == null && xVar.c.c("Range") == null) {
            aVar2.c("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        Objects.requireNonNull((k.a) this.a);
        List emptyList = Collections.emptyList();
        if (!emptyList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = emptyList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0) {
                    sb.append("; ");
                }
                j jVar = (j) emptyList.get(i2);
                sb.append(jVar.a);
                sb.append('=');
                sb.append(jVar.b);
            }
            aVar2.c("Cookie", sb.toString());
        }
        if (xVar.c.c("User-Agent") == null) {
            aVar2.c("User-Agent", "okhttp/3.12.1");
        }
        c0 b2 = fVar.b(aVar2.a(), fVar.b, fVar.c, fVar.f4762d);
        e.d(this.a, xVar.a, b2.f4691g);
        c0.a aVar3 = new c0.a(b2);
        aVar3.a = xVar;
        if (z) {
            String c = b2.f4691g.c("Content-Encoding");
            String str = null;
            if (c == null) {
                c = null;
            }
            if ("gzip".equalsIgnoreCase(c) && e.b(b2)) {
                n nVar = new n(b2.f4692h.d());
                q.a e2 = b2.f4691g.e();
                e2.c("Content-Encoding");
                e2.c(ATTAReporter.KEY_CONTENT_LENGTH);
                List<String> list = e2.a;
                q.a aVar4 = new q.a();
                Collections.addAll(aVar4.a, (String[]) list.toArray(new String[list.size()]));
                aVar3.f4700f = aVar4;
                String c2 = b2.f4691g.c(ATTAReporter.KEY_CONTENT_TYPE);
                if (c2 != null) {
                    str = c2;
                }
                Logger logger = l.q.a;
                aVar3.f4701g = new g(str, -1, new l.t(nVar));
            }
        }
        return aVar3.a();
    }
}
