package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    public abstract int c();

    public abstract long e();

    public abstract long f();

    public abstract String h();

    public final String toString() {
        long f2 = f();
        int c = c();
        long e2 = e();
        String h2 = h();
        StringBuilder sb = new StringBuilder(h2.length() + 53);
        sb.append(f2);
        sb.append("\t");
        sb.append(c);
        sb.append("\t");
        sb.append(e2);
        sb.append(h2);
        return sb.toString();
    }
}
