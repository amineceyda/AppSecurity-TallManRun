package f.a.a.b.s;

public class j {
    public static final String[] a = {" ", "  ", "    ", "        ", "                ", "                                "};

    public static final void a(StringBuilder sb, int i2) {
        while (i2 >= 32) {
            sb.append(a[5]);
            i2 -= 32;
        }
        for (int i3 = 4; i3 >= 0; i3--) {
            if (((1 << i3) & i2) != 0) {
                sb.append(a[i3]);
            }
        }
    }
}
