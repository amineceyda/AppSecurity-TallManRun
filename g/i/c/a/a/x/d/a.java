package g.i.c.a.a.x.d;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class a implements g.i.c.a.a.x.a {
    public static volatile a b;
    public f a;

    public a(Context context) {
        if (f.f4556d == null) {
            synchronized (f.class) {
                if (f.f4556d == null) {
                    f.f4556d = new f(context);
                }
            }
        }
        this.a = f.f4556d;
        g.i.c.a.a.x.b.a.b();
    }

    public <T> void a(List<T> list, List<String> list2) {
        f fVar = this.a;
        Objects.requireNonNull(fVar);
        if (list.size() != list2.size()) {
            throw new IllegalArgumentException("Two lists have different sizes.");
        } else if (!list.isEmpty()) {
            int i2 = 0;
            Class<?> cls = list.get(0).getClass();
            fVar.b(cls);
            synchronized (fVar.c) {
                Map map = fVar.c.get(fVar.b.a(cls));
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
                fVar.a(new g(fVar, new c(fVar, list, list2)));
            }
        }
    }

    public <T> void b(T t, String str) {
        f fVar = this.a;
        Objects.requireNonNull(fVar);
        if (!TextUtils.isEmpty(str)) {
            fVar.b(t.getClass());
            synchronized (fVar.c) {
                fVar.c.get(fVar.b.a(t.getClass())).put(str, t);
                fVar.a(new g(fVar, new b(fVar, t, str)));
            }
            return;
        }
        throw new IllegalArgumentException("Illegal object id!");
    }

    public <T> void c(Class<T> cls) {
        f fVar = this.a;
        fVar.b(cls);
        synchronized (fVar.c) {
            fVar.c.get(fVar.b.a(cls)).clear();
            fVar.a(new g(fVar, new e(fVar, cls)));
        }
    }

    public <T> boolean d(Class<T> cls, String str) {
        f fVar = this.a;
        fVar.b(cls);
        return fVar.c.get(fVar.b.a(cls)).containsKey(str);
    }

    public <T> List<T> e(Class<T> cls) {
        f fVar = this.a;
        fVar.b(cls);
        String a2 = fVar.b.a(cls);
        LinkedList<Pair> linkedList = new LinkedList<>();
        for (Map.Entry entry : fVar.c.get(a2).entrySet()) {
            linkedList.add(new Pair(entry.getKey(), cls.cast(entry.getValue())));
        }
        ArrayList arrayList = new ArrayList();
        for (Pair pair : linkedList) {
            arrayList.add(pair.second);
        }
        return arrayList;
    }

    public <T> void f(Class<T> cls, String str) {
        f fVar = this.a;
        fVar.b(cls);
        synchronized (fVar.c) {
            ConcurrentHashMap concurrentHashMap = fVar.c.get(fVar.b.a(cls));
            if (concurrentHashMap.containsKey(str)) {
                concurrentHashMap.remove(str);
                fVar.a(new g(fVar, new d(fVar, cls, str)));
            }
        }
    }
}
