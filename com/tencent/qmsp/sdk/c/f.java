package com.tencent.qmsp.sdk.c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.qmsp.sdk.c.a;
import com.tencent.qmsp.sdk.c.k;
import com.tencent.qmsp.sdk.f.g;
import com.tencent.qmsp.sdk.f.h;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

public final class f {

    /* renamed from: i  reason: collision with root package name */
    private static final byte[][] f802i = {new byte[]{52, 125, -93}, new byte[]{41, 121, -79, 113, 35, 43, 57, -18, 42}};
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static boolean f803j = false;

    /* renamed from: k  reason: collision with root package name */
    private static ConcurrentHashMap<Long, C0013f> f804k = new ConcurrentHashMap<>();

    /* renamed from: l  reason: collision with root package name */
    private static Handler f805l = null;

    /* renamed from: m  reason: collision with root package name */
    private static volatile f f806m = null;
    /* access modifiers changed from: private */
    public int a = -1;
    /* access modifiers changed from: private */
    public boolean b = false;
    private boolean c = false;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Handler f807d = null;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public l f808e = null;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public k f809f = null;

    /* renamed from: g  reason: collision with root package name */
    private com.tencent.qmsp.sdk.d.c f810g = null;

    /* renamed from: h  reason: collision with root package name */
    private g f811h = null;

    public class a implements a.C0012a {
        public a(f fVar) {
        }

        public void a() {
            g.a("Qp.QFW", 1, "Something wrong when load native so.");
        }

