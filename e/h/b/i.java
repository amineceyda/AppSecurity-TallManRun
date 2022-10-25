package e.h.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import e.a.d.b;
import e.k.z;

public class i implements b {
    public final /* synthetic */ j a;

    public i(j jVar) {
        this.a = jVar;
    }

    public void a(Context context) {
        t<?> tVar = this.a.f1467i.a;
        tVar.f1505e.b(tVar, tVar, (Fragment) null);
        Bundle a2 = this.a.f11e.b.a("android:support:fragments");
        if (a2 != null) {
            Parcelable parcelable = a2.getParcelable("android:support:fragments");
            t<?> tVar2 = this.a.f1467i.a;
            if (tVar2 instanceof z) {
                tVar2.f1505e.b0(parcelable);
                return;
            }
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
    }
}
