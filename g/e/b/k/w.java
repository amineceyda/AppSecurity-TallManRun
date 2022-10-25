package g.e.b.k;

import g.e.b.o.a;
import g.e.b.o.b;
import g.e.b.o.c;
import g.e.b.o.d;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public class w implements d, c {
    public final Map<Class<?>, ConcurrentHashMap<b<Object>, Executor>> a = new HashMap();
    public Queue<a<?>> b = new ArrayDeque();

    public w(Executor executor) {
    }

    public synchronized <T> void a(Class<T> cls, Executor executor, b<? super T> bVar) {
        if (!this.a.containsKey(cls)) {
            this.a.put(cls, new ConcurrentHashMap());
        }
        this.a.get(cls).put(bVar, executor);
    }
}
