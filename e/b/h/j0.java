package e.b.h;

import android.view.View;
import android.widget.AdapterView;

public class j0 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ k0 b;

    public j0(k0 k0Var) {
        this.b = k0Var;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        f0 f0Var;
        if (i2 != -1 && (f0Var = this.b.f1158d) != null) {
            f0Var.setListSelectionHidden(false);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
