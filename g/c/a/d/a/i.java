package g.c.a.d.a;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import com.apkpure.aegon.cms.activity.SearchActivity;
import g.c.a.f.b;

public final class i implements TextWatcher {
    public final /* synthetic */ SearchActivity b;

    public i(SearchActivity searchActivity) {
        this.b = searchActivity;
    }

    public void afterTextChanged(Editable editable) {
        EditText editText;
        SearchActivity searchActivity = this.b;
        b bVar = searchActivity.r;
        ViewFlipper viewFlipper = null;
        ImageView imageView = bVar == null ? null : bVar.a;
        if (imageView != null) {
            boolean z = true;
            if (!(editable == null || editable.length() == 0)) {
                z = false;
            }
            imageView.setVisibility(z ? 8 : 0);
        }
        b bVar2 = searchActivity.r;
        if (!(bVar2 == null || (editText = bVar2.f2003d) == null)) {
            editText.setSelection(editable == null ? 0 : editable.length());
        }
        b bVar3 = searchActivity.r;
        if (bVar3 != null) {
            viewFlipper = bVar3.f2004e;
        }
        if (viewFlipper != null) {
            viewFlipper.setDisplayedChild(0);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
