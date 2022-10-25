package g.f.a.a;

import android.database.Cursor;
import g.a.a.a.a;
import g.f.a.b.m;
import g.f.a.c.c;
import g.f.a.h.e;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class d implements e {

    /* renamed from: g  reason: collision with root package name */
    public static final c f3837g = new g.f.a.c.d();
    public final Cursor b;
    public final String[] c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, Integer> f3838d;

    /* renamed from: e  reason: collision with root package name */
    public final m f3839e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3840f;

    public d(Cursor cursor, m mVar, boolean z) {
        this.b = cursor;
        String[] columnNames = cursor.getColumnNames();
        this.c = columnNames;
        if (columnNames.length >= 8) {
            this.f3838d = new HashMap();
            int i2 = 0;
            while (true) {
                String[] strArr = this.c;
                if (i2 >= strArr.length) {
                    break;
                }
                this.f3838d.put(strArr[i2], Integer.valueOf(i2));
                i2++;
            }
        } else {
            this.f3838d = null;
        }
        this.f3839e = mVar;
        this.f3840f = z;
    }

    public boolean a() {
        return this.b.moveToFirst();
    }

    public boolean b(int i2) {
        return !this.b.isNull(i2) && this.b.getShort(i2) != 0;
    }

    public void close() {
        this.b.close();
    }

    public byte d(int i2) {
        return (byte) this.b.getShort(i2);
    }

    public byte[] f(int i2) {
        return this.b.getBlob(i2);
    }

    public char g(int i2) throws SQLException {
        String string = this.b.getString(i2);
        if (string == null || string.length() == 0) {
            return 0;
        }
        if (string.length() == 1) {
            return string.charAt(0);
        }
        throw new SQLException(a.q("More than 1 character stored in database column: ", i2));
    }

    public double j(int i2) {
        return this.b.getDouble(i2);
    }

    public float k(int i2) {
        return this.b.getFloat(i2);
    }

    public int n(int i2) {
        return this.b.getInt(i2);
    }

    public long o(int i2) {
        return this.b.getLong(i2);
    }

    public short q(int i2) {
        return this.b.getShort(i2);
    }

    public String s(int i2) {
        return this.b.getString(i2);
    }

    public final int t(String str) {
        Map<String, Integer> map = this.f3838d;
        if (map == null) {
            int i2 = 0;
            while (true) {
                String[] strArr = this.c;
                if (i2 >= strArr.length) {
                    return -1;
                }
                if (strArr[i2].equals(str)) {
                    return i2;
                }
                i2++;
            }
        } else {
            Integer num = map.get(str);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }
    }

    public String toString() {
        return d.class.getSimpleName() + "@" + Integer.toHexString(hashCode());
    }

    public boolean u() {
        return this.b.moveToNext();
    }

    public boolean v(int i2) {
        return this.b.isNull(i2);
    }
}
