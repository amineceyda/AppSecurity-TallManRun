package g.d.a.l.u;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import g.d.a.e;
import g.d.a.l.s.d;
import g.d.a.l.u.n;
import java.io.File;
import java.io.FileNotFoundException;

public final class k implements n<Uri, File> {
    public final Context a;

    public static final class a implements o<Uri, File> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        public n<Uri, File> b(r rVar) {
            return new k(this.a);
        }

        public void c() {
        }
    }

    public static class b implements d<File> {

        /* renamed from: d  reason: collision with root package name */
        public static final String[] f2552d = {"_data"};
        public final Context b;
        public final Uri c;

        public b(Context context, Uri uri) {
            this.b = context;
            this.c = uri;
        }

        public Class<File> a() {
            return File.class;
        }

        public void b() {
        }

        public void cancel() {
        }

        public g.d.a.l.a e() {
            return g.d.a.l.a.LOCAL;
        }

        public void f(e eVar, d.a<? super File> aVar) {
            Cursor query = this.b.getContentResolver().query(this.c, f2552d, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                StringBuilder i2 = g.a.a.a.a.i("Failed to find file path for: ");
                i2.append(this.c);
                aVar.c(new FileNotFoundException(i2.toString()));
                return;
            }
            aVar.d(new File(str));
        }
    }

    public k(Context context) {
        this.a = context;
    }

    public n.a a(Object obj, int i2, int i3, g.d.a.l.n nVar) {
        Uri uri = (Uri) obj;
        return new n.a(new g.d.a.q.b(uri), new b(this.a, uri));
    }

    public boolean b(Object obj) {
        return e.e.d.l.a.V((Uri) obj);
    }
}
