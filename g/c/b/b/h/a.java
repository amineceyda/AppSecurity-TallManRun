package g.c.b.b.h;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import g.c.b.b.k.r;
import java.util.Objects;

public class a extends AlertDialog.Builder {
    public Context a;
    public Handler b = new f((C0076a) null);
    public CharSequence c;

    /* renamed from: d  reason: collision with root package name */
    public DialogInterface.OnClickListener f2256d = null;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f2257e;

    /* renamed from: f  reason: collision with root package name */
    public DialogInterface.OnClickListener f2258f = null;

    /* renamed from: g  reason: collision with root package name */
    public CharSequence f2259g;

    /* renamed from: h  reason: collision with root package name */
    public DialogInterface.OnClickListener f2260h = null;

    /* renamed from: i  reason: collision with root package name */
    public DialogInterface.OnCancelListener f2261i = null;

    /* renamed from: j  reason: collision with root package name */
    public DialogInterface.OnDismissListener f2262j = null;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2263k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2264l = false;

    /* renamed from: g.c.b.b.h.a$a  reason: collision with other inner class name */
    public class C0076a implements DialogInterface.OnClickListener {
        public C0076a() {
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            DialogInterface.OnClickListener onClickListener = a.this.f2256d;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i2);
            }
            Objects.requireNonNull(a.this);
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            DialogInterface.OnClickListener onClickListener = a.this.f2258f;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i2);
            }
            Objects.requireNonNull(a.this);
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            DialogInterface.OnClickListener onClickListener = a.this.f2260h;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i2);
            }
            Objects.requireNonNull(a.this);
        }
    }

    public class d implements DialogInterface.OnCancelListener {
        public d() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            DialogInterface.OnCancelListener onCancelListener = a.this.f2261i;
            if (onCancelListener != null) {
                onCancelListener.onCancel(dialogInterface);
            }
            Objects.requireNonNull(a.this);
        }
    }

    public class e implements DialogInterface.OnDismissListener {
        public e() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            DialogInterface.OnDismissListener onDismissListener = a.this.f2262j;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(dialogInterface);
            }
            Objects.requireNonNull(a.this);
        }
    }

    public static class f extends Handler {
        public f(C0076a aVar) {
        }

        public void handleMessage(Message message) {
            throw new RuntimeException("__MODAL_DIALOG_EXIT__");
        }
    }

    public a(Context context) {
        super(context);
        this.a = context;
    }

    public AlertDialog show() {
        super.setPositiveButton(this.c, new C0076a());
        super.setNegativeButton(this.f2257e, new b());
        super.setNeutralButton(this.f2259g, new c());
        super.setOnCancelListener(new d());
        super.setOnDismissListener(new e());
        AlertDialog create = create();
        if (this.f2263k) {
            create.setCanceledOnTouchOutside(this.f2264l);
        }
        r rVar = r.a;
        Context context = this.a;
        if (context != null && (context instanceof Activity) && !((Activity) context).isFinishing()) {
            try {
                create.show();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return create;
    }
}
