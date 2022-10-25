package e.b.h;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;
import e.b.g.i.p;

public class v extends h0 {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner.d f1198k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f1199l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(AppCompatSpinner appCompatSpinner, View view, AppCompatSpinner.d dVar) {
        super(view);
        this.f1199l = appCompatSpinner;
        this.f1198k = dVar;
    }

    public p b() {
        return this.f1198k;
    }

    @SuppressLint({"SyntheticAccessor"})
    public boolean c() {
        if (this.f1199l.getInternalPopup().b()) {
            return true;
        }
        this.f1199l.b();
        return true;
    }
}
