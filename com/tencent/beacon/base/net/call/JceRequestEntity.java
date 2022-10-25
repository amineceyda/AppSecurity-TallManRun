package com.tencent.beacon.base.net.call;

import android.text.TextUtils;
import com.tencent.beacon.base.net.RequestType;
import com.tencent.beacon.base.net.b.d;
import com.tencent.beacon.base.net.c;
import com.tencent.beacon.pack.AbstractJceStruct;
import com.tencent.beacon.pack.RequestPackageV2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.helpers.MessageFormatter;

public class JceRequestEntity {
    private static final String TAG = "JceRequestEntity";
    private final String appKey;
    private final byte[] content;
    private final String domain;
    private final Map<String, String> header;
    private final int port;
    private final int requestCmd;
    private final int responseCmd;
    private final RequestType type;
    private final String url;

    public static final class a {
        private String a;
        private int b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private int f629d;

        /* renamed from: e  reason: collision with root package name */
        private int f630e;

        /* renamed from: f  reason: collision with root package name */
        private RequestType f631f;

        /* renamed from: g  reason: collision with root package name */
        private String f632g;

        /* renamed from: h  reason: collision with root package name */
        private Map<String, String> f633h = new ConcurrentHashMap(5);

        /* renamed from: i  reason: collision with root package name */
        private Map<String, String> f634i = new LinkedHashMap(10);

        /* renamed from: j  reason: collision with root package name */
        private byte[] f635j;

        /* renamed from: k  reason: collision with root package name */
        private AbstractJceStruct f636k;

        public a a(int i2) {
            this.f629d = i2;
            return this;
        }

        public a a(RequestType requestType) {
            this.f631f = requestType;
            return this;
        }

        public a a(AbstractJceStruct abstractJceStruct) {
            this.f636k = abstractJceStruct;
            return this;
        }

        public a a(String str) {
            this.c = str;
            return this;
        }

        public a a(String str, int i2) {
            this.f632g = str;
            this.b = i2;
            return this;
        }

        public a a(String str, String str2) {
            this.f633h.put(str, str2);
            return this;
        }

        public a a(Map<String, String> map) {
            if (map != null) {
                this.f634i.putAll(map);
            }
            return this;
        }

        public JceRequestEntity a() {
            if (TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.f632g)) {
                throw new IllegalArgumentException("url || domain == null");
            } else if (!TextUtils.isEmpty(this.c)) {
                c c2 = c.c();
                this.f633h.putAll(d.a());
                if (this.f631f == RequestType.EVENT) {
                    this.f635j = c2.f625e.c().a((RequestPackageV2) this.f636k);
                } else {
                    AbstractJceStruct abstractJceStruct = this.f636k;
                    this.f635j = c2.f624d.c().a(d.a(this.f629d, abstractJceStruct == null ? "".getBytes() : abstractJceStruct.toByteArray(), this.f634i, this.c));
                }
                return new JceRequestEntity(this.f631f, this.a, this.f632g, this.b, this.c, this.f635j, this.f633h, this.f629d, this.f630e);
            } else {
                throw new IllegalArgumentException("appKey == null");
            }
        }

        public a b(int i2) {
            this.f630e = i2;
            return this;
        }

        public a b(String str) {
            this.a = str;
            return this;
        }

        public a b(String str, String str2) {
            if (str2 == null) {
                str2 = "";
            }
            this.f634i.put(str, str2);
            return this;
        }
    }

    private JceRequestEntity(RequestType requestType, String str, String str2, int i2, String str3, byte[] bArr, Map<String, String> map, int i3, int i4) {
        this.type = requestType;
        this.url = str;
        this.domain = str2;
        this.port = i2;
        this.appKey = str3;
        this.content = bArr;
        this.header = map;
        this.requestCmd = i3;
        this.responseCmd = i4;
    }

    public static a builder() {
        return new a();
    }

    public String getAppKey() {
        return this.appKey;
    }

    public byte[] getContent() {
        return this.content;
    }

    public String getDomain() {
        return this.domain;
    }

    public Map<String, String> getHeader() {
        return this.header;
    }

    public int getPort() {
        return this.port;
    }

    public int getRequestCmd() {
        return this.requestCmd;
    }

    public int getResponseCmd() {
        return this.responseCmd;
    }

    public RequestType getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("JceRequestEntity{type=");
        i2.append(this.type);
        i2.append(", url='");
        g.a.a.a.a.p(i2, this.url, '\'', ", domain='");
        g.a.a.a.a.p(i2, this.domain, '\'', ", port=");
        i2.append(this.port);
        i2.append(", appKey='");
        g.a.a.a.a.p(i2, this.appKey, '\'', ", content.length=");
        i2.append(this.content.length);
        i2.append(", header=");
        i2.append(this.header);
        i2.append(", requestCmd=");
        i2.append(this.requestCmd);
        i2.append(", responseCmd=");
        i2.append(this.responseCmd);
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
