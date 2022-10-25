package g.f.a.b;

import g.f.a.g.d;
import g.f.a.g.f;
import g.f.a.h.c;
import java.sql.SQLException;
import java.util.List;

public interface g<T, ID> extends e<T> {
    c O();

    int P(String str, String... strArr) throws SQLException;

    int Q(T t) throws SQLException;

    int S(T t) throws SQLException;

    f<T> V(d<T> dVar, int i2) throws SQLException;

    Class<T> a();

    f<T> iterator();

    f<T, ID> q();

    void s();

    int t(T t) throws SQLException;

    List<T> u() throws SQLException;
}
