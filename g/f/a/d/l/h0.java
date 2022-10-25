package g.f.a.d.l;

import g.f.a.a.d;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.h.e;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.sql.SQLException;

public class h0 extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final h0 f3911d = new h0();

    public h0() {
        super(k.SERIALIZABLE);
    }

    public boolean e() {
        return true;
    }

    public Object h(i iVar, String str) throws SQLException {
        throw new SQLException("Default values for serializable types are not supported");
    }

    public Class<?> i() {
        return Serializable.class;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037 A[SYNTHETIC, Splitter:B:18:0x0037] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m(g.f.a.d.i r4, java.lang.Object r5) throws java.sql.SQLException {
        /*
            r3 = this;
            r4 = 0
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x001e }
            r0.<init>()     // Catch:{ Exception -> 0x001e }
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x001e }
            r1.<init>(r0)     // Catch:{ Exception -> 0x001e }
            r1.writeObject(r5)     // Catch:{ Exception -> 0x0019, all -> 0x0016 }
            r1.close()     // Catch:{ Exception -> 0x0019, all -> 0x0016 }
            byte[] r4 = r0.toByteArray()     // Catch:{ Exception -> 0x001e }
            return r4
        L_0x0016:
            r5 = move-exception
            r4 = r1
            goto L_0x0035
        L_0x0019:
            r0 = move-exception
            r4 = r1
            goto L_0x001f
        L_0x001c:
            r5 = move-exception
            goto L_0x0035
        L_0x001e:
            r0 = move-exception
        L_0x001f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x001c }
            r1.<init>()     // Catch:{ all -> 0x001c }
            java.lang.String r2 = "Could not write serialized object to byte array: "
            r1.append(r2)     // Catch:{ all -> 0x001c }
            r1.append(r5)     // Catch:{ all -> 0x001c }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x001c }
            java.sql.SQLException r5 = e.e.i.b.j(r5, r0)     // Catch:{ all -> 0x001c }
            throw r5     // Catch:{ all -> 0x001c }
        L_0x0035:
            if (r4 == 0) goto L_0x003a
            r4.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.a.d.l.h0.m(g.f.a.d.i, java.lang.Object):java.lang.Object");
    }

    public boolean o(Field field) {
        return Serializable.class.isAssignableFrom(field.getType());
    }

    public boolean r() {
        return true;
    }

    public boolean t() {
        return false;
    }

    public boolean v() {
        return false;
    }

    public Object y(i iVar, e eVar, int i2) throws SQLException {
        return ((d) eVar).f(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a A[SYNTHETIC, Splitter:B:19:0x004a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object z(g.f.a.d.i r4, java.lang.Object r5, int r6) throws java.sql.SQLException {
        /*
            r3 = this;
            byte[] r5 = (byte[]) r5
            r4 = 0
            java.io.ObjectInputStream r6 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x001b, all -> 0x0017 }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x001b, all -> 0x0017 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x001b, all -> 0x0017 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x001b, all -> 0x0017 }
            java.lang.Object r4 = r6.readObject()     // Catch:{ Exception -> 0x0015 }
            r6.close()     // Catch:{ IOException -> 0x0014 }
        L_0x0014:
            return r4
        L_0x0015:
            r4 = move-exception
            goto L_0x001f
        L_0x0017:
            r5 = move-exception
            r6 = r4
            r4 = r5
            goto L_0x0048
        L_0x001b:
            r6 = move-exception
            r2 = r6
            r6 = r4
            r4 = r2
        L_0x001f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0047 }
            r0.<init>()     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = "Could not read serialized object from byte array: "
            r0.append(r1)     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = java.util.Arrays.toString(r5)     // Catch:{ all -> 0x0047 }
            r0.append(r1)     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = "(len "
            r0.append(r1)     // Catch:{ all -> 0x0047 }
            int r5 = r5.length     // Catch:{ all -> 0x0047 }
            r0.append(r5)     // Catch:{ all -> 0x0047 }
            java.lang.String r5 = ")"
            r0.append(r5)     // Catch:{ all -> 0x0047 }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x0047 }
            java.sql.SQLException r4 = e.e.i.b.j(r5, r4)     // Catch:{ all -> 0x0047 }
            throw r4     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r4 = move-exception
        L_0x0048:
            if (r6 == 0) goto L_0x004d
            r6.close()     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.a.d.l.h0.z(g.f.a.d.i, java.lang.Object, int):java.lang.Object");
    }
}
