package g.e.a.b.e.c;

import android.util.Log;
import javax.annotation.Nullable;

public final class r5 extends x5 {
    public r5(v5 v5Var, String str, Long l2) {
        super(v5Var, str, l2);
    }

    @Nullable
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String c = c();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(str.length() + String.valueOf(c).length() + 25);
            sb.append("Invalid long value for ");
            sb.append(c);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
