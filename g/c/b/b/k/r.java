package g.c.b.b.k;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import g.c.b.b.f;
import i.c;
import i.o.c.h;
import i.o.c.i;

public final class r {
    public static final r a = null;
    public static final c b = f.U(a.b);

    public static final class a extends i implements i.o.b.a<Handler> {
        public static final a b = new a();

        public a() {
            super(0);
        }

        public Object a() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public static final void a(Context context, int i2, int i3) {
        h.e(context, "context");
        if (i2 == 4) {
            b(context, i3 != -1 ? i3 != 5 ? i3 != 7 ? 2131821012 : 2131821026 : 2131821017 : 2131821013);
        }
    }

    public static final void b(Context context, int i2) {
        ((Handler) b.getValue()).post(new n(context, i2));
    }
}
