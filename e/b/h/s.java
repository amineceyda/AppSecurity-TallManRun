package e.b.h;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import e.e.j.c;
import e.e.j.q;
import e.e.j.z.d;
import e.e.j.z.e;

public class s implements d {
    public final /* synthetic */ View a;

    public s(View view) {
        this.a = view;
    }

    public boolean a(e eVar, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i2 & 1) != 0) {
            try {
                eVar.a.d();
                InputContentInfo inputContentInfo = (InputContentInfo) eVar.a.b();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e2) {
                Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e2);
                return false;
            }
        }
        c.a aVar = new c.a(new ClipData(eVar.a.a(), new ClipData.Item(eVar.a.c())), 2);
        aVar.f1333d = eVar.a.e();
        aVar.f1334e = bundle;
        if (q.k(this.a, new c(aVar)) == null) {
            return true;
        }
        return false;
    }
}
