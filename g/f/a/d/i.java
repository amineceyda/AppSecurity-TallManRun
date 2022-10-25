package g.f.a.d;

import g.f.a.b.h;
import g.f.a.b.k;
import g.f.a.b.m;
import g.f.a.c.b;
import g.f.a.d.l.e;
import g.f.a.d.l.k0;
import g.f.a.d.l.l0;
import g.f.a.d.l.o0;
import g.f.a.d.l.p0;
import g.f.a.d.l.r;
import g.f.a.e.b;
import g.f.a.e.c;
import g.f.a.e.d;
import g.f.a.g.l.f;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

public class i {
    public static final ThreadLocal<a> v = new ThreadLocal<>();
    public static final c w = d.a(i.class);
    public final g.f.a.h.c a;
    public final String b;
    public final Field c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3875d;

    /* renamed from: e  reason: collision with root package name */
    public final f f3876e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3877f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3878g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3879h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f3880i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f3881j;

    /* renamed from: k  reason: collision with root package name */
    public final Class<?> f3882k;

    /* renamed from: l  reason: collision with root package name */
    public b f3883l;

    /* renamed from: m  reason: collision with root package name */
    public Object f3884m;
    public Object n;
    public h o;
    public i p;
    public i q;
    public g.f.a.i.c<?, ?> r;
    public i s;
    public g.f.a.b.a<?, ?> t;
    public f<Object, Object> u;

