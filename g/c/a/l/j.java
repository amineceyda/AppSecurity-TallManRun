package g.c.a.l;

import com.tencent.trpcprotocol.projecta.vl_recall_app_detail.vl_recall_app_detail.nano.vlRecallAppDetail;

public enum j {
    V1_COMMENT(vlRecallAppDetail.AppNotFound),
    CONFIG(1002),
    FILE(-1),
    DOWNLOAD(-1),
    UN_KNOW(-1);
    
    private int id;

    /* access modifiers changed from: public */
    j(int i2) {
        this.id = i2;
    }

    public final int f() {
        return this.id;
    }
}
