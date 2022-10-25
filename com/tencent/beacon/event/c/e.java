package com.tencent.beacon.event.c;

import android.content.SharedPreferences;
import com.tencent.beacon.base.util.b;
import com.tencent.beacon.base.util.c;

public class e implements Runnable {
    private volatile long a = 0;
    private volatile long b = 0;
    private volatile long c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f690d;

    public e(g gVar) {
        this.f690d = gVar;
    }

    public void run() {
        synchronized (this.f690d) {
            long j2 = this.f690d.r.get();
            long j3 = this.f690d.q.get();
            long j4 = this.f690d.s.get();
            if (this.a != j2 || this.b != j3 || this.c != j4) {
                this.a = j2;
                this.b = j3;
                this.c = j4;
                g gVar = this.f690d;
                SharedPreferences.Editor edit = gVar.a(gVar.f700m).edit();
                if (b.a(edit)) {
                    edit.putLong("on_date", this.f690d.p).putLong("realtime_log_id", this.a).putLong("normal_log_id", this.b).putLong("immediate_log_id", this.c).putLong("realtime_min_log_id", this.f690d.t).putLong("realtime_max_log_id", this.f690d.u).putLong("normal_min_log_id", this.f690d.v).putLong("normal_max_log_id", this.f690d.w).putLong("immediate_min_log_id", this.f690d.x).putLong("immediate_max_log_id", this.f690d.y).apply();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("[LogID ");
                sb.append(this.f690d.n);
                sb.append("]");
                String sb2 = sb.toString();
                c.a(sb2, "  write serial to sp, date: %s ,realtime: %d, normal: %d, immediate: %d ", Long.valueOf(this.f690d.p), Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c));
            }
        }
    }
}