    public static class a {
        public int a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f3885d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(g.f.a.h.c r9, java.lang.String r10, java.lang.reflect.Field r11, g.f.a.d.f r12, java.lang.Class<?> r13) throws java.sql.SQLException {
        /*
            r8 = this;
            java.lang.String r0 = "Could not run getSingleton method on class "
            r8.<init>()
            r8.a = r9
            r8.b = r10
            g.f.a.a.b r9 = (g.f.a.a.b) r9
            g.f.a.c.c r9 = r9.f3835e
            r8.c = r11
            r8.f3882k = r13
            java.lang.String r10 = r12.D
            r13 = 1
            if (r10 == 0) goto L_0x0018
            r12.w = r13
        L_0x0018:
            boolean r10 = r12.w
            if (r10 == 0) goto L_0x0024
            int r10 = r12.x
            r1 = -1
            if (r10 != r1) goto L_0x0024
            r10 = 2
            r12.x = r10
        L_0x0024:
            java.lang.Class r10 = r11.getType()
            g.f.a.d.b r1 = r12.g()
            java.lang.String r2 = " for field "
            r3 = 0
            r4 = 0
            if (r1 != 0) goto L_0x00b1
            java.lang.Class<? extends g.f.a.d.b> r1 = r12.y
            if (r1 == 0) goto L_0x00ac
            java.lang.Class<g.f.a.d.l.r0> r5 = g.f.a.d.l.r0.class
            if (r1 != r5) goto L_0x003b
            goto L_0x00ac
        L_0x003b:
            java.lang.String r5 = "getSingleton"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0095 }
            java.lang.reflect.Method r5 = r1.getDeclaredMethod(r5, r6)     // Catch:{ Exception -> 0x0095 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ InvocationTargetException -> 0x0087, Exception -> 0x0072 }
            java.lang.Object r0 = r5.invoke(r4, r6)     // Catch:{ InvocationTargetException -> 0x0087, Exception -> 0x0072 }
            if (r0 == 0) goto L_0x0066
            g.f.a.d.b r0 = (g.f.a.d.b) r0     // Catch:{ Exception -> 0x004f }
            goto L_0x00fa
        L_0x004f:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Could not cast result of static getSingleton method to DataPersister from class "
            r10.append(r11)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            java.sql.SQLException r9 = e.e.i.b.j(r10, r9)
            throw r9
        L_0x0066:
            java.sql.SQLException r9 = new java.sql.SQLException
            java.lang.String r10 = "Static getSingleton method should not return null on class "
            java.lang.String r10 = g.a.a.a.a.v(r10, r1)
            r9.<init>(r10)
            throw r9
        L_0x0072:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            java.sql.SQLException r9 = e.e.i.b.j(r10, r9)
            throw r9
        L_0x0087:
            r9 = move-exception
            java.lang.String r10 = g.a.a.a.a.v(r0, r1)
            java.lang.Throwable r9 = r9.getTargetException()
            java.sql.SQLException r9 = e.e.i.b.j(r10, r9)
            throw r9
        L_0x0095:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Could not find getSingleton static method on class "
            r10.append(r11)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            java.sql.SQLException r9 = e.e.i.b.j(r10, r9)
            throw r9
        L_0x00ac:
            g.f.a.d.b r0 = g.f.a.d.c.a(r11)
            goto L_0x00fa
        L_0x00b1:
            g.f.a.d.b r0 = r12.g()
            boolean r1 = r0.o(r11)
            if (r1 != 0) goto L_0x00fa
            java.lang.String r9 = "Field class "
            java.lang.StringBuilder r9 = g.a.a.a.a.i(r9)
            java.lang.String r10 = r10.getName()
            r9.append(r10)
            r9.append(r2)
            r9.append(r8)
            java.lang.String r10 = " is not valid for type "
            r9.append(r10)
            r9.append(r0)
            java.lang.Class r10 = r0.i()
            if (r10 == 0) goto L_0x00f0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = ", maybe should be "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.append(r10)
        L_0x00f0:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L_0x00fa:
            java.lang.String r1 = r12.D
            java.lang.String r5 = r11.getName()
            boolean r6 = r12.f3872k
            java.lang.String r7 = "Field "
            if (r6 != 0) goto L_0x0214
            boolean r6 = r12.w
            if (r6 != 0) goto L_0x0214
            if (r1 == 0) goto L_0x010e
            goto L_0x0214
        L_0x010e:
            boolean r1 = r12.F
            if (r1 == 0) goto L_0x0190
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            java.lang.String r2 = "Field class for '"
            if (r10 == r1) goto L_0x0149
            java.lang.Class<g.f.a.b.k> r1 = g.f.a.b.k.class
            boolean r10 = r1.isAssignableFrom(r10)
            if (r10 == 0) goto L_0x0121
            goto L_0x0149
        L_0x0121:
            java.sql.SQLException r9 = new java.sql.SQLException
            java.lang.StringBuilder r10 = g.a.a.a.a.i(r2)
            java.lang.String r11 = r11.getName()
            r10.append(r11)
            java.lang.String r11 = "' must be of class "
            r10.append(r11)
            java.lang.Class<g.f.a.b.k> r11 = g.f.a.b.k.class
            java.lang.String r11 = r11.getSimpleName()
            r10.append(r11)
            java.lang.String r11 = " or Collection."
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0149:
            java.lang.reflect.Type r10 = r11.getGenericType()
            boolean r1 = r10 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L_0x0176
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type[] r10 = r10.getActualTypeArguments()
            int r10 = r10.length
            if (r10 == 0) goto L_0x015c
            goto L_0x0257
        L_0x015c:
            java.sql.SQLException r9 = new java.sql.SQLException
            java.lang.StringBuilder r10 = g.a.a.a.a.i(r2)
            java.lang.String r11 = r11.getName()
            r10.append(r11)
            java.lang.String r11 = "' must be a parameterized Collection with at least 1 type."
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0176:
            java.sql.SQLException r9 = new java.sql.SQLException
            java.lang.StringBuilder r10 = g.a.a.a.a.i(r2)
            java.lang.String r11 = r11.getName()
            r10.append(r11)
            java.lang.String r11 = "' must be a parameterized Collection."
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0190:
            if (r0 != 0) goto L_0x0257
            if (r1 != 0) goto L_0x0257
            java.lang.Class<byte[]> r9 = byte[].class
            boolean r9 = r9.isAssignableFrom(r10)
            java.lang.String r12 = " for field '"
            java.lang.String r13 = "ORMLite does not know how to store "
            if (r9 != 0) goto L_0x01f0
            java.lang.Class<java.io.Serializable> r9 = java.io.Serializable.class
            boolean r9 = r9.isAssignableFrom(r10)
            if (r9 == 0) goto L_0x01cc
            java.sql.SQLException r9 = new java.sql.SQLException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            r0.append(r10)
            r0.append(r12)
            java.lang.String r10 = r11.getName()
            r0.append(r10)
            java.lang.String r10 = "'.  Use another class, custom persister, or to serialize it use dataType=DataType.SERIALIZABLE"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r9.<init>(r10)
            throw r9
        L_0x01cc:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r13)
            r12.append(r10)
            r12.append(r2)
            java.lang.String r10 = r11.getName()
            r12.append(r10)
            java.lang.String r10 = ". Use another class or a custom persister."
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r9.<init>(r10)
            throw r9
        L_0x01f0:
            java.sql.SQLException r9 = new java.sql.SQLException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            r0.append(r10)
            r0.append(r12)
            java.lang.String r10 = r11.getName()
            r0.append(r10)
            java.lang.String r10 = "'. byte[] fields must specify dataType=DataType.BYTE_ARRAY or SERIALIZABLE"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r9.<init>(r10)
            throw r9
        L_0x0214:
            if (r0 == 0) goto L_0x023f
            boolean r2 = r0.u()
            if (r2 != 0) goto L_0x021d
            goto L_0x023f
        L_0x021d:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r7)
            r11.append(r8)
            java.lang.String r12 = " is a primitive class "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = " but marked as foreign"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x023f:
            if (r1 != 0) goto L_0x0248
            java.lang.String r1 = "_id"
            java.lang.String r1 = g.a.a.a.a.w(r5, r1)
            goto L_0x024e
        L_0x0248:
            java.lang.String r2 = "_"
            java.lang.String r1 = g.a.a.a.a.c(r5, r2, r1)
        L_0x024e:
            r5 = r1
            java.lang.Class<g.f.a.b.k> r1 = g.f.a.b.k.class
            boolean r1 = r1.isAssignableFrom(r10)
            if (r1 != 0) goto L_0x03dc
        L_0x0257:
            java.lang.String r10 = r12.b
            if (r10 != 0) goto L_0x025e
            r8.f3875d = r5
            goto L_0x0260
        L_0x025e:
            r8.f3875d = r10
        L_0x0260:
            r8.f3876e = r12
            boolean r10 = r12.f3869h
            java.lang.String r1 = "Must specify one of id, generatedId, and generatedIdSequence with "
            if (r10 == 0) goto L_0x0288
            boolean r10 = r12.f3870i
            if (r10 != 0) goto L_0x0273
            java.lang.String r10 = r12.f3871j
            if (r10 != 0) goto L_0x0273
            r8.f3877f = r13
            goto L_0x02bd
        L_0x0273:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = g.a.a.a.a.i(r1)
            java.lang.String r11 = r11.getName()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0288:
            boolean r10 = r12.f3870i
            if (r10 == 0) goto L_0x02ad
            java.lang.String r10 = r12.f3871j
            if (r10 != 0) goto L_0x0298
            r8.f3877f = r13
            r8.f3878g = r13
            java.util.Objects.requireNonNull(r9)
            goto L_0x02bf
        L_0x0298:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = g.a.a.a.a.i(r1)
            java.lang.String r11 = r11.getName()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x02ad:
            java.lang.String r10 = r12.f3871j
            if (r10 == 0) goto L_0x02bb
            r8.f3877f = r13
            r8.f3878g = r13
            java.util.Objects.requireNonNull(r9)
            r8.f3879h = r10
            goto L_0x02c1
        L_0x02bb:
            r8.f3877f = r3
        L_0x02bd:
            r8.f3878g = r3
        L_0x02bf:
            r8.f3879h = r4
        L_0x02c1:
            boolean r10 = r8.f3877f
            if (r10 == 0) goto L_0x02ea
            boolean r10 = r12.f3872k
            if (r10 != 0) goto L_0x02ce
            boolean r10 = r12.w
            if (r10 != 0) goto L_0x02ce
            goto L_0x02ea
        L_0x02ce:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Id field "
            java.lang.StringBuilder r10 = g.a.a.a.a.i(r10)
            java.lang.String r11 = r11.getName()
            r10.append(r11)
            java.lang.String r11 = " cannot also be a foreign object"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x02ea:
            boolean r10 = r12.f3873l
            if (r10 == 0) goto L_0x02fb
            java.lang.reflect.Method r10 = g.f.a.d.f.a(r11, r9, r13)
            r8.f3880i = r10
            java.lang.reflect.Method r10 = g.f.a.d.f.e(r11, r9, r13)
            r8.f3881j = r10
            goto L_0x0325
        L_0x02fb:
            boolean r10 = r11.isAccessible()
            if (r10 != 0) goto L_0x0321
            r11.setAccessible(r13)     // Catch:{ SecurityException -> 0x0305 }
            goto L_0x0321
        L_0x0305:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Could not open access to field "
            java.lang.StringBuilder r10 = g.a.a.a.a.i(r10)
            java.lang.String r11 = r11.getName()
            r10.append(r11)
            java.lang.String r11 = ".  You may have to set useGetSet=true to fix."
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0321:
            r8.f3880i = r4
            r8.f3881j = r4
        L_0x0325:
            boolean r10 = r12.z
            if (r10 == 0) goto L_0x0348
            boolean r10 = r12.f3870i
            if (r10 == 0) goto L_0x032e
            goto L_0x0348
        L_0x032e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = g.a.a.a.a.i(r7)
            java.lang.String r11 = r11.getName()
            r10.append(r11)
            java.lang.String r11 = " must be a generated-id if allowGeneratedIdInsert = true"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0348:
            boolean r10 = r12.w
            if (r10 == 0) goto L_0x036b
            boolean r10 = r12.f3872k
            if (r10 == 0) goto L_0x0351
            goto L_0x036b
        L_0x0351:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = g.a.a.a.a.i(r7)
            java.lang.String r11 = r11.getName()
            r10.append(r11)
            java.lang.String r11 = " must have foreign = true if foreignAutoRefresh = true"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x036b:
            boolean r10 = r12.B
            if (r10 == 0) goto L_0x038e
            boolean r10 = r12.f3872k
            if (r10 == 0) goto L_0x0374
            goto L_0x038e
        L_0x0374:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = g.a.a.a.a.i(r7)
            java.lang.String r11 = r11.getName()
            r10.append(r11)
            java.lang.String r11 = " must have foreign = true if foreignAutoCreate = true"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x038e:
            java.lang.String r10 = r12.D
            if (r10 == 0) goto L_0x03b1
            boolean r10 = r12.f3872k
            if (r10 == 0) goto L_0x0397
            goto L_0x03b1
        L_0x0397:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = g.a.a.a.a.i(r7)
            java.lang.String r11 = r11.getName()
            r10.append(r11)
            java.lang.String r11 = " must have foreign = true if foreignColumnName is set"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x03b1:
            boolean r10 = r12.C
            if (r10 == 0) goto L_0x03d8
            if (r0 == 0) goto L_0x03be
            boolean r10 = r0.n()
            if (r10 == 0) goto L_0x03be
            goto L_0x03d8
        L_0x03be:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = g.a.a.a.a.i(r7)
            java.lang.String r11 = r11.getName()
            r10.append(r11)
            java.lang.String r11 = " is not a valid type to be a version field"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x03d8:
            r8.a(r9, r0)
            return
        L_0x03dc:
            java.sql.SQLException r9 = new java.sql.SQLException
            java.lang.String r12 = "Field '"
            java.lang.StringBuilder r12 = g.a.a.a.a.i(r12)
            java.lang.String r11 = r11.getName()
            r12.append(r11)
            java.lang.String r11 = "' in class "
            r12.append(r11)
            r12.append(r10)
            java.lang.String r10 = "' should use the @"
            r12.append(r10)
            java.lang.Class<g.f.a.d.j> r10 = g.f.a.d.j.class
            java.lang.String r10 = r10.getSimpleName()
            r12.append(r10)
            java.lang.String r10 = " annotation not foreign=true"
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.a.d.i.<init>(g.f.a.h.c, java.lang.String, java.lang.reflect.Field, g.f.a.d.f, java.lang.Class):void");
    }

    public final void a(g.f.a.c.c cVar, b bVar) throws SQLException {
        h hVar;
        Object obj;
        Objects.requireNonNull((g.f.a.c.d) cVar);
        if (bVar != null && bVar.a().ordinal() == 2) {
            if (bVar instanceof p0) {
                o0 o0Var = o0.f3926f;
                bVar = o0.f3926f;
            } else if (bVar instanceof l0) {
                k0 k0Var = k0.f3917f;
                bVar = k0.f3917f;
            } else {
                r rVar = r.f3931e;
                bVar = r.f3931e;
            }
        }
        this.f3883l = bVar;
        if (bVar == null) {
            f fVar = this.f3876e;
            if (!fVar.f3872k && !fVar.F) {
                throw new SQLException("Data persister for field " + this + " is null but the field is not a foreign or foreignCollection");
            }
            return;
        }
        int ordinal = bVar.a().ordinal();
        if (ordinal == 3) {
            hVar = b.a;
        } else if (ordinal != 14) {
            hVar = bVar;
        } else {
            hVar = e.f3902d;
        }
        this.o = hVar;
        if (this.f3878g && !bVar.x()) {
            StringBuilder i2 = g.a.a.a.a.i("Generated-id field '");
            i2.append(this.c.getName());
            i2.append("' in ");
            i2.append(this.c.getDeclaringClass().getSimpleName());
            i2.append(" can't be type ");
            i2.append(bVar.a());
            i2.append(".  Must be one of: ");
            d[] values = d.values();
            for (int i3 = 0; i3 < 39; i3++) {
                d dVar = values[i3];
                b a2 = dVar.a();
                if (a2 != null && a2.x()) {
                    i2.append(dVar);
                    i2.append(' ');
                }
            }
            throw new IllegalArgumentException(i2.toString());
        } else if (this.f3876e.n && !bVar.u()) {
            StringBuilder i4 = g.a.a.a.a.i("Field ");
            i4.append(this.c.getName());
            i4.append(" must be a primitive if set with throwIfNull");
            throw new SQLException(i4.toString());
        } else if (!this.f3877f || bVar.t()) {
            this.n = bVar.g(this);
            String str = this.f3876e.f3866e;
            if (str == null) {
                obj = null;
            } else if (!this.f3878g) {
                obj = this.o.h(this, str);
            } else {
                StringBuilder i5 = g.a.a.a.a.i("Field '");
                i5.append(this.c.getName());
                i5.append("' cannot be a generatedId and have a default value '");
                i5.append(str);
                i5.append("'");
                throw new SQLException(i5.toString());
            }
            this.f3884m = obj;
        } else {
            StringBuilder i6 = g.a.a.a.a.i("Field '");
            i6.append(this.c.getName());
            i6.append("' is of data type ");
            i6.append(bVar);
            i6.append(" which cannot be the ID field");
            throw new SQLException(i6.toString());
        }
    }

    public void b(Object obj, Object obj2, boolean z, m mVar) throws SQLException {
        Object obj3;
        c cVar = w;
        if (cVar.a.a(b.a.TRACE)) {
            Object obj4 = "null";
            if (obj == null) {
                obj3 = obj4;
            } else {
                obj3 = obj.getClass();
            }
            if (obj2 != null) {
                obj4 = obj2.getClass();
            }
            cVar.j("assiging from data {}, val {}: {}", obj3, obj4, obj2);
        }
        if (!(this.q == null || obj2 == null)) {
            Object e2 = e(obj);
            if (e2 == null || !e2.equals(obj2)) {
                Objects.requireNonNull(this.t);
                if (!z) {
                    ThreadLocal<a> threadLocal = v;
                    a aVar = threadLocal.get();
                    if (aVar == null) {
                        if (this.f3876e.w) {
                            aVar = new a();
                            threadLocal.set(aVar);
                        }
                        Object a2 = this.r.a();
                        this.p.b(a2, obj2, false, mVar);
                        obj2 = a2;
                    }
                    int i2 = aVar.a;
                    if (i2 == 0) {
                        f fVar = this.f3876e;
                        boolean z2 = fVar.w;
                        if (z2) {
                            aVar.b = z2 ? fVar.x : -1;
                        }
                        Object a22 = this.r.a();
                        this.p.b(a22, obj2, false, mVar);
                        obj2 = a22;
                    }
                    if (i2 < aVar.b) {
                        if (this.u == null) {
                            this.u = f.e(((g.f.a.a.b) this.a).f3835e, this.t.f3844f, this.p);
                        }
                        aVar.a++;
                        try {
                            obj2 = this.u.f(((g.f.a.a.b) this.a).b(this.b), obj2, mVar);
                            Objects.requireNonNull((g.f.a.a.b) this.a);
                            int i3 = aVar.a - 1;
                            aVar.a = i3;
                            if (i3 <= 0) {
                                threadLocal.remove();
                            }
                        } catch (Throwable th) {
                            int i4 = aVar.a - 1;
                            aVar.a = i4;
                            if (i4 <= 0) {
                                v.remove();
                            }
                            throw th;
                        }
                    }
                    Object a222 = this.r.a();
                    this.p.b(a222, obj2, false, mVar);
                    obj2 = a222;
                }
            } else {
                return;
            }
        }
        Method method = this.f3881j;
        if (method == null) {
            try {
                this.c.set(obj, obj2);
            } catch (IllegalArgumentException e3) {
                throw e.e.i.b.j("Could not assign object '" + obj2 + "' of type " + obj2.getClass() + " to field " + this, e3);
            } catch (IllegalAccessException e4) {
                throw e.e.i.b.j("Could not assign object '" + obj2 + "' of type " + obj2.getClass() + "' to field " + this, e4);
            }
        } else {
            try {
                method.invoke(obj, new Object[]{obj2});
            } catch (Exception e5) {
                StringBuilder i5 = g.a.a.a.a.i("Could not call ");
                i5.append(this.f3881j);
                i5.append(" on object with '");
                i5.append(obj2);
                i5.append("' for ");
                i5.append(this);
                throw e.e.i.b.j(i5.toString(), e5);
            }
        }
    }

    public void c(g.f.a.h.c cVar, Class<?> cls) throws SQLException {
        g.f.a.i.c<T, ID> cVar2;
        g.f.a.b.a<?, ?> aVar;
        i iVar;
        i iVar2;
        i iVar3;
        Class<?> type = this.c.getType();
        g.f.a.c.c cVar3 = ((g.f.a.a.b) cVar).f3835e;
        f fVar = this.f3876e;
        String str = fVar.D;
        f<Object, Object> fVar2 = null;
        if (fVar.w || str != null) {
            Objects.requireNonNull(fVar);
            aVar = (g.f.a.b.a) h.b(cVar, type);
            cVar2 = aVar.f3844f;
            iVar2 = cVar2.f4020g;
            if (iVar2 != null) {
                if (str == null) {
                    iVar3 = iVar2;
                } else {
                    iVar3 = cVar2.b(str);
                }
                iVar = null;
                fVar2 = f.e(cVar3, cVar2, iVar3);
            } else {
                throw new IllegalArgumentException("Foreign field " + type + " does not have id field");
            }
        } else if (fVar.f3872k) {
            b bVar = this.f3883l;
            if (bVar == null || !bVar.u()) {
                Objects.requireNonNull(this.f3876e);
                aVar = (g.f.a.b.a) h.b(cVar, type);
                cVar2 = aVar.f3844f;
                i iVar4 = cVar2.f4020g;
                if (iVar4 == null) {
                    throw new IllegalArgumentException("Foreign field " + type + " does not have id field");
                } else if (!this.f3876e.B || iVar4.f3878g) {
                    iVar3 = iVar4;
                    iVar2 = iVar3;
                    iVar = null;
                } else {
                    StringBuilder i2 = g.a.a.a.a.i("Field ");
                    i2.append(this.c.getName());
                    i2.append(", if foreignAutoCreate = true then class ");
                    i2.append(type.getSimpleName());
                    i2.append(" must have id field with generatedId = true");
                    throw new IllegalArgumentException(i2.toString());
                }
            } else {
                throw new IllegalArgumentException("Field " + this + " is a primitive class " + type + " but marked as foreign");
            }
        } else if (!fVar.F) {
            aVar = null;
            cVar2 = null;
            iVar3 = null;
            iVar2 = null;
            iVar = null;
        } else if (type == Collection.class || k.class.isAssignableFrom(type)) {
            Type genericType = this.c.getGenericType();
            if (genericType instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
                if (actualTypeArguments.length != 0) {
                    int i3 = 0;
                    if (actualTypeArguments[0] instanceof TypeVariable) {
                        actualTypeArguments = ((ParameterizedType) cls.getGenericSuperclass()).getActualTypeArguments();
                    }
                    if (actualTypeArguments[0] instanceof Class) {
                        Class cls2 = (Class) actualTypeArguments[0];
                        Objects.requireNonNull(this.f3876e);
                        aVar = (g.f.a.b.a) h.b(cVar, cls2);
                        String str2 = this.f3876e.K;
                        i[] iVarArr = aVar.f3844f.f4018e;
                        int length = iVarArr.length;
                        while (i3 < length) {
                            iVar = iVarArr[i3];
                            if (iVar.l() != cls || (str2 != null && !iVar.c.getName().equals(str2))) {
                                i3++;
                            } else {
                                f fVar3 = iVar.f3876e;
                                if (fVar3.f3872k || fVar3.w) {
                                    cVar2 = null;
                                    iVar3 = null;
                                    iVar2 = null;
                                } else {
                                    throw new SQLException("Foreign collection object " + cls2 + " for field '" + this.c.getName() + "' contains a field of class " + cls + " but it's not foreign");
                                }
                            }
                        }
                        StringBuilder i4 = g.a.a.a.a.i("Foreign collection class ");
                        i4.append(cls2.getName());
                        i4.append(" for field '");
                        i4.append(this.c.getName());
                        i4.append("' column-name does not contain a foreign field");
                        if (str2 != null) {
                            i4.append(" named '");
                            i4.append(str2);
                            i4.append('\'');
                        }
                        i4.append(" of class ");
                        i4.append(cls.getName());
                        throw new SQLException(i4.toString());
                    }
                    StringBuilder i5 = g.a.a.a.a.i("Field class for '");
                    i5.append(this.c.getName());
                    i5.append("' must be a parameterized Collection whose generic argument is an entity class not: ");
                    i5.append(actualTypeArguments[0]);
                    throw new SQLException(i5.toString());
                }
                StringBuilder i6 = g.a.a.a.a.i("Field class for '");
                i6.append(this.c.getName());
                i6.append("' must be a parameterized Collection with at least 1 type.");
                throw new SQLException(i6.toString());
            }
            StringBuilder i7 = g.a.a.a.a.i("Field class for '");
            i7.append(this.c.getName());
            i7.append("' must be a parameterized Collection.");
            throw new SQLException(i7.toString());
        } else {
            StringBuilder i8 = g.a.a.a.a.i("Field class for '");
            i8.append(this.c.getName());
            i8.append("' must be of class ");
            i8.append(k.class.getSimpleName());
            i8.append(" or Collection.");
            throw new SQLException(i8.toString());
        }
        this.u = fVar2;
        this.r = cVar2;
        this.s = iVar;
        this.t = aVar;
        this.p = iVar2;
        this.q = iVar3;
        if (iVar3 != null) {
            a(cVar3, iVar3.f3883l);
        }
    }

    public Object d(Object obj) throws SQLException {
        if (obj == null) {
            return null;
        }
        return this.o.m(this, obj);
    }

    public Object e(Object obj) throws SQLException {
        Object f2 = f(obj);
        i iVar = this.q;
        return (iVar == null || f2 == null) ? f2 : iVar.f(f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0028
            java.lang.Class r1 = r4.getClass()
            java.lang.Class<g.f.a.d.i> r2 = g.f.a.d.i.class
            if (r1 == r2) goto L_0x000c
            goto L_0x0028
        L_0x000c:
            g.f.a.d.i r4 = (g.f.a.d.i) r4
            java.lang.reflect.Field r1 = r3.c
            java.lang.reflect.Field r2 = r4.c
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0028
            java.lang.Class<?> r1 = r3.f3882k
            java.lang.Class<?> r4 = r4.f3882k
            if (r1 != 0) goto L_0x0021
            if (r4 != 0) goto L_0x0028
            goto L_0x0027
        L_0x0021:
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x0028
        L_0x0027:
            r0 = 1
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.a.d.i.equals(java.lang.Object):boolean");
    }

    public <FV> FV f(Object obj) throws SQLException {
        Method method = this.f3880i;
        if (method == null) {
            try {
                return this.c.get(obj);
            } catch (Exception e2) {
                throw e.e.i.b.j("Could not get field value for " + this, e2);
            }
        } else {
            try {
                return method.invoke(obj, new Object[0]);
            } catch (Exception e3) {
                StringBuilder i2 = g.a.a.a.a.i("Could not call ");
                i2.append(this.f3880i);
                i2.append(" for ");
                i2.append(this);
                throw e.e.i.b.j(i2.toString(), e3);
            }
        }
    }

    public Object g() {
        return this.n;
    }

    public String h() {
        return this.c.getName();
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String i() {
        return this.f3876e.p;
    }

    public String j() {
        f fVar = this.f3876e;
        String str = this.b;
        if (fVar.s && fVar.t == null) {
            fVar.t = fVar.b(str);
        }
        return fVar.t;
    }

    public k k() {
        return this.o.a();
    }

    public Class<?> l() {
        return this.c.getType();
    }

    public String m() {
        f fVar = this.f3876e;
        String str = this.b;
        if (fVar.u && fVar.v == null) {
            fVar.v = fVar.b(str);
        }
        return fVar.v;
    }

    public Enum<?> n() {
        return this.f3876e.f3874m;
    }

    public final boolean o(Object obj) {
        if (obj == null) {
            return true;
        }
        return obj.equals(this.c.getType() == Boolean.TYPE ? Boolean.FALSE : (this.c.getType() == Byte.TYPE || this.c.getType() == Byte.class) ? (byte) 0 : (this.c.getType() == Character.TYPE || this.c.getType() == Character.class) ? 0 : (this.c.getType() == Short.TYPE || this.c.getType() == Short.class) ? (short) 0 : (this.c.getType() == Integer.TYPE || this.c.getType() == Integer.class) ? 0 : (this.c.getType() == Long.TYPE || this.c.getType() == Long.class) ? 0L : (this.c.getType() == Float.TYPE || this.c.getType() == Float.class) ? Float.valueOf(0.0f) : (this.c.getType() == Double.TYPE || this.c.getType() == Double.class) ? Double.valueOf(0.0d) : null);
    }

    public boolean p() {
        return this.f3879h != null;
    }

    public boolean q() {
        return this.f3883l.l();
    }

    public <T> T r(g.f.a.h.e eVar, Map<String, Integer> map) throws SQLException {
        Integer num = map.get(this.f3875d);
        if (num == null) {
            String str = this.f3875d;
            g.f.a.a.d dVar = (g.f.a.a.d) eVar;
            int t2 = dVar.t(str);
            if (t2 < 0) {
                StringBuilder sb = new StringBuilder(str.length() + 4);
                sb.append('`');
                sb.append(str);
                sb.append('`');
                t2 = dVar.t(sb.toString());
                if (t2 < 0) {
                    String[] columnNames = dVar.b.getColumnNames();
                    StringBuilder n2 = g.a.a.a.a.n("Unknown field '", str, "' from the Android sqlite cursor, not in:");
                    n2.append(Arrays.toString(columnNames));
                    throw new SQLException(n2.toString());
                }
            }
            num = Integer.valueOf(t2);
            map.put(this.f3875d, num);
        }
        T w2 = this.o.w(this, eVar, num.intValue());
        if (this.f3876e.f3872k) {
            if (((g.f.a.a.d) eVar).v(num.intValue())) {
                return null;
            }
        } else if (this.f3883l.u()) {
            if (this.f3876e.n) {
                if (((g.f.a.a.d) eVar).v(num.intValue())) {
                    StringBuilder i2 = g.a.a.a.a.i("Results value for primitive field '");
                    i2.append(this.c.getName());
                    i2.append("' was an invalid null value");
                    throw new SQLException(i2.toString());
                }
            }
        } else if (!this.o.e()) {
            if (((g.f.a.a.d) eVar).v(num.intValue())) {
                return null;
            }
        }
        return w2;
    }

    public String toString() {
        return i.class.getSimpleName() + ":name=" + this.c.getName() + ",class=" + this.c.getDeclaringClass().getSimpleName();
    }
}
