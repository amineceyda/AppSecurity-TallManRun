package g.f.a.d;

import g.f.a.d.l.a0;
import g.f.a.d.l.b0;
import g.f.a.d.l.c0;
import g.f.a.d.l.d0;
import g.f.a.d.l.e;
import g.f.a.d.l.e0;
import g.f.a.d.l.f;
import g.f.a.d.l.f0;
import g.f.a.d.l.g;
import g.f.a.d.l.g0;
import g.f.a.d.l.h;
import g.f.a.d.l.h0;
import g.f.a.d.l.i;
import g.f.a.d.l.i0;
import g.f.a.d.l.j;
import g.f.a.d.l.j0;
import g.f.a.d.l.k;
import g.f.a.d.l.l;
import g.f.a.d.l.l0;
import g.f.a.d.l.m;
import g.f.a.d.l.m0;
import g.f.a.d.l.n;
import g.f.a.d.l.n0;
import g.f.a.d.l.o;
import g.f.a.d.l.p;
import g.f.a.d.l.p0;
import g.f.a.d.l.q;
import g.f.a.d.l.q0;
import g.f.a.d.l.r;
import g.f.a.d.l.s;
import g.f.a.d.l.t;
import g.f.a.d.l.u;
import g.f.a.d.l.v;
import g.f.a.d.l.w;
import g.f.a.d.l.x;
import g.f.a.d.l.y;
import g.f.a.d.l.z;

public enum d {
    STRING(n0.f3924d),
    LONG_STRING(e0.f3903e),
    STRING_BYTES(m0.f3922d),
    BOOLEAN(j.f3914e),
    BOOLEAN_OBJ(i.f3912d),
    BOOLEAN_CHAR(g.f3906f),
    BOOLEAN_INTEGER(h.f3910h),
    DATE(t.f3937e),
    DATE_LONG(q.f3929e),
    DATE_INTEGER(p.f3927e),
    DATE_STRING(r.f3931e),
    CHAR(n.f3923e),
    CHAR_OBJ(o.f3925d),
    BYTE(m.f3921e),
    BYTE_ARRAY(k.f3916d),
    BYTE_OBJ(l.f3918d),
    SHORT(j0.f3915e),
    SHORT_OBJ(i0.f3913d),
    INTEGER(b0.f3898e),
    INTEGER_OBJ(c0.f3899d),
    LONG(f0.f3905e),
    LONG_OBJ(d0.f3901d),
    FLOAT(a0.f3896e),
    FLOAT_OBJ(z.f3943d),
    DOUBLE(v.f3939e),
    DOUBLE_OBJ(u.f3938d),
    SERIALIZABLE(h0.f3911d),
    ENUM_STRING(x.f3941d),
    ENUM_TO_STRING(y.f3942e),
    ENUM_INTEGER(w.f3940d),
    UUID(q0.f3930d),
    UUID_NATIVE(g0.f3907e),
    BIG_INTEGER(f.f3904d),
    BIG_DECIMAL(e.f3902d),
    BIG_DECIMAL_NUMERIC(g.f.a.d.l.d.f3900d),
    DATE_TIME(s.f3932d),
    SQL_DATE(l0.f3919f),
    TIME_STAMP(p0.f3928f),
    UNKNOWN((String) null);
    
    private final b dataPersister;

    /* access modifiers changed from: public */
    d(b bVar) {
        this.dataPersister = bVar;
    }

    public b a() {
        return this.dataPersister;
    }
}
