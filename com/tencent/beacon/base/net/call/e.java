package com.tencent.beacon.base.net.call;

import android.text.TextUtils;
import com.tencent.beacon.base.net.BodyType;
import com.tencent.beacon.base.net.HttpMethod;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.slf4j.helpers.MessageFormatter;

public class e {
    private final String a;
    private final HttpMethod b;
    private final Map<String, String> c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, String> f637d;

    /* renamed from: e  reason: collision with root package name */
    private final String f638e;

    /* renamed from: f  reason: collision with root package name */
    private BodyType f639f;

    /* renamed from: g  reason: collision with root package name */
    private String f640g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f641h;

    public static class a {
        private HttpMethod a;
        private String b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private Map<String, String> f642d = new HashMap(3);

        /* renamed from: e  reason: collision with root package name */
        private Map<String, String> f643e = new HashMap(3);

        /* renamed from: f  reason: collision with root package name */
        private String f644f;

        /* renamed from: g  reason: collision with root package name */
        private BodyType f645g;

        /* renamed from: h  reason: collision with root package name */
        private byte[] f646h;

        private void a(BodyType bodyType) {
            if (this.f645g == null) {
                this.f645g = bodyType;
            }
            if (this.f645g != bodyType) {
                throw new IllegalStateException("bodyType already set!");
            }
        }

        public a a(HttpMethod httpMethod) {
            this.a = httpMethod;
            return this;
        }

        public a a(String str) {
            this.c = str;
            return this;
        }

        public a a(Map<String, String> map) {
            a(BodyType.FORM);
            this.f642d.putAll(map);
            return this;
        }

        public e a() {
            Objects.requireNonNull(this.a, "request method == null");
            if (!TextUtils.isEmpty(this.b)) {
                BodyType bodyType = this.f645g;
                Objects.requireNonNull(bodyType, "bodyType == null");
                int i2 = d.a[bodyType.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            Objects.requireNonNull(this.f646h, "data request body == null");
                        }
                    } else if (this.f642d.isEmpty()) {
                        throw new NullPointerException("form request body == null");
                    }
                } else if (TextUtils.isEmpty(this.f644f)) {
                    throw new NullPointerException("json request body == null");
                }
                return new e(this.a, this.b, this.f643e, this.f645g, this.f644f, this.f642d, this.f646h, this.c, (d) null);
            }
            throw new NullPointerException("request url == null!");
        }

        public a b(String str) {
            this.b = str;
            return this;
        }
    }

    private e(HttpMethod httpMethod, String str, Map<String, String> map, BodyType bodyType, String str2, Map<String, String> map2, byte[] bArr, String str3) {
        this.b = httpMethod;
        this.a = str;
        this.c = map;
        this.f639f = bodyType;
        this.f640g = str2;
        this.f637d = map2;
        this.f641h = bArr;
        this.f638e = str3;
    }

    public /* synthetic */ e(HttpMethod httpMethod, String str, Map map, BodyType bodyType, String str2, Map map2, byte[] bArr, String str3, d dVar) {
        this(httpMethod, str, map, bodyType, str2, map2, bArr, str3);
    }

    public static a b() {
        return new a();
    }

    public BodyType a() {
        return this.f639f;
    }

    public byte[] c() {
        return this.f641h;
    }

    public Map<String, String> d() {
        return this.f637d;
    }

    public Map<String, String> e() {
        return this.c;
    }

    public String f() {
        return this.f640g;
    }

    public HttpMethod g() {
        return this.b;
    }

    public String h() {
        return this.f638e;
    }

    public String i() {
        return this.a;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("HttpRequestEntity{url='");
        g.a.a.a.a.p(i2, this.a, '\'', ", method=");
        i2.append(this.b);
        i2.append(", headers=");
        i2.append(this.c);
        i2.append(", formParams=");
        i2.append(this.f637d);
        i2.append(", bodyType=");
        i2.append(this.f639f);
        i2.append(", json='");
        g.a.a.a.a.p(i2, this.f640g, '\'', ", tag='");
        i2.append(this.f638e);
        i2.append('\'');
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
