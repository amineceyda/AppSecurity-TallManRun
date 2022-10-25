package g.c.a.e.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.apkpure.aegon.components.download.DownloadTask;

public class b {
    public static final String a;
    public static final String b;
    public static final String c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f1970d;

    public interface a {
        void a(Context context, DownloadTask downloadTask);

        void b(Context context, DownloadTask downloadTask);

        void c(Context context, DownloadTask downloadTask);

        void d(Context context, DownloadTask downloadTask);
    }

    /* renamed from: g.c.a.e.c.b$b  reason: collision with other inner class name */
    public static class C0060b extends BroadcastReceiver {
        public Context a;
        public a b;
        public boolean c = false;

        public C0060b(Context context, a aVar) {
            this.a = context;
            this.b = aVar;
        }

        public void a() {
            if (!this.c) {
                e.e.d.l.a.p0(this.a, 0, this, b.a, b.b, b.c, b.f1970d);
                this.c = true;
            }
        }

        public void b() {
            if (this.c) {
                e.e.d.l.a.J0(this.a, this);
                this.c = false;
            }
        }

        public void onReceive(Context context, Intent intent) {
            if (b.a.equals(intent.getAction())) {
                this.b.c(context, (DownloadTask) intent.getParcelableExtra("downloadTask"));
            } else if (b.b.equals(intent.getAction())) {
                this.b.b(context, (DownloadTask) intent.getParcelableExtra("downloadTask"));
            } else if (b.c.equals(intent.getAction())) {
                this.b.d(context, (DownloadTask) intent.getParcelableExtra("downloadTask"));
            } else if (b.f1970d.equals(intent.getAction())) {
                this.b.a(context, (DownloadTask) intent.getParcelableExtra("downloadTask"));
            }
        }
    }

    static {
        Class<b> cls = b.class;
        a = cls.getPackage().getName() + ".DOWNLOAD_STARTED";
        b = cls.getPackage().getName() + ".DOWNLOAD_PROGRESS_CHANGED";
        c = cls.getPackage().getName() + ".DOWNLOAD_FINISHED";
        f1970d = cls.getPackage().getName() + ".DOWNLOAD_REMOVED";
    }

    public static void a(Context context, String str, DownloadTask downloadTask) {
        Intent intent = new Intent(str);
        intent.putExtra("downloadTask", downloadTask);
        e.m.a.a.a(context).b(intent);
    }
}
