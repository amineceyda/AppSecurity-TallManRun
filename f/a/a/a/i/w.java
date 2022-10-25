package f.a.a.a.i;

import f.a.a.a.l.c;

public class w extends e {

    /* renamed from: g  reason: collision with root package name */
    public long f1649g = -1;

    /* renamed from: h  reason: collision with root package name */
    public String f1650h = null;

    public String h(Object obj) {
        String str;
        c cVar = (c) obj;
        long timeStamp = cVar.getTimeStamp();
        synchronized (this) {
            if (timeStamp != this.f1649g) {
                this.f1649g = timeStamp;
                this.f1650h = Long.toString(timeStamp - cVar.e().birthTime);
            }
            str = this.f1650h;
        }
        return str;
    }
}
