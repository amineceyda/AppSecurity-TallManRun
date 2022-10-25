package g.i.c.a.a.b0;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import g.c.b.b.f;
import g.i.c.a.a.r.e;

public class p {
    public static final e a = (Build.VERSION.SDK_INT >= 21 ? new d((a) null) : new c((a) null));

    public static class b extends e {
        public b(a aVar) {
            super((a) null);
        }

        public boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipChildren();
        }
    }

    public static class c extends b {
        public c(a aVar) {
            super((a) null);
        }

        public boolean d(View view) {
            return view.isAttachedToWindow();
        }

        public boolean e(View view) {
            return view.isLaidOut();
        }
    }

    public static class d extends c {
        public d(a aVar) {
            super((a) null);
        }

        public boolean b(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public static class e {
        public static final Integer a = ((Integer) e.e.i.b.q(ViewGroup.class, "FLAG_CLIP_TO_PADDING"));
        public static final Integer b = ((Integer) e.e.i.b.q(ViewGroup.class, "FLAG_CLIP_CHILDREN"));

        public e(a aVar) {
        }

        public boolean a(ViewGroup viewGroup) {
            throw null;
        }

        public boolean b(ViewGroup viewGroup) {
            return c(viewGroup, a);
        }

        public final boolean c(ViewGroup viewGroup, Integer num) {
            Integer num2 = (Integer) e.e.i.b.r(ViewGroup.class, "mGroupFlags", viewGroup);
            if (e.b.a.a) {
                StringBuilder i2 = g.a.a.a.a.i("hasBooleanFlag: groupFlags = ");
                String str = "null";
                i2.append(num2 == null ? str : num2.toString());
                i2.append(", flag = ");
                if (num != null) {
                    str = num.toString();
                }
                i2.append(str);
                f.w("ViewCompatBaseImpl", i2.toString());
            }
            return (num2 == null || num == null || (num2.intValue() & num.intValue()) != num.intValue()) ? false : true;
        }

        public boolean d(View view) {
            throw null;
        }

        public boolean e(View view) {
            throw null;
        }
    }

    public static boolean a(View view) {
        return a.d(view);
    }
}
