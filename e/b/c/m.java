package e.b.c;

import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.app.AppCompatDelegateImpl;
import e.e.j.l;
import e.e.j.q;
import e.e.j.x;

public class m implements l {
    public final /* synthetic */ AppCompatDelegateImpl a;

    public m(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.a = appCompatDelegateImpl;
    }

    public x a(View view, x xVar) {
        int d2 = xVar.d();
        int X = this.a.X(xVar, (Rect) null);
        if (d2 != X) {
            xVar = xVar.g(xVar.b(), X, xVar.c(), xVar.a());
        }
        return q.i(view, xVar);
    }
}
