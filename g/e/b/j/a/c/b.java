package g.e.b.j.a.c;

import g.e.a.b.f.b.m5;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class b {
    public static final Set a = new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));
    public static final List b = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"});
    public static final List c = Arrays.asList(new String[]{"auto", "app", "am"});

    /* renamed from: d  reason: collision with root package name */
    public static final List f3453d = Arrays.asList(new String[]{"_r", "_dbg"});

    /* renamed from: e  reason: collision with root package name */
    public static final List f3454e;

    /* renamed from: f  reason: collision with root package name */
    public static final List f3455f = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    static {
        String[][] strArr = {m5.a, m5.b};
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            i2 += strArr[i3].length;
        }
        Object[] copyOf = Arrays.copyOf(strArr[0], i2);
        int length = strArr[0].length;
        for (int i4 = 1; i4 < 2; i4++) {
            String[] strArr2 = strArr[i4];
            int length2 = strArr2.length;
            System.arraycopy(strArr2, 0, copyOf, length, length2);
            length += length2;
        }
        f3454e = Arrays.asList((String[]) copyOf);
    }

    public static boolean a(String str) {
        return !c.contains(str);
    }
}
