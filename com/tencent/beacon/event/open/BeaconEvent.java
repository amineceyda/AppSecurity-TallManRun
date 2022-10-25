package com.tencent.beacon.event.open;

import android.text.TextUtils;
import com.tencent.beacon.a.c.c;
import com.tencent.beacon.event.c.d;
import java.util.HashMap;
import java.util.Map;

public final class BeaconEvent {
    /* access modifiers changed from: private */
    public String a;
    /* access modifiers changed from: private */
    public String b;
    /* access modifiers changed from: private */
    public EventType c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f740d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Map<String, String> f741e;

    public static final class Builder {
        private String a;
        private String b;
        private EventType c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f742d;

        /* renamed from: e  reason: collision with root package name */
        private Map<String, String> f743e;

        private Builder() {
            this.c = EventType.NORMAL;
            this.f742d = true;
            this.f743e = new HashMap();
        }

        private Builder(BeaconEvent beaconEvent) {
            this.c = EventType.NORMAL;
            this.f742d = true;
            this.f743e = new HashMap();
            this.a = beaconEvent.a;
            this.b = beaconEvent.b;
            this.c = beaconEvent.c;
            this.f742d = beaconEvent.f740d;
            this.f743e.putAll(beaconEvent.f741e);
        }

        public /* synthetic */ Builder(BeaconEvent beaconEvent, a aVar) {
            this(beaconEvent);
        }

        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public BeaconEvent build() {
            String b2 = d.b(this.b);
            if (TextUtils.isEmpty(this.a)) {
                this.a = c.d().f();
            }
            return new BeaconEvent(this.a, b2, this.c, this.f742d, this.f743e, (a) null);
        }

        public Builder withAppKey(String str) {
            this.a = str;
            return this;
        }

        public Builder withCode(String str) {
            this.b = str;
            return this;
        }

        public Builder withIsSucceed(boolean z) {
            this.f742d = z;
            return this;
        }

        public Builder withParams(String str, String str2) {
            this.f743e.put(str, str2);
            return this;
        }

        public Builder withParams(Map<String, String> map) {
            if (map != null) {
                this.f743e.putAll(map);
            }
            return this;
        }

        public Builder withType(EventType eventType) {
            this.c = eventType;
            return this;
        }
    }

    private BeaconEvent(String str, String str2, EventType eventType, boolean z, Map<String, String> map) {
        this.a = str;
        this.b = str2;
        this.c = eventType;
        this.f740d = z;
        this.f741e = map;
    }

    public /* synthetic */ BeaconEvent(String str, String str2, EventType eventType, boolean z, Map map, a aVar) {
        this(str, str2, eventType, z, map);
    }

    public static Builder builder() {
        return new Builder((a) null);
    }

    public static Builder newBuilder(BeaconEvent beaconEvent) {
        return new Builder(beaconEvent, (a) null);
    }

    public String getAppKey() {
        return this.a;
    }

    public String getCode() {
        return this.b;
    }

    public String getLogidPrefix() {
        switch (a.a[this.c.ordinal()]) {
            case 1:
            case 2:
                return "N";
            case 3:
            case 4:
                return "I";
            case 5:
            case 6:
                return "Y";
            default:
                return "";
        }
    }

    public Map<String, String> getParams() {
        return this.f741e;
    }

    public EventType getType() {
        return this.c;
    }

    public boolean isSucceed() {
        return this.f740d;
    }

    public void setAppKey(String str) {
        this.a = str;
    }

    public void setCode(String str) {
        this.b = str;
    }

    public void setParams(Map<String, String> map) {
        this.f741e = map;
    }

    public void setSucceed(boolean z) {
        this.f740d = z;
    }

    public void setType(EventType eventType) {
        this.c = eventType;
    }

    public String toString() {
        return super.toString();
    }
}
