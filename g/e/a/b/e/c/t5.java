package g.e.a.b.e.c;

import android.util.Log;
import javax.annotation.Nullable;

public final class t5 extends x5 {
    public t5(v5 v5Var, Double d2) {
        super(v5Var, "measurement.test.double_flag", d2);
    }

    @Nullable
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String c = c();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(str.length() + String.valueOf(c).length() + 27);
            sb.append("Invalid double value for ");
            sb.append(c);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
