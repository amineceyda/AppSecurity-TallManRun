package e.k;

import e.k.e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class b {
    public static b c = new b();
    public final Map<Class<?>, a> a = new HashMap();
    public final Map<Class<?>, Boolean> b = new HashMap();

    public static class a {
        public final Map<e.a, List<C0049b>> a = new HashMap();
        public final Map<C0049b, e.a> b;

        public a(Map<C0049b, e.a> map) {
            this.b = map;
            for (Map.Entry next : map.entrySet()) {
                e.a aVar = (e.a) next.getValue();
                List list = this.a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.a.put(aVar, list);
                }
                list.add(next.getKey());
            }
        }

        public static void a(List<C0049b> list, h hVar, e.a aVar, Object obj) {
            if (list != null) {
                int size = list.size() - 1;
                while (size >= 0) {
                    C0049b bVar = list.get(size);
                    Objects.requireNonNull(bVar);
                    try {
                        int i2 = bVar.a;
                        if (i2 == 0) {
                            bVar.b.invoke(obj, new Object[0]);
                        } else if (i2 == 1) {
                            bVar.b.invoke(obj, new Object[]{hVar});
                        } else if (i2 == 2) {
                            bVar.b.invoke(obj, new Object[]{hVar, aVar});
                        }
                        size--;
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    } catch (IllegalAccessException e3) {
                        throw new RuntimeException(e3);
                    }
                }
            }
        }
    }

    /* renamed from: e.k.b$b  reason: collision with other inner class name */
    public static final class C0049b {
        public final int a;
        public final Method b;

        public C0049b(int i2, Method method) {
            this.a = i2;
            this.b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0049b)) {
                return false;
            }
            C0049b bVar = (C0049b) obj;
            return this.a == bVar.a && this.b.getName().equals(bVar.b.getName());
        }

        public int hashCode() {
            return this.b.getName().hashCode() + (this.a * 31);
        }
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i2;
        a b2;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (b2 = b(superclass)) == null)) {
            hashMap.putAll(b2.b);
        }
        for (Class b3 : cls.getInterfaces()) {
            for (Map.Entry next : b(b3).b.entrySet()) {
                c(hashMap, (C0049b) next.getKey(), (e.a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            o oVar = (o) method.getAnnotation(o.class);
            if (oVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else if (parameterTypes[0].isAssignableFrom(h.class)) {
                    i2 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                e.a value = oVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(e.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == e.a.ON_ANY) {
                        i2 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new C0049b(i2, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.a.put(cls, aVar);
        this.b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    public a b(Class<?> cls) {
        a aVar = this.a.get(cls);
        return aVar != null ? aVar : a(cls, (Method[]) null);
    }

    public final void c(Map<C0049b, e.a> map, C0049b bVar, e.a aVar, Class<?> cls) {
        e.a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.b;
            StringBuilder i2 = g.a.a.a.a.i("Method ");
            i2.append(method.getName());
            i2.append(" in ");
            i2.append(cls.getName());
            i2.append(" already declared with different @OnLifecycleEvent value: previous value ");
            i2.append(aVar2);
            i2.append(", new value ");
            i2.append(aVar);
            throw new IllegalArgumentException(i2.toString());
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }
}
