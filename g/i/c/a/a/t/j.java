package g.i.c.a.a.t;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.tencent.raft.raftframework.sla.SLAConstant;
import e.e.i.b;
import g.h.a.a;
import g.i.c.a.a.b0.f;
import g.i.c.a.a.b0.i;
import g.i.c.a.a.b0.k;
import g.i.c.a.a.b0.l;
import g.i.c.a.a.c0.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class j {
    public static void a(Map<String, Object> map) {
        String str;
        if (map != null) {
            map.put("os", SLAConstant.TYPE_DEPRECATED_START);
            map.put("os_vrsn", "Android " + Build.VERSION.RELEASE);
            if (a.f4027g == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new l());
                arrayList.add(new g.i.c.a.a.b0.j());
                arrayList.add(new i());
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = "";
                        break;
                    }
                    str = ((k) it.next()).a();
                    if (!TextUtils.isEmpty(str)) {
                        break;
                    }
                }
                a.f4027g = str;
            }
            map.put("ui_vrsn", a.f4027g);
        }
    }

    public static void b(String str, String str2, Map<String, Object> map) {
        long j2;
        long j3;
        if (map != null) {
            if (f.f4524f == null) {
                synchronized (f.class) {
                    if (f.f4524f == null) {
                        f.f4524f = new f();
                    }
                }
            }
            f fVar = f.f4524f;
            Objects.requireNonNull(fVar);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            synchronized (f.f4523e) {
                long j4 = 1;
                long j5 = 0;
                try {
                    j2 = fVar.b(str);
                    try {
                        String a = f.a(str, fVar.b, j2, str2);
                        j3 = ((Long) (fVar.c.containsKey(a) ? fVar.c.get(a) : b.n(f.c(), fVar.a, a, 0L))).longValue() + 1;
                        fVar.c.put(a, Long.valueOf(j3));
                        if (j3 > 300000) {
                            fVar.b = fVar.c();
                            try {
                                j5 = fVar.b(str);
                                try {
                                    fVar.c.put(f.a(str, fVar.b, j5, str2), 1L);
                                } catch (Exception e2) {
                                    e = e2;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                j5 = j2;
                                g.c.b.b.f.x("EventStatisticsManager", "getEventCount error " + e);
                                j2 = j5;
                                j3 = j4;
                                fVar.f4525d.removeMessages(1);
                                fVar.f4525d.sendEmptyMessageDelayed(1, 500);
                                map.put("dt_seqid", Long.valueOf(j3));
                                map.put("dt_seqtime", Long.valueOf(j2));
                            }
                            j2 = j5;
                            j3 = j4;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        j4 = 0;
                        j5 = j2;
                        g.c.b.b.f.x("EventStatisticsManager", "getEventCount error " + e);
                        j2 = j5;
                        j3 = j4;
                        fVar.f4525d.removeMessages(1);
                        fVar.f4525d.sendEmptyMessageDelayed(1, 500);
                        map.put("dt_seqid", Long.valueOf(j3));
                        map.put("dt_seqtime", Long.valueOf(j2));
                    }
                } catch (Exception e5) {
                    e = e5;
                    j4 = 0;
                    g.c.b.b.f.x("EventStatisticsManager", "getEventCount error " + e);
                    j2 = j5;
                    j3 = j4;
                    fVar.f4525d.removeMessages(1);
                    fVar.f4525d.sendEmptyMessageDelayed(1, 500);
                    map.put("dt_seqid", Long.valueOf(j3));
                    map.put("dt_seqtime", Long.valueOf(j2));
                }
            }
            fVar.f4525d.removeMessages(1);
            fVar.f4525d.sendEmptyMessageDelayed(1, 500);
            map.put("dt_seqid", Long.valueOf(j3));
            map.put("dt_seqtime", Long.valueOf(j2));
        }
    }

    public static void c(Object obj, Map<String, Object> map) {
        if (map != null) {
            g.i.c.a.a.c0.a.a aVar = a.b.a;
            Objects.requireNonNull(aVar);
            if (aVar.a) {
                map.put("dt_uid", Integer.valueOf(obj instanceof View ? obj.hashCode() : -1));
                map.put("dt_appid", aVar.b);
                map.put("dt_debugid", aVar.c);
            }
        }
    }
}
