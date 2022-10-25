package e.a.e;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import e.k.e;
import e.k.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public abstract class d {
    public Random a = new Random();
    public final Map<Integer, String> b = new HashMap();
    public final Map<String, Integer> c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, c> f918d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<String> f919e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final transient Map<String, b<?>> f920f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, Object> f921g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f922h = new Bundle();

    public class a extends b<I> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;
        public final /* synthetic */ e.a.e.f.a c;

        public a(String str, int i2, e.a.e.f.a aVar) {
            this.a = str;
            this.b = i2;
            this.c = aVar;
        }

        public void b(I i2, e.e.b.c cVar) {
            d.this.f919e.add(this.a);
            d.this.b(this.b, this.c, i2, cVar);
        }

        public void c() {
            d.this.e(this.a);
        }
    }

    public static class b<O> {
        public final a<O> a;
        public final e.a.e.f.a<?, O> b;

        public b(a<O> aVar, e.a.e.f.a<?, O> aVar2) {
            this.a = aVar;
            this.b = aVar2;
        }
    }

    public static class c {
        public final e a;
        public final ArrayList<f> b = new ArrayList<>();

        public c(e eVar) {
            this.a = eVar;
        }
    }

    public final boolean a(int i2, int i3, Intent intent) {
        a<O> aVar;
        String str = this.b.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        this.f919e.remove(str);
        b bVar = this.f920f.get(str);
        if (bVar == null || (aVar = bVar.a) == null) {
            this.f921g.remove(str);
            this.f922h.putParcelable(str, new ActivityResult(i3, intent));
            return true;
        }
        aVar.a(bVar.b.c(i3, intent));
        return true;
    }

    public abstract <I, O> void b(int i2, e.a.e.f.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i3, e.e.b.c cVar);

    public final <I, O> b<I> c(String str, e.a.e.f.a<I, O> aVar, a<O> aVar2) {
        int d2 = d(str);
        this.f920f.put(str, new b(aVar2, aVar));
        if (this.f921g.containsKey(str)) {
            Object obj = this.f921g.get(str);
            this.f921g.remove(str);
            aVar2.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f922h.getParcelable(str);
        if (activityResult != null) {
            this.f922h.remove(str);
            aVar2.a(aVar.c(activityResult.b(), activityResult.a()));
        }
        return new a(str, d2, aVar);
    }

    public final int d(String str) {
        Integer num = this.c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int nextInt = this.a.nextInt(2147418112);
        while (true) {
            int i2 = nextInt + 65536;
            if (this.b.containsKey(Integer.valueOf(i2))) {
                nextInt = this.a.nextInt(2147418112);
            } else {
                this.b.put(Integer.valueOf(i2), str);
                this.c.put(str, Integer.valueOf(i2));
                return i2;
            }
        }
    }

    public final void e(String str) {
        Integer remove;
        if (!this.f919e.contains(str) && (remove = this.c.remove(str)) != null) {
            this.b.remove(remove);
        }
        this.f920f.remove(str);
        if (this.f921g.containsKey(str)) {
            StringBuilder n = g.a.a.a.a.n("Dropping pending result for request ", str, ": ");
            n.append(this.f921g.get(str));
            Log.w("ActivityResultRegistry", n.toString());
            this.f921g.remove(str);
        }
        if (this.f922h.containsKey(str)) {
            StringBuilder n2 = g.a.a.a.a.n("Dropping pending result for request ", str, ": ");
            n2.append(this.f922h.getParcelable(str));
            Log.w("ActivityResultRegistry", n2.toString());
            this.f922h.remove(str);
        }
        c cVar = this.f918d.get(str);
        if (cVar != null) {
            Iterator<f> it = cVar.b.iterator();
            while (it.hasNext()) {
                cVar.a.b(it.next());
            }
            cVar.b.clear();
            this.f918d.remove(str);
        }
    }
}
