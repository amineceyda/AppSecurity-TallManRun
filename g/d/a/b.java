package g.d.a;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.GeneratedAppGlideModule;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import g.d.a.l.p;
import g.d.a.l.s.k;
import g.d.a.l.s.m;
import g.d.a.l.t.b0.d;
import g.d.a.l.t.c0.i;
import g.d.a.l.t.c0.j;
import g.d.a.l.t.d0.a;
import g.d.a.l.u.a;
import g.d.a.l.u.b;
import g.d.a.l.u.d;
import g.d.a.l.u.e;
import g.d.a.l.u.f;
import g.d.a.l.u.k;
import g.d.a.l.u.s;
import g.d.a.l.u.t;
import g.d.a.l.u.u;
import g.d.a.l.u.v;
import g.d.a.l.u.w;
import g.d.a.l.u.x;
import g.d.a.l.u.y.a;
import g.d.a.l.u.y.b;
import g.d.a.l.u.y.c;
import g.d.a.l.u.y.d;
import g.d.a.l.u.y.e;
import g.d.a.l.u.y.f;
import g.d.a.l.v.c.a0;
import g.d.a.l.v.c.c;
import g.d.a.l.v.c.g;
import g.d.a.l.v.c.h;
import g.d.a.l.v.c.o;
import g.d.a.l.v.c.s;
import g.d.a.l.v.c.u;
import g.d.a.l.v.c.w;
import g.d.a.l.v.c.x;
import g.d.a.l.v.c.z;
import g.d.a.l.v.d.a;
import g.d.a.l.v.g.j;
import g.d.a.m.l;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class b implements ComponentCallbacks2 {

    /* renamed from: j  reason: collision with root package name */
    public static volatile b f2315j;

    /* renamed from: k  reason: collision with root package name */
    public static volatile boolean f2316k;
    public final d b;
    public final i c;

    /* renamed from: d  reason: collision with root package name */
    public final d f2317d;

    /* renamed from: e  reason: collision with root package name */
    public final Registry f2318e;

    /* renamed from: f  reason: collision with root package name */
    public final g.d.a.l.t.b0.b f2319f;

    /* renamed from: g  reason: collision with root package name */
    public final l f2320g;

    /* renamed from: h  reason: collision with root package name */
    public final g.d.a.m.d f2321h;

    /* renamed from: i  reason: collision with root package name */
    public final List<g> f2322i = new ArrayList();

    public interface a {
    }

    public b(Context context, g.d.a.l.t.l lVar, i iVar, d dVar, g.d.a.l.t.b0.b bVar, l lVar2, g.d.a.m.d dVar2, int i2, a aVar, Map<Class<?>, h<?, ?>> map, List<g.d.a.p.d<Object>> list, boolean z, boolean z2) {
        p pVar;
        p pVar2;
        g.d.a.l.v.e.d dVar3;
        Context context2 = context;
        d dVar4 = dVar;
        g.d.a.l.t.b0.b bVar2 = bVar;
        Class<g.d.a.j.a> cls = g.d.a.j.a.class;
        Class<String> cls2 = String.class;
        Class<Integer> cls3 = Integer.class;
        Class<byte[]> cls4 = byte[].class;
        this.b = dVar4;
        this.f2319f = bVar2;
        this.c = iVar;
        this.f2320g = lVar2;
        this.f2321h = dVar2;
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.f2318e = registry;
        DefaultImageHeaderParser defaultImageHeaderParser = new DefaultImageHeaderParser();
        g.d.a.o.b bVar3 = registry.f349g;
        synchronized (bVar3) {
            bVar3.a.add(defaultImageHeaderParser);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 27) {
            o oVar = new o();
            g.d.a.o.b bVar4 = registry.f349g;
            synchronized (bVar4) {
                bVar4.a.add(oVar);
            }
        }
        List<ImageHeaderParser> e2 = registry.e();
        g.d.a.l.v.g.a aVar2 = new g.d.a.l.v.g.a(context2, e2, dVar4, bVar2);
        a0 a0Var = new a0(dVar4, new a0.g());
        g.d.a.l.v.c.l lVar3 = new g.d.a.l.v.c.l(registry.e(), resources.getDisplayMetrics(), dVar4, bVar2);
        if (!z2 || i3 < 28) {
            pVar = new g(lVar3);
            pVar2 = new x(lVar3, bVar2);
        } else {
            pVar2 = new s();
            pVar = new h();
        }
        Class<byte[]> cls5 = cls4;
        g.d.a.l.v.e.d dVar5 = new g.d.a.l.v.e.d(context2);
        int i4 = i3;
        s.c cVar = new s.c(resources);
        s.d dVar6 = new s.d(resources);
        Class<String> cls6 = cls2;
        s.b bVar5 = new s.b(resources);
        s.d dVar7 = dVar6;
        s.a aVar3 = new s.a(resources);
        c cVar2 = new c(bVar2);
        Class<Integer> cls7 = cls3;
        g.d.a.l.v.h.a aVar4 = new g.d.a.l.v.h.a();
        g.d.a.l.v.h.d dVar8 = new g.d.a.l.v.h.d();
        ContentResolver contentResolver = context.getContentResolver();
        s.b bVar6 = bVar5;
        registry.a(ByteBuffer.class, new g.d.a.l.u.c());
        registry.a(InputStream.class, new t(bVar2));
        s.c cVar3 = cVar;
        registry.d("Bitmap", ByteBuffer.class, Bitmap.class, pVar);
        registry.d("Bitmap", InputStream.class, Bitmap.class, pVar2);
        if (m.c()) {
            dVar3 = dVar5;
            registry.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new u(lVar3));
        } else {
            dVar3 = dVar5;
        }
        registry.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, a0Var);
        registry.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new a0(dVar4, new a0.c((a0.a) null)));
        v.a<?> aVar5 = v.a.a;
        registry.c(Bitmap.class, Bitmap.class, aVar5);
        registry.d("Bitmap", Bitmap.class, Bitmap.class, new z());
        registry.b(Bitmap.class, cVar2);
        registry.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new g.d.a.l.v.c.a(resources, pVar));
        registry.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new g.d.a.l.v.c.a(resources, pVar2));
        registry.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new g.d.a.l.v.c.a(resources, a0Var));
        registry.b(BitmapDrawable.class, new g.d.a.l.v.c.b(dVar4, cVar2));
        registry.d("Gif", InputStream.class, g.d.a.l.v.g.c.class, new j(e2, aVar2, bVar2));
        registry.d("Gif", ByteBuffer.class, g.d.a.l.v.g.c.class, aVar2);
        registry.b(g.d.a.l.v.g.c.class, new g.d.a.l.v.g.d());
        Class<g.d.a.j.a> cls8 = cls;
        registry.c(cls8, cls8, aVar5);
        registry.d("Bitmap", cls8, Bitmap.class, new g.d.a.l.v.g.h(dVar4));
        g.d.a.l.v.e.d dVar9 = dVar3;
        registry.d("legacy_append", Uri.class, Drawable.class, dVar9);
        registry.d("legacy_append", Uri.class, Bitmap.class, new w(dVar9, dVar4));
        registry.g(new a.C0095a());
        registry.c(File.class, ByteBuffer.class, new d.b());
        registry.c(File.class, InputStream.class, new f.e());
        registry.d("legacy_append", File.class, File.class, new g.d.a.l.v.f.a());
        registry.c(File.class, ParcelFileDescriptor.class, new f.b());
        registry.c(File.class, File.class, aVar5);
        registry.g(new k.a(bVar2));
        if (m.c()) {
            registry.g(new m.a());
        }
        Class cls9 = Integer.TYPE;
        s.c cVar4 = cVar3;
        registry.c(cls9, InputStream.class, cVar4);
        s.b bVar7 = bVar6;
        registry.c(cls9, ParcelFileDescriptor.class, bVar7);
        Class<Integer> cls10 = cls7;
        registry.c(cls10, InputStream.class, cVar4);
        registry.c(cls10, ParcelFileDescriptor.class, bVar7);
        s.d dVar10 = dVar7;
        registry.c(cls10, Uri.class, dVar10);
        s.a aVar6 = aVar3;
        registry.c(cls9, AssetFileDescriptor.class, aVar6);
        registry.c(cls10, AssetFileDescriptor.class, aVar6);
        registry.c(cls9, Uri.class, dVar10);
        Class<String> cls11 = cls6;
        registry.c(cls11, InputStream.class, new e.c());
        registry.c(Uri.class, InputStream.class, new e.c());
        registry.c(cls11, InputStream.class, new u.c());
        registry.c(cls11, ParcelFileDescriptor.class, new u.b());
        registry.c(cls11, AssetFileDescriptor.class, new u.a());
        registry.c(Uri.class, InputStream.class, new b.a());
        registry.c(Uri.class, InputStream.class, new a.c(context.getAssets()));
        registry.c(Uri.class, ParcelFileDescriptor.class, new a.b(context.getAssets()));
        Context context3 = context;
        registry.c(Uri.class, InputStream.class, new c.a(context3));
        registry.c(Uri.class, InputStream.class, new d.a(context3));
        int i5 = i4;
        if (i5 >= 29) {
            registry.c(Uri.class, InputStream.class, new e.c(context3));
            registry.c(Uri.class, ParcelFileDescriptor.class, new e.b(context3));
        }
        ContentResolver contentResolver2 = contentResolver;
        registry.c(Uri.class, InputStream.class, new w.d(contentResolver2));
        registry.c(Uri.class, ParcelFileDescriptor.class, new w.b(contentResolver2));
        registry.c(Uri.class, AssetFileDescriptor.class, new w.a(contentResolver2));
        registry.c(Uri.class, InputStream.class, new x.a());
        registry.c(URL.class, InputStream.class, new f.a());
        registry.c(Uri.class, File.class, new k.a(context3));
        registry.c(g.d.a.l.u.g.class, InputStream.class, new a.C0092a());
        Class<byte[]> cls12 = cls5;
        registry.c(cls12, ByteBuffer.class, new b.a());
        registry.c(cls12, InputStream.class, new b.d());
        registry.c(Uri.class, Uri.class, aVar5);
        registry.c(Drawable.class, Drawable.class, aVar5);
        registry.d("legacy_append", Drawable.class, Drawable.class, new g.d.a.l.v.e.e());
        registry.h(Bitmap.class, BitmapDrawable.class, new g.d.a.l.v.h.b(resources));
        g.d.a.l.v.h.a aVar7 = aVar4;
        registry.h(Bitmap.class, cls12, aVar7);
        g.d.a.l.v.h.d dVar11 = dVar8;
        registry.h(Drawable.class, cls12, new g.d.a.l.v.h.c(dVar4, aVar7, dVar11));
        registry.h(g.d.a.l.v.g.c.class, cls12, dVar11);
        if (i5 >= 23) {
            a0 a0Var2 = new a0(dVar4, new a0.d());
            registry.d("legacy_append", ByteBuffer.class, Bitmap.class, a0Var2);
            registry.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new g.d.a.l.v.c.a(resources, a0Var2));
        }
        this.f2317d = new d(context, bVar, registry, new g.d.a.p.i.f(), aVar, map, list, lVar, z, i2);
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f2316k) {
            f2316k = true;
            c cVar = new c();
            Context applicationContext = context.getApplicationContext();
            Collections.emptyList();
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Loading Glide modules");
            }
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo.metaData != null) {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                    }
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            arrayList.add(g.d.a.n.e.a(str));
                            if (Log.isLoggable("ManifestParser", 3)) {
                                Log.d("ManifestParser", "Loaded Glide module: " + str);
                            }
                        }
                    }
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Finished loading Glide modules");
                    }
                } else if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
                if (generatedAppGlideModule != null && !generatedAppGlideModule.c().isEmpty()) {
                    Set<Class<?>> c2 = generatedAppGlideModule.c();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        g.d.a.n.c cVar2 = (g.d.a.n.c) it.next();
                        if (c2.contains(cVar2.getClass())) {
                            if (Log.isLoggable("Glide", 3)) {
                                Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + cVar2);
                            }
                            it.remove();
                        }
                    }
                }
                if (Log.isLoggable("Glide", 3)) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        StringBuilder i2 = g.a.a.a.a.i("Discovered GlideModule from manifest: ");
                        i2.append(((g.d.a.n.c) it2.next()).getClass());
                        Log.d("Glide", i2.toString());
                    }
                }
                cVar.f2331l = null;
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((g.d.a.n.c) it3.next()).a(applicationContext, cVar);
                }
                if (cVar.f2325f == null) {
                    int a2 = g.d.a.l.t.d0.a.a();
                    if (!TextUtils.isEmpty("source")) {
                        cVar.f2325f = new g.d.a.l.t.d0.a(new ThreadPoolExecutor(a2, a2, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.C0084a("source", a.b.b, false)));
                    } else {
                        throw new IllegalArgumentException(g.a.a.a.a.w("Name must be non-null and non-empty, but given: ", "source"));
                    }
                }
                if (cVar.f2326g == null) {
                    int i3 = g.d.a.l.t.d0.a.f2464d;
                    if (!TextUtils.isEmpty("disk-cache")) {
                        cVar.f2326g = new g.d.a.l.t.d0.a(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.C0084a("disk-cache", a.b.b, true)));
                    } else {
                        throw new IllegalArgumentException(g.a.a.a.a.w("Name must be non-null and non-empty, but given: ", "disk-cache"));
                    }
                }
                if (cVar.f2332m == null) {
                    int i4 = g.d.a.l.t.d0.a.a() >= 4 ? 2 : 1;
                    if (!TextUtils.isEmpty("animation")) {
                        cVar.f2332m = new g.d.a.l.t.d0.a(new ThreadPoolExecutor(i4, i4, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.C0084a("animation", a.b.b, true)));
                    } else {
                        throw new IllegalArgumentException(g.a.a.a.a.w("Name must be non-null and non-empty, but given: ", "animation"));
                    }
                }
                if (cVar.f2328i == null) {
                    cVar.f2328i = new g.d.a.l.t.c0.j(new j.a(applicationContext));
                }
                if (cVar.f2329j == null) {
                    cVar.f2329j = new g.d.a.m.f();
                }
                if (cVar.c == null) {
                    int i5 = cVar.f2328i.a;
                    if (i5 > 0) {
                        cVar.c = new g.d.a.l.t.b0.j((long) i5);
                    } else {
                        cVar.c = new g.d.a.l.t.b0.e();
                    }
                }
                if (cVar.f2323d == null) {
                    cVar.f2323d = new g.d.a.l.t.b0.i(cVar.f2328i.f2454d);
                }
                if (cVar.f2324e == null) {
                    cVar.f2324e = new g.d.a.l.t.c0.h((long) cVar.f2328i.b);
                }
                if (cVar.f2327h == null) {
                    cVar.f2327h = new g.d.a.l.t.c0.g(applicationContext);
                }
                if (cVar.b == null) {
                    cVar.b = new g.d.a.l.t.l(cVar.f2324e, cVar.f2327h, cVar.f2326g, cVar.f2325f, new g.d.a.l.t.d0.a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, g.d.a.l.t.d0.a.c, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a.C0084a("source-unlimited", a.b.b, false))), cVar.f2332m, false);
                }
                List<g.d.a.p.d<Object>> list = cVar.n;
                cVar.n = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
                l lVar = new l(cVar.f2331l);
                g.d.a.l.t.l lVar2 = cVar.b;
                i iVar = cVar.f2324e;
                g.d.a.l.t.b0.d dVar = cVar.c;
                g.d.a.l.t.b0.b bVar = cVar.f2323d;
                g.d.a.m.d dVar2 = cVar.f2329j;
                a aVar = cVar.f2330k;
                Map<Class<?>, h<?, ?>> map = cVar.a;
                List<g.d.a.p.d<Object>> list2 = cVar.n;
                Context context2 = applicationContext;
                b bVar2 = new b(applicationContext, lVar2, iVar, dVar, bVar, lVar, dVar2, 4, aVar, map, list2, false, false);
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    g.d.a.n.c cVar3 = (g.d.a.n.c) it4.next();
                    try {
                        cVar3.b(context2, bVar2, bVar2.f2318e);
                    } catch (AbstractMethodError e2) {
                        StringBuilder i6 = g.a.a.a.a.i("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                        i6.append(cVar3.getClass().getName());
                        throw new IllegalStateException(i6.toString(), e2);
                    }
                }
                context2.registerComponentCallbacks(bVar2);
                f2315j = bVar2;
                f2316k = false;
            } catch (PackageManager.NameNotFoundException e3) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e3);
            }
        } else {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
    }

    public static b b(Context context) {
        if (f2315j == null) {
            Context applicationContext = context.getApplicationContext();
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{applicationContext.getApplicationContext()});
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (InstantiationException e2) {
                d(e2);
                throw null;
            } catch (IllegalAccessException e3) {
                d(e3);
                throw null;
            } catch (NoSuchMethodException e4) {
                d(e4);
                throw null;
            } catch (InvocationTargetException e5) {
                d(e5);
                throw null;
            }
            synchronized (b.class) {
                if (f2315j == null) {
                    a(context, generatedAppGlideModule);
                }
            }
        }
        return f2315j;
    }

    public static l c(Context context) {
        Objects.requireNonNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).f2320g;
    }

    public static void d(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static g e(Context context) {
        Objects.requireNonNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).f2320g.g(context);
    }

    public static g f(View view) {
        l c2 = c(view.getContext());
        Objects.requireNonNull(c2);
        if (!g.d.a.r.j.g()) {
            Objects.requireNonNull(view.getContext(), "Unable to obtain a request manager for a view without a Context");
            Activity a2 = l.a(view.getContext());
            if (a2 != null) {
                if (a2 instanceof e.h.b.j) {
                    e.h.b.j jVar = (e.h.b.j) a2;
                    c2.f2639f.clear();
                    l.c(jVar.k().K(), c2.f2639f);
                    View findViewById = jVar.findViewById(16908290);
                    Fragment fragment = null;
                    while (!view.equals(findViewById) && (fragment = c2.f2639f.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
                        view = (View) view.getParent();
                    }
                    c2.f2639f.clear();
                    return fragment != null ? c2.h(fragment) : c2.i(jVar);
                }
                c2.f2640g.clear();
                c2.b(a2.getFragmentManager(), c2.f2640g);
                View findViewById2 = a2.findViewById(16908290);
                android.app.Fragment fragment2 = null;
                while (!view.equals(findViewById2) && (fragment2 = c2.f2640g.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                c2.f2640g.clear();
                return fragment2 == null ? c2.e(a2) : c2.f(fragment2);
            }
        }
        return c2.g(view.getContext().getApplicationContext());
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        g.d.a.r.j.a();
        ((g.d.a.r.g) this.c).e(0);
        this.b.b();
        this.f2319f.b();
    }

    public void onTrimMemory(int i2) {
        long j2;
        g.d.a.r.j.a();
        for (g requireNonNull : this.f2322i) {
            Objects.requireNonNull(requireNonNull);
        }
        g.d.a.l.t.c0.h hVar = (g.d.a.l.t.c0.h) this.c;
        Objects.requireNonNull(hVar);
        if (i2 >= 40) {
            hVar.e(0);
        } else if (i2 >= 20 || i2 == 15) {
            synchronized (hVar) {
                j2 = hVar.b;
            }
            hVar.e(j2 / 2);
        }
        this.b.a(i2);
        this.f2319f.a(i2);
    }
}
