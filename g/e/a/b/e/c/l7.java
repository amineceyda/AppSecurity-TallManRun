package g.e.a.b.e.c;

import com.google.android.gms.internal.measurement.zzkh;
import g.e.a.b.e.c.l7;
import g.e.a.b.e.c.o7;
import java.io.IOException;

public class l7<MessageType extends o7<MessageType, BuilderType>, BuilderType extends l7<MessageType, BuilderType>> extends g6<MessageType, BuilderType> {
    public final o7 b;
    public o7 c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2990d = false;

    public l7(MessageType messagetype) {
        this.b = messagetype;
        this.c = (o7) messagetype.r(4, (Object) null, (Object) null);
    }

    public final /* synthetic */ o8 c() {
        return this.b;
    }

    public void f() {
        o7 o7Var = (o7) this.c.r(4, (Object) null, (Object) null);
        v8.c.a(o7Var.getClass()).f(o7Var, this.c);
        this.c = o7Var;
    }

    /* renamed from: g */
    public final l7 clone() {
        l7 l7Var = (l7) this.b.r(5, (Object) null, (Object) null);
        l7Var.h(k());
        return l7Var;
    }

    public final l7 h(o7 o7Var) {
        if (this.f2990d) {
            f();
            this.f2990d = false;
        }
        o7 o7Var2 = this.c;
        v8.c.a(o7Var2.getClass()).f(o7Var2, o7Var);
        return this;
    }

    public final l7 i(byte[] bArr, int i2, int i3, b7 b7Var) throws zzkh {
        if (this.f2990d) {
            f();
            this.f2990d = false;
        }
        try {
            v8.c.a(this.c.getClass()).d(this.c, bArr, 0, i3, new k6(b7Var));
            return this;
        } catch (zzkh e2) {
            throw e2;
        } catch (IndexOutOfBoundsException unused) {
            throw zzkh.d();
        } catch (IOException e3) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r3 != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final MessageType j() {
        /*
            r5 = this;
            g.e.a.b.e.c.o7 r0 = r5.k()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.r(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L_0x0013
            goto L_0x002e
        L_0x0013:
            if (r3 == 0) goto L_0x002f
            g.e.a.b.e.c.v8 r3 = g.e.a.b.e.c.v8.c
            java.lang.Class r4 = r0.getClass()
            g.e.a.b.e.c.y8 r3 = r3.a(r4)
            boolean r3 = r3.c(r0)
            if (r1 == r3) goto L_0x0027
            r1 = r2
            goto L_0x0028
        L_0x0027:
            r1 = r0
        L_0x0028:
            r4 = 2
            r0.r(r4, r1, r2)
            if (r3 == 0) goto L_0x002f
        L_0x002e:
            return r0
        L_0x002f:
            com.google.android.gms.internal.measurement.zzma r0 = new com.google.android.gms.internal.measurement.zzma
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.l7.j():g.e.a.b.e.c.o7");
    }

    public MessageType k() {
        if (this.f2990d) {
            return this.c;
        }
        o7 o7Var = this.c;
        v8.c.a(o7Var.getClass()).a(o7Var);
        this.f2990d = true;
        return this.c;
    }
}
