package k;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import k.h0.c;

public final class i {

    /* renamed from: e  reason: collision with root package name */
    public static final g[] f4891e;

    /* renamed from: f  reason: collision with root package name */
    public static final g[] f4892f;

    /* renamed from: g  reason: collision with root package name */
    public static final i f4893g;

    /* renamed from: h  reason: collision with root package name */
    public static final i f4894h = new i(new a(false));
    public final boolean a;
    public final boolean b;
    @Nullable
    public final String[] c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final String[] f4895d;

    public static final class a {
        public boolean a;
        @Nullable
        public String[] b;
        @Nullable
        public String[] c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4896d;

        public a(boolean z) {
            this.a = z;
        }

        public a a(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public a b(g... gVarArr) {
            if (this.a) {
                String[] strArr = new String[gVarArr.length];
                for (int i2 = 0; i2 < gVarArr.length; i2++) {
                    strArr[i2] = gVarArr[i2].a;
                }
                a(strArr);
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a c(boolean z) {
            if (this.a) {
                this.f4896d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public a d(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        public a e(g0... g0VarArr) {
            if (this.a) {
                String[] strArr = new String[g0VarArr.length];
                for (int i2 = 0; i2 < g0VarArr.length; i2++) {
                    strArr[i2] = g0VarArr[i2].javaName;
                }
                d(strArr);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }

    static {
        g gVar = g.q;
        g gVar2 = g.r;
        g gVar3 = g.s;
        g gVar4 = g.t;
        g gVar5 = g.u;
        g gVar6 = g.f4715k;
        g gVar7 = g.f4717m;
        g gVar8 = g.f4716l;
        g gVar9 = g.n;
        g gVar10 = g.p;
        g gVar11 = g.o;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11};
        f4891e = gVarArr;
        g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, g.f4713i, g.f4714j, g.f4711g, g.f4712h, g.f4709e, g.f4710f, g.f4708d};
        f4892f = gVarArr2;
        a aVar = new a(true);
        aVar.b(gVarArr);
        g0 g0Var = g0.TLS_1_3;
        g0 g0Var2 = g0.TLS_1_2;
        aVar.e(g0Var, g0Var2);
        aVar.c(true);
        a aVar2 = new a(true);
        aVar2.b(gVarArr2);
        g0 g0Var3 = g0.TLS_1_0;
        aVar2.e(g0Var, g0Var2, g0.TLS_1_1, g0Var3);
        aVar2.c(true);
        f4893g = new i(aVar2);
        a aVar3 = new a(true);
        aVar3.b(gVarArr2);
        aVar3.e(g0Var3);
        aVar3.c(true);
    }

    public i(a aVar) {
        this.a = aVar.a;
        this.c = aVar.b;
        this.f4895d = aVar.c;
        this.b = aVar.f4896d;
    }

    public boolean a(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.f4895d;
        if (strArr != null && !c.u(c.o, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || c.u(g.b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        boolean z = this.a;
        if (z != iVar.a) {
            return false;
        }
        return !z || (Arrays.equals(this.c, iVar.c) && Arrays.equals(this.f4895d, iVar.f4895d) && this.b == iVar.b);
    }

    public int hashCode() {
        if (this.a) {
            return ((((527 + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.f4895d)) * 31) + (this.b ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        String str;
        List list;
        if (!this.a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.c;
        List list2 = null;
        String str2 = "[all enabled]";
        if (strArr != null) {
            if (strArr != null) {
                ArrayList arrayList = new ArrayList(strArr.length);
                for (String a2 : strArr) {
                    arrayList.add(g.a(a2));
                }
                list = Collections.unmodifiableList(arrayList);
            } else {
                list = null;
            }
            str = list.toString();
        } else {
            str = str2;
        }
        String[] strArr2 = this.f4895d;
        if (strArr2 != null) {
            if (strArr2 != null) {
                ArrayList arrayList2 = new ArrayList(strArr2.length);
                for (String a3 : strArr2) {
                    arrayList2.add(g0.a(a3));
                }
                list2 = Collections.unmodifiableList(arrayList2);
            }
            str2 = list2.toString();
        }
        return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + str2 + ", supportsTlsExtensions=" + this.b + ")";
    }
}
