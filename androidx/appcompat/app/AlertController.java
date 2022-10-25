package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import e.b.c.r;
import java.lang.ref.WeakReference;

public class AlertController {
    public NestedScrollView A;
    public int B = 0;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int I = -1;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public Handler Q;
    public final View.OnClickListener R = new a();
    public final Context a;
    public final r b;
    public final Window c;

    /* renamed from: d  reason: collision with root package name */
    public final int f25d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f26e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f27f;

    /* renamed from: g  reason: collision with root package name */
    public ListView f28g;

    /* renamed from: h  reason: collision with root package name */
    public View f29h;

    /* renamed from: i  reason: collision with root package name */
    public int f30i;

    /* renamed from: j  reason: collision with root package name */
    public int f31j;

    /* renamed from: k  reason: collision with root package name */
    public int f32k;

    /* renamed from: l  reason: collision with root package name */
    public int f33l;

    /* renamed from: m  reason: collision with root package name */
    public int f34m;
    public boolean n = false;
    public Button o;
    public CharSequence p;
    public Message q;
    public Drawable r;
    public Button s;
    public CharSequence t;
    public Message u;
    public Drawable v;
    public Button w;
    public CharSequence x;
    public Message y;
    public Drawable z;

    public static class RecycleListView extends ListView {
        public final int b;
        public final int c;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.b.b.s);
            this.c = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.b = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            r0 = r0.y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r4) {
            /*
                r3 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.o
                if (r4 != r1) goto L_0x000f
                android.os.Message r1 = r0.q
                if (r1 == 0) goto L_0x000f
            L_0x000a:
                android.os.Message r0 = android.os.Message.obtain(r1)
                goto L_0x0026
            L_0x000f:
                android.widget.Button r1 = r0.s
                if (r4 != r1) goto L_0x0018
                android.os.Message r1 = r0.u
                if (r1 == 0) goto L_0x0018
                goto L_0x000a
            L_0x0018:
                android.widget.Button r1 = r0.w
                if (r4 != r1) goto L_0x0025
                android.os.Message r0 = r0.y
                if (r0 == 0) goto L_0x0025
                android.os.Message r0 = android.os.Message.obtain(r0)
                goto L_0x0026
            L_0x0025:
                r0 = 0
            L_0x0026:
                if (r0 == 0) goto L_0x002b
                r0.sendToTarget()
            L_0x002b:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.os.Handler r1 = r0.Q
                r2 = 1
                e.b.c.r r0 = r0.b
                android.os.Message r0 = r1.obtainMessage(r2, r0)
                r0.sendToTarget()
                g.i.c.a.a.i.b r0 = g.i.c.a.a.i.b.C0166b.a
                r0.j(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.a.onClick(android.view.View):void");
        }
    }

    public static class b {
        public final Context a;
        public final LayoutInflater b;
        public Drawable c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f35d;

        /* renamed from: e  reason: collision with root package name */
        public View f36e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f37f;

        /* renamed from: g  reason: collision with root package name */
        public CharSequence f38g;

        /* renamed from: h  reason: collision with root package name */
        public DialogInterface.OnClickListener f39h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f40i;

        /* renamed from: j  reason: collision with root package name */
        public DialogInterface.OnClickListener f41j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f42k;

        /* renamed from: l  reason: collision with root package name */
        public DialogInterface.OnClickListener f43l;

        /* renamed from: m  reason: collision with root package name */
        public DialogInterface.OnCancelListener f44m;
        public DialogInterface.OnDismissListener n;
        public DialogInterface.OnKeyListener o;
        public ListAdapter p;
        public DialogInterface.OnClickListener q;
        public View r;
        public boolean s;
        public int t = -1;

        public b(Context context) {
            this.a = context;
            this.b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    public static final class c extends Handler {
        public WeakReference<DialogInterface> a;

        public c(DialogInterface dialogInterface) {
            this.a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == -3 || i2 == -2 || i2 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.a.get(), message.what);
            } else if (i2 == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i2, int i3, CharSequence[] charSequenceArr) {
            super(context, i2, i3, (Object[]) null);
        }

        public long getItemId(int i2) {
            return (long) i2;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, r rVar, Window window) {
        this.a = context;
        this.b = rVar;
        this.c = window;
        this.Q = new c(rVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, e.b.b.f930e, 2130968622, 0);
        this.J = obtainStyledAttributes.getResourceId(0, 0);
        this.K = obtainStyledAttributes.getResourceId(2, 0);
        this.L = obtainStyledAttributes.getResourceId(4, 0);
        this.M = obtainStyledAttributes.getResourceId(5, 0);
        this.N = obtainStyledAttributes.getResourceId(7, 0);
        this.O = obtainStyledAttributes.getResourceId(3, 0);
        this.P = obtainStyledAttributes.getBoolean(6, true);
        this.f25d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        rVar.a().t(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void c(View view, View view2, View view3) {
        int i2 = 4;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i2 = 0;
            }
            view3.setVisibility(i2);
        }
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public final ViewGroup d(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public void e(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        Message obtainMessage = onClickListener != null ? this.Q.obtainMessage(i2, onClickListener) : null;
        if (i2 == -3) {
            this.x = charSequence;
            this.y = obtainMessage;
            this.z = null;
        } else if (i2 == -2) {
            this.t = charSequence;
            this.u = obtainMessage;
            this.v = null;
        } else if (i2 == -1) {
            this.p = charSequence;
            this.q = obtainMessage;
            this.r = null;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }
}
