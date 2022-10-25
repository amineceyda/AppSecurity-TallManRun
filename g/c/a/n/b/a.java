package g.c.a.n.b;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.appcompat.app.AlertController;
import e.b.c.g;
import java.util.Objects;

public class a extends g.a {
    public Context c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2109d = false;

    /* renamed from: e  reason: collision with root package name */
    public Handler f2110e = new f((C0066a) null);

    /* renamed from: f  reason: collision with root package name */
    public int f2111f = 3;

    /* renamed from: g  reason: collision with root package name */
    public CharSequence f2112g;

    /* renamed from: h  reason: collision with root package name */
    public DialogInterface.OnClickListener f2113h = null;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f2114i;

    /* renamed from: j  reason: collision with root package name */
    public DialogInterface.OnClickListener f2115j = null;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f2116k;

    /* renamed from: l  reason: collision with root package name */
    public DialogInterface.OnClickListener f2117l = null;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2118m = false;
    public boolean n = false;

    /* renamed from: g.c.a.n.b.a$a  reason: collision with other inner class name */
    public class C0066a implements DialogInterface.OnClickListener {
        public C0066a() {
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            DialogInterface.OnClickListener onClickListener = a.this.f2113h;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i2);
            }
            a aVar = a.this;
            if (aVar.f2109d) {
                aVar.f2111f = 0;
            }
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            DialogInterface.OnClickListener onClickListener = a.this.f2115j;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i2);
            }
            a aVar = a.this;
            if (aVar.f2109d) {
                aVar.f2111f = 1;
            }
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            DialogInterface.OnClickListener onClickListener = a.this.f2117l;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i2);
            }
            a aVar = a.this;
            if (aVar.f2109d) {
                aVar.f2111f = 2;
            }
        }
    }

    public class d implements DialogInterface.OnCancelListener {
        public d() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            Objects.requireNonNull(a.this);
            a aVar = a.this;
            if (aVar.f2109d) {
                aVar.f2111f = 3;
            }
        }
    }

    public class e implements DialogInterface.OnDismissListener {
        public e() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            Objects.requireNonNull(a.this);
            a aVar = a.this;
            if (aVar.f2109d) {
                Handler handler = aVar.f2110e;
                handler.sendMessage(handler.obtainMessage());
            }
        }
    }

    public static class f extends Handler {
        public f(C0066a aVar) {
        }

        public void handleMessage(Message message) {
            throw new RuntimeException("__MODAL_DIALOG_EXIT__");
        }
    }

    public a(Context context) {
        super(context);
        this.c = context;
    }

    public a(Context context, int i2) {
        super(context, i2);
        this.c = context;
    }

    public g e() {
        this.f2109d = false;
        CharSequence charSequence = this.f2112g;
        C0066a aVar = new C0066a();
        AlertController.b bVar = this.a;
        bVar.f38g = charSequence;
        bVar.f39h = aVar;
        CharSequence charSequence2 = this.f2114i;
        b bVar2 = new b();
        bVar.f40i = charSequence2;
        bVar.f41j = bVar2;
        CharSequence charSequence3 = this.f2116k;
        c cVar = new c();
        bVar.f42k = charSequence3;
        bVar.f43l = cVar;
        bVar.f44m = new d();
        bVar.n = new e();
        g a = a();
        if (this.f2118m) {
            a.setCanceledOnTouchOutside(this.n);
        }
        if (e.e.d.l.a.U(this.c)) {
            try {
                a.show();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return a;
    }

    public a f(boolean z) {
        this.f2118m = true;
        this.n = z;
        return this;
    }

    /* renamed from: h */
    public a g(int i2, DialogInterface.OnClickListener onClickListener) {
        this.f2112g = this.c.getText(i2);
        this.f2113h = onClickListener;
        return this;
    }

    public int i() {
        e();
        this.f2109d = true;
        try {
            Looper.loop();
            return 3;
        } catch (RuntimeException e2) {
            if ("__MODAL_DIALOG_EXIT__".equals(e2.getMessage())) {
                return this.f2111f;
            }
            return 3;
        }
    }
}
