package g.c.a.n.b;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import e.b.c.g;

public class b extends a {
    public Context o;
    public View p;
    public TextView q;
    public CheckBox r = ((CheckBox) this.p.findViewById(2131296545));

    public b(Context context, boolean z) {
        super(context, 0);
        this.o = context;
        View inflate = LayoutInflater.from(context).inflate(2131493298, (ViewGroup) null);
        this.p = inflate;
        this.q = (TextView) inflate.findViewById(2131297129);
        if (z) {
            this.q.setAutoLinkMask(3);
        }
    }

    public g.a b(int i2) {
        l(this.o.getString(i2));
        return this;
    }

    public g.a c(DialogInterface.OnKeyListener onKeyListener) {
        this.a.o = onKeyListener;
        return this;
    }

    public g.a d(int i2) {
        AlertController.b bVar = this.a;
        bVar.f35d = bVar.a.getText(i2);
        return this;
    }

    public g e() {
        this.a.r = (this.q.getVisibility() == 0 || this.r.getVisibility() == 0) ? this.p : null;
        return super.e();
    }

    public a f(boolean z) {
        this.f2118m = true;
        this.n = z;
        return this;
    }

    public g.a g(int i2, DialogInterface.OnClickListener onClickListener) {
        this.f2112g = this.c.getText(i2);
        this.f2113h = onClickListener;
        return this;
    }

    public a h(int i2, DialogInterface.OnClickListener onClickListener) {
        this.f2112g = this.c.getText(i2);
        this.f2113h = onClickListener;
        return this;
    }

    public b j(int i2) {
        l(this.o.getString(i2));
        return this;
    }

    public b k(int i2, Object... objArr) {
        l(this.o.getString(i2, objArr));
        return this;
    }

    public b l(CharSequence charSequence) {
        if (charSequence != null) {
            try {
                this.q.setText(Html.fromHtml(charSequence.toString()));
                this.q.setVisibility(0);
            } catch (Exception unused) {
                if (charSequence != null) {
                    this.q.setText(charSequence.toString());
                    this.q.setVisibility(0);
                } else {
                    this.q.setVisibility(8);
                }
                return this;
            }
        } else {
            this.q.setVisibility(8);
        }
        return this;
    }

    public b m(int i2, DialogInterface.OnClickListener onClickListener) {
        this.f2114i = this.c.getText(i2);
        this.f2115j = onClickListener;
        return this;
    }

    public b n(int i2, DialogInterface.OnClickListener onClickListener) {
        this.f2112g = this.c.getText(i2);
        this.f2113h = onClickListener;
        return this;
    }

    public b o(int i2) {
        AlertController.b bVar = this.a;
        bVar.f35d = bVar.a.getText(i2);
        return this;
    }
}
