package g.e.c.t;

import com.google.gson.JsonIOException;
import g.a.a.a.a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

public class j implements s<T> {
    public final /* synthetic */ Type a;

    public j(g gVar, Type type) {
        this.a = type;
    }

    public T a() {
        Type type = this.a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            StringBuilder i2 = a.i("Invalid EnumSet type: ");
            i2.append(this.a.toString());
            throw new JsonIOException(i2.toString());
        }
        StringBuilder i3 = a.i("Invalid EnumSet type: ");
        i3.append(this.a.toString());
        throw new JsonIOException(i3.toString());
    }
}
