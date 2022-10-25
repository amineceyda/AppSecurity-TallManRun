package f.a.a.b.z;

import g.a.a.a.a;
import java.text.DateFormatSymbols;

public class e {
    public DateFormatSymbols a = DateFormatSymbols.getInstance();

    public final String a(String[] strArr) {
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        for (String length : strArr) {
            int length2 = length.length();
            if (length2 != 0) {
                i2 = Math.min(i2, length2);
                i3 = Math.max(i3, length2);
            }
        }
        int[] iArr = {i2, i3};
        StringBuilder i4 = a.i(".{");
        i4.append(iArr[0]);
        i4.append(",");
        return a.e(i4, iArr[1], "}");
    }
}