        public void run() {
            if (!f.f803j) {
                try {
                    if (!f.k()) {
                        System.loadLibrary(f.c(0));
                    }
                    boolean unused = f.f803j = true;
                } catch (UnsatisfiedLinkError e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public class b implements a.C0012a {
        public b() {
        }

        public void a() {
            g.a("Qp.QFW", 1, "Something wrong when init native.");
        }

        public void run() {
            if (f.f803j && !f.this.b) {
                try {
                    Object[] objArr = new Object[1];
                    if (f.a(1, 512, (long) com.tencent.qmsp.sdk.a.c.g(), 0, f.this.f808e, com.tencent.qmsp.sdk.app.a.getContext(), (Object[]) null, objArr) == 0 && objArr[0] != null && (objArr[0] instanceof Integer)) {
                        int unused = f.this.a = ((Integer) objArr[0]).intValue();
                        int unused2 = f.this.a;
                        boolean unused3 = f.this.b = true;
                    }
                    g.a("Qp.QFW", 1, String.format("Native ver: %d(%s)", new Object[]{Integer.valueOf(f.this.a), com.tencent.qmsp.sdk.a.c.a(f.this.a)}));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public class c extends Handler {
        public c(f fVar, Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            try {
                long parseLong = Long.parseLong((String) message.obj);
                if (message.what == 1 && parseLong != 0) {
                    g.a("Qp.QFW", 1, String.format("handle native msg for cookie: %08X", new Object[]{Long.valueOf(parseLong)}));
                    f.a(6, parseLong, 0, 0, (Object) null, (Object) null, (Object[]) null, (Object[]) null);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public class d implements C0013f {
        public d() {
        }

        public int a(long j2, long j3, long j4, Object obj, Object obj2, Object[] objArr, Object[] objArr2) {
            if (j2 != 0) {
                g.a("Qp.QFW", 1, String.format("Native msg, cookie: %08X, delay: %d", new Object[]{Long.valueOf(j2), Long.valueOf(j3)}));
                String valueOf = String.valueOf(j2);
                if (j3 != 0) {
                    f.this.f807d.sendMessageDelayed(f.this.f807d.obtainMessage(1, valueOf), j3 * 1000);
                } else {
                    f.this.f807d.sendMessage(f.this.f807d.obtainMessage(1, valueOf));
                }
            }
            return 0;
        }
    }

    public class e implements k.e {
        public e() {
        }

        public void a(int i2, int i3) {
            f.this.f809f.b((k.e) this);
        }
    }

    /* renamed from: com.tencent.qmsp.sdk.c.f$f  reason: collision with other inner class name */
    public interface C0013f {
        int a(long j2, long j3, long j4, Object obj, Object obj2, Object[] objArr, Object[] objArr2);
    }

    private f() {
        if (com.tencent.qmsp.sdk.app.a.getContext() != null) {
            j();
            l lVar = new l();
            this.f808e = lVar;
            lVar.a(n.b());
            new a(c(0), 86400000).a((a.C0012a) new b());
            this.f811h = g.d();
            k e2 = k.e();
            this.f809f = e2;
            e2.a(this.f811h);
            this.f807d = new c(this, com.tencent.qmsp.sdk.app.b.e().c());
            a(2, (C0013f) new d());
        }
    }

    public static int a(long j2, long j3, long j4, long j5, Object obj, Object obj2, Object[] objArr, Object[] objArr2) {
        if (!f803j) {
            return 27;
        }
        try {
            return goingDownInternal(j2, j3, j4, j5, obj, obj2, objArr, objArr2);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            return 29;
        }
    }

    public static String a(int i2, int i3, int i4, int i5, Object obj, Object obj2) {
        Object obj3 = obj;
        if ((obj3 instanceof String) && obj3 != null && f803j) {
            try {
                return goingDownInternal((long) i2, (long) i3, (long) i4, (long) i5, obj, obj2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static void a(long j2, C0013f fVar) {
        if (fVar != null) {
            f804k.put(Long.valueOf(j2), fVar);
        }
    }

    /* access modifiers changed from: private */
    public static String c(int i2) {
        return h.a(f802i[i2]);
    }

    private static native int goingDownInternal(long j2, long j3, long j4, long j5, Object obj, Object obj2, Object[] objArr, Object[] objArr2);

    private static native String goingDownInternal(long j2, long j3, long j4, long j5, Object obj, Object obj2);

    private static int goingUp(long j2, long j3, long j4, long j5, Object obj, Object obj2, Object[] objArr, Object[] objArr2) {
        C0013f fVar = f804k.get(Long.valueOf(j2));
        if (fVar != null) {
            return fVar.a(j3, j4, j5, obj, obj2, objArr, objArr2);
        }
        return 30;
    }

    public static f i() {
        if (f806m == null) {
            synchronized (f.class) {
                if (f806m == null) {
                    f806m = new f();
                }
            }
        }
        return f806m;
    }

    private void j() {
        new a(c(0), 86400000).a((a.C0012a) new a(this));
        f805l = new Handler(com.tencent.qmsp.sdk.app.b.e().c());
    }

    /* access modifiers changed from: private */
    public static boolean k() {
        if (f803j) {
            return true;
        }
        String str = com.tencent.qmsp.sdk.a.b.b() + File.separator + c(1);
        File file = new File(str);
        if (!file.exists() || !com.tencent.qmsp.sdk.d.e.b(file, (String) null)) {
            return false;
        }
        try {
            System.load(str);
            return true;
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public int a(int i2, int i3, int i4, Object[] objArr, Object[] objArr2) {
        return this.f809f.a(i2, i3, i4, objArr, objArr2);
    }

    public Boolean a(int i2) {
        g gVar = this.f811h;
        int a2 = gVar != null ? gVar.a(i2) : -1;
        boolean z = true;
        if (1 != a2 && b.b) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void a() {
        g gVar = this.f811h;
        if (gVar != null) {
            gVar.a();
        }
        k kVar = this.f809f;
        if (kVar != null) {
            kVar.a();
        }
        if (f806m != null) {
            f806m = null;
        }
    }

    public void a(com.tencent.qmsp.sdk.d.c cVar) {
        this.f810g = cVar;
    }

    public g b() {
        return this.f811h;
    }

    public Handler c() {
        return f805l;
    }

    public com.tencent.qmsp.sdk.d.c d() {
        return this.f810g;
    }

    public void e() {
        this.f809f.b();
    }

    public void f() {
        if (!this.c) {
            this.c = true;
        }
        if (b.b) {
            com.tencent.qmsp.sdk.e.a.a();
            com.tencent.qmsp.sdk.e.c.a();
        }
        com.tencent.qmsp.sdk.e.b.a();
        if (b.b) {
            this.f809f.a((k.e) new e());
            this.f809f.c();
        }
    }
}
