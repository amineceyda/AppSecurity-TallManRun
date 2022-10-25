package com.tencent.beacon.event;

import com.tencent.beacon.base.util.c;
import java.util.Set;

public class e implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ f b;

    public e(f fVar, long j2) {
        this.b = fVar;
        this.a = j2;
    }

    public void run() {
        StringBuilder sb = new StringBuilder();
        for (Long append : this.b.a) {
            sb.append(append);
            sb.append(",");
        }
        boolean a2 = this.b.f707g.a(this.b.f706f, sb.substring(0, sb.lastIndexOf(",")));
        c.a(this.b.b, 4, "delete: %s", Boolean.valueOf(a2));
        this.b.f705e.a((Set<Long>) this.b.a);
        this.b.f705e.a(this.a);
    }
}
