package g.i.c.a.a.x.d;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class f {

    /* renamed from: d  reason: collision with root package name */
    public static volatile f f4556d;
    public h a;
    public g.i.c.a.a.x.b.a b = g.i.c.a.a.x.b.a.b();
    public ConcurrentHashMap<String, ConcurrentHashMap<String, Object>> c = new ConcurrentHashMap<>();

    public class a implements Callable<List<Pair<String, T>>> {
        public final /* synthetic */ Class a;

        public a(Class cls) {
            this.a = cls;
        }

        public Object call() throws Exception {
            StringBuilder sb;
            String str;
            h hVar = f.this.a;
            Class cls = this.a;
            Objects.requireNonNull(hVar);
            LinkedList linkedList = new LinkedList();
            String a2 = hVar.a(hVar.a.a(cls), (String) null);
            if (!TextUtils.isEmpty(a2)) {
                try {
                    JSONObject jSONObject = new JSONObject(a2);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object a3 = hVar.b.a(jSONObject.getString(next), cls);
                        if (a3 != null) {
                            linkedList.add(new Pair(next, a3));
                        }
                    }
                } catch (JSONException e2) {
                    sb = g.a.a.a.a.i("json parse failure, error: ");
                    str = e2.getLocalizedMessage();
                    sb.append(str);
                    g.c.b.b.f.x("SpService", sb.toString());
                    return linkedList;
                } catch (Error e3) {
                    sb = g.a.a.a.a.i("getAllObjects, error: ");
                    str = e3.getLocalizedMessage();
                    sb.append(str);
                    g.c.b.b.f.x("SpService", sb.toString());
                    return linkedList;
                }
            }
            return linkedList;
        }
    }

    public f(Context context) {
        this.a = new h(context);
    }

    public final <T> T a(Callable<T> callable) {
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            try {
                return callable.call();
            } catch (Exception e2) {
                StringBuilder i2 = g.a.a.a.a.i("operate sharedPreference exception: ");
                i2.append(e2.getLocalizedMessage());
                g.c.b.b.f.x("SpCache", i2.toString());
                return null;
            }
        } else {
            throw new RuntimeException("Cannot be called on the main thread!");
        }
    }

    public final <T> void b(Class<T> cls) {
        String a2 = this.b.a(cls);
        if (!this.c.containsKey(a2)) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (Pair pair : (List) a(new a(cls))) {
                concurrentHashMap.put(pair.first, pair.second);
            }
            this.c.putIfAbsent(a2, concurrentHashMap);
        }
    }
}
