package g.c.b.b.h;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

public class b extends a {

    /* renamed from: m  reason: collision with root package name */
    public Context f2265m;
    public View n;
    public TextView o;
    public CheckBox p;
    public View q = null;

    public b(Context context, boolean z) {
        super(context);
        this.f2265m = context;
        View inflate = LayoutInflater.from(context).inflate(2131493492, (ViewGroup) null);
        this.n = inflate;
        this.o = (TextView) inflate.findViewById(2131297129);
        this.p = (CheckBox) this.n.findViewById(2131296545);
        if (z) {
            this.o.setAutoLinkMask(15);
        }
    }

    public b a(boolean z) {
        super.setCancelable(z);
        return this;
    }

    public b b(int i2) {
        c(this.f2265m.getString(i2));
        return this;
    }

    public b c(CharSequence charSequence) {
        TextView textView;
        int i2;
        if (charSequence != null) {
            this.o.setText(Html.fromHtml(charSequence.toString()));
            textView = this.o;
            i2 = 0;
        } else {
            textView = this.o;
            i2 = 8;
        }
        textView.setVisibility(i2);
        return this;
    }

    public b d(int i2, DialogInterface.OnClickListener onClickListener) {
        this.f2257e = this.a.getText(i2);
        this.f2258f = onClickListener;
        return this;
    }

    public b e(int i2, DialogInterface.OnClickListener onClickListener) {
        this.c = this.a.getText(i2);
        this.f2256d = onClickListener;
        return this;
    }

    public b f(int i2) {
        super.setTitle(i2);
        return this;
    }

    public AlertDialog.Builder setCancelable(boolean z) {
        super.setCancelable(z);
        return this;
    }

    public AlertDialog.Builder setIcon(int i2) {
        super.setIcon(i2);
        return this;
    }

    public AlertDialog.Builder setMessage(int i2) {
        c(this.f2265m.getString(i2));
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog.Builder setMessage(CharSequence charSequence) {
        c(charSequence);
        return this;
    }

    public AlertDialog.Builder setNegativeButton(int i2, DialogInterface.OnClickListener onClickListener) {
        this.f2257e = this.a.getText(i2);
        this.f2258f = onClickListener;
        return this;
    }

    public AlertDialog.Builder setNeutralButton(int i2, DialogInterface.OnClickListener onClickListener) {
        this.f2259g = this.a.getText(i2);
        this.f2260h = onClickListener;
        return this;
    }

    public AlertDialog.Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.f2261i = onCancelListener;
        return this;
    }

    public AlertDialog.Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f2262j = onDismissListener;
        return this;
    }

    public AlertDialog.Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        super.setOnKeyListener(onKeyListener);
        return this;
    }

    public AlertDialog.Builder setPositiveButton(int i2, DialogInterface.OnClickListener onClickListener) {
        this.c = this.a.getText(i2);
        this.f2256d = onClickListener;
        return this;
    }

    public AlertDialog.Builder setTitle(int i2) {
        super.setTitle(i2);
        return this;
    }

    public AlertDialog.Builder setView(View view) {
        this.q = view;
        return this;
    }

    public AlertDialog show() {
        View view = this.q;
        if (view == null) {
            view = (this.o.getVisibility() == 0 || this.p.getVisibility() == 0) ? this.n : null;
        }
        super.setView(view);
        return super.show();
    }

    public AlertDialog.Builder setIcon(Drawable drawable) {
        super.setIcon(drawable);
        return this;
    }

    public AlertDialog.Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f2257e = charSequence;
        this.f2258f = onClickListener;
        return this;
    }

    public AlertDialog.Builder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f2259g = charSequence;
        this.f2260h = onClickListener;
        return this;
    }

    public AlertDialog.Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.c = charSequence;
        this.f2256d = onClickListener;
        return this;
    }

    public AlertDialog.Builder setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        return this;
    }
}
