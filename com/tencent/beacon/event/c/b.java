package com.tencent.beacon.event.c;

import com.tencent.beacon.base.net.a.c;
import com.tencent.beacon.event.EventBean;

public final class b extends c.a<EventBean, com.tencent.beacon.event.a.b> {
    private final C0008b a = new C0008b();
    private final a b = new a();

    public static final class a implements c<EventBean, com.tencent.beacon.event.a.b> {
        public com.tencent.beacon.event.a.b a(EventBean eventBean) {
            com.tencent.beacon.event.a.b bVar = new com.tencent.beacon.event.a.b();
            bVar.b = eventBean.getEventTime();
            bVar.f688d = eventBean.getAppKey();
            byte[] a = com.tencent.beacon.base.util.b.a((Object) eventBean);
            bVar.f689e = a;
            if (a != null) {
                bVar.c = (long) a.length;
            }
            return bVar;
        }
    }

    /* renamed from: com.tencent.beacon.event.c.b$b  reason: collision with other inner class name */
    public static final class C0008b implements c<com.tencent.beacon.event.a.b, EventBean> {
        public EventBean a(com.tencent.beacon.event.a.b bVar) {
            Object a = com.tencent.beacon.base.util.b.a(bVar.f689e);
            if (a == null || !(a instanceof EventBean)) {
                return null;
            }
            EventBean eventBean = (EventBean) a;
            eventBean.setCid(bVar.a);
            return eventBean;
        }
    }

    private b() {
    }

    public static b a() {
        return new b();
    }

    public c<EventBean, com.tencent.beacon.event.a.b> b() {
        return this.b;
    }

    public c<com.tencent.beacon.event.a.b, EventBean> c() {
        return this.a;
    }
}
