package f.a.a.a;

import com.tencent.beacon.base.net.adapter.AbstractNetAdapter;
import com.tencent.raft.codegenmeta.utils.RLog;
import com.tencent.raft.measure.utils.MeasureConst;
import com.tencent.raft.raftannotation.RServiceProcess;
import java.io.Serializable;

public final class a implements Serializable {
    public static final a b = new a(Integer.MAX_VALUE, "OFF");
    public static final a c = new a(40000, "ERROR");

    /* renamed from: d  reason: collision with root package name */
    public static final a f1610d = new a(AbstractNetAdapter.CONNECT_TIMEOUT, "WARN");

    /* renamed from: e  reason: collision with root package name */
    public static final a f1611e = new a(20000, "INFO");

    /* renamed from: f  reason: collision with root package name */
    public static final a f1612f = new a(AbstractNetAdapter.READ_TIMEOUT, RLog.DEBUG);

    /* renamed from: g  reason: collision with root package name */
    public static final a f1613g = new a(MeasureConst.DEFAULT_REPORT_DELAY_TIME, "TRACE");

    /* renamed from: h  reason: collision with root package name */
    public static final a f1614h = new a(Integer.MIN_VALUE, RServiceProcess.ALL);
    private static final long serialVersionUID = -814092767334282137L;
    public final int levelInt;
    public final String levelStr;

    public a(int i2, String str) {
        this.levelInt = i2;
        this.levelStr = str;
    }

    public static a a(int i2) {
        a aVar = f1612f;
        if (i2 == Integer.MIN_VALUE) {
            return f1614h;
        }
        if (i2 == 5000) {
            return f1613g;
        }
        if (i2 == 10000) {
            return aVar;
        }
        if (i2 == 20000) {
            return f1611e;
        }
        if (i2 == 30000) {
            return f1610d;
        }
        if (i2 != 40000) {
            return i2 != Integer.MAX_VALUE ? aVar : b;
        }
        return c;
    }

    public static a b(String str, a aVar) {
        if (str == null) {
            return aVar;
        }
        String trim = str.trim();
        return trim.equalsIgnoreCase(RServiceProcess.ALL) ? f1614h : trim.equalsIgnoreCase("TRACE") ? f1613g : trim.equalsIgnoreCase(RLog.DEBUG) ? f1612f : trim.equalsIgnoreCase("INFO") ? f1611e : trim.equalsIgnoreCase("WARN") ? f1610d : trim.equalsIgnoreCase("ERROR") ? c : trim.equalsIgnoreCase("OFF") ? b : aVar;
    }

    private Object readResolve() {
        return a(this.levelInt);
    }

    public String toString() {
        return this.levelStr;
    }
}
