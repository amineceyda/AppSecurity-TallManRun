package e.h.b;

import androidx.fragment.app.Fragment;
import e.k.e;
import java.util.ArrayList;

public abstract class c0 {
    public ArrayList<a> a = new ArrayList<>();
    public int b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f1419d;

    /* renamed from: e  reason: collision with root package name */
    public int f1420e;

    /* renamed from: f  reason: collision with root package name */
    public int f1421f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1422g;

    /* renamed from: h  reason: collision with root package name */
    public String f1423h;

    /* renamed from: i  reason: collision with root package name */
    public int f1424i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1425j;

    /* renamed from: k  reason: collision with root package name */
    public int f1426k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f1427l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<String> f1428m;
    public ArrayList<String> n;
    public boolean o = false;

    public static final class a {
        public int a;
        public Fragment b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f1429d;

        /* renamed from: e  reason: collision with root package name */
        public int f1430e;

        /* renamed from: f  reason: collision with root package name */
        public int f1431f;

        /* renamed from: g  reason: collision with root package name */
        public e.b f1432g;

        /* renamed from: h  reason: collision with root package name */
        public e.b f1433h;

        public a() {
        }

        public a(int i2, Fragment fragment) {
            this.a = i2;
            this.b = fragment;
            e.b bVar = e.b.RESUMED;
            this.f1432g = bVar;
            this.f1433h = bVar;
        }

        public a(int i2, Fragment fragment, e.b bVar) {
            this.a = i2;
            this.b = fragment;
            this.f1432g = fragment.mMaxState;
            this.f1433h = bVar;
        }
    }

    public c0(s sVar, ClassLoader classLoader) {
    }

    public void b(a aVar) {
        this.a.add(aVar);
        aVar.c = this.b;
        aVar.f1429d = this.c;
        aVar.f1430e = this.f1419d;
        aVar.f1431f = this.f1420e;
    }

    public abstract void c();

    public abstract void d(int i2, Fragment fragment, String str, int i3);

    public abstract c0 e(Fragment fragment, e.b bVar);
}
