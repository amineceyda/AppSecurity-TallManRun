package g.i.c.a.a.k;

@Deprecated
public enum e {
    REPORT_POLICY_NONE(false, false),
    REPORT_POLICY_EXPOSURE(false, true),
    REPORT_POLICY_CLICK(true, false),
    REPORT_POLICY_ALL(true, true);
    
    public final boolean reportClick;
    public final boolean reportExposure;

    /* access modifiers changed from: public */
    e(boolean z, boolean z2) {
        this.reportClick = z;
        this.reportExposure = z2;
    }
}
