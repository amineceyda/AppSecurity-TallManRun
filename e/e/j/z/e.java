package e.e.j.z;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

public final class e {
    public final c a;

    public static final class a implements c {
        public final InputContentInfo a;

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public a(Object obj) {
            this.a = (InputContentInfo) obj;
        }

        public ClipDescription a() {
            return this.a.getDescription();
        }

        public Object b() {
            return this.a;
        }

        public Uri c() {
            return this.a.getContentUri();
        }

        public void d() {
            this.a.requestPermission();
        }

        public Uri e() {
            return this.a.getLinkUri();
        }
    }

    public static final class b implements c {
        public final Uri a;
        public final ClipDescription b;
        public final Uri c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = uri;
            this.b = clipDescription;
            this.c = uri2;
        }

        public ClipDescription a() {
            return this.b;
        }

        public Object b() {
            return null;
        }

        public Uri c() {
            return this.a;
        }

        public void d() {
        }

        public Uri e() {
            return this.c;
        }
    }

    public interface c {
        ClipDescription a();

        Object b();

        Uri c();

        void d();

        Uri e();
    }

    public e(c cVar) {
        this.a = cVar;
    }
}
