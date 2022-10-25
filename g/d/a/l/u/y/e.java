package g.d.a.l.u.y;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import g.d.a.l.s.d;
import g.d.a.l.u.n;
import g.d.a.l.u.o;
import g.d.a.l.u.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

public final class e<DataT> implements n<Uri, DataT> {
    public final Context a;
    public final n<File, DataT> b;
    public final n<Uri, DataT> c;

    /* renamed from: d  reason: collision with root package name */
    public final Class<DataT> f2562d;

    public static abstract class a<DataT> implements o<Uri, DataT> {
        public final Context a;
        public final Class<DataT> b;

        public a(Context context, Class<DataT> cls) {
            this.a = context;
            this.b = cls;
        }

        public final n<Uri, DataT> b(r rVar) {
            return new e(this.a, rVar.c(File.class, this.b), rVar.c(Uri.class, this.b), this.b);
        }

        public final void c() {
        }
    }

    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    public static final class d<DataT> implements g.d.a.l.s.d<DataT> {

        /* renamed from: l  reason: collision with root package name */
        public static final String[] f2563l = {"_data"};
        public final Context b;
        public final n<File, DataT> c;

        /* renamed from: d  reason: collision with root package name */
        public final n<Uri, DataT> f2564d;

        /* renamed from: e  reason: collision with root package name */
        public final Uri f2565e;

        /* renamed from: f  reason: collision with root package name */
        public final int f2566f;

        /* renamed from: g  reason: collision with root package name */
        public final int f2567g;

        /* renamed from: h  reason: collision with root package name */
        public final g.d.a.l.n f2568h;

        /* renamed from: i  reason: collision with root package name */
        public final Class<DataT> f2569i;

        /* renamed from: j  reason: collision with root package name */
        public volatile boolean f2570j;

        /* renamed from: k  reason: collision with root package name */
        public volatile g.d.a.l.s.d<DataT> f2571k;

        public d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i2, int i3, g.d.a.l.n nVar3, Class<DataT> cls) {
            this.b = context.getApplicationContext();
            this.c = nVar;
            this.f2564d = nVar2;
            this.f2565e = uri;
            this.f2566f = i2;
            this.f2567g = i3;
            this.f2568h = nVar3;
            this.f2569i = cls;
        }

        public Class<DataT> a() {
            return this.f2569i;
        }

        public void b() {
            g.d.a.l.s.d<DataT> dVar = this.f2571k;
            if (dVar != null) {
                dVar.b();
            }
        }

        public final n.a<DataT> c() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                n<File, DataT> nVar = this.c;
                Uri uri = this.f2565e;
                Cursor cursor = null;
                try {
                    cursor = this.b.getContentResolver().query(uri, f2563l, (String) null, (String[]) null, (String) null);
                    if (cursor == null || !cursor.moveToFirst()) {
                        throw new FileNotFoundException("Failed to media store entry for: " + uri);
                    }
                    String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                    if (!TextUtils.isEmpty(string)) {
                        File file = new File(string);
                        cursor.close();
                        return nVar.a(file, this.f2566f, this.f2567g, this.f2568h);
                    }
                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } else {
                return this.f2564d.a(this.b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0 ? MediaStore.setRequireOriginal(this.f2565e) : this.f2565e, this.f2566f, this.f2567g, this.f2568h);
            }
        }

        public void cancel() {
            this.f2570j = true;
            g.d.a.l.s.d<DataT> dVar = this.f2571k;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        public g.d.a.l.a e() {
            return g.d.a.l.a.LOCAL;
        }

        public void f(g.d.a.e eVar, d.a<? super DataT> aVar) {
            try {
                n.a c2 = c();
                g.d.a.l.s.d<Data> dVar = c2 != null ? c2.c : null;
                if (dVar == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f2565e));
                    return;
                }
                this.f2571k = dVar;
                if (this.f2570j) {
                    cancel();
                } else {
                    dVar.f(eVar, aVar);
                }
            } catch (FileNotFoundException e2) {
                aVar.c(e2);
            }
        }
    }

    public e(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.a = context.getApplicationContext();
        this.b = nVar;
        this.c = nVar2;
        this.f2562d = cls;
    }

    public n.a a(Object obj, int i2, int i3, g.d.a.l.n nVar) {
        Uri uri = (Uri) obj;
        return new n.a(new g.d.a.q.b(uri), new d(this.a, this.b, this.c, uri, i2, i3, nVar, this.f2562d));
    }

    public boolean b(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && e.e.d.l.a.V((Uri) obj);
    }
}
