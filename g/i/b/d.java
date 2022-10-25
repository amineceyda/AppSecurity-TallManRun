package g.i.b;

import android.content.Context;

public final class d {
    public Context a;
    public int b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public String f4092d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f4093e = "";

    public d(Context context, int i2, String str, String str2) {
        this.a = context.getApplicationContext();
        this.b = i2;
        this.c = true;
        this.f4092d = str;
        this.f4093e = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(",channelid:" + this.f4093e);
        sb.append(",isSDKMode:" + this.c);
        sb.append(",isTest:false");
        sb.append(",maskDeviceInfo:false");
        sb.append("]");
        return sb.toString();
    }
}
