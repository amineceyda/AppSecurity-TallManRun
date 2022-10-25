package g.c.a.o.g;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.apkpure.aegon.widgets.xlistview.XListView;
import g.c.a.o.g.c;
import g.i.c.a.a.i.b;
import i.o.c.h;
import i.o.c.o;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class b<T, VH extends c> extends BaseAdapter implements XListView.a {
    @Deprecated

    /* renamed from: m  reason: collision with root package name */
    public static final Logger f2179m = LoggerFactory.getLogger("BaseQuickAdapter");
    public final ViewGroup b;
    public List<? extends T> c;

    /* renamed from: d  reason: collision with root package name */
    public int f2180d;

    /* renamed from: e  reason: collision with root package name */
    public View f2181e;

    /* renamed from: f  reason: collision with root package name */
    public final LayoutInflater f2182f;

    /* renamed from: g  reason: collision with root package name */
    public final List<T> f2183g;

    /* renamed from: h  reason: collision with root package name */
    public a f2184h;

    /* renamed from: i  reason: collision with root package name */
    public XListView.a f2185i;

    /* renamed from: j  reason: collision with root package name */
    public Class<?> f2186j;

    /* renamed from: k  reason: collision with root package name */
    public final Context f2187k;

    /* renamed from: l  reason: collision with root package name */
    public final C0069b f2188l;

    public interface a {
    }

    /* renamed from: g.c.a.o.g.b$b  reason: collision with other inner class name */
    public static final class C0069b extends DataSetObserver {
        public final /* synthetic */ b<T, VH> a;

        public C0069b(b<T, VH> bVar) {
            this.a = bVar;
        }

        public void onChanged() {
            this.a.l();
        }
    }

    public b(ViewGroup viewGroup, List<? extends T> list, int i2, View view) {
        h.e(viewGroup, "listView");
        this.b = viewGroup;
        this.c = list;
        this.f2180d = i2;
        this.f2181e = view;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        h.d(from, "from(listView.context)");
        this.f2182f = from;
        ArrayList arrayList = new ArrayList();
        this.f2183g = arrayList;
        this.f2187k = viewGroup.getContext();
        C0069b bVar = new C0069b(this);
        this.f2188l = bVar;
        List<? extends T> list2 = this.c;
        if (!(list2 == null || list2.isEmpty())) {
            List<? extends T> list3 = this.c;
            h.c(list3);
            arrayList.addAll(list3);
        }
        if (viewGroup instanceof XListView) {
            ((XListView) viewGroup).a(this);
        }
        registerDataSetObserver(bVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ViewGroup viewGroup, List list, int i2, View view, int i3) {
        this(viewGroup, (i3 & 2) != 0 ? null : list, (i3 & 4) != 0 ? 0 : i2, (View) null);
        int i4 = i3 & 8;
    }

    public void a() {
        XListView.a aVar = this.f2185i;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final Class<?> e() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3 = this.f2186j;
        if (cls3 != null) {
            return cls3;
        }
        Class cls4 = getClass();
        while (true) {
            cls = this.f2186j;
            if (cls != null || cls4 == null) {
                return cls;
            }
            Class<c> cls5 = c.class;
            Type genericSuperclass = cls4.getGenericSuperclass();
            Class<?> cls6 = null;
            if (genericSuperclass instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
                h.d(actualTypeArguments, "types");
                int i2 = 0;
                int length = actualTypeArguments.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    Type type = actualTypeArguments[i2];
                    i2++;
                    if (type instanceof Class) {
                        cls2 = (Class) type;
                        if (cls5.isAssignableFrom(cls2)) {
                            break;
                        }
                    } else if (type instanceof ParameterizedType) {
                        Type rawType = ((ParameterizedType) type).getRawType();
                        if (rawType instanceof Class) {
                            cls2 = (Class) rawType;
                            if (cls5.isAssignableFrom(cls2)) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                cls6 = cls2;
            }
            this.f2186j = cls6;
            cls4 = cls4.getSuperclass();
        }
        return cls;
    }

    public final VH f(ViewGroup viewGroup, int i2, int i3) {
        VH vh;
        VH vh2;
        View inflate = this.f2182f.inflate(i3, viewGroup, false);
        h.d(inflate, "layoutInflater.inflate(layoutResId, parent, false)");
        Class<?> e2 = e();
        if (e2 == null) {
            vh = new c(inflate, i2, 0, 4);
        } else {
            try {
                if (!e2.isMemberClass() || Modifier.isStatic(e2.getModifiers())) {
                    Constructor<?> declaredConstructor = e2.getDeclaredConstructor(new Class[]{View.class});
                    h.d(declaredConstructor, "z.getDeclaredConstructor(View::class.java)");
                    declaredConstructor.setAccessible(true);
                    vh2 = declaredConstructor.newInstance(new Object[]{inflate});
                } else {
                    Constructor<?> declaredConstructor2 = e2.getDeclaredConstructor(new Class[]{getClass(), View.class});
                    h.d(declaredConstructor2, "z.getDeclaredConstructor(javaClass, View::class.java)");
                    declaredConstructor2.setAccessible(true);
                    vh2 = declaredConstructor2.newInstance(new Object[]{this, inflate});
                }
                vh = (c) vh2;
            } catch (Exception e3) {
                f2179m.debug("createGenericKInstance exception,", (Throwable) e3);
                vh = null;
            }
        }
        return vh == null ? new c(inflate, i2, 0, 4) : vh;
    }

    public final String g(int i2) {
        String string = this.f2187k.getString(i2);
        h.d(string, "context.getString(res)");
        return string;
    }

    public int getCount() {
        return this.f2183g.size();
    }

    public T getItem(int i2) {
        if (i2 >= this.f2183g.size() || i2 < 0) {
            return null;
        }
        return this.f2183g.get(i2);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        T t;
        Integer num;
        View view2;
        View view3;
        boolean z;
        c cVar;
        View view4;
        T t2;
        o oVar = new o();
        View view5 = null;
        if (view == null) {
            t2 = null;
        } else {
            try {
                t2 = view.getTag();
            } catch (ClassCastException unused) {
                t = null;
            }
        }
        t = (c) t2;
        oVar.element = t;
        int itemViewType = getItemViewType(i2);
        Object item = getItem(i2);
        c cVar2 = (c) oVar.element;
        if (cVar2 != null) {
            cVar2.f2189d = i2;
        }
        if (cVar2 == null) {
            num = null;
        } else {
            num = Integer.valueOf(cVar2.c);
        }
        if (num != null && num.intValue() == itemViewType) {
            Class<?> e2 = e();
            c cVar3 = (c) oVar.element;
            if (h.a(cVar3 == null ? null : cVar3.getClass(), e2)) {
                try {
                    h((c) oVar.element, item);
                    view2 = ((c) oVar.element).b;
                } catch (Exception unused2) {
                }
                b.C0166b.a.h(i2, view, viewGroup, (long) i2);
                return view2;
            }
        }
        T i3 = i(viewGroup, itemViewType, i2);
        oVar.element = i3;
        if (i3 != null) {
            i3.f2189d = i2;
        }
        if (i3 == null) {
            view3 = null;
        } else {
            view3 = i3.b;
        }
        if (view3 == null) {
            z = false;
        } else {
            z = view3.hasOnClickListeners();
        }
        if (!(z || (cVar = (c) oVar.element) == null || (view4 = cVar.b) == null)) {
            view4.setOnClickListener(new a(this, oVar));
        }
        c cVar4 = (c) oVar.element;
        if (cVar4 != null) {
            h(cVar4, item);
        }
        c cVar5 = (c) oVar.element;
        if (cVar5 != null) {
            view5 = cVar5.b;
        }
        view2 = view5 == null ? new View(this.b.getContext()) : view5;
        b.C0166b.a.h(i2, view, viewGroup, (long) i2);
        return view2;
    }

    public abstract void h(VH vh, T t);

    public VH i(ViewGroup viewGroup, int i2, int i3) {
        return f(viewGroup, i2, this.f2180d);
    }

    public final void j(List<? extends T> list) {
        this.f2183g.clear();
        if (!(list == null || list.isEmpty())) {
            this.f2183g.addAll(list);
        }
        notifyDataSetChanged();
    }

    public final void k(T[] tArr) {
        h.e(tArr, "list");
        this.f2183g.clear();
        if (!(tArr.length == 0)) {
            i.l.c.a(this.f2183g, tArr);
        }
        notifyDataSetChanged();
    }

    public final void l() {
        View view = this.f2181e;
        if (view != null) {
            view.setVisibility(getCount() > 0 ? 8 : 0);
        }
    }
}
