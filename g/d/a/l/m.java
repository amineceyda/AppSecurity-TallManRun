package g.d.a.l;

import android.text.TextUtils;
import java.security.MessageDigest;
import java.util.Objects;
import org.slf4j.helpers.MessageFormatter;

public final class m<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final b<Object> f2411e = new a();
    public final T a;
    public final b<T> b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public volatile byte[] f2412d;

    public class a implements b<Object> {
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public interface b<T> {
        void a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    public m(String str, T t, b<T> bVar) {
        if (!TextUtils.isEmpty(str)) {
            this.c = str;
            this.a = t;
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.b = bVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static <T> m<T> a(String str, T t) {
        return new m<>(str, t, f2411e);
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.c.equals(((m) obj).c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("Option{key='");
        i2.append(this.c);
        i2.append('\'');
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
