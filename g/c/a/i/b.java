package g.c.a.i;

import android.os.Build;
import android.os.Bundle;
import g.i.c.a.a.q.c.c;
import i.o.c.h;

public final class b extends c {
    public c b;
    public boolean c;

    public final void a() {
        this.b = null;
        if (getActivity() != null && isAdded()) {
            getFragmentManager().beginTransaction().remove(this);
        }
    }

    public void onCreate(Bundle bundle) {
        int length;
        super.onCreate(bundle);
        if (getArguments() == null) {
            a();
            return;
        }
        int i2 = 0;
        int i3 = getArguments().getInt("permission_request_code", 0);
        String[] stringArray = getArguments().getStringArray("permission_list");
        if (stringArray == null || Build.VERSION.SDK_INT < 23) {
            h.c(stringArray);
            int length2 = stringArray.length;
            int[] iArr = new int[length2];
            for (int i4 = 0; i4 < length2; i4++) {
                iArr[i4] = 0;
            }
            onRequestPermissionsResult(i3, stringArray, iArr);
            return;
        }
        if (!(stringArray.length == 0) && stringArray.length - 1 >= 0) {
            while (true) {
                int i5 = i2 + 1;
                if (shouldShowRequestPermissionRationale(stringArray[i2])) {
                    this.c = true;
                    break;
                } else if (i5 > length) {
                    break;
                } else {
                    i2 = i5;
                }
            }
        }
        requestPermissions(stringArray, i3);
    }

    public void onDestroy() {
        super.onDestroy();
        a();
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        h.e(strArr, "permissions");
        h.e(iArr, "grantResults");
        c cVar = this.b;
        if (cVar != null) {
            h.c(cVar);
            cVar.a(strArr, iArr, this.c);
        }
        a();
    }
}
