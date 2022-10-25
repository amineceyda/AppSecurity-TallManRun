package g.i.c.a.a.x.c;

import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class a implements g.i.c.a.a.x.a {
    public g a;

    public <T> void a(List<T> list, List<String> list2) {
        g gVar = this.a;
        Objects.requireNonNull(gVar);
        if (list.size() != list2.size()) {
            throw new IllegalArgumentException("Two lists have different sizes.");
        } else if (!list.isEmpty()) {
            int i2 = 0;
            Class<?> cls = list.get(0).getClass();
            gVar.b(cls);
            synchronized (gVar.c) {
                Map map = gVar.c.get(gVar.b.a(cls));
                int size = list.size();
                while (i2 < size) {
                    String str = list2.get(i2);
                    T t = list.get(i2);
                    if (t == null || TextUtils.isEmpty(str)) {
                        throw new IllegalArgumentException("Object is null or id is null.");
                    } else if (t.getClass() == cls) {
                        map.put(str, t);
                        i2++;
                    } else {
                        throw new IllegalArgumentException("Object type is different from others.");
                    }
                }
                gVar.a(new f(gVar, new c(gVar, list, list2)), true);
            }
        }
    }

    public <T> void b(T t, String str) {
        g gVar = this.a;
        Objects.requireNonNull(gVar);
        if (!TextUtils.isEmpty(str)) {
            gVar.b(t.getClass());
            synchronized (gVar.c) {
                gVar.c.get(gVar.b.a(t.getClass())).put(str, t);
                gVar.a(new f(gVar, new b(gVar, t, str)), true);
            }
            return;
        }
        throw new IllegalArgumentException("Illegal object id!");
    }

    public <T> void c(Class<T> cls) {
        g gVar = this.a;
        gVar.b(cls);
        synchronized (gVar.c) {
            gVar.c.get(gVar.b.a(cls)).clear();
            gVar.a(new f(gVar, new e(gVar, cls)), true);
        }
    }

    public <T> boolean d(Class<T> cls, String str) {
        g gVar = this.a;
        gVar.b(cls);
        return gVar.c.get(gVar.b.a(cls)).containsKey(str);
    }

    public <T> List<T> e(Class<T> cls) {
        g gVar = this.a;
        gVar.b(cls);
        String a2 = gVar.b.a(cls);
        LinkedList<Pair> linkedList = new LinkedList<>();
        for (Map.Entry entry : gVar.c.get(a2).entrySet()) {
            linkedList.add(new Pair(entry.getKey(), cls.cast(entry.getValue())));
        }
        ArrayList arrayList = new ArrayList();
        for (Pair pair : linkedList) {
            arrayList.add(pair.second);
        }
        return arrayList;
    }

    public <T> void f(Class<T> cls, String str) {
        g gVar = this.a;
        gVar.b(cls);
        synchronized (gVar.c) {
            ConcurrentHashMap concurrentHashMap = gVar.c.get(gVar.b.a(cls));
            if (concurrentHashMap.containsKey(str)) {
                concurrentHashMap.remove(str);
                gVar.a(new f(gVar, new d(gVar, cls, str)), true);
            }
        }
    }
}
