package f.a.a.b.z;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class i {
    public static final Pattern a = Pattern.compile("^(1\\.)?([0-9]+)");

    public static boolean a(int i2) {
        Matcher matcher = a.matcher(System.getProperty("java.version", ""));
        return matcher.find() && i2 <= Integer.parseInt(matcher.group(2));
    }
}
