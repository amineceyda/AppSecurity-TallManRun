package f.a.a.b.u.j;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class m implements l<Integer> {
    public final Pattern a;

    public m(i iVar) {
        this.a = Pattern.compile(iVar.w(false, true).replace("(?:￾)?", "").replace("(?:￿)?", ""));
    }

    public Comparable a(String str) {
        try {
            Matcher matcher = this.a.matcher(str);
            return Integer.valueOf(Integer.parseInt((!matcher.find() || matcher.groupCount() < 1) ? "" : matcher.group(1), 10));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
